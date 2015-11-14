package org.osate.reqspec.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqSpecLexer extends Lexer {
<<<<<<< HEAD
    public static final int Val=50;
    public static final int LessThanSignGreaterThanSign=57;
    public static final int RULE_HEX=90;
    public static final int EqualsSignGreaterThanSign=59;
    public static final int Riskindex=22;
    public static final int KW_System=32;
    public static final int Decomposes=15;
    public static final int False=34;
    public static final int Document=24;
    public static final int LessThanSign=75;
    public static final int Goal=37;
    public static final int LeftParenthesis=66;
    public static final int Development=9;
    public static final int ExclamationMark=63;
    public static final int ExclamationMarkEqualsSignEqualsSign=42;
    public static final int GreaterThanSign=77;
    public static final int RULE_ID=93;
    public static final int RULE_DIGIT=83;
    public static final int GreaterThanSignEqualsSign=60;
    public static final int ColonColon=56;
    public static final int Requirement=11;
    public static final int EqualsSignEqualsSign=58;
    public static final int See=48;
    public static final int PlusSign=69;
    public static final int RULE_INT=91;
    public static final int RULE_ML_COMMENT=95;
    public static final int LeftSquareBracket=79;
    public static final int Mitigates=19;
    public static final int Description=8;
    public static final int Maturityindex=6;
    public static final int VerticalLineVerticalLine=62;
    public static final int RULE_REAL_LIT=86;
    public static final int Comma=70;
    public static final int HyphenMinus=71;
    public static final int QuestionMarkColon=61;
    public static final int Solidus=73;
    public static final int RightCurlyBracket=82;
    public static final int Familiarity=10;
    public static final int Timecriticality=4;
    public static final int Refines=29;
    public static final int FullStop=72;
    public static final int Use=49;
    public static final int Constants=18;
    public static final int Conflicts=17;
    public static final int Section=30;
    public static final int CommercialAt=78;
    public static final int RULE_EXPONENT=84;
    public static final int Delta=33;
    public static final int RULE_EXTENDED_DIGIT=89;
    public static final int ExclamationMarkEqualsSign=51;
    public static final int HyphenMinusGreaterThanSign=54;
    public static final int All=45;
    public static final int Null=38;
    public static final int True=40;
=======
    public static final int All=44;
    public static final int Val=49;
    public static final int LessThanSignGreaterThanSign=56;
    public static final int Null=37;
    public static final int RULE_HEX=82;
    public static final int EqualsSignGreaterThanSign=58;
    public static final int Riskindex=22;
    public static final int KW_System=32;
    public static final int True=39;
    public static final int Decomposes=15;
    public static final int False=33;
    public static final int Document=24;
>>>>>>> refs/remotes/origin/PeterWork
    public static final int Requirements=7;
<<<<<<< HEAD
    public static final int Predicate=20;
    public static final int RULE_INT_EXPONENT=85;
    public static final int PercentSign=65;
    public static final int Stakeholder=12;
    public static final int FullStopFullStop=55;
    public static final int This=39;
=======
    public static final int LessThanSign=74;
    public static final int Predicate=20;
    public static final int PercentSign=64;
    public static final int Goal=36;
    public static final int Stakeholder=12;
    public static final int LeftParenthesis=65;
    public static final int FullStopFullStop=54;
    public static final int Development=9;
    public static final int This=38;
>>>>>>> refs/remotes/origin/PeterWork
    public static final int Scheduleimpact=5;
<<<<<<< HEAD
    public static final int RULE_BASED_INTEGER=87;
    public static final int RightSquareBracket=80;
    public static final int Dropped=27;
    public static final int Img=47;
    public static final int For=46;
    public static final int RightParenthesis=67;
    public static final int EqualsSignEqualsSignEqualsSign=44;
    public static final int RULE_DECIMAL=92;
    public static final int NumberSign=64;
    public static final int Value=36;
    public static final int AsteriskAsterisk=53;
    public static final int Goals=35;
    public static final int RULE_INTEGER_LIT=88;
    public static final int Uncertainty=13;
    public static final int Category=23;
    public static final int Volatility=16;
    public static final int Issues=31;
    public static final int RULE_STRING=94;
    public static final int Costimpact=14;
    public static final int Evolves=28;
    public static final int With=41;
    public static final int RULE_SL_COMMENT=96;
    public static final int EqualsSign=76;
    public static final int AmpersandAmpersand=52;
    public static final int Rationale=21;
    public static final int Colon=74;
=======
    public static final int RightSquareBracket=79;
    public static final int ExclamationMark=62;
    public static final int Dropped=27;
    public static final int ExclamationMarkEqualsSignEqualsSign=41;
    public static final int GreaterThanSign=76;
    public static final int Img=46;
    public static final int RULE_ID=85;
    public static final int For=45;
    public static final int RightParenthesis=66;
    public static final int EqualsSignEqualsSignEqualsSign=43;
    public static final int GreaterThanSignEqualsSign=59;
    public static final int ColonColon=55;
    public static final int RULE_DECIMAL=84;
    public static final int Requirement=11;
    public static final int EqualsSignEqualsSign=57;
    public static final int See=47;
    public static final int PlusSign=68;
    public static final int RULE_INT=83;
    public static final int NumberSign=63;
    public static final int Value=35;
    public static final int AsteriskAsterisk=52;
    public static final int RULE_ML_COMMENT=87;
    public static final int LeftSquareBracket=78;
    public static final int Goals=34;
    public static final int Mitigates=19;
    public static final int Uncertainty=13;
    public static final int Description=8;
    public static final int Category=23;
    public static final int Volatility=16;
    public static final int Maturityindex=6;
    public static final int Issues=31;
    public static final int VerticalLineVerticalLine=61;
    public static final int RULE_STRING=86;
    public static final int Costimpact=14;
    public static final int Evolves=28;
    public static final int With=40;
    public static final int RULE_SL_COMMENT=88;
    public static final int Comma=69;
    public static final int EqualsSign=75;
    public static final int HyphenMinus=70;
    public static final int AmpersandAmpersand=51;
    public static final int QuestionMarkColon=60;
    public static final int Rationale=21;
    public static final int Solidus=72;
    public static final int Colon=73;
    public static final int RightCurlyBracket=81;
    public static final int Familiarity=10;
>>>>>>> refs/remotes/origin/PeterWork
    public static final int EOF=-1;
<<<<<<< HEAD
    public static final int Asterisk=68;
    public static final int RULE_WS=97;
    public static final int LeftCurlyBracket=81;
    public static final int RULE_ANY_OTHER=98;
    public static final int FullStopFullStopLessThanSign=43;
    public static final int Informal=25;
    public static final int Compute=26;
=======
    public static final int Asterisk=67;
    public static final int Timecriticality=4;
    public static final int Refines=29;
    public static final int FullStop=71;
    public static final int RULE_WS=89;
    public static final int Use=48;
    public static final int LeftCurlyBracket=80;
    public static final int Constants=18;
    public static final int Conflicts=17;
    public static final int RULE_ANY_OTHER=90;
    public static final int Section=30;
    public static final int CommercialAt=77;
    public static final int FullStopFullStopLessThanSign=42;
    public static final int Informal=25;
    public static final int Compute=26;
    public static final int ExclamationMarkEqualsSign=50;
    public static final int HyphenMinusGreaterThanSign=53;
>>>>>>> refs/remotes/origin/PeterWork

    // delegates
    // delegators

    public InternalReqSpecLexer() {;} 
    public InternalReqSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReqSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g"; }

    // $ANTLR start "Timecriticality"
    public final void mTimecriticality() throws RecognitionException {
        try {
            int _type = Timecriticality;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:19:17: ( 'timecriticality' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:19:19: 'timecriticality'
            {
            match("timecriticality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timecriticality"

    // $ANTLR start "Scheduleimpact"
    public final void mScheduleimpact() throws RecognitionException {
        try {
            int _type = Scheduleimpact;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:21:16: ( 'scheduleimpact' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:21:18: 'scheduleimpact'
            {
            match("scheduleimpact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scheduleimpact"

    // $ANTLR start "Maturityindex"
    public final void mMaturityindex() throws RecognitionException {
        try {
            int _type = Maturityindex;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:23:15: ( 'maturityindex' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:23:17: 'maturityindex'
            {
            match("maturityindex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Maturityindex"

    // $ANTLR start "Requirements"
    public final void mRequirements() throws RecognitionException {
        try {
            int _type = Requirements;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:25:14: ( 'requirements' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:25:16: 'requirements'
            {
            match("requirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Requirements"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:27:13: ( 'description' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:27:15: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "Development"
    public final void mDevelopment() throws RecognitionException {
        try {
            int _type = Development;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:29:13: ( 'development' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:29:15: 'development'
            {
            match("development"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Development"

    // $ANTLR start "Familiarity"
    public final void mFamiliarity() throws RecognitionException {
        try {
            int _type = Familiarity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:31:13: ( 'familiarity' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:31:15: 'familiarity'
            {
            match("familiarity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Familiarity"

    // $ANTLR start "Requirement"
    public final void mRequirement() throws RecognitionException {
        try {
            int _type = Requirement;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:33:13: ( 'requirement' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:33:15: 'requirement'
            {
            match("requirement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Requirement"

    // $ANTLR start "Stakeholder"
    public final void mStakeholder() throws RecognitionException {
        try {
            int _type = Stakeholder;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:35:13: ( 'stakeholder' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:35:15: 'stakeholder'
            {
            match("stakeholder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stakeholder"

    // $ANTLR start "Uncertainty"
    public final void mUncertainty() throws RecognitionException {
        try {
            int _type = Uncertainty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:37:13: ( 'uncertainty' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:37:15: 'uncertainty'
            {
            match("uncertainty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uncertainty"

    // $ANTLR start "Costimpact"
    public final void mCostimpact() throws RecognitionException {
        try {
            int _type = Costimpact;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:39:12: ( 'costimpact' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:39:14: 'costimpact'
            {
            match("costimpact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Costimpact"

    // $ANTLR start "Decomposes"
    public final void mDecomposes() throws RecognitionException {
        try {
            int _type = Decomposes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:41:12: ( 'decomposes' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:41:14: 'decomposes'
            {
            match("decomposes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Decomposes"

    // $ANTLR start "Volatility"
    public final void mVolatility() throws RecognitionException {
        try {
            int _type = Volatility;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:43:12: ( 'volatility' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:43:14: 'volatility'
            {
            match("volatility"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Volatility"

    // $ANTLR start "Conflicts"
    public final void mConflicts() throws RecognitionException {
        try {
            int _type = Conflicts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:45:11: ( 'conflicts' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:45:13: 'conflicts'
            {
            match("conflicts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Conflicts"

    // $ANTLR start "Constants"
    public final void mConstants() throws RecognitionException {
        try {
            int _type = Constants;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:47:11: ( 'constants' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:47:13: 'constants'
            {
            match("constants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constants"

    // $ANTLR start "Mitigates"
    public final void mMitigates() throws RecognitionException {
        try {
            int _type = Mitigates;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:49:11: ( 'mitigates' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:49:13: 'mitigates'
            {
            match("mitigates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mitigates"

    // $ANTLR start "Predicate"
    public final void mPredicate() throws RecognitionException {
        try {
            int _type = Predicate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:51:11: ( 'predicate' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:51:13: 'predicate'
            {
            match("predicate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Predicate"

    // $ANTLR start "Rationale"
    public final void mRationale() throws RecognitionException {
        try {
            int _type = Rationale;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:53:11: ( 'rationale' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:53:13: 'rationale'
            {
            match("rationale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rationale"

    // $ANTLR start "Riskindex"
    public final void mRiskindex() throws RecognitionException {
        try {
            int _type = Riskindex;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:55:11: ( 'riskindex' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:55:13: 'riskindex'
            {
            match("riskindex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Riskindex"

    // $ANTLR start "Category"
    public final void mCategory() throws RecognitionException {
        try {
            int _type = Category;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:57:10: ( 'category' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:57:12: 'category'
            {
            match("category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Category"

    // $ANTLR start "Document"
    public final void mDocument() throws RecognitionException {
        try {
            int _type = Document;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:59:10: ( 'document' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:59:12: 'document'
            {
            match("document"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Document"

    // $ANTLR start "Informal"
    public final void mInformal() throws RecognitionException {
        try {
            int _type = Informal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:61:10: ( 'informal' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:61:12: 'informal'
            {
            match("informal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Informal"

    // $ANTLR start "Compute"
    public final void mCompute() throws RecognitionException {
        try {
            int _type = Compute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:63:9: ( 'compute' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:63:11: 'compute'
            {
            match("compute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compute"

    // $ANTLR start "Dropped"
    public final void mDropped() throws RecognitionException {
        try {
            int _type = Dropped;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:65:9: ( 'dropped' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:65:11: 'dropped'
            {
            match("dropped"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dropped"

    // $ANTLR start "Evolves"
    public final void mEvolves() throws RecognitionException {
        try {
            int _type = Evolves;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:67:9: ( 'evolves' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:67:11: 'evolves'
            {
            match("evolves"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Evolves"

    // $ANTLR start "Refines"
    public final void mRefines() throws RecognitionException {
        try {
            int _type = Refines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:69:9: ( 'refines' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:69:11: 'refines'
            {
            match("refines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Refines"

    // $ANTLR start "Section"
    public final void mSection() throws RecognitionException {
        try {
            int _type = Section;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:71:9: ( 'section' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:71:11: 'section'
            {
            match("section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Section"

    // $ANTLR start "Issues"
    public final void mIssues() throws RecognitionException {
        try {
            int _type = Issues;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:73:8: ( 'issues' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:73:10: 'issues'
            {
            match("issues"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Issues"

    // $ANTLR start "KW_System"
    public final void mKW_System() throws RecognitionException {
        try {
            int _type = KW_System;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:75:11: ( 'system' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:75:13: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_System"

<<<<<<< HEAD
    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:77:7: ( 'delta' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:77:9: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Delta"

=======
>>>>>>> refs/remotes/origin/PeterWork
    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:79:7: ( 'false' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:79:9: 'false'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:77:7: ( 'false' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:77:9: 'false'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Goals"
    public final void mGoals() throws RecognitionException {
        try {
            int _type = Goals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:81:7: ( 'goals' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:81:9: 'goals'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:79:7: ( 'goals' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:79:9: 'goals'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("goals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goals"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:83:7: ( 'value' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:83:9: 'value'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:81:7: ( 'value' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:81:9: 'value'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:85:6: ( 'goal' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:85:8: 'goal'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:83:6: ( 'goal' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:83:8: 'goal'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("goal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:87:6: ( 'null' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:87:8: 'null'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:85:6: ( 'null' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:85:8: 'null'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:89:6: ( 'this' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:89:8: 'this'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:87:6: ( 'this' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:87:8: 'this'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "This"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:91:6: ( 'true' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:91:8: 'true'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:89:6: ( 'true' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:89:8: 'true'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:93:6: ( 'with' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:93:8: 'with'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:91:6: ( 'with' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:91:8: 'with'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "ExclamationMarkEqualsSignEqualsSign"
    public final void mExclamationMarkEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:95:37: ( '!==' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:95:39: '!=='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:93:37: ( '!==' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:93:39: '!=='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSignEqualsSign"

    // $ANTLR start "FullStopFullStopLessThanSign"
    public final void mFullStopFullStopLessThanSign() throws RecognitionException {
        try {
            int _type = FullStopFullStopLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:97:30: ( '..<' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:97:32: '..<'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:95:30: ( '..<' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:95:32: '..<'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStopLessThanSign"

    // $ANTLR start "EqualsSignEqualsSignEqualsSign"
    public final void mEqualsSignEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:99:32: ( '===' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:99:34: '==='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:97:32: ( '===' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:97:34: '==='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSignEqualsSign"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:101:5: ( 'all' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:101:7: 'all'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:99:5: ( 'all' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:99:7: 'all'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:103:5: ( 'for' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:103:7: 'for'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:101:5: ( 'for' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:101:7: 'for'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Img"
    public final void mImg() throws RecognitionException {
        try {
            int _type = Img;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:105:5: ( 'img' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:105:7: 'img'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:103:5: ( 'img' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:103:7: 'img'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Img"

    // $ANTLR start "See"
    public final void mSee() throws RecognitionException {
        try {
            int _type = See;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:107:5: ( 'see' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:107:7: 'see'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:105:5: ( 'see' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:105:7: 'see'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("see"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "See"

    // $ANTLR start "Use"
    public final void mUse() throws RecognitionException {
        try {
            int _type = Use;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:109:5: ( 'use' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:109:7: 'use'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:107:5: ( 'use' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:107:7: 'use'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Use"

    // $ANTLR start "Val"
    public final void mVal() throws RecognitionException {
        try {
            int _type = Val;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:111:5: ( 'val' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:111:7: 'val'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:109:5: ( 'val' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:109:7: 'val'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Val"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:113:27: ( '!=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:113:29: '!='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:111:27: ( '!=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:111:29: '!='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:115:20: ( '&&' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:115:22: '&&'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:113:20: ( '&&' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:113:22: '&&'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:117:18: ( '**' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:117:20: '**'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:115:18: ( '**' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:115:20: '**'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:119:28: ( '->' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:119:30: '->'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:117:28: ( '->' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:117:30: '->'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:121:18: ( '..' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:121:20: '..'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:119:18: ( '..' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:119:20: '..'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:123:12: ( '::' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:123:14: '::'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:121:12: ( '::' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:121:14: '::'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:125:29: ( '<>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:125:31: '<>'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:123:29: ( '<>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:123:31: '<>'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:127:22: ( '==' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:127:24: '=='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:125:22: ( '==' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:125:24: '=='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:129:27: ( '=>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:129:29: '=>'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:127:27: ( '=>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:127:29: '=>'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:131:27: ( '>=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:131:29: '>='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:129:27: ( '>=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:129:29: '>='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "QuestionMarkColon"
    public final void mQuestionMarkColon() throws RecognitionException {
        try {
            int _type = QuestionMarkColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:133:19: ( '?:' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:133:21: '?:'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:131:19: ( '?:' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:131:21: '?:'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkColon"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:135:26: ( '||' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:135:28: '||'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:133:26: ( '||' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:133:28: '||'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:137:17: ( '!' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:137:19: '!'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:135:17: ( '!' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:135:19: '!'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:139:12: ( '#' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:139:14: '#'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:137:12: ( '#' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:137:14: '#'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:141:13: ( '%' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:141:15: '%'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:139:13: ( '%' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:139:15: '%'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:143:17: ( '(' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:143:19: '('
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:141:17: ( '(' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:141:19: '('
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:145:18: ( ')' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:145:20: ')'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:143:18: ( ')' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:143:20: ')'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:147:10: ( '*' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:147:12: '*'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:145:10: ( '*' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:145:12: '*'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:149:10: ( '+' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:149:12: '+'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:147:10: ( '+' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:147:12: '+'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:151:7: ( ',' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:151:9: ','
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:149:7: ( ',' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:149:9: ','
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:153:13: ( '-' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:153:15: '-'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:151:13: ( '-' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:151:15: '-'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:155:10: ( '.' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:155:12: '.'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:153:10: ( '.' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:153:12: '.'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:157:9: ( '/' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:157:11: '/'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:155:9: ( '/' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:155:11: '/'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:159:7: ( ':' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:159:9: ':'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:157:7: ( ':' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:157:9: ':'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:161:14: ( '<' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:161:16: '<'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:159:14: ( '<' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:159:16: '<'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:163:12: ( '=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:163:14: '='
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:161:12: ( '=' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:161:14: '='
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:165:17: ( '>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:165:19: '>'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:163:17: ( '>' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:163:19: '>'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:167:14: ( '@' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:167:16: '@'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:165:14: ( '@' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:165:16: '@'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:169:19: ( '[' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:169:21: '['
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:167:19: ( '[' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:167:21: '['
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:171:20: ( ']' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:171:22: ']'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:169:20: ( ']' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:169:22: ']'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:173:18: ( '{' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:173:20: '{'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:171:18: ( '{' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:171:20: '{'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:175:19: ( '}' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:175:21: '}'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:173:19: ( '}' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:173:21: '}'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:36: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:47: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:40: ( '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:45: ( RULE_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:17: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:29: ( '_' ( RULE_DIGIT )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:34: ( RULE_DIGIT )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:52: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:64: ( '_' ( RULE_DIGIT )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:69: ( RULE_DIGIT )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:83: ( RULE_EXPONENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_INTEGER_LIT"
    public final void mRULE_INTEGER_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:20: ( RULE_DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:32: ( '_' ( RULE_DIGIT )+ )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='_') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:37: ( RULE_DIGIT )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='#') ) {
                alt17=1;
            }
            else {
                alt17=2;}
            switch (alt17) {
                case 1 :
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:79: ( RULE_INT_EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:98: ( RULE_INT_EXPONENT )?
                    {
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:98: ( RULE_INT_EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:98: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:21: ( '0' .. '9' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='f')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:52: ( '_' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0=='_') ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
>>>>>>> refs/remotes/origin/PeterWork
            {
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:12: ( '0x' | '0X' )
            int alt20=2;
            int LA20_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

            if ( (LA20_0=='0') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='x') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='X') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:13: '0x'
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:13: '0x'
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:18: '0X'
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:18: '0X'
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match("0X"); 


                    }
                    break;

            }

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt21=0;
            loop21:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
>>>>>>> refs/remotes/origin/PeterWork
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='F')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='f')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

            if ( (LA23_0=='#') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match('#'); 
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

                    if ( (LA22_0=='B'||LA22_0=='b') ) {
                        alt22=1;
                    }
                    else if ( (LA22_0=='L'||LA22_0=='l') ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
<<<<<<< HEAD
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:64: ( 'b' | 'B' ) ( 'i' | 'I' )
=======
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:64: ( 'b' | 'B' ) ( 'i' | 'I' )
>>>>>>> refs/remotes/origin/PeterWork
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
<<<<<<< HEAD
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:84: ( 'l' | 'L' )
=======
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:177:84: ( 'l' | 'L' )
>>>>>>> refs/remotes/origin/PeterWork
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:195:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:195:12: '0' .. '9' ( '0' .. '9' | '_' )*
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:12: '0' .. '9' ( '0' .. '9' | '_' )*
>>>>>>> refs/remotes/origin/PeterWork
            {
            matchRange('0','9'); 
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:195:21: ( '0' .. '9' | '_' )*
            loop24:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:179:21: ( '0' .. '9' | '_' )*
            loop5:
>>>>>>> refs/remotes/origin/PeterWork
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||LA24_0=='_') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
>>>>>>> refs/remotes/origin/PeterWork
            {
            mRULE_INT(); 
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

            if ( (LA26_0=='E'||LA26_0=='e') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:36: ( '+' | '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

                    if ( (LA25_0=='+'||LA25_0=='-') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

            if ( (LA27_0=='B'||LA27_0=='b') ) {
                alt27=1;
            }
            else if ( (LA27_0=='D'||LA27_0=='F'||LA27_0=='L'||LA27_0=='d'||LA27_0=='f'||LA27_0=='l') ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:197:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:181:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:199:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:199:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
>>>>>>> refs/remotes/origin/PeterWork
            {
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:199:11: ( '^' )?
            int alt28=2;
            int LA28_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

            if ( (LA28_0=='^') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:199:11: '^'
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:11: '^'
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:199:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop29:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:183:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
>>>>>>> refs/remotes/origin/PeterWork
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

<<<<<<< HEAD
                if ( ((LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')) ) {
                    alt29=1;
=======
                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
>>>>>>> refs/remotes/origin/PeterWork
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
>>>>>>> refs/remotes/origin/PeterWork
            {
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt32=2;
            int LA32_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
            if ( (LA32_0=='\"') ) {
                alt32=1;
=======
            if ( (LA13_0=='\"') ) {
                alt13=1;
>>>>>>> refs/remotes/origin/PeterWork
            }
<<<<<<< HEAD
            else if ( (LA32_0=='\'') ) {
                alt32=2;
=======
            else if ( (LA13_0=='\'') ) {
                alt13=2;
>>>>>>> refs/remotes/origin/PeterWork
            }
            else {
                NoViableAltException nvae =
<<<<<<< HEAD
                    new NoViableAltException("", 32, 0, input);
=======
                    new NoViableAltException("", 13, 0, input);
>>>>>>> refs/remotes/origin/PeterWork

                throw nvae;
            }
<<<<<<< HEAD
            switch (alt32) {
=======
            switch (alt13) {
>>>>>>> refs/remotes/origin/PeterWork
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match('\"'); 
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop30:
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
>>>>>>> refs/remotes/origin/PeterWork
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\\') ) {
                            alt30=1;
                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
<<<<<<< HEAD
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:21: '\\\\' .
=======
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:21: '\\\\' .
>>>>>>> refs/remotes/origin/PeterWork
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
<<<<<<< HEAD
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:28: ~ ( ( '\\\\' | '\"' ) )
=======
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:28: ~ ( ( '\\\\' | '\"' ) )
>>>>>>> refs/remotes/origin/PeterWork
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
>>>>>>> refs/remotes/origin/PeterWork
                    {
                    match('\''); 
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop31:
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
>>>>>>> refs/remotes/origin/PeterWork
                    do {
<<<<<<< HEAD
                        int alt31=3;
                        int LA31_0 = input.LA(1);
=======
                        int alt12=3;
                        int LA12_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        if ( (LA31_0=='\\') ) {
                            alt31=1;
=======
                        if ( (LA12_0=='\\') ) {
                            alt12=1;
>>>>>>> refs/remotes/origin/PeterWork
                        }
<<<<<<< HEAD
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
=======
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
>>>>>>> refs/remotes/origin/PeterWork
                        }


<<<<<<< HEAD
                        switch (alt31) {
=======
                        switch (alt12) {
>>>>>>> refs/remotes/origin/PeterWork
                    	case 1 :
<<<<<<< HEAD
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:54: '\\\\' .
=======
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:54: '\\\\' .
>>>>>>> refs/remotes/origin/PeterWork
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
<<<<<<< HEAD
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:201:61: ~ ( ( '\\\\' | '\\'' ) )
=======
                    	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:185:61: ~ ( ( '\\\\' | '\\'' ) )
>>>>>>> refs/remotes/origin/PeterWork
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
<<<<<<< HEAD
                    	    break loop31;
=======
                    	    break loop12;
>>>>>>> refs/remotes/origin/PeterWork
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:203:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:203:19: '/*' ( options {greedy=false; } : . )* '*/'
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:19: '/*' ( options {greedy=false; } : . )* '*/'
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("/*"); 

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:203:24: ( options {greedy=false; } : . )*
            loop33:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:24: ( options {greedy=false; } : . )*
            loop14:
>>>>>>> refs/remotes/origin/PeterWork
            do {
<<<<<<< HEAD
                int alt33=2;
                int LA33_0 = input.LA(1);
=======
                int alt14=2;
                int LA14_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);
=======
                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                    if ( (LA33_1=='/') ) {
                        alt33=2;
=======
                    if ( (LA14_1=='/') ) {
                        alt14=2;
>>>>>>> refs/remotes/origin/PeterWork
                    }
<<<<<<< HEAD
                    else if ( ((LA33_1>='\u0000' && LA33_1<='.')||(LA33_1>='0' && LA33_1<='\uFFFF')) ) {
                        alt33=1;
=======
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
>>>>>>> refs/remotes/origin/PeterWork
                    }


                }
<<<<<<< HEAD
                else if ( ((LA33_0>='\u0000' && LA33_0<=')')||(LA33_0>='+' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
=======
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
>>>>>>> refs/remotes/origin/PeterWork
                }


<<<<<<< HEAD
                switch (alt33) {
=======
                switch (alt14) {
>>>>>>> refs/remotes/origin/PeterWork
            	case 1 :
<<<<<<< HEAD
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:203:52: .
=======
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:187:52: .
>>>>>>> refs/remotes/origin/PeterWork
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
<<<<<<< HEAD
            	    break loop33;
=======
            	    break loop14;
>>>>>>> refs/remotes/origin/PeterWork
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
>>>>>>> refs/remotes/origin/PeterWork
            {
            match("//"); 

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
>>>>>>> refs/remotes/origin/PeterWork
            do {
<<<<<<< HEAD
                int alt34=2;
                int LA34_0 = input.LA(1);
=======
                int alt15=2;
                int LA15_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
=======
                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
>>>>>>> refs/remotes/origin/PeterWork
                }


<<<<<<< HEAD
                switch (alt34) {
=======
                switch (alt15) {
>>>>>>> refs/remotes/origin/PeterWork
            	case 1 :
<<<<<<< HEAD
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:24: ~ ( ( '\\n' | '\\r' ) )
=======
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:24: ~ ( ( '\\n' | '\\r' ) )
>>>>>>> refs/remotes/origin/PeterWork
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
<<<<<<< HEAD
            	    break loop34;
=======
            	    break loop15;
>>>>>>> refs/remotes/origin/PeterWork
                }
            } while (true);

<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:40: ( ( '\\r' )? '\\n' )?
            int alt36=2;
            int LA36_0 = input.LA(1);
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
=======
            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
>>>>>>> refs/remotes/origin/PeterWork
            }
<<<<<<< HEAD
            switch (alt36) {
=======
            switch (alt17) {
>>>>>>> refs/remotes/origin/PeterWork
                case 1 :
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:41: ( '\\r' )? '\\n'
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:41: ( '\\r' )? '\\n'
>>>>>>> refs/remotes/origin/PeterWork
                    {
<<<<<<< HEAD
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:41: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);
=======
                    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                    if ( (LA35_0=='\r') ) {
                        alt35=1;
=======
                    if ( (LA16_0=='\r') ) {
                        alt16=1;
>>>>>>> refs/remotes/origin/PeterWork
                    }
<<<<<<< HEAD
                    switch (alt35) {
=======
                    switch (alt16) {
>>>>>>> refs/remotes/origin/PeterWork
                        case 1 :
<<<<<<< HEAD
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:205:41: '\\r'
=======
                            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:189:41: '\\r'
>>>>>>> refs/remotes/origin/PeterWork
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:207:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:207:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
>>>>>>> refs/remotes/origin/PeterWork
            {
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:207:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt37=0;
            loop37:
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
>>>>>>> refs/remotes/origin/PeterWork
            do {
<<<<<<< HEAD
                int alt37=2;
                int LA37_0 = input.LA(1);
=======
                int alt18=2;
                int LA18_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                    alt37=1;
=======
                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
>>>>>>> refs/remotes/origin/PeterWork
                }


<<<<<<< HEAD
                switch (alt37) {
=======
                switch (alt18) {
>>>>>>> refs/remotes/origin/PeterWork
            	case 1 :
            	    // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
<<<<<<< HEAD
            	    if ( cnt37 >= 1 ) break loop37;
=======
            	    if ( cnt18 >= 1 ) break loop18;
>>>>>>> refs/remotes/origin/PeterWork
                        EarlyExitException eee =
<<<<<<< HEAD
                            new EarlyExitException(37, input);
=======
                            new EarlyExitException(18, input);
>>>>>>> refs/remotes/origin/PeterWork
                        throw eee;
                }
<<<<<<< HEAD
                cnt37++;
=======
                cnt18++;
>>>>>>> refs/remotes/origin/PeterWork
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:209:16: ( . )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:209:18: .
=======
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:16: ( . )
            // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:193:18: .
>>>>>>> refs/remotes/origin/PeterWork
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
<<<<<<< HEAD
        // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:8: ( Timecriticality | Scheduleimpact | Maturityindex | Requirements | Description | Development | Familiarity | Requirement | Stakeholder | Uncertainty | Costimpact | Decomposes | Volatility | Conflicts | Constants | Mitigates | Predicate | Rationale | Riskindex | Category | Document | Informal | Compute | Dropped | Evolves | Refines | Section | Issues | KW_System | Delta | False | Goals | Value | Goal | Null | This | True | With | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | All | For | Img | See | Use | Val | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkColon | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt38=90;
        alt38 = dfa38.predict(input);
        switch (alt38) {
=======
        // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:8: ( Timecriticality | Scheduleimpact | Maturityindex | Requirements | Description | Development | Familiarity | Requirement | Stakeholder | Uncertainty | Costimpact | Decomposes | Volatility | Conflicts | Constants | Mitigates | Predicate | Rationale | Riskindex | Category | Document | Informal | Compute | Dropped | Evolves | Refines | Section | Issues | KW_System | False | Goals | Value | Goal | Null | This | True | With | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | All | For | Img | See | Use | Val | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkColon | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=87;
        alt19 = dfa19.predict(input);
        switch (alt19) {
>>>>>>> refs/remotes/origin/PeterWork
            case 1 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:10: Timecriticality
                {
                mTimecriticality(); 

                }
                break;
            case 2 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:26: Scheduleimpact
                {
                mScheduleimpact(); 

                }
                break;
            case 3 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:41: Maturityindex
                {
                mMaturityindex(); 

                }
                break;
            case 4 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:55: Requirements
                {
                mRequirements(); 

                }
                break;
            case 5 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:68: Description
                {
                mDescription(); 

                }
                break;
            case 6 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:80: Development
                {
                mDevelopment(); 

                }
                break;
            case 7 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:92: Familiarity
                {
                mFamiliarity(); 

                }
                break;
            case 8 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:104: Requirement
                {
                mRequirement(); 

                }
                break;
            case 9 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:116: Stakeholder
                {
                mStakeholder(); 

                }
                break;
            case 10 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:128: Uncertainty
                {
                mUncertainty(); 

                }
                break;
            case 11 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:140: Costimpact
                {
                mCostimpact(); 

                }
                break;
            case 12 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:151: Decomposes
                {
                mDecomposes(); 

                }
                break;
            case 13 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:162: Volatility
                {
                mVolatility(); 

                }
                break;
            case 14 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:173: Conflicts
                {
                mConflicts(); 

                }
                break;
            case 15 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:183: Constants
                {
                mConstants(); 

                }
                break;
            case 16 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:193: Mitigates
                {
                mMitigates(); 

                }
                break;
            case 17 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:203: Predicate
                {
                mPredicate(); 

                }
                break;
            case 18 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:213: Rationale
                {
                mRationale(); 

                }
                break;
            case 19 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:223: Riskindex
                {
                mRiskindex(); 

                }
                break;
            case 20 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:233: Category
                {
                mCategory(); 

                }
                break;
            case 21 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:242: Document
                {
                mDocument(); 

                }
                break;
            case 22 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:251: Informal
                {
                mInformal(); 

                }
                break;
            case 23 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:260: Compute
                {
                mCompute(); 

                }
                break;
            case 24 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:268: Dropped
                {
                mDropped(); 

                }
                break;
            case 25 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:276: Evolves
                {
                mEvolves(); 

                }
                break;
            case 26 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:284: Refines
                {
                mRefines(); 

                }
                break;
            case 27 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:292: Section
                {
                mSection(); 

                }
                break;
            case 28 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:300: Issues
                {
                mIssues(); 

                }
                break;
            case 29 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:307: KW_System
                {
                mKW_System(); 

                }
                break;
            case 30 :
<<<<<<< HEAD
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:317: Delta
                {
                mDelta(); 

                }
                break;
            case 31 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:323: False
=======
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:317: False
>>>>>>> refs/remotes/origin/PeterWork
                {
                mFalse(); 

                }
                break;
<<<<<<< HEAD
            case 32 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:329: Goals
=======
            case 31 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:323: Goals
>>>>>>> refs/remotes/origin/PeterWork
                {
                mGoals(); 

                }
                break;
<<<<<<< HEAD
            case 33 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:335: Value
=======
            case 32 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:329: Value
>>>>>>> refs/remotes/origin/PeterWork
                {
                mValue(); 

                }
                break;
<<<<<<< HEAD
            case 34 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:341: Goal
=======
            case 33 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:335: Goal
>>>>>>> refs/remotes/origin/PeterWork
                {
                mGoal(); 

                }
                break;
<<<<<<< HEAD
            case 35 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:346: Null
=======
            case 34 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:340: Null
>>>>>>> refs/remotes/origin/PeterWork
                {
                mNull(); 

                }
                break;
<<<<<<< HEAD
            case 36 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:351: This
=======
            case 35 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:345: This
>>>>>>> refs/remotes/origin/PeterWork
                {
                mThis(); 

                }
                break;
<<<<<<< HEAD
            case 37 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:356: True
=======
            case 36 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:350: True
>>>>>>> refs/remotes/origin/PeterWork
                {
                mTrue(); 

                }
                break;
<<<<<<< HEAD
            case 38 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:361: With
=======
            case 37 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:355: With
>>>>>>> refs/remotes/origin/PeterWork
                {
                mWith(); 

                }
                break;
<<<<<<< HEAD
            case 39 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:366: ExclamationMarkEqualsSignEqualsSign
=======
            case 38 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:360: ExclamationMarkEqualsSignEqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mExclamationMarkEqualsSignEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 40 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:402: FullStopFullStopLessThanSign
=======
            case 39 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:396: FullStopFullStopLessThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mFullStopFullStopLessThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 41 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:431: EqualsSignEqualsSignEqualsSign
=======
            case 40 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:425: EqualsSignEqualsSignEqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mEqualsSignEqualsSignEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 42 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:462: All
=======
            case 41 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:456: All
>>>>>>> refs/remotes/origin/PeterWork
                {
                mAll(); 

                }
                break;
<<<<<<< HEAD
            case 43 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:466: For
=======
            case 42 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:460: For
>>>>>>> refs/remotes/origin/PeterWork
                {
                mFor(); 

                }
                break;
<<<<<<< HEAD
            case 44 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:470: Img
=======
            case 43 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:464: Img
>>>>>>> refs/remotes/origin/PeterWork
                {
                mImg(); 

                }
                break;
<<<<<<< HEAD
            case 45 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:474: See
=======
            case 44 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:468: See
>>>>>>> refs/remotes/origin/PeterWork
                {
                mSee(); 

                }
                break;
<<<<<<< HEAD
            case 46 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:478: Use
=======
            case 45 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:472: Use
>>>>>>> refs/remotes/origin/PeterWork
                {
                mUse(); 

                }
                break;
<<<<<<< HEAD
            case 47 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:482: Val
=======
            case 46 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:476: Val
>>>>>>> refs/remotes/origin/PeterWork
                {
                mVal(); 

                }
                break;
<<<<<<< HEAD
            case 48 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:486: ExclamationMarkEqualsSign
=======
            case 47 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:480: ExclamationMarkEqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 49 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:512: AmpersandAmpersand
=======
            case 48 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:506: AmpersandAmpersand
>>>>>>> refs/remotes/origin/PeterWork
                {
                mAmpersandAmpersand(); 

                }
                break;
<<<<<<< HEAD
            case 50 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:531: AsteriskAsterisk
=======
            case 49 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:525: AsteriskAsterisk
>>>>>>> refs/remotes/origin/PeterWork
                {
                mAsteriskAsterisk(); 

                }
                break;
<<<<<<< HEAD
            case 51 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:548: HyphenMinusGreaterThanSign
=======
            case 50 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:542: HyphenMinusGreaterThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 52 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:575: FullStopFullStop
=======
            case 51 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:569: FullStopFullStop
>>>>>>> refs/remotes/origin/PeterWork
                {
                mFullStopFullStop(); 

                }
                break;
<<<<<<< HEAD
            case 53 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:592: ColonColon
=======
            case 52 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:586: ColonColon
>>>>>>> refs/remotes/origin/PeterWork
                {
                mColonColon(); 

                }
                break;
<<<<<<< HEAD
            case 54 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:603: LessThanSignGreaterThanSign
=======
            case 53 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:597: LessThanSignGreaterThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 55 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:631: EqualsSignEqualsSign
=======
            case 54 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:625: EqualsSignEqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mEqualsSignEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 56 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:652: EqualsSignGreaterThanSign
=======
            case 55 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:646: EqualsSignGreaterThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 57 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:678: GreaterThanSignEqualsSign
=======
            case 56 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:672: GreaterThanSignEqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 58 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:704: QuestionMarkColon
=======
            case 57 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:698: QuestionMarkColon
>>>>>>> refs/remotes/origin/PeterWork
                {
                mQuestionMarkColon(); 

                }
                break;
<<<<<<< HEAD
            case 59 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:722: VerticalLineVerticalLine
=======
            case 58 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:716: VerticalLineVerticalLine
>>>>>>> refs/remotes/origin/PeterWork
                {
                mVerticalLineVerticalLine(); 

                }
                break;
<<<<<<< HEAD
            case 60 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:747: ExclamationMark
=======
            case 59 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:741: ExclamationMark
>>>>>>> refs/remotes/origin/PeterWork
                {
                mExclamationMark(); 

                }
                break;
<<<<<<< HEAD
            case 61 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:763: NumberSign
=======
            case 60 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:757: NumberSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mNumberSign(); 

                }
                break;
<<<<<<< HEAD
            case 62 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:774: PercentSign
=======
            case 61 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:768: PercentSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mPercentSign(); 

                }
                break;
<<<<<<< HEAD
            case 63 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:786: LeftParenthesis
=======
            case 62 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:780: LeftParenthesis
>>>>>>> refs/remotes/origin/PeterWork
                {
                mLeftParenthesis(); 

                }
                break;
<<<<<<< HEAD
            case 64 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:802: RightParenthesis
=======
            case 63 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:796: RightParenthesis
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRightParenthesis(); 

                }
                break;
<<<<<<< HEAD
            case 65 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:819: Asterisk
=======
            case 64 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:813: Asterisk
>>>>>>> refs/remotes/origin/PeterWork
                {
                mAsterisk(); 

                }
                break;
<<<<<<< HEAD
            case 66 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:828: PlusSign
=======
            case 65 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:822: PlusSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mPlusSign(); 

                }
                break;
<<<<<<< HEAD
            case 67 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:837: Comma
=======
            case 66 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:831: Comma
>>>>>>> refs/remotes/origin/PeterWork
                {
                mComma(); 

                }
                break;
<<<<<<< HEAD
            case 68 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:843: HyphenMinus
=======
            case 67 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:837: HyphenMinus
>>>>>>> refs/remotes/origin/PeterWork
                {
                mHyphenMinus(); 

                }
                break;
<<<<<<< HEAD
            case 69 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:855: FullStop
=======
            case 68 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:849: FullStop
>>>>>>> refs/remotes/origin/PeterWork
                {
                mFullStop(); 

                }
                break;
<<<<<<< HEAD
            case 70 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:864: Solidus
=======
            case 69 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:858: Solidus
>>>>>>> refs/remotes/origin/PeterWork
                {
                mSolidus(); 

                }
                break;
<<<<<<< HEAD
            case 71 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:872: Colon
=======
            case 70 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:866: Colon
>>>>>>> refs/remotes/origin/PeterWork
                {
                mColon(); 

                }
                break;
<<<<<<< HEAD
            case 72 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:878: LessThanSign
=======
            case 71 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:872: LessThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mLessThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 73 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:891: EqualsSign
=======
            case 72 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:885: EqualsSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mEqualsSign(); 

                }
                break;
<<<<<<< HEAD
            case 74 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:902: GreaterThanSign
=======
            case 73 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:896: GreaterThanSign
>>>>>>> refs/remotes/origin/PeterWork
                {
                mGreaterThanSign(); 

                }
                break;
<<<<<<< HEAD
            case 75 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:918: CommercialAt
=======
            case 74 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:912: CommercialAt
>>>>>>> refs/remotes/origin/PeterWork
                {
                mCommercialAt(); 

                }
                break;
<<<<<<< HEAD
            case 76 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:931: LeftSquareBracket
=======
            case 75 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:925: LeftSquareBracket
>>>>>>> refs/remotes/origin/PeterWork
                {
                mLeftSquareBracket(); 

                }
                break;
<<<<<<< HEAD
            case 77 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:949: RightSquareBracket
=======
            case 76 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:943: RightSquareBracket
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRightSquareBracket(); 

                }
                break;
<<<<<<< HEAD
            case 78 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:968: LeftCurlyBracket
=======
            case 77 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:962: LeftCurlyBracket
>>>>>>> refs/remotes/origin/PeterWork
                {
                mLeftCurlyBracket(); 

                }
                break;
<<<<<<< HEAD
            case 79 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:985: RightCurlyBracket
=======
            case 78 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:979: RightCurlyBracket
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRightCurlyBracket(); 

                }
                break;
<<<<<<< HEAD
            case 80 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1003: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 81 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1017: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 82 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1034: RULE_HEX
=======
            case 79 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:997: RULE_HEX
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_HEX(); 

                }
                break;
<<<<<<< HEAD
            case 83 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1043: RULE_INT
=======
            case 80 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1006: RULE_INT
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_INT(); 

                }
                break;
<<<<<<< HEAD
            case 84 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1052: RULE_DECIMAL
=======
            case 81 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1015: RULE_DECIMAL
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_DECIMAL(); 

                }
                break;
<<<<<<< HEAD
            case 85 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1065: RULE_ID
=======
            case 82 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1028: RULE_ID
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_ID(); 

                }
                break;
<<<<<<< HEAD
            case 86 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1073: RULE_STRING
=======
            case 83 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1036: RULE_STRING
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_STRING(); 

                }
                break;
<<<<<<< HEAD
            case 87 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1085: RULE_ML_COMMENT
=======
            case 84 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1048: RULE_ML_COMMENT
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_ML_COMMENT(); 

                }
                break;
<<<<<<< HEAD
            case 88 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1101: RULE_SL_COMMENT
=======
            case 85 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1064: RULE_SL_COMMENT
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_SL_COMMENT(); 

                }
                break;
<<<<<<< HEAD
            case 89 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1117: RULE_WS
=======
            case 86 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1080: RULE_WS
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_WS(); 

                }
                break;
<<<<<<< HEAD
            case 90 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1125: RULE_ANY_OTHER
=======
            case 87 :
                // ../org.osate.reqspec.ui/src-gen/org/osate/reqspec/ui/contentassist/antlr/lexer/InternalReqSpecLexer.g:1:1088: RULE_ANY_OTHER
>>>>>>> refs/remotes/origin/PeterWork
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


<<<<<<< HEAD
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA38_eotS =
        "\1\uffff\17\63\1\121\1\123\1\126\1\63\1\57\1\132\1\134\1\136\1"+
        "\140\1\142\2\57\6\uffff\1\155\5\uffff\2\164\1\57\1\uffff\2\57\2"+
        "\uffff\3\63\1\uffff\34\63\1\u00a4\1\uffff\1\u00a6\1\uffff\1\u00a8"+
        "\2\uffff\1\63\35\uffff\1\u00ab\1\uffff\1\164\4\uffff\6\63\1\u00b5"+
        "\17\63\1\u00c5\1\63\1\u00c7\5\63\1\u00cf\3\63\1\u00d3\4\63\6\uffff"+
        "\1\u00d8\1\164\1\uffff\1\u00ab\1\uffff\1\164\1\63\1\u00db\1\u00dc"+
        "\3\63\1\uffff\17\63\1\uffff\1\63\1\uffff\7\63\1\uffff\3\63\1\uffff"+
        "\1\63\1\u00fc\1\u00fd\1\u00fe\1\uffff\1\164\1\63\2\uffff\15\63\1"+
        "\u010d\3\63\1\u0111\7\63\1\u0119\4\63\1\u011e\3\uffff\4\63\1\u0123"+
        "\11\63\1\uffff\3\63\1\uffff\7\63\1\uffff\2\63\1\u0139\1\63\1\uffff"+
        "\3\63\1\u013e\1\uffff\3\63\1\u0142\6\63\1\u0149\5\63\1\u014f\4\63"+
        "\1\uffff\1\u0154\3\63\1\uffff\3\63\1\uffff\5\63\1\u0160\1\uffff"+
        "\5\63\1\uffff\1\u0166\2\63\1\u0169\1\uffff\4\63\1\u016e\1\63\1\u0170"+
        "\1\u0171\3\63\1\uffff\3\63\1\u0178\1\u0179\1\uffff\1\63\1\u017b"+
        "\1\uffff\4\63\1\uffff\1\63\2\uffff\2\63\1\u0183\2\63\1\u0186\2\uffff"+
        "\1\u0187\1\uffff\2\63\1\u018a\1\63\1\u018d\1\u018e\1\u018f\1\uffff"+
        "\1\u0190\1\u0191\2\uffff\2\63\1\uffff\1\63\1\u0195\5\uffff\2\63"+
        "\1\u0198\1\uffff\1\63\1\u019a\1\uffff\1\u019b\2\uffff";
    static final String DFA38_eofS =
        "\u019c\uffff";
    static final String DFA38_minS =
        "\1\0\1\150\1\143\2\141\1\145\1\141\1\156\2\141\1\162\1\155\1\166"+
        "\1\157\1\165\1\151\1\75\1\56\1\75\1\154\1\46\1\52\1\76\1\72\1\76"+
        "\1\75\1\72\1\174\6\uffff\1\52\5\uffff\2\56\1\101\1\uffff\2\0\2\uffff"+
        "\1\155\1\151\1\165\1\uffff\1\150\1\141\1\143\1\163\2\164\1\146\1"+
        "\164\1\163\2\143\1\157\1\154\1\162\1\143\1\145\1\155\1\164\2\154"+
        "\1\145\1\146\1\163\1\147\1\157\1\141\1\154\1\164\1\75\1\uffff\1"+
        "\74\1\uffff\1\75\2\uffff\1\154\35\uffff\1\60\1\53\1\56\4\uffff\1"+
        "\145\1\163\2\145\1\153\1\164\1\60\1\164\1\165\1\151\1\165\2\151"+
        "\1\153\1\143\1\145\1\157\1\164\1\165\1\160\1\151\1\163\1\60\1\145"+
        "\1\60\1\164\1\146\1\160\1\145\1\141\1\60\1\144\1\157\1\165\1\60"+
        "\3\154\1\150\6\uffff\1\60\1\56\1\uffff\3\60\1\143\2\60\1\144\1\145"+
        "\1\151\1\uffff\1\145\1\162\1\147\1\151\1\156\1\157\1\151\1\162\1"+
        "\154\1\155\1\141\1\155\1\160\1\154\1\145\1\uffff\1\162\1\uffff\1"+
        "\151\1\154\1\164\1\165\1\147\1\164\1\145\1\uffff\1\151\1\162\1\145"+
        "\1\uffff\1\166\3\60\1\uffff\1\60\1\162\2\uffff\1\165\1\150\1\157"+
        "\1\155\1\151\1\141\1\162\1\145\2\156\1\151\1\157\1\160\1\60\2\145"+
        "\1\151\1\60\1\164\1\155\1\151\1\141\1\164\1\157\1\151\1\60\1\143"+
        "\1\155\1\163\1\145\1\60\3\uffff\1\151\1\154\1\157\1\156\1\60\2\164"+
        "\1\145\1\163\1\141\1\144\2\160\1\157\1\uffff\1\156\1\144\1\141\1"+
        "\uffff\1\141\1\160\1\143\1\156\1\145\1\162\1\154\1\uffff\2\141\1"+
        "\60\1\163\1\uffff\1\164\1\145\1\154\1\60\1\uffff\1\171\1\145\1\155"+
        "\1\60\1\154\1\145\1\164\1\155\1\163\1\164\1\60\1\162\1\151\1\141"+
        "\2\164\1\60\1\171\1\151\1\164\1\154\1\uffff\1\60\2\151\1\144\1\uffff"+
        "\1\151\1\163\1\145\1\uffff\1\145\1\170\1\151\2\145\1\60\1\uffff"+
        "\1\151\1\156\1\143\2\163\1\uffff\1\60\1\164\1\145\1\60\1\uffff\1"+
        "\143\1\155\1\145\1\156\1\60\1\156\2\60\1\157\1\156\1\163\1\uffff"+
        "\3\164\2\60\1\uffff\1\171\1\60\1\uffff\1\141\1\160\1\162\1\144\1"+
        "\uffff\1\164\2\uffff\1\156\1\164\1\60\2\171\1\60\2\uffff\1\60\1"+
        "\uffff\1\154\1\141\1\60\1\145\3\60\1\uffff\2\60\2\uffff\1\151\1"+
        "\143\1\uffff\1\170\1\60\5\uffff\2\164\1\60\1\uffff\1\171\1\60\1"+
        "\uffff\1\60\2\uffff";
    static final String DFA38_maxS =
        "\1\uffff\1\162\1\171\2\151\1\162\1\157\1\163\2\157\1\162\1\163"+
        "\1\166\1\157\1\165\1\151\1\75\1\56\1\76\1\154\1\46\1\52\1\76\1\72"+
        "\1\76\1\75\1\72\1\174\6\uffff\1\57\5\uffff\1\170\1\154\1\172\1\uffff"+
        "\2\uffff\2\uffff\1\155\1\151\1\165\1\uffff\1\150\1\141\1\145\1\163"+
        "\2\164\1\161\1\164\1\163\1\166\1\143\1\157\1\155\1\162\1\143\1\145"+
        "\1\163\1\164\2\154\1\145\1\146\1\163\1\147\1\157\1\141\1\154\1\164"+
        "\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\154\35\uffff\1\154\1\71"+
        "\1\154\4\uffff\1\145\1\163\2\145\1\153\1\164\1\172\1\164\1\165\1"+
        "\151\1\165\2\151\1\153\1\143\1\145\1\157\1\164\1\165\1\160\1\151"+
        "\1\163\1\172\1\145\1\172\1\164\1\163\1\160\1\145\1\141\1\172\1\144"+
        "\1\157\1\165\1\172\3\154\1\150\6\uffff\1\172\1\154\1\uffff\1\154"+
        "\1\71\1\154\1\143\2\172\1\144\1\145\1\151\1\uffff\1\145\1\162\1"+
        "\147\1\151\1\156\1\157\1\151\1\162\1\154\1\155\1\141\1\155\1\160"+
        "\1\154\1\145\1\uffff\1\162\1\uffff\1\151\1\154\1\164\1\165\1\147"+
        "\1\164\1\145\1\uffff\1\151\1\162\1\145\1\uffff\1\166\3\172\1\uffff"+
        "\1\154\1\162\2\uffff\1\165\1\150\1\157\1\155\1\151\1\141\1\162\1"+
        "\145\2\156\1\151\1\157\1\160\1\172\2\145\1\151\1\172\1\164\1\155"+
        "\1\151\1\141\1\164\1\157\1\151\1\172\1\143\1\155\1\163\1\145\1\172"+
        "\3\uffff\1\151\1\154\1\157\1\156\1\172\2\164\1\145\1\163\1\141\1"+
        "\144\2\160\1\157\1\uffff\1\156\1\144\1\141\1\uffff\1\141\1\160\1"+
        "\143\1\156\1\145\1\162\1\154\1\uffff\2\141\1\172\1\163\1\uffff\1"+
        "\164\1\145\1\154\1\172\1\uffff\1\171\1\145\1\155\1\172\1\154\1\145"+
        "\1\164\1\155\1\163\1\164\1\172\1\162\1\151\1\141\2\164\1\172\1\171"+
        "\1\151\1\164\1\154\1\uffff\1\172\2\151\1\144\1\uffff\1\151\1\163"+
        "\1\145\1\uffff\1\145\1\170\1\151\2\145\1\172\1\uffff\1\151\1\156"+
        "\1\143\2\163\1\uffff\1\172\1\164\1\145\1\172\1\uffff\1\143\1\155"+
        "\1\145\1\156\1\172\1\156\2\172\1\157\1\156\1\163\1\uffff\3\164\2"+
        "\172\1\uffff\1\171\1\172\1\uffff\1\141\1\160\1\162\1\144\1\uffff"+
        "\1\164\2\uffff\1\156\1\164\1\172\2\171\1\172\2\uffff\1\172\1\uffff"+
        "\1\154\1\141\1\172\1\145\3\172\1\uffff\2\172\2\uffff\1\151\1\143"+
        "\1\uffff\1\170\1\172\5\uffff\2\164\1\172\1\uffff\1\171\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA38_acceptS =
        "\34\uffff\1\75\1\76\1\77\1\100\1\102\1\103\1\uffff\1\113\1\114"+
        "\1\115\1\116\1\117\3\uffff\1\125\2\uffff\1\131\1\132\3\uffff\1\125"+
        "\35\uffff\1\74\1\uffff\1\105\1\uffff\1\70\1\111\1\uffff\1\61\1\62"+
        "\1\101\1\63\1\104\1\65\1\107\1\66\1\110\1\71\1\112\1\72\1\73\1\75"+
        "\1\76\1\77\1\100\1\102\1\103\1\127\1\130\1\106\1\113\1\114\1\115"+
        "\1\116\1\117\1\122\1\121\3\uffff\1\120\1\124\1\126\1\131\47\uffff"+
        "\1\47\1\60\1\50\1\64\1\51\1\67\2\uffff\1\123\11\uffff\1\55\17\uffff"+
        "\1\53\1\uffff\1\56\7\uffff\1\57\3\uffff\1\54\4\uffff\1\52\2\uffff"+
        "\1\44\1\45\37\uffff\1\42\1\43\1\46\16\uffff\1\36\3\uffff\1\37\7"+
        "\uffff\1\41\4\uffff\1\40\4\uffff\1\35\25\uffff\1\34\4\uffff\1\33"+
        "\3\uffff\1\32\6\uffff\1\30\5\uffff\1\27\4\uffff\1\31\13\uffff\1"+
        "\25\5\uffff\1\24\2\uffff\1\26\4\uffff\1\20\1\uffff\1\22\1\23\6\uffff"+
        "\1\16\1\17\1\uffff\1\21\7\uffff\1\14\2\uffff\1\13\1\15\2\uffff\1"+
        "\11\2\uffff\1\10\1\5\1\6\1\7\1\12\3\uffff\1\4\2\uffff\1\3\1\uffff"+
        "\1\2\1\1";
    static final String DFA38_specialS =
        "\1\0\53\uffff\1\1\1\2\u016e\uffff}>";
    static final String[] DFA38_transitionS = {
=======
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\17\63\1\121\1\123\1\126\1\63\1\57\1\132\1\134\1\136\1"+
        "\140\1\142\2\57\6\uffff\1\155\5\uffff\2\164\1\57\1\uffff\2\57\2"+
        "\uffff\3\63\1\uffff\34\63\1\u00a0\1\uffff\1\u00a2\1\uffff\1\u00a4"+
        "\2\uffff\1\63\35\uffff\1\164\3\uffff\6\63\1\u00ac\16\63\1\u00bb"+
        "\1\63\1\u00bd\5\63\1\u00c5\3\63\1\u00c9\4\63\6\uffff\1\u00ce\1\63"+
        "\1\u00d0\1\u00d1\3\63\1\uffff\16\63\1\uffff\1\63\1\uffff\7\63\1"+
        "\uffff\3\63\1\uffff\1\63\1\u00f0\1\u00f1\1\u00f2\1\uffff\1\63\2"+
        "\uffff\20\63\1\u0104\7\63\1\u010c\4\63\1\u0111\3\uffff\4\63\1\u0116"+
        "\14\63\1\uffff\7\63\1\uffff\2\63\1\u012c\1\63\1\uffff\3\63\1\u0131"+
        "\1\uffff\3\63\1\u0135\6\63\1\u013c\5\63\1\u0142\4\63\1\uffff\1\u0147"+
        "\3\63\1\uffff\3\63\1\uffff\5\63\1\u0153\1\uffff\5\63\1\uffff\1\u0159"+
        "\2\63\1\u015c\1\uffff\4\63\1\u0161\1\63\1\u0163\1\u0164\3\63\1\uffff"+
        "\3\63\1\u016b\1\u016c\1\uffff\1\63\1\u016e\1\uffff\4\63\1\uffff"+
        "\1\63\2\uffff\2\63\1\u0176\2\63\1\u0179\2\uffff\1\u017a\1\uffff"+
        "\2\63\1\u017d\1\63\1\u0180\1\u0181\1\u0182\1\uffff\1\u0183\1\u0184"+
        "\2\uffff\2\63\1\uffff\1\63\1\u0188\5\uffff\2\63\1\u018b\1\uffff"+
        "\1\63\1\u018d\1\uffff\1\u018e\2\uffff";
    static final String DFA19_eofS =
        "\u018f\uffff";
    static final String DFA19_minS =
        "\1\0\1\150\1\143\2\141\1\145\1\141\1\156\2\141\1\162\1\155\1\166"+
        "\1\157\1\165\1\151\1\75\1\56\1\75\1\154\1\46\1\52\1\76\1\72\1\76"+
        "\1\75\1\72\1\174\6\uffff\1\52\5\uffff\2\60\1\101\1\uffff\2\0\2\uffff"+
        "\1\155\1\151\1\165\1\uffff\1\150\1\141\1\143\1\163\2\164\1\146\1"+
        "\164\1\163\2\143\1\157\1\154\1\162\1\143\1\145\1\155\1\164\2\154"+
        "\1\145\1\146\1\163\1\147\1\157\1\141\1\154\1\164\1\75\1\uffff\1"+
        "\74\1\uffff\1\75\2\uffff\1\154\35\uffff\1\60\3\uffff\1\145\1\163"+
        "\2\145\1\153\1\164\1\60\1\164\1\165\1\151\1\165\2\151\1\153\1\143"+
        "\1\145\1\157\1\165\1\160\1\151\1\163\1\60\1\145\1\60\1\164\1\146"+
        "\1\160\1\145\1\141\1\60\1\144\1\157\1\165\1\60\3\154\1\150\6\uffff"+
        "\1\60\1\143\2\60\1\144\1\145\1\151\1\uffff\1\145\1\162\1\147\1\151"+
        "\1\156\1\157\1\151\1\162\1\154\2\155\1\160\1\154\1\145\1\uffff\1"+
        "\162\1\uffff\1\151\1\154\1\164\1\165\1\147\1\164\1\145\1\uffff\1"+
        "\151\1\162\1\145\1\uffff\1\166\3\60\1\uffff\1\162\2\uffff\1\165"+
        "\1\150\1\157\1\155\1\151\1\141\1\162\1\145\2\156\1\151\1\157\1\160"+
        "\2\145\1\151\1\60\1\164\1\155\1\151\1\141\1\164\1\157\1\151\1\60"+
        "\1\143\1\155\1\163\1\145\1\60\3\uffff\1\151\1\154\1\157\1\156\1"+
        "\60\2\164\1\145\1\163\1\141\1\144\2\160\1\157\1\156\1\144\1\141"+
        "\1\uffff\1\141\1\160\1\143\1\156\1\145\1\162\1\154\1\uffff\2\141"+
        "\1\60\1\163\1\uffff\1\164\1\145\1\154\1\60\1\uffff\1\171\1\145\1"+
        "\155\1\60\1\154\1\145\1\164\1\155\1\163\1\164\1\60\1\162\1\151\1"+
        "\141\2\164\1\60\1\171\1\151\1\164\1\154\1\uffff\1\60\2\151\1\144"+
        "\1\uffff\1\151\1\163\1\145\1\uffff\1\145\1\170\1\151\2\145\1\60"+
        "\1\uffff\1\151\1\156\1\143\2\163\1\uffff\1\60\1\164\1\145\1\60\1"+
        "\uffff\1\143\1\155\1\145\1\156\1\60\1\156\2\60\1\157\1\156\1\163"+
        "\1\uffff\3\164\2\60\1\uffff\1\171\1\60\1\uffff\1\141\1\160\1\162"+
        "\1\144\1\uffff\1\164\2\uffff\1\156\1\164\1\60\2\171\1\60\2\uffff"+
        "\1\60\1\uffff\1\154\1\141\1\60\1\145\3\60\1\uffff\2\60\2\uffff\1"+
        "\151\1\143\1\uffff\1\170\1\60\5\uffff\2\164\1\60\1\uffff\1\171\1"+
        "\60\1\uffff\1\60\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\162\1\171\2\151\1\162\1\157\1\163\2\157\1\162\1\163"+
        "\1\166\1\157\1\165\1\151\1\75\1\56\1\76\1\154\1\46\1\52\1\76\1\72"+
        "\1\76\1\75\1\72\1\174\6\uffff\1\57\5\uffff\1\170\1\154\1\172\1\uffff"+
        "\2\uffff\2\uffff\1\155\1\151\1\165\1\uffff\1\150\1\141\1\145\1\163"+
        "\2\164\1\161\1\164\1\163\1\166\1\143\1\157\1\155\1\162\1\143\1\145"+
        "\1\163\1\164\2\154\1\145\1\146\1\163\1\147\1\157\1\141\1\154\1\164"+
        "\1\75\1\uffff\1\74\1\uffff\1\75\2\uffff\1\154\35\uffff\1\154\3\uffff"+
        "\1\145\1\163\2\145\1\153\1\164\1\172\1\164\1\165\1\151\1\165\2\151"+
        "\1\153\1\143\1\145\1\157\1\165\1\160\1\151\1\163\1\172\1\145\1\172"+
        "\1\164\1\163\1\160\1\145\1\141\1\172\1\144\1\157\1\165\1\172\3\154"+
        "\1\150\6\uffff\1\172\1\143\2\172\1\144\1\145\1\151\1\uffff\1\145"+
        "\1\162\1\147\1\151\1\156\1\157\1\151\1\162\1\154\2\155\1\160\1\154"+
        "\1\145\1\uffff\1\162\1\uffff\1\151\1\154\1\164\1\165\1\147\1\164"+
        "\1\145\1\uffff\1\151\1\162\1\145\1\uffff\1\166\3\172\1\uffff\1\162"+
        "\2\uffff\1\165\1\150\1\157\1\155\1\151\1\141\1\162\1\145\2\156\1"+
        "\151\1\157\1\160\2\145\1\151\1\172\1\164\1\155\1\151\1\141\1\164"+
        "\1\157\1\151\1\172\1\143\1\155\1\163\1\145\1\172\3\uffff\1\151\1"+
        "\154\1\157\1\156\1\172\2\164\1\145\1\163\1\141\1\144\2\160\1\157"+
        "\1\156\1\144\1\141\1\uffff\1\141\1\160\1\143\1\156\1\145\1\162\1"+
        "\154\1\uffff\2\141\1\172\1\163\1\uffff\1\164\1\145\1\154\1\172\1"+
        "\uffff\1\171\1\145\1\155\1\172\1\154\1\145\1\164\1\155\1\163\1\164"+
        "\1\172\1\162\1\151\1\141\2\164\1\172\1\171\1\151\1\164\1\154\1\uffff"+
        "\1\172\2\151\1\144\1\uffff\1\151\1\163\1\145\1\uffff\1\145\1\170"+
        "\1\151\2\145\1\172\1\uffff\1\151\1\156\1\143\2\163\1\uffff\1\172"+
        "\1\164\1\145\1\172\1\uffff\1\143\1\155\1\145\1\156\1\172\1\156\2"+
        "\172\1\157\1\156\1\163\1\uffff\3\164\2\172\1\uffff\1\171\1\172\1"+
        "\uffff\1\141\1\160\1\162\1\144\1\uffff\1\164\2\uffff\1\156\1\164"+
        "\1\172\2\171\1\172\2\uffff\1\172\1\uffff\1\154\1\141\1\172\1\145"+
        "\3\172\1\uffff\2\172\2\uffff\1\151\1\143\1\uffff\1\170\1\172\5\uffff"+
        "\2\164\1\172\1\uffff\1\171\1\172\1\uffff\1\172\2\uffff";
    static final String DFA19_acceptS =
        "\34\uffff\1\74\1\75\1\76\1\77\1\101\1\102\1\uffff\1\112\1\113\1"+
        "\114\1\115\1\116\3\uffff\1\122\2\uffff\1\126\1\127\3\uffff\1\122"+
        "\35\uffff\1\73\1\uffff\1\104\1\uffff\1\67\1\110\1\uffff\1\60\1\61"+
        "\1\100\1\62\1\103\1\64\1\106\1\65\1\107\1\70\1\111\1\71\1\72\1\74"+
        "\1\75\1\76\1\77\1\101\1\102\1\124\1\125\1\105\1\112\1\113\1\114"+
        "\1\115\1\116\1\117\1\120\1\uffff\1\121\1\123\1\126\46\uffff\1\46"+
        "\1\57\1\47\1\63\1\50\1\66\7\uffff\1\54\16\uffff\1\52\1\uffff\1\55"+
        "\7\uffff\1\56\3\uffff\1\53\4\uffff\1\51\1\uffff\1\43\1\44\36\uffff"+
        "\1\41\1\42\1\45\21\uffff\1\36\7\uffff\1\40\4\uffff\1\37\4\uffff"+
        "\1\35\25\uffff\1\34\4\uffff\1\33\3\uffff\1\32\6\uffff\1\30\5\uffff"+
        "\1\27\4\uffff\1\31\13\uffff\1\25\5\uffff\1\24\2\uffff\1\26\4\uffff"+
        "\1\20\1\uffff\1\22\1\23\6\uffff\1\16\1\17\1\uffff\1\21\7\uffff\1"+
        "\14\2\uffff\1\13\1\15\2\uffff\1\11\2\uffff\1\10\1\5\1\6\1\7\1\12"+
        "\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA19_specialS =
        "\1\0\53\uffff\1\1\1\2\u0161\uffff}>";
    static final String[] DFA19_transitionS = {
>>>>>>> refs/remotes/origin/PeterWork
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\20\1\54\1\34\1\57\1\35\1"+
            "\24\1\55\1\36\1\37\1\25\1\40\1\41\1\26\1\21\1\42\1\50\11\51"+
            "\1\27\1\57\1\30\1\22\1\31\1\32\1\43\32\53\1\44\1\57\1\45\1\52"+
            "\1\53\1\57\1\23\1\53\1\10\1\5\1\14\1\6\1\15\1\53\1\13\3\53\1"+
            "\3\1\16\1\53\1\12\1\53\1\4\1\2\1\1\1\7\1\11\1\17\3\53\1\46\1"+
            "\33\1\47\uff82\57",
            "\1\61\1\60\10\uffff\1\62",
            "\1\64\1\uffff\1\66\16\uffff\1\65\4\uffff\1\67",
            "\1\70\7\uffff\1\71",
            "\1\73\3\uffff\1\72\3\uffff\1\74",
            "\1\75\11\uffff\1\76\2\uffff\1\77",
            "\1\100\15\uffff\1\101",
            "\1\102\4\uffff\1\103",
            "\1\105\15\uffff\1\104",
            "\1\107\15\uffff\1\106",
            "\1\110",
            "\1\113\1\111\4\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\122",
            "\1\124\1\125",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133",
            "\1\135",
            "\1\137",
            "\1\141",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153\4\uffff\1\154",
            "",
            "",
            "",
            "",
            "",
<<<<<<< HEAD
            "\1\170\1\uffff\12\167\10\uffff\1\171\1\uffff\1\171\1\166\1"+
            "\171\5\uffff\1\171\13\uffff\1\163\6\uffff\1\165\2\uffff\1\171"+
            "\1\uffff\1\171\1\166\1\171\5\uffff\1\171\13\uffff\1\163",
            "\1\170\1\uffff\12\167\10\uffff\1\171\1\uffff\1\171\1\166\1"+
            "\171\5\uffff\1\171\22\uffff\1\165\2\uffff\1\171\1\uffff\1\171"+
            "\1\166\1\171\5\uffff\1\171",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\172",
            "\0\172",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
=======
            "\12\165\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\13\uffff"+
            "\1\163\6\uffff\1\165\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166"+
            "\13\uffff\1\163",
            "\12\165\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\22\uffff"+
            "\1\165\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\167",
            "\0\167",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
>>>>>>> refs/remotes/origin/PeterWork
            "",
<<<<<<< HEAD
            "\1\177",
            "\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\12\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008c\10\uffff\1\u008d\6\uffff\1\u008a\2\uffff\1\u008b",
            "\1\u008e",
            "\1\u008f",
            "\1\u0091\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0097\1\u0096\4\uffff\1\u0095",
=======
            "\1\174",
            "\1\175",
            "\1\176\1\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\12\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0089\17\uffff\1\u0087\2\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008d\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0093\1\u0092\4\uffff\1\u0091",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
<<<<<<< HEAD
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
=======
            "",
            "\1\u00a1",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00a3",
            "",
<<<<<<< HEAD
            "\1\u00a5",
            "",
            "\1\u00a7",
            "",
            "",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00aa\10\uffff\1\171\1\uffff\3\171\5\uffff\1\171\22\uffff"+
            "\1\u00ac\2\uffff\1\171\1\uffff\3\171\5\uffff\1\171",
            "\1\u00ad\1\uffff\1\171\2\uffff\12\u00ae",
            "\1\170\1\uffff\12\167\10\uffff\1\171\1\uffff\1\171\1\166\1"+
            "\171\5\uffff\1\171\22\uffff\1\165\2\uffff\1\171\1\uffff\1\171"+
            "\1\166\1\171\5\uffff\1\171",
            "",
            "",
            "",
            "",
=======
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\165\10\uffff\1\166\1\uffff\3\166\5\uffff\1\166\22\uffff"+
            "\1\165\2\uffff\1\166\1\uffff\3\166\5\uffff\1\166",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ad",
            "\1\u00ae",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
=======
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00bc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00be",
            "\1\u00bf\14\uffff\1\u00c0",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
<<<<<<< HEAD
            "\1\u00c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00c4\5"+
            "\63",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00c6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c8",
<<<<<<< HEAD
            "\1\u00c9\14\uffff\1\u00ca",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ca",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u00ce\5"+
            "\63",
            "\1\u00d0",
            "\1\u00d1",
=======
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00d2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
<<<<<<< HEAD
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\170\1\uffff\12\u00aa\10\uffff\1\171\1\uffff\1\171\1\166"+
            "\1\171\5\uffff\1\171\22\uffff\1\165\2\uffff\1\171\1\uffff\1"+
            "\171\1\166\1\171\5\uffff\1\171",
            "",
            "\12\u00ac\10\uffff\1\171\1\uffff\3\171\5\uffff\1\171\22\uffff"+
            "\1\u00ac\2\uffff\1\171\1\uffff\3\171\5\uffff\1\171",
            "\12\u00ae",
            "\12\u00d9\10\uffff\1\171\1\uffff\1\171\1\uffff\1\171\5\uffff"+
            "\1\171\22\uffff\1\171\2\uffff\1\171\1\uffff\1\171\1\uffff\1"+
            "\171\5\uffff\1\171",
            "\1\u00da",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
<<<<<<< HEAD
=======
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
<<<<<<< HEAD
            "",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00fb\7"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\u00d9\10\uffff\1\171\1\uffff\1\171\1\uffff\1\171\5\uffff"+
            "\1\171\22\uffff\1\171\2\uffff\1\171\1\uffff\1\171\1\uffff\1"+
            "\171\5\uffff\1\171",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00ef\7"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00f3",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u00ff",
<<<<<<< HEAD
            "",
            "",
=======
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
<<<<<<< HEAD
            "\1\u010c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010d",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
<<<<<<< HEAD
=======
            "",
            "",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0117",
            "\1\u0118",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "",
            "\1\u0123",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
<<<<<<< HEAD
            "\1\u012c",
            "",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
<<<<<<< HEAD
            "\1\u0131",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
<<<<<<< HEAD
            "\1\u0135",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013a",
            "",
=======
            "\1\u0139",
            "\1\u013a",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u013b",
<<<<<<< HEAD
            "\1\u013c",
            "\1\u013d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013d",
            "\1\u013e",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0148",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u014a",
<<<<<<< HEAD
=======
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
<<<<<<< HEAD
            "\1\u0153",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0154",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
<<<<<<< HEAD
            "\1\u0159",
            "\1\u015a",
            "",
=======
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015a",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u015b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
=======
            "\1\u0160",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0162",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0165",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0167",
<<<<<<< HEAD
            "\1\u0168",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u016d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u016f",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\1\u0170",
            "\1\u0171",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0172",
<<<<<<< HEAD
            "\1\u0173",
=======
            "",
            "\1\u0173",
            "",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0174",
<<<<<<< HEAD
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u017a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "",
            "",
            "\1\u0181",
            "\1\u0182",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0184",
            "\1\u0185",
=======
            "\1\u0175",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0177",
            "\1\u0178",
>>>>>>> refs/remotes/origin/PeterWork
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
<<<<<<< HEAD
            "\1\u0188",
=======
            "\1\u017b",
            "\1\u017c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u017e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u017f\7"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
>>>>>>> refs/remotes/origin/PeterWork
            "\1\u0189",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u018c\7"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
            "\1\u018a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u018c",
>>>>>>> refs/remotes/origin/PeterWork
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
<<<<<<< HEAD
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\1\u0196",
            "\1\u0197",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0199",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
>>>>>>> refs/remotes/origin/PeterWork
            "",
            ""
    };

<<<<<<< HEAD
    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;
=======
    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;
>>>>>>> refs/remotes/origin/PeterWork

    static {
<<<<<<< HEAD
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
=======
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
>>>>>>> refs/remotes/origin/PeterWork
        for (int i=0; i<numStates; i++) {
<<<<<<< HEAD
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
=======
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
>>>>>>> refs/remotes/origin/PeterWork
        }
    }

<<<<<<< HEAD
    static class DFA38 extends DFA {
=======
    static class DFA19 extends DFA {
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
        public DFA38(BaseRecognizer recognizer) {
=======
        public DFA19(BaseRecognizer recognizer) {
>>>>>>> refs/remotes/origin/PeterWork
            this.recognizer = recognizer;
<<<<<<< HEAD
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
=======
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
>>>>>>> refs/remotes/origin/PeterWork
        }
        public String getDescription() {
<<<<<<< HEAD
            return "1:1: Tokens : ( Timecriticality | Scheduleimpact | Maturityindex | Requirements | Description | Development | Familiarity | Requirement | Stakeholder | Uncertainty | Costimpact | Decomposes | Volatility | Conflicts | Constants | Mitigates | Predicate | Rationale | Riskindex | Category | Document | Informal | Compute | Dropped | Evolves | Refines | Section | Issues | KW_System | Delta | False | Goals | Value | Goal | Null | This | True | With | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | All | For | Img | See | Use | Val | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkColon | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
=======
            return "1:1: Tokens : ( Timecriticality | Scheduleimpact | Maturityindex | Requirements | Description | Development | Familiarity | Requirement | Stakeholder | Uncertainty | Costimpact | Decomposes | Volatility | Conflicts | Constants | Mitigates | Predicate | Rationale | Riskindex | Category | Document | Informal | Compute | Dropped | Evolves | Refines | Section | Issues | KW_System | False | Goals | Value | Goal | Null | This | True | With | ExclamationMarkEqualsSignEqualsSign | FullStopFullStopLessThanSign | EqualsSignEqualsSignEqualsSign | All | For | Img | See | Use | Val | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | ColonColon | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | QuestionMarkColon | VerticalLineVerticalLine | ExclamationMark | NumberSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
>>>>>>> refs/remotes/origin/PeterWork
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
<<<<<<< HEAD
                        int LA38_0 = input.LA(1);
=======
                        int LA19_0 = input.LA(1);
>>>>>>> refs/remotes/origin/PeterWork

                        s = -1;
<<<<<<< HEAD
                        if ( (LA38_0=='t') ) {s = 1;}
=======
                        if ( (LA19_0=='t') ) {s = 1;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='s') ) {s = 2;}
=======
                        else if ( (LA19_0=='s') ) {s = 2;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='m') ) {s = 3;}
=======
                        else if ( (LA19_0=='m') ) {s = 3;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='r') ) {s = 4;}
=======
                        else if ( (LA19_0=='r') ) {s = 4;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='d') ) {s = 5;}
=======
                        else if ( (LA19_0=='d') ) {s = 5;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='f') ) {s = 6;}
=======
                        else if ( (LA19_0=='f') ) {s = 6;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='u') ) {s = 7;}
=======
                        else if ( (LA19_0=='u') ) {s = 7;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='c') ) {s = 8;}
=======
                        else if ( (LA19_0=='c') ) {s = 8;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='v') ) {s = 9;}
=======
                        else if ( (LA19_0=='v') ) {s = 9;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='p') ) {s = 10;}
=======
                        else if ( (LA19_0=='p') ) {s = 10;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='i') ) {s = 11;}
=======
                        else if ( (LA19_0=='i') ) {s = 11;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='e') ) {s = 12;}
=======
                        else if ( (LA19_0=='e') ) {s = 12;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='g') ) {s = 13;}
=======
                        else if ( (LA19_0=='g') ) {s = 13;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='n') ) {s = 14;}
=======
                        else if ( (LA19_0=='n') ) {s = 14;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='w') ) {s = 15;}
=======
                        else if ( (LA19_0=='w') ) {s = 15;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='!') ) {s = 16;}
=======
                        else if ( (LA19_0=='!') ) {s = 16;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='.') ) {s = 17;}
=======
                        else if ( (LA19_0=='.') ) {s = 17;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='=') ) {s = 18;}
=======
                        else if ( (LA19_0=='=') ) {s = 18;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='a') ) {s = 19;}
=======
                        else if ( (LA19_0=='a') ) {s = 19;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='&') ) {s = 20;}
=======
                        else if ( (LA19_0=='&') ) {s = 20;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='*') ) {s = 21;}
=======
                        else if ( (LA19_0=='*') ) {s = 21;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='-') ) {s = 22;}
=======
                        else if ( (LA19_0=='-') ) {s = 22;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0==':') ) {s = 23;}
=======
                        else if ( (LA19_0==':') ) {s = 23;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='<') ) {s = 24;}
=======
                        else if ( (LA19_0=='<') ) {s = 24;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='>') ) {s = 25;}
=======
                        else if ( (LA19_0=='>') ) {s = 25;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='?') ) {s = 26;}
=======
                        else if ( (LA19_0=='?') ) {s = 26;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='|') ) {s = 27;}
=======
                        else if ( (LA19_0=='|') ) {s = 27;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='#') ) {s = 28;}
=======
                        else if ( (LA19_0=='#') ) {s = 28;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='%') ) {s = 29;}
=======
                        else if ( (LA19_0=='%') ) {s = 29;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='(') ) {s = 30;}
=======
                        else if ( (LA19_0=='(') ) {s = 30;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0==')') ) {s = 31;}
=======
                        else if ( (LA19_0==')') ) {s = 31;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='+') ) {s = 32;}
=======
                        else if ( (LA19_0=='+') ) {s = 32;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0==',') ) {s = 33;}
=======
                        else if ( (LA19_0==',') ) {s = 33;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='/') ) {s = 34;}
=======
                        else if ( (LA19_0=='/') ) {s = 34;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='@') ) {s = 35;}
=======
                        else if ( (LA19_0=='@') ) {s = 35;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='[') ) {s = 36;}
=======
                        else if ( (LA19_0=='[') ) {s = 36;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0==']') ) {s = 37;}
=======
                        else if ( (LA19_0==']') ) {s = 37;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='{') ) {s = 38;}
=======
                        else if ( (LA19_0=='{') ) {s = 38;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='}') ) {s = 39;}
=======
                        else if ( (LA19_0=='}') ) {s = 39;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='0') ) {s = 40;}
=======
                        else if ( (LA19_0=='0') ) {s = 40;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( ((LA38_0>='1' && LA38_0<='9')) ) {s = 41;}
=======
                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 41;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='^') ) {s = 42;}
=======
                        else if ( (LA19_0=='^') ) {s = 42;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( ((LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||LA38_0=='b'||LA38_0=='h'||(LA38_0>='j' && LA38_0<='l')||LA38_0=='o'||LA38_0=='q'||(LA38_0>='x' && LA38_0<='z')) ) {s = 43;}
=======
                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='b'||LA19_0=='h'||(LA19_0>='j' && LA19_0<='l')||LA19_0=='o'||LA19_0=='q'||(LA19_0>='x' && LA19_0<='z')) ) {s = 43;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='\"') ) {s = 44;}
=======
                        else if ( (LA19_0=='\"') ) {s = 44;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( (LA38_0=='\'') ) {s = 45;}
=======
                        else if ( (LA19_0=='\'') ) {s = 45;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( ((LA38_0>='\t' && LA38_0<='\n')||LA38_0=='\r'||LA38_0==' ') ) {s = 46;}
=======
                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 46;}
>>>>>>> refs/remotes/origin/PeterWork

<<<<<<< HEAD
                        else if ( ((LA38_0>='\u0000' && LA38_0<='\b')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\u001F')||LA38_0=='$'||LA38_0==';'||LA38_0=='\\'||LA38_0=='`'||(LA38_0>='~' && LA38_0<='\uFFFF')) ) {s = 47;}
=======
                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='$'||LA19_0==';'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 47;}
>>>>>>> refs/remotes/origin/PeterWork

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
<<<<<<< HEAD
                        int LA38_44 = input.LA(1);

                        s = -1;
                        if ( ((LA38_44>='\u0000' && LA38_44<='\uFFFF')) ) {s = 122;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_45 = input.LA(1);

                        s = -1;
                        if ( ((LA38_45>='\u0000' && LA38_45<='\uFFFF')) ) {s = 122;}
=======
                        int LA19_44 = input.LA(1);

                        s = -1;
                        if ( ((LA19_44>='\u0000' && LA19_44<='\uFFFF')) ) {s = 119;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_45 = input.LA(1);

                        s = -1;
                        if ( ((LA19_45>='\u0000' && LA19_45<='\uFFFF')) ) {s = 119;}
>>>>>>> refs/remotes/origin/PeterWork

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
<<<<<<< HEAD
                new NoViableAltException(getDescription(), 38, _s, input);
=======
                new NoViableAltException(getDescription(), 19, _s, input);
>>>>>>> refs/remotes/origin/PeterWork
            error(nvae);
            throw nvae;
        }
    }
 

}