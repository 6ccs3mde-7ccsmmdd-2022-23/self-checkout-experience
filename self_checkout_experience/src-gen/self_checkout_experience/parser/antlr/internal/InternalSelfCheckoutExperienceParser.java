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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pick'", "'up'", "'add'", "'to'", "'basket'", "'drop'", "'var'", "'='", "'times'", "'do'", "'end'", "'('", "')'", "'turn'", "'by'", "'degrees'", "'+'", "'-'", "'*'", "'/'", "'.'", "'go'", "'till'", "'scan'", "'at'", "'bag'", "'forward'", "'backward'", "'left'", "'right'", "'pay'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalSelfCheckoutExperience.g:72:1: ruleSelf_checkout returns [EObject current=null] : ( ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )* ( (lv_checkout_2_0= ruleCheckout ) )? ) ;
    public final EObject ruleSelf_checkout() throws RecognitionException {
        EObject current = null;

        EObject lv_pickstatemens_0_0 = null;

        EObject lv_walkstatements_1_0 = null;

        EObject lv_checkout_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:78:2: ( ( ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )* ( (lv_checkout_2_0= ruleCheckout ) )? ) )
            // InternalSelfCheckoutExperience.g:79:2: ( ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )* ( (lv_checkout_2_0= ruleCheckout ) )? )
            {
            // InternalSelfCheckoutExperience.g:79:2: ( ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )* ( (lv_checkout_2_0= ruleCheckout ) )? )
            // InternalSelfCheckoutExperience.g:80:3: ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )* ( (lv_checkout_2_0= ruleCheckout ) )?
            {
            // InternalSelfCheckoutExperience.g:80:3: ( ( (lv_pickstatemens_0_0= rulePickStatement ) ) | ( (lv_walkstatements_1_0= ruleWalkStatement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==17||LA1_0==22||LA1_0==24||LA1_0==31||(LA1_0>=37 && LA1_0<=38)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:81:4: ( (lv_pickstatemens_0_0= rulePickStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:81:4: ( (lv_pickstatemens_0_0= rulePickStatement ) )
            	    // InternalSelfCheckoutExperience.g:82:5: (lv_pickstatemens_0_0= rulePickStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:82:5: (lv_pickstatemens_0_0= rulePickStatement )
            	    // InternalSelfCheckoutExperience.g:83:6: lv_pickstatemens_0_0= rulePickStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelf_checkoutAccess().getPickstatemensPickStatementParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_pickstatemens_0_0=rulePickStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pickstatemens",
            	    							lv_pickstatemens_0_0,
            	    							"self_checkout_experience.SelfCheckoutExperience.PickStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSelfCheckoutExperience.g:101:4: ( (lv_walkstatements_1_0= ruleWalkStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:101:4: ( (lv_walkstatements_1_0= ruleWalkStatement ) )
            	    // InternalSelfCheckoutExperience.g:102:5: (lv_walkstatements_1_0= ruleWalkStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:102:5: (lv_walkstatements_1_0= ruleWalkStatement )
            	    // InternalSelfCheckoutExperience.g:103:6: lv_walkstatements_1_0= ruleWalkStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_walkstatements_1_0=ruleWalkStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"walkstatements",
            	    							lv_walkstatements_1_0,
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

            // InternalSelfCheckoutExperience.g:121:3: ( (lv_checkout_2_0= ruleCheckout ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:122:4: (lv_checkout_2_0= ruleCheckout )
                    {
                    // InternalSelfCheckoutExperience.g:122:4: (lv_checkout_2_0= ruleCheckout )
                    // InternalSelfCheckoutExperience.g:123:5: lv_checkout_2_0= ruleCheckout
                    {

                    					newCompositeNode(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_checkout_2_0=ruleCheckout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
                    					}
                    					set(
                    						current,
                    						"checkout",
                    						lv_checkout_2_0,
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


    // $ANTLR start "entryRulePickStatement"
    // InternalSelfCheckoutExperience.g:144:1: entryRulePickStatement returns [EObject current=null] : iv_rulePickStatement= rulePickStatement EOF ;
    public final EObject entryRulePickStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:144:54: (iv_rulePickStatement= rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:145:2: iv_rulePickStatement= rulePickStatement EOF
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
    // InternalSelfCheckoutExperience.g:151:1: rulePickStatement returns [EObject current=null] : (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) ) ) ;
    public final EObject rulePickStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_holdingItem_3_1 = null;

        EObject lv_holdingItem_3_2 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:157:2: ( (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) ) ) )
            // InternalSelfCheckoutExperience.g:158:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) ) )
            {
            // InternalSelfCheckoutExperience.g:158:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) ) )
            // InternalSelfCheckoutExperience.g:159:3: otherlv_0= 'pick' otherlv_1= 'up' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPickStatementAccess().getPickKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPickStatementAccess().getUpKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:167:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:168:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:168:4: (lv_name_2_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:169:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPickStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPickStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSelfCheckoutExperience.g:185:3: ( ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) ) )
            // InternalSelfCheckoutExperience.g:186:4: ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) )
            {
            // InternalSelfCheckoutExperience.g:186:4: ( (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop ) )
            // InternalSelfCheckoutExperience.g:187:5: (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop )
            {
            // InternalSelfCheckoutExperience.g:187:5: (lv_holdingItem_3_1= ruleAddToBasket | lv_holdingItem_3_2= ruleDrop )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:188:6: lv_holdingItem_3_1= ruleAddToBasket
                    {

                    						newCompositeNode(grammarAccess.getPickStatementAccess().getHoldingItemAddToBasketParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_holdingItem_3_1=ruleAddToBasket();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPickStatementRule());
                    						}
                    						set(
                    							current,
                    							"holdingItem",
                    							lv_holdingItem_3_1,
                    							"self_checkout_experience.SelfCheckoutExperience.AddToBasket");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:204:6: lv_holdingItem_3_2= ruleDrop
                    {

                    						newCompositeNode(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_holdingItem_3_2=ruleDrop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPickStatementRule());
                    						}
                    						set(
                    							current,
                    							"holdingItem",
                    							lv_holdingItem_3_2,
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


    // $ANTLR start "entryRuleAddToBasket"
    // InternalSelfCheckoutExperience.g:226:1: entryRuleAddToBasket returns [EObject current=null] : iv_ruleAddToBasket= ruleAddToBasket EOF ;
    public final EObject entryRuleAddToBasket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToBasket = null;


        try {
            // InternalSelfCheckoutExperience.g:226:52: (iv_ruleAddToBasket= ruleAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:227:2: iv_ruleAddToBasket= ruleAddToBasket EOF
            {
             newCompositeNode(grammarAccess.getAddToBasketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToBasket=ruleAddToBasket();

            state._fsp--;

             current =iv_ruleAddToBasket; 
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
    // $ANTLR end "entryRuleAddToBasket"


    // $ANTLR start "ruleAddToBasket"
    // InternalSelfCheckoutExperience.g:233:1: ruleAddToBasket returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAddToBasket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:239:2: ( (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:240:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:240:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:241:3: otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToBasketAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAddToBasketAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToBasketAccess().getBasketKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:253:3: ( (otherlv_3= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:254:4: (otherlv_3= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:254:4: (otherlv_3= RULE_ID )
            // InternalSelfCheckoutExperience.g:255:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddToBasketRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAddToBasketAccess().getItemPickStatementCrossReference_3_0());
            				

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
    // $ANTLR end "ruleAddToBasket"


    // $ANTLR start "entryRuleDrop"
    // InternalSelfCheckoutExperience.g:270:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalSelfCheckoutExperience.g:270:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:271:2: iv_ruleDrop= ruleDrop EOF
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
    // InternalSelfCheckoutExperience.g:277:1: ruleDrop returns [EObject current=null] : (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:283:2: ( (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:284:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:284:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:285:3: otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDropAccess().getDropKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:289:3: ( (otherlv_1= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:290:4: (otherlv_1= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:290:4: (otherlv_1= RULE_ID )
            // InternalSelfCheckoutExperience.g:291:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDropAccess().getItemPickStatementCrossReference_1_0());
            				

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
    // InternalSelfCheckoutExperience.g:306:1: entryRuleWalkStatement returns [EObject current=null] : iv_ruleWalkStatement= ruleWalkStatement EOF ;
    public final EObject entryRuleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalkStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:306:54: (iv_ruleWalkStatement= ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:307:2: iv_ruleWalkStatement= ruleWalkStatement EOF
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
    // InternalSelfCheckoutExperience.g:313:1: ruleWalkStatement returns [EObject current=null] : (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration ) ;
    public final EObject ruleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStatement_0 = null;

        EObject this_TurnStatement_1 = null;

        EObject this_LoopStatement_2 = null;

        EObject this_VariableDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:319:2: ( (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration ) )
            // InternalSelfCheckoutExperience.g:320:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration )
            {
            // InternalSelfCheckoutExperience.g:320:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_LoopStatement_2= ruleLoopStatement | this_VariableDeclaration_3= ruleVariableDeclaration )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 31:
                {
                alt4=3;
                }
                break;
            case 17:
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
                    // InternalSelfCheckoutExperience.g:321:3: this_MoveStatement_0= ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:330:3: this_TurnStatement_1= ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:339:3: this_LoopStatement_2= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getWalkStatementAccess().getLoopStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_2=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:348:3: this_VariableDeclaration_3= ruleVariableDeclaration
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
    // InternalSelfCheckoutExperience.g:360:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalSelfCheckoutExperience.g:360:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:361:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:367:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:373:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSelfCheckoutExperience.g:374:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSelfCheckoutExperience.g:374:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:375:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:380:4: (lv_name_1_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:401:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:402:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:402:4: (lv_value_3_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:403:5: lv_value_3_0= RULE_INT
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


    // $ANTLR start "entryRuleLoopStatement"
    // InternalSelfCheckoutExperience.g:423:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:423:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalSelfCheckoutExperience.g:424:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalSelfCheckoutExperience.g:430:1: ruleLoopStatement returns [EObject current=null] : ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleWalkStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_count_0_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:436:2: ( ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleWalkStatement ) )+ otherlv_4= 'end' ) )
            // InternalSelfCheckoutExperience.g:437:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleWalkStatement ) )+ otherlv_4= 'end' )
            {
            // InternalSelfCheckoutExperience.g:437:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleWalkStatement ) )+ otherlv_4= 'end' )
            // InternalSelfCheckoutExperience.g:438:3: ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_statements_3_0= ruleWalkStatement ) )+ otherlv_4= 'end'
            {
            // InternalSelfCheckoutExperience.g:438:3: ( (lv_count_0_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:439:4: (lv_count_0_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:439:4: (lv_count_0_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:440:5: lv_count_0_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_count_0_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getDoKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:465:3: ( (lv_statements_3_0= ruleWalkStatement ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==17||LA5_0==22||LA5_0==24||LA5_0==31||(LA5_0>=37 && LA5_0<=38)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:466:4: (lv_statements_3_0= ruleWalkStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:466:4: (lv_statements_3_0= ruleWalkStatement )
            	    // InternalSelfCheckoutExperience.g:467:5: lv_statements_3_0= ruleWalkStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsWalkStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_3_0=ruleWalkStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"self_checkout_experience.SelfCheckoutExperience.WalkStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalSelfCheckoutExperience.g:492:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:492:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:493:2: iv_ruleMoveStatement= ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:499:1: ruleMoveStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:505:2: ( ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            // InternalSelfCheckoutExperience.g:506:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            {
            // InternalSelfCheckoutExperience.g:506:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            // InternalSelfCheckoutExperience.g:507:3: ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')'
            {
            // InternalSelfCheckoutExperience.g:507:3: ( (lv_command_0_0= ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:508:4: (lv_command_0_0= ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:508:4: (lv_command_0_0= ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:509:5: lv_command_0_0= ruleMoveCommand
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:530:3: ( (lv_steps_2_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:531:4: (lv_steps_2_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:531:4: (lv_steps_2_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:532:5: lv_steps_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:557:1: entryRuleTurnStatement returns [EObject current=null] : iv_ruleTurnStatement= ruleTurnStatement EOF ;
    public final EObject entryRuleTurnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:557:54: (iv_ruleTurnStatement= ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:558:2: iv_ruleTurnStatement= ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:564:1: ruleTurnStatement returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleAddition ) ) otherlv_4= 'degrees' ) ;
    public final EObject ruleTurnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_command_1_0 = null;

        EObject lv_degrees_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:570:2: ( (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleAddition ) ) otherlv_4= 'degrees' ) )
            // InternalSelfCheckoutExperience.g:571:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleAddition ) ) otherlv_4= 'degrees' )
            {
            // InternalSelfCheckoutExperience.g:571:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleAddition ) ) otherlv_4= 'degrees' )
            // InternalSelfCheckoutExperience.g:572:3: otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) otherlv_2= 'by' ( (lv_degrees_3_0= ruleAddition ) ) otherlv_4= 'degrees'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:576:3: ( (lv_command_1_0= ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:577:4: (lv_command_1_0= ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:577:4: (lv_command_1_0= ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:578:5: lv_command_1_0= ruleTurnCommand
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnStatementAccess().getByKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:599:3: ( (lv_degrees_3_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:600:4: (lv_degrees_3_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:600:4: (lv_degrees_3_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:601:5: lv_degrees_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getTurnStatementAccess().getDegreesAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_degrees_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnStatementRule());
            					}
            					set(
            						current,
            						"degrees",
            						lv_degrees_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTurnStatementAccess().getDegreesKeyword_4());
            		

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
    // InternalSelfCheckoutExperience.g:626:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalSelfCheckoutExperience.g:626:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:627:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:633:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:639:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalSelfCheckoutExperience.g:640:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:640:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalSelfCheckoutExperience.g:641:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:649:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:650:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:650:4: ()
            	    // InternalSelfCheckoutExperience.g:651:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:657:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalSelfCheckoutExperience.g:658:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:658:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalSelfCheckoutExperience.g:659:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalSelfCheckoutExperience.g:659:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==27) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==28) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:660:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,27,FOLLOW_15); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:671:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,28,FOLLOW_15); 

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

            	    // InternalSelfCheckoutExperience.g:684:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalSelfCheckoutExperience.g:685:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalSelfCheckoutExperience.g:685:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalSelfCheckoutExperience.g:686:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop7;
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
    // InternalSelfCheckoutExperience.g:708:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSelfCheckoutExperience.g:708:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:709:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:715:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:721:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSelfCheckoutExperience.g:722:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:722:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSelfCheckoutExperience.g:723:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:731:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=29 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:732:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:732:4: ()
            	    // InternalSelfCheckoutExperience.g:733:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:739:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalSelfCheckoutExperience.g:740:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:740:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalSelfCheckoutExperience.g:741:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalSelfCheckoutExperience.g:741:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==29) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==30) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:742:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,29,FOLLOW_15); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:753:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,30,FOLLOW_15); 

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

            	    // InternalSelfCheckoutExperience.g:766:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSelfCheckoutExperience.g:767:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSelfCheckoutExperience.g:767:5: (lv_right_3_0= rulePrimary )
            	    // InternalSelfCheckoutExperience.g:768:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalSelfCheckoutExperience.g:790:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSelfCheckoutExperience.g:790:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:791:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:797:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_RealLiteral_2 = null;

        EObject this_Addition_4 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:803:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalSelfCheckoutExperience.g:804:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalSelfCheckoutExperience.g:804:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==19||LA10_1==23||(LA10_1>=26 && LA10_1<=30)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==31) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:805:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:814:3: this_IntVarExpression_1= ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:823:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:832:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalSelfCheckoutExperience.g:832:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalSelfCheckoutExperience.g:833:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalSelfCheckoutExperience.g:854:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalSelfCheckoutExperience.g:854:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:855:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:861:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:867:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:868:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalSelfCheckoutExperience.g:868:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:869:3: (lv_val_0_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:869:3: (lv_val_0_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:870:4: lv_val_0_0= RULE_INT
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


    // $ANTLR start "entryRuleRealLiteral"
    // InternalSelfCheckoutExperience.g:889:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalSelfCheckoutExperience.g:889:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalSelfCheckoutExperience.g:890:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalSelfCheckoutExperience.g:896:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:902:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalSelfCheckoutExperience.g:903:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalSelfCheckoutExperience.g:903:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalSelfCheckoutExperience.g:904:3: (lv_val_0_0= ruleREAL )
            {
            // InternalSelfCheckoutExperience.g:904:3: (lv_val_0_0= ruleREAL )
            // InternalSelfCheckoutExperience.g:905:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"self_checkout_experience.SelfCheckoutExperience.REAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalSelfCheckoutExperience.g:925:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalSelfCheckoutExperience.g:925:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:926:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:932:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:938:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:939:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:939:2: ( (otherlv_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:940:3: (otherlv_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:940:3: (otherlv_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:941:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleREAL"
    // InternalSelfCheckoutExperience.g:955:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSelfCheckoutExperience.g:957:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalSelfCheckoutExperience.g:958:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSelfCheckoutExperience.g:967:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSelfCheckoutExperience.g:974:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:975:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:975:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalSelfCheckoutExperience.g:976:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalSelfCheckoutExperience.g:976:3: (this_INT_0= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:977:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleCheckout"
    // InternalSelfCheckoutExperience.g:1004:1: entryRuleCheckout returns [EObject current=null] : iv_ruleCheckout= ruleCheckout EOF ;
    public final EObject entryRuleCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckout = null;


        try {
            // InternalSelfCheckoutExperience.g:1004:49: (iv_ruleCheckout= ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:1005:2: iv_ruleCheckout= ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:1011:1: ruleCheckout returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'till' ( (lv_scan_3_0= ruleScan ) )+ ( (lv_pay_4_0= rulePay ) ) ) ;
    public final EObject ruleCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_scan_3_0 = null;

        Enumerator lv_pay_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1017:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'till' ( (lv_scan_3_0= ruleScan ) )+ ( (lv_pay_4_0= rulePay ) ) ) )
            // InternalSelfCheckoutExperience.g:1018:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'till' ( (lv_scan_3_0= ruleScan ) )+ ( (lv_pay_4_0= rulePay ) ) )
            {
            // InternalSelfCheckoutExperience.g:1018:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'till' ( (lv_scan_3_0= ruleScan ) )+ ( (lv_pay_4_0= rulePay ) ) )
            // InternalSelfCheckoutExperience.g:1019:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'till' ( (lv_scan_3_0= ruleScan ) )+ ( (lv_pay_4_0= rulePay ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckoutAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckoutAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckoutAccess().getTillKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1031:3: ( (lv_scan_3_0= ruleScan ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1032:4: (lv_scan_3_0= ruleScan )
            	    {
            	    // InternalSelfCheckoutExperience.g:1032:4: (lv_scan_3_0= ruleScan )
            	    // InternalSelfCheckoutExperience.g:1033:5: lv_scan_3_0= ruleScan
            	    {

            	    					newCompositeNode(grammarAccess.getCheckoutAccess().getScanScanParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_scan_3_0=ruleScan();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCheckoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scan",
            	    						lv_scan_3_0,
            	    						"self_checkout_experience.SelfCheckoutExperience.Scan");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            // InternalSelfCheckoutExperience.g:1050:3: ( (lv_pay_4_0= rulePay ) )
            // InternalSelfCheckoutExperience.g:1051:4: (lv_pay_4_0= rulePay )
            {
            // InternalSelfCheckoutExperience.g:1051:4: (lv_pay_4_0= rulePay )
            // InternalSelfCheckoutExperience.g:1052:5: lv_pay_4_0= rulePay
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
    // InternalSelfCheckoutExperience.g:1073:1: entryRuleScan returns [EObject current=null] : iv_ruleScan= ruleScan EOF ;
    public final EObject entryRuleScan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScan = null;


        try {
            // InternalSelfCheckoutExperience.g:1073:45: (iv_ruleScan= ruleScan EOF )
            // InternalSelfCheckoutExperience.g:1074:2: iv_ruleScan= ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:1080:1: ruleScan returns [EObject current=null] : (otherlv_0= 'scan' otherlv_1= 'at' otherlv_2= 'till' ( (lv_name_3_0= RULE_ID ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )* ) ;
    public final EObject ruleScan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_addToBag_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1086:2: ( (otherlv_0= 'scan' otherlv_1= 'at' otherlv_2= 'till' ( (lv_name_3_0= RULE_ID ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )* ) )
            // InternalSelfCheckoutExperience.g:1087:2: (otherlv_0= 'scan' otherlv_1= 'at' otherlv_2= 'till' ( (lv_name_3_0= RULE_ID ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )* )
            {
            // InternalSelfCheckoutExperience.g:1087:2: (otherlv_0= 'scan' otherlv_1= 'at' otherlv_2= 'till' ( (lv_name_3_0= RULE_ID ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )* )
            // InternalSelfCheckoutExperience.g:1088:3: otherlv_0= 'scan' otherlv_1= 'at' otherlv_2= 'till' ( (lv_name_3_0= RULE_ID ) ) ( (lv_addToBag_4_0= ruleAddToBag ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getScanAccess().getScanKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScanAccess().getTillKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1100:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:1101:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:1101:4: (lv_name_3_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:1102:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_3_0, grammarAccess.getScanAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSelfCheckoutExperience.g:1118:3: ( (lv_addToBag_4_0= ruleAddToBag ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1119:4: (lv_addToBag_4_0= ruleAddToBag )
            	    {
            	    // InternalSelfCheckoutExperience.g:1119:4: (lv_addToBag_4_0= ruleAddToBag )
            	    // InternalSelfCheckoutExperience.g:1120:5: lv_addToBag_4_0= ruleAddToBag
            	    {

            	    					newCompositeNode(grammarAccess.getScanAccess().getAddToBagAddToBagParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_addToBag_4_0=ruleAddToBag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"addToBag",
            	    						lv_addToBag_4_0,
            	    						"self_checkout_experience.SelfCheckoutExperience.AddToBag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleScan"


    // $ANTLR start "entryRuleAddToBag"
    // InternalSelfCheckoutExperience.g:1141:1: entryRuleAddToBag returns [EObject current=null] : iv_ruleAddToBag= ruleAddToBag EOF ;
    public final EObject entryRuleAddToBag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToBag = null;


        try {
            // InternalSelfCheckoutExperience.g:1141:49: (iv_ruleAddToBag= ruleAddToBag EOF )
            // InternalSelfCheckoutExperience.g:1142:2: iv_ruleAddToBag= ruleAddToBag EOF
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
    // InternalSelfCheckoutExperience.g:1148:1: ruleAddToBag returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'bag' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAddToBag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1154:2: ( (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'bag' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:1155:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'bag' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:1155:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'bag' ( (otherlv_3= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:1156:3: otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'bag' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToBagAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getAddToBagAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToBagAccess().getBagKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1168:3: ( (otherlv_3= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:1169:4: (otherlv_3= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:1169:4: (otherlv_3= RULE_ID )
            // InternalSelfCheckoutExperience.g:1170:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddToBagRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAddToBagAccess().getBagItemScanCrossReference_3_0());
            				

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


    // $ANTLR start "ruleMoveCommand"
    // InternalSelfCheckoutExperience.g:1185:1: ruleMoveCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleMoveCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1191:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalSelfCheckoutExperience.g:1192:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalSelfCheckoutExperience.g:1192:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1193:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalSelfCheckoutExperience.g:1193:3: (enumLiteral_0= 'forward' )
                    // InternalSelfCheckoutExperience.g:1194:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1201:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalSelfCheckoutExperience.g:1201:3: (enumLiteral_1= 'backward' )
                    // InternalSelfCheckoutExperience.g:1202:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1212:1: ruleTurnCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTurnCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1218:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalSelfCheckoutExperience.g:1219:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalSelfCheckoutExperience.g:1219:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1220:3: (enumLiteral_0= 'left' )
                    {
                    // InternalSelfCheckoutExperience.g:1220:3: (enumLiteral_0= 'left' )
                    // InternalSelfCheckoutExperience.g:1221:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1228:3: (enumLiteral_1= 'right' )
                    {
                    // InternalSelfCheckoutExperience.g:1228:3: (enumLiteral_1= 'right' )
                    // InternalSelfCheckoutExperience.g:1229:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

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


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:1239:1: rulePay returns [Enumerator current=null] : (enumLiteral_0= 'pay' ) ;
    public final Enumerator rulePay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1245:2: ( (enumLiteral_0= 'pay' ) )
            // InternalSelfCheckoutExperience.g:1246:2: (enumLiteral_0= 'pay' )
            {
            // InternalSelfCheckoutExperience.g:1246:2: (enumLiteral_0= 'pay' )
            // InternalSelfCheckoutExperience.g:1247:3: enumLiteral_0= 'pay'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000006181420832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006181620830L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080400030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});

}