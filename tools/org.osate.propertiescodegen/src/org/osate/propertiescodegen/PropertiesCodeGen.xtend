package org.osate.propertiescodegen

import java.util.List
import java.util.Set
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.osate.aadl2.AadlBoolean
import org.osate.aadl2.AadlInteger
import org.osate.aadl2.AadlReal
import org.osate.aadl2.AadlString
import org.osate.aadl2.ClassifierType
import org.osate.aadl2.EnumerationType
import org.osate.aadl2.NumberType
import org.osate.aadl2.PropertySet
import org.osate.aadl2.PropertyType
import org.osate.aadl2.RangeType
import org.osate.aadl2.RecordType
import org.osate.aadl2.ReferenceType
import org.osate.aadl2.UnitLiteral
import org.osate.aadl2.UnitsType

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

@FinalFieldsConstructor
class PropertiesCodeGen {
	val PropertySet propertySet
	val Set<String> imports = newHashSet
	
	def static List<GeneratedJava> generateJava(PropertySet propertySet) {
		propertySet.ownedPropertyTypes.map[type | generateFile(propertySet, type)].filterNull.toList
	}
	
	def private static GeneratedJava generateFile(PropertySet propertySet, PropertyType propertyType) {
		val typeName = propertyType.name.toCamelCase
		val generator = new PropertiesCodeGen(propertySet)
		val generatedJavaType = switch propertyType {
			AadlBoolean: generator.generateBoolean(typeName)
			AadlString: generator.generateString(typeName)
			ClassifierType: generator.generateClassifier(typeName)
			UnitsType: generator.generateUnits(typeName, propertyType, true)
			EnumerationType: generator.generateEnumeration(typeName, propertyType, true)
			NumberType case propertyType.unitsType === null: generator.generateNumber(typeName, propertyType)
			NumberType: generator.generateNumberWithUnits(typeName, propertyType, true)
			RangeType: generator.generateRange(typeName, propertyType, true)
			RecordType: generator.generateRecord(typeName, propertyType, true)
			ReferenceType: generator.generateReference(typeName)
			default: null
		}
		val javaImports = generator.imports.filter[it.startsWith("java.")].sort
		val orgImports = generator.imports.filter[it.startsWith("org.")].sort
		val otherImports = generator.imports.filter[!it.startsWith("java.") && !it.startsWith("org.")].sort
		val contents = '''
			package «propertySet.name.toLowerCase»;
			«IF !javaImports.empty»
			
			«FOR javaImport : javaImports»
			import «javaImport»;
			«ENDFOR»
			«ENDIF»
			«IF !orgImports.empty»
			
			«FOR orgImport : orgImports»
			import «orgImport»;
			«ENDFOR»
			«ENDIF»
			«IF !otherImports.empty»
			
			«FOR otherImport : otherImports»
			import «otherImport»;
			«ENDFOR»
			«ENDIF»
			
			«generatedJavaType»
		'''
		new GeneratedJava(typeName + ".java", contents)
	}
	
	def private String generateBoolean(String typeName) {
		imports += #{"org.osate.aadl2.BooleanLiteral", "org.osate.aadl2.PropertyExpression"}
		'''
			public class «typeName» {
				public static boolean getValue(PropertyExpression propertyExpression) {
					return ((BooleanLiteral) propertyExpression).getValue();
				}
			}
		'''
	}
	
	def private String generateString(String typeName) {
		imports += #{"org.osate.aadl2.PropertyExpression", "org.osate.aadl2.StringLiteral"}
		'''
			public class «typeName» {
				public static String getValue(PropertyExpression propertyExpression) {
					return ((StringLiteral) propertyExpression).getValue();
				}
			}
		'''
	}
	
	def private String generateClassifier(String typeName) {
		imports += #{
			"org.osate.aadl2.Classifier",
			"org.osate.aadl2.ClassifierValue",
			"org.osate.aadl2.PropertyExpression"
		}
		'''
			public class «typeName» {
				public static Classifier getValue(PropertyExpression propertyExpression) {
					return ((ClassifierValue) propertyExpression).getClassifier();
				}
			}
		'''
	}
	
	def private String generateEnumeration(String typeName, EnumerationType enumType, boolean topLevel) {
		if (topLevel) {
			imports += #{
				"org.osate.aadl2.AbstractNamedValue",
				"org.osate.aadl2.EnumerationLiteral",
				"org.osate.aadl2.NamedValue",
				"org.osate.aadl2.PropertyExpression"
			}
		}
		val literals = enumType.ownedLiterals.join(",\n")['''«it.name.toUpperCase»("«it.name»")''']
		'''
			public enum «typeName» {
				«literals»;
				
				private final String originalName;
				
				private «typeName»(String originalName) {
					this.originalName = originalName;
				}
				«IF topLevel»
				
				public static «typeName» getValue(PropertyExpression propertyExpression) {
					AbstractNamedValue abstractNamedValue = ((NamedValue) propertyExpression).getNamedValue();
					return valueOf(((EnumerationLiteral) abstractNamedValue).getName().toUpperCase());
				}
				«ENDIF»
				
				@Override
				public String toString() {
					return originalName;
				}
			}
		'''
	}
	
	def private String generateUnits(String typeName, UnitsType unitsType, boolean topLevel) {
		if (topLevel) {
			imports += #{
				"org.osate.aadl2.AbstractNamedValue",
				"org.osate.aadl2.NamedValue",
				"org.osate.aadl2.PropertyExpression",
				"org.osate.aadl2.UnitLiteral"
			}
		}
		val literals = unitsType.ownedLiterals.filter(UnitLiteral).sortBy[it.absoluteFactor]
		val literalsString = literals.join(",\n")['''«it.name.toUpperCase»(«it.absoluteFactor», "«it.name»")''']
		'''
			public enum «typeName» {
				«literalsString»;
				
				private final double factorToBase;
				private final String originalName;
				
				private «typeName»(double factorToBase, String originalName) {
					this.factorToBase = factorToBase;
					this.originalName = originalName;
				}
				
				public double getFactorToBase() {
					return factorToBase;
				}
				
				public double getFactorTo(«typeName» target) {
					return factorToBase / target.factorToBase;
				}
				«IF topLevel»
				
				public static «typeName» getValue(PropertyExpression propertyExpression) {
					AbstractNamedValue abstractNamedValue = ((NamedValue) propertyExpression).getNamedValue();
					return valueOf(((UnitLiteral) abstractNamedValue).getName().toUpperCase());
				}
				«ENDIF»
				
				@Override
				public String toString() {
					return originalName;
				}
			}
		'''
	}
	
	def private String generateNumber(String typeName, NumberType numberType) {
		val literalType = switch numberType {
			AadlInteger: "IntegerLiteral"
			AadlReal: "RealLiteral"
		}
		val javaType = switch numberType {
			AadlInteger: "long"
			AadlReal: "double"
		}
		imports += #{"org.osate.aadl2.PropertyExpression", "org.osate.aadl2." + literalType}
		'''
			public class «typeName» {
				public static «javaType» getValue(PropertyExpression propertyExpression) {
					return ((«literalType») propertyExpression).getValue();
				}
			}
		'''
	}
	
	def private String generateNumberWithUnits(String typeName, NumberType numberType, boolean topLevel) {
		val valueType = switch numberType {
			AadlInteger: "IntegerLiteral"
			AadlReal: "RealLiteral"
		}
		val javaType = switch numberType {
			AadlInteger: "long"
			AadlReal: "double"
		}
		val unitsType = numberType.unitsType
		val unitsTypeName = if (unitsType == numberType.ownedUnitsType) {
			"Units"
		} else {
			unitsType.name.toCamelCase
		}
		imports += #{"java.util.Objects", "org.osate.aadl2.PropertyExpression", "org.osate.aadl2." + valueType}
		val unitsPropertySet = unitsType.getContainerOfType(PropertySet)
		if (unitsType !== null && unitsType == numberType.referencedUnitsType && unitsPropertySet != propertySet) {
			imports += unitsPropertySet.name.toLowerCase + "." + unitsType.name.toCamelCase
		}
		'''
			public«IF !topLevel» static«ENDIF» class «typeName» {
				private final «javaType» value;
				private final «unitsTypeName» unit;
				
				private «typeName»(PropertyExpression propertyExpression) {
					«valueType» numberValue = («valueType») propertyExpression;
					value = numberValue.getValue();
					unit = «unitsTypeName».valueOf(numberValue.getUnit().getName().toUpperCase());
				}
				«IF topLevel»
				
				public static «typeName» getValue(PropertyExpression propertyExpression) {
					return new «typeName»(propertyExpression);
				}
				«ENDIF»
				
				public «javaType» getValue() {
					return value;
				}
				
				public «unitsTypeName» getUnit() {
					return unit;
				}
				
				@Override
				public int hashCode() {
					return Objects.hash(value, unit);
				}
				
				@Override
				public boolean equals(Object obj) {
					if (this == obj) {
						return true;
					}
					if (!(obj instanceof «typeName»)) {
						return false;
					}
					«typeName» other = («typeName») obj;
					«IF numberType instanceof AadlInteger»
					return value == other.value && unit == other.unit;
					«ELSE»
					return Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value) && unit == other.unit;
					«ENDIF»
				}
				
				@Override
				public String toString() {
					return value + unit.toString();
				}
				«IF unitsType == numberType.ownedUnitsType»
				
				«generateUnits("Units", unitsType, false)»
				«ENDIF»
			}
		'''
	}
	
	def private String generateRange(String typeName, RangeType rangeType, boolean topLevel) {
		val numberType = rangeType.numberType
		val unitsType = numberType.unitsType
		
		val literalType = switch numberType {
			AadlInteger: "IntegerLiteral"
			AadlReal: "RealLiteral"
		}
		
		val numberTypeName = switch numberType {
			AadlInteger case unitsType === null: "long"
			AadlReal case unitsType === null: "double"
			case rangeType.ownedNumberType: "Number"
			case rangeType.referencedNumberType: numberType.name.toCamelCase
		}
		
		val optionalType = switch numberType {
			AadlInteger case unitsType === null: "OptionalLong"
			AadlReal case unitsType === null: "OptionalDouble"
			default: '''Optional<«numberTypeName»>'''
		}
		
		imports += #{"java.util.Objects", "org.osate.aadl2.PropertyExpression", "org.osate.aadl2.RangeValue"}
		imports += if (unitsType === null) {
			#{"java.util." + optionalType, "org.osate.aadl2." + literalType}
		} else {
			#{"java.util.Optional"}
		}
		if (unitsType !== null) {
			val numberPropertySet = numberType.getContainerOfType(PropertySet)
			val unitsPropertySet = unitsType.getContainerOfType(PropertySet)
			if (numberType == rangeType.referencedNumberType && numberPropertySet != propertySet) {
				imports += numberPropertySet.name.toLowerCase + "." + numberTypeName
			} else if (numberType == rangeType.ownedNumberType && unitsType == numberType.referencedUnitsType &&
				unitsPropertySet != propertySet) {
				imports += unitsPropertySet.name.toLowerCase + "." + unitsType.name.toCamelCase
			}
		}
		
		'''
			public«IF !topLevel» static«ENDIF» class «typeName» {
				private final «numberTypeName» minimum;
				private final «numberTypeName» maximum;
				private final «optionalType» delta;
				
				private «typeName»(PropertyExpression propertyExpression) {
					RangeValue rangeValue = (RangeValue) propertyExpression;
					«IF unitsType === null»
					minimum = ((«literalType») rangeValue.getMinimum()).getValue();
					maximum = ((«literalType») rangeValue.getMaximum()).getValue();
					if (rangeValue.getDelta() == null) {
						delta = «optionalType».empty();
					} else {
						delta = «optionalType».of(((«literalType») rangeValue.getDelta()).getValue());
					}
					«ELSEIF numberType == rangeType.ownedNumberType»
					minimum = new Number(rangeValue.getMinimum());
					maximum = new Number(rangeValue.getMaximum());
					delta = Optional.ofNullable(rangeValue.getDelta()).map(Number::new);
					«ELSE»
					minimum = «numberTypeName».getValue(rangeValue.getMinimum());
					maximum = «numberTypeName».getValue(rangeValue.getMaximum());
					delta = Optional.ofNullable(rangeValue.getDelta()).map(«numberTypeName»::getValue);
					«ENDIF»
				}
				«IF topLevel»
				
				public static «typeName» getValue(PropertyExpression propertyExpression) {
					return new «typeName»(propertyExpression);
				}
				«ENDIF»
				
				public «numberTypeName» getMinimum() {
					return minimum;
				}
				
				public «numberTypeName» getMaximum() {
					return maximum;
				}
				
				public «optionalType» getDelta() {
					return delta;
				}
				
				@Override
				public int hashCode() {
					return Objects.hash(minimum, maximum, delta);
				}
				
				@Override
				public boolean equals(Object obj) {
					if (this == obj) {
						return true;
					}
					if (!(obj instanceof «typeName»)) {
						return false;
					}
					«typeName» other = («typeName») obj;
					«IF unitsType !== null»
					return Objects.equals(minimum, other.minimum) && Objects.equals(maximum, other.maximum)
							&& Objects.equals(delta, other.delta);
					«ELSEIF numberType instanceof AadlInteger»
					return minimum == other.minimum && maximum == other.maximum && Objects.equals(delta, other.delta);
					«ELSE»
					return Double.doubleToLongBits(minimum) == Double.doubleToLongBits(other.minimum)
							&& Double.doubleToLongBits(maximum) == Double.doubleToLongBits(other.maximum)
							&& Objects.equals(delta, other.delta);
					«ENDIF»
				}
				
				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder(minimum + " .. " + maximum);
					delta.ifPresent(it -> builder.append(" delta " + it));
					return builder.toString();
				}
				«IF numberType == rangeType.ownedNumberType && unitsType !== null»
				
				«generateNumberWithUnits("Number", numberType, false)»
				«ENDIF»
			}
		'''
	}
	
	def private String generateRecord(String typeName, RecordType recordType, boolean topLevel) {
		imports += #{"java.util.Objects", "org.osate.aadl2.PropertyExpression", "org.osate.aadl2.RecordValue"}
		for (field : recordType.ownedFields) {
			if (field.propertyType instanceof AadlInteger && (field.propertyType as AadlInteger).unitsType === null) {
				imports += #{"java.util.OptionalLong", "org.osate.aadl2.IntegerLiteral"}
			} else if (field.propertyType instanceof AadlReal && (field.propertyType as AadlReal).unitsType === null) {
				imports += #{"java.util.OptionalDouble", "org.osate.aadl2.RealLiteral"}
			} else {
				imports += "java.util.Optional"
			}
			
			if (field.propertyType instanceof AadlBoolean) {
				imports += "org.osate.aadl2.BooleanLiteral"
			} else if (field.propertyType instanceof AadlString) {
				imports += "org.osate.aadl2.StringLiteral"
			} else if (field.propertyType instanceof ClassifierType) {
				imports += #{"org.osate.aadl2.Classifier", "org.osate.aadl2.ClassifierValue"}
			} else if (field.propertyType instanceof ReferenceType) {
				imports += #{
					"org.osate.aadl2.instance.InstanceObject",
					"org.osate.aadl2.instance.InstanceReferenceValue"
				}
			} else if (field.ownedPropertyType instanceof EnumerationType) {
				imports += #{"org.osate.aadl2.AbstractNamedValue", "org.osate.aadl2.NamedValue"}
				if (field.ownedPropertyType instanceof UnitsType) {
					imports += "org.osate.aadl2.UnitLiteral"
				} else {
					imports += "org.osate.aadl2.EnumerationLiteral"
				}
			}
			
			if ((field.referencedPropertyType instanceof EnumerationType ||
				field.referencedPropertyType instanceof NumberType &&
					(field.referencedPropertyType as NumberType).unitsType !== null ||
				field.referencedPropertyType instanceof RangeType ||
				field.referencedPropertyType instanceof RecordType) &&
				field.referencedPropertyType.getContainerOfType(PropertySet) != propertySet) {
				imports +=
					field.referencedPropertyType.getContainerOfType(PropertySet).name.toLowerCase + "." +
						field.referencedPropertyType.name.toCamelCase
			}
		}
		'''
			public«IF !topLevel» static«ENDIF» class «typeName» {
				«FOR field : recordType.ownedFields»
				«IF field.propertyType instanceof AadlBoolean»
				private final Optional<Boolean> «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.propertyType instanceof AadlString»
				private final Optional<String> «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.propertyType instanceof ClassifierType»
				private final Optional<Classifier> «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.propertyType instanceof AadlInteger && (field.propertyType as AadlInteger).unitsType === null»
				private final OptionalLong «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.propertyType instanceof AadlReal && (field.propertyType as AadlReal).unitsType === null»
				private final OptionalDouble «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.propertyType instanceof ReferenceType»
				private final Optional<InstanceObject> «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.ownedPropertyType !== null»
				private final Optional<«field.name.toCamelCase»Type> «field.name.toCamelCase.toFirstLower»;
				«ELSEIF field.referencedPropertyType !== null»
				private final Optional<«field.referencedPropertyType.name.toCamelCase»> «field.name.toCamelCase.toFirstLower»;
				«ENDIF»
				«ENDFOR»
				
				private «typeName»(PropertyExpression propertyExpression) {
					RecordValue recordValue = (RecordValue) propertyExpression;
					«FOR field : recordType.ownedFields»
					«field.name.toCamelCase.toFirstLower» = recordValue.getOwnedFieldValues()
							.stream()
							.filter(field -> field.getProperty().getName().equals("«field.name»"))
							«IF field.propertyType instanceof AadlBoolean»
							.map(field -> ((BooleanLiteral) field.getOwnedValue()).getValue())
							«ELSEIF field.propertyType instanceof AadlString»
							.map(field -> ((StringLiteral) field.getOwnedValue()).getValue())
							«ELSEIF field.propertyType instanceof ClassifierType»
							.map(field -> ((ClassifierValue) field.getOwnedValue()).getClassifier())
							«ELSEIF field.propertyType instanceof AadlInteger && (field.propertyType as AadlInteger).unitsType === null»
							.mapToLong(field -> ((IntegerLiteral) field.getOwnedValue()).getValue())
							«ELSEIF field.propertyType instanceof AadlReal && (field.propertyType as AadlReal).unitsType === null»
							.mapToDouble(field -> ((RealLiteral) field.getOwnedValue()).getValue())
							«ELSEIF field.propertyType instanceof ReferenceType»
							.map(field -> ((InstanceReferenceValue) field.getOwnedValue()).getReferencedInstanceObject())
							«ELSEIF field.ownedPropertyType instanceof UnitsType»
							.map(field -> {
								AbstractNamedValue abstractNamedValue = ((NamedValue) field.getOwnedValue()).getNamedValue();
								return «field.name.toCamelCase»Type.valueOf(((UnitLiteral) abstractNamedValue).getName().toUpperCase());
							})
							«ELSEIF field.ownedPropertyType instanceof EnumerationType»
							.map(field -> {
								AbstractNamedValue abstractNamedValue = ((NamedValue) field.getOwnedValue()).getNamedValue();
								return «field.name.toCamelCase»Type.valueOf(((EnumerationLiteral) abstractNamedValue).getName().toUpperCase());
							})
							«ELSEIF field.ownedPropertyType !== null»
							.map(field -> new «field.name.toCamelCase»Type(field.getOwnedValue()))
							«ELSEIF field.referencedPropertyType !== null»
							.map(field -> «field.referencedPropertyType.name.toCamelCase».getValue(field.getOwnedValue()))
							«ENDIF»
							.findAny();
					«ENDFOR»
				}
				«IF topLevel»
				
				public static «typeName» getValue(PropertyExpression propertyExpression) {
					return new «typeName»(propertyExpression);
				}
				«ENDIF»
				«FOR field : recordType.ownedFields»
				
				«IF field.propertyType instanceof AadlBoolean»
				public Optional<Boolean> get«field.name.toCamelCase»() {
				«ELSEIF field.propertyType instanceof AadlString»
				public Optional<String> get«field.name.toCamelCase»() {
				«ELSEIF field.propertyType instanceof ClassifierType»
				public Optional<Classifier> get«field.name.toCamelCase»() {
				«ELSEIF field.propertyType instanceof AadlInteger && (field.propertyType as AadlInteger).unitsType === null»
				public OptionalLong get«field.name.toCamelCase»() {
				«ELSEIF field.propertyType instanceof AadlReal && (field.propertyType as AadlReal).unitsType === null»
				public OptionalDouble get«field.name.toCamelCase»() {
				«ELSEIF field.propertyType instanceof ReferenceType»
				public Optional<InstanceObject> get«field.name.toCamelCase()»() {
				«ELSEIF field.ownedPropertyType !== null»
				public Optional<«field.name.toCamelCase»Type> get«field.name.toCamelCase»() {
				«ELSEIF field.referencedPropertyType !== null»
				public Optional<«field.referencedPropertyType.name.toCamelCase»> get«field.name.toCamelCase»() {
				«ENDIF»
					return «field.name.toCamelCase.toFirstLower»;
				}
				«ENDFOR»
				
				@Override
				public int hashCode() {
					«IF recordType.ownedFields.size == 1»
					return Objects.hash(«recordType.ownedFields.head.name.toCamelCase.toFirstLower»);
					«ELSE»
					return Objects.hash(
							«recordType.ownedFields.join(",\n")[it.name.toCamelCase.toFirstLower]»
					);
					«ENDIF»
				}
				
				@Override
				public boolean equals(Object obj) {
					if (this == obj) {
						return true;
					}
					if (!(obj instanceof «typeName»)) {
						return false;
					}
					«typeName» other = («typeName») obj;
					«IF recordType.ownedFields.size == 1»
					return Objects.equals(«recordType.ownedFields.head.name.toCamelCase.toFirstLower», other.«recordType.ownedFields.head.name.toCamelCase.toFirstLower»);
					«ELSE»
					return Objects.equals(«recordType.ownedFields.head.name.toCamelCase.toFirstLower», other.«recordType.ownedFields.head.name.toCamelCase.toFirstLower»)
							«FOR field : recordType.ownedFields.take(recordType.ownedFields.size - 1).tail»
							&& Objects.equals(«field.name.toCamelCase.toFirstLower», other.«field.name.toCamelCase.toFirstLower»)
							«ENDFOR»
							&& Objects.equals(«recordType.ownedFields.last.name.toCamelCase.toFirstLower», other.«recordType.ownedFields.last.name.toCamelCase.toFirstLower»);
					«ENDIF»
				}
				
				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					builder.append('[');
					«FOR field : recordType.ownedFields»
					«field.name.toCamelCase.toFirstLower».ifPresent(field -> {
						«IF field.propertyType instanceof AadlString»
						builder.append("«field.name» => \"");
						«ELSEIF field.propertyType instanceof ClassifierType»
						builder.append("«field.name» => classifier (");
						«ELSEIF field.propertyType instanceof ReferenceType»
						builder.append("«field.name» => reference (");
						«ELSE»
						builder.append("«field.name» => ");
						«ENDIF»
						«IF field.propertyType instanceof ClassifierType»
						builder.append(field.getQualifiedName());
						«ELSEIF field.propertyType instanceof ReferenceType»
						builder.append(field.getName());
						«ELSE»
						builder.append(field);
						«ENDIF»
						«IF field.propertyType instanceof AadlString»
						builder.append("\";");
						«ELSEIF field.propertyType instanceof ClassifierType || field.propertyType instanceof ReferenceType»
						builder.append(");");
						«ELSE»
						builder.append(';');
						«ENDIF»
					});
					«ENDFOR»
					builder.append(']');
					return builder.toString();
				}
				«FOR field : recordType.ownedFields.filter[it.ownedPropertyType !== null]»
				«IF field.ownedPropertyType instanceof UnitsType»
				
				«generateUnits(field.name.toCamelCase + "Type", field.ownedPropertyType as UnitsType, false)»
				«ELSEIF field.ownedPropertyType instanceof EnumerationType»
				
				«generateEnumeration(field.name.toCamelCase + "Type", field.ownedPropertyType as EnumerationType, false)»
				«ELSEIF field.ownedPropertyType instanceof NumberType && (field.ownedPropertyType as NumberType).unitsType !== null»
				
				«generateNumberWithUnits(field.name.toCamelCase + "Type", field.ownedPropertyType as NumberType, false)»
				«ELSEIF field.ownedPropertyType instanceof RangeType»
				
				«generateRange(field.name.toCamelCase + "Type", field.ownedPropertyType as RangeType, false)»
				«ELSEIF field.ownedPropertyType instanceof RecordType»
				
				«generateRecord(field.name.toCamelCase + "Type", field.ownedPropertyType as RecordType, false)»
				«ENDIF»
				«ENDFOR»
			}
		'''
	}
	
	def private String generateReference(String typeName) {
		imports += #{
			"org.osate.aadl2.PropertyExpression",
			"org.osate.aadl2.instance.InstanceObject",
			"org.osate.aadl2.instance.InstanceReferenceValue"
		}
		'''
			public class «typeName» {
				public static InstanceObject getValue(PropertyExpression propertyExpression) {
					return ((InstanceReferenceValue) propertyExpression).getReferencedInstanceObject();
				}
			}
		'''
	}
	
	def private static String toCamelCase(String s) {
		s.split("_").map[it.toLowerCase.toFirstUpper].join
	}
}