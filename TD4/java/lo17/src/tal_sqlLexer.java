// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g 2013-11-29 14:02:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlLexer extends Lexer {
    public static final int ABOUT=10;
    public static final int WS=14;
    public static final int UNE=8;
    public static final int PAGE=7;
    public static final int POINT=13;
    public static final int CONJ_OR=12;
    public static final int COUNT=5;
    public static final int CONJ_AND=11;
    public static final int VAR=15;
    public static final int DATE=9;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int TITLE=6;

    // delegates
    // delegators

    public tal_sqlLexer() {;} 
    public tal_sqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:3:8: ( '$SELECT' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:3:10: '$SELECT'
            {
            match("$SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:4:7: ( '$COUNT' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:4:9: '$COUNT'
            {
            match("$COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "TITLE"
    public final void mTITLE() throws RecognitionException {
        try {
            int _type = TITLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:5:7: ( '$TITLE' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:5:9: '$TITLE'
            {
            match("$TITLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TITLE"

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:6:6: ( '$PAGE' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:6:8: '$PAGE'
            {
            match("$PAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAGE"

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:7:5: ( '$UNE' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:7:7: '$UNE'
            {
            match("$UNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNE"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:8:6: ( '$DATE' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:8:8: '$DATE'
            {
            match("$DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "ABOUT"
    public final void mABOUT() throws RecognitionException {
        try {
            int _type = ABOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:9:7: ( '$ABOUT' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:9:9: '$ABOUT'
            {
            match("$ABOUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABOUT"

    // $ANTLR start "CONJ_AND"
    public final void mCONJ_AND() throws RecognitionException {
        try {
            int _type = CONJ_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:10:10: ( 'et' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:10:12: 'et'
            {
            match("et"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ_AND"

    // $ANTLR start "CONJ_OR"
    public final void mCONJ_OR() throws RecognitionException {
        try {
            int _type = CONJ_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:11:9: ( 'ou' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:11:11: 'ou'
            {
            match("ou"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ_OR"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:7: ( '.' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:5: ( ( ' ' | '\\t' | '\\r' | '$TRASH' ) | '\\n' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\t'||LA2_0=='\r'||LA2_0==' '||LA2_0=='$') ) {
                alt2=1;
            }
            else if ( (LA2_0=='\n') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:7: ( ' ' | '\\t' | '\\r' | '$TRASH' )
                    {
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:7: ( ' ' | '\\t' | '\\r' | '$TRASH' )
                    int alt1=4;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt1=1;
                        }
                        break;
                    case '\t':
                        {
                        alt1=2;
                        }
                        break;
                    case '\r':
                        {
                        alt1=3;
                        }
                        break;
                    case '$':
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:8: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:27: '$TRASH'
                            {
                            match("$TRASH"); 


                            }
                            break;

                    }

                    skip();

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:14:49: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:15:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:15:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:15:30: ( 'a' .. 'z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:15:31: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:8: ( SELECT | COUNT | TITLE | PAGE | UNE | DATE | ABOUT | CONJ_AND | CONJ_OR | POINT | WS | VAR )
        int alt4=12;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:10: SELECT
                {
                mSELECT(); 

                }
                break;
            case 2 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:17: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 3 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:23: TITLE
                {
                mTITLE(); 

                }
                break;
            case 4 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:29: PAGE
                {
                mPAGE(); 

                }
                break;
            case 5 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:34: UNE
                {
                mUNE(); 

                }
                break;
            case 6 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:38: DATE
                {
                mDATE(); 

                }
                break;
            case 7 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:43: ABOUT
                {
                mABOUT(); 

                }
                break;
            case 8 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:49: CONJ_AND
                {
                mCONJ_AND(); 

                }
                break;
            case 9 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:58: CONJ_OR
                {
                mCONJ_OR(); 

                }
                break;
            case 10 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:66: POINT
                {
                mPOINT(); 

                }
                break;
            case 11 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:72: WS
                {
                mWS(); 

                }
                break;
            case 12 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:75: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\16\uffff\1\21\1\22\3\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\1\11\1\101\2\141\5\uffff\1\111\4\uffff\2\141\3\uffff";
    static final String DFA4_maxS =
        "\1\172\1\125\2\172\5\uffff\1\122\4\uffff\2\172\3\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\12\1\13\1\14\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\2\uffff"+
        "\1\3\1\10\1\11";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\5\2\uffff\1\5\22\uffff\1\5\3\uffff\1\1\11\uffff\1\4\22\uffff"+
            "\32\6\6\uffff\4\6\1\2\11\6\1\3\13\6",
            "\1\15\1\uffff\1\10\1\14\13\uffff\1\12\2\uffff\1\7\1\11\1\13",
            "\23\6\1\16\6\6",
            "\24\6\1\17\5\6",
            "",
            "",
            "",
            "",
            "",
            "\1\20\10\uffff\1\5",
            "",
            "",
            "",
            "",
            "\32\6",
            "\32\6",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COUNT | TITLE | PAGE | UNE | DATE | ABOUT | CONJ_AND | CONJ_OR | POINT | WS | VAR );";
        }
    }
 

}