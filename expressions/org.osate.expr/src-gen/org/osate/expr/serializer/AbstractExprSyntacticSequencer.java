/*
 * generated by Xtext
 */
package org.osate.expr.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.expr.services.ExprGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractExprSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExprGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_6_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_6_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExprGrammarAccess) access;
		match_PrimaryExpression_LeftParenthesisKeyword_6_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
		match_PrimaryExpression_LeftParenthesisKeyword_6_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_PrimaryExpression_LeftParenthesisKeyword_6_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_6_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_6_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_6_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' property=[AbstractNamedValue|QPREF]
	 *     (rule start) (ambiguity) '[' minimum=Expression
	 *     (rule start) (ambiguity) 'bag' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'bag' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'if' if=Expression
	 *     (rule start) (ambiguity) 'list' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'list' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'map' (rule start)
	 *     (rule start) (ambiguity) 'record' (rule start)
	 *     (rule start) (ambiguity) 'set' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'set' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'tuple' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'tuple' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'union' (rule start)
	 *     (rule start) (ambiguity) function=QCREF
	 *     (rule start) (ambiguity) modelElement=[NamedElement|This]
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) ref=[VarDecl|QCREF]
	 *     (rule start) (ambiguity) value=INTEGER_LIT
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value=REAL_LIT
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {BinaryOperation.left=}
	 *     (rule start) (ambiguity) {ModelReference.prev=}
	 *     (rule start) (ambiguity) {PropertyReference.modelElementReference=}
	 *     (rule start) (ambiguity) {UnitExpression.expression=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_6_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) {BinaryOperation.left=}
	 *     (rule start) (ambiguity) {UnitExpression.expression=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_6_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
