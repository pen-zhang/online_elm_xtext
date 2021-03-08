package org.xtext.online_elm.parser.antlr.internal;

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
import org.xtext.online_elm.services.OnlineElmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOnlineElmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FQN", "RULE_NL", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'myShapes'", "'time'", "'='", "'['", "','", "']'", "'++'", "'.'", "'|>'", "'if'", "'then'", "'else'", "'('", "')'", "'||'", "'&&'", "'not'", "'>='", "'<='", "'=='", "'!='", "'>'", "'<'", "'circle'", "'rect'", "'square'", "'roundedRect'", "'oval'", "'ngon'", "'wedge'", "'polygon'", "'text'", "'filled'", "'addOutline'", "'outlined'", "'move'", "'rotate'", "'degrees'", "'scale'", "'scaleX'", "'scaleY'", "'+'", "'-'", "'*'", "'/'", "'solid'", "'dotted'", "'dashed'", "'dotdash'", "'longdash'", "'black'", "'blank'", "'blue'", "'brown'", "'charcoal'", "'darkBlue'", "'darkBrown'", "'darkGray'", "'darkGreen'", "'darkGrey'", "'darkOrange'", "'darkPurple'", "'darkRed'", "'darkYellow'", "'gray'", "'green'", "'grey'", "'hotPink'", "'lightBlue'", "'lightBrown'", "'lightCharcoal'", "'lightGray'", "'lightGreen'", "'lightGrey'", "'lightOrange'", "'lightPurple'", "'lightRed'", "'lightYellow'", "'orange'", "'pink'", "'purple'", "'red'", "'white'", "'yellow'"
    };
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


        public InternalOnlineElmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOnlineElmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOnlineElmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOnlineElm.g"; }



     	private OnlineElmGrammarAccess grammarAccess;

        public InternalOnlineElmParser(TokenStream input, OnlineElmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OnlineElm";
       	}

       	@Override
       	protected OnlineElmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOnlineElm"
    // InternalOnlineElm.g:65:1: entryRuleOnlineElm returns [EObject current=null] : iv_ruleOnlineElm= ruleOnlineElm EOF ;
    public final EObject entryRuleOnlineElm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlineElm = null;


        try {
            // InternalOnlineElm.g:65:50: (iv_ruleOnlineElm= ruleOnlineElm EOF )
            // InternalOnlineElm.g:66:2: iv_ruleOnlineElm= ruleOnlineElm EOF
            {
             newCompositeNode(grammarAccess.getOnlineElmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnlineElm=ruleOnlineElm();

            state._fsp--;

             current =iv_ruleOnlineElm; 
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
    // $ANTLR end "entryRuleOnlineElm"


    // $ANTLR start "ruleOnlineElm"
    // InternalOnlineElm.g:72:1: ruleOnlineElm returns [EObject current=null] : ( ( (lv_entry_0_0= ruleMainShape ) ) ( (lv_shapes_1_0= ruleShapeDef ) )* ( (lv_var_2_0= ruleLocal_var ) )* ) ;
    public final EObject ruleOnlineElm() throws RecognitionException {
        EObject current = null;

        EObject lv_entry_0_0 = null;

        EObject lv_shapes_1_0 = null;

        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:78:2: ( ( ( (lv_entry_0_0= ruleMainShape ) ) ( (lv_shapes_1_0= ruleShapeDef ) )* ( (lv_var_2_0= ruleLocal_var ) )* ) )
            // InternalOnlineElm.g:79:2: ( ( (lv_entry_0_0= ruleMainShape ) ) ( (lv_shapes_1_0= ruleShapeDef ) )* ( (lv_var_2_0= ruleLocal_var ) )* )
            {
            // InternalOnlineElm.g:79:2: ( ( (lv_entry_0_0= ruleMainShape ) ) ( (lv_shapes_1_0= ruleShapeDef ) )* ( (lv_var_2_0= ruleLocal_var ) )* )
            // InternalOnlineElm.g:80:3: ( (lv_entry_0_0= ruleMainShape ) ) ( (lv_shapes_1_0= ruleShapeDef ) )* ( (lv_var_2_0= ruleLocal_var ) )*
            {
            // InternalOnlineElm.g:80:3: ( (lv_entry_0_0= ruleMainShape ) )
            // InternalOnlineElm.g:81:4: (lv_entry_0_0= ruleMainShape )
            {
            // InternalOnlineElm.g:81:4: (lv_entry_0_0= ruleMainShape )
            // InternalOnlineElm.g:82:5: lv_entry_0_0= ruleMainShape
            {

            					newCompositeNode(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entry_0_0=ruleMainShape();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnlineElmRule());
            					}
            					set(
            						current,
            						"entry",
            						lv_entry_0_0,
            						"org.xtext.online_elm.OnlineElm.MainShape");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:99:3: ( (lv_shapes_1_0= ruleShapeDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_FQN) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==16) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==RULE_NL||LA1_3==17||LA1_3==23||(LA1_3>=37 && LA1_3<=45)) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalOnlineElm.g:100:4: (lv_shapes_1_0= ruleShapeDef )
            	    {
            	    // InternalOnlineElm.g:100:4: (lv_shapes_1_0= ruleShapeDef )
            	    // InternalOnlineElm.g:101:5: lv_shapes_1_0= ruleShapeDef
            	    {

            	    					newCompositeNode(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_shapes_1_0=ruleShapeDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOnlineElmRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapes",
            	    						lv_shapes_1_0,
            	    						"org.xtext.online_elm.OnlineElm.ShapeDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalOnlineElm.g:118:3: ( (lv_var_2_0= ruleLocal_var ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_FQN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOnlineElm.g:119:4: (lv_var_2_0= ruleLocal_var )
            	    {
            	    // InternalOnlineElm.g:119:4: (lv_var_2_0= ruleLocal_var )
            	    // InternalOnlineElm.g:120:5: lv_var_2_0= ruleLocal_var
            	    {

            	    					newCompositeNode(grammarAccess.getOnlineElmAccess().getVarLocal_varParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_var_2_0=ruleLocal_var();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOnlineElmRule());
            	    					}
            	    					add(
            	    						current,
            	    						"var",
            	    						lv_var_2_0,
            	    						"org.xtext.online_elm.OnlineElm.Local_var");
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
    // $ANTLR end "ruleOnlineElm"


    // $ANTLR start "entryRuleMainShape"
    // InternalOnlineElm.g:141:1: entryRuleMainShape returns [EObject current=null] : iv_ruleMainShape= ruleMainShape EOF ;
    public final EObject entryRuleMainShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainShape = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:143:2: (iv_ruleMainShape= ruleMainShape EOF )
            // InternalOnlineElm.g:144:2: iv_ruleMainShape= ruleMainShape EOF
            {
             newCompositeNode(grammarAccess.getMainShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainShape=ruleMainShape();

            state._fsp--;

             current =iv_ruleMainShape; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMainShape"


    // $ANTLR start "ruleMainShape"
    // InternalOnlineElm.g:153:1: ruleMainShape returns [EObject current=null] : ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= 'time' otherlv_2= '=' otherlv_3= '[' ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) ) ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )* (this_NL_12= RULE_NL )? otherlv_13= ']' (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )* ) ;
    public final EObject ruleMainShape() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_NL_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token this_NL_12=null;
        Token otherlv_13=null;
        Token this_NL_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_shape_4_0 = null;

        EObject lv_conditional_5_0 = null;

        EObject lv_moreShapes_9_0 = null;

        EObject lv_moreConditional_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:160:2: ( ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= 'time' otherlv_2= '=' otherlv_3= '[' ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) ) ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )* (this_NL_12= RULE_NL )? otherlv_13= ']' (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )* ) )
            // InternalOnlineElm.g:161:2: ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= 'time' otherlv_2= '=' otherlv_3= '[' ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) ) ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )* (this_NL_12= RULE_NL )? otherlv_13= ']' (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )* )
            {
            // InternalOnlineElm.g:161:2: ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= 'time' otherlv_2= '=' otherlv_3= '[' ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) ) ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )* (this_NL_12= RULE_NL )? otherlv_13= ']' (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )* )
            // InternalOnlineElm.g:162:3: ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= 'time' otherlv_2= '=' otherlv_3= '[' ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) ) ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )* (this_NL_12= RULE_NL )? otherlv_13= ']' (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )*
            {
            // InternalOnlineElm.g:162:3: ( (lv_name_0_0= 'myShapes' ) )
            // InternalOnlineElm.g:163:4: (lv_name_0_0= 'myShapes' )
            {
            // InternalOnlineElm.g:163:4: (lv_name_0_0= 'myShapes' )
            // InternalOnlineElm.g:164:5: lv_name_0_0= 'myShapes'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainShapeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "myShapes");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMainShapeAccess().getTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMainShapeAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalOnlineElm.g:188:3: ( ( (lv_shape_4_0= ruleShape ) ) | ( (lv_conditional_5_0= ruleConditional_Shape ) ) | ( (otherlv_6= RULE_FQN ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case RULE_FQN:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOnlineElm.g:189:4: ( (lv_shape_4_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:189:4: ( (lv_shape_4_0= ruleShape ) )
                    // InternalOnlineElm.g:190:5: (lv_shape_4_0= ruleShape )
                    {
                    // InternalOnlineElm.g:190:5: (lv_shape_4_0= ruleShape )
                    // InternalOnlineElm.g:191:6: lv_shape_4_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getMainShapeAccess().getShapeShapeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_shape_4_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainShapeRule());
                    						}
                    						set(
                    							current,
                    							"shape",
                    							lv_shape_4_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:209:4: ( (lv_conditional_5_0= ruleConditional_Shape ) )
                    {
                    // InternalOnlineElm.g:209:4: ( (lv_conditional_5_0= ruleConditional_Shape ) )
                    // InternalOnlineElm.g:210:5: (lv_conditional_5_0= ruleConditional_Shape )
                    {
                    // InternalOnlineElm.g:210:5: (lv_conditional_5_0= ruleConditional_Shape )
                    // InternalOnlineElm.g:211:6: lv_conditional_5_0= ruleConditional_Shape
                    {

                    						newCompositeNode(grammarAccess.getMainShapeAccess().getConditionalConditional_ShapeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_conditional_5_0=ruleConditional_Shape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainShapeRule());
                    						}
                    						set(
                    							current,
                    							"conditional",
                    							lv_conditional_5_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:229:4: ( (otherlv_6= RULE_FQN ) )
                    {
                    // InternalOnlineElm.g:229:4: ( (otherlv_6= RULE_FQN ) )
                    // InternalOnlineElm.g:230:5: (otherlv_6= RULE_FQN )
                    {
                    // InternalOnlineElm.g:230:5: (otherlv_6= RULE_FQN )
                    // InternalOnlineElm.g:231:6: otherlv_6= RULE_FQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainShapeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_FQN,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getMainShapeAccess().getShapeRefBasicShapeCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:243:3: ( (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_NL) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==18) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOnlineElm.g:244:4: (this_NL_7= RULE_NL )? otherlv_8= ',' ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) )
            	    {
            	    // InternalOnlineElm.g:244:4: (this_NL_7= RULE_NL )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_NL) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalOnlineElm.g:245:5: this_NL_7= RULE_NL
            	            {
            	            this_NL_7=(Token)match(input,RULE_NL,FOLLOW_9); 

            	            					newLeafNode(this_NL_7, grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_5_0());
            	            				

            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMainShapeAccess().getCommaKeyword_5_1());
            	    			
            	    // InternalOnlineElm.g:254:4: ( ( (lv_moreShapes_9_0= ruleShape ) ) | ( (lv_moreConditional_10_0= ruleConditional_Shape ) ) | ( (otherlv_11= RULE_FQN ) ) )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case RULE_FQN:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // InternalOnlineElm.g:255:5: ( (lv_moreShapes_9_0= ruleShape ) )
            	            {
            	            // InternalOnlineElm.g:255:5: ( (lv_moreShapes_9_0= ruleShape ) )
            	            // InternalOnlineElm.g:256:6: (lv_moreShapes_9_0= ruleShape )
            	            {
            	            // InternalOnlineElm.g:256:6: (lv_moreShapes_9_0= ruleShape )
            	            // InternalOnlineElm.g:257:7: lv_moreShapes_9_0= ruleShape
            	            {

            	            							newCompositeNode(grammarAccess.getMainShapeAccess().getMoreShapesShapeParserRuleCall_5_2_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_moreShapes_9_0=ruleShape();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainShapeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"moreShapes",
            	            								lv_moreShapes_9_0,
            	            								"org.xtext.online_elm.OnlineElm.Shape");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalOnlineElm.g:275:5: ( (lv_moreConditional_10_0= ruleConditional_Shape ) )
            	            {
            	            // InternalOnlineElm.g:275:5: ( (lv_moreConditional_10_0= ruleConditional_Shape ) )
            	            // InternalOnlineElm.g:276:6: (lv_moreConditional_10_0= ruleConditional_Shape )
            	            {
            	            // InternalOnlineElm.g:276:6: (lv_moreConditional_10_0= ruleConditional_Shape )
            	            // InternalOnlineElm.g:277:7: lv_moreConditional_10_0= ruleConditional_Shape
            	            {

            	            							newCompositeNode(grammarAccess.getMainShapeAccess().getMoreConditionalConditional_ShapeParserRuleCall_5_2_1_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_moreConditional_10_0=ruleConditional_Shape();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainShapeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"moreConditional",
            	            								lv_moreConditional_10_0,
            	            								"org.xtext.online_elm.OnlineElm.Conditional_Shape");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalOnlineElm.g:295:5: ( (otherlv_11= RULE_FQN ) )
            	            {
            	            // InternalOnlineElm.g:295:5: ( (otherlv_11= RULE_FQN ) )
            	            // InternalOnlineElm.g:296:6: (otherlv_11= RULE_FQN )
            	            {
            	            // InternalOnlineElm.g:296:6: (otherlv_11= RULE_FQN )
            	            // InternalOnlineElm.g:297:7: otherlv_11= RULE_FQN
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMainShapeRule());
            	            							}
            	            						
            	            otherlv_11=(Token)match(input,RULE_FQN,FOLLOW_8); 

            	            							newLeafNode(otherlv_11, grammarAccess.getMainShapeAccess().getMoreShapeRefBasicShapeCrossReference_5_2_2_0());
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalOnlineElm.g:310:3: (this_NL_12= RULE_NL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOnlineElm.g:311:4: this_NL_12= RULE_NL
                    {
                    this_NL_12=(Token)match(input,RULE_NL,FOLLOW_10); 

                    				newLeafNode(this_NL_12, grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_6());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_7());
            		
            // InternalOnlineElm.g:320:3: (this_NL_14= RULE_NL | (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_NL) ) {
                    alt8=1;
                }
                else if ( (LA8_0==20) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOnlineElm.g:321:4: this_NL_14= RULE_NL
            	    {
            	    this_NL_14=(Token)match(input,RULE_NL,FOLLOW_11); 

            	    				newLeafNode(this_NL_14, grammarAccess.getMainShapeAccess().getNLTerminalRuleCall_8_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalOnlineElm.g:326:4: (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) )
            	    {
            	    // InternalOnlineElm.g:326:4: (otherlv_15= '++' ( (otherlv_16= RULE_FQN ) ) )
            	    // InternalOnlineElm.g:327:5: otherlv_15= '++' ( (otherlv_16= RULE_FQN ) )
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_12); 

            	    					newLeafNode(otherlv_15, grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_8_1_0());
            	    				
            	    // InternalOnlineElm.g:331:5: ( (otherlv_16= RULE_FQN ) )
            	    // InternalOnlineElm.g:332:6: (otherlv_16= RULE_FQN )
            	    {
            	    // InternalOnlineElm.g:332:6: (otherlv_16= RULE_FQN )
            	    // InternalOnlineElm.g:333:7: otherlv_16= RULE_FQN
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMainShapeRule());
            	    							}
            	    						
            	    otherlv_16=(Token)match(input,RULE_FQN,FOLLOW_11); 

            	    							newLeafNode(otherlv_16, grammarAccess.getMainShapeAccess().getExternalShapeListCrossReference_8_1_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMainShape"


    // $ANTLR start "entryRuleShapeDef"
    // InternalOnlineElm.g:353:1: entryRuleShapeDef returns [EObject current=null] : iv_ruleShapeDef= ruleShapeDef EOF ;
    public final EObject entryRuleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDef = null;


        try {
            // InternalOnlineElm.g:353:49: (iv_ruleShapeDef= ruleShapeDef EOF )
            // InternalOnlineElm.g:354:2: iv_ruleShapeDef= ruleShapeDef EOF
            {
             newCompositeNode(grammarAccess.getShapeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeDef=ruleShapeDef();

            state._fsp--;

             current =iv_ruleShapeDef; 
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
    // $ANTLR end "entryRuleShapeDef"


    // $ANTLR start "ruleShapeDef"
    // InternalOnlineElm.g:360:1: ruleShapeDef returns [EObject current=null] : (this_ShapeList_0= ruleShapeList | this_BasicShape_1= ruleBasicShape ) ;
    public final EObject ruleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeList_0 = null;

        EObject this_BasicShape_1 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:366:2: ( (this_ShapeList_0= ruleShapeList | this_BasicShape_1= ruleBasicShape ) )
            // InternalOnlineElm.g:367:2: (this_ShapeList_0= ruleShapeList | this_BasicShape_1= ruleBasicShape )
            {
            // InternalOnlineElm.g:367:2: (this_ShapeList_0= ruleShapeList | this_BasicShape_1= ruleBasicShape )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_FQN) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==16) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==17) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==RULE_NL||LA9_2==23||(LA9_2>=37 && LA9_2<=45)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOnlineElm.g:368:3: this_ShapeList_0= ruleShapeList
                    {

                    			newCompositeNode(grammarAccess.getShapeDefAccess().getShapeListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeList_0=ruleShapeList();

                    state._fsp--;


                    			current = this_ShapeList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:377:3: this_BasicShape_1= ruleBasicShape
                    {

                    			newCompositeNode(grammarAccess.getShapeDefAccess().getBasicShapeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicShape_1=ruleBasicShape();

                    state._fsp--;


                    			current = this_BasicShape_1;
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
    // $ANTLR end "ruleShapeDef"


    // $ANTLR start "entryRuleLocal_var"
    // InternalOnlineElm.g:389:1: entryRuleLocal_var returns [EObject current=null] : iv_ruleLocal_var= ruleLocal_var EOF ;
    public final EObject entryRuleLocal_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_var = null;


        try {
            // InternalOnlineElm.g:389:50: (iv_ruleLocal_var= ruleLocal_var EOF )
            // InternalOnlineElm.g:390:2: iv_ruleLocal_var= ruleLocal_var EOF
            {
             newCompositeNode(grammarAccess.getLocal_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal_var=ruleLocal_var();

            state._fsp--;

             current =iv_ruleLocal_var; 
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
    // $ANTLR end "entryRuleLocal_var"


    // $ANTLR start "ruleLocal_var"
    // InternalOnlineElm.g:396:1: ruleLocal_var returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' ( (lv_var_2_0= ruleNum_value ) ) (this_NL_3= RULE_NL )? ) ;
    public final EObject ruleLocal_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_NL_3=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:402:2: ( ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' ( (lv_var_2_0= ruleNum_value ) ) (this_NL_3= RULE_NL )? ) )
            // InternalOnlineElm.g:403:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' ( (lv_var_2_0= ruleNum_value ) ) (this_NL_3= RULE_NL )? )
            {
            // InternalOnlineElm.g:403:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' ( (lv_var_2_0= ruleNum_value ) ) (this_NL_3= RULE_NL )? )
            // InternalOnlineElm.g:404:3: ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' ( (lv_var_2_0= ruleNum_value ) ) (this_NL_3= RULE_NL )?
            {
            // InternalOnlineElm.g:404:3: ( (lv_name_0_0= RULE_FQN ) )
            // InternalOnlineElm.g:405:4: (lv_name_0_0= RULE_FQN )
            {
            // InternalOnlineElm.g:405:4: (lv_name_0_0= RULE_FQN )
            // InternalOnlineElm.g:406:5: lv_name_0_0= RULE_FQN
            {
            lv_name_0_0=(Token)match(input,RULE_FQN,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocal_varAccess().getNameFQNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocal_varRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.online_elm.OnlineElm.FQN");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLocal_varAccess().getEqualsSignKeyword_1());
            		
            // InternalOnlineElm.g:426:3: ( (lv_var_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:427:4: (lv_var_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:427:4: (lv_var_2_0= ruleNum_value )
            // InternalOnlineElm.g:428:5: lv_var_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getLocal_varAccess().getVarNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_var_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocal_varRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:445:3: (this_NL_3= RULE_NL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOnlineElm.g:446:4: this_NL_3= RULE_NL
                    {
                    this_NL_3=(Token)match(input,RULE_NL,FOLLOW_2); 

                    				newLeafNode(this_NL_3, grammarAccess.getLocal_varAccess().getNLTerminalRuleCall_3());
                    			

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
    // $ANTLR end "ruleLocal_var"


    // $ANTLR start "entryRuleRef_var"
    // InternalOnlineElm.g:455:1: entryRuleRef_var returns [String current=null] : iv_ruleRef_var= ruleRef_var EOF ;
    public final String entryRuleRef_var() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRef_var = null;


        try {
            // InternalOnlineElm.g:455:47: (iv_ruleRef_var= ruleRef_var EOF )
            // InternalOnlineElm.g:456:2: iv_ruleRef_var= ruleRef_var EOF
            {
             newCompositeNode(grammarAccess.getRef_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRef_var=ruleRef_var();

            state._fsp--;

             current =iv_ruleRef_var.getText(); 
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
    // $ANTLR end "entryRuleRef_var"


    // $ANTLR start "ruleRef_var"
    // InternalOnlineElm.g:462:1: ruleRef_var returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? ) | kw= 'time' ) ;
    public final AntlrDatatypeRuleToken ruleRef_var() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FQN_0=null;
        Token kw=null;
        Token this_FQN_2=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:468:2: ( ( (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? ) | kw= 'time' ) )
            // InternalOnlineElm.g:469:2: ( (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? ) | kw= 'time' )
            {
            // InternalOnlineElm.g:469:2: ( (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? ) | kw= 'time' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_FQN) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOnlineElm.g:470:3: (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? )
                    {
                    // InternalOnlineElm.g:470:3: (this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )? )
                    // InternalOnlineElm.g:471:4: this_FQN_0= RULE_FQN (kw= '.' this_FQN_2= RULE_FQN )?
                    {
                    this_FQN_0=(Token)match(input,RULE_FQN,FOLLOW_15); 

                    				current.merge(this_FQN_0);
                    			

                    				newLeafNode(this_FQN_0, grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_0());
                    			
                    // InternalOnlineElm.g:478:4: (kw= '.' this_FQN_2= RULE_FQN )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOnlineElm.g:479:5: kw= '.' this_FQN_2= RULE_FQN
                            {
                            kw=(Token)match(input,21,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRef_varAccess().getFullStopKeyword_0_1_0());
                            				
                            this_FQN_2=(Token)match(input,RULE_FQN,FOLLOW_2); 

                            					current.merge(this_FQN_2);
                            				

                            					newLeafNode(this_FQN_2, grammarAccess.getRef_varAccess().getFQNTerminalRuleCall_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:494:3: kw= 'time'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRef_varAccess().getTimeKeyword_1());
                    		

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
    // $ANTLR end "ruleRef_var"


    // $ANTLR start "entryRuleShapeList"
    // InternalOnlineElm.g:503:1: entryRuleShapeList returns [EObject current=null] : iv_ruleShapeList= ruleShapeList EOF ;
    public final EObject entryRuleShapeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeList = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:505:2: (iv_ruleShapeList= ruleShapeList EOF )
            // InternalOnlineElm.g:506:2: iv_ruleShapeList= ruleShapeList EOF
            {
             newCompositeNode(grammarAccess.getShapeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeList=ruleShapeList();

            state._fsp--;

             current =iv_ruleShapeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleShapeList"


    // $ANTLR start "ruleShapeList"
    // InternalOnlineElm.g:515:1: ruleShapeList returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) ) ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )* (this_NL_11= RULE_NL )? otherlv_12= ']' (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )* ) ;
    public final EObject ruleShapeList() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_NL_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token this_NL_11=null;
        Token otherlv_12=null;
        Token this_NL_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_shape_3_0 = null;

        EObject lv_conditional_4_0 = null;

        EObject lv_moreShapes_8_0 = null;

        EObject lv_moreConditional_9_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_NL");

        try {
            // InternalOnlineElm.g:522:2: ( ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) ) ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )* (this_NL_11= RULE_NL )? otherlv_12= ']' (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )* ) )
            // InternalOnlineElm.g:523:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) ) ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )* (this_NL_11= RULE_NL )? otherlv_12= ']' (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )* )
            {
            // InternalOnlineElm.g:523:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) ) ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )* (this_NL_11= RULE_NL )? otherlv_12= ']' (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )* )
            // InternalOnlineElm.g:524:3: ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) ) ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )* (this_NL_11= RULE_NL )? otherlv_12= ']' (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )*
            {
            // InternalOnlineElm.g:524:3: ( (lv_name_0_0= RULE_FQN ) )
            // InternalOnlineElm.g:525:4: (lv_name_0_0= RULE_FQN )
            {
            // InternalOnlineElm.g:525:4: (lv_name_0_0= RULE_FQN )
            // InternalOnlineElm.g:526:5: lv_name_0_0= RULE_FQN
            {
            lv_name_0_0=(Token)match(input,RULE_FQN,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getShapeListAccess().getNameFQNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.online_elm.OnlineElm.FQN");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeListAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeListAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalOnlineElm.g:550:3: ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) | ( (otherlv_5= RULE_FQN ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case RULE_FQN:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOnlineElm.g:551:4: ( (lv_shape_3_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:551:4: ( (lv_shape_3_0= ruleShape ) )
                    // InternalOnlineElm.g:552:5: (lv_shape_3_0= ruleShape )
                    {
                    // InternalOnlineElm.g:552:5: (lv_shape_3_0= ruleShape )
                    // InternalOnlineElm.g:553:6: lv_shape_3_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getShapeListAccess().getShapeShapeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_shape_3_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeListRule());
                    						}
                    						set(
                    							current,
                    							"shape",
                    							lv_shape_3_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:571:4: ( (lv_conditional_4_0= ruleConditional_Shape ) )
                    {
                    // InternalOnlineElm.g:571:4: ( (lv_conditional_4_0= ruleConditional_Shape ) )
                    // InternalOnlineElm.g:572:5: (lv_conditional_4_0= ruleConditional_Shape )
                    {
                    // InternalOnlineElm.g:572:5: (lv_conditional_4_0= ruleConditional_Shape )
                    // InternalOnlineElm.g:573:6: lv_conditional_4_0= ruleConditional_Shape
                    {

                    						newCompositeNode(grammarAccess.getShapeListAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_conditional_4_0=ruleConditional_Shape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeListRule());
                    						}
                    						set(
                    							current,
                    							"conditional",
                    							lv_conditional_4_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:591:4: ( (otherlv_5= RULE_FQN ) )
                    {
                    // InternalOnlineElm.g:591:4: ( (otherlv_5= RULE_FQN ) )
                    // InternalOnlineElm.g:592:5: (otherlv_5= RULE_FQN )
                    {
                    // InternalOnlineElm.g:592:5: (otherlv_5= RULE_FQN )
                    // InternalOnlineElm.g:593:6: otherlv_5= RULE_FQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShapeListRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_FQN,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getShapeListAccess().getShapeRefBasicShapeCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:605:3: ( (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_NL) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==18) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOnlineElm.g:606:4: (this_NL_6= RULE_NL )? otherlv_7= ',' ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) )
            	    {
            	    // InternalOnlineElm.g:606:4: (this_NL_6= RULE_NL )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_NL) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalOnlineElm.g:607:5: this_NL_6= RULE_NL
            	            {
            	            this_NL_6=(Token)match(input,RULE_NL,FOLLOW_9); 

            	            					newLeafNode(this_NL_6, grammarAccess.getShapeListAccess().getNLTerminalRuleCall_4_0());
            	            				

            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getShapeListAccess().getCommaKeyword_4_1());
            	    			
            	    // InternalOnlineElm.g:616:4: ( ( (lv_moreShapes_8_0= ruleShape ) ) | ( (lv_moreConditional_9_0= ruleConditional_Shape ) ) | ( (otherlv_10= RULE_FQN ) ) )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case RULE_FQN:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalOnlineElm.g:617:5: ( (lv_moreShapes_8_0= ruleShape ) )
            	            {
            	            // InternalOnlineElm.g:617:5: ( (lv_moreShapes_8_0= ruleShape ) )
            	            // InternalOnlineElm.g:618:6: (lv_moreShapes_8_0= ruleShape )
            	            {
            	            // InternalOnlineElm.g:618:6: (lv_moreShapes_8_0= ruleShape )
            	            // InternalOnlineElm.g:619:7: lv_moreShapes_8_0= ruleShape
            	            {

            	            							newCompositeNode(grammarAccess.getShapeListAccess().getMoreShapesShapeParserRuleCall_4_2_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_moreShapes_8_0=ruleShape();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getShapeListRule());
            	            							}
            	            							add(
            	            								current,
            	            								"moreShapes",
            	            								lv_moreShapes_8_0,
            	            								"org.xtext.online_elm.OnlineElm.Shape");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalOnlineElm.g:637:5: ( (lv_moreConditional_9_0= ruleConditional_Shape ) )
            	            {
            	            // InternalOnlineElm.g:637:5: ( (lv_moreConditional_9_0= ruleConditional_Shape ) )
            	            // InternalOnlineElm.g:638:6: (lv_moreConditional_9_0= ruleConditional_Shape )
            	            {
            	            // InternalOnlineElm.g:638:6: (lv_moreConditional_9_0= ruleConditional_Shape )
            	            // InternalOnlineElm.g:639:7: lv_moreConditional_9_0= ruleConditional_Shape
            	            {

            	            							newCompositeNode(grammarAccess.getShapeListAccess().getMoreConditionalConditional_ShapeParserRuleCall_4_2_1_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_moreConditional_9_0=ruleConditional_Shape();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getShapeListRule());
            	            							}
            	            							add(
            	            								current,
            	            								"moreConditional",
            	            								lv_moreConditional_9_0,
            	            								"org.xtext.online_elm.OnlineElm.Conditional_Shape");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalOnlineElm.g:657:5: ( (otherlv_10= RULE_FQN ) )
            	            {
            	            // InternalOnlineElm.g:657:5: ( (otherlv_10= RULE_FQN ) )
            	            // InternalOnlineElm.g:658:6: (otherlv_10= RULE_FQN )
            	            {
            	            // InternalOnlineElm.g:658:6: (otherlv_10= RULE_FQN )
            	            // InternalOnlineElm.g:659:7: otherlv_10= RULE_FQN
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getShapeListRule());
            	            							}
            	            						
            	            otherlv_10=(Token)match(input,RULE_FQN,FOLLOW_8); 

            	            							newLeafNode(otherlv_10, grammarAccess.getShapeListAccess().getMoreShapeRefBasicShapeCrossReference_4_2_2_0());
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalOnlineElm.g:672:3: (this_NL_11= RULE_NL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_NL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOnlineElm.g:673:4: this_NL_11= RULE_NL
                    {
                    this_NL_11=(Token)match(input,RULE_NL,FOLLOW_10); 

                    				newLeafNode(this_NL_11, grammarAccess.getShapeListAccess().getNLTerminalRuleCall_5());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getShapeListAccess().getRightSquareBracketKeyword_6());
            		
            // InternalOnlineElm.g:682:3: (this_NL_13= RULE_NL | (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_NL) ) {
                    alt18=1;
                }
                else if ( (LA18_0==20) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOnlineElm.g:683:4: this_NL_13= RULE_NL
            	    {
            	    this_NL_13=(Token)match(input,RULE_NL,FOLLOW_11); 

            	    				newLeafNode(this_NL_13, grammarAccess.getShapeListAccess().getNLTerminalRuleCall_7_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalOnlineElm.g:688:4: (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) )
            	    {
            	    // InternalOnlineElm.g:688:4: (otherlv_14= '++' ( (otherlv_15= RULE_FQN ) ) )
            	    // InternalOnlineElm.g:689:5: otherlv_14= '++' ( (otherlv_15= RULE_FQN ) )
            	    {
            	    otherlv_14=(Token)match(input,20,FOLLOW_12); 

            	    					newLeafNode(otherlv_14, grammarAccess.getShapeListAccess().getPlusSignPlusSignKeyword_7_1_0());
            	    				
            	    // InternalOnlineElm.g:693:5: ( (otherlv_15= RULE_FQN ) )
            	    // InternalOnlineElm.g:694:6: (otherlv_15= RULE_FQN )
            	    {
            	    // InternalOnlineElm.g:694:6: (otherlv_15= RULE_FQN )
            	    // InternalOnlineElm.g:695:7: otherlv_15= RULE_FQN
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getShapeListRule());
            	    							}
            	    						
            	    otherlv_15=(Token)match(input,RULE_FQN,FOLLOW_11); 

            	    							newLeafNode(otherlv_15, grammarAccess.getShapeListAccess().getExternalShapeListCrossReference_7_1_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleShapeList"


    // $ANTLR start "entryRuleBasicShape"
    // InternalOnlineElm.g:715:1: entryRuleBasicShape returns [EObject current=null] : iv_ruleBasicShape= ruleBasicShape EOF ;
    public final EObject entryRuleBasicShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicShape = null;


        try {
            // InternalOnlineElm.g:715:51: (iv_ruleBasicShape= ruleBasicShape EOF )
            // InternalOnlineElm.g:716:2: iv_ruleBasicShape= ruleBasicShape EOF
            {
             newCompositeNode(grammarAccess.getBasicShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicShape=ruleBasicShape();

            state._fsp--;

             current =iv_ruleBasicShape; 
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
    // $ANTLR end "entryRuleBasicShape"


    // $ANTLR start "ruleBasicShape"
    // InternalOnlineElm.g:722:1: ruleBasicShape returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' (this_NL_2= RULE_NL )? ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) ) (this_NL_5= RULE_NL )? ) ;
    public final EObject ruleBasicShape() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_NL_2=null;
        Token this_NL_5=null;
        EObject lv_shape_3_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:728:2: ( ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' (this_NL_2= RULE_NL )? ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) ) (this_NL_5= RULE_NL )? ) )
            // InternalOnlineElm.g:729:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' (this_NL_2= RULE_NL )? ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) ) (this_NL_5= RULE_NL )? )
            {
            // InternalOnlineElm.g:729:2: ( ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' (this_NL_2= RULE_NL )? ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) ) (this_NL_5= RULE_NL )? )
            // InternalOnlineElm.g:730:3: ( (lv_name_0_0= RULE_FQN ) ) otherlv_1= '=' (this_NL_2= RULE_NL )? ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) ) (this_NL_5= RULE_NL )?
            {
            // InternalOnlineElm.g:730:3: ( (lv_name_0_0= RULE_FQN ) )
            // InternalOnlineElm.g:731:4: (lv_name_0_0= RULE_FQN )
            {
            // InternalOnlineElm.g:731:4: (lv_name_0_0= RULE_FQN )
            // InternalOnlineElm.g:732:5: lv_name_0_0= RULE_FQN
            {
            lv_name_0_0=(Token)match(input,RULE_FQN,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBasicShapeAccess().getNameFQNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.online_elm.OnlineElm.FQN");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1());
            		
            // InternalOnlineElm.g:752:3: (this_NL_2= RULE_NL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOnlineElm.g:753:4: this_NL_2= RULE_NL
                    {
                    this_NL_2=(Token)match(input,RULE_NL,FOLLOW_17); 

                    				newLeafNode(this_NL_2, grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalOnlineElm.g:758:3: ( ( (lv_shape_3_0= ruleShape ) ) | ( (lv_conditional_4_0= ruleConditional_Shape ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=37 && LA20_0<=45)) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOnlineElm.g:759:4: ( (lv_shape_3_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:759:4: ( (lv_shape_3_0= ruleShape ) )
                    // InternalOnlineElm.g:760:5: (lv_shape_3_0= ruleShape )
                    {
                    // InternalOnlineElm.g:760:5: (lv_shape_3_0= ruleShape )
                    // InternalOnlineElm.g:761:6: lv_shape_3_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_shape_3_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicShapeRule());
                    						}
                    						set(
                    							current,
                    							"shape",
                    							lv_shape_3_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:779:4: ( (lv_conditional_4_0= ruleConditional_Shape ) )
                    {
                    // InternalOnlineElm.g:779:4: ( (lv_conditional_4_0= ruleConditional_Shape ) )
                    // InternalOnlineElm.g:780:5: (lv_conditional_4_0= ruleConditional_Shape )
                    {
                    // InternalOnlineElm.g:780:5: (lv_conditional_4_0= ruleConditional_Shape )
                    // InternalOnlineElm.g:781:6: lv_conditional_4_0= ruleConditional_Shape
                    {

                    						newCompositeNode(grammarAccess.getBasicShapeAccess().getConditionalConditional_ShapeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_conditional_4_0=ruleConditional_Shape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicShapeRule());
                    						}
                    						set(
                    							current,
                    							"conditional",
                    							lv_conditional_4_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:799:3: (this_NL_5= RULE_NL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOnlineElm.g:800:4: this_NL_5= RULE_NL
                    {
                    this_NL_5=(Token)match(input,RULE_NL,FOLLOW_2); 

                    				newLeafNode(this_NL_5, grammarAccess.getBasicShapeAccess().getNLTerminalRuleCall_4());
                    			

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
    // $ANTLR end "ruleBasicShape"


    // $ANTLR start "entryRuleShape"
    // InternalOnlineElm.g:809:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalOnlineElm.g:809:46: (iv_ruleShape= ruleShape EOF )
            // InternalOnlineElm.g:810:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalOnlineElm.g:816:1: ruleShape returns [EObject current=null] : ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stencil_0_0 = null;

        EObject lv_draw_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:822:2: ( ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) )
            // InternalOnlineElm.g:823:2: ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) )
            {
            // InternalOnlineElm.g:823:2: ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) )
            // InternalOnlineElm.g:824:3: ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) )
            {
            // InternalOnlineElm.g:824:3: ( (lv_stencil_0_0= ruleStencil ) )
            // InternalOnlineElm.g:825:4: (lv_stencil_0_0= ruleStencil )
            {
            // InternalOnlineElm.g:825:4: (lv_stencil_0_0= ruleStencil )
            // InternalOnlineElm.g:826:5: lv_stencil_0_0= ruleStencil
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_stencil_0_0=ruleStencil();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"stencil",
            						lv_stencil_0_0,
            						"org.xtext.online_elm.OnlineElm.Stencil");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_1());
            		
            // InternalOnlineElm.g:847:3: ( (lv_draw_2_0= ruleDraw ) )
            // InternalOnlineElm.g:848:4: (lv_draw_2_0= ruleDraw )
            {
            // InternalOnlineElm.g:848:4: (lv_draw_2_0= ruleDraw )
            // InternalOnlineElm.g:849:5: lv_draw_2_0= ruleDraw
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_draw_2_0=ruleDraw();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"draw",
            						lv_draw_2_0,
            						"org.xtext.online_elm.OnlineElm.Draw");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleConditional_Shape"
    // InternalOnlineElm.g:870:1: entryRuleConditional_Shape returns [EObject current=null] : iv_ruleConditional_Shape= ruleConditional_Shape EOF ;
    public final EObject entryRuleConditional_Shape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional_Shape = null;


        try {
            // InternalOnlineElm.g:870:58: (iv_ruleConditional_Shape= ruleConditional_Shape EOF )
            // InternalOnlineElm.g:871:2: iv_ruleConditional_Shape= ruleConditional_Shape EOF
            {
             newCompositeNode(grammarAccess.getConditional_ShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional_Shape=ruleConditional_Shape();

            state._fsp--;

             current =iv_ruleConditional_Shape; 
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
    // $ANTLR end "entryRuleConditional_Shape"


    // $ANTLR start "ruleConditional_Shape"
    // InternalOnlineElm.g:877:1: ruleConditional_Shape returns [EObject current=null] : (otherlv_0= 'if' this_Bool_expr_1= ruleBool_expr otherlv_2= 'then' this_NL_3= RULE_NL ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) ) this_NL_6= RULE_NL otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) ) ) ;
    public final EObject ruleConditional_Shape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_NL_3=null;
        Token this_NL_6=null;
        Token otherlv_7=null;
        Token this_NL_8=null;
        EObject this_Bool_expr_1 = null;

        EObject lv_shape_1_4_0 = null;

        EObject lv_nested_1_5_0 = null;

        EObject lv_shape_2_9_0 = null;

        EObject lv_nested_2_10_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:883:2: ( (otherlv_0= 'if' this_Bool_expr_1= ruleBool_expr otherlv_2= 'then' this_NL_3= RULE_NL ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) ) this_NL_6= RULE_NL otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) ) ) )
            // InternalOnlineElm.g:884:2: (otherlv_0= 'if' this_Bool_expr_1= ruleBool_expr otherlv_2= 'then' this_NL_3= RULE_NL ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) ) this_NL_6= RULE_NL otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) ) )
            {
            // InternalOnlineElm.g:884:2: (otherlv_0= 'if' this_Bool_expr_1= ruleBool_expr otherlv_2= 'then' this_NL_3= RULE_NL ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) ) this_NL_6= RULE_NL otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) ) )
            // InternalOnlineElm.g:885:3: otherlv_0= 'if' this_Bool_expr_1= ruleBool_expr otherlv_2= 'then' this_NL_3= RULE_NL ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) ) this_NL_6= RULE_NL otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getConditional_ShapeAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConditional_ShapeAccess().getBool_exprParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_Bool_expr_1=ruleBool_expr();

            state._fsp--;


            			current = this_Bool_expr_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getConditional_ShapeAccess().getThenKeyword_2());
            		
            this_NL_3=(Token)match(input,RULE_NL,FOLLOW_17); 

            			newLeafNode(this_NL_3, grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_3());
            		
            // InternalOnlineElm.g:905:3: ( ( (lv_shape_1_4_0= ruleShape ) ) | ( (lv_nested_1_5_0= ruleConditional_Shape ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=37 && LA22_0<=45)) ) {
                alt22=1;
            }
            else if ( (LA22_0==23) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalOnlineElm.g:906:4: ( (lv_shape_1_4_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:906:4: ( (lv_shape_1_4_0= ruleShape ) )
                    // InternalOnlineElm.g:907:5: (lv_shape_1_4_0= ruleShape )
                    {
                    // InternalOnlineElm.g:907:5: (lv_shape_1_4_0= ruleShape )
                    // InternalOnlineElm.g:908:6: lv_shape_1_4_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getConditional_ShapeAccess().getShape_1ShapeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_shape_1_4_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ShapeRule());
                    						}
                    						set(
                    							current,
                    							"shape_1",
                    							lv_shape_1_4_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:926:4: ( (lv_nested_1_5_0= ruleConditional_Shape ) )
                    {
                    // InternalOnlineElm.g:926:4: ( (lv_nested_1_5_0= ruleConditional_Shape ) )
                    // InternalOnlineElm.g:927:5: (lv_nested_1_5_0= ruleConditional_Shape )
                    {
                    // InternalOnlineElm.g:927:5: (lv_nested_1_5_0= ruleConditional_Shape )
                    // InternalOnlineElm.g:928:6: lv_nested_1_5_0= ruleConditional_Shape
                    {

                    						newCompositeNode(grammarAccess.getConditional_ShapeAccess().getNested_1Conditional_ShapeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_nested_1_5_0=ruleConditional_Shape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ShapeRule());
                    						}
                    						set(
                    							current,
                    							"nested_1",
                    							lv_nested_1_5_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_NL_6=(Token)match(input,RULE_NL,FOLLOW_23); 

            			newLeafNode(this_NL_6, grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_5());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getConditional_ShapeAccess().getElseKeyword_6());
            		
            this_NL_8=(Token)match(input,RULE_NL,FOLLOW_17); 

            			newLeafNode(this_NL_8, grammarAccess.getConditional_ShapeAccess().getNLTerminalRuleCall_7());
            		
            // InternalOnlineElm.g:958:3: ( ( (lv_shape_2_9_0= ruleShape ) ) | ( (lv_nested_2_10_0= ruleConditional_Shape ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=37 && LA23_0<=45)) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalOnlineElm.g:959:4: ( (lv_shape_2_9_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:959:4: ( (lv_shape_2_9_0= ruleShape ) )
                    // InternalOnlineElm.g:960:5: (lv_shape_2_9_0= ruleShape )
                    {
                    // InternalOnlineElm.g:960:5: (lv_shape_2_9_0= ruleShape )
                    // InternalOnlineElm.g:961:6: lv_shape_2_9_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getConditional_ShapeAccess().getShape_2ShapeParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_shape_2_9_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ShapeRule());
                    						}
                    						set(
                    							current,
                    							"shape_2",
                    							lv_shape_2_9_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:979:4: ( (lv_nested_2_10_0= ruleConditional_Shape ) )
                    {
                    // InternalOnlineElm.g:979:4: ( (lv_nested_2_10_0= ruleConditional_Shape ) )
                    // InternalOnlineElm.g:980:5: (lv_nested_2_10_0= ruleConditional_Shape )
                    {
                    // InternalOnlineElm.g:980:5: (lv_nested_2_10_0= ruleConditional_Shape )
                    // InternalOnlineElm.g:981:6: lv_nested_2_10_0= ruleConditional_Shape
                    {

                    						newCompositeNode(grammarAccess.getConditional_ShapeAccess().getNested_2Conditional_ShapeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nested_2_10_0=ruleConditional_Shape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ShapeRule());
                    						}
                    						set(
                    							current,
                    							"nested_2",
                    							lv_nested_2_10_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleConditional_Shape"


    // $ANTLR start "entryRuleConditional_Color"
    // InternalOnlineElm.g:1003:1: entryRuleConditional_Color returns [EObject current=null] : iv_ruleConditional_Color= ruleConditional_Color EOF ;
    public final EObject entryRuleConditional_Color() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional_Color = null;


        try {
            // InternalOnlineElm.g:1003:58: (iv_ruleConditional_Color= ruleConditional_Color EOF )
            // InternalOnlineElm.g:1004:2: iv_ruleConditional_Color= ruleConditional_Color EOF
            {
             newCompositeNode(grammarAccess.getConditional_ColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional_Color=ruleConditional_Color();

            state._fsp--;

             current =iv_ruleConditional_Color; 
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
    // $ANTLR end "entryRuleConditional_Color"


    // $ANTLR start "ruleConditional_Color"
    // InternalOnlineElm.g:1010:1: ruleConditional_Color returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleConditional_Color() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NL_4=null;
        Token this_NL_7=null;
        Token otherlv_8=null;
        Token this_NL_9=null;
        Token otherlv_12=null;
        EObject this_Bool_expr_2 = null;

        Enumerator lv_color_1_5_0 = null;

        EObject lv_nested_1_6_0 = null;

        Enumerator lv_color_2_10_0 = null;

        EObject lv_nested_2_11_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1016:2: ( (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) ) otherlv_12= ')' ) )
            // InternalOnlineElm.g:1017:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) ) otherlv_12= ')' )
            {
            // InternalOnlineElm.g:1017:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) ) otherlv_12= ')' )
            // InternalOnlineElm.g:1018:3: otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConditional_ColorAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditional_ColorAccess().getIfKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConditional_ColorAccess().getBool_exprParserRuleCall_2());
            		
            pushFollow(FOLLOW_21);
            this_Bool_expr_2=ruleBool_expr();

            state._fsp--;


            			current = this_Bool_expr_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getConditional_ColorAccess().getThenKeyword_3());
            		
            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_25); 

            			newLeafNode(this_NL_4, grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_4());
            		
            // InternalOnlineElm.g:1042:3: ( ( (lv_color_1_5_0= ruleColor ) ) | ( (lv_nested_1_6_0= ruleConditional_Color ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=64 && LA24_0<=97)) ) {
                alt24=1;
            }
            else if ( (LA24_0==26) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOnlineElm.g:1043:4: ( (lv_color_1_5_0= ruleColor ) )
                    {
                    // InternalOnlineElm.g:1043:4: ( (lv_color_1_5_0= ruleColor ) )
                    // InternalOnlineElm.g:1044:5: (lv_color_1_5_0= ruleColor )
                    {
                    // InternalOnlineElm.g:1044:5: (lv_color_1_5_0= ruleColor )
                    // InternalOnlineElm.g:1045:6: lv_color_1_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getConditional_ColorAccess().getColor_1ColorEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_color_1_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ColorRule());
                    						}
                    						set(
                    							current,
                    							"color_1",
                    							lv_color_1_5_0,
                    							"org.xtext.online_elm.OnlineElm.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1063:4: ( (lv_nested_1_6_0= ruleConditional_Color ) )
                    {
                    // InternalOnlineElm.g:1063:4: ( (lv_nested_1_6_0= ruleConditional_Color ) )
                    // InternalOnlineElm.g:1064:5: (lv_nested_1_6_0= ruleConditional_Color )
                    {
                    // InternalOnlineElm.g:1064:5: (lv_nested_1_6_0= ruleConditional_Color )
                    // InternalOnlineElm.g:1065:6: lv_nested_1_6_0= ruleConditional_Color
                    {

                    						newCompositeNode(grammarAccess.getConditional_ColorAccess().getNested_1Conditional_ColorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_nested_1_6_0=ruleConditional_Color();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ColorRule());
                    						}
                    						set(
                    							current,
                    							"nested_1",
                    							lv_nested_1_6_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_NL_7=(Token)match(input,RULE_NL,FOLLOW_23); 

            			newLeafNode(this_NL_7, grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_6());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getConditional_ColorAccess().getElseKeyword_7());
            		
            this_NL_9=(Token)match(input,RULE_NL,FOLLOW_25); 

            			newLeafNode(this_NL_9, grammarAccess.getConditional_ColorAccess().getNLTerminalRuleCall_8());
            		
            // InternalOnlineElm.g:1095:3: ( ( (lv_color_2_10_0= ruleColor ) ) | ( (lv_nested_2_11_0= ruleConditional_Color ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=64 && LA25_0<=97)) ) {
                alt25=1;
            }
            else if ( (LA25_0==26) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalOnlineElm.g:1096:4: ( (lv_color_2_10_0= ruleColor ) )
                    {
                    // InternalOnlineElm.g:1096:4: ( (lv_color_2_10_0= ruleColor ) )
                    // InternalOnlineElm.g:1097:5: (lv_color_2_10_0= ruleColor )
                    {
                    // InternalOnlineElm.g:1097:5: (lv_color_2_10_0= ruleColor )
                    // InternalOnlineElm.g:1098:6: lv_color_2_10_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getConditional_ColorAccess().getColor_2ColorEnumRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_color_2_10_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ColorRule());
                    						}
                    						set(
                    							current,
                    							"color_2",
                    							lv_color_2_10_0,
                    							"org.xtext.online_elm.OnlineElm.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1116:4: ( (lv_nested_2_11_0= ruleConditional_Color ) )
                    {
                    // InternalOnlineElm.g:1116:4: ( (lv_nested_2_11_0= ruleConditional_Color ) )
                    // InternalOnlineElm.g:1117:5: (lv_nested_2_11_0= ruleConditional_Color )
                    {
                    // InternalOnlineElm.g:1117:5: (lv_nested_2_11_0= ruleConditional_Color )
                    // InternalOnlineElm.g:1118:6: lv_nested_2_11_0= ruleConditional_Color
                    {

                    						newCompositeNode(grammarAccess.getConditional_ColorAccess().getNested_2Conditional_ColorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_nested_2_11_0=ruleConditional_Color();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_ColorRule());
                    						}
                    						set(
                    							current,
                    							"nested_2",
                    							lv_nested_2_11_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditional_ColorAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleConditional_Color"


    // $ANTLR start "entryRuleConditional_Num"
    // InternalOnlineElm.g:1144:1: entryRuleConditional_Num returns [EObject current=null] : iv_ruleConditional_Num= ruleConditional_Num EOF ;
    public final EObject entryRuleConditional_Num() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional_Num = null;


        try {
            // InternalOnlineElm.g:1144:56: (iv_ruleConditional_Num= ruleConditional_Num EOF )
            // InternalOnlineElm.g:1145:2: iv_ruleConditional_Num= ruleConditional_Num EOF
            {
             newCompositeNode(grammarAccess.getConditional_NumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional_Num=ruleConditional_Num();

            state._fsp--;

             current =iv_ruleConditional_Num; 
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
    // $ANTLR end "entryRuleConditional_Num"


    // $ANTLR start "ruleConditional_Num"
    // InternalOnlineElm.g:1151:1: ruleConditional_Num returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleConditional_Num() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NL_4=null;
        Token lv_num_1_5_0=null;
        Token this_NL_7=null;
        Token otherlv_8=null;
        Token this_NL_9=null;
        Token lv_num_2_10_0=null;
        Token otherlv_12=null;
        EObject this_Bool_expr_2 = null;

        EObject lv_nested_1_6_0 = null;

        EObject lv_nested_2_11_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1157:2: ( (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) ) otherlv_12= ')' ) )
            // InternalOnlineElm.g:1158:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) ) otherlv_12= ')' )
            {
            // InternalOnlineElm.g:1158:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) ) otherlv_12= ')' )
            // InternalOnlineElm.g:1159:3: otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) ) this_NL_7= RULE_NL otherlv_8= 'else' this_NL_9= RULE_NL ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConditional_NumAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditional_NumAccess().getIfKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConditional_NumAccess().getBool_exprParserRuleCall_2());
            		
            pushFollow(FOLLOW_21);
            this_Bool_expr_2=ruleBool_expr();

            state._fsp--;


            			current = this_Bool_expr_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getConditional_NumAccess().getThenKeyword_3());
            		
            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_27); 

            			newLeafNode(this_NL_4, grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_4());
            		
            // InternalOnlineElm.g:1183:3: ( ( (lv_num_1_5_0= RULE_FLOAT ) ) | ( (lv_nested_1_6_0= ruleConditional_Num ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_FLOAT) ) {
                alt26=1;
            }
            else if ( (LA26_0==26) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOnlineElm.g:1184:4: ( (lv_num_1_5_0= RULE_FLOAT ) )
                    {
                    // InternalOnlineElm.g:1184:4: ( (lv_num_1_5_0= RULE_FLOAT ) )
                    // InternalOnlineElm.g:1185:5: (lv_num_1_5_0= RULE_FLOAT )
                    {
                    // InternalOnlineElm.g:1185:5: (lv_num_1_5_0= RULE_FLOAT )
                    // InternalOnlineElm.g:1186:6: lv_num_1_5_0= RULE_FLOAT
                    {
                    lv_num_1_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_22); 

                    						newLeafNode(lv_num_1_5_0, grammarAccess.getConditional_NumAccess().getNum_1FLOATTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditional_NumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num_1",
                    							lv_num_1_5_0,
                    							"org.xtext.online_elm.OnlineElm.FLOAT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1203:4: ( (lv_nested_1_6_0= ruleConditional_Num ) )
                    {
                    // InternalOnlineElm.g:1203:4: ( (lv_nested_1_6_0= ruleConditional_Num ) )
                    // InternalOnlineElm.g:1204:5: (lv_nested_1_6_0= ruleConditional_Num )
                    {
                    // InternalOnlineElm.g:1204:5: (lv_nested_1_6_0= ruleConditional_Num )
                    // InternalOnlineElm.g:1205:6: lv_nested_1_6_0= ruleConditional_Num
                    {

                    						newCompositeNode(grammarAccess.getConditional_NumAccess().getNested_1Conditional_NumParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_nested_1_6_0=ruleConditional_Num();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_NumRule());
                    						}
                    						set(
                    							current,
                    							"nested_1",
                    							lv_nested_1_6_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Num");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_NL_7=(Token)match(input,RULE_NL,FOLLOW_23); 

            			newLeafNode(this_NL_7, grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_6());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getConditional_NumAccess().getElseKeyword_7());
            		
            this_NL_9=(Token)match(input,RULE_NL,FOLLOW_27); 

            			newLeafNode(this_NL_9, grammarAccess.getConditional_NumAccess().getNLTerminalRuleCall_8());
            		
            // InternalOnlineElm.g:1235:3: ( ( (lv_num_2_10_0= RULE_FLOAT ) ) | ( (lv_nested_2_11_0= ruleConditional_Num ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_FLOAT) ) {
                alt27=1;
            }
            else if ( (LA27_0==26) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalOnlineElm.g:1236:4: ( (lv_num_2_10_0= RULE_FLOAT ) )
                    {
                    // InternalOnlineElm.g:1236:4: ( (lv_num_2_10_0= RULE_FLOAT ) )
                    // InternalOnlineElm.g:1237:5: (lv_num_2_10_0= RULE_FLOAT )
                    {
                    // InternalOnlineElm.g:1237:5: (lv_num_2_10_0= RULE_FLOAT )
                    // InternalOnlineElm.g:1238:6: lv_num_2_10_0= RULE_FLOAT
                    {
                    lv_num_2_10_0=(Token)match(input,RULE_FLOAT,FOLLOW_26); 

                    						newLeafNode(lv_num_2_10_0, grammarAccess.getConditional_NumAccess().getNum_2FLOATTerminalRuleCall_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditional_NumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num_2",
                    							lv_num_2_10_0,
                    							"org.xtext.online_elm.OnlineElm.FLOAT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1255:4: ( (lv_nested_2_11_0= ruleConditional_Num ) )
                    {
                    // InternalOnlineElm.g:1255:4: ( (lv_nested_2_11_0= ruleConditional_Num ) )
                    // InternalOnlineElm.g:1256:5: (lv_nested_2_11_0= ruleConditional_Num )
                    {
                    // InternalOnlineElm.g:1256:5: (lv_nested_2_11_0= ruleConditional_Num )
                    // InternalOnlineElm.g:1257:6: lv_nested_2_11_0= ruleConditional_Num
                    {

                    						newCompositeNode(grammarAccess.getConditional_NumAccess().getNested_2Conditional_NumParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_nested_2_11_0=ruleConditional_Num();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_NumRule());
                    						}
                    						set(
                    							current,
                    							"nested_2",
                    							lv_nested_2_11_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Num");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditional_NumAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleConditional_Num"


    // $ANTLR start "entryRuleConditional_Str"
    // InternalOnlineElm.g:1283:1: entryRuleConditional_Str returns [EObject current=null] : iv_ruleConditional_Str= ruleConditional_Str EOF ;
    public final EObject entryRuleConditional_Str() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional_Str = null;


        try {
            // InternalOnlineElm.g:1283:56: (iv_ruleConditional_Str= ruleConditional_Str EOF )
            // InternalOnlineElm.g:1284:2: iv_ruleConditional_Str= ruleConditional_Str EOF
            {
             newCompositeNode(grammarAccess.getConditional_StrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional_Str=ruleConditional_Str();

            state._fsp--;

             current =iv_ruleConditional_Str; 
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
    // $ANTLR end "entryRuleConditional_Str"


    // $ANTLR start "ruleConditional_Str"
    // InternalOnlineElm.g:1290:1: ruleConditional_Str returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) ) otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) ) otherlv_11= ')' ) ;
    public final EObject ruleConditional_Str() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NL_4=null;
        Token lv_str_1_5_0=null;
        Token otherlv_7=null;
        Token this_NL_8=null;
        Token lv_str_2_9_0=null;
        Token otherlv_11=null;
        EObject this_Bool_expr_2 = null;

        EObject lv_nested_1_6_0 = null;

        EObject lv_nested_2_10_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1296:2: ( (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) ) otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) ) otherlv_11= ')' ) )
            // InternalOnlineElm.g:1297:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) ) otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) ) otherlv_11= ')' )
            {
            // InternalOnlineElm.g:1297:2: (otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) ) otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) ) otherlv_11= ')' )
            // InternalOnlineElm.g:1298:3: otherlv_0= '(' otherlv_1= 'if' this_Bool_expr_2= ruleBool_expr otherlv_3= 'then' this_NL_4= RULE_NL ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) ) otherlv_7= 'else' this_NL_8= RULE_NL ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConditional_StrAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditional_StrAccess().getIfKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConditional_StrAccess().getBool_exprParserRuleCall_2());
            		
            pushFollow(FOLLOW_21);
            this_Bool_expr_2=ruleBool_expr();

            state._fsp--;


            			current = this_Bool_expr_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getConditional_StrAccess().getThenKeyword_3());
            		
            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_28); 

            			newLeafNode(this_NL_4, grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_4());
            		
            // InternalOnlineElm.g:1322:3: ( ( (lv_str_1_5_0= RULE_STRING ) ) | ( (lv_nested_1_6_0= ruleConditional_Str ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalOnlineElm.g:1323:4: ( (lv_str_1_5_0= RULE_STRING ) )
                    {
                    // InternalOnlineElm.g:1323:4: ( (lv_str_1_5_0= RULE_STRING ) )
                    // InternalOnlineElm.g:1324:5: (lv_str_1_5_0= RULE_STRING )
                    {
                    // InternalOnlineElm.g:1324:5: (lv_str_1_5_0= RULE_STRING )
                    // InternalOnlineElm.g:1325:6: lv_str_1_5_0= RULE_STRING
                    {
                    lv_str_1_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_str_1_5_0, grammarAccess.getConditional_StrAccess().getStr_1STRINGTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditional_StrRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str_1",
                    							lv_str_1_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1342:4: ( (lv_nested_1_6_0= ruleConditional_Str ) )
                    {
                    // InternalOnlineElm.g:1342:4: ( (lv_nested_1_6_0= ruleConditional_Str ) )
                    // InternalOnlineElm.g:1343:5: (lv_nested_1_6_0= ruleConditional_Str )
                    {
                    // InternalOnlineElm.g:1343:5: (lv_nested_1_6_0= ruleConditional_Str )
                    // InternalOnlineElm.g:1344:6: lv_nested_1_6_0= ruleConditional_Str
                    {

                    						newCompositeNode(grammarAccess.getConditional_StrAccess().getNested_1Conditional_StrParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_nested_1_6_0=ruleConditional_Str();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_StrRule());
                    						}
                    						set(
                    							current,
                    							"nested_1",
                    							lv_nested_1_6_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Str");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getConditional_StrAccess().getElseKeyword_6());
            		
            this_NL_8=(Token)match(input,RULE_NL,FOLLOW_28); 

            			newLeafNode(this_NL_8, grammarAccess.getConditional_StrAccess().getNLTerminalRuleCall_7());
            		
            // InternalOnlineElm.g:1370:3: ( ( (lv_str_2_9_0= RULE_STRING ) ) | ( (lv_nested_2_10_0= ruleConditional_Str ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==26) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalOnlineElm.g:1371:4: ( (lv_str_2_9_0= RULE_STRING ) )
                    {
                    // InternalOnlineElm.g:1371:4: ( (lv_str_2_9_0= RULE_STRING ) )
                    // InternalOnlineElm.g:1372:5: (lv_str_2_9_0= RULE_STRING )
                    {
                    // InternalOnlineElm.g:1372:5: (lv_str_2_9_0= RULE_STRING )
                    // InternalOnlineElm.g:1373:6: lv_str_2_9_0= RULE_STRING
                    {
                    lv_str_2_9_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_str_2_9_0, grammarAccess.getConditional_StrAccess().getStr_2STRINGTerminalRuleCall_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditional_StrRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str_2",
                    							lv_str_2_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1390:4: ( (lv_nested_2_10_0= ruleConditional_Str ) )
                    {
                    // InternalOnlineElm.g:1390:4: ( (lv_nested_2_10_0= ruleConditional_Str ) )
                    // InternalOnlineElm.g:1391:5: (lv_nested_2_10_0= ruleConditional_Str )
                    {
                    // InternalOnlineElm.g:1391:5: (lv_nested_2_10_0= ruleConditional_Str )
                    // InternalOnlineElm.g:1392:6: lv_nested_2_10_0= ruleConditional_Str
                    {

                    						newCompositeNode(grammarAccess.getConditional_StrAccess().getNested_2Conditional_StrParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_nested_2_10_0=ruleConditional_Str();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditional_StrRule());
                    						}
                    						set(
                    							current,
                    							"nested_2",
                    							lv_nested_2_10_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Str");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConditional_StrAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleConditional_Str"


    // $ANTLR start "entryRuleBool_expr"
    // InternalOnlineElm.g:1418:1: entryRuleBool_expr returns [EObject current=null] : iv_ruleBool_expr= ruleBool_expr EOF ;
    public final EObject entryRuleBool_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool_expr = null;


        try {
            // InternalOnlineElm.g:1418:50: (iv_ruleBool_expr= ruleBool_expr EOF )
            // InternalOnlineElm.g:1419:2: iv_ruleBool_expr= ruleBool_expr EOF
            {
             newCompositeNode(grammarAccess.getBool_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool_expr=ruleBool_expr();

            state._fsp--;

             current =iv_ruleBool_expr; 
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
    // $ANTLR end "entryRuleBool_expr"


    // $ANTLR start "ruleBool_expr"
    // InternalOnlineElm.g:1425:1: ruleBool_expr returns [EObject current=null] : this_Or_expr_0= ruleOr_expr ;
    public final EObject ruleBool_expr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_expr_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1431:2: (this_Or_expr_0= ruleOr_expr )
            // InternalOnlineElm.g:1432:2: this_Or_expr_0= ruleOr_expr
            {

            		newCompositeNode(grammarAccess.getBool_exprAccess().getOr_exprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_expr_0=ruleOr_expr();

            state._fsp--;


            		current = this_Or_expr_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleBool_expr"


    // $ANTLR start "entryRuleOr_expr"
    // InternalOnlineElm.g:1443:1: entryRuleOr_expr returns [EObject current=null] : iv_ruleOr_expr= ruleOr_expr EOF ;
    public final EObject entryRuleOr_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr_expr = null;


        try {
            // InternalOnlineElm.g:1443:48: (iv_ruleOr_expr= ruleOr_expr EOF )
            // InternalOnlineElm.g:1444:2: iv_ruleOr_expr= ruleOr_expr EOF
            {
             newCompositeNode(grammarAccess.getOr_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_expr=ruleOr_expr();

            state._fsp--;

             current =iv_ruleOr_expr; 
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
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // InternalOnlineElm.g:1450:1: ruleOr_expr returns [EObject current=null] : (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) ;
    public final EObject ruleOr_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_expr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1456:2: ( (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) )
            // InternalOnlineElm.g:1457:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            {
            // InternalOnlineElm.g:1457:2: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            // InternalOnlineElm.g:1458:3: this_And_expr_0= ruleAnd_expr ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_And_expr_0=ruleAnd_expr();

            state._fsp--;


            			current = this_And_expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOnlineElm.g:1466:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOnlineElm.g:1467:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd_expr ) )
            	    {
            	    // InternalOnlineElm.g:1467:4: ()
            	    // InternalOnlineElm.g:1468:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOr_exprAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalOnlineElm.g:1478:4: ( (lv_right_3_0= ruleAnd_expr ) )
            	    // InternalOnlineElm.g:1479:5: (lv_right_3_0= ruleAnd_expr )
            	    {
            	    // InternalOnlineElm.g:1479:5: (lv_right_3_0= ruleAnd_expr )
            	    // InternalOnlineElm.g:1480:6: lv_right_3_0= ruleAnd_expr
            	    {

            	    						newCompositeNode(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleAnd_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOr_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.online_elm.OnlineElm.And_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // InternalOnlineElm.g:1502:1: entryRuleAnd_expr returns [EObject current=null] : iv_ruleAnd_expr= ruleAnd_expr EOF ;
    public final EObject entryRuleAnd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_expr = null;


        try {
            // InternalOnlineElm.g:1502:49: (iv_ruleAnd_expr= ruleAnd_expr EOF )
            // InternalOnlineElm.g:1503:2: iv_ruleAnd_expr= ruleAnd_expr EOF
            {
             newCompositeNode(grammarAccess.getAnd_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_expr=ruleAnd_expr();

            state._fsp--;

             current =iv_ruleAnd_expr; 
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
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // InternalOnlineElm.g:1509:1: ruleAnd_expr returns [EObject current=null] : (this_Not_expr_0= ruleNot_expr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )* ) ;
    public final EObject ruleAnd_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_expr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1515:2: ( (this_Not_expr_0= ruleNot_expr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )* ) )
            // InternalOnlineElm.g:1516:2: (this_Not_expr_0= ruleNot_expr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )* )
            {
            // InternalOnlineElm.g:1516:2: (this_Not_expr_0= ruleNot_expr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )* )
            // InternalOnlineElm.g:1517:3: this_Not_expr_0= ruleNot_expr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAnd_exprAccess().getNot_exprParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Not_expr_0=ruleNot_expr();

            state._fsp--;


            			current = this_Not_expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOnlineElm.g:1525:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOnlineElm.g:1526:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleNot_expr ) )
            	    {
            	    // InternalOnlineElm.g:1526:4: ()
            	    // InternalOnlineElm.g:1527:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAnd_exprAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalOnlineElm.g:1537:4: ( (lv_right_3_0= ruleNot_expr ) )
            	    // InternalOnlineElm.g:1538:5: (lv_right_3_0= ruleNot_expr )
            	    {
            	    // InternalOnlineElm.g:1538:5: (lv_right_3_0= ruleNot_expr )
            	    // InternalOnlineElm.g:1539:6: lv_right_3_0= ruleNot_expr
            	    {

            	    						newCompositeNode(grammarAccess.getAnd_exprAccess().getRightNot_exprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleNot_expr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnd_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.online_elm.OnlineElm.Not_expr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleNot_expr"
    // InternalOnlineElm.g:1561:1: entryRuleNot_expr returns [EObject current=null] : iv_ruleNot_expr= ruleNot_expr EOF ;
    public final EObject entryRuleNot_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot_expr = null;


        try {
            // InternalOnlineElm.g:1561:49: (iv_ruleNot_expr= ruleNot_expr EOF )
            // InternalOnlineElm.g:1562:2: iv_ruleNot_expr= ruleNot_expr EOF
            {
             newCompositeNode(grammarAccess.getNot_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot_expr=ruleNot_expr();

            state._fsp--;

             current =iv_ruleNot_expr; 
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
    // $ANTLR end "entryRuleNot_expr"


    // $ANTLR start "ruleNot_expr"
    // InternalOnlineElm.g:1568:1: ruleNot_expr returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) ) | this_Compare_expr_3= ruleCompare_expr ) ;
    public final EObject ruleNot_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;

        EObject this_Compare_expr_3 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1574:2: ( ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) ) | this_Compare_expr_3= ruleCompare_expr ) )
            // InternalOnlineElm.g:1575:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) ) | this_Compare_expr_3= ruleCompare_expr )
            {
            // InternalOnlineElm.g:1575:2: ( ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) ) | this_Compare_expr_3= ruleCompare_expr )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_FQN||LA32_0==RULE_FLOAT||LA32_0==RULE_ID||LA32_0==15||LA32_0==26) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalOnlineElm.g:1576:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) )
                    {
                    // InternalOnlineElm.g:1576:3: ( () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) ) )
                    // InternalOnlineElm.g:1577:4: () otherlv_1= 'not' ( (lv_operand_2_0= ruleNot_expr ) )
                    {
                    // InternalOnlineElm.g:1577:4: ()
                    // InternalOnlineElm.g:1578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNot_exprAccess().getNot_exprAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getNot_exprAccess().getNotKeyword_0_1());
                    			
                    // InternalOnlineElm.g:1588:4: ( (lv_operand_2_0= ruleNot_expr ) )
                    // InternalOnlineElm.g:1589:5: (lv_operand_2_0= ruleNot_expr )
                    {
                    // InternalOnlineElm.g:1589:5: (lv_operand_2_0= ruleNot_expr )
                    // InternalOnlineElm.g:1590:6: lv_operand_2_0= ruleNot_expr
                    {

                    						newCompositeNode(grammarAccess.getNot_exprAccess().getOperandNot_exprParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleNot_expr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNot_exprRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"org.xtext.online_elm.OnlineElm.Not_expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1609:3: this_Compare_expr_3= ruleCompare_expr
                    {

                    			newCompositeNode(grammarAccess.getNot_exprAccess().getCompare_exprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compare_expr_3=ruleCompare_expr();

                    state._fsp--;


                    			current = this_Compare_expr_3;
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
    // $ANTLR end "ruleNot_expr"


    // $ANTLR start "entryRuleCompare_expr"
    // InternalOnlineElm.g:1621:1: entryRuleCompare_expr returns [EObject current=null] : iv_ruleCompare_expr= ruleCompare_expr EOF ;
    public final EObject entryRuleCompare_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare_expr = null;


        try {
            // InternalOnlineElm.g:1621:53: (iv_ruleCompare_expr= ruleCompare_expr EOF )
            // InternalOnlineElm.g:1622:2: iv_ruleCompare_expr= ruleCompare_expr EOF
            {
             newCompositeNode(grammarAccess.getCompare_exprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare_expr=ruleCompare_expr();

            state._fsp--;

             current =iv_ruleCompare_expr; 
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
    // $ANTLR end "entryRuleCompare_expr"


    // $ANTLR start "ruleCompare_expr"
    // InternalOnlineElm.g:1628:1: ruleCompare_expr returns [EObject current=null] : ( ( (lv_left_0_0= ruleNum_value ) ) ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )* ) ;
    public final EObject ruleCompare_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1634:2: ( ( ( (lv_left_0_0= ruleNum_value ) ) ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )* ) )
            // InternalOnlineElm.g:1635:2: ( ( (lv_left_0_0= ruleNum_value ) ) ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )* )
            {
            // InternalOnlineElm.g:1635:2: ( ( (lv_left_0_0= ruleNum_value ) ) ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )* )
            // InternalOnlineElm.g:1636:3: ( (lv_left_0_0= ruleNum_value ) ) ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )*
            {
            // InternalOnlineElm.g:1636:3: ( (lv_left_0_0= ruleNum_value ) )
            // InternalOnlineElm.g:1637:4: (lv_left_0_0= ruleNum_value )
            {
            // InternalOnlineElm.g:1637:4: (lv_left_0_0= ruleNum_value )
            // InternalOnlineElm.g:1638:5: lv_left_0_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getCompare_exprAccess().getLeftNum_valueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_left_0_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompare_exprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:1655:3: ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=31 && LA34_0<=36)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOnlineElm.g:1656:4: () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleNum_value ) )
            	    {
            	    // InternalOnlineElm.g:1656:4: ()
            	    // InternalOnlineElm.g:1657:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompare_exprAccess().getCompare_exprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalOnlineElm.g:1663:4: ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // InternalOnlineElm.g:1664:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // InternalOnlineElm.g:1664:5: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // InternalOnlineElm.g:1665:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // InternalOnlineElm.g:1665:6: (lv_operator_2_1= '>=' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '!=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    int alt33=6;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // InternalOnlineElm.g:1666:7: lv_operator_2_1= '>='
            	            {
            	            lv_operator_2_1=(Token)match(input,31,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalOnlineElm.g:1677:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,32,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getCompare_exprAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalOnlineElm.g:1688:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,33,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getCompare_exprAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalOnlineElm.g:1699:7: lv_operator_2_4= '!='
            	            {
            	            lv_operator_2_4=(Token)match(input,34,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getCompare_exprAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalOnlineElm.g:1710:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,35,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getCompare_exprAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalOnlineElm.g:1721:7: lv_operator_2_6= '<'
            	            {
            	            lv_operator_2_6=(Token)match(input,36,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_6, grammarAccess.getCompare_exprAccess().getOperatorLessThanSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompare_exprRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalOnlineElm.g:1734:4: ( (lv_right_3_0= ruleNum_value ) )
            	    // InternalOnlineElm.g:1735:5: (lv_right_3_0= ruleNum_value )
            	    {
            	    // InternalOnlineElm.g:1735:5: (lv_right_3_0= ruleNum_value )
            	    // InternalOnlineElm.g:1736:6: lv_right_3_0= ruleNum_value
            	    {

            	    						newCompositeNode(grammarAccess.getCompare_exprAccess().getRightNum_valueParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleNum_value();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompare_exprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.online_elm.OnlineElm.Num_value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleCompare_expr"


    // $ANTLR start "entryRuleNum_value"
    // InternalOnlineElm.g:1758:1: entryRuleNum_value returns [EObject current=null] : iv_ruleNum_value= ruleNum_value EOF ;
    public final EObject entryRuleNum_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum_value = null;


        try {
            // InternalOnlineElm.g:1758:50: (iv_ruleNum_value= ruleNum_value EOF )
            // InternalOnlineElm.g:1759:2: iv_ruleNum_value= ruleNum_value EOF
            {
             newCompositeNode(grammarAccess.getNum_valueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNum_value=ruleNum_value();

            state._fsp--;

             current =iv_ruleNum_value; 
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
    // $ANTLR end "entryRuleNum_value"


    // $ANTLR start "ruleNum_value"
    // InternalOnlineElm.g:1765:1: ruleNum_value returns [EObject current=null] : (this_Math_exp_0= ruleMath_exp | this_Conditional_Num_1= ruleConditional_Num | ( (otherlv_2= RULE_ID ) ) | ( (lv_ref_3_0= ruleRef_var ) ) ) ;
    public final EObject ruleNum_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Math_exp_0 = null;

        EObject this_Conditional_Num_1 = null;

        AntlrDatatypeRuleToken lv_ref_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1771:2: ( (this_Math_exp_0= ruleMath_exp | this_Conditional_Num_1= ruleConditional_Num | ( (otherlv_2= RULE_ID ) ) | ( (lv_ref_3_0= ruleRef_var ) ) ) )
            // InternalOnlineElm.g:1772:2: (this_Math_exp_0= ruleMath_exp | this_Conditional_Num_1= ruleConditional_Num | ( (otherlv_2= RULE_ID ) ) | ( (lv_ref_3_0= ruleRef_var ) ) )
            {
            // InternalOnlineElm.g:1772:2: (this_Math_exp_0= ruleMath_exp | this_Conditional_Num_1= ruleConditional_Num | ( (otherlv_2= RULE_ID ) ) | ( (lv_ref_3_0= ruleRef_var ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==23) ) {
                    alt35=2;
                }
                else if ( (LA35_1==RULE_FLOAT||LA35_1==26) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                alt35=3;
                }
                break;
            case RULE_FQN:
            case 15:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalOnlineElm.g:1773:3: this_Math_exp_0= ruleMath_exp
                    {

                    			newCompositeNode(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Math_exp_0=ruleMath_exp();

                    state._fsp--;


                    			current = this_Math_exp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1782:3: this_Conditional_Num_1= ruleConditional_Num
                    {

                    			newCompositeNode(grammarAccess.getNum_valueAccess().getConditional_NumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_Num_1=ruleConditional_Num();

                    state._fsp--;


                    			current = this_Conditional_Num_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1791:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalOnlineElm.g:1791:3: ( (otherlv_2= RULE_ID ) )
                    // InternalOnlineElm.g:1792:4: (otherlv_2= RULE_ID )
                    {
                    // InternalOnlineElm.g:1792:4: (otherlv_2= RULE_ID )
                    // InternalOnlineElm.g:1793:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNum_valueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getNum_valueAccess().getLocalLocal_varCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1805:3: ( (lv_ref_3_0= ruleRef_var ) )
                    {
                    // InternalOnlineElm.g:1805:3: ( (lv_ref_3_0= ruleRef_var ) )
                    // InternalOnlineElm.g:1806:4: (lv_ref_3_0= ruleRef_var )
                    {
                    // InternalOnlineElm.g:1806:4: (lv_ref_3_0= ruleRef_var )
                    // InternalOnlineElm.g:1807:5: lv_ref_3_0= ruleRef_var
                    {

                    					newCompositeNode(grammarAccess.getNum_valueAccess().getRefRef_varParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ref_3_0=ruleRef_var();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNum_valueRule());
                    					}
                    					set(
                    						current,
                    						"ref",
                    						lv_ref_3_0,
                    						"org.xtext.online_elm.OnlineElm.Ref_var");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleNum_value"


    // $ANTLR start "entryRuleMath_exp"
    // InternalOnlineElm.g:1828:1: entryRuleMath_exp returns [EObject current=null] : iv_ruleMath_exp= ruleMath_exp EOF ;
    public final EObject entryRuleMath_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath_exp = null;


        try {
            // InternalOnlineElm.g:1828:49: (iv_ruleMath_exp= ruleMath_exp EOF )
            // InternalOnlineElm.g:1829:2: iv_ruleMath_exp= ruleMath_exp EOF
            {
             newCompositeNode(grammarAccess.getMath_expRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath_exp=ruleMath_exp();

            state._fsp--;

             current =iv_ruleMath_exp; 
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
    // $ANTLR end "entryRuleMath_exp"


    // $ANTLR start "ruleMath_exp"
    // InternalOnlineElm.g:1835:1: ruleMath_exp returns [EObject current=null] : (this_Terminal_math_exp_0= ruleTerminal_math_exp ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )* ) ;
    public final EObject ruleMath_exp() throws RecognitionException {
        EObject current = null;

        EObject this_Terminal_math_exp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1841:2: ( (this_Terminal_math_exp_0= ruleTerminal_math_exp ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )* ) )
            // InternalOnlineElm.g:1842:2: (this_Terminal_math_exp_0= ruleTerminal_math_exp ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )* )
            {
            // InternalOnlineElm.g:1842:2: (this_Terminal_math_exp_0= ruleTerminal_math_exp ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )* )
            // InternalOnlineElm.g:1843:3: this_Terminal_math_exp_0= ruleTerminal_math_exp ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMath_expAccess().getTerminal_math_expParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Terminal_math_exp_0=ruleTerminal_math_exp();

            state._fsp--;


            			current = this_Terminal_math_exp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOnlineElm.g:1851:3: ( () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=55 && LA36_0<=58)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOnlineElm.g:1852:4: () ( (lv_op_2_0= ruleMATH_OP ) ) ( (lv_right_3_0= ruleTerminal_math_exp ) )
            	    {
            	    // InternalOnlineElm.g:1852:4: ()
            	    // InternalOnlineElm.g:1853:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMath_expAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalOnlineElm.g:1859:4: ( (lv_op_2_0= ruleMATH_OP ) )
            	    // InternalOnlineElm.g:1860:5: (lv_op_2_0= ruleMATH_OP )
            	    {
            	    // InternalOnlineElm.g:1860:5: (lv_op_2_0= ruleMATH_OP )
            	    // InternalOnlineElm.g:1861:6: lv_op_2_0= ruleMATH_OP
            	    {

            	    						newCompositeNode(grammarAccess.getMath_expAccess().getOpMATH_OPEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_op_2_0=ruleMATH_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMath_expRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.xtext.online_elm.OnlineElm.MATH_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOnlineElm.g:1878:4: ( (lv_right_3_0= ruleTerminal_math_exp ) )
            	    // InternalOnlineElm.g:1879:5: (lv_right_3_0= ruleTerminal_math_exp )
            	    {
            	    // InternalOnlineElm.g:1879:5: (lv_right_3_0= ruleTerminal_math_exp )
            	    // InternalOnlineElm.g:1880:6: lv_right_3_0= ruleTerminal_math_exp
            	    {

            	    						newCompositeNode(grammarAccess.getMath_expAccess().getRightTerminal_math_expParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleTerminal_math_exp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMath_expRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.online_elm.OnlineElm.Terminal_math_exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleMath_exp"


    // $ANTLR start "entryRuleTerminal_math_exp"
    // InternalOnlineElm.g:1902:1: entryRuleTerminal_math_exp returns [EObject current=null] : iv_ruleTerminal_math_exp= ruleTerminal_math_exp EOF ;
    public final EObject entryRuleTerminal_math_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal_math_exp = null;


        try {
            // InternalOnlineElm.g:1902:58: (iv_ruleTerminal_math_exp= ruleTerminal_math_exp EOF )
            // InternalOnlineElm.g:1903:2: iv_ruleTerminal_math_exp= ruleTerminal_math_exp EOF
            {
             newCompositeNode(grammarAccess.getTerminal_math_expRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal_math_exp=ruleTerminal_math_exp();

            state._fsp--;

             current =iv_ruleTerminal_math_exp; 
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
    // $ANTLR end "entryRuleTerminal_math_exp"


    // $ANTLR start "ruleTerminal_math_exp"
    // InternalOnlineElm.g:1909:1: ruleTerminal_math_exp returns [EObject current=null] : ( (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_FLOAT ) ) ) ) ;
    public final EObject ruleTerminal_math_exp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        EObject this_Math_exp_1 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1915:2: ( ( (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_FLOAT ) ) ) ) )
            // InternalOnlineElm.g:1916:2: ( (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_FLOAT ) ) ) )
            {
            // InternalOnlineElm.g:1916:2: ( (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_FLOAT ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_FLOAT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalOnlineElm.g:1917:3: (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' )
                    {
                    // InternalOnlineElm.g:1917:3: (otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')' )
                    // InternalOnlineElm.g:1918:4: otherlv_0= '(' this_Math_exp_1= ruleMath_exp otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminal_math_expAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminal_math_expAccess().getMath_expParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_Math_exp_1=ruleMath_exp();

                    state._fsp--;


                    				current = this_Math_exp_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminal_math_expAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1936:3: ( () ( (lv_value_4_0= RULE_FLOAT ) ) )
                    {
                    // InternalOnlineElm.g:1936:3: ( () ( (lv_value_4_0= RULE_FLOAT ) ) )
                    // InternalOnlineElm.g:1937:4: () ( (lv_value_4_0= RULE_FLOAT ) )
                    {
                    // InternalOnlineElm.g:1937:4: ()
                    // InternalOnlineElm.g:1938:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminal_math_expAccess().getFloatLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalOnlineElm.g:1944:4: ( (lv_value_4_0= RULE_FLOAT ) )
                    // InternalOnlineElm.g:1945:5: (lv_value_4_0= RULE_FLOAT )
                    {
                    // InternalOnlineElm.g:1945:5: (lv_value_4_0= RULE_FLOAT )
                    // InternalOnlineElm.g:1946:6: lv_value_4_0= RULE_FLOAT
                    {
                    lv_value_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getTerminal_math_expAccess().getValueFLOATTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminal_math_expRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.online_elm.OnlineElm.FLOAT");
                    					

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
    // $ANTLR end "ruleTerminal_math_exp"


    // $ANTLR start "entryRuleStencil"
    // InternalOnlineElm.g:1967:1: entryRuleStencil returns [EObject current=null] : iv_ruleStencil= ruleStencil EOF ;
    public final EObject entryRuleStencil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStencil = null;


        try {
            // InternalOnlineElm.g:1967:48: (iv_ruleStencil= ruleStencil EOF )
            // InternalOnlineElm.g:1968:2: iv_ruleStencil= ruleStencil EOF
            {
             newCompositeNode(grammarAccess.getStencilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStencil=ruleStencil();

            state._fsp--;

             current =iv_ruleStencil; 
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
    // $ANTLR end "entryRuleStencil"


    // $ANTLR start "ruleStencil"
    // InternalOnlineElm.g:1974:1: ruleStencil returns [EObject current=null] : (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Square_2= ruleSquare | this_RoundedRect_3= ruleRoundedRect | this_Oval_4= ruleOval | this_Ngon_5= ruleNgon | this_Wedge_6= ruleWedge | this_Polygon_7= rulePolygon | this_Text_8= ruleText ) ;
    public final EObject ruleStencil() throws RecognitionException {
        EObject current = null;

        EObject this_Circle_0 = null;

        EObject this_Rect_1 = null;

        EObject this_Square_2 = null;

        EObject this_RoundedRect_3 = null;

        EObject this_Oval_4 = null;

        EObject this_Ngon_5 = null;

        EObject this_Wedge_6 = null;

        EObject this_Polygon_7 = null;

        EObject this_Text_8 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1980:2: ( (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Square_2= ruleSquare | this_RoundedRect_3= ruleRoundedRect | this_Oval_4= ruleOval | this_Ngon_5= ruleNgon | this_Wedge_6= ruleWedge | this_Polygon_7= rulePolygon | this_Text_8= ruleText ) )
            // InternalOnlineElm.g:1981:2: (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Square_2= ruleSquare | this_RoundedRect_3= ruleRoundedRect | this_Oval_4= ruleOval | this_Ngon_5= ruleNgon | this_Wedge_6= ruleWedge | this_Polygon_7= rulePolygon | this_Text_8= ruleText )
            {
            // InternalOnlineElm.g:1981:2: (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Square_2= ruleSquare | this_RoundedRect_3= ruleRoundedRect | this_Oval_4= ruleOval | this_Ngon_5= ruleNgon | this_Wedge_6= ruleWedge | this_Polygon_7= rulePolygon | this_Text_8= ruleText )
            int alt38=9;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt38=1;
                }
                break;
            case 38:
                {
                alt38=2;
                }
                break;
            case 39:
                {
                alt38=3;
                }
                break;
            case 40:
                {
                alt38=4;
                }
                break;
            case 41:
                {
                alt38=5;
                }
                break;
            case 42:
                {
                alt38=6;
                }
                break;
            case 43:
                {
                alt38=7;
                }
                break;
            case 44:
                {
                alt38=8;
                }
                break;
            case 45:
                {
                alt38=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalOnlineElm.g:1982:3: this_Circle_0= ruleCircle
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getCircleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Circle_0=ruleCircle();

                    state._fsp--;


                    			current = this_Circle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1991:3: this_Rect_1= ruleRect
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getRectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rect_1=ruleRect();

                    state._fsp--;


                    			current = this_Rect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:2000:3: this_Square_2= ruleSquare
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getSquareParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Square_2=ruleSquare();

                    state._fsp--;


                    			current = this_Square_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:2009:3: this_RoundedRect_3= ruleRoundedRect
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getRoundedRectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoundedRect_3=ruleRoundedRect();

                    state._fsp--;


                    			current = this_RoundedRect_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:2018:3: this_Oval_4= ruleOval
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getOvalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Oval_4=ruleOval();

                    state._fsp--;


                    			current = this_Oval_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOnlineElm.g:2027:3: this_Ngon_5= ruleNgon
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getNgonParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ngon_5=ruleNgon();

                    state._fsp--;


                    			current = this_Ngon_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOnlineElm.g:2036:3: this_Wedge_6= ruleWedge
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getWedgeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wedge_6=ruleWedge();

                    state._fsp--;


                    			current = this_Wedge_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOnlineElm.g:2045:3: this_Polygon_7= rulePolygon
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getPolygonParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polygon_7=rulePolygon();

                    state._fsp--;


                    			current = this_Polygon_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOnlineElm.g:2054:3: this_Text_8= ruleText
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getTextParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_8=ruleText();

                    state._fsp--;


                    			current = this_Text_8;
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
    // $ANTLR end "ruleStencil"


    // $ANTLR start "entryRuleCircle"
    // InternalOnlineElm.g:2066:1: entryRuleCircle returns [EObject current=null] : iv_ruleCircle= ruleCircle EOF ;
    public final EObject entryRuleCircle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircle = null;


        try {
            // InternalOnlineElm.g:2066:47: (iv_ruleCircle= ruleCircle EOF )
            // InternalOnlineElm.g:2067:2: iv_ruleCircle= ruleCircle EOF
            {
             newCompositeNode(grammarAccess.getCircleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCircle=ruleCircle();

            state._fsp--;

             current =iv_ruleCircle; 
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
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // InternalOnlineElm.g:2073:1: ruleCircle returns [EObject current=null] : ( ( (lv_name_0_0= 'circle' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ) ;
    public final EObject ruleCircle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_radius_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2079:2: ( ( ( (lv_name_0_0= 'circle' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2080:2: ( ( (lv_name_0_0= 'circle' ) ) ( (lv_radius_1_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2080:2: ( ( (lv_name_0_0= 'circle' ) ) ( (lv_radius_1_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2081:3: ( (lv_name_0_0= 'circle' ) ) ( (lv_radius_1_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2081:3: ( (lv_name_0_0= 'circle' ) )
            // InternalOnlineElm.g:2082:4: (lv_name_0_0= 'circle' )
            {
            // InternalOnlineElm.g:2082:4: (lv_name_0_0= 'circle' )
            // InternalOnlineElm.g:2083:5: lv_name_0_0= 'circle'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCircleAccess().getNameCircleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCircleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "circle");
            				

            }


            }

            // InternalOnlineElm.g:2095:3: ( (lv_radius_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2096:4: (lv_radius_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2096:4: (lv_radius_1_0= ruleNum_value )
            // InternalOnlineElm.g:2097:5: lv_radius_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getCircleAccess().getRadiusNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCircleRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleRect"
    // InternalOnlineElm.g:2118:1: entryRuleRect returns [EObject current=null] : iv_ruleRect= ruleRect EOF ;
    public final EObject entryRuleRect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRect = null;


        try {
            // InternalOnlineElm.g:2118:45: (iv_ruleRect= ruleRect EOF )
            // InternalOnlineElm.g:2119:2: iv_ruleRect= ruleRect EOF
            {
             newCompositeNode(grammarAccess.getRectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRect=ruleRect();

            state._fsp--;

             current =iv_ruleRect; 
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
    // $ANTLR end "entryRuleRect"


    // $ANTLR start "ruleRect"
    // InternalOnlineElm.g:2125:1: ruleRect returns [EObject current=null] : ( ( (lv_name_0_0= 'rect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ) ;
    public final EObject ruleRect() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_width_1_0 = null;

        EObject lv_height_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2131:2: ( ( ( (lv_name_0_0= 'rect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2132:2: ( ( (lv_name_0_0= 'rect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2132:2: ( ( (lv_name_0_0= 'rect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2133:3: ( (lv_name_0_0= 'rect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2133:3: ( (lv_name_0_0= 'rect' ) )
            // InternalOnlineElm.g:2134:4: (lv_name_0_0= 'rect' )
            {
            // InternalOnlineElm.g:2134:4: (lv_name_0_0= 'rect' )
            // InternalOnlineElm.g:2135:5: lv_name_0_0= 'rect'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRectAccess().getNameRectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rect");
            				

            }


            }

            // InternalOnlineElm.g:2147:3: ( (lv_width_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2148:4: (lv_width_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2148:4: (lv_width_1_0= ruleNum_value )
            // InternalOnlineElm.g:2149:5: lv_width_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRectAccess().getWidthNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_width_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2166:3: ( (lv_height_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:2167:4: (lv_height_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2167:4: (lv_height_2_0= ruleNum_value )
            // InternalOnlineElm.g:2168:5: lv_height_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRectAccess().getHeightNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_height_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRect"


    // $ANTLR start "entryRuleSquare"
    // InternalOnlineElm.g:2189:1: entryRuleSquare returns [EObject current=null] : iv_ruleSquare= ruleSquare EOF ;
    public final EObject entryRuleSquare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquare = null;


        try {
            // InternalOnlineElm.g:2189:47: (iv_ruleSquare= ruleSquare EOF )
            // InternalOnlineElm.g:2190:2: iv_ruleSquare= ruleSquare EOF
            {
             newCompositeNode(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquare=ruleSquare();

            state._fsp--;

             current =iv_ruleSquare; 
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
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // InternalOnlineElm.g:2196:1: ruleSquare returns [EObject current=null] : ( ( (lv_name_0_0= 'square' ) ) ( (lv_side_1_0= ruleNum_value ) ) ) ;
    public final EObject ruleSquare() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_side_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2202:2: ( ( ( (lv_name_0_0= 'square' ) ) ( (lv_side_1_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2203:2: ( ( (lv_name_0_0= 'square' ) ) ( (lv_side_1_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2203:2: ( ( (lv_name_0_0= 'square' ) ) ( (lv_side_1_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2204:3: ( (lv_name_0_0= 'square' ) ) ( (lv_side_1_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2204:3: ( (lv_name_0_0= 'square' ) )
            // InternalOnlineElm.g:2205:4: (lv_name_0_0= 'square' )
            {
            // InternalOnlineElm.g:2205:4: (lv_name_0_0= 'square' )
            // InternalOnlineElm.g:2206:5: lv_name_0_0= 'square'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSquareAccess().getNameSquareKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSquareRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "square");
            				

            }


            }

            // InternalOnlineElm.g:2218:3: ( (lv_side_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2219:4: (lv_side_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2219:4: (lv_side_1_0= ruleNum_value )
            // InternalOnlineElm.g:2220:5: lv_side_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getSquareAccess().getSideNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_side_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSquareRule());
            					}
            					set(
            						current,
            						"side",
            						lv_side_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSquare"


    // $ANTLR start "entryRuleRoundedRect"
    // InternalOnlineElm.g:2241:1: entryRuleRoundedRect returns [EObject current=null] : iv_ruleRoundedRect= ruleRoundedRect EOF ;
    public final EObject entryRuleRoundedRect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundedRect = null;


        try {
            // InternalOnlineElm.g:2241:52: (iv_ruleRoundedRect= ruleRoundedRect EOF )
            // InternalOnlineElm.g:2242:2: iv_ruleRoundedRect= ruleRoundedRect EOF
            {
             newCompositeNode(grammarAccess.getRoundedRectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoundedRect=ruleRoundedRect();

            state._fsp--;

             current =iv_ruleRoundedRect; 
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
    // $ANTLR end "entryRuleRoundedRect"


    // $ANTLR start "ruleRoundedRect"
    // InternalOnlineElm.g:2248:1: ruleRoundedRect returns [EObject current=null] : ( ( (lv_name_0_0= 'roundedRect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ( (lv_corner_radius_3_0= ruleNum_value ) ) ) ;
    public final EObject ruleRoundedRect() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_width_1_0 = null;

        EObject lv_height_2_0 = null;

        EObject lv_corner_radius_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2254:2: ( ( ( (lv_name_0_0= 'roundedRect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ( (lv_corner_radius_3_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2255:2: ( ( (lv_name_0_0= 'roundedRect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ( (lv_corner_radius_3_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2255:2: ( ( (lv_name_0_0= 'roundedRect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ( (lv_corner_radius_3_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2256:3: ( (lv_name_0_0= 'roundedRect' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ( (lv_corner_radius_3_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2256:3: ( (lv_name_0_0= 'roundedRect' ) )
            // InternalOnlineElm.g:2257:4: (lv_name_0_0= 'roundedRect' )
            {
            // InternalOnlineElm.g:2257:4: (lv_name_0_0= 'roundedRect' )
            // InternalOnlineElm.g:2258:5: lv_name_0_0= 'roundedRect'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRoundedRectAccess().getNameRoundedRectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoundedRectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "roundedRect");
            				

            }


            }

            // InternalOnlineElm.g:2270:3: ( (lv_width_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2271:4: (lv_width_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2271:4: (lv_width_1_0= ruleNum_value )
            // InternalOnlineElm.g:2272:5: lv_width_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRoundedRectAccess().getWidthNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_width_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoundedRectRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2289:3: ( (lv_height_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:2290:4: (lv_height_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2290:4: (lv_height_2_0= ruleNum_value )
            // InternalOnlineElm.g:2291:5: lv_height_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRoundedRectAccess().getHeightNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_height_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoundedRectRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2308:3: ( (lv_corner_radius_3_0= ruleNum_value ) )
            // InternalOnlineElm.g:2309:4: (lv_corner_radius_3_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2309:4: (lv_corner_radius_3_0= ruleNum_value )
            // InternalOnlineElm.g:2310:5: lv_corner_radius_3_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRoundedRectAccess().getCorner_radiusNum_valueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_corner_radius_3_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoundedRectRule());
            					}
            					set(
            						current,
            						"corner_radius",
            						lv_corner_radius_3_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRoundedRect"


    // $ANTLR start "entryRuleOval"
    // InternalOnlineElm.g:2331:1: entryRuleOval returns [EObject current=null] : iv_ruleOval= ruleOval EOF ;
    public final EObject entryRuleOval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOval = null;


        try {
            // InternalOnlineElm.g:2331:45: (iv_ruleOval= ruleOval EOF )
            // InternalOnlineElm.g:2332:2: iv_ruleOval= ruleOval EOF
            {
             newCompositeNode(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOval=ruleOval();

            state._fsp--;

             current =iv_ruleOval; 
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
    // $ANTLR end "entryRuleOval"


    // $ANTLR start "ruleOval"
    // InternalOnlineElm.g:2338:1: ruleOval returns [EObject current=null] : ( ( (lv_name_0_0= 'oval' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ) ;
    public final EObject ruleOval() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_width_1_0 = null;

        EObject lv_height_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2344:2: ( ( ( (lv_name_0_0= 'oval' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2345:2: ( ( (lv_name_0_0= 'oval' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2345:2: ( ( (lv_name_0_0= 'oval' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2346:3: ( (lv_name_0_0= 'oval' ) ) ( (lv_width_1_0= ruleNum_value ) ) ( (lv_height_2_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2346:3: ( (lv_name_0_0= 'oval' ) )
            // InternalOnlineElm.g:2347:4: (lv_name_0_0= 'oval' )
            {
            // InternalOnlineElm.g:2347:4: (lv_name_0_0= 'oval' )
            // InternalOnlineElm.g:2348:5: lv_name_0_0= 'oval'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOvalAccess().getNameOvalKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOvalRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "oval");
            				

            }


            }

            // InternalOnlineElm.g:2360:3: ( (lv_width_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2361:4: (lv_width_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2361:4: (lv_width_1_0= ruleNum_value )
            // InternalOnlineElm.g:2362:5: lv_width_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getOvalAccess().getWidthNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_width_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOvalRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2379:3: ( (lv_height_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:2380:4: (lv_height_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2380:4: (lv_height_2_0= ruleNum_value )
            // InternalOnlineElm.g:2381:5: lv_height_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getOvalAccess().getHeightNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_height_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOvalRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleOval"


    // $ANTLR start "entryRuleNgon"
    // InternalOnlineElm.g:2402:1: entryRuleNgon returns [EObject current=null] : iv_ruleNgon= ruleNgon EOF ;
    public final EObject entryRuleNgon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNgon = null;


        try {
            // InternalOnlineElm.g:2402:45: (iv_ruleNgon= ruleNgon EOF )
            // InternalOnlineElm.g:2403:2: iv_ruleNgon= ruleNgon EOF
            {
             newCompositeNode(grammarAccess.getNgonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNgon=ruleNgon();

            state._fsp--;

             current =iv_ruleNgon; 
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
    // $ANTLR end "entryRuleNgon"


    // $ANTLR start "ruleNgon"
    // InternalOnlineElm.g:2409:1: ruleNgon returns [EObject current=null] : ( ( (lv_name_0_0= 'ngon' ) ) ( (lv_sides_num_1_0= ruleNum_value ) ) ( (lv_radius_2_0= ruleNum_value ) ) ) ;
    public final EObject ruleNgon() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_sides_num_1_0 = null;

        EObject lv_radius_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2415:2: ( ( ( (lv_name_0_0= 'ngon' ) ) ( (lv_sides_num_1_0= ruleNum_value ) ) ( (lv_radius_2_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2416:2: ( ( (lv_name_0_0= 'ngon' ) ) ( (lv_sides_num_1_0= ruleNum_value ) ) ( (lv_radius_2_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2416:2: ( ( (lv_name_0_0= 'ngon' ) ) ( (lv_sides_num_1_0= ruleNum_value ) ) ( (lv_radius_2_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2417:3: ( (lv_name_0_0= 'ngon' ) ) ( (lv_sides_num_1_0= ruleNum_value ) ) ( (lv_radius_2_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2417:3: ( (lv_name_0_0= 'ngon' ) )
            // InternalOnlineElm.g:2418:4: (lv_name_0_0= 'ngon' )
            {
            // InternalOnlineElm.g:2418:4: (lv_name_0_0= 'ngon' )
            // InternalOnlineElm.g:2419:5: lv_name_0_0= 'ngon'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNgonAccess().getNameNgonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNgonRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ngon");
            				

            }


            }

            // InternalOnlineElm.g:2431:3: ( (lv_sides_num_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2432:4: (lv_sides_num_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2432:4: (lv_sides_num_1_0= ruleNum_value )
            // InternalOnlineElm.g:2433:5: lv_sides_num_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getNgonAccess().getSides_numNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_sides_num_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNgonRule());
            					}
            					set(
            						current,
            						"sides_num",
            						lv_sides_num_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2450:3: ( (lv_radius_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:2451:4: (lv_radius_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2451:4: (lv_radius_2_0= ruleNum_value )
            // InternalOnlineElm.g:2452:5: lv_radius_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getNgonAccess().getRadiusNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNgonRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNgon"


    // $ANTLR start "entryRuleWedge"
    // InternalOnlineElm.g:2473:1: entryRuleWedge returns [EObject current=null] : iv_ruleWedge= ruleWedge EOF ;
    public final EObject entryRuleWedge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWedge = null;


        try {
            // InternalOnlineElm.g:2473:46: (iv_ruleWedge= ruleWedge EOF )
            // InternalOnlineElm.g:2474:2: iv_ruleWedge= ruleWedge EOF
            {
             newCompositeNode(grammarAccess.getWedgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWedge=ruleWedge();

            state._fsp--;

             current =iv_ruleWedge; 
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
    // $ANTLR end "entryRuleWedge"


    // $ANTLR start "ruleWedge"
    // InternalOnlineElm.g:2480:1: ruleWedge returns [EObject current=null] : ( ( (lv_name_0_0= 'wedge' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ( (lv_fraction_2_0= ruleNum_value ) ) ) ;
    public final EObject ruleWedge() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_radius_1_0 = null;

        EObject lv_fraction_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2486:2: ( ( ( (lv_name_0_0= 'wedge' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ( (lv_fraction_2_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:2487:2: ( ( (lv_name_0_0= 'wedge' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ( (lv_fraction_2_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:2487:2: ( ( (lv_name_0_0= 'wedge' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ( (lv_fraction_2_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:2488:3: ( (lv_name_0_0= 'wedge' ) ) ( (lv_radius_1_0= ruleNum_value ) ) ( (lv_fraction_2_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:2488:3: ( (lv_name_0_0= 'wedge' ) )
            // InternalOnlineElm.g:2489:4: (lv_name_0_0= 'wedge' )
            {
            // InternalOnlineElm.g:2489:4: (lv_name_0_0= 'wedge' )
            // InternalOnlineElm.g:2490:5: lv_name_0_0= 'wedge'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWedgeAccess().getNameWedgeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWedgeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "wedge");
            				

            }


            }

            // InternalOnlineElm.g:2502:3: ( (lv_radius_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2503:4: (lv_radius_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2503:4: (lv_radius_1_0= ruleNum_value )
            // InternalOnlineElm.g:2504:5: lv_radius_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getWedgeAccess().getRadiusNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_radius_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWedgeRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2521:3: ( (lv_fraction_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:2522:4: (lv_fraction_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2522:4: (lv_fraction_2_0= ruleNum_value )
            // InternalOnlineElm.g:2523:5: lv_fraction_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getWedgeAccess().getFractionNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_fraction_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWedgeRule());
            					}
            					set(
            						current,
            						"fraction",
            						lv_fraction_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleWedge"


    // $ANTLR start "entryRulePolygon"
    // InternalOnlineElm.g:2544:1: entryRulePolygon returns [EObject current=null] : iv_rulePolygon= rulePolygon EOF ;
    public final EObject entryRulePolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygon = null;


        try {
            // InternalOnlineElm.g:2544:48: (iv_rulePolygon= rulePolygon EOF )
            // InternalOnlineElm.g:2545:2: iv_rulePolygon= rulePolygon EOF
            {
             newCompositeNode(grammarAccess.getPolygonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolygon=rulePolygon();

            state._fsp--;

             current =iv_rulePolygon; 
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
    // $ANTLR end "entryRulePolygon"


    // $ANTLR start "rulePolygon"
    // InternalOnlineElm.g:2551:1: rulePolygon returns [EObject current=null] : ( ( (lv_name_0_0= 'polygon' ) ) otherlv_1= '[' ( (lv_point1_2_0= rulePoint ) ) (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )* otherlv_5= ']' ) ;
    public final EObject rulePolygon() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_point1_2_0 = null;

        EObject lv_points_4_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2557:2: ( ( ( (lv_name_0_0= 'polygon' ) ) otherlv_1= '[' ( (lv_point1_2_0= rulePoint ) ) (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )* otherlv_5= ']' ) )
            // InternalOnlineElm.g:2558:2: ( ( (lv_name_0_0= 'polygon' ) ) otherlv_1= '[' ( (lv_point1_2_0= rulePoint ) ) (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )* otherlv_5= ']' )
            {
            // InternalOnlineElm.g:2558:2: ( ( (lv_name_0_0= 'polygon' ) ) otherlv_1= '[' ( (lv_point1_2_0= rulePoint ) ) (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )* otherlv_5= ']' )
            // InternalOnlineElm.g:2559:3: ( (lv_name_0_0= 'polygon' ) ) otherlv_1= '[' ( (lv_point1_2_0= rulePoint ) ) (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )* otherlv_5= ']'
            {
            // InternalOnlineElm.g:2559:3: ( (lv_name_0_0= 'polygon' ) )
            // InternalOnlineElm.g:2560:4: (lv_name_0_0= 'polygon' )
            {
            // InternalOnlineElm.g:2560:4: (lv_name_0_0= 'polygon' )
            // InternalOnlineElm.g:2561:5: lv_name_0_0= 'polygon'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPolygonAccess().getNamePolygonKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolygonRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "polygon");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getPolygonAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalOnlineElm.g:2577:3: ( (lv_point1_2_0= rulePoint ) )
            // InternalOnlineElm.g:2578:4: (lv_point1_2_0= rulePoint )
            {
            // InternalOnlineElm.g:2578:4: (lv_point1_2_0= rulePoint )
            // InternalOnlineElm.g:2579:5: lv_point1_2_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolygonAccess().getPoint1PointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_point1_2_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolygonRule());
            					}
            					set(
            						current,
            						"point1",
            						lv_point1_2_0,
            						"org.xtext.online_elm.OnlineElm.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:2596:3: (otherlv_3= ',' ( (lv_points_4_0= rulePoint ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOnlineElm.g:2597:4: otherlv_3= ',' ( (lv_points_4_0= rulePoint ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_33); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPolygonAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalOnlineElm.g:2601:4: ( (lv_points_4_0= rulePoint ) )
            	    // InternalOnlineElm.g:2602:5: (lv_points_4_0= rulePoint )
            	    {
            	    // InternalOnlineElm.g:2602:5: (lv_points_4_0= rulePoint )
            	    // InternalOnlineElm.g:2603:6: lv_points_4_0= rulePoint
            	    {

            	    						newCompositeNode(grammarAccess.getPolygonAccess().getPointsPointParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_points_4_0=rulePoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPolygonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"points",
            	    							lv_points_4_0,
            	    							"org.xtext.online_elm.OnlineElm.Point");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPolygonAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "rulePolygon"


    // $ANTLR start "entryRulePoint"
    // InternalOnlineElm.g:2629:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalOnlineElm.g:2629:46: (iv_rulePoint= rulePoint EOF )
            // InternalOnlineElm.g:2630:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalOnlineElm.g:2636:1: rulePoint returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleNum_value ) ) otherlv_2= ',' ( (lv_y_3_0= ruleNum_value ) ) otherlv_4= ')' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_x_1_0 = null;

        EObject lv_y_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2642:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleNum_value ) ) otherlv_2= ',' ( (lv_y_3_0= ruleNum_value ) ) otherlv_4= ')' ) )
            // InternalOnlineElm.g:2643:2: (otherlv_0= '(' ( (lv_x_1_0= ruleNum_value ) ) otherlv_2= ',' ( (lv_y_3_0= ruleNum_value ) ) otherlv_4= ')' )
            {
            // InternalOnlineElm.g:2643:2: (otherlv_0= '(' ( (lv_x_1_0= ruleNum_value ) ) otherlv_2= ',' ( (lv_y_3_0= ruleNum_value ) ) otherlv_4= ')' )
            // InternalOnlineElm.g:2644:3: otherlv_0= '(' ( (lv_x_1_0= ruleNum_value ) ) otherlv_2= ',' ( (lv_y_3_0= ruleNum_value ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOnlineElm.g:2648:3: ( (lv_x_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:2649:4: (lv_x_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2649:4: (lv_x_1_0= ruleNum_value )
            // InternalOnlineElm.g:2650:5: lv_x_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getPointAccess().getXNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_x_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            // InternalOnlineElm.g:2671:3: ( (lv_y_3_0= ruleNum_value ) )
            // InternalOnlineElm.g:2672:4: (lv_y_3_0= ruleNum_value )
            {
            // InternalOnlineElm.g:2672:4: (lv_y_3_0= ruleNum_value )
            // InternalOnlineElm.g:2673:5: lv_y_3_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getPointAccess().getYNum_valueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_y_3_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleText"
    // InternalOnlineElm.g:2698:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalOnlineElm.g:2698:45: (iv_ruleText= ruleText EOF )
            // InternalOnlineElm.g:2699:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalOnlineElm.g:2705:1: ruleText returns [EObject current=null] : ( ( (lv_name_0_0= 'text' ) ) ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_content_1_0=null;
        EObject lv_conditionalContent_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2711:2: ( ( ( (lv_name_0_0= 'text' ) ) ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) ) ) )
            // InternalOnlineElm.g:2712:2: ( ( (lv_name_0_0= 'text' ) ) ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) ) )
            {
            // InternalOnlineElm.g:2712:2: ( ( (lv_name_0_0= 'text' ) ) ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) ) )
            // InternalOnlineElm.g:2713:3: ( (lv_name_0_0= 'text' ) ) ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) )
            {
            // InternalOnlineElm.g:2713:3: ( (lv_name_0_0= 'text' ) )
            // InternalOnlineElm.g:2714:4: (lv_name_0_0= 'text' )
            {
            // InternalOnlineElm.g:2714:4: (lv_name_0_0= 'text' )
            // InternalOnlineElm.g:2715:5: lv_name_0_0= 'text'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameTextKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "text");
            				

            }


            }

            // InternalOnlineElm.g:2727:3: ( ( (lv_content_1_0= RULE_STRING ) ) | ( (lv_conditionalContent_2_0= ruleConditional_Str ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==26) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOnlineElm.g:2728:4: ( (lv_content_1_0= RULE_STRING ) )
                    {
                    // InternalOnlineElm.g:2728:4: ( (lv_content_1_0= RULE_STRING ) )
                    // InternalOnlineElm.g:2729:5: (lv_content_1_0= RULE_STRING )
                    {
                    // InternalOnlineElm.g:2729:5: (lv_content_1_0= RULE_STRING )
                    // InternalOnlineElm.g:2730:6: lv_content_1_0= RULE_STRING
                    {
                    lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_content_1_0, grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:2747:4: ( (lv_conditionalContent_2_0= ruleConditional_Str ) )
                    {
                    // InternalOnlineElm.g:2747:4: ( (lv_conditionalContent_2_0= ruleConditional_Str ) )
                    // InternalOnlineElm.g:2748:5: (lv_conditionalContent_2_0= ruleConditional_Str )
                    {
                    // InternalOnlineElm.g:2748:5: (lv_conditionalContent_2_0= ruleConditional_Str )
                    // InternalOnlineElm.g:2749:6: lv_conditionalContent_2_0= ruleConditional_Str
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getConditionalContentConditional_StrParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_conditionalContent_2_0=ruleConditional_Str();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"conditionalContent",
                    							lv_conditionalContent_2_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Str");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleDraw"
    // InternalOnlineElm.g:2771:1: entryRuleDraw returns [EObject current=null] : iv_ruleDraw= ruleDraw EOF ;
    public final EObject entryRuleDraw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDraw = null;


        try {
            // InternalOnlineElm.g:2771:45: (iv_ruleDraw= ruleDraw EOF )
            // InternalOnlineElm.g:2772:2: iv_ruleDraw= ruleDraw EOF
            {
             newCompositeNode(grammarAccess.getDrawRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDraw=ruleDraw();

            state._fsp--;

             current =iv_ruleDraw; 
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
    // $ANTLR end "entryRuleDraw"


    // $ANTLR start "ruleDraw"
    // InternalOnlineElm.g:2778:1: ruleDraw returns [EObject current=null] : ( ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) ) (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )* ) ;
    public final EObject ruleDraw() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_filled_0_0 = null;

        EObject lv_outlined_1_0 = null;

        EObject lv_transform_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2784:2: ( ( ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) ) (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )* ) )
            // InternalOnlineElm.g:2785:2: ( ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) ) (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )* )
            {
            // InternalOnlineElm.g:2785:2: ( ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) ) (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )* )
            // InternalOnlineElm.g:2786:3: ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) ) (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )*
            {
            // InternalOnlineElm.g:2786:3: ( ( (lv_filled_0_0= ruleFilled ) ) | ( (lv_outlined_1_0= ruleOutlined ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            else if ( (LA41_0==48) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOnlineElm.g:2787:4: ( (lv_filled_0_0= ruleFilled ) )
                    {
                    // InternalOnlineElm.g:2787:4: ( (lv_filled_0_0= ruleFilled ) )
                    // InternalOnlineElm.g:2788:5: (lv_filled_0_0= ruleFilled )
                    {
                    // InternalOnlineElm.g:2788:5: (lv_filled_0_0= ruleFilled )
                    // InternalOnlineElm.g:2789:6: lv_filled_0_0= ruleFilled
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getFilledFilledParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_filled_0_0=ruleFilled();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"filled",
                    							lv_filled_0_0,
                    							"org.xtext.online_elm.OnlineElm.Filled");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:2807:4: ( (lv_outlined_1_0= ruleOutlined ) )
                    {
                    // InternalOnlineElm.g:2807:4: ( (lv_outlined_1_0= ruleOutlined ) )
                    // InternalOnlineElm.g:2808:5: (lv_outlined_1_0= ruleOutlined )
                    {
                    // InternalOnlineElm.g:2808:5: (lv_outlined_1_0= ruleOutlined )
                    // InternalOnlineElm.g:2809:6: lv_outlined_1_0= ruleOutlined
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getOutlinedOutlinedParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_outlined_1_0=ruleOutlined();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"outlined",
                    							lv_outlined_1_0,
                    							"org.xtext.online_elm.OnlineElm.Outlined");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:2827:3: (otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==22) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOnlineElm.g:2828:4: otherlv_2= '|>' ( (lv_transform_3_0= ruleTranform ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalOnlineElm.g:2832:4: ( (lv_transform_3_0= ruleTranform ) )
            	    // InternalOnlineElm.g:2833:5: (lv_transform_3_0= ruleTranform )
            	    {
            	    // InternalOnlineElm.g:2833:5: (lv_transform_3_0= ruleTranform )
            	    // InternalOnlineElm.g:2834:6: lv_transform_3_0= ruleTranform
            	    {

            	    						newCompositeNode(grammarAccess.getDrawAccess().getTransformTranformParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_transform_3_0=ruleTranform();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDrawRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transform",
            	    							lv_transform_3_0,
            	    							"org.xtext.online_elm.OnlineElm.Tranform");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleDraw"


    // $ANTLR start "entryRuleFilled"
    // InternalOnlineElm.g:2856:1: entryRuleFilled returns [EObject current=null] : iv_ruleFilled= ruleFilled EOF ;
    public final EObject entryRuleFilled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilled = null;


        try {
            // InternalOnlineElm.g:2856:47: (iv_ruleFilled= ruleFilled EOF )
            // InternalOnlineElm.g:2857:2: iv_ruleFilled= ruleFilled EOF
            {
             newCompositeNode(grammarAccess.getFilledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilled=ruleFilled();

            state._fsp--;

             current =iv_ruleFilled; 
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
    // $ANTLR end "entryRuleFilled"


    // $ANTLR start "ruleFilled"
    // InternalOnlineElm.g:2863:1: ruleFilled returns [EObject current=null] : ( ( (lv_name_0_0= 'filled' ) ) ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) ) (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )? ) ;
    public final EObject ruleFilled() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_width1_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_filledColor1_1_0 = null;

        EObject lv_filledColor2_2_0 = null;

        Enumerator lv_lineType1_6_0 = null;

        Enumerator lv_outline_color1_9_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:2869:2: ( ( ( (lv_name_0_0= 'filled' ) ) ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) ) (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )? ) )
            // InternalOnlineElm.g:2870:2: ( ( (lv_name_0_0= 'filled' ) ) ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) ) (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )? )
            {
            // InternalOnlineElm.g:2870:2: ( ( (lv_name_0_0= 'filled' ) ) ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) ) (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )? )
            // InternalOnlineElm.g:2871:3: ( (lv_name_0_0= 'filled' ) ) ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) ) (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )?
            {
            // InternalOnlineElm.g:2871:3: ( (lv_name_0_0= 'filled' ) )
            // InternalOnlineElm.g:2872:4: (lv_name_0_0= 'filled' )
            {
            // InternalOnlineElm.g:2872:4: (lv_name_0_0= 'filled' )
            // InternalOnlineElm.g:2873:5: lv_name_0_0= 'filled'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFilledAccess().getNameFilledKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilledRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "filled");
            				

            }


            }

            // InternalOnlineElm.g:2885:3: ( ( (lv_filledColor1_1_0= ruleColor ) ) | ( (lv_filledColor2_2_0= ruleConditional_Color ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=64 && LA43_0<=97)) ) {
                alt43=1;
            }
            else if ( (LA43_0==26) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOnlineElm.g:2886:4: ( (lv_filledColor1_1_0= ruleColor ) )
                    {
                    // InternalOnlineElm.g:2886:4: ( (lv_filledColor1_1_0= ruleColor ) )
                    // InternalOnlineElm.g:2887:5: (lv_filledColor1_1_0= ruleColor )
                    {
                    // InternalOnlineElm.g:2887:5: (lv_filledColor1_1_0= ruleColor )
                    // InternalOnlineElm.g:2888:6: lv_filledColor1_1_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getFilledAccess().getFilledColor1ColorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_filledColor1_1_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilledRule());
                    						}
                    						set(
                    							current,
                    							"filledColor1",
                    							lv_filledColor1_1_0,
                    							"org.xtext.online_elm.OnlineElm.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:2906:4: ( (lv_filledColor2_2_0= ruleConditional_Color ) )
                    {
                    // InternalOnlineElm.g:2906:4: ( (lv_filledColor2_2_0= ruleConditional_Color ) )
                    // InternalOnlineElm.g:2907:5: (lv_filledColor2_2_0= ruleConditional_Color )
                    {
                    // InternalOnlineElm.g:2907:5: (lv_filledColor2_2_0= ruleConditional_Color )
                    // InternalOnlineElm.g:2908:6: lv_filledColor2_2_0= ruleConditional_Color
                    {

                    						newCompositeNode(grammarAccess.getFilledAccess().getFilledColor2Conditional_ColorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_filledColor2_2_0=ruleConditional_Color();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilledRule());
                    						}
                    						set(
                    							current,
                    							"filledColor2",
                    							lv_filledColor2_2_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:2926:3: (otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==47) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalOnlineElm.g:2927:4: otherlv_3= '|>' otherlv_4= 'addOutline' otherlv_5= '(' ( (lv_lineType1_6_0= ruleLineType ) ) ( (lv_width1_7_0= RULE_FLOAT ) ) otherlv_8= ')' ( (lv_outline_color1_9_0= ruleColor ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getFilledAccess().getVerticalLineGreaterThanSignKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,47,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getFilledAccess().getAddOutlineKeyword_2_1());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilledAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalOnlineElm.g:2939:4: ( (lv_lineType1_6_0= ruleLineType ) )
                    // InternalOnlineElm.g:2940:5: (lv_lineType1_6_0= ruleLineType )
                    {
                    // InternalOnlineElm.g:2940:5: (lv_lineType1_6_0= ruleLineType )
                    // InternalOnlineElm.g:2941:6: lv_lineType1_6_0= ruleLineType
                    {

                    						newCompositeNode(grammarAccess.getFilledAccess().getLineType1LineTypeEnumRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_lineType1_6_0=ruleLineType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilledRule());
                    						}
                    						set(
                    							current,
                    							"lineType1",
                    							lv_lineType1_6_0,
                    							"org.xtext.online_elm.OnlineElm.LineType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOnlineElm.g:2958:4: ( (lv_width1_7_0= RULE_FLOAT ) )
                    // InternalOnlineElm.g:2959:5: (lv_width1_7_0= RULE_FLOAT )
                    {
                    // InternalOnlineElm.g:2959:5: (lv_width1_7_0= RULE_FLOAT )
                    // InternalOnlineElm.g:2960:6: lv_width1_7_0= RULE_FLOAT
                    {
                    lv_width1_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_26); 

                    						newLeafNode(lv_width1_7_0, grammarAccess.getFilledAccess().getWidth1FLOATTerminalRuleCall_2_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilledRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"width1",
                    							lv_width1_7_0,
                    							"org.xtext.online_elm.OnlineElm.FLOAT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getFilledAccess().getRightParenthesisKeyword_2_5());
                    			
                    // InternalOnlineElm.g:2980:4: ( (lv_outline_color1_9_0= ruleColor ) )
                    // InternalOnlineElm.g:2981:5: (lv_outline_color1_9_0= ruleColor )
                    {
                    // InternalOnlineElm.g:2981:5: (lv_outline_color1_9_0= ruleColor )
                    // InternalOnlineElm.g:2982:6: lv_outline_color1_9_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getFilledAccess().getOutline_color1ColorEnumRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outline_color1_9_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilledRule());
                    						}
                    						set(
                    							current,
                    							"outline_color1",
                    							lv_outline_color1_9_0,
                    							"org.xtext.online_elm.OnlineElm.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleFilled"


    // $ANTLR start "entryRuleOutlined"
    // InternalOnlineElm.g:3004:1: entryRuleOutlined returns [EObject current=null] : iv_ruleOutlined= ruleOutlined EOF ;
    public final EObject entryRuleOutlined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutlined = null;


        try {
            // InternalOnlineElm.g:3004:49: (iv_ruleOutlined= ruleOutlined EOF )
            // InternalOnlineElm.g:3005:2: iv_ruleOutlined= ruleOutlined EOF
            {
             newCompositeNode(grammarAccess.getOutlinedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutlined=ruleOutlined();

            state._fsp--;

             current =iv_ruleOutlined; 
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
    // $ANTLR end "entryRuleOutlined"


    // $ANTLR start "ruleOutlined"
    // InternalOnlineElm.g:3011:1: ruleOutlined returns [EObject current=null] : ( ( (lv_name_0_0= 'outlined' ) ) otherlv_1= '(' ( (lv_lineType_2_0= ruleLineType ) ) ( (lv_width_3_0= RULE_FLOAT ) ) otherlv_4= ')' ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) ) ) ;
    public final EObject ruleOutlined() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_lineType_2_0 = null;

        Enumerator lv_outlinedColor1_5_0 = null;

        EObject lv_outlinedColor2_6_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3017:2: ( ( ( (lv_name_0_0= 'outlined' ) ) otherlv_1= '(' ( (lv_lineType_2_0= ruleLineType ) ) ( (lv_width_3_0= RULE_FLOAT ) ) otherlv_4= ')' ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) ) ) )
            // InternalOnlineElm.g:3018:2: ( ( (lv_name_0_0= 'outlined' ) ) otherlv_1= '(' ( (lv_lineType_2_0= ruleLineType ) ) ( (lv_width_3_0= RULE_FLOAT ) ) otherlv_4= ')' ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) ) )
            {
            // InternalOnlineElm.g:3018:2: ( ( (lv_name_0_0= 'outlined' ) ) otherlv_1= '(' ( (lv_lineType_2_0= ruleLineType ) ) ( (lv_width_3_0= RULE_FLOAT ) ) otherlv_4= ')' ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) ) )
            // InternalOnlineElm.g:3019:3: ( (lv_name_0_0= 'outlined' ) ) otherlv_1= '(' ( (lv_lineType_2_0= ruleLineType ) ) ( (lv_width_3_0= RULE_FLOAT ) ) otherlv_4= ')' ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) )
            {
            // InternalOnlineElm.g:3019:3: ( (lv_name_0_0= 'outlined' ) )
            // InternalOnlineElm.g:3020:4: (lv_name_0_0= 'outlined' )
            {
            // InternalOnlineElm.g:3020:4: (lv_name_0_0= 'outlined' )
            // InternalOnlineElm.g:3021:5: lv_name_0_0= 'outlined'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutlinedAccess().getNameOutlinedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutlinedRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "outlined");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getOutlinedAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOnlineElm.g:3037:3: ( (lv_lineType_2_0= ruleLineType ) )
            // InternalOnlineElm.g:3038:4: (lv_lineType_2_0= ruleLineType )
            {
            // InternalOnlineElm.g:3038:4: (lv_lineType_2_0= ruleLineType )
            // InternalOnlineElm.g:3039:5: lv_lineType_2_0= ruleLineType
            {

            					newCompositeNode(grammarAccess.getOutlinedAccess().getLineTypeLineTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_lineType_2_0=ruleLineType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutlinedRule());
            					}
            					set(
            						current,
            						"lineType",
            						lv_lineType_2_0,
            						"org.xtext.online_elm.OnlineElm.LineType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:3056:3: ( (lv_width_3_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:3057:4: (lv_width_3_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:3057:4: (lv_width_3_0= RULE_FLOAT )
            // InternalOnlineElm.g:3058:5: lv_width_3_0= RULE_FLOAT
            {
            lv_width_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_26); 

            					newLeafNode(lv_width_3_0, grammarAccess.getOutlinedAccess().getWidthFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutlinedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_3_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getOutlinedAccess().getRightParenthesisKeyword_4());
            		
            // InternalOnlineElm.g:3078:3: ( ( (lv_outlinedColor1_5_0= ruleColor ) ) | ( (lv_outlinedColor2_6_0= ruleConditional_Color ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=64 && LA45_0<=97)) ) {
                alt45=1;
            }
            else if ( (LA45_0==26) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalOnlineElm.g:3079:4: ( (lv_outlinedColor1_5_0= ruleColor ) )
                    {
                    // InternalOnlineElm.g:3079:4: ( (lv_outlinedColor1_5_0= ruleColor ) )
                    // InternalOnlineElm.g:3080:5: (lv_outlinedColor1_5_0= ruleColor )
                    {
                    // InternalOnlineElm.g:3080:5: (lv_outlinedColor1_5_0= ruleColor )
                    // InternalOnlineElm.g:3081:6: lv_outlinedColor1_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getOutlinedAccess().getOutlinedColor1ColorEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outlinedColor1_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutlinedRule());
                    						}
                    						set(
                    							current,
                    							"outlinedColor1",
                    							lv_outlinedColor1_5_0,
                    							"org.xtext.online_elm.OnlineElm.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3099:4: ( (lv_outlinedColor2_6_0= ruleConditional_Color ) )
                    {
                    // InternalOnlineElm.g:3099:4: ( (lv_outlinedColor2_6_0= ruleConditional_Color ) )
                    // InternalOnlineElm.g:3100:5: (lv_outlinedColor2_6_0= ruleConditional_Color )
                    {
                    // InternalOnlineElm.g:3100:5: (lv_outlinedColor2_6_0= ruleConditional_Color )
                    // InternalOnlineElm.g:3101:6: lv_outlinedColor2_6_0= ruleConditional_Color
                    {

                    						newCompositeNode(grammarAccess.getOutlinedAccess().getOutlinedColor2Conditional_ColorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outlinedColor2_6_0=ruleConditional_Color();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutlinedRule());
                    						}
                    						set(
                    							current,
                    							"outlinedColor2",
                    							lv_outlinedColor2_6_0,
                    							"org.xtext.online_elm.OnlineElm.Conditional_Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleOutlined"


    // $ANTLR start "entryRuleTranform"
    // InternalOnlineElm.g:3123:1: entryRuleTranform returns [EObject current=null] : iv_ruleTranform= ruleTranform EOF ;
    public final EObject entryRuleTranform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranform = null;


        try {
            // InternalOnlineElm.g:3123:49: (iv_ruleTranform= ruleTranform EOF )
            // InternalOnlineElm.g:3124:2: iv_ruleTranform= ruleTranform EOF
            {
             newCompositeNode(grammarAccess.getTranformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTranform=ruleTranform();

            state._fsp--;

             current =iv_ruleTranform; 
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
    // $ANTLR end "entryRuleTranform"


    // $ANTLR start "ruleTranform"
    // InternalOnlineElm.g:3130:1: ruleTranform returns [EObject current=null] : (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Scale_2= ruleScale | this_ScaleX_3= ruleScaleX | this_ScaleY_4= ruleScaleY ) ;
    public final EObject ruleTranform() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Rotate_1 = null;

        EObject this_Scale_2 = null;

        EObject this_ScaleX_3 = null;

        EObject this_ScaleY_4 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3136:2: ( (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Scale_2= ruleScale | this_ScaleX_3= ruleScaleX | this_ScaleY_4= ruleScaleY ) )
            // InternalOnlineElm.g:3137:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Scale_2= ruleScale | this_ScaleX_3= ruleScaleX | this_ScaleY_4= ruleScaleY )
            {
            // InternalOnlineElm.g:3137:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Scale_2= ruleScale | this_ScaleX_3= ruleScaleX | this_ScaleY_4= ruleScaleY )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt46=1;
                }
                break;
            case 50:
                {
                alt46=2;
                }
                break;
            case 52:
                {
                alt46=3;
                }
                break;
            case 53:
                {
                alt46=4;
                }
                break;
            case 54:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalOnlineElm.g:3138:3: this_Move_0= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getTranformAccess().getMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_0=ruleMove();

                    state._fsp--;


                    			current = this_Move_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3147:3: this_Rotate_1= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getTranformAccess().getRotateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_1=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:3156:3: this_Scale_2= ruleScale
                    {

                    			newCompositeNode(grammarAccess.getTranformAccess().getScaleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scale_2=ruleScale();

                    state._fsp--;


                    			current = this_Scale_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:3165:3: this_ScaleX_3= ruleScaleX
                    {

                    			newCompositeNode(grammarAccess.getTranformAccess().getScaleXParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScaleX_3=ruleScaleX();

                    state._fsp--;


                    			current = this_ScaleX_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:3174:3: this_ScaleY_4= ruleScaleY
                    {

                    			newCompositeNode(grammarAccess.getTranformAccess().getScaleYParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScaleY_4=ruleScaleY();

                    state._fsp--;


                    			current = this_ScaleY_4;
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
    // $ANTLR end "ruleTranform"


    // $ANTLR start "entryRuleMove"
    // InternalOnlineElm.g:3186:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalOnlineElm.g:3186:45: (iv_ruleMove= ruleMove EOF )
            // InternalOnlineElm.g:3187:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalOnlineElm.g:3193:1: ruleMove returns [EObject current=null] : ( ( (lv_name_0_0= 'move' ) ) ( (lv_point_1_0= rulePoint ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_point_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3199:2: ( ( ( (lv_name_0_0= 'move' ) ) ( (lv_point_1_0= rulePoint ) ) ) )
            // InternalOnlineElm.g:3200:2: ( ( (lv_name_0_0= 'move' ) ) ( (lv_point_1_0= rulePoint ) ) )
            {
            // InternalOnlineElm.g:3200:2: ( ( (lv_name_0_0= 'move' ) ) ( (lv_point_1_0= rulePoint ) ) )
            // InternalOnlineElm.g:3201:3: ( (lv_name_0_0= 'move' ) ) ( (lv_point_1_0= rulePoint ) )
            {
            // InternalOnlineElm.g:3201:3: ( (lv_name_0_0= 'move' ) )
            // InternalOnlineElm.g:3202:4: (lv_name_0_0= 'move' )
            {
            // InternalOnlineElm.g:3202:4: (lv_name_0_0= 'move' )
            // InternalOnlineElm.g:3203:5: lv_name_0_0= 'move'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMoveAccess().getNameMoveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "move");
            				

            }


            }

            // InternalOnlineElm.g:3215:3: ( (lv_point_1_0= rulePoint ) )
            // InternalOnlineElm.g:3216:4: (lv_point_1_0= rulePoint )
            {
            // InternalOnlineElm.g:3216:4: (lv_point_1_0= rulePoint )
            // InternalOnlineElm.g:3217:5: lv_point_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getPointPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_point_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_1_0,
            						"org.xtext.online_elm.OnlineElm.Point");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotate"
    // InternalOnlineElm.g:3238:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalOnlineElm.g:3238:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalOnlineElm.g:3239:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalOnlineElm.g:3245:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'degrees' ( (lv_degree_3_0= ruleNum_value ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_degree_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3251:2: ( ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'degrees' ( (lv_degree_3_0= ruleNum_value ) ) otherlv_4= ')' ) )
            // InternalOnlineElm.g:3252:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'degrees' ( (lv_degree_3_0= ruleNum_value ) ) otherlv_4= ')' )
            {
            // InternalOnlineElm.g:3252:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'degrees' ( (lv_degree_3_0= ruleNum_value ) ) otherlv_4= ')' )
            // InternalOnlineElm.g:3253:3: ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'degrees' ( (lv_degree_3_0= ruleNum_value ) ) otherlv_4= ')'
            {
            // InternalOnlineElm.g:3253:3: ( (lv_name_0_0= 'rotate' ) )
            // InternalOnlineElm.g:3254:4: (lv_name_0_0= 'rotate' )
            {
            // InternalOnlineElm.g:3254:4: (lv_name_0_0= 'rotate' )
            // InternalOnlineElm.g:3255:5: lv_name_0_0= 'rotate'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameRotateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotate");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getDegreesKeyword_2());
            		
            // InternalOnlineElm.g:3275:3: ( (lv_degree_3_0= ruleNum_value ) )
            // InternalOnlineElm.g:3276:4: (lv_degree_3_0= ruleNum_value )
            {
            // InternalOnlineElm.g:3276:4: (lv_degree_3_0= ruleNum_value )
            // InternalOnlineElm.g:3277:5: lv_degree_3_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getDegreeNum_valueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_degree_3_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRule());
            					}
            					set(
            						current,
            						"degree",
            						lv_degree_3_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRotateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleScale"
    // InternalOnlineElm.g:3302:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalOnlineElm.g:3302:46: (iv_ruleScale= ruleScale EOF )
            // InternalOnlineElm.g:3303:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalOnlineElm.g:3309:1: ruleScale returns [EObject current=null] : ( ( (lv_name_0_0= 'scale' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_factor_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3315:2: ( ( ( (lv_name_0_0= 'scale' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:3316:2: ( ( (lv_name_0_0= 'scale' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:3316:2: ( ( (lv_name_0_0= 'scale' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:3317:3: ( (lv_name_0_0= 'scale' ) ) ( (lv_factor_1_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:3317:3: ( (lv_name_0_0= 'scale' ) )
            // InternalOnlineElm.g:3318:4: (lv_name_0_0= 'scale' )
            {
            // InternalOnlineElm.g:3318:4: (lv_name_0_0= 'scale' )
            // InternalOnlineElm.g:3319:5: lv_name_0_0= 'scale'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getScaleAccess().getNameScaleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScaleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "scale");
            				

            }


            }

            // InternalOnlineElm.g:3331:3: ( (lv_factor_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:3332:4: (lv_factor_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:3332:4: (lv_factor_1_0= ruleNum_value )
            // InternalOnlineElm.g:3333:5: lv_factor_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getScaleAccess().getFactorNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScaleRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleScaleX"
    // InternalOnlineElm.g:3354:1: entryRuleScaleX returns [EObject current=null] : iv_ruleScaleX= ruleScaleX EOF ;
    public final EObject entryRuleScaleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleX = null;


        try {
            // InternalOnlineElm.g:3354:47: (iv_ruleScaleX= ruleScaleX EOF )
            // InternalOnlineElm.g:3355:2: iv_ruleScaleX= ruleScaleX EOF
            {
             newCompositeNode(grammarAccess.getScaleXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScaleX=ruleScaleX();

            state._fsp--;

             current =iv_ruleScaleX; 
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
    // $ANTLR end "entryRuleScaleX"


    // $ANTLR start "ruleScaleX"
    // InternalOnlineElm.g:3361:1: ruleScaleX returns [EObject current=null] : ( ( (lv_name_0_0= 'scaleX' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) ;
    public final EObject ruleScaleX() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_factor_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3367:2: ( ( ( (lv_name_0_0= 'scaleX' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:3368:2: ( ( (lv_name_0_0= 'scaleX' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:3368:2: ( ( (lv_name_0_0= 'scaleX' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:3369:3: ( (lv_name_0_0= 'scaleX' ) ) ( (lv_factor_1_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:3369:3: ( (lv_name_0_0= 'scaleX' ) )
            // InternalOnlineElm.g:3370:4: (lv_name_0_0= 'scaleX' )
            {
            // InternalOnlineElm.g:3370:4: (lv_name_0_0= 'scaleX' )
            // InternalOnlineElm.g:3371:5: lv_name_0_0= 'scaleX'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getScaleXAccess().getNameScaleXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScaleXRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "scaleX");
            				

            }


            }

            // InternalOnlineElm.g:3383:3: ( (lv_factor_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:3384:4: (lv_factor_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:3384:4: (lv_factor_1_0= ruleNum_value )
            // InternalOnlineElm.g:3385:5: lv_factor_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getScaleXAccess().getFactorNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScaleXRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleScaleX"


    // $ANTLR start "entryRuleScaleY"
    // InternalOnlineElm.g:3406:1: entryRuleScaleY returns [EObject current=null] : iv_ruleScaleY= ruleScaleY EOF ;
    public final EObject entryRuleScaleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaleY = null;


        try {
            // InternalOnlineElm.g:3406:47: (iv_ruleScaleY= ruleScaleY EOF )
            // InternalOnlineElm.g:3407:2: iv_ruleScaleY= ruleScaleY EOF
            {
             newCompositeNode(grammarAccess.getScaleYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScaleY=ruleScaleY();

            state._fsp--;

             current =iv_ruleScaleY; 
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
    // $ANTLR end "entryRuleScaleY"


    // $ANTLR start "ruleScaleY"
    // InternalOnlineElm.g:3413:1: ruleScaleY returns [EObject current=null] : ( ( (lv_name_0_0= 'scaleY' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) ;
    public final EObject ruleScaleY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_factor_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:3419:2: ( ( ( (lv_name_0_0= 'scaleY' ) ) ( (lv_factor_1_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:3420:2: ( ( (lv_name_0_0= 'scaleY' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:3420:2: ( ( (lv_name_0_0= 'scaleY' ) ) ( (lv_factor_1_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:3421:3: ( (lv_name_0_0= 'scaleY' ) ) ( (lv_factor_1_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:3421:3: ( (lv_name_0_0= 'scaleY' ) )
            // InternalOnlineElm.g:3422:4: (lv_name_0_0= 'scaleY' )
            {
            // InternalOnlineElm.g:3422:4: (lv_name_0_0= 'scaleY' )
            // InternalOnlineElm.g:3423:5: lv_name_0_0= 'scaleY'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getScaleYAccess().getNameScaleYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScaleYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "scaleY");
            				

            }


            }

            // InternalOnlineElm.g:3435:3: ( (lv_factor_1_0= ruleNum_value ) )
            // InternalOnlineElm.g:3436:4: (lv_factor_1_0= ruleNum_value )
            {
            // InternalOnlineElm.g:3436:4: (lv_factor_1_0= ruleNum_value )
            // InternalOnlineElm.g:3437:5: lv_factor_1_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getScaleYAccess().getFactorNum_valueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_1_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScaleYRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_1_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleScaleY"


    // $ANTLR start "ruleMATH_OP"
    // InternalOnlineElm.g:3458:1: ruleMATH_OP returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMATH_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:3464:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalOnlineElm.g:3465:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalOnlineElm.g:3465:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt47=1;
                }
                break;
            case 56:
                {
                alt47=2;
                }
                break;
            case 57:
                {
                alt47=3;
                }
                break;
            case 58:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalOnlineElm.g:3466:3: (enumLiteral_0= '+' )
                    {
                    // InternalOnlineElm.g:3466:3: (enumLiteral_0= '+' )
                    // InternalOnlineElm.g:3467:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3474:3: (enumLiteral_1= '-' )
                    {
                    // InternalOnlineElm.g:3474:3: (enumLiteral_1= '-' )
                    // InternalOnlineElm.g:3475:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:3482:3: (enumLiteral_2= '*' )
                    {
                    // InternalOnlineElm.g:3482:3: (enumLiteral_2= '*' )
                    // InternalOnlineElm.g:3483:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:3490:3: (enumLiteral_3= '/' )
                    {
                    // InternalOnlineElm.g:3490:3: (enumLiteral_3= '/' )
                    // InternalOnlineElm.g:3491:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMATH_OPAccess().getDivideEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMATH_OP"


    // $ANTLR start "ruleLineType"
    // InternalOnlineElm.g:3501:1: ruleLineType returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dotted' ) | (enumLiteral_2= 'dashed' ) | (enumLiteral_3= 'dotdash' ) | (enumLiteral_4= 'longdash' ) ) ;
    public final Enumerator ruleLineType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:3507:2: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dotted' ) | (enumLiteral_2= 'dashed' ) | (enumLiteral_3= 'dotdash' ) | (enumLiteral_4= 'longdash' ) ) )
            // InternalOnlineElm.g:3508:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dotted' ) | (enumLiteral_2= 'dashed' ) | (enumLiteral_3= 'dotdash' ) | (enumLiteral_4= 'longdash' ) )
            {
            // InternalOnlineElm.g:3508:2: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dotted' ) | (enumLiteral_2= 'dashed' ) | (enumLiteral_3= 'dotdash' ) | (enumLiteral_4= 'longdash' ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt48=1;
                }
                break;
            case 60:
                {
                alt48=2;
                }
                break;
            case 61:
                {
                alt48=3;
                }
                break;
            case 62:
                {
                alt48=4;
                }
                break;
            case 63:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalOnlineElm.g:3509:3: (enumLiteral_0= 'solid' )
                    {
                    // InternalOnlineElm.g:3509:3: (enumLiteral_0= 'solid' )
                    // InternalOnlineElm.g:3510:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLineTypeAccess().getSolidEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3517:3: (enumLiteral_1= 'dotted' )
                    {
                    // InternalOnlineElm.g:3517:3: (enumLiteral_1= 'dotted' )
                    // InternalOnlineElm.g:3518:4: enumLiteral_1= 'dotted'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDottedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLineTypeAccess().getDottedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:3525:3: (enumLiteral_2= 'dashed' )
                    {
                    // InternalOnlineElm.g:3525:3: (enumLiteral_2= 'dashed' )
                    // InternalOnlineElm.g:3526:4: enumLiteral_2= 'dashed'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDashedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLineTypeAccess().getDashedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:3533:3: (enumLiteral_3= 'dotdash' )
                    {
                    // InternalOnlineElm.g:3533:3: (enumLiteral_3= 'dotdash' )
                    // InternalOnlineElm.g:3534:4: enumLiteral_3= 'dotdash'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getDotdashEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLineTypeAccess().getDotdashEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:3541:3: (enumLiteral_4= 'longdash' )
                    {
                    // InternalOnlineElm.g:3541:3: (enumLiteral_4= 'longdash' )
                    // InternalOnlineElm.g:3542:4: enumLiteral_4= 'longdash'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLineTypeAccess().getLongdashEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLineTypeAccess().getLongdashEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleLineType"


    // $ANTLR start "ruleColor"
    // InternalOnlineElm.g:3552:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blank' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'brown' ) | (enumLiteral_4= 'charcoal' ) | (enumLiteral_5= 'darkBlue' ) | (enumLiteral_6= 'darkBrown' ) | (enumLiteral_7= 'darkGray' ) | (enumLiteral_8= 'darkGreen' ) | (enumLiteral_9= 'darkGrey' ) | (enumLiteral_10= 'darkOrange' ) | (enumLiteral_11= 'darkPurple' ) | (enumLiteral_12= 'darkRed' ) | (enumLiteral_13= 'darkYellow' ) | (enumLiteral_14= 'gray' ) | (enumLiteral_15= 'green' ) | (enumLiteral_16= 'grey' ) | (enumLiteral_17= 'hotPink' ) | (enumLiteral_18= 'lightBlue' ) | (enumLiteral_19= 'lightBrown' ) | (enumLiteral_20= 'lightCharcoal' ) | (enumLiteral_21= 'lightGray' ) | (enumLiteral_22= 'lightGreen' ) | (enumLiteral_23= 'lightGrey' ) | (enumLiteral_24= 'lightOrange' ) | (enumLiteral_25= 'lightPurple' ) | (enumLiteral_26= 'lightRed' ) | (enumLiteral_27= 'lightYellow' ) | (enumLiteral_28= 'orange' ) | (enumLiteral_29= 'pink' ) | (enumLiteral_30= 'purple' ) | (enumLiteral_31= 'red' ) | (enumLiteral_32= 'white' ) | (enumLiteral_33= 'yellow' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
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
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:3558:2: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blank' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'brown' ) | (enumLiteral_4= 'charcoal' ) | (enumLiteral_5= 'darkBlue' ) | (enumLiteral_6= 'darkBrown' ) | (enumLiteral_7= 'darkGray' ) | (enumLiteral_8= 'darkGreen' ) | (enumLiteral_9= 'darkGrey' ) | (enumLiteral_10= 'darkOrange' ) | (enumLiteral_11= 'darkPurple' ) | (enumLiteral_12= 'darkRed' ) | (enumLiteral_13= 'darkYellow' ) | (enumLiteral_14= 'gray' ) | (enumLiteral_15= 'green' ) | (enumLiteral_16= 'grey' ) | (enumLiteral_17= 'hotPink' ) | (enumLiteral_18= 'lightBlue' ) | (enumLiteral_19= 'lightBrown' ) | (enumLiteral_20= 'lightCharcoal' ) | (enumLiteral_21= 'lightGray' ) | (enumLiteral_22= 'lightGreen' ) | (enumLiteral_23= 'lightGrey' ) | (enumLiteral_24= 'lightOrange' ) | (enumLiteral_25= 'lightPurple' ) | (enumLiteral_26= 'lightRed' ) | (enumLiteral_27= 'lightYellow' ) | (enumLiteral_28= 'orange' ) | (enumLiteral_29= 'pink' ) | (enumLiteral_30= 'purple' ) | (enumLiteral_31= 'red' ) | (enumLiteral_32= 'white' ) | (enumLiteral_33= 'yellow' ) ) )
            // InternalOnlineElm.g:3559:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blank' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'brown' ) | (enumLiteral_4= 'charcoal' ) | (enumLiteral_5= 'darkBlue' ) | (enumLiteral_6= 'darkBrown' ) | (enumLiteral_7= 'darkGray' ) | (enumLiteral_8= 'darkGreen' ) | (enumLiteral_9= 'darkGrey' ) | (enumLiteral_10= 'darkOrange' ) | (enumLiteral_11= 'darkPurple' ) | (enumLiteral_12= 'darkRed' ) | (enumLiteral_13= 'darkYellow' ) | (enumLiteral_14= 'gray' ) | (enumLiteral_15= 'green' ) | (enumLiteral_16= 'grey' ) | (enumLiteral_17= 'hotPink' ) | (enumLiteral_18= 'lightBlue' ) | (enumLiteral_19= 'lightBrown' ) | (enumLiteral_20= 'lightCharcoal' ) | (enumLiteral_21= 'lightGray' ) | (enumLiteral_22= 'lightGreen' ) | (enumLiteral_23= 'lightGrey' ) | (enumLiteral_24= 'lightOrange' ) | (enumLiteral_25= 'lightPurple' ) | (enumLiteral_26= 'lightRed' ) | (enumLiteral_27= 'lightYellow' ) | (enumLiteral_28= 'orange' ) | (enumLiteral_29= 'pink' ) | (enumLiteral_30= 'purple' ) | (enumLiteral_31= 'red' ) | (enumLiteral_32= 'white' ) | (enumLiteral_33= 'yellow' ) )
            {
            // InternalOnlineElm.g:3559:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'blank' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'brown' ) | (enumLiteral_4= 'charcoal' ) | (enumLiteral_5= 'darkBlue' ) | (enumLiteral_6= 'darkBrown' ) | (enumLiteral_7= 'darkGray' ) | (enumLiteral_8= 'darkGreen' ) | (enumLiteral_9= 'darkGrey' ) | (enumLiteral_10= 'darkOrange' ) | (enumLiteral_11= 'darkPurple' ) | (enumLiteral_12= 'darkRed' ) | (enumLiteral_13= 'darkYellow' ) | (enumLiteral_14= 'gray' ) | (enumLiteral_15= 'green' ) | (enumLiteral_16= 'grey' ) | (enumLiteral_17= 'hotPink' ) | (enumLiteral_18= 'lightBlue' ) | (enumLiteral_19= 'lightBrown' ) | (enumLiteral_20= 'lightCharcoal' ) | (enumLiteral_21= 'lightGray' ) | (enumLiteral_22= 'lightGreen' ) | (enumLiteral_23= 'lightGrey' ) | (enumLiteral_24= 'lightOrange' ) | (enumLiteral_25= 'lightPurple' ) | (enumLiteral_26= 'lightRed' ) | (enumLiteral_27= 'lightYellow' ) | (enumLiteral_28= 'orange' ) | (enumLiteral_29= 'pink' ) | (enumLiteral_30= 'purple' ) | (enumLiteral_31= 'red' ) | (enumLiteral_32= 'white' ) | (enumLiteral_33= 'yellow' ) )
            int alt49=34;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt49=1;
                }
                break;
            case 65:
                {
                alt49=2;
                }
                break;
            case 66:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            case 68:
                {
                alt49=5;
                }
                break;
            case 69:
                {
                alt49=6;
                }
                break;
            case 70:
                {
                alt49=7;
                }
                break;
            case 71:
                {
                alt49=8;
                }
                break;
            case 72:
                {
                alt49=9;
                }
                break;
            case 73:
                {
                alt49=10;
                }
                break;
            case 74:
                {
                alt49=11;
                }
                break;
            case 75:
                {
                alt49=12;
                }
                break;
            case 76:
                {
                alt49=13;
                }
                break;
            case 77:
                {
                alt49=14;
                }
                break;
            case 78:
                {
                alt49=15;
                }
                break;
            case 79:
                {
                alt49=16;
                }
                break;
            case 80:
                {
                alt49=17;
                }
                break;
            case 81:
                {
                alt49=18;
                }
                break;
            case 82:
                {
                alt49=19;
                }
                break;
            case 83:
                {
                alt49=20;
                }
                break;
            case 84:
                {
                alt49=21;
                }
                break;
            case 85:
                {
                alt49=22;
                }
                break;
            case 86:
                {
                alt49=23;
                }
                break;
            case 87:
                {
                alt49=24;
                }
                break;
            case 88:
                {
                alt49=25;
                }
                break;
            case 89:
                {
                alt49=26;
                }
                break;
            case 90:
                {
                alt49=27;
                }
                break;
            case 91:
                {
                alt49=28;
                }
                break;
            case 92:
                {
                alt49=29;
                }
                break;
            case 93:
                {
                alt49=30;
                }
                break;
            case 94:
                {
                alt49=31;
                }
                break;
            case 95:
                {
                alt49=32;
                }
                break;
            case 96:
                {
                alt49=33;
                }
                break;
            case 97:
                {
                alt49=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalOnlineElm.g:3560:3: (enumLiteral_0= 'black' )
                    {
                    // InternalOnlineElm.g:3560:3: (enumLiteral_0= 'black' )
                    // InternalOnlineElm.g:3561:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:3568:3: (enumLiteral_1= 'blank' )
                    {
                    // InternalOnlineElm.g:3568:3: (enumLiteral_1= 'blank' )
                    // InternalOnlineElm.g:3569:4: enumLiteral_1= 'blank'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlankEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlankEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:3576:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalOnlineElm.g:3576:3: (enumLiteral_2= 'blue' )
                    // InternalOnlineElm.g:3577:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:3584:3: (enumLiteral_3= 'brown' )
                    {
                    // InternalOnlineElm.g:3584:3: (enumLiteral_3= 'brown' )
                    // InternalOnlineElm.g:3585:4: enumLiteral_3= 'brown'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:3592:3: (enumLiteral_4= 'charcoal' )
                    {
                    // InternalOnlineElm.g:3592:3: (enumLiteral_4= 'charcoal' )
                    // InternalOnlineElm.g:3593:4: enumLiteral_4= 'charcoal'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCharcoalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCharcoalEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOnlineElm.g:3600:3: (enumLiteral_5= 'darkBlue' )
                    {
                    // InternalOnlineElm.g:3600:3: (enumLiteral_5= 'darkBlue' )
                    // InternalOnlineElm.g:3601:4: enumLiteral_5= 'darkBlue'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkBlueEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getDarkBlueEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOnlineElm.g:3608:3: (enumLiteral_6= 'darkBrown' )
                    {
                    // InternalOnlineElm.g:3608:3: (enumLiteral_6= 'darkBrown' )
                    // InternalOnlineElm.g:3609:4: enumLiteral_6= 'darkBrown'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkBrownEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getDarkBrownEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOnlineElm.g:3616:3: (enumLiteral_7= 'darkGray' )
                    {
                    // InternalOnlineElm.g:3616:3: (enumLiteral_7= 'darkGray' )
                    // InternalOnlineElm.g:3617:4: enumLiteral_7= 'darkGray'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkGrayEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getDarkGrayEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOnlineElm.g:3624:3: (enumLiteral_8= 'darkGreen' )
                    {
                    // InternalOnlineElm.g:3624:3: (enumLiteral_8= 'darkGreen' )
                    // InternalOnlineElm.g:3625:4: enumLiteral_8= 'darkGreen'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkGreenEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getDarkGreenEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOnlineElm.g:3632:3: (enumLiteral_9= 'darkGrey' )
                    {
                    // InternalOnlineElm.g:3632:3: (enumLiteral_9= 'darkGrey' )
                    // InternalOnlineElm.g:3633:4: enumLiteral_9= 'darkGrey'
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOnlineElm.g:3640:3: (enumLiteral_10= 'darkOrange' )
                    {
                    // InternalOnlineElm.g:3640:3: (enumLiteral_10= 'darkOrange' )
                    // InternalOnlineElm.g:3641:4: enumLiteral_10= 'darkOrange'
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkOrangeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getDarkOrangeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOnlineElm.g:3648:3: (enumLiteral_11= 'darkPurple' )
                    {
                    // InternalOnlineElm.g:3648:3: (enumLiteral_11= 'darkPurple' )
                    // InternalOnlineElm.g:3649:4: enumLiteral_11= 'darkPurple'
                    {
                    enumLiteral_11=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkPurpleEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getDarkPurpleEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOnlineElm.g:3656:3: (enumLiteral_12= 'darkRed' )
                    {
                    // InternalOnlineElm.g:3656:3: (enumLiteral_12= 'darkRed' )
                    // InternalOnlineElm.g:3657:4: enumLiteral_12= 'darkRed'
                    {
                    enumLiteral_12=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkRedEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getDarkRedEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOnlineElm.g:3664:3: (enumLiteral_13= 'darkYellow' )
                    {
                    // InternalOnlineElm.g:3664:3: (enumLiteral_13= 'darkYellow' )
                    // InternalOnlineElm.g:3665:4: enumLiteral_13= 'darkYellow'
                    {
                    enumLiteral_13=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkYellowEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getDarkYellowEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOnlineElm.g:3672:3: (enumLiteral_14= 'gray' )
                    {
                    // InternalOnlineElm.g:3672:3: (enumLiteral_14= 'gray' )
                    // InternalOnlineElm.g:3673:4: enumLiteral_14= 'gray'
                    {
                    enumLiteral_14=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOnlineElm.g:3680:3: (enumLiteral_15= 'green' )
                    {
                    // InternalOnlineElm.g:3680:3: (enumLiteral_15= 'green' )
                    // InternalOnlineElm.g:3681:4: enumLiteral_15= 'green'
                    {
                    enumLiteral_15=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalOnlineElm.g:3688:3: (enumLiteral_16= 'grey' )
                    {
                    // InternalOnlineElm.g:3688:3: (enumLiteral_16= 'grey' )
                    // InternalOnlineElm.g:3689:4: enumLiteral_16= 'grey'
                    {
                    enumLiteral_16=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalOnlineElm.g:3696:3: (enumLiteral_17= 'hotPink' )
                    {
                    // InternalOnlineElm.g:3696:3: (enumLiteral_17= 'hotPink' )
                    // InternalOnlineElm.g:3697:4: enumLiteral_17= 'hotPink'
                    {
                    enumLiteral_17=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getHotPinkEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getColorAccess().getHotPinkEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalOnlineElm.g:3704:3: (enumLiteral_18= 'lightBlue' )
                    {
                    // InternalOnlineElm.g:3704:3: (enumLiteral_18= 'lightBlue' )
                    // InternalOnlineElm.g:3705:4: enumLiteral_18= 'lightBlue'
                    {
                    enumLiteral_18=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalOnlineElm.g:3712:3: (enumLiteral_19= 'lightBrown' )
                    {
                    // InternalOnlineElm.g:3712:3: (enumLiteral_19= 'lightBrown' )
                    // InternalOnlineElm.g:3713:4: enumLiteral_19= 'lightBrown'
                    {
                    enumLiteral_19=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightBrownEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getColorAccess().getLightBrownEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalOnlineElm.g:3720:3: (enumLiteral_20= 'lightCharcoal' )
                    {
                    // InternalOnlineElm.g:3720:3: (enumLiteral_20= 'lightCharcoal' )
                    // InternalOnlineElm.g:3721:4: enumLiteral_20= 'lightCharcoal'
                    {
                    enumLiteral_20=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightCharcoalEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getColorAccess().getLightCharcoalEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalOnlineElm.g:3728:3: (enumLiteral_21= 'lightGray' )
                    {
                    // InternalOnlineElm.g:3728:3: (enumLiteral_21= 'lightGray' )
                    // InternalOnlineElm.g:3729:4: enumLiteral_21= 'lightGray'
                    {
                    enumLiteral_21=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalOnlineElm.g:3736:3: (enumLiteral_22= 'lightGreen' )
                    {
                    // InternalOnlineElm.g:3736:3: (enumLiteral_22= 'lightGreen' )
                    // InternalOnlineElm.g:3737:4: enumLiteral_22= 'lightGreen'
                    {
                    enumLiteral_22=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalOnlineElm.g:3744:3: (enumLiteral_23= 'lightGrey' )
                    {
                    // InternalOnlineElm.g:3744:3: (enumLiteral_23= 'lightGrey' )
                    // InternalOnlineElm.g:3745:4: enumLiteral_23= 'lightGrey'
                    {
                    enumLiteral_23=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalOnlineElm.g:3752:3: (enumLiteral_24= 'lightOrange' )
                    {
                    // InternalOnlineElm.g:3752:3: (enumLiteral_24= 'lightOrange' )
                    // InternalOnlineElm.g:3753:4: enumLiteral_24= 'lightOrange'
                    {
                    enumLiteral_24=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightOrangeEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getColorAccess().getLightOrangeEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalOnlineElm.g:3760:3: (enumLiteral_25= 'lightPurple' )
                    {
                    // InternalOnlineElm.g:3760:3: (enumLiteral_25= 'lightPurple' )
                    // InternalOnlineElm.g:3761:4: enumLiteral_25= 'lightPurple'
                    {
                    enumLiteral_25=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalOnlineElm.g:3768:3: (enumLiteral_26= 'lightRed' )
                    {
                    // InternalOnlineElm.g:3768:3: (enumLiteral_26= 'lightRed' )
                    // InternalOnlineElm.g:3769:4: enumLiteral_26= 'lightRed'
                    {
                    enumLiteral_26=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalOnlineElm.g:3776:3: (enumLiteral_27= 'lightYellow' )
                    {
                    // InternalOnlineElm.g:3776:3: (enumLiteral_27= 'lightYellow' )
                    // InternalOnlineElm.g:3777:4: enumLiteral_27= 'lightYellow'
                    {
                    enumLiteral_27=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalOnlineElm.g:3784:3: (enumLiteral_28= 'orange' )
                    {
                    // InternalOnlineElm.g:3784:3: (enumLiteral_28= 'orange' )
                    // InternalOnlineElm.g:3785:4: enumLiteral_28= 'orange'
                    {
                    enumLiteral_28=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalOnlineElm.g:3792:3: (enumLiteral_29= 'pink' )
                    {
                    // InternalOnlineElm.g:3792:3: (enumLiteral_29= 'pink' )
                    // InternalOnlineElm.g:3793:4: enumLiteral_29= 'pink'
                    {
                    enumLiteral_29=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalOnlineElm.g:3800:3: (enumLiteral_30= 'purple' )
                    {
                    // InternalOnlineElm.g:3800:3: (enumLiteral_30= 'purple' )
                    // InternalOnlineElm.g:3801:4: enumLiteral_30= 'purple'
                    {
                    enumLiteral_30=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalOnlineElm.g:3808:3: (enumLiteral_31= 'red' )
                    {
                    // InternalOnlineElm.g:3808:3: (enumLiteral_31= 'red' )
                    // InternalOnlineElm.g:3809:4: enumLiteral_31= 'red'
                    {
                    enumLiteral_31=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalOnlineElm.g:3816:3: (enumLiteral_32= 'white' )
                    {
                    // InternalOnlineElm.g:3816:3: (enumLiteral_32= 'white' )
                    // InternalOnlineElm.g:3817:4: enumLiteral_32= 'white'
                    {
                    enumLiteral_32=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalOnlineElm.g:3824:3: (enumLiteral_33= 'yellow' )
                    {
                    // InternalOnlineElm.g:3824:3: (enumLiteral_33= 'yellow' )
                    // InternalOnlineElm.g:3825:4: enumLiteral_33= 'yellow'
                    {
                    enumLiteral_33=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_33());
                    			

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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003FE000800010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004008150L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00003FE000800020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00003FE000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000044008150L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0076000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFFFFFFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});

}