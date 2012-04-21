package org.osate.xtext.aadl2.ui.syntax;

import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider.IParserErrorContext;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.AadlPackage;

public class Aadl2SyntaxErrorMessageProvider extends SyntaxErrorMessageProvider{

	@Override

	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		EObject contextobj = context.getCurrentContext();
		RecognitionException ex = context.getRecognitionException();
		String msg = context.getDefaultMessage();
		INode n = context.getCurrentNode();
		 Iterable<ILeafNode> ln = n.getLeafNodes();
		
		if (contextobj == null){
			msg = "Incomplete package or property set declaration";
		} else 
		if (contextobj instanceof AadlPackage){
			String packname = ((AadlPackage)contextobj).getName()!=null?((AadlPackage)contextobj).getName():"";
			if (ex instanceof NoViableAltException){
				msg = "Missing public or private in package "+packname;
			}
		}
		return new SyntaxErrorMessage(msg, Diagnostic.SYNTAX_DIAGNOSTIC);
	}

}
