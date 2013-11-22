// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g 2013-11-22 13:30:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlLexer extends Lexer {
    public static final int ABOUT=9;
    public static final int WS=12;
    public static final int PAGE=7;
    public static final int POINT=11;
    public static final int CONJ=10;
    public static final int COUNT=5;
    public static final int VAR=13;
    public static final int DATE=8;
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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:3:8: ( '$SELECT$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:3:10: '$SELECT$'
            {
            match("$SELECT$"); 


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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:4:7: ( '$COUNT$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:4:9: '$COUNT$'
            {
            match("$COUNT$"); 


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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:5:7: ( '$TITLE$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:5:9: '$TITLE$'
            {
            match("$TITLE$"); 


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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:6:6: ( '$PAGE$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:6:8: '$PAGE$'
            {
            match("$PAGE$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAGE"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:7:6: ( '$DATE$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:7:8: '$DATE$'
            {
            match("$DATE$"); 


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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:8:7: ( '$ABOUT$' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:8:9: '$ABOUT$'
            {
            match("$ABOUT$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABOUT"

    // $ANTLR start "CONJ"
    public final void mCONJ() throws RecognitionException {
        try {
            int _type = CONJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:9:6: ( 'et' | 'ou' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                alt1=1;
            }
            else if ( (LA1_0=='o') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:9:8: 'et'
                    {
                    match("et"); 


                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:9:15: 'ou'
                    {
                    match("ou"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:10:7: ( '.' )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:10:9: '.'
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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:5: ( ( ' ' | '\\t' | '\\r' | 'TRASH' ) | '\\n' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='T') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\n') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:7: ( ' ' | '\\t' | '\\r' | 'TRASH' )
                    {
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:7: ( ' ' | '\\t' | '\\r' | 'TRASH' )
                    int alt2=4;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt2=1;
                        }
                        break;
                    case '\t':
                        {
                        alt2=2;
                        }
                        break;
                    case '\r':
                        {
                        alt2=3;
                        }
                        break;
                    case 'T':
                        {
                        alt2=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:8: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:27: 'TRASH'
                            {
                            match("TRASH"); 


                            }
                            break;

                    }

                    skip();

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:12:48: '\\n'
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
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:13:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:13:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:13:30: ( 'a' .. 'z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:13:31: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:8: ( SELECT | COUNT | TITLE | PAGE | DATE | ABOUT | CONJ | POINT | WS | VAR )
        int alt5=10;
        alt5 = dfa5.predict(input);
        switch (alt5) {
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
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:34: DATE
                {
                mDATE(); 

                }
                break;
            case 6 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:39: ABOUT
                {
                mABOUT(); 

                }
                break;
            case 7 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:45: CONJ
                {
                mCONJ(); 

                }
                break;
            case 8 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:50: POINT
                {
                mPOINT(); 

                }
                break;
            case 9 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:56: WS
                {
                mWS(); 

                }
                break;
            case 10 :
                // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:1:59: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\16\uffff\2\20\1\uffff";
    static final String DFA5_eofS =
        "\21\uffff";
    static final String DFA5_minS =
        "\1\11\1\101\2\141\2\uffff\1\122\7\uffff\2\141\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\124\2\172\2\uffff\1\172\7\uffff\2\172\1\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\10\1\11\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff"+
        "\1\7";
    static final String DFA5_specialS =
        "\21\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\5\2\uffff\1\5\22\uffff\1\5\3\uffff\1\1\11\uffff\1\4\22\uffff"+
            "\23\7\1\6\6\7\6\uffff\4\7\1\2\11\7\1\3\13\7",
            "\1\15\1\uffff\1\11\1\14\13\uffff\1\13\2\uffff\1\10\1\12",
            "\23\7\1\16\6\7",
            "\24\7\1\17\5\7",
            "",
            "",
            "\1\5\16\uffff\32\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\7",
            "\32\7",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COUNT | TITLE | PAGE | DATE | ABOUT | CONJ | POINT | WS | VAR );";
        }
    }
 

}