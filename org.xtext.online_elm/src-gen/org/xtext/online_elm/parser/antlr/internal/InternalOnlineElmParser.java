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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'myShapes'", "'='", "'['", "','", "']'", "'++'", "'|>'", "'if'", "'then'", "'else'", "'not'", "'('", "')'", "'circle'", "'rect'", "'text'", "'filled'", "'move'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'black'", "'red'", "'blue'"
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



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalOnlineElm.g:67:2: (iv_ruleOnlineElm= ruleOnlineElm EOF )
            // InternalOnlineElm.g:68:2: iv_ruleOnlineElm= ruleOnlineElm EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOnlineElm"


    // $ANTLR start "ruleOnlineElm"
    // InternalOnlineElm.g:77:1: ruleOnlineElm returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleOnlineElm() throws RecognitionException {
        EObject current = null;

        EObject lv_entry_1_0 = null;

        EObject lv_shapes_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalOnlineElm.g:84:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalOnlineElm.g:85:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalOnlineElm.g:85:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) ) )
            // InternalOnlineElm.g:86:3: ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) )
            {
            // InternalOnlineElm.g:86:3: ( ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?) )
            // InternalOnlineElm.g:87:4: ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            			
            // InternalOnlineElm.g:90:4: ( ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?)
            // InternalOnlineElm.g:91:5: ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+ {...}?
            {
            // InternalOnlineElm.g:91:5: ( ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOnlineElm.g:92:3: ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) )
            	    {
            	    // InternalOnlineElm.g:92:3: ({...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) ) )
            	    // InternalOnlineElm.g:93:4: {...}? => ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOnlineElm", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOnlineElm.g:93:103: ( ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) ) )
            	    // InternalOnlineElm.g:94:5: ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOnlineElm.g:97:8: ({...}? => ( (lv_entry_1_0= ruleMainShape ) ) )
            	    // InternalOnlineElm.g:97:9: {...}? => ( (lv_entry_1_0= ruleMainShape ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOnlineElm", "true");
            	    }
            	    // InternalOnlineElm.g:97:18: ( (lv_entry_1_0= ruleMainShape ) )
            	    // InternalOnlineElm.g:97:19: (lv_entry_1_0= ruleMainShape )
            	    {
            	    // InternalOnlineElm.g:97:19: (lv_entry_1_0= ruleMainShape )
            	    // InternalOnlineElm.g:98:9: lv_entry_1_0= ruleMainShape
            	    {

            	    									newCompositeNode(grammarAccess.getOnlineElmAccess().getEntryMainShapeParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_entry_1_0=ruleMainShape();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getOnlineElmRule());
            	    									}
            	    									set(
            	    										current,
            	    										"entry",
            	    										lv_entry_1_0,
            	    										"org.xtext.online_elm.OnlineElm.MainShape");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOnlineElm.g:120:3: ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) )
            	    {
            	    // InternalOnlineElm.g:120:3: ({...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ ) )
            	    // InternalOnlineElm.g:121:4: {...}? => ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOnlineElm", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOnlineElm.g:121:103: ( ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+ )
            	    // InternalOnlineElm.g:122:5: ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOnlineElm.g:125:8: ({...}? => ( (lv_shapes_2_0= ruleShapeDef ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalOnlineElm.g:125:9: {...}? => ( (lv_shapes_2_0= ruleShapeDef ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleOnlineElm", "true");
            	    	    }
            	    	    // InternalOnlineElm.g:125:18: ( (lv_shapes_2_0= ruleShapeDef ) )
            	    	    // InternalOnlineElm.g:125:19: (lv_shapes_2_0= ruleShapeDef )
            	    	    {
            	    	    // InternalOnlineElm.g:125:19: (lv_shapes_2_0= ruleShapeDef )
            	    	    // InternalOnlineElm.g:126:9: lv_shapes_2_0= ruleShapeDef
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getOnlineElmAccess().getShapesShapeDefParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_shapes_2_0=ruleShapeDef();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getOnlineElmRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"shapes",
            	    	    										lv_shapes_2_0,
            	    	    										"org.xtext.online_elm.OnlineElm.ShapeDef");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOnlineElmAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleOnlineElm", "getUnorderedGroupHelper().canLeave(grammarAccess.getOnlineElmAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getOnlineElmAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleOnlineElm"


    // $ANTLR start "entryRuleMainShape"
    // InternalOnlineElm.g:162:1: entryRuleMainShape returns [EObject current=null] : iv_ruleMainShape= ruleMainShape EOF ;
    public final EObject entryRuleMainShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainShape = null;


        try {
            // InternalOnlineElm.g:162:50: (iv_ruleMainShape= ruleMainShape EOF )
            // InternalOnlineElm.g:163:2: iv_ruleMainShape= ruleMainShape EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleMainShape"


    // $ANTLR start "ruleMainShape"
    // InternalOnlineElm.g:169:1: ruleMainShape returns [EObject current=null] : ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* ) ;
    public final EObject ruleMainShape() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_s1_3_0 = null;

        EObject lv_s2_6_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:175:2: ( ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* ) )
            // InternalOnlineElm.g:176:2: ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* )
            {
            // InternalOnlineElm.g:176:2: ( ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* )
            // InternalOnlineElm.g:177:3: ( (lv_name_0_0= 'myShapes' ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )*
            {
            // InternalOnlineElm.g:177:3: ( (lv_name_0_0= 'myShapes' ) )
            // InternalOnlineElm.g:178:4: (lv_name_0_0= 'myShapes' )
            {
            // InternalOnlineElm.g:178:4: (lv_name_0_0= 'myShapes' )
            // InternalOnlineElm.g:179:5: lv_name_0_0= 'myShapes'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMainShapeAccess().getNameMyShapesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainShapeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "myShapes");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMainShapeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMainShapeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalOnlineElm.g:199:3: ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19||(LA3_0>=25 && LA3_0<=27)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOnlineElm.g:200:4: ( (lv_s1_3_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:200:4: ( (lv_s1_3_0= ruleShape ) )
                    // InternalOnlineElm.g:201:5: (lv_s1_3_0= ruleShape )
                    {
                    // InternalOnlineElm.g:201:5: (lv_s1_3_0= ruleShape )
                    // InternalOnlineElm.g:202:6: lv_s1_3_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getMainShapeAccess().getS1ShapeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_s1_3_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainShapeRule());
                    						}
                    						set(
                    							current,
                    							"s1",
                    							lv_s1_3_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:220:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalOnlineElm.g:220:4: ( (otherlv_4= RULE_ID ) )
                    // InternalOnlineElm.g:221:5: (otherlv_4= RULE_ID )
                    {
                    // InternalOnlineElm.g:221:5: (otherlv_4= RULE_ID )
                    // InternalOnlineElm.g:222:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainShapeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getMainShapeAccess().getS11BasicShapeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:234:3: ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_ID) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOnlineElm.g:235:4: (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) )
            	    {
            	    // InternalOnlineElm.g:235:4: (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) )
            	    // InternalOnlineElm.g:236:5: otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMainShapeAccess().getCommaKeyword_4_0_0());
            	    				
            	    // InternalOnlineElm.g:240:5: ( (lv_s2_6_0= ruleShape ) )
            	    // InternalOnlineElm.g:241:6: (lv_s2_6_0= ruleShape )
            	    {
            	    // InternalOnlineElm.g:241:6: (lv_s2_6_0= ruleShape )
            	    // InternalOnlineElm.g:242:7: lv_s2_6_0= ruleShape
            	    {

            	    							newCompositeNode(grammarAccess.getMainShapeAccess().getS2ShapeParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_s2_6_0=ruleShape();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMainShapeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"s2",
            	    								lv_s2_6_0,
            	    								"org.xtext.online_elm.OnlineElm.Shape");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOnlineElm.g:261:4: ( (otherlv_7= RULE_ID ) )
            	    {
            	    // InternalOnlineElm.g:261:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalOnlineElm.g:262:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalOnlineElm.g:262:5: (otherlv_7= RULE_ID )
            	    // InternalOnlineElm.g:263:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMainShapeRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_7, grammarAccess.getMainShapeAccess().getS22BasicShapeCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMainShapeAccess().getRightSquareBracketKeyword_5());
            		
            // InternalOnlineElm.g:279:3: (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOnlineElm.g:280:4: otherlv_9= '++' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_6_0());
            	    			
            	    // InternalOnlineElm.g:284:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalOnlineElm.g:285:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalOnlineElm.g:285:5: (otherlv_10= RULE_ID )
            	    // InternalOnlineElm.g:286:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMainShapeRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_10, grammarAccess.getMainShapeAccess().getSgShapeGroupCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleMainShape"


    // $ANTLR start "entryRuleShapeDef"
    // InternalOnlineElm.g:302:1: entryRuleShapeDef returns [EObject current=null] : iv_ruleShapeDef= ruleShapeDef EOF ;
    public final EObject entryRuleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDef = null;


        try {
            // InternalOnlineElm.g:302:49: (iv_ruleShapeDef= ruleShapeDef EOF )
            // InternalOnlineElm.g:303:2: iv_ruleShapeDef= ruleShapeDef EOF
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
    // InternalOnlineElm.g:309:1: ruleShapeDef returns [EObject current=null] : (this_ShapeGroup_0= ruleShapeGroup | this_BasicShape_1= ruleBasicShape ) ;
    public final EObject ruleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeGroup_0 = null;

        EObject this_BasicShape_1 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:315:2: ( (this_ShapeGroup_0= ruleShapeGroup | this_BasicShape_1= ruleBasicShape ) )
            // InternalOnlineElm.g:316:2: (this_ShapeGroup_0= ruleShapeGroup | this_BasicShape_1= ruleBasicShape )
            {
            // InternalOnlineElm.g:316:2: (this_ShapeGroup_0= ruleShapeGroup | this_BasicShape_1= ruleBasicShape )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==13) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==14) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==19||(LA6_2>=25 && LA6_2<=27)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOnlineElm.g:317:3: this_ShapeGroup_0= ruleShapeGroup
                    {

                    			newCompositeNode(grammarAccess.getShapeDefAccess().getShapeGroupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeGroup_0=ruleShapeGroup();

                    state._fsp--;


                    			current = this_ShapeGroup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:326:3: this_BasicShape_1= ruleBasicShape
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


    // $ANTLR start "entryRuleShapeGroup"
    // InternalOnlineElm.g:338:1: entryRuleShapeGroup returns [EObject current=null] : iv_ruleShapeGroup= ruleShapeGroup EOF ;
    public final EObject entryRuleShapeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeGroup = null;


        try {
            // InternalOnlineElm.g:338:51: (iv_ruleShapeGroup= ruleShapeGroup EOF )
            // InternalOnlineElm.g:339:2: iv_ruleShapeGroup= ruleShapeGroup EOF
            {
             newCompositeNode(grammarAccess.getShapeGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeGroup=ruleShapeGroup();

            state._fsp--;

             current =iv_ruleShapeGroup; 
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
    // $ANTLR end "entryRuleShapeGroup"


    // $ANTLR start "ruleShapeGroup"
    // InternalOnlineElm.g:345:1: ruleShapeGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* ) ;
    public final EObject ruleShapeGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_s1_3_0 = null;

        EObject lv_s2_6_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:351:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* ) )
            // InternalOnlineElm.g:352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* )
            {
            // InternalOnlineElm.g:352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )* )
            // InternalOnlineElm.g:353:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )*
            {
            // InternalOnlineElm.g:353:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOnlineElm.g:354:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOnlineElm.g:354:4: (lv_name_0_0= RULE_ID )
            // InternalOnlineElm.g:355:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getShapeGroupAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeGroupAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeGroupAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalOnlineElm.g:379:3: ( ( (lv_s1_3_0= ruleShape ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19||(LA7_0>=25 && LA7_0<=27)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOnlineElm.g:380:4: ( (lv_s1_3_0= ruleShape ) )
                    {
                    // InternalOnlineElm.g:380:4: ( (lv_s1_3_0= ruleShape ) )
                    // InternalOnlineElm.g:381:5: (lv_s1_3_0= ruleShape )
                    {
                    // InternalOnlineElm.g:381:5: (lv_s1_3_0= ruleShape )
                    // InternalOnlineElm.g:382:6: lv_s1_3_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getShapeGroupAccess().getS1ShapeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_s1_3_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeGroupRule());
                    						}
                    						set(
                    							current,
                    							"s1",
                    							lv_s1_3_0,
                    							"org.xtext.online_elm.OnlineElm.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:400:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalOnlineElm.g:400:4: ( (otherlv_4= RULE_ID ) )
                    // InternalOnlineElm.g:401:5: (otherlv_4= RULE_ID )
                    {
                    // InternalOnlineElm.g:401:5: (otherlv_4= RULE_ID )
                    // InternalOnlineElm.g:402:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShapeGroupRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getShapeGroupAccess().getS11BasicShapeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOnlineElm.g:414:3: ( (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) ) | ( (otherlv_7= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }
                else if ( (LA8_0==RULE_ID) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOnlineElm.g:415:4: (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) )
            	    {
            	    // InternalOnlineElm.g:415:4: (otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) ) )
            	    // InternalOnlineElm.g:416:5: otherlv_5= ',' ( (lv_s2_6_0= ruleShape ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getShapeGroupAccess().getCommaKeyword_4_0_0());
            	    				
            	    // InternalOnlineElm.g:420:5: ( (lv_s2_6_0= ruleShape ) )
            	    // InternalOnlineElm.g:421:6: (lv_s2_6_0= ruleShape )
            	    {
            	    // InternalOnlineElm.g:421:6: (lv_s2_6_0= ruleShape )
            	    // InternalOnlineElm.g:422:7: lv_s2_6_0= ruleShape
            	    {

            	    							newCompositeNode(grammarAccess.getShapeGroupAccess().getS2ShapeParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_s2_6_0=ruleShape();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getShapeGroupRule());
            	    							}
            	    							add(
            	    								current,
            	    								"s2",
            	    								lv_s2_6_0,
            	    								"org.xtext.online_elm.OnlineElm.Shape");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOnlineElm.g:441:4: ( (otherlv_7= RULE_ID ) )
            	    {
            	    // InternalOnlineElm.g:441:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalOnlineElm.g:442:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalOnlineElm.g:442:5: (otherlv_7= RULE_ID )
            	    // InternalOnlineElm.g:443:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getShapeGroupRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_7, grammarAccess.getShapeGroupAccess().getS22BasicShapeCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getShapeGroupAccess().getRightSquareBracketKeyword_5());
            		
            // InternalOnlineElm.g:459:3: (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOnlineElm.g:460:4: otherlv_9= '++' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getShapeGroupAccess().getPlusSignPlusSignKeyword_6_0());
            	    			
            	    // InternalOnlineElm.g:464:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalOnlineElm.g:465:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalOnlineElm.g:465:5: (otherlv_10= RULE_ID )
            	    // InternalOnlineElm.g:466:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getShapeGroupRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_10, grammarAccess.getShapeGroupAccess().getSgShapeGroupCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleShapeGroup"


    // $ANTLR start "entryRuleBasicShape"
    // InternalOnlineElm.g:482:1: entryRuleBasicShape returns [EObject current=null] : iv_ruleBasicShape= ruleBasicShape EOF ;
    public final EObject entryRuleBasicShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicShape = null;


        try {
            // InternalOnlineElm.g:482:51: (iv_ruleBasicShape= ruleBasicShape EOF )
            // InternalOnlineElm.g:483:2: iv_ruleBasicShape= ruleBasicShape EOF
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
    // InternalOnlineElm.g:489:1: ruleBasicShape returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_shape_2_0= ruleShape ) ) ) ;
    public final EObject ruleBasicShape() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_shape_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:495:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_shape_2_0= ruleShape ) ) ) )
            // InternalOnlineElm.g:496:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_shape_2_0= ruleShape ) ) )
            {
            // InternalOnlineElm.g:496:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_shape_2_0= ruleShape ) ) )
            // InternalOnlineElm.g:497:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_shape_2_0= ruleShape ) )
            {
            // InternalOnlineElm.g:497:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOnlineElm.g:498:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOnlineElm.g:498:4: (lv_name_0_0= RULE_ID )
            // InternalOnlineElm.g:499:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBasicShapeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicShapeAccess().getEqualsSignKeyword_1());
            		
            // InternalOnlineElm.g:519:3: ( (lv_shape_2_0= ruleShape ) )
            // InternalOnlineElm.g:520:4: (lv_shape_2_0= ruleShape )
            {
            // InternalOnlineElm.g:520:4: (lv_shape_2_0= ruleShape )
            // InternalOnlineElm.g:521:5: lv_shape_2_0= ruleShape
            {

            					newCompositeNode(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_shape_2_0=ruleShape();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicShapeRule());
            					}
            					set(
            						current,
            						"shape",
            						lv_shape_2_0,
            						"org.xtext.online_elm.OnlineElm.Shape");
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
    // $ANTLR end "ruleBasicShape"


    // $ANTLR start "entryRuleShape"
    // InternalOnlineElm.g:542:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalOnlineElm.g:542:46: (iv_ruleShape= ruleShape EOF )
            // InternalOnlineElm.g:543:2: iv_ruleShape= ruleShape EOF
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
    // InternalOnlineElm.g:549:1: ruleShape returns [EObject current=null] : ( ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) | this_Conditional_3= ruleConditional ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stencil_0_0 = null;

        EObject lv_draw_2_0 = null;

        EObject this_Conditional_3 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:555:2: ( ( ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) | this_Conditional_3= ruleConditional ) )
            // InternalOnlineElm.g:556:2: ( ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) | this_Conditional_3= ruleConditional )
            {
            // InternalOnlineElm.g:556:2: ( ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) ) | this_Conditional_3= ruleConditional )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=25 && LA10_0<=27)) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOnlineElm.g:557:3: ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) )
                    {
                    // InternalOnlineElm.g:557:3: ( ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) ) )
                    // InternalOnlineElm.g:558:4: ( (lv_stencil_0_0= ruleStencil ) ) otherlv_1= '|>' ( (lv_draw_2_0= ruleDraw ) )
                    {
                    // InternalOnlineElm.g:558:4: ( (lv_stencil_0_0= ruleStencil ) )
                    // InternalOnlineElm.g:559:5: (lv_stencil_0_0= ruleStencil )
                    {
                    // InternalOnlineElm.g:559:5: (lv_stencil_0_0= ruleStencil )
                    // InternalOnlineElm.g:560:6: lv_stencil_0_0= ruleStencil
                    {

                    						newCompositeNode(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getShapeAccess().getVerticalLineGreaterThanSignKeyword_0_1());
                    			
                    // InternalOnlineElm.g:581:4: ( (lv_draw_2_0= ruleDraw ) )
                    // InternalOnlineElm.g:582:5: (lv_draw_2_0= ruleDraw )
                    {
                    // InternalOnlineElm.g:582:5: (lv_draw_2_0= ruleDraw )
                    // InternalOnlineElm.g:583:6: lv_draw_2_0= ruleDraw
                    {

                    						newCompositeNode(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_0_2_0());
                    					
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
                    break;
                case 2 :
                    // InternalOnlineElm.g:602:3: this_Conditional_3= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getConditionalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_3=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_3;
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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleConditional"
    // InternalOnlineElm.g:614:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalOnlineElm.g:614:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalOnlineElm.g:615:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalOnlineElm.g:621:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' this_Bool_exp_1= ruleBool_exp otherlv_2= 'then' ( (lv_exp1_3_0= ruleShape ) ) otherlv_4= 'else' ( (lv_exp2_5_0= ruleShape ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Bool_exp_1 = null;

        EObject lv_exp1_3_0 = null;

        EObject lv_exp2_5_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:627:2: ( (otherlv_0= 'if' this_Bool_exp_1= ruleBool_exp otherlv_2= 'then' ( (lv_exp1_3_0= ruleShape ) ) otherlv_4= 'else' ( (lv_exp2_5_0= ruleShape ) ) ) )
            // InternalOnlineElm.g:628:2: (otherlv_0= 'if' this_Bool_exp_1= ruleBool_exp otherlv_2= 'then' ( (lv_exp1_3_0= ruleShape ) ) otherlv_4= 'else' ( (lv_exp2_5_0= ruleShape ) ) )
            {
            // InternalOnlineElm.g:628:2: (otherlv_0= 'if' this_Bool_exp_1= ruleBool_exp otherlv_2= 'then' ( (lv_exp1_3_0= ruleShape ) ) otherlv_4= 'else' ( (lv_exp2_5_0= ruleShape ) ) )
            // InternalOnlineElm.g:629:3: otherlv_0= 'if' this_Bool_exp_1= ruleBool_exp otherlv_2= 'then' ( (lv_exp1_3_0= ruleShape ) ) otherlv_4= 'else' ( (lv_exp2_5_0= ruleShape ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConditionalAccess().getBool_expParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_Bool_exp_1=ruleBool_exp();

            state._fsp--;


            			current = this_Bool_exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
            		
            // InternalOnlineElm.g:645:3: ( (lv_exp1_3_0= ruleShape ) )
            // InternalOnlineElm.g:646:4: (lv_exp1_3_0= ruleShape )
            {
            // InternalOnlineElm.g:646:4: (lv_exp1_3_0= ruleShape )
            // InternalOnlineElm.g:647:5: lv_exp1_3_0= ruleShape
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getExp1ShapeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_exp1_3_0=ruleShape();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_3_0,
            						"org.xtext.online_elm.OnlineElm.Shape");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getElseKeyword_4());
            		
            // InternalOnlineElm.g:668:3: ( (lv_exp2_5_0= ruleShape ) )
            // InternalOnlineElm.g:669:4: (lv_exp2_5_0= ruleShape )
            {
            // InternalOnlineElm.g:669:4: (lv_exp2_5_0= ruleShape )
            // InternalOnlineElm.g:670:5: lv_exp2_5_0= ruleShape
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getExp2ShapeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp2_5_0=ruleShape();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_5_0,
            						"org.xtext.online_elm.OnlineElm.Shape");
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleBool_exp"
    // InternalOnlineElm.g:691:1: entryRuleBool_exp returns [EObject current=null] : iv_ruleBool_exp= ruleBool_exp EOF ;
    public final EObject entryRuleBool_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool_exp = null;


        try {
            // InternalOnlineElm.g:691:49: (iv_ruleBool_exp= ruleBool_exp EOF )
            // InternalOnlineElm.g:692:2: iv_ruleBool_exp= ruleBool_exp EOF
            {
             newCompositeNode(grammarAccess.getBool_expRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool_exp=ruleBool_exp();

            state._fsp--;

             current =iv_ruleBool_exp; 
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
    // $ANTLR end "entryRuleBool_exp"


    // $ANTLR start "ruleBool_exp"
    // InternalOnlineElm.g:698:1: ruleBool_exp returns [EObject current=null] : ( (otherlv_0= 'not' )? ( (lv_left_1_0= ruleTerminal_Bool_exp ) ) ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )* ) ;
    public final EObject ruleBool_exp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rights_3_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:704:2: ( ( (otherlv_0= 'not' )? ( (lv_left_1_0= ruleTerminal_Bool_exp ) ) ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )* ) )
            // InternalOnlineElm.g:705:2: ( (otherlv_0= 'not' )? ( (lv_left_1_0= ruleTerminal_Bool_exp ) ) ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )* )
            {
            // InternalOnlineElm.g:705:2: ( (otherlv_0= 'not' )? ( (lv_left_1_0= ruleTerminal_Bool_exp ) ) ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )* )
            // InternalOnlineElm.g:706:3: (otherlv_0= 'not' )? ( (lv_left_1_0= ruleTerminal_Bool_exp ) ) ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )*
            {
            // InternalOnlineElm.g:706:3: (otherlv_0= 'not' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOnlineElm.g:707:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getBool_expAccess().getNotKeyword_0());
                    			

                    }
                    break;

            }

            // InternalOnlineElm.g:712:3: ( (lv_left_1_0= ruleTerminal_Bool_exp ) )
            // InternalOnlineElm.g:713:4: (lv_left_1_0= ruleTerminal_Bool_exp )
            {
            // InternalOnlineElm.g:713:4: (lv_left_1_0= ruleTerminal_Bool_exp )
            // InternalOnlineElm.g:714:5: lv_left_1_0= ruleTerminal_Bool_exp
            {

            					newCompositeNode(grammarAccess.getBool_expAccess().getLeftTerminal_Bool_expParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_1_0=ruleTerminal_Bool_exp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBool_expRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.xtext.online_elm.OnlineElm.Terminal_Bool_exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:731:3: ( ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=30 && LA12_0<=31)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOnlineElm.g:732:4: ( (lv_operator_2_0= ruleBOOL_OP ) ) ( (lv_rights_3_0= ruleTerminal_Bool_exp ) )
            	    {
            	    // InternalOnlineElm.g:732:4: ( (lv_operator_2_0= ruleBOOL_OP ) )
            	    // InternalOnlineElm.g:733:5: (lv_operator_2_0= ruleBOOL_OP )
            	    {
            	    // InternalOnlineElm.g:733:5: (lv_operator_2_0= ruleBOOL_OP )
            	    // InternalOnlineElm.g:734:6: lv_operator_2_0= ruleBOOL_OP
            	    {

            	    						newCompositeNode(grammarAccess.getBool_expAccess().getOperatorBOOL_OPEnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleBOOL_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBool_expRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.online_elm.OnlineElm.BOOL_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOnlineElm.g:751:4: ( (lv_rights_3_0= ruleTerminal_Bool_exp ) )
            	    // InternalOnlineElm.g:752:5: (lv_rights_3_0= ruleTerminal_Bool_exp )
            	    {
            	    // InternalOnlineElm.g:752:5: (lv_rights_3_0= ruleTerminal_Bool_exp )
            	    // InternalOnlineElm.g:753:6: lv_rights_3_0= ruleTerminal_Bool_exp
            	    {

            	    						newCompositeNode(grammarAccess.getBool_expAccess().getRightsTerminal_Bool_expParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_rights_3_0=ruleTerminal_Bool_exp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBool_expRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rights",
            	    							lv_rights_3_0,
            	    							"org.xtext.online_elm.OnlineElm.Terminal_Bool_exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleBool_exp"


    // $ANTLR start "entryRuleTerminal_Bool_exp"
    // InternalOnlineElm.g:775:1: entryRuleTerminal_Bool_exp returns [EObject current=null] : iv_ruleTerminal_Bool_exp= ruleTerminal_Bool_exp EOF ;
    public final EObject entryRuleTerminal_Bool_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal_Bool_exp = null;


        try {
            // InternalOnlineElm.g:775:58: (iv_ruleTerminal_Bool_exp= ruleTerminal_Bool_exp EOF )
            // InternalOnlineElm.g:776:2: iv_ruleTerminal_Bool_exp= ruleTerminal_Bool_exp EOF
            {
             newCompositeNode(grammarAccess.getTerminal_Bool_expRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal_Bool_exp=ruleTerminal_Bool_exp();

            state._fsp--;

             current =iv_ruleTerminal_Bool_exp; 
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
    // $ANTLR end "entryRuleTerminal_Bool_exp"


    // $ANTLR start "ruleTerminal_Bool_exp"
    // InternalOnlineElm.g:782:1: ruleTerminal_Bool_exp returns [EObject current=null] : ( ( (lv_n1_0_0= ruleNum_value ) ) ( (lv_comp_1_0= ruleCOMPARISON ) ) ( (lv_n2_2_0= ruleNum_value ) ) ) ;
    public final EObject ruleTerminal_Bool_exp() throws RecognitionException {
        EObject current = null;

        EObject lv_n1_0_0 = null;

        Enumerator lv_comp_1_0 = null;

        EObject lv_n2_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:788:2: ( ( ( (lv_n1_0_0= ruleNum_value ) ) ( (lv_comp_1_0= ruleCOMPARISON ) ) ( (lv_n2_2_0= ruleNum_value ) ) ) )
            // InternalOnlineElm.g:789:2: ( ( (lv_n1_0_0= ruleNum_value ) ) ( (lv_comp_1_0= ruleCOMPARISON ) ) ( (lv_n2_2_0= ruleNum_value ) ) )
            {
            // InternalOnlineElm.g:789:2: ( ( (lv_n1_0_0= ruleNum_value ) ) ( (lv_comp_1_0= ruleCOMPARISON ) ) ( (lv_n2_2_0= ruleNum_value ) ) )
            // InternalOnlineElm.g:790:3: ( (lv_n1_0_0= ruleNum_value ) ) ( (lv_comp_1_0= ruleCOMPARISON ) ) ( (lv_n2_2_0= ruleNum_value ) )
            {
            // InternalOnlineElm.g:790:3: ( (lv_n1_0_0= ruleNum_value ) )
            // InternalOnlineElm.g:791:4: (lv_n1_0_0= ruleNum_value )
            {
            // InternalOnlineElm.g:791:4: (lv_n1_0_0= ruleNum_value )
            // InternalOnlineElm.g:792:5: lv_n1_0_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getTerminal_Bool_expAccess().getN1Num_valueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_n1_0_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminal_Bool_expRule());
            					}
            					set(
            						current,
            						"n1",
            						lv_n1_0_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:809:3: ( (lv_comp_1_0= ruleCOMPARISON ) )
            // InternalOnlineElm.g:810:4: (lv_comp_1_0= ruleCOMPARISON )
            {
            // InternalOnlineElm.g:810:4: (lv_comp_1_0= ruleCOMPARISON )
            // InternalOnlineElm.g:811:5: lv_comp_1_0= ruleCOMPARISON
            {

            					newCompositeNode(grammarAccess.getTerminal_Bool_expAccess().getCompCOMPARISONEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_comp_1_0=ruleCOMPARISON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminal_Bool_expRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"org.xtext.online_elm.OnlineElm.COMPARISON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:828:3: ( (lv_n2_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:829:4: (lv_n2_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:829:4: (lv_n2_2_0= ruleNum_value )
            // InternalOnlineElm.g:830:5: lv_n2_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getTerminal_Bool_expAccess().getN2Num_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_n2_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminal_Bool_expRule());
            					}
            					set(
            						current,
            						"n2",
            						lv_n2_2_0,
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
    // $ANTLR end "ruleTerminal_Bool_exp"


    // $ANTLR start "entryRuleNum_value"
    // InternalOnlineElm.g:851:1: entryRuleNum_value returns [EObject current=null] : iv_ruleNum_value= ruleNum_value EOF ;
    public final EObject entryRuleNum_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum_value = null;


        try {
            // InternalOnlineElm.g:851:50: (iv_ruleNum_value= ruleNum_value EOF )
            // InternalOnlineElm.g:852:2: iv_ruleNum_value= ruleNum_value EOF
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
    // InternalOnlineElm.g:858:1: ruleNum_value returns [EObject current=null] : ( ( (lv_num_0_0= RULE_FLOAT ) ) | this_Math_exp_1= ruleMath_exp ) ;
    public final EObject ruleNum_value() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;
        EObject this_Math_exp_1 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:864:2: ( ( ( (lv_num_0_0= RULE_FLOAT ) ) | this_Math_exp_1= ruleMath_exp ) )
            // InternalOnlineElm.g:865:2: ( ( (lv_num_0_0= RULE_FLOAT ) ) | this_Math_exp_1= ruleMath_exp )
            {
            // InternalOnlineElm.g:865:2: ( ( (lv_num_0_0= RULE_FLOAT ) ) | this_Math_exp_1= ruleMath_exp )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_FLOAT) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOnlineElm.g:866:3: ( (lv_num_0_0= RULE_FLOAT ) )
                    {
                    // InternalOnlineElm.g:866:3: ( (lv_num_0_0= RULE_FLOAT ) )
                    // InternalOnlineElm.g:867:4: (lv_num_0_0= RULE_FLOAT )
                    {
                    // InternalOnlineElm.g:867:4: (lv_num_0_0= RULE_FLOAT )
                    // InternalOnlineElm.g:868:5: lv_num_0_0= RULE_FLOAT
                    {
                    lv_num_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    					newLeafNode(lv_num_0_0, grammarAccess.getNum_valueAccess().getNumFLOATTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNum_valueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"num",
                    						lv_num_0_0,
                    						"org.xtext.online_elm.OnlineElm.FLOAT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:885:3: this_Math_exp_1= ruleMath_exp
                    {

                    			newCompositeNode(grammarAccess.getNum_valueAccess().getMath_expParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Math_exp_1=ruleMath_exp();

                    state._fsp--;


                    			current = this_Math_exp_1;
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
    // $ANTLR end "ruleNum_value"


    // $ANTLR start "entryRuleMath_exp"
    // InternalOnlineElm.g:897:1: entryRuleMath_exp returns [EObject current=null] : iv_ruleMath_exp= ruleMath_exp EOF ;
    public final EObject entryRuleMath_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath_exp = null;


        try {
            // InternalOnlineElm.g:897:49: (iv_ruleMath_exp= ruleMath_exp EOF )
            // InternalOnlineElm.g:898:2: iv_ruleMath_exp= ruleMath_exp EOF
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
    // InternalOnlineElm.g:904:1: ruleMath_exp returns [EObject current=null] : (otherlv_0= '(' ( (lv_n1_1_0= RULE_FLOAT ) ) ( (lv_op1_2_0= ruleMATH_OP ) ) ( (lv_n2_3_0= RULE_FLOAT ) ) otherlv_4= ')' ) ;
    public final EObject ruleMath_exp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n1_1_0=null;
        Token lv_n2_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_op1_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:910:2: ( (otherlv_0= '(' ( (lv_n1_1_0= RULE_FLOAT ) ) ( (lv_op1_2_0= ruleMATH_OP ) ) ( (lv_n2_3_0= RULE_FLOAT ) ) otherlv_4= ')' ) )
            // InternalOnlineElm.g:911:2: (otherlv_0= '(' ( (lv_n1_1_0= RULE_FLOAT ) ) ( (lv_op1_2_0= ruleMATH_OP ) ) ( (lv_n2_3_0= RULE_FLOAT ) ) otherlv_4= ')' )
            {
            // InternalOnlineElm.g:911:2: (otherlv_0= '(' ( (lv_n1_1_0= RULE_FLOAT ) ) ( (lv_op1_2_0= ruleMATH_OP ) ) ( (lv_n2_3_0= RULE_FLOAT ) ) otherlv_4= ')' )
            // InternalOnlineElm.g:912:3: otherlv_0= '(' ( (lv_n1_1_0= RULE_FLOAT ) ) ( (lv_op1_2_0= ruleMATH_OP ) ) ( (lv_n2_3_0= RULE_FLOAT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMath_expAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOnlineElm.g:916:3: ( (lv_n1_1_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:917:4: (lv_n1_1_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:917:4: (lv_n1_1_0= RULE_FLOAT )
            // InternalOnlineElm.g:918:5: lv_n1_1_0= RULE_FLOAT
            {
            lv_n1_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_19); 

            					newLeafNode(lv_n1_1_0, grammarAccess.getMath_expAccess().getN1FLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMath_expRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n1",
            						lv_n1_1_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

            }


            }

            // InternalOnlineElm.g:934:3: ( (lv_op1_2_0= ruleMATH_OP ) )
            // InternalOnlineElm.g:935:4: (lv_op1_2_0= ruleMATH_OP )
            {
            // InternalOnlineElm.g:935:4: (lv_op1_2_0= ruleMATH_OP )
            // InternalOnlineElm.g:936:5: lv_op1_2_0= ruleMATH_OP
            {

            					newCompositeNode(grammarAccess.getMath_expAccess().getOp1MATH_OPEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_op1_2_0=ruleMATH_OP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMath_expRule());
            					}
            					set(
            						current,
            						"op1",
            						lv_op1_2_0,
            						"org.xtext.online_elm.OnlineElm.MATH_OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:953:3: ( (lv_n2_3_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:954:4: (lv_n2_3_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:954:4: (lv_n2_3_0= RULE_FLOAT )
            // InternalOnlineElm.g:955:5: lv_n2_3_0= RULE_FLOAT
            {
            lv_n2_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_20); 

            					newLeafNode(lv_n2_3_0, grammarAccess.getMath_expAccess().getN2FLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMath_expRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n2",
            						lv_n2_3_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMath_expAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleStencil"
    // InternalOnlineElm.g:979:1: entryRuleStencil returns [EObject current=null] : iv_ruleStencil= ruleStencil EOF ;
    public final EObject entryRuleStencil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStencil = null;


        try {
            // InternalOnlineElm.g:979:48: (iv_ruleStencil= ruleStencil EOF )
            // InternalOnlineElm.g:980:2: iv_ruleStencil= ruleStencil EOF
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
    // InternalOnlineElm.g:986:1: ruleStencil returns [EObject current=null] : (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Text_2= ruleText ) ;
    public final EObject ruleStencil() throws RecognitionException {
        EObject current = null;

        EObject this_Circle_0 = null;

        EObject this_Rect_1 = null;

        EObject this_Text_2 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:992:2: ( (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Text_2= ruleText ) )
            // InternalOnlineElm.g:993:2: (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Text_2= ruleText )
            {
            // InternalOnlineElm.g:993:2: (this_Circle_0= ruleCircle | this_Rect_1= ruleRect | this_Text_2= ruleText )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOnlineElm.g:994:3: this_Circle_0= ruleCircle
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
                    // InternalOnlineElm.g:1003:3: this_Rect_1= ruleRect
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
                    // InternalOnlineElm.g:1012:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getStencilAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
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
    // InternalOnlineElm.g:1024:1: entryRuleCircle returns [EObject current=null] : iv_ruleCircle= ruleCircle EOF ;
    public final EObject entryRuleCircle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircle = null;


        try {
            // InternalOnlineElm.g:1024:47: (iv_ruleCircle= ruleCircle EOF )
            // InternalOnlineElm.g:1025:2: iv_ruleCircle= ruleCircle EOF
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
    // InternalOnlineElm.g:1031:1: ruleCircle returns [EObject current=null] : ( ( (lv_name_0_0= 'circle' ) ) ( (lv_diameter_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleCircle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_diameter_1_0=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1037:2: ( ( ( (lv_name_0_0= 'circle' ) ) ( (lv_diameter_1_0= RULE_FLOAT ) ) ) )
            // InternalOnlineElm.g:1038:2: ( ( (lv_name_0_0= 'circle' ) ) ( (lv_diameter_1_0= RULE_FLOAT ) ) )
            {
            // InternalOnlineElm.g:1038:2: ( ( (lv_name_0_0= 'circle' ) ) ( (lv_diameter_1_0= RULE_FLOAT ) ) )
            // InternalOnlineElm.g:1039:3: ( (lv_name_0_0= 'circle' ) ) ( (lv_diameter_1_0= RULE_FLOAT ) )
            {
            // InternalOnlineElm.g:1039:3: ( (lv_name_0_0= 'circle' ) )
            // InternalOnlineElm.g:1040:4: (lv_name_0_0= 'circle' )
            {
            // InternalOnlineElm.g:1040:4: (lv_name_0_0= 'circle' )
            // InternalOnlineElm.g:1041:5: lv_name_0_0= 'circle'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCircleAccess().getNameCircleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCircleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "circle");
            				

            }


            }

            // InternalOnlineElm.g:1053:3: ( (lv_diameter_1_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:1054:4: (lv_diameter_1_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:1054:4: (lv_diameter_1_0= RULE_FLOAT )
            // InternalOnlineElm.g:1055:5: lv_diameter_1_0= RULE_FLOAT
            {
            lv_diameter_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_diameter_1_0, grammarAccess.getCircleAccess().getDiameterFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCircleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"diameter",
            						lv_diameter_1_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

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
    // InternalOnlineElm.g:1075:1: entryRuleRect returns [EObject current=null] : iv_ruleRect= ruleRect EOF ;
    public final EObject entryRuleRect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRect = null;


        try {
            // InternalOnlineElm.g:1075:45: (iv_ruleRect= ruleRect EOF )
            // InternalOnlineElm.g:1076:2: iv_ruleRect= ruleRect EOF
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
    // InternalOnlineElm.g:1082:1: ruleRect returns [EObject current=null] : ( ( (lv_name_0_0= 'rect' ) ) ( (lv_edgeX_1_0= RULE_FLOAT ) ) ( (lv_edgeY_2_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRect() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_edgeX_1_0=null;
        Token lv_edgeY_2_0=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1088:2: ( ( ( (lv_name_0_0= 'rect' ) ) ( (lv_edgeX_1_0= RULE_FLOAT ) ) ( (lv_edgeY_2_0= RULE_FLOAT ) ) ) )
            // InternalOnlineElm.g:1089:2: ( ( (lv_name_0_0= 'rect' ) ) ( (lv_edgeX_1_0= RULE_FLOAT ) ) ( (lv_edgeY_2_0= RULE_FLOAT ) ) )
            {
            // InternalOnlineElm.g:1089:2: ( ( (lv_name_0_0= 'rect' ) ) ( (lv_edgeX_1_0= RULE_FLOAT ) ) ( (lv_edgeY_2_0= RULE_FLOAT ) ) )
            // InternalOnlineElm.g:1090:3: ( (lv_name_0_0= 'rect' ) ) ( (lv_edgeX_1_0= RULE_FLOAT ) ) ( (lv_edgeY_2_0= RULE_FLOAT ) )
            {
            // InternalOnlineElm.g:1090:3: ( (lv_name_0_0= 'rect' ) )
            // InternalOnlineElm.g:1091:4: (lv_name_0_0= 'rect' )
            {
            // InternalOnlineElm.g:1091:4: (lv_name_0_0= 'rect' )
            // InternalOnlineElm.g:1092:5: lv_name_0_0= 'rect'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRectAccess().getNameRectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rect");
            				

            }


            }

            // InternalOnlineElm.g:1104:3: ( (lv_edgeX_1_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:1105:4: (lv_edgeX_1_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:1105:4: (lv_edgeX_1_0= RULE_FLOAT )
            // InternalOnlineElm.g:1106:5: lv_edgeX_1_0= RULE_FLOAT
            {
            lv_edgeX_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_18); 

            					newLeafNode(lv_edgeX_1_0, grammarAccess.getRectAccess().getEdgeXFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"edgeX",
            						lv_edgeX_1_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

            }


            }

            // InternalOnlineElm.g:1122:3: ( (lv_edgeY_2_0= RULE_FLOAT ) )
            // InternalOnlineElm.g:1123:4: (lv_edgeY_2_0= RULE_FLOAT )
            {
            // InternalOnlineElm.g:1123:4: (lv_edgeY_2_0= RULE_FLOAT )
            // InternalOnlineElm.g:1124:5: lv_edgeY_2_0= RULE_FLOAT
            {
            lv_edgeY_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_edgeY_2_0, grammarAccess.getRectAccess().getEdgeYFLOATTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"edgeY",
            						lv_edgeY_2_0,
            						"org.xtext.online_elm.OnlineElm.FLOAT");
            				

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


    // $ANTLR start "entryRuleText"
    // InternalOnlineElm.g:1144:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalOnlineElm.g:1144:45: (iv_ruleText= ruleText EOF )
            // InternalOnlineElm.g:1145:2: iv_ruleText= ruleText EOF
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
    // InternalOnlineElm.g:1151:1: ruleText returns [EObject current=null] : ( ( (lv_name_0_0= 'text' ) ) ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1157:2: ( ( ( (lv_name_0_0= 'text' ) ) ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalOnlineElm.g:1158:2: ( ( (lv_name_0_0= 'text' ) ) ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalOnlineElm.g:1158:2: ( ( (lv_name_0_0= 'text' ) ) ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalOnlineElm.g:1159:3: ( (lv_name_0_0= 'text' ) ) ( (lv_content_1_0= RULE_STRING ) )
            {
            // InternalOnlineElm.g:1159:3: ( (lv_name_0_0= 'text' ) )
            // InternalOnlineElm.g:1160:4: (lv_name_0_0= 'text' )
            {
            // InternalOnlineElm.g:1160:4: (lv_name_0_0= 'text' )
            // InternalOnlineElm.g:1161:5: lv_name_0_0= 'text'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameTextKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "text");
            				

            }


            }

            // InternalOnlineElm.g:1173:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalOnlineElm.g:1174:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalOnlineElm.g:1174:4: (lv_content_1_0= RULE_STRING )
            // InternalOnlineElm.g:1175:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_1_0, grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

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
    // InternalOnlineElm.g:1195:1: entryRuleDraw returns [EObject current=null] : iv_ruleDraw= ruleDraw EOF ;
    public final EObject entryRuleDraw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDraw = null;


        try {
            // InternalOnlineElm.g:1195:45: (iv_ruleDraw= ruleDraw EOF )
            // InternalOnlineElm.g:1196:2: iv_ruleDraw= ruleDraw EOF
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
    // InternalOnlineElm.g:1202:1: ruleDraw returns [EObject current=null] : ( ( (lv_filledColor_0_0= ruleFill ) ) (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )? ) ;
    public final EObject ruleDraw() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_filledColor_0_0 = null;

        EObject lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1208:2: ( ( ( (lv_filledColor_0_0= ruleFill ) ) (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )? ) )
            // InternalOnlineElm.g:1209:2: ( ( (lv_filledColor_0_0= ruleFill ) ) (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )? )
            {
            // InternalOnlineElm.g:1209:2: ( ( (lv_filledColor_0_0= ruleFill ) ) (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )? )
            // InternalOnlineElm.g:1210:3: ( (lv_filledColor_0_0= ruleFill ) ) (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )?
            {
            // InternalOnlineElm.g:1210:3: ( (lv_filledColor_0_0= ruleFill ) )
            // InternalOnlineElm.g:1211:4: (lv_filledColor_0_0= ruleFill )
            {
            // InternalOnlineElm.g:1211:4: (lv_filledColor_0_0= ruleFill )
            // InternalOnlineElm.g:1212:5: lv_filledColor_0_0= ruleFill
            {

            					newCompositeNode(grammarAccess.getDrawAccess().getFilledColorFillParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_filledColor_0_0=ruleFill();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawRule());
            					}
            					set(
            						current,
            						"filledColor",
            						lv_filledColor_0_0,
            						"org.xtext.online_elm.OnlineElm.Fill");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOnlineElm.g:1229:3: (otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOnlineElm.g:1230:4: otherlv_1= '|>' ( (lv_position_2_0= ruleMove ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalOnlineElm.g:1234:4: ( (lv_position_2_0= ruleMove ) )
                    // InternalOnlineElm.g:1235:5: (lv_position_2_0= ruleMove )
                    {
                    // InternalOnlineElm.g:1235:5: (lv_position_2_0= ruleMove )
                    // InternalOnlineElm.g:1236:6: lv_position_2_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getPositionMoveParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_position_2_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_2_0,
                    							"org.xtext.online_elm.OnlineElm.Move");
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
    // $ANTLR end "ruleDraw"


    // $ANTLR start "entryRuleFill"
    // InternalOnlineElm.g:1258:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalOnlineElm.g:1258:45: (iv_ruleFill= ruleFill EOF )
            // InternalOnlineElm.g:1259:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalOnlineElm.g:1265:1: ruleFill returns [EObject current=null] : ( ( (lv_name_0_0= 'filled' ) ) ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1271:2: ( ( ( (lv_name_0_0= 'filled' ) ) ( (lv_color_1_0= ruleColor ) ) ) )
            // InternalOnlineElm.g:1272:2: ( ( (lv_name_0_0= 'filled' ) ) ( (lv_color_1_0= ruleColor ) ) )
            {
            // InternalOnlineElm.g:1272:2: ( ( (lv_name_0_0= 'filled' ) ) ( (lv_color_1_0= ruleColor ) ) )
            // InternalOnlineElm.g:1273:3: ( (lv_name_0_0= 'filled' ) ) ( (lv_color_1_0= ruleColor ) )
            {
            // InternalOnlineElm.g:1273:3: ( (lv_name_0_0= 'filled' ) )
            // InternalOnlineElm.g:1274:4: (lv_name_0_0= 'filled' )
            {
            // InternalOnlineElm.g:1274:4: (lv_name_0_0= 'filled' )
            // InternalOnlineElm.g:1275:5: lv_name_0_0= 'filled'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFillAccess().getNameFilledKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "filled");
            				

            }


            }

            // InternalOnlineElm.g:1287:3: ( (lv_color_1_0= ruleColor ) )
            // InternalOnlineElm.g:1288:4: (lv_color_1_0= ruleColor )
            {
            // InternalOnlineElm.g:1288:4: (lv_color_1_0= ruleColor )
            // InternalOnlineElm.g:1289:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getFillAccess().getColorColorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_1_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
            						"org.xtext.online_elm.OnlineElm.Color");
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
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleMove"
    // InternalOnlineElm.g:1310:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalOnlineElm.g:1310:45: (iv_ruleMove= ruleMove EOF )
            // InternalOnlineElm.g:1311:2: iv_ruleMove= ruleMove EOF
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
    // InternalOnlineElm.g:1317:1: ruleMove returns [EObject current=null] : ( ( (lv_name_0_0= 'move' ) ) otherlv_1= '(' ( (lv_x_2_0= ruleNum_value ) ) otherlv_3= ',' ( (lv_y_4_0= ruleNum_value ) ) otherlv_5= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_x_2_0 = null;

        EObject lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalOnlineElm.g:1323:2: ( ( ( (lv_name_0_0= 'move' ) ) otherlv_1= '(' ( (lv_x_2_0= ruleNum_value ) ) otherlv_3= ',' ( (lv_y_4_0= ruleNum_value ) ) otherlv_5= ')' ) )
            // InternalOnlineElm.g:1324:2: ( ( (lv_name_0_0= 'move' ) ) otherlv_1= '(' ( (lv_x_2_0= ruleNum_value ) ) otherlv_3= ',' ( (lv_y_4_0= ruleNum_value ) ) otherlv_5= ')' )
            {
            // InternalOnlineElm.g:1324:2: ( ( (lv_name_0_0= 'move' ) ) otherlv_1= '(' ( (lv_x_2_0= ruleNum_value ) ) otherlv_3= ',' ( (lv_y_4_0= ruleNum_value ) ) otherlv_5= ')' )
            // InternalOnlineElm.g:1325:3: ( (lv_name_0_0= 'move' ) ) otherlv_1= '(' ( (lv_x_2_0= ruleNum_value ) ) otherlv_3= ',' ( (lv_y_4_0= ruleNum_value ) ) otherlv_5= ')'
            {
            // InternalOnlineElm.g:1325:3: ( (lv_name_0_0= 'move' ) )
            // InternalOnlineElm.g:1326:4: (lv_name_0_0= 'move' )
            {
            // InternalOnlineElm.g:1326:4: (lv_name_0_0= 'move' )
            // InternalOnlineElm.g:1327:5: lv_name_0_0= 'move'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMoveAccess().getNameMoveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "move");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOnlineElm.g:1343:3: ( (lv_x_2_0= ruleNum_value ) )
            // InternalOnlineElm.g:1344:4: (lv_x_2_0= ruleNum_value )
            {
            // InternalOnlineElm.g:1344:4: (lv_x_2_0= ruleNum_value )
            // InternalOnlineElm.g:1345:5: lv_x_2_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getXNum_valueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_x_2_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getCommaKeyword_3());
            		
            // InternalOnlineElm.g:1366:3: ( (lv_y_4_0= ruleNum_value ) )
            // InternalOnlineElm.g:1367:4: (lv_y_4_0= ruleNum_value )
            {
            // InternalOnlineElm.g:1367:4: (lv_y_4_0= ruleNum_value )
            // InternalOnlineElm.g:1368:5: lv_y_4_0= ruleNum_value
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getYNum_valueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_y_4_0=ruleNum_value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.xtext.online_elm.OnlineElm.Num_value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "ruleBOOL_OP"
    // InternalOnlineElm.g:1393:1: ruleBOOL_OP returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleBOOL_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1399:2: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalOnlineElm.g:1400:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalOnlineElm.g:1400:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOnlineElm.g:1401:3: (enumLiteral_0= '&&' )
                    {
                    // InternalOnlineElm.g:1401:3: (enumLiteral_0= '&&' )
                    // InternalOnlineElm.g:1402:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBOOL_OPAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOOL_OPAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1409:3: (enumLiteral_1= '||' )
                    {
                    // InternalOnlineElm.g:1409:3: (enumLiteral_1= '||' )
                    // InternalOnlineElm.g:1410:4: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBOOL_OPAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOOL_OPAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBOOL_OP"


    // $ANTLR start "ruleMATH_OP"
    // InternalOnlineElm.g:1420:1: ruleMATH_OP returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMATH_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1426:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalOnlineElm.g:1427:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalOnlineElm.g:1427:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOnlineElm.g:1428:3: (enumLiteral_0= '+' )
                    {
                    // InternalOnlineElm.g:1428:3: (enumLiteral_0= '+' )
                    // InternalOnlineElm.g:1429:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMATH_OPAccess().getPlusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1436:3: (enumLiteral_1= '-' )
                    {
                    // InternalOnlineElm.g:1436:3: (enumLiteral_1= '-' )
                    // InternalOnlineElm.g:1437:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMATH_OPAccess().getMinusEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1444:3: (enumLiteral_2= '*' )
                    {
                    // InternalOnlineElm.g:1444:3: (enumLiteral_2= '*' )
                    // InternalOnlineElm.g:1445:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMATH_OPAccess().getTimesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1452:3: (enumLiteral_3= '/' )
                    {
                    // InternalOnlineElm.g:1452:3: (enumLiteral_3= '/' )
                    // InternalOnlineElm.g:1453:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "ruleCOMPARISON"
    // InternalOnlineElm.g:1463:1: ruleCOMPARISON returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) ) ;
    public final Enumerator ruleCOMPARISON() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1469:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) ) )
            // InternalOnlineElm.g:1470:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) )
            {
            // InternalOnlineElm.g:1470:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
                {
                alt18=4;
                }
                break;
            case 40:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOnlineElm.g:1471:3: (enumLiteral_0= '>' )
                    {
                    // InternalOnlineElm.g:1471:3: (enumLiteral_0= '>' )
                    // InternalOnlineElm.g:1472:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISONAccess().getBiggerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISONAccess().getBiggerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1479:3: (enumLiteral_1= '>=' )
                    {
                    // InternalOnlineElm.g:1479:3: (enumLiteral_1= '>=' )
                    // InternalOnlineElm.g:1480:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISONAccess().getNoLessThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISONAccess().getNoLessThanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1487:3: (enumLiteral_2= '<' )
                    {
                    // InternalOnlineElm.g:1487:3: (enumLiteral_2= '<' )
                    // InternalOnlineElm.g:1488:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISONAccess().getSmallerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISONAccess().getSmallerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOnlineElm.g:1495:3: (enumLiteral_3= '<=' )
                    {
                    // InternalOnlineElm.g:1495:3: (enumLiteral_3= '<=' )
                    // InternalOnlineElm.g:1496:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISONAccess().getNoBiggerThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARISONAccess().getNoBiggerThanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOnlineElm.g:1503:3: (enumLiteral_4= '==' )
                    {
                    // InternalOnlineElm.g:1503:3: (enumLiteral_4= '==' )
                    // InternalOnlineElm.g:1504:4: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISONAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOMPARISONAccess().getEqualEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleCOMPARISON"


    // $ANTLR start "ruleColor"
    // InternalOnlineElm.g:1514:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOnlineElm.g:1520:2: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) ) )
            // InternalOnlineElm.g:1521:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) )
            {
            // InternalOnlineElm.g:1521:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalOnlineElm.g:1522:3: (enumLiteral_0= 'black' )
                    {
                    // InternalOnlineElm.g:1522:3: (enumLiteral_0= 'black' )
                    // InternalOnlineElm.g:1523:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOnlineElm.g:1530:3: (enumLiteral_1= 'red' )
                    {
                    // InternalOnlineElm.g:1530:3: (enumLiteral_1= 'red' )
                    // InternalOnlineElm.g:1531:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOnlineElm.g:1538:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalOnlineElm.g:1538:3: (enumLiteral_2= 'blue' )
                    // InternalOnlineElm.g:1539:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_2());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000E080010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});

}
