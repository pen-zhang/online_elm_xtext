package org.xtext.online_elm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOnlineElmLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=4;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_NL=5;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalOnlineElmLexer() {;} 
    public InternalOnlineElmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOnlineElmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOnlineElm.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:11:7: ( 'myShapes' )
            // InternalOnlineElm.g:11:9: 'myShapes'
            {
            match("myShapes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:12:7: ( 'time' )
            // InternalOnlineElm.g:12:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:13:7: ( '=' )
            // InternalOnlineElm.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:14:7: ( '[' )
            // InternalOnlineElm.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:15:7: ( ',' )
            // InternalOnlineElm.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:16:7: ( ']' )
            // InternalOnlineElm.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:17:7: ( '++' )
            // InternalOnlineElm.g:17:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:18:7: ( '.' )
            // InternalOnlineElm.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:19:7: ( '|>' )
            // InternalOnlineElm.g:19:9: '|>'
            {
            match("|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:20:7: ( 'if' )
            // InternalOnlineElm.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:21:7: ( 'then' )
            // InternalOnlineElm.g:21:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:22:7: ( 'else' )
            // InternalOnlineElm.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:23:7: ( '(' )
            // InternalOnlineElm.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:24:7: ( ')' )
            // InternalOnlineElm.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:25:7: ( '||' )
            // InternalOnlineElm.g:25:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:26:7: ( '&&' )
            // InternalOnlineElm.g:26:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:27:7: ( 'not' )
            // InternalOnlineElm.g:27:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:28:7: ( '>=' )
            // InternalOnlineElm.g:28:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:29:7: ( '<=' )
            // InternalOnlineElm.g:29:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:30:7: ( '==' )
            // InternalOnlineElm.g:30:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:31:7: ( '!=' )
            // InternalOnlineElm.g:31:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:32:7: ( '>' )
            // InternalOnlineElm.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:33:7: ( '<' )
            // InternalOnlineElm.g:33:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:34:7: ( 'circle' )
            // InternalOnlineElm.g:34:9: 'circle'
            {
            match("circle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:35:7: ( 'rect' )
            // InternalOnlineElm.g:35:9: 'rect'
            {
            match("rect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:36:7: ( 'square' )
            // InternalOnlineElm.g:36:9: 'square'
            {
            match("square"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:37:7: ( 'roundedRect' )
            // InternalOnlineElm.g:37:9: 'roundedRect'
            {
            match("roundedRect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:38:7: ( 'oval' )
            // InternalOnlineElm.g:38:9: 'oval'
            {
            match("oval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:39:7: ( 'ngon' )
            // InternalOnlineElm.g:39:9: 'ngon'
            {
            match("ngon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:40:7: ( 'wedge' )
            // InternalOnlineElm.g:40:9: 'wedge'
            {
            match("wedge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:41:7: ( 'polygon' )
            // InternalOnlineElm.g:41:9: 'polygon'
            {
            match("polygon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:42:7: ( 'text' )
            // InternalOnlineElm.g:42:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:43:7: ( 'filled' )
            // InternalOnlineElm.g:43:9: 'filled'
            {
            match("filled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:44:7: ( 'addOutline' )
            // InternalOnlineElm.g:44:9: 'addOutline'
            {
            match("addOutline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:45:7: ( 'outlined' )
            // InternalOnlineElm.g:45:9: 'outlined'
            {
            match("outlined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:46:7: ( 'move' )
            // InternalOnlineElm.g:46:9: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:47:7: ( 'rotate' )
            // InternalOnlineElm.g:47:9: 'rotate'
            {
            match("rotate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:48:7: ( 'degrees' )
            // InternalOnlineElm.g:48:9: 'degrees'
            {
            match("degrees"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:49:7: ( 'scale' )
            // InternalOnlineElm.g:49:9: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:50:7: ( 'scaleX' )
            // InternalOnlineElm.g:50:9: 'scaleX'
            {
            match("scaleX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:51:7: ( 'scaleY' )
            // InternalOnlineElm.g:51:9: 'scaleY'
            {
            match("scaleY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:52:7: ( '+' )
            // InternalOnlineElm.g:52:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:53:7: ( '-' )
            // InternalOnlineElm.g:53:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:54:7: ( '*' )
            // InternalOnlineElm.g:54:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:55:7: ( '/' )
            // InternalOnlineElm.g:55:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:56:7: ( 'solid' )
            // InternalOnlineElm.g:56:9: 'solid'
            {
            match("solid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:57:7: ( 'dotted' )
            // InternalOnlineElm.g:57:9: 'dotted'
            {
            match("dotted"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:58:7: ( 'dashed' )
            // InternalOnlineElm.g:58:9: 'dashed'
            {
            match("dashed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:59:7: ( 'dotdash' )
            // InternalOnlineElm.g:59:9: 'dotdash'
            {
            match("dotdash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:60:7: ( 'longdash' )
            // InternalOnlineElm.g:60:9: 'longdash'
            {
            match("longdash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:61:7: ( 'black' )
            // InternalOnlineElm.g:61:9: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:62:7: ( 'blank' )
            // InternalOnlineElm.g:62:9: 'blank'
            {
            match("blank"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:63:7: ( 'blue' )
            // InternalOnlineElm.g:63:9: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:64:7: ( 'brown' )
            // InternalOnlineElm.g:64:9: 'brown'
            {
            match("brown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:65:7: ( 'charcoal' )
            // InternalOnlineElm.g:65:9: 'charcoal'
            {
            match("charcoal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:66:7: ( 'darkBlue' )
            // InternalOnlineElm.g:66:9: 'darkBlue'
            {
            match("darkBlue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:67:7: ( 'darkBrown' )
            // InternalOnlineElm.g:67:9: 'darkBrown'
            {
            match("darkBrown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:68:7: ( 'darkGray' )
            // InternalOnlineElm.g:68:9: 'darkGray'
            {
            match("darkGray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:69:7: ( 'darkGreen' )
            // InternalOnlineElm.g:69:9: 'darkGreen'
            {
            match("darkGreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:70:7: ( 'darkGrey' )
            // InternalOnlineElm.g:70:9: 'darkGrey'
            {
            match("darkGrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:71:7: ( 'darkOrange' )
            // InternalOnlineElm.g:71:9: 'darkOrange'
            {
            match("darkOrange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:72:7: ( 'darkPurple' )
            // InternalOnlineElm.g:72:9: 'darkPurple'
            {
            match("darkPurple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:73:7: ( 'darkRed' )
            // InternalOnlineElm.g:73:9: 'darkRed'
            {
            match("darkRed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:74:7: ( 'darkYellow' )
            // InternalOnlineElm.g:74:9: 'darkYellow'
            {
            match("darkYellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:75:7: ( 'gray' )
            // InternalOnlineElm.g:75:9: 'gray'
            {
            match("gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:76:7: ( 'green' )
            // InternalOnlineElm.g:76:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:77:7: ( 'grey' )
            // InternalOnlineElm.g:77:9: 'grey'
            {
            match("grey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:78:7: ( 'hotPink' )
            // InternalOnlineElm.g:78:9: 'hotPink'
            {
            match("hotPink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:79:7: ( 'lightBlue' )
            // InternalOnlineElm.g:79:9: 'lightBlue'
            {
            match("lightBlue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:80:7: ( 'lightBrown' )
            // InternalOnlineElm.g:80:9: 'lightBrown'
            {
            match("lightBrown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:81:7: ( 'lightCharcoal' )
            // InternalOnlineElm.g:81:9: 'lightCharcoal'
            {
            match("lightCharcoal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:82:7: ( 'lightGray' )
            // InternalOnlineElm.g:82:9: 'lightGray'
            {
            match("lightGray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:83:7: ( 'lightGreen' )
            // InternalOnlineElm.g:83:9: 'lightGreen'
            {
            match("lightGreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:84:7: ( 'lightGrey' )
            // InternalOnlineElm.g:84:9: 'lightGrey'
            {
            match("lightGrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:85:7: ( 'lightOrange' )
            // InternalOnlineElm.g:85:9: 'lightOrange'
            {
            match("lightOrange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:86:7: ( 'lightPurple' )
            // InternalOnlineElm.g:86:9: 'lightPurple'
            {
            match("lightPurple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:87:7: ( 'lightRed' )
            // InternalOnlineElm.g:87:9: 'lightRed'
            {
            match("lightRed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:88:7: ( 'lightYellow' )
            // InternalOnlineElm.g:88:9: 'lightYellow'
            {
            match("lightYellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:89:7: ( 'orange' )
            // InternalOnlineElm.g:89:9: 'orange'
            {
            match("orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:90:7: ( 'pink' )
            // InternalOnlineElm.g:90:9: 'pink'
            {
            match("pink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:91:7: ( 'purple' )
            // InternalOnlineElm.g:91:9: 'purple'
            {
            match("purple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:92:7: ( 'red' )
            // InternalOnlineElm.g:92:9: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:93:7: ( 'white' )
            // InternalOnlineElm.g:93:9: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:94:7: ( 'yellow' )
            // InternalOnlineElm.g:94:9: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:3834:12: ( ( RULE_INT ( '.' RULE_INT )? | '(' '-' RULE_INT ( '.' RULE_INT )? ')' ) )
            // InternalOnlineElm.g:3834:14: ( RULE_INT ( '.' RULE_INT )? | '(' '-' RULE_INT ( '.' RULE_INT )? ')' )
            {
            // InternalOnlineElm.g:3834:14: ( RULE_INT ( '.' RULE_INT )? | '(' '-' RULE_INT ( '.' RULE_INT )? ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='(') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOnlineElm.g:3834:15: RULE_INT ( '.' RULE_INT )?
                    {
                    mRULE_INT(); 
                    // InternalOnlineElm.g:3834:24: ( '.' RULE_INT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='.') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalOnlineElm.g:3834:25: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3834:40: '(' '-' RULE_INT ( '.' RULE_INT )? ')'
                    {
                    match('('); 
                    match('-'); 
                    mRULE_INT(); 
                    // InternalOnlineElm.g:3834:57: ( '.' RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='.') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalOnlineElm.g:3834:58: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match(')'); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_FQN"
    public final void mRULE_FQN() throws RecognitionException {
        try {
            int _type = RULE_FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:3836:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOnlineElm.g:3836:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // InternalOnlineElm.g:3836:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOnlineElm.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:3838:9: ( ( ( '\\r' )? '\\n' ( ' ' )* )+ )
            // InternalOnlineElm.g:3838:11: ( ( '\\r' )? '\\n' ( ' ' )* )+
            {
            // InternalOnlineElm.g:3838:11: ( ( '\\r' )? '\\n' ( ' ' )* )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOnlineElm.g:3838:12: ( '\\r' )? '\\n' ( ' ' )*
            	    {
            	    // InternalOnlineElm.g:3838:12: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalOnlineElm.g:3838:12: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 
            	    // InternalOnlineElm.g:3838:23: ( ' ' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==' ') ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalOnlineElm.g:3838:23: ' '
            	    	    {
            	    	    match(' '); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:3840:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOnlineElm.g:3840:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOnlineElm.g:3840:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOnlineElm.g:3840:11: '^'
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

            // InternalOnlineElm.g:3840:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOnlineElm.g:
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
            	    break loop9;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalOnlineElm.g:3842:19: ( ( '0' .. '9' )+ )
            // InternalOnlineElm.g:3842:21: ( '0' .. '9' )+
            {
            // InternalOnlineElm.g:3842:21: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOnlineElm.g:3842:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOnlineElm.g:3844:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOnlineElm.g:3844:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOnlineElm.g:3844:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOnlineElm.g:3844:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOnlineElm.g:3844:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalOnlineElm.g:3844:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOnlineElm.g:3844:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3844:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOnlineElm.g:3844:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOnlineElm.g:3844:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOnlineElm.g:3844:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // InternalOnlineElm.g:3846:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOnlineElm.g:3846:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOnlineElm.g:3846:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOnlineElm.g:3846:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalOnlineElm.g:3848:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOnlineElm.g:3848:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOnlineElm.g:3848:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOnlineElm.g:3848:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalOnlineElm.g:3848:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOnlineElm.g:3848:41: ( '\\r' )? '\\n'
                    {
                    // InternalOnlineElm.g:3848:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalOnlineElm.g:3848:41: '\\r'
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
            // InternalOnlineElm.g:3850:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOnlineElm.g:3850:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOnlineElm.g:3850:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOnlineElm.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalOnlineElm.g:3852:16: ( . )
            // InternalOnlineElm.g:3852:18: .
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
        // InternalOnlineElm.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_FLOAT | RULE_FQN | RULE_NL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=93;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalOnlineElm.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalOnlineElm.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalOnlineElm.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalOnlineElm.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalOnlineElm.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalOnlineElm.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalOnlineElm.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalOnlineElm.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalOnlineElm.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalOnlineElm.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalOnlineElm.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalOnlineElm.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalOnlineElm.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalOnlineElm.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalOnlineElm.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalOnlineElm.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalOnlineElm.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalOnlineElm.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalOnlineElm.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalOnlineElm.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalOnlineElm.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalOnlineElm.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalOnlineElm.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalOnlineElm.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalOnlineElm.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalOnlineElm.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalOnlineElm.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalOnlineElm.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalOnlineElm.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalOnlineElm.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalOnlineElm.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalOnlineElm.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalOnlineElm.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalOnlineElm.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalOnlineElm.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalOnlineElm.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalOnlineElm.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalOnlineElm.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalOnlineElm.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalOnlineElm.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalOnlineElm.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalOnlineElm.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalOnlineElm.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalOnlineElm.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalOnlineElm.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalOnlineElm.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalOnlineElm.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalOnlineElm.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalOnlineElm.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalOnlineElm.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalOnlineElm.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalOnlineElm.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalOnlineElm.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalOnlineElm.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalOnlineElm.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalOnlineElm.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalOnlineElm.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalOnlineElm.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalOnlineElm.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalOnlineElm.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalOnlineElm.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalOnlineElm.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalOnlineElm.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalOnlineElm.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalOnlineElm.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalOnlineElm.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalOnlineElm.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalOnlineElm.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalOnlineElm.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalOnlineElm.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalOnlineElm.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalOnlineElm.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalOnlineElm.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalOnlineElm.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalOnlineElm.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalOnlineElm.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalOnlineElm.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalOnlineElm.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalOnlineElm.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalOnlineElm.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalOnlineElm.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalOnlineElm.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalOnlineElm.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalOnlineElm.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalOnlineElm.g:1:514: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 86 :
                // InternalOnlineElm.g:1:525: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 87 :
                // InternalOnlineElm.g:1:534: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 88 :
                // InternalOnlineElm.g:1:542: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // InternalOnlineElm.g:1:550: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // InternalOnlineElm.g:1:562: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // InternalOnlineElm.g:1:578: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // InternalOnlineElm.g:1:594: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // InternalOnlineElm.g:1:602: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\2\60\1\66\3\uffff\1\73\1\uffff\1\55\2\60\1\102\1\uffff\1\55\1\60\1\110\1\112\1\55\11\60\2\uffff\1\144\5\60\1\uffff\1\60\1\154\1\156\1\55\1\uffff\2\55\2\uffff\2\60\1\uffff\4\60\12\uffff\1\170\1\60\4\uffff\2\60\5\uffff\24\60\5\uffff\7\60\1\uffff\1\156\1\uffff\1\156\1\154\2\uffff\5\60\1\uffff\1\60\1\u00a2\4\60\1\u00a7\35\60\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\uffff\1\u00cd\2\60\1\u00d0\1\uffff\5\60\1\u00d6\5\60\1\u00dc\14\60\1\u00ee\1\60\1\u00f0\1\60\1\u00f2\3\60\6\uffff\2\60\1\uffff\3\60\1\u00fd\1\u00fe\1\uffff\2\60\1\u0101\1\u0102\1\60\1\uffff\17\60\1\u011a\1\u011b\1\uffff\1\u011c\1\uffff\1\u011d\1\uffff\3\60\1\u0121\2\60\1\u0124\1\u0125\1\u0126\1\u0127\2\uffff\1\60\1\u0129\2\uffff\1\60\1\u012b\1\u012c\2\60\1\u012f\1\60\1\u0131\17\60\4\uffff\1\60\1\u0144\1\60\1\uffff\2\60\4\uffff\1\60\1\uffff\1\u0149\2\uffff\1\60\1\u014b\1\uffff\1\u014c\1\uffff\6\60\1\u0154\12\60\1\u0160\1\uffff\1\u0161\1\u0162\1\60\1\u0164\1\uffff\1\60\2\uffff\1\u0166\1\60\1\u0168\1\60\1\u016a\2\60\1\uffff\1\60\1\u016e\7\60\1\u0177\1\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\u017b\1\uffff\1\u017c\1\uffff\3\60\1\uffff\1\u0180\2\60\1\u0183\1\60\1\u0185\2\60\1\uffff\2\60\1\u018a\2\uffff\1\u018b\1\u018c\1\u018d\1\uffff\1\u018e\1\60\1\uffff\1\u0190\1\uffff\3\60\1\u0194\5\uffff\1\60\1\uffff\1\u0196\1\u0197\1\u0198\1\uffff\1\60\3\uffff\1\u019a\1\uffff";
    static final String DFA19_eofS =
        "\u019b\uffff";
    static final String DFA19_minS =
        "\1\0\2\60\1\75\3\uffff\1\53\1\uffff\1\76\2\60\1\55\1\uffff\1\46\1\60\3\75\11\60\2\uffff\1\52\5\60\1\uffff\1\60\1\12\1\11\1\101\1\uffff\2\0\2\uffff\2\60\1\uffff\4\60\12\uffff\2\60\4\uffff\2\60\5\uffff\24\60\5\uffff\7\60\1\uffff\1\11\1\uffff\1\11\1\12\2\uffff\5\60\1\uffff\51\60\1\uffff\4\60\1\uffff\40\60\6\uffff\2\60\1\uffff\5\60\1\uffff\5\60\1\uffff\21\60\1\uffff\1\60\1\uffff\1\60\1\uffff\12\60\2\uffff\2\60\2\uffff\27\60\4\uffff\3\60\1\uffff\2\60\4\uffff\1\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\uffff\22\60\1\uffff\4\60\1\uffff\1\60\2\uffff\7\60\1\uffff\13\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff\10\60\1\uffff\3\60\2\uffff\3\60\1\uffff\2\60\1\uffff\1\60\1\uffff\4\60\5\uffff\1\60\1\uffff\3\60\1\uffff\1\60\3\uffff\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\2\172\1\75\3\uffff\1\53\1\uffff\1\174\2\172\1\55\1\uffff\1\46\1\172\3\75\11\172\2\uffff\1\57\5\172\1\uffff\1\172\1\12\1\40\1\172\1\uffff\2\uffff\2\uffff\2\172\1\uffff\4\172\12\uffff\2\172\4\uffff\2\172\5\uffff\24\172\5\uffff\7\172\1\uffff\1\40\1\uffff\1\40\1\12\2\uffff\5\172\1\uffff\51\172\1\uffff\4\172\1\uffff\40\172\6\uffff\2\172\1\uffff\5\172\1\uffff\5\172\1\uffff\21\172\1\uffff\1\172\1\uffff\1\172\1\uffff\12\172\2\uffff\2\172\2\uffff\27\172\4\uffff\3\172\1\uffff\2\172\4\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff\22\172\1\uffff\4\172\1\uffff\1\172\2\uffff\7\172\1\uffff\13\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\10\172\1\uffff\3\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\4\172\5\uffff\1\172\1\uffff\3\172\1\uffff\1\172\3\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\uffff\1\10\4\uffff\1\16\16\uffff\1\53\1\54\6\uffff\1\125\4\uffff\1\130\2\uffff\1\134\1\135\2\uffff\1\126\4\uffff\1\24\1\3\1\4\1\5\1\6\1\7\1\52\1\10\1\11\1\17\2\uffff\1\125\1\15\1\16\1\20\2\uffff\1\22\1\26\1\23\1\27\1\25\24\uffff\1\53\1\54\1\132\1\133\1\55\7\uffff\1\134\1\uffff\1\127\2\uffff\1\130\1\131\5\uffff\1\12\51\uffff\1\21\4\uffff\1\122\40\uffff\1\44\1\2\1\13\1\40\1\14\1\35\2\uffff\1\31\5\uffff\1\34\5\uffff\1\120\21\uffff\1\65\1\uffff\1\101\1\uffff\1\103\12\uffff\1\47\1\56\2\uffff\1\36\1\123\27\uffff\1\63\1\64\1\66\1\102\3\uffff\1\30\2\uffff\1\45\1\32\1\50\1\51\1\uffff\1\117\1\uffff\1\121\1\41\2\uffff\1\57\1\uffff\1\60\22\uffff\1\124\4\uffff\1\37\1\uffff\1\46\1\61\7\uffff\1\77\13\uffff\1\104\1\1\1\67\1\uffff\1\43\1\uffff\1\70\1\uffff\1\72\1\uffff\1\74\3\uffff\1\62\10\uffff\1\115\3\uffff\1\71\1\73\3\uffff\1\105\2\uffff\1\110\1\uffff\1\112\4\uffff\1\42\1\75\1\76\1\100\1\106\1\uffff\1\111\3\uffff\1\33\1\uffff\1\113\1\114\1\116\1\uffff\1\107";
    static final String DFA19_specialS =
        "\1\0\51\uffff\1\1\1\2\u016f\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\55\1\54\1\47\2\55\1\46\22\55\1\54\1\22\1\52\3\55\1\16\1\53\1\14\1\15\1\35\1\7\1\5\1\34\1\10\1\36\12\44\2\55\1\21\1\3\1\20\2\55\32\51\1\4\1\55\1\6\1\50\1\51\1\55\1\32\1\40\1\23\1\33\1\13\1\31\1\41\1\42\1\12\2\45\1\37\1\1\1\17\1\26\1\30\1\45\1\24\1\25\1\2\2\45\1\27\1\45\1\43\1\45\1\55\1\11\uff83\55",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\57\11\61\1\56\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\64\2\61\1\63\1\62\21\61",
            "\1\65",
            "",
            "",
            "",
            "\1\72",
            "",
            "\1\75\75\uffff\1\76",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\77\24\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\100\16\61",
            "\1\101",
            "",
            "\1\104",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\106\7\61\1\105\13\61",
            "\1\107",
            "\1\111",
            "\1\113",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\115\1\114\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\116\11\61\1\117\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\121\13\61\1\122\1\61\1\120\11\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\125\2\61\1\124\1\123\4\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\126\2\61\1\127\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\131\5\61\1\130\5\61\1\132\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\133\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\134\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\137\3\61\1\135\11\61\1\136\13\61",
            "",
            "",
            "\1\142\4\uffff\1\143",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\146\5\61\1\145\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\147\5\61\1\150\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\151\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\152\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\153\25\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\155",
            "\1\154\1\155\2\uffff\1\160\22\uffff\1\157",
            "\32\161\4\uffff\1\161\1\uffff\32\161",
            "",
            "\0\162",
            "\0\162",
            "",
            "",
            "\12\61\7\uffff\22\61\1\163\7\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\164\4\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\165\15\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\166\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\27\61\1\167\2\61",
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
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\171\7\61",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\172\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\173\13\61",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\174\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\175\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\176\1\177\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0081\1\u0080\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0082\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0083\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0084\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0085\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0086\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0087\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0088\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0089\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u008a\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u008b\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u008c\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u008d\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u008e\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u008f\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0090\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0092\1\u0091\7\61",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0093\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0094\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0095\23\61\1\u0096\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0097\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0098\3\61\1\u0099\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u009a\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u009b\16\61",
            "",
            "\1\154\1\155\2\uffff\1\160\22\uffff\1\157",
            "",
            "\1\154\1\155\2\uffff\1\160\22\uffff\1\157",
            "\1\155",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u009c\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u009d\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u009e\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u009f\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00a0\6\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00a1\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00a3\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00a4\27\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00a5\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00a6\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00a8\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00a9\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00aa\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00ab\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00ac\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00ad\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00ae\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00af\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u00b0\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00b1\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u00b2\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u00b3\17\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u00b4\12\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00b5\16\61",
            "\12\61\7\uffff\16\61\1\u00b6\13\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00b7\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00b9\17\61\1\u00b8\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u00ba\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u00bb\17\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u00bc\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u00bd\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00be\12\61\1\u00bf\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00c0\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u00c1\3\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u00c2\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00c3\23\61\1\u00c4\1\61",
            "\12\61\7\uffff\17\61\1\u00c5\12\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00c6\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00c7\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00ce\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00cf\27\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00d1\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00d2\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00d3\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d4\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00d5\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00d7\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u00d8\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d9\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00da\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u00db\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00dd\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00de\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00df\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e0\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e1\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00e2\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e3\25\61",
            "\12\61\7\uffff\1\61\1\u00e4\4\61\1\u00e5\7\61\1\u00e6\1\u00e7\1\61\1\u00e8\6\61\1\u00e9\1\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00ea\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00eb\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u00ec\17\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u00ed\17\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00ef\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00f1\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00f3\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00f4\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u00f5\12\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00f6\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00f7\13\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00f8\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00f9\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00fa\25\61",
            "\12\61\7\uffff\27\61\1\u00fb\1\u00fc\1\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00ff\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0100\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0103\13\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0104\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0105\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0106\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0107\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0108\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0109\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u010a\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u010b\5\61\1\u010c\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u010d\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u010e\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u010f\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0110\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0111\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0112\31\61",
            "\12\61\7\uffff\1\61\1\u0113\1\u0114\3\61\1\u0115\7\61\1\u0116\1\u0117\1\61\1\u0118\6\61\1\u0119\1\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u011e\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u011f\3\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0120\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0122\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0123\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0128\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u012a\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u012d\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u012e\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u0130\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0132\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0133\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0134\3\61\1\u0135\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0136\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0137\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0138\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0139\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u013a\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u013b\5\61\1\u013c\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u013d\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u013e\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u013f\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0140\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0141\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0142\25\61",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\12\61\1\u0143\17\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0145\7\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0146\16\61",
            "\12\61\7\uffff\21\61\1\u0147\10\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0148\26\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u014a\21\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u014d\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u014e\3\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u014f\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0150\23\61\1\u0151\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0152\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0153\12\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0155\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u0156\22\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0157\5\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0158\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0159\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u015a\3\61\1\u015b\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u015c\31\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u015d\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u015e\26\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u015f\16\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0163\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0165\14\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0167\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0169\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u016b\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u016c\16\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u016d\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u016f\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u0170\3\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0171\10\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u0172\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0173\23\61\1\u0174\1\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0175\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0176\12\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0178\16\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u0179\27\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u017a\25\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u017d\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u017e\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u017f\3\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0181\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u0182\27\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0184\14\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0186\23\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0187\16\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0188\13\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0189\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u018f\13\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0191\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0192\25\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u0193\3\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0195\31\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0199\16\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_FLOAT | RULE_FQN | RULE_NL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='m') ) {s = 1;}

                        else if ( (LA19_0=='t') ) {s = 2;}

                        else if ( (LA19_0=='=') ) {s = 3;}

                        else if ( (LA19_0=='[') ) {s = 4;}

                        else if ( (LA19_0==',') ) {s = 5;}

                        else if ( (LA19_0==']') ) {s = 6;}

                        else if ( (LA19_0=='+') ) {s = 7;}

                        else if ( (LA19_0=='.') ) {s = 8;}

                        else if ( (LA19_0=='|') ) {s = 9;}

                        else if ( (LA19_0=='i') ) {s = 10;}

                        else if ( (LA19_0=='e') ) {s = 11;}

                        else if ( (LA19_0=='(') ) {s = 12;}

                        else if ( (LA19_0==')') ) {s = 13;}

                        else if ( (LA19_0=='&') ) {s = 14;}

                        else if ( (LA19_0=='n') ) {s = 15;}

                        else if ( (LA19_0=='>') ) {s = 16;}

                        else if ( (LA19_0=='<') ) {s = 17;}

                        else if ( (LA19_0=='!') ) {s = 18;}

                        else if ( (LA19_0=='c') ) {s = 19;}

                        else if ( (LA19_0=='r') ) {s = 20;}

                        else if ( (LA19_0=='s') ) {s = 21;}

                        else if ( (LA19_0=='o') ) {s = 22;}

                        else if ( (LA19_0=='w') ) {s = 23;}

                        else if ( (LA19_0=='p') ) {s = 24;}

                        else if ( (LA19_0=='f') ) {s = 25;}

                        else if ( (LA19_0=='a') ) {s = 26;}

                        else if ( (LA19_0=='d') ) {s = 27;}

                        else if ( (LA19_0=='-') ) {s = 28;}

                        else if ( (LA19_0=='*') ) {s = 29;}

                        else if ( (LA19_0=='/') ) {s = 30;}

                        else if ( (LA19_0=='l') ) {s = 31;}

                        else if ( (LA19_0=='b') ) {s = 32;}

                        else if ( (LA19_0=='g') ) {s = 33;}

                        else if ( (LA19_0=='h') ) {s = 34;}

                        else if ( (LA19_0=='y') ) {s = 35;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 36;}

                        else if ( ((LA19_0>='j' && LA19_0<='k')||LA19_0=='q'||(LA19_0>='u' && LA19_0<='v')||LA19_0=='x'||LA19_0=='z') ) {s = 37;}

                        else if ( (LA19_0=='\r') ) {s = 38;}

                        else if ( (LA19_0=='\n') ) {s = 39;}

                        else if ( (LA19_0=='^') ) {s = 40;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_') ) {s = 41;}

                        else if ( (LA19_0=='\"') ) {s = 42;}

                        else if ( (LA19_0=='\'') ) {s = 43;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 44;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='#' && LA19_0<='%')||(LA19_0>=':' && LA19_0<=';')||(LA19_0>='?' && LA19_0<='@')||LA19_0=='\\'||LA19_0=='`'||LA19_0=='{'||(LA19_0>='}' && LA19_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_42 = input.LA(1);

                        s = -1;
                        if ( ((LA19_42>='\u0000' && LA19_42<='\uFFFF')) ) {s = 114;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_43 = input.LA(1);

                        s = -1;
                        if ( ((LA19_43>='\u0000' && LA19_43<='\uFFFF')) ) {s = 114;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}