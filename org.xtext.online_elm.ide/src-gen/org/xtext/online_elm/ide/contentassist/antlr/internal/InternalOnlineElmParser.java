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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOnlineElmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'black'", "'red'", "'blue'", "'='", "'['", "']'", "','", "'++'", "'|>'", "'if'", "'then'", "'else'", "'not'", "'('", "')'", "'myShapes'", "'circle'", "'rect'", "'text'", "'filled'", "'move'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_FLOAT=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalOnlineElm.g:57:1: ( ruleOnlineElm EOF )
            // InternalOnlineElm.g:58:1: ruleOnlineElm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOnlineElmRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOnlineElm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOnlineElmRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOnlineElm"


    // $ANTLR start "ruleOnlineElm"
    // InternalOnlineElm.g:68:1: ruleOnlineElm : ( ( rule__OnlineElm__UnorderedGroup ) ) ;
    public final void ruleOnlineElm() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:73:2: ( ( ( rule__OnlineElm__UnorderedGroup ) ) )
            // InternalOnlineElm.g:74:2: ( ( rule__OnlineElm__UnorderedGroup ) )
            {
            // InternalOnlineElm.g:74:2: ( ( rule__OnlineElm__UnorderedGroup ) )
            // InternalOnlineElm.g:75:3: ( rule__OnlineElm__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOnlineElmAccess().getUnorderedGroup()); 
            }
            // InternalOnlineElm.g:76:3: ( rule__OnlineElm__UnorderedGroup )
            // InternalOnlineElm.g:76:4: rule__OnlineElm__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOnlineElmAccess().getUnorderedGroup()); 
            }

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
    // $ANTLR end "ruleOnlineElm"


    // $ANTLR start "entryRuleMainShape"
    // InternalOnlineElm.g:86:1: entryRuleMainShape : ruleMainShape EOF ;
    public final void entryRuleMainShape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:87:1: ( ruleMainShape EOF )
            // InternalOnlineElm.g:88:1: ruleMainShape EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMainShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMainShape"


    // $ANTLR start "ruleMainShape"
    // InternalOnlineElm.g:95:1: ruleMainShape : ( ( rule__MainShape__Group__0 ) ) ;
    public final void ruleMainShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:99:2: ( ( ( rule__MainShape__Group__0 ) ) )
            // InternalOnlineElm.g:100:2: ( ( rule__MainShape__Group__0 ) )
            {
            // InternalOnlineElm.g:100:2: ( ( rule__MainShape__Group__0 ) )
            // InternalOnlineElm.g:101:3: ( rule__MainShape__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getGroup()); 
            }
            // InternalOnlineElm.g:102:3: ( rule__MainShape__Group__0 )
            // InternalOnlineElm.g:102:4: rule__MainShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShapeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeDefAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:127:3: ( rule__ShapeDef__Alternatives )
            // InternalOnlineElm.g:127:4: rule__ShapeDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeDefAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleShapeGroup"
    // InternalOnlineElm.g:136:1: entryRuleShapeGroup : ruleShapeGroup EOF ;
    public final void entryRuleShapeGroup() throws RecognitionException {
        try {
            // InternalOnlineElm.g:137:1: ( ruleShapeGroup EOF )
            // InternalOnlineElm.g:138:1: ruleShapeGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShapeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleShapeGroup"


    // $ANTLR start "ruleShapeGroup"
    // InternalOnlineElm.g:145:1: ruleShapeGroup : ( ( rule__ShapeGroup__Group__0 ) ) ;
    public final void ruleShapeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:149:2: ( ( ( rule__ShapeGroup__Group__0 ) ) )
            // InternalOnlineElm.g:150:2: ( ( rule__ShapeGroup__Group__0 ) )
            {
            // InternalOnlineElm.g:150:2: ( ( rule__ShapeGroup__Group__0 ) )
            // InternalOnlineElm.g:151:3: ( rule__ShapeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getGroup()); 
            }
            // InternalOnlineElm.g:152:3: ( rule__ShapeGroup__Group__0 )
            // InternalOnlineElm.g:152:4: rule__ShapeGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeGroup"


    // $ANTLR start "entryRuleBasicShape"
    // InternalOnlineElm.g:161:1: entryRuleBasicShape : ruleBasicShape EOF ;
    public final void entryRuleBasicShape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:162:1: ( ruleBasicShape EOF )
            // InternalOnlineElm.g:163:1: ruleBasicShape EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:170:1: ruleBasicShape : ( ( rule__BasicShape__Group__0 ) ) ;
    public final void ruleBasicShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:174:2: ( ( ( rule__BasicShape__Group__0 ) ) )
            // InternalOnlineElm.g:175:2: ( ( rule__BasicShape__Group__0 ) )
            {
            // InternalOnlineElm.g:175:2: ( ( rule__BasicShape__Group__0 ) )
            // InternalOnlineElm.g:176:3: ( rule__BasicShape__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getGroup()); 
            }
            // InternalOnlineElm.g:177:3: ( rule__BasicShape__Group__0 )
            // InternalOnlineElm.g:177:4: rule__BasicShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:186:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalOnlineElm.g:187:1: ( ruleShape EOF )
            // InternalOnlineElm.g:188:1: ruleShape EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:195:1: ruleShape : ( ( rule__Shape__Alternatives ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:199:2: ( ( ( rule__Shape__Alternatives ) ) )
            // InternalOnlineElm.g:200:2: ( ( rule__Shape__Alternatives ) )
            {
            // InternalOnlineElm.g:200:2: ( ( rule__Shape__Alternatives ) )
            // InternalOnlineElm.g:201:3: ( rule__Shape__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:202:3: ( rule__Shape__Alternatives )
            // InternalOnlineElm.g:202:4: rule__Shape__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleConditional"
    // InternalOnlineElm.g:211:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalOnlineElm.g:212:1: ( ruleConditional EOF )
            // InternalOnlineElm.g:213:1: ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalOnlineElm.g:220:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:224:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalOnlineElm.g:225:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalOnlineElm.g:225:2: ( ( rule__Conditional__Group__0 ) )
            // InternalOnlineElm.g:226:3: ( rule__Conditional__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup()); 
            }
            // InternalOnlineElm.g:227:3: ( rule__Conditional__Group__0 )
            // InternalOnlineElm.g:227:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleBool_exp"
    // InternalOnlineElm.g:236:1: entryRuleBool_exp : ruleBool_exp EOF ;
    public final void entryRuleBool_exp() throws RecognitionException {
        try {
            // InternalOnlineElm.g:237:1: ( ruleBool_exp EOF )
            // InternalOnlineElm.g:238:1: ruleBool_exp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBool_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBool_exp"


    // $ANTLR start "ruleBool_exp"
    // InternalOnlineElm.g:245:1: ruleBool_exp : ( ( rule__Bool_exp__Group__0 ) ) ;
    public final void ruleBool_exp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:249:2: ( ( ( rule__Bool_exp__Group__0 ) ) )
            // InternalOnlineElm.g:250:2: ( ( rule__Bool_exp__Group__0 ) )
            {
            // InternalOnlineElm.g:250:2: ( ( rule__Bool_exp__Group__0 ) )
            // InternalOnlineElm.g:251:3: ( rule__Bool_exp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getGroup()); 
            }
            // InternalOnlineElm.g:252:3: ( rule__Bool_exp__Group__0 )
            // InternalOnlineElm.g:252:4: rule__Bool_exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool_exp"


    // $ANTLR start "entryRuleTerminal_Bool_exp"
    // InternalOnlineElm.g:261:1: entryRuleTerminal_Bool_exp : ruleTerminal_Bool_exp EOF ;
    public final void entryRuleTerminal_Bool_exp() throws RecognitionException {
        try {
            // InternalOnlineElm.g:262:1: ( ruleTerminal_Bool_exp EOF )
            // InternalOnlineElm.g:263:1: ruleTerminal_Bool_exp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminal_Bool_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminal_Bool_exp"


    // $ANTLR start "ruleTerminal_Bool_exp"
    // InternalOnlineElm.g:270:1: ruleTerminal_Bool_exp : ( ( rule__Terminal_Bool_exp__Group__0 ) ) ;
    public final void ruleTerminal_Bool_exp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:274:2: ( ( ( rule__Terminal_Bool_exp__Group__0 ) ) )
            // InternalOnlineElm.g:275:2: ( ( rule__Terminal_Bool_exp__Group__0 ) )
            {
            // InternalOnlineElm.g:275:2: ( ( rule__Terminal_Bool_exp__Group__0 ) )
            // InternalOnlineElm.g:276:3: ( rule__Terminal_Bool_exp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getGroup()); 
            }
            // InternalOnlineElm.g:277:3: ( rule__Terminal_Bool_exp__Group__0 )
            // InternalOnlineElm.g:277:4: rule__Terminal_Bool_exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal_Bool_exp"


    // $ANTLR start "entryRuleNum_value"
    // InternalOnlineElm.g:286:1: entryRuleNum_value : ruleNum_value EOF ;
    public final void entryRuleNum_value() throws RecognitionException {
        try {
            // InternalOnlineElm.g:287:1: ( ruleNum_value EOF )
            // InternalOnlineElm.g:288:1: ruleNum_value EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNum_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNum_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNum_valueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:295:1: ruleNum_value : ( ( rule__Num_value__Alternatives ) ) ;
    public final void ruleNum_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:299:2: ( ( ( rule__Num_value__Alternatives ) ) )
            // InternalOnlineElm.g:300:2: ( ( rule__Num_value__Alternatives ) )
            {
            // InternalOnlineElm.g:300:2: ( ( rule__Num_value__Alternatives ) )
            // InternalOnlineElm.g:301:3: ( rule__Num_value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNum_valueAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:302:3: ( rule__Num_value__Alternatives )
            // InternalOnlineElm.g:302:4: rule__Num_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Num_value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNum_valueAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:311:1: entryRuleMath_exp : ruleMath_exp EOF ;
    public final void entryRuleMath_exp() throws RecognitionException {
        try {
            // InternalOnlineElm.g:312:1: ( ruleMath_exp EOF )
            // InternalOnlineElm.g:313:1: ruleMath_exp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMath_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:320:1: ruleMath_exp : ( ( rule__Math_exp__Group__0 ) ) ;
    public final void ruleMath_exp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:324:2: ( ( ( rule__Math_exp__Group__0 ) ) )
            // InternalOnlineElm.g:325:2: ( ( rule__Math_exp__Group__0 ) )
            {
            // InternalOnlineElm.g:325:2: ( ( rule__Math_exp__Group__0 ) )
            // InternalOnlineElm.g:326:3: ( rule__Math_exp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getGroup()); 
            }
            // InternalOnlineElm.g:327:3: ( rule__Math_exp__Group__0 )
            // InternalOnlineElm.g:327:4: rule__Math_exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleStencil"
    // InternalOnlineElm.g:336:1: entryRuleStencil : ruleStencil EOF ;
    public final void entryRuleStencil() throws RecognitionException {
        try {
            // InternalOnlineElm.g:337:1: ( ruleStencil EOF )
            // InternalOnlineElm.g:338:1: ruleStencil EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStencilRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStencil();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStencilRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:345:1: ruleStencil : ( ( rule__Stencil__Alternatives ) ) ;
    public final void ruleStencil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:349:2: ( ( ( rule__Stencil__Alternatives ) ) )
            // InternalOnlineElm.g:350:2: ( ( rule__Stencil__Alternatives ) )
            {
            // InternalOnlineElm.g:350:2: ( ( rule__Stencil__Alternatives ) )
            // InternalOnlineElm.g:351:3: ( rule__Stencil__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStencilAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:352:3: ( rule__Stencil__Alternatives )
            // InternalOnlineElm.g:352:4: rule__Stencil__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stencil__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStencilAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:361:1: entryRuleCircle : ruleCircle EOF ;
    public final void entryRuleCircle() throws RecognitionException {
        try {
            // InternalOnlineElm.g:362:1: ( ruleCircle EOF )
            // InternalOnlineElm.g:363:1: ruleCircle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCircle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:370:1: ruleCircle : ( ( rule__Circle__Group__0 ) ) ;
    public final void ruleCircle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:374:2: ( ( ( rule__Circle__Group__0 ) ) )
            // InternalOnlineElm.g:375:2: ( ( rule__Circle__Group__0 ) )
            {
            // InternalOnlineElm.g:375:2: ( ( rule__Circle__Group__0 ) )
            // InternalOnlineElm.g:376:3: ( rule__Circle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getGroup()); 
            }
            // InternalOnlineElm.g:377:3: ( rule__Circle__Group__0 )
            // InternalOnlineElm.g:377:4: rule__Circle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:386:1: entryRuleRect : ruleRect EOF ;
    public final void entryRuleRect() throws RecognitionException {
        try {
            // InternalOnlineElm.g:387:1: ( ruleRect EOF )
            // InternalOnlineElm.g:388:1: ruleRect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:395:1: ruleRect : ( ( rule__Rect__Group__0 ) ) ;
    public final void ruleRect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:399:2: ( ( ( rule__Rect__Group__0 ) ) )
            // InternalOnlineElm.g:400:2: ( ( rule__Rect__Group__0 ) )
            {
            // InternalOnlineElm.g:400:2: ( ( rule__Rect__Group__0 ) )
            // InternalOnlineElm.g:401:3: ( rule__Rect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getGroup()); 
            }
            // InternalOnlineElm.g:402:3: ( rule__Rect__Group__0 )
            // InternalOnlineElm.g:402:4: rule__Rect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleText"
    // InternalOnlineElm.g:411:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalOnlineElm.g:412:1: ( ruleText EOF )
            // InternalOnlineElm.g:413:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:420:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:424:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalOnlineElm.g:425:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalOnlineElm.g:425:2: ( ( rule__Text__Group__0 ) )
            // InternalOnlineElm.g:426:3: ( rule__Text__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getGroup()); 
            }
            // InternalOnlineElm.g:427:3: ( rule__Text__Group__0 )
            // InternalOnlineElm.g:427:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:436:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalOnlineElm.g:437:1: ( ruleDraw EOF )
            // InternalOnlineElm.g:438:1: ruleDraw EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDraw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:445:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:449:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalOnlineElm.g:450:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalOnlineElm.g:450:2: ( ( rule__Draw__Group__0 ) )
            // InternalOnlineElm.g:451:3: ( rule__Draw__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getGroup()); 
            }
            // InternalOnlineElm.g:452:3: ( rule__Draw__Group__0 )
            // InternalOnlineElm.g:452:4: rule__Draw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFill"
    // InternalOnlineElm.g:461:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalOnlineElm.g:462:1: ( ruleFill EOF )
            // InternalOnlineElm.g:463:1: ruleFill EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFill();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalOnlineElm.g:470:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:474:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalOnlineElm.g:475:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalOnlineElm.g:475:2: ( ( rule__Fill__Group__0 ) )
            // InternalOnlineElm.g:476:3: ( rule__Fill__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getGroup()); 
            }
            // InternalOnlineElm.g:477:3: ( rule__Fill__Group__0 )
            // InternalOnlineElm.g:477:4: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleMove"
    // InternalOnlineElm.g:486:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalOnlineElm.g:487:1: ( ruleMove EOF )
            // InternalOnlineElm.g:488:1: ruleMove EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalOnlineElm.g:495:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:499:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalOnlineElm.g:500:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalOnlineElm.g:500:2: ( ( rule__Move__Group__0 ) )
            // InternalOnlineElm.g:501:3: ( rule__Move__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getGroup()); 
            }
            // InternalOnlineElm.g:502:3: ( rule__Move__Group__0 )
            // InternalOnlineElm.g:502:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "ruleBOOL_OP"
    // InternalOnlineElm.g:511:1: ruleBOOL_OP : ( ( rule__BOOL_OP__Alternatives ) ) ;
    public final void ruleBOOL_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:515:1: ( ( ( rule__BOOL_OP__Alternatives ) ) )
            // InternalOnlineElm.g:516:2: ( ( rule__BOOL_OP__Alternatives ) )
            {
            // InternalOnlineElm.g:516:2: ( ( rule__BOOL_OP__Alternatives ) )
            // InternalOnlineElm.g:517:3: ( rule__BOOL_OP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:518:3: ( rule__BOOL_OP__Alternatives )
            // InternalOnlineElm.g:518:4: rule__BOOL_OP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOL_OP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL_OP"


    // $ANTLR start "ruleMATH_OP"
    // InternalOnlineElm.g:527:1: ruleMATH_OP : ( ( rule__MATH_OP__Alternatives ) ) ;
    public final void ruleMATH_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:531:1: ( ( ( rule__MATH_OP__Alternatives ) ) )
            // InternalOnlineElm.g:532:2: ( ( rule__MATH_OP__Alternatives ) )
            {
            // InternalOnlineElm.g:532:2: ( ( rule__MATH_OP__Alternatives ) )
            // InternalOnlineElm.g:533:3: ( rule__MATH_OP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMATH_OPAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:534:3: ( rule__MATH_OP__Alternatives )
            // InternalOnlineElm.g:534:4: rule__MATH_OP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MATH_OP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMATH_OPAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "ruleCOMPARISON"
    // InternalOnlineElm.g:543:1: ruleCOMPARISON : ( ( rule__COMPARISON__Alternatives ) ) ;
    public final void ruleCOMPARISON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:547:1: ( ( ( rule__COMPARISON__Alternatives ) ) )
            // InternalOnlineElm.g:548:2: ( ( rule__COMPARISON__Alternatives ) )
            {
            // InternalOnlineElm.g:548:2: ( ( rule__COMPARISON__Alternatives ) )
            // InternalOnlineElm.g:549:3: ( rule__COMPARISON__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:550:3: ( rule__COMPARISON__Alternatives )
            // InternalOnlineElm.g:550:4: rule__COMPARISON__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COMPARISON__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMPARISON"


    // $ANTLR start "ruleColor"
    // InternalOnlineElm.g:559:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:563:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalOnlineElm.g:564:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalOnlineElm.g:564:2: ( ( rule__Color__Alternatives ) )
            // InternalOnlineElm.g:565:3: ( rule__Color__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getAlternatives()); 
            }
            // InternalOnlineElm.g:566:3: ( rule__Color__Alternatives )
            // InternalOnlineElm.g:566:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MainShape__Alternatives_3"
    // InternalOnlineElm.g:574:1: rule__MainShape__Alternatives_3 : ( ( ( rule__MainShape__S1Assignment_3_0 ) ) | ( ( rule__MainShape__S11Assignment_3_1 ) ) );
    public final void rule__MainShape__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:578:1: ( ( ( rule__MainShape__S1Assignment_3_0 ) ) | ( ( rule__MainShape__S11Assignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32||(LA1_0>=39 && LA1_0<=41)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOnlineElm.g:579:2: ( ( rule__MainShape__S1Assignment_3_0 ) )
                    {
                    // InternalOnlineElm.g:579:2: ( ( rule__MainShape__S1Assignment_3_0 ) )
                    // InternalOnlineElm.g:580:3: ( rule__MainShape__S1Assignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainShapeAccess().getS1Assignment_3_0()); 
                    }
                    // InternalOnlineElm.g:581:3: ( rule__MainShape__S1Assignment_3_0 )
                    // InternalOnlineElm.g:581:4: rule__MainShape__S1Assignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__S1Assignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainShapeAccess().getS1Assignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:585:2: ( ( rule__MainShape__S11Assignment_3_1 ) )
                    {
                    // InternalOnlineElm.g:585:2: ( ( rule__MainShape__S11Assignment_3_1 ) )
                    // InternalOnlineElm.g:586:3: ( rule__MainShape__S11Assignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainShapeAccess().getS11Assignment_3_1()); 
                    }
                    // InternalOnlineElm.g:587:3: ( rule__MainShape__S11Assignment_3_1 )
                    // InternalOnlineElm.g:587:4: rule__MainShape__S11Assignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__S11Assignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainShapeAccess().getS11Assignment_3_1()); 
                    }

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
    // $ANTLR end "rule__MainShape__Alternatives_3"


    // $ANTLR start "rule__MainShape__Alternatives_4"
    // InternalOnlineElm.g:595:1: rule__MainShape__Alternatives_4 : ( ( ( rule__MainShape__Group_4_0__0 ) ) | ( ( rule__MainShape__S22Assignment_4_1 ) ) );
    public final void rule__MainShape__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:599:1: ( ( ( rule__MainShape__Group_4_0__0 ) ) | ( ( rule__MainShape__S22Assignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOnlineElm.g:600:2: ( ( rule__MainShape__Group_4_0__0 ) )
                    {
                    // InternalOnlineElm.g:600:2: ( ( rule__MainShape__Group_4_0__0 ) )
                    // InternalOnlineElm.g:601:3: ( rule__MainShape__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainShapeAccess().getGroup_4_0()); 
                    }
                    // InternalOnlineElm.g:602:3: ( rule__MainShape__Group_4_0__0 )
                    // InternalOnlineElm.g:602:4: rule__MainShape__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainShapeAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:606:2: ( ( rule__MainShape__S22Assignment_4_1 ) )
                    {
                    // InternalOnlineElm.g:606:2: ( ( rule__MainShape__S22Assignment_4_1 ) )
                    // InternalOnlineElm.g:607:3: ( rule__MainShape__S22Assignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainShapeAccess().getS22Assignment_4_1()); 
                    }
                    // InternalOnlineElm.g:608:3: ( rule__MainShape__S22Assignment_4_1 )
                    // InternalOnlineElm.g:608:4: rule__MainShape__S22Assignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainShape__S22Assignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainShapeAccess().getS22Assignment_4_1()); 
                    }

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


    // $ANTLR start "rule__ShapeDef__Alternatives"
    // InternalOnlineElm.g:616:1: rule__ShapeDef__Alternatives : ( ( ruleShapeGroup ) | ( ruleBasicShape ) );
    public final void rule__ShapeDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:620:1: ( ( ruleShapeGroup ) | ( ruleBasicShape ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==32||(LA3_2>=39 && LA3_2<=41)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==27) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOnlineElm.g:621:2: ( ruleShapeGroup )
                    {
                    // InternalOnlineElm.g:621:2: ( ruleShapeGroup )
                    // InternalOnlineElm.g:622:3: ruleShapeGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeDefAccess().getShapeGroupParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShapeGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeDefAccess().getShapeGroupParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:627:2: ( ruleBasicShape )
                    {
                    // InternalOnlineElm.g:627:2: ( ruleBasicShape )
                    // InternalOnlineElm.g:628:3: ruleBasicShape
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeDefAccess().getBasicShapeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicShape();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeDefAccess().getBasicShapeParserRuleCall_1()); 
                    }

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


    // $ANTLR start "rule__ShapeGroup__Alternatives_3"
    // InternalOnlineElm.g:637:1: rule__ShapeGroup__Alternatives_3 : ( ( ( rule__ShapeGroup__S1Assignment_3_0 ) ) | ( ( rule__ShapeGroup__S11Assignment_3_1 ) ) );
    public final void rule__ShapeGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:641:1: ( ( ( rule__ShapeGroup__S1Assignment_3_0 ) ) | ( ( rule__ShapeGroup__S11Assignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32||(LA4_0>=39 && LA4_0<=41)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOnlineElm.g:642:2: ( ( rule__ShapeGroup__S1Assignment_3_0 ) )
                    {
                    // InternalOnlineElm.g:642:2: ( ( rule__ShapeGroup__S1Assignment_3_0 ) )
                    // InternalOnlineElm.g:643:3: ( rule__ShapeGroup__S1Assignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeGroupAccess().getS1Assignment_3_0()); 
                    }
                    // InternalOnlineElm.g:644:3: ( rule__ShapeGroup__S1Assignment_3_0 )
                    // InternalOnlineElm.g:644:4: rule__ShapeGroup__S1Assignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeGroup__S1Assignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeGroupAccess().getS1Assignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:648:2: ( ( rule__ShapeGroup__S11Assignment_3_1 ) )
                    {
                    // InternalOnlineElm.g:648:2: ( ( rule__ShapeGroup__S11Assignment_3_1 ) )
                    // InternalOnlineElm.g:649:3: ( rule__ShapeGroup__S11Assignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeGroupAccess().getS11Assignment_3_1()); 
                    }
                    // InternalOnlineElm.g:650:3: ( rule__ShapeGroup__S11Assignment_3_1 )
                    // InternalOnlineElm.g:650:4: rule__ShapeGroup__S11Assignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeGroup__S11Assignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeGroupAccess().getS11Assignment_3_1()); 
                    }

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
    // $ANTLR end "rule__ShapeGroup__Alternatives_3"


    // $ANTLR start "rule__ShapeGroup__Alternatives_4"
    // InternalOnlineElm.g:658:1: rule__ShapeGroup__Alternatives_4 : ( ( ( rule__ShapeGroup__Group_4_0__0 ) ) | ( ( rule__ShapeGroup__S22Assignment_4_1 ) ) );
    public final void rule__ShapeGroup__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:662:1: ( ( ( rule__ShapeGroup__Group_4_0__0 ) ) | ( ( rule__ShapeGroup__S22Assignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOnlineElm.g:663:2: ( ( rule__ShapeGroup__Group_4_0__0 ) )
                    {
                    // InternalOnlineElm.g:663:2: ( ( rule__ShapeGroup__Group_4_0__0 ) )
                    // InternalOnlineElm.g:664:3: ( rule__ShapeGroup__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeGroupAccess().getGroup_4_0()); 
                    }
                    // InternalOnlineElm.g:665:3: ( rule__ShapeGroup__Group_4_0__0 )
                    // InternalOnlineElm.g:665:4: rule__ShapeGroup__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeGroup__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeGroupAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:669:2: ( ( rule__ShapeGroup__S22Assignment_4_1 ) )
                    {
                    // InternalOnlineElm.g:669:2: ( ( rule__ShapeGroup__S22Assignment_4_1 ) )
                    // InternalOnlineElm.g:670:3: ( rule__ShapeGroup__S22Assignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeGroupAccess().getS22Assignment_4_1()); 
                    }
                    // InternalOnlineElm.g:671:3: ( rule__ShapeGroup__S22Assignment_4_1 )
                    // InternalOnlineElm.g:671:4: rule__ShapeGroup__S22Assignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeGroup__S22Assignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeGroupAccess().getS22Assignment_4_1()); 
                    }

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
    // $ANTLR end "rule__ShapeGroup__Alternatives_4"


    // $ANTLR start "rule__Shape__Alternatives"
    // InternalOnlineElm.g:679:1: rule__Shape__Alternatives : ( ( ( rule__Shape__Group_0__0 ) ) | ( ruleConditional ) );
    public final void rule__Shape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:683:1: ( ( ( rule__Shape__Group_0__0 ) ) | ( ruleConditional ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=39 && LA6_0<=41)) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOnlineElm.g:684:2: ( ( rule__Shape__Group_0__0 ) )
                    {
                    // InternalOnlineElm.g:684:2: ( ( rule__Shape__Group_0__0 ) )
                    // InternalOnlineElm.g:685:3: ( rule__Shape__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeAccess().getGroup_0()); 
                    }
                    // InternalOnlineElm.g:686:3: ( rule__Shape__Group_0__0 )
                    // InternalOnlineElm.g:686:4: rule__Shape__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:690:2: ( ruleConditional )
                    {
                    // InternalOnlineElm.g:690:2: ( ruleConditional )
                    // InternalOnlineElm.g:691:3: ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShapeAccess().getConditionalParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditional();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShapeAccess().getConditionalParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Shape__Alternatives"


    // $ANTLR start "rule__Num_value__Alternatives"
    // InternalOnlineElm.g:700:1: rule__Num_value__Alternatives : ( ( ( rule__Num_value__NumAssignment_0 ) ) | ( ruleMath_exp ) );
    public final void rule__Num_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:704:1: ( ( ( rule__Num_value__NumAssignment_0 ) ) | ( ruleMath_exp ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_FLOAT) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOnlineElm.g:705:2: ( ( rule__Num_value__NumAssignment_0 ) )
                    {
                    // InternalOnlineElm.g:705:2: ( ( rule__Num_value__NumAssignment_0 ) )
                    // InternalOnlineElm.g:706:3: ( rule__Num_value__NumAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNum_valueAccess().getNumAssignment_0()); 
                    }
                    // InternalOnlineElm.g:707:3: ( rule__Num_value__NumAssignment_0 )
                    // InternalOnlineElm.g:707:4: rule__Num_value__NumAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num_value__NumAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNum_valueAccess().getNumAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:711:2: ( ruleMath_exp )
                    {
                    // InternalOnlineElm.g:711:2: ( ruleMath_exp )
                    // InternalOnlineElm.g:712:3: ruleMath_exp
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMath_exp();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_1()); 
                    }

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


    // $ANTLR start "rule__Stencil__Alternatives"
    // InternalOnlineElm.g:721:1: rule__Stencil__Alternatives : ( ( ruleCircle ) | ( ruleRect ) | ( ruleText ) );
    public final void rule__Stencil__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:725:1: ( ( ruleCircle ) | ( ruleRect ) | ( ruleText ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOnlineElm.g:726:2: ( ruleCircle )
                    {
                    // InternalOnlineElm.g:726:2: ( ruleCircle )
                    // InternalOnlineElm.g:727:3: ruleCircle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStencilAccess().getCircleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCircle();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStencilAccess().getCircleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:732:2: ( ruleRect )
                    {
                    // InternalOnlineElm.g:732:2: ( ruleRect )
                    // InternalOnlineElm.g:733:3: ruleRect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStencilAccess().getRectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStencilAccess().getRectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:738:2: ( ruleText )
                    {
                    // InternalOnlineElm.g:738:2: ( ruleText )
                    // InternalOnlineElm.g:739:3: ruleText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStencilAccess().getTextParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStencilAccess().getTextParserRuleCall_2()); 
                    }

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


    // $ANTLR start "rule__BOOL_OP__Alternatives"
    // InternalOnlineElm.g:748:1: rule__BOOL_OP__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__BOOL_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:752:1: ( ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOnlineElm.g:753:2: ( ( '&&' ) )
                    {
                    // InternalOnlineElm.g:753:2: ( ( '&&' ) )
                    // InternalOnlineElm.g:754:3: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOL_OPAccess().getAndEnumLiteralDeclaration_0()); 
                    }
                    // InternalOnlineElm.g:755:3: ( '&&' )
                    // InternalOnlineElm.g:755:4: '&&'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOL_OPAccess().getAndEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:759:2: ( ( '||' ) )
                    {
                    // InternalOnlineElm.g:759:2: ( ( '||' ) )
                    // InternalOnlineElm.g:760:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOL_OPAccess().getOrEnumLiteralDeclaration_1()); 
                    }
                    // InternalOnlineElm.g:761:3: ( '||' )
                    // InternalOnlineElm.g:761:4: '||'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOL_OPAccess().getOrEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__BOOL_OP__Alternatives"


    // $ANTLR start "rule__MATH_OP__Alternatives"
    // InternalOnlineElm.g:769:1: rule__MATH_OP__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MATH_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:773:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalOnlineElm.g:774:2: ( ( '+' ) )
                    {
                    // InternalOnlineElm.g:774:2: ( ( '+' ) )
                    // InternalOnlineElm.g:775:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0()); 
                    }
                    // InternalOnlineElm.g:776:3: ( '+' )
                    // InternalOnlineElm.g:776:4: '+'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:780:2: ( ( '-' ) )
                    {
                    // InternalOnlineElm.g:780:2: ( ( '-' ) )
                    // InternalOnlineElm.g:781:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1()); 
                    }
                    // InternalOnlineElm.g:782:3: ( '-' )
                    // InternalOnlineElm.g:782:4: '-'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:786:2: ( ( '*' ) )
                    {
                    // InternalOnlineElm.g:786:2: ( ( '*' ) )
                    // InternalOnlineElm.g:787:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2()); 
                    }
                    // InternalOnlineElm.g:788:3: ( '*' )
                    // InternalOnlineElm.g:788:4: '*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:792:2: ( ( '/' ) )
                    {
                    // InternalOnlineElm.g:792:2: ( ( '/' ) )
                    // InternalOnlineElm.g:793:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3()); 
                    }
                    // InternalOnlineElm.g:794:3: ( '/' )
                    // InternalOnlineElm.g:794:4: '/'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3()); 
                    }

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


    // $ANTLR start "rule__COMPARISON__Alternatives"
    // InternalOnlineElm.g:802:1: rule__COMPARISON__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) );
    public final void rule__COMPARISON__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:806:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOnlineElm.g:807:2: ( ( '>' ) )
                    {
                    // InternalOnlineElm.g:807:2: ( ( '>' ) )
                    // InternalOnlineElm.g:808:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getBiggerEnumLiteralDeclaration_0()); 
                    }
                    // InternalOnlineElm.g:809:3: ( '>' )
                    // InternalOnlineElm.g:809:4: '>'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getBiggerEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:813:2: ( ( '>=' ) )
                    {
                    // InternalOnlineElm.g:813:2: ( ( '>=' ) )
                    // InternalOnlineElm.g:814:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getNoLessThanEnumLiteralDeclaration_1()); 
                    }
                    // InternalOnlineElm.g:815:3: ( '>=' )
                    // InternalOnlineElm.g:815:4: '>='
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getNoLessThanEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:819:2: ( ( '<' ) )
                    {
                    // InternalOnlineElm.g:819:2: ( ( '<' ) )
                    // InternalOnlineElm.g:820:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getSmallerEnumLiteralDeclaration_2()); 
                    }
                    // InternalOnlineElm.g:821:3: ( '<' )
                    // InternalOnlineElm.g:821:4: '<'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getSmallerEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:825:2: ( ( '<=' ) )
                    {
                    // InternalOnlineElm.g:825:2: ( ( '<=' ) )
                    // InternalOnlineElm.g:826:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getNoBiggerThanEnumLiteralDeclaration_3()); 
                    }
                    // InternalOnlineElm.g:827:3: ( '<=' )
                    // InternalOnlineElm.g:827:4: '<='
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getNoBiggerThanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:831:2: ( ( '==' ) )
                    {
                    // InternalOnlineElm.g:831:2: ( ( '==' ) )
                    // InternalOnlineElm.g:832:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getEqualEnumLiteralDeclaration_4()); 
                    }
                    // InternalOnlineElm.g:833:3: ( '==' )
                    // InternalOnlineElm.g:833:4: '=='
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getEqualEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__COMPARISON__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalOnlineElm.g:841:1: rule__Color__Alternatives : ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'blue' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:845:1: ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'blue' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOnlineElm.g:846:2: ( ( 'black' ) )
                    {
                    // InternalOnlineElm.g:846:2: ( ( 'black' ) )
                    // InternalOnlineElm.g:847:3: ( 'black' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0()); 
                    }
                    // InternalOnlineElm.g:848:3: ( 'black' )
                    // InternalOnlineElm.g:848:4: 'black'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:852:2: ( ( 'red' ) )
                    {
                    // InternalOnlineElm.g:852:2: ( ( 'red' ) )
                    // InternalOnlineElm.g:853:3: ( 'red' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1()); 
                    }
                    // InternalOnlineElm.g:854:3: ( 'red' )
                    // InternalOnlineElm.g:854:4: 'red'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:858:2: ( ( 'blue' ) )
                    {
                    // InternalOnlineElm.g:858:2: ( ( 'blue' ) )
                    // InternalOnlineElm.g:859:3: ( 'blue' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    }
                    // InternalOnlineElm.g:860:3: ( 'blue' )
                    // InternalOnlineElm.g:860:4: 'blue'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    }

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


    // $ANTLR start "rule__MainShape__Group__0"
    // InternalOnlineElm.g:868:1: rule__MainShape__Group__0 : rule__MainShape__Group__0__Impl rule__MainShape__Group__1 ;
    public final void rule__MainShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:872:1: ( rule__MainShape__Group__0__Impl rule__MainShape__Group__1 )
            // InternalOnlineElm.g:873:2: rule__MainShape__Group__0__Impl rule__MainShape__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MainShape__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:880:1: rule__MainShape__Group__0__Impl : ( ( rule__MainShape__NameAssignment_0 ) ) ;
    public final void rule__MainShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:884:1: ( ( ( rule__MainShape__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:885:1: ( ( rule__MainShape__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:885:1: ( ( rule__MainShape__NameAssignment_0 ) )
            // InternalOnlineElm.g:886:2: ( rule__MainShape__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:887:2: ( rule__MainShape__NameAssignment_0 )
            // InternalOnlineElm.g:887:3: rule__MainShape__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:895:1: rule__MainShape__Group__1 : rule__MainShape__Group__1__Impl rule__MainShape__Group__2 ;
    public final void rule__MainShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:899:1: ( rule__MainShape__Group__1__Impl rule__MainShape__Group__2 )
            // InternalOnlineElm.g:900:2: rule__MainShape__Group__1__Impl rule__MainShape__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MainShape__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:907:1: rule__MainShape__Group__1__Impl : ( '=' ) ;
    public final void rule__MainShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:911:1: ( ( '=' ) )
            // InternalOnlineElm.g:912:1: ( '=' )
            {
            // InternalOnlineElm.g:912:1: ( '=' )
            // InternalOnlineElm.g:913:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:922:1: rule__MainShape__Group__2 : rule__MainShape__Group__2__Impl rule__MainShape__Group__3 ;
    public final void rule__MainShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:926:1: ( rule__MainShape__Group__2__Impl rule__MainShape__Group__3 )
            // InternalOnlineElm.g:927:2: rule__MainShape__Group__2__Impl rule__MainShape__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MainShape__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:934:1: rule__MainShape__Group__2__Impl : ( '[' ) ;
    public final void rule__MainShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:938:1: ( ( '[' ) )
            // InternalOnlineElm.g:939:1: ( '[' )
            {
            // InternalOnlineElm.g:939:1: ( '[' )
            // InternalOnlineElm.g:940:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:949:1: rule__MainShape__Group__3 : rule__MainShape__Group__3__Impl rule__MainShape__Group__4 ;
    public final void rule__MainShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:953:1: ( rule__MainShape__Group__3__Impl rule__MainShape__Group__4 )
            // InternalOnlineElm.g:954:2: rule__MainShape__Group__3__Impl rule__MainShape__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MainShape__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:961:1: rule__MainShape__Group__3__Impl : ( ( rule__MainShape__Alternatives_3 ) ) ;
    public final void rule__MainShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:965:1: ( ( ( rule__MainShape__Alternatives_3 ) ) )
            // InternalOnlineElm.g:966:1: ( ( rule__MainShape__Alternatives_3 ) )
            {
            // InternalOnlineElm.g:966:1: ( ( rule__MainShape__Alternatives_3 ) )
            // InternalOnlineElm.g:967:2: ( rule__MainShape__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getAlternatives_3()); 
            }
            // InternalOnlineElm.g:968:2: ( rule__MainShape__Alternatives_3 )
            // InternalOnlineElm.g:968:3: rule__MainShape__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getAlternatives_3()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:976:1: rule__MainShape__Group__4 : rule__MainShape__Group__4__Impl rule__MainShape__Group__5 ;
    public final void rule__MainShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:980:1: ( rule__MainShape__Group__4__Impl rule__MainShape__Group__5 )
            // InternalOnlineElm.g:981:2: rule__MainShape__Group__4__Impl rule__MainShape__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MainShape__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:988:1: rule__MainShape__Group__4__Impl : ( ( rule__MainShape__Alternatives_4 )* ) ;
    public final void rule__MainShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:992:1: ( ( ( rule__MainShape__Alternatives_4 )* ) )
            // InternalOnlineElm.g:993:1: ( ( rule__MainShape__Alternatives_4 )* )
            {
            // InternalOnlineElm.g:993:1: ( ( rule__MainShape__Alternatives_4 )* )
            // InternalOnlineElm.g:994:2: ( rule__MainShape__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getAlternatives_4()); 
            }
            // InternalOnlineElm.g:995:2: ( rule__MainShape__Alternatives_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOnlineElm.g:995:3: rule__MainShape__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MainShape__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getAlternatives_4()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:1003:1: rule__MainShape__Group__5 : rule__MainShape__Group__5__Impl rule__MainShape__Group__6 ;
    public final void rule__MainShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1007:1: ( rule__MainShape__Group__5__Impl rule__MainShape__Group__6 )
            // InternalOnlineElm.g:1008:2: rule__MainShape__Group__5__Impl rule__MainShape__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__MainShape__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:1015:1: rule__MainShape__Group__5__Impl : ( ']' ) ;
    public final void rule__MainShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1019:1: ( ( ']' ) )
            // InternalOnlineElm.g:1020:1: ( ']' )
            {
            // InternalOnlineElm.g:1020:1: ( ']' )
            // InternalOnlineElm.g:1021:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:1030:1: rule__MainShape__Group__6 : rule__MainShape__Group__6__Impl ;
    public final void rule__MainShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1034:1: ( rule__MainShape__Group__6__Impl )
            // InternalOnlineElm.g:1035:2: rule__MainShape__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:1041:1: rule__MainShape__Group__6__Impl : ( ( rule__MainShape__Group_6__0 )* ) ;
    public final void rule__MainShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1045:1: ( ( ( rule__MainShape__Group_6__0 )* ) )
            // InternalOnlineElm.g:1046:1: ( ( rule__MainShape__Group_6__0 )* )
            {
            // InternalOnlineElm.g:1046:1: ( ( rule__MainShape__Group_6__0 )* )
            // InternalOnlineElm.g:1047:2: ( rule__MainShape__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getGroup_6()); 
            }
            // InternalOnlineElm.g:1048:2: ( rule__MainShape__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOnlineElm.g:1048:3: rule__MainShape__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MainShape__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getGroup_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MainShape__Group_4_0__0"
    // InternalOnlineElm.g:1057:1: rule__MainShape__Group_4_0__0 : rule__MainShape__Group_4_0__0__Impl rule__MainShape__Group_4_0__1 ;
    public final void rule__MainShape__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1061:1: ( rule__MainShape__Group_4_0__0__Impl rule__MainShape__Group_4_0__1 )
            // InternalOnlineElm.g:1062:2: rule__MainShape__Group_4_0__0__Impl rule__MainShape__Group_4_0__1
            {
            pushFollow(FOLLOW_10);
            rule__MainShape__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_4_0__0"


    // $ANTLR start "rule__MainShape__Group_4_0__0__Impl"
    // InternalOnlineElm.g:1069:1: rule__MainShape__Group_4_0__0__Impl : ( ',' ) ;
    public final void rule__MainShape__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1073:1: ( ( ',' ) )
            // InternalOnlineElm.g:1074:1: ( ',' )
            {
            // InternalOnlineElm.g:1074:1: ( ',' )
            // InternalOnlineElm.g:1075:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getCommaKeyword_4_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getCommaKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_4_0__0__Impl"


    // $ANTLR start "rule__MainShape__Group_4_0__1"
    // InternalOnlineElm.g:1084:1: rule__MainShape__Group_4_0__1 : rule__MainShape__Group_4_0__1__Impl ;
    public final void rule__MainShape__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1088:1: ( rule__MainShape__Group_4_0__1__Impl )
            // InternalOnlineElm.g:1089:2: rule__MainShape__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_4_0__1"


    // $ANTLR start "rule__MainShape__Group_4_0__1__Impl"
    // InternalOnlineElm.g:1095:1: rule__MainShape__Group_4_0__1__Impl : ( ( rule__MainShape__S2Assignment_4_0_1 ) ) ;
    public final void rule__MainShape__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1099:1: ( ( ( rule__MainShape__S2Assignment_4_0_1 ) ) )
            // InternalOnlineElm.g:1100:1: ( ( rule__MainShape__S2Assignment_4_0_1 ) )
            {
            // InternalOnlineElm.g:1100:1: ( ( rule__MainShape__S2Assignment_4_0_1 ) )
            // InternalOnlineElm.g:1101:2: ( rule__MainShape__S2Assignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS2Assignment_4_0_1()); 
            }
            // InternalOnlineElm.g:1102:2: ( rule__MainShape__S2Assignment_4_0_1 )
            // InternalOnlineElm.g:1102:3: rule__MainShape__S2Assignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__S2Assignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS2Assignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_4_0__1__Impl"


    // $ANTLR start "rule__MainShape__Group_6__0"
    // InternalOnlineElm.g:1111:1: rule__MainShape__Group_6__0 : rule__MainShape__Group_6__0__Impl rule__MainShape__Group_6__1 ;
    public final void rule__MainShape__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1115:1: ( rule__MainShape__Group_6__0__Impl rule__MainShape__Group_6__1 )
            // InternalOnlineElm.g:1116:2: rule__MainShape__Group_6__0__Impl rule__MainShape__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__MainShape__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_6__0"


    // $ANTLR start "rule__MainShape__Group_6__0__Impl"
    // InternalOnlineElm.g:1123:1: rule__MainShape__Group_6__0__Impl : ( '++' ) ;
    public final void rule__MainShape__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1127:1: ( ( '++' ) )
            // InternalOnlineElm.g:1128:1: ( '++' )
            {
            // InternalOnlineElm.g:1128:1: ( '++' )
            // InternalOnlineElm.g:1129:2: '++'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_6__0__Impl"


    // $ANTLR start "rule__MainShape__Group_6__1"
    // InternalOnlineElm.g:1138:1: rule__MainShape__Group_6__1 : rule__MainShape__Group_6__1__Impl ;
    public final void rule__MainShape__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1142:1: ( rule__MainShape__Group_6__1__Impl )
            // InternalOnlineElm.g:1143:2: rule__MainShape__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_6__1"


    // $ANTLR start "rule__MainShape__Group_6__1__Impl"
    // InternalOnlineElm.g:1149:1: rule__MainShape__Group_6__1__Impl : ( ( rule__MainShape__SgAssignment_6_1 ) ) ;
    public final void rule__MainShape__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1153:1: ( ( ( rule__MainShape__SgAssignment_6_1 ) ) )
            // InternalOnlineElm.g:1154:1: ( ( rule__MainShape__SgAssignment_6_1 ) )
            {
            // InternalOnlineElm.g:1154:1: ( ( rule__MainShape__SgAssignment_6_1 ) )
            // InternalOnlineElm.g:1155:2: ( rule__MainShape__SgAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getSgAssignment_6_1()); 
            }
            // InternalOnlineElm.g:1156:2: ( rule__MainShape__SgAssignment_6_1 )
            // InternalOnlineElm.g:1156:3: rule__MainShape__SgAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MainShape__SgAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getSgAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__Group_6__1__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__0"
    // InternalOnlineElm.g:1165:1: rule__ShapeGroup__Group__0 : rule__ShapeGroup__Group__0__Impl rule__ShapeGroup__Group__1 ;
    public final void rule__ShapeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1169:1: ( rule__ShapeGroup__Group__0__Impl rule__ShapeGroup__Group__1 )
            // InternalOnlineElm.g:1170:2: rule__ShapeGroup__Group__0__Impl rule__ShapeGroup__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__0"


    // $ANTLR start "rule__ShapeGroup__Group__0__Impl"
    // InternalOnlineElm.g:1177:1: rule__ShapeGroup__Group__0__Impl : ( ( rule__ShapeGroup__NameAssignment_0 ) ) ;
    public final void rule__ShapeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1181:1: ( ( ( rule__ShapeGroup__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:1182:1: ( ( rule__ShapeGroup__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:1182:1: ( ( rule__ShapeGroup__NameAssignment_0 ) )
            // InternalOnlineElm.g:1183:2: ( rule__ShapeGroup__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:1184:2: ( rule__ShapeGroup__NameAssignment_0 )
            // InternalOnlineElm.g:1184:3: rule__ShapeGroup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__0__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__1"
    // InternalOnlineElm.g:1192:1: rule__ShapeGroup__Group__1 : rule__ShapeGroup__Group__1__Impl rule__ShapeGroup__Group__2 ;
    public final void rule__ShapeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1196:1: ( rule__ShapeGroup__Group__1__Impl rule__ShapeGroup__Group__2 )
            // InternalOnlineElm.g:1197:2: rule__ShapeGroup__Group__1__Impl rule__ShapeGroup__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ShapeGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__1"


    // $ANTLR start "rule__ShapeGroup__Group__1__Impl"
    // InternalOnlineElm.g:1204:1: rule__ShapeGroup__Group__1__Impl : ( '=' ) ;
    public final void rule__ShapeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1208:1: ( ( '=' ) )
            // InternalOnlineElm.g:1209:1: ( '=' )
            {
            // InternalOnlineElm.g:1209:1: ( '=' )
            // InternalOnlineElm.g:1210:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getEqualsSignKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__1__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__2"
    // InternalOnlineElm.g:1219:1: rule__ShapeGroup__Group__2 : rule__ShapeGroup__Group__2__Impl rule__ShapeGroup__Group__3 ;
    public final void rule__ShapeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1223:1: ( rule__ShapeGroup__Group__2__Impl rule__ShapeGroup__Group__3 )
            // InternalOnlineElm.g:1224:2: rule__ShapeGroup__Group__2__Impl rule__ShapeGroup__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ShapeGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__2"


    // $ANTLR start "rule__ShapeGroup__Group__2__Impl"
    // InternalOnlineElm.g:1231:1: rule__ShapeGroup__Group__2__Impl : ( '[' ) ;
    public final void rule__ShapeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1235:1: ( ( '[' ) )
            // InternalOnlineElm.g:1236:1: ( '[' )
            {
            // InternalOnlineElm.g:1236:1: ( '[' )
            // InternalOnlineElm.g:1237:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__2__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__3"
    // InternalOnlineElm.g:1246:1: rule__ShapeGroup__Group__3 : rule__ShapeGroup__Group__3__Impl rule__ShapeGroup__Group__4 ;
    public final void rule__ShapeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1250:1: ( rule__ShapeGroup__Group__3__Impl rule__ShapeGroup__Group__4 )
            // InternalOnlineElm.g:1251:2: rule__ShapeGroup__Group__3__Impl rule__ShapeGroup__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ShapeGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__3"


    // $ANTLR start "rule__ShapeGroup__Group__3__Impl"
    // InternalOnlineElm.g:1258:1: rule__ShapeGroup__Group__3__Impl : ( ( rule__ShapeGroup__Alternatives_3 ) ) ;
    public final void rule__ShapeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1262:1: ( ( ( rule__ShapeGroup__Alternatives_3 ) ) )
            // InternalOnlineElm.g:1263:1: ( ( rule__ShapeGroup__Alternatives_3 ) )
            {
            // InternalOnlineElm.g:1263:1: ( ( rule__ShapeGroup__Alternatives_3 ) )
            // InternalOnlineElm.g:1264:2: ( rule__ShapeGroup__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getAlternatives_3()); 
            }
            // InternalOnlineElm.g:1265:2: ( rule__ShapeGroup__Alternatives_3 )
            // InternalOnlineElm.g:1265:3: rule__ShapeGroup__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__3__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__4"
    // InternalOnlineElm.g:1273:1: rule__ShapeGroup__Group__4 : rule__ShapeGroup__Group__4__Impl rule__ShapeGroup__Group__5 ;
    public final void rule__ShapeGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1277:1: ( rule__ShapeGroup__Group__4__Impl rule__ShapeGroup__Group__5 )
            // InternalOnlineElm.g:1278:2: rule__ShapeGroup__Group__4__Impl rule__ShapeGroup__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ShapeGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__4"


    // $ANTLR start "rule__ShapeGroup__Group__4__Impl"
    // InternalOnlineElm.g:1285:1: rule__ShapeGroup__Group__4__Impl : ( ( rule__ShapeGroup__Alternatives_4 )* ) ;
    public final void rule__ShapeGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1289:1: ( ( ( rule__ShapeGroup__Alternatives_4 )* ) )
            // InternalOnlineElm.g:1290:1: ( ( rule__ShapeGroup__Alternatives_4 )* )
            {
            // InternalOnlineElm.g:1290:1: ( ( rule__ShapeGroup__Alternatives_4 )* )
            // InternalOnlineElm.g:1291:2: ( rule__ShapeGroup__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getAlternatives_4()); 
            }
            // InternalOnlineElm.g:1292:2: ( rule__ShapeGroup__Alternatives_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOnlineElm.g:1292:3: rule__ShapeGroup__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ShapeGroup__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__4__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__5"
    // InternalOnlineElm.g:1300:1: rule__ShapeGroup__Group__5 : rule__ShapeGroup__Group__5__Impl rule__ShapeGroup__Group__6 ;
    public final void rule__ShapeGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1304:1: ( rule__ShapeGroup__Group__5__Impl rule__ShapeGroup__Group__6 )
            // InternalOnlineElm.g:1305:2: rule__ShapeGroup__Group__5__Impl rule__ShapeGroup__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ShapeGroup__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__5"


    // $ANTLR start "rule__ShapeGroup__Group__5__Impl"
    // InternalOnlineElm.g:1312:1: rule__ShapeGroup__Group__5__Impl : ( ']' ) ;
    public final void rule__ShapeGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1316:1: ( ( ']' ) )
            // InternalOnlineElm.g:1317:1: ( ']' )
            {
            // InternalOnlineElm.g:1317:1: ( ']' )
            // InternalOnlineElm.g:1318:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__5__Impl"


    // $ANTLR start "rule__ShapeGroup__Group__6"
    // InternalOnlineElm.g:1327:1: rule__ShapeGroup__Group__6 : rule__ShapeGroup__Group__6__Impl ;
    public final void rule__ShapeGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1331:1: ( rule__ShapeGroup__Group__6__Impl )
            // InternalOnlineElm.g:1332:2: rule__ShapeGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__6"


    // $ANTLR start "rule__ShapeGroup__Group__6__Impl"
    // InternalOnlineElm.g:1338:1: rule__ShapeGroup__Group__6__Impl : ( ( rule__ShapeGroup__Group_6__0 )* ) ;
    public final void rule__ShapeGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1342:1: ( ( ( rule__ShapeGroup__Group_6__0 )* ) )
            // InternalOnlineElm.g:1343:1: ( ( rule__ShapeGroup__Group_6__0 )* )
            {
            // InternalOnlineElm.g:1343:1: ( ( rule__ShapeGroup__Group_6__0 )* )
            // InternalOnlineElm.g:1344:2: ( rule__ShapeGroup__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getGroup_6()); 
            }
            // InternalOnlineElm.g:1345:2: ( rule__ShapeGroup__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOnlineElm.g:1345:3: rule__ShapeGroup__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ShapeGroup__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group__6__Impl"


    // $ANTLR start "rule__ShapeGroup__Group_4_0__0"
    // InternalOnlineElm.g:1354:1: rule__ShapeGroup__Group_4_0__0 : rule__ShapeGroup__Group_4_0__0__Impl rule__ShapeGroup__Group_4_0__1 ;
    public final void rule__ShapeGroup__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1358:1: ( rule__ShapeGroup__Group_4_0__0__Impl rule__ShapeGroup__Group_4_0__1 )
            // InternalOnlineElm.g:1359:2: rule__ShapeGroup__Group_4_0__0__Impl rule__ShapeGroup__Group_4_0__1
            {
            pushFollow(FOLLOW_10);
            rule__ShapeGroup__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_4_0__0"


    // $ANTLR start "rule__ShapeGroup__Group_4_0__0__Impl"
    // InternalOnlineElm.g:1366:1: rule__ShapeGroup__Group_4_0__0__Impl : ( ',' ) ;
    public final void rule__ShapeGroup__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1370:1: ( ( ',' ) )
            // InternalOnlineElm.g:1371:1: ( ',' )
            {
            // InternalOnlineElm.g:1371:1: ( ',' )
            // InternalOnlineElm.g:1372:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getCommaKeyword_4_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getCommaKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_4_0__0__Impl"


    // $ANTLR start "rule__ShapeGroup__Group_4_0__1"
    // InternalOnlineElm.g:1381:1: rule__ShapeGroup__Group_4_0__1 : rule__ShapeGroup__Group_4_0__1__Impl ;
    public final void rule__ShapeGroup__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1385:1: ( rule__ShapeGroup__Group_4_0__1__Impl )
            // InternalOnlineElm.g:1386:2: rule__ShapeGroup__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_4_0__1"


    // $ANTLR start "rule__ShapeGroup__Group_4_0__1__Impl"
    // InternalOnlineElm.g:1392:1: rule__ShapeGroup__Group_4_0__1__Impl : ( ( rule__ShapeGroup__S2Assignment_4_0_1 ) ) ;
    public final void rule__ShapeGroup__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1396:1: ( ( ( rule__ShapeGroup__S2Assignment_4_0_1 ) ) )
            // InternalOnlineElm.g:1397:1: ( ( rule__ShapeGroup__S2Assignment_4_0_1 ) )
            {
            // InternalOnlineElm.g:1397:1: ( ( rule__ShapeGroup__S2Assignment_4_0_1 ) )
            // InternalOnlineElm.g:1398:2: ( rule__ShapeGroup__S2Assignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS2Assignment_4_0_1()); 
            }
            // InternalOnlineElm.g:1399:2: ( rule__ShapeGroup__S2Assignment_4_0_1 )
            // InternalOnlineElm.g:1399:3: rule__ShapeGroup__S2Assignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__S2Assignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS2Assignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_4_0__1__Impl"


    // $ANTLR start "rule__ShapeGroup__Group_6__0"
    // InternalOnlineElm.g:1408:1: rule__ShapeGroup__Group_6__0 : rule__ShapeGroup__Group_6__0__Impl rule__ShapeGroup__Group_6__1 ;
    public final void rule__ShapeGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1412:1: ( rule__ShapeGroup__Group_6__0__Impl rule__ShapeGroup__Group_6__1 )
            // InternalOnlineElm.g:1413:2: rule__ShapeGroup__Group_6__0__Impl rule__ShapeGroup__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__ShapeGroup__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_6__0"


    // $ANTLR start "rule__ShapeGroup__Group_6__0__Impl"
    // InternalOnlineElm.g:1420:1: rule__ShapeGroup__Group_6__0__Impl : ( '++' ) ;
    public final void rule__ShapeGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1424:1: ( ( '++' ) )
            // InternalOnlineElm.g:1425:1: ( '++' )
            {
            // InternalOnlineElm.g:1425:1: ( '++' )
            // InternalOnlineElm.g:1426:2: '++'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getPlusSignPlusSignKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getPlusSignPlusSignKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_6__0__Impl"


    // $ANTLR start "rule__ShapeGroup__Group_6__1"
    // InternalOnlineElm.g:1435:1: rule__ShapeGroup__Group_6__1 : rule__ShapeGroup__Group_6__1__Impl ;
    public final void rule__ShapeGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1439:1: ( rule__ShapeGroup__Group_6__1__Impl )
            // InternalOnlineElm.g:1440:2: rule__ShapeGroup__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_6__1"


    // $ANTLR start "rule__ShapeGroup__Group_6__1__Impl"
    // InternalOnlineElm.g:1446:1: rule__ShapeGroup__Group_6__1__Impl : ( ( rule__ShapeGroup__SgAssignment_6_1 ) ) ;
    public final void rule__ShapeGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1450:1: ( ( ( rule__ShapeGroup__SgAssignment_6_1 ) ) )
            // InternalOnlineElm.g:1451:1: ( ( rule__ShapeGroup__SgAssignment_6_1 ) )
            {
            // InternalOnlineElm.g:1451:1: ( ( rule__ShapeGroup__SgAssignment_6_1 ) )
            // InternalOnlineElm.g:1452:2: ( rule__ShapeGroup__SgAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getSgAssignment_6_1()); 
            }
            // InternalOnlineElm.g:1453:2: ( rule__ShapeGroup__SgAssignment_6_1 )
            // InternalOnlineElm.g:1453:3: rule__ShapeGroup__SgAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeGroup__SgAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getSgAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__Group_6__1__Impl"


    // $ANTLR start "rule__BasicShape__Group__0"
    // InternalOnlineElm.g:1462:1: rule__BasicShape__Group__0 : rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1 ;
    public final void rule__BasicShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1466:1: ( rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1 )
            // InternalOnlineElm.g:1467:2: rule__BasicShape__Group__0__Impl rule__BasicShape__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicShape__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:1474:1: rule__BasicShape__Group__0__Impl : ( ( rule__BasicShape__NameAssignment_0 ) ) ;
    public final void rule__BasicShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1478:1: ( ( ( rule__BasicShape__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:1479:1: ( ( rule__BasicShape__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:1479:1: ( ( rule__BasicShape__NameAssignment_0 ) )
            // InternalOnlineElm.g:1480:2: ( rule__BasicShape__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:1481:2: ( rule__BasicShape__NameAssignment_0 )
            // InternalOnlineElm.g:1481:3: rule__BasicShape__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:1489:1: rule__BasicShape__Group__1 : rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2 ;
    public final void rule__BasicShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1493:1: ( rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2 )
            // InternalOnlineElm.g:1494:2: rule__BasicShape__Group__1__Impl rule__BasicShape__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BasicShape__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:1501:1: rule__BasicShape__Group__1__Impl : ( '=' ) ;
    public final void rule__BasicShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1505:1: ( ( '=' ) )
            // InternalOnlineElm.g:1506:1: ( '=' )
            {
            // InternalOnlineElm.g:1506:1: ( '=' )
            // InternalOnlineElm.g:1507:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:1516:1: rule__BasicShape__Group__2 : rule__BasicShape__Group__2__Impl ;
    public final void rule__BasicShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1520:1: ( rule__BasicShape__Group__2__Impl )
            // InternalOnlineElm.g:1521:2: rule__BasicShape__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:1527:1: rule__BasicShape__Group__2__Impl : ( ( rule__BasicShape__ShapeAssignment_2 ) ) ;
    public final void rule__BasicShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1531:1: ( ( ( rule__BasicShape__ShapeAssignment_2 ) ) )
            // InternalOnlineElm.g:1532:1: ( ( rule__BasicShape__ShapeAssignment_2 ) )
            {
            // InternalOnlineElm.g:1532:1: ( ( rule__BasicShape__ShapeAssignment_2 ) )
            // InternalOnlineElm.g:1533:2: ( rule__BasicShape__ShapeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getShapeAssignment_2()); 
            }
            // InternalOnlineElm.g:1534:2: ( rule__BasicShape__ShapeAssignment_2 )
            // InternalOnlineElm.g:1534:3: rule__BasicShape__ShapeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicShape__ShapeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getShapeAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Shape__Group_0__0"
    // InternalOnlineElm.g:1543:1: rule__Shape__Group_0__0 : rule__Shape__Group_0__0__Impl rule__Shape__Group_0__1 ;
    public final void rule__Shape__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1547:1: ( rule__Shape__Group_0__0__Impl rule__Shape__Group_0__1 )
            // InternalOnlineElm.g:1548:2: rule__Shape__Group_0__0__Impl rule__Shape__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Shape__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shape__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__0"


    // $ANTLR start "rule__Shape__Group_0__0__Impl"
    // InternalOnlineElm.g:1555:1: rule__Shape__Group_0__0__Impl : ( ( rule__Shape__StencilAssignment_0_0 ) ) ;
    public final void rule__Shape__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1559:1: ( ( ( rule__Shape__StencilAssignment_0_0 ) ) )
            // InternalOnlineElm.g:1560:1: ( ( rule__Shape__StencilAssignment_0_0 ) )
            {
            // InternalOnlineElm.g:1560:1: ( ( rule__Shape__StencilAssignment_0_0 ) )
            // InternalOnlineElm.g:1561:2: ( rule__Shape__StencilAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getStencilAssignment_0_0()); 
            }
            // InternalOnlineElm.g:1562:2: ( rule__Shape__StencilAssignment_0_0 )
            // InternalOnlineElm.g:1562:3: rule__Shape__StencilAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Shape__StencilAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getStencilAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__0__Impl"


    // $ANTLR start "rule__Shape__Group_0__1"
    // InternalOnlineElm.g:1570:1: rule__Shape__Group_0__1 : rule__Shape__Group_0__1__Impl rule__Shape__Group_0__2 ;
    public final void rule__Shape__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1574:1: ( rule__Shape__Group_0__1__Impl rule__Shape__Group_0__2 )
            // InternalOnlineElm.g:1575:2: rule__Shape__Group_0__1__Impl rule__Shape__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Shape__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shape__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__1"


    // $ANTLR start "rule__Shape__Group_0__1__Impl"
    // InternalOnlineElm.g:1582:1: rule__Shape__Group_0__1__Impl : ( '|>' ) ;
    public final void rule__Shape__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1586:1: ( ( '|>' ) )
            // InternalOnlineElm.g:1587:1: ( '|>' )
            {
            // InternalOnlineElm.g:1587:1: ( '|>' )
            // InternalOnlineElm.g:1588:2: '|>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__1__Impl"


    // $ANTLR start "rule__Shape__Group_0__2"
    // InternalOnlineElm.g:1597:1: rule__Shape__Group_0__2 : rule__Shape__Group_0__2__Impl ;
    public final void rule__Shape__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1601:1: ( rule__Shape__Group_0__2__Impl )
            // InternalOnlineElm.g:1602:2: rule__Shape__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__2"


    // $ANTLR start "rule__Shape__Group_0__2__Impl"
    // InternalOnlineElm.g:1608:1: rule__Shape__Group_0__2__Impl : ( ( rule__Shape__DrawAssignment_0_2 ) ) ;
    public final void rule__Shape__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1612:1: ( ( ( rule__Shape__DrawAssignment_0_2 ) ) )
            // InternalOnlineElm.g:1613:1: ( ( rule__Shape__DrawAssignment_0_2 ) )
            {
            // InternalOnlineElm.g:1613:1: ( ( rule__Shape__DrawAssignment_0_2 ) )
            // InternalOnlineElm.g:1614:2: ( rule__Shape__DrawAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getDrawAssignment_0_2()); 
            }
            // InternalOnlineElm.g:1615:2: ( rule__Shape__DrawAssignment_0_2 )
            // InternalOnlineElm.g:1615:3: rule__Shape__DrawAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Shape__DrawAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getDrawAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_0__2__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalOnlineElm.g:1624:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1628:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalOnlineElm.g:1629:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Conditional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalOnlineElm.g:1636:1: rule__Conditional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1640:1: ( ( 'if' ) )
            // InternalOnlineElm.g:1641:1: ( 'if' )
            {
            // InternalOnlineElm.g:1641:1: ( 'if' )
            // InternalOnlineElm.g:1642:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalOnlineElm.g:1651:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1655:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalOnlineElm.g:1656:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Conditional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalOnlineElm.g:1663:1: rule__Conditional__Group__1__Impl : ( ruleBool_exp ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1667:1: ( ( ruleBool_exp ) )
            // InternalOnlineElm.g:1668:1: ( ruleBool_exp )
            {
            // InternalOnlineElm.g:1668:1: ( ruleBool_exp )
            // InternalOnlineElm.g:1669:2: ruleBool_exp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getBool_expParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleBool_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getBool_expParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalOnlineElm.g:1678:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1682:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalOnlineElm.g:1683:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalOnlineElm.g:1690:1: rule__Conditional__Group__2__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1694:1: ( ( 'then' ) )
            // InternalOnlineElm.g:1695:1: ( 'then' )
            {
            // InternalOnlineElm.g:1695:1: ( 'then' )
            // InternalOnlineElm.g:1696:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getThenKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalOnlineElm.g:1705:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1709:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalOnlineElm.g:1710:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Conditional__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalOnlineElm.g:1717:1: rule__Conditional__Group__3__Impl : ( ( rule__Conditional__Exp1Assignment_3 ) ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1721:1: ( ( ( rule__Conditional__Exp1Assignment_3 ) ) )
            // InternalOnlineElm.g:1722:1: ( ( rule__Conditional__Exp1Assignment_3 ) )
            {
            // InternalOnlineElm.g:1722:1: ( ( rule__Conditional__Exp1Assignment_3 ) )
            // InternalOnlineElm.g:1723:2: ( rule__Conditional__Exp1Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getExp1Assignment_3()); 
            }
            // InternalOnlineElm.g:1724:2: ( rule__Conditional__Exp1Assignment_3 )
            // InternalOnlineElm.g:1724:3: rule__Conditional__Exp1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Exp1Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getExp1Assignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalOnlineElm.g:1732:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1736:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalOnlineElm.g:1737:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalOnlineElm.g:1744:1: rule__Conditional__Group__4__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1748:1: ( ( 'else' ) )
            // InternalOnlineElm.g:1749:1: ( 'else' )
            {
            // InternalOnlineElm.g:1749:1: ( 'else' )
            // InternalOnlineElm.g:1750:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getElseKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalOnlineElm.g:1759:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1763:1: ( rule__Conditional__Group__5__Impl )
            // InternalOnlineElm.g:1764:2: rule__Conditional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalOnlineElm.g:1770:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Exp2Assignment_5 ) ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1774:1: ( ( ( rule__Conditional__Exp2Assignment_5 ) ) )
            // InternalOnlineElm.g:1775:1: ( ( rule__Conditional__Exp2Assignment_5 ) )
            {
            // InternalOnlineElm.g:1775:1: ( ( rule__Conditional__Exp2Assignment_5 ) )
            // InternalOnlineElm.g:1776:2: ( rule__Conditional__Exp2Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getExp2Assignment_5()); 
            }
            // InternalOnlineElm.g:1777:2: ( rule__Conditional__Exp2Assignment_5 )
            // InternalOnlineElm.g:1777:3: rule__Conditional__Exp2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Exp2Assignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getExp2Assignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Bool_exp__Group__0"
    // InternalOnlineElm.g:1786:1: rule__Bool_exp__Group__0 : rule__Bool_exp__Group__0__Impl rule__Bool_exp__Group__1 ;
    public final void rule__Bool_exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1790:1: ( rule__Bool_exp__Group__0__Impl rule__Bool_exp__Group__1 )
            // InternalOnlineElm.g:1791:2: rule__Bool_exp__Group__0__Impl rule__Bool_exp__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Bool_exp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__0"


    // $ANTLR start "rule__Bool_exp__Group__0__Impl"
    // InternalOnlineElm.g:1798:1: rule__Bool_exp__Group__0__Impl : ( ( 'not' )? ) ;
    public final void rule__Bool_exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1802:1: ( ( ( 'not' )? ) )
            // InternalOnlineElm.g:1803:1: ( ( 'not' )? )
            {
            // InternalOnlineElm.g:1803:1: ( ( 'not' )? )
            // InternalOnlineElm.g:1804:2: ( 'not' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getNotKeyword_0()); 
            }
            // InternalOnlineElm.g:1805:2: ( 'not' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOnlineElm.g:1805:3: 'not'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getNotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__0__Impl"


    // $ANTLR start "rule__Bool_exp__Group__1"
    // InternalOnlineElm.g:1813:1: rule__Bool_exp__Group__1 : rule__Bool_exp__Group__1__Impl rule__Bool_exp__Group__2 ;
    public final void rule__Bool_exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1817:1: ( rule__Bool_exp__Group__1__Impl rule__Bool_exp__Group__2 )
            // InternalOnlineElm.g:1818:2: rule__Bool_exp__Group__1__Impl rule__Bool_exp__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Bool_exp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__1"


    // $ANTLR start "rule__Bool_exp__Group__1__Impl"
    // InternalOnlineElm.g:1825:1: rule__Bool_exp__Group__1__Impl : ( ( rule__Bool_exp__LeftAssignment_1 ) ) ;
    public final void rule__Bool_exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1829:1: ( ( ( rule__Bool_exp__LeftAssignment_1 ) ) )
            // InternalOnlineElm.g:1830:1: ( ( rule__Bool_exp__LeftAssignment_1 ) )
            {
            // InternalOnlineElm.g:1830:1: ( ( rule__Bool_exp__LeftAssignment_1 ) )
            // InternalOnlineElm.g:1831:2: ( rule__Bool_exp__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getLeftAssignment_1()); 
            }
            // InternalOnlineElm.g:1832:2: ( rule__Bool_exp__LeftAssignment_1 )
            // InternalOnlineElm.g:1832:3: rule__Bool_exp__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__1__Impl"


    // $ANTLR start "rule__Bool_exp__Group__2"
    // InternalOnlineElm.g:1840:1: rule__Bool_exp__Group__2 : rule__Bool_exp__Group__2__Impl ;
    public final void rule__Bool_exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1844:1: ( rule__Bool_exp__Group__2__Impl )
            // InternalOnlineElm.g:1845:2: rule__Bool_exp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__2"


    // $ANTLR start "rule__Bool_exp__Group__2__Impl"
    // InternalOnlineElm.g:1851:1: rule__Bool_exp__Group__2__Impl : ( ( rule__Bool_exp__Group_2__0 )* ) ;
    public final void rule__Bool_exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1855:1: ( ( ( rule__Bool_exp__Group_2__0 )* ) )
            // InternalOnlineElm.g:1856:1: ( ( rule__Bool_exp__Group_2__0 )* )
            {
            // InternalOnlineElm.g:1856:1: ( ( rule__Bool_exp__Group_2__0 )* )
            // InternalOnlineElm.g:1857:2: ( rule__Bool_exp__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getGroup_2()); 
            }
            // InternalOnlineElm.g:1858:2: ( rule__Bool_exp__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOnlineElm.g:1858:3: rule__Bool_exp__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Bool_exp__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group__2__Impl"


    // $ANTLR start "rule__Bool_exp__Group_2__0"
    // InternalOnlineElm.g:1867:1: rule__Bool_exp__Group_2__0 : rule__Bool_exp__Group_2__0__Impl rule__Bool_exp__Group_2__1 ;
    public final void rule__Bool_exp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1871:1: ( rule__Bool_exp__Group_2__0__Impl rule__Bool_exp__Group_2__1 )
            // InternalOnlineElm.g:1872:2: rule__Bool_exp__Group_2__0__Impl rule__Bool_exp__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Bool_exp__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group_2__0"


    // $ANTLR start "rule__Bool_exp__Group_2__0__Impl"
    // InternalOnlineElm.g:1879:1: rule__Bool_exp__Group_2__0__Impl : ( ( rule__Bool_exp__OperatorAssignment_2_0 ) ) ;
    public final void rule__Bool_exp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1883:1: ( ( ( rule__Bool_exp__OperatorAssignment_2_0 ) ) )
            // InternalOnlineElm.g:1884:1: ( ( rule__Bool_exp__OperatorAssignment_2_0 ) )
            {
            // InternalOnlineElm.g:1884:1: ( ( rule__Bool_exp__OperatorAssignment_2_0 ) )
            // InternalOnlineElm.g:1885:2: ( rule__Bool_exp__OperatorAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getOperatorAssignment_2_0()); 
            }
            // InternalOnlineElm.g:1886:2: ( rule__Bool_exp__OperatorAssignment_2_0 )
            // InternalOnlineElm.g:1886:3: rule__Bool_exp__OperatorAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__OperatorAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getOperatorAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group_2__0__Impl"


    // $ANTLR start "rule__Bool_exp__Group_2__1"
    // InternalOnlineElm.g:1894:1: rule__Bool_exp__Group_2__1 : rule__Bool_exp__Group_2__1__Impl ;
    public final void rule__Bool_exp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1898:1: ( rule__Bool_exp__Group_2__1__Impl )
            // InternalOnlineElm.g:1899:2: rule__Bool_exp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group_2__1"


    // $ANTLR start "rule__Bool_exp__Group_2__1__Impl"
    // InternalOnlineElm.g:1905:1: rule__Bool_exp__Group_2__1__Impl : ( ( rule__Bool_exp__RightsAssignment_2_1 ) ) ;
    public final void rule__Bool_exp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1909:1: ( ( ( rule__Bool_exp__RightsAssignment_2_1 ) ) )
            // InternalOnlineElm.g:1910:1: ( ( rule__Bool_exp__RightsAssignment_2_1 ) )
            {
            // InternalOnlineElm.g:1910:1: ( ( rule__Bool_exp__RightsAssignment_2_1 ) )
            // InternalOnlineElm.g:1911:2: ( rule__Bool_exp__RightsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getRightsAssignment_2_1()); 
            }
            // InternalOnlineElm.g:1912:2: ( rule__Bool_exp__RightsAssignment_2_1 )
            // InternalOnlineElm.g:1912:3: rule__Bool_exp__RightsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Bool_exp__RightsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getRightsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__Group_2__1__Impl"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__0"
    // InternalOnlineElm.g:1921:1: rule__Terminal_Bool_exp__Group__0 : rule__Terminal_Bool_exp__Group__0__Impl rule__Terminal_Bool_exp__Group__1 ;
    public final void rule__Terminal_Bool_exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1925:1: ( rule__Terminal_Bool_exp__Group__0__Impl rule__Terminal_Bool_exp__Group__1 )
            // InternalOnlineElm.g:1926:2: rule__Terminal_Bool_exp__Group__0__Impl rule__Terminal_Bool_exp__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Terminal_Bool_exp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__0"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__0__Impl"
    // InternalOnlineElm.g:1933:1: rule__Terminal_Bool_exp__Group__0__Impl : ( ( rule__Terminal_Bool_exp__N1Assignment_0 ) ) ;
    public final void rule__Terminal_Bool_exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1937:1: ( ( ( rule__Terminal_Bool_exp__N1Assignment_0 ) ) )
            // InternalOnlineElm.g:1938:1: ( ( rule__Terminal_Bool_exp__N1Assignment_0 ) )
            {
            // InternalOnlineElm.g:1938:1: ( ( rule__Terminal_Bool_exp__N1Assignment_0 ) )
            // InternalOnlineElm.g:1939:2: ( rule__Terminal_Bool_exp__N1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getN1Assignment_0()); 
            }
            // InternalOnlineElm.g:1940:2: ( rule__Terminal_Bool_exp__N1Assignment_0 )
            // InternalOnlineElm.g:1940:3: rule__Terminal_Bool_exp__N1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__N1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getN1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__0__Impl"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__1"
    // InternalOnlineElm.g:1948:1: rule__Terminal_Bool_exp__Group__1 : rule__Terminal_Bool_exp__Group__1__Impl rule__Terminal_Bool_exp__Group__2 ;
    public final void rule__Terminal_Bool_exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1952:1: ( rule__Terminal_Bool_exp__Group__1__Impl rule__Terminal_Bool_exp__Group__2 )
            // InternalOnlineElm.g:1953:2: rule__Terminal_Bool_exp__Group__1__Impl rule__Terminal_Bool_exp__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Terminal_Bool_exp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__1"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__1__Impl"
    // InternalOnlineElm.g:1960:1: rule__Terminal_Bool_exp__Group__1__Impl : ( ( rule__Terminal_Bool_exp__CompAssignment_1 ) ) ;
    public final void rule__Terminal_Bool_exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1964:1: ( ( ( rule__Terminal_Bool_exp__CompAssignment_1 ) ) )
            // InternalOnlineElm.g:1965:1: ( ( rule__Terminal_Bool_exp__CompAssignment_1 ) )
            {
            // InternalOnlineElm.g:1965:1: ( ( rule__Terminal_Bool_exp__CompAssignment_1 ) )
            // InternalOnlineElm.g:1966:2: ( rule__Terminal_Bool_exp__CompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getCompAssignment_1()); 
            }
            // InternalOnlineElm.g:1967:2: ( rule__Terminal_Bool_exp__CompAssignment_1 )
            // InternalOnlineElm.g:1967:3: rule__Terminal_Bool_exp__CompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__CompAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getCompAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__1__Impl"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__2"
    // InternalOnlineElm.g:1975:1: rule__Terminal_Bool_exp__Group__2 : rule__Terminal_Bool_exp__Group__2__Impl ;
    public final void rule__Terminal_Bool_exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1979:1: ( rule__Terminal_Bool_exp__Group__2__Impl )
            // InternalOnlineElm.g:1980:2: rule__Terminal_Bool_exp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__2"


    // $ANTLR start "rule__Terminal_Bool_exp__Group__2__Impl"
    // InternalOnlineElm.g:1986:1: rule__Terminal_Bool_exp__Group__2__Impl : ( ( rule__Terminal_Bool_exp__N2Assignment_2 ) ) ;
    public final void rule__Terminal_Bool_exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:1990:1: ( ( ( rule__Terminal_Bool_exp__N2Assignment_2 ) ) )
            // InternalOnlineElm.g:1991:1: ( ( rule__Terminal_Bool_exp__N2Assignment_2 ) )
            {
            // InternalOnlineElm.g:1991:1: ( ( rule__Terminal_Bool_exp__N2Assignment_2 ) )
            // InternalOnlineElm.g:1992:2: ( rule__Terminal_Bool_exp__N2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getN2Assignment_2()); 
            }
            // InternalOnlineElm.g:1993:2: ( rule__Terminal_Bool_exp__N2Assignment_2 )
            // InternalOnlineElm.g:1993:3: rule__Terminal_Bool_exp__N2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Terminal_Bool_exp__N2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getN2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__Group__2__Impl"


    // $ANTLR start "rule__Math_exp__Group__0"
    // InternalOnlineElm.g:2002:1: rule__Math_exp__Group__0 : rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1 ;
    public final void rule__Math_exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2006:1: ( rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1 )
            // InternalOnlineElm.g:2007:2: rule__Math_exp__Group__0__Impl rule__Math_exp__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Math_exp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2014:1: rule__Math_exp__Group__0__Impl : ( '(' ) ;
    public final void rule__Math_exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2018:1: ( ( '(' ) )
            // InternalOnlineElm.g:2019:1: ( '(' )
            {
            // InternalOnlineElm.g:2019:1: ( '(' )
            // InternalOnlineElm.g:2020:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2029:1: rule__Math_exp__Group__1 : rule__Math_exp__Group__1__Impl rule__Math_exp__Group__2 ;
    public final void rule__Math_exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2033:1: ( rule__Math_exp__Group__1__Impl rule__Math_exp__Group__2 )
            // InternalOnlineElm.g:2034:2: rule__Math_exp__Group__1__Impl rule__Math_exp__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Math_exp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2041:1: rule__Math_exp__Group__1__Impl : ( ( rule__Math_exp__N1Assignment_1 ) ) ;
    public final void rule__Math_exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2045:1: ( ( ( rule__Math_exp__N1Assignment_1 ) ) )
            // InternalOnlineElm.g:2046:1: ( ( rule__Math_exp__N1Assignment_1 ) )
            {
            // InternalOnlineElm.g:2046:1: ( ( rule__Math_exp__N1Assignment_1 ) )
            // InternalOnlineElm.g:2047:2: ( rule__Math_exp__N1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getN1Assignment_1()); 
            }
            // InternalOnlineElm.g:2048:2: ( rule__Math_exp__N1Assignment_1 )
            // InternalOnlineElm.g:2048:3: rule__Math_exp__N1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__N1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getN1Assignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Math_exp__Group__2"
    // InternalOnlineElm.g:2056:1: rule__Math_exp__Group__2 : rule__Math_exp__Group__2__Impl rule__Math_exp__Group__3 ;
    public final void rule__Math_exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2060:1: ( rule__Math_exp__Group__2__Impl rule__Math_exp__Group__3 )
            // InternalOnlineElm.g:2061:2: rule__Math_exp__Group__2__Impl rule__Math_exp__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Math_exp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__2"


    // $ANTLR start "rule__Math_exp__Group__2__Impl"
    // InternalOnlineElm.g:2068:1: rule__Math_exp__Group__2__Impl : ( ( rule__Math_exp__Op1Assignment_2 ) ) ;
    public final void rule__Math_exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2072:1: ( ( ( rule__Math_exp__Op1Assignment_2 ) ) )
            // InternalOnlineElm.g:2073:1: ( ( rule__Math_exp__Op1Assignment_2 ) )
            {
            // InternalOnlineElm.g:2073:1: ( ( rule__Math_exp__Op1Assignment_2 ) )
            // InternalOnlineElm.g:2074:2: ( rule__Math_exp__Op1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getOp1Assignment_2()); 
            }
            // InternalOnlineElm.g:2075:2: ( rule__Math_exp__Op1Assignment_2 )
            // InternalOnlineElm.g:2075:3: rule__Math_exp__Op1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Op1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getOp1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__2__Impl"


    // $ANTLR start "rule__Math_exp__Group__3"
    // InternalOnlineElm.g:2083:1: rule__Math_exp__Group__3 : rule__Math_exp__Group__3__Impl rule__Math_exp__Group__4 ;
    public final void rule__Math_exp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2087:1: ( rule__Math_exp__Group__3__Impl rule__Math_exp__Group__4 )
            // InternalOnlineElm.g:2088:2: rule__Math_exp__Group__3__Impl rule__Math_exp__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Math_exp__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__3"


    // $ANTLR start "rule__Math_exp__Group__3__Impl"
    // InternalOnlineElm.g:2095:1: rule__Math_exp__Group__3__Impl : ( ( rule__Math_exp__N2Assignment_3 ) ) ;
    public final void rule__Math_exp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2099:1: ( ( ( rule__Math_exp__N2Assignment_3 ) ) )
            // InternalOnlineElm.g:2100:1: ( ( rule__Math_exp__N2Assignment_3 ) )
            {
            // InternalOnlineElm.g:2100:1: ( ( rule__Math_exp__N2Assignment_3 ) )
            // InternalOnlineElm.g:2101:2: ( rule__Math_exp__N2Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getN2Assignment_3()); 
            }
            // InternalOnlineElm.g:2102:2: ( rule__Math_exp__N2Assignment_3 )
            // InternalOnlineElm.g:2102:3: rule__Math_exp__N2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__N2Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getN2Assignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__3__Impl"


    // $ANTLR start "rule__Math_exp__Group__4"
    // InternalOnlineElm.g:2110:1: rule__Math_exp__Group__4 : rule__Math_exp__Group__4__Impl ;
    public final void rule__Math_exp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2114:1: ( rule__Math_exp__Group__4__Impl )
            // InternalOnlineElm.g:2115:2: rule__Math_exp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Math_exp__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__4"


    // $ANTLR start "rule__Math_exp__Group__4__Impl"
    // InternalOnlineElm.g:2121:1: rule__Math_exp__Group__4__Impl : ( ')' ) ;
    public final void rule__Math_exp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2125:1: ( ( ')' ) )
            // InternalOnlineElm.g:2126:1: ( ')' )
            {
            // InternalOnlineElm.g:2126:1: ( ')' )
            // InternalOnlineElm.g:2127:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Group__4__Impl"


    // $ANTLR start "rule__Circle__Group__0"
    // InternalOnlineElm.g:2137:1: rule__Circle__Group__0 : rule__Circle__Group__0__Impl rule__Circle__Group__1 ;
    public final void rule__Circle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2141:1: ( rule__Circle__Group__0__Impl rule__Circle__Group__1 )
            // InternalOnlineElm.g:2142:2: rule__Circle__Group__0__Impl rule__Circle__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Circle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Circle__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2149:1: rule__Circle__Group__0__Impl : ( ( rule__Circle__NameAssignment_0 ) ) ;
    public final void rule__Circle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2153:1: ( ( ( rule__Circle__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2154:1: ( ( rule__Circle__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2154:1: ( ( rule__Circle__NameAssignment_0 ) )
            // InternalOnlineElm.g:2155:2: ( rule__Circle__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:2156:2: ( rule__Circle__NameAssignment_0 )
            // InternalOnlineElm.g:2156:3: rule__Circle__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Circle__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2164:1: rule__Circle__Group__1 : rule__Circle__Group__1__Impl ;
    public final void rule__Circle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2168:1: ( rule__Circle__Group__1__Impl )
            // InternalOnlineElm.g:2169:2: rule__Circle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2175:1: rule__Circle__Group__1__Impl : ( ( rule__Circle__DiameterAssignment_1 ) ) ;
    public final void rule__Circle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2179:1: ( ( ( rule__Circle__DiameterAssignment_1 ) ) )
            // InternalOnlineElm.g:2180:1: ( ( rule__Circle__DiameterAssignment_1 ) )
            {
            // InternalOnlineElm.g:2180:1: ( ( rule__Circle__DiameterAssignment_1 ) )
            // InternalOnlineElm.g:2181:2: ( rule__Circle__DiameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getDiameterAssignment_1()); 
            }
            // InternalOnlineElm.g:2182:2: ( rule__Circle__DiameterAssignment_1 )
            // InternalOnlineElm.g:2182:3: rule__Circle__DiameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Circle__DiameterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getDiameterAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2191:1: rule__Rect__Group__0 : rule__Rect__Group__0__Impl rule__Rect__Group__1 ;
    public final void rule__Rect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2195:1: ( rule__Rect__Group__0__Impl rule__Rect__Group__1 )
            // InternalOnlineElm.g:2196:2: rule__Rect__Group__0__Impl rule__Rect__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Rect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2203:1: rule__Rect__Group__0__Impl : ( ( rule__Rect__NameAssignment_0 ) ) ;
    public final void rule__Rect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2207:1: ( ( ( rule__Rect__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2208:1: ( ( rule__Rect__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2208:1: ( ( rule__Rect__NameAssignment_0 ) )
            // InternalOnlineElm.g:2209:2: ( rule__Rect__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:2210:2: ( rule__Rect__NameAssignment_0 )
            // InternalOnlineElm.g:2210:3: rule__Rect__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rect__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2218:1: rule__Rect__Group__1 : rule__Rect__Group__1__Impl rule__Rect__Group__2 ;
    public final void rule__Rect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2222:1: ( rule__Rect__Group__1__Impl rule__Rect__Group__2 )
            // InternalOnlineElm.g:2223:2: rule__Rect__Group__1__Impl rule__Rect__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Rect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2230:1: rule__Rect__Group__1__Impl : ( ( rule__Rect__EdgeXAssignment_1 ) ) ;
    public final void rule__Rect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2234:1: ( ( ( rule__Rect__EdgeXAssignment_1 ) ) )
            // InternalOnlineElm.g:2235:1: ( ( rule__Rect__EdgeXAssignment_1 ) )
            {
            // InternalOnlineElm.g:2235:1: ( ( rule__Rect__EdgeXAssignment_1 ) )
            // InternalOnlineElm.g:2236:2: ( rule__Rect__EdgeXAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getEdgeXAssignment_1()); 
            }
            // InternalOnlineElm.g:2237:2: ( rule__Rect__EdgeXAssignment_1 )
            // InternalOnlineElm.g:2237:3: rule__Rect__EdgeXAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rect__EdgeXAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getEdgeXAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2245:1: rule__Rect__Group__2 : rule__Rect__Group__2__Impl ;
    public final void rule__Rect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2249:1: ( rule__Rect__Group__2__Impl )
            // InternalOnlineElm.g:2250:2: rule__Rect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2256:1: rule__Rect__Group__2__Impl : ( ( rule__Rect__EdgeYAssignment_2 ) ) ;
    public final void rule__Rect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2260:1: ( ( ( rule__Rect__EdgeYAssignment_2 ) ) )
            // InternalOnlineElm.g:2261:1: ( ( rule__Rect__EdgeYAssignment_2 ) )
            {
            // InternalOnlineElm.g:2261:1: ( ( rule__Rect__EdgeYAssignment_2 ) )
            // InternalOnlineElm.g:2262:2: ( rule__Rect__EdgeYAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getEdgeYAssignment_2()); 
            }
            // InternalOnlineElm.g:2263:2: ( rule__Rect__EdgeYAssignment_2 )
            // InternalOnlineElm.g:2263:3: rule__Rect__EdgeYAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rect__EdgeYAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getEdgeYAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Text__Group__0"
    // InternalOnlineElm.g:2272:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2276:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalOnlineElm.g:2277:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Text__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2284:1: rule__Text__Group__0__Impl : ( ( rule__Text__NameAssignment_0 ) ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2288:1: ( ( ( rule__Text__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2289:1: ( ( rule__Text__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2289:1: ( ( rule__Text__NameAssignment_0 ) )
            // InternalOnlineElm.g:2290:2: ( rule__Text__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:2291:2: ( rule__Text__NameAssignment_0 )
            // InternalOnlineElm.g:2291:3: rule__Text__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Text__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2299:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2303:1: ( rule__Text__Group__1__Impl )
            // InternalOnlineElm.g:2304:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2310:1: rule__Text__Group__1__Impl : ( ( rule__Text__ContentAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2314:1: ( ( ( rule__Text__ContentAssignment_1 ) ) )
            // InternalOnlineElm.g:2315:1: ( ( rule__Text__ContentAssignment_1 ) )
            {
            // InternalOnlineElm.g:2315:1: ( ( rule__Text__ContentAssignment_1 ) )
            // InternalOnlineElm.g:2316:2: ( rule__Text__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getContentAssignment_1()); 
            }
            // InternalOnlineElm.g:2317:2: ( rule__Text__ContentAssignment_1 )
            // InternalOnlineElm.g:2317:3: rule__Text__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getContentAssignment_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2326:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2330:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalOnlineElm.g:2331:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Draw__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Draw__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2338:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__FilledColorAssignment_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2342:1: ( ( ( rule__Draw__FilledColorAssignment_0 ) ) )
            // InternalOnlineElm.g:2343:1: ( ( rule__Draw__FilledColorAssignment_0 ) )
            {
            // InternalOnlineElm.g:2343:1: ( ( rule__Draw__FilledColorAssignment_0 ) )
            // InternalOnlineElm.g:2344:2: ( rule__Draw__FilledColorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getFilledColorAssignment_0()); 
            }
            // InternalOnlineElm.g:2345:2: ( rule__Draw__FilledColorAssignment_0 )
            // InternalOnlineElm.g:2345:3: rule__Draw__FilledColorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__FilledColorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getFilledColorAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2353:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2357:1: ( rule__Draw__Group__1__Impl )
            // InternalOnlineElm.g:2358:2: rule__Draw__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2364:1: rule__Draw__Group__1__Impl : ( ( rule__Draw__Group_1__0 )? ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2368:1: ( ( ( rule__Draw__Group_1__0 )? ) )
            // InternalOnlineElm.g:2369:1: ( ( rule__Draw__Group_1__0 )? )
            {
            // InternalOnlineElm.g:2369:1: ( ( rule__Draw__Group_1__0 )? )
            // InternalOnlineElm.g:2370:2: ( rule__Draw__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getGroup_1()); 
            }
            // InternalOnlineElm.g:2371:2: ( rule__Draw__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOnlineElm.g:2371:3: rule__Draw__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Draw__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2380:1: rule__Draw__Group_1__0 : rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1 ;
    public final void rule__Draw__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2384:1: ( rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1 )
            // InternalOnlineElm.g:2385:2: rule__Draw__Group_1__0__Impl rule__Draw__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Draw__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Draw__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2392:1: rule__Draw__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__Draw__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2396:1: ( ( '|>' ) )
            // InternalOnlineElm.g:2397:1: ( '|>' )
            {
            // InternalOnlineElm.g:2397:1: ( '|>' )
            // InternalOnlineElm.g:2398:2: '|>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2407:1: rule__Draw__Group_1__1 : rule__Draw__Group_1__1__Impl ;
    public final void rule__Draw__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2411:1: ( rule__Draw__Group_1__1__Impl )
            // InternalOnlineElm.g:2412:2: rule__Draw__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2418:1: rule__Draw__Group_1__1__Impl : ( ( rule__Draw__PositionAssignment_1_1 ) ) ;
    public final void rule__Draw__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2422:1: ( ( ( rule__Draw__PositionAssignment_1_1 ) ) )
            // InternalOnlineElm.g:2423:1: ( ( rule__Draw__PositionAssignment_1_1 ) )
            {
            // InternalOnlineElm.g:2423:1: ( ( rule__Draw__PositionAssignment_1_1 ) )
            // InternalOnlineElm.g:2424:2: ( rule__Draw__PositionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getPositionAssignment_1_1()); 
            }
            // InternalOnlineElm.g:2425:2: ( rule__Draw__PositionAssignment_1_1 )
            // InternalOnlineElm.g:2425:3: rule__Draw__PositionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Draw__PositionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getPositionAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Fill__Group__0"
    // InternalOnlineElm.g:2434:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2438:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalOnlineElm.g:2439:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Fill__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fill__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // InternalOnlineElm.g:2446:1: rule__Fill__Group__0__Impl : ( ( rule__Fill__NameAssignment_0 ) ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2450:1: ( ( ( rule__Fill__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2451:1: ( ( rule__Fill__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2451:1: ( ( rule__Fill__NameAssignment_0 ) )
            // InternalOnlineElm.g:2452:2: ( rule__Fill__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:2453:2: ( rule__Fill__NameAssignment_0 )
            // InternalOnlineElm.g:2453:3: rule__Fill__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // InternalOnlineElm.g:2461:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2465:1: ( rule__Fill__Group__1__Impl )
            // InternalOnlineElm.g:2466:2: rule__Fill__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // InternalOnlineElm.g:2472:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__ColorAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2476:1: ( ( ( rule__Fill__ColorAssignment_1 ) ) )
            // InternalOnlineElm.g:2477:1: ( ( rule__Fill__ColorAssignment_1 ) )
            {
            // InternalOnlineElm.g:2477:1: ( ( rule__Fill__ColorAssignment_1 ) )
            // InternalOnlineElm.g:2478:2: ( rule__Fill__ColorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getColorAssignment_1()); 
            }
            // InternalOnlineElm.g:2479:2: ( rule__Fill__ColorAssignment_1 )
            // InternalOnlineElm.g:2479:3: rule__Fill__ColorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ColorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getColorAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalOnlineElm.g:2488:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2492:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalOnlineElm.g:2493:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Move__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2500:1: rule__Move__Group__0__Impl : ( ( rule__Move__NameAssignment_0 ) ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2504:1: ( ( ( rule__Move__NameAssignment_0 ) ) )
            // InternalOnlineElm.g:2505:1: ( ( rule__Move__NameAssignment_0 ) )
            {
            // InternalOnlineElm.g:2505:1: ( ( rule__Move__NameAssignment_0 ) )
            // InternalOnlineElm.g:2506:2: ( rule__Move__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getNameAssignment_0()); 
            }
            // InternalOnlineElm.g:2507:2: ( rule__Move__NameAssignment_0 )
            // InternalOnlineElm.g:2507:3: rule__Move__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2515:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2519:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalOnlineElm.g:2520:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Move__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalOnlineElm.g:2527:1: rule__Move__Group__1__Impl : ( '(' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2531:1: ( ( '(' ) )
            // InternalOnlineElm.g:2532:1: ( '(' )
            {
            // InternalOnlineElm.g:2532:1: ( '(' )
            // InternalOnlineElm.g:2533:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Move__Group__2"
    // InternalOnlineElm.g:2542:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2546:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalOnlineElm.g:2547:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Move__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalOnlineElm.g:2554:1: rule__Move__Group__2__Impl : ( ( rule__Move__XAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2558:1: ( ( ( rule__Move__XAssignment_2 ) ) )
            // InternalOnlineElm.g:2559:1: ( ( rule__Move__XAssignment_2 ) )
            {
            // InternalOnlineElm.g:2559:1: ( ( rule__Move__XAssignment_2 ) )
            // InternalOnlineElm.g:2560:2: ( rule__Move__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getXAssignment_2()); 
            }
            // InternalOnlineElm.g:2561:2: ( rule__Move__XAssignment_2 )
            // InternalOnlineElm.g:2561:3: rule__Move__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__XAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getXAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalOnlineElm.g:2569:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2573:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalOnlineElm.g:2574:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Move__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalOnlineElm.g:2581:1: rule__Move__Group__3__Impl : ( ',' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2585:1: ( ( ',' ) )
            // InternalOnlineElm.g:2586:1: ( ',' )
            {
            // InternalOnlineElm.g:2586:1: ( ',' )
            // InternalOnlineElm.g:2587:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getCommaKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalOnlineElm.g:2596:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2600:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalOnlineElm.g:2601:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Move__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Move__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalOnlineElm.g:2608:1: rule__Move__Group__4__Impl : ( ( rule__Move__YAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2612:1: ( ( ( rule__Move__YAssignment_4 ) ) )
            // InternalOnlineElm.g:2613:1: ( ( rule__Move__YAssignment_4 ) )
            {
            // InternalOnlineElm.g:2613:1: ( ( rule__Move__YAssignment_4 ) )
            // InternalOnlineElm.g:2614:2: ( rule__Move__YAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getYAssignment_4()); 
            }
            // InternalOnlineElm.g:2615:2: ( rule__Move__YAssignment_4 )
            // InternalOnlineElm.g:2615:3: rule__Move__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Move__YAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getYAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // InternalOnlineElm.g:2623:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2627:1: ( rule__Move__Group__5__Impl )
            // InternalOnlineElm.g:2628:2: rule__Move__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // InternalOnlineElm.g:2634:1: rule__Move__Group__5__Impl : ( ')' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2638:1: ( ( ')' ) )
            // InternalOnlineElm.g:2639:1: ( ')' )
            {
            // InternalOnlineElm.g:2639:1: ( ')' )
            // InternalOnlineElm.g:2640:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__OnlineElm__UnorderedGroup"
    // InternalOnlineElm.g:2650:1: rule__OnlineElm__UnorderedGroup : rule__OnlineElm__UnorderedGroup__0 {...}?;
    public final void rule__OnlineElm__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
        	
        try {
            // InternalOnlineElm.g:2655:1: ( rule__OnlineElm__UnorderedGroup__0 {...}?)
            // InternalOnlineElm.g:2656:2: rule__OnlineElm__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOnlineElmAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__OnlineElm__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getOnlineElmAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__UnorderedGroup"


    // $ANTLR start "rule__OnlineElm__UnorderedGroup__Impl"
    // InternalOnlineElm.g:2664:1: rule__OnlineElm__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) ) ) ;
    public final void rule__OnlineElm__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOnlineElm.g:2669:1: ( ( ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) ) ) )
            // InternalOnlineElm.g:2670:3: ( ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) ) )
            {
            // InternalOnlineElm.g:2670:3: ( ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOnlineElm.g:2671:3: ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) )
                    {
                    // InternalOnlineElm.g:2671:3: ({...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) ) )
                    // InternalOnlineElm.g:2672:4: {...}? => ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__OnlineElm__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalOnlineElm.g:2672:103: ( ( ( rule__OnlineElm__EntryAssignment_0 ) ) )
                    // InternalOnlineElm.g:2673:5: ( ( rule__OnlineElm__EntryAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalOnlineElm.g:2679:5: ( ( rule__OnlineElm__EntryAssignment_0 ) )
                    // InternalOnlineElm.g:2680:6: ( rule__OnlineElm__EntryAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOnlineElmAccess().getEntryAssignment_0()); 
                    }
                    // InternalOnlineElm.g:2681:6: ( rule__OnlineElm__EntryAssignment_0 )
                    // InternalOnlineElm.g:2681:7: rule__OnlineElm__EntryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OnlineElm__EntryAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOnlineElmAccess().getEntryAssignment_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:2686:3: ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) )
                    {
                    // InternalOnlineElm.g:2686:3: ({...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) ) )
                    // InternalOnlineElm.g:2687:4: {...}? => ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__OnlineElm__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalOnlineElm.g:2687:103: ( ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) ) )
                    // InternalOnlineElm.g:2688:5: ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalOnlineElm.g:2694:5: ( ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* ) )
                    // InternalOnlineElm.g:2695:6: ( ( rule__OnlineElm__ShapesAssignment_1 ) ) ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* )
                    {
                    // InternalOnlineElm.g:2695:6: ( ( rule__OnlineElm__ShapesAssignment_1 ) )
                    // InternalOnlineElm.g:2696:7: ( rule__OnlineElm__ShapesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 
                    }
                    // InternalOnlineElm.g:2697:7: ( rule__OnlineElm__ShapesAssignment_1 )
                    // InternalOnlineElm.g:2697:8: rule__OnlineElm__ShapesAssignment_1
                    {
                    pushFollow(FOLLOW_28);
                    rule__OnlineElm__ShapesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 
                    }

                    }

                    // InternalOnlineElm.g:2700:6: ( ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )* )
                    // InternalOnlineElm.g:2701:7: ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 
                    }
                    // InternalOnlineElm.g:2702:7: ( ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1 )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred1_InternalOnlineElm()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalOnlineElm.g:2702:8: ( rule__OnlineElm__ShapesAssignment_1 )=> rule__OnlineElm__ShapesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_28);
                    	    rule__OnlineElm__ShapesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOnlineElmAccess().getShapesAssignment_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__UnorderedGroup__Impl"


    // $ANTLR start "rule__OnlineElm__UnorderedGroup__0"
    // InternalOnlineElm.g:2716:1: rule__OnlineElm__UnorderedGroup__0 : rule__OnlineElm__UnorderedGroup__Impl ( rule__OnlineElm__UnorderedGroup__1 )? ;
    public final void rule__OnlineElm__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2720:1: ( rule__OnlineElm__UnorderedGroup__Impl ( rule__OnlineElm__UnorderedGroup__1 )? )
            // InternalOnlineElm.g:2721:2: rule__OnlineElm__UnorderedGroup__Impl ( rule__OnlineElm__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__OnlineElm__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalOnlineElm.g:2722:2: ( rule__OnlineElm__UnorderedGroup__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOnlineElm.g:2722:2: rule__OnlineElm__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OnlineElm__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__UnorderedGroup__0"


    // $ANTLR start "rule__OnlineElm__UnorderedGroup__1"
    // InternalOnlineElm.g:2728:1: rule__OnlineElm__UnorderedGroup__1 : rule__OnlineElm__UnorderedGroup__Impl ;
    public final void rule__OnlineElm__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2732:1: ( rule__OnlineElm__UnorderedGroup__Impl )
            // InternalOnlineElm.g:2733:2: rule__OnlineElm__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnlineElm__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineElm__UnorderedGroup__1"


    // $ANTLR start "rule__OnlineElm__EntryAssignment_0"
    // InternalOnlineElm.g:2740:1: rule__OnlineElm__EntryAssignment_0 : ( ruleMainShape ) ;
    public final void rule__OnlineElm__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2744:1: ( ( ruleMainShape ) )
            // InternalOnlineElm.g:2745:2: ( ruleMainShape )
            {
            // InternalOnlineElm.g:2745:2: ( ruleMainShape )
            // InternalOnlineElm.g:2746:3: ruleMainShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMainShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalOnlineElm.g:2755:1: rule__OnlineElm__ShapesAssignment_1 : ( ruleShapeDef ) ;
    public final void rule__OnlineElm__ShapesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2759:1: ( ( ruleShapeDef ) )
            // InternalOnlineElm.g:2760:2: ( ruleShapeDef )
            {
            // InternalOnlineElm.g:2760:2: ( ruleShapeDef )
            // InternalOnlineElm.g:2761:3: ruleShapeDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShapeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MainShape__NameAssignment_0"
    // InternalOnlineElm.g:2770:1: rule__MainShape__NameAssignment_0 : ( ( 'myShapes' ) ) ;
    public final void rule__MainShape__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2774:1: ( ( ( 'myShapes' ) ) )
            // InternalOnlineElm.g:2775:2: ( ( 'myShapes' ) )
            {
            // InternalOnlineElm.g:2775:2: ( ( 'myShapes' ) )
            // InternalOnlineElm.g:2776:3: ( 'myShapes' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            }
            // InternalOnlineElm.g:2777:3: ( 'myShapes' )
            // InternalOnlineElm.g:2778:4: 'myShapes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MainShape__S1Assignment_3_0"
    // InternalOnlineElm.g:2789:1: rule__MainShape__S1Assignment_3_0 : ( ruleShape ) ;
    public final void rule__MainShape__S1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2793:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:2794:2: ( ruleShape )
            {
            // InternalOnlineElm.g:2794:2: ( ruleShape )
            // InternalOnlineElm.g:2795:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS1ShapeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS1ShapeParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__S1Assignment_3_0"


    // $ANTLR start "rule__MainShape__S11Assignment_3_1"
    // InternalOnlineElm.g:2804:1: rule__MainShape__S11Assignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MainShape__S11Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2808:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2809:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2809:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2810:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS11BasicShapeCrossReference_3_1_0()); 
            }
            // InternalOnlineElm.g:2811:3: ( RULE_ID )
            // InternalOnlineElm.g:2812:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS11BasicShapeIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS11BasicShapeIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS11BasicShapeCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__S11Assignment_3_1"


    // $ANTLR start "rule__MainShape__S2Assignment_4_0_1"
    // InternalOnlineElm.g:2823:1: rule__MainShape__S2Assignment_4_0_1 : ( ruleShape ) ;
    public final void rule__MainShape__S2Assignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2827:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:2828:2: ( ruleShape )
            {
            // InternalOnlineElm.g:2828:2: ( ruleShape )
            // InternalOnlineElm.g:2829:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS2ShapeParserRuleCall_4_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS2ShapeParserRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__S2Assignment_4_0_1"


    // $ANTLR start "rule__MainShape__S22Assignment_4_1"
    // InternalOnlineElm.g:2838:1: rule__MainShape__S22Assignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MainShape__S22Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2842:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2843:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2843:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2844:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS22BasicShapeCrossReference_4_1_0()); 
            }
            // InternalOnlineElm.g:2845:3: ( RULE_ID )
            // InternalOnlineElm.g:2846:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getS22BasicShapeIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS22BasicShapeIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getS22BasicShapeCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__S22Assignment_4_1"


    // $ANTLR start "rule__MainShape__SgAssignment_6_1"
    // InternalOnlineElm.g:2857:1: rule__MainShape__SgAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__MainShape__SgAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2861:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2862:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2862:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2863:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getSgShapeGroupCrossReference_6_1_0()); 
            }
            // InternalOnlineElm.g:2864:3: ( RULE_ID )
            // InternalOnlineElm.g:2865:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainShapeAccess().getSgShapeGroupIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getSgShapeGroupIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainShapeAccess().getSgShapeGroupCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainShape__SgAssignment_6_1"


    // $ANTLR start "rule__ShapeGroup__NameAssignment_0"
    // InternalOnlineElm.g:2876:1: rule__ShapeGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ShapeGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2880:1: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2881:2: ( RULE_ID )
            {
            // InternalOnlineElm.g:2881:2: ( RULE_ID )
            // InternalOnlineElm.g:2882:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__NameAssignment_0"


    // $ANTLR start "rule__ShapeGroup__S1Assignment_3_0"
    // InternalOnlineElm.g:2891:1: rule__ShapeGroup__S1Assignment_3_0 : ( ruleShape ) ;
    public final void rule__ShapeGroup__S1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2895:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:2896:2: ( ruleShape )
            {
            // InternalOnlineElm.g:2896:2: ( ruleShape )
            // InternalOnlineElm.g:2897:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS1ShapeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS1ShapeParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__S1Assignment_3_0"


    // $ANTLR start "rule__ShapeGroup__S11Assignment_3_1"
    // InternalOnlineElm.g:2906:1: rule__ShapeGroup__S11Assignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeGroup__S11Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2910:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2911:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2911:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2912:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS11BasicShapeCrossReference_3_1_0()); 
            }
            // InternalOnlineElm.g:2913:3: ( RULE_ID )
            // InternalOnlineElm.g:2914:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS11BasicShapeIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS11BasicShapeIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS11BasicShapeCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__S11Assignment_3_1"


    // $ANTLR start "rule__ShapeGroup__S2Assignment_4_0_1"
    // InternalOnlineElm.g:2925:1: rule__ShapeGroup__S2Assignment_4_0_1 : ( ruleShape ) ;
    public final void rule__ShapeGroup__S2Assignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2929:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:2930:2: ( ruleShape )
            {
            // InternalOnlineElm.g:2930:2: ( ruleShape )
            // InternalOnlineElm.g:2931:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS2ShapeParserRuleCall_4_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS2ShapeParserRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__S2Assignment_4_0_1"


    // $ANTLR start "rule__ShapeGroup__S22Assignment_4_1"
    // InternalOnlineElm.g:2940:1: rule__ShapeGroup__S22Assignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeGroup__S22Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2944:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2945:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2945:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2946:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS22BasicShapeCrossReference_4_1_0()); 
            }
            // InternalOnlineElm.g:2947:3: ( RULE_ID )
            // InternalOnlineElm.g:2948:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getS22BasicShapeIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS22BasicShapeIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getS22BasicShapeCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__S22Assignment_4_1"


    // $ANTLR start "rule__ShapeGroup__SgAssignment_6_1"
    // InternalOnlineElm.g:2959:1: rule__ShapeGroup__SgAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeGroup__SgAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2963:1: ( ( ( RULE_ID ) ) )
            // InternalOnlineElm.g:2964:2: ( ( RULE_ID ) )
            {
            // InternalOnlineElm.g:2964:2: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2965:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getSgShapeGroupCrossReference_6_1_0()); 
            }
            // InternalOnlineElm.g:2966:3: ( RULE_ID )
            // InternalOnlineElm.g:2967:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeGroupAccess().getSgShapeGroupIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getSgShapeGroupIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeGroupAccess().getSgShapeGroupCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeGroup__SgAssignment_6_1"


    // $ANTLR start "rule__BasicShape__NameAssignment_0"
    // InternalOnlineElm.g:2978:1: rule__BasicShape__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BasicShape__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2982:1: ( ( RULE_ID ) )
            // InternalOnlineElm.g:2983:2: ( RULE_ID )
            {
            // InternalOnlineElm.g:2983:2: ( RULE_ID )
            // InternalOnlineElm.g:2984:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BasicShape__ShapeAssignment_2"
    // InternalOnlineElm.g:2993:1: rule__BasicShape__ShapeAssignment_2 : ( ruleShape ) ;
    public final void rule__BasicShape__ShapeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:2997:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:2998:2: ( ruleShape )
            {
            // InternalOnlineElm.g:2998:2: ( ruleShape )
            // InternalOnlineElm.g:2999:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicShape__ShapeAssignment_2"


    // $ANTLR start "rule__Shape__StencilAssignment_0_0"
    // InternalOnlineElm.g:3008:1: rule__Shape__StencilAssignment_0_0 : ( ruleStencil ) ;
    public final void rule__Shape__StencilAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3012:1: ( ( ruleStencil ) )
            // InternalOnlineElm.g:3013:2: ( ruleStencil )
            {
            // InternalOnlineElm.g:3013:2: ( ruleStencil )
            // InternalOnlineElm.g:3014:3: ruleStencil
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStencil();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__StencilAssignment_0_0"


    // $ANTLR start "rule__Shape__DrawAssignment_0_2"
    // InternalOnlineElm.g:3023:1: rule__Shape__DrawAssignment_0_2 : ( ruleDraw ) ;
    public final void rule__Shape__DrawAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3027:1: ( ( ruleDraw ) )
            // InternalOnlineElm.g:3028:2: ( ruleDraw )
            {
            // InternalOnlineElm.g:3028:2: ( ruleDraw )
            // InternalOnlineElm.g:3029:3: ruleDraw
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDraw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__DrawAssignment_0_2"


    // $ANTLR start "rule__Conditional__Exp1Assignment_3"
    // InternalOnlineElm.g:3038:1: rule__Conditional__Exp1Assignment_3 : ( ruleShape ) ;
    public final void rule__Conditional__Exp1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3042:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:3043:2: ( ruleShape )
            {
            // InternalOnlineElm.g:3043:2: ( ruleShape )
            // InternalOnlineElm.g:3044:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getExp1ShapeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getExp1ShapeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Exp1Assignment_3"


    // $ANTLR start "rule__Conditional__Exp2Assignment_5"
    // InternalOnlineElm.g:3053:1: rule__Conditional__Exp2Assignment_5 : ( ruleShape ) ;
    public final void rule__Conditional__Exp2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3057:1: ( ( ruleShape ) )
            // InternalOnlineElm.g:3058:2: ( ruleShape )
            {
            // InternalOnlineElm.g:3058:2: ( ruleShape )
            // InternalOnlineElm.g:3059:3: ruleShape
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getExp2ShapeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getExp2ShapeParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Exp2Assignment_5"


    // $ANTLR start "rule__Bool_exp__LeftAssignment_1"
    // InternalOnlineElm.g:3068:1: rule__Bool_exp__LeftAssignment_1 : ( ruleTerminal_Bool_exp ) ;
    public final void rule__Bool_exp__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3072:1: ( ( ruleTerminal_Bool_exp ) )
            // InternalOnlineElm.g:3073:2: ( ruleTerminal_Bool_exp )
            {
            // InternalOnlineElm.g:3073:2: ( ruleTerminal_Bool_exp )
            // InternalOnlineElm.g:3074:3: ruleTerminal_Bool_exp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getLeftTerminal_Bool_expParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal_Bool_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getLeftTerminal_Bool_expParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__LeftAssignment_1"


    // $ANTLR start "rule__Bool_exp__OperatorAssignment_2_0"
    // InternalOnlineElm.g:3083:1: rule__Bool_exp__OperatorAssignment_2_0 : ( ruleBOOL_OP ) ;
    public final void rule__Bool_exp__OperatorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3087:1: ( ( ruleBOOL_OP ) )
            // InternalOnlineElm.g:3088:2: ( ruleBOOL_OP )
            {
            // InternalOnlineElm.g:3088:2: ( ruleBOOL_OP )
            // InternalOnlineElm.g:3089:3: ruleBOOL_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getOperatorBOOL_OPEnumRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBOOL_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getOperatorBOOL_OPEnumRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__OperatorAssignment_2_0"


    // $ANTLR start "rule__Bool_exp__RightsAssignment_2_1"
    // InternalOnlineElm.g:3098:1: rule__Bool_exp__RightsAssignment_2_1 : ( ruleTerminal_Bool_exp ) ;
    public final void rule__Bool_exp__RightsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3102:1: ( ( ruleTerminal_Bool_exp ) )
            // InternalOnlineElm.g:3103:2: ( ruleTerminal_Bool_exp )
            {
            // InternalOnlineElm.g:3103:2: ( ruleTerminal_Bool_exp )
            // InternalOnlineElm.g:3104:3: ruleTerminal_Bool_exp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBool_expAccess().getRightsTerminal_Bool_expParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal_Bool_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBool_expAccess().getRightsTerminal_Bool_expParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool_exp__RightsAssignment_2_1"


    // $ANTLR start "rule__Terminal_Bool_exp__N1Assignment_0"
    // InternalOnlineElm.g:3113:1: rule__Terminal_Bool_exp__N1Assignment_0 : ( ruleNum_value ) ;
    public final void rule__Terminal_Bool_exp__N1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3117:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:3118:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:3118:2: ( ruleNum_value )
            // InternalOnlineElm.g:3119:3: ruleNum_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getN1Num_valueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getN1Num_valueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__N1Assignment_0"


    // $ANTLR start "rule__Terminal_Bool_exp__CompAssignment_1"
    // InternalOnlineElm.g:3128:1: rule__Terminal_Bool_exp__CompAssignment_1 : ( ruleCOMPARISON ) ;
    public final void rule__Terminal_Bool_exp__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3132:1: ( ( ruleCOMPARISON ) )
            // InternalOnlineElm.g:3133:2: ( ruleCOMPARISON )
            {
            // InternalOnlineElm.g:3133:2: ( ruleCOMPARISON )
            // InternalOnlineElm.g:3134:3: ruleCOMPARISON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getCompCOMPARISONEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getCompCOMPARISONEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__CompAssignment_1"


    // $ANTLR start "rule__Terminal_Bool_exp__N2Assignment_2"
    // InternalOnlineElm.g:3143:1: rule__Terminal_Bool_exp__N2Assignment_2 : ( ruleNum_value ) ;
    public final void rule__Terminal_Bool_exp__N2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3147:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:3148:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:3148:2: ( ruleNum_value )
            // InternalOnlineElm.g:3149:3: ruleNum_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminal_Bool_expAccess().getN2Num_valueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminal_Bool_expAccess().getN2Num_valueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Bool_exp__N2Assignment_2"


    // $ANTLR start "rule__Num_value__NumAssignment_0"
    // InternalOnlineElm.g:3158:1: rule__Num_value__NumAssignment_0 : ( RULE_FLOAT ) ;
    public final void rule__Num_value__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3162:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3163:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3163:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3164:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNum_valueAccess().getNumFLOATTerminalRuleCall_0_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNum_valueAccess().getNumFLOATTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num_value__NumAssignment_0"


    // $ANTLR start "rule__Math_exp__N1Assignment_1"
    // InternalOnlineElm.g:3173:1: rule__Math_exp__N1Assignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Math_exp__N1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3177:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3178:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3178:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3179:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getN1FLOATTerminalRuleCall_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getN1FLOATTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__N1Assignment_1"


    // $ANTLR start "rule__Math_exp__Op1Assignment_2"
    // InternalOnlineElm.g:3188:1: rule__Math_exp__Op1Assignment_2 : ( ruleMATH_OP ) ;
    public final void rule__Math_exp__Op1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3192:1: ( ( ruleMATH_OP ) )
            // InternalOnlineElm.g:3193:2: ( ruleMATH_OP )
            {
            // InternalOnlineElm.g:3193:2: ( ruleMATH_OP )
            // InternalOnlineElm.g:3194:3: ruleMATH_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getOp1MATH_OPEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMATH_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getOp1MATH_OPEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__Op1Assignment_2"


    // $ANTLR start "rule__Math_exp__N2Assignment_3"
    // InternalOnlineElm.g:3203:1: rule__Math_exp__N2Assignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Math_exp__N2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3207:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3208:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3208:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3209:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMath_expAccess().getN2FLOATTerminalRuleCall_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMath_expAccess().getN2FLOATTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Math_exp__N2Assignment_3"


    // $ANTLR start "rule__Circle__NameAssignment_0"
    // InternalOnlineElm.g:3218:1: rule__Circle__NameAssignment_0 : ( ( 'circle' ) ) ;
    public final void rule__Circle__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3222:1: ( ( ( 'circle' ) ) )
            // InternalOnlineElm.g:3223:2: ( ( 'circle' ) )
            {
            // InternalOnlineElm.g:3223:2: ( ( 'circle' ) )
            // InternalOnlineElm.g:3224:3: ( 'circle' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            }
            // InternalOnlineElm.g:3225:3: ( 'circle' )
            // InternalOnlineElm.g:3226:4: 'circle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Circle__DiameterAssignment_1"
    // InternalOnlineElm.g:3237:1: rule__Circle__DiameterAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Circle__DiameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3241:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3242:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3242:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3243:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCircleAccess().getDiameterFLOATTerminalRuleCall_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCircleAccess().getDiameterFLOATTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__DiameterAssignment_1"


    // $ANTLR start "rule__Rect__NameAssignment_0"
    // InternalOnlineElm.g:3252:1: rule__Rect__NameAssignment_0 : ( ( 'rect' ) ) ;
    public final void rule__Rect__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3256:1: ( ( ( 'rect' ) ) )
            // InternalOnlineElm.g:3257:2: ( ( 'rect' ) )
            {
            // InternalOnlineElm.g:3257:2: ( ( 'rect' ) )
            // InternalOnlineElm.g:3258:3: ( 'rect' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            }
            // InternalOnlineElm.g:3259:3: ( 'rect' )
            // InternalOnlineElm.g:3260:4: 'rect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getNameRectKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Rect__EdgeXAssignment_1"
    // InternalOnlineElm.g:3271:1: rule__Rect__EdgeXAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Rect__EdgeXAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3275:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3276:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3276:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3277:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getEdgeXFLOATTerminalRuleCall_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getEdgeXFLOATTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__EdgeXAssignment_1"


    // $ANTLR start "rule__Rect__EdgeYAssignment_2"
    // InternalOnlineElm.g:3286:1: rule__Rect__EdgeYAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__Rect__EdgeYAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3290:1: ( ( RULE_FLOAT ) )
            // InternalOnlineElm.g:3291:2: ( RULE_FLOAT )
            {
            // InternalOnlineElm.g:3291:2: ( RULE_FLOAT )
            // InternalOnlineElm.g:3292:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRectAccess().getEdgeYFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRectAccess().getEdgeYFLOATTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rect__EdgeYAssignment_2"


    // $ANTLR start "rule__Text__NameAssignment_0"
    // InternalOnlineElm.g:3301:1: rule__Text__NameAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__Text__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3305:1: ( ( ( 'text' ) ) )
            // InternalOnlineElm.g:3306:2: ( ( 'text' ) )
            {
            // InternalOnlineElm.g:3306:2: ( ( 'text' ) )
            // InternalOnlineElm.g:3307:3: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            }
            // InternalOnlineElm.g:3308:3: ( 'text' )
            // InternalOnlineElm.g:3309:4: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getNameTextKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Text__ContentAssignment_1"
    // InternalOnlineElm.g:3320:1: rule__Text__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3324:1: ( ( RULE_STRING ) )
            // InternalOnlineElm.g:3325:2: ( RULE_STRING )
            {
            // InternalOnlineElm.g:3325:2: ( RULE_STRING )
            // InternalOnlineElm.g:3326:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ContentAssignment_1"


    // $ANTLR start "rule__Draw__FilledColorAssignment_0"
    // InternalOnlineElm.g:3335:1: rule__Draw__FilledColorAssignment_0 : ( ruleFill ) ;
    public final void rule__Draw__FilledColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3339:1: ( ( ruleFill ) )
            // InternalOnlineElm.g:3340:2: ( ruleFill )
            {
            // InternalOnlineElm.g:3340:2: ( ruleFill )
            // InternalOnlineElm.g:3341:3: ruleFill
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getFilledColorFillParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFill();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getFilledColorFillParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__FilledColorAssignment_0"


    // $ANTLR start "rule__Draw__PositionAssignment_1_1"
    // InternalOnlineElm.g:3350:1: rule__Draw__PositionAssignment_1_1 : ( ruleMove ) ;
    public final void rule__Draw__PositionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3354:1: ( ( ruleMove ) )
            // InternalOnlineElm.g:3355:2: ( ruleMove )
            {
            // InternalOnlineElm.g:3355:2: ( ruleMove )
            // InternalOnlineElm.g:3356:3: ruleMove
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDrawAccess().getPositionMoveParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDrawAccess().getPositionMoveParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__PositionAssignment_1_1"


    // $ANTLR start "rule__Fill__NameAssignment_0"
    // InternalOnlineElm.g:3365:1: rule__Fill__NameAssignment_0 : ( ( 'filled' ) ) ;
    public final void rule__Fill__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3369:1: ( ( ( 'filled' ) ) )
            // InternalOnlineElm.g:3370:2: ( ( 'filled' ) )
            {
            // InternalOnlineElm.g:3370:2: ( ( 'filled' ) )
            // InternalOnlineElm.g:3371:3: ( 'filled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getNameFilledKeyword_0_0()); 
            }
            // InternalOnlineElm.g:3372:3: ( 'filled' )
            // InternalOnlineElm.g:3373:4: 'filled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getNameFilledKeyword_0_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getNameFilledKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getNameFilledKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__NameAssignment_0"


    // $ANTLR start "rule__Fill__ColorAssignment_1"
    // InternalOnlineElm.g:3384:1: rule__Fill__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__Fill__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3388:1: ( ( ruleColor ) )
            // InternalOnlineElm.g:3389:2: ( ruleColor )
            {
            // InternalOnlineElm.g:3389:2: ( ruleColor )
            // InternalOnlineElm.g:3390:3: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFillAccess().getColorColorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFillAccess().getColorColorEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ColorAssignment_1"


    // $ANTLR start "rule__Move__NameAssignment_0"
    // InternalOnlineElm.g:3399:1: rule__Move__NameAssignment_0 : ( ( 'move' ) ) ;
    public final void rule__Move__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3403:1: ( ( ( 'move' ) ) )
            // InternalOnlineElm.g:3404:2: ( ( 'move' ) )
            {
            // InternalOnlineElm.g:3404:2: ( ( 'move' ) )
            // InternalOnlineElm.g:3405:3: ( 'move' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            }
            // InternalOnlineElm.g:3406:3: ( 'move' )
            // InternalOnlineElm.g:3407:4: 'move'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Move__XAssignment_2"
    // InternalOnlineElm.g:3418:1: rule__Move__XAssignment_2 : ( ruleNum_value ) ;
    public final void rule__Move__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3422:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:3423:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:3423:2: ( ruleNum_value )
            // InternalOnlineElm.g:3424:3: ruleNum_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getXNum_valueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getXNum_valueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__XAssignment_2"


    // $ANTLR start "rule__Move__YAssignment_4"
    // InternalOnlineElm.g:3433:1: rule__Move__YAssignment_4 : ( ruleNum_value ) ;
    public final void rule__Move__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOnlineElm.g:3437:1: ( ( ruleNum_value ) )
            // InternalOnlineElm.g:3438:2: ( ruleNum_value )
            {
            // InternalOnlineElm.g:3438:2: ( ruleNum_value )
            // InternalOnlineElm.g:3439:3: ruleNum_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoveAccess().getYNum_valueParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoveAccess().getYNum_valueParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__YAssignment_4"

    // $ANTLR start synpred1_InternalOnlineElm
    public final void synpred1_InternalOnlineElm_fragment() throws RecognitionException {   
        // InternalOnlineElm.g:2702:8: ( rule__OnlineElm__ShapesAssignment_1 )
        // InternalOnlineElm.g:2702:9: rule__OnlineElm__ShapesAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__OnlineElm__ShapesAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalOnlineElm

    // Delegated rules

    public final boolean synpred1_InternalOnlineElm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalOnlineElm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000038100000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000038100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000012L});

}
