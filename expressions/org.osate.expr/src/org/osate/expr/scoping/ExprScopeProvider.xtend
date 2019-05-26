/*
 * generated by Xtext 2.17.0
 */
package org.osate.expr.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.FilteringScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.osate.aadl2.AbstractFeature
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentPrototype
import org.osate.aadl2.Feature
import org.osate.aadl2.FeatureGroup
import org.osate.aadl2.FeatureGroupPrototype
import org.osate.aadl2.FeatureGroupType
import org.osate.aadl2.NamedElement
import org.osate.aadl2.Subcomponent
import org.osate.expr.expr.EDeclaration
import org.osate.expr.expr.ExprLibrary
import org.osate.expr.expr.ExprSubclause
import org.osate.expr.expr.ModelReference
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider

import static org.osate.expr.expr.ExprPackage.Literals.*

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ExprScopeProvider extends PropertiesScopeProvider {

	@Inject
	IQualifiedNameConverter qualifiedNameConverter

	override getScope(EObject context, EReference reference) {
		switch reference {
			case VAR_REF__REF,
			case TYPE_REF__REF:
				getAnnexScope(context, reference)
			case MODEL_REFERENCE__MODEL_ELEMENT:
				if (context instanceof ModelReference) {
					getModelElementScope(context, reference)
				} else {
					getThisScope(context)
				}
			default:
				getAnnexScope(context, reference)
		}
	}

	def getAnnexScope(EObject context, EReference reference) {
		val rootElement = getExprAnnexRoot(context)
		val candidates = EcoreUtil2.getAllContentsOfType(rootElement, NamedElement)
		val delegateScope = delegateGetScope(context, reference)
		val newDelegateScope = new SimpleScope(delegateScope.allElements.map [
			val name = qualifiedNameConverter.toString(it.name)
			val qname = if (name.startsWith('expr$'))
					qualifiedNameConverter.toQualifiedName(name.substring(5))
				else
					it.name
			EObjectDescription.create(qname, getEObjectOrProxy)
		], true)
		val existingScope = Scopes.scopeFor(candidates, newDelegateScope)
		val thisDecl = context.getContainerOfType(EDeclaration)

		if (thisDecl === null)
			existingScope
		else
			// Scope that filters out the context element from the candidates list
			new FilteringScope(existingScope, [getEObjectOrProxy != thisDecl])
	}

	def getThisScope(EObject context) {
		val classifier = context.getContainerOfType(Classifier)
		if (classifier === null)
			IScope.NULLSCOPE
		else
			new SimpleScope(
				#[EObjectDescription.create(qualifiedNameConverter.toQualifiedName('this'), classifier)]
			)
	}

	def getModelElementScope(ModelReference context, EReference reference) {
		if (context.prev === null) {
			getThisScope(context)
		} else {
			val prev = context.prev
			val prevElement = prev.modelElement
			val classifier = switch prevElement {
				Classifier:
					prevElement
				AbstractFeature:
					switch featureClassifier : prevElement.abstractFeatureClassifier {
						ComponentClassifier: featureClassifier
						ComponentPrototype: featureClassifier.constrainingClassifier
						default: prevElement.featurePrototype.constrainingClassifier
					}
				FeatureGroup:
					switch featureType : prevElement.featureType {
						FeatureGroupType: featureType
						FeatureGroupPrototype: featureType.constrainingFeatureGroupType
					}
				Feature:
					switch featureClassifier : prevElement.featureClassifier {
						ComponentClassifier: featureClassifier
						ComponentPrototype: featureClassifier.constrainingClassifier
					}
				Subcomponent:
					switch subcomponentType : prevElement.subcomponentType {
						ComponentClassifier: subcomponentType
						ComponentPrototype: subcomponentType.constrainingClassifier
					}
			}
			if (classifier === null)
				IScope.NULLSCOPE
			else
				classifier.members.scopeFor
		}
	}

	def getExprAnnexRoot(EObject ele) {
		getContainerOfTypes(ele, ExprLibrary, ExprSubclause)
	}

	def EObject getContainerOfTypes(EObject ele, Class<? extends EObject> type1, Class<? extends EObject> type2) {
		for (var e = ele; e !== null; e = e.eContainer())
			if (type1.isInstance(e))
				return type1.cast(e)
			else if (type2.isInstance(e))
				return type2.cast(e)

		null
	}

//	def scopeFor(Iterable<? extends EObject> elements) {
//		new SimpleScope(IScope.NULLSCOPE,
//			Scopes.scopedElementsFor(elements, QualifiedName.wrapper(SimpleAttributeResolver.NAME_RESOLVER)), false)
//	}
}
