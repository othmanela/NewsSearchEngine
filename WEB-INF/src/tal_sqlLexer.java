// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g 2014-06-14 21:32:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlLexer extends Lexer {
    public static final int AUTHOR=13;
    public static final int ABOUT=12;
    public static final int FOCUS=7;
    public static final int WS=18;
    public static final int PAGE=11;
    public static final int UNE=6;
    public static final int VOIRAUSSI=10;
    public static final int MOIS=15;
    public static final int NUMBER=14;
    public static final int CONJ_OR=17;
    public static final int CONJ_AND=16;
    public static final int VAR=19;
    public static final int COUNT=5;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int GROSTITRE=8;
    public static final int BREVE=9;

    // delegates
    // delegators

    public tal_sqlLexer() {;} 
    public tal_sqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:3:8: ( '$SELECT' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:3:10: '$SELECT'
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
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:4:7: ( '$COUNT' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:4:9: '$COUNT'
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

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:5:5: ( '$UNE' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:5:7: '$UNE'
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

    // $ANTLR start "FOCUS"
    public final void mFOCUS() throws RecognitionException {
        try {
            int _type = FOCUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:6:8: ( '$FOCUS' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:6:10: '$FOCUS'
            {
            match("$FOCUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOCUS"

    // $ANTLR start "GROSTITRE"
    public final void mGROSTITRE() throws RecognitionException {
        try {
            int _type = GROSTITRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:7:11: ( '$GROSTITRE' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:7:13: '$GROSTITRE'
            {
            match("$GROSTITRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROSTITRE"

    // $ANTLR start "BREVE"
    public final void mBREVE() throws RecognitionException {
        try {
            int _type = BREVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:8:7: ( '$BREVE' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:8:9: '$BREVE'
            {
            match("$BREVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREVE"

    // $ANTLR start "VOIRAUSSI"
    public final void mVOIRAUSSI() throws RecognitionException {
        try {
            int _type = VOIRAUSSI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:9:11: ( '$VOIRAUSSI' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:9:13: '$VOIRAUSSI'
            {
            match("$VOIRAUSSI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOIRAUSSI"

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:10:6: ( '$PAGE' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:10:8: '$PAGE'
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

    // $ANTLR start "ABOUT"
    public final void mABOUT() throws RecognitionException {
        try {
            int _type = ABOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:11:7: ( '$ABOUT' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:11:9: '$ABOUT'
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

    // $ANTLR start "AUTHOR"
    public final void mAUTHOR() throws RecognitionException {
        try {
            int _type = AUTHOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:12:9: ( '$AUTHOR' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:12:11: '$AUTHOR'
            {
            match("$AUTHOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTHOR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:13:8: ( ( '0' .. '9' )+ )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:13:10: ( '0' .. '9' )+
            {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:13:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:13:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "MOIS"
    public final void mMOIS() throws RecognitionException {
        try {
            int _type = MOIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:6: ( 'janvier' | 'f\\u00e9vrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'ao\\u00fbt' | 'septembre' | 'octobre' | 'novembre' | 'd\\u00e9cembre' )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:8: 'janvier'
                    {
                    match("janvier"); 


                    }
                    break;
                case 2 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:20: 'f\\u00e9vrier'
                    {
                    match("f\u00e9vrier"); 


                    }
                    break;
                case 3 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:37: 'mars'
                    {
                    match("mars"); 


                    }
                    break;
                case 4 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:46: 'avril'
                    {
                    match("avril"); 


                    }
                    break;
                case 5 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:56: 'mai'
                    {
                    match("mai"); 


                    }
                    break;
                case 6 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:64: 'juin'
                    {
                    match("juin"); 


                    }
                    break;
                case 7 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:73: 'juillet'
                    {
                    match("juillet"); 


                    }
                    break;
                case 8 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:85: 'ao\\u00fbt'
                    {
                    match("ao\u00fbt"); 


                    }
                    break;
                case 9 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:99: 'septembre'
                    {
                    match("septembre"); 


                    }
                    break;
                case 10 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:113: 'octobre'
                    {
                    match("octobre"); 


                    }
                    break;
                case 11 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:125: 'novembre'
                    {
                    match("novembre"); 


                    }
                    break;
                case 12 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:14:138: 'd\\u00e9cembre'
                    {
                    match("d\u00e9cembre"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOIS"

    // $ANTLR start "CONJ_AND"
    public final void mCONJ_AND() throws RecognitionException {
        try {
            int _type = CONJ_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:15:10: ( '$AND' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:15:12: '$AND'
            {
            match("$AND"); 


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
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:16:9: ( '$OR' )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:16:11: '$OR'
            {
            match("$OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ_OR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:5: ( ( ' ' | '\\t' | '\\r' | '$TRASH' ) | '\\n' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='$') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\n') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:7: ( ' ' | '\\t' | '\\r' | '$TRASH' )
                    {
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:7: ( ' ' | '\\t' | '\\r' | '$TRASH' )
                    int alt3=4;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt3=1;
                        }
                        break;
                    case '\t':
                        {
                        alt3=2;
                        }
                        break;
                    case '\r':
                        {
                        alt3=3;
                        }
                        break;
                    case '$':
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:8: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:27: '$TRASH'
                            {
                            match("$TRASH"); 


                            }
                            break;

                    }

                    skip();

                    }
                    break;
                case 2 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:18:49: '\\n'
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
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:19:6: ( ( '\\u0021' .. '\\u007E' | '\\u00C0' .. '\\u00FF' | 'a' .. 'z' )+ )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:19:8: ( '\\u0021' .. '\\u007E' | '\\u00C0' .. '\\u00FF' | 'a' .. 'z' )+
            {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:19:8: ( '\\u0021' .. '\\u007E' | '\\u00C0' .. '\\u00FF' | 'a' .. 'z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='!' && LA5_0<='~')||(LA5_0>='\u00C0' && LA5_0<='\u00FF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:
            	    {
            	    if ( (input.LA(1)>='!' && input.LA(1)<='~')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:8: ( SELECT | COUNT | UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI | PAGE | ABOUT | AUTHOR | NUMBER | MOIS | CONJ_AND | CONJ_OR | WS | VAR )
        int alt6=16;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:10: SELECT
                {
                mSELECT(); 

                }
                break;
            case 2 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:17: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 3 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:23: UNE
                {
                mUNE(); 

                }
                break;
            case 4 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:27: FOCUS
                {
                mFOCUS(); 

                }
                break;
            case 5 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:33: GROSTITRE
                {
                mGROSTITRE(); 

                }
                break;
            case 6 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:43: BREVE
                {
                mBREVE(); 

                }
                break;
            case 7 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:49: VOIRAUSSI
                {
                mVOIRAUSSI(); 

                }
                break;
            case 8 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:59: PAGE
                {
                mPAGE(); 

                }
                break;
            case 9 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:64: ABOUT
                {
                mABOUT(); 

                }
                break;
            case 10 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:70: AUTHOR
                {
                mAUTHOR(); 

                }
                break;
            case 11 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:77: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 12 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:84: MOIS
                {
                mMOIS(); 

                }
                break;
            case 13 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:89: CONJ_AND
                {
                mCONJ_AND(); 

                }
                break;
            case 14 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:98: CONJ_OR
                {
                mCONJ_OR(); 

                }
                break;
            case 15 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:106: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:1:109: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\23\uffff";
    static final String DFA2_eofS =
        "\23\uffff";
    static final String DFA2_minS =
        "\2\141\1\uffff\1\141\1\157\5\uffff\2\151\2\uffff\1\154\4\uffff";
    static final String DFA2_maxS =
        "\1\163\1\165\1\uffff\1\141\1\166\5\uffff\1\151\1\162\2\uffff\1\156"+
        "\4\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1"+
        "\uffff\1\3\1\5\1\6\1\7";
    static final String DFA2_specialS =
        "\23\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\2\uffff\1\10\1\uffff\1\2\3\uffff\1\1\2\uffff\1\3\1\7\1"+
            "\6\3\uffff\1\5",
            "\1\11\23\uffff\1\12",
            "",
            "\1\13",
            "\1\15\6\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\20\10\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "14:1: MOIS : ( 'janvier' | 'f\\u00e9vrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'ao\\u00fbt' | 'septembre' | 'octobre' | 'novembre' | 'd\\u00e9cembre' );";
        }
    }
    static final String DFA6_eotS =
        "\1\uffff\1\14\1\30\10\14\2\uffff\13\14\1\uffff\25\14\1\106\5\14"+
        "\1\115\10\14\1\126\7\14\1\136\1\uffff\2\14\1\115\2\14\1\115\1\uffff"+
        "\1\14\1\115\6\14\1\uffff\4\14\1\156\2\14\1\uffff\4\14\1\115\5\14"+
        "\1\172\1\173\1\14\1\175\1\14\1\uffff\1\177\1\14\1\13\7\14\1\u0088"+
        "\2\uffff\1\14\1\uffff\1\14\1\uffff\1\u008b\3\115\1\14\1\115\2\14"+
        "\1\uffff\2\14\1\uffff\1\14\2\115\2\14\1\115\1\u0094\1\u0095\2\uffff";
    static final String DFA6_eofS =
        "\u0096\uffff";
    static final String DFA6_minS =
        "\1\11\1\101\1\41\1\141\1\u00e9\1\141\1\157\1\145\1\143\1\157\1\u00e9"+
        "\2\uffff\1\105\1\117\1\116\1\117\2\122\1\117\1\101\1\102\2\122\1"+
        "\uffff\1\156\1\151\1\166\1\151\1\162\1\u00fb\1\160\1\164\1\166\1"+
        "\143\1\114\1\125\1\105\1\103\1\117\1\105\1\111\1\107\1\117\1\124"+
        "\1\104\1\41\1\101\1\166\1\154\1\162\1\163\1\41\1\151\2\164\1\157"+
        "\2\145\1\105\1\116\1\41\1\125\1\123\1\126\1\122\1\105\1\125\1\110"+
        "\1\41\1\uffff\1\123\1\151\1\41\1\154\1\151\1\41\1\uffff\1\154\1"+
        "\41\1\145\1\142\2\155\1\103\1\124\1\uffff\1\123\1\124\1\105\1\101"+
        "\1\41\1\124\1\117\1\uffff\1\110\3\145\1\41\1\155\1\162\2\142\1\124"+
        "\2\41\1\111\1\41\1\125\1\uffff\1\41\1\122\1\41\1\162\1\164\1\162"+
        "\1\142\1\145\2\162\1\41\2\uffff\1\124\1\uffff\1\123\1\uffff\4\41"+
        "\1\162\1\41\2\145\1\uffff\1\122\1\123\1\uffff\1\145\2\41\1\105\1"+
        "\111\3\41\2\uffff";
    static final String DFA6_maxS =
        "\1\u00ff\1\126\1\u00ff\1\165\1\u00e9\1\141\1\166\1\145\1\143\1\157"+
        "\1\u00e9\2\uffff\1\105\1\117\1\116\1\117\2\122\1\117\1\101\1\125"+
        "\2\122\1\uffff\1\156\1\151\1\166\2\162\1\u00fb\1\160\1\164\1\166"+
        "\1\143\1\114\1\125\1\105\1\103\1\117\1\105\1\111\1\107\1\117\1\124"+
        "\1\104\1\u00ff\1\101\1\166\1\156\1\162\1\163\1\u00ff\1\151\2\164"+
        "\1\157\2\145\1\105\1\116\1\u00ff\1\125\1\123\1\126\1\122\1\105\1"+
        "\125\1\110\1\u00ff\1\uffff\1\123\1\151\1\u00ff\1\154\1\151\1\u00ff"+
        "\1\uffff\1\154\1\u00ff\1\145\1\142\2\155\1\103\1\124\1\uffff\1\123"+
        "\1\124\1\105\1\101\1\u00ff\1\124\1\117\1\uffff\1\110\3\145\1\u00ff"+
        "\1\155\1\162\2\142\1\124\2\u00ff\1\111\1\u00ff\1\125\1\uffff\1\u00ff"+
        "\1\122\1\u00ff\1\162\1\164\1\162\1\142\1\145\2\162\1\u00ff\2\uffff"+
        "\1\124\1\uffff\1\123\1\uffff\4\u00ff\1\162\1\u00ff\2\145\1\uffff"+
        "\1\122\1\123\1\uffff\1\145\2\u00ff\1\105\1\111\3\u00ff\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\17\1\20\13\uffff\1\13\55\uffff\1\16\6\uffff\1\14\10"+
        "\uffff\1\3\7\uffff\1\15\17\uffff\1\10\13\uffff\1\2\1\4\1\uffff\1"+
        "\6\1\uffff\1\11\10\uffff\1\1\2\uffff\1\12\10\uffff\1\5\1\7";
    static final String DFA6_specialS =
        "\u0096\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\13\2\uffff\1\13\22\uffff\1\13\3\14\1\1\13\14\12\2\47\14\1"+
            "\6\2\14\1\12\1\14\1\4\3\14\1\3\2\14\1\5\1\11\1\10\3\14\1\7\13"+
            "\14\101\uffff\100\14",
            "\1\25\1\22\1\16\2\uffff\1\20\1\21\7\uffff\1\26\1\24\2\uffff"+
            "\1\15\1\27\1\17\1\23",
            "\17\14\12\2\105\14\101\uffff\100\14",
            "\1\31\23\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\36\6\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53\13\uffff\1\55\6\uffff\1\54",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\10\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\136\14\101\uffff\100\14",
            "\1\107",
            "\1\110",
            "\1\112\1\uffff\1\111",
            "\1\113",
            "\1\114",
            "\136\14\101\uffff\100\14",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\136\14\101\uffff\100\14",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\136\14\101\uffff\100\14",
            "",
            "\1\137",
            "\1\140",
            "\136\14\101\uffff\100\14",
            "\1\141",
            "\1\142",
            "\136\14\101\uffff\100\14",
            "",
            "\1\143",
            "\136\14\101\uffff\100\14",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\136\14\101\uffff\100\14",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\136\14\101\uffff\100\14",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\1\174",
            "\136\14\101\uffff\100\14",
            "\1\176",
            "",
            "\136\14\101\uffff\100\14",
            "\1\u0080",
            "\136\14\101\uffff\100\14",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\136\14\101\uffff\100\14",
            "",
            "",
            "\1\u0089",
            "",
            "\1\u008a",
            "",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\1\u008c",
            "\136\14\101\uffff\100\14",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\1\u0092",
            "\1\u0093",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "\136\14\101\uffff\100\14",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COUNT | UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI | PAGE | ABOUT | AUTHOR | NUMBER | MOIS | CONJ_AND | CONJ_OR | WS | VAR );";
        }
    }
 

}