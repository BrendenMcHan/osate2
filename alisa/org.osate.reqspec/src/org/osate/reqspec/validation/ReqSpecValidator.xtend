/*
 * generated by Xtext
 */
package org.osate.reqspec.validation
import org.eclipse.xtext.validation.Check
import org.osate.reqspec.reqSpec.Goal
import org.osate.reqspec.reqSpec.ReqSpecPackage
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.ReqDocument
import org.osate.reqspec.reqSpec.ContractualElement
import org.eclipse.emf.common.util.BasicEList
import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.aadl2.Classifier
import org.osate.reqspec.reqSpec.DocumentSection
import org.eclipse.xtext.validation.CheckType
import org.osate.reqspec.reqSpec.ReqSpecs
import org.osate.aadl2.NamedElement

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ReqSpecValidator extends AbstractReqSpecValidator {

  public static val MISSING_STAKEHOLDER = 'missingStakeholder'
  public static val MISSING_STAKEHOLDER_GOAL = 'missingStakeholderGoal'
  public static val MULTIPLE_CLASSIFIERS = 'multipleClassifiers'
  public static val FEATURES_WITHOUT_REQUIREMENT = 'featuresWithoutRequirement'

	@Check//(CheckType.EXPENSIVE)
	def void checkMissingStakeholder(Goal goal) {
		if (goal.stakeholderReference.empty) {
			if (goal.refinesReference.empty){
			warning('Goal should have stakeholders', 
					ReqSpecPackage.Literals.GOAL__STAKEHOLDER_REFERENCE,
					MISSING_STAKEHOLDER)
			} else {
				goal.refinesReference.forEach[checkMissingStakeholder]
			}		
		}
	}
	
	@Check//(CheckType.EXPENSIVE)
	def void checkMissingGoal(Requirement req) {
		if (req.goalReference.empty  && req.stakeholderRequirementReference.empty) {
			if (req.refinesReference.empty){ 
			warning('System requirement should have stakeholder goal', 
					ReqSpecPackage.Literals.REQUIREMENT__GOAL_REFERENCE,
					MISSING_STAKEHOLDER_GOAL)
			} else {
				req.refinesReference.forEach[checkMissingGoal]
			}		
		}
	}
	
		@Check//(CheckType.EXPENSIVE)
	def void checkMultipleSystems(ReqDocument reqdoc) {
		val syslist = new BasicEList<Classifier>
		reqdoc.content.forEach[e | if (e instanceof ContractualElement) syslist += e.targetClassifier]
		if (syslist.size > 1){
			val cls = syslist.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Requirements cover multiple classifiers: '+cls, 
					ReqSpecPackage.Literals.REQ_DOCUMENT__CONTENT,
					MULTIPLE_CLASSIFIERS)
		}
	}
	
		@Check//(CheckType.EXPENSIVE)
	def void checkMultipleSystems(DocumentSection docsection) {
		val syslist = new BasicEList<Classifier>
		docsection.content.forEach[e | if (e instanceof ContractualElement) syslist += e.targetClassifier]
		if (syslist.size > 1){
			val cls = syslist.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Requirements cover multiple classifiers: '+cls, 
					ReqSpecPackage.Literals.DOCUMENT_SECTION__CONTENT,
					MULTIPLE_CLASSIFIERS)
		}
	}
	
		@Check//(CheckType.EXPENSIVE)
	def void checkFeatureCoverage(ReqSpecs reqspecs) {
		val cl = reqspecs.target
		if (cl == null) return
		val fealist = new BasicEList<NamedElement>
		reqspecs.content.forEach[e | if (e instanceof ContractualElement) fealist += e.targetElement]
		if (fealist.size < cl.getAllFeatures.size){
			val cls = fealist.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Requirements cover multiple classifiers: '+cls, 
					ReqSpecPackage.Literals.REQ_SPEC__CONTENTS,
					FEATURES_WITHOUT_REQUIREMENT)
		}
	
}
