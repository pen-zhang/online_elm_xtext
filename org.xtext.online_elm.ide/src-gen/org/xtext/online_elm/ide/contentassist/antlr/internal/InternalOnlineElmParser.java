package org.xtext.online_elm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOnlineElmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_FQN", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'time'", "'>='", "'<='", "'=='", "'!='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'solid'", "'dotted'", "'dashed'", "'dotdash'", "'longdash'", "'black'", "'blank'", "'blue'", "'brown'", "'charcoal'", "'darkBlue'", "'darkBrown'", "'darkGray'", "'darkGreen'", "'darkGrey'", "'darkOrange'", "'darkPurple'", "'darkRed'", "'darkYellow'", "'gray'", "'green'", "'grey'", "'hotPink'", "'lightBlue'", "'lightBrown'", "'lightCharcoal'", "'lightGray'", "'lightGreen'", "'lightGrey'", "'lightOrange'", "'lightPurple'", "'lightRed'", "'lightYellow'", "'orange'", "'pink'", "'purple'", "'red'", "'white'", "'yellow'", "'='", "'['", "']'", "','", "'++'", "'.'", "'|>'", "'if'", "'then'", "'else'", "'('", "')'", "'||'", "'&&'", "'not'", "'addOutline'", "'degrees'", "'myShapes'", "'circle'", "'rect'", "'square'", "'roundedRect'", "'oval'", "'ngon'", "'wedge'", "'polygon'", "'text'", "'filled'", "'outlined'", "'move'", "'rotate'", "'scale'", "'scaleX'", "'scaleY'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=5;
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
    public static final int RULE_NL=4;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalOnlineElmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOnlineElmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOnlineElmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOnlineElm.g"; }


    	private OnlineElmGrammarAccess grammarAccess;

    	public void setGrammarAccess(OnlineElmGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleOnlineElm"
    // InternalOnlineElm.g:53:1: entryRuleOnlineElm : ruleOnlineElm EOF ;
    public final void entryRuleOnlineElm() throws RecognitionException {
        try {
            // InternalOnlineElm.g:54:1: ( ruleOnlineElm EOF )
            // InternalOnlineElm.g:55:1: ruleOnlineElm EOF
            {
             before(grammarAccess.getOnlineElmRule()); 
            pushFollow(FOLLOW_1);
            ruleOnlineElm();

            state._fsp--;

             after(grammarAccess.getOnlineElmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnlineElm"


    // $ANTLR start "ruleOnlineElm"
    // InternalOnlineElm.g:62:1: ruleOnlineElm : ( ( rule__OnlineElm__Group__0 ) ) ;
    public final void ruleOnlineElm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:66:2: ( ( ( rule__OnlineElm__Group__0 ) ) )
            // InternalOnlineElm.g:67:2: ( ( rule__OnlineElm__Group__0 ) )
            {
            // InternalOnlineElm.g:67:2: ( ( rule__OnlineElm__Group__0 ) )
            // InternalOnlineElm.g:68:3: ( rule__OnlineElm__Group__0 )
            {
             before(grammarAccess.getOnlineElmAccess().getGroup()); 
            // InternalOnlineElm.g:69:3: ( rule__OnlineElm__Group__0 )
            // InternalOnlineElm.g:69:4: rule__OnlineElm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlineElmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnlineElm"


    // $ANTLR start "entryRuleMainShape"
    // InternalOnlineElm.g:78:1: entryRuleMainShape : ruleMainShape EOF ;
    public final void entryRuleMainShape() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:82:1: ( ruleMainShape EOF )
            // InternalOnlineElm.g:83:1: ruleMainShape EOF
            {
             before(grammarAccess.getMainShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleMainShape();

            state._fsp--;

             after(grammarAccess.getMainShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleMainShape"


    // $ANTLR start "ruleMainShape"
    // InternalOnlineElm.g:93:1: ruleMainShape : ( ( rule__MainShape__Group__0 ) ) ;
    public final void ruleMainShape() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:98:2: ( ( ( rule__MainShape__Group__0 ) ) )
            // InternalOnlineElm.g:99:2: ( ( rule__MainShape__Group__0 ) )
            {
            // InternalOnlineElm.g:99:2: ( ( rule__MainShape__Group__0 ) )
            // InternalOnlineElm.g:100:3: ( rule__MainShape__Group__0 )
            {
             before(grammarAccess.getMainShapeAccess().getGroup()); 
            // InternalOnlineElm.g:101:3: ( rule__MainShape__Group__0 )
            // InternalOnlineElm.g:101:4: rule__MainShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleMainShape"


    // $ANTLR start "entryRuleShapeDef"
    // InternalOnlineElm.g:111:1: entryRuleShapeDef : ruleShapeDef EOF ;
    public final void entryRuleShapeDef() throws RecognitionException {
        try {
            // InternalOnlineElm.g:112:1: ( ruleShapeDef EOF )
            // InternalOnlineElm.g:113:1: ruleShapeDef EOF
            {
             before(grammarAccess.getShapeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeDef();

            state._fsp--;

             after(grammarAccess.getShapeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeDef"


    // $ANTLR start "ruleShapeDef"
    // InternalOnlineElm.g:120:1: ruleShapeDef : ( ( rule__ShapeDef__Alternatives ) ) ;
    public final void ruleShapeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:124:2: ( ( ( rule__ShapeDef__Alternatives ) ) )
            // InternalOnlineElm.g:125:2: ( ( rule__ShapeDef__Alternatives ) )
            {
            // InternalOnlineElm.g:125:2: ( ( rule__ShapeDef__Alternatives ) )
            // InternalOnlineElm.g:126:3: ( rule__ShapeDef__Alternatives )
            {
             before(grammarAccess.getShapeDefAccess().getAlternatives()); 
            // InternalOnlineElm.g:127:3: ( rule__ShapeDef__Alternatives )
            // InternalOnlineElm.g:127:4: rule__ShapeDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeDef"


    // $ANTLR start "entryRuleLocal_var"
    // InternalOnlineElm.g:136:1: entryRuleLocal_var : ruleLocal_var EOF ;
    public final void entryRuleLocal_var() throws RecognitionException {
        try {
            // InternalOnlineElm.g:137:1: ( ruleLocal_var EOF )
            // InternalOnlineElm.g:138:1: ruleLocal_var EOF
            {
             before(grammarAccess.getLocal_varRule()); 
            pushFollow(FOLLOW_1);
            ruleLocal_var();

            state._fsp--;

             after(grammarAccess.getLocal_varRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocal_var"


    // $ANTLR start "ruleLocal_var"
    // InternalOnlineElm.g:145:1: ruleLocal_var : ( ( rule__Local_var__Group__0 ) ) ;
    public final void ruleLocal_var() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:149:2: ( ( ( rule__Local_var__Group__0 ) ) )
            // InternalOnlineElm.g:150:2: ( ( rule__Local_var__Group__0 ) )
            {
            // InternalOnlineElm.g:150:2: ( ( rule__Local_var__Group__0 ) )
            // InternalOnlineElm.g:151:3: ( rule__Local_var__Group__0 )
            {
             before(grammarAccess.getLocal_varAccess().getGroup()); 
            // InternalOnlineElm.g:152:3: ( rule__Local_var__Group__0 )
            // InternalOnlineElm.g:152:4: rule__Local_var__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Local_var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocal_varAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocal_var"


    // $ANTLR start "entryRuleRef_var"
    // InternalOnlineElm.g:161:1: entryRuleRef_var : ruleRef_var EOF ;
    public final void entryRuleRef_var() throws RecognitionException {
        try {
            // InternalOnlineElm.g:162:1: ( ruleRef_var EOF )
            // InternalOnlineElm.g:163:1: ruleRef_var EOF
            {
             before(grammarAccess.getRef_varRule()); 
            pushFollow(FOLLOW_1);
            ruleRef_var();

            state._fsp--;

             after(grammarAccess.getRef_varRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRef_var"


    // $ANTLR start "ruleRef_var"
    // InternalOnlineElm.g:170:1: ruleRef_var : ( ( rule__Ref_var__Alternatives ) ) ;
    public final void ruleRef_var() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:174:2: ( ( ( rule__Ref_var__Alternatives ) ) )
            // InternalOnlineElm.g:175:2: ( ( rule__Ref_var__Alternatives ) )
            {
            // InternalOnlineElm.g:175:2: ( ( rule__Ref_var__Alternatives ) )
            // InternalOnlineElm.g:176:3: ( rule__Ref_var__Alternatives )
            {
             before(grammarAccess.getRef_varAccess().getAlternatives()); 
            // InternalOnlineElm.g:177:3: ( rule__Ref_var__Alternatives )
            // InternalOnlineElm.g:177:4: rule__Ref_var__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ref_var__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRef_varAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRef_var"


    // $ANTLR start "entryRuleShapeList"
    // InternalOnlineElm.g:186:1: entryRuleShapeList : ruleShapeList EOF ;
    public final void entryRuleShapeList() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:190:1: ( ruleShapeList EOF )
            // InternalOnlineElm.g:191:1: ruleShapeList EOF
            {
             before(grammarAccess.getShapeListRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeList();

            state._fsp--;

             after(grammarAccess.getShapeListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleShapeList"


    // $ANTLR start "ruleShapeList"
    // InternalOnlineElm.g:201:1: ruleShapeList : ( ( rule__ShapeList__Group__0 ) ) ;
    public final void ruleShapeList() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:206:2: ( ( ( rule__ShapeList__Group__0 ) ) )
            // InternalOnlineElm.g:207:2: ( ( rule__ShapeList__Group__0 ) )
            {
            // InternalOnlineElm.g:207:2: ( ( rule__ShapeList__Group__0 ) )
            // InternalOnlineElm.g:208:3: ( rule__ShapeList__Group__0 )
            {
             before(grammarAccess.getShapeListAccess().getGroup()); 
            // InternalOnlineElm.g:209:3: ( rule__ShapeList__Group__0 )
            // InternalOnlineElm.g:209:4: rule__ShapeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleShapeList"


    // $ANTLR start "entryRuleBasicShape"
    // InternalOnlineElm.g:219:1: entryRuleBasicShape : ruleBasicShape EOF ;
    public final void entryRuleBasicShape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:220:1: ( ruleBasicShape EOF )
            // InternalOnlineElm.g:221:1: ruleBasicShape EOF
            {
             before(grammarAccess.getBasicShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicShape();

            state._fsp--;

             after(grammarAccess.getBasicShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicShape"


    // $ANTLR start "ruleBasicShape"
    // InternalOnlineElm.g:228:1: ruleBasicShape : ( ( rule__BasicShape__Group__0 ) ) ;
    public final void ruleBasicShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:232:2: ( ( ( rule__BasicShape__Group__0 ) ) )
            // InternalOnlineElm.g:233:2: ( ( rule__BasicShape__Group__0 ) )
            {
            // InternalOnlineElm.g:233:2: ( ( rule__BasicShape__Group__0 ) )
            // InternalOnlineElm.g:234:3: ( rule__BasicShape__Group__0 )
            {
             before(grammarAccess.getBasicShapeAccess().getGroup()); 
            // InternalOnlineElm.g:235:3: ( rule__BasicShape__Group__0 )
            // InternalOnlineElm.g:235:4: rule__BasicShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicShape"


    // $ANTLR start "entryRuleShape"
    // InternalOnlineElm.g:244:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:245:1: ( ruleShape EOF )
            // InternalOnlineElm.g:246:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalOnlineElm.g:253:1: ruleShape : ( ( rule__Shape__Group__0 ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:257:2: ( ( ( rule__Shape__Group__0 ) ) )
            // InternalOnlineElm.g:258:2: ( ( rule__Shape__Group__0 ) )
            {
            // InternalOnlineElm.g:258:2: ( ( rule__Shape__Group__0 ) )
            // InternalOnlineElm.g:259:3: ( rule__Shape__Group__0 )
            {
             before(grammarAccess.getShapeAccess().getGroup()); 
            // InternalOnlineElm.g:260:3: ( rule__Shape__Group__0 )
            // InternalOnlineElm.g:260:4: rule__Shape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleConditional_Shape"
    // InternalOnlineElm.g:269:1: entryRuleConditional_Shape : ruleConditional_Shape EOF ;
    public final void entryRuleConditional_Shape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:270:1: ( ruleConditional_Shape EOF )
            // InternalOnlineElm.g:271:1: ruleConditional_Shape EOF
            {
             before(grammarAccess.getConditional_ShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional_Shape"


    // $ANTLR start "ruleConditional_Shape"
    // InternalOnlineElm.g:278:1: ruleConditional_Shape : ( ( rule__Conditional_Shape__Group__0 ) ) ;
    public final void ruleConditional_Shape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:282:2: ( ( ( rule__Conditional_Shape__Group__0 ) ) )
            // InternalOnlineElm.g:283:2: ( ( rule__Conditional_Shape__Group__0 ) )
            {
            // InternalOnlineElm.g:283:2: ( ( rule__Conditional_Shape__Group__0 ) )
            // InternalOnlineElm.g:284:3: ( rule__Conditional_Shape__Group__0 )
            {
             before(grammarAccess.getConditional_ShapeAccess().getGroup()); 
            // InternalOnlineElm.g:285:3: ( rule__Conditional_Shape__Group__0 )
            // InternalOnlineElm.g:285:4: rule__Conditional_Shape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional_Shape"


    // $ANTLR start "entryRuleConditional_Color"
    // InternalOnlineElm.g:294:1: entryRuleConditional_Color : ruleConditional_Color EOF ;
    public final void entryRuleConditional_Color() throws RecognitionException {
        try {
            // InternalOnlineElm.g:295:1: ( ruleConditional_Color EOF )
            // InternalOnlineElm.g:296:1: ruleConditional_Color EOF
            {
             before(grammarAccess.getConditional_ColorRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional_Color();

            state._fsp--;

             after(grammarAccess.getConditional_ColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional_Color"


    // $ANTLR start "ruleConditional_Color"
    // InternalOnlineElm.g:303:1: ruleConditional_Color : ( ( rule__Conditional_Color__Group__0 ) ) ;
    public final void ruleConditional_Color() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:307:2: ( ( ( rule__Conditional_Color__Group__0 ) ) )
            // InternalOnlineElm.g:308:2: ( ( rule__Conditional_Color__Group__0 ) )
            {
            // InternalOnlineElm.g:308:2: ( ( rule__Conditional_Color__Group__0 ) )
            // InternalOnlineElm.g:309:3: ( rule__Conditional_Color__Group__0 )
            {
             before(grammarAccess.getConditional_ColorAccess().getGroup()); 
            // InternalOnlineElm.g:310:3: ( rule__Conditional_Color__Group__0 )
            // InternalOnlineElm.g:310:4: rule__Conditional_Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional_Color"


    // $ANTLR start "entryRuleConditional_Num"
    // InternalOnlineElm.g:319:1: entryRuleConditional_Num : ruleConditional_Num EOF ;
    public final void entryRuleConditional_Num() throws RecognitionException {
        try {
            // InternalOnlineElm.g:320:1: ( ruleConditional_Num EOF )
            // InternalOnlineElm.g:321:1: ruleConditional_Num EOF
            {
             before(grammarAccess.getConditional_NumRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional_Num();

            state._fsp--;

             after(grammarAccess.getConditional_NumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional_Num"


    // $ANTLR start "ruleConditional_Num"
    // InternalOnlineElm.g:328:1: ruleConditional_Num : ( ( rule__Conditional_Num__Group__0 ) ) ;
    public final void ruleConditional_Num() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:332:2: ( ( ( rule__Conditional_Num__Group__0 ) ) )
            // InternalOnlineElm.g:333:2: ( ( rule__Conditional_Num__Group__0 ) )
            {
            // InternalOnlineElm.g:333:2: ( ( rule__Conditional_Num__Group__0 ) )
            // InternalOnlineElm.g:334:3: ( rule__Conditional_Num__Group__0 )
            {
             before(grammarAccess.getConditional_NumAccess().getGroup()); 
            // InternalOnlineElm.g:335:3: ( rule__Conditional_Num__Group__0 )
            // InternalOnlineElm.g:335:4: rule__Conditional_Num__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditional_NumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional_Num"


    // $ANTLR start "entryRuleConditional_Str"
    // InternalOnlineElm.g:344:1: entryRuleConditional_Str : ruleConditional_Str EOF ;
    public final void entryRuleConditional_Str() throws RecognitionException {
        try {
            // InternalOnlineElm.g:345:1: ( ruleConditional_Str EOF )
            // InternalOnlineElm.g:346:1: ruleConditional_Str EOF
            {
             before(grammarAccess.getConditional_StrRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional_Str();

            state._fsp--;

             after(grammarAccess.getConditional_StrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional_Str"


    // $ANTLR start "ruleConditional_Str"
    // InternalOnlineElm.g:353:1: ruleConditional_Str : ( ( rule__Conditional_Str__Group__0 ) ) ;
    public final void ruleConditional_Str() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:357:2: ( ( ( rule__Conditional_Str__Group__0 ) ) )
            // InternalOnlineElm.g:358:2: ( ( rule__Conditional_Str__Group__0 ) )
            {
            // InternalOnlineElm.g:358:2: ( ( rule__Conditional_Str__Group__0 ) )
            // InternalOnlineElm.g:359:3: ( rule__Conditional_Str__Group__0 )
            {
             before(grammarAccess.getConditional_StrAccess().getGroup()); 
            // InternalOnlineElm.g:360:3: ( rule__Conditional_Str__Group__0 )
            // InternalOnlineElm.g:360:4: rule__Conditional_Str__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditional_StrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional_Str"


    // $ANTLR start "entryRuleBool_expr"
    // InternalOnlineElm.g:369:1: entryRuleBool_expr : ruleBool_expr EOF ;
    public final void entryRuleBool_expr() throws RecognitionException {
        try {
            // InternalOnlineElm.g:370:1: ( ruleBool_expr EOF )
            // InternalOnlineElm.g:371:1: ruleBool_expr EOF
            {
             before(grammarAccess.getBool_exprRule()); 
            pushFollow(FOLLOW_1);
            ruleBool_expr();

            state._fsp--;

             after(grammarAccess.getBool_exprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool_expr"


    // $ANTLR start "ruleBool_expr"
    // InternalOnlineElm.g:378:1: ruleBool_expr : ( ruleOr_expr ) ;
    public final void ruleBool_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:382:2: ( ( ruleOr_expr ) )
            // InternalOnlineElm.g:383:2: ( ruleOr_expr )
            {
            // InternalOnlineElm.g:383:2: ( ruleOr_expr )
            // InternalOnlineElm.g:384:3: ruleOr_expr
            {
             before(grammarAccess.getBool_exprAccess().getOr_exprParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr_expr();

            state._fsp--;

             after(grammarAccess.getBool_exprAccess().getOr_exprParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool_expr"


    // $ANTLR start "entryRuleOr_expr"
    // InternalOnlineElm.g:394:1: entryRuleOr_expr : ruleOr_expr EOF ;
    public final void entryRuleOr_expr() throws RecognitionException {
        try {
            // InternalOnlineElm.g:395:1: ( ruleOr_expr EOF )
            // InternalOnlineElm.g:396:1: ruleOr_expr EOF
            {
             before(grammarAccess.getOr_exprRule()); 
            pushFollow(FOLLOW_1);
            ruleOr_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // InternalOnlineElm.g:403:1: ruleOr_expr : ( ( rule__Or_expr__Group__0 ) ) ;
    public final void ruleOr_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:407:2: ( ( ( rule__Or_expr__Group__0 ) ) )
            // InternalOnlineElm.g:408:2: ( ( rule__Or_expr__Group__0 ) )
            {
            // InternalOnlineElm.g:408:2: ( ( rule__Or_expr__Group__0 ) )
            // InternalOnlineElm.g:409:3: ( rule__Or_expr__Group__0 )
            {
             before(grammarAccess.getOr_exprAccess().getGroup()); 
            // InternalOnlineElm.g:410:3: ( rule__Or_expr__Group__0 )
            // InternalOnlineElm.g:410:4: rule__Or_expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOr_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // InternalOnlineElm.g:419:1: entryRuleAnd_expr : ruleAnd_expr EOF ;
    public final void entryRuleAnd_expr() throws RecognitionException {
        try {
            // InternalOnlineElm.g:420:1: ( ruleAnd_expr EOF )
            // InternalOnlineElm.g:421:1: ruleAnd_expr EOF
            {
             before(grammarAccess.getAnd_exprRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // InternalOnlineElm.g:428:1: ruleAnd_expr : ( ( rule__And_expr__Group__0 ) ) ;
    public final void ruleAnd_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:432:2: ( ( ( rule__And_expr__Group__0 ) ) )
            // InternalOnlineElm.g:433:2: ( ( rule__And_expr__Group__0 ) )
            {
            // InternalOnlineElm.g:433:2: ( ( rule__And_expr__Group__0 ) )
            // InternalOnlineElm.g:434:3: ( rule__And_expr__Group__0 )
            {
             before(grammarAccess.getAnd_exprAccess().getGroup()); 
            // InternalOnlineElm.g:435:3: ( rule__And_expr__Group__0 )
            // InternalOnlineElm.g:435:4: rule__And_expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleNot_expr"
    // InternalOnlineElm.g:444:1: entryRuleNot_expr : ruleNot_expr EOF ;
    public final void entryRuleNot_expr() throws RecognitionException {
        try {
            // InternalOnlineElm.g:445:1: ( ruleNot_expr EOF )
            // InternalOnlineElm.g:446:1: ruleNot_expr EOF
            {
             before(grammarAccess.getNot_exprRule()); 
            pushFollow(FOLLOW_1);
            ruleNot_expr();

            state._fsp--;

             after(grammarAccess.getNot_exprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot_expr"


    // $ANTLR start "ruleNot_expr"
    // InternalOnlineElm.g:453:1: ruleNot_expr : ( ( rule__Not_expr__Alternatives ) ) ;
    public final void ruleNot_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:457:2: ( ( ( rule__Not_expr__Alternatives ) ) )
            // InternalOnlineElm.g:458:2: ( ( rule__Not_expr__Alternatives ) )
            {
            // InternalOnlineElm.g:458:2: ( ( rule__Not_expr__Alternatives ) )
            // InternalOnlineElm.g:459:3: ( rule__Not_expr__Alternatives )
            {
             before(grammarAccess.getNot_exprAccess().getAlternatives()); 
            // InternalOnlineElm.g:460:3: ( rule__Not_expr__Alternatives )
            // InternalOnlineElm.g:460:4: rule__Not_expr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Not_expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNot_exprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot_expr"


    // $ANTLR start "entryRuleCompare_expr"
    // InternalOnlineElm.g:469:1: entryRuleCompare_expr : ruleCompare_expr EOF ;
    public final void entryRuleCompare_expr() throws RecognitionException {
        try {
            // InternalOnlineElm.g:470:1: ( ruleCompare_expr EOF )
            // InternalOnlineElm.g:471:1: ruleCompare_expr EOF
            {
             before(grammarAccess.getCompare_exprRule()); 
            pushFollow(FOLLOW_1);
            ruleCompare_expr();

            state._fsp--;

             after(grammarAccess.getCompare_exprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompare_expr"


    // $ANTLR start "ruleCompare_expr"
    // InternalOnlineElm.g:478:1: ruleCompare_expr : ( ( rule__Compare_expr__Group__0 ) ) ;
    public final void ruleCompare_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:482:2: ( ( ( rule__Compare_expr__Group__0 ) ) )
            // InternalOnlineElm.g:483:2: ( ( rule__Compare_expr__Group__0 ) )
            {
            // InternalOnlineElm.g:483:2: ( ( rule__Compare_expr__Group__0 ) )
            // InternalOnlineElm.g:484:3: ( rule__Compare_expr__Group__0 )
            {
             before(grammarAccess.getCompare_exprAccess().getGroup()); 
            // InternalOnlineElm.g:485:3: ( rule__Compare_expr__Group__0 )
            // InternalOnlineElm.g:485:4: rule__Compare_expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompare_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompare_expr"


    // $ANTLR start "entryRuleNum_value"
    // InternalOnlineElm.g:494:1: entryRuleNum_value : ruleNum_value EOF ;
    public final void entryRuleNum_value() throws RecognitionException {
        try {
            // InternalOnlineElm.g:495:1: ( ruleNum_value EOF )
            // InternalOnlineElm.g:496:1: ruleNum_value EOF
            {
             before(grammarAccess.getNum_valueRule()); 
            pushFollow(FOLLOW_1);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getNum_valueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNum_value"


    // $ANTLR start "ruleNum_value"
    // InternalOnlineElm.g:503:1: ruleNum_value : ( ( rule__Num_value__Alternatives ) ) ;
    public final void ruleNum_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:507:2: ( ( ( rule__Num_value__Alternatives ) ) )
            // InternalOnlineElm.g:508:2: ( ( rule__Num_value__Alternatives ) )
            {
            // InternalOnlineElm.g:508:2: ( ( rule__Num_value__Alternatives ) )
            // InternalOnlineElm.g:509:3: ( rule__Num_value__Alternatives )
            {
             before(grammarAccess.getNum_valueAccess().getAlternatives()); 
            // InternalOnlineElm.g:510:3: ( rule__Num_value__Alternatives )
            // InternalOnlineElm.g:510:4: rule__Num_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Num_value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNum_valueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNum_value"


    // $ANTLR start "entryRuleMath_exp"
    // InternalOnlineElm.g:519:1: entryRuleMath_exp : ruleMath_exp EOF ;
    public final void entryRuleMath_exp() throws RecognitionException {
        try {
            // InternalOnlineElm.g:520:1: ( ruleMath_exp EOF )
            // InternalOnlineElm.g:521:1: ruleMath_exp EOF
            {
             before(grammarAccess.getMath_expRule()); 
            pushFollow(FOLLOW_1);
            ruleMath_exp();

            state._fsp--;

             after(grammarAccess.getMath_expRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMath_exp"


    // $ANTLR start "ruleMath_exp"
    // InternalOnlineElm.g:528:1: ruleMath_exp : ( ( rule__Math_exp__Group__0 ) ) ;
    public final void ruleMath_exp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:532:2: ( ( ( rule__Math_exp__Group__0 ) ) )
            // InternalOnlineElm.g:533:2: ( ( rule__Math_exp__Group__0 ) )
            {
            // InternalOnlineElm.g:533:2: ( ( rule__Math_exp__Group__0 ) )
            // InternalOnlineElm.g:534:3: ( rule__Math_exp__Group__0 )
            {
             before(grammarAccess.getMath_expAccess().getGroup()); 
            // InternalOnlineElm.g:535:3: ( rule__Math_exp__Group__0 )
            // InternalOnlineElm.g:535:4: rule__Math_exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMath_expAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMath_exp"


    // $ANTLR start "entryRuleTerminal_math_exp"
    // InternalOnlineElm.g:544:1: entryRuleTerminal_math_exp : ruleTerminal_math_exp EOF ;
    public final void entryRuleTerminal_math_exp() throws RecognitionException {
        try {
            // InternalOnlineElm.g:545:1: ( ruleTerminal_math_exp EOF )
            // InternalOnlineElm.g:546:1: ruleTerminal_math_exp EOF
            {
             before(grammarAccess.getTerminal_math_expRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminal_math_exp();

            state._fsp--;

             after(grammarAccess.getTerminal_math_expRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal_math_exp"


    // $ANTLR start "ruleTerminal_math_exp"
    // InternalOnlineElm.g:553:1: ruleTerminal_math_exp : ( ( rule__Terminal_math_exp__Alternatives ) ) ;
    public final void ruleTerminal_math_exp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:557:2: ( ( ( rule__Terminal_math_exp__Alternatives ) ) )
            // InternalOnlineElm.g:558:2: ( ( rule__Terminal_math_exp__Alternatives ) )
            {
            // InternalOnlineElm.g:558:2: ( ( rule__Terminal_math_exp__Alternatives ) )
            // InternalOnlineElm.g:559:3: ( rule__Terminal_math_exp__Alternatives )
            {
             before(grammarAccess.getTerminal_math_expAccess().getAlternatives()); 
            // InternalOnlineElm.g:560:3: ( rule__Terminal_math_exp__Alternatives )
            // InternalOnlineElm.g:560:4: rule__Terminal_math_exp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminal_math_expAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal_math_exp"


    // $ANTLR start "entryRuleStencil"
    // InternalOnlineElm.g:569:1: entryRuleStencil : ruleStencil EOF ;
    public final void entryRuleStencil() throws RecognitionException {
        try {
            // InternalOnlineElm.g:570:1: ( ruleStencil EOF )
            // InternalOnlineElm.g:571:1: ruleStencil EOF
            {
             before(grammarAccess.getStencilRule()); 
            pushFollow(FOLLOW_1);
            ruleStencil();

            state._fsp--;

             after(grammarAccess.getStencilRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStencil"


    // $ANTLR start "ruleStencil"
    // InternalOnlineElm.g:578:1: ruleStencil : ( ( rule__Stencil__Alternatives ) ) ;
    public final void ruleStencil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:582:2: ( ( ( rule__Stencil__Alternatives ) ) )
            // InternalOnlineElm.g:583:2: ( ( rule__Stencil__Alternatives ) )
            {
            // InternalOnlineElm.g:583:2: ( ( rule__Stencil__Alternatives ) )
            // InternalOnlineElm.g:584:3: ( rule__Stencil__Alternatives )
            {
             before(grammarAccess.getStencilAccess().getAlternatives()); 
            // InternalOnlineElm.g:585:3: ( rule__Stencil__Alternatives )
            // InternalOnlineElm.g:585:4: rule__Stencil__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stencil__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStencilAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStencil"


    // $ANTLR start "entryRuleCircle"
    // InternalOnlineElm.g:594:1: entryRuleCircle : ruleCircle EOF ;
    public final void entryRuleCircle() throws RecognitionException {
        try {
            // InternalOnlineElm.g:595:1: ( ruleCircle EOF )
            // InternalOnlineElm.g:596:1: ruleCircle EOF
            {
             before(grammarAccess.getCircleRule()); 
            pushFollow(FOLLOW_1);
            ruleCircle();

            state._fsp--;

             after(grammarAccess.getCircleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // InternalOnlineElm.g:603:1: ruleCircle : ( ( rule__Circle__Group__0 ) ) ;
    public final void ruleCircle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:607:2: ( ( ( rule__Circle__Group__0 ) ) )
            // InternalOnlineElm.g:608:2: ( ( rule__Circle__Group__0 ) )
            {
            // InternalOnlineElm.g:608:2: ( ( rule__Circle__Group__0 ) )
            // InternalOnlineElm.g:609:3: ( rule__Circle__Group__0 )
            {
             before(grammarAccess.getCircleAccess().getGroup()); 
            // InternalOnlineElm.g:610:3: ( rule__Circle__Group__0 )
            // InternalOnlineElm.g:610:4: rule__Circle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleRect"
    // InternalOnlineElm.g:619:1: entryRuleRect : ruleRect EOF ;
    public final void entryRuleRect() throws RecognitionException {
        try {
            // InternalOnlineElm.g:620:1: ( ruleRect EOF )
            // InternalOnlineElm.g:621:1: ruleRect EOF
            {
             before(grammarAccess.getRectRule()); 
            pushFollow(FOLLOW_1);
            ruleRect();

            state._fsp--;

             after(grammarAccess.getRectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRect"


    // $ANTLR start "ruleRect"
    // InternalOnlineElm.g:628:1: ruleRect : ( ( rule__Rect__Group__0 ) ) ;
    public final void ruleRect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:632:2: ( ( ( rule__Rect__Group__0 ) ) )
            // InternalOnlineElm.g:633:2: ( ( rule__Rect__Group__0 ) )
            {
            // InternalOnlineElm.g:633:2: ( ( rule__Rect__Group__0 ) )
            // InternalOnlineElm.g:634:3: ( rule__Rect__Group__0 )
            {
             before(grammarAccess.getRectAccess().getGroup()); 
            // InternalOnlineElm.g:635:3: ( rule__Rect__Group__0 )
            // InternalOnlineElm.g:635:4: rule__Rect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRect"


    // $ANTLR start "entryRuleSquare"
    // InternalOnlineElm.g:644:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // InternalOnlineElm.g:645:1: ( ruleSquare EOF )
            // InternalOnlineElm.g:646:1: ruleSquare EOF
            {
             before(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getSquareRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // InternalOnlineElm.g:653:1: ruleSquare : ( ( rule__Square__Group__0 ) ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:657:2: ( ( ( rule__Square__Group__0 ) ) )
            // InternalOnlineElm.g:658:2: ( ( rule__Square__Group__0 ) )
            {
            // InternalOnlineElm.g:658:2: ( ( rule__Square__Group__0 ) )
            // InternalOnlineElm.g:659:3: ( rule__Square__Group__0 )
            {
             before(grammarAccess.getSquareAccess().getGroup()); 
            // InternalOnlineElm.g:660:3: ( rule__Square__Group__0 )
            // InternalOnlineElm.g:660:4: rule__Square__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Square__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquare"


    // $ANTLR start "entryRuleRoundedRect"
    // InternalOnlineElm.g:669:1: entryRuleRoundedRect : ruleRoundedRect EOF ;
    public final void entryRuleRoundedRect() throws RecognitionException {
        try {
            // InternalOnlineElm.g:670:1: ( ruleRoundedRect EOF )
            // InternalOnlineElm.g:671:1: ruleRoundedRect EOF
            {
             before(grammarAccess.getRoundedRectRule()); 
            pushFollow(FOLLOW_1);
            ruleRoundedRect();

            state._fsp--;

             after(grammarAccess.getRoundedRectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoundedRect"


    // $ANTLR start "ruleRoundedRect"
    // InternalOnlineElm.g:678:1: ruleRoundedRect : ( ( rule__RoundedRect__Group__0 ) ) ;
    public final void ruleRoundedRect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:682:2: ( ( ( rule__RoundedRect__Group__0 ) ) )
            // InternalOnlineElm.g:683:2: ( ( rule__RoundedRect__Group__0 ) )
            {
            // InternalOnlineElm.g:683:2: ( ( rule__RoundedRect__Group__0 ) )
            // InternalOnlineElm.g:684:3: ( rule__RoundedRect__Group__0 )
            {
             before(grammarAccess.getRoundedRectAccess().getGroup()); 
            // InternalOnlineElm.g:685:3: ( rule__RoundedRect__Group__0 )
            // InternalOnlineElm.g:685:4: rule__RoundedRect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundedRectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoundedRect"


    // $ANTLR start "entryRuleOval"
    // InternalOnlineElm.g:694:1: entryRuleOval : ruleOval EOF ;
    public final void entryRuleOval() throws RecognitionException {
        try {
            // InternalOnlineElm.g:695:1: ( ruleOval EOF )
            // InternalOnlineElm.g:696:1: ruleOval EOF
            {
             before(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_1);
            ruleOval();

            state._fsp--;

             after(grammarAccess.getOvalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOval"


    // $ANTLR start "ruleOval"
    // InternalOnlineElm.g:703:1: ruleOval : ( ( rule__Oval__Group__0 ) ) ;
    public final void ruleOval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:707:2: ( ( ( rule__Oval__Group__0 ) ) )
            // InternalOnlineElm.g:708:2: ( ( rule__Oval__Group__0 ) )
            {
            // InternalOnlineElm.g:708:2: ( ( rule__Oval__Group__0 ) )
            // InternalOnlineElm.g:709:3: ( rule__Oval__Group__0 )
            {
             before(grammarAccess.getOvalAccess().getGroup()); 
            // InternalOnlineElm.g:710:3: ( rule__Oval__Group__0 )
            // InternalOnlineElm.g:710:4: rule__Oval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOval"


    // $ANTLR start "entryRuleNgon"
    // InternalOnlineElm.g:719:1: entryRuleNgon : ruleNgon EOF ;
    public final void entryRuleNgon() throws RecognitionException {
        try {
            // InternalOnlineElm.g:720:1: ( ruleNgon EOF )
            // InternalOnlineElm.g:721:1: ruleNgon EOF
            {
             before(grammarAccess.getNgonRule()); 
            pushFollow(FOLLOW_1);
            ruleNgon();

            state._fsp--;

             after(grammarAccess.getNgonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNgon"


    // $ANTLR start "ruleNgon"
    // InternalOnlineElm.g:728:1: ruleNgon : ( ( rule__Ngon__Group__0 ) ) ;
    public final void ruleNgon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:732:2: ( ( ( rule__Ngon__Group__0 ) ) )
            // InternalOnlineElm.g:733:2: ( ( rule__Ngon__Group__0 ) )
            {
            // InternalOnlineElm.g:733:2: ( ( rule__Ngon__Group__0 ) )
            // InternalOnlineElm.g:734:3: ( rule__Ngon__Group__0 )
            {
             before(grammarAccess.getNgonAccess().getGroup()); 
            // InternalOnlineElm.g:735:3: ( rule__Ngon__Group__0 )
            // InternalOnlineElm.g:735:4: rule__Ngon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ngon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNgonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNgon"


    // $ANTLR start "entryRuleWedge"
    // InternalOnlineElm.g:744:1: entryRuleWedge : ruleWedge EOF ;
    public final void entryRuleWedge() throws RecognitionException {
        try {
            // InternalOnlineElm.g:745:1: ( ruleWedge EOF )
            // InternalOnlineElm.g:746:1: ruleWedge EOF
            {
             before(grammarAccess.getWedgeRule()); 
            pushFollow(FOLLOW_1);
            ruleWedge();

            state._fsp--;

             after(grammarAccess.getWedgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWedge"


    // $ANTLR start "ruleWedge"
    // InternalOnlineElm.g:753:1: ruleWedge : ( ( rule__Wedge__Group__0 ) ) ;
    public final void ruleWedge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:757:2: ( ( ( rule__Wedge__Group__0 ) ) )
            // InternalOnlineElm.g:758:2: ( ( rule__Wedge__Group__0 ) )
            {
            // InternalOnlineElm.g:758:2: ( ( rule__Wedge__Group__0 ) )
            // InternalOnlineElm.g:759:3: ( rule__Wedge__Group__0 )
            {
             before(grammarAccess.getWedgeAccess().getGroup()); 
            // InternalOnlineElm.g:760:3: ( rule__Wedge__Group__0 )
            // InternalOnlineElm.g:760:4: rule__Wedge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wedge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWedgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWedge"


    // $ANTLR start "entryRulePolygon"
    // InternalOnlineElm.g:769:1: entryRulePolygon : rulePolygon EOF ;
    public final void entryRulePolygon() throws RecognitionException {
        try {
            // InternalOnlineElm.g:770:1: ( rulePolygon EOF )
            // InternalOnlineElm.g:771:1: rulePolygon EOF
            {
             before(grammarAccess.getPolygonRule()); 
            pushFollow(FOLLOW_1);
            rulePolygon();

            state._fsp--;

             after(grammarAccess.getPolygonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolygon"


    // $ANTLR start "rulePolygon"
    // InternalOnlineElm.g:778:1: rulePolygon : ( ( rule__Polygon__Group__0 ) ) ;
    public final void rulePolygon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:782:2: ( ( ( rule__Polygon__Group__0 ) ) )
            // InternalOnlineElm.g:783:2: ( ( rule__Polygon__Group__0 ) )
            {
            // InternalOnlineElm.g:783:2: ( ( rule__Polygon__Group__0 ) )
            // InternalOnlineElm.g:784:3: ( rule__Polygon__Group__0 )
            {
             before(grammarAccess.getPolygonAccess().getGroup()); 
            // InternalOnlineElm.g:785:3: ( rule__Polygon__Group__0 )
            // InternalOnlineElm.g:785:4: rule__Polygon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolygonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolygon"


    // $ANTLR start "entryRulePoint"
    // InternalOnlineElm.g:794:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalOnlineElm.g:795:1: ( rulePoint EOF )
            // InternalOnlineElm.g:796:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalOnlineElm.g:803:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:807:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalOnlineElm.g:808:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalOnlineElm.g:808:2: ( ( rule__Point__Group__0 ) )
            // InternalOnlineElm.g:809:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalOnlineElm.g:810:3: ( rule__Point__Group__0 )
            // InternalOnlineElm.g:810:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleText"
    // InternalOnlineElm.g:819:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalOnlineElm.g:820:1: ( ruleText EOF )
            // InternalOnlineElm.g:821:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalOnlineElm.g:828:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:832:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalOnlineElm.g:833:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalOnlineElm.g:833:2: ( ( rule__Text__Group__0 ) )
            // InternalOnlineElm.g:834:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalOnlineElm.g:835:3: ( rule__Text__Group__0 )
            // InternalOnlineElm.g:835:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleDraw"
    // InternalOnlineElm.g:844:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalOnlineElm.g:845:1: ( ruleDraw EOF )
            // InternalOnlineElm.g:846:1: ruleDraw EOF
            {
             before(grammarAccess.getDrawRule()); 
            pushFollow(FOLLOW_1);
            ruleDraw();

            state._fsp--;

             after(grammarAccess.getDrawRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDraw"


    // $ANTLR start "ruleDraw"
    // InternalOnlineElm.g:853:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:857:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalOnlineElm.g:858:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalOnlineElm.g:858:2: ( ( rule__Draw__Group__0 ) )
            // InternalOnlineElm.g:859:3: ( rule__Draw__Group__0 )
            {
             before(grammarAccess.getDrawAccess().getGroup()); 
            // InternalOnlineElm.g:860:3: ( rule__Draw__Group__0 )
            // InternalOnlineElm.g:860:4: rule__Draw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDraw"


    // $ANTLR start "entryRuleFilled"
    // InternalOnlineElm.g:869:1: entryRuleFilled : ruleFilled EOF ;
    public final void entryRuleFilled() throws RecognitionException {
        try {
            // InternalOnlineElm.g:870:1: ( ruleFilled EOF )
            // InternalOnlineElm.g:871:1: ruleFilled EOF
            {
             before(grammarAccess.getFilledRule()); 
            pushFollow(FOLLOW_1);
            ruleFilled();

            state._fsp--;

             after(grammarAccess.getFilledRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilled"


    // $ANTLR start "ruleFilled"
    // InternalOnlineElm.g:878:1: ruleFilled : ( ( rule__Filled__Group__0 ) ) ;
    public final void ruleFilled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:882:2: ( ( ( rule__Filled__Group__0 ) ) )
            // InternalOnlineElm.g:883:2: ( ( rule__Filled__Group__0 ) )
            {
            // InternalOnlineElm.g:883:2: ( ( rule__Filled__Group__0 ) )
            // InternalOnlineElm.g:884:3: ( rule__Filled__Group__0 )
            {
             before(grammarAccess.getFilledAccess().getGroup()); 
            // InternalOnlineElm.g:885:3: ( rule__Filled__Group__0 )
            // InternalOnlineElm.g:885:4: rule__Filled__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilled"


    // $ANTLR start "entryRuleOutlined"
    // InternalOnlineElm.g:894:1: entryRuleOutlined : ruleOutlined EOF ;
    public final void entryRuleOutlined() throws RecognitionException {
        try {
            // InternalOnlineElm.g:895:1: ( ruleOutlined EOF )
            // InternalOnlineElm.g:896:1: ruleOutlined EOF
            {
             before(grammarAccess.getOutlinedRule()); 
            pushFollow(FOLLOW_1);
            ruleOutlined();

            state._fsp--;

             after(grammarAccess.getOutlinedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutlined"


    // $ANTLR start "ruleOutlined"
    // InternalOnlineElm.g:903:1: ruleOutlined : ( ( rule__Outlined__Group__0 ) ) ;
    public final void ruleOutlined() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:907:2: ( ( ( rule__Outlined__Group__0 ) ) )
            // InternalOnlineElm.g:908:2: ( ( rule__Outlined__Group__0 ) )
            {
            // InternalOnlineElm.g:908:2: ( ( rule__Outlined__Group__0 ) )
            // InternalOnlineElm.g:909:3: ( rule__Outlined__Group__0 )
            {
             before(grammarAccess.getOutlinedAccess().getGroup()); 
            // InternalOnlineElm.g:910:3: ( rule__Outlined__Group__0 )
            // InternalOnlineElm.g:910:4: rule__Outlined__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutlinedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutlined"


    // $ANTLR start "entryRuleTranform"
    // InternalOnlineElm.g:919:1: entryRuleTranform : ruleTranform EOF ;
    public final void entryRuleTranform() throws RecognitionException {
        try {
            // InternalOnlineElm.g:920:1: ( ruleTranform EOF )
            // InternalOnlineElm.g:921:1: ruleTranform EOF
            {
             before(grammarAccess.getTranformRule()); 
            pushFollow(FOLLOW_1);
            ruleTranform();

            state._fsp--;

             after(grammarAccess.getTranformRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTranform"


    // $ANTLR start "ruleTranform"
    // InternalOnlineElm.g:928:1: ruleTranform : ( ( rule__Tranform__Alternatives ) ) ;
    public final void ruleTranform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:932:2: ( ( ( rule__Tranform__Alternatives ) ) )
            // InternalOnlineElm.g:933:2: ( ( rule__Tranform__Alternatives ) )
            {
            // InternalOnlineElm.g:933:2: ( ( rule__Tranform__Alternatives ) )
            // InternalOnlineElm.g:934:3: ( rule__Tranform__Alternatives )
            {
             before(grammarAccess.getTranformAccess().getAlternatives()); 
            // InternalOnlineElm.g:935:3: ( rule__Tranform__Alternatives )
            // InternalOnlineElm.g:935:4: rule__Tranform__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tranform__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTranformAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTranform"


    // $ANTLR start "entryRuleMove"
    // InternalOnlineElm.g:944:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalOnlineElm.g:945:1: ( ruleMove EOF )
            // InternalOnlineElm.g:946:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalOnlineElm.g:953:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:957:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalOnlineElm.g:958:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalOnlineElm.g:958:2: ( ( rule__Move__Group__0 ) )
            // InternalOnlineElm.g:959:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalOnlineElm.g:960:3: ( rule__Move__Group__0 )
            // InternalOnlineElm.g:960:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotate"
    // InternalOnlineElm.g:969:1: entryRuleRotate : ruleRotate EOF ;
    public final void entryRuleRotate() throws RecognitionException {
        try {
            // InternalOnlineElm.g:970:1: ( ruleRotate EOF )
            // InternalOnlineElm.g:971:1: ruleRotate EOF
            {
             before(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            ruleRotate();

            state._fsp--;

             after(grammarAccess.getRotateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalOnlineElm.g:978:1: ruleRotate : ( ( rule__Rotate__Group__0 ) ) ;
    public final void ruleRotate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:982:2: ( ( ( rule__Rotate__Group__0 ) ) )
            // InternalOnlineElm.g:983:2: ( ( rule__Rotate__Group__0 ) )
            {
            // InternalOnlineElm.g:983:2: ( ( rule__Rotate__Group__0 ) )
            // InternalOnlineElm.g:984:3: ( rule__Rotate__Group__0 )
            {
             before(grammarAccess.getRotateAccess().getGroup()); 
            // InternalOnlineElm.g:985:3: ( rule__Rotate__Group__0 )
            // InternalOnlineElm.g:985:4: rule__Rotate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleScale"
    // InternalOnlineElm.g:994:1: entryRuleScale : ruleScale EOF ;
    public final void entryRuleScale() throws RecognitionException {
        try {
            // InternalOnlineElm.g:995:1: ( ruleScale EOF )
            // InternalOnlineElm.g:996:1: ruleScale EOF
            {
             before(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            ruleScale();

            state._fsp--;

             after(grammarAccess.getScaleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalOnlineElm.g:1003:1: ruleScale : ( ( rule__Scale__Group__0 ) ) ;
    public final void ruleScale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1007:2: ( ( ( rule__Scale__Group__0 ) ) )
            // InternalOnlineElm.g:1008:2: ( ( rule__Scale__Group__0 ) )
            {
            // InternalOnlineElm.g:1008:2: ( ( rule__Scale__Group__0 ) )
            // InternalOnlineElm.g:1009:3: ( rule__Scale__Group__0 )
            {
             before(grammarAccess.getScaleAccess().getGroup()); 
            // InternalOnlineElm.g:1010:3: ( rule__Scale__Group__0 )
            // InternalOnlineElm.g:1010:4: rule__Scale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleScaleX"
    // InternalOnlineElm.g:1019:1: entryRuleScaleX : ruleScaleX EOF ;
    public final void entryRuleScaleX() throws RecognitionException {
        try {
            // InternalOnlineElm.g:1020:1: ( ruleScaleX EOF )
            // InternalOnlineElm.g:1021:1: ruleScaleX EOF
            {
             before(grammarAccess.getScaleXRule()); 
            pushFollow(FOLLOW_1);
            ruleScaleX();

            state._fsp--;

             after(grammarAccess.getScaleXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScaleX"


    // $ANTLR start "ruleScaleX"
    // InternalOnlineElm.g:1028:1: ruleScaleX : ( ( rule__ScaleX__Group__0 ) ) ;
    public final void ruleScaleX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1032:2: ( ( ( rule__ScaleX__Group__0 ) ) )
            // InternalOnlineElm.g:1033:2: ( ( rule__ScaleX__Group__0 ) )
            {
            // InternalOnlineElm.g:1033:2: ( ( rule__ScaleX__Group__0 ) )
            // InternalOnlineElm.g:1034:3: ( rule__ScaleX__Group__0 )
            {
             before(grammarAccess.getScaleXAccess().getGroup()); 
            // InternalOnlineElm.g:1035:3: ( rule__ScaleX__Group__0 )
            // InternalOnlineElm.g:1035:4: rule__ScaleX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScaleX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScaleXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScaleX"


    // $ANTLR start "entryRuleScaleY"
    // InternalOnlineElm.g:1044:1: entryRuleScaleY : ruleScaleY EOF ;
    public final void entryRuleScaleY() throws RecognitionException {
        try {
            // InternalOnlineElm.g:1045:1: ( ruleScaleY EOF )
            // InternalOnlineElm.g:1046:1: ruleScaleY EOF
            {
             before(grammarAccess.getScaleYRule()); 
            pushFollow(FOLLOW_1);
            ruleScaleY();

            state._fsp--;

             after(grammarAccess.getScaleYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScaleY"


    // $ANTLR start "ruleScaleY"
    // InternalOnlineElm.g:1053:1: ruleScaleY : ( ( rule__ScaleY__Group__0 ) ) ;
    public final void ruleScaleY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1057:2: ( ( ( rule__ScaleY__Group__0 ) ) )
            // InternalOnlineElm.g:1058:2: ( ( rule__ScaleY__Group__0 ) )
            {
            // InternalOnlineElm.g:1058:2: ( ( rule__ScaleY__Group__0 ) )
            // InternalOnlineElm.g:1059:3: ( rule__ScaleY__Group__0 )
            {
             before(grammarAccess.getScaleYAccess().getGroup()); 
            // InternalOnlineElm.g:1060:3: ( rule__ScaleY__Group__0 )
            // InternalOnlineElm.g:1060:4: rule__ScaleY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScaleY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScaleYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScaleY"


    // $ANTLR start "ruleMATH_OP"
    // InternalOnlineElm.g:1069:1: ruleMATH_OP : ( ( rule__MATH_OP__Alternatives ) ) ;
    public final void ruleMATH_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1073:1: ( ( ( rule__MATH_OP__Alternatives ) ) )
            // InternalOnlineElm.g:1074:2: ( ( rule__MATH_OP__Alternatives ) )
            {
            // InternalOnlineElm.g:1074:2: ( ( rule__MATH_OP__Alternatives ) )
            // InternalOnlineElm.g:1075:3: ( rule__MATH_OP__Alternatives )
            {
             before(grammarAccess.getMATH_OPAccess().getAlternatives()); 
            // InternalOnlineElm.g:1076:3: ( rule__MATH_OP__Alternatives )
            // InternalOnlineElm.g:1076:4: rule__MATH_OP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MATH_OP__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMATH_OPAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMATH_OP"


    // $ANTLR start "ruleLineType"
    // InternalOnlineElm.g:1085:1: ruleLineType : ( ( rule__LineType__Alternatives ) ) ;
    public final void ruleLineType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1089:1: ( ( ( rule__LineType__Alternatives ) ) )
            // InternalOnlineElm.g:1090:2: ( ( rule__LineType__Alternatives ) )
            {
            // InternalOnlineElm.g:1090:2: ( ( rule__LineType__Alternatives ) )
            // InternalOnlineElm.g:1091:3: ( rule__LineType__Alternatives )
            {
             before(grammarAccess.getLineTypeAccess().getAlternatives()); 
            // InternalOnlineElm.g:1092:3: ( rule__LineType__Alternatives )
            // InternalOnlineElm.g:1092:4: rule__LineType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LineType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineType"


    // $ANTLR start "ruleColor"
    // InternalOnlineElm.g:1101:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1105:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalOnlineElm.g:1106:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalOnlineElm.g:1106:2: ( ( rule__Color__Alternatives ) )
            // InternalOnlineElm.g:1107:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalOnlineElm.g:1108:3: ( rule__Color__Alternatives )
            // InternalOnlineElm.g:1108:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__MainShape__Alternatives_4"
    // InternalOnlineElm.g:1116:1: rule__MainShape__Alternatives_4 : ( ( ( rule__MainShape__ShapeAssignment_4_0 ) ) | ( ( rule__MainShape__ConditionalAssignment_4_1 ) ) | ( ( rule__MainShape__ShapeRefAssignment_4_2 ) ) );
    public final void rule__MainShape__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1120:1: ( ( ( rule__MainShape__ShapeAssignment_4_0 ) ) | ( ( rule__MainShape__ConditionalAssignment_4_1 ) ) | ( ( rule__MainShape__ShapeRefAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt1=1;
                }
                break;
            case 71:
                {
                alt1=2;
                }
                break;
            case RULE_FQN:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOnlineElm.g:1121:2: ( ( rule__MainShape__ShapeAssignment_4_0 ) )
                    {
                    // InternalOnlineElm.g:1121:2: ( ( rule__MainShape__ShapeAssignment_4_0 ) )
                    // InternalOnlineElm.g:1122:3: ( rule__MainShape__ShapeAssignment_4_0 )
                    {
                     before(grammarAccess.getMainShapeAccess().getShapeAssignment_4_0()); 
                    // InternalOnlineElm.g:1123:3: ( rule__MainShape__ShapeAssignment_4_0 )
                    // InternalOnlineElm.g:1123:4: rule__MainShape__ShapeAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__ShapeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getShapeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1127:2: ( ( rule__MainShape__ConditionalAssignment_4_1 ) )
                    {
                    // InternalOnlineElm.g:1127:2: ( ( rule__MainShape__ConditionalAssignment_4_1 ) )
                    // InternalOnlineElm.g:1128:3: ( rule__MainShape__ConditionalAssignment_4_1 )
                    {
                     before(grammarAccess.getMainShapeAccess().getConditionalAssignment_4_1()); 
                    // InternalOnlineElm.g:1129:3: ( rule__MainShape__ConditionalAssignment_4_1 )
                    // InternalOnlineElm.g:1129:4: rule__MainShape__ConditionalAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__ConditionalAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getConditionalAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1133:2: ( ( rule__MainShape__ShapeRefAssignment_4_2 ) )
                    {
                    // InternalOnlineElm.g:1133:2: ( ( rule__MainShape__ShapeRefAssignment_4_2 ) )
                    // InternalOnlineElm.g:1134:3: ( rule__MainShape__ShapeRefAssignment_4_2 )
                    {
                     before(grammarAccess.getMainShapeAccess().getShapeRefAssignment_4_2()); 
                    // InternalOnlineElm.g:1135:3: ( rule__MainShape__ShapeRefAssignment_4_2 )
                    // InternalOnlineElm.g:1135:4: rule__MainShape__ShapeRefAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__ShapeRefAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getShapeRefAssignment_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Alternatives_4"


    // $ANTLR start "rule__MainShape__Alternatives_5_2"
    // InternalOnlineElm.g:1143:1: rule__MainShape__Alternatives_5_2 : ( ( ( rule__MainShape__MoreShapesAssignment_5_2_0 ) ) | ( ( rule__MainShape__MoreConditionalAssignment_5_2_1 ) ) | ( ( rule__MainShape__MoreShapeRefAssignment_5_2_2 ) ) );
    public final void rule__MainShape__Alternatives_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1147:1: ( ( ( rule__MainShape__MoreShapesAssignment_5_2_0 ) ) | ( ( rule__MainShape__MoreConditionalAssignment_5_2_1 ) ) | ( ( rule__MainShape__MoreShapeRefAssignment_5_2_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt2=1;
                }
                break;
            case 71:
                {
                alt2=2;
                }
                break;
            case RULE_FQN:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOnlineElm.g:1148:2: ( ( rule__MainShape__MoreShapesAssignment_5_2_0 ) )
                    {
                    // InternalOnlineElm.g:1148:2: ( ( rule__MainShape__MoreShapesAssignment_5_2_0 ) )
                    // InternalOnlineElm.g:1149:3: ( rule__MainShape__MoreShapesAssignment_5_2_0 )
                    {
                     before(grammarAccess.getMainShapeAccess().getMoreShapesAssignment_5_2_0()); 
                    // InternalOnlineElm.g:1150:3: ( rule__MainShape__MoreShapesAssignment_5_2_0 )
                    // InternalOnlineElm.g:1150:4: rule__MainShape__MoreShapesAssignment_5_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__MoreShapesAssignment_5_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getMoreShapesAssignment_5_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1154:2: ( ( rule__MainShape__MoreConditionalAssignment_5_2_1 ) )
                    {
                    // InternalOnlineElm.g:1154:2: ( ( rule__MainShape__MoreConditionalAssignment_5_2_1 ) )
                    // InternalOnlineElm.g:1155:3: ( rule__MainShape__MoreConditionalAssignment_5_2_1 )
                    {
                     before(grammarAccess.getMainShapeAccess().getMoreConditionalAssignment_5_2_1()); 
                    // InternalOnlineElm.g:1156:3: ( rule__MainShape__MoreConditionalAssignment_5_2_1 )
                    // InternalOnlineElm.g:1156:4: rule__MainShape__MoreConditionalAssignment_5_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__MoreConditionalAssignment_5_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getMoreConditionalAssignment_5_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1160:2: ( ( rule__MainShape__MoreShapeRefAssignment_5_2_2 ) )
                    {
                    // InternalOnlineElm.g:1160:2: ( ( rule__MainShape__MoreShapeRefAssignment_5_2_2 ) )
                    // InternalOnlineElm.g:1161:3: ( rule__MainShape__MoreShapeRefAssignment_5_2_2 )
                    {
                     before(grammarAccess.getMainShapeAccess().getMoreShapeRefAssignment_5_2_2()); 
                    // InternalOnlineElm.g:1162:3: ( rule__MainShape__MoreShapeRefAssignment_5_2_2 )
                    // InternalOnlineElm.g:1162:4: rule__MainShape__MoreShapeRefAssignment_5_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__MoreShapeRefAssignment_5_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getMoreShapeRefAssignment_5_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Alternatives_5_2"


    // $ANTLR start "rule__MainShape__Alternatives_8"
    // InternalOnlineElm.g:1170:1: rule__MainShape__Alternatives_8 : ( ( RULE_NL ) | ( ( rule__MainShape__Group_8_1__0 ) ) );
    public final void rule__MainShape__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1174:1: ( ( RULE_NL ) | ( ( rule__MainShape__Group_8_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NL) ) {
                alt3=1;
            }
            else if ( (LA3_0==68) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOnlineElm.g:1175:2: ( RULE_NL )
                    {
                    // InternalOnlineElm.g:1175:2: ( RULE_NL )
                    // InternalOnlineElm.g:1176:3: RULE_NL
                    {
                     before(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_8_0()); 
                    match(input,RULE_NL,FOLLOW_2); 
                     after(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1181:2: ( ( rule__MainShape__Group_8_1__0 ) )
                    {
                    // InternalOnlineElm.g:1181:2: ( ( rule__MainShape__Group_8_1__0 ) )
                    // InternalOnlineElm.g:1182:3: ( rule__MainShape__Group_8_1__0 )
                    {
                     before(grammarAccess.getMainShapeAccess().getGroup_8_1()); 
                    // InternalOnlineElm.g:1183:3: ( rule__MainShape__Group_8_1__0 )
                    // InternalOnlineElm.g:1183:4: rule__MainShape__Group_8_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__Group_8_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainShapeAccess().getGroup_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Alternatives_8"


    // $ANTLR start "rule__ShapeDef__Alternatives"
    // InternalOnlineElm.g:1191:1: rule__ShapeDef__Alternatives : ( ( ruleShapeList ) | ( ruleBasicShape ) );
    public final void rule__ShapeDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1195:1: ( ( ruleShapeList ) | ( ruleBasicShape ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_FQN) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==64) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==65) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==RULE_NL||LA4_2==71||(LA4_2>=82 && LA4_2<=90)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOnlineElm.g:1196:2: ( ruleShapeList )
                    {
                    // InternalOnlineElm.g:1196:2: ( ruleShapeList )
                    // InternalOnlineElm.g:1197:3: ruleShapeList
                    {
                     before(grammarAccess.getShapeDefAccess().getShapeListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeList();

                    state._fsp--;

                     after(grammarAccess.getShapeDefAccess().getShapeListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1202:2: ( ruleBasicShape )
                    {
                    // InternalOnlineElm.g:1202:2: ( ruleBasicShape )
                    // InternalOnlineElm.g:1203:3: ruleBasicShape
                    {
                     before(grammarAccess.getShapeDefAccess().getBasicShapeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicShape();

                    state._fsp--;

                     after(grammarAccess.getShapeDefAccess().getBasicShapeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Alternatives"


    // $ANTLR start "rule__Ref_var__Alternatives"
    // InternalOnlineElm.g:1212:1: rule__Ref_var__Alternatives : ( ( ( rule__Ref_var__Group_0__0 ) ) | ( 'time' ) );
    public final void rule__Ref_var__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1216:1: ( ( ( rule__Ref_var__Group_0__0 ) ) | ( 'time' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_FQN) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOnlineElm.g:1217:2: ( ( rule__Ref_var__Group_0__0 ) )
                    {
                    // InternalOnlineElm.g:1217:2: ( ( rule__Ref_var__Group_0__0 ) )
                    // InternalOnlineElm.g:1218:3: ( rule__Ref_var__Group_0__0 )
                    {
                     before(grammarAccess.getRef_varAccess().getGroup_0()); 
                    // InternalOnlineElm.g:1219:3: ( rule__Ref_var__Group_0__0 )
                    // InternalOnlineElm.g:1219:4: rule__Ref_var__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ref_var__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRef_varAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1223:2: ( 'time' )
                    {
                    // InternalOnlineElm.g:1223:2: ( 'time' )
                    // InternalOnlineElm.g:1224:3: 'time'
                    {
                     before(grammarAccess.getRef_varAccess().getTimeKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRef_varAccess().getTimeKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Alternatives"


    // $ANTLR start "rule__ShapeList__Alternatives_3"
    // InternalOnlineElm.g:1233:1: rule__ShapeList__Alternatives_3 : ( ( ( rule__ShapeList__ShapeAssignment_3_0 ) ) | ( ( rule__ShapeList__ConditionalAssignment_3_1 ) ) | ( ( rule__ShapeList__ShapeRefAssignment_3_2 ) ) );
    public final void rule__ShapeList__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1237:1: ( ( ( rule__ShapeList__ShapeAssignment_3_0 ) ) | ( ( rule__ShapeList__ConditionalAssignment_3_1 ) ) | ( ( rule__ShapeList__ShapeRefAssignment_3_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt6=1;
                }
                break;
            case 71:
                {
                alt6=2;
                }
                break;
            case RULE_FQN:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOnlineElm.g:1238:2: ( ( rule__ShapeList__ShapeAssignment_3_0 ) )
                    {
                    // InternalOnlineElm.g:1238:2: ( ( rule__ShapeList__ShapeAssignment_3_0 ) )
                    // InternalOnlineElm.g:1239:3: ( rule__ShapeList__ShapeAssignment_3_0 )
                    {
                     before(grammarAccess.getShapeListAccess().getShapeAssignment_3_0()); 
                    // InternalOnlineElm.g:1240:3: ( rule__ShapeList__ShapeAssignment_3_0 )
                    // InternalOnlineElm.g:1240:4: rule__ShapeList__ShapeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__ShapeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getShapeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1244:2: ( ( rule__ShapeList__ConditionalAssignment_3_1 ) )
                    {
                    // InternalOnlineElm.g:1244:2: ( ( rule__ShapeList__ConditionalAssignment_3_1 ) )
                    // InternalOnlineElm.g:1245:3: ( rule__ShapeList__ConditionalAssignment_3_1 )
                    {
                     before(grammarAccess.getShapeListAccess().getConditionalAssignment_3_1()); 
                    // InternalOnlineElm.g:1246:3: ( rule__ShapeList__ConditionalAssignment_3_1 )
                    // InternalOnlineElm.g:1246:4: rule__ShapeList__ConditionalAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__ConditionalAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getConditionalAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1250:2: ( ( rule__ShapeList__ShapeRefAssignment_3_2 ) )
                    {
                    // InternalOnlineElm.g:1250:2: ( ( rule__ShapeList__ShapeRefAssignment_3_2 ) )
                    // InternalOnlineElm.g:1251:3: ( rule__ShapeList__ShapeRefAssignment_3_2 )
                    {
                     before(grammarAccess.getShapeListAccess().getShapeRefAssignment_3_2()); 
                    // InternalOnlineElm.g:1252:3: ( rule__ShapeList__ShapeRefAssignment_3_2 )
                    // InternalOnlineElm.g:1252:4: rule__ShapeList__ShapeRefAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__ShapeRefAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getShapeRefAssignment_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Alternatives_3"


    // $ANTLR start "rule__ShapeList__Alternatives_4_2"
    // InternalOnlineElm.g:1260:1: rule__ShapeList__Alternatives_4_2 : ( ( ( rule__ShapeList__MoreShapesAssignment_4_2_0 ) ) | ( ( rule__ShapeList__MoreConditionalAssignment_4_2_1 ) ) | ( ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 ) ) );
    public final void rule__ShapeList__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1264:1: ( ( ( rule__ShapeList__MoreShapesAssignment_4_2_0 ) ) | ( ( rule__ShapeList__MoreConditionalAssignment_4_2_1 ) ) | ( ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt7=1;
                }
                break;
            case 71:
                {
                alt7=2;
                }
                break;
            case RULE_FQN:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOnlineElm.g:1265:2: ( ( rule__ShapeList__MoreShapesAssignment_4_2_0 ) )
                    {
                    // InternalOnlineElm.g:1265:2: ( ( rule__ShapeList__MoreShapesAssignment_4_2_0 ) )
                    // InternalOnlineElm.g:1266:3: ( rule__ShapeList__MoreShapesAssignment_4_2_0 )
                    {
                     before(grammarAccess.getShapeListAccess().getMoreShapesAssignment_4_2_0()); 
                    // InternalOnlineElm.g:1267:3: ( rule__ShapeList__MoreShapesAssignment_4_2_0 )
                    // InternalOnlineElm.g:1267:4: rule__ShapeList__MoreShapesAssignment_4_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__MoreShapesAssignment_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getMoreShapesAssignment_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1271:2: ( ( rule__ShapeList__MoreConditionalAssignment_4_2_1 ) )
                    {
                    // InternalOnlineElm.g:1271:2: ( ( rule__ShapeList__MoreConditionalAssignment_4_2_1 ) )
                    // InternalOnlineElm.g:1272:3: ( rule__ShapeList__MoreConditionalAssignment_4_2_1 )
                    {
                     before(grammarAccess.getShapeListAccess().getMoreConditionalAssignment_4_2_1()); 
                    // InternalOnlineElm.g:1273:3: ( rule__ShapeList__MoreConditionalAssignment_4_2_1 )
                    // InternalOnlineElm.g:1273:4: rule__ShapeList__MoreConditionalAssignment_4_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__MoreConditionalAssignment_4_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getMoreConditionalAssignment_4_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1277:2: ( ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 ) )
                    {
                    // InternalOnlineElm.g:1277:2: ( ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 ) )
                    // InternalOnlineElm.g:1278:3: ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 )
                    {
                     before(grammarAccess.getShapeListAccess().getMoreShapeRefAssignment_4_2_2()); 
                    // InternalOnlineElm.g:1279:3: ( rule__ShapeList__MoreShapeRefAssignment_4_2_2 )
                    // InternalOnlineElm.g:1279:4: rule__ShapeList__MoreShapeRefAssignment_4_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__MoreShapeRefAssignment_4_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getMoreShapeRefAssignment_4_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Alternatives_4_2"


    // $ANTLR start "rule__ShapeList__Alternatives_7"
    // InternalOnlineElm.g:1287:1: rule__ShapeList__Alternatives_7 : ( ( RULE_NL ) | ( ( rule__ShapeList__Group_7_1__0 ) ) );
    public final void rule__ShapeList__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1291:1: ( ( RULE_NL ) | ( ( rule__ShapeList__Group_7_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NL) ) {
                alt8=1;
            }
            else if ( (LA8_0==68) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOnlineElm.g:1292:2: ( RULE_NL )
                    {
                    // InternalOnlineElm.g:1292:2: ( RULE_NL )
                    // InternalOnlineElm.g:1293:3: RULE_NL
                    {
                     before(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_7_0()); 
                    match(input,RULE_NL,FOLLOW_2); 
                     after(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1298:2: ( ( rule__ShapeList__Group_7_1__0 ) )
                    {
                    // InternalOnlineElm.g:1298:2: ( ( rule__ShapeList__Group_7_1__0 ) )
                    // InternalOnlineElm.g:1299:3: ( rule__ShapeList__Group_7_1__0 )
                    {
                     before(grammarAccess.getShapeListAccess().getGroup_7_1()); 
                    // InternalOnlineElm.g:1300:3: ( rule__ShapeList__Group_7_1__0 )
                    // InternalOnlineElm.g:1300:4: rule__ShapeList__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeList__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeListAccess().getGroup_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Alternatives_7"


    // $ANTLR start "rule__BasicShape__Alternatives_3"
    // InternalOnlineElm.g:1308:1: rule__BasicShape__Alternatives_3 : ( ( ( rule__BasicShape__ShapeAssignment_3_0 ) ) | ( ( rule__BasicShape__ConditionalAssignment_3_1 ) ) );
    public final void rule__BasicShape__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1312:1: ( ( ( rule__BasicShape__ShapeAssignment_3_0 ) ) | ( ( rule__BasicShape__ConditionalAssignment_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=82 && LA9_0<=90)) ) {
                alt9=1;
            }
            else if ( (LA9_0==71) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOnlineElm.g:1313:2: ( ( rule__BasicShape__ShapeAssignment_3_0 ) )
                    {
                    // InternalOnlineElm.g:1313:2: ( ( rule__BasicShape__ShapeAssignment_3_0 ) )
                    // InternalOnlineElm.g:1314:3: ( rule__BasicShape__ShapeAssignment_3_0 )
                    {
                     before(grammarAccess.getBasicShapeAccess().getShapeAssignment_3_0()); 
                    // InternalOnlineElm.g:1315:3: ( rule__BasicShape__ShapeAssignment_3_0 )
                    // InternalOnlineElm.g:1315:4: rule__BasicShape__ShapeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicShape__ShapeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicShapeAccess().getShapeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1319:2: ( ( rule__BasicShape__ConditionalAssignment_3_1 ) )
                    {
                    // InternalOnlineElm.g:1319:2: ( ( rule__BasicShape__ConditionalAssignment_3_1 ) )
                    // InternalOnlineElm.g:1320:3: ( rule__BasicShape__ConditionalAssignment_3_1 )
                    {
                     before(grammarAccess.getBasicShapeAccess().getConditionalAssignment_3_1()); 
                    // InternalOnlineElm.g:1321:3: ( rule__BasicShape__ConditionalAssignment_3_1 )
                    // InternalOnlineElm.g:1321:4: rule__BasicShape__ConditionalAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicShape__ConditionalAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicShapeAccess().getConditionalAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Alternatives_3"


    // $ANTLR start "rule__Conditional_Shape__Alternatives_4"
    // InternalOnlineElm.g:1329:1: rule__Conditional_Shape__Alternatives_4 : ( ( ( rule__Conditional_Shape__Shape_1Assignment_4_0 ) ) | ( ( rule__Conditional_Shape__Nested_1Assignment_4_1 ) ) );
    public final void rule__Conditional_Shape__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1333:1: ( ( ( rule__Conditional_Shape__Shape_1Assignment_4_0 ) ) | ( ( rule__Conditional_Shape__Nested_1Assignment_4_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=82 && LA10_0<=90)) ) {
                alt10=1;
            }
            else if ( (LA10_0==71) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOnlineElm.g:1334:2: ( ( rule__Conditional_Shape__Shape_1Assignment_4_0 ) )
                    {
                    // InternalOnlineElm.g:1334:2: ( ( rule__Conditional_Shape__Shape_1Assignment_4_0 ) )
                    // InternalOnlineElm.g:1335:3: ( rule__Conditional_Shape__Shape_1Assignment_4_0 )
                    {
                     before(grammarAccess.getConditional_ShapeAccess().getShape_1Assignment_4_0()); 
                    // InternalOnlineElm.g:1336:3: ( rule__Conditional_Shape__Shape_1Assignment_4_0 )
                    // InternalOnlineElm.g:1336:4: rule__Conditional_Shape__Shape_1Assignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Shape__Shape_1Assignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ShapeAccess().getShape_1Assignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1340:2: ( ( rule__Conditional_Shape__Nested_1Assignment_4_1 ) )
                    {
                    // InternalOnlineElm.g:1340:2: ( ( rule__Conditional_Shape__Nested_1Assignment_4_1 ) )
                    // InternalOnlineElm.g:1341:3: ( rule__Conditional_Shape__Nested_1Assignment_4_1 )
                    {
                     before(grammarAccess.getConditional_ShapeAccess().getNested_1Assignment_4_1()); 
                    // InternalOnlineElm.g:1342:3: ( rule__Conditional_Shape__Nested_1Assignment_4_1 )
                    // InternalOnlineElm.g:1342:4: rule__Conditional_Shape__Nested_1Assignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Shape__Nested_1Assignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ShapeAccess().getNested_1Assignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Alternatives_4"


    // $ANTLR start "rule__Conditional_Shape__Alternatives_8"
    // InternalOnlineElm.g:1350:1: rule__Conditional_Shape__Alternatives_8 : ( ( ( rule__Conditional_Shape__Shape_2Assignment_8_0 ) ) | ( ( rule__Conditional_Shape__Nested_2Assignment_8_1 ) ) );
    public final void rule__Conditional_Shape__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1354:1: ( ( ( rule__Conditional_Shape__Shape_2Assignment_8_0 ) ) | ( ( rule__Conditional_Shape__Nested_2Assignment_8_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=82 && LA11_0<=90)) ) {
                alt11=1;
            }
            else if ( (LA11_0==71) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOnlineElm.g:1355:2: ( ( rule__Conditional_Shape__Shape_2Assignment_8_0 ) )
                    {
                    // InternalOnlineElm.g:1355:2: ( ( rule__Conditional_Shape__Shape_2Assignment_8_0 ) )
                    // InternalOnlineElm.g:1356:3: ( rule__Conditional_Shape__Shape_2Assignment_8_0 )
                    {
                     before(grammarAccess.getConditional_ShapeAccess().getShape_2Assignment_8_0()); 
                    // InternalOnlineElm.g:1357:3: ( rule__Conditional_Shape__Shape_2Assignment_8_0 )
                    // InternalOnlineElm.g:1357:4: rule__Conditional_Shape__Shape_2Assignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Shape__Shape_2Assignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ShapeAccess().getShape_2Assignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1361:2: ( ( rule__Conditional_Shape__Nested_2Assignment_8_1 ) )
                    {
                    // InternalOnlineElm.g:1361:2: ( ( rule__Conditional_Shape__Nested_2Assignment_8_1 ) )
                    // InternalOnlineElm.g:1362:3: ( rule__Conditional_Shape__Nested_2Assignment_8_1 )
                    {
                     before(grammarAccess.getConditional_ShapeAccess().getNested_2Assignment_8_1()); 
                    // InternalOnlineElm.g:1363:3: ( rule__Conditional_Shape__Nested_2Assignment_8_1 )
                    // InternalOnlineElm.g:1363:4: rule__Conditional_Shape__Nested_2Assignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Shape__Nested_2Assignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ShapeAccess().getNested_2Assignment_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Alternatives_8"


    // $ANTLR start "rule__Conditional_Color__Alternatives_5"
    // InternalOnlineElm.g:1371:1: rule__Conditional_Color__Alternatives_5 : ( ( ( rule__Conditional_Color__Color_1Assignment_5_0 ) ) | ( ( rule__Conditional_Color__Nested_1Assignment_5_1 ) ) );
    public final void rule__Conditional_Color__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1375:1: ( ( ( rule__Conditional_Color__Color_1Assignment_5_0 ) ) | ( ( rule__Conditional_Color__Nested_1Assignment_5_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=30 && LA12_0<=63)) ) {
                alt12=1;
            }
            else if ( (LA12_0==74) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOnlineElm.g:1376:2: ( ( rule__Conditional_Color__Color_1Assignment_5_0 ) )
                    {
                    // InternalOnlineElm.g:1376:2: ( ( rule__Conditional_Color__Color_1Assignment_5_0 ) )
                    // InternalOnlineElm.g:1377:3: ( rule__Conditional_Color__Color_1Assignment_5_0 )
                    {
                     before(grammarAccess.getConditional_ColorAccess().getColor_1Assignment_5_0()); 
                    // InternalOnlineElm.g:1378:3: ( rule__Conditional_Color__Color_1Assignment_5_0 )
                    // InternalOnlineElm.g:1378:4: rule__Conditional_Color__Color_1Assignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Color__Color_1Assignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ColorAccess().getColor_1Assignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1382:2: ( ( rule__Conditional_Color__Nested_1Assignment_5_1 ) )
                    {
                    // InternalOnlineElm.g:1382:2: ( ( rule__Conditional_Color__Nested_1Assignment_5_1 ) )
                    // InternalOnlineElm.g:1383:3: ( rule__Conditional_Color__Nested_1Assignment_5_1 )
                    {
                     before(grammarAccess.getConditional_ColorAccess().getNested_1Assignment_5_1()); 
                    // InternalOnlineElm.g:1384:3: ( rule__Conditional_Color__Nested_1Assignment_5_1 )
                    // InternalOnlineElm.g:1384:4: rule__Conditional_Color__Nested_1Assignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Color__Nested_1Assignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ColorAccess().getNested_1Assignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Alternatives_5"


    // $ANTLR start "rule__Conditional_Color__Alternatives_9"
    // InternalOnlineElm.g:1392:1: rule__Conditional_Color__Alternatives_9 : ( ( ( rule__Conditional_Color__Color_2Assignment_9_0 ) ) | ( ( rule__Conditional_Color__Nested_2Assignment_9_1 ) ) );
    public final void rule__Conditional_Color__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1396:1: ( ( ( rule__Conditional_Color__Color_2Assignment_9_0 ) ) | ( ( rule__Conditional_Color__Nested_2Assignment_9_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=30 && LA13_0<=63)) ) {
                alt13=1;
            }
            else if ( (LA13_0==74) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOnlineElm.g:1397:2: ( ( rule__Conditional_Color__Color_2Assignment_9_0 ) )
                    {
                    // InternalOnlineElm.g:1397:2: ( ( rule__Conditional_Color__Color_2Assignment_9_0 ) )
                    // InternalOnlineElm.g:1398:3: ( rule__Conditional_Color__Color_2Assignment_9_0 )
                    {
                     before(grammarAccess.getConditional_ColorAccess().getColor_2Assignment_9_0()); 
                    // InternalOnlineElm.g:1399:3: ( rule__Conditional_Color__Color_2Assignment_9_0 )
                    // InternalOnlineElm.g:1399:4: rule__Conditional_Color__Color_2Assignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Color__Color_2Assignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ColorAccess().getColor_2Assignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1403:2: ( ( rule__Conditional_Color__Nested_2Assignment_9_1 ) )
                    {
                    // InternalOnlineElm.g:1403:2: ( ( rule__Conditional_Color__Nested_2Assignment_9_1 ) )
                    // InternalOnlineElm.g:1404:3: ( rule__Conditional_Color__Nested_2Assignment_9_1 )
                    {
                     before(grammarAccess.getConditional_ColorAccess().getNested_2Assignment_9_1()); 
                    // InternalOnlineElm.g:1405:3: ( rule__Conditional_Color__Nested_2Assignment_9_1 )
                    // InternalOnlineElm.g:1405:4: rule__Conditional_Color__Nested_2Assignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Color__Nested_2Assignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_ColorAccess().getNested_2Assignment_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Alternatives_9"


    // $ANTLR start "rule__Conditional_Num__Alternatives_5"
    // InternalOnlineElm.g:1413:1: rule__Conditional_Num__Alternatives_5 : ( ( ( rule__Conditional_Num__Num_1Assignment_5_0 ) ) | ( ( rule__Conditional_Num__Nested_1Assignment_5_1 ) ) );
    public final void rule__Conditional_Num__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1417:1: ( ( ( rule__Conditional_Num__Num_1Assignment_5_0 ) ) | ( ( rule__Conditional_Num__Nested_1Assignment_5_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_FLOAT) ) {
                alt14=1;
            }
            else if ( (LA14_0==74) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOnlineElm.g:1418:2: ( ( rule__Conditional_Num__Num_1Assignment_5_0 ) )
                    {
                    // InternalOnlineElm.g:1418:2: ( ( rule__Conditional_Num__Num_1Assignment_5_0 ) )
                    // InternalOnlineElm.g:1419:3: ( rule__Conditional_Num__Num_1Assignment_5_0 )
                    {
                     before(grammarAccess.getConditional_NumAccess().getNum_1Assignment_5_0()); 
                    // InternalOnlineElm.g:1420:3: ( rule__Conditional_Num__Num_1Assignment_5_0 )
                    // InternalOnlineElm.g:1420:4: rule__Conditional_Num__Num_1Assignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Num__Num_1Assignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_NumAccess().getNum_1Assignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1424:2: ( ( rule__Conditional_Num__Nested_1Assignment_5_1 ) )
                    {
                    // InternalOnlineElm.g:1424:2: ( ( rule__Conditional_Num__Nested_1Assignment_5_1 ) )
                    // InternalOnlineElm.g:1425:3: ( rule__Conditional_Num__Nested_1Assignment_5_1 )
                    {
                     before(grammarAccess.getConditional_NumAccess().getNested_1Assignment_5_1()); 
                    // InternalOnlineElm.g:1426:3: ( rule__Conditional_Num__Nested_1Assignment_5_1 )
                    // InternalOnlineElm.g:1426:4: rule__Conditional_Num__Nested_1Assignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Num__Nested_1Assignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_NumAccess().getNested_1Assignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Alternatives_5"


    // $ANTLR start "rule__Conditional_Num__Alternatives_9"
    // InternalOnlineElm.g:1434:1: rule__Conditional_Num__Alternatives_9 : ( ( ( rule__Conditional_Num__Num_2Assignment_9_0 ) ) | ( ( rule__Conditional_Num__Nested_2Assignment_9_1 ) ) );
    public final void rule__Conditional_Num__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1438:1: ( ( ( rule__Conditional_Num__Num_2Assignment_9_0 ) ) | ( ( rule__Conditional_Num__Nested_2Assignment_9_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_FLOAT) ) {
                alt15=1;
            }
            else if ( (LA15_0==74) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOnlineElm.g:1439:2: ( ( rule__Conditional_Num__Num_2Assignment_9_0 ) )
                    {
                    // InternalOnlineElm.g:1439:2: ( ( rule__Conditional_Num__Num_2Assignment_9_0 ) )
                    // InternalOnlineElm.g:1440:3: ( rule__Conditional_Num__Num_2Assignment_9_0 )
                    {
                     before(grammarAccess.getConditional_NumAccess().getNum_2Assignment_9_0()); 
                    // InternalOnlineElm.g:1441:3: ( rule__Conditional_Num__Num_2Assignment_9_0 )
                    // InternalOnlineElm.g:1441:4: rule__Conditional_Num__Num_2Assignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Num__Num_2Assignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_NumAccess().getNum_2Assignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1445:2: ( ( rule__Conditional_Num__Nested_2Assignment_9_1 ) )
                    {
                    // InternalOnlineElm.g:1445:2: ( ( rule__Conditional_Num__Nested_2Assignment_9_1 ) )
                    // InternalOnlineElm.g:1446:3: ( rule__Conditional_Num__Nested_2Assignment_9_1 )
                    {
                     before(grammarAccess.getConditional_NumAccess().getNested_2Assignment_9_1()); 
                    // InternalOnlineElm.g:1447:3: ( rule__Conditional_Num__Nested_2Assignment_9_1 )
                    // InternalOnlineElm.g:1447:4: rule__Conditional_Num__Nested_2Assignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Num__Nested_2Assignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_NumAccess().getNested_2Assignment_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Alternatives_9"


    // $ANTLR start "rule__Conditional_Str__Alternatives_5"
    // InternalOnlineElm.g:1455:1: rule__Conditional_Str__Alternatives_5 : ( ( ( rule__Conditional_Str__Str_1Assignment_5_0 ) ) | ( ( rule__Conditional_Str__Nested_1Assignment_5_1 ) ) );
    public final void rule__Conditional_Str__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1459:1: ( ( ( rule__Conditional_Str__Str_1Assignment_5_0 ) ) | ( ( rule__Conditional_Str__Nested_1Assignment_5_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==74) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOnlineElm.g:1460:2: ( ( rule__Conditional_Str__Str_1Assignment_5_0 ) )
                    {
                    // InternalOnlineElm.g:1460:2: ( ( rule__Conditional_Str__Str_1Assignment_5_0 ) )
                    // InternalOnlineElm.g:1461:3: ( rule__Conditional_Str__Str_1Assignment_5_0 )
                    {
                     before(grammarAccess.getConditional_StrAccess().getStr_1Assignment_5_0()); 
                    // InternalOnlineElm.g:1462:3: ( rule__Conditional_Str__Str_1Assignment_5_0 )
                    // InternalOnlineElm.g:1462:4: rule__Conditional_Str__Str_1Assignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Str__Str_1Assignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_StrAccess().getStr_1Assignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1466:2: ( ( rule__Conditional_Str__Nested_1Assignment_5_1 ) )
                    {
                    // InternalOnlineElm.g:1466:2: ( ( rule__Conditional_Str__Nested_1Assignment_5_1 ) )
                    // InternalOnlineElm.g:1467:3: ( rule__Conditional_Str__Nested_1Assignment_5_1 )
                    {
                     before(grammarAccess.getConditional_StrAccess().getNested_1Assignment_5_1()); 
                    // InternalOnlineElm.g:1468:3: ( rule__Conditional_Str__Nested_1Assignment_5_1 )
                    // InternalOnlineElm.g:1468:4: rule__Conditional_Str__Nested_1Assignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Str__Nested_1Assignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_StrAccess().getNested_1Assignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Alternatives_5"


    // $ANTLR start "rule__Conditional_Str__Alternatives_8"
    // InternalOnlineElm.g:1476:1: rule__Conditional_Str__Alternatives_8 : ( ( ( rule__Conditional_Str__Str_2Assignment_8_0 ) ) | ( ( rule__Conditional_Str__Nested_2Assignment_8_1 ) ) );
    public final void rule__Conditional_Str__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1480:1: ( ( ( rule__Conditional_Str__Str_2Assignment_8_0 ) ) | ( ( rule__Conditional_Str__Nested_2Assignment_8_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==74) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalOnlineElm.g:1481:2: ( ( rule__Conditional_Str__Str_2Assignment_8_0 ) )
                    {
                    // InternalOnlineElm.g:1481:2: ( ( rule__Conditional_Str__Str_2Assignment_8_0 ) )
                    // InternalOnlineElm.g:1482:3: ( rule__Conditional_Str__Str_2Assignment_8_0 )
                    {
                     before(grammarAccess.getConditional_StrAccess().getStr_2Assignment_8_0()); 
                    // InternalOnlineElm.g:1483:3: ( rule__Conditional_Str__Str_2Assignment_8_0 )
                    // InternalOnlineElm.g:1483:4: rule__Conditional_Str__Str_2Assignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Str__Str_2Assignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_StrAccess().getStr_2Assignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1487:2: ( ( rule__Conditional_Str__Nested_2Assignment_8_1 ) )
                    {
                    // InternalOnlineElm.g:1487:2: ( ( rule__Conditional_Str__Nested_2Assignment_8_1 ) )
                    // InternalOnlineElm.g:1488:3: ( rule__Conditional_Str__Nested_2Assignment_8_1 )
                    {
                     before(grammarAccess.getConditional_StrAccess().getNested_2Assignment_8_1()); 
                    // InternalOnlineElm.g:1489:3: ( rule__Conditional_Str__Nested_2Assignment_8_1 )
                    // InternalOnlineElm.g:1489:4: rule__Conditional_Str__Nested_2Assignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional_Str__Nested_2Assignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditional_StrAccess().getNested_2Assignment_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Alternatives_8"


    // $ANTLR start "rule__Not_expr__Alternatives"
    // InternalOnlineElm.g:1497:1: rule__Not_expr__Alternatives : ( ( ( rule__Not_expr__Group_0__0 ) ) | ( ruleCompare_expr ) );
    public final void rule__Not_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1501:1: ( ( ( rule__Not_expr__Group_0__0 ) ) | ( ruleCompare_expr ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==78) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_FQN && LA18_0<=RULE_FLOAT)||LA18_0==RULE_ID||LA18_0==14||LA18_0==74) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalOnlineElm.g:1502:2: ( ( rule__Not_expr__Group_0__0 ) )
                    {
                    // InternalOnlineElm.g:1502:2: ( ( rule__Not_expr__Group_0__0 ) )
                    // InternalOnlineElm.g:1503:3: ( rule__Not_expr__Group_0__0 )
                    {
                     before(grammarAccess.getNot_exprAccess().getGroup_0()); 
                    // InternalOnlineElm.g:1504:3: ( rule__Not_expr__Group_0__0 )
                    // InternalOnlineElm.g:1504:4: rule__Not_expr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not_expr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNot_exprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1508:2: ( ruleCompare_expr )
                    {
                    // InternalOnlineElm.g:1508:2: ( ruleCompare_expr )
                    // InternalOnlineElm.g:1509:3: ruleCompare_expr
                    {
                     before(grammarAccess.getNot_exprAccess().getCompare_exprParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompare_expr();

                    state._fsp--;

                     after(grammarAccess.getNot_exprAccess().getCompare_exprParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Alternatives"


    // $ANTLR start "rule__Compare_expr__OperatorAlternatives_1_1_0"
    // InternalOnlineElm.g:1518:1: rule__Compare_expr__OperatorAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Compare_expr__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1522:1: ( ( '>=' ) | ( '<=' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt19=1;
                }
                break;
            case 16:
                {
                alt19=2;
                }
                break;
            case 17:
                {
                alt19=3;
                }
                break;
            case 18:
                {
                alt19=4;
                }
                break;
            case 19:
                {
                alt19=5;
                }
                break;
            case 20:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalOnlineElm.g:1523:2: ( '>=' )
                    {
                    // InternalOnlineElm.g:1523:2: ( '>=' )
                    // InternalOnlineElm.g:1524:3: '>='
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1529:2: ( '<=' )
                    {
                    // InternalOnlineElm.g:1529:2: ( '<=' )
                    // InternalOnlineElm.g:1530:3: '<='
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1535:2: ( '==' )
                    {
                    // InternalOnlineElm.g:1535:2: ( '==' )
                    // InternalOnlineElm.g:1536:3: '=='
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1541:2: ( '!=' )
                    {
                    // InternalOnlineElm.g:1541:2: ( '!=' )
                    // InternalOnlineElm.g:1542:3: '!='
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1547:2: ( '>' )
                    {
                    // InternalOnlineElm.g:1547:2: ( '>' )
                    // InternalOnlineElm.g:1548:3: '>'
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOnlineElm.g:1553:2: ( '<' )
                    {
                    // InternalOnlineElm.g:1553:2: ( '<' )
                    // InternalOnlineElm.g:1554:3: '<'
                    {
                     before(grammarAccess.getCompare_exprAccess().getOperatorLessThanSignKeyword_1_1_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCompare_exprAccess().getOperatorLessThanSignKeyword_1_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Num_value__Alternatives"
    // InternalOnlineElm.g:1563:1: rule__Num_value__Alternatives : ( ( ruleMath_exp ) | ( ruleConditional_Num ) | ( ( rule__Num_value__LocalAssignment_2 ) ) | ( ( rule__Num_value__RefAssignment_3 ) ) );
    public final void rule__Num_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1567:1: ( ( ruleMath_exp ) | ( ruleConditional_Num ) | ( ( rule__Num_value__LocalAssignment_2 ) ) | ( ( rule__Num_value__RefAssignment_3 ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_FLOAT||LA20_1==74) ) {
                    alt20=1;
                }
                else if ( (LA20_1==71) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=3;
                }
                break;
            case RULE_FQN:
            case 14:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalOnlineElm.g:1568:2: ( ruleMath_exp )
                    {
                    // InternalOnlineElm.g:1568:2: ( ruleMath_exp )
                    // InternalOnlineElm.g:1569:3: ruleMath_exp
                    {
                     before(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMath_exp();

                    state._fsp--;

                     after(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1574:2: ( ruleConditional_Num )
                    {
                    // InternalOnlineElm.g:1574:2: ( ruleConditional_Num )
                    // InternalOnlineElm.g:1575:3: ruleConditional_Num
                    {
                     before(grammarAccess.getNum_valueAccess().getConditional_NumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConditional_Num();

                    state._fsp--;

                     after(grammarAccess.getNum_valueAccess().getConditional_NumParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1580:2: ( ( rule__Num_value__LocalAssignment_2 ) )
                    {
                    // InternalOnlineElm.g:1580:2: ( ( rule__Num_value__LocalAssignment_2 ) )
                    // InternalOnlineElm.g:1581:3: ( rule__Num_value__LocalAssignment_2 )
                    {
                     before(grammarAccess.getNum_valueAccess().getLocalAssignment_2()); 
                    // InternalOnlineElm.g:1582:3: ( rule__Num_value__LocalAssignment_2 )
                    // InternalOnlineElm.g:1582:4: rule__Num_value__LocalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num_value__LocalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNum_valueAccess().getLocalAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1586:2: ( ( rule__Num_value__RefAssignment_3 ) )
                    {
                    // InternalOnlineElm.g:1586:2: ( ( rule__Num_value__RefAssignment_3 ) )
                    // InternalOnlineElm.g:1587:3: ( rule__Num_value__RefAssignment_3 )
                    {
                     before(grammarAccess.getNum_valueAccess().getRefAssignment_3()); 
                    // InternalOnlineElm.g:1588:3: ( rule__Num_value__RefAssignment_3 )
                    // InternalOnlineElm.g:1588:4: rule__Num_value__RefAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num_value__RefAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNum_valueAccess().getRefAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num_value__Alternatives"


    // $ANTLR start "rule__Terminal_math_exp__Alternatives"
    // InternalOnlineElm.g:1596:1: rule__Terminal_math_exp__Alternatives : ( ( ( rule__Terminal_math_exp__Group_0__0 ) ) | ( ( rule__Terminal_math_exp__Group_1__0 ) ) );
    public final void rule__Terminal_math_exp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1600:1: ( ( ( rule__Terminal_math_exp__Group_0__0 ) ) | ( ( rule__Terminal_math_exp__Group_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==74) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_FLOAT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOnlineElm.g:1601:2: ( ( rule__Terminal_math_exp__Group_0__0 ) )
                    {
                    // InternalOnlineElm.g:1601:2: ( ( rule__Terminal_math_exp__Group_0__0 ) )
                    // InternalOnlineElm.g:1602:3: ( rule__Terminal_math_exp__Group_0__0 )
                    {
                     before(grammarAccess.getTerminal_math_expAccess().getGroup_0()); 
                    // InternalOnlineElm.g:1603:3: ( rule__Terminal_math_exp__Group_0__0 )
                    // InternalOnlineElm.g:1603:4: rule__Terminal_math_exp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal_math_exp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_math_expAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1607:2: ( ( rule__Terminal_math_exp__Group_1__0 ) )
                    {
                    // InternalOnlineElm.g:1607:2: ( ( rule__Terminal_math_exp__Group_1__0 ) )
                    // InternalOnlineElm.g:1608:3: ( rule__Terminal_math_exp__Group_1__0 )
                    {
                     before(grammarAccess.getTerminal_math_expAccess().getGroup_1()); 
                    // InternalOnlineElm.g:1609:3: ( rule__Terminal_math_exp__Group_1__0 )
                    // InternalOnlineElm.g:1609:4: rule__Terminal_math_exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal_math_exp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_math_expAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Alternatives"


    // $ANTLR start "rule__Stencil__Alternatives"
    // InternalOnlineElm.g:1617:1: rule__Stencil__Alternatives : ( ( ruleCircle ) | ( ruleRect ) | ( ruleSquare ) | ( ruleRoundedRect ) | ( ruleOval ) | ( ruleNgon ) | ( ruleWedge ) | ( rulePolygon ) | ( ruleText ) );
    public final void rule__Stencil__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1621:1: ( ( ruleCircle ) | ( ruleRect ) | ( ruleSquare ) | ( ruleRoundedRect ) | ( ruleOval ) | ( ruleNgon ) | ( ruleWedge ) | ( rulePolygon ) | ( ruleText ) )
            int alt22=9;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt22=1;
                }
                break;
            case 83:
                {
                alt22=2;
                }
                break;
            case 84:
                {
                alt22=3;
                }
                break;
            case 85:
                {
                alt22=4;
                }
                break;
            case 86:
                {
                alt22=5;
                }
                break;
            case 87:
                {
                alt22=6;
                }
                break;
            case 88:
                {
                alt22=7;
                }
                break;
            case 89:
                {
                alt22=8;
                }
                break;
            case 90:
                {
                alt22=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalOnlineElm.g:1622:2: ( ruleCircle )
                    {
                    // InternalOnlineElm.g:1622:2: ( ruleCircle )
                    // InternalOnlineElm.g:1623:3: ruleCircle
                    {
                     before(grammarAccess.getStencilAccess().getCircleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCircle();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getCircleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1628:2: ( ruleRect )
                    {
                    // InternalOnlineElm.g:1628:2: ( ruleRect )
                    // InternalOnlineElm.g:1629:3: ruleRect
                    {
                     before(grammarAccess.getStencilAccess().getRectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRect();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getRectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1634:2: ( ruleSquare )
                    {
                    // InternalOnlineElm.g:1634:2: ( ruleSquare )
                    // InternalOnlineElm.g:1635:3: ruleSquare
                    {
                     before(grammarAccess.getStencilAccess().getSquareParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSquare();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getSquareParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1640:2: ( ruleRoundedRect )
                    {
                    // InternalOnlineElm.g:1640:2: ( ruleRoundedRect )
                    // InternalOnlineElm.g:1641:3: ruleRoundedRect
                    {
                     before(grammarAccess.getStencilAccess().getRoundedRectParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRoundedRect();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getRoundedRectParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1646:2: ( ruleOval )
                    {
                    // InternalOnlineElm.g:1646:2: ( ruleOval )
                    // InternalOnlineElm.g:1647:3: ruleOval
                    {
                     before(grammarAccess.getStencilAccess().getOvalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getOvalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOnlineElm.g:1652:2: ( ruleNgon )
                    {
                    // InternalOnlineElm.g:1652:2: ( ruleNgon )
                    // InternalOnlineElm.g:1653:3: ruleNgon
                    {
                     before(grammarAccess.getStencilAccess().getNgonParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNgon();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getNgonParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOnlineElm.g:1658:2: ( ruleWedge )
                    {
                    // InternalOnlineElm.g:1658:2: ( ruleWedge )
                    // InternalOnlineElm.g:1659:3: ruleWedge
                    {
                     before(grammarAccess.getStencilAccess().getWedgeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWedge();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getWedgeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOnlineElm.g:1664:2: ( rulePolygon )
                    {
                    // InternalOnlineElm.g:1664:2: ( rulePolygon )
                    // InternalOnlineElm.g:1665:3: rulePolygon
                    {
                     before(grammarAccess.getStencilAccess().getPolygonParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePolygon();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getPolygonParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOnlineElm.g:1670:2: ( ruleText )
                    {
                    // InternalOnlineElm.g:1670:2: ( ruleText )
                    // InternalOnlineElm.g:1671:3: ruleText
                    {
                     before(grammarAccess.getStencilAccess().getTextParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getStencilAccess().getTextParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stencil__Alternatives"


    // $ANTLR start "rule__Text__Alternatives_1"
    // InternalOnlineElm.g:1680:1: rule__Text__Alternatives_1 : ( ( ( rule__Text__ContentAssignment_1_0 ) ) | ( ( rule__Text__ConditionalContentAssignment_1_1 ) ) );
    public final void rule__Text__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1684:1: ( ( ( rule__Text__ContentAssignment_1_0 ) ) | ( ( rule__Text__ConditionalContentAssignment_1_1 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==74) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalOnlineElm.g:1685:2: ( ( rule__Text__ContentAssignment_1_0 ) )
                    {
                    // InternalOnlineElm.g:1685:2: ( ( rule__Text__ContentAssignment_1_0 ) )
                    // InternalOnlineElm.g:1686:3: ( rule__Text__ContentAssignment_1_0 )
                    {
                     before(grammarAccess.getTextAccess().getContentAssignment_1_0()); 
                    // InternalOnlineElm.g:1687:3: ( rule__Text__ContentAssignment_1_0 )
                    // InternalOnlineElm.g:1687:4: rule__Text__ContentAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__ContentAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getContentAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1691:2: ( ( rule__Text__ConditionalContentAssignment_1_1 ) )
                    {
                    // InternalOnlineElm.g:1691:2: ( ( rule__Text__ConditionalContentAssignment_1_1 ) )
                    // InternalOnlineElm.g:1692:3: ( rule__Text__ConditionalContentAssignment_1_1 )
                    {
                     before(grammarAccess.getTextAccess().getConditionalContentAssignment_1_1()); 
                    // InternalOnlineElm.g:1693:3: ( rule__Text__ConditionalContentAssignment_1_1 )
                    // InternalOnlineElm.g:1693:4: rule__Text__ConditionalContentAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__ConditionalContentAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getConditionalContentAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Alternatives_1"


    // $ANTLR start "rule__Draw__Alternatives_0"
    // InternalOnlineElm.g:1701:1: rule__Draw__Alternatives_0 : ( ( ( rule__Draw__FilledAssignment_0_0 ) ) | ( ( rule__Draw__OutlinedAssignment_0_1 ) ) );
    public final void rule__Draw__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1705:1: ( ( ( rule__Draw__FilledAssignment_0_0 ) ) | ( ( rule__Draw__OutlinedAssignment_0_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==91) ) {
                alt24=1;
            }
            else if ( (LA24_0==92) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOnlineElm.g:1706:2: ( ( rule__Draw__FilledAssignment_0_0 ) )
                    {
                    // InternalOnlineElm.g:1706:2: ( ( rule__Draw__FilledAssignment_0_0 ) )
                    // InternalOnlineElm.g:1707:3: ( rule__Draw__FilledAssignment_0_0 )
                    {
                     before(grammarAccess.getDrawAccess().getFilledAssignment_0_0()); 
                    // InternalOnlineElm.g:1708:3: ( rule__Draw__FilledAssignment_0_0 )
                    // InternalOnlineElm.g:1708:4: rule__Draw__FilledAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Draw__FilledAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDrawAccess().getFilledAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1712:2: ( ( rule__Draw__OutlinedAssignment_0_1 ) )
                    {
                    // InternalOnlineElm.g:1712:2: ( ( rule__Draw__OutlinedAssignment_0_1 ) )
                    // InternalOnlineElm.g:1713:3: ( rule__Draw__OutlinedAssignment_0_1 )
                    {
                     before(grammarAccess.getDrawAccess().getOutlinedAssignment_0_1()); 
                    // InternalOnlineElm.g:1714:3: ( rule__Draw__OutlinedAssignment_0_1 )
                    // InternalOnlineElm.g:1714:4: rule__Draw__OutlinedAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Draw__OutlinedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDrawAccess().getOutlinedAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Alternatives_0"


    // $ANTLR start "rule__Filled__Alternatives_1"
    // InternalOnlineElm.g:1722:1: rule__Filled__Alternatives_1 : ( ( ( rule__Filled__FilledColor1Assignment_1_0 ) ) | ( ( rule__Filled__FilledColor2Assignment_1_1 ) ) );
    public final void rule__Filled__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1726:1: ( ( ( rule__Filled__FilledColor1Assignment_1_0 ) ) | ( ( rule__Filled__FilledColor2Assignment_1_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=30 && LA25_0<=63)) ) {
                alt25=1;
            }
            else if ( (LA25_0==74) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalOnlineElm.g:1727:2: ( ( rule__Filled__FilledColor1Assignment_1_0 ) )
                    {
                    // InternalOnlineElm.g:1727:2: ( ( rule__Filled__FilledColor1Assignment_1_0 ) )
                    // InternalOnlineElm.g:1728:3: ( rule__Filled__FilledColor1Assignment_1_0 )
                    {
                     before(grammarAccess.getFilledAccess().getFilledColor1Assignment_1_0()); 
                    // InternalOnlineElm.g:1729:3: ( rule__Filled__FilledColor1Assignment_1_0 )
                    // InternalOnlineElm.g:1729:4: rule__Filled__FilledColor1Assignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filled__FilledColor1Assignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilledAccess().getFilledColor1Assignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1733:2: ( ( rule__Filled__FilledColor2Assignment_1_1 ) )
                    {
                    // InternalOnlineElm.g:1733:2: ( ( rule__Filled__FilledColor2Assignment_1_1 ) )
                    // InternalOnlineElm.g:1734:3: ( rule__Filled__FilledColor2Assignment_1_1 )
                    {
                     before(grammarAccess.getFilledAccess().getFilledColor2Assignment_1_1()); 
                    // InternalOnlineElm.g:1735:3: ( rule__Filled__FilledColor2Assignment_1_1 )
                    // InternalOnlineElm.g:1735:4: rule__Filled__FilledColor2Assignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filled__FilledColor2Assignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilledAccess().getFilledColor2Assignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Alternatives_1"


    // $ANTLR start "rule__Outlined__Alternatives_5"
    // InternalOnlineElm.g:1743:1: rule__Outlined__Alternatives_5 : ( ( ( rule__Outlined__OutlinedColor1Assignment_5_0 ) ) | ( ( rule__Outlined__OutlinedColor2Assignment_5_1 ) ) );
    public final void rule__Outlined__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1747:1: ( ( ( rule__Outlined__OutlinedColor1Assignment_5_0 ) ) | ( ( rule__Outlined__OutlinedColor2Assignment_5_1 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=30 && LA26_0<=63)) ) {
                alt26=1;
            }
            else if ( (LA26_0==74) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOnlineElm.g:1748:2: ( ( rule__Outlined__OutlinedColor1Assignment_5_0 ) )
                    {
                    // InternalOnlineElm.g:1748:2: ( ( rule__Outlined__OutlinedColor1Assignment_5_0 ) )
                    // InternalOnlineElm.g:1749:3: ( rule__Outlined__OutlinedColor1Assignment_5_0 )
                    {
                     before(grammarAccess.getOutlinedAccess().getOutlinedColor1Assignment_5_0()); 
                    // InternalOnlineElm.g:1750:3: ( rule__Outlined__OutlinedColor1Assignment_5_0 )
                    // InternalOnlineElm.g:1750:4: rule__Outlined__OutlinedColor1Assignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Outlined__OutlinedColor1Assignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutlinedAccess().getOutlinedColor1Assignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1754:2: ( ( rule__Outlined__OutlinedColor2Assignment_5_1 ) )
                    {
                    // InternalOnlineElm.g:1754:2: ( ( rule__Outlined__OutlinedColor2Assignment_5_1 ) )
                    // InternalOnlineElm.g:1755:3: ( rule__Outlined__OutlinedColor2Assignment_5_1 )
                    {
                     before(grammarAccess.getOutlinedAccess().getOutlinedColor2Assignment_5_1()); 
                    // InternalOnlineElm.g:1756:3: ( rule__Outlined__OutlinedColor2Assignment_5_1 )
                    // InternalOnlineElm.g:1756:4: rule__Outlined__OutlinedColor2Assignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Outlined__OutlinedColor2Assignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutlinedAccess().getOutlinedColor2Assignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Alternatives_5"


    // $ANTLR start "rule__Tranform__Alternatives"
    // InternalOnlineElm.g:1764:1: rule__Tranform__Alternatives : ( ( ruleMove ) | ( ruleRotate ) | ( ruleScale ) | ( ruleScaleX ) | ( ruleScaleY ) );
    public final void rule__Tranform__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1768:1: ( ( ruleMove ) | ( ruleRotate ) | ( ruleScale ) | ( ruleScaleX ) | ( ruleScaleY ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt27=1;
                }
                break;
            case 94:
                {
                alt27=2;
                }
                break;
            case 95:
                {
                alt27=3;
                }
                break;
            case 96:
                {
                alt27=4;
                }
                break;
            case 97:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalOnlineElm.g:1769:2: ( ruleMove )
                    {
                    // InternalOnlineElm.g:1769:2: ( ruleMove )
                    // InternalOnlineElm.g:1770:3: ruleMove
                    {
                     before(grammarAccess.getTranformAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getTranformAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1775:2: ( ruleRotate )
                    {
                    // InternalOnlineElm.g:1775:2: ( ruleRotate )
                    // InternalOnlineElm.g:1776:3: ruleRotate
                    {
                     before(grammarAccess.getTranformAccess().getRotateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRotate();

                    state._fsp--;

                     after(grammarAccess.getTranformAccess().getRotateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1781:2: ( ruleScale )
                    {
                    // InternalOnlineElm.g:1781:2: ( ruleScale )
                    // InternalOnlineElm.g:1782:3: ruleScale
                    {
                     before(grammarAccess.getTranformAccess().getScaleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScale();

                    state._fsp--;

                     after(grammarAccess.getTranformAccess().getScaleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1787:2: ( ruleScaleX )
                    {
                    // InternalOnlineElm.g:1787:2: ( ruleScaleX )
                    // InternalOnlineElm.g:1788:3: ruleScaleX
                    {
                     before(grammarAccess.getTranformAccess().getScaleXParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleScaleX();

                    state._fsp--;

                     after(grammarAccess.getTranformAccess().getScaleXParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1793:2: ( ruleScaleY )
                    {
                    // InternalOnlineElm.g:1793:2: ( ruleScaleY )
                    // InternalOnlineElm.g:1794:3: ruleScaleY
                    {
                     before(grammarAccess.getTranformAccess().getScaleYParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleScaleY();

                    state._fsp--;

                     after(grammarAccess.getTranformAccess().getScaleYParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tranform__Alternatives"


    // $ANTLR start "rule__MATH_OP__Alternatives"
    // InternalOnlineElm.g:1803:1: rule__MATH_OP__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MATH_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1807:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt28=1;
                }
                break;
            case 22:
                {
                alt28=2;
                }
                break;
            case 23:
                {
                alt28=3;
                }
                break;
            case 24:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalOnlineElm.g:1808:2: ( ( '+' ) )
                    {
                    // InternalOnlineElm.g:1808:2: ( ( '+' ) )
                    // InternalOnlineElm.g:1809:3: ( '+' )
                    {
                     before(grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0()); 
                    // InternalOnlineElm.g:1810:3: ( '+' )
                    // InternalOnlineElm.g:1810:4: '+'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1814:2: ( ( '-' ) )
                    {
                    // InternalOnlineElm.g:1814:2: ( ( '-' ) )
                    // InternalOnlineElm.g:1815:3: ( '-' )
                    {
                     before(grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1()); 
                    // InternalOnlineElm.g:1816:3: ( '-' )
                    // InternalOnlineElm.g:1816:4: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1820:2: ( ( '*' ) )
                    {
                    // InternalOnlineElm.g:1820:2: ( ( '*' ) )
                    // InternalOnlineElm.g:1821:3: ( '*' )
                    {
                     before(grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2()); 
                    // InternalOnlineElm.g:1822:3: ( '*' )
                    // InternalOnlineElm.g:1822:4: '*'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1826:2: ( ( '/' ) )
                    {
                    // InternalOnlineElm.g:1826:2: ( ( '/' ) )
                    // InternalOnlineElm.g:1827:3: ( '/' )
                    {
                     before(grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3()); 
                    // InternalOnlineElm.g:1828:3: ( '/' )
                    // InternalOnlineElm.g:1828:4: '/'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_OP__Alternatives"


    // $ANTLR start "rule__LineType__Alternatives"
    // InternalOnlineElm.g:1836:1: rule__LineType__Alternatives : ( ( ( 'solid' ) ) | ( ( 'dotted' ) ) | ( ( 'dashed' ) ) | ( ( 'dotdash' ) ) | ( ( 'longdash' ) ) );
    public final void rule__LineType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1840:1: ( ( ( 'solid' ) ) | ( ( 'dotted' ) ) | ( ( 'dashed' ) ) | ( ( 'dotdash' ) ) | ( ( 'longdash' ) ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt29=1;
                }
                break;
            case 26:
                {
                alt29=2;
                }
                break;
            case 27:
                {
                alt29=3;
                }
                break;
            case 28:
                {
                alt29=4;
                }
                break;
            case 29:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalOnlineElm.g:1841:2: ( ( 'solid' ) )
                    {
                    // InternalOnlineElm.g:1841:2: ( ( 'solid' ) )
                    // InternalOnlineElm.g:1842:3: ( 'solid' )
                    {
                     before(grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0()); 
                    // InternalOnlineElm.g:1843:3: ( 'solid' )
                    // InternalOnlineElm.g:1843:4: 'solid'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1847:2: ( ( 'dotted' ) )
                    {
                    // InternalOnlineElm.g:1847:2: ( ( 'dotted' ) )
                    // InternalOnlineElm.g:1848:3: ( 'dotted' )
                    {
                     before(grammarAccess.getLineTypeAccess().getDottedEnumLiteralDeclaration_1()); 
                    // InternalOnlineElm.g:1849:3: ( 'dotted' )
                    // InternalOnlineElm.g:1849:4: 'dotted'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineTypeAccess().getDottedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1853:2: ( ( 'dashed' ) )
                    {
                    // InternalOnlineElm.g:1853:2: ( ( 'dashed' ) )
                    // InternalOnlineElm.g:1854:3: ( 'dashed' )
                    {
                     before(grammarAccess.getLineTypeAccess().getDashedEnumLiteralDeclaration_2()); 
                    // InternalOnlineElm.g:1855:3: ( 'dashed' )
                    // InternalOnlineElm.g:1855:4: 'dashed'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineTypeAccess().getDashedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1859:2: ( ( 'dotdash' ) )
                    {
                    // InternalOnlineElm.g:1859:2: ( ( 'dotdash' ) )
                    // InternalOnlineElm.g:1860:3: ( 'dotdash' )
                    {
                     before(grammarAccess.getLineTypeAccess().getDotdashEnumLiteralDeclaration_3()); 
                    // InternalOnlineElm.g:1861:3: ( 'dotdash' )
                    // InternalOnlineElm.g:1861:4: 'dotdash'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineTypeAccess().getDotdashEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1865:2: ( ( 'longdash' ) )
                    {
                    // InternalOnlineElm.g:1865:2: ( ( 'longdash' ) )
                    // InternalOnlineElm.g:1866:3: ( 'longdash' )
                    {
                     before(grammarAccess.getLineTypeAccess().getLongdashEnumLiteralDeclaration_4()); 
                    // InternalOnlineElm.g:1867:3: ( 'longdash' )
                    // InternalOnlineElm.g:1867:4: 'longdash'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLineTypeAccess().getLongdashEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineType__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalOnlineElm.g:1875:1: rule__Color__Alternatives : ( ( ( 'black' ) ) | ( ( 'blank' ) ) | ( ( 'blue' ) ) | ( ( 'brown' ) ) | ( ( 'charcoal' ) ) | ( ( 'darkBlue' ) ) | ( ( 'darkBrown' ) ) | ( ( 'darkGray' ) ) | ( ( 'darkGreen' ) ) | ( ( 'darkGrey' ) ) | ( ( 'darkOrange' ) ) | ( ( 'darkPurple' ) ) | ( ( 'darkRed' ) ) | ( ( 'darkYellow' ) ) | ( ( 'gray' ) ) | ( ( 'green' ) ) | ( ( 'grey' ) ) | ( ( 'hotPink' ) ) | ( ( 'lightBlue' ) ) | ( ( 'lightBrown' ) ) | ( ( 'lightCharcoal' ) ) | ( ( 'lightGray' ) ) | ( ( 'lightGreen' ) ) | ( ( 'lightGrey' ) ) | ( ( 'lightOrange' ) ) | ( ( 'lightPurple' ) ) | ( ( 'lightRed' ) ) | ( ( 'lightYellow' ) ) | ( ( 'orange' ) ) | ( ( 'pink' ) ) | ( ( 'purple' ) ) | ( ( 'red' ) ) | ( ( 'white' ) ) | ( ( 'yellow' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1879:1: ( ( ( 'black' ) ) | ( ( 'blank' ) ) | ( ( 'blue' ) ) | ( ( 'brown' ) ) | ( ( 'charcoal' ) ) | ( ( 'darkBlue' ) ) | ( ( 'darkBrown' ) ) | ( ( 'darkGray' ) ) | ( ( 'darkGreen' ) ) | ( ( 'darkGrey' ) ) | ( ( 'darkOrange' ) ) | ( ( 'darkPurple' ) ) | ( ( 'darkRed' ) ) | ( ( 'darkYellow' ) ) | ( ( 'gray' ) ) | ( ( 'green' ) ) | ( ( 'grey' ) ) | ( ( 'hotPink' ) ) | ( ( 'lightBlue' ) ) | ( ( 'lightBrown' ) ) | ( ( 'lightCharcoal' ) ) | ( ( 'lightGray' ) ) | ( ( 'lightGreen' ) ) | ( ( 'lightGrey' ) ) | ( ( 'lightOrange' ) ) | ( ( 'lightPurple' ) ) | ( ( 'lightRed' ) ) | ( ( 'lightYellow' ) ) | ( ( 'orange' ) ) | ( ( 'pink' ) ) | ( ( 'purple' ) ) | ( ( 'red' ) ) | ( ( 'white' ) ) | ( ( 'yellow' ) ) )
            int alt30=34;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            case 33:
                {
                alt30=4;
                }
                break;
            case 34:
                {
                alt30=5;
                }
                break;
            case 35:
                {
                alt30=6;
                }
                break;
            case 36:
                {
                alt30=7;
                }
                break;
            case 37:
                {
                alt30=8;
                }
                break;
            case 38:
                {
                alt30=9;
                }
                break;
            case 39:
                {
                alt30=10;
                }
                break;
            case 40:
                {
                alt30=11;
                }
                break;
            case 41:
                {
                alt30=12;
                }
                break;
            case 42:
                {
                alt30=13;
                }
                break;
            case 43:
                {
                alt30=14;
                }
                break;
            case 44:
                {
                alt30=15;
                }
                break;
            case 45:
                {
                alt30=16;
                }
                break;
            case 46:
                {
                alt30=17;
                }
                break;
            case 47:
                {
                alt30=18;
                }
                break;
            case 48:
                {
                alt30=19;
                }
                break;
            case 49:
                {
                alt30=20;
                }
                break;
            case 50:
                {
                alt30=21;
                }
                break;
            case 51:
                {
                alt30=22;
                }
                break;
            case 52:
                {
                alt30=23;
                }
                break;
            case 53:
                {
                alt30=24;
                }
                break;
            case 54:
                {
                alt30=25;
                }
                break;
            case 55:
                {
                alt30=26;
                }
                break;
            case 56:
                {
                alt30=27;
                }
                break;
            case 57:
                {
                alt30=28;
                }
                break;
            case 58:
                {
                alt30=29;
                }
                break;
            case 59:
                {
                alt30=30;
                }
                break;
            case 60:
                {
                alt30=31;
                }
                break;
            case 61:
                {
                alt30=32;
                }
                break;
            case 62:
                {
                alt30=33;
                }
                break;
            case 63:
                {
                alt30=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalOnlineElm.g:1880:2: ( ( 'black' ) )
                    {
                    // InternalOnlineElm.g:1880:2: ( ( 'black' ) )
                    // InternalOnlineElm.g:1881:3: ( 'black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_0()); 
                    // InternalOnlineElm.g:1882:3: ( 'black' )
                    // InternalOnlineElm.g:1882:4: 'black'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1886:2: ( ( 'blank' ) )
                    {
                    // InternalOnlineElm.g:1886:2: ( ( 'blank' ) )
                    // InternalOnlineElm.g:1887:3: ( 'blank' )
                    {
                     before(grammarAccess.getColorAccess().getBlankEnumLiteralDeclaration_1()); 
                    // InternalOnlineElm.g:1888:3: ( 'blank' )
                    // InternalOnlineElm.g:1888:4: 'blank'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlankEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1892:2: ( ( 'blue' ) )
                    {
                    // InternalOnlineElm.g:1892:2: ( ( 'blue' ) )
                    // InternalOnlineElm.g:1893:3: ( 'blue' )
                    {
                     before(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalOnlineElm.g:1894:3: ( 'blue' )
                    // InternalOnlineElm.g:1894:4: 'blue'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1898:2: ( ( 'brown' ) )
                    {
                    // InternalOnlineElm.g:1898:2: ( ( 'brown' ) )
                    // InternalOnlineElm.g:1899:3: ( 'brown' )
                    {
                     before(grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_3()); 
                    // InternalOnlineElm.g:1900:3: ( 'brown' )
                    // InternalOnlineElm.g:1900:4: 'brown'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1904:2: ( ( 'charcoal' ) )
                    {
                    // InternalOnlineElm.g:1904:2: ( ( 'charcoal' ) )
                    // InternalOnlineElm.g:1905:3: ( 'charcoal' )
                    {
                     before(grammarAccess.getColorAccess().getCharcoalEnumLiteralDeclaration_4()); 
                    // InternalOnlineElm.g:1906:3: ( 'charcoal' )
                    // InternalOnlineElm.g:1906:4: 'charcoal'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCharcoalEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOnlineElm.g:1910:2: ( ( 'darkBlue' ) )
                    {
                    // InternalOnlineElm.g:1910:2: ( ( 'darkBlue' ) )
                    // InternalOnlineElm.g:1911:3: ( 'darkBlue' )
                    {
                     before(grammarAccess.getColorAccess().getDarkBlueEnumLiteralDeclaration_5()); 
                    // InternalOnlineElm.g:1912:3: ( 'darkBlue' )
                    // InternalOnlineElm.g:1912:4: 'darkBlue'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkBlueEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOnlineElm.g:1916:2: ( ( 'darkBrown' ) )
                    {
                    // InternalOnlineElm.g:1916:2: ( ( 'darkBrown' ) )
                    // InternalOnlineElm.g:1917:3: ( 'darkBrown' )
                    {
                     before(grammarAccess.getColorAccess().getDarkBrownEnumLiteralDeclaration_6()); 
                    // InternalOnlineElm.g:1918:3: ( 'darkBrown' )
                    // InternalOnlineElm.g:1918:4: 'darkBrown'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkBrownEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOnlineElm.g:1922:2: ( ( 'darkGray' ) )
                    {
                    // InternalOnlineElm.g:1922:2: ( ( 'darkGray' ) )
                    // InternalOnlineElm.g:1923:3: ( 'darkGray' )
                    {
                     before(grammarAccess.getColorAccess().getDarkGrayEnumLiteralDeclaration_7()); 
                    // InternalOnlineElm.g:1924:3: ( 'darkGray' )
                    // InternalOnlineElm.g:1924:4: 'darkGray'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkGrayEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOnlineElm.g:1928:2: ( ( 'darkGreen' ) )
                    {
                    // InternalOnlineElm.g:1928:2: ( ( 'darkGreen' ) )
                    // InternalOnlineElm.g:1929:3: ( 'darkGreen' )
                    {
                     before(grammarAccess.getColorAccess().getDarkGreenEnumLiteralDeclaration_8()); 
                    // InternalOnlineElm.g:1930:3: ( 'darkGreen' )
                    // InternalOnlineElm.g:1930:4: 'darkGreen'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkGreenEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOnlineElm.g:1934:2: ( ( 'darkGrey' ) )
                    {
                    // InternalOnlineElm.g:1934:2: ( ( 'darkGrey' ) )
                    // InternalOnlineElm.g:1935:3: ( 'darkGrey' )
                    {
                     before(grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9()); 
                    // InternalOnlineElm.g:1936:3: ( 'darkGrey' )
                    // InternalOnlineElm.g:1936:4: 'darkGrey'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOnlineElm.g:1940:2: ( ( 'darkOrange' ) )
                    {
                    // InternalOnlineElm.g:1940:2: ( ( 'darkOrange' ) )
                    // InternalOnlineElm.g:1941:3: ( 'darkOrange' )
                    {
                     before(grammarAccess.getColorAccess().getDarkOrangeEnumLiteralDeclaration_10()); 
                    // InternalOnlineElm.g:1942:3: ( 'darkOrange' )
                    // InternalOnlineElm.g:1942:4: 'darkOrange'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkOrangeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOnlineElm.g:1946:2: ( ( 'darkPurple' ) )
                    {
                    // InternalOnlineElm.g:1946:2: ( ( 'darkPurple' ) )
                    // InternalOnlineElm.g:1947:3: ( 'darkPurple' )
                    {
                     before(grammarAccess.getColorAccess().getDarkPurpleEnumLiteralDeclaration_11()); 
                    // InternalOnlineElm.g:1948:3: ( 'darkPurple' )
                    // InternalOnlineElm.g:1948:4: 'darkPurple'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkPurpleEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalOnlineElm.g:1952:2: ( ( 'darkRed' ) )
                    {
                    // InternalOnlineElm.g:1952:2: ( ( 'darkRed' ) )
                    // InternalOnlineElm.g:1953:3: ( 'darkRed' )
                    {
                     before(grammarAccess.getColorAccess().getDarkRedEnumLiteralDeclaration_12()); 
                    // InternalOnlineElm.g:1954:3: ( 'darkRed' )
                    // InternalOnlineElm.g:1954:4: 'darkRed'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkRedEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalOnlineElm.g:1958:2: ( ( 'darkYellow' ) )
                    {
                    // InternalOnlineElm.g:1958:2: ( ( 'darkYellow' ) )
                    // InternalOnlineElm.g:1959:3: ( 'darkYellow' )
                    {
                     before(grammarAccess.getColorAccess().getDarkYellowEnumLiteralDeclaration_13()); 
                    // InternalOnlineElm.g:1960:3: ( 'darkYellow' )
                    // InternalOnlineElm.g:1960:4: 'darkYellow'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkYellowEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalOnlineElm.g:1964:2: ( ( 'gray' ) )
                    {
                    // InternalOnlineElm.g:1964:2: ( ( 'gray' ) )
                    // InternalOnlineElm.g:1965:3: ( 'gray' )
                    {
                     before(grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_14()); 
                    // InternalOnlineElm.g:1966:3: ( 'gray' )
                    // InternalOnlineElm.g:1966:4: 'gray'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalOnlineElm.g:1970:2: ( ( 'green' ) )
                    {
                    // InternalOnlineElm.g:1970:2: ( ( 'green' ) )
                    // InternalOnlineElm.g:1971:3: ( 'green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_15()); 
                    // InternalOnlineElm.g:1972:3: ( 'green' )
                    // InternalOnlineElm.g:1972:4: 'green'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalOnlineElm.g:1976:2: ( ( 'grey' ) )
                    {
                    // InternalOnlineElm.g:1976:2: ( ( 'grey' ) )
                    // InternalOnlineElm.g:1977:3: ( 'grey' )
                    {
                     before(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_16()); 
                    // InternalOnlineElm.g:1978:3: ( 'grey' )
                    // InternalOnlineElm.g:1978:4: 'grey'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalOnlineElm.g:1982:2: ( ( 'hotPink' ) )
                    {
                    // InternalOnlineElm.g:1982:2: ( ( 'hotPink' ) )
                    // InternalOnlineElm.g:1983:3: ( 'hotPink' )
                    {
                     before(grammarAccess.getColorAccess().getHotPinkEnumLiteralDeclaration_17()); 
                    // InternalOnlineElm.g:1984:3: ( 'hotPink' )
                    // InternalOnlineElm.g:1984:4: 'hotPink'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getHotPinkEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalOnlineElm.g:1988:2: ( ( 'lightBlue' ) )
                    {
                    // InternalOnlineElm.g:1988:2: ( ( 'lightBlue' ) )
                    // InternalOnlineElm.g:1989:3: ( 'lightBlue' )
                    {
                     before(grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_18()); 
                    // InternalOnlineElm.g:1990:3: ( 'lightBlue' )
                    // InternalOnlineElm.g:1990:4: 'lightBlue'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalOnlineElm.g:1994:2: ( ( 'lightBrown' ) )
                    {
                    // InternalOnlineElm.g:1994:2: ( ( 'lightBrown' ) )
                    // InternalOnlineElm.g:1995:3: ( 'lightBrown' )
                    {
                     before(grammarAccess.getColorAccess().getLightBrownEnumLiteralDeclaration_19()); 
                    // InternalOnlineElm.g:1996:3: ( 'lightBrown' )
                    // InternalOnlineElm.g:1996:4: 'lightBrown'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightBrownEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalOnlineElm.g:2000:2: ( ( 'lightCharcoal' ) )
                    {
                    // InternalOnlineElm.g:2000:2: ( ( 'lightCharcoal' ) )
                    // InternalOnlineElm.g:2001:3: ( 'lightCharcoal' )
                    {
                     before(grammarAccess.getColorAccess().getLightCharcoalEnumLiteralDeclaration_20()); 
                    // InternalOnlineElm.g:2002:3: ( 'lightCharcoal' )
                    // InternalOnlineElm.g:2002:4: 'lightCharcoal'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightCharcoalEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalOnlineElm.g:2006:2: ( ( 'lightGray' ) )
                    {
                    // InternalOnlineElm.g:2006:2: ( ( 'lightGray' ) )
                    // InternalOnlineElm.g:2007:3: ( 'lightGray' )
                    {
                     before(grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_21()); 
                    // InternalOnlineElm.g:2008:3: ( 'lightGray' )
                    // InternalOnlineElm.g:2008:4: 'lightGray'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalOnlineElm.g:2012:2: ( ( 'lightGreen' ) )
                    {
                    // InternalOnlineElm.g:2012:2: ( ( 'lightGreen' ) )
                    // InternalOnlineElm.g:2013:3: ( 'lightGreen' )
                    {
                     before(grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_22()); 
                    // InternalOnlineElm.g:2014:3: ( 'lightGreen' )
                    // InternalOnlineElm.g:2014:4: 'lightGreen'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalOnlineElm.g:2018:2: ( ( 'lightGrey' ) )
                    {
                    // InternalOnlineElm.g:2018:2: ( ( 'lightGrey' ) )
                    // InternalOnlineElm.g:2019:3: ( 'lightGrey' )
                    {
                     before(grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_23()); 
                    // InternalOnlineElm.g:2020:3: ( 'lightGrey' )
                    // InternalOnlineElm.g:2020:4: 'lightGrey'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalOnlineElm.g:2024:2: ( ( 'lightOrange' ) )
                    {
                    // InternalOnlineElm.g:2024:2: ( ( 'lightOrange' ) )
                    // InternalOnlineElm.g:2025:3: ( 'lightOrange' )
                    {
                     before(grammarAccess.getColorAccess().getLightOrangeEnumLiteralDeclaration_24()); 
                    // InternalOnlineElm.g:2026:3: ( 'lightOrange' )
                    // InternalOnlineElm.g:2026:4: 'lightOrange'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightOrangeEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalOnlineElm.g:2030:2: ( ( 'lightPurple' ) )
                    {
                    // InternalOnlineElm.g:2030:2: ( ( 'lightPurple' ) )
                    // InternalOnlineElm.g:2031:3: ( 'lightPurple' )
                    {
                     before(grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_25()); 
                    // InternalOnlineElm.g:2032:3: ( 'lightPurple' )
                    // InternalOnlineElm.g:2032:4: 'lightPurple'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalOnlineElm.g:2036:2: ( ( 'lightRed' ) )
                    {
                    // InternalOnlineElm.g:2036:2: ( ( 'lightRed' ) )
                    // InternalOnlineElm.g:2037:3: ( 'lightRed' )
                    {
                     before(grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_26()); 
                    // InternalOnlineElm.g:2038:3: ( 'lightRed' )
                    // InternalOnlineElm.g:2038:4: 'lightRed'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalOnlineElm.g:2042:2: ( ( 'lightYellow' ) )
                    {
                    // InternalOnlineElm.g:2042:2: ( ( 'lightYellow' ) )
                    // InternalOnlineElm.g:2043:3: ( 'lightYellow' )
                    {
                     before(grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_27()); 
                    // InternalOnlineElm.g:2044:3: ( 'lightYellow' )
                    // InternalOnlineElm.g:2044:4: 'lightYellow'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalOnlineElm.g:2048:2: ( ( 'orange' ) )
                    {
                    // InternalOnlineElm.g:2048:2: ( ( 'orange' ) )
                    // InternalOnlineElm.g:2049:3: ( 'orange' )
                    {
                     before(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_28()); 
                    // InternalOnlineElm.g:2050:3: ( 'orange' )
                    // InternalOnlineElm.g:2050:4: 'orange'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalOnlineElm.g:2054:2: ( ( 'pink' ) )
                    {
                    // InternalOnlineElm.g:2054:2: ( ( 'pink' ) )
                    // InternalOnlineElm.g:2055:3: ( 'pink' )
                    {
                     before(grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_29()); 
                    // InternalOnlineElm.g:2056:3: ( 'pink' )
                    // InternalOnlineElm.g:2056:4: 'pink'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalOnlineElm.g:2060:2: ( ( 'purple' ) )
                    {
                    // InternalOnlineElm.g:2060:2: ( ( 'purple' ) )
                    // InternalOnlineElm.g:2061:3: ( 'purple' )
                    {
                     before(grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_30()); 
                    // InternalOnlineElm.g:2062:3: ( 'purple' )
                    // InternalOnlineElm.g:2062:4: 'purple'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalOnlineElm.g:2066:2: ( ( 'red' ) )
                    {
                    // InternalOnlineElm.g:2066:2: ( ( 'red' ) )
                    // InternalOnlineElm.g:2067:3: ( 'red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_31()); 
                    // InternalOnlineElm.g:2068:3: ( 'red' )
                    // InternalOnlineElm.g:2068:4: 'red'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalOnlineElm.g:2072:2: ( ( 'white' ) )
                    {
                    // InternalOnlineElm.g:2072:2: ( ( 'white' ) )
                    // InternalOnlineElm.g:2073:3: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_32()); 
                    // InternalOnlineElm.g:2074:3: ( 'white' )
                    // InternalOnlineElm.g:2074:4: 'white'
                    {
                    match(input,62,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalOnlineElm.g:2078:2: ( ( 'yellow' ) )
                    {
                    // InternalOnlineElm.g:2078:2: ( ( 'yellow' ) )
                    // InternalOnlineElm.g:2079:3: ( 'yellow' )
                    {
                     before(grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_33()); 
                    // InternalOnlineElm.g:2080:3: ( 'yellow' )
                    // InternalOnlineElm.g:2080:4: 'yellow'
                    {
                    match(input,63,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_33()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__OnlineElm__Group__0"
    // InternalOnlineElm.g:2088:1: rule__OnlineElm__Group__0 : rule__OnlineElm__Group__0__Impl rule__OnlineElm__Group__1 ;
    public final void rule__OnlineElm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2092:1: ( rule__OnlineElm__Group__0__Impl rule__OnlineElm__Group__1 )
            // InternalOnlineElm.g:2093:2: rule__OnlineElm__Group__0__Impl rule__OnlineElm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OnlineElm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlineElm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__0"


    // $ANTLR start "rule__OnlineElm__Group__0__Impl"
    // InternalOnlineElm.g:2100:1: rule__OnlineElm__Group__0__Impl : ( ( rule__OnlineElm__EntryAssignment_0 ) ) ;
    public final void rule__OnlineElm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2104:1: ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) )
            // InternalOnlineElm.g:2105:1: ( ( rule__OnlineElm__EntryAssignment_0 ) )
            {
            // InternalOnlineElm.g:2105:1: ( ( rule__OnlineElm__EntryAssignment_0 ) )
            // InternalOnlineElm.g:2106:2: ( rule__OnlineElm__EntryAssignment_0 )
            {
             before(grammarAccess.getOnlineElmAccess().getEntryAssignment_0()); 
            // InternalOnlineElm.g:2107:2: ( rule__OnlineElm__EntryAssignment_0 )
            // InternalOnlineElm.g:2107:3: rule__OnlineElm__EntryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__EntryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOnlineElmAccess().getEntryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__0__Impl"


    // $ANTLR start "rule__OnlineElm__Group__1"
    // InternalOnlineElm.g:2115:1: rule__OnlineElm__Group__1 : rule__OnlineElm__Group__1__Impl rule__OnlineElm__Group__2 ;
    public final void rule__OnlineElm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2119:1: ( rule__OnlineElm__Group__1__Impl rule__OnlineElm__Group__2 )
            // InternalOnlineElm.g:2120:2: rule__OnlineElm__Group__1__Impl rule__OnlineElm__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OnlineElm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlineElm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__1"


    // $ANTLR start "rule__OnlineElm__Group__1__Impl"
    // InternalOnlineElm.g:2127:1: rule__OnlineElm__Group__1__Impl : ( ( rule__OnlineElm__ShapesAssignment_1 )* ) ;
    public final void rule__OnlineElm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2131:1: ( ( ( rule__OnlineElm__ShapesAssignment_1 )* ) )
            // InternalOnlineElm.g:2132:1: ( ( rule__OnlineElm__ShapesAssignment_1 )* )
            {
            // InternalOnlineElm.g:2132:1: ( ( rule__OnlineElm__ShapesAssignment_1 )* )
            // InternalOnlineElm.g:2133:2: ( rule__OnlineElm__ShapesAssignment_1 )*
            {
             before(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 
            // InternalOnlineElm.g:2134:2: ( rule__OnlineElm__ShapesAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_FQN) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==64) ) {
                        int LA31_3 = input.LA(3);

                        if ( (LA31_3==RULE_NL||LA31_3==65||LA31_3==71||(LA31_3>=82 && LA31_3<=90)) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalOnlineElm.g:2134:3: rule__OnlineElm__ShapesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__OnlineElm__ShapesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__1__Impl"


    // $ANTLR start "rule__OnlineElm__Group__2"
    // InternalOnlineElm.g:2142:1: rule__OnlineElm__Group__2 : rule__OnlineElm__Group__2__Impl ;
    public final void rule__OnlineElm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2146:1: ( rule__OnlineElm__Group__2__Impl )
            // InternalOnlineElm.g:2147:2: rule__OnlineElm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__2"


    // $ANTLR start "rule__OnlineElm__Group__2__Impl"
    // InternalOnlineElm.g:2153:1: rule__OnlineElm__Group__2__Impl : ( ( rule__OnlineElm__VarAssignment_2 )* ) ;
    public final void rule__OnlineElm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2157:1: ( ( ( rule__OnlineElm__VarAssignment_2 )* ) )
            // InternalOnlineElm.g:2158:1: ( ( rule__OnlineElm__VarAssignment_2 )* )
            {
            // InternalOnlineElm.g:2158:1: ( ( rule__OnlineElm__VarAssignment_2 )* )
            // InternalOnlineElm.g:2159:2: ( rule__OnlineElm__VarAssignment_2 )*
            {
             before(grammarAccess.getOnlineElmAccess().getVarAssignment_2()); 
            // InternalOnlineElm.g:2160:2: ( rule__OnlineElm__VarAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_FQN) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOnlineElm.g:2160:3: rule__OnlineElm__VarAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__OnlineElm__VarAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getOnlineElmAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__Group__2__Impl"


    // $ANTLR start "rule__MainShape__Group__0"
    // InternalOnlineElm.g:2169:1: rule__MainShape__Group__0 : rule__MainShape__Group__0__Impl rule__MainShape__Group__1 ;
    public final void rule__MainShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2173:1: ( rule__MainShape__Group__0__Impl rule__MainShape__Group__1 )
            // InternalOnlineElm.g:2174:2: rule__MainShape__Group__0__Impl rule__MainShape__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MainShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__0"


    // $ANTLR start "rule__MainShape__Group__0__Impl"
    // InternalOnlineElm.g:2181:1: rule__MainShape__Group__0__Impl : ( ( rule__MainShape__NameAssignment_0 ) ) ;
    public final void rule__MainShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2185:1: ( ( ( rule__MainShape__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2186:1: ( ( rule__MainShape__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2186:1: ( ( rule__MainShape__NameAssignment_0 ) )
            // InternalOnlineElm.g:2187:2: ( rule__MainShape__NameAssignment_0 )
            {
             before(grammarAccess.getMainShapeAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:2188:2: ( rule__MainShape__NameAssignment_0 )
            // InternalOnlineElm.g:2188:3: rule__MainShape__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainShapeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__0__Impl"


    // $ANTLR start "rule__MainShape__Group__1"
    // InternalOnlineElm.g:2196:1: rule__MainShape__Group__1 : rule__MainShape__Group__1__Impl rule__MainShape__Group__2 ;
    public final void rule__MainShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2200:1: ( rule__MainShape__Group__1__Impl rule__MainShape__Group__2 )
            // InternalOnlineElm.g:2201:2: rule__MainShape__Group__1__Impl rule__MainShape__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MainShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__1"


    // $ANTLR start "rule__MainShape__Group__1__Impl"
    // InternalOnlineElm.g:2208:1: rule__MainShape__Group__1__Impl : ( 'time' ) ;
    public final void rule__MainShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2212:1: ( ( 'time' ) )
            // InternalOnlineElm.g:2213:1: ( 'time' )
            {
            // InternalOnlineElm.g:2213:1: ( 'time' )
            // InternalOnlineElm.g:2214:2: 'time'
            {
             before(grammarAccess.getMainShapeAccess().getTimeKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__1__Impl"


    // $ANTLR start "rule__MainShape__Group__2"
    // InternalOnlineElm.g:2223:1: rule__MainShape__Group__2 : rule__MainShape__Group__2__Impl rule__MainShape__Group__3 ;
    public final void rule__MainShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2227:1: ( rule__MainShape__Group__2__Impl rule__MainShape__Group__3 )
            // InternalOnlineElm.g:2228:2: rule__MainShape__Group__2__Impl rule__MainShape__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MainShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__2"


    // $ANTLR start "rule__MainShape__Group__2__Impl"
    // InternalOnlineElm.g:2235:1: rule__MainShape__Group__2__Impl : ( '=' ) ;
    public final void rule__MainShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2239:1: ( ( '=' ) )
            // InternalOnlineElm.g:2240:1: ( '=' )
            {
            // InternalOnlineElm.g:2240:1: ( '=' )
            // InternalOnlineElm.g:2241:2: '='
            {
             before(grammarAccess.getMainShapeAccess().getEqualsSignKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__2__Impl"


    // $ANTLR start "rule__MainShape__Group__3"
    // InternalOnlineElm.g:2250:1: rule__MainShape__Group__3 : rule__MainShape__Group__3__Impl rule__MainShape__Group__4 ;
    public final void rule__MainShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2254:1: ( rule__MainShape__Group__3__Impl rule__MainShape__Group__4 )
            // InternalOnlineElm.g:2255:2: rule__MainShape__Group__3__Impl rule__MainShape__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MainShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__3"


    // $ANTLR start "rule__MainShape__Group__3__Impl"
    // InternalOnlineElm.g:2262:1: rule__MainShape__Group__3__Impl : ( '[' ) ;
    public final void rule__MainShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2266:1: ( ( '[' ) )
            // InternalOnlineElm.g:2267:1: ( '[' )
            {
            // InternalOnlineElm.g:2267:1: ( '[' )
            // InternalOnlineElm.g:2268:2: '['
            {
             before(grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__3__Impl"


    // $ANTLR start "rule__MainShape__Group__4"
    // InternalOnlineElm.g:2277:1: rule__MainShape__Group__4 : rule__MainShape__Group__4__Impl rule__MainShape__Group__5 ;
    public final void rule__MainShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2281:1: ( rule__MainShape__Group__4__Impl rule__MainShape__Group__5 )
            // InternalOnlineElm.g:2282:2: rule__MainShape__Group__4__Impl rule__MainShape__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MainShape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__4"


    // $ANTLR start "rule__MainShape__Group__4__Impl"
    // InternalOnlineElm.g:2289:1: rule__MainShape__Group__4__Impl : ( ( rule__MainShape__Alternatives_4 ) ) ;
    public final void rule__MainShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2293:1: ( ( ( rule__MainShape__Alternatives_4 ) ) )
            // InternalOnlineElm.g:2294:1: ( ( rule__MainShape__Alternatives_4 ) )
            {
            // InternalOnlineElm.g:2294:1: ( ( rule__MainShape__Alternatives_4 ) )
            // InternalOnlineElm.g:2295:2: ( rule__MainShape__Alternatives_4 )
            {
             before(grammarAccess.getMainShapeAccess().getAlternatives_4()); 
            // InternalOnlineElm.g:2296:2: ( rule__MainShape__Alternatives_4 )
            // InternalOnlineElm.g:2296:3: rule__MainShape__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getMainShapeAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__4__Impl"


    // $ANTLR start "rule__MainShape__Group__5"
    // InternalOnlineElm.g:2304:1: rule__MainShape__Group__5 : rule__MainShape__Group__5__Impl rule__MainShape__Group__6 ;
    public final void rule__MainShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2308:1: ( rule__MainShape__Group__5__Impl rule__MainShape__Group__6 )
            // InternalOnlineElm.g:2309:2: rule__MainShape__Group__5__Impl rule__MainShape__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__MainShape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__5"


    // $ANTLR start "rule__MainShape__Group__5__Impl"
    // InternalOnlineElm.g:2316:1: rule__MainShape__Group__5__Impl : ( ( rule__MainShape__Group_5__0 )* ) ;
    public final void rule__MainShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2320:1: ( ( ( rule__MainShape__Group_5__0 )* ) )
            // InternalOnlineElm.g:2321:1: ( ( rule__MainShape__Group_5__0 )* )
            {
            // InternalOnlineElm.g:2321:1: ( ( rule__MainShape__Group_5__0 )* )
            // InternalOnlineElm.g:2322:2: ( rule__MainShape__Group_5__0 )*
            {
             before(grammarAccess.getMainShapeAccess().getGroup_5()); 
            // InternalOnlineElm.g:2323:2: ( rule__MainShape__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_NL) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==67) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOnlineElm.g:2323:3: rule__MainShape__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainShape__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMainShapeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__5__Impl"


    // $ANTLR start "rule__MainShape__Group__6"
    // InternalOnlineElm.g:2331:1: rule__MainShape__Group__6 : rule__MainShape__Group__6__Impl rule__MainShape__Group__7 ;
    public final void rule__MainShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2335:1: ( rule__MainShape__Group__6__Impl rule__MainShape__Group__7 )
            // InternalOnlineElm.g:2336:2: rule__MainShape__Group__6__Impl rule__MainShape__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__MainShape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__6"


    // $ANTLR start "rule__MainShape__Group__6__Impl"
    // InternalOnlineElm.g:2343:1: rule__MainShape__Group__6__Impl : ( ( RULE_NL )? ) ;
    public final void rule__MainShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2347:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:2348:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:2348:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:2349:2: ( RULE_NL )?
            {
             before(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_6()); 
            // InternalOnlineElm.g:2350:2: ( RULE_NL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_NL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOnlineElm.g:2350:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__6__Impl"


    // $ANTLR start "rule__MainShape__Group__7"
    // InternalOnlineElm.g:2358:1: rule__MainShape__Group__7 : rule__MainShape__Group__7__Impl rule__MainShape__Group__8 ;
    public final void rule__MainShape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2362:1: ( rule__MainShape__Group__7__Impl rule__MainShape__Group__8 )
            // InternalOnlineElm.g:2363:2: rule__MainShape__Group__7__Impl rule__MainShape__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__MainShape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__7"


    // $ANTLR start "rule__MainShape__Group__7__Impl"
    // InternalOnlineElm.g:2370:1: rule__MainShape__Group__7__Impl : ( ']' ) ;
    public final void rule__MainShape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2374:1: ( ( ']' ) )
            // InternalOnlineElm.g:2375:1: ( ']' )
            {
            // InternalOnlineElm.g:2375:1: ( ']' )
            // InternalOnlineElm.g:2376:2: ']'
            {
             before(grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_7()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__7__Impl"


    // $ANTLR start "rule__MainShape__Group__8"
    // InternalOnlineElm.g:2385:1: rule__MainShape__Group__8 : rule__MainShape__Group__8__Impl ;
    public final void rule__MainShape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2389:1: ( rule__MainShape__Group__8__Impl )
            // InternalOnlineElm.g:2390:2: rule__MainShape__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__8"


    // $ANTLR start "rule__MainShape__Group__8__Impl"
    // InternalOnlineElm.g:2396:1: rule__MainShape__Group__8__Impl : ( ( rule__MainShape__Alternatives_8 )* ) ;
    public final void rule__MainShape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2400:1: ( ( ( rule__MainShape__Alternatives_8 )* ) )
            // InternalOnlineElm.g:2401:1: ( ( rule__MainShape__Alternatives_8 )* )
            {
            // InternalOnlineElm.g:2401:1: ( ( rule__MainShape__Alternatives_8 )* )
            // InternalOnlineElm.g:2402:2: ( rule__MainShape__Alternatives_8 )*
            {
             before(grammarAccess.getMainShapeAccess().getAlternatives_8()); 
            // InternalOnlineElm.g:2403:2: ( rule__MainShape__Alternatives_8 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_NL||LA35_0==68) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOnlineElm.g:2403:3: rule__MainShape__Alternatives_8
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MainShape__Alternatives_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getMainShapeAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group__8__Impl"


    // $ANTLR start "rule__MainShape__Group_5__0"
    // InternalOnlineElm.g:2412:1: rule__MainShape__Group_5__0 : rule__MainShape__Group_5__0__Impl rule__MainShape__Group_5__1 ;
    public final void rule__MainShape__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2416:1: ( rule__MainShape__Group_5__0__Impl rule__MainShape__Group_5__1 )
            // InternalOnlineElm.g:2417:2: rule__MainShape__Group_5__0__Impl rule__MainShape__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__MainShape__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__0"


    // $ANTLR start "rule__MainShape__Group_5__0__Impl"
    // InternalOnlineElm.g:2424:1: rule__MainShape__Group_5__0__Impl : ( ( RULE_NL )? ) ;
    public final void rule__MainShape__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2428:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:2429:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:2429:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:2430:2: ( RULE_NL )?
            {
             before(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_5_0()); 
            // InternalOnlineElm.g:2431:2: ( RULE_NL )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_NL) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOnlineElm.g:2431:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__0__Impl"


    // $ANTLR start "rule__MainShape__Group_5__1"
    // InternalOnlineElm.g:2439:1: rule__MainShape__Group_5__1 : rule__MainShape__Group_5__1__Impl rule__MainShape__Group_5__2 ;
    public final void rule__MainShape__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2443:1: ( rule__MainShape__Group_5__1__Impl rule__MainShape__Group_5__2 )
            // InternalOnlineElm.g:2444:2: rule__MainShape__Group_5__1__Impl rule__MainShape__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__MainShape__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__1"


    // $ANTLR start "rule__MainShape__Group_5__1__Impl"
    // InternalOnlineElm.g:2451:1: rule__MainShape__Group_5__1__Impl : ( ',' ) ;
    public final void rule__MainShape__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2455:1: ( ( ',' ) )
            // InternalOnlineElm.g:2456:1: ( ',' )
            {
            // InternalOnlineElm.g:2456:1: ( ',' )
            // InternalOnlineElm.g:2457:2: ','
            {
             before(grammarAccess.getMainShapeAccess().getCommaKeyword_5_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getCommaKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__1__Impl"


    // $ANTLR start "rule__MainShape__Group_5__2"
    // InternalOnlineElm.g:2466:1: rule__MainShape__Group_5__2 : rule__MainShape__Group_5__2__Impl ;
    public final void rule__MainShape__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2470:1: ( rule__MainShape__Group_5__2__Impl )
            // InternalOnlineElm.g:2471:2: rule__MainShape__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__2"


    // $ANTLR start "rule__MainShape__Group_5__2__Impl"
    // InternalOnlineElm.g:2477:1: rule__MainShape__Group_5__2__Impl : ( ( rule__MainShape__Alternatives_5_2 ) ) ;
    public final void rule__MainShape__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2481:1: ( ( ( rule__MainShape__Alternatives_5_2 ) ) )
            // InternalOnlineElm.g:2482:1: ( ( rule__MainShape__Alternatives_5_2 ) )
            {
            // InternalOnlineElm.g:2482:1: ( ( rule__MainShape__Alternatives_5_2 ) )
            // InternalOnlineElm.g:2483:2: ( rule__MainShape__Alternatives_5_2 )
            {
             before(grammarAccess.getMainShapeAccess().getAlternatives_5_2()); 
            // InternalOnlineElm.g:2484:2: ( rule__MainShape__Alternatives_5_2 )
            // InternalOnlineElm.g:2484:3: rule__MainShape__Alternatives_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Alternatives_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMainShapeAccess().getAlternatives_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_5__2__Impl"


    // $ANTLR start "rule__MainShape__Group_8_1__0"
    // InternalOnlineElm.g:2493:1: rule__MainShape__Group_8_1__0 : rule__MainShape__Group_8_1__0__Impl rule__MainShape__Group_8_1__1 ;
    public final void rule__MainShape__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2497:1: ( rule__MainShape__Group_8_1__0__Impl rule__MainShape__Group_8_1__1 )
            // InternalOnlineElm.g:2498:2: rule__MainShape__Group_8_1__0__Impl rule__MainShape__Group_8_1__1
            {
            pushFollow(FOLLOW_3);
            rule__MainShape__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainShape__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_8_1__0"


    // $ANTLR start "rule__MainShape__Group_8_1__0__Impl"
    // InternalOnlineElm.g:2505:1: rule__MainShape__Group_8_1__0__Impl : ( '++' ) ;
    public final void rule__MainShape__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2509:1: ( ( '++' ) )
            // InternalOnlineElm.g:2510:1: ( '++' )
            {
            // InternalOnlineElm.g:2510:1: ( '++' )
            // InternalOnlineElm.g:2511:2: '++'
            {
             before(grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_8_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_8_1__0__Impl"


    // $ANTLR start "rule__MainShape__Group_8_1__1"
    // InternalOnlineElm.g:2520:1: rule__MainShape__Group_8_1__1 : rule__MainShape__Group_8_1__1__Impl ;
    public final void rule__MainShape__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2524:1: ( rule__MainShape__Group_8_1__1__Impl )
            // InternalOnlineElm.g:2525:2: rule__MainShape__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_8_1__1"


    // $ANTLR start "rule__MainShape__Group_8_1__1__Impl"
    // InternalOnlineElm.g:2531:1: rule__MainShape__Group_8_1__1__Impl : ( ( rule__MainShape__ExternalAssignment_8_1_1 ) ) ;
    public final void rule__MainShape__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2535:1: ( ( ( rule__MainShape__ExternalAssignment_8_1_1 ) ) )
            // InternalOnlineElm.g:2536:1: ( ( rule__MainShape__ExternalAssignment_8_1_1 ) )
            {
            // InternalOnlineElm.g:2536:1: ( ( rule__MainShape__ExternalAssignment_8_1_1 ) )
            // InternalOnlineElm.g:2537:2: ( rule__MainShape__ExternalAssignment_8_1_1 )
            {
             before(grammarAccess.getMainShapeAccess().getExternalAssignment_8_1_1()); 
            // InternalOnlineElm.g:2538:2: ( rule__MainShape__ExternalAssignment_8_1_1 )
            // InternalOnlineElm.g:2538:3: rule__MainShape__ExternalAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__ExternalAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMainShapeAccess().getExternalAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_8_1__1__Impl"


    // $ANTLR start "rule__Local_var__Group__0"
    // InternalOnlineElm.g:2547:1: rule__Local_var__Group__0 : rule__Local_var__Group__0__Impl rule__Local_var__Group__1 ;
    public final void rule__Local_var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2551:1: ( rule__Local_var__Group__0__Impl rule__Local_var__Group__1 )
            // InternalOnlineElm.g:2552:2: rule__Local_var__Group__0__Impl rule__Local_var__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Local_var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local_var__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__0"


    // $ANTLR start "rule__Local_var__Group__0__Impl"
    // InternalOnlineElm.g:2559:1: rule__Local_var__Group__0__Impl : ( ( rule__Local_var__NameAssignment_0 ) ) ;
    public final void rule__Local_var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2563:1: ( ( ( rule__Local_var__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2564:1: ( ( rule__Local_var__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2564:1: ( ( rule__Local_var__NameAssignment_0 ) )
            // InternalOnlineElm.g:2565:2: ( rule__Local_var__NameAssignment_0 )
            {
             before(grammarAccess.getLocal_varAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:2566:2: ( rule__Local_var__NameAssignment_0 )
            // InternalOnlineElm.g:2566:3: rule__Local_var__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Local_var__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocal_varAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__0__Impl"


    // $ANTLR start "rule__Local_var__Group__1"
    // InternalOnlineElm.g:2574:1: rule__Local_var__Group__1 : rule__Local_var__Group__1__Impl rule__Local_var__Group__2 ;
    public final void rule__Local_var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2578:1: ( rule__Local_var__Group__1__Impl rule__Local_var__Group__2 )
            // InternalOnlineElm.g:2579:2: rule__Local_var__Group__1__Impl rule__Local_var__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Local_var__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local_var__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__1"


    // $ANTLR start "rule__Local_var__Group__1__Impl"
    // InternalOnlineElm.g:2586:1: rule__Local_var__Group__1__Impl : ( '=' ) ;
    public final void rule__Local_var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2590:1: ( ( '=' ) )
            // InternalOnlineElm.g:2591:1: ( '=' )
            {
            // InternalOnlineElm.g:2591:1: ( '=' )
            // InternalOnlineElm.g:2592:2: '='
            {
             before(grammarAccess.getLocal_varAccess().getEqualsSignKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getLocal_varAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__1__Impl"


    // $ANTLR start "rule__Local_var__Group__2"
    // InternalOnlineElm.g:2601:1: rule__Local_var__Group__2 : rule__Local_var__Group__2__Impl rule__Local_var__Group__3 ;
    public final void rule__Local_var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2605:1: ( rule__Local_var__Group__2__Impl rule__Local_var__Group__3 )
            // InternalOnlineElm.g:2606:2: rule__Local_var__Group__2__Impl rule__Local_var__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Local_var__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local_var__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__2"


    // $ANTLR start "rule__Local_var__Group__2__Impl"
    // InternalOnlineElm.g:2613:1: rule__Local_var__Group__2__Impl : ( ( rule__Local_var__VarAssignment_2 ) ) ;
    public final void rule__Local_var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2617:1: ( ( ( rule__Local_var__VarAssignment_2 ) ) )
            // InternalOnlineElm.g:2618:1: ( ( rule__Local_var__VarAssignment_2 ) )
            {
            // InternalOnlineElm.g:2618:1: ( ( rule__Local_var__VarAssignment_2 ) )
            // InternalOnlineElm.g:2619:2: ( rule__Local_var__VarAssignment_2 )
            {
             before(grammarAccess.getLocal_varAccess().getVarAssignment_2()); 
            // InternalOnlineElm.g:2620:2: ( rule__Local_var__VarAssignment_2 )
            // InternalOnlineElm.g:2620:3: rule__Local_var__VarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Local_var__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocal_varAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__2__Impl"


    // $ANTLR start "rule__Local_var__Group__3"
    // InternalOnlineElm.g:2628:1: rule__Local_var__Group__3 : rule__Local_var__Group__3__Impl ;
    public final void rule__Local_var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2632:1: ( rule__Local_var__Group__3__Impl )
            // InternalOnlineElm.g:2633:2: rule__Local_var__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Local_var__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__3"


    // $ANTLR start "rule__Local_var__Group__3__Impl"
    // InternalOnlineElm.g:2639:1: rule__Local_var__Group__3__Impl : ( ( RULE_NL )? ) ;
    public final void rule__Local_var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2643:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:2644:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:2644:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:2645:2: ( RULE_NL )?
            {
             before(grammarAccess.getLocal_varAccess().getNLTerminalRuleCall_3()); 
            // InternalOnlineElm.g:2646:2: ( RULE_NL )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOnlineElm.g:2646:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLocal_varAccess().getNLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__Group__3__Impl"


    // $ANTLR start "rule__Ref_var__Group_0__0"
    // InternalOnlineElm.g:2655:1: rule__Ref_var__Group_0__0 : rule__Ref_var__Group_0__0__Impl rule__Ref_var__Group_0__1 ;
    public final void rule__Ref_var__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2659:1: ( rule__Ref_var__Group_0__0__Impl rule__Ref_var__Group_0__1 )
            // InternalOnlineElm.g:2660:2: rule__Ref_var__Group_0__0__Impl rule__Ref_var__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Ref_var__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_var__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0__0"


    // $ANTLR start "rule__Ref_var__Group_0__0__Impl"
    // InternalOnlineElm.g:2667:1: rule__Ref_var__Group_0__0__Impl : ( RULE_FQN ) ;
    public final void rule__Ref_var__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2671:1: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:2672:1: ( RULE_FQN )
            {
            // InternalOnlineElm.g:2672:1: ( RULE_FQN )
            // InternalOnlineElm.g:2673:2: RULE_FQN
            {
             before(grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_0()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0__0__Impl"


    // $ANTLR start "rule__Ref_var__Group_0__1"
    // InternalOnlineElm.g:2682:1: rule__Ref_var__Group_0__1 : rule__Ref_var__Group_0__1__Impl ;
    public final void rule__Ref_var__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2686:1: ( rule__Ref_var__Group_0__1__Impl )
            // InternalOnlineElm.g:2687:2: rule__Ref_var__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref_var__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0__1"


    // $ANTLR start "rule__Ref_var__Group_0__1__Impl"
    // InternalOnlineElm.g:2693:1: rule__Ref_var__Group_0__1__Impl : ( ( rule__Ref_var__Group_0_1__0 )? ) ;
    public final void rule__Ref_var__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2697:1: ( ( ( rule__Ref_var__Group_0_1__0 )? ) )
            // InternalOnlineElm.g:2698:1: ( ( rule__Ref_var__Group_0_1__0 )? )
            {
            // InternalOnlineElm.g:2698:1: ( ( rule__Ref_var__Group_0_1__0 )? )
            // InternalOnlineElm.g:2699:2: ( rule__Ref_var__Group_0_1__0 )?
            {
             before(grammarAccess.getRef_varAccess().getGroup_0_1()); 
            // InternalOnlineElm.g:2700:2: ( rule__Ref_var__Group_0_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOnlineElm.g:2700:3: rule__Ref_var__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ref_var__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRef_varAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0__1__Impl"


    // $ANTLR start "rule__Ref_var__Group_0_1__0"
    // InternalOnlineElm.g:2709:1: rule__Ref_var__Group_0_1__0 : rule__Ref_var__Group_0_1__0__Impl rule__Ref_var__Group_0_1__1 ;
    public final void rule__Ref_var__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2713:1: ( rule__Ref_var__Group_0_1__0__Impl rule__Ref_var__Group_0_1__1 )
            // InternalOnlineElm.g:2714:2: rule__Ref_var__Group_0_1__0__Impl rule__Ref_var__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Ref_var__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_var__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0_1__0"


    // $ANTLR start "rule__Ref_var__Group_0_1__0__Impl"
    // InternalOnlineElm.g:2721:1: rule__Ref_var__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__Ref_var__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2725:1: ( ( '.' ) )
            // InternalOnlineElm.g:2726:1: ( '.' )
            {
            // InternalOnlineElm.g:2726:1: ( '.' )
            // InternalOnlineElm.g:2727:2: '.'
            {
             before(grammarAccess.getRef_varAccess().getFullStopKeyword_0_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRef_varAccess().getFullStopKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0_1__0__Impl"


    // $ANTLR start "rule__Ref_var__Group_0_1__1"
    // InternalOnlineElm.g:2736:1: rule__Ref_var__Group_0_1__1 : rule__Ref_var__Group_0_1__1__Impl ;
    public final void rule__Ref_var__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2740:1: ( rule__Ref_var__Group_0_1__1__Impl )
            // InternalOnlineElm.g:2741:2: rule__Ref_var__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref_var__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0_1__1"


    // $ANTLR start "rule__Ref_var__Group_0_1__1__Impl"
    // InternalOnlineElm.g:2747:1: rule__Ref_var__Group_0_1__1__Impl : ( RULE_FQN ) ;
    public final void rule__Ref_var__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2751:1: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:2752:1: ( RULE_FQN )
            {
            // InternalOnlineElm.g:2752:1: ( RULE_FQN )
            // InternalOnlineElm.g:2753:2: RULE_FQN
            {
             before(grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_1_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_var__Group_0_1__1__Impl"


    // $ANTLR start "rule__ShapeList__Group__0"
    // InternalOnlineElm.g:2763:1: rule__ShapeList__Group__0 : rule__ShapeList__Group__0__Impl rule__ShapeList__Group__1 ;
    public final void rule__ShapeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2767:1: ( rule__ShapeList__Group__0__Impl rule__ShapeList__Group__1 )
            // InternalOnlineElm.g:2768:2: rule__ShapeList__Group__0__Impl rule__ShapeList__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__0"


    // $ANTLR start "rule__ShapeList__Group__0__Impl"
    // InternalOnlineElm.g:2775:1: rule__ShapeList__Group__0__Impl : ( ( rule__ShapeList__NameAssignment_0 ) ) ;
    public final void rule__ShapeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2779:1: ( ( ( rule__ShapeList__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2780:1: ( ( rule__ShapeList__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2780:1: ( ( rule__ShapeList__NameAssignment_0 ) )
            // InternalOnlineElm.g:2781:2: ( rule__ShapeList__NameAssignment_0 )
            {
             before(grammarAccess.getShapeListAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:2782:2: ( rule__ShapeList__NameAssignment_0 )
            // InternalOnlineElm.g:2782:3: rule__ShapeList__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeListAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__0__Impl"


    // $ANTLR start "rule__ShapeList__Group__1"
    // InternalOnlineElm.g:2790:1: rule__ShapeList__Group__1 : rule__ShapeList__Group__1__Impl rule__ShapeList__Group__2 ;
    public final void rule__ShapeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2794:1: ( rule__ShapeList__Group__1__Impl rule__ShapeList__Group__2 )
            // InternalOnlineElm.g:2795:2: rule__ShapeList__Group__1__Impl rule__ShapeList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ShapeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__1"


    // $ANTLR start "rule__ShapeList__Group__1__Impl"
    // InternalOnlineElm.g:2802:1: rule__ShapeList__Group__1__Impl : ( '=' ) ;
    public final void rule__ShapeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2806:1: ( ( '=' ) )
            // InternalOnlineElm.g:2807:1: ( '=' )
            {
            // InternalOnlineElm.g:2807:1: ( '=' )
            // InternalOnlineElm.g:2808:2: '='
            {
             before(grammarAccess.getShapeListAccess().getEqualsSignKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__1__Impl"


    // $ANTLR start "rule__ShapeList__Group__2"
    // InternalOnlineElm.g:2817:1: rule__ShapeList__Group__2 : rule__ShapeList__Group__2__Impl rule__ShapeList__Group__3 ;
    public final void rule__ShapeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2821:1: ( rule__ShapeList__Group__2__Impl rule__ShapeList__Group__3 )
            // InternalOnlineElm.g:2822:2: rule__ShapeList__Group__2__Impl rule__ShapeList__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ShapeList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__2"


    // $ANTLR start "rule__ShapeList__Group__2__Impl"
    // InternalOnlineElm.g:2829:1: rule__ShapeList__Group__2__Impl : ( '[' ) ;
    public final void rule__ShapeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2833:1: ( ( '[' ) )
            // InternalOnlineElm.g:2834:1: ( '[' )
            {
            // InternalOnlineElm.g:2834:1: ( '[' )
            // InternalOnlineElm.g:2835:2: '['
            {
             before(grammarAccess.getShapeListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__2__Impl"


    // $ANTLR start "rule__ShapeList__Group__3"
    // InternalOnlineElm.g:2844:1: rule__ShapeList__Group__3 : rule__ShapeList__Group__3__Impl rule__ShapeList__Group__4 ;
    public final void rule__ShapeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2848:1: ( rule__ShapeList__Group__3__Impl rule__ShapeList__Group__4 )
            // InternalOnlineElm.g:2849:2: rule__ShapeList__Group__3__Impl rule__ShapeList__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ShapeList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__3"


    // $ANTLR start "rule__ShapeList__Group__3__Impl"
    // InternalOnlineElm.g:2856:1: rule__ShapeList__Group__3__Impl : ( ( rule__ShapeList__Alternatives_3 ) ) ;
    public final void rule__ShapeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2860:1: ( ( ( rule__ShapeList__Alternatives_3 ) ) )
            // InternalOnlineElm.g:2861:1: ( ( rule__ShapeList__Alternatives_3 ) )
            {
            // InternalOnlineElm.g:2861:1: ( ( rule__ShapeList__Alternatives_3 ) )
            // InternalOnlineElm.g:2862:2: ( rule__ShapeList__Alternatives_3 )
            {
             before(grammarAccess.getShapeListAccess().getAlternatives_3()); 
            // InternalOnlineElm.g:2863:2: ( rule__ShapeList__Alternatives_3 )
            // InternalOnlineElm.g:2863:3: rule__ShapeList__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getShapeListAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__3__Impl"


    // $ANTLR start "rule__ShapeList__Group__4"
    // InternalOnlineElm.g:2871:1: rule__ShapeList__Group__4 : rule__ShapeList__Group__4__Impl rule__ShapeList__Group__5 ;
    public final void rule__ShapeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2875:1: ( rule__ShapeList__Group__4__Impl rule__ShapeList__Group__5 )
            // InternalOnlineElm.g:2876:2: rule__ShapeList__Group__4__Impl rule__ShapeList__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ShapeList__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__4"


    // $ANTLR start "rule__ShapeList__Group__4__Impl"
    // InternalOnlineElm.g:2883:1: rule__ShapeList__Group__4__Impl : ( ( rule__ShapeList__Group_4__0 )* ) ;
    public final void rule__ShapeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2887:1: ( ( ( rule__ShapeList__Group_4__0 )* ) )
            // InternalOnlineElm.g:2888:1: ( ( rule__ShapeList__Group_4__0 )* )
            {
            // InternalOnlineElm.g:2888:1: ( ( rule__ShapeList__Group_4__0 )* )
            // InternalOnlineElm.g:2889:2: ( rule__ShapeList__Group_4__0 )*
            {
             before(grammarAccess.getShapeListAccess().getGroup_4()); 
            // InternalOnlineElm.g:2890:2: ( rule__ShapeList__Group_4__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_NL) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==67) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOnlineElm.g:2890:3: rule__ShapeList__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ShapeList__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getShapeListAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__4__Impl"


    // $ANTLR start "rule__ShapeList__Group__5"
    // InternalOnlineElm.g:2898:1: rule__ShapeList__Group__5 : rule__ShapeList__Group__5__Impl rule__ShapeList__Group__6 ;
    public final void rule__ShapeList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2902:1: ( rule__ShapeList__Group__5__Impl rule__ShapeList__Group__6 )
            // InternalOnlineElm.g:2903:2: rule__ShapeList__Group__5__Impl rule__ShapeList__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ShapeList__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__5"


    // $ANTLR start "rule__ShapeList__Group__5__Impl"
    // InternalOnlineElm.g:2910:1: rule__ShapeList__Group__5__Impl : ( ( RULE_NL )? ) ;
    public final void rule__ShapeList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2914:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:2915:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:2915:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:2916:2: ( RULE_NL )?
            {
             before(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_5()); 
            // InternalOnlineElm.g:2917:2: ( RULE_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOnlineElm.g:2917:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__5__Impl"


    // $ANTLR start "rule__ShapeList__Group__6"
    // InternalOnlineElm.g:2925:1: rule__ShapeList__Group__6 : rule__ShapeList__Group__6__Impl rule__ShapeList__Group__7 ;
    public final void rule__ShapeList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2929:1: ( rule__ShapeList__Group__6__Impl rule__ShapeList__Group__7 )
            // InternalOnlineElm.g:2930:2: rule__ShapeList__Group__6__Impl rule__ShapeList__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ShapeList__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__6"


    // $ANTLR start "rule__ShapeList__Group__6__Impl"
    // InternalOnlineElm.g:2937:1: rule__ShapeList__Group__6__Impl : ( ']' ) ;
    public final void rule__ShapeList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2941:1: ( ( ']' ) )
            // InternalOnlineElm.g:2942:1: ( ']' )
            {
            // InternalOnlineElm.g:2942:1: ( ']' )
            // InternalOnlineElm.g:2943:2: ']'
            {
             before(grammarAccess.getShapeListAccess().getRightSquareBracketKeyword_6()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__6__Impl"


    // $ANTLR start "rule__ShapeList__Group__7"
    // InternalOnlineElm.g:2952:1: rule__ShapeList__Group__7 : rule__ShapeList__Group__7__Impl ;
    public final void rule__ShapeList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2956:1: ( rule__ShapeList__Group__7__Impl )
            // InternalOnlineElm.g:2957:2: rule__ShapeList__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__7"


    // $ANTLR start "rule__ShapeList__Group__7__Impl"
    // InternalOnlineElm.g:2963:1: rule__ShapeList__Group__7__Impl : ( ( rule__ShapeList__Alternatives_7 )* ) ;
    public final void rule__ShapeList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2967:1: ( ( ( rule__ShapeList__Alternatives_7 )* ) )
            // InternalOnlineElm.g:2968:1: ( ( rule__ShapeList__Alternatives_7 )* )
            {
            // InternalOnlineElm.g:2968:1: ( ( rule__ShapeList__Alternatives_7 )* )
            // InternalOnlineElm.g:2969:2: ( rule__ShapeList__Alternatives_7 )*
            {
             before(grammarAccess.getShapeListAccess().getAlternatives_7()); 
            // InternalOnlineElm.g:2970:2: ( rule__ShapeList__Alternatives_7 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_NL||LA41_0==68) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOnlineElm.g:2970:3: rule__ShapeList__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ShapeList__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getShapeListAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group__7__Impl"


    // $ANTLR start "rule__ShapeList__Group_4__0"
    // InternalOnlineElm.g:2979:1: rule__ShapeList__Group_4__0 : rule__ShapeList__Group_4__0__Impl rule__ShapeList__Group_4__1 ;
    public final void rule__ShapeList__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2983:1: ( rule__ShapeList__Group_4__0__Impl rule__ShapeList__Group_4__1 )
            // InternalOnlineElm.g:2984:2: rule__ShapeList__Group_4__0__Impl rule__ShapeList__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ShapeList__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__0"


    // $ANTLR start "rule__ShapeList__Group_4__0__Impl"
    // InternalOnlineElm.g:2991:1: rule__ShapeList__Group_4__0__Impl : ( ( RULE_NL )? ) ;
    public final void rule__ShapeList__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2995:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:2996:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:2996:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:2997:2: ( RULE_NL )?
            {
             before(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_4_0()); 
            // InternalOnlineElm.g:2998:2: ( RULE_NL )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_NL) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOnlineElm.g:2998:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeListAccess().getNLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__0__Impl"


    // $ANTLR start "rule__ShapeList__Group_4__1"
    // InternalOnlineElm.g:3006:1: rule__ShapeList__Group_4__1 : rule__ShapeList__Group_4__1__Impl rule__ShapeList__Group_4__2 ;
    public final void rule__ShapeList__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3010:1: ( rule__ShapeList__Group_4__1__Impl rule__ShapeList__Group_4__2 )
            // InternalOnlineElm.g:3011:2: rule__ShapeList__Group_4__1__Impl rule__ShapeList__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ShapeList__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__1"


    // $ANTLR start "rule__ShapeList__Group_4__1__Impl"
    // InternalOnlineElm.g:3018:1: rule__ShapeList__Group_4__1__Impl : ( ',' ) ;
    public final void rule__ShapeList__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3022:1: ( ( ',' ) )
            // InternalOnlineElm.g:3023:1: ( ',' )
            {
            // InternalOnlineElm.g:3023:1: ( ',' )
            // InternalOnlineElm.g:3024:2: ','
            {
             before(grammarAccess.getShapeListAccess().getCommaKeyword_4_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getCommaKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__1__Impl"


    // $ANTLR start "rule__ShapeList__Group_4__2"
    // InternalOnlineElm.g:3033:1: rule__ShapeList__Group_4__2 : rule__ShapeList__Group_4__2__Impl ;
    public final void rule__ShapeList__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3037:1: ( rule__ShapeList__Group_4__2__Impl )
            // InternalOnlineElm.g:3038:2: rule__ShapeList__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__2"


    // $ANTLR start "rule__ShapeList__Group_4__2__Impl"
    // InternalOnlineElm.g:3044:1: rule__ShapeList__Group_4__2__Impl : ( ( rule__ShapeList__Alternatives_4_2 ) ) ;
    public final void rule__ShapeList__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3048:1: ( ( ( rule__ShapeList__Alternatives_4_2 ) ) )
            // InternalOnlineElm.g:3049:1: ( ( rule__ShapeList__Alternatives_4_2 ) )
            {
            // InternalOnlineElm.g:3049:1: ( ( rule__ShapeList__Alternatives_4_2 ) )
            // InternalOnlineElm.g:3050:2: ( rule__ShapeList__Alternatives_4_2 )
            {
             before(grammarAccess.getShapeListAccess().getAlternatives_4_2()); 
            // InternalOnlineElm.g:3051:2: ( rule__ShapeList__Alternatives_4_2 )
            // InternalOnlineElm.g:3051:3: rule__ShapeList__Alternatives_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Alternatives_4_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeListAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_4__2__Impl"


    // $ANTLR start "rule__ShapeList__Group_7_1__0"
    // InternalOnlineElm.g:3060:1: rule__ShapeList__Group_7_1__0 : rule__ShapeList__Group_7_1__0__Impl rule__ShapeList__Group_7_1__1 ;
    public final void rule__ShapeList__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3064:1: ( rule__ShapeList__Group_7_1__0__Impl rule__ShapeList__Group_7_1__1 )
            // InternalOnlineElm.g:3065:2: rule__ShapeList__Group_7_1__0__Impl rule__ShapeList__Group_7_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeList__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeList__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_7_1__0"


    // $ANTLR start "rule__ShapeList__Group_7_1__0__Impl"
    // InternalOnlineElm.g:3072:1: rule__ShapeList__Group_7_1__0__Impl : ( '++' ) ;
    public final void rule__ShapeList__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3076:1: ( ( '++' ) )
            // InternalOnlineElm.g:3077:1: ( '++' )
            {
            // InternalOnlineElm.g:3077:1: ( '++' )
            // InternalOnlineElm.g:3078:2: '++'
            {
             before(grammarAccess.getShapeListAccess().getPlusSignPlusSignKeyword_7_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getPlusSignPlusSignKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_7_1__0__Impl"


    // $ANTLR start "rule__ShapeList__Group_7_1__1"
    // InternalOnlineElm.g:3087:1: rule__ShapeList__Group_7_1__1 : rule__ShapeList__Group_7_1__1__Impl ;
    public final void rule__ShapeList__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3091:1: ( rule__ShapeList__Group_7_1__1__Impl )
            // InternalOnlineElm.g:3092:2: rule__ShapeList__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_7_1__1"


    // $ANTLR start "rule__ShapeList__Group_7_1__1__Impl"
    // InternalOnlineElm.g:3098:1: rule__ShapeList__Group_7_1__1__Impl : ( ( rule__ShapeList__ExternalAssignment_7_1_1 ) ) ;
    public final void rule__ShapeList__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3102:1: ( ( ( rule__ShapeList__ExternalAssignment_7_1_1 ) ) )
            // InternalOnlineElm.g:3103:1: ( ( rule__ShapeList__ExternalAssignment_7_1_1 ) )
            {
            // InternalOnlineElm.g:3103:1: ( ( rule__ShapeList__ExternalAssignment_7_1_1 ) )
            // InternalOnlineElm.g:3104:2: ( rule__ShapeList__ExternalAssignment_7_1_1 )
            {
             before(grammarAccess.getShapeListAccess().getExternalAssignment_7_1_1()); 
            // InternalOnlineElm.g:3105:2: ( rule__ShapeList__ExternalAssignment_7_1_1 )
            // InternalOnlineElm.g:3105:3: rule__ShapeList__ExternalAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeList__ExternalAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeListAccess().getExternalAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__Group_7_1__1__Impl"


    // $ANTLR start "rule__BasicShape__Group__0"
    // InternalOnlineElm.g:3114:1: rule__BasicShape__Group__0 : rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1 ;
    public final void rule__BasicShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3118:1: ( rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1 )
            // InternalOnlineElm.g:3119:2: rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BasicShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__0"


    // $ANTLR start "rule__BasicShape__Group__0__Impl"
    // InternalOnlineElm.g:3126:1: rule__BasicShape__Group__0__Impl : ( ( rule__BasicShape__NameAssignment_0 ) ) ;
    public final void rule__BasicShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3130:1: ( ( ( rule__BasicShape__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:3131:1: ( ( rule__BasicShape__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:3131:1: ( ( rule__BasicShape__NameAssignment_0 ) )
            // InternalOnlineElm.g:3132:2: ( rule__BasicShape__NameAssignment_0 )
            {
             before(grammarAccess.getBasicShapeAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:3133:2: ( rule__BasicShape__NameAssignment_0 )
            // InternalOnlineElm.g:3133:3: rule__BasicShape__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicShapeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__0__Impl"


    // $ANTLR start "rule__BasicShape__Group__1"
    // InternalOnlineElm.g:3141:1: rule__BasicShape__Group__1 : rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2 ;
    public final void rule__BasicShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3145:1: ( rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2 )
            // InternalOnlineElm.g:3146:2: rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BasicShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__1"


    // $ANTLR start "rule__BasicShape__Group__1__Impl"
    // InternalOnlineElm.g:3153:1: rule__BasicShape__Group__1__Impl : ( '=' ) ;
    public final void rule__BasicShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3157:1: ( ( '=' ) )
            // InternalOnlineElm.g:3158:1: ( '=' )
            {
            // InternalOnlineElm.g:3158:1: ( '=' )
            // InternalOnlineElm.g:3159:2: '='
            {
             before(grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__1__Impl"


    // $ANTLR start "rule__BasicShape__Group__2"
    // InternalOnlineElm.g:3168:1: rule__BasicShape__Group__2 : rule__BasicShape__Group__2__Impl rule__BasicShape__Group__3 ;
    public final void rule__BasicShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3172:1: ( rule__BasicShape__Group__2__Impl rule__BasicShape__Group__3 )
            // InternalOnlineElm.g:3173:2: rule__BasicShape__Group__2__Impl rule__BasicShape__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__BasicShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__2"


    // $ANTLR start "rule__BasicShape__Group__2__Impl"
    // InternalOnlineElm.g:3180:1: rule__BasicShape__Group__2__Impl : ( ( RULE_NL )? ) ;
    public final void rule__BasicShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3184:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:3185:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:3185:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:3186:2: ( RULE_NL )?
            {
             before(grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_2()); 
            // InternalOnlineElm.g:3187:2: ( RULE_NL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_NL) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOnlineElm.g:3187:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__2__Impl"


    // $ANTLR start "rule__BasicShape__Group__3"
    // InternalOnlineElm.g:3195:1: rule__BasicShape__Group__3 : rule__BasicShape__Group__3__Impl rule__BasicShape__Group__4 ;
    public final void rule__BasicShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3199:1: ( rule__BasicShape__Group__3__Impl rule__BasicShape__Group__4 )
            // InternalOnlineElm.g:3200:2: rule__BasicShape__Group__3__Impl rule__BasicShape__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__BasicShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__3"


    // $ANTLR start "rule__BasicShape__Group__3__Impl"
    // InternalOnlineElm.g:3207:1: rule__BasicShape__Group__3__Impl : ( ( rule__BasicShape__Alternatives_3 ) ) ;
    public final void rule__BasicShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3211:1: ( ( ( rule__BasicShape__Alternatives_3 ) ) )
            // InternalOnlineElm.g:3212:1: ( ( rule__BasicShape__Alternatives_3 ) )
            {
            // InternalOnlineElm.g:3212:1: ( ( rule__BasicShape__Alternatives_3 ) )
            // InternalOnlineElm.g:3213:2: ( rule__BasicShape__Alternatives_3 )
            {
             before(grammarAccess.getBasicShapeAccess().getAlternatives_3()); 
            // InternalOnlineElm.g:3214:2: ( rule__BasicShape__Alternatives_3 )
            // InternalOnlineElm.g:3214:3: rule__BasicShape__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicShapeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__3__Impl"


    // $ANTLR start "rule__BasicShape__Group__4"
    // InternalOnlineElm.g:3222:1: rule__BasicShape__Group__4 : rule__BasicShape__Group__4__Impl ;
    public final void rule__BasicShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3226:1: ( rule__BasicShape__Group__4__Impl )
            // InternalOnlineElm.g:3227:2: rule__BasicShape__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__4"


    // $ANTLR start "rule__BasicShape__Group__4__Impl"
    // InternalOnlineElm.g:3233:1: rule__BasicShape__Group__4__Impl : ( ( RULE_NL )? ) ;
    public final void rule__BasicShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3237:1: ( ( ( RULE_NL )? ) )
            // InternalOnlineElm.g:3238:1: ( ( RULE_NL )? )
            {
            // InternalOnlineElm.g:3238:1: ( ( RULE_NL )? )
            // InternalOnlineElm.g:3239:2: ( RULE_NL )?
            {
             before(grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_4()); 
            // InternalOnlineElm.g:3240:2: ( RULE_NL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_NL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOnlineElm.g:3240:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__Group__4__Impl"


    // $ANTLR start "rule__Shape__Group__0"
    // InternalOnlineElm.g:3249:1: rule__Shape__Group__0 : rule__Shape__Group__0__Impl rule__Shape__Group__1 ;
    public final void rule__Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3253:1: ( rule__Shape__Group__0__Impl rule__Shape__Group__1 )
            // InternalOnlineElm.g:3254:2: rule__Shape__Group__0__Impl rule__Shape__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Shape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__0"


    // $ANTLR start "rule__Shape__Group__0__Impl"
    // InternalOnlineElm.g:3261:1: rule__Shape__Group__0__Impl : ( ( rule__Shape__StencilAssignment_0 ) ) ;
    public final void rule__Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3265:1: ( ( ( rule__Shape__StencilAssignment_0 ) ) )
            // InternalOnlineElm.g:3266:1: ( ( rule__Shape__StencilAssignment_0 ) )
            {
            // InternalOnlineElm.g:3266:1: ( ( rule__Shape__StencilAssignment_0 ) )
            // InternalOnlineElm.g:3267:2: ( rule__Shape__StencilAssignment_0 )
            {
             before(grammarAccess.getShapeAccess().getStencilAssignment_0()); 
            // InternalOnlineElm.g:3268:2: ( rule__Shape__StencilAssignment_0 )
            // InternalOnlineElm.g:3268:3: rule__Shape__StencilAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Shape__StencilAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getStencilAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__0__Impl"


    // $ANTLR start "rule__Shape__Group__1"
    // InternalOnlineElm.g:3276:1: rule__Shape__Group__1 : rule__Shape__Group__1__Impl rule__Shape__Group__2 ;
    public final void rule__Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3280:1: ( rule__Shape__Group__1__Impl rule__Shape__Group__2 )
            // InternalOnlineElm.g:3281:2: rule__Shape__Group__1__Impl rule__Shape__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Shape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__1"


    // $ANTLR start "rule__Shape__Group__1__Impl"
    // InternalOnlineElm.g:3288:1: rule__Shape__Group__1__Impl : ( '|>' ) ;
    public final void rule__Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3292:1: ( ( '|>' ) )
            // InternalOnlineElm.g:3293:1: ( '|>' )
            {
            // InternalOnlineElm.g:3293:1: ( '|>' )
            // InternalOnlineElm.g:3294:2: '|>'
            {
             before(grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__1__Impl"


    // $ANTLR start "rule__Shape__Group__2"
    // InternalOnlineElm.g:3303:1: rule__Shape__Group__2 : rule__Shape__Group__2__Impl ;
    public final void rule__Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3307:1: ( rule__Shape__Group__2__Impl )
            // InternalOnlineElm.g:3308:2: rule__Shape__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__2"


    // $ANTLR start "rule__Shape__Group__2__Impl"
    // InternalOnlineElm.g:3314:1: rule__Shape__Group__2__Impl : ( ( rule__Shape__DrawAssignment_2 ) ) ;
    public final void rule__Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3318:1: ( ( ( rule__Shape__DrawAssignment_2 ) ) )
            // InternalOnlineElm.g:3319:1: ( ( rule__Shape__DrawAssignment_2 ) )
            {
            // InternalOnlineElm.g:3319:1: ( ( rule__Shape__DrawAssignment_2 ) )
            // InternalOnlineElm.g:3320:2: ( rule__Shape__DrawAssignment_2 )
            {
             before(grammarAccess.getShapeAccess().getDrawAssignment_2()); 
            // InternalOnlineElm.g:3321:2: ( rule__Shape__DrawAssignment_2 )
            // InternalOnlineElm.g:3321:3: rule__Shape__DrawAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Shape__DrawAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getDrawAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__2__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__0"
    // InternalOnlineElm.g:3330:1: rule__Conditional_Shape__Group__0 : rule__Conditional_Shape__Group__0__Impl rule__Conditional_Shape__Group__1 ;
    public final void rule__Conditional_Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3334:1: ( rule__Conditional_Shape__Group__0__Impl rule__Conditional_Shape__Group__1 )
            // InternalOnlineElm.g:3335:2: rule__Conditional_Shape__Group__0__Impl rule__Conditional_Shape__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Conditional_Shape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__0"


    // $ANTLR start "rule__Conditional_Shape__Group__0__Impl"
    // InternalOnlineElm.g:3342:1: rule__Conditional_Shape__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditional_Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3346:1: ( ( 'if' ) )
            // InternalOnlineElm.g:3347:1: ( 'if' )
            {
            // InternalOnlineElm.g:3347:1: ( 'if' )
            // InternalOnlineElm.g:3348:2: 'if'
            {
             before(grammarAccess.getConditional_ShapeAccess().getIfKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__0__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__1"
    // InternalOnlineElm.g:3357:1: rule__Conditional_Shape__Group__1 : rule__Conditional_Shape__Group__1__Impl rule__Conditional_Shape__Group__2 ;
    public final void rule__Conditional_Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3361:1: ( rule__Conditional_Shape__Group__1__Impl rule__Conditional_Shape__Group__2 )
            // InternalOnlineElm.g:3362:2: rule__Conditional_Shape__Group__1__Impl rule__Conditional_Shape__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Conditional_Shape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__1"


    // $ANTLR start "rule__Conditional_Shape__Group__1__Impl"
    // InternalOnlineElm.g:3369:1: rule__Conditional_Shape__Group__1__Impl : ( ruleBool_expr ) ;
    public final void rule__Conditional_Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3373:1: ( ( ruleBool_expr ) )
            // InternalOnlineElm.g:3374:1: ( ruleBool_expr )
            {
            // InternalOnlineElm.g:3374:1: ( ruleBool_expr )
            // InternalOnlineElm.g:3375:2: ruleBool_expr
            {
             before(grammarAccess.getConditional_ShapeAccess().getBool_exprParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleBool_expr();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeAccess().getBool_exprParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__1__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__2"
    // InternalOnlineElm.g:3384:1: rule__Conditional_Shape__Group__2 : rule__Conditional_Shape__Group__2__Impl rule__Conditional_Shape__Group__3 ;
    public final void rule__Conditional_Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3388:1: ( rule__Conditional_Shape__Group__2__Impl rule__Conditional_Shape__Group__3 )
            // InternalOnlineElm.g:3389:2: rule__Conditional_Shape__Group__2__Impl rule__Conditional_Shape__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Shape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__2"


    // $ANTLR start "rule__Conditional_Shape__Group__2__Impl"
    // InternalOnlineElm.g:3396:1: rule__Conditional_Shape__Group__2__Impl : ( 'then' ) ;
    public final void rule__Conditional_Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3400:1: ( ( 'then' ) )
            // InternalOnlineElm.g:3401:1: ( 'then' )
            {
            // InternalOnlineElm.g:3401:1: ( 'then' )
            // InternalOnlineElm.g:3402:2: 'then'
            {
             before(grammarAccess.getConditional_ShapeAccess().getThenKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__2__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__3"
    // InternalOnlineElm.g:3411:1: rule__Conditional_Shape__Group__3 : rule__Conditional_Shape__Group__3__Impl rule__Conditional_Shape__Group__4 ;
    public final void rule__Conditional_Shape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3415:1: ( rule__Conditional_Shape__Group__3__Impl rule__Conditional_Shape__Group__4 )
            // InternalOnlineElm.g:3416:2: rule__Conditional_Shape__Group__3__Impl rule__Conditional_Shape__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Conditional_Shape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__3"


    // $ANTLR start "rule__Conditional_Shape__Group__3__Impl"
    // InternalOnlineElm.g:3423:1: rule__Conditional_Shape__Group__3__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Shape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3427:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3428:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3428:1: ( RULE_NL )
            // InternalOnlineElm.g:3429:2: RULE_NL
            {
             before(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_3()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__3__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__4"
    // InternalOnlineElm.g:3438:1: rule__Conditional_Shape__Group__4 : rule__Conditional_Shape__Group__4__Impl rule__Conditional_Shape__Group__5 ;
    public final void rule__Conditional_Shape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3442:1: ( rule__Conditional_Shape__Group__4__Impl rule__Conditional_Shape__Group__5 )
            // InternalOnlineElm.g:3443:2: rule__Conditional_Shape__Group__4__Impl rule__Conditional_Shape__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Shape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__4"


    // $ANTLR start "rule__Conditional_Shape__Group__4__Impl"
    // InternalOnlineElm.g:3450:1: rule__Conditional_Shape__Group__4__Impl : ( ( rule__Conditional_Shape__Alternatives_4 ) ) ;
    public final void rule__Conditional_Shape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3454:1: ( ( ( rule__Conditional_Shape__Alternatives_4 ) ) )
            // InternalOnlineElm.g:3455:1: ( ( rule__Conditional_Shape__Alternatives_4 ) )
            {
            // InternalOnlineElm.g:3455:1: ( ( rule__Conditional_Shape__Alternatives_4 ) )
            // InternalOnlineElm.g:3456:2: ( rule__Conditional_Shape__Alternatives_4 )
            {
             before(grammarAccess.getConditional_ShapeAccess().getAlternatives_4()); 
            // InternalOnlineElm.g:3457:2: ( rule__Conditional_Shape__Alternatives_4 )
            // InternalOnlineElm.g:3457:3: rule__Conditional_Shape__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ShapeAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__4__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__5"
    // InternalOnlineElm.g:3465:1: rule__Conditional_Shape__Group__5 : rule__Conditional_Shape__Group__5__Impl rule__Conditional_Shape__Group__6 ;
    public final void rule__Conditional_Shape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3469:1: ( rule__Conditional_Shape__Group__5__Impl rule__Conditional_Shape__Group__6 )
            // InternalOnlineElm.g:3470:2: rule__Conditional_Shape__Group__5__Impl rule__Conditional_Shape__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Conditional_Shape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__5"


    // $ANTLR start "rule__Conditional_Shape__Group__5__Impl"
    // InternalOnlineElm.g:3477:1: rule__Conditional_Shape__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Shape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3481:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3482:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3482:1: ( RULE_NL )
            // InternalOnlineElm.g:3483:2: RULE_NL
            {
             before(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__5__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__6"
    // InternalOnlineElm.g:3492:1: rule__Conditional_Shape__Group__6 : rule__Conditional_Shape__Group__6__Impl rule__Conditional_Shape__Group__7 ;
    public final void rule__Conditional_Shape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3496:1: ( rule__Conditional_Shape__Group__6__Impl rule__Conditional_Shape__Group__7 )
            // InternalOnlineElm.g:3497:2: rule__Conditional_Shape__Group__6__Impl rule__Conditional_Shape__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Shape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__6"


    // $ANTLR start "rule__Conditional_Shape__Group__6__Impl"
    // InternalOnlineElm.g:3504:1: rule__Conditional_Shape__Group__6__Impl : ( 'else' ) ;
    public final void rule__Conditional_Shape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3508:1: ( ( 'else' ) )
            // InternalOnlineElm.g:3509:1: ( 'else' )
            {
            // InternalOnlineElm.g:3509:1: ( 'else' )
            // InternalOnlineElm.g:3510:2: 'else'
            {
             before(grammarAccess.getConditional_ShapeAccess().getElseKeyword_6()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getElseKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__6__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__7"
    // InternalOnlineElm.g:3519:1: rule__Conditional_Shape__Group__7 : rule__Conditional_Shape__Group__7__Impl rule__Conditional_Shape__Group__8 ;
    public final void rule__Conditional_Shape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3523:1: ( rule__Conditional_Shape__Group__7__Impl rule__Conditional_Shape__Group__8 )
            // InternalOnlineElm.g:3524:2: rule__Conditional_Shape__Group__7__Impl rule__Conditional_Shape__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Conditional_Shape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__7"


    // $ANTLR start "rule__Conditional_Shape__Group__7__Impl"
    // InternalOnlineElm.g:3531:1: rule__Conditional_Shape__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Shape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3535:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3536:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3536:1: ( RULE_NL )
            // InternalOnlineElm.g:3537:2: RULE_NL
            {
             before(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_7()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__7__Impl"


    // $ANTLR start "rule__Conditional_Shape__Group__8"
    // InternalOnlineElm.g:3546:1: rule__Conditional_Shape__Group__8 : rule__Conditional_Shape__Group__8__Impl ;
    public final void rule__Conditional_Shape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3550:1: ( rule__Conditional_Shape__Group__8__Impl )
            // InternalOnlineElm.g:3551:2: rule__Conditional_Shape__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__8"


    // $ANTLR start "rule__Conditional_Shape__Group__8__Impl"
    // InternalOnlineElm.g:3557:1: rule__Conditional_Shape__Group__8__Impl : ( ( rule__Conditional_Shape__Alternatives_8 ) ) ;
    public final void rule__Conditional_Shape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3561:1: ( ( ( rule__Conditional_Shape__Alternatives_8 ) ) )
            // InternalOnlineElm.g:3562:1: ( ( rule__Conditional_Shape__Alternatives_8 ) )
            {
            // InternalOnlineElm.g:3562:1: ( ( rule__Conditional_Shape__Alternatives_8 ) )
            // InternalOnlineElm.g:3563:2: ( rule__Conditional_Shape__Alternatives_8 )
            {
             before(grammarAccess.getConditional_ShapeAccess().getAlternatives_8()); 
            // InternalOnlineElm.g:3564:2: ( rule__Conditional_Shape__Alternatives_8 )
            // InternalOnlineElm.g:3564:3: rule__Conditional_Shape__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Shape__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ShapeAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Group__8__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__0"
    // InternalOnlineElm.g:3573:1: rule__Conditional_Color__Group__0 : rule__Conditional_Color__Group__0__Impl rule__Conditional_Color__Group__1 ;
    public final void rule__Conditional_Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3577:1: ( rule__Conditional_Color__Group__0__Impl rule__Conditional_Color__Group__1 )
            // InternalOnlineElm.g:3578:2: rule__Conditional_Color__Group__0__Impl rule__Conditional_Color__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Conditional_Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__0"


    // $ANTLR start "rule__Conditional_Color__Group__0__Impl"
    // InternalOnlineElm.g:3585:1: rule__Conditional_Color__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional_Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3589:1: ( ( '(' ) )
            // InternalOnlineElm.g:3590:1: ( '(' )
            {
            // InternalOnlineElm.g:3590:1: ( '(' )
            // InternalOnlineElm.g:3591:2: '('
            {
             before(grammarAccess.getConditional_ColorAccess().getLeftParenthesisKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__0__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__1"
    // InternalOnlineElm.g:3600:1: rule__Conditional_Color__Group__1 : rule__Conditional_Color__Group__1__Impl rule__Conditional_Color__Group__2 ;
    public final void rule__Conditional_Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3604:1: ( rule__Conditional_Color__Group__1__Impl rule__Conditional_Color__Group__2 )
            // InternalOnlineElm.g:3605:2: rule__Conditional_Color__Group__1__Impl rule__Conditional_Color__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Conditional_Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__1"


    // $ANTLR start "rule__Conditional_Color__Group__1__Impl"
    // InternalOnlineElm.g:3612:1: rule__Conditional_Color__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional_Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3616:1: ( ( 'if' ) )
            // InternalOnlineElm.g:3617:1: ( 'if' )
            {
            // InternalOnlineElm.g:3617:1: ( 'if' )
            // InternalOnlineElm.g:3618:2: 'if'
            {
             before(grammarAccess.getConditional_ColorAccess().getIfKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__1__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__2"
    // InternalOnlineElm.g:3627:1: rule__Conditional_Color__Group__2 : rule__Conditional_Color__Group__2__Impl rule__Conditional_Color__Group__3 ;
    public final void rule__Conditional_Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3631:1: ( rule__Conditional_Color__Group__2__Impl rule__Conditional_Color__Group__3 )
            // InternalOnlineElm.g:3632:2: rule__Conditional_Color__Group__2__Impl rule__Conditional_Color__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Conditional_Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__2"


    // $ANTLR start "rule__Conditional_Color__Group__2__Impl"
    // InternalOnlineElm.g:3639:1: rule__Conditional_Color__Group__2__Impl : ( ruleBool_expr ) ;
    public final void rule__Conditional_Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3643:1: ( ( ruleBool_expr ) )
            // InternalOnlineElm.g:3644:1: ( ruleBool_expr )
            {
            // InternalOnlineElm.g:3644:1: ( ruleBool_expr )
            // InternalOnlineElm.g:3645:2: ruleBool_expr
            {
             before(grammarAccess.getConditional_ColorAccess().getBool_exprParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleBool_expr();

            state._fsp--;

             after(grammarAccess.getConditional_ColorAccess().getBool_exprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__2__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__3"
    // InternalOnlineElm.g:3654:1: rule__Conditional_Color__Group__3 : rule__Conditional_Color__Group__3__Impl rule__Conditional_Color__Group__4 ;
    public final void rule__Conditional_Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3658:1: ( rule__Conditional_Color__Group__3__Impl rule__Conditional_Color__Group__4 )
            // InternalOnlineElm.g:3659:2: rule__Conditional_Color__Group__3__Impl rule__Conditional_Color__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__3"


    // $ANTLR start "rule__Conditional_Color__Group__3__Impl"
    // InternalOnlineElm.g:3666:1: rule__Conditional_Color__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional_Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3670:1: ( ( 'then' ) )
            // InternalOnlineElm.g:3671:1: ( 'then' )
            {
            // InternalOnlineElm.g:3671:1: ( 'then' )
            // InternalOnlineElm.g:3672:2: 'then'
            {
             before(grammarAccess.getConditional_ColorAccess().getThenKeyword_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__3__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__4"
    // InternalOnlineElm.g:3681:1: rule__Conditional_Color__Group__4 : rule__Conditional_Color__Group__4__Impl rule__Conditional_Color__Group__5 ;
    public final void rule__Conditional_Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3685:1: ( rule__Conditional_Color__Group__4__Impl rule__Conditional_Color__Group__5 )
            // InternalOnlineElm.g:3686:2: rule__Conditional_Color__Group__4__Impl rule__Conditional_Color__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Conditional_Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__4"


    // $ANTLR start "rule__Conditional_Color__Group__4__Impl"
    // InternalOnlineElm.g:3693:1: rule__Conditional_Color__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3697:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3698:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3698:1: ( RULE_NL )
            // InternalOnlineElm.g:3699:2: RULE_NL
            {
             before(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__4__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__5"
    // InternalOnlineElm.g:3708:1: rule__Conditional_Color__Group__5 : rule__Conditional_Color__Group__5__Impl rule__Conditional_Color__Group__6 ;
    public final void rule__Conditional_Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3712:1: ( rule__Conditional_Color__Group__5__Impl rule__Conditional_Color__Group__6 )
            // InternalOnlineElm.g:3713:2: rule__Conditional_Color__Group__5__Impl rule__Conditional_Color__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__5"


    // $ANTLR start "rule__Conditional_Color__Group__5__Impl"
    // InternalOnlineElm.g:3720:1: rule__Conditional_Color__Group__5__Impl : ( ( rule__Conditional_Color__Alternatives_5 ) ) ;
    public final void rule__Conditional_Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3724:1: ( ( ( rule__Conditional_Color__Alternatives_5 ) ) )
            // InternalOnlineElm.g:3725:1: ( ( rule__Conditional_Color__Alternatives_5 ) )
            {
            // InternalOnlineElm.g:3725:1: ( ( rule__Conditional_Color__Alternatives_5 ) )
            // InternalOnlineElm.g:3726:2: ( rule__Conditional_Color__Alternatives_5 )
            {
             before(grammarAccess.getConditional_ColorAccess().getAlternatives_5()); 
            // InternalOnlineElm.g:3727:2: ( rule__Conditional_Color__Alternatives_5 )
            // InternalOnlineElm.g:3727:3: rule__Conditional_Color__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ColorAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__5__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__6"
    // InternalOnlineElm.g:3735:1: rule__Conditional_Color__Group__6 : rule__Conditional_Color__Group__6__Impl rule__Conditional_Color__Group__7 ;
    public final void rule__Conditional_Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3739:1: ( rule__Conditional_Color__Group__6__Impl rule__Conditional_Color__Group__7 )
            // InternalOnlineElm.g:3740:2: rule__Conditional_Color__Group__6__Impl rule__Conditional_Color__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Conditional_Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__6"


    // $ANTLR start "rule__Conditional_Color__Group__6__Impl"
    // InternalOnlineElm.g:3747:1: rule__Conditional_Color__Group__6__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3751:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3752:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3752:1: ( RULE_NL )
            // InternalOnlineElm.g:3753:2: RULE_NL
            {
             before(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_6()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__6__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__7"
    // InternalOnlineElm.g:3762:1: rule__Conditional_Color__Group__7 : rule__Conditional_Color__Group__7__Impl rule__Conditional_Color__Group__8 ;
    public final void rule__Conditional_Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3766:1: ( rule__Conditional_Color__Group__7__Impl rule__Conditional_Color__Group__8 )
            // InternalOnlineElm.g:3767:2: rule__Conditional_Color__Group__7__Impl rule__Conditional_Color__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Color__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__7"


    // $ANTLR start "rule__Conditional_Color__Group__7__Impl"
    // InternalOnlineElm.g:3774:1: rule__Conditional_Color__Group__7__Impl : ( 'else' ) ;
    public final void rule__Conditional_Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3778:1: ( ( 'else' ) )
            // InternalOnlineElm.g:3779:1: ( 'else' )
            {
            // InternalOnlineElm.g:3779:1: ( 'else' )
            // InternalOnlineElm.g:3780:2: 'else'
            {
             before(grammarAccess.getConditional_ColorAccess().getElseKeyword_7()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getElseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__7__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__8"
    // InternalOnlineElm.g:3789:1: rule__Conditional_Color__Group__8 : rule__Conditional_Color__Group__8__Impl rule__Conditional_Color__Group__9 ;
    public final void rule__Conditional_Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3793:1: ( rule__Conditional_Color__Group__8__Impl rule__Conditional_Color__Group__9 )
            // InternalOnlineElm.g:3794:2: rule__Conditional_Color__Group__8__Impl rule__Conditional_Color__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Conditional_Color__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__8"


    // $ANTLR start "rule__Conditional_Color__Group__8__Impl"
    // InternalOnlineElm.g:3801:1: rule__Conditional_Color__Group__8__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3805:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3806:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3806:1: ( RULE_NL )
            // InternalOnlineElm.g:3807:2: RULE_NL
            {
             before(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_8()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__8__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__9"
    // InternalOnlineElm.g:3816:1: rule__Conditional_Color__Group__9 : rule__Conditional_Color__Group__9__Impl rule__Conditional_Color__Group__10 ;
    public final void rule__Conditional_Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3820:1: ( rule__Conditional_Color__Group__9__Impl rule__Conditional_Color__Group__10 )
            // InternalOnlineElm.g:3821:2: rule__Conditional_Color__Group__9__Impl rule__Conditional_Color__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Conditional_Color__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__9"


    // $ANTLR start "rule__Conditional_Color__Group__9__Impl"
    // InternalOnlineElm.g:3828:1: rule__Conditional_Color__Group__9__Impl : ( ( rule__Conditional_Color__Alternatives_9 ) ) ;
    public final void rule__Conditional_Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3832:1: ( ( ( rule__Conditional_Color__Alternatives_9 ) ) )
            // InternalOnlineElm.g:3833:1: ( ( rule__Conditional_Color__Alternatives_9 ) )
            {
            // InternalOnlineElm.g:3833:1: ( ( rule__Conditional_Color__Alternatives_9 ) )
            // InternalOnlineElm.g:3834:2: ( rule__Conditional_Color__Alternatives_9 )
            {
             before(grammarAccess.getConditional_ColorAccess().getAlternatives_9()); 
            // InternalOnlineElm.g:3835:2: ( rule__Conditional_Color__Alternatives_9 )
            // InternalOnlineElm.g:3835:3: rule__Conditional_Color__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getConditional_ColorAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__9__Impl"


    // $ANTLR start "rule__Conditional_Color__Group__10"
    // InternalOnlineElm.g:3843:1: rule__Conditional_Color__Group__10 : rule__Conditional_Color__Group__10__Impl ;
    public final void rule__Conditional_Color__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3847:1: ( rule__Conditional_Color__Group__10__Impl )
            // InternalOnlineElm.g:3848:2: rule__Conditional_Color__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Color__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__10"


    // $ANTLR start "rule__Conditional_Color__Group__10__Impl"
    // InternalOnlineElm.g:3854:1: rule__Conditional_Color__Group__10__Impl : ( ')' ) ;
    public final void rule__Conditional_Color__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3858:1: ( ( ')' ) )
            // InternalOnlineElm.g:3859:1: ( ')' )
            {
            // InternalOnlineElm.g:3859:1: ( ')' )
            // InternalOnlineElm.g:3860:2: ')'
            {
             before(grammarAccess.getConditional_ColorAccess().getRightParenthesisKeyword_10()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getConditional_ColorAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Group__10__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__0"
    // InternalOnlineElm.g:3870:1: rule__Conditional_Num__Group__0 : rule__Conditional_Num__Group__0__Impl rule__Conditional_Num__Group__1 ;
    public final void rule__Conditional_Num__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3874:1: ( rule__Conditional_Num__Group__0__Impl rule__Conditional_Num__Group__1 )
            // InternalOnlineElm.g:3875:2: rule__Conditional_Num__Group__0__Impl rule__Conditional_Num__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Conditional_Num__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__0"


    // $ANTLR start "rule__Conditional_Num__Group__0__Impl"
    // InternalOnlineElm.g:3882:1: rule__Conditional_Num__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional_Num__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3886:1: ( ( '(' ) )
            // InternalOnlineElm.g:3887:1: ( '(' )
            {
            // InternalOnlineElm.g:3887:1: ( '(' )
            // InternalOnlineElm.g:3888:2: '('
            {
             before(grammarAccess.getConditional_NumAccess().getLeftParenthesisKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__0__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__1"
    // InternalOnlineElm.g:3897:1: rule__Conditional_Num__Group__1 : rule__Conditional_Num__Group__1__Impl rule__Conditional_Num__Group__2 ;
    public final void rule__Conditional_Num__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3901:1: ( rule__Conditional_Num__Group__1__Impl rule__Conditional_Num__Group__2 )
            // InternalOnlineElm.g:3902:2: rule__Conditional_Num__Group__1__Impl rule__Conditional_Num__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Conditional_Num__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__1"


    // $ANTLR start "rule__Conditional_Num__Group__1__Impl"
    // InternalOnlineElm.g:3909:1: rule__Conditional_Num__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional_Num__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3913:1: ( ( 'if' ) )
            // InternalOnlineElm.g:3914:1: ( 'if' )
            {
            // InternalOnlineElm.g:3914:1: ( 'if' )
            // InternalOnlineElm.g:3915:2: 'if'
            {
             before(grammarAccess.getConditional_NumAccess().getIfKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__1__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__2"
    // InternalOnlineElm.g:3924:1: rule__Conditional_Num__Group__2 : rule__Conditional_Num__Group__2__Impl rule__Conditional_Num__Group__3 ;
    public final void rule__Conditional_Num__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3928:1: ( rule__Conditional_Num__Group__2__Impl rule__Conditional_Num__Group__3 )
            // InternalOnlineElm.g:3929:2: rule__Conditional_Num__Group__2__Impl rule__Conditional_Num__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Conditional_Num__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__2"


    // $ANTLR start "rule__Conditional_Num__Group__2__Impl"
    // InternalOnlineElm.g:3936:1: rule__Conditional_Num__Group__2__Impl : ( ruleBool_expr ) ;
    public final void rule__Conditional_Num__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3940:1: ( ( ruleBool_expr ) )
            // InternalOnlineElm.g:3941:1: ( ruleBool_expr )
            {
            // InternalOnlineElm.g:3941:1: ( ruleBool_expr )
            // InternalOnlineElm.g:3942:2: ruleBool_expr
            {
             before(grammarAccess.getConditional_NumAccess().getBool_exprParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleBool_expr();

            state._fsp--;

             after(grammarAccess.getConditional_NumAccess().getBool_exprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__2__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__3"
    // InternalOnlineElm.g:3951:1: rule__Conditional_Num__Group__3 : rule__Conditional_Num__Group__3__Impl rule__Conditional_Num__Group__4 ;
    public final void rule__Conditional_Num__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3955:1: ( rule__Conditional_Num__Group__3__Impl rule__Conditional_Num__Group__4 )
            // InternalOnlineElm.g:3956:2: rule__Conditional_Num__Group__3__Impl rule__Conditional_Num__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Num__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__3"


    // $ANTLR start "rule__Conditional_Num__Group__3__Impl"
    // InternalOnlineElm.g:3963:1: rule__Conditional_Num__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional_Num__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3967:1: ( ( 'then' ) )
            // InternalOnlineElm.g:3968:1: ( 'then' )
            {
            // InternalOnlineElm.g:3968:1: ( 'then' )
            // InternalOnlineElm.g:3969:2: 'then'
            {
             before(grammarAccess.getConditional_NumAccess().getThenKeyword_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__3__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__4"
    // InternalOnlineElm.g:3978:1: rule__Conditional_Num__Group__4 : rule__Conditional_Num__Group__4__Impl rule__Conditional_Num__Group__5 ;
    public final void rule__Conditional_Num__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3982:1: ( rule__Conditional_Num__Group__4__Impl rule__Conditional_Num__Group__5 )
            // InternalOnlineElm.g:3983:2: rule__Conditional_Num__Group__4__Impl rule__Conditional_Num__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Conditional_Num__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__4"


    // $ANTLR start "rule__Conditional_Num__Group__4__Impl"
    // InternalOnlineElm.g:3990:1: rule__Conditional_Num__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Num__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3994:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:3995:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:3995:1: ( RULE_NL )
            // InternalOnlineElm.g:3996:2: RULE_NL
            {
             before(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__4__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__5"
    // InternalOnlineElm.g:4005:1: rule__Conditional_Num__Group__5 : rule__Conditional_Num__Group__5__Impl rule__Conditional_Num__Group__6 ;
    public final void rule__Conditional_Num__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4009:1: ( rule__Conditional_Num__Group__5__Impl rule__Conditional_Num__Group__6 )
            // InternalOnlineElm.g:4010:2: rule__Conditional_Num__Group__5__Impl rule__Conditional_Num__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Num__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__5"


    // $ANTLR start "rule__Conditional_Num__Group__5__Impl"
    // InternalOnlineElm.g:4017:1: rule__Conditional_Num__Group__5__Impl : ( ( rule__Conditional_Num__Alternatives_5 ) ) ;
    public final void rule__Conditional_Num__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4021:1: ( ( ( rule__Conditional_Num__Alternatives_5 ) ) )
            // InternalOnlineElm.g:4022:1: ( ( rule__Conditional_Num__Alternatives_5 ) )
            {
            // InternalOnlineElm.g:4022:1: ( ( rule__Conditional_Num__Alternatives_5 ) )
            // InternalOnlineElm.g:4023:2: ( rule__Conditional_Num__Alternatives_5 )
            {
             before(grammarAccess.getConditional_NumAccess().getAlternatives_5()); 
            // InternalOnlineElm.g:4024:2: ( rule__Conditional_Num__Alternatives_5 )
            // InternalOnlineElm.g:4024:3: rule__Conditional_Num__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getConditional_NumAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__5__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__6"
    // InternalOnlineElm.g:4032:1: rule__Conditional_Num__Group__6 : rule__Conditional_Num__Group__6__Impl rule__Conditional_Num__Group__7 ;
    public final void rule__Conditional_Num__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4036:1: ( rule__Conditional_Num__Group__6__Impl rule__Conditional_Num__Group__7 )
            // InternalOnlineElm.g:4037:2: rule__Conditional_Num__Group__6__Impl rule__Conditional_Num__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Conditional_Num__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__6"


    // $ANTLR start "rule__Conditional_Num__Group__6__Impl"
    // InternalOnlineElm.g:4044:1: rule__Conditional_Num__Group__6__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Num__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4048:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:4049:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:4049:1: ( RULE_NL )
            // InternalOnlineElm.g:4050:2: RULE_NL
            {
             before(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_6()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__6__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__7"
    // InternalOnlineElm.g:4059:1: rule__Conditional_Num__Group__7 : rule__Conditional_Num__Group__7__Impl rule__Conditional_Num__Group__8 ;
    public final void rule__Conditional_Num__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4063:1: ( rule__Conditional_Num__Group__7__Impl rule__Conditional_Num__Group__8 )
            // InternalOnlineElm.g:4064:2: rule__Conditional_Num__Group__7__Impl rule__Conditional_Num__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Num__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__7"


    // $ANTLR start "rule__Conditional_Num__Group__7__Impl"
    // InternalOnlineElm.g:4071:1: rule__Conditional_Num__Group__7__Impl : ( 'else' ) ;
    public final void rule__Conditional_Num__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4075:1: ( ( 'else' ) )
            // InternalOnlineElm.g:4076:1: ( 'else' )
            {
            // InternalOnlineElm.g:4076:1: ( 'else' )
            // InternalOnlineElm.g:4077:2: 'else'
            {
             before(grammarAccess.getConditional_NumAccess().getElseKeyword_7()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getElseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__7__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__8"
    // InternalOnlineElm.g:4086:1: rule__Conditional_Num__Group__8 : rule__Conditional_Num__Group__8__Impl rule__Conditional_Num__Group__9 ;
    public final void rule__Conditional_Num__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4090:1: ( rule__Conditional_Num__Group__8__Impl rule__Conditional_Num__Group__9 )
            // InternalOnlineElm.g:4091:2: rule__Conditional_Num__Group__8__Impl rule__Conditional_Num__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Conditional_Num__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__8"


    // $ANTLR start "rule__Conditional_Num__Group__8__Impl"
    // InternalOnlineElm.g:4098:1: rule__Conditional_Num__Group__8__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Num__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4102:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:4103:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:4103:1: ( RULE_NL )
            // InternalOnlineElm.g:4104:2: RULE_NL
            {
             before(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_8()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__8__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__9"
    // InternalOnlineElm.g:4113:1: rule__Conditional_Num__Group__9 : rule__Conditional_Num__Group__9__Impl rule__Conditional_Num__Group__10 ;
    public final void rule__Conditional_Num__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4117:1: ( rule__Conditional_Num__Group__9__Impl rule__Conditional_Num__Group__10 )
            // InternalOnlineElm.g:4118:2: rule__Conditional_Num__Group__9__Impl rule__Conditional_Num__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Conditional_Num__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__9"


    // $ANTLR start "rule__Conditional_Num__Group__9__Impl"
    // InternalOnlineElm.g:4125:1: rule__Conditional_Num__Group__9__Impl : ( ( rule__Conditional_Num__Alternatives_9 ) ) ;
    public final void rule__Conditional_Num__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4129:1: ( ( ( rule__Conditional_Num__Alternatives_9 ) ) )
            // InternalOnlineElm.g:4130:1: ( ( rule__Conditional_Num__Alternatives_9 ) )
            {
            // InternalOnlineElm.g:4130:1: ( ( rule__Conditional_Num__Alternatives_9 ) )
            // InternalOnlineElm.g:4131:2: ( rule__Conditional_Num__Alternatives_9 )
            {
             before(grammarAccess.getConditional_NumAccess().getAlternatives_9()); 
            // InternalOnlineElm.g:4132:2: ( rule__Conditional_Num__Alternatives_9 )
            // InternalOnlineElm.g:4132:3: rule__Conditional_Num__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getConditional_NumAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__9__Impl"


    // $ANTLR start "rule__Conditional_Num__Group__10"
    // InternalOnlineElm.g:4140:1: rule__Conditional_Num__Group__10 : rule__Conditional_Num__Group__10__Impl ;
    public final void rule__Conditional_Num__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4144:1: ( rule__Conditional_Num__Group__10__Impl )
            // InternalOnlineElm.g:4145:2: rule__Conditional_Num__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Num__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__10"


    // $ANTLR start "rule__Conditional_Num__Group__10__Impl"
    // InternalOnlineElm.g:4151:1: rule__Conditional_Num__Group__10__Impl : ( ')' ) ;
    public final void rule__Conditional_Num__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4155:1: ( ( ')' ) )
            // InternalOnlineElm.g:4156:1: ( ')' )
            {
            // InternalOnlineElm.g:4156:1: ( ')' )
            // InternalOnlineElm.g:4157:2: ')'
            {
             before(grammarAccess.getConditional_NumAccess().getRightParenthesisKeyword_10()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Group__10__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__0"
    // InternalOnlineElm.g:4167:1: rule__Conditional_Str__Group__0 : rule__Conditional_Str__Group__0__Impl rule__Conditional_Str__Group__1 ;
    public final void rule__Conditional_Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4171:1: ( rule__Conditional_Str__Group__0__Impl rule__Conditional_Str__Group__1 )
            // InternalOnlineElm.g:4172:2: rule__Conditional_Str__Group__0__Impl rule__Conditional_Str__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Conditional_Str__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__0"


    // $ANTLR start "rule__Conditional_Str__Group__0__Impl"
    // InternalOnlineElm.g:4179:1: rule__Conditional_Str__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional_Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4183:1: ( ( '(' ) )
            // InternalOnlineElm.g:4184:1: ( '(' )
            {
            // InternalOnlineElm.g:4184:1: ( '(' )
            // InternalOnlineElm.g:4185:2: '('
            {
             before(grammarAccess.getConditional_StrAccess().getLeftParenthesisKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__0__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__1"
    // InternalOnlineElm.g:4194:1: rule__Conditional_Str__Group__1 : rule__Conditional_Str__Group__1__Impl rule__Conditional_Str__Group__2 ;
    public final void rule__Conditional_Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4198:1: ( rule__Conditional_Str__Group__1__Impl rule__Conditional_Str__Group__2 )
            // InternalOnlineElm.g:4199:2: rule__Conditional_Str__Group__1__Impl rule__Conditional_Str__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Conditional_Str__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__1"


    // $ANTLR start "rule__Conditional_Str__Group__1__Impl"
    // InternalOnlineElm.g:4206:1: rule__Conditional_Str__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional_Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4210:1: ( ( 'if' ) )
            // InternalOnlineElm.g:4211:1: ( 'if' )
            {
            // InternalOnlineElm.g:4211:1: ( 'if' )
            // InternalOnlineElm.g:4212:2: 'if'
            {
             before(grammarAccess.getConditional_StrAccess().getIfKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__1__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__2"
    // InternalOnlineElm.g:4221:1: rule__Conditional_Str__Group__2 : rule__Conditional_Str__Group__2__Impl rule__Conditional_Str__Group__3 ;
    public final void rule__Conditional_Str__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4225:1: ( rule__Conditional_Str__Group__2__Impl rule__Conditional_Str__Group__3 )
            // InternalOnlineElm.g:4226:2: rule__Conditional_Str__Group__2__Impl rule__Conditional_Str__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Conditional_Str__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__2"


    // $ANTLR start "rule__Conditional_Str__Group__2__Impl"
    // InternalOnlineElm.g:4233:1: rule__Conditional_Str__Group__2__Impl : ( ruleBool_expr ) ;
    public final void rule__Conditional_Str__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4237:1: ( ( ruleBool_expr ) )
            // InternalOnlineElm.g:4238:1: ( ruleBool_expr )
            {
            // InternalOnlineElm.g:4238:1: ( ruleBool_expr )
            // InternalOnlineElm.g:4239:2: ruleBool_expr
            {
             before(grammarAccess.getConditional_StrAccess().getBool_exprParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleBool_expr();

            state._fsp--;

             after(grammarAccess.getConditional_StrAccess().getBool_exprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__2__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__3"
    // InternalOnlineElm.g:4248:1: rule__Conditional_Str__Group__3 : rule__Conditional_Str__Group__3__Impl rule__Conditional_Str__Group__4 ;
    public final void rule__Conditional_Str__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4252:1: ( rule__Conditional_Str__Group__3__Impl rule__Conditional_Str__Group__4 )
            // InternalOnlineElm.g:4253:2: rule__Conditional_Str__Group__3__Impl rule__Conditional_Str__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Str__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__3"


    // $ANTLR start "rule__Conditional_Str__Group__3__Impl"
    // InternalOnlineElm.g:4260:1: rule__Conditional_Str__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional_Str__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4264:1: ( ( 'then' ) )
            // InternalOnlineElm.g:4265:1: ( 'then' )
            {
            // InternalOnlineElm.g:4265:1: ( 'then' )
            // InternalOnlineElm.g:4266:2: 'then'
            {
             before(grammarAccess.getConditional_StrAccess().getThenKeyword_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__3__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__4"
    // InternalOnlineElm.g:4275:1: rule__Conditional_Str__Group__4 : rule__Conditional_Str__Group__4__Impl rule__Conditional_Str__Group__5 ;
    public final void rule__Conditional_Str__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4279:1: ( rule__Conditional_Str__Group__4__Impl rule__Conditional_Str__Group__5 )
            // InternalOnlineElm.g:4280:2: rule__Conditional_Str__Group__4__Impl rule__Conditional_Str__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Conditional_Str__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__4"


    // $ANTLR start "rule__Conditional_Str__Group__4__Impl"
    // InternalOnlineElm.g:4287:1: rule__Conditional_Str__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Str__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4291:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:4292:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:4292:1: ( RULE_NL )
            // InternalOnlineElm.g:4293:2: RULE_NL
            {
             before(grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__4__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__5"
    // InternalOnlineElm.g:4302:1: rule__Conditional_Str__Group__5 : rule__Conditional_Str__Group__5__Impl rule__Conditional_Str__Group__6 ;
    public final void rule__Conditional_Str__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4306:1: ( rule__Conditional_Str__Group__5__Impl rule__Conditional_Str__Group__6 )
            // InternalOnlineElm.g:4307:2: rule__Conditional_Str__Group__5__Impl rule__Conditional_Str__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Conditional_Str__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__5"


    // $ANTLR start "rule__Conditional_Str__Group__5__Impl"
    // InternalOnlineElm.g:4314:1: rule__Conditional_Str__Group__5__Impl : ( ( rule__Conditional_Str__Alternatives_5 ) ) ;
    public final void rule__Conditional_Str__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4318:1: ( ( ( rule__Conditional_Str__Alternatives_5 ) ) )
            // InternalOnlineElm.g:4319:1: ( ( rule__Conditional_Str__Alternatives_5 ) )
            {
            // InternalOnlineElm.g:4319:1: ( ( rule__Conditional_Str__Alternatives_5 ) )
            // InternalOnlineElm.g:4320:2: ( rule__Conditional_Str__Alternatives_5 )
            {
             before(grammarAccess.getConditional_StrAccess().getAlternatives_5()); 
            // InternalOnlineElm.g:4321:2: ( rule__Conditional_Str__Alternatives_5 )
            // InternalOnlineElm.g:4321:3: rule__Conditional_Str__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getConditional_StrAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__5__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__6"
    // InternalOnlineElm.g:4329:1: rule__Conditional_Str__Group__6 : rule__Conditional_Str__Group__6__Impl rule__Conditional_Str__Group__7 ;
    public final void rule__Conditional_Str__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4333:1: ( rule__Conditional_Str__Group__6__Impl rule__Conditional_Str__Group__7 )
            // InternalOnlineElm.g:4334:2: rule__Conditional_Str__Group__6__Impl rule__Conditional_Str__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Conditional_Str__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__6"


    // $ANTLR start "rule__Conditional_Str__Group__6__Impl"
    // InternalOnlineElm.g:4341:1: rule__Conditional_Str__Group__6__Impl : ( 'else' ) ;
    public final void rule__Conditional_Str__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4345:1: ( ( 'else' ) )
            // InternalOnlineElm.g:4346:1: ( 'else' )
            {
            // InternalOnlineElm.g:4346:1: ( 'else' )
            // InternalOnlineElm.g:4347:2: 'else'
            {
             before(grammarAccess.getConditional_StrAccess().getElseKeyword_6()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getElseKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__6__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__7"
    // InternalOnlineElm.g:4356:1: rule__Conditional_Str__Group__7 : rule__Conditional_Str__Group__7__Impl rule__Conditional_Str__Group__8 ;
    public final void rule__Conditional_Str__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4360:1: ( rule__Conditional_Str__Group__7__Impl rule__Conditional_Str__Group__8 )
            // InternalOnlineElm.g:4361:2: rule__Conditional_Str__Group__7__Impl rule__Conditional_Str__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Conditional_Str__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__7"


    // $ANTLR start "rule__Conditional_Str__Group__7__Impl"
    // InternalOnlineElm.g:4368:1: rule__Conditional_Str__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Conditional_Str__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4372:1: ( ( RULE_NL ) )
            // InternalOnlineElm.g:4373:1: ( RULE_NL )
            {
            // InternalOnlineElm.g:4373:1: ( RULE_NL )
            // InternalOnlineElm.g:4374:2: RULE_NL
            {
             before(grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_7()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__7__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__8"
    // InternalOnlineElm.g:4383:1: rule__Conditional_Str__Group__8 : rule__Conditional_Str__Group__8__Impl rule__Conditional_Str__Group__9 ;
    public final void rule__Conditional_Str__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4387:1: ( rule__Conditional_Str__Group__8__Impl rule__Conditional_Str__Group__9 )
            // InternalOnlineElm.g:4388:2: rule__Conditional_Str__Group__8__Impl rule__Conditional_Str__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Conditional_Str__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__8"


    // $ANTLR start "rule__Conditional_Str__Group__8__Impl"
    // InternalOnlineElm.g:4395:1: rule__Conditional_Str__Group__8__Impl : ( ( rule__Conditional_Str__Alternatives_8 ) ) ;
    public final void rule__Conditional_Str__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4399:1: ( ( ( rule__Conditional_Str__Alternatives_8 ) ) )
            // InternalOnlineElm.g:4400:1: ( ( rule__Conditional_Str__Alternatives_8 ) )
            {
            // InternalOnlineElm.g:4400:1: ( ( rule__Conditional_Str__Alternatives_8 ) )
            // InternalOnlineElm.g:4401:2: ( rule__Conditional_Str__Alternatives_8 )
            {
             before(grammarAccess.getConditional_StrAccess().getAlternatives_8()); 
            // InternalOnlineElm.g:4402:2: ( rule__Conditional_Str__Alternatives_8 )
            // InternalOnlineElm.g:4402:3: rule__Conditional_Str__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getConditional_StrAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__8__Impl"


    // $ANTLR start "rule__Conditional_Str__Group__9"
    // InternalOnlineElm.g:4410:1: rule__Conditional_Str__Group__9 : rule__Conditional_Str__Group__9__Impl ;
    public final void rule__Conditional_Str__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4414:1: ( rule__Conditional_Str__Group__9__Impl )
            // InternalOnlineElm.g:4415:2: rule__Conditional_Str__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_Str__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__9"


    // $ANTLR start "rule__Conditional_Str__Group__9__Impl"
    // InternalOnlineElm.g:4421:1: rule__Conditional_Str__Group__9__Impl : ( ')' ) ;
    public final void rule__Conditional_Str__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4425:1: ( ( ')' ) )
            // InternalOnlineElm.g:4426:1: ( ')' )
            {
            // InternalOnlineElm.g:4426:1: ( ')' )
            // InternalOnlineElm.g:4427:2: ')'
            {
             before(grammarAccess.getConditional_StrAccess().getRightParenthesisKeyword_9()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Group__9__Impl"


    // $ANTLR start "rule__Or_expr__Group__0"
    // InternalOnlineElm.g:4437:1: rule__Or_expr__Group__0 : rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1 ;
    public final void rule__Or_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4441:1: ( rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1 )
            // InternalOnlineElm.g:4442:2: rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Or_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__0"


    // $ANTLR start "rule__Or_expr__Group__0__Impl"
    // InternalOnlineElm.g:4449:1: rule__Or_expr__Group__0__Impl : ( ruleAnd_expr ) ;
    public final void rule__Or_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4453:1: ( ( ruleAnd_expr ) )
            // InternalOnlineElm.g:4454:1: ( ruleAnd_expr )
            {
            // InternalOnlineElm.g:4454:1: ( ruleAnd_expr )
            // InternalOnlineElm.g:4455:2: ruleAnd_expr
            {
             before(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__0__Impl"


    // $ANTLR start "rule__Or_expr__Group__1"
    // InternalOnlineElm.g:4464:1: rule__Or_expr__Group__1 : rule__Or_expr__Group__1__Impl ;
    public final void rule__Or_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4468:1: ( rule__Or_expr__Group__1__Impl )
            // InternalOnlineElm.g:4469:2: rule__Or_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__1"


    // $ANTLR start "rule__Or_expr__Group__1__Impl"
    // InternalOnlineElm.g:4475:1: rule__Or_expr__Group__1__Impl : ( ( rule__Or_expr__Group_1__0 )* ) ;
    public final void rule__Or_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4479:1: ( ( ( rule__Or_expr__Group_1__0 )* ) )
            // InternalOnlineElm.g:4480:1: ( ( rule__Or_expr__Group_1__0 )* )
            {
            // InternalOnlineElm.g:4480:1: ( ( rule__Or_expr__Group_1__0 )* )
            // InternalOnlineElm.g:4481:2: ( rule__Or_expr__Group_1__0 )*
            {
             before(grammarAccess.getOr_exprAccess().getGroup_1()); 
            // InternalOnlineElm.g:4482:2: ( rule__Or_expr__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==76) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOnlineElm.g:4482:3: rule__Or_expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Or_expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getOr_exprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__1__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__0"
    // InternalOnlineElm.g:4491:1: rule__Or_expr__Group_1__0 : rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1 ;
    public final void rule__Or_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4495:1: ( rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1 )
            // InternalOnlineElm.g:4496:2: rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Or_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__0"


    // $ANTLR start "rule__Or_expr__Group_1__0__Impl"
    // InternalOnlineElm.g:4503:1: rule__Or_expr__Group_1__0__Impl : ( () ) ;
    public final void rule__Or_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4507:1: ( ( () ) )
            // InternalOnlineElm.g:4508:1: ( () )
            {
            // InternalOnlineElm.g:4508:1: ( () )
            // InternalOnlineElm.g:4509:2: ()
            {
             before(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); 
            // InternalOnlineElm.g:4510:2: ()
            // InternalOnlineElm.g:4510:3: 
            {
            }

             after(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__0__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__1"
    // InternalOnlineElm.g:4518:1: rule__Or_expr__Group_1__1 : rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2 ;
    public final void rule__Or_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4522:1: ( rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2 )
            // InternalOnlineElm.g:4523:2: rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Or_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__1"


    // $ANTLR start "rule__Or_expr__Group_1__1__Impl"
    // InternalOnlineElm.g:4530:1: rule__Or_expr__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4534:1: ( ( '||' ) )
            // InternalOnlineElm.g:4535:1: ( '||' )
            {
            // InternalOnlineElm.g:4535:1: ( '||' )
            // InternalOnlineElm.g:4536:2: '||'
            {
             before(grammarAccess.getOr_exprAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getOr_exprAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__1__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__2"
    // InternalOnlineElm.g:4545:1: rule__Or_expr__Group_1__2 : rule__Or_expr__Group_1__2__Impl ;
    public final void rule__Or_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4549:1: ( rule__Or_expr__Group_1__2__Impl )
            // InternalOnlineElm.g:4550:2: rule__Or_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__2"


    // $ANTLR start "rule__Or_expr__Group_1__2__Impl"
    // InternalOnlineElm.g:4556:1: rule__Or_expr__Group_1__2__Impl : ( ( rule__Or_expr__RightAssignment_1_2 ) ) ;
    public final void rule__Or_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4560:1: ( ( ( rule__Or_expr__RightAssignment_1_2 ) ) )
            // InternalOnlineElm.g:4561:1: ( ( rule__Or_expr__RightAssignment_1_2 ) )
            {
            // InternalOnlineElm.g:4561:1: ( ( rule__Or_expr__RightAssignment_1_2 ) )
            // InternalOnlineElm.g:4562:2: ( rule__Or_expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); 
            // InternalOnlineElm.g:4563:2: ( rule__Or_expr__RightAssignment_1_2 )
            // InternalOnlineElm.g:4563:3: rule__Or_expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or_expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__2__Impl"


    // $ANTLR start "rule__And_expr__Group__0"
    // InternalOnlineElm.g:4572:1: rule__And_expr__Group__0 : rule__And_expr__Group__0__Impl rule__And_expr__Group__1 ;
    public final void rule__And_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4576:1: ( rule__And_expr__Group__0__Impl rule__And_expr__Group__1 )
            // InternalOnlineElm.g:4577:2: rule__And_expr__Group__0__Impl rule__And_expr__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__And_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__0"


    // $ANTLR start "rule__And_expr__Group__0__Impl"
    // InternalOnlineElm.g:4584:1: rule__And_expr__Group__0__Impl : ( ruleNot_expr ) ;
    public final void rule__And_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4588:1: ( ( ruleNot_expr ) )
            // InternalOnlineElm.g:4589:1: ( ruleNot_expr )
            {
            // InternalOnlineElm.g:4589:1: ( ruleNot_expr )
            // InternalOnlineElm.g:4590:2: ruleNot_expr
            {
             before(grammarAccess.getAnd_exprAccess().getNot_exprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNot_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprAccess().getNot_exprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__0__Impl"


    // $ANTLR start "rule__And_expr__Group__1"
    // InternalOnlineElm.g:4599:1: rule__And_expr__Group__1 : rule__And_expr__Group__1__Impl ;
    public final void rule__And_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4603:1: ( rule__And_expr__Group__1__Impl )
            // InternalOnlineElm.g:4604:2: rule__And_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__1"


    // $ANTLR start "rule__And_expr__Group__1__Impl"
    // InternalOnlineElm.g:4610:1: rule__And_expr__Group__1__Impl : ( ( rule__And_expr__Group_1__0 )* ) ;
    public final void rule__And_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4614:1: ( ( ( rule__And_expr__Group_1__0 )* ) )
            // InternalOnlineElm.g:4615:1: ( ( rule__And_expr__Group_1__0 )* )
            {
            // InternalOnlineElm.g:4615:1: ( ( rule__And_expr__Group_1__0 )* )
            // InternalOnlineElm.g:4616:2: ( rule__And_expr__Group_1__0 )*
            {
             before(grammarAccess.getAnd_exprAccess().getGroup_1()); 
            // InternalOnlineElm.g:4617:2: ( rule__And_expr__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==77) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOnlineElm.g:4617:3: rule__And_expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__And_expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getAnd_exprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__1__Impl"


    // $ANTLR start "rule__And_expr__Group_1__0"
    // InternalOnlineElm.g:4626:1: rule__And_expr__Group_1__0 : rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1 ;
    public final void rule__And_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4630:1: ( rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1 )
            // InternalOnlineElm.g:4631:2: rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__And_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__0"


    // $ANTLR start "rule__And_expr__Group_1__0__Impl"
    // InternalOnlineElm.g:4638:1: rule__And_expr__Group_1__0__Impl : ( () ) ;
    public final void rule__And_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4642:1: ( ( () ) )
            // InternalOnlineElm.g:4643:1: ( () )
            {
            // InternalOnlineElm.g:4643:1: ( () )
            // InternalOnlineElm.g:4644:2: ()
            {
             before(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); 
            // InternalOnlineElm.g:4645:2: ()
            // InternalOnlineElm.g:4645:3: 
            {
            }

             after(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__0__Impl"


    // $ANTLR start "rule__And_expr__Group_1__1"
    // InternalOnlineElm.g:4653:1: rule__And_expr__Group_1__1 : rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2 ;
    public final void rule__And_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4657:1: ( rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2 )
            // InternalOnlineElm.g:4658:2: rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__And_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__1"


    // $ANTLR start "rule__And_expr__Group_1__1__Impl"
    // InternalOnlineElm.g:4665:1: rule__And_expr__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4669:1: ( ( '&&' ) )
            // InternalOnlineElm.g:4670:1: ( '&&' )
            {
            // InternalOnlineElm.g:4670:1: ( '&&' )
            // InternalOnlineElm.g:4671:2: '&&'
            {
             before(grammarAccess.getAnd_exprAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getAnd_exprAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__1__Impl"


    // $ANTLR start "rule__And_expr__Group_1__2"
    // InternalOnlineElm.g:4680:1: rule__And_expr__Group_1__2 : rule__And_expr__Group_1__2__Impl ;
    public final void rule__And_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4684:1: ( rule__And_expr__Group_1__2__Impl )
            // InternalOnlineElm.g:4685:2: rule__And_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__2"


    // $ANTLR start "rule__And_expr__Group_1__2__Impl"
    // InternalOnlineElm.g:4691:1: rule__And_expr__Group_1__2__Impl : ( ( rule__And_expr__RightAssignment_1_2 ) ) ;
    public final void rule__And_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4695:1: ( ( ( rule__And_expr__RightAssignment_1_2 ) ) )
            // InternalOnlineElm.g:4696:1: ( ( rule__And_expr__RightAssignment_1_2 ) )
            {
            // InternalOnlineElm.g:4696:1: ( ( rule__And_expr__RightAssignment_1_2 ) )
            // InternalOnlineElm.g:4697:2: ( rule__And_expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); 
            // InternalOnlineElm.g:4698:2: ( rule__And_expr__RightAssignment_1_2 )
            // InternalOnlineElm.g:4698:3: rule__And_expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And_expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__2__Impl"


    // $ANTLR start "rule__Not_expr__Group_0__0"
    // InternalOnlineElm.g:4707:1: rule__Not_expr__Group_0__0 : rule__Not_expr__Group_0__0__Impl rule__Not_expr__Group_0__1 ;
    public final void rule__Not_expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4711:1: ( rule__Not_expr__Group_0__0__Impl rule__Not_expr__Group_0__1 )
            // InternalOnlineElm.g:4712:2: rule__Not_expr__Group_0__0__Impl rule__Not_expr__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Not_expr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not_expr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__0"


    // $ANTLR start "rule__Not_expr__Group_0__0__Impl"
    // InternalOnlineElm.g:4719:1: rule__Not_expr__Group_0__0__Impl : ( () ) ;
    public final void rule__Not_expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4723:1: ( ( () ) )
            // InternalOnlineElm.g:4724:1: ( () )
            {
            // InternalOnlineElm.g:4724:1: ( () )
            // InternalOnlineElm.g:4725:2: ()
            {
             before(grammarAccess.getNot_exprAccess().getNot_exprAction_0_0()); 
            // InternalOnlineElm.g:4726:2: ()
            // InternalOnlineElm.g:4726:3: 
            {
            }

             after(grammarAccess.getNot_exprAccess().getNot_exprAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__0__Impl"


    // $ANTLR start "rule__Not_expr__Group_0__1"
    // InternalOnlineElm.g:4734:1: rule__Not_expr__Group_0__1 : rule__Not_expr__Group_0__1__Impl rule__Not_expr__Group_0__2 ;
    public final void rule__Not_expr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4738:1: ( rule__Not_expr__Group_0__1__Impl rule__Not_expr__Group_0__2 )
            // InternalOnlineElm.g:4739:2: rule__Not_expr__Group_0__1__Impl rule__Not_expr__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Not_expr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not_expr__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__1"


    // $ANTLR start "rule__Not_expr__Group_0__1__Impl"
    // InternalOnlineElm.g:4746:1: rule__Not_expr__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__Not_expr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4750:1: ( ( 'not' ) )
            // InternalOnlineElm.g:4751:1: ( 'not' )
            {
            // InternalOnlineElm.g:4751:1: ( 'not' )
            // InternalOnlineElm.g:4752:2: 'not'
            {
             before(grammarAccess.getNot_exprAccess().getNotKeyword_0_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getNot_exprAccess().getNotKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__1__Impl"


    // $ANTLR start "rule__Not_expr__Group_0__2"
    // InternalOnlineElm.g:4761:1: rule__Not_expr__Group_0__2 : rule__Not_expr__Group_0__2__Impl ;
    public final void rule__Not_expr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4765:1: ( rule__Not_expr__Group_0__2__Impl )
            // InternalOnlineElm.g:4766:2: rule__Not_expr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not_expr__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__2"


    // $ANTLR start "rule__Not_expr__Group_0__2__Impl"
    // InternalOnlineElm.g:4772:1: rule__Not_expr__Group_0__2__Impl : ( ( rule__Not_expr__OperandAssignment_0_2 ) ) ;
    public final void rule__Not_expr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4776:1: ( ( ( rule__Not_expr__OperandAssignment_0_2 ) ) )
            // InternalOnlineElm.g:4777:1: ( ( rule__Not_expr__OperandAssignment_0_2 ) )
            {
            // InternalOnlineElm.g:4777:1: ( ( rule__Not_expr__OperandAssignment_0_2 ) )
            // InternalOnlineElm.g:4778:2: ( rule__Not_expr__OperandAssignment_0_2 )
            {
             before(grammarAccess.getNot_exprAccess().getOperandAssignment_0_2()); 
            // InternalOnlineElm.g:4779:2: ( rule__Not_expr__OperandAssignment_0_2 )
            // InternalOnlineElm.g:4779:3: rule__Not_expr__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Not_expr__OperandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNot_exprAccess().getOperandAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__Group_0__2__Impl"


    // $ANTLR start "rule__Compare_expr__Group__0"
    // InternalOnlineElm.g:4788:1: rule__Compare_expr__Group__0 : rule__Compare_expr__Group__0__Impl rule__Compare_expr__Group__1 ;
    public final void rule__Compare_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4792:1: ( rule__Compare_expr__Group__0__Impl rule__Compare_expr__Group__1 )
            // InternalOnlineElm.g:4793:2: rule__Compare_expr__Group__0__Impl rule__Compare_expr__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Compare_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group__0"


    // $ANTLR start "rule__Compare_expr__Group__0__Impl"
    // InternalOnlineElm.g:4800:1: rule__Compare_expr__Group__0__Impl : ( ( rule__Compare_expr__LeftAssignment_0 ) ) ;
    public final void rule__Compare_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4804:1: ( ( ( rule__Compare_expr__LeftAssignment_0 ) ) )
            // InternalOnlineElm.g:4805:1: ( ( rule__Compare_expr__LeftAssignment_0 ) )
            {
            // InternalOnlineElm.g:4805:1: ( ( rule__Compare_expr__LeftAssignment_0 ) )
            // InternalOnlineElm.g:4806:2: ( rule__Compare_expr__LeftAssignment_0 )
            {
             before(grammarAccess.getCompare_exprAccess().getLeftAssignment_0()); 
            // InternalOnlineElm.g:4807:2: ( rule__Compare_expr__LeftAssignment_0 )
            // InternalOnlineElm.g:4807:3: rule__Compare_expr__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompare_exprAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group__0__Impl"


    // $ANTLR start "rule__Compare_expr__Group__1"
    // InternalOnlineElm.g:4815:1: rule__Compare_expr__Group__1 : rule__Compare_expr__Group__1__Impl ;
    public final void rule__Compare_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4819:1: ( rule__Compare_expr__Group__1__Impl )
            // InternalOnlineElm.g:4820:2: rule__Compare_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group__1"


    // $ANTLR start "rule__Compare_expr__Group__1__Impl"
    // InternalOnlineElm.g:4826:1: rule__Compare_expr__Group__1__Impl : ( ( rule__Compare_expr__Group_1__0 )* ) ;
    public final void rule__Compare_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4830:1: ( ( ( rule__Compare_expr__Group_1__0 )* ) )
            // InternalOnlineElm.g:4831:1: ( ( rule__Compare_expr__Group_1__0 )* )
            {
            // InternalOnlineElm.g:4831:1: ( ( rule__Compare_expr__Group_1__0 )* )
            // InternalOnlineElm.g:4832:2: ( rule__Compare_expr__Group_1__0 )*
            {
             before(grammarAccess.getCompare_exprAccess().getGroup_1()); 
            // InternalOnlineElm.g:4833:2: ( rule__Compare_expr__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=15 && LA47_0<=20)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOnlineElm.g:4833:3: rule__Compare_expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Compare_expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getCompare_exprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group__1__Impl"


    // $ANTLR start "rule__Compare_expr__Group_1__0"
    // InternalOnlineElm.g:4842:1: rule__Compare_expr__Group_1__0 : rule__Compare_expr__Group_1__0__Impl rule__Compare_expr__Group_1__1 ;
    public final void rule__Compare_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4846:1: ( rule__Compare_expr__Group_1__0__Impl rule__Compare_expr__Group_1__1 )
            // InternalOnlineElm.g:4847:2: rule__Compare_expr__Group_1__0__Impl rule__Compare_expr__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Compare_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__0"


    // $ANTLR start "rule__Compare_expr__Group_1__0__Impl"
    // InternalOnlineElm.g:4854:1: rule__Compare_expr__Group_1__0__Impl : ( () ) ;
    public final void rule__Compare_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4858:1: ( ( () ) )
            // InternalOnlineElm.g:4859:1: ( () )
            {
            // InternalOnlineElm.g:4859:1: ( () )
            // InternalOnlineElm.g:4860:2: ()
            {
             before(grammarAccess.getCompare_exprAccess().getCompare_exprLeftAction_1_0()); 
            // InternalOnlineElm.g:4861:2: ()
            // InternalOnlineElm.g:4861:3: 
            {
            }

             after(grammarAccess.getCompare_exprAccess().getCompare_exprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__0__Impl"


    // $ANTLR start "rule__Compare_expr__Group_1__1"
    // InternalOnlineElm.g:4869:1: rule__Compare_expr__Group_1__1 : rule__Compare_expr__Group_1__1__Impl rule__Compare_expr__Group_1__2 ;
    public final void rule__Compare_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4873:1: ( rule__Compare_expr__Group_1__1__Impl rule__Compare_expr__Group_1__2 )
            // InternalOnlineElm.g:4874:2: rule__Compare_expr__Group_1__1__Impl rule__Compare_expr__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Compare_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__1"


    // $ANTLR start "rule__Compare_expr__Group_1__1__Impl"
    // InternalOnlineElm.g:4881:1: rule__Compare_expr__Group_1__1__Impl : ( ( rule__Compare_expr__OperatorAssignment_1_1 ) ) ;
    public final void rule__Compare_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4885:1: ( ( ( rule__Compare_expr__OperatorAssignment_1_1 ) ) )
            // InternalOnlineElm.g:4886:1: ( ( rule__Compare_expr__OperatorAssignment_1_1 ) )
            {
            // InternalOnlineElm.g:4886:1: ( ( rule__Compare_expr__OperatorAssignment_1_1 ) )
            // InternalOnlineElm.g:4887:2: ( rule__Compare_expr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompare_exprAccess().getOperatorAssignment_1_1()); 
            // InternalOnlineElm.g:4888:2: ( rule__Compare_expr__OperatorAssignment_1_1 )
            // InternalOnlineElm.g:4888:3: rule__Compare_expr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompare_exprAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__1__Impl"


    // $ANTLR start "rule__Compare_expr__Group_1__2"
    // InternalOnlineElm.g:4896:1: rule__Compare_expr__Group_1__2 : rule__Compare_expr__Group_1__2__Impl ;
    public final void rule__Compare_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4900:1: ( rule__Compare_expr__Group_1__2__Impl )
            // InternalOnlineElm.g:4901:2: rule__Compare_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__2"


    // $ANTLR start "rule__Compare_expr__Group_1__2__Impl"
    // InternalOnlineElm.g:4907:1: rule__Compare_expr__Group_1__2__Impl : ( ( rule__Compare_expr__RightAssignment_1_2 ) ) ;
    public final void rule__Compare_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4911:1: ( ( ( rule__Compare_expr__RightAssignment_1_2 ) ) )
            // InternalOnlineElm.g:4912:1: ( ( rule__Compare_expr__RightAssignment_1_2 ) )
            {
            // InternalOnlineElm.g:4912:1: ( ( rule__Compare_expr__RightAssignment_1_2 ) )
            // InternalOnlineElm.g:4913:2: ( rule__Compare_expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompare_exprAccess().getRightAssignment_1_2()); 
            // InternalOnlineElm.g:4914:2: ( rule__Compare_expr__RightAssignment_1_2 )
            // InternalOnlineElm.g:4914:3: rule__Compare_expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompare_exprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__Group_1__2__Impl"


    // $ANTLR start "rule__Math_exp__Group__0"
    // InternalOnlineElm.g:4923:1: rule__Math_exp__Group__0 : rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1 ;
    public final void rule__Math_exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4927:1: ( rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1 )
            // InternalOnlineElm.g:4928:2: rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Math_exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__0"


    // $ANTLR start "rule__Math_exp__Group__0__Impl"
    // InternalOnlineElm.g:4935:1: rule__Math_exp__Group__0__Impl : ( ruleTerminal_math_exp ) ;
    public final void rule__Math_exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4939:1: ( ( ruleTerminal_math_exp ) )
            // InternalOnlineElm.g:4940:1: ( ruleTerminal_math_exp )
            {
            // InternalOnlineElm.g:4940:1: ( ruleTerminal_math_exp )
            // InternalOnlineElm.g:4941:2: ruleTerminal_math_exp
            {
             before(grammarAccess.getMath_expAccess().getTerminal_math_expParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal_math_exp();

            state._fsp--;

             after(grammarAccess.getMath_expAccess().getTerminal_math_expParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__0__Impl"


    // $ANTLR start "rule__Math_exp__Group__1"
    // InternalOnlineElm.g:4950:1: rule__Math_exp__Group__1 : rule__Math_exp__Group__1__Impl ;
    public final void rule__Math_exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4954:1: ( rule__Math_exp__Group__1__Impl )
            // InternalOnlineElm.g:4955:2: rule__Math_exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__1"


    // $ANTLR start "rule__Math_exp__Group__1__Impl"
    // InternalOnlineElm.g:4961:1: rule__Math_exp__Group__1__Impl : ( ( rule__Math_exp__Group_1__0 )* ) ;
    public final void rule__Math_exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4965:1: ( ( ( rule__Math_exp__Group_1__0 )* ) )
            // InternalOnlineElm.g:4966:1: ( ( rule__Math_exp__Group_1__0 )* )
            {
            // InternalOnlineElm.g:4966:1: ( ( rule__Math_exp__Group_1__0 )* )
            // InternalOnlineElm.g:4967:2: ( rule__Math_exp__Group_1__0 )*
            {
             before(grammarAccess.getMath_expAccess().getGroup_1()); 
            // InternalOnlineElm.g:4968:2: ( rule__Math_exp__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=21 && LA48_0<=24)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOnlineElm.g:4968:3: rule__Math_exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Math_exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getMath_expAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__1__Impl"


    // $ANTLR start "rule__Math_exp__Group_1__0"
    // InternalOnlineElm.g:4977:1: rule__Math_exp__Group_1__0 : rule__Math_exp__Group_1__0__Impl rule__Math_exp__Group_1__1 ;
    public final void rule__Math_exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4981:1: ( rule__Math_exp__Group_1__0__Impl rule__Math_exp__Group_1__1 )
            // InternalOnlineElm.g:4982:2: rule__Math_exp__Group_1__0__Impl rule__Math_exp__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Math_exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Math_exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__0"


    // $ANTLR start "rule__Math_exp__Group_1__0__Impl"
    // InternalOnlineElm.g:4989:1: rule__Math_exp__Group_1__0__Impl : ( () ) ;
    public final void rule__Math_exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:4993:1: ( ( () ) )
            // InternalOnlineElm.g:4994:1: ( () )
            {
            // InternalOnlineElm.g:4994:1: ( () )
            // InternalOnlineElm.g:4995:2: ()
            {
             before(grammarAccess.getMath_expAccess().getOperationLeftAction_1_0()); 
            // InternalOnlineElm.g:4996:2: ()
            // InternalOnlineElm.g:4996:3: 
            {
            }

             after(grammarAccess.getMath_expAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__0__Impl"


    // $ANTLR start "rule__Math_exp__Group_1__1"
    // InternalOnlineElm.g:5004:1: rule__Math_exp__Group_1__1 : rule__Math_exp__Group_1__1__Impl rule__Math_exp__Group_1__2 ;
    public final void rule__Math_exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5008:1: ( rule__Math_exp__Group_1__1__Impl rule__Math_exp__Group_1__2 )
            // InternalOnlineElm.g:5009:2: rule__Math_exp__Group_1__1__Impl rule__Math_exp__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Math_exp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Math_exp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__1"


    // $ANTLR start "rule__Math_exp__Group_1__1__Impl"
    // InternalOnlineElm.g:5016:1: rule__Math_exp__Group_1__1__Impl : ( ( rule__Math_exp__OpAssignment_1_1 ) ) ;
    public final void rule__Math_exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5020:1: ( ( ( rule__Math_exp__OpAssignment_1_1 ) ) )
            // InternalOnlineElm.g:5021:1: ( ( rule__Math_exp__OpAssignment_1_1 ) )
            {
            // InternalOnlineElm.g:5021:1: ( ( rule__Math_exp__OpAssignment_1_1 ) )
            // InternalOnlineElm.g:5022:2: ( rule__Math_exp__OpAssignment_1_1 )
            {
             before(grammarAccess.getMath_expAccess().getOpAssignment_1_1()); 
            // InternalOnlineElm.g:5023:2: ( rule__Math_exp__OpAssignment_1_1 )
            // InternalOnlineElm.g:5023:3: rule__Math_exp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMath_expAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__1__Impl"


    // $ANTLR start "rule__Math_exp__Group_1__2"
    // InternalOnlineElm.g:5031:1: rule__Math_exp__Group_1__2 : rule__Math_exp__Group_1__2__Impl ;
    public final void rule__Math_exp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5035:1: ( rule__Math_exp__Group_1__2__Impl )
            // InternalOnlineElm.g:5036:2: rule__Math_exp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__2"


    // $ANTLR start "rule__Math_exp__Group_1__2__Impl"
    // InternalOnlineElm.g:5042:1: rule__Math_exp__Group_1__2__Impl : ( ( rule__Math_exp__RightAssignment_1_2 ) ) ;
    public final void rule__Math_exp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5046:1: ( ( ( rule__Math_exp__RightAssignment_1_2 ) ) )
            // InternalOnlineElm.g:5047:1: ( ( rule__Math_exp__RightAssignment_1_2 ) )
            {
            // InternalOnlineElm.g:5047:1: ( ( rule__Math_exp__RightAssignment_1_2 ) )
            // InternalOnlineElm.g:5048:2: ( rule__Math_exp__RightAssignment_1_2 )
            {
             before(grammarAccess.getMath_expAccess().getRightAssignment_1_2()); 
            // InternalOnlineElm.g:5049:2: ( rule__Math_exp__RightAssignment_1_2 )
            // InternalOnlineElm.g:5049:3: rule__Math_exp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMath_expAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group_1__2__Impl"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__0"
    // InternalOnlineElm.g:5058:1: rule__Terminal_math_exp__Group_0__0 : rule__Terminal_math_exp__Group_0__0__Impl rule__Terminal_math_exp__Group_0__1 ;
    public final void rule__Terminal_math_exp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5062:1: ( rule__Terminal_math_exp__Group_0__0__Impl rule__Terminal_math_exp__Group_0__1 )
            // InternalOnlineElm.g:5063:2: rule__Terminal_math_exp__Group_0__0__Impl rule__Terminal_math_exp__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Terminal_math_exp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__0"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__0__Impl"
    // InternalOnlineElm.g:5070:1: rule__Terminal_math_exp__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminal_math_exp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5074:1: ( ( '(' ) )
            // InternalOnlineElm.g:5075:1: ( '(' )
            {
            // InternalOnlineElm.g:5075:1: ( '(' )
            // InternalOnlineElm.g:5076:2: '('
            {
             before(grammarAccess.getTerminal_math_expAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getTerminal_math_expAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__1"
    // InternalOnlineElm.g:5085:1: rule__Terminal_math_exp__Group_0__1 : rule__Terminal_math_exp__Group_0__1__Impl rule__Terminal_math_exp__Group_0__2 ;
    public final void rule__Terminal_math_exp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5089:1: ( rule__Terminal_math_exp__Group_0__1__Impl rule__Terminal_math_exp__Group_0__2 )
            // InternalOnlineElm.g:5090:2: rule__Terminal_math_exp__Group_0__1__Impl rule__Terminal_math_exp__Group_0__2
            {
            pushFollow(FOLLOW_26);
            rule__Terminal_math_exp__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__1"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__1__Impl"
    // InternalOnlineElm.g:5097:1: rule__Terminal_math_exp__Group_0__1__Impl : ( ruleMath_exp ) ;
    public final void rule__Terminal_math_exp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5101:1: ( ( ruleMath_exp ) )
            // InternalOnlineElm.g:5102:1: ( ruleMath_exp )
            {
            // InternalOnlineElm.g:5102:1: ( ruleMath_exp )
            // InternalOnlineElm.g:5103:2: ruleMath_exp
            {
             before(grammarAccess.getTerminal_math_expAccess().getMath_expParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleMath_exp();

            state._fsp--;

             after(grammarAccess.getTerminal_math_expAccess().getMath_expParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__2"
    // InternalOnlineElm.g:5112:1: rule__Terminal_math_exp__Group_0__2 : rule__Terminal_math_exp__Group_0__2__Impl ;
    public final void rule__Terminal_math_exp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5116:1: ( rule__Terminal_math_exp__Group_0__2__Impl )
            // InternalOnlineElm.g:5117:2: rule__Terminal_math_exp__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__2"


    // $ANTLR start "rule__Terminal_math_exp__Group_0__2__Impl"
    // InternalOnlineElm.g:5123:1: rule__Terminal_math_exp__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminal_math_exp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5127:1: ( ( ')' ) )
            // InternalOnlineElm.g:5128:1: ( ')' )
            {
            // InternalOnlineElm.g:5128:1: ( ')' )
            // InternalOnlineElm.g:5129:2: ')'
            {
             before(grammarAccess.getTerminal_math_expAccess().getRightParenthesisKeyword_0_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getTerminal_math_expAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_0__2__Impl"


    // $ANTLR start "rule__Terminal_math_exp__Group_1__0"
    // InternalOnlineElm.g:5139:1: rule__Terminal_math_exp__Group_1__0 : rule__Terminal_math_exp__Group_1__0__Impl rule__Terminal_math_exp__Group_1__1 ;
    public final void rule__Terminal_math_exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5143:1: ( rule__Terminal_math_exp__Group_1__0__Impl rule__Terminal_math_exp__Group_1__1 )
            // InternalOnlineElm.g:5144:2: rule__Terminal_math_exp__Group_1__0__Impl rule__Terminal_math_exp__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Terminal_math_exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_1__0"


    // $ANTLR start "rule__Terminal_math_exp__Group_1__0__Impl"
    // InternalOnlineElm.g:5151:1: rule__Terminal_math_exp__Group_1__0__Impl : ( () ) ;
    public final void rule__Terminal_math_exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5155:1: ( ( () ) )
            // InternalOnlineElm.g:5156:1: ( () )
            {
            // InternalOnlineElm.g:5156:1: ( () )
            // InternalOnlineElm.g:5157:2: ()
            {
             before(grammarAccess.getTerminal_math_expAccess().getFloatLiteralAction_1_0()); 
            // InternalOnlineElm.g:5158:2: ()
            // InternalOnlineElm.g:5158:3: 
            {
            }

             after(grammarAccess.getTerminal_math_expAccess().getFloatLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_1__0__Impl"


    // $ANTLR start "rule__Terminal_math_exp__Group_1__1"
    // InternalOnlineElm.g:5166:1: rule__Terminal_math_exp__Group_1__1 : rule__Terminal_math_exp__Group_1__1__Impl ;
    public final void rule__Terminal_math_exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5170:1: ( rule__Terminal_math_exp__Group_1__1__Impl )
            // InternalOnlineElm.g:5171:2: rule__Terminal_math_exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_1__1"


    // $ANTLR start "rule__Terminal_math_exp__Group_1__1__Impl"
    // InternalOnlineElm.g:5177:1: rule__Terminal_math_exp__Group_1__1__Impl : ( ( rule__Terminal_math_exp__ValueAssignment_1_1 ) ) ;
    public final void rule__Terminal_math_exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5181:1: ( ( ( rule__Terminal_math_exp__ValueAssignment_1_1 ) ) )
            // InternalOnlineElm.g:5182:1: ( ( rule__Terminal_math_exp__ValueAssignment_1_1 ) )
            {
            // InternalOnlineElm.g:5182:1: ( ( rule__Terminal_math_exp__ValueAssignment_1_1 ) )
            // InternalOnlineElm.g:5183:2: ( rule__Terminal_math_exp__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminal_math_expAccess().getValueAssignment_1_1()); 
            // InternalOnlineElm.g:5184:2: ( rule__Terminal_math_exp__ValueAssignment_1_1 )
            // InternalOnlineElm.g:5184:3: rule__Terminal_math_exp__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_math_exp__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminal_math_expAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__Group_1__1__Impl"


    // $ANTLR start "rule__Circle__Group__0"
    // InternalOnlineElm.g:5193:1: rule__Circle__Group__0 : rule__Circle__Group__0__Impl rule__Circle__Group__1 ;
    public final void rule__Circle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5197:1: ( rule__Circle__Group__0__Impl rule__Circle__Group__1 )
            // InternalOnlineElm.g:5198:2: rule__Circle__Group__0__Impl rule__Circle__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Circle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__0"


    // $ANTLR start "rule__Circle__Group__0__Impl"
    // InternalOnlineElm.g:5205:1: rule__Circle__Group__0__Impl : ( ( rule__Circle__NameAssignment_0 ) ) ;
    public final void rule__Circle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5209:1: ( ( ( rule__Circle__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5210:1: ( ( rule__Circle__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5210:1: ( ( rule__Circle__NameAssignment_0 ) )
            // InternalOnlineElm.g:5211:2: ( rule__Circle__NameAssignment_0 )
            {
             before(grammarAccess.getCircleAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5212:2: ( rule__Circle__NameAssignment_0 )
            // InternalOnlineElm.g:5212:3: rule__Circle__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Circle__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__0__Impl"


    // $ANTLR start "rule__Circle__Group__1"
    // InternalOnlineElm.g:5220:1: rule__Circle__Group__1 : rule__Circle__Group__1__Impl ;
    public final void rule__Circle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5224:1: ( rule__Circle__Group__1__Impl )
            // InternalOnlineElm.g:5225:2: rule__Circle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__1"


    // $ANTLR start "rule__Circle__Group__1__Impl"
    // InternalOnlineElm.g:5231:1: rule__Circle__Group__1__Impl : ( ( rule__Circle__RadiusAssignment_1 ) ) ;
    public final void rule__Circle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5235:1: ( ( ( rule__Circle__RadiusAssignment_1 ) ) )
            // InternalOnlineElm.g:5236:1: ( ( rule__Circle__RadiusAssignment_1 ) )
            {
            // InternalOnlineElm.g:5236:1: ( ( rule__Circle__RadiusAssignment_1 ) )
            // InternalOnlineElm.g:5237:2: ( rule__Circle__RadiusAssignment_1 )
            {
             before(grammarAccess.getCircleAccess().getRadiusAssignment_1()); 
            // InternalOnlineElm.g:5238:2: ( rule__Circle__RadiusAssignment_1 )
            // InternalOnlineElm.g:5238:3: rule__Circle__RadiusAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Circle__RadiusAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getRadiusAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__1__Impl"


    // $ANTLR start "rule__Rect__Group__0"
    // InternalOnlineElm.g:5247:1: rule__Rect__Group__0 : rule__Rect__Group__0__Impl rule__Rect__Group__1 ;
    public final void rule__Rect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5251:1: ( rule__Rect__Group__0__Impl rule__Rect__Group__1 )
            // InternalOnlineElm.g:5252:2: rule__Rect__Group__0__Impl rule__Rect__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Rect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__0"


    // $ANTLR start "rule__Rect__Group__0__Impl"
    // InternalOnlineElm.g:5259:1: rule__Rect__Group__0__Impl : ( ( rule__Rect__NameAssignment_0 ) ) ;
    public final void rule__Rect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5263:1: ( ( ( rule__Rect__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5264:1: ( ( rule__Rect__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5264:1: ( ( rule__Rect__NameAssignment_0 ) )
            // InternalOnlineElm.g:5265:2: ( rule__Rect__NameAssignment_0 )
            {
             before(grammarAccess.getRectAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5266:2: ( rule__Rect__NameAssignment_0 )
            // InternalOnlineElm.g:5266:3: rule__Rect__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rect__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__0__Impl"


    // $ANTLR start "rule__Rect__Group__1"
    // InternalOnlineElm.g:5274:1: rule__Rect__Group__1 : rule__Rect__Group__1__Impl rule__Rect__Group__2 ;
    public final void rule__Rect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5278:1: ( rule__Rect__Group__1__Impl rule__Rect__Group__2 )
            // InternalOnlineElm.g:5279:2: rule__Rect__Group__1__Impl rule__Rect__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Rect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__1"


    // $ANTLR start "rule__Rect__Group__1__Impl"
    // InternalOnlineElm.g:5286:1: rule__Rect__Group__1__Impl : ( ( rule__Rect__WidthAssignment_1 ) ) ;
    public final void rule__Rect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5290:1: ( ( ( rule__Rect__WidthAssignment_1 ) ) )
            // InternalOnlineElm.g:5291:1: ( ( rule__Rect__WidthAssignment_1 ) )
            {
            // InternalOnlineElm.g:5291:1: ( ( rule__Rect__WidthAssignment_1 ) )
            // InternalOnlineElm.g:5292:2: ( rule__Rect__WidthAssignment_1 )
            {
             before(grammarAccess.getRectAccess().getWidthAssignment_1()); 
            // InternalOnlineElm.g:5293:2: ( rule__Rect__WidthAssignment_1 )
            // InternalOnlineElm.g:5293:3: rule__Rect__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rect__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__1__Impl"


    // $ANTLR start "rule__Rect__Group__2"
    // InternalOnlineElm.g:5301:1: rule__Rect__Group__2 : rule__Rect__Group__2__Impl ;
    public final void rule__Rect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5305:1: ( rule__Rect__Group__2__Impl )
            // InternalOnlineElm.g:5306:2: rule__Rect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__2"


    // $ANTLR start "rule__Rect__Group__2__Impl"
    // InternalOnlineElm.g:5312:1: rule__Rect__Group__2__Impl : ( ( rule__Rect__HeightAssignment_2 ) ) ;
    public final void rule__Rect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5316:1: ( ( ( rule__Rect__HeightAssignment_2 ) ) )
            // InternalOnlineElm.g:5317:1: ( ( rule__Rect__HeightAssignment_2 ) )
            {
            // InternalOnlineElm.g:5317:1: ( ( rule__Rect__HeightAssignment_2 ) )
            // InternalOnlineElm.g:5318:2: ( rule__Rect__HeightAssignment_2 )
            {
             before(grammarAccess.getRectAccess().getHeightAssignment_2()); 
            // InternalOnlineElm.g:5319:2: ( rule__Rect__HeightAssignment_2 )
            // InternalOnlineElm.g:5319:3: rule__Rect__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rect__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getHeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__Group__2__Impl"


    // $ANTLR start "rule__Square__Group__0"
    // InternalOnlineElm.g:5328:1: rule__Square__Group__0 : rule__Square__Group__0__Impl rule__Square__Group__1 ;
    public final void rule__Square__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5332:1: ( rule__Square__Group__0__Impl rule__Square__Group__1 )
            // InternalOnlineElm.g:5333:2: rule__Square__Group__0__Impl rule__Square__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Square__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Square__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__0"


    // $ANTLR start "rule__Square__Group__0__Impl"
    // InternalOnlineElm.g:5340:1: rule__Square__Group__0__Impl : ( ( rule__Square__NameAssignment_0 ) ) ;
    public final void rule__Square__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5344:1: ( ( ( rule__Square__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5345:1: ( ( rule__Square__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5345:1: ( ( rule__Square__NameAssignment_0 ) )
            // InternalOnlineElm.g:5346:2: ( rule__Square__NameAssignment_0 )
            {
             before(grammarAccess.getSquareAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5347:2: ( rule__Square__NameAssignment_0 )
            // InternalOnlineElm.g:5347:3: rule__Square__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Square__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSquareAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__0__Impl"


    // $ANTLR start "rule__Square__Group__1"
    // InternalOnlineElm.g:5355:1: rule__Square__Group__1 : rule__Square__Group__1__Impl ;
    public final void rule__Square__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5359:1: ( rule__Square__Group__1__Impl )
            // InternalOnlineElm.g:5360:2: rule__Square__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Square__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__1"


    // $ANTLR start "rule__Square__Group__1__Impl"
    // InternalOnlineElm.g:5366:1: rule__Square__Group__1__Impl : ( ( rule__Square__SideAssignment_1 ) ) ;
    public final void rule__Square__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5370:1: ( ( ( rule__Square__SideAssignment_1 ) ) )
            // InternalOnlineElm.g:5371:1: ( ( rule__Square__SideAssignment_1 ) )
            {
            // InternalOnlineElm.g:5371:1: ( ( rule__Square__SideAssignment_1 ) )
            // InternalOnlineElm.g:5372:2: ( rule__Square__SideAssignment_1 )
            {
             before(grammarAccess.getSquareAccess().getSideAssignment_1()); 
            // InternalOnlineElm.g:5373:2: ( rule__Square__SideAssignment_1 )
            // InternalOnlineElm.g:5373:3: rule__Square__SideAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Square__SideAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSquareAccess().getSideAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__1__Impl"


    // $ANTLR start "rule__RoundedRect__Group__0"
    // InternalOnlineElm.g:5382:1: rule__RoundedRect__Group__0 : rule__RoundedRect__Group__0__Impl rule__RoundedRect__Group__1 ;
    public final void rule__RoundedRect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5386:1: ( rule__RoundedRect__Group__0__Impl rule__RoundedRect__Group__1 )
            // InternalOnlineElm.g:5387:2: rule__RoundedRect__Group__0__Impl rule__RoundedRect__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RoundedRect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundedRect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__0"


    // $ANTLR start "rule__RoundedRect__Group__0__Impl"
    // InternalOnlineElm.g:5394:1: rule__RoundedRect__Group__0__Impl : ( ( rule__RoundedRect__NameAssignment_0 ) ) ;
    public final void rule__RoundedRect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5398:1: ( ( ( rule__RoundedRect__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5399:1: ( ( rule__RoundedRect__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5399:1: ( ( rule__RoundedRect__NameAssignment_0 ) )
            // InternalOnlineElm.g:5400:2: ( rule__RoundedRect__NameAssignment_0 )
            {
             before(grammarAccess.getRoundedRectAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5401:2: ( rule__RoundedRect__NameAssignment_0 )
            // InternalOnlineElm.g:5401:3: rule__RoundedRect__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoundedRectAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__0__Impl"


    // $ANTLR start "rule__RoundedRect__Group__1"
    // InternalOnlineElm.g:5409:1: rule__RoundedRect__Group__1 : rule__RoundedRect__Group__1__Impl rule__RoundedRect__Group__2 ;
    public final void rule__RoundedRect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5413:1: ( rule__RoundedRect__Group__1__Impl rule__RoundedRect__Group__2 )
            // InternalOnlineElm.g:5414:2: rule__RoundedRect__Group__1__Impl rule__RoundedRect__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__RoundedRect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundedRect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__1"


    // $ANTLR start "rule__RoundedRect__Group__1__Impl"
    // InternalOnlineElm.g:5421:1: rule__RoundedRect__Group__1__Impl : ( ( rule__RoundedRect__WidthAssignment_1 ) ) ;
    public final void rule__RoundedRect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5425:1: ( ( ( rule__RoundedRect__WidthAssignment_1 ) ) )
            // InternalOnlineElm.g:5426:1: ( ( rule__RoundedRect__WidthAssignment_1 ) )
            {
            // InternalOnlineElm.g:5426:1: ( ( rule__RoundedRect__WidthAssignment_1 ) )
            // InternalOnlineElm.g:5427:2: ( rule__RoundedRect__WidthAssignment_1 )
            {
             before(grammarAccess.getRoundedRectAccess().getWidthAssignment_1()); 
            // InternalOnlineElm.g:5428:2: ( rule__RoundedRect__WidthAssignment_1 )
            // InternalOnlineElm.g:5428:3: rule__RoundedRect__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundedRectAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__1__Impl"


    // $ANTLR start "rule__RoundedRect__Group__2"
    // InternalOnlineElm.g:5436:1: rule__RoundedRect__Group__2 : rule__RoundedRect__Group__2__Impl rule__RoundedRect__Group__3 ;
    public final void rule__RoundedRect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5440:1: ( rule__RoundedRect__Group__2__Impl rule__RoundedRect__Group__3 )
            // InternalOnlineElm.g:5441:2: rule__RoundedRect__Group__2__Impl rule__RoundedRect__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RoundedRect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundedRect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__2"


    // $ANTLR start "rule__RoundedRect__Group__2__Impl"
    // InternalOnlineElm.g:5448:1: rule__RoundedRect__Group__2__Impl : ( ( rule__RoundedRect__HeightAssignment_2 ) ) ;
    public final void rule__RoundedRect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5452:1: ( ( ( rule__RoundedRect__HeightAssignment_2 ) ) )
            // InternalOnlineElm.g:5453:1: ( ( rule__RoundedRect__HeightAssignment_2 ) )
            {
            // InternalOnlineElm.g:5453:1: ( ( rule__RoundedRect__HeightAssignment_2 ) )
            // InternalOnlineElm.g:5454:2: ( rule__RoundedRect__HeightAssignment_2 )
            {
             before(grammarAccess.getRoundedRectAccess().getHeightAssignment_2()); 
            // InternalOnlineElm.g:5455:2: ( rule__RoundedRect__HeightAssignment_2 )
            // InternalOnlineElm.g:5455:3: rule__RoundedRect__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoundedRectAccess().getHeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__2__Impl"


    // $ANTLR start "rule__RoundedRect__Group__3"
    // InternalOnlineElm.g:5463:1: rule__RoundedRect__Group__3 : rule__RoundedRect__Group__3__Impl ;
    public final void rule__RoundedRect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5467:1: ( rule__RoundedRect__Group__3__Impl )
            // InternalOnlineElm.g:5468:2: rule__RoundedRect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__3"


    // $ANTLR start "rule__RoundedRect__Group__3__Impl"
    // InternalOnlineElm.g:5474:1: rule__RoundedRect__Group__3__Impl : ( ( rule__RoundedRect__Corner_radiusAssignment_3 ) ) ;
    public final void rule__RoundedRect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5478:1: ( ( ( rule__RoundedRect__Corner_radiusAssignment_3 ) ) )
            // InternalOnlineElm.g:5479:1: ( ( rule__RoundedRect__Corner_radiusAssignment_3 ) )
            {
            // InternalOnlineElm.g:5479:1: ( ( rule__RoundedRect__Corner_radiusAssignment_3 ) )
            // InternalOnlineElm.g:5480:2: ( rule__RoundedRect__Corner_radiusAssignment_3 )
            {
             before(grammarAccess.getRoundedRectAccess().getCorner_radiusAssignment_3()); 
            // InternalOnlineElm.g:5481:2: ( rule__RoundedRect__Corner_radiusAssignment_3 )
            // InternalOnlineElm.g:5481:3: rule__RoundedRect__Corner_radiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoundedRect__Corner_radiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoundedRectAccess().getCorner_radiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Group__3__Impl"


    // $ANTLR start "rule__Oval__Group__0"
    // InternalOnlineElm.g:5490:1: rule__Oval__Group__0 : rule__Oval__Group__0__Impl rule__Oval__Group__1 ;
    public final void rule__Oval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5494:1: ( rule__Oval__Group__0__Impl rule__Oval__Group__1 )
            // InternalOnlineElm.g:5495:2: rule__Oval__Group__0__Impl rule__Oval__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Oval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__0"


    // $ANTLR start "rule__Oval__Group__0__Impl"
    // InternalOnlineElm.g:5502:1: rule__Oval__Group__0__Impl : ( ( rule__Oval__NameAssignment_0 ) ) ;
    public final void rule__Oval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5506:1: ( ( ( rule__Oval__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5507:1: ( ( rule__Oval__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5507:1: ( ( rule__Oval__NameAssignment_0 ) )
            // InternalOnlineElm.g:5508:2: ( rule__Oval__NameAssignment_0 )
            {
             before(grammarAccess.getOvalAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5509:2: ( rule__Oval__NameAssignment_0 )
            // InternalOnlineElm.g:5509:3: rule__Oval__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Oval__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__0__Impl"


    // $ANTLR start "rule__Oval__Group__1"
    // InternalOnlineElm.g:5517:1: rule__Oval__Group__1 : rule__Oval__Group__1__Impl rule__Oval__Group__2 ;
    public final void rule__Oval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5521:1: ( rule__Oval__Group__1__Impl rule__Oval__Group__2 )
            // InternalOnlineElm.g:5522:2: rule__Oval__Group__1__Impl rule__Oval__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Oval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__1"


    // $ANTLR start "rule__Oval__Group__1__Impl"
    // InternalOnlineElm.g:5529:1: rule__Oval__Group__1__Impl : ( ( rule__Oval__WidthAssignment_1 ) ) ;
    public final void rule__Oval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5533:1: ( ( ( rule__Oval__WidthAssignment_1 ) ) )
            // InternalOnlineElm.g:5534:1: ( ( rule__Oval__WidthAssignment_1 ) )
            {
            // InternalOnlineElm.g:5534:1: ( ( rule__Oval__WidthAssignment_1 ) )
            // InternalOnlineElm.g:5535:2: ( rule__Oval__WidthAssignment_1 )
            {
             before(grammarAccess.getOvalAccess().getWidthAssignment_1()); 
            // InternalOnlineElm.g:5536:2: ( rule__Oval__WidthAssignment_1 )
            // InternalOnlineElm.g:5536:3: rule__Oval__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Oval__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__1__Impl"


    // $ANTLR start "rule__Oval__Group__2"
    // InternalOnlineElm.g:5544:1: rule__Oval__Group__2 : rule__Oval__Group__2__Impl ;
    public final void rule__Oval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5548:1: ( rule__Oval__Group__2__Impl )
            // InternalOnlineElm.g:5549:2: rule__Oval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oval__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__2"


    // $ANTLR start "rule__Oval__Group__2__Impl"
    // InternalOnlineElm.g:5555:1: rule__Oval__Group__2__Impl : ( ( rule__Oval__HeightAssignment_2 ) ) ;
    public final void rule__Oval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5559:1: ( ( ( rule__Oval__HeightAssignment_2 ) ) )
            // InternalOnlineElm.g:5560:1: ( ( rule__Oval__HeightAssignment_2 ) )
            {
            // InternalOnlineElm.g:5560:1: ( ( rule__Oval__HeightAssignment_2 ) )
            // InternalOnlineElm.g:5561:2: ( rule__Oval__HeightAssignment_2 )
            {
             before(grammarAccess.getOvalAccess().getHeightAssignment_2()); 
            // InternalOnlineElm.g:5562:2: ( rule__Oval__HeightAssignment_2 )
            // InternalOnlineElm.g:5562:3: rule__Oval__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Oval__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getHeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__Group__2__Impl"


    // $ANTLR start "rule__Ngon__Group__0"
    // InternalOnlineElm.g:5571:1: rule__Ngon__Group__0 : rule__Ngon__Group__0__Impl rule__Ngon__Group__1 ;
    public final void rule__Ngon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5575:1: ( rule__Ngon__Group__0__Impl rule__Ngon__Group__1 )
            // InternalOnlineElm.g:5576:2: rule__Ngon__Group__0__Impl rule__Ngon__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Ngon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ngon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__0"


    // $ANTLR start "rule__Ngon__Group__0__Impl"
    // InternalOnlineElm.g:5583:1: rule__Ngon__Group__0__Impl : ( ( rule__Ngon__NameAssignment_0 ) ) ;
    public final void rule__Ngon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5587:1: ( ( ( rule__Ngon__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5588:1: ( ( rule__Ngon__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5588:1: ( ( rule__Ngon__NameAssignment_0 ) )
            // InternalOnlineElm.g:5589:2: ( rule__Ngon__NameAssignment_0 )
            {
             before(grammarAccess.getNgonAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5590:2: ( rule__Ngon__NameAssignment_0 )
            // InternalOnlineElm.g:5590:3: rule__Ngon__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ngon__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNgonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__0__Impl"


    // $ANTLR start "rule__Ngon__Group__1"
    // InternalOnlineElm.g:5598:1: rule__Ngon__Group__1 : rule__Ngon__Group__1__Impl rule__Ngon__Group__2 ;
    public final void rule__Ngon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5602:1: ( rule__Ngon__Group__1__Impl rule__Ngon__Group__2 )
            // InternalOnlineElm.g:5603:2: rule__Ngon__Group__1__Impl rule__Ngon__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Ngon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ngon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__1"


    // $ANTLR start "rule__Ngon__Group__1__Impl"
    // InternalOnlineElm.g:5610:1: rule__Ngon__Group__1__Impl : ( ( rule__Ngon__Sides_numAssignment_1 ) ) ;
    public final void rule__Ngon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5614:1: ( ( ( rule__Ngon__Sides_numAssignment_1 ) ) )
            // InternalOnlineElm.g:5615:1: ( ( rule__Ngon__Sides_numAssignment_1 ) )
            {
            // InternalOnlineElm.g:5615:1: ( ( rule__Ngon__Sides_numAssignment_1 ) )
            // InternalOnlineElm.g:5616:2: ( rule__Ngon__Sides_numAssignment_1 )
            {
             before(grammarAccess.getNgonAccess().getSides_numAssignment_1()); 
            // InternalOnlineElm.g:5617:2: ( rule__Ngon__Sides_numAssignment_1 )
            // InternalOnlineElm.g:5617:3: rule__Ngon__Sides_numAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ngon__Sides_numAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNgonAccess().getSides_numAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__1__Impl"


    // $ANTLR start "rule__Ngon__Group__2"
    // InternalOnlineElm.g:5625:1: rule__Ngon__Group__2 : rule__Ngon__Group__2__Impl ;
    public final void rule__Ngon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5629:1: ( rule__Ngon__Group__2__Impl )
            // InternalOnlineElm.g:5630:2: rule__Ngon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ngon__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__2"


    // $ANTLR start "rule__Ngon__Group__2__Impl"
    // InternalOnlineElm.g:5636:1: rule__Ngon__Group__2__Impl : ( ( rule__Ngon__RadiusAssignment_2 ) ) ;
    public final void rule__Ngon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5640:1: ( ( ( rule__Ngon__RadiusAssignment_2 ) ) )
            // InternalOnlineElm.g:5641:1: ( ( rule__Ngon__RadiusAssignment_2 ) )
            {
            // InternalOnlineElm.g:5641:1: ( ( rule__Ngon__RadiusAssignment_2 ) )
            // InternalOnlineElm.g:5642:2: ( rule__Ngon__RadiusAssignment_2 )
            {
             before(grammarAccess.getNgonAccess().getRadiusAssignment_2()); 
            // InternalOnlineElm.g:5643:2: ( rule__Ngon__RadiusAssignment_2 )
            // InternalOnlineElm.g:5643:3: rule__Ngon__RadiusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ngon__RadiusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNgonAccess().getRadiusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Group__2__Impl"


    // $ANTLR start "rule__Wedge__Group__0"
    // InternalOnlineElm.g:5652:1: rule__Wedge__Group__0 : rule__Wedge__Group__0__Impl rule__Wedge__Group__1 ;
    public final void rule__Wedge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5656:1: ( rule__Wedge__Group__0__Impl rule__Wedge__Group__1 )
            // InternalOnlineElm.g:5657:2: rule__Wedge__Group__0__Impl rule__Wedge__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Wedge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wedge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__0"


    // $ANTLR start "rule__Wedge__Group__0__Impl"
    // InternalOnlineElm.g:5664:1: rule__Wedge__Group__0__Impl : ( ( rule__Wedge__NameAssignment_0 ) ) ;
    public final void rule__Wedge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5668:1: ( ( ( rule__Wedge__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5669:1: ( ( rule__Wedge__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5669:1: ( ( rule__Wedge__NameAssignment_0 ) )
            // InternalOnlineElm.g:5670:2: ( rule__Wedge__NameAssignment_0 )
            {
             before(grammarAccess.getWedgeAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5671:2: ( rule__Wedge__NameAssignment_0 )
            // InternalOnlineElm.g:5671:3: rule__Wedge__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Wedge__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWedgeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__0__Impl"


    // $ANTLR start "rule__Wedge__Group__1"
    // InternalOnlineElm.g:5679:1: rule__Wedge__Group__1 : rule__Wedge__Group__1__Impl rule__Wedge__Group__2 ;
    public final void rule__Wedge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5683:1: ( rule__Wedge__Group__1__Impl rule__Wedge__Group__2 )
            // InternalOnlineElm.g:5684:2: rule__Wedge__Group__1__Impl rule__Wedge__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Wedge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wedge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__1"


    // $ANTLR start "rule__Wedge__Group__1__Impl"
    // InternalOnlineElm.g:5691:1: rule__Wedge__Group__1__Impl : ( ( rule__Wedge__RadiusAssignment_1 ) ) ;
    public final void rule__Wedge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5695:1: ( ( ( rule__Wedge__RadiusAssignment_1 ) ) )
            // InternalOnlineElm.g:5696:1: ( ( rule__Wedge__RadiusAssignment_1 ) )
            {
            // InternalOnlineElm.g:5696:1: ( ( rule__Wedge__RadiusAssignment_1 ) )
            // InternalOnlineElm.g:5697:2: ( rule__Wedge__RadiusAssignment_1 )
            {
             before(grammarAccess.getWedgeAccess().getRadiusAssignment_1()); 
            // InternalOnlineElm.g:5698:2: ( rule__Wedge__RadiusAssignment_1 )
            // InternalOnlineElm.g:5698:3: rule__Wedge__RadiusAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wedge__RadiusAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWedgeAccess().getRadiusAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__1__Impl"


    // $ANTLR start "rule__Wedge__Group__2"
    // InternalOnlineElm.g:5706:1: rule__Wedge__Group__2 : rule__Wedge__Group__2__Impl ;
    public final void rule__Wedge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5710:1: ( rule__Wedge__Group__2__Impl )
            // InternalOnlineElm.g:5711:2: rule__Wedge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wedge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__2"


    // $ANTLR start "rule__Wedge__Group__2__Impl"
    // InternalOnlineElm.g:5717:1: rule__Wedge__Group__2__Impl : ( ( rule__Wedge__FractionAssignment_2 ) ) ;
    public final void rule__Wedge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5721:1: ( ( ( rule__Wedge__FractionAssignment_2 ) ) )
            // InternalOnlineElm.g:5722:1: ( ( rule__Wedge__FractionAssignment_2 ) )
            {
            // InternalOnlineElm.g:5722:1: ( ( rule__Wedge__FractionAssignment_2 ) )
            // InternalOnlineElm.g:5723:2: ( rule__Wedge__FractionAssignment_2 )
            {
             before(grammarAccess.getWedgeAccess().getFractionAssignment_2()); 
            // InternalOnlineElm.g:5724:2: ( rule__Wedge__FractionAssignment_2 )
            // InternalOnlineElm.g:5724:3: rule__Wedge__FractionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wedge__FractionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWedgeAccess().getFractionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__Group__2__Impl"


    // $ANTLR start "rule__Polygon__Group__0"
    // InternalOnlineElm.g:5733:1: rule__Polygon__Group__0 : rule__Polygon__Group__0__Impl rule__Polygon__Group__1 ;
    public final void rule__Polygon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5737:1: ( rule__Polygon__Group__0__Impl rule__Polygon__Group__1 )
            // InternalOnlineElm.g:5738:2: rule__Polygon__Group__0__Impl rule__Polygon__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Polygon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polygon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__0"


    // $ANTLR start "rule__Polygon__Group__0__Impl"
    // InternalOnlineElm.g:5745:1: rule__Polygon__Group__0__Impl : ( ( rule__Polygon__NameAssignment_0 ) ) ;
    public final void rule__Polygon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5749:1: ( ( ( rule__Polygon__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:5750:1: ( ( rule__Polygon__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:5750:1: ( ( rule__Polygon__NameAssignment_0 ) )
            // InternalOnlineElm.g:5751:2: ( rule__Polygon__NameAssignment_0 )
            {
             before(grammarAccess.getPolygonAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:5752:2: ( rule__Polygon__NameAssignment_0 )
            // InternalOnlineElm.g:5752:3: rule__Polygon__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPolygonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__0__Impl"


    // $ANTLR start "rule__Polygon__Group__1"
    // InternalOnlineElm.g:5760:1: rule__Polygon__Group__1 : rule__Polygon__Group__1__Impl rule__Polygon__Group__2 ;
    public final void rule__Polygon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5764:1: ( rule__Polygon__Group__1__Impl rule__Polygon__Group__2 )
            // InternalOnlineElm.g:5765:2: rule__Polygon__Group__1__Impl rule__Polygon__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Polygon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polygon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__1"


    // $ANTLR start "rule__Polygon__Group__1__Impl"
    // InternalOnlineElm.g:5772:1: rule__Polygon__Group__1__Impl : ( '[' ) ;
    public final void rule__Polygon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5776:1: ( ( '[' ) )
            // InternalOnlineElm.g:5777:1: ( '[' )
            {
            // InternalOnlineElm.g:5777:1: ( '[' )
            // InternalOnlineElm.g:5778:2: '['
            {
             before(grammarAccess.getPolygonAccess().getLeftSquareBracketKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPolygonAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__1__Impl"


    // $ANTLR start "rule__Polygon__Group__2"
    // InternalOnlineElm.g:5787:1: rule__Polygon__Group__2 : rule__Polygon__Group__2__Impl rule__Polygon__Group__3 ;
    public final void rule__Polygon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5791:1: ( rule__Polygon__Group__2__Impl rule__Polygon__Group__3 )
            // InternalOnlineElm.g:5792:2: rule__Polygon__Group__2__Impl rule__Polygon__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Polygon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polygon__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__2"


    // $ANTLR start "rule__Polygon__Group__2__Impl"
    // InternalOnlineElm.g:5799:1: rule__Polygon__Group__2__Impl : ( ( rule__Polygon__Point1Assignment_2 ) ) ;
    public final void rule__Polygon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5803:1: ( ( ( rule__Polygon__Point1Assignment_2 ) ) )
            // InternalOnlineElm.g:5804:1: ( ( rule__Polygon__Point1Assignment_2 ) )
            {
            // InternalOnlineElm.g:5804:1: ( ( rule__Polygon__Point1Assignment_2 ) )
            // InternalOnlineElm.g:5805:2: ( rule__Polygon__Point1Assignment_2 )
            {
             before(grammarAccess.getPolygonAccess().getPoint1Assignment_2()); 
            // InternalOnlineElm.g:5806:2: ( rule__Polygon__Point1Assignment_2 )
            // InternalOnlineElm.g:5806:3: rule__Polygon__Point1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__Point1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolygonAccess().getPoint1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__2__Impl"


    // $ANTLR start "rule__Polygon__Group__3"
    // InternalOnlineElm.g:5814:1: rule__Polygon__Group__3 : rule__Polygon__Group__3__Impl rule__Polygon__Group__4 ;
    public final void rule__Polygon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5818:1: ( rule__Polygon__Group__3__Impl rule__Polygon__Group__4 )
            // InternalOnlineElm.g:5819:2: rule__Polygon__Group__3__Impl rule__Polygon__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Polygon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polygon__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__3"


    // $ANTLR start "rule__Polygon__Group__3__Impl"
    // InternalOnlineElm.g:5826:1: rule__Polygon__Group__3__Impl : ( ( rule__Polygon__Group_3__0 )* ) ;
    public final void rule__Polygon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5830:1: ( ( ( rule__Polygon__Group_3__0 )* ) )
            // InternalOnlineElm.g:5831:1: ( ( rule__Polygon__Group_3__0 )* )
            {
            // InternalOnlineElm.g:5831:1: ( ( rule__Polygon__Group_3__0 )* )
            // InternalOnlineElm.g:5832:2: ( rule__Polygon__Group_3__0 )*
            {
             before(grammarAccess.getPolygonAccess().getGroup_3()); 
            // InternalOnlineElm.g:5833:2: ( rule__Polygon__Group_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==67) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOnlineElm.g:5833:3: rule__Polygon__Group_3__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Polygon__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getPolygonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__3__Impl"


    // $ANTLR start "rule__Polygon__Group__4"
    // InternalOnlineElm.g:5841:1: rule__Polygon__Group__4 : rule__Polygon__Group__4__Impl ;
    public final void rule__Polygon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5845:1: ( rule__Polygon__Group__4__Impl )
            // InternalOnlineElm.g:5846:2: rule__Polygon__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__4"


    // $ANTLR start "rule__Polygon__Group__4__Impl"
    // InternalOnlineElm.g:5852:1: rule__Polygon__Group__4__Impl : ( ']' ) ;
    public final void rule__Polygon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5856:1: ( ( ']' ) )
            // InternalOnlineElm.g:5857:1: ( ']' )
            {
            // InternalOnlineElm.g:5857:1: ( ']' )
            // InternalOnlineElm.g:5858:2: ']'
            {
             before(grammarAccess.getPolygonAccess().getRightSquareBracketKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPolygonAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group__4__Impl"


    // $ANTLR start "rule__Polygon__Group_3__0"
    // InternalOnlineElm.g:5868:1: rule__Polygon__Group_3__0 : rule__Polygon__Group_3__0__Impl rule__Polygon__Group_3__1 ;
    public final void rule__Polygon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5872:1: ( rule__Polygon__Group_3__0__Impl rule__Polygon__Group_3__1 )
            // InternalOnlineElm.g:5873:2: rule__Polygon__Group_3__0__Impl rule__Polygon__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__Polygon__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polygon__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group_3__0"


    // $ANTLR start "rule__Polygon__Group_3__0__Impl"
    // InternalOnlineElm.g:5880:1: rule__Polygon__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Polygon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5884:1: ( ( ',' ) )
            // InternalOnlineElm.g:5885:1: ( ',' )
            {
            // InternalOnlineElm.g:5885:1: ( ',' )
            // InternalOnlineElm.g:5886:2: ','
            {
             before(grammarAccess.getPolygonAccess().getCommaKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPolygonAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group_3__0__Impl"


    // $ANTLR start "rule__Polygon__Group_3__1"
    // InternalOnlineElm.g:5895:1: rule__Polygon__Group_3__1 : rule__Polygon__Group_3__1__Impl ;
    public final void rule__Polygon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5899:1: ( rule__Polygon__Group_3__1__Impl )
            // InternalOnlineElm.g:5900:2: rule__Polygon__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group_3__1"


    // $ANTLR start "rule__Polygon__Group_3__1__Impl"
    // InternalOnlineElm.g:5906:1: rule__Polygon__Group_3__1__Impl : ( ( rule__Polygon__PointsAssignment_3_1 ) ) ;
    public final void rule__Polygon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5910:1: ( ( ( rule__Polygon__PointsAssignment_3_1 ) ) )
            // InternalOnlineElm.g:5911:1: ( ( rule__Polygon__PointsAssignment_3_1 ) )
            {
            // InternalOnlineElm.g:5911:1: ( ( rule__Polygon__PointsAssignment_3_1 ) )
            // InternalOnlineElm.g:5912:2: ( rule__Polygon__PointsAssignment_3_1 )
            {
             before(grammarAccess.getPolygonAccess().getPointsAssignment_3_1()); 
            // InternalOnlineElm.g:5913:2: ( rule__Polygon__PointsAssignment_3_1 )
            // InternalOnlineElm.g:5913:3: rule__Polygon__PointsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Polygon__PointsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPolygonAccess().getPointsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Group_3__1__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalOnlineElm.g:5922:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5926:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalOnlineElm.g:5927:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalOnlineElm.g:5934:1: rule__Point__Group__0__Impl : ( '(' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5938:1: ( ( '(' ) )
            // InternalOnlineElm.g:5939:1: ( '(' )
            {
            // InternalOnlineElm.g:5939:1: ( '(' )
            // InternalOnlineElm.g:5940:2: '('
            {
             before(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalOnlineElm.g:5949:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5953:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalOnlineElm.g:5954:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalOnlineElm.g:5961:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5965:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalOnlineElm.g:5966:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalOnlineElm.g:5966:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalOnlineElm.g:5967:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalOnlineElm.g:5968:2: ( rule__Point__XAssignment_1 )
            // InternalOnlineElm.g:5968:3: rule__Point__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalOnlineElm.g:5976:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5980:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalOnlineElm.g:5981:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalOnlineElm.g:5988:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:5992:1: ( ( ',' ) )
            // InternalOnlineElm.g:5993:1: ( ',' )
            {
            // InternalOnlineElm.g:5993:1: ( ',' )
            // InternalOnlineElm.g:5994:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalOnlineElm.g:6003:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6007:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalOnlineElm.g:6008:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalOnlineElm.g:6015:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6019:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalOnlineElm.g:6020:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalOnlineElm.g:6020:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalOnlineElm.g:6021:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalOnlineElm.g:6022:2: ( rule__Point__YAssignment_3 )
            // InternalOnlineElm.g:6022:3: rule__Point__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalOnlineElm.g:6030:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6034:1: ( rule__Point__Group__4__Impl )
            // InternalOnlineElm.g:6035:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalOnlineElm.g:6041:1: rule__Point__Group__4__Impl : ( ')' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6045:1: ( ( ')' ) )
            // InternalOnlineElm.g:6046:1: ( ')' )
            {
            // InternalOnlineElm.g:6046:1: ( ')' )
            // InternalOnlineElm.g:6047:2: ')'
            {
             before(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalOnlineElm.g:6057:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6061:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalOnlineElm.g:6062:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalOnlineElm.g:6069:1: rule__Text__Group__0__Impl : ( ( rule__Text__NameAssignment_0 ) ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6073:1: ( ( ( rule__Text__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6074:1: ( ( rule__Text__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6074:1: ( ( rule__Text__NameAssignment_0 ) )
            // InternalOnlineElm.g:6075:2: ( rule__Text__NameAssignment_0 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6076:2: ( rule__Text__NameAssignment_0 )
            // InternalOnlineElm.g:6076:3: rule__Text__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Text__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalOnlineElm.g:6084:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6088:1: ( rule__Text__Group__1__Impl )
            // InternalOnlineElm.g:6089:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalOnlineElm.g:6095:1: rule__Text__Group__1__Impl : ( ( rule__Text__Alternatives_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6099:1: ( ( ( rule__Text__Alternatives_1 ) ) )
            // InternalOnlineElm.g:6100:1: ( ( rule__Text__Alternatives_1 ) )
            {
            // InternalOnlineElm.g:6100:1: ( ( rule__Text__Alternatives_1 ) )
            // InternalOnlineElm.g:6101:2: ( rule__Text__Alternatives_1 )
            {
             before(grammarAccess.getTextAccess().getAlternatives_1()); 
            // InternalOnlineElm.g:6102:2: ( rule__Text__Alternatives_1 )
            // InternalOnlineElm.g:6102:3: rule__Text__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Draw__Group__0"
    // InternalOnlineElm.g:6111:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6115:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalOnlineElm.g:6116:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Draw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Draw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__0"


    // $ANTLR start "rule__Draw__Group__0__Impl"
    // InternalOnlineElm.g:6123:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__Alternatives_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6127:1: ( ( ( rule__Draw__Alternatives_0 ) ) )
            // InternalOnlineElm.g:6128:1: ( ( rule__Draw__Alternatives_0 ) )
            {
            // InternalOnlineElm.g:6128:1: ( ( rule__Draw__Alternatives_0 ) )
            // InternalOnlineElm.g:6129:2: ( rule__Draw__Alternatives_0 )
            {
             before(grammarAccess.getDrawAccess().getAlternatives_0()); 
            // InternalOnlineElm.g:6130:2: ( rule__Draw__Alternatives_0 )
            // InternalOnlineElm.g:6130:3: rule__Draw__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__0__Impl"


    // $ANTLR start "rule__Draw__Group__1"
    // InternalOnlineElm.g:6138:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6142:1: ( rule__Draw__Group__1__Impl )
            // InternalOnlineElm.g:6143:2: rule__Draw__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__1"


    // $ANTLR start "rule__Draw__Group__1__Impl"
    // InternalOnlineElm.g:6149:1: rule__Draw__Group__1__Impl : ( ( rule__Draw__Group_1__0 )* ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6153:1: ( ( ( rule__Draw__Group_1__0 )* ) )
            // InternalOnlineElm.g:6154:1: ( ( rule__Draw__Group_1__0 )* )
            {
            // InternalOnlineElm.g:6154:1: ( ( rule__Draw__Group_1__0 )* )
            // InternalOnlineElm.g:6155:2: ( rule__Draw__Group_1__0 )*
            {
             before(grammarAccess.getDrawAccess().getGroup_1()); 
            // InternalOnlineElm.g:6156:2: ( rule__Draw__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==70) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOnlineElm.g:6156:3: rule__Draw__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Draw__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getDrawAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__1__Impl"


    // $ANTLR start "rule__Draw__Group_1__0"
    // InternalOnlineElm.g:6165:1: rule__Draw__Group_1__0 : rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1 ;
    public final void rule__Draw__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6169:1: ( rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1 )
            // InternalOnlineElm.g:6170:2: rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__Draw__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Draw__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group_1__0"


    // $ANTLR start "rule__Draw__Group_1__0__Impl"
    // InternalOnlineElm.g:6177:1: rule__Draw__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__Draw__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6181:1: ( ( '|>' ) )
            // InternalOnlineElm.g:6182:1: ( '|>' )
            {
            // InternalOnlineElm.g:6182:1: ( '|>' )
            // InternalOnlineElm.g:6183:2: '|>'
            {
             before(grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group_1__0__Impl"


    // $ANTLR start "rule__Draw__Group_1__1"
    // InternalOnlineElm.g:6192:1: rule__Draw__Group_1__1 : rule__Draw__Group_1__1__Impl ;
    public final void rule__Draw__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6196:1: ( rule__Draw__Group_1__1__Impl )
            // InternalOnlineElm.g:6197:2: rule__Draw__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group_1__1"


    // $ANTLR start "rule__Draw__Group_1__1__Impl"
    // InternalOnlineElm.g:6203:1: rule__Draw__Group_1__1__Impl : ( ( rule__Draw__TransformAssignment_1_1 ) ) ;
    public final void rule__Draw__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6207:1: ( ( ( rule__Draw__TransformAssignment_1_1 ) ) )
            // InternalOnlineElm.g:6208:1: ( ( rule__Draw__TransformAssignment_1_1 ) )
            {
            // InternalOnlineElm.g:6208:1: ( ( rule__Draw__TransformAssignment_1_1 ) )
            // InternalOnlineElm.g:6209:2: ( rule__Draw__TransformAssignment_1_1 )
            {
             before(grammarAccess.getDrawAccess().getTransformAssignment_1_1()); 
            // InternalOnlineElm.g:6210:2: ( rule__Draw__TransformAssignment_1_1 )
            // InternalOnlineElm.g:6210:3: rule__Draw__TransformAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Draw__TransformAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getTransformAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group_1__1__Impl"


    // $ANTLR start "rule__Filled__Group__0"
    // InternalOnlineElm.g:6219:1: rule__Filled__Group__0 : rule__Filled__Group__0__Impl rule__Filled__Group__1 ;
    public final void rule__Filled__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6223:1: ( rule__Filled__Group__0__Impl rule__Filled__Group__1 )
            // InternalOnlineElm.g:6224:2: rule__Filled__Group__0__Impl rule__Filled__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Filled__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__0"


    // $ANTLR start "rule__Filled__Group__0__Impl"
    // InternalOnlineElm.g:6231:1: rule__Filled__Group__0__Impl : ( ( rule__Filled__NameAssignment_0 ) ) ;
    public final void rule__Filled__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6235:1: ( ( ( rule__Filled__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6236:1: ( ( rule__Filled__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6236:1: ( ( rule__Filled__NameAssignment_0 ) )
            // InternalOnlineElm.g:6237:2: ( rule__Filled__NameAssignment_0 )
            {
             before(grammarAccess.getFilledAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6238:2: ( rule__Filled__NameAssignment_0 )
            // InternalOnlineElm.g:6238:3: rule__Filled__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Filled__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__0__Impl"


    // $ANTLR start "rule__Filled__Group__1"
    // InternalOnlineElm.g:6246:1: rule__Filled__Group__1 : rule__Filled__Group__1__Impl rule__Filled__Group__2 ;
    public final void rule__Filled__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6250:1: ( rule__Filled__Group__1__Impl rule__Filled__Group__2 )
            // InternalOnlineElm.g:6251:2: rule__Filled__Group__1__Impl rule__Filled__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Filled__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__1"


    // $ANTLR start "rule__Filled__Group__1__Impl"
    // InternalOnlineElm.g:6258:1: rule__Filled__Group__1__Impl : ( ( rule__Filled__Alternatives_1 ) ) ;
    public final void rule__Filled__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6262:1: ( ( ( rule__Filled__Alternatives_1 ) ) )
            // InternalOnlineElm.g:6263:1: ( ( rule__Filled__Alternatives_1 ) )
            {
            // InternalOnlineElm.g:6263:1: ( ( rule__Filled__Alternatives_1 ) )
            // InternalOnlineElm.g:6264:2: ( rule__Filled__Alternatives_1 )
            {
             before(grammarAccess.getFilledAccess().getAlternatives_1()); 
            // InternalOnlineElm.g:6265:2: ( rule__Filled__Alternatives_1 )
            // InternalOnlineElm.g:6265:3: rule__Filled__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__1__Impl"


    // $ANTLR start "rule__Filled__Group__2"
    // InternalOnlineElm.g:6273:1: rule__Filled__Group__2 : rule__Filled__Group__2__Impl ;
    public final void rule__Filled__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6277:1: ( rule__Filled__Group__2__Impl )
            // InternalOnlineElm.g:6278:2: rule__Filled__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__2"


    // $ANTLR start "rule__Filled__Group__2__Impl"
    // InternalOnlineElm.g:6284:1: rule__Filled__Group__2__Impl : ( ( rule__Filled__Group_2__0 )? ) ;
    public final void rule__Filled__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6288:1: ( ( ( rule__Filled__Group_2__0 )? ) )
            // InternalOnlineElm.g:6289:1: ( ( rule__Filled__Group_2__0 )? )
            {
            // InternalOnlineElm.g:6289:1: ( ( rule__Filled__Group_2__0 )? )
            // InternalOnlineElm.g:6290:2: ( rule__Filled__Group_2__0 )?
            {
             before(grammarAccess.getFilledAccess().getGroup_2()); 
            // InternalOnlineElm.g:6291:2: ( rule__Filled__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==70) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==79) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalOnlineElm.g:6291:3: rule__Filled__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filled__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilledAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group__2__Impl"


    // $ANTLR start "rule__Filled__Group_2__0"
    // InternalOnlineElm.g:6300:1: rule__Filled__Group_2__0 : rule__Filled__Group_2__0__Impl rule__Filled__Group_2__1 ;
    public final void rule__Filled__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6304:1: ( rule__Filled__Group_2__0__Impl rule__Filled__Group_2__1 )
            // InternalOnlineElm.g:6305:2: rule__Filled__Group_2__0__Impl rule__Filled__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__Filled__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__0"


    // $ANTLR start "rule__Filled__Group_2__0__Impl"
    // InternalOnlineElm.g:6312:1: rule__Filled__Group_2__0__Impl : ( '|>' ) ;
    public final void rule__Filled__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6316:1: ( ( '|>' ) )
            // InternalOnlineElm.g:6317:1: ( '|>' )
            {
            // InternalOnlineElm.g:6317:1: ( '|>' )
            // InternalOnlineElm.g:6318:2: '|>'
            {
             before(grammarAccess.getFilledAccess().getVerticalLineGreaterThanSignKeyword_2_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getVerticalLineGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__0__Impl"


    // $ANTLR start "rule__Filled__Group_2__1"
    // InternalOnlineElm.g:6327:1: rule__Filled__Group_2__1 : rule__Filled__Group_2__1__Impl rule__Filled__Group_2__2 ;
    public final void rule__Filled__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6331:1: ( rule__Filled__Group_2__1__Impl rule__Filled__Group_2__2 )
            // InternalOnlineElm.g:6332:2: rule__Filled__Group_2__1__Impl rule__Filled__Group_2__2
            {
            pushFollow(FOLLOW_38);
            rule__Filled__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__1"


    // $ANTLR start "rule__Filled__Group_2__1__Impl"
    // InternalOnlineElm.g:6339:1: rule__Filled__Group_2__1__Impl : ( 'addOutline' ) ;
    public final void rule__Filled__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6343:1: ( ( 'addOutline' ) )
            // InternalOnlineElm.g:6344:1: ( 'addOutline' )
            {
            // InternalOnlineElm.g:6344:1: ( 'addOutline' )
            // InternalOnlineElm.g:6345:2: 'addOutline'
            {
             before(grammarAccess.getFilledAccess().getAddOutlineKeyword_2_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getAddOutlineKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__1__Impl"


    // $ANTLR start "rule__Filled__Group_2__2"
    // InternalOnlineElm.g:6354:1: rule__Filled__Group_2__2 : rule__Filled__Group_2__2__Impl rule__Filled__Group_2__3 ;
    public final void rule__Filled__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6358:1: ( rule__Filled__Group_2__2__Impl rule__Filled__Group_2__3 )
            // InternalOnlineElm.g:6359:2: rule__Filled__Group_2__2__Impl rule__Filled__Group_2__3
            {
            pushFollow(FOLLOW_45);
            rule__Filled__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__2"


    // $ANTLR start "rule__Filled__Group_2__2__Impl"
    // InternalOnlineElm.g:6366:1: rule__Filled__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Filled__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6370:1: ( ( '(' ) )
            // InternalOnlineElm.g:6371:1: ( '(' )
            {
            // InternalOnlineElm.g:6371:1: ( '(' )
            // InternalOnlineElm.g:6372:2: '('
            {
             before(grammarAccess.getFilledAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__2__Impl"


    // $ANTLR start "rule__Filled__Group_2__3"
    // InternalOnlineElm.g:6381:1: rule__Filled__Group_2__3 : rule__Filled__Group_2__3__Impl rule__Filled__Group_2__4 ;
    public final void rule__Filled__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6385:1: ( rule__Filled__Group_2__3__Impl rule__Filled__Group_2__4 )
            // InternalOnlineElm.g:6386:2: rule__Filled__Group_2__3__Impl rule__Filled__Group_2__4
            {
            pushFollow(FOLLOW_46);
            rule__Filled__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__3"


    // $ANTLR start "rule__Filled__Group_2__3__Impl"
    // InternalOnlineElm.g:6393:1: rule__Filled__Group_2__3__Impl : ( ( rule__Filled__LineType1Assignment_2_3 ) ) ;
    public final void rule__Filled__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6397:1: ( ( ( rule__Filled__LineType1Assignment_2_3 ) ) )
            // InternalOnlineElm.g:6398:1: ( ( rule__Filled__LineType1Assignment_2_3 ) )
            {
            // InternalOnlineElm.g:6398:1: ( ( rule__Filled__LineType1Assignment_2_3 ) )
            // InternalOnlineElm.g:6399:2: ( rule__Filled__LineType1Assignment_2_3 )
            {
             before(grammarAccess.getFilledAccess().getLineType1Assignment_2_3()); 
            // InternalOnlineElm.g:6400:2: ( rule__Filled__LineType1Assignment_2_3 )
            // InternalOnlineElm.g:6400:3: rule__Filled__LineType1Assignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Filled__LineType1Assignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getLineType1Assignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__3__Impl"


    // $ANTLR start "rule__Filled__Group_2__4"
    // InternalOnlineElm.g:6408:1: rule__Filled__Group_2__4 : rule__Filled__Group_2__4__Impl rule__Filled__Group_2__5 ;
    public final void rule__Filled__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6412:1: ( rule__Filled__Group_2__4__Impl rule__Filled__Group_2__5 )
            // InternalOnlineElm.g:6413:2: rule__Filled__Group_2__4__Impl rule__Filled__Group_2__5
            {
            pushFollow(FOLLOW_26);
            rule__Filled__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__4"


    // $ANTLR start "rule__Filled__Group_2__4__Impl"
    // InternalOnlineElm.g:6420:1: rule__Filled__Group_2__4__Impl : ( ( rule__Filled__Width1Assignment_2_4 ) ) ;
    public final void rule__Filled__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6424:1: ( ( ( rule__Filled__Width1Assignment_2_4 ) ) )
            // InternalOnlineElm.g:6425:1: ( ( rule__Filled__Width1Assignment_2_4 ) )
            {
            // InternalOnlineElm.g:6425:1: ( ( rule__Filled__Width1Assignment_2_4 ) )
            // InternalOnlineElm.g:6426:2: ( rule__Filled__Width1Assignment_2_4 )
            {
             before(grammarAccess.getFilledAccess().getWidth1Assignment_2_4()); 
            // InternalOnlineElm.g:6427:2: ( rule__Filled__Width1Assignment_2_4 )
            // InternalOnlineElm.g:6427:3: rule__Filled__Width1Assignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Width1Assignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getWidth1Assignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__4__Impl"


    // $ANTLR start "rule__Filled__Group_2__5"
    // InternalOnlineElm.g:6435:1: rule__Filled__Group_2__5 : rule__Filled__Group_2__5__Impl rule__Filled__Group_2__6 ;
    public final void rule__Filled__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6439:1: ( rule__Filled__Group_2__5__Impl rule__Filled__Group_2__6 )
            // InternalOnlineElm.g:6440:2: rule__Filled__Group_2__5__Impl rule__Filled__Group_2__6
            {
            pushFollow(FOLLOW_47);
            rule__Filled__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__5"


    // $ANTLR start "rule__Filled__Group_2__5__Impl"
    // InternalOnlineElm.g:6447:1: rule__Filled__Group_2__5__Impl : ( ')' ) ;
    public final void rule__Filled__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6451:1: ( ( ')' ) )
            // InternalOnlineElm.g:6452:1: ( ')' )
            {
            // InternalOnlineElm.g:6452:1: ( ')' )
            // InternalOnlineElm.g:6453:2: ')'
            {
             before(grammarAccess.getFilledAccess().getRightParenthesisKeyword_2_5()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getRightParenthesisKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__5__Impl"


    // $ANTLR start "rule__Filled__Group_2__6"
    // InternalOnlineElm.g:6462:1: rule__Filled__Group_2__6 : rule__Filled__Group_2__6__Impl ;
    public final void rule__Filled__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6466:1: ( rule__Filled__Group_2__6__Impl )
            // InternalOnlineElm.g:6467:2: rule__Filled__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__6"


    // $ANTLR start "rule__Filled__Group_2__6__Impl"
    // InternalOnlineElm.g:6473:1: rule__Filled__Group_2__6__Impl : ( ( rule__Filled__Outline_color1Assignment_2_6 ) ) ;
    public final void rule__Filled__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6477:1: ( ( ( rule__Filled__Outline_color1Assignment_2_6 ) ) )
            // InternalOnlineElm.g:6478:1: ( ( rule__Filled__Outline_color1Assignment_2_6 ) )
            {
            // InternalOnlineElm.g:6478:1: ( ( rule__Filled__Outline_color1Assignment_2_6 ) )
            // InternalOnlineElm.g:6479:2: ( rule__Filled__Outline_color1Assignment_2_6 )
            {
             before(grammarAccess.getFilledAccess().getOutline_color1Assignment_2_6()); 
            // InternalOnlineElm.g:6480:2: ( rule__Filled__Outline_color1Assignment_2_6 )
            // InternalOnlineElm.g:6480:3: rule__Filled__Outline_color1Assignment_2_6
            {
            pushFollow(FOLLOW_2);
            rule__Filled__Outline_color1Assignment_2_6();

            state._fsp--;


            }

             after(grammarAccess.getFilledAccess().getOutline_color1Assignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Group_2__6__Impl"


    // $ANTLR start "rule__Outlined__Group__0"
    // InternalOnlineElm.g:6489:1: rule__Outlined__Group__0 : rule__Outlined__Group__0__Impl rule__Outlined__Group__1 ;
    public final void rule__Outlined__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6493:1: ( rule__Outlined__Group__0__Impl rule__Outlined__Group__1 )
            // InternalOnlineElm.g:6494:2: rule__Outlined__Group__0__Impl rule__Outlined__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Outlined__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outlined__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__0"


    // $ANTLR start "rule__Outlined__Group__0__Impl"
    // InternalOnlineElm.g:6501:1: rule__Outlined__Group__0__Impl : ( ( rule__Outlined__NameAssignment_0 ) ) ;
    public final void rule__Outlined__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6505:1: ( ( ( rule__Outlined__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6506:1: ( ( rule__Outlined__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6506:1: ( ( rule__Outlined__NameAssignment_0 ) )
            // InternalOnlineElm.g:6507:2: ( rule__Outlined__NameAssignment_0 )
            {
             before(grammarAccess.getOutlinedAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6508:2: ( rule__Outlined__NameAssignment_0 )
            // InternalOnlineElm.g:6508:3: rule__Outlined__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutlinedAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__0__Impl"


    // $ANTLR start "rule__Outlined__Group__1"
    // InternalOnlineElm.g:6516:1: rule__Outlined__Group__1 : rule__Outlined__Group__1__Impl rule__Outlined__Group__2 ;
    public final void rule__Outlined__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6520:1: ( rule__Outlined__Group__1__Impl rule__Outlined__Group__2 )
            // InternalOnlineElm.g:6521:2: rule__Outlined__Group__1__Impl rule__Outlined__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Outlined__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outlined__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__1"


    // $ANTLR start "rule__Outlined__Group__1__Impl"
    // InternalOnlineElm.g:6528:1: rule__Outlined__Group__1__Impl : ( '(' ) ;
    public final void rule__Outlined__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6532:1: ( ( '(' ) )
            // InternalOnlineElm.g:6533:1: ( '(' )
            {
            // InternalOnlineElm.g:6533:1: ( '(' )
            // InternalOnlineElm.g:6534:2: '('
            {
             before(grammarAccess.getOutlinedAccess().getLeftParenthesisKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOutlinedAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__1__Impl"


    // $ANTLR start "rule__Outlined__Group__2"
    // InternalOnlineElm.g:6543:1: rule__Outlined__Group__2 : rule__Outlined__Group__2__Impl rule__Outlined__Group__3 ;
    public final void rule__Outlined__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6547:1: ( rule__Outlined__Group__2__Impl rule__Outlined__Group__3 )
            // InternalOnlineElm.g:6548:2: rule__Outlined__Group__2__Impl rule__Outlined__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Outlined__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outlined__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__2"


    // $ANTLR start "rule__Outlined__Group__2__Impl"
    // InternalOnlineElm.g:6555:1: rule__Outlined__Group__2__Impl : ( ( rule__Outlined__LineTypeAssignment_2 ) ) ;
    public final void rule__Outlined__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6559:1: ( ( ( rule__Outlined__LineTypeAssignment_2 ) ) )
            // InternalOnlineElm.g:6560:1: ( ( rule__Outlined__LineTypeAssignment_2 ) )
            {
            // InternalOnlineElm.g:6560:1: ( ( rule__Outlined__LineTypeAssignment_2 ) )
            // InternalOnlineElm.g:6561:2: ( rule__Outlined__LineTypeAssignment_2 )
            {
             before(grammarAccess.getOutlinedAccess().getLineTypeAssignment_2()); 
            // InternalOnlineElm.g:6562:2: ( rule__Outlined__LineTypeAssignment_2 )
            // InternalOnlineElm.g:6562:3: rule__Outlined__LineTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__LineTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutlinedAccess().getLineTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__2__Impl"


    // $ANTLR start "rule__Outlined__Group__3"
    // InternalOnlineElm.g:6570:1: rule__Outlined__Group__3 : rule__Outlined__Group__3__Impl rule__Outlined__Group__4 ;
    public final void rule__Outlined__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6574:1: ( rule__Outlined__Group__3__Impl rule__Outlined__Group__4 )
            // InternalOnlineElm.g:6575:2: rule__Outlined__Group__3__Impl rule__Outlined__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Outlined__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outlined__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__3"


    // $ANTLR start "rule__Outlined__Group__3__Impl"
    // InternalOnlineElm.g:6582:1: rule__Outlined__Group__3__Impl : ( ( rule__Outlined__WidthAssignment_3 ) ) ;
    public final void rule__Outlined__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6586:1: ( ( ( rule__Outlined__WidthAssignment_3 ) ) )
            // InternalOnlineElm.g:6587:1: ( ( rule__Outlined__WidthAssignment_3 ) )
            {
            // InternalOnlineElm.g:6587:1: ( ( rule__Outlined__WidthAssignment_3 ) )
            // InternalOnlineElm.g:6588:2: ( rule__Outlined__WidthAssignment_3 )
            {
             before(grammarAccess.getOutlinedAccess().getWidthAssignment_3()); 
            // InternalOnlineElm.g:6589:2: ( rule__Outlined__WidthAssignment_3 )
            // InternalOnlineElm.g:6589:3: rule__Outlined__WidthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__WidthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutlinedAccess().getWidthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__3__Impl"


    // $ANTLR start "rule__Outlined__Group__4"
    // InternalOnlineElm.g:6597:1: rule__Outlined__Group__4 : rule__Outlined__Group__4__Impl rule__Outlined__Group__5 ;
    public final void rule__Outlined__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6601:1: ( rule__Outlined__Group__4__Impl rule__Outlined__Group__5 )
            // InternalOnlineElm.g:6602:2: rule__Outlined__Group__4__Impl rule__Outlined__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Outlined__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outlined__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__4"


    // $ANTLR start "rule__Outlined__Group__4__Impl"
    // InternalOnlineElm.g:6609:1: rule__Outlined__Group__4__Impl : ( ')' ) ;
    public final void rule__Outlined__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6613:1: ( ( ')' ) )
            // InternalOnlineElm.g:6614:1: ( ')' )
            {
            // InternalOnlineElm.g:6614:1: ( ')' )
            // InternalOnlineElm.g:6615:2: ')'
            {
             before(grammarAccess.getOutlinedAccess().getRightParenthesisKeyword_4()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getOutlinedAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__4__Impl"


    // $ANTLR start "rule__Outlined__Group__5"
    // InternalOnlineElm.g:6624:1: rule__Outlined__Group__5 : rule__Outlined__Group__5__Impl ;
    public final void rule__Outlined__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6628:1: ( rule__Outlined__Group__5__Impl )
            // InternalOnlineElm.g:6629:2: rule__Outlined__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__5"


    // $ANTLR start "rule__Outlined__Group__5__Impl"
    // InternalOnlineElm.g:6635:1: rule__Outlined__Group__5__Impl : ( ( rule__Outlined__Alternatives_5 ) ) ;
    public final void rule__Outlined__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6639:1: ( ( ( rule__Outlined__Alternatives_5 ) ) )
            // InternalOnlineElm.g:6640:1: ( ( rule__Outlined__Alternatives_5 ) )
            {
            // InternalOnlineElm.g:6640:1: ( ( rule__Outlined__Alternatives_5 ) )
            // InternalOnlineElm.g:6641:2: ( rule__Outlined__Alternatives_5 )
            {
             before(grammarAccess.getOutlinedAccess().getAlternatives_5()); 
            // InternalOnlineElm.g:6642:2: ( rule__Outlined__Alternatives_5 )
            // InternalOnlineElm.g:6642:3: rule__Outlined__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Outlined__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getOutlinedAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalOnlineElm.g:6651:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6655:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalOnlineElm.g:6656:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalOnlineElm.g:6663:1: rule__Move__Group__0__Impl : ( ( rule__Move__NameAssignment_0 ) ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6667:1: ( ( ( rule__Move__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6668:1: ( ( rule__Move__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6668:1: ( ( rule__Move__NameAssignment_0 ) )
            // InternalOnlineElm.g:6669:2: ( rule__Move__NameAssignment_0 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6670:2: ( rule__Move__NameAssignment_0 )
            // InternalOnlineElm.g:6670:3: rule__Move__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalOnlineElm.g:6678:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6682:1: ( rule__Move__Group__1__Impl )
            // InternalOnlineElm.g:6683:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalOnlineElm.g:6689:1: rule__Move__Group__1__Impl : ( ( rule__Move__PointAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6693:1: ( ( ( rule__Move__PointAssignment_1 ) ) )
            // InternalOnlineElm.g:6694:1: ( ( rule__Move__PointAssignment_1 ) )
            {
            // InternalOnlineElm.g:6694:1: ( ( rule__Move__PointAssignment_1 ) )
            // InternalOnlineElm.g:6695:2: ( rule__Move__PointAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPointAssignment_1()); 
            // InternalOnlineElm.g:6696:2: ( rule__Move__PointAssignment_1 )
            // InternalOnlineElm.g:6696:3: rule__Move__PointAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__PointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getPointAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Rotate__Group__0"
    // InternalOnlineElm.g:6705:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6709:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalOnlineElm.g:6710:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Rotate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__0"


    // $ANTLR start "rule__Rotate__Group__0__Impl"
    // InternalOnlineElm.g:6717:1: rule__Rotate__Group__0__Impl : ( ( rule__Rotate__NameAssignment_0 ) ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6721:1: ( ( ( rule__Rotate__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6722:1: ( ( rule__Rotate__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6722:1: ( ( rule__Rotate__NameAssignment_0 ) )
            // InternalOnlineElm.g:6723:2: ( rule__Rotate__NameAssignment_0 )
            {
             before(grammarAccess.getRotateAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6724:2: ( rule__Rotate__NameAssignment_0 )
            // InternalOnlineElm.g:6724:3: rule__Rotate__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRotateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__0__Impl"


    // $ANTLR start "rule__Rotate__Group__1"
    // InternalOnlineElm.g:6732:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6736:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalOnlineElm.g:6737:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Rotate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__1"


    // $ANTLR start "rule__Rotate__Group__1__Impl"
    // InternalOnlineElm.g:6744:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6748:1: ( ( '(' ) )
            // InternalOnlineElm.g:6749:1: ( '(' )
            {
            // InternalOnlineElm.g:6749:1: ( '(' )
            // InternalOnlineElm.g:6750:2: '('
            {
             before(grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__1__Impl"


    // $ANTLR start "rule__Rotate__Group__2"
    // InternalOnlineElm.g:6759:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6763:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalOnlineElm.g:6764:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Rotate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__2"


    // $ANTLR start "rule__Rotate__Group__2__Impl"
    // InternalOnlineElm.g:6771:1: rule__Rotate__Group__2__Impl : ( 'degrees' ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6775:1: ( ( 'degrees' ) )
            // InternalOnlineElm.g:6776:1: ( 'degrees' )
            {
            // InternalOnlineElm.g:6776:1: ( 'degrees' )
            // InternalOnlineElm.g:6777:2: 'degrees'
            {
             before(grammarAccess.getRotateAccess().getDegreesKeyword_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getDegreesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__2__Impl"


    // $ANTLR start "rule__Rotate__Group__3"
    // InternalOnlineElm.g:6786:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl rule__Rotate__Group__4 ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6790:1: ( rule__Rotate__Group__3__Impl rule__Rotate__Group__4 )
            // InternalOnlineElm.g:6791:2: rule__Rotate__Group__3__Impl rule__Rotate__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Rotate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__3"


    // $ANTLR start "rule__Rotate__Group__3__Impl"
    // InternalOnlineElm.g:6798:1: rule__Rotate__Group__3__Impl : ( ( rule__Rotate__DegreeAssignment_3 ) ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6802:1: ( ( ( rule__Rotate__DegreeAssignment_3 ) ) )
            // InternalOnlineElm.g:6803:1: ( ( rule__Rotate__DegreeAssignment_3 ) )
            {
            // InternalOnlineElm.g:6803:1: ( ( rule__Rotate__DegreeAssignment_3 ) )
            // InternalOnlineElm.g:6804:2: ( rule__Rotate__DegreeAssignment_3 )
            {
             before(grammarAccess.getRotateAccess().getDegreeAssignment_3()); 
            // InternalOnlineElm.g:6805:2: ( rule__Rotate__DegreeAssignment_3 )
            // InternalOnlineElm.g:6805:3: rule__Rotate__DegreeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__DegreeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRotateAccess().getDegreeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__3__Impl"


    // $ANTLR start "rule__Rotate__Group__4"
    // InternalOnlineElm.g:6813:1: rule__Rotate__Group__4 : rule__Rotate__Group__4__Impl ;
    public final void rule__Rotate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6817:1: ( rule__Rotate__Group__4__Impl )
            // InternalOnlineElm.g:6818:2: rule__Rotate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__4"


    // $ANTLR start "rule__Rotate__Group__4__Impl"
    // InternalOnlineElm.g:6824:1: rule__Rotate__Group__4__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6828:1: ( ( ')' ) )
            // InternalOnlineElm.g:6829:1: ( ')' )
            {
            // InternalOnlineElm.g:6829:1: ( ')' )
            // InternalOnlineElm.g:6830:2: ')'
            {
             before(grammarAccess.getRotateAccess().getRightParenthesisKeyword_4()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__4__Impl"


    // $ANTLR start "rule__Scale__Group__0"
    // InternalOnlineElm.g:6840:1: rule__Scale__Group__0 : rule__Scale__Group__0__Impl rule__Scale__Group__1 ;
    public final void rule__Scale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6844:1: ( rule__Scale__Group__0__Impl rule__Scale__Group__1 )
            // InternalOnlineElm.g:6845:2: rule__Scale__Group__0__Impl rule__Scale__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Scale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__Group__0"


    // $ANTLR start "rule__Scale__Group__0__Impl"
    // InternalOnlineElm.g:6852:1: rule__Scale__Group__0__Impl : ( ( rule__Scale__NameAssignment_0 ) ) ;
    public final void rule__Scale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6856:1: ( ( ( rule__Scale__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6857:1: ( ( rule__Scale__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6857:1: ( ( rule__Scale__NameAssignment_0 ) )
            // InternalOnlineElm.g:6858:2: ( rule__Scale__NameAssignment_0 )
            {
             before(grammarAccess.getScaleAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6859:2: ( rule__Scale__NameAssignment_0 )
            // InternalOnlineElm.g:6859:3: rule__Scale__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Scale__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScaleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__Group__0__Impl"


    // $ANTLR start "rule__Scale__Group__1"
    // InternalOnlineElm.g:6867:1: rule__Scale__Group__1 : rule__Scale__Group__1__Impl ;
    public final void rule__Scale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6871:1: ( rule__Scale__Group__1__Impl )
            // InternalOnlineElm.g:6872:2: rule__Scale__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scale__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__Group__1"


    // $ANTLR start "rule__Scale__Group__1__Impl"
    // InternalOnlineElm.g:6878:1: rule__Scale__Group__1__Impl : ( ( rule__Scale__FactorAssignment_1 ) ) ;
    public final void rule__Scale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6882:1: ( ( ( rule__Scale__FactorAssignment_1 ) ) )
            // InternalOnlineElm.g:6883:1: ( ( rule__Scale__FactorAssignment_1 ) )
            {
            // InternalOnlineElm.g:6883:1: ( ( rule__Scale__FactorAssignment_1 ) )
            // InternalOnlineElm.g:6884:2: ( rule__Scale__FactorAssignment_1 )
            {
             before(grammarAccess.getScaleAccess().getFactorAssignment_1()); 
            // InternalOnlineElm.g:6885:2: ( rule__Scale__FactorAssignment_1 )
            // InternalOnlineElm.g:6885:3: rule__Scale__FactorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scale__FactorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScaleAccess().getFactorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__Group__1__Impl"


    // $ANTLR start "rule__ScaleX__Group__0"
    // InternalOnlineElm.g:6894:1: rule__ScaleX__Group__0 : rule__ScaleX__Group__0__Impl rule__ScaleX__Group__1 ;
    public final void rule__ScaleX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6898:1: ( rule__ScaleX__Group__0__Impl rule__ScaleX__Group__1 )
            // InternalOnlineElm.g:6899:2: rule__ScaleX__Group__0__Impl rule__ScaleX__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ScaleX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScaleX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__Group__0"


    // $ANTLR start "rule__ScaleX__Group__0__Impl"
    // InternalOnlineElm.g:6906:1: rule__ScaleX__Group__0__Impl : ( ( rule__ScaleX__NameAssignment_0 ) ) ;
    public final void rule__ScaleX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6910:1: ( ( ( rule__ScaleX__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6911:1: ( ( rule__ScaleX__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6911:1: ( ( rule__ScaleX__NameAssignment_0 ) )
            // InternalOnlineElm.g:6912:2: ( rule__ScaleX__NameAssignment_0 )
            {
             before(grammarAccess.getScaleXAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6913:2: ( rule__ScaleX__NameAssignment_0 )
            // InternalOnlineElm.g:6913:3: rule__ScaleX__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ScaleX__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScaleXAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__Group__0__Impl"


    // $ANTLR start "rule__ScaleX__Group__1"
    // InternalOnlineElm.g:6921:1: rule__ScaleX__Group__1 : rule__ScaleX__Group__1__Impl ;
    public final void rule__ScaleX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6925:1: ( rule__ScaleX__Group__1__Impl )
            // InternalOnlineElm.g:6926:2: rule__ScaleX__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScaleX__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__Group__1"


    // $ANTLR start "rule__ScaleX__Group__1__Impl"
    // InternalOnlineElm.g:6932:1: rule__ScaleX__Group__1__Impl : ( ( rule__ScaleX__FactorAssignment_1 ) ) ;
    public final void rule__ScaleX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6936:1: ( ( ( rule__ScaleX__FactorAssignment_1 ) ) )
            // InternalOnlineElm.g:6937:1: ( ( rule__ScaleX__FactorAssignment_1 ) )
            {
            // InternalOnlineElm.g:6937:1: ( ( rule__ScaleX__FactorAssignment_1 ) )
            // InternalOnlineElm.g:6938:2: ( rule__ScaleX__FactorAssignment_1 )
            {
             before(grammarAccess.getScaleXAccess().getFactorAssignment_1()); 
            // InternalOnlineElm.g:6939:2: ( rule__ScaleX__FactorAssignment_1 )
            // InternalOnlineElm.g:6939:3: rule__ScaleX__FactorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScaleX__FactorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScaleXAccess().getFactorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__Group__1__Impl"


    // $ANTLR start "rule__ScaleY__Group__0"
    // InternalOnlineElm.g:6948:1: rule__ScaleY__Group__0 : rule__ScaleY__Group__0__Impl rule__ScaleY__Group__1 ;
    public final void rule__ScaleY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6952:1: ( rule__ScaleY__Group__0__Impl rule__ScaleY__Group__1 )
            // InternalOnlineElm.g:6953:2: rule__ScaleY__Group__0__Impl rule__ScaleY__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ScaleY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScaleY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__Group__0"


    // $ANTLR start "rule__ScaleY__Group__0__Impl"
    // InternalOnlineElm.g:6960:1: rule__ScaleY__Group__0__Impl : ( ( rule__ScaleY__NameAssignment_0 ) ) ;
    public final void rule__ScaleY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6964:1: ( ( ( rule__ScaleY__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:6965:1: ( ( rule__ScaleY__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:6965:1: ( ( rule__ScaleY__NameAssignment_0 ) )
            // InternalOnlineElm.g:6966:2: ( rule__ScaleY__NameAssignment_0 )
            {
             before(grammarAccess.getScaleYAccess().getNameAssignment_0()); 
            // InternalOnlineElm.g:6967:2: ( rule__ScaleY__NameAssignment_0 )
            // InternalOnlineElm.g:6967:3: rule__ScaleY__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ScaleY__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScaleYAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__Group__0__Impl"


    // $ANTLR start "rule__ScaleY__Group__1"
    // InternalOnlineElm.g:6975:1: rule__ScaleY__Group__1 : rule__ScaleY__Group__1__Impl ;
    public final void rule__ScaleY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6979:1: ( rule__ScaleY__Group__1__Impl )
            // InternalOnlineElm.g:6980:2: rule__ScaleY__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScaleY__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__Group__1"


    // $ANTLR start "rule__ScaleY__Group__1__Impl"
    // InternalOnlineElm.g:6986:1: rule__ScaleY__Group__1__Impl : ( ( rule__ScaleY__FactorAssignment_1 ) ) ;
    public final void rule__ScaleY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:6990:1: ( ( ( rule__ScaleY__FactorAssignment_1 ) ) )
            // InternalOnlineElm.g:6991:1: ( ( rule__ScaleY__FactorAssignment_1 ) )
            {
            // InternalOnlineElm.g:6991:1: ( ( rule__ScaleY__FactorAssignment_1 ) )
            // InternalOnlineElm.g:6992:2: ( rule__ScaleY__FactorAssignment_1 )
            {
             before(grammarAccess.getScaleYAccess().getFactorAssignment_1()); 
            // InternalOnlineElm.g:6993:2: ( rule__ScaleY__FactorAssignment_1 )
            // InternalOnlineElm.g:6993:3: rule__ScaleY__FactorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScaleY__FactorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScaleYAccess().getFactorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__Group__1__Impl"


    // $ANTLR start "rule__OnlineElm__EntryAssignment_0"
    // InternalOnlineElm.g:7002:1: rule__OnlineElm__EntryAssignment_0 : ( ruleMainShape ) ;
    public final void rule__OnlineElm__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7006:1: ( ( ruleMainShape ) )
            // InternalOnlineElm.g:7007:2: ( ruleMainShape )
            {
            // InternalOnlineElm.g:7007:2: ( ruleMainShape )
            // InternalOnlineElm.g:7008:3: ruleMainShape
            {
             before(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMainShape();

            state._fsp--;

             after(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__EntryAssignment_0"


    // $ANTLR start "rule__OnlineElm__ShapesAssignment_1"
    // InternalOnlineElm.g:7017:1: rule__OnlineElm__ShapesAssignment_1 : ( ruleShapeDef ) ;
    public final void rule__OnlineElm__ShapesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7021:1: ( ( ruleShapeDef ) )
            // InternalOnlineElm.g:7022:2: ( ruleShapeDef )
            {
            // InternalOnlineElm.g:7022:2: ( ruleShapeDef )
            // InternalOnlineElm.g:7023:3: ruleShapeDef
            {
             before(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeDef();

            state._fsp--;

             after(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__ShapesAssignment_1"


    // $ANTLR start "rule__OnlineElm__VarAssignment_2"
    // InternalOnlineElm.g:7032:1: rule__OnlineElm__VarAssignment_2 : ( ruleLocal_var ) ;
    public final void rule__OnlineElm__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7036:1: ( ( ruleLocal_var ) )
            // InternalOnlineElm.g:7037:2: ( ruleLocal_var )
            {
            // InternalOnlineElm.g:7037:2: ( ruleLocal_var )
            // InternalOnlineElm.g:7038:3: ruleLocal_var
            {
             before(grammarAccess.getOnlineElmAccess().getVarLocal_varParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal_var();

            state._fsp--;

             after(grammarAccess.getOnlineElmAccess().getVarLocal_varParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__VarAssignment_2"


    // $ANTLR start "rule__MainShape__NameAssignment_0"
    // InternalOnlineElm.g:7047:1: rule__MainShape__NameAssignment_0 : ( ( 'myShapes' ) ) ;
    public final void rule__MainShape__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7051:1: ( ( ( 'myShapes' ) ) )
            // InternalOnlineElm.g:7052:2: ( ( 'myShapes' ) )
            {
            // InternalOnlineElm.g:7052:2: ( ( 'myShapes' ) )
            // InternalOnlineElm.g:7053:3: ( 'myShapes' )
            {
             before(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            // InternalOnlineElm.g:7054:3: ( 'myShapes' )
            // InternalOnlineElm.g:7055:4: 'myShapes'
            {
             before(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 

            }

             after(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__NameAssignment_0"


    // $ANTLR start "rule__MainShape__ShapeAssignment_4_0"
    // InternalOnlineElm.g:7066:1: rule__MainShape__ShapeAssignment_4_0 : ( ruleShape ) ;
    public final void rule__MainShape__ShapeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7070:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7071:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7071:2: ( ruleShape )
            // InternalOnlineElm.g:7072:3: ruleShape
            {
             before(grammarAccess.getMainShapeAccess().getShapeShapeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getMainShapeAccess().getShapeShapeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__ShapeAssignment_4_0"


    // $ANTLR start "rule__MainShape__ConditionalAssignment_4_1"
    // InternalOnlineElm.g:7081:1: rule__MainShape__ConditionalAssignment_4_1 : ( ruleConditional_Shape ) ;
    public final void rule__MainShape__ConditionalAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7085:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7086:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7086:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7087:3: ruleConditional_Shape
            {
             before(grammarAccess.getMainShapeAccess().getConditionalConditional_ShapeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getMainShapeAccess().getConditionalConditional_ShapeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__ConditionalAssignment_4_1"


    // $ANTLR start "rule__MainShape__ShapeRefAssignment_4_2"
    // InternalOnlineElm.g:7096:1: rule__MainShape__ShapeRefAssignment_4_2 : ( ( RULE_FQN ) ) ;
    public final void rule__MainShape__ShapeRefAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7100:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7101:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7101:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7102:3: ( RULE_FQN )
            {
             before(grammarAccess.getMainShapeAccess().getShapeRefBasicShapeCrossReference_4_2_0()); 
            // InternalOnlineElm.g:7103:3: ( RULE_FQN )
            // InternalOnlineElm.g:7104:4: RULE_FQN
            {
             before(grammarAccess.getMainShapeAccess().getShapeRefBasicShapeFQNTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getShapeRefBasicShapeFQNTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getMainShapeAccess().getShapeRefBasicShapeCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__ShapeRefAssignment_4_2"


    // $ANTLR start "rule__MainShape__MoreShapesAssignment_5_2_0"
    // InternalOnlineElm.g:7115:1: rule__MainShape__MoreShapesAssignment_5_2_0 : ( ruleShape ) ;
    public final void rule__MainShape__MoreShapesAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7119:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7120:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7120:2: ( ruleShape )
            // InternalOnlineElm.g:7121:3: ruleShape
            {
             before(grammarAccess.getMainShapeAccess().getMoreShapesShapeParserRuleCall_5_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getMainShapeAccess().getMoreShapesShapeParserRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__MoreShapesAssignment_5_2_0"


    // $ANTLR start "rule__MainShape__MoreConditionalAssignment_5_2_1"
    // InternalOnlineElm.g:7130:1: rule__MainShape__MoreConditionalAssignment_5_2_1 : ( ruleConditional_Shape ) ;
    public final void rule__MainShape__MoreConditionalAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7134:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7135:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7135:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7136:3: ruleConditional_Shape
            {
             before(grammarAccess.getMainShapeAccess().getMoreConditionalConditional_ShapeParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getMainShapeAccess().getMoreConditionalConditional_ShapeParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__MoreConditionalAssignment_5_2_1"


    // $ANTLR start "rule__MainShape__MoreShapeRefAssignment_5_2_2"
    // InternalOnlineElm.g:7145:1: rule__MainShape__MoreShapeRefAssignment_5_2_2 : ( ( RULE_FQN ) ) ;
    public final void rule__MainShape__MoreShapeRefAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7149:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7150:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7150:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7151:3: ( RULE_FQN )
            {
             before(grammarAccess.getMainShapeAccess().getMoreShapeRefBasicShapeCrossReference_5_2_2_0()); 
            // InternalOnlineElm.g:7152:3: ( RULE_FQN )
            // InternalOnlineElm.g:7153:4: RULE_FQN
            {
             before(grammarAccess.getMainShapeAccess().getMoreShapeRefBasicShapeFQNTerminalRuleCall_5_2_2_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getMoreShapeRefBasicShapeFQNTerminalRuleCall_5_2_2_0_1()); 

            }

             after(grammarAccess.getMainShapeAccess().getMoreShapeRefBasicShapeCrossReference_5_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__MoreShapeRefAssignment_5_2_2"


    // $ANTLR start "rule__MainShape__ExternalAssignment_8_1_1"
    // InternalOnlineElm.g:7164:1: rule__MainShape__ExternalAssignment_8_1_1 : ( ( RULE_FQN ) ) ;
    public final void rule__MainShape__ExternalAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7168:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7169:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7169:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7170:3: ( RULE_FQN )
            {
             before(grammarAccess.getMainShapeAccess().getExternalShapeListCrossReference_8_1_1_0()); 
            // InternalOnlineElm.g:7171:3: ( RULE_FQN )
            // InternalOnlineElm.g:7172:4: RULE_FQN
            {
             before(grammarAccess.getMainShapeAccess().getExternalShapeListFQNTerminalRuleCall_8_1_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getMainShapeAccess().getExternalShapeListFQNTerminalRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getMainShapeAccess().getExternalShapeListCrossReference_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__ExternalAssignment_8_1_1"


    // $ANTLR start "rule__Local_var__NameAssignment_0"
    // InternalOnlineElm.g:7183:1: rule__Local_var__NameAssignment_0 : ( RULE_FQN ) ;
    public final void rule__Local_var__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7187:1: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7188:2: ( RULE_FQN )
            {
            // InternalOnlineElm.g:7188:2: ( RULE_FQN )
            // InternalOnlineElm.g:7189:3: RULE_FQN
            {
             before(grammarAccess.getLocal_varAccess().getNameFQNTerminalRuleCall_0_0()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getLocal_varAccess().getNameFQNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__NameAssignment_0"


    // $ANTLR start "rule__Local_var__VarAssignment_2"
    // InternalOnlineElm.g:7198:1: rule__Local_var__VarAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Local_var__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7202:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7203:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7203:2: ( ruleNum_value )
            // InternalOnlineElm.g:7204:3: ruleNum_value
            {
             before(grammarAccess.getLocal_varAccess().getVarNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getLocal_varAccess().getVarNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local_var__VarAssignment_2"


    // $ANTLR start "rule__ShapeList__NameAssignment_0"
    // InternalOnlineElm.g:7213:1: rule__ShapeList__NameAssignment_0 : ( RULE_FQN ) ;
    public final void rule__ShapeList__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7217:1: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7218:2: ( RULE_FQN )
            {
            // InternalOnlineElm.g:7218:2: ( RULE_FQN )
            // InternalOnlineElm.g:7219:3: RULE_FQN
            {
             before(grammarAccess.getShapeListAccess().getNameFQNTerminalRuleCall_0_0()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getNameFQNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__NameAssignment_0"


    // $ANTLR start "rule__ShapeList__ShapeAssignment_3_0"
    // InternalOnlineElm.g:7228:1: rule__ShapeList__ShapeAssignment_3_0 : ( ruleShape ) ;
    public final void rule__ShapeList__ShapeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7232:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7233:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7233:2: ( ruleShape )
            // InternalOnlineElm.g:7234:3: ruleShape
            {
             before(grammarAccess.getShapeListAccess().getShapeShapeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeListAccess().getShapeShapeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__ShapeAssignment_3_0"


    // $ANTLR start "rule__ShapeList__ConditionalAssignment_3_1"
    // InternalOnlineElm.g:7243:1: rule__ShapeList__ConditionalAssignment_3_1 : ( ruleConditional_Shape ) ;
    public final void rule__ShapeList__ConditionalAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7247:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7248:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7248:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7249:3: ruleConditional_Shape
            {
             before(grammarAccess.getShapeListAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getShapeListAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__ConditionalAssignment_3_1"


    // $ANTLR start "rule__ShapeList__ShapeRefAssignment_3_2"
    // InternalOnlineElm.g:7258:1: rule__ShapeList__ShapeRefAssignment_3_2 : ( ( RULE_FQN ) ) ;
    public final void rule__ShapeList__ShapeRefAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7262:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7263:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7263:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7264:3: ( RULE_FQN )
            {
             before(grammarAccess.getShapeListAccess().getShapeRefBasicShapeCrossReference_3_2_0()); 
            // InternalOnlineElm.g:7265:3: ( RULE_FQN )
            // InternalOnlineElm.g:7266:4: RULE_FQN
            {
             before(grammarAccess.getShapeListAccess().getShapeRefBasicShapeFQNTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getShapeRefBasicShapeFQNTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getShapeListAccess().getShapeRefBasicShapeCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__ShapeRefAssignment_3_2"


    // $ANTLR start "rule__ShapeList__MoreShapesAssignment_4_2_0"
    // InternalOnlineElm.g:7277:1: rule__ShapeList__MoreShapesAssignment_4_2_0 : ( ruleShape ) ;
    public final void rule__ShapeList__MoreShapesAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7281:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7282:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7282:2: ( ruleShape )
            // InternalOnlineElm.g:7283:3: ruleShape
            {
             before(grammarAccess.getShapeListAccess().getMoreShapesShapeParserRuleCall_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeListAccess().getMoreShapesShapeParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__MoreShapesAssignment_4_2_0"


    // $ANTLR start "rule__ShapeList__MoreConditionalAssignment_4_2_1"
    // InternalOnlineElm.g:7292:1: rule__ShapeList__MoreConditionalAssignment_4_2_1 : ( ruleConditional_Shape ) ;
    public final void rule__ShapeList__MoreConditionalAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7296:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7297:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7297:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7298:3: ruleConditional_Shape
            {
             before(grammarAccess.getShapeListAccess().getMoreConditionalConditional_ShapeParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getShapeListAccess().getMoreConditionalConditional_ShapeParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__MoreConditionalAssignment_4_2_1"


    // $ANTLR start "rule__ShapeList__MoreShapeRefAssignment_4_2_2"
    // InternalOnlineElm.g:7307:1: rule__ShapeList__MoreShapeRefAssignment_4_2_2 : ( ( RULE_FQN ) ) ;
    public final void rule__ShapeList__MoreShapeRefAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7311:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7312:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7312:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7313:3: ( RULE_FQN )
            {
             before(grammarAccess.getShapeListAccess().getMoreShapeRefBasicShapeCrossReference_4_2_2_0()); 
            // InternalOnlineElm.g:7314:3: ( RULE_FQN )
            // InternalOnlineElm.g:7315:4: RULE_FQN
            {
             before(grammarAccess.getShapeListAccess().getMoreShapeRefBasicShapeFQNTerminalRuleCall_4_2_2_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getMoreShapeRefBasicShapeFQNTerminalRuleCall_4_2_2_0_1()); 

            }

             after(grammarAccess.getShapeListAccess().getMoreShapeRefBasicShapeCrossReference_4_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__MoreShapeRefAssignment_4_2_2"


    // $ANTLR start "rule__ShapeList__ExternalAssignment_7_1_1"
    // InternalOnlineElm.g:7326:1: rule__ShapeList__ExternalAssignment_7_1_1 : ( ( RULE_FQN ) ) ;
    public final void rule__ShapeList__ExternalAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7330:1: ( ( ( RULE_FQN ) ) )
            // InternalOnlineElm.g:7331:2: ( ( RULE_FQN ) )
            {
            // InternalOnlineElm.g:7331:2: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7332:3: ( RULE_FQN )
            {
             before(grammarAccess.getShapeListAccess().getExternalShapeListCrossReference_7_1_1_0()); 
            // InternalOnlineElm.g:7333:3: ( RULE_FQN )
            // InternalOnlineElm.g:7334:4: RULE_FQN
            {
             before(grammarAccess.getShapeListAccess().getExternalShapeListFQNTerminalRuleCall_7_1_1_0_1()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getShapeListAccess().getExternalShapeListFQNTerminalRuleCall_7_1_1_0_1()); 

            }

             after(grammarAccess.getShapeListAccess().getExternalShapeListCrossReference_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeList__ExternalAssignment_7_1_1"


    // $ANTLR start "rule__BasicShape__NameAssignment_0"
    // InternalOnlineElm.g:7345:1: rule__BasicShape__NameAssignment_0 : ( RULE_FQN ) ;
    public final void rule__BasicShape__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7349:1: ( ( RULE_FQN ) )
            // InternalOnlineElm.g:7350:2: ( RULE_FQN )
            {
            // InternalOnlineElm.g:7350:2: ( RULE_FQN )
            // InternalOnlineElm.g:7351:3: RULE_FQN
            {
             before(grammarAccess.getBasicShapeAccess().getNameFQNTerminalRuleCall_0_0()); 
            match(input,RULE_FQN,FOLLOW_2); 
             after(grammarAccess.getBasicShapeAccess().getNameFQNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__NameAssignment_0"


    // $ANTLR start "rule__BasicShape__ShapeAssignment_3_0"
    // InternalOnlineElm.g:7360:1: rule__BasicShape__ShapeAssignment_3_0 : ( ruleShape ) ;
    public final void rule__BasicShape__ShapeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7364:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7365:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7365:2: ( ruleShape )
            // InternalOnlineElm.g:7366:3: ruleShape
            {
             before(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__ShapeAssignment_3_0"


    // $ANTLR start "rule__BasicShape__ConditionalAssignment_3_1"
    // InternalOnlineElm.g:7375:1: rule__BasicShape__ConditionalAssignment_3_1 : ( ruleConditional_Shape ) ;
    public final void rule__BasicShape__ConditionalAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7379:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7380:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7380:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7381:3: ruleConditional_Shape
            {
             before(grammarAccess.getBasicShapeAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getBasicShapeAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__ConditionalAssignment_3_1"


    // $ANTLR start "rule__Shape__StencilAssignment_0"
    // InternalOnlineElm.g:7390:1: rule__Shape__StencilAssignment_0 : ( ruleStencil ) ;
    public final void rule__Shape__StencilAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7394:1: ( ( ruleStencil ) )
            // InternalOnlineElm.g:7395:2: ( ruleStencil )
            {
            // InternalOnlineElm.g:7395:2: ( ruleStencil )
            // InternalOnlineElm.g:7396:3: ruleStencil
            {
             before(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStencil();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__StencilAssignment_0"


    // $ANTLR start "rule__Shape__DrawAssignment_2"
    // InternalOnlineElm.g:7405:1: rule__Shape__DrawAssignment_2 : ( ruleDraw ) ;
    public final void rule__Shape__DrawAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7409:1: ( ( ruleDraw ) )
            // InternalOnlineElm.g:7410:2: ( ruleDraw )
            {
            // InternalOnlineElm.g:7410:2: ( ruleDraw )
            // InternalOnlineElm.g:7411:3: ruleDraw
            {
             before(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDraw();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__DrawAssignment_2"


    // $ANTLR start "rule__Conditional_Shape__Shape_1Assignment_4_0"
    // InternalOnlineElm.g:7420:1: rule__Conditional_Shape__Shape_1Assignment_4_0 : ( ruleShape ) ;
    public final void rule__Conditional_Shape__Shape_1Assignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7424:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7425:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7425:2: ( ruleShape )
            // InternalOnlineElm.g:7426:3: ruleShape
            {
             before(grammarAccess.getConditional_ShapeAccess().getShape_1ShapeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeAccess().getShape_1ShapeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Shape_1Assignment_4_0"


    // $ANTLR start "rule__Conditional_Shape__Nested_1Assignment_4_1"
    // InternalOnlineElm.g:7435:1: rule__Conditional_Shape__Nested_1Assignment_4_1 : ( ruleConditional_Shape ) ;
    public final void rule__Conditional_Shape__Nested_1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7439:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7440:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7440:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7441:3: ruleConditional_Shape
            {
             before(grammarAccess.getConditional_ShapeAccess().getNested_1Conditional_ShapeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeAccess().getNested_1Conditional_ShapeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Nested_1Assignment_4_1"


    // $ANTLR start "rule__Conditional_Shape__Shape_2Assignment_8_0"
    // InternalOnlineElm.g:7450:1: rule__Conditional_Shape__Shape_2Assignment_8_0 : ( ruleShape ) ;
    public final void rule__Conditional_Shape__Shape_2Assignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7454:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:7455:2: ( ruleShape )
            {
            // InternalOnlineElm.g:7455:2: ( ruleShape )
            // InternalOnlineElm.g:7456:3: ruleShape
            {
             before(grammarAccess.getConditional_ShapeAccess().getShape_2ShapeParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeAccess().getShape_2ShapeParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Shape_2Assignment_8_0"


    // $ANTLR start "rule__Conditional_Shape__Nested_2Assignment_8_1"
    // InternalOnlineElm.g:7465:1: rule__Conditional_Shape__Nested_2Assignment_8_1 : ( ruleConditional_Shape ) ;
    public final void rule__Conditional_Shape__Nested_2Assignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7469:1: ( ( ruleConditional_Shape ) )
            // InternalOnlineElm.g:7470:2: ( ruleConditional_Shape )
            {
            // InternalOnlineElm.g:7470:2: ( ruleConditional_Shape )
            // InternalOnlineElm.g:7471:3: ruleConditional_Shape
            {
             before(grammarAccess.getConditional_ShapeAccess().getNested_2Conditional_ShapeParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Shape();

            state._fsp--;

             after(grammarAccess.getConditional_ShapeAccess().getNested_2Conditional_ShapeParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Shape__Nested_2Assignment_8_1"


    // $ANTLR start "rule__Conditional_Color__Color_1Assignment_5_0"
    // InternalOnlineElm.g:7480:1: rule__Conditional_Color__Color_1Assignment_5_0 : ( ruleColor ) ;
    public final void rule__Conditional_Color__Color_1Assignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7484:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:7485:2: ( ruleColor )
            {
            // InternalOnlineElm.g:7485:2: ( ruleColor )
            // InternalOnlineElm.g:7486:3: ruleColor
            {
             before(grammarAccess.getConditional_ColorAccess().getColor_1ColorEnumRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getConditional_ColorAccess().getColor_1ColorEnumRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Color_1Assignment_5_0"


    // $ANTLR start "rule__Conditional_Color__Nested_1Assignment_5_1"
    // InternalOnlineElm.g:7495:1: rule__Conditional_Color__Nested_1Assignment_5_1 : ( ruleConditional_Color ) ;
    public final void rule__Conditional_Color__Nested_1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7499:1: ( ( ruleConditional_Color ) )
            // InternalOnlineElm.g:7500:2: ( ruleConditional_Color )
            {
            // InternalOnlineElm.g:7500:2: ( ruleConditional_Color )
            // InternalOnlineElm.g:7501:3: ruleConditional_Color
            {
             before(grammarAccess.getConditional_ColorAccess().getNested_1Conditional_ColorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Color();

            state._fsp--;

             after(grammarAccess.getConditional_ColorAccess().getNested_1Conditional_ColorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Nested_1Assignment_5_1"


    // $ANTLR start "rule__Conditional_Color__Color_2Assignment_9_0"
    // InternalOnlineElm.g:7510:1: rule__Conditional_Color__Color_2Assignment_9_0 : ( ruleColor ) ;
    public final void rule__Conditional_Color__Color_2Assignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7514:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:7515:2: ( ruleColor )
            {
            // InternalOnlineElm.g:7515:2: ( ruleColor )
            // InternalOnlineElm.g:7516:3: ruleColor
            {
             before(grammarAccess.getConditional_ColorAccess().getColor_2ColorEnumRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getConditional_ColorAccess().getColor_2ColorEnumRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Color_2Assignment_9_0"


    // $ANTLR start "rule__Conditional_Color__Nested_2Assignment_9_1"
    // InternalOnlineElm.g:7525:1: rule__Conditional_Color__Nested_2Assignment_9_1 : ( ruleConditional_Color ) ;
    public final void rule__Conditional_Color__Nested_2Assignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7529:1: ( ( ruleConditional_Color ) )
            // InternalOnlineElm.g:7530:2: ( ruleConditional_Color )
            {
            // InternalOnlineElm.g:7530:2: ( ruleConditional_Color )
            // InternalOnlineElm.g:7531:3: ruleConditional_Color
            {
             before(grammarAccess.getConditional_ColorAccess().getNested_2Conditional_ColorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Color();

            state._fsp--;

             after(grammarAccess.getConditional_ColorAccess().getNested_2Conditional_ColorParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Color__Nested_2Assignment_9_1"


    // $ANTLR start "rule__Conditional_Num__Num_1Assignment_5_0"
    // InternalOnlineElm.g:7540:1: rule__Conditional_Num__Num_1Assignment_5_0 : ( RULE_FLOAT ) ;
    public final void rule__Conditional_Num__Num_1Assignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7544:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:7545:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:7545:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:7546:3: RULE_FLOAT
            {
             before(grammarAccess.getConditional_NumAccess().getNum_1FLOATTerminalRuleCall_5_0_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getNum_1FLOATTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Num_1Assignment_5_0"


    // $ANTLR start "rule__Conditional_Num__Nested_1Assignment_5_1"
    // InternalOnlineElm.g:7555:1: rule__Conditional_Num__Nested_1Assignment_5_1 : ( ruleConditional_Num ) ;
    public final void rule__Conditional_Num__Nested_1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7559:1: ( ( ruleConditional_Num ) )
            // InternalOnlineElm.g:7560:2: ( ruleConditional_Num )
            {
            // InternalOnlineElm.g:7560:2: ( ruleConditional_Num )
            // InternalOnlineElm.g:7561:3: ruleConditional_Num
            {
             before(grammarAccess.getConditional_NumAccess().getNested_1Conditional_NumParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Num();

            state._fsp--;

             after(grammarAccess.getConditional_NumAccess().getNested_1Conditional_NumParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Nested_1Assignment_5_1"


    // $ANTLR start "rule__Conditional_Num__Num_2Assignment_9_0"
    // InternalOnlineElm.g:7570:1: rule__Conditional_Num__Num_2Assignment_9_0 : ( RULE_FLOAT ) ;
    public final void rule__Conditional_Num__Num_2Assignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7574:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:7575:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:7575:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:7576:3: RULE_FLOAT
            {
             before(grammarAccess.getConditional_NumAccess().getNum_2FLOATTerminalRuleCall_9_0_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getConditional_NumAccess().getNum_2FLOATTerminalRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Num_2Assignment_9_0"


    // $ANTLR start "rule__Conditional_Num__Nested_2Assignment_9_1"
    // InternalOnlineElm.g:7585:1: rule__Conditional_Num__Nested_2Assignment_9_1 : ( ruleConditional_Num ) ;
    public final void rule__Conditional_Num__Nested_2Assignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7589:1: ( ( ruleConditional_Num ) )
            // InternalOnlineElm.g:7590:2: ( ruleConditional_Num )
            {
            // InternalOnlineElm.g:7590:2: ( ruleConditional_Num )
            // InternalOnlineElm.g:7591:3: ruleConditional_Num
            {
             before(grammarAccess.getConditional_NumAccess().getNested_2Conditional_NumParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Num();

            state._fsp--;

             after(grammarAccess.getConditional_NumAccess().getNested_2Conditional_NumParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Num__Nested_2Assignment_9_1"


    // $ANTLR start "rule__Conditional_Str__Str_1Assignment_5_0"
    // InternalOnlineElm.g:7600:1: rule__Conditional_Str__Str_1Assignment_5_0 : ( RULE_STRING ) ;
    public final void rule__Conditional_Str__Str_1Assignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7604:1: ( ( RULE_STRING ) )
            // InternalOnlineElm.g:7605:2: ( RULE_STRING )
            {
            // InternalOnlineElm.g:7605:2: ( RULE_STRING )
            // InternalOnlineElm.g:7606:3: RULE_STRING
            {
             before(grammarAccess.getConditional_StrAccess().getStr_1STRINGTerminalRuleCall_5_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getStr_1STRINGTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Str_1Assignment_5_0"


    // $ANTLR start "rule__Conditional_Str__Nested_1Assignment_5_1"
    // InternalOnlineElm.g:7615:1: rule__Conditional_Str__Nested_1Assignment_5_1 : ( ruleConditional_Str ) ;
    public final void rule__Conditional_Str__Nested_1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7619:1: ( ( ruleConditional_Str ) )
            // InternalOnlineElm.g:7620:2: ( ruleConditional_Str )
            {
            // InternalOnlineElm.g:7620:2: ( ruleConditional_Str )
            // InternalOnlineElm.g:7621:3: ruleConditional_Str
            {
             before(grammarAccess.getConditional_StrAccess().getNested_1Conditional_StrParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Str();

            state._fsp--;

             after(grammarAccess.getConditional_StrAccess().getNested_1Conditional_StrParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Nested_1Assignment_5_1"


    // $ANTLR start "rule__Conditional_Str__Str_2Assignment_8_0"
    // InternalOnlineElm.g:7630:1: rule__Conditional_Str__Str_2Assignment_8_0 : ( RULE_STRING ) ;
    public final void rule__Conditional_Str__Str_2Assignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7634:1: ( ( RULE_STRING ) )
            // InternalOnlineElm.g:7635:2: ( RULE_STRING )
            {
            // InternalOnlineElm.g:7635:2: ( RULE_STRING )
            // InternalOnlineElm.g:7636:3: RULE_STRING
            {
             before(grammarAccess.getConditional_StrAccess().getStr_2STRINGTerminalRuleCall_8_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditional_StrAccess().getStr_2STRINGTerminalRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Str_2Assignment_8_0"


    // $ANTLR start "rule__Conditional_Str__Nested_2Assignment_8_1"
    // InternalOnlineElm.g:7645:1: rule__Conditional_Str__Nested_2Assignment_8_1 : ( ruleConditional_Str ) ;
    public final void rule__Conditional_Str__Nested_2Assignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7649:1: ( ( ruleConditional_Str ) )
            // InternalOnlineElm.g:7650:2: ( ruleConditional_Str )
            {
            // InternalOnlineElm.g:7650:2: ( ruleConditional_Str )
            // InternalOnlineElm.g:7651:3: ruleConditional_Str
            {
             before(grammarAccess.getConditional_StrAccess().getNested_2Conditional_StrParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Str();

            state._fsp--;

             after(grammarAccess.getConditional_StrAccess().getNested_2Conditional_StrParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_Str__Nested_2Assignment_8_1"


    // $ANTLR start "rule__Or_expr__RightAssignment_1_2"
    // InternalOnlineElm.g:7660:1: rule__Or_expr__RightAssignment_1_2 : ( ruleAnd_expr ) ;
    public final void rule__Or_expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7664:1: ( ( ruleAnd_expr ) )
            // InternalOnlineElm.g:7665:2: ( ruleAnd_expr )
            {
            // InternalOnlineElm.g:7665:2: ( ruleAnd_expr )
            // InternalOnlineElm.g:7666:3: ruleAnd_expr
            {
             before(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__RightAssignment_1_2"


    // $ANTLR start "rule__And_expr__RightAssignment_1_2"
    // InternalOnlineElm.g:7675:1: rule__And_expr__RightAssignment_1_2 : ( ruleNot_expr ) ;
    public final void rule__And_expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7679:1: ( ( ruleNot_expr ) )
            // InternalOnlineElm.g:7680:2: ( ruleNot_expr )
            {
            // InternalOnlineElm.g:7680:2: ( ruleNot_expr )
            // InternalOnlineElm.g:7681:3: ruleNot_expr
            {
             before(grammarAccess.getAnd_exprAccess().getRightNot_exprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNot_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprAccess().getRightNot_exprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__RightAssignment_1_2"


    // $ANTLR start "rule__Not_expr__OperandAssignment_0_2"
    // InternalOnlineElm.g:7690:1: rule__Not_expr__OperandAssignment_0_2 : ( ruleNot_expr ) ;
    public final void rule__Not_expr__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7694:1: ( ( ruleNot_expr ) )
            // InternalOnlineElm.g:7695:2: ( ruleNot_expr )
            {
            // InternalOnlineElm.g:7695:2: ( ruleNot_expr )
            // InternalOnlineElm.g:7696:3: ruleNot_expr
            {
             before(grammarAccess.getNot_exprAccess().getOperandNot_exprParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNot_expr();

            state._fsp--;

             after(grammarAccess.getNot_exprAccess().getOperandNot_exprParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not_expr__OperandAssignment_0_2"


    // $ANTLR start "rule__Compare_expr__LeftAssignment_0"
    // InternalOnlineElm.g:7705:1: rule__Compare_expr__LeftAssignment_0 : ( ruleNum_value ) ;
    public final void rule__Compare_expr__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7709:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7710:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7710:2: ( ruleNum_value )
            // InternalOnlineElm.g:7711:3: ruleNum_value
            {
             before(grammarAccess.getCompare_exprAccess().getLeftNum_valueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getCompare_exprAccess().getLeftNum_valueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__LeftAssignment_0"


    // $ANTLR start "rule__Compare_expr__OperatorAssignment_1_1"
    // InternalOnlineElm.g:7720:1: rule__Compare_expr__OperatorAssignment_1_1 : ( ( rule__Compare_expr__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Compare_expr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7724:1: ( ( ( rule__Compare_expr__OperatorAlternatives_1_1_0 ) ) )
            // InternalOnlineElm.g:7725:2: ( ( rule__Compare_expr__OperatorAlternatives_1_1_0 ) )
            {
            // InternalOnlineElm.g:7725:2: ( ( rule__Compare_expr__OperatorAlternatives_1_1_0 ) )
            // InternalOnlineElm.g:7726:3: ( rule__Compare_expr__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getCompare_exprAccess().getOperatorAlternatives_1_1_0()); 
            // InternalOnlineElm.g:7727:3: ( rule__Compare_expr__OperatorAlternatives_1_1_0 )
            // InternalOnlineElm.g:7727:4: rule__Compare_expr__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Compare_expr__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompare_exprAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__OperatorAssignment_1_1"


    // $ANTLR start "rule__Compare_expr__RightAssignment_1_2"
    // InternalOnlineElm.g:7735:1: rule__Compare_expr__RightAssignment_1_2 : ( ruleNum_value ) ;
    public final void rule__Compare_expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7739:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7740:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7740:2: ( ruleNum_value )
            // InternalOnlineElm.g:7741:3: ruleNum_value
            {
             before(grammarAccess.getCompare_exprAccess().getRightNum_valueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getCompare_exprAccess().getRightNum_valueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare_expr__RightAssignment_1_2"


    // $ANTLR start "rule__Num_value__LocalAssignment_2"
    // InternalOnlineElm.g:7750:1: rule__Num_value__LocalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Num_value__LocalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7754:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:7755:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:7755:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:7756:3: ( RULE_ID )
            {
             before(grammarAccess.getNum_valueAccess().getLocalLocal_varCrossReference_2_0()); 
            // InternalOnlineElm.g:7757:3: ( RULE_ID )
            // InternalOnlineElm.g:7758:4: RULE_ID
            {
             before(grammarAccess.getNum_valueAccess().getLocalLocal_varIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNum_valueAccess().getLocalLocal_varIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNum_valueAccess().getLocalLocal_varCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num_value__LocalAssignment_2"


    // $ANTLR start "rule__Num_value__RefAssignment_3"
    // InternalOnlineElm.g:7769:1: rule__Num_value__RefAssignment_3 : ( ruleRef_var ) ;
    public final void rule__Num_value__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7773:1: ( ( ruleRef_var ) )
            // InternalOnlineElm.g:7774:2: ( ruleRef_var )
            {
            // InternalOnlineElm.g:7774:2: ( ruleRef_var )
            // InternalOnlineElm.g:7775:3: ruleRef_var
            {
             before(grammarAccess.getNum_valueAccess().getRefRef_varParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRef_var();

            state._fsp--;

             after(grammarAccess.getNum_valueAccess().getRefRef_varParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num_value__RefAssignment_3"


    // $ANTLR start "rule__Math_exp__OpAssignment_1_1"
    // InternalOnlineElm.g:7784:1: rule__Math_exp__OpAssignment_1_1 : ( ruleMATH_OP ) ;
    public final void rule__Math_exp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7788:1: ( ( ruleMATH_OP ) )
            // InternalOnlineElm.g:7789:2: ( ruleMATH_OP )
            {
            // InternalOnlineElm.g:7789:2: ( ruleMATH_OP )
            // InternalOnlineElm.g:7790:3: ruleMATH_OP
            {
             before(grammarAccess.getMath_expAccess().getOpMATH_OPEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMATH_OP();

            state._fsp--;

             after(grammarAccess.getMath_expAccess().getOpMATH_OPEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__OpAssignment_1_1"


    // $ANTLR start "rule__Math_exp__RightAssignment_1_2"
    // InternalOnlineElm.g:7799:1: rule__Math_exp__RightAssignment_1_2 : ( ruleTerminal_math_exp ) ;
    public final void rule__Math_exp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7803:1: ( ( ruleTerminal_math_exp ) )
            // InternalOnlineElm.g:7804:2: ( ruleTerminal_math_exp )
            {
            // InternalOnlineElm.g:7804:2: ( ruleTerminal_math_exp )
            // InternalOnlineElm.g:7805:3: ruleTerminal_math_exp
            {
             before(grammarAccess.getMath_expAccess().getRightTerminal_math_expParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal_math_exp();

            state._fsp--;

             after(grammarAccess.getMath_expAccess().getRightTerminal_math_expParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__RightAssignment_1_2"


    // $ANTLR start "rule__Terminal_math_exp__ValueAssignment_1_1"
    // InternalOnlineElm.g:7814:1: rule__Terminal_math_exp__ValueAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__Terminal_math_exp__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7818:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:7819:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:7819:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:7820:3: RULE_FLOAT
            {
             before(grammarAccess.getTerminal_math_expAccess().getValueFLOATTerminalRuleCall_1_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getTerminal_math_expAccess().getValueFLOATTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_math_exp__ValueAssignment_1_1"


    // $ANTLR start "rule__Circle__NameAssignment_0"
    // InternalOnlineElm.g:7829:1: rule__Circle__NameAssignment_0 : ( ( 'circle' ) ) ;
    public final void rule__Circle__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7833:1: ( ( ( 'circle' ) ) )
            // InternalOnlineElm.g:7834:2: ( ( 'circle' ) )
            {
            // InternalOnlineElm.g:7834:2: ( ( 'circle' ) )
            // InternalOnlineElm.g:7835:3: ( 'circle' )
            {
             before(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            // InternalOnlineElm.g:7836:3: ( 'circle' )
            // InternalOnlineElm.g:7837:4: 'circle'
            {
             before(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 

            }

             after(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__NameAssignment_0"


    // $ANTLR start "rule__Circle__RadiusAssignment_1"
    // InternalOnlineElm.g:7848:1: rule__Circle__RadiusAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Circle__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7852:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7853:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7853:2: ( ruleNum_value )
            // InternalOnlineElm.g:7854:3: ruleNum_value
            {
             before(grammarAccess.getCircleAccess().getRadiusNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getRadiusNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__RadiusAssignment_1"


    // $ANTLR start "rule__Rect__NameAssignment_0"
    // InternalOnlineElm.g:7863:1: rule__Rect__NameAssignment_0 : ( ( 'rect' ) ) ;
    public final void rule__Rect__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7867:1: ( ( ( 'rect' ) ) )
            // InternalOnlineElm.g:7868:2: ( ( 'rect' ) )
            {
            // InternalOnlineElm.g:7868:2: ( ( 'rect' ) )
            // InternalOnlineElm.g:7869:3: ( 'rect' )
            {
             before(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            // InternalOnlineElm.g:7870:3: ( 'rect' )
            // InternalOnlineElm.g:7871:4: 'rect'
            {
             before(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 

            }

             after(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__NameAssignment_0"


    // $ANTLR start "rule__Rect__WidthAssignment_1"
    // InternalOnlineElm.g:7882:1: rule__Rect__WidthAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Rect__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7886:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7887:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7887:2: ( ruleNum_value )
            // InternalOnlineElm.g:7888:3: ruleNum_value
            {
             before(grammarAccess.getRectAccess().getWidthNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRectAccess().getWidthNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__WidthAssignment_1"


    // $ANTLR start "rule__Rect__HeightAssignment_2"
    // InternalOnlineElm.g:7897:1: rule__Rect__HeightAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Rect__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7901:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7902:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7902:2: ( ruleNum_value )
            // InternalOnlineElm.g:7903:3: ruleNum_value
            {
             before(grammarAccess.getRectAccess().getHeightNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRectAccess().getHeightNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__HeightAssignment_2"


    // $ANTLR start "rule__Square__NameAssignment_0"
    // InternalOnlineElm.g:7912:1: rule__Square__NameAssignment_0 : ( ( 'square' ) ) ;
    public final void rule__Square__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7916:1: ( ( ( 'square' ) ) )
            // InternalOnlineElm.g:7917:2: ( ( 'square' ) )
            {
            // InternalOnlineElm.g:7917:2: ( ( 'square' ) )
            // InternalOnlineElm.g:7918:3: ( 'square' )
            {
             before(grammarAccess.getSquareAccess().getNameSquareKeyword_0_0()); 
            // InternalOnlineElm.g:7919:3: ( 'square' )
            // InternalOnlineElm.g:7920:4: 'square'
            {
             before(grammarAccess.getSquareAccess().getNameSquareKeyword_0_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getSquareAccess().getNameSquareKeyword_0_0()); 

            }

             after(grammarAccess.getSquareAccess().getNameSquareKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__NameAssignment_0"


    // $ANTLR start "rule__Square__SideAssignment_1"
    // InternalOnlineElm.g:7931:1: rule__Square__SideAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Square__SideAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7935:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7936:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7936:2: ( ruleNum_value )
            // InternalOnlineElm.g:7937:3: ruleNum_value
            {
             before(grammarAccess.getSquareAccess().getSideNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getSquareAccess().getSideNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__SideAssignment_1"


    // $ANTLR start "rule__RoundedRect__NameAssignment_0"
    // InternalOnlineElm.g:7946:1: rule__RoundedRect__NameAssignment_0 : ( ( 'roundedRect' ) ) ;
    public final void rule__RoundedRect__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7950:1: ( ( ( 'roundedRect' ) ) )
            // InternalOnlineElm.g:7951:2: ( ( 'roundedRect' ) )
            {
            // InternalOnlineElm.g:7951:2: ( ( 'roundedRect' ) )
            // InternalOnlineElm.g:7952:3: ( 'roundedRect' )
            {
             before(grammarAccess.getRoundedRectAccess().getNameRoundedRectKeyword_0_0()); 
            // InternalOnlineElm.g:7953:3: ( 'roundedRect' )
            // InternalOnlineElm.g:7954:4: 'roundedRect'
            {
             before(grammarAccess.getRoundedRectAccess().getNameRoundedRectKeyword_0_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getRoundedRectAccess().getNameRoundedRectKeyword_0_0()); 

            }

             after(grammarAccess.getRoundedRectAccess().getNameRoundedRectKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__NameAssignment_0"


    // $ANTLR start "rule__RoundedRect__WidthAssignment_1"
    // InternalOnlineElm.g:7965:1: rule__RoundedRect__WidthAssignment_1 : ( ruleNum_value ) ;
    public final void rule__RoundedRect__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7969:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7970:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7970:2: ( ruleNum_value )
            // InternalOnlineElm.g:7971:3: ruleNum_value
            {
             before(grammarAccess.getRoundedRectAccess().getWidthNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRoundedRectAccess().getWidthNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__WidthAssignment_1"


    // $ANTLR start "rule__RoundedRect__HeightAssignment_2"
    // InternalOnlineElm.g:7980:1: rule__RoundedRect__HeightAssignment_2 : ( ruleNum_value ) ;
    public final void rule__RoundedRect__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7984:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:7985:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:7985:2: ( ruleNum_value )
            // InternalOnlineElm.g:7986:3: ruleNum_value
            {
             before(grammarAccess.getRoundedRectAccess().getHeightNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRoundedRectAccess().getHeightNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__HeightAssignment_2"


    // $ANTLR start "rule__RoundedRect__Corner_radiusAssignment_3"
    // InternalOnlineElm.g:7995:1: rule__RoundedRect__Corner_radiusAssignment_3 : ( ruleNum_value ) ;
    public final void rule__RoundedRect__Corner_radiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:7999:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8000:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8000:2: ( ruleNum_value )
            // InternalOnlineElm.g:8001:3: ruleNum_value
            {
             before(grammarAccess.getRoundedRectAccess().getCorner_radiusNum_valueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRoundedRectAccess().getCorner_radiusNum_valueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundedRect__Corner_radiusAssignment_3"


    // $ANTLR start "rule__Oval__NameAssignment_0"
    // InternalOnlineElm.g:8010:1: rule__Oval__NameAssignment_0 : ( ( 'oval' ) ) ;
    public final void rule__Oval__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8014:1: ( ( ( 'oval' ) ) )
            // InternalOnlineElm.g:8015:2: ( ( 'oval' ) )
            {
            // InternalOnlineElm.g:8015:2: ( ( 'oval' ) )
            // InternalOnlineElm.g:8016:3: ( 'oval' )
            {
             before(grammarAccess.getOvalAccess().getNameOvalKeyword_0_0()); 
            // InternalOnlineElm.g:8017:3: ( 'oval' )
            // InternalOnlineElm.g:8018:4: 'oval'
            {
             before(grammarAccess.getOvalAccess().getNameOvalKeyword_0_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getOvalAccess().getNameOvalKeyword_0_0()); 

            }

             after(grammarAccess.getOvalAccess().getNameOvalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__NameAssignment_0"


    // $ANTLR start "rule__Oval__WidthAssignment_1"
    // InternalOnlineElm.g:8029:1: rule__Oval__WidthAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Oval__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8033:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8034:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8034:2: ( ruleNum_value )
            // InternalOnlineElm.g:8035:3: ruleNum_value
            {
             before(grammarAccess.getOvalAccess().getWidthNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getOvalAccess().getWidthNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__WidthAssignment_1"


    // $ANTLR start "rule__Oval__HeightAssignment_2"
    // InternalOnlineElm.g:8044:1: rule__Oval__HeightAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Oval__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8048:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8049:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8049:2: ( ruleNum_value )
            // InternalOnlineElm.g:8050:3: ruleNum_value
            {
             before(grammarAccess.getOvalAccess().getHeightNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getOvalAccess().getHeightNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oval__HeightAssignment_2"


    // $ANTLR start "rule__Ngon__NameAssignment_0"
    // InternalOnlineElm.g:8059:1: rule__Ngon__NameAssignment_0 : ( ( 'ngon' ) ) ;
    public final void rule__Ngon__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8063:1: ( ( ( 'ngon' ) ) )
            // InternalOnlineElm.g:8064:2: ( ( 'ngon' ) )
            {
            // InternalOnlineElm.g:8064:2: ( ( 'ngon' ) )
            // InternalOnlineElm.g:8065:3: ( 'ngon' )
            {
             before(grammarAccess.getNgonAccess().getNameNgonKeyword_0_0()); 
            // InternalOnlineElm.g:8066:3: ( 'ngon' )
            // InternalOnlineElm.g:8067:4: 'ngon'
            {
             before(grammarAccess.getNgonAccess().getNameNgonKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getNgonAccess().getNameNgonKeyword_0_0()); 

            }

             after(grammarAccess.getNgonAccess().getNameNgonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__NameAssignment_0"


    // $ANTLR start "rule__Ngon__Sides_numAssignment_1"
    // InternalOnlineElm.g:8078:1: rule__Ngon__Sides_numAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Ngon__Sides_numAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8082:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8083:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8083:2: ( ruleNum_value )
            // InternalOnlineElm.g:8084:3: ruleNum_value
            {
             before(grammarAccess.getNgonAccess().getSides_numNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getNgonAccess().getSides_numNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__Sides_numAssignment_1"


    // $ANTLR start "rule__Ngon__RadiusAssignment_2"
    // InternalOnlineElm.g:8093:1: rule__Ngon__RadiusAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Ngon__RadiusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8097:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8098:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8098:2: ( ruleNum_value )
            // InternalOnlineElm.g:8099:3: ruleNum_value
            {
             before(grammarAccess.getNgonAccess().getRadiusNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getNgonAccess().getRadiusNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ngon__RadiusAssignment_2"


    // $ANTLR start "rule__Wedge__NameAssignment_0"
    // InternalOnlineElm.g:8108:1: rule__Wedge__NameAssignment_0 : ( ( 'wedge' ) ) ;
    public final void rule__Wedge__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8112:1: ( ( ( 'wedge' ) ) )
            // InternalOnlineElm.g:8113:2: ( ( 'wedge' ) )
            {
            // InternalOnlineElm.g:8113:2: ( ( 'wedge' ) )
            // InternalOnlineElm.g:8114:3: ( 'wedge' )
            {
             before(grammarAccess.getWedgeAccess().getNameWedgeKeyword_0_0()); 
            // InternalOnlineElm.g:8115:3: ( 'wedge' )
            // InternalOnlineElm.g:8116:4: 'wedge'
            {
             before(grammarAccess.getWedgeAccess().getNameWedgeKeyword_0_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getWedgeAccess().getNameWedgeKeyword_0_0()); 

            }

             after(grammarAccess.getWedgeAccess().getNameWedgeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__NameAssignment_0"


    // $ANTLR start "rule__Wedge__RadiusAssignment_1"
    // InternalOnlineElm.g:8127:1: rule__Wedge__RadiusAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Wedge__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8131:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8132:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8132:2: ( ruleNum_value )
            // InternalOnlineElm.g:8133:3: ruleNum_value
            {
             before(grammarAccess.getWedgeAccess().getRadiusNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getWedgeAccess().getRadiusNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__RadiusAssignment_1"


    // $ANTLR start "rule__Wedge__FractionAssignment_2"
    // InternalOnlineElm.g:8142:1: rule__Wedge__FractionAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Wedge__FractionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8146:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8147:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8147:2: ( ruleNum_value )
            // InternalOnlineElm.g:8148:3: ruleNum_value
            {
             before(grammarAccess.getWedgeAccess().getFractionNum_valueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getWedgeAccess().getFractionNum_valueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wedge__FractionAssignment_2"


    // $ANTLR start "rule__Polygon__NameAssignment_0"
    // InternalOnlineElm.g:8157:1: rule__Polygon__NameAssignment_0 : ( ( 'polygon' ) ) ;
    public final void rule__Polygon__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8161:1: ( ( ( 'polygon' ) ) )
            // InternalOnlineElm.g:8162:2: ( ( 'polygon' ) )
            {
            // InternalOnlineElm.g:8162:2: ( ( 'polygon' ) )
            // InternalOnlineElm.g:8163:3: ( 'polygon' )
            {
             before(grammarAccess.getPolygonAccess().getNamePolygonKeyword_0_0()); 
            // InternalOnlineElm.g:8164:3: ( 'polygon' )
            // InternalOnlineElm.g:8165:4: 'polygon'
            {
             before(grammarAccess.getPolygonAccess().getNamePolygonKeyword_0_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getPolygonAccess().getNamePolygonKeyword_0_0()); 

            }

             after(grammarAccess.getPolygonAccess().getNamePolygonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__NameAssignment_0"


    // $ANTLR start "rule__Polygon__Point1Assignment_2"
    // InternalOnlineElm.g:8176:1: rule__Polygon__Point1Assignment_2 : ( rulePoint ) ;
    public final void rule__Polygon__Point1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8180:1: ( ( rulePoint ) )
            // InternalOnlineElm.g:8181:2: ( rulePoint )
            {
            // InternalOnlineElm.g:8181:2: ( rulePoint )
            // InternalOnlineElm.g:8182:3: rulePoint
            {
             before(grammarAccess.getPolygonAccess().getPoint1PointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPolygonAccess().getPoint1PointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__Point1Assignment_2"


    // $ANTLR start "rule__Polygon__PointsAssignment_3_1"
    // InternalOnlineElm.g:8191:1: rule__Polygon__PointsAssignment_3_1 : ( rulePoint ) ;
    public final void rule__Polygon__PointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8195:1: ( ( rulePoint ) )
            // InternalOnlineElm.g:8196:2: ( rulePoint )
            {
            // InternalOnlineElm.g:8196:2: ( rulePoint )
            // InternalOnlineElm.g:8197:3: rulePoint
            {
             before(grammarAccess.getPolygonAccess().getPointsPointParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPolygonAccess().getPointsPointParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polygon__PointsAssignment_3_1"


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalOnlineElm.g:8206:1: rule__Point__XAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8210:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8211:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8211:2: ( ruleNum_value )
            // InternalOnlineElm.g:8212:3: ruleNum_value
            {
             before(grammarAccess.getPointAccess().getXNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getPointAccess().getXNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__XAssignment_1"


    // $ANTLR start "rule__Point__YAssignment_3"
    // InternalOnlineElm.g:8221:1: rule__Point__YAssignment_3 : ( ruleNum_value ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8225:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8226:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8226:2: ( ruleNum_value )
            // InternalOnlineElm.g:8227:3: ruleNum_value
            {
             before(grammarAccess.getPointAccess().getYNum_valueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getPointAccess().getYNum_valueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__YAssignment_3"


    // $ANTLR start "rule__Text__NameAssignment_0"
    // InternalOnlineElm.g:8236:1: rule__Text__NameAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__Text__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8240:1: ( ( ( 'text' ) ) )
            // InternalOnlineElm.g:8241:2: ( ( 'text' ) )
            {
            // InternalOnlineElm.g:8241:2: ( ( 'text' ) )
            // InternalOnlineElm.g:8242:3: ( 'text' )
            {
             before(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            // InternalOnlineElm.g:8243:3: ( 'text' )
            // InternalOnlineElm.g:8244:4: 'text'
            {
             before(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 

            }

             after(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_0"


    // $ANTLR start "rule__Text__ContentAssignment_1_0"
    // InternalOnlineElm.g:8255:1: rule__Text__ContentAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Text__ContentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8259:1: ( ( RULE_STRING ) )
            // InternalOnlineElm.g:8260:2: ( RULE_STRING )
            {
            // InternalOnlineElm.g:8260:2: ( RULE_STRING )
            // InternalOnlineElm.g:8261:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ContentAssignment_1_0"


    // $ANTLR start "rule__Text__ConditionalContentAssignment_1_1"
    // InternalOnlineElm.g:8270:1: rule__Text__ConditionalContentAssignment_1_1 : ( ruleConditional_Str ) ;
    public final void rule__Text__ConditionalContentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8274:1: ( ( ruleConditional_Str ) )
            // InternalOnlineElm.g:8275:2: ( ruleConditional_Str )
            {
            // InternalOnlineElm.g:8275:2: ( ruleConditional_Str )
            // InternalOnlineElm.g:8276:3: ruleConditional_Str
            {
             before(grammarAccess.getTextAccess().getConditionalContentConditional_StrParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Str();

            state._fsp--;

             after(grammarAccess.getTextAccess().getConditionalContentConditional_StrParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ConditionalContentAssignment_1_1"


    // $ANTLR start "rule__Draw__FilledAssignment_0_0"
    // InternalOnlineElm.g:8285:1: rule__Draw__FilledAssignment_0_0 : ( ruleFilled ) ;
    public final void rule__Draw__FilledAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8289:1: ( ( ruleFilled ) )
            // InternalOnlineElm.g:8290:2: ( ruleFilled )
            {
            // InternalOnlineElm.g:8290:2: ( ruleFilled )
            // InternalOnlineElm.g:8291:3: ruleFilled
            {
             before(grammarAccess.getDrawAccess().getFilledFilledParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilled();

            state._fsp--;

             after(grammarAccess.getDrawAccess().getFilledFilledParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__FilledAssignment_0_0"


    // $ANTLR start "rule__Draw__OutlinedAssignment_0_1"
    // InternalOnlineElm.g:8300:1: rule__Draw__OutlinedAssignment_0_1 : ( ruleOutlined ) ;
    public final void rule__Draw__OutlinedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8304:1: ( ( ruleOutlined ) )
            // InternalOnlineElm.g:8305:2: ( ruleOutlined )
            {
            // InternalOnlineElm.g:8305:2: ( ruleOutlined )
            // InternalOnlineElm.g:8306:3: ruleOutlined
            {
             before(grammarAccess.getDrawAccess().getOutlinedOutlinedParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutlined();

            state._fsp--;

             after(grammarAccess.getDrawAccess().getOutlinedOutlinedParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__OutlinedAssignment_0_1"


    // $ANTLR start "rule__Draw__TransformAssignment_1_1"
    // InternalOnlineElm.g:8315:1: rule__Draw__TransformAssignment_1_1 : ( ruleTranform ) ;
    public final void rule__Draw__TransformAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8319:1: ( ( ruleTranform ) )
            // InternalOnlineElm.g:8320:2: ( ruleTranform )
            {
            // InternalOnlineElm.g:8320:2: ( ruleTranform )
            // InternalOnlineElm.g:8321:3: ruleTranform
            {
             before(grammarAccess.getDrawAccess().getTransformTranformParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTranform();

            state._fsp--;

             after(grammarAccess.getDrawAccess().getTransformTranformParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__TransformAssignment_1_1"


    // $ANTLR start "rule__Filled__NameAssignment_0"
    // InternalOnlineElm.g:8330:1: rule__Filled__NameAssignment_0 : ( ( 'filled' ) ) ;
    public final void rule__Filled__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8334:1: ( ( ( 'filled' ) ) )
            // InternalOnlineElm.g:8335:2: ( ( 'filled' ) )
            {
            // InternalOnlineElm.g:8335:2: ( ( 'filled' ) )
            // InternalOnlineElm.g:8336:3: ( 'filled' )
            {
             before(grammarAccess.getFilledAccess().getNameFilledKeyword_0_0()); 
            // InternalOnlineElm.g:8337:3: ( 'filled' )
            // InternalOnlineElm.g:8338:4: 'filled'
            {
             before(grammarAccess.getFilledAccess().getNameFilledKeyword_0_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getNameFilledKeyword_0_0()); 

            }

             after(grammarAccess.getFilledAccess().getNameFilledKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__NameAssignment_0"


    // $ANTLR start "rule__Filled__FilledColor1Assignment_1_0"
    // InternalOnlineElm.g:8349:1: rule__Filled__FilledColor1Assignment_1_0 : ( ruleColor ) ;
    public final void rule__Filled__FilledColor1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8353:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:8354:2: ( ruleColor )
            {
            // InternalOnlineElm.g:8354:2: ( ruleColor )
            // InternalOnlineElm.g:8355:3: ruleColor
            {
             before(grammarAccess.getFilledAccess().getFilledColor1ColorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getFilledAccess().getFilledColor1ColorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__FilledColor1Assignment_1_0"


    // $ANTLR start "rule__Filled__FilledColor2Assignment_1_1"
    // InternalOnlineElm.g:8364:1: rule__Filled__FilledColor2Assignment_1_1 : ( ruleConditional_Color ) ;
    public final void rule__Filled__FilledColor2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8368:1: ( ( ruleConditional_Color ) )
            // InternalOnlineElm.g:8369:2: ( ruleConditional_Color )
            {
            // InternalOnlineElm.g:8369:2: ( ruleConditional_Color )
            // InternalOnlineElm.g:8370:3: ruleConditional_Color
            {
             before(grammarAccess.getFilledAccess().getFilledColor2Conditional_ColorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Color();

            state._fsp--;

             after(grammarAccess.getFilledAccess().getFilledColor2Conditional_ColorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__FilledColor2Assignment_1_1"


    // $ANTLR start "rule__Filled__LineType1Assignment_2_3"
    // InternalOnlineElm.g:8379:1: rule__Filled__LineType1Assignment_2_3 : ( ruleLineType ) ;
    public final void rule__Filled__LineType1Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8383:1: ( ( ruleLineType ) )
            // InternalOnlineElm.g:8384:2: ( ruleLineType )
            {
            // InternalOnlineElm.g:8384:2: ( ruleLineType )
            // InternalOnlineElm.g:8385:3: ruleLineType
            {
             before(grammarAccess.getFilledAccess().getLineType1LineTypeEnumRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLineType();

            state._fsp--;

             after(grammarAccess.getFilledAccess().getLineType1LineTypeEnumRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__LineType1Assignment_2_3"


    // $ANTLR start "rule__Filled__Width1Assignment_2_4"
    // InternalOnlineElm.g:8394:1: rule__Filled__Width1Assignment_2_4 : ( RULE_FLOAT ) ;
    public final void rule__Filled__Width1Assignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8398:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:8399:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:8399:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:8400:3: RULE_FLOAT
            {
             before(grammarAccess.getFilledAccess().getWidth1FLOATTerminalRuleCall_2_4_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getFilledAccess().getWidth1FLOATTerminalRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Width1Assignment_2_4"


    // $ANTLR start "rule__Filled__Outline_color1Assignment_2_6"
    // InternalOnlineElm.g:8409:1: rule__Filled__Outline_color1Assignment_2_6 : ( ruleColor ) ;
    public final void rule__Filled__Outline_color1Assignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8413:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:8414:2: ( ruleColor )
            {
            // InternalOnlineElm.g:8414:2: ( ruleColor )
            // InternalOnlineElm.g:8415:3: ruleColor
            {
             before(grammarAccess.getFilledAccess().getOutline_color1ColorEnumRuleCall_2_6_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getFilledAccess().getOutline_color1ColorEnumRuleCall_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filled__Outline_color1Assignment_2_6"


    // $ANTLR start "rule__Outlined__NameAssignment_0"
    // InternalOnlineElm.g:8424:1: rule__Outlined__NameAssignment_0 : ( ( 'outlined' ) ) ;
    public final void rule__Outlined__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8428:1: ( ( ( 'outlined' ) ) )
            // InternalOnlineElm.g:8429:2: ( ( 'outlined' ) )
            {
            // InternalOnlineElm.g:8429:2: ( ( 'outlined' ) )
            // InternalOnlineElm.g:8430:3: ( 'outlined' )
            {
             before(grammarAccess.getOutlinedAccess().getNameOutlinedKeyword_0_0()); 
            // InternalOnlineElm.g:8431:3: ( 'outlined' )
            // InternalOnlineElm.g:8432:4: 'outlined'
            {
             before(grammarAccess.getOutlinedAccess().getNameOutlinedKeyword_0_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getOutlinedAccess().getNameOutlinedKeyword_0_0()); 

            }

             after(grammarAccess.getOutlinedAccess().getNameOutlinedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__NameAssignment_0"


    // $ANTLR start "rule__Outlined__LineTypeAssignment_2"
    // InternalOnlineElm.g:8443:1: rule__Outlined__LineTypeAssignment_2 : ( ruleLineType ) ;
    public final void rule__Outlined__LineTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8447:1: ( ( ruleLineType ) )
            // InternalOnlineElm.g:8448:2: ( ruleLineType )
            {
            // InternalOnlineElm.g:8448:2: ( ruleLineType )
            // InternalOnlineElm.g:8449:3: ruleLineType
            {
             before(grammarAccess.getOutlinedAccess().getLineTypeLineTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLineType();

            state._fsp--;

             after(grammarAccess.getOutlinedAccess().getLineTypeLineTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__LineTypeAssignment_2"


    // $ANTLR start "rule__Outlined__WidthAssignment_3"
    // InternalOnlineElm.g:8458:1: rule__Outlined__WidthAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Outlined__WidthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8462:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:8463:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:8463:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:8464:3: RULE_FLOAT
            {
             before(grammarAccess.getOutlinedAccess().getWidthFLOATTerminalRuleCall_3_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getOutlinedAccess().getWidthFLOATTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__WidthAssignment_3"


    // $ANTLR start "rule__Outlined__OutlinedColor1Assignment_5_0"
    // InternalOnlineElm.g:8473:1: rule__Outlined__OutlinedColor1Assignment_5_0 : ( ruleColor ) ;
    public final void rule__Outlined__OutlinedColor1Assignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8477:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:8478:2: ( ruleColor )
            {
            // InternalOnlineElm.g:8478:2: ( ruleColor )
            // InternalOnlineElm.g:8479:3: ruleColor
            {
             before(grammarAccess.getOutlinedAccess().getOutlinedColor1ColorEnumRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getOutlinedAccess().getOutlinedColor1ColorEnumRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__OutlinedColor1Assignment_5_0"


    // $ANTLR start "rule__Outlined__OutlinedColor2Assignment_5_1"
    // InternalOnlineElm.g:8488:1: rule__Outlined__OutlinedColor2Assignment_5_1 : ( ruleConditional_Color ) ;
    public final void rule__Outlined__OutlinedColor2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8492:1: ( ( ruleConditional_Color ) )
            // InternalOnlineElm.g:8493:2: ( ruleConditional_Color )
            {
            // InternalOnlineElm.g:8493:2: ( ruleConditional_Color )
            // InternalOnlineElm.g:8494:3: ruleConditional_Color
            {
             before(grammarAccess.getOutlinedAccess().getOutlinedColor2Conditional_ColorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional_Color();

            state._fsp--;

             after(grammarAccess.getOutlinedAccess().getOutlinedColor2Conditional_ColorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outlined__OutlinedColor2Assignment_5_1"


    // $ANTLR start "rule__Move__NameAssignment_0"
    // InternalOnlineElm.g:8503:1: rule__Move__NameAssignment_0 : ( ( 'move' ) ) ;
    public final void rule__Move__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8507:1: ( ( ( 'move' ) ) )
            // InternalOnlineElm.g:8508:2: ( ( 'move' ) )
            {
            // InternalOnlineElm.g:8508:2: ( ( 'move' ) )
            // InternalOnlineElm.g:8509:3: ( 'move' )
            {
             before(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            // InternalOnlineElm.g:8510:3: ( 'move' )
            // InternalOnlineElm.g:8511:4: 'move'
            {
             before(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 

            }

             after(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__NameAssignment_0"


    // $ANTLR start "rule__Move__PointAssignment_1"
    // InternalOnlineElm.g:8522:1: rule__Move__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__Move__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8526:1: ( ( rulePoint ) )
            // InternalOnlineElm.g:8527:2: ( rulePoint )
            {
            // InternalOnlineElm.g:8527:2: ( rulePoint )
            // InternalOnlineElm.g:8528:3: rulePoint
            {
             before(grammarAccess.getMoveAccess().getPointPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getPointPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__PointAssignment_1"


    // $ANTLR start "rule__Rotate__NameAssignment_0"
    // InternalOnlineElm.g:8537:1: rule__Rotate__NameAssignment_0 : ( ( 'rotate' ) ) ;
    public final void rule__Rotate__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8541:1: ( ( ( 'rotate' ) ) )
            // InternalOnlineElm.g:8542:2: ( ( 'rotate' ) )
            {
            // InternalOnlineElm.g:8542:2: ( ( 'rotate' ) )
            // InternalOnlineElm.g:8543:3: ( 'rotate' )
            {
             before(grammarAccess.getRotateAccess().getNameRotateKeyword_0_0()); 
            // InternalOnlineElm.g:8544:3: ( 'rotate' )
            // InternalOnlineElm.g:8545:4: 'rotate'
            {
             before(grammarAccess.getRotateAccess().getNameRotateKeyword_0_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getNameRotateKeyword_0_0()); 

            }

             after(grammarAccess.getRotateAccess().getNameRotateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__NameAssignment_0"


    // $ANTLR start "rule__Rotate__DegreeAssignment_3"
    // InternalOnlineElm.g:8556:1: rule__Rotate__DegreeAssignment_3 : ( ruleNum_value ) ;
    public final void rule__Rotate__DegreeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8560:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8561:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8561:2: ( ruleNum_value )
            // InternalOnlineElm.g:8562:3: ruleNum_value
            {
             before(grammarAccess.getRotateAccess().getDegreeNum_valueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getRotateAccess().getDegreeNum_valueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__DegreeAssignment_3"


    // $ANTLR start "rule__Scale__NameAssignment_0"
    // InternalOnlineElm.g:8571:1: rule__Scale__NameAssignment_0 : ( ( 'scale' ) ) ;
    public final void rule__Scale__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8575:1: ( ( ( 'scale' ) ) )
            // InternalOnlineElm.g:8576:2: ( ( 'scale' ) )
            {
            // InternalOnlineElm.g:8576:2: ( ( 'scale' ) )
            // InternalOnlineElm.g:8577:3: ( 'scale' )
            {
             before(grammarAccess.getScaleAccess().getNameScaleKeyword_0_0()); 
            // InternalOnlineElm.g:8578:3: ( 'scale' )
            // InternalOnlineElm.g:8579:4: 'scale'
            {
             before(grammarAccess.getScaleAccess().getNameScaleKeyword_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getScaleAccess().getNameScaleKeyword_0_0()); 

            }

             after(grammarAccess.getScaleAccess().getNameScaleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__NameAssignment_0"


    // $ANTLR start "rule__Scale__FactorAssignment_1"
    // InternalOnlineElm.g:8590:1: rule__Scale__FactorAssignment_1 : ( ruleNum_value ) ;
    public final void rule__Scale__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8594:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8595:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8595:2: ( ruleNum_value )
            // InternalOnlineElm.g:8596:3: ruleNum_value
            {
             before(grammarAccess.getScaleAccess().getFactorNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getScaleAccess().getFactorNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scale__FactorAssignment_1"


    // $ANTLR start "rule__ScaleX__NameAssignment_0"
    // InternalOnlineElm.g:8605:1: rule__ScaleX__NameAssignment_0 : ( ( 'scaleX' ) ) ;
    public final void rule__ScaleX__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8609:1: ( ( ( 'scaleX' ) ) )
            // InternalOnlineElm.g:8610:2: ( ( 'scaleX' ) )
            {
            // InternalOnlineElm.g:8610:2: ( ( 'scaleX' ) )
            // InternalOnlineElm.g:8611:3: ( 'scaleX' )
            {
             before(grammarAccess.getScaleXAccess().getNameScaleXKeyword_0_0()); 
            // InternalOnlineElm.g:8612:3: ( 'scaleX' )
            // InternalOnlineElm.g:8613:4: 'scaleX'
            {
             before(grammarAccess.getScaleXAccess().getNameScaleXKeyword_0_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getScaleXAccess().getNameScaleXKeyword_0_0()); 

            }

             after(grammarAccess.getScaleXAccess().getNameScaleXKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__NameAssignment_0"


    // $ANTLR start "rule__ScaleX__FactorAssignment_1"
    // InternalOnlineElm.g:8624:1: rule__ScaleX__FactorAssignment_1 : ( ruleNum_value ) ;
    public final void rule__ScaleX__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8628:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8629:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8629:2: ( ruleNum_value )
            // InternalOnlineElm.g:8630:3: ruleNum_value
            {
             before(grammarAccess.getScaleXAccess().getFactorNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getScaleXAccess().getFactorNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleX__FactorAssignment_1"


    // $ANTLR start "rule__ScaleY__NameAssignment_0"
    // InternalOnlineElm.g:8639:1: rule__ScaleY__NameAssignment_0 : ( ( 'scaleY' ) ) ;
    public final void rule__ScaleY__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8643:1: ( ( ( 'scaleY' ) ) )
            // InternalOnlineElm.g:8644:2: ( ( 'scaleY' ) )
            {
            // InternalOnlineElm.g:8644:2: ( ( 'scaleY' ) )
            // InternalOnlineElm.g:8645:3: ( 'scaleY' )
            {
             before(grammarAccess.getScaleYAccess().getNameScaleYKeyword_0_0()); 
            // InternalOnlineElm.g:8646:3: ( 'scaleY' )
            // InternalOnlineElm.g:8647:4: 'scaleY'
            {
             before(grammarAccess.getScaleYAccess().getNameScaleYKeyword_0_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getScaleYAccess().getNameScaleYKeyword_0_0()); 

            }

             after(grammarAccess.getScaleYAccess().getNameScaleYKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__NameAssignment_0"


    // $ANTLR start "rule__ScaleY__FactorAssignment_1"
    // InternalOnlineElm.g:8658:1: rule__ScaleY__FactorAssignment_1 : ( ruleNum_value ) ;
    public final void rule__ScaleY__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:8662:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:8663:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:8663:2: ( ruleNum_value )
            // InternalOnlineElm.g:8664:3: ruleNum_value
            {
             before(grammarAccess.getScaleYAccess().getFactorNum_valueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;

             after(grammarAccess.getScaleYAccess().getFactorNum_valueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScaleY__FactorAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L,0x0000000007FC0080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000008L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004160L,0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000007FC0080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004160L,0x0000000000004400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FC0080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFFFFFFFFC0000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x00000003E0000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xFFFFFFFFC0000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}