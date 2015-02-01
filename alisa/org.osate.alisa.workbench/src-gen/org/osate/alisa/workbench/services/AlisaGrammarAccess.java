/*
* generated by Xtext
*/
package org.osate.alisa.workbench.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.osate.alisa.common.services.CommonGrammarAccess;

@Singleton
public class AlisaGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AlisaWorkAreaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AlisaWorkArea");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlisaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCasesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCasesAssuranceCaseConfigurationParserRuleCall_2_0 = (RuleCall)cCasesAssignment_2.eContents().get(0);
		
		//AlisaWorkArea:
		//	"alisa" name=ID cases+=AssuranceCaseConfiguration*;
		public ParserRule getRule() { return rule; }

		//"alisa" name=ID cases+=AssuranceCaseConfiguration*
		public Group getGroup() { return cGroup; }

		//"alisa"
		public Keyword getAlisaKeyword_0() { return cAlisaKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//cases+=AssuranceCaseConfiguration*
		public Assignment getCasesAssignment_2() { return cCasesAssignment_2; }

		//AssuranceCaseConfiguration
		public RuleCall getCasesAssuranceCaseConfigurationParserRuleCall_2_0() { return cCasesAssuranceCaseConfigurationParserRuleCall_2_0; }
	}

	public class AssuranceCaseConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssuranceCaseConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleValueStringParserRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSystemAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSystemComponentImplementationCrossReference_4_0 = (CrossReference)cSystemAssignment_4.eContents().get(0);
		private final RuleCall cSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1 = (RuleCall)cSystemComponentImplementationCrossReference_4_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cGroup_6.eContents().get(0);
		private final Keyword cDescriptionKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final RuleCall cDescriptionDescriptionParserRuleCall_6_0_1_0 = (RuleCall)cDescriptionAssignment_6_0_1.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Keyword cConstantsKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cConstantAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cConstantConstantDeclParserRuleCall_6_1_1_0 = (RuleCall)cConstantAssignment_6_1_1.eContents().get(0);
		private final Keyword cPlansKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Assignment cPlansAssignment_6_3 = (Assignment)cGroup_6.eContents().get(3);
		private final CrossReference cPlansVerificationPlanCrossReference_6_3_0 = (CrossReference)cPlansAssignment_6_3.eContents().get(0);
		private final RuleCall cPlansVerificationPlanQualifiedNameParserRuleCall_6_3_0_1 = (RuleCall)cPlansVerificationPlanCrossReference_6_3_0.eContents().get(1);
		private final Group cGroup_6_4 = (Group)cGroup_6.eContents().get(4);
		private final Keyword cSelectKeyword_6_4_0 = (Keyword)cGroup_6_4.eContents().get(0);
		private final Assignment cSelectionFilterAssignment_6_4_1 = (Assignment)cGroup_6_4.eContents().get(1);
		private final CrossReference cSelectionFilterVerificationCategoryCrossReference_6_4_1_0 = (CrossReference)cSelectionFilterAssignment_6_4_1.eContents().get(0);
		private final RuleCall cSelectionFilterVerificationCategoryCatRefParserRuleCall_6_4_1_0_1 = (RuleCall)cSelectionFilterVerificationCategoryCrossReference_6_4_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		////OrSelectionConditionExpr returns SelectionConditionExpr:
		////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
		////
		////AndSelectionConditionExpr returns SelectionConditionExpr:
		////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
		////
		////SelectionCategoryReference:
		////	cat=[categories::VerificationCategory|CatRef];
		//AssuranceCaseConfiguration:
		//	"case" name=ID (":" title=ValueString)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
		//	(("description" description=Description)? ("constants" constant+=ConstantDecl+)? "plans"
		//	plans+=[Verify::VerificationPlan|QualifiedName]+ ("select"
		//	selectionFilter+=[categories::VerificationCategory|CatRef]+)?) "]";
		public ParserRule getRule() { return rule; }

		//"case" name=ID (":" title=ValueString)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
		//(("description" description=Description)? ("constants" constant+=ConstantDecl+)? "plans"
		//plans+=[Verify::VerificationPlan|QualifiedName]+ ("select"
		//selectionFilter+=[categories::VerificationCategory|CatRef]+)?) "]" //OrSelectionConditionExpr returns SelectionConditionExpr:
		////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
		////
		////AndSelectionConditionExpr returns SelectionConditionExpr:
		////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
		////
		////SelectionCategoryReference:
		////	cat=[categories::VerificationCategory|CatRef];
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(":" title=ValueString)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=ValueString
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//ValueString
		public RuleCall getTitleValueStringParserRuleCall_2_1_0() { return cTitleValueStringParserRuleCall_2_1_0; }

		//"for"
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//system=[aadl2::ComponentImplementation|AadlClassifierReference]
		public Assignment getSystemAssignment_4() { return cSystemAssignment_4; }

		//[aadl2::ComponentImplementation|AadlClassifierReference]
		public CrossReference getSystemComponentImplementationCrossReference_4_0() { return cSystemComponentImplementationCrossReference_4_0; }

		//AadlClassifierReference
		public RuleCall getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1() { return cSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }

		//("description" description=Description)? ("constants" constant+=ConstantDecl+)? "plans"
		//plans+=[Verify::VerificationPlan|QualifiedName]+ ("select"
		//selectionFilter+=[categories::VerificationCategory|CatRef]+)?
		public Group getGroup_6() { return cGroup_6; }

		//("description" description=Description)?
		public Group getGroup_6_0() { return cGroup_6_0; }

		//"description"
		public Keyword getDescriptionKeyword_6_0_0() { return cDescriptionKeyword_6_0_0; }

		//description=Description
		public Assignment getDescriptionAssignment_6_0_1() { return cDescriptionAssignment_6_0_1; }

		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_6_0_1_0() { return cDescriptionDescriptionParserRuleCall_6_0_1_0; }

		//("constants" constant+=ConstantDecl+)?
		public Group getGroup_6_1() { return cGroup_6_1; }

		//"constants"
		public Keyword getConstantsKeyword_6_1_0() { return cConstantsKeyword_6_1_0; }

		//constant+=ConstantDecl+
		public Assignment getConstantAssignment_6_1_1() { return cConstantAssignment_6_1_1; }

		//ConstantDecl
		public RuleCall getConstantConstantDeclParserRuleCall_6_1_1_0() { return cConstantConstantDeclParserRuleCall_6_1_1_0; }

		//"plans"
		public Keyword getPlansKeyword_6_2() { return cPlansKeyword_6_2; }

		//plans+=[Verify::VerificationPlan|QualifiedName]+
		public Assignment getPlansAssignment_6_3() { return cPlansAssignment_6_3; }

		//[Verify::VerificationPlan|QualifiedName]
		public CrossReference getPlansVerificationPlanCrossReference_6_3_0() { return cPlansVerificationPlanCrossReference_6_3_0; }

		//QualifiedName
		public RuleCall getPlansVerificationPlanQualifiedNameParserRuleCall_6_3_0_1() { return cPlansVerificationPlanQualifiedNameParserRuleCall_6_3_0_1; }

		//("select" selectionFilter+=[categories::VerificationCategory|CatRef]+)?
		public Group getGroup_6_4() { return cGroup_6_4; }

		//"select"
		public Keyword getSelectKeyword_6_4_0() { return cSelectKeyword_6_4_0; }

		//selectionFilter+=[categories::VerificationCategory|CatRef]+
		public Assignment getSelectionFilterAssignment_6_4_1() { return cSelectionFilterAssignment_6_4_1; }

		//[categories::VerificationCategory|CatRef]
		public CrossReference getSelectionFilterVerificationCategoryCrossReference_6_4_1_0() { return cSelectionFilterVerificationCategoryCrossReference_6_4_1_0; }

		//CatRef
		public RuleCall getSelectionFilterVerificationCategoryCatRefParserRuleCall_6_4_1_0_1() { return cSelectionFilterVerificationCategoryCatRefParserRuleCall_6_4_1_0_1; }

		////OrSelectionConditionExpr returns SelectionConditionExpr:
		////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
		////
		////AndSelectionConditionExpr returns SelectionConditionExpr:
		////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
		////
		////SelectionCategoryReference:
		////	cat=[categories::VerificationCategory|CatRef];
		//"]"
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	
	
	private final AlisaWorkAreaElements pAlisaWorkArea;
	private final AssuranceCaseConfigurationElements pAssuranceCaseConfiguration;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	@Inject
	public AlisaGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.pAlisaWorkArea = new AlisaWorkAreaElements();
		this.pAssuranceCaseConfiguration = new AssuranceCaseConfigurationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.alisa.workbench.Alisa".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public CommonGrammarAccess getCommonGrammarAccess() {
		return gaCommon;
	}

	
	//AlisaWorkArea:
	//	"alisa" name=ID cases+=AssuranceCaseConfiguration*;
	public AlisaWorkAreaElements getAlisaWorkAreaAccess() {
		return pAlisaWorkArea;
	}
	
	public ParserRule getAlisaWorkAreaRule() {
		return getAlisaWorkAreaAccess().getRule();
	}

	////OrSelectionConditionExpr returns SelectionConditionExpr:
	////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
	////
	////AndSelectionConditionExpr returns SelectionConditionExpr:
	////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
	////
	////SelectionCategoryReference:
	////	cat=[categories::VerificationCategory|CatRef];
	//AssuranceCaseConfiguration:
	//	"case" name=ID (":" title=ValueString)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
	//	(("description" description=Description)? ("constants" constant+=ConstantDecl+)? "plans"
	//	plans+=[Verify::VerificationPlan|QualifiedName]+ ("select"
	//	selectionFilter+=[categories::VerificationCategory|CatRef]+)?) "]";
	public AssuranceCaseConfigurationElements getAssuranceCaseConfigurationAccess() {
		return pAssuranceCaseConfiguration;
	}
	
	public ParserRule getAssuranceCaseConfigurationRule() {
		return getAssuranceCaseConfigurationAccess().getRule();
	}

	//Model:
	//	content=Description;
	public CommonGrammarAccess.ModelElements getModelAccess() {
		return gaCommon.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Description:
	//	description+=DescriptionElement+;
	public CommonGrammarAccess.DescriptionElements getDescriptionAccess() {
		return gaCommon.getDescriptionAccess();
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | value=ShowValue | newline?="&" | thisTarget?="this";
	public CommonGrammarAccess.DescriptionElementElements getDescriptionElementAccess() {
		return gaCommon.getDescriptionElementAccess();
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//ShowValue:
	//	ref=[ecore::EObject] ("%" unit=ID)?;
	public CommonGrammarAccess.ShowValueElements getShowValueAccess() {
		return gaCommon.getShowValueAccess();
	}
	
	public ParserRule getShowValueRule() {
		return getShowValueAccess().getRule();
	}

	//ReferencePath:
	//	ref=[ecore::EObject] ("." subpath=ReferencePath);
	public CommonGrammarAccess.ReferencePathElements getReferencePathAccess() {
		return gaCommon.getReferencePathAccess();
	}
	
	public ParserRule getReferencePathRule() {
		return getReferencePathAccess().getRule();
	}

	//// Dummy placeholder for comparison conditions
	//PredicateExpression:
	//	ID op=("=" | "!=" | "<" | "<=" | ">" | ">=") ID;
	public CommonGrammarAccess.PredicateExpressionElements getPredicateExpressionAccess() {
		return gaCommon.getPredicateExpressionAccess();
	}
	
	public ParserRule getPredicateExpressionRule() {
		return getPredicateExpressionAccess().getRule();
	}

	//ConstantDecl:
	//	name=ID "=" value=ValueString;
	public CommonGrammarAccess.ConstantDeclElements getConstantDeclAccess() {
		return gaCommon.getConstantDeclAccess();
	}
	
	public ParserRule getConstantDeclRule() {
		return getConstantDeclAccess().getRule();
	}

	//ConstantValue:
	//	StringTerm | RealTerm | IntegerTerm;
	public CommonGrammarAccess.ConstantValueElements getConstantValueAccess() {
		return gaCommon.getConstantValueAccess();
	}
	
	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}

	//StringTerm:
	//	value=STRING;
	public CommonGrammarAccess.StringTermElements getStringTermAccess() {
		return gaCommon.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}

	//RealTerm:
	//	value=REAL unit=ID?;
	public CommonGrammarAccess.RealTermElements getRealTermAccess() {
		return gaCommon.getRealTermAccess();
	}
	
	public ParserRule getRealTermRule() {
		return getRealTermAccess().getRule();
	}

	//REAL:
	//	INT "." INT;
	public CommonGrammarAccess.REALElements getREALAccess() {
		return gaCommon.getREALAccess();
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}

	//IntegerTerm:
	//	value=INT unit=ID?;
	public CommonGrammarAccess.IntegerTermElements getIntegerTermAccess() {
		return gaCommon.getIntegerTermAccess();
	}
	
	public ParserRule getIntegerTermRule() {
		return getIntegerTermAccess().getRule();
	}

	//MultiLineString:
	//	description+=TextElement+;
	public CommonGrammarAccess.MultiLineStringElements getMultiLineStringAccess() {
		return gaCommon.getMultiLineStringAccess();
	}
	
	public ParserRule getMultiLineStringRule() {
		return getMultiLineStringAccess().getRule();
	}

	//TextElement:
	//	text=STRING | newline?="&";
	public CommonGrammarAccess.TextElementElements getTextElementAccess() {
		return gaCommon.getTextElementAccess();
	}
	
	public ParserRule getTextElementRule() {
		return getTextElementAccess().getRule();
	}

	//ValueString: // remove quotes from string in ValueConverter 
	//	STRING;
	public CommonGrammarAccess.ValueStringElements getValueStringAccess() {
		return gaCommon.getValueStringAccess();
	}
	
	public ParserRule getValueStringRule() {
		return getValueStringAccess().getRule();
	}

	//// Qualified classifier reference
	//AadlClassifierReference:
	//	(ID "::")* ID ("." ID)?;
	public CommonGrammarAccess.AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return gaCommon.getAadlClassifierReferenceAccess();
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//// Category reference. Currently it is only a single ID
	//CatRef: //('.' ID)?
	//	ID;
	public CommonGrammarAccess.CatRefElements getCatRefAccess() {
		return gaCommon.getCatRefAccess();
	}
	
	public ParserRule getCatRefRule() {
		return getCatRefAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public CommonGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaCommon.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//URIID:
	//	STRING;
	public CommonGrammarAccess.URIIDElements getURIIDAccess() {
		return gaCommon.getURIIDAccess();
	}
	
	public ParserRule getURIIDRule() {
		return getURIIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaCommon.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaCommon.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaCommon.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaCommon.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCommon.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaCommon.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaCommon.getANY_OTHERRule();
	} 
}
