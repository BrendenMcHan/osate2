package org.osate.expr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.expr.services.ExprGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VIRTUAL_PROCESSOR", "SUBPROGRAMGROUP", "SUBCOMPONENT", "THREAD_GROUP", "VIRTUAL_BUS", "CLASSIFIER", "CONNECTION", "SUBPROGRAM", "PROCESSOR", "Subclause", "ABSTRACT", "FEATURE", "MEMEORY", "PROCESS", "Library", "DEVICE", "SYSTEM", "THREAD", "Record", "String", "Tuple", "Union", "DATA", "FLOW", "MODE", "Bool", "List", "Real", "Type", "QuestionMarkQuestionMarkQuestionMark", "BUS", "Bag", "Def", "Int", "Map", "Set", "Val", "Var", "HyphenMinusGreaterThanSign", "ColonColon", "LeftParenthesis", "RightParenthesis", "Asterisk", "FullStop", "Colon", "Semicolon", "EqualsSign", "LeftCurlyBracket", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int SYSTEM=20;
    public static final int Val=40;
    public static final int CLASSIFIER=9;
    public static final int Var=41;
    public static final int MODE=28;
    public static final int String=23;
    public static final int FLOW=27;
    public static final int RULE_INT_EXPONENT=56;
    public static final int LeftParenthesis=44;
    public static final int Bool=29;
    public static final int PROCESS=17;
    public static final int Real=31;
    public static final int QuestionMarkQuestionMarkQuestionMark=33;
    public static final int SUBPROGRAMGROUP=5;
    public static final int List=30;
    public static final int RULE_BASED_INTEGER=58;
    public static final int SUBCOMPONENT=6;
    public static final int RULE_ID=62;
    public static final int PROCESSOR=12;
    public static final int DEVICE=19;
    public static final int RightParenthesis=45;
    public static final int RULE_DIGIT=54;
    public static final int ColonColon=43;
    public static final int SUBPROGRAM=11;
    public static final int DATA=26;
    public static final int FEATURE=15;
    public static final int Library=18;
    public static final int Map=38;
    public static final int RULE_INTEGER_LIT=59;
    public static final int Set=39;
    public static final int Subclause=13;
    public static final int VIRTUAL_BUS=8;
    public static final int RULE_REAL_LIT=57;
    public static final int RULE_STRING=61;
    public static final int ABSTRACT=14;
    public static final int VIRTUAL_PROCESSOR=4;
    public static final int Union=25;
    public static final int Int=37;
    public static final int RULE_SL_COMMENT=53;
    public static final int EqualsSign=50;
    public static final int Record=22;
    public static final int Colon=48;
    public static final int RightCurlyBracket=52;
    public static final int EOF=-1;
    public static final int Asterisk=46;
    public static final int BUS=34;
    public static final int FullStop=47;
    public static final int Def=36;
    public static final int RULE_WS=63;
    public static final int LeftCurlyBracket=51;
    public static final int Bag=35;
    public static final int CONNECTION=10;
    public static final int Semicolon=49;
    public static final int Type=32;
    public static final int RULE_EXPONENT=55;
    public static final int RULE_EXTENDED_DIGIT=60;
    public static final int HyphenMinusGreaterThanSign=42;
    public static final int MEMEORY=16;
    public static final int THREAD_GROUP=7;
    public static final int THREAD=21;
    public static final int Tuple=24;

    // delegates
    // delegators


        public InternalExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExprParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExprParser.g"; }




    	private ExprGrammarAccess grammarAccess;
    	 	
    	public InternalExprParser(TokenStream input, ExprGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "ExprModel";	
    	} 
    	   	   	
    	@Override
    	protected ExprGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleExprModel"
    // InternalExprParser.g:62:1: entryRuleExprModel returns [EObject current=null] : iv_ruleExprModel= ruleExprModel EOF ;
    public final EObject entryRuleExprModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprModel = null;


        try {
            // InternalExprParser.g:63:2: (iv_ruleExprModel= ruleExprModel EOF )
            // InternalExprParser.g:64:2: iv_ruleExprModel= ruleExprModel EOF
            {
             newCompositeNode(grammarAccess.getExprModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprModel=ruleExprModel();

            state._fsp--;

             current =iv_ruleExprModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprModel"


    // $ANTLR start "ruleExprModel"
    // InternalExprParser.g:71:1: ruleExprModel returns [EObject current=null] : ( (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) ) | (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) ) ) ;
    public final EObject ruleExprModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_annex_1_0 = null;

        EObject lv_annex_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:74:28: ( ( (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) ) | (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) ) ) )
            // InternalExprParser.g:75:1: ( (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) ) | (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) ) )
            {
            // InternalExprParser.g:75:1: ( (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) ) | (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Library) ) {
                alt1=1;
            }
            else if ( (LA1_0==Subclause) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalExprParser.g:75:2: (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) )
                    {
                    // InternalExprParser.g:75:2: (otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) ) )
                    // InternalExprParser.g:76:2: otherlv_0= Library ( (lv_annex_1_0= ruleExprLibrary ) )
                    {
                    otherlv_0=(Token)match(input,Library,FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getExprModelAccess().getLibraryKeyword_0_0());
                        
                    // InternalExprParser.g:80:1: ( (lv_annex_1_0= ruleExprLibrary ) )
                    // InternalExprParser.g:81:1: (lv_annex_1_0= ruleExprLibrary )
                    {
                    // InternalExprParser.g:81:1: (lv_annex_1_0= ruleExprLibrary )
                    // InternalExprParser.g:82:3: lv_annex_1_0= ruleExprLibrary
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprModelAccess().getAnnexExprLibraryParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_annex_1_0=ruleExprLibrary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprModelRule());
                    	        }
                           		set(
                           			current, 
                           			"annex",
                            		lv_annex_1_0, 
                            		"org.osate.expr.Expr.ExprLibrary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExprParser.g:99:6: (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) )
                    {
                    // InternalExprParser.g:99:6: (otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) ) )
                    // InternalExprParser.g:100:2: otherlv_2= Subclause ( (lv_annex_3_0= ruleExprSubclause ) )
                    {
                    otherlv_2=(Token)match(input,Subclause,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getExprModelAccess().getSubclauseKeyword_1_0());
                        
                    // InternalExprParser.g:104:1: ( (lv_annex_3_0= ruleExprSubclause ) )
                    // InternalExprParser.g:105:1: (lv_annex_3_0= ruleExprSubclause )
                    {
                    // InternalExprParser.g:105:1: (lv_annex_3_0= ruleExprSubclause )
                    // InternalExprParser.g:106:3: lv_annex_3_0= ruleExprSubclause
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprModelAccess().getAnnexExprSubclauseParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_annex_3_0=ruleExprSubclause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprModelRule());
                    	        }
                           		set(
                           			current, 
                           			"annex",
                            		lv_annex_3_0, 
                            		"org.osate.expr.Expr.ExprSubclause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprModel"


    // $ANTLR start "entryRuleExprLibrary"
    // InternalExprParser.g:130:1: entryRuleExprLibrary returns [EObject current=null] : iv_ruleExprLibrary= ruleExprLibrary EOF ;
    public final EObject entryRuleExprLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLibrary = null;


        try {
            // InternalExprParser.g:131:2: (iv_ruleExprLibrary= ruleExprLibrary EOF )
            // InternalExprParser.g:132:2: iv_ruleExprLibrary= ruleExprLibrary EOF
            {
             newCompositeNode(grammarAccess.getExprLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprLibrary=ruleExprLibrary();

            state._fsp--;

             current =iv_ruleExprLibrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLibrary"


    // $ANTLR start "ruleExprLibrary"
    // InternalExprParser.g:139:1: ruleExprLibrary returns [EObject current=null] : ( () ( (lv_decls_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleExprLibrary() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_1_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:142:28: ( ( () ( (lv_decls_1_0= ruleDeclaration ) )* ) )
            // InternalExprParser.g:143:1: ( () ( (lv_decls_1_0= ruleDeclaration ) )* )
            {
            // InternalExprParser.g:143:1: ( () ( (lv_decls_1_0= ruleDeclaration ) )* )
            // InternalExprParser.g:143:2: () ( (lv_decls_1_0= ruleDeclaration ) )*
            {
            // InternalExprParser.g:143:2: ()
            // InternalExprParser.g:144:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprLibraryAccess().getExprLibraryAction_0(),
                        current);
                

            }

            // InternalExprParser.g:149:2: ( (lv_decls_1_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Type||LA2_0==Def||(LA2_0>=Val && LA2_0<=Var)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExprParser.g:150:1: (lv_decls_1_0= ruleDeclaration )
            	    {
            	    // InternalExprParser.g:150:1: (lv_decls_1_0= ruleDeclaration )
            	    // InternalExprParser.g:151:3: lv_decls_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprLibraryAccess().getDeclsDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_decls_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decls",
            	            		lv_decls_1_0, 
            	            		"org.osate.expr.Expr.Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLibrary"


    // $ANTLR start "entryRuleExprSubclause"
    // InternalExprParser.g:175:1: entryRuleExprSubclause returns [EObject current=null] : iv_ruleExprSubclause= ruleExprSubclause EOF ;
    public final EObject entryRuleExprSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSubclause = null;


        try {
            // InternalExprParser.g:176:2: (iv_ruleExprSubclause= ruleExprSubclause EOF )
            // InternalExprParser.g:177:2: iv_ruleExprSubclause= ruleExprSubclause EOF
            {
             newCompositeNode(grammarAccess.getExprSubclauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprSubclause=ruleExprSubclause();

            state._fsp--;

             current =iv_ruleExprSubclause; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSubclause"


    // $ANTLR start "ruleExprSubclause"
    // InternalExprParser.g:184:1: ruleExprSubclause returns [EObject current=null] : ( () ( (lv_decls_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleExprSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_1_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:187:28: ( ( () ( (lv_decls_1_0= ruleDeclaration ) )* ) )
            // InternalExprParser.g:188:1: ( () ( (lv_decls_1_0= ruleDeclaration ) )* )
            {
            // InternalExprParser.g:188:1: ( () ( (lv_decls_1_0= ruleDeclaration ) )* )
            // InternalExprParser.g:188:2: () ( (lv_decls_1_0= ruleDeclaration ) )*
            {
            // InternalExprParser.g:188:2: ()
            // InternalExprParser.g:189:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprSubclauseAccess().getExprSubclauseAction_0(),
                        current);
                

            }

            // InternalExprParser.g:194:2: ( (lv_decls_1_0= ruleDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Type||LA3_0==Def||(LA3_0>=Val && LA3_0<=Var)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExprParser.g:195:1: (lv_decls_1_0= ruleDeclaration )
            	    {
            	    // InternalExprParser.g:195:1: (lv_decls_1_0= ruleDeclaration )
            	    // InternalExprParser.g:196:3: lv_decls_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprSubclauseAccess().getDeclsDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_decls_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprSubclauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decls",
            	            		lv_decls_1_0, 
            	            		"org.osate.expr.Expr.Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSubclause"


    // $ANTLR start "entryRuleDeclaration"
    // InternalExprParser.g:222:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalExprParser.g:223:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalExprParser.g:224:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalExprParser.g:231:1: ruleDeclaration returns [EObject current=null] : (this_TypeDecl_0= ruleTypeDecl | this_VarDecl_1= ruleVarDecl | this_FunDecl_2= ruleFunDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDecl_0 = null;

        EObject this_VarDecl_1 = null;

        EObject this_FunDecl_2 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:234:28: ( (this_TypeDecl_0= ruleTypeDecl | this_VarDecl_1= ruleVarDecl | this_FunDecl_2= ruleFunDecl ) )
            // InternalExprParser.g:235:1: (this_TypeDecl_0= ruleTypeDecl | this_VarDecl_1= ruleVarDecl | this_FunDecl_2= ruleFunDecl )
            {
            // InternalExprParser.g:235:1: (this_TypeDecl_0= ruleTypeDecl | this_VarDecl_1= ruleVarDecl | this_FunDecl_2= ruleFunDecl )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Type:
                {
                alt4=1;
                }
                break;
            case Val:
            case Var:
                {
                alt4=2;
                }
                break;
            case Def:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExprParser.g:236:5: this_TypeDecl_0= ruleTypeDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TypeDecl_0=ruleTypeDecl();

                    state._fsp--;


                            current = this_TypeDecl_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalExprParser.g:246:5: this_VarDecl_1= ruleVarDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getVarDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_VarDecl_1=ruleVarDecl();

                    state._fsp--;


                            current = this_VarDecl_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalExprParser.g:256:5: this_FunDecl_2= ruleFunDecl
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getFunDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_FunDecl_2=ruleFunDecl();

                    state._fsp--;


                            current = this_FunDecl_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalExprParser.g:272:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // InternalExprParser.g:273:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalExprParser.g:274:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // InternalExprParser.g:281:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:284:28: ( (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= Semicolon ) )
            // InternalExprParser.g:285:1: (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= Semicolon )
            {
            // InternalExprParser.g:285:1: (otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= Semicolon )
            // InternalExprParser.g:286:2: otherlv_0= Type ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleType ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
            // InternalExprParser.g:290:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalExprParser.g:291:1: (lv_name_1_0= RULE_ID )
            {
            // InternalExprParser.g:291:1: (lv_name_1_0= RULE_ID )
            // InternalExprParser.g:292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.osate.expr.Expr.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getColonKeyword_2());
                
            // InternalExprParser.g:313:1: ( (lv_type_3_0= ruleType ) )
            // InternalExprParser.g:314:1: (lv_type_3_0= ruleType )
            {
            // InternalExprParser.g:314:1: (lv_type_3_0= ruleType )
            // InternalExprParser.g:315:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalExprParser.g:344:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalExprParser.g:345:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalExprParser.g:346:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalExprParser.g:353:1: ruleVarDecl returns [EObject current=null] : ( ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )? (otherlv_5= EqualsSign ruleExpression )? otherlv_7= Semicolon ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:356:28: ( ( ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )? (otherlv_5= EqualsSign ruleExpression )? otherlv_7= Semicolon ) )
            // InternalExprParser.g:357:1: ( ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )? (otherlv_5= EqualsSign ruleExpression )? otherlv_7= Semicolon )
            {
            // InternalExprParser.g:357:1: ( ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )? (otherlv_5= EqualsSign ruleExpression )? otherlv_7= Semicolon )
            // InternalExprParser.g:357:2: ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )? (otherlv_5= EqualsSign ruleExpression )? otherlv_7= Semicolon
            {
            // InternalExprParser.g:357:2: ( ( (lv_const_0_0= Val ) ) | otherlv_1= Var )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Val) ) {
                alt5=1;
            }
            else if ( (LA5_0==Var) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExprParser.g:357:3: ( (lv_const_0_0= Val ) )
                    {
                    // InternalExprParser.g:357:3: ( (lv_const_0_0= Val ) )
                    // InternalExprParser.g:358:1: (lv_const_0_0= Val )
                    {
                    // InternalExprParser.g:358:1: (lv_const_0_0= Val )
                    // InternalExprParser.g:359:3: lv_const_0_0= Val
                    {
                    lv_const_0_0=(Token)match(input,Val,FOLLOW_5); 

                            newLeafNode(lv_const_0_0, grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarDeclRule());
                    	        }
                           		setWithLastConsumed(current, "const", true, "val");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExprParser.g:375:2: otherlv_1= Var
                    {
                    otherlv_1=(Token)match(input,Var,FOLLOW_5); 

                        	newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getVarKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalExprParser.g:379:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalExprParser.g:380:1: (lv_name_2_0= RULE_ID )
            {
            // InternalExprParser.g:380:1: (lv_name_2_0= RULE_ID )
            // InternalExprParser.g:381:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.osate.expr.Expr.ID");
            	    

            }


            }

            // InternalExprParser.g:397:2: (otherlv_3= Colon ( (lv_type_4_0= ruleType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExprParser.g:398:2: otherlv_3= Colon ( (lv_type_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getColonKeyword_2_0());
                        
                    // InternalExprParser.g:402:1: ( (lv_type_4_0= ruleType ) )
                    // InternalExprParser.g:403:1: (lv_type_4_0= ruleType )
                    {
                    // InternalExprParser.g:403:1: (lv_type_4_0= ruleType )
                    // InternalExprParser.g:404:3: lv_type_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_10);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"org.osate.expr.Expr.Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalExprParser.g:420:4: (otherlv_5= EqualsSign ruleExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EqualsSign) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExprParser.g:421:2: otherlv_5= EqualsSign ruleExpression
                    {
                    otherlv_5=(Token)match(input,EqualsSign,FOLLOW_11); 

                        	newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getEqualsSignKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getVarDeclAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_8);
                    ruleExpression();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getVarDeclAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleFunDecl"
    // InternalExprParser.g:446:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // InternalExprParser.g:447:2: (iv_ruleFunDecl= ruleFunDecl EOF )
            // InternalExprParser.g:448:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
             newCompositeNode(grammarAccess.getFunDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunDecl=ruleFunDecl();

            state._fsp--;

             current =iv_ruleFunDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunDecl"


    // $ANTLR start "ruleFunDecl"
    // InternalExprParser.g:455:1: ruleFunDecl returns [EObject current=null] : (otherlv_0= Def ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis otherlv_3= RightParenthesis otherlv_4= Semicolon ) ;
    public final EObject ruleFunDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:458:28: ( (otherlv_0= Def ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis otherlv_3= RightParenthesis otherlv_4= Semicolon ) )
            // InternalExprParser.g:459:1: (otherlv_0= Def ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis otherlv_3= RightParenthesis otherlv_4= Semicolon )
            {
            // InternalExprParser.g:459:1: (otherlv_0= Def ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis otherlv_3= RightParenthesis otherlv_4= Semicolon )
            // InternalExprParser.g:460:2: otherlv_0= Def ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis otherlv_3= RightParenthesis otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getFunDeclAccess().getDefKeyword_0());
                
            // InternalExprParser.g:464:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalExprParser.g:465:1: (lv_name_1_0= RULE_ID )
            {
            // InternalExprParser.g:465:1: (lv_name_1_0= RULE_ID )
            // InternalExprParser.g:466:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.osate.expr.Expr.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_13); 

                	newLeafNode(otherlv_2, grammarAccess.getFunDeclAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_8); 

                	newLeafNode(otherlv_3, grammarAccess.getFunDeclAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getFunDeclAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunDecl"


    // $ANTLR start "entryRuleType"
    // InternalExprParser.g:505:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalExprParser.g:506:2: (iv_ruleType= ruleType EOF )
            // InternalExprParser.g:507:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalExprParser.g:514:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_Category_1= ruleCategory | this_MetaClass_2= ruleMetaClass | this_RecordType_3= ruleRecordType | this_UnionType_4= ruleUnionType | this_TupleType_5= ruleTupleType | this_ListType_6= ruleListType | this_SetType_7= ruleSetType | this_BagType_8= ruleBagType | this_MapType_9= ruleMapType | this_TypeRef_10= ruleTypeRef ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_Category_1 = null;

        EObject this_MetaClass_2 = null;

        EObject this_RecordType_3 = null;

        EObject this_UnionType_4 = null;

        EObject this_TupleType_5 = null;

        EObject this_ListType_6 = null;

        EObject this_SetType_7 = null;

        EObject this_BagType_8 = null;

        EObject this_MapType_9 = null;

        EObject this_TypeRef_10 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:517:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_Category_1= ruleCategory | this_MetaClass_2= ruleMetaClass | this_RecordType_3= ruleRecordType | this_UnionType_4= ruleUnionType | this_TupleType_5= ruleTupleType | this_ListType_6= ruleListType | this_SetType_7= ruleSetType | this_BagType_8= ruleBagType | this_MapType_9= ruleMapType | this_TypeRef_10= ruleTypeRef ) )
            // InternalExprParser.g:518:1: (this_PrimitiveType_0= rulePrimitiveType | this_Category_1= ruleCategory | this_MetaClass_2= ruleMetaClass | this_RecordType_3= ruleRecordType | this_UnionType_4= ruleUnionType | this_TupleType_5= ruleTupleType | this_ListType_6= ruleListType | this_SetType_7= ruleSetType | this_BagType_8= ruleBagType | this_MapType_9= ruleMapType | this_TypeRef_10= ruleTypeRef )
            {
            // InternalExprParser.g:518:1: (this_PrimitiveType_0= rulePrimitiveType | this_Category_1= ruleCategory | this_MetaClass_2= ruleMetaClass | this_RecordType_3= ruleRecordType | this_UnionType_4= ruleUnionType | this_TupleType_5= ruleTupleType | this_ListType_6= ruleListType | this_SetType_7= ruleSetType | this_BagType_8= ruleBagType | this_MapType_9= ruleMapType | this_TypeRef_10= ruleTypeRef )
            int alt8=11;
            switch ( input.LA(1) ) {
            case String:
            case Bool:
            case Real:
            case Int:
                {
                alt8=1;
                }
                break;
            case VIRTUAL_PROCESSOR:
            case SUBPROGRAMGROUP:
            case THREAD_GROUP:
            case VIRTUAL_BUS:
            case SUBPROGRAM:
            case PROCESSOR:
            case ABSTRACT:
            case MEMEORY:
            case PROCESS:
            case DEVICE:
            case SYSTEM:
            case THREAD:
            case DATA:
            case BUS:
                {
                alt8=2;
                }
                break;
            case SUBCOMPONENT:
            case CLASSIFIER:
            case CONNECTION:
            case FEATURE:
            case FLOW:
            case MODE:
                {
                alt8=3;
                }
                break;
            case Record:
                {
                alt8=4;
                }
                break;
            case Union:
                {
                alt8=5;
                }
                break;
            case Tuple:
                {
                alt8=6;
                }
                break;
            case List:
                {
                alt8=7;
                }
                break;
            case Set:
                {
                alt8=8;
                }
                break;
            case Bag:
                {
                alt8=9;
                }
                break;
            case Map:
                {
                alt8=10;
                }
                break;
            case RULE_ID:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExprParser.g:519:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                            current = this_PrimitiveType_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalExprParser.g:529:5: this_Category_1= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCategoryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Category_1=ruleCategory();

                    state._fsp--;


                            current = this_Category_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalExprParser.g:539:5: this_MetaClass_2= ruleMetaClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMetaClassParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MetaClass_2=ruleMetaClass();

                    state._fsp--;


                            current = this_MetaClass_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalExprParser.g:549:5: this_RecordType_3= ruleRecordType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RecordType_3=ruleRecordType();

                    state._fsp--;


                            current = this_RecordType_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalExprParser.g:559:5: this_UnionType_4= ruleUnionType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUnionTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_UnionType_4=ruleUnionType();

                    state._fsp--;


                            current = this_UnionType_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalExprParser.g:569:5: this_TupleType_5= ruleTupleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TupleType_5=ruleTupleType();

                    state._fsp--;


                            current = this_TupleType_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalExprParser.g:579:5: this_ListType_6= ruleListType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ListType_6=ruleListType();

                    state._fsp--;


                            current = this_ListType_6;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalExprParser.g:589:5: this_SetType_7= ruleSetType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SetType_7=ruleSetType();

                    state._fsp--;


                            current = this_SetType_7;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalExprParser.g:599:5: this_BagType_8= ruleBagType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBagTypeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BagType_8=ruleBagType();

                    state._fsp--;


                            current = this_BagType_8;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalExprParser.g:609:5: this_MapType_9= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MapType_9=ruleMapType();

                    state._fsp--;


                            current = this_MapType_9;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalExprParser.g:619:5: this_TypeRef_10= ruleTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTypeRefParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TypeRef_10=ruleTypeRef();

                    state._fsp--;


                            current = this_TypeRef_10;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalExprParser.g:635:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalExprParser.g:636:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalExprParser.g:637:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalExprParser.g:644:1: rulePrimitiveType returns [EObject current=null] : ( ( () otherlv_1= Bool ) | ( () otherlv_3= Int ) | ( () otherlv_5= Real ) | ( () otherlv_7= String ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:647:28: ( ( ( () otherlv_1= Bool ) | ( () otherlv_3= Int ) | ( () otherlv_5= Real ) | ( () otherlv_7= String ) ) )
            // InternalExprParser.g:648:1: ( ( () otherlv_1= Bool ) | ( () otherlv_3= Int ) | ( () otherlv_5= Real ) | ( () otherlv_7= String ) )
            {
            // InternalExprParser.g:648:1: ( ( () otherlv_1= Bool ) | ( () otherlv_3= Int ) | ( () otherlv_5= Real ) | ( () otherlv_7= String ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case Bool:
                {
                alt9=1;
                }
                break;
            case Int:
                {
                alt9=2;
                }
                break;
            case Real:
                {
                alt9=3;
                }
                break;
            case String:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalExprParser.g:648:2: ( () otherlv_1= Bool )
                    {
                    // InternalExprParser.g:648:2: ( () otherlv_1= Bool )
                    // InternalExprParser.g:648:3: () otherlv_1= Bool
                    {
                    // InternalExprParser.g:648:3: ()
                    // InternalExprParser.g:649:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getBooleanAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,Bool,FOLLOW_2); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeAccess().getBoolKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalExprParser.g:660:6: ( () otherlv_3= Int )
                    {
                    // InternalExprParser.g:660:6: ( () otherlv_3= Int )
                    // InternalExprParser.g:660:7: () otherlv_3= Int
                    {
                    // InternalExprParser.g:660:7: ()
                    // InternalExprParser.g:661:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getIntegerAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,Int,FOLLOW_2); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypeAccess().getIntKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalExprParser.g:672:6: ( () otherlv_5= Real )
                    {
                    // InternalExprParser.g:672:6: ( () otherlv_5= Real )
                    // InternalExprParser.g:672:7: () otherlv_5= Real
                    {
                    // InternalExprParser.g:672:7: ()
                    // InternalExprParser.g:673:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getRealAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,Real,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimitiveTypeAccess().getRealKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalExprParser.g:684:6: ( () otherlv_7= String )
                    {
                    // InternalExprParser.g:684:6: ( () otherlv_7= String )
                    // InternalExprParser.g:684:7: () otherlv_7= String
                    {
                    // InternalExprParser.g:684:7: ()
                    // InternalExprParser.g:685:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getStringAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,String,FOLLOW_2); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_3_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleCategory"
    // InternalExprParser.g:703:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalExprParser.g:704:2: (iv_ruleCategory= ruleCategory EOF )
            // InternalExprParser.g:705:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalExprParser.g:712:1: ruleCategory returns [EObject current=null] : ( (lv_category_0_0= ruleCategoryEnum ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Enumerator lv_category_0_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:715:28: ( ( (lv_category_0_0= ruleCategoryEnum ) ) )
            // InternalExprParser.g:716:1: ( (lv_category_0_0= ruleCategoryEnum ) )
            {
            // InternalExprParser.g:716:1: ( (lv_category_0_0= ruleCategoryEnum ) )
            // InternalExprParser.g:717:1: (lv_category_0_0= ruleCategoryEnum )
            {
            // InternalExprParser.g:717:1: (lv_category_0_0= ruleCategoryEnum )
            // InternalExprParser.g:718:3: lv_category_0_0= ruleCategoryEnum
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getCategoryCategoryEnumEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_category_0_0=ruleCategoryEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"category",
                    		lv_category_0_0, 
                    		"org.osate.expr.Expr.CategoryEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleMetaClass"
    // InternalExprParser.g:742:1: entryRuleMetaClass returns [EObject current=null] : iv_ruleMetaClass= ruleMetaClass EOF ;
    public final EObject entryRuleMetaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaClass = null;


        try {
            // InternalExprParser.g:743:2: (iv_ruleMetaClass= ruleMetaClass EOF )
            // InternalExprParser.g:744:2: iv_ruleMetaClass= ruleMetaClass EOF
            {
             newCompositeNode(grammarAccess.getMetaClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaClass=ruleMetaClass();

            state._fsp--;

             current =iv_ruleMetaClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // InternalExprParser.g:751:1: ruleMetaClass returns [EObject current=null] : ( (lv_class_0_0= ruleMetaClassEnum ) ) ;
    public final EObject ruleMetaClass() throws RecognitionException {
        EObject current = null;

        Enumerator lv_class_0_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:754:28: ( ( (lv_class_0_0= ruleMetaClassEnum ) ) )
            // InternalExprParser.g:755:1: ( (lv_class_0_0= ruleMetaClassEnum ) )
            {
            // InternalExprParser.g:755:1: ( (lv_class_0_0= ruleMetaClassEnum ) )
            // InternalExprParser.g:756:1: (lv_class_0_0= ruleMetaClassEnum )
            {
            // InternalExprParser.g:756:1: (lv_class_0_0= ruleMetaClassEnum )
            // InternalExprParser.g:757:3: lv_class_0_0= ruleMetaClassEnum
            {
             
            	        newCompositeNode(grammarAccess.getMetaClassAccess().getClassMetaClassEnumEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_class_0_0=ruleMetaClassEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_0_0, 
                    		"org.osate.expr.Expr.MetaClassEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleRecordType"
    // InternalExprParser.g:781:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalExprParser.g:782:2: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalExprParser.g:783:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalExprParser.g:790:1: ruleRecordType returns [EObject current=null] : ( () otherlv_1= Record otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleField ) )* otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_field_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:793:28: ( ( () otherlv_1= Record otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleField ) )* otherlv_4= RightCurlyBracket ) )
            // InternalExprParser.g:794:1: ( () otherlv_1= Record otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleField ) )* otherlv_4= RightCurlyBracket )
            {
            // InternalExprParser.g:794:1: ( () otherlv_1= Record otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleField ) )* otherlv_4= RightCurlyBracket )
            // InternalExprParser.g:794:2: () otherlv_1= Record otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleField ) )* otherlv_4= RightCurlyBracket
            {
            // InternalExprParser.g:794:2: ()
            // InternalExprParser.g:795:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecordTypeAccess().getRecordTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Record,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getRecordKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_15); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalExprParser.g:810:1: ( (lv_field_3_0= ruleField ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExprParser.g:811:1: (lv_field_3_0= ruleField )
            	    {
            	    // InternalExprParser.g:811:1: (lv_field_3_0= ruleField )
            	    // InternalExprParser.g:812:3: lv_field_3_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldFieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_field_3_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"field",
            	            		lv_field_3_0, 
            	            		"org.osate.expr.Expr.Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // InternalExprParser.g:841:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalExprParser.g:842:2: (iv_ruleField= ruleField EOF )
            // InternalExprParser.g:843:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalExprParser.g:850:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:853:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) otherlv_3= Semicolon ) )
            // InternalExprParser.g:854:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) otherlv_3= Semicolon )
            {
            // InternalExprParser.g:854:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) otherlv_3= Semicolon )
            // InternalExprParser.g:854:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) otherlv_3= Semicolon
            {
            // InternalExprParser.g:854:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalExprParser.g:855:1: (lv_name_0_0= RULE_ID )
            {
            // InternalExprParser.g:855:1: (lv_name_0_0= RULE_ID )
            // InternalExprParser.g:856:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.osate.expr.Expr.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
                
            // InternalExprParser.g:877:1: ( (lv_type_2_0= ruleType ) )
            // InternalExprParser.g:878:1: (lv_type_2_0= ruleType )
            {
            // InternalExprParser.g:878:1: (lv_type_2_0= ruleType )
            // InternalExprParser.g:879:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleUnionType"
    // InternalExprParser.g:908:1: entryRuleUnionType returns [EObject current=null] : iv_ruleUnionType= ruleUnionType EOF ;
    public final EObject entryRuleUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionType = null;


        try {
            // InternalExprParser.g:909:2: (iv_ruleUnionType= ruleUnionType EOF )
            // InternalExprParser.g:910:2: iv_ruleUnionType= ruleUnionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionType=ruleUnionType();

            state._fsp--;

             current =iv_ruleUnionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // InternalExprParser.g:917:1: ruleUnionType returns [EObject current=null] : ( () otherlv_1= Union otherlv_2= LeftCurlyBracket otherlv_3= QuestionMarkQuestionMarkQuestionMark otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleUnionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:920:28: ( ( () otherlv_1= Union otherlv_2= LeftCurlyBracket otherlv_3= QuestionMarkQuestionMarkQuestionMark otherlv_4= RightCurlyBracket ) )
            // InternalExprParser.g:921:1: ( () otherlv_1= Union otherlv_2= LeftCurlyBracket otherlv_3= QuestionMarkQuestionMarkQuestionMark otherlv_4= RightCurlyBracket )
            {
            // InternalExprParser.g:921:1: ( () otherlv_1= Union otherlv_2= LeftCurlyBracket otherlv_3= QuestionMarkQuestionMarkQuestionMark otherlv_4= RightCurlyBracket )
            // InternalExprParser.g:921:2: () otherlv_1= Union otherlv_2= LeftCurlyBracket otherlv_3= QuestionMarkQuestionMarkQuestionMark otherlv_4= RightCurlyBracket
            {
            // InternalExprParser.g:921:2: ()
            // InternalExprParser.g:922:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnionTypeAccess().getUnionTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Union,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getUnionTypeAccess().getUnionKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getUnionTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,QuestionMarkQuestionMarkQuestionMark,FOLLOW_16); 

                	newLeafNode(otherlv_3, grammarAccess.getUnionTypeAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword_3());
                
            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getUnionTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleTupleType"
    // InternalExprParser.g:955:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalExprParser.g:956:2: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalExprParser.g:957:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // InternalExprParser.g:964:1: ruleTupleType returns [EObject current=null] : ( () otherlv_1= Tuple otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleTupleField ) )* otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_field_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:967:28: ( ( () otherlv_1= Tuple otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleTupleField ) )* otherlv_4= RightCurlyBracket ) )
            // InternalExprParser.g:968:1: ( () otherlv_1= Tuple otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleTupleField ) )* otherlv_4= RightCurlyBracket )
            {
            // InternalExprParser.g:968:1: ( () otherlv_1= Tuple otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleTupleField ) )* otherlv_4= RightCurlyBracket )
            // InternalExprParser.g:968:2: () otherlv_1= Tuple otherlv_2= LeftCurlyBracket ( (lv_field_3_0= ruleTupleField ) )* otherlv_4= RightCurlyBracket
            {
            // InternalExprParser.g:968:2: ()
            // InternalExprParser.g:969:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Tuple,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalExprParser.g:984:1: ( (lv_field_3_0= ruleTupleField ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=VIRTUAL_PROCESSOR && LA11_0<=PROCESSOR)||(LA11_0>=ABSTRACT && LA11_0<=PROCESS)||(LA11_0>=DEVICE && LA11_0<=Real)||(LA11_0>=BUS && LA11_0<=Bag)||(LA11_0>=Int && LA11_0<=Set)||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExprParser.g:985:1: (lv_field_3_0= ruleTupleField )
            	    {
            	    // InternalExprParser.g:985:1: (lv_field_3_0= ruleTupleField )
            	    // InternalExprParser.g:986:3: lv_field_3_0= ruleTupleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleTypeAccess().getFieldTupleFieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_field_3_0=ruleTupleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"field",
            	            		lv_field_3_0, 
            	            		"org.osate.expr.Expr.TupleField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleTupleField"
    // InternalExprParser.g:1015:1: entryRuleTupleField returns [EObject current=null] : iv_ruleTupleField= ruleTupleField EOF ;
    public final EObject entryRuleTupleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleField = null;


        try {
            // InternalExprParser.g:1016:2: (iv_ruleTupleField= ruleTupleField EOF )
            // InternalExprParser.g:1017:2: iv_ruleTupleField= ruleTupleField EOF
            {
             newCompositeNode(grammarAccess.getTupleFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleField=ruleTupleField();

            state._fsp--;

             current =iv_ruleTupleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleField"


    // $ANTLR start "ruleTupleField"
    // InternalExprParser.g:1024:1: ruleTupleField returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleTupleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:1027:28: ( ( () ( (lv_type_1_0= ruleType ) ) otherlv_2= Semicolon ) )
            // InternalExprParser.g:1028:1: ( () ( (lv_type_1_0= ruleType ) ) otherlv_2= Semicolon )
            {
            // InternalExprParser.g:1028:1: ( () ( (lv_type_1_0= ruleType ) ) otherlv_2= Semicolon )
            // InternalExprParser.g:1028:2: () ( (lv_type_1_0= ruleType ) ) otherlv_2= Semicolon
            {
            // InternalExprParser.g:1028:2: ()
            // InternalExprParser.g:1029:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleFieldAccess().getFieldAction_0(),
                        current);
                

            }

            // InternalExprParser.g:1034:2: ( (lv_type_1_0= ruleType ) )
            // InternalExprParser.g:1035:1: (lv_type_1_0= ruleType )
            {
            // InternalExprParser.g:1035:1: (lv_type_1_0= ruleType )
            // InternalExprParser.g:1036:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleFieldAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getTupleFieldAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleField"


    // $ANTLR start "entryRuleListType"
    // InternalExprParser.g:1065:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalExprParser.g:1066:2: (iv_ruleListType= ruleListType EOF )
            // InternalExprParser.g:1067:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalExprParser.g:1074:1: ruleListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftCurlyBracket ( (lv_type_3_0= ruleType ) ) otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:1077:28: ( ( () otherlv_1= List otherlv_2= LeftCurlyBracket ( (lv_type_3_0= ruleType ) ) otherlv_4= RightCurlyBracket ) )
            // InternalExprParser.g:1078:1: ( () otherlv_1= List otherlv_2= LeftCurlyBracket ( (lv_type_3_0= ruleType ) ) otherlv_4= RightCurlyBracket )
            {
            // InternalExprParser.g:1078:1: ( () otherlv_1= List otherlv_2= LeftCurlyBracket ( (lv_type_3_0= ruleType ) ) otherlv_4= RightCurlyBracket )
            // InternalExprParser.g:1078:2: () otherlv_1= List otherlv_2= LeftCurlyBracket ( (lv_type_3_0= ruleType ) ) otherlv_4= RightCurlyBracket
            {
            // InternalExprParser.g:1078:2: ()
            // InternalExprParser.g:1079:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListTypeAccess().getListTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,List,FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getListKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalExprParser.g:1094:1: ( (lv_type_3_0= ruleType ) )
            // InternalExprParser.g:1095:1: (lv_type_3_0= ruleType )
            {
            // InternalExprParser.g:1095:1: (lv_type_3_0= ruleType )
            // InternalExprParser.g:1096:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleSetType"
    // InternalExprParser.g:1125:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalExprParser.g:1126:2: (iv_ruleSetType= ruleSetType EOF )
            // InternalExprParser.g:1127:2: iv_ruleSetType= ruleSetType EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetType=ruleSetType();

            state._fsp--;

             current =iv_ruleSetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // InternalExprParser.g:1134:1: ruleSetType returns [EObject current=null] : (otherlv_0= Set otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:1137:28: ( (otherlv_0= Set otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket ) )
            // InternalExprParser.g:1138:1: (otherlv_0= Set otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalExprParser.g:1138:1: (otherlv_0= Set otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket )
            // InternalExprParser.g:1139:2: otherlv_0= Set otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalExprParser.g:1148:1: ( (lv_type_2_0= ruleType ) )
            // InternalExprParser.g:1149:1: (lv_type_2_0= ruleType )
            {
            // InternalExprParser.g:1149:1: (lv_type_2_0= ruleType )
            // InternalExprParser.g:1150:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getSetTypeAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRuleBagType"
    // InternalExprParser.g:1179:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // InternalExprParser.g:1180:2: (iv_ruleBagType= ruleBagType EOF )
            // InternalExprParser.g:1181:2: iv_ruleBagType= ruleBagType EOF
            {
             newCompositeNode(grammarAccess.getBagTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBagType=ruleBagType();

            state._fsp--;

             current =iv_ruleBagType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBagType"


    // $ANTLR start "ruleBagType"
    // InternalExprParser.g:1188:1: ruleBagType returns [EObject current=null] : (otherlv_0= Bag otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:1191:28: ( (otherlv_0= Bag otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket ) )
            // InternalExprParser.g:1192:1: (otherlv_0= Bag otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalExprParser.g:1192:1: (otherlv_0= Bag otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket )
            // InternalExprParser.g:1193:2: otherlv_0= Bag otherlv_1= LeftCurlyBracket ( (lv_type_2_0= ruleType ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Bag,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
                
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalExprParser.g:1202:1: ( (lv_type_2_0= ruleType ) )
            // InternalExprParser.g:1203:1: (lv_type_2_0= ruleType )
            {
            // InternalExprParser.g:1203:1: (lv_type_2_0= ruleType )
            // InternalExprParser.g:1204:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBagTypeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBagTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getBagTypeAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBagType"


    // $ANTLR start "entryRuleMapType"
    // InternalExprParser.g:1233:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalExprParser.g:1234:2: (iv_ruleMapType= ruleMapType EOF )
            // InternalExprParser.g:1235:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalExprParser.g:1242:1: ruleMapType returns [EObject current=null] : (otherlv_0= Map otherlv_1= LeftCurlyBracket ( (lv_dom_2_0= ruleType ) ) otherlv_3= HyphenMinusGreaterThanSign ( (lv_img_4_0= ruleType ) ) otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dom_2_0 = null;

        EObject lv_img_4_0 = null;


         enterRule(); 
            
        try {
            // InternalExprParser.g:1245:28: ( (otherlv_0= Map otherlv_1= LeftCurlyBracket ( (lv_dom_2_0= ruleType ) ) otherlv_3= HyphenMinusGreaterThanSign ( (lv_img_4_0= ruleType ) ) otherlv_5= RightCurlyBracket ) )
            // InternalExprParser.g:1246:1: (otherlv_0= Map otherlv_1= LeftCurlyBracket ( (lv_dom_2_0= ruleType ) ) otherlv_3= HyphenMinusGreaterThanSign ( (lv_img_4_0= ruleType ) ) otherlv_5= RightCurlyBracket )
            {
            // InternalExprParser.g:1246:1: (otherlv_0= Map otherlv_1= LeftCurlyBracket ( (lv_dom_2_0= ruleType ) ) otherlv_3= HyphenMinusGreaterThanSign ( (lv_img_4_0= ruleType ) ) otherlv_5= RightCurlyBracket )
            // InternalExprParser.g:1247:2: otherlv_0= Map otherlv_1= LeftCurlyBracket ( (lv_dom_2_0= ruleType ) ) otherlv_3= HyphenMinusGreaterThanSign ( (lv_img_4_0= ruleType ) ) otherlv_5= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Map,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
                
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalExprParser.g:1256:1: ( (lv_dom_2_0= ruleType ) )
            // InternalExprParser.g:1257:1: (lv_dom_2_0= ruleType )
            {
            // InternalExprParser.g:1257:1: (lv_dom_2_0= ruleType )
            // InternalExprParser.g:1258:3: lv_dom_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMapTypeAccess().getDomTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_18);
            lv_dom_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
            	        }
                   		set(
                   			current, 
                   			"dom",
                    		lv_dom_2_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // InternalExprParser.g:1279:1: ( (lv_img_4_0= ruleType ) )
            // InternalExprParser.g:1280:1: (lv_img_4_0= ruleType )
            {
            // InternalExprParser.g:1280:1: (lv_img_4_0= ruleType )
            // InternalExprParser.g:1281:3: lv_img_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMapTypeAccess().getImgTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_img_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
            	        }
                   		set(
                   			current, 
                   			"img",
                    		lv_img_4_0, 
                    		"org.osate.expr.Expr.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleTypeRef"
    // InternalExprParser.g:1310:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalExprParser.g:1311:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalExprParser.g:1312:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalExprParser.g:1319:1: ruleTypeRef returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:1322:28: ( ( ( ruleQCREF ) ) )
            // InternalExprParser.g:1323:1: ( ( ruleQCREF ) )
            {
            // InternalExprParser.g:1323:1: ( ( ruleQCREF ) )
            // InternalExprParser.g:1324:1: ( ruleQCREF )
            {
            // InternalExprParser.g:1324:1: ( ruleQCREF )
            // InternalExprParser.g:1325:3: ruleQCREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getRefTypeDeclCrossReference_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQCREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleExpression"
    // InternalExprParser.g:1347:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalExprParser.g:1348:1: (iv_ruleExpression= ruleExpression EOF )
            // InternalExprParser.g:1349:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExprParser.g:1356:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= QuestionMarkQuestionMarkQuestionMark ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:1360:6: (kw= QuestionMarkQuestionMarkQuestionMark )
            // InternalExprParser.g:1362:2: kw= QuestionMarkQuestionMarkQuestionMark
            {
            kw=(Token)match(input,QuestionMarkQuestionMarkQuestionMark,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExpressionAccess().getQuestionMarkQuestionMarkQuestionMarkKeyword()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleQCREF"
    // InternalExprParser.g:1381:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalExprParser.g:1382:1: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalExprParser.g:1383:2: iv_ruleQCREF= ruleQCREF EOF
            {
             newCompositeNode(grammarAccess.getQCREFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;

             current =iv_ruleQCREF.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // InternalExprParser.g:1390:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalExprParser.g:1394:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalExprParser.g:1395:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalExprParser.g:1395:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalExprParser.g:1395:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalExprParser.g:1395:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==ColonColon) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalExprParser.g:1395:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,ColonColon,FOLLOW_5); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                
            // InternalExprParser.g:1415:1: (kw= FullStop this_ID_4= RULE_ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStop) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExprParser.g:1416:2: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_5); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "ruleCategoryEnum"
    // InternalExprParser.g:1438:1: ruleCategoryEnum returns [Enumerator current=null] : ( (enumLiteral_0= ABSTRACT ) | (enumLiteral_1= BUS ) | (enumLiteral_2= DATA ) | (enumLiteral_3= DEVICE ) | (enumLiteral_4= MEMEORY ) | (enumLiteral_5= PROCESS ) | (enumLiteral_6= PROCESSOR ) | (enumLiteral_7= SUBPROGRAM ) | (enumLiteral_8= SUBPROGRAMGROUP ) | (enumLiteral_9= SYSTEM ) | (enumLiteral_10= THREAD_GROUP ) | (enumLiteral_11= THREAD ) | (enumLiteral_12= VIRTUAL_BUS ) | (enumLiteral_13= VIRTUAL_PROCESSOR ) ) ;
    public final Enumerator ruleCategoryEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;

         enterRule(); 
        try {
            // InternalExprParser.g:1440:28: ( ( (enumLiteral_0= ABSTRACT ) | (enumLiteral_1= BUS ) | (enumLiteral_2= DATA ) | (enumLiteral_3= DEVICE ) | (enumLiteral_4= MEMEORY ) | (enumLiteral_5= PROCESS ) | (enumLiteral_6= PROCESSOR ) | (enumLiteral_7= SUBPROGRAM ) | (enumLiteral_8= SUBPROGRAMGROUP ) | (enumLiteral_9= SYSTEM ) | (enumLiteral_10= THREAD_GROUP ) | (enumLiteral_11= THREAD ) | (enumLiteral_12= VIRTUAL_BUS ) | (enumLiteral_13= VIRTUAL_PROCESSOR ) ) )
            // InternalExprParser.g:1441:1: ( (enumLiteral_0= ABSTRACT ) | (enumLiteral_1= BUS ) | (enumLiteral_2= DATA ) | (enumLiteral_3= DEVICE ) | (enumLiteral_4= MEMEORY ) | (enumLiteral_5= PROCESS ) | (enumLiteral_6= PROCESSOR ) | (enumLiteral_7= SUBPROGRAM ) | (enumLiteral_8= SUBPROGRAMGROUP ) | (enumLiteral_9= SYSTEM ) | (enumLiteral_10= THREAD_GROUP ) | (enumLiteral_11= THREAD ) | (enumLiteral_12= VIRTUAL_BUS ) | (enumLiteral_13= VIRTUAL_PROCESSOR ) )
            {
            // InternalExprParser.g:1441:1: ( (enumLiteral_0= ABSTRACT ) | (enumLiteral_1= BUS ) | (enumLiteral_2= DATA ) | (enumLiteral_3= DEVICE ) | (enumLiteral_4= MEMEORY ) | (enumLiteral_5= PROCESS ) | (enumLiteral_6= PROCESSOR ) | (enumLiteral_7= SUBPROGRAM ) | (enumLiteral_8= SUBPROGRAMGROUP ) | (enumLiteral_9= SYSTEM ) | (enumLiteral_10= THREAD_GROUP ) | (enumLiteral_11= THREAD ) | (enumLiteral_12= VIRTUAL_BUS ) | (enumLiteral_13= VIRTUAL_PROCESSOR ) )
            int alt14=14;
            switch ( input.LA(1) ) {
            case ABSTRACT:
                {
                alt14=1;
                }
                break;
            case BUS:
                {
                alt14=2;
                }
                break;
            case DATA:
                {
                alt14=3;
                }
                break;
            case DEVICE:
                {
                alt14=4;
                }
                break;
            case MEMEORY:
                {
                alt14=5;
                }
                break;
            case PROCESS:
                {
                alt14=6;
                }
                break;
            case PROCESSOR:
                {
                alt14=7;
                }
                break;
            case SUBPROGRAM:
                {
                alt14=8;
                }
                break;
            case SUBPROGRAMGROUP:
                {
                alt14=9;
                }
                break;
            case SYSTEM:
                {
                alt14=10;
                }
                break;
            case THREAD_GROUP:
                {
                alt14=11;
                }
                break;
            case THREAD:
                {
                alt14=12;
                }
                break;
            case VIRTUAL_BUS:
                {
                alt14=13;
                }
                break;
            case VIRTUAL_PROCESSOR:
                {
                alt14=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalExprParser.g:1441:2: (enumLiteral_0= ABSTRACT )
                    {
                    // InternalExprParser.g:1441:2: (enumLiteral_0= ABSTRACT )
                    // InternalExprParser.g:1441:7: enumLiteral_0= ABSTRACT
                    {
                    enumLiteral_0=(Token)match(input,ABSTRACT,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getABSTRACTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCategoryEnumAccess().getABSTRACTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalExprParser.g:1447:6: (enumLiteral_1= BUS )
                    {
                    // InternalExprParser.g:1447:6: (enumLiteral_1= BUS )
                    // InternalExprParser.g:1447:11: enumLiteral_1= BUS
                    {
                    enumLiteral_1=(Token)match(input,BUS,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getBUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCategoryEnumAccess().getBUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalExprParser.g:1453:6: (enumLiteral_2= DATA )
                    {
                    // InternalExprParser.g:1453:6: (enumLiteral_2= DATA )
                    // InternalExprParser.g:1453:11: enumLiteral_2= DATA
                    {
                    enumLiteral_2=(Token)match(input,DATA,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCategoryEnumAccess().getDATAEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalExprParser.g:1459:6: (enumLiteral_3= DEVICE )
                    {
                    // InternalExprParser.g:1459:6: (enumLiteral_3= DEVICE )
                    // InternalExprParser.g:1459:11: enumLiteral_3= DEVICE
                    {
                    enumLiteral_3=(Token)match(input,DEVICE,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getDEVICEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCategoryEnumAccess().getDEVICEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalExprParser.g:1465:6: (enumLiteral_4= MEMEORY )
                    {
                    // InternalExprParser.g:1465:6: (enumLiteral_4= MEMEORY )
                    // InternalExprParser.g:1465:11: enumLiteral_4= MEMEORY
                    {
                    enumLiteral_4=(Token)match(input,MEMEORY,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getMEMEORYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCategoryEnumAccess().getMEMEORYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalExprParser.g:1471:6: (enumLiteral_5= PROCESS )
                    {
                    // InternalExprParser.g:1471:6: (enumLiteral_5= PROCESS )
                    // InternalExprParser.g:1471:11: enumLiteral_5= PROCESS
                    {
                    enumLiteral_5=(Token)match(input,PROCESS,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getPROCESSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCategoryEnumAccess().getPROCESSEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalExprParser.g:1477:6: (enumLiteral_6= PROCESSOR )
                    {
                    // InternalExprParser.g:1477:6: (enumLiteral_6= PROCESSOR )
                    // InternalExprParser.g:1477:11: enumLiteral_6= PROCESSOR
                    {
                    enumLiteral_6=(Token)match(input,PROCESSOR,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getPROCESSOREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getCategoryEnumAccess().getPROCESSOREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalExprParser.g:1483:6: (enumLiteral_7= SUBPROGRAM )
                    {
                    // InternalExprParser.g:1483:6: (enumLiteral_7= SUBPROGRAM )
                    // InternalExprParser.g:1483:11: enumLiteral_7= SUBPROGRAM
                    {
                    enumLiteral_7=(Token)match(input,SUBPROGRAM,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getSUBPROGRAMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getCategoryEnumAccess().getSUBPROGRAMEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalExprParser.g:1489:6: (enumLiteral_8= SUBPROGRAMGROUP )
                    {
                    // InternalExprParser.g:1489:6: (enumLiteral_8= SUBPROGRAMGROUP )
                    // InternalExprParser.g:1489:11: enumLiteral_8= SUBPROGRAMGROUP
                    {
                    enumLiteral_8=(Token)match(input,SUBPROGRAMGROUP,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getSUBPROGRAMGROUPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getCategoryEnumAccess().getSUBPROGRAMGROUPEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalExprParser.g:1495:6: (enumLiteral_9= SYSTEM )
                    {
                    // InternalExprParser.g:1495:6: (enumLiteral_9= SYSTEM )
                    // InternalExprParser.g:1495:11: enumLiteral_9= SYSTEM
                    {
                    enumLiteral_9=(Token)match(input,SYSTEM,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getSYSTEMEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getCategoryEnumAccess().getSYSTEMEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalExprParser.g:1501:6: (enumLiteral_10= THREAD_GROUP )
                    {
                    // InternalExprParser.g:1501:6: (enumLiteral_10= THREAD_GROUP )
                    // InternalExprParser.g:1501:11: enumLiteral_10= THREAD_GROUP
                    {
                    enumLiteral_10=(Token)match(input,THREAD_GROUP,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getTHREAD_GROUPEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getCategoryEnumAccess().getTHREAD_GROUPEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // InternalExprParser.g:1507:6: (enumLiteral_11= THREAD )
                    {
                    // InternalExprParser.g:1507:6: (enumLiteral_11= THREAD )
                    // InternalExprParser.g:1507:11: enumLiteral_11= THREAD
                    {
                    enumLiteral_11=(Token)match(input,THREAD,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getTHREADEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getCategoryEnumAccess().getTHREADEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // InternalExprParser.g:1513:6: (enumLiteral_12= VIRTUAL_BUS )
                    {
                    // InternalExprParser.g:1513:6: (enumLiteral_12= VIRTUAL_BUS )
                    // InternalExprParser.g:1513:11: enumLiteral_12= VIRTUAL_BUS
                    {
                    enumLiteral_12=(Token)match(input,VIRTUAL_BUS,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getVIRTUAL_BUSEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getCategoryEnumAccess().getVIRTUAL_BUSEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // InternalExprParser.g:1519:6: (enumLiteral_13= VIRTUAL_PROCESSOR )
                    {
                    // InternalExprParser.g:1519:6: (enumLiteral_13= VIRTUAL_PROCESSOR )
                    // InternalExprParser.g:1519:11: enumLiteral_13= VIRTUAL_PROCESSOR
                    {
                    enumLiteral_13=(Token)match(input,VIRTUAL_PROCESSOR,FOLLOW_2); 

                            current = grammarAccess.getCategoryEnumAccess().getVIRTUAL_PROCESSOREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getCategoryEnumAccess().getVIRTUAL_PROCESSOREnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryEnum"


    // $ANTLR start "ruleMetaClassEnum"
    // InternalExprParser.g:1529:1: ruleMetaClassEnum returns [Enumerator current=null] : ( (enumLiteral_0= CLASSIFIER ) | (enumLiteral_1= SUBCOMPONENT ) | (enumLiteral_2= FEATURE ) | (enumLiteral_3= CONNECTION ) | (enumLiteral_4= FLOW ) | (enumLiteral_5= MODE ) ) ;
    public final Enumerator ruleMetaClassEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalExprParser.g:1531:28: ( ( (enumLiteral_0= CLASSIFIER ) | (enumLiteral_1= SUBCOMPONENT ) | (enumLiteral_2= FEATURE ) | (enumLiteral_3= CONNECTION ) | (enumLiteral_4= FLOW ) | (enumLiteral_5= MODE ) ) )
            // InternalExprParser.g:1532:1: ( (enumLiteral_0= CLASSIFIER ) | (enumLiteral_1= SUBCOMPONENT ) | (enumLiteral_2= FEATURE ) | (enumLiteral_3= CONNECTION ) | (enumLiteral_4= FLOW ) | (enumLiteral_5= MODE ) )
            {
            // InternalExprParser.g:1532:1: ( (enumLiteral_0= CLASSIFIER ) | (enumLiteral_1= SUBCOMPONENT ) | (enumLiteral_2= FEATURE ) | (enumLiteral_3= CONNECTION ) | (enumLiteral_4= FLOW ) | (enumLiteral_5= MODE ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case CLASSIFIER:
                {
                alt15=1;
                }
                break;
            case SUBCOMPONENT:
                {
                alt15=2;
                }
                break;
            case FEATURE:
                {
                alt15=3;
                }
                break;
            case CONNECTION:
                {
                alt15=4;
                }
                break;
            case FLOW:
                {
                alt15=5;
                }
                break;
            case MODE:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalExprParser.g:1532:2: (enumLiteral_0= CLASSIFIER )
                    {
                    // InternalExprParser.g:1532:2: (enumLiteral_0= CLASSIFIER )
                    // InternalExprParser.g:1532:7: enumLiteral_0= CLASSIFIER
                    {
                    enumLiteral_0=(Token)match(input,CLASSIFIER,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getCLASSIFIEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetaClassEnumAccess().getCLASSIFIEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalExprParser.g:1538:6: (enumLiteral_1= SUBCOMPONENT )
                    {
                    // InternalExprParser.g:1538:6: (enumLiteral_1= SUBCOMPONENT )
                    // InternalExprParser.g:1538:11: enumLiteral_1= SUBCOMPONENT
                    {
                    enumLiteral_1=(Token)match(input,SUBCOMPONENT,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getSUBCOMPONENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetaClassEnumAccess().getSUBCOMPONENTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalExprParser.g:1544:6: (enumLiteral_2= FEATURE )
                    {
                    // InternalExprParser.g:1544:6: (enumLiteral_2= FEATURE )
                    // InternalExprParser.g:1544:11: enumLiteral_2= FEATURE
                    {
                    enumLiteral_2=(Token)match(input,FEATURE,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalExprParser.g:1550:6: (enumLiteral_3= CONNECTION )
                    {
                    // InternalExprParser.g:1550:6: (enumLiteral_3= CONNECTION )
                    // InternalExprParser.g:1550:11: enumLiteral_3= CONNECTION
                    {
                    enumLiteral_3=(Token)match(input,CONNECTION,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalExprParser.g:1556:6: (enumLiteral_4= FLOW )
                    {
                    // InternalExprParser.g:1556:6: (enumLiteral_4= FLOW )
                    // InternalExprParser.g:1556:11: enumLiteral_4= FLOW
                    {
                    enumLiteral_4=(Token)match(input,FLOW,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalExprParser.g:1562:6: (enumLiteral_5= MODE )
                    {
                    // InternalExprParser.g:1562:6: (enumLiteral_5= MODE )
                    // InternalExprParser.g:1562:11: enumLiteral_5= MODE
                    {
                    enumLiteral_5=(Token)match(input,MODE,FOLLOW_2); 

                            current = grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaClassEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000031100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000031100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x400000ECFFFBDFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x4010000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x401000ECFFFBDFF0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000002L});

}