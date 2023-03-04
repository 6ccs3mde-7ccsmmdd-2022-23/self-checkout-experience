package self_checkout_experience.parser.antlr.internal;

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
import self_checkout_experience.services.SelfCheckoutExperienceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSelfCheckoutExperienceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hold'", "'pick'", "'up'", "'scan'", "'and'", "'add'", "'to'", "'basket'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'('", "')'", "'turn'", "'+'", "'-'", "'*'", "'/'", "'go'", "'self-checkout'", "'barcode'", "'with'", "'all'", "'items'", "'selfscanner'", "'forward'", "'backward'", "'left'", "'right'", "'bag'", "'pay'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSelfCheckoutExperienceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSelfCheckoutExperienceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSelfCheckoutExperienceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSelfCheckoutExperience.g"; }



     	private SelfCheckoutExperienceGrammarAccess grammarAccess;

        public InternalSelfCheckoutExperienceParser(TokenStream input, SelfCheckoutExperienceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Self_checkout";
       	}

       	@Override
       	protected SelfCheckoutExperienceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSelf_checkout"
    // InternalSelfCheckoutExperience.g:65:1: entryRuleSelf_checkout returns [EObject current=null] : iv_ruleSelf_checkout= ruleSelf_checkout EOF ;
    public final EObject entryRuleSelf_checkout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf_checkout = null;


        try {
            // InternalSelfCheckoutExperience.g:65:54: (iv_ruleSelf_checkout= ruleSelf_checkout EOF )
            // InternalSelfCheckoutExperience.g:66:2: iv_ruleSelf_checkout= ruleSelf_checkout EOF
            {
             newCompositeNode(grammarAccess.getSelf_checkoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelf_checkout=ruleSelf_checkout();

            state._fsp--;

             current =iv_ruleSelf_checkout; 
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
    // $ANTLR end "entryRuleSelf_checkout"


    // $ANTLR start "ruleSelf_checkout"
    // InternalSelfCheckoutExperience.g:72:1: ruleSelf_checkout returns [EObject current=null] : ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? ) ;
    public final EObject ruleSelf_checkout() throws RecognitionException {
        EObject current = null;

        EObject lv_pickScanMachine_0_0 = null;

        EObject lv_pickstatements_1_0 = null;

        EObject lv_walkstatements_2_0 = null;

        EObject lv_checkout_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:78:2: ( ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? ) )
            // InternalSelfCheckoutExperience.g:79:2: ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? )
            {
            // InternalSelfCheckoutExperience.g:79:2: ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? )
            // InternalSelfCheckoutExperience.g:80:3: ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )?
            {
            // InternalSelfCheckoutExperience.g:80:3: ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:81:4: (lv_pickScanMachine_0_0= ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:81:4: (lv_pickScanMachine_0_0= ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:82:5: lv_pickScanMachine_0_0= ruleHoldSelfScanner
            {

            					newCompositeNode(grammarAccess.getSelf_checkoutAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_pickScanMachine_0_0=ruleHoldSelfScanner();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
            					}
            					set(
            						current,
            						"pickScanMachine",
            						lv_pickScanMachine_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.HoldSelfScanner");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:99:3: ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==20||LA1_0==22||LA1_0==27||(LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:100:4: ( (lv_pickstatements_1_0= rulePickStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:100:4: ( (lv_pickstatements_1_0= rulePickStatement ) )
            	    // InternalSelfCheckoutExperience.g:101:5: (lv_pickstatements_1_0= rulePickStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:101:5: (lv_pickstatements_1_0= rulePickStatement )
            	    // InternalSelfCheckoutExperience.g:102:6: lv_pickstatements_1_0= rulePickStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelf_checkoutAccess().getPickstatementsPickStatementParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_pickstatements_1_0=rulePickStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pickstatements",
            	    							lv_pickstatements_1_0,
            	    							"self_checkout_experience.SelfCheckoutExperience.PickStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSelfCheckoutExperience.g:120:4: ( (lv_walkstatements_2_0= ruleWalkStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:120:4: ( (lv_walkstatements_2_0= ruleWalkStatement ) )
            	    // InternalSelfCheckoutExperience.g:121:5: (lv_walkstatements_2_0= ruleWalkStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:121:5: (lv_walkstatements_2_0= ruleWalkStatement )
            	    // InternalSelfCheckoutExperience.g:122:6: lv_walkstatements_2_0= ruleWalkStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_walkstatements_2_0=ruleWalkStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"walkstatements",
            	    							lv_walkstatements_2_0,
            	    							"self_checkout_experience.SelfCheckoutExperience.WalkStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSelfCheckoutExperience.g:140:3: ( (lv_checkout_3_0= ruleCheckout ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:141:4: (lv_checkout_3_0= ruleCheckout )
                    {
                    // InternalSelfCheckoutExperience.g:141:4: (lv_checkout_3_0= ruleCheckout )
                    // InternalSelfCheckoutExperience.g:142:5: lv_checkout_3_0= ruleCheckout
                    {

                    					newCompositeNode(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_checkout_3_0=ruleCheckout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
                    					}
                    					set(
                    						current,
                    						"checkout",
                    						lv_checkout_3_0,
                    						"self_checkout_experience.SelfCheckoutExperience.Checkout");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSelf_checkout"


    // $ANTLR start "entryRuleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:163:1: entryRuleHoldSelfScanner returns [EObject current=null] : iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF ;
    public final EObject entryRuleHoldSelfScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldSelfScanner = null;


        try {
            // InternalSelfCheckoutExperience.g:163:56: (iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF )
            // InternalSelfCheckoutExperience.g:164:2: iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF
            {
             newCompositeNode(grammarAccess.getHoldSelfScannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHoldSelfScanner=ruleHoldSelfScanner();

            state._fsp--;

             current =iv_ruleHoldSelfScanner; 
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
    // $ANTLR end "entryRuleHoldSelfScanner"


    // $ANTLR start "ruleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:170:1: ruleHoldSelfScanner returns [EObject current=null] : (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) ) ;
    public final EObject ruleHoldSelfScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_scanMachine_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:176:2: ( (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) ) )
            // InternalSelfCheckoutExperience.g:177:2: (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) )
            {
            // InternalSelfCheckoutExperience.g:177:2: (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) )
            // InternalSelfCheckoutExperience.g:178:3: otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:182:3: ( (lv_scanMachine_1_0= ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:183:4: (lv_scanMachine_1_0= ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:183:4: (lv_scanMachine_1_0= ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:184:5: lv_scanMachine_1_0= ruleSelfScanner
            {

            					newCompositeNode(grammarAccess.getHoldSelfScannerAccess().getScanMachineSelfScannerEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_scanMachine_1_0=ruleSelfScanner();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHoldSelfScannerRule());
            					}
            					set(
            						current,
            						"scanMachine",
            						lv_scanMachine_1_0,
            						"self_checkout_experience.SelfCheckoutExperience.SelfScanner");
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
    // $ANTLR end "ruleHoldSelfScanner"


    // $ANTLR start "entryRulePickStatement"
    // InternalSelfCheckoutExperience.g:205:1: entryRulePickStatement returns [EObject current=null] : iv_rulePickStatement= rulePickStatement EOF ;
    public final EObject entryRulePickStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:205:54: (iv_rulePickStatement= rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:206:2: iv_rulePickStatement= rulePickStatement EOF
            {
             newCompositeNode(grammarAccess.getPickStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePickStatement=rulePickStatement();

            state._fsp--;

             current =iv_rulePickStatement; 
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
    // $ANTLR end "entryRulePickStatement"


    // $ANTLR start "rulePickStatement"
    // InternalSelfCheckoutExperience.g:212:1: rulePickStatement returns [EObject current=null] : (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) ) ;
    public final EObject rulePickStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_itemCount_2_0 = null;

        EObject lv_itemPicked_3_0 = null;

        EObject lv_holdingItem_4_1 = null;

        EObject lv_holdingItem_4_2 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:218:2: ( (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) ) )
            // InternalSelfCheckoutExperience.g:219:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) )
            {
            // InternalSelfCheckoutExperience.g:219:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) )
            // InternalSelfCheckoutExperience.g:220:3: otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPickStatementAccess().getPickKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPickStatementAccess().getUpKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:228:3: ( (lv_itemCount_2_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:229:4: (lv_itemCount_2_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:229:4: (lv_itemCount_2_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:230:5: lv_itemCount_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_itemCount_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPickStatementRule());
            					}
            					set(
            						current,
            						"itemCount",
            						lv_itemCount_2_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:247:3: ( (lv_itemPicked_3_0= ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:248:4: (lv_itemPicked_3_0= ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:248:4: (lv_itemPicked_3_0= ruleItemDef )
            // InternalSelfCheckoutExperience.g:249:5: lv_itemPicked_3_0= ruleItemDef
            {

            					newCompositeNode(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_itemPicked_3_0=ruleItemDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPickStatementRule());
            					}
            					set(
            						current,
            						"itemPicked",
            						lv_itemPicked_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.ItemDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:266:3: ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) )
            // InternalSelfCheckoutExperience.g:267:4: ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) )
            {
            // InternalSelfCheckoutExperience.g:267:4: ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) )
            // InternalSelfCheckoutExperience.g:268:5: (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop )
            {
            // InternalSelfCheckoutExperience.g:268:5: (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:269:6: lv_holdingItem_4_1= ruleScanAndAddToBasket
                    {

                    						newCompositeNode(grammarAccess.getPickStatementAccess().getHoldingItemScanAndAddToBasketParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_holdingItem_4_1=ruleScanAndAddToBasket();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPickStatementRule());
                    						}
                    						set(
                    							current,
                    							"holdingItem",
                    							lv_holdingItem_4_1,
                    							"self_checkout_experience.SelfCheckoutExperience.ScanAndAddToBasket");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:285:6: lv_holdingItem_4_2= ruleDrop
                    {

                    						newCompositeNode(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_holdingItem_4_2=ruleDrop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPickStatementRule());
                    						}
                    						set(
                    							current,
                    							"holdingItem",
                    							lv_holdingItem_4_2,
                    							"self_checkout_experience.SelfCheckoutExperience.Drop");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "rulePickStatement"


    // $ANTLR start "entryRuleItemDef"
    // InternalSelfCheckoutExperience.g:307:1: entryRuleItemDef returns [EObject current=null] : iv_ruleItemDef= ruleItemDef EOF ;
    public final EObject entryRuleItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDef = null;


        try {
            // InternalSelfCheckoutExperience.g:307:48: (iv_ruleItemDef= ruleItemDef EOF )
            // InternalSelfCheckoutExperience.g:308:2: iv_ruleItemDef= ruleItemDef EOF
            {
             newCompositeNode(grammarAccess.getItemDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemDef=ruleItemDef();

            state._fsp--;

             current =iv_ruleItemDef; 
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
    // $ANTLR end "entryRuleItemDef"


    // $ANTLR start "ruleItemDef"
    // InternalSelfCheckoutExperience.g:314:1: ruleItemDef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:321:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:321:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:322:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:322:3: (lv_name_0_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:323:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getItemDefAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getItemDefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleItemDef"


    // $ANTLR start "entryRuleScanAndAddToBasket"
    // InternalSelfCheckoutExperience.g:342:1: entryRuleScanAndAddToBasket returns [EObject current=null] : iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF ;
    public final EObject entryRuleScanAndAddToBasket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanAndAddToBasket = null;


        try {
            // InternalSelfCheckoutExperience.g:342:59: (iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:343:2: iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF
            {
             newCompositeNode(grammarAccess.getScanAndAddToBasketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScanAndAddToBasket=ruleScanAndAddToBasket();

            state._fsp--;

             current =iv_ruleScanAndAddToBasket; 
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
    // $ANTLR end "entryRuleScanAndAddToBasket"


    // $ANTLR start "ruleScanAndAddToBasket"
    // InternalSelfCheckoutExperience.g:349:1: ruleScanAndAddToBasket returns [EObject current=null] : (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleScanAndAddToBasket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:355:2: ( (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:356:2: (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:356:2: (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:357:3: otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4());
            		
            // InternalSelfCheckoutExperience.g:377:3: ( (otherlv_5= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:378:4: (otherlv_5= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:378:4: (otherlv_5= RULE_ID )
            // InternalSelfCheckoutExperience.g:379:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScanAndAddToBasketRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0());
            				

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
    // $ANTLR end "ruleScanAndAddToBasket"


    // $ANTLR start "entryRuleDrop"
    // InternalSelfCheckoutExperience.g:394:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalSelfCheckoutExperience.g:394:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:395:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
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
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalSelfCheckoutExperience.g:401:1: ruleDrop returns [EObject current=null] : (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:407:2: ( (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:408:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:408:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:409:3: otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDropAccess().getDropKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:413:3: ( (otherlv_1= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:414:4: (otherlv_1= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:414:4: (otherlv_1= RULE_ID )
            // InternalSelfCheckoutExperience.g:415:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0());
            				

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
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleWalkStatement"
    // InternalSelfCheckoutExperience.g:430:1: entryRuleWalkStatement returns [EObject current=null] : iv_ruleWalkStatement= ruleWalkStatement EOF ;
    public final EObject entryRuleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalkStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:430:54: (iv_ruleWalkStatement= ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:431:2: iv_ruleWalkStatement= ruleWalkStatement EOF
            {
             newCompositeNode(grammarAccess.getWalkStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWalkStatement=ruleWalkStatement();

            state._fsp--;

             current =iv_ruleWalkStatement; 
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
    // $ANTLR end "entryRuleWalkStatement"


    // $ANTLR start "ruleWalkStatement"
    // InternalSelfCheckoutExperience.g:437:1: ruleWalkStatement returns [EObject current=null] : (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration ) ;
    public final EObject ruleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStatement_0 = null;

        EObject this_TurnStatement_1 = null;

        EObject this_Repeat_2 = null;

        EObject this_VariableDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:443:2: ( (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration ) )
            // InternalSelfCheckoutExperience.g:444:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration )
            {
            // InternalSelfCheckoutExperience.g:444:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:445:3: this_MoveStatement_0= ruleMoveStatement
                    {

                    			newCompositeNode(grammarAccess.getWalkStatementAccess().getMoveStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveStatement_0=ruleMoveStatement();

                    state._fsp--;


                    			current = this_MoveStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:454:3: this_TurnStatement_1= ruleTurnStatement
                    {

                    			newCompositeNode(grammarAccess.getWalkStatementAccess().getTurnStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnStatement_1=ruleTurnStatement();

                    state._fsp--;


                    			current = this_TurnStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:463:3: this_Repeat_2= ruleRepeat
                    {

                    			newCompositeNode(grammarAccess.getWalkStatementAccess().getRepeatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeat_2=ruleRepeat();

                    state._fsp--;


                    			current = this_Repeat_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:472:3: this_VariableDeclaration_3= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getWalkStatementAccess().getVariableDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_3;
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
    // $ANTLR end "ruleWalkStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSelfCheckoutExperience.g:484:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalSelfCheckoutExperience.g:484:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:485:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSelfCheckoutExperience.g:491:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:497:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSelfCheckoutExperience.g:498:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSelfCheckoutExperience.g:498:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:499:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:504:4: (lv_name_1_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:505:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:525:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:526:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:526:4: (lv_value_3_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:527:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleRepeat"
    // InternalSelfCheckoutExperience.g:547:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalSelfCheckoutExperience.g:547:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:548:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalSelfCheckoutExperience.g:554:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_count_1_0 = null;

        EObject lv_statements_3_1 = null;

        EObject lv_statements_3_2 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:560:2: ( (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' ) )
            // InternalSelfCheckoutExperience.g:561:2: (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' )
            {
            // InternalSelfCheckoutExperience.g:561:2: (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' )
            // InternalSelfCheckoutExperience.g:562:3: otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:566:3: ( (lv_count_1_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:567:4: (lv_count_1_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:567:4: (lv_count_1_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:568:5: lv_count_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getCountAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_count_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_1_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getTimesKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:589:3: ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==20||LA6_0==22||LA6_0==27||(LA6_0>=39 && LA6_0<=40)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:590:4: ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:590:4: ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) )
            	    // InternalSelfCheckoutExperience.g:591:5: (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:591:5: (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==20||LA5_0==22||LA5_0==27||(LA5_0>=39 && LA5_0<=40)) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==12) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:592:6: lv_statements_3_1= ruleWalkStatement
            	            {

            	            						newCompositeNode(grammarAccess.getRepeatAccess().getStatementsWalkStatementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_statements_3_1=ruleWalkStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRepeatRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_3_1,
            	            							"self_checkout_experience.SelfCheckoutExperience.WalkStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:608:6: lv_statements_3_2= rulePickStatement
            	            {

            	            						newCompositeNode(grammarAccess.getRepeatAccess().getStatementsPickStatementParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_statements_3_2=rulePickStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRepeatRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_3_2,
            	            							"self_checkout_experience.SelfCheckoutExperience.PickStatement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


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

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalSelfCheckoutExperience.g:634:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:634:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:635:2: iv_ruleMoveStatement= ruleMoveStatement EOF
            {
             newCompositeNode(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStatement=ruleMoveStatement();

            state._fsp--;

             current =iv_ruleMoveStatement; 
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
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalSelfCheckoutExperience.g:641:1: ruleMoveStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:647:2: ( ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            // InternalSelfCheckoutExperience.g:648:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            {
            // InternalSelfCheckoutExperience.g:648:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            // InternalSelfCheckoutExperience.g:649:3: ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')'
            {
            // InternalSelfCheckoutExperience.g:649:3: ( (lv_command_0_0= ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:650:4: (lv_command_0_0= ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:650:4: (lv_command_0_0= ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:651:5: lv_command_0_0= ruleMoveCommand
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_command_0_0=ruleMoveCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.MoveCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:672:3: ( (lv_steps_2_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:673:4: (lv_steps_2_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:673:4: (lv_steps_2_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:674:5: lv_steps_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_steps_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStatementRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleTurnStatement"
    // InternalSelfCheckoutExperience.g:699:1: entryRuleTurnStatement returns [EObject current=null] : iv_ruleTurnStatement= ruleTurnStatement EOF ;
    public final EObject entryRuleTurnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:699:54: (iv_ruleTurnStatement= ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:700:2: iv_ruleTurnStatement= ruleTurnStatement EOF
            {
             newCompositeNode(grammarAccess.getTurnStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnStatement=ruleTurnStatement();

            state._fsp--;

             current =iv_ruleTurnStatement; 
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
    // $ANTLR end "entryRuleTurnStatement"


    // $ANTLR start "ruleTurnStatement"
    // InternalSelfCheckoutExperience.g:706:1: ruleTurnStatement returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) ) ;
    public final EObject ruleTurnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:712:2: ( (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) ) )
            // InternalSelfCheckoutExperience.g:713:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) )
            {
            // InternalSelfCheckoutExperience.g:713:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) )
            // InternalSelfCheckoutExperience.g:714:3: otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:718:3: ( (lv_command_1_0= ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:719:4: (lv_command_1_0= ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:719:4: (lv_command_1_0= ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:720:5: lv_command_1_0= ruleTurnCommand
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_command_1_0=ruleTurnCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_1_0,
            						"self_checkout_experience.SelfCheckoutExperience.TurnCommand");
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
    // $ANTLR end "ruleTurnStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalSelfCheckoutExperience.g:741:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalSelfCheckoutExperience.g:741:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:742:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalSelfCheckoutExperience.g:748:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:754:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalSelfCheckoutExperience.g:755:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:755:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalSelfCheckoutExperience.g:756:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:764:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:765:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:765:4: ()
            	    // InternalSelfCheckoutExperience.g:766:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:772:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalSelfCheckoutExperience.g:773:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:773:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalSelfCheckoutExperience.g:774:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalSelfCheckoutExperience.g:774:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==28) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==29) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:775:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,28,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:786:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,29,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSelfCheckoutExperience.g:799:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalSelfCheckoutExperience.g:800:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalSelfCheckoutExperience.g:800:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalSelfCheckoutExperience.g:801:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"self_checkout_experience.SelfCheckoutExperience.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

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
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSelfCheckoutExperience.g:823:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSelfCheckoutExperience.g:823:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:824:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalSelfCheckoutExperience.g:830:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:836:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSelfCheckoutExperience.g:837:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:837:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSelfCheckoutExperience.g:838:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:846:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:847:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:847:4: ()
            	    // InternalSelfCheckoutExperience.g:848:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:854:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalSelfCheckoutExperience.g:855:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:855:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalSelfCheckoutExperience.g:856:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalSelfCheckoutExperience.g:856:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==30) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==31) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:857:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:868:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,31,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSelfCheckoutExperience.g:881:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSelfCheckoutExperience.g:882:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSelfCheckoutExperience.g:882:5: (lv_right_3_0= rulePrimary )
            	    // InternalSelfCheckoutExperience.g:883:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"self_checkout_experience.SelfCheckoutExperience.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalSelfCheckoutExperience.g:905:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSelfCheckoutExperience.g:905:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:906:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSelfCheckoutExperience.g:912:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:918:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalSelfCheckoutExperience.g:919:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalSelfCheckoutExperience.g:919:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:920:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:929:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:938:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalSelfCheckoutExperience.g:938:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalSelfCheckoutExperience.g:939:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalSelfCheckoutExperience.g:960:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalSelfCheckoutExperience.g:960:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:961:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalSelfCheckoutExperience.g:967:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:973:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:974:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalSelfCheckoutExperience.g:974:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:975:3: (lv_val_0_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:975:3: (lv_val_0_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:976:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalSelfCheckoutExperience.g:995:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalSelfCheckoutExperience.g:995:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:996:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalSelfCheckoutExperience.g:1002:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1008:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:1009:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:1009:2: ( (otherlv_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:1010:3: (otherlv_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:1010:3: (otherlv_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:1011:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleCheckout"
    // InternalSelfCheckoutExperience.g:1025:1: entryRuleCheckout returns [EObject current=null] : iv_ruleCheckout= ruleCheckout EOF ;
    public final EObject entryRuleCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckout = null;


        try {
            // InternalSelfCheckoutExperience.g:1025:49: (iv_ruleCheckout= ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:1026:2: iv_ruleCheckout= ruleCheckout EOF
            {
             newCompositeNode(grammarAccess.getCheckoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckout=ruleCheckout();

            state._fsp--;

             current =iv_ruleCheckout; 
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
    // $ANTLR end "entryRuleCheckout"


    // $ANTLR start "ruleCheckout"
    // InternalSelfCheckoutExperience.g:1032:1: ruleCheckout returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScan ) ) ( (lv_pay_4_0= rulePay ) ) ) ;
    public final EObject ruleCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_scan_3_0 = null;

        Enumerator lv_pay_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1038:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScan ) ) ( (lv_pay_4_0= rulePay ) ) ) )
            // InternalSelfCheckoutExperience.g:1039:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScan ) ) ( (lv_pay_4_0= rulePay ) ) )
            {
            // InternalSelfCheckoutExperience.g:1039:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScan ) ) ( (lv_pay_4_0= rulePay ) ) )
            // InternalSelfCheckoutExperience.g:1040:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScan ) ) ( (lv_pay_4_0= rulePay ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckoutAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckoutAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1052:3: ( (lv_scan_3_0= ruleScan ) )
            // InternalSelfCheckoutExperience.g:1053:4: (lv_scan_3_0= ruleScan )
            {
            // InternalSelfCheckoutExperience.g:1053:4: (lv_scan_3_0= ruleScan )
            // InternalSelfCheckoutExperience.g:1054:5: lv_scan_3_0= ruleScan
            {

            					newCompositeNode(grammarAccess.getCheckoutAccess().getScanScanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_scan_3_0=ruleScan();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckoutRule());
            					}
            					set(
            						current,
            						"scan",
            						lv_scan_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.Scan");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:1071:3: ( (lv_pay_4_0= rulePay ) )
            // InternalSelfCheckoutExperience.g:1072:4: (lv_pay_4_0= rulePay )
            {
            // InternalSelfCheckoutExperience.g:1072:4: (lv_pay_4_0= rulePay )
            // InternalSelfCheckoutExperience.g:1073:5: lv_pay_4_0= rulePay
            {

            					newCompositeNode(grammarAccess.getCheckoutAccess().getPayPayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_pay_4_0=rulePay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckoutRule());
            					}
            					set(
            						current,
            						"pay",
            						lv_pay_4_0,
            						"self_checkout_experience.SelfCheckoutExperience.Pay");
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
    // $ANTLR end "ruleCheckout"


    // $ANTLR start "entryRuleScan"
    // InternalSelfCheckoutExperience.g:1094:1: entryRuleScan returns [EObject current=null] : iv_ruleScan= ruleScan EOF ;
    public final EObject entryRuleScan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScan = null;


        try {
            // InternalSelfCheckoutExperience.g:1094:45: (iv_ruleScan= ruleScan EOF )
            // InternalSelfCheckoutExperience.g:1095:2: iv_ruleScan= ruleScan EOF
            {
             newCompositeNode(grammarAccess.getScanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScan=ruleScan();

            state._fsp--;

             current =iv_ruleScan; 
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
    // $ANTLR end "entryRuleScan"


    // $ANTLR start "ruleScan"
    // InternalSelfCheckoutExperience.g:1101:1: ruleScan returns [EObject current=null] : (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )? ) ;
    public final EObject ruleScan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scanMachine_3_0 = null;

        EObject lv_addToBag_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1107:2: ( (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )? ) )
            // InternalSelfCheckoutExperience.g:1108:2: (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )? )
            {
            // InternalSelfCheckoutExperience.g:1108:2: (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )? )
            // InternalSelfCheckoutExperience.g:1109:3: otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getScanAccess().getScanKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAccess().getBarcodeKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScanAccess().getWithKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1121:3: ( (lv_scanMachine_3_0= ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:1122:4: (lv_scanMachine_3_0= ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:1122:4: (lv_scanMachine_3_0= ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:1123:5: lv_scanMachine_3_0= ruleSelfScanner
            {

            					newCompositeNode(grammarAccess.getScanAccess().getScanMachineSelfScannerEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_scanMachine_3_0=ruleSelfScanner();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScanRule());
            					}
            					set(
            						current,
            						"scanMachine",
            						lv_scanMachine_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.SelfScanner");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:1140:3: ( (lv_addToBag_4_0= ruleAddToBag ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1141:4: (lv_addToBag_4_0= ruleAddToBag )
                    {
                    // InternalSelfCheckoutExperience.g:1141:4: (lv_addToBag_4_0= ruleAddToBag )
                    // InternalSelfCheckoutExperience.g:1142:5: lv_addToBag_4_0= ruleAddToBag
                    {

                    					newCompositeNode(grammarAccess.getScanAccess().getAddToBagAddToBagParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_addToBag_4_0=ruleAddToBag();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScanRule());
                    					}
                    					set(
                    						current,
                    						"addToBag",
                    						lv_addToBag_4_0,
                    						"self_checkout_experience.SelfCheckoutExperience.AddToBag");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleScan"


    // $ANTLR start "entryRuleAddToBag"
    // InternalSelfCheckoutExperience.g:1163:1: entryRuleAddToBag returns [EObject current=null] : iv_ruleAddToBag= ruleAddToBag EOF ;
    public final EObject entryRuleAddToBag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToBag = null;


        try {
            // InternalSelfCheckoutExperience.g:1163:49: (iv_ruleAddToBag= ruleAddToBag EOF )
            // InternalSelfCheckoutExperience.g:1164:2: iv_ruleAddToBag= ruleAddToBag EOF
            {
             newCompositeNode(grammarAccess.getAddToBagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToBag=ruleAddToBag();

            state._fsp--;

             current =iv_ruleAddToBag; 
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
    // $ANTLR end "entryRuleAddToBag"


    // $ANTLR start "ruleAddToBag"
    // InternalSelfCheckoutExperience.g:1170:1: ruleAddToBag returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'all' otherlv_2= 'items' otherlv_3= 'to' ( (lv_bag_4_0= ruleBag ) ) ) ;
    public final EObject ruleAddToBag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_bag_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1176:2: ( (otherlv_0= 'add' otherlv_1= 'all' otherlv_2= 'items' otherlv_3= 'to' ( (lv_bag_4_0= ruleBag ) ) ) )
            // InternalSelfCheckoutExperience.g:1177:2: (otherlv_0= 'add' otherlv_1= 'all' otherlv_2= 'items' otherlv_3= 'to' ( (lv_bag_4_0= ruleBag ) ) )
            {
            // InternalSelfCheckoutExperience.g:1177:2: (otherlv_0= 'add' otherlv_1= 'all' otherlv_2= 'items' otherlv_3= 'to' ( (lv_bag_4_0= ruleBag ) ) )
            // InternalSelfCheckoutExperience.g:1178:3: otherlv_0= 'add' otherlv_1= 'all' otherlv_2= 'items' otherlv_3= 'to' ( (lv_bag_4_0= ruleBag ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToBagAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAddToBagAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToBagAccess().getItemsKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getAddToBagAccess().getToKeyword_3());
            		
            // InternalSelfCheckoutExperience.g:1194:3: ( (lv_bag_4_0= ruleBag ) )
            // InternalSelfCheckoutExperience.g:1195:4: (lv_bag_4_0= ruleBag )
            {
            // InternalSelfCheckoutExperience.g:1195:4: (lv_bag_4_0= ruleBag )
            // InternalSelfCheckoutExperience.g:1196:5: lv_bag_4_0= ruleBag
            {

            					newCompositeNode(grammarAccess.getAddToBagAccess().getBagBagEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_bag_4_0=ruleBag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddToBagRule());
            					}
            					set(
            						current,
            						"bag",
            						lv_bag_4_0,
            						"self_checkout_experience.SelfCheckoutExperience.Bag");
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
    // $ANTLR end "ruleAddToBag"


    // $ANTLR start "ruleSelfScanner"
    // InternalSelfCheckoutExperience.g:1217:1: ruleSelfScanner returns [Enumerator current=null] : (enumLiteral_0= 'selfscanner' ) ;
    public final Enumerator ruleSelfScanner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1223:2: ( (enumLiteral_0= 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:1224:2: (enumLiteral_0= 'selfscanner' )
            {
            // InternalSelfCheckoutExperience.g:1224:2: (enumLiteral_0= 'selfscanner' )
            // InternalSelfCheckoutExperience.g:1225:3: enumLiteral_0= 'selfscanner'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

            			current = grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSelfScanner"


    // $ANTLR start "ruleMoveCommand"
    // InternalSelfCheckoutExperience.g:1234:1: ruleMoveCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleMoveCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1240:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalSelfCheckoutExperience.g:1241:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalSelfCheckoutExperience.g:1241:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1242:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalSelfCheckoutExperience.g:1242:3: (enumLiteral_0= 'forward' )
                    // InternalSelfCheckoutExperience.g:1243:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1250:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalSelfCheckoutExperience.g:1250:3: (enumLiteral_1= 'backward' )
                    // InternalSelfCheckoutExperience.g:1251:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMoveCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalSelfCheckoutExperience.g:1261:1: ruleTurnCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTurnCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1267:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalSelfCheckoutExperience.g:1268:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalSelfCheckoutExperience.g:1268:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            else if ( (LA14_0==42) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1269:3: (enumLiteral_0= 'left' )
                    {
                    // InternalSelfCheckoutExperience.g:1269:3: (enumLiteral_0= 'left' )
                    // InternalSelfCheckoutExperience.g:1270:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1277:3: (enumLiteral_1= 'right' )
                    {
                    // InternalSelfCheckoutExperience.g:1277:3: (enumLiteral_1= 'right' )
                    // InternalSelfCheckoutExperience.g:1278:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTurnCommand"


    // $ANTLR start "ruleBag"
    // InternalSelfCheckoutExperience.g:1288:1: ruleBag returns [Enumerator current=null] : (enumLiteral_0= 'bag' ) ;
    public final Enumerator ruleBag() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1294:2: ( (enumLiteral_0= 'bag' ) )
            // InternalSelfCheckoutExperience.g:1295:2: (enumLiteral_0= 'bag' )
            {
            // InternalSelfCheckoutExperience.g:1295:2: (enumLiteral_0= 'bag' )
            // InternalSelfCheckoutExperience.g:1296:3: enumLiteral_0= 'bag'
            {
            enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

            			current = grammarAccess.getBagAccess().getBagEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getBagAccess().getBagEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleBag"


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:1305:1: rulePay returns [Enumerator current=null] : (enumLiteral_0= 'pay' ) ;
    public final Enumerator rulePay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1311:2: ( (enumLiteral_0= 'pay' ) )
            // InternalSelfCheckoutExperience.g:1312:2: (enumLiteral_0= 'pay' )
            {
            // InternalSelfCheckoutExperience.g:1312:2: (enumLiteral_0= 'pay' )
            // InternalSelfCheckoutExperience.g:1313:3: enumLiteral_0= 'pay'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

            			current = grammarAccess.getPayAccess().getPayEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getPayAccess().getPayEnumLiteralDeclaration());
            		

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
    // $ANTLR end "rulePay"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000018108501002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000018008501000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000018009501000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});

}