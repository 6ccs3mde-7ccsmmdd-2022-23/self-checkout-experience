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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'search'", "'for'", "'add'", "'to'", "'basket'", "'remove'", "'from'", "'checkout'", "'hold'", "'pick'", "'up'", "'scan'", "'and'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'('", "')'", "'turn'", "'+'", "'-'", "'*'", "'/'", "'go'", "'self-checkout'", "'then'", "'barcode'", "'with'", "'all'", "'items'", "'load_shop_site'", "'premium_delivery'", "'standard_delivery'", "'next_day_delivery'", "'confirm'", "'selfscanner'", "'forward'", "'backward'", "'left'", "'right'", "'bag'", "'pay'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalSelfCheckoutExperience.g:72:1: ruleSelf_checkout returns [EObject current=null] : ( ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) ) | ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) ) )? ;
    public final EObject ruleSelf_checkout() throws RecognitionException {
        EObject current = null;

        EObject lv_selfCheckoutOnline_0_0 = null;

        EObject lv_selfCheckoutInstore_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:78:2: ( ( ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) ) | ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) ) )? )
            // InternalSelfCheckoutExperience.g:79:2: ( ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) ) | ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) ) )?
            {
            // InternalSelfCheckoutExperience.g:79:2: ( ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) ) | ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) ) )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            switch (alt1) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:80:3: ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) )
                    {
                    // InternalSelfCheckoutExperience.g:80:3: ( (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline ) )
                    // InternalSelfCheckoutExperience.g:81:4: (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline )
                    {
                    // InternalSelfCheckoutExperience.g:81:4: (lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline )
                    // InternalSelfCheckoutExperience.g:82:5: lv_selfCheckoutOnline_0_0= ruleSelfCheckoutOnline
                    {

                    					newCompositeNode(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutOnlineSelfCheckoutOnlineParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selfCheckoutOnline_0_0=ruleSelfCheckoutOnline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
                    					}
                    					add(
                    						current,
                    						"selfCheckoutOnline",
                    						lv_selfCheckoutOnline_0_0,
                    						"self_checkout_experience.SelfCheckoutExperience.SelfCheckoutOnline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:100:3: ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) )
                    {
                    // InternalSelfCheckoutExperience.g:100:3: ( (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore ) )
                    // InternalSelfCheckoutExperience.g:101:4: (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore )
                    {
                    // InternalSelfCheckoutExperience.g:101:4: (lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore )
                    // InternalSelfCheckoutExperience.g:102:5: lv_selfCheckoutInstore_1_0= ruleSelfCheckoutInstore
                    {

                    					newCompositeNode(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutInstoreSelfCheckoutInstoreParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selfCheckoutInstore_1_0=ruleSelfCheckoutInstore();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelf_checkoutRule());
                    					}
                    					add(
                    						current,
                    						"selfCheckoutInstore",
                    						lv_selfCheckoutInstore_1_0,
                    						"self_checkout_experience.SelfCheckoutExperience.SelfCheckoutInstore");
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
    // $ANTLR end "ruleSelf_checkout"


    // $ANTLR start "entryRuleSelfCheckoutOnline"
    // InternalSelfCheckoutExperience.g:123:1: entryRuleSelfCheckoutOnline returns [EObject current=null] : iv_ruleSelfCheckoutOnline= ruleSelfCheckoutOnline EOF ;
    public final EObject entryRuleSelfCheckoutOnline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfCheckoutOnline = null;


        try {
            // InternalSelfCheckoutExperience.g:123:59: (iv_ruleSelfCheckoutOnline= ruleSelfCheckoutOnline EOF )
            // InternalSelfCheckoutExperience.g:124:2: iv_ruleSelfCheckoutOnline= ruleSelfCheckoutOnline EOF
            {
             newCompositeNode(grammarAccess.getSelfCheckoutOnlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfCheckoutOnline=ruleSelfCheckoutOnline();

            state._fsp--;

             current =iv_ruleSelfCheckoutOnline; 
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
    // $ANTLR end "entryRuleSelfCheckoutOnline"


    // $ANTLR start "ruleSelfCheckoutOnline"
    // InternalSelfCheckoutExperience.g:130:1: ruleSelfCheckoutOnline returns [EObject current=null] : ( ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) ) ( (lv_search_1_0= ruleSearch ) )* ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )? ) ;
    public final EObject ruleSelfCheckoutOnline() throws RecognitionException {
        EObject current = null;

        Enumerator lv_loadShoppingSite_0_0 = null;

        EObject lv_search_1_0 = null;

        EObject lv_onlineCheckout_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:136:2: ( ( ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) ) ( (lv_search_1_0= ruleSearch ) )* ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )? ) )
            // InternalSelfCheckoutExperience.g:137:2: ( ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) ) ( (lv_search_1_0= ruleSearch ) )* ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )? )
            {
            // InternalSelfCheckoutExperience.g:137:2: ( ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) ) ( (lv_search_1_0= ruleSearch ) )* ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )? )
            // InternalSelfCheckoutExperience.g:138:3: ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) ) ( (lv_search_1_0= ruleSearch ) )* ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )?
            {
            // InternalSelfCheckoutExperience.g:138:3: ( (lv_loadShoppingSite_0_0= ruleLoadShoppingSite ) )
            // InternalSelfCheckoutExperience.g:139:4: (lv_loadShoppingSite_0_0= ruleLoadShoppingSite )
            {
            // InternalSelfCheckoutExperience.g:139:4: (lv_loadShoppingSite_0_0= ruleLoadShoppingSite )
            // InternalSelfCheckoutExperience.g:140:5: lv_loadShoppingSite_0_0= ruleLoadShoppingSite
            {

            					newCompositeNode(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteLoadShoppingSiteEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_loadShoppingSite_0_0=ruleLoadShoppingSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelfCheckoutOnlineRule());
            					}
            					set(
            						current,
            						"loadShoppingSite",
            						lv_loadShoppingSite_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.LoadShoppingSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:157:3: ( (lv_search_1_0= ruleSearch ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:158:4: (lv_search_1_0= ruleSearch )
            	    {
            	    // InternalSelfCheckoutExperience.g:158:4: (lv_search_1_0= ruleSearch )
            	    // InternalSelfCheckoutExperience.g:159:5: lv_search_1_0= ruleSearch
            	    {

            	    					newCompositeNode(grammarAccess.getSelfCheckoutOnlineAccess().getSearchSearchParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_search_1_0=ruleSearch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelfCheckoutOnlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"search",
            	    						lv_search_1_0,
            	    						"self_checkout_experience.SelfCheckoutExperience.Search");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSelfCheckoutExperience.g:176:3: ( (lv_onlineCheckout_2_0= ruleOnlineCheckout ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:177:4: (lv_onlineCheckout_2_0= ruleOnlineCheckout )
                    {
                    // InternalSelfCheckoutExperience.g:177:4: (lv_onlineCheckout_2_0= ruleOnlineCheckout )
                    // InternalSelfCheckoutExperience.g:178:5: lv_onlineCheckout_2_0= ruleOnlineCheckout
                    {

                    					newCompositeNode(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutOnlineCheckoutParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_onlineCheckout_2_0=ruleOnlineCheckout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelfCheckoutOnlineRule());
                    					}
                    					set(
                    						current,
                    						"onlineCheckout",
                    						lv_onlineCheckout_2_0,
                    						"self_checkout_experience.SelfCheckoutExperience.OnlineCheckout");
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
    // $ANTLR end "ruleSelfCheckoutOnline"


    // $ANTLR start "entryRuleSearch"
    // InternalSelfCheckoutExperience.g:199:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalSelfCheckoutExperience.g:199:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalSelfCheckoutExperience.g:200:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalSelfCheckoutExperience.g:206:1: ruleSearch returns [EObject current=null] : (otherlv_0= 'search' otherlv_1= 'for' ( (lv_itemSearch_2_0= ruleItemDef ) ) ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )? ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_itemSearch_2_0 = null;

        EObject lv_addToOnlineBasket_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:212:2: ( (otherlv_0= 'search' otherlv_1= 'for' ( (lv_itemSearch_2_0= ruleItemDef ) ) ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )? ) )
            // InternalSelfCheckoutExperience.g:213:2: (otherlv_0= 'search' otherlv_1= 'for' ( (lv_itemSearch_2_0= ruleItemDef ) ) ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )? )
            {
            // InternalSelfCheckoutExperience.g:213:2: (otherlv_0= 'search' otherlv_1= 'for' ( (lv_itemSearch_2_0= ruleItemDef ) ) ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )? )
            // InternalSelfCheckoutExperience.g:214:3: otherlv_0= 'search' otherlv_1= 'for' ( (lv_itemSearch_2_0= ruleItemDef ) ) ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getSearchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getForKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:222:3: ( (lv_itemSearch_2_0= ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:223:4: (lv_itemSearch_2_0= ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:223:4: (lv_itemSearch_2_0= ruleItemDef )
            // InternalSelfCheckoutExperience.g:224:5: lv_itemSearch_2_0= ruleItemDef
            {

            					newCompositeNode(grammarAccess.getSearchAccess().getItemSearchItemDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_itemSearch_2_0=ruleItemDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSearchRule());
            					}
            					set(
            						current,
            						"itemSearch",
            						lv_itemSearch_2_0,
            						"self_checkout_experience.SelfCheckoutExperience.ItemDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:241:3: ( (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:242:4: (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket )
                    {
                    // InternalSelfCheckoutExperience.g:242:4: (lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket )
                    // InternalSelfCheckoutExperience.g:243:5: lv_addToOnlineBasket_3_0= ruleAddToOnlineBasket
                    {

                    					newCompositeNode(grammarAccess.getSearchAccess().getAddToOnlineBasketAddToOnlineBasketParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_addToOnlineBasket_3_0=ruleAddToOnlineBasket();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSearchRule());
                    					}
                    					set(
                    						current,
                    						"addToOnlineBasket",
                    						lv_addToOnlineBasket_3_0,
                    						"self_checkout_experience.SelfCheckoutExperience.AddToOnlineBasket");
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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleAddToOnlineBasket"
    // InternalSelfCheckoutExperience.g:264:1: entryRuleAddToOnlineBasket returns [EObject current=null] : iv_ruleAddToOnlineBasket= ruleAddToOnlineBasket EOF ;
    public final EObject entryRuleAddToOnlineBasket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToOnlineBasket = null;


        try {
            // InternalSelfCheckoutExperience.g:264:58: (iv_ruleAddToOnlineBasket= ruleAddToOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:265:2: iv_ruleAddToOnlineBasket= ruleAddToOnlineBasket EOF
            {
             newCompositeNode(grammarAccess.getAddToOnlineBasketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToOnlineBasket=ruleAddToOnlineBasket();

            state._fsp--;

             current =iv_ruleAddToOnlineBasket; 
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
    // $ANTLR end "entryRuleAddToOnlineBasket"


    // $ANTLR start "ruleAddToOnlineBasket"
    // InternalSelfCheckoutExperience.g:271:1: ruleAddToOnlineBasket returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (lv_itemCount_3_0= ruleAddition ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )? ) ;
    public final EObject ruleAddToOnlineBasket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_itemCount_3_0 = null;

        EObject lv_removeFromOnlineBasket_5_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:277:2: ( (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (lv_itemCount_3_0= ruleAddition ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )? ) )
            // InternalSelfCheckoutExperience.g:278:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (lv_itemCount_3_0= ruleAddition ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )? )
            {
            // InternalSelfCheckoutExperience.g:278:2: (otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (lv_itemCount_3_0= ruleAddition ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )? )
            // InternalSelfCheckoutExperience.g:279:3: otherlv_0= 'add' otherlv_1= 'to' otherlv_2= 'basket' ( (lv_itemCount_3_0= ruleAddition ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToOnlineBasketAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAddToOnlineBasketAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToOnlineBasketAccess().getBasketKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:291:3: ( (lv_itemCount_3_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:292:4: (lv_itemCount_3_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:292:4: (lv_itemCount_3_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:293:5: lv_itemCount_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddToOnlineBasketAccess().getItemCountAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_itemCount_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddToOnlineBasketRule());
            					}
            					set(
            						current,
            						"itemCount",
            						lv_itemCount_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:310:3: ( (otherlv_4= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:311:4: (otherlv_4= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:311:4: (otherlv_4= RULE_ID )
            // InternalSelfCheckoutExperience.g:312:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddToOnlineBasketRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_4_0());
            				

            }


            }

            // InternalSelfCheckoutExperience.g:323:3: ( (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:324:4: (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket )
                    {
                    // InternalSelfCheckoutExperience.g:324:4: (lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket )
                    // InternalSelfCheckoutExperience.g:325:5: lv_removeFromOnlineBasket_5_0= ruleRemoveFromOnlineBasket
                    {

                    					newCompositeNode(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketRemoveFromOnlineBasketParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_removeFromOnlineBasket_5_0=ruleRemoveFromOnlineBasket();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAddToOnlineBasketRule());
                    					}
                    					set(
                    						current,
                    						"removeFromOnlineBasket",
                    						lv_removeFromOnlineBasket_5_0,
                    						"self_checkout_experience.SelfCheckoutExperience.RemoveFromOnlineBasket");
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
    // $ANTLR end "ruleAddToOnlineBasket"


    // $ANTLR start "entryRuleRemoveFromOnlineBasket"
    // InternalSelfCheckoutExperience.g:346:1: entryRuleRemoveFromOnlineBasket returns [EObject current=null] : iv_ruleRemoveFromOnlineBasket= ruleRemoveFromOnlineBasket EOF ;
    public final EObject entryRuleRemoveFromOnlineBasket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveFromOnlineBasket = null;


        try {
            // InternalSelfCheckoutExperience.g:346:63: (iv_ruleRemoveFromOnlineBasket= ruleRemoveFromOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:347:2: iv_ruleRemoveFromOnlineBasket= ruleRemoveFromOnlineBasket EOF
            {
             newCompositeNode(grammarAccess.getRemoveFromOnlineBasketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveFromOnlineBasket=ruleRemoveFromOnlineBasket();

            state._fsp--;

             current =iv_ruleRemoveFromOnlineBasket; 
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
    // $ANTLR end "entryRuleRemoveFromOnlineBasket"


    // $ANTLR start "ruleRemoveFromOnlineBasket"
    // InternalSelfCheckoutExperience.g:353:1: ruleRemoveFromOnlineBasket returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'from' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRemoveFromOnlineBasket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:359:2: ( (otherlv_0= 'remove' otherlv_1= 'from' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:360:2: (otherlv_0= 'remove' otherlv_1= 'from' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:360:2: (otherlv_0= 'remove' otherlv_1= 'from' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:361:3: otherlv_0= 'remove' otherlv_1= 'from' otherlv_2= 'basket' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveFromOnlineBasketAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveFromOnlineBasketAccess().getBasketKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:373:3: ( (otherlv_3= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:374:4: (otherlv_3= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:374:4: (otherlv_3= RULE_ID )
            // InternalSelfCheckoutExperience.g:375:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveFromOnlineBasketRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRemoveFromOnlineBasket"


    // $ANTLR start "entryRuleOnlineCheckout"
    // InternalSelfCheckoutExperience.g:390:1: entryRuleOnlineCheckout returns [EObject current=null] : iv_ruleOnlineCheckout= ruleOnlineCheckout EOF ;
    public final EObject entryRuleOnlineCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlineCheckout = null;


        try {
            // InternalSelfCheckoutExperience.g:390:55: (iv_ruleOnlineCheckout= ruleOnlineCheckout EOF )
            // InternalSelfCheckoutExperience.g:391:2: iv_ruleOnlineCheckout= ruleOnlineCheckout EOF
            {
             newCompositeNode(grammarAccess.getOnlineCheckoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnlineCheckout=ruleOnlineCheckout();

            state._fsp--;

             current =iv_ruleOnlineCheckout; 
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
    // $ANTLR end "entryRuleOnlineCheckout"


    // $ANTLR start "ruleOnlineCheckout"
    // InternalSelfCheckoutExperience.g:397:1: ruleOnlineCheckout returns [EObject current=null] : (otherlv_0= 'checkout' ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) ) ( (lv_confirm_2_0= ruleConfirm ) ) ) ;
    public final EObject ruleOnlineCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_deliveryOptions_1_0 = null;

        EObject lv_confirm_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:403:2: ( (otherlv_0= 'checkout' ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) ) ( (lv_confirm_2_0= ruleConfirm ) ) ) )
            // InternalSelfCheckoutExperience.g:404:2: (otherlv_0= 'checkout' ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) ) ( (lv_confirm_2_0= ruleConfirm ) ) )
            {
            // InternalSelfCheckoutExperience.g:404:2: (otherlv_0= 'checkout' ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) ) ( (lv_confirm_2_0= ruleConfirm ) ) )
            // InternalSelfCheckoutExperience.g:405:3: otherlv_0= 'checkout' ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) ) ( (lv_confirm_2_0= ruleConfirm ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOnlineCheckoutAccess().getCheckoutKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:409:3: ( (lv_deliveryOptions_1_0= ruleDeliveryOptions ) )
            // InternalSelfCheckoutExperience.g:410:4: (lv_deliveryOptions_1_0= ruleDeliveryOptions )
            {
            // InternalSelfCheckoutExperience.g:410:4: (lv_deliveryOptions_1_0= ruleDeliveryOptions )
            // InternalSelfCheckoutExperience.g:411:5: lv_deliveryOptions_1_0= ruleDeliveryOptions
            {

            					newCompositeNode(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsDeliveryOptionsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_deliveryOptions_1_0=ruleDeliveryOptions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnlineCheckoutRule());
            					}
            					set(
            						current,
            						"deliveryOptions",
            						lv_deliveryOptions_1_0,
            						"self_checkout_experience.SelfCheckoutExperience.DeliveryOptions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:428:3: ( (lv_confirm_2_0= ruleConfirm ) )
            // InternalSelfCheckoutExperience.g:429:4: (lv_confirm_2_0= ruleConfirm )
            {
            // InternalSelfCheckoutExperience.g:429:4: (lv_confirm_2_0= ruleConfirm )
            // InternalSelfCheckoutExperience.g:430:5: lv_confirm_2_0= ruleConfirm
            {

            					newCompositeNode(grammarAccess.getOnlineCheckoutAccess().getConfirmConfirmParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_confirm_2_0=ruleConfirm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnlineCheckoutRule());
            					}
            					set(
            						current,
            						"confirm",
            						lv_confirm_2_0,
            						"self_checkout_experience.SelfCheckoutExperience.Confirm");
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
    // $ANTLR end "ruleOnlineCheckout"


    // $ANTLR start "entryRuleConfirm"
    // InternalSelfCheckoutExperience.g:451:1: entryRuleConfirm returns [EObject current=null] : iv_ruleConfirm= ruleConfirm EOF ;
    public final EObject entryRuleConfirm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfirm = null;


        try {
            // InternalSelfCheckoutExperience.g:451:48: (iv_ruleConfirm= ruleConfirm EOF )
            // InternalSelfCheckoutExperience.g:452:2: iv_ruleConfirm= ruleConfirm EOF
            {
             newCompositeNode(grammarAccess.getConfirmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfirm=ruleConfirm();

            state._fsp--;

             current =iv_ruleConfirm; 
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
    // $ANTLR end "entryRuleConfirm"


    // $ANTLR start "ruleConfirm"
    // InternalSelfCheckoutExperience.g:458:1: ruleConfirm returns [EObject current=null] : ( ( (lv_confirmEnum_0_0= ruleConfirmEnum ) ) ( (lv_pay_1_0= rulePay ) ) ) ;
    public final EObject ruleConfirm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_confirmEnum_0_0 = null;

        Enumerator lv_pay_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:464:2: ( ( ( (lv_confirmEnum_0_0= ruleConfirmEnum ) ) ( (lv_pay_1_0= rulePay ) ) ) )
            // InternalSelfCheckoutExperience.g:465:2: ( ( (lv_confirmEnum_0_0= ruleConfirmEnum ) ) ( (lv_pay_1_0= rulePay ) ) )
            {
            // InternalSelfCheckoutExperience.g:465:2: ( ( (lv_confirmEnum_0_0= ruleConfirmEnum ) ) ( (lv_pay_1_0= rulePay ) ) )
            // InternalSelfCheckoutExperience.g:466:3: ( (lv_confirmEnum_0_0= ruleConfirmEnum ) ) ( (lv_pay_1_0= rulePay ) )
            {
            // InternalSelfCheckoutExperience.g:466:3: ( (lv_confirmEnum_0_0= ruleConfirmEnum ) )
            // InternalSelfCheckoutExperience.g:467:4: (lv_confirmEnum_0_0= ruleConfirmEnum )
            {
            // InternalSelfCheckoutExperience.g:467:4: (lv_confirmEnum_0_0= ruleConfirmEnum )
            // InternalSelfCheckoutExperience.g:468:5: lv_confirmEnum_0_0= ruleConfirmEnum
            {

            					newCompositeNode(grammarAccess.getConfirmAccess().getConfirmEnumConfirmEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_confirmEnum_0_0=ruleConfirmEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfirmRule());
            					}
            					set(
            						current,
            						"confirmEnum",
            						lv_confirmEnum_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.ConfirmEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:485:3: ( (lv_pay_1_0= rulePay ) )
            // InternalSelfCheckoutExperience.g:486:4: (lv_pay_1_0= rulePay )
            {
            // InternalSelfCheckoutExperience.g:486:4: (lv_pay_1_0= rulePay )
            // InternalSelfCheckoutExperience.g:487:5: lv_pay_1_0= rulePay
            {

            					newCompositeNode(grammarAccess.getConfirmAccess().getPayPayEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pay_1_0=rulePay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfirmRule());
            					}
            					set(
            						current,
            						"pay",
            						lv_pay_1_0,
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
    // $ANTLR end "ruleConfirm"


    // $ANTLR start "entryRuleSelfCheckoutInstore"
    // InternalSelfCheckoutExperience.g:508:1: entryRuleSelfCheckoutInstore returns [EObject current=null] : iv_ruleSelfCheckoutInstore= ruleSelfCheckoutInstore EOF ;
    public final EObject entryRuleSelfCheckoutInstore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfCheckoutInstore = null;


        try {
            // InternalSelfCheckoutExperience.g:508:60: (iv_ruleSelfCheckoutInstore= ruleSelfCheckoutInstore EOF )
            // InternalSelfCheckoutExperience.g:509:2: iv_ruleSelfCheckoutInstore= ruleSelfCheckoutInstore EOF
            {
             newCompositeNode(grammarAccess.getSelfCheckoutInstoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfCheckoutInstore=ruleSelfCheckoutInstore();

            state._fsp--;

             current =iv_ruleSelfCheckoutInstore; 
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
    // $ANTLR end "entryRuleSelfCheckoutInstore"


    // $ANTLR start "ruleSelfCheckoutInstore"
    // InternalSelfCheckoutExperience.g:515:1: ruleSelfCheckoutInstore returns [EObject current=null] : ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? ) ;
    public final EObject ruleSelfCheckoutInstore() throws RecognitionException {
        EObject current = null;

        EObject lv_pickScanMachine_0_0 = null;

        EObject lv_pickstatements_1_0 = null;

        EObject lv_walkstatements_2_0 = null;

        EObject lv_checkout_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:521:2: ( ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? ) )
            // InternalSelfCheckoutExperience.g:522:2: ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? )
            {
            // InternalSelfCheckoutExperience.g:522:2: ( ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )? )
            // InternalSelfCheckoutExperience.g:523:3: ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) ) ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )* ( (lv_checkout_3_0= ruleCheckout ) )?
            {
            // InternalSelfCheckoutExperience.g:523:3: ( (lv_pickScanMachine_0_0= ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:524:4: (lv_pickScanMachine_0_0= ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:524:4: (lv_pickScanMachine_0_0= ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:525:5: lv_pickScanMachine_0_0= ruleHoldSelfScanner
            {

            					newCompositeNode(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_pickScanMachine_0_0=ruleHoldSelfScanner();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelfCheckoutInstoreRule());
            					}
            					set(
            						current,
            						"pickScanMachine",
            						lv_pickScanMachine_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.HoldSelfScanner");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:542:3: ( ( (lv_pickstatements_1_0= rulePickStatement ) ) | ( (lv_walkstatements_2_0= ruleWalkStatement ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }
                else if ( (LA6_0==25||LA6_0==27||LA6_0==32||(LA6_0>=50 && LA6_0<=51)) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:543:4: ( (lv_pickstatements_1_0= rulePickStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:543:4: ( (lv_pickstatements_1_0= rulePickStatement ) )
            	    // InternalSelfCheckoutExperience.g:544:5: (lv_pickstatements_1_0= rulePickStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:544:5: (lv_pickstatements_1_0= rulePickStatement )
            	    // InternalSelfCheckoutExperience.g:545:6: lv_pickstatements_1_0= rulePickStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelfCheckoutInstoreAccess().getPickstatementsPickStatementParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_pickstatements_1_0=rulePickStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelfCheckoutInstoreRule());
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
            	    // InternalSelfCheckoutExperience.g:563:4: ( (lv_walkstatements_2_0= ruleWalkStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:563:4: ( (lv_walkstatements_2_0= ruleWalkStatement ) )
            	    // InternalSelfCheckoutExperience.g:564:5: (lv_walkstatements_2_0= ruleWalkStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:564:5: (lv_walkstatements_2_0= ruleWalkStatement )
            	    // InternalSelfCheckoutExperience.g:565:6: lv_walkstatements_2_0= ruleWalkStatement
            	    {

            	    						newCompositeNode(grammarAccess.getSelfCheckoutInstoreAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_walkstatements_2_0=ruleWalkStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelfCheckoutInstoreRule());
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
            	    break loop6;
                }
            } while (true);

            // InternalSelfCheckoutExperience.g:583:3: ( (lv_checkout_3_0= ruleCheckout ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:584:4: (lv_checkout_3_0= ruleCheckout )
                    {
                    // InternalSelfCheckoutExperience.g:584:4: (lv_checkout_3_0= ruleCheckout )
                    // InternalSelfCheckoutExperience.g:585:5: lv_checkout_3_0= ruleCheckout
                    {

                    					newCompositeNode(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutCheckoutParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_checkout_3_0=ruleCheckout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelfCheckoutInstoreRule());
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
    // $ANTLR end "ruleSelfCheckoutInstore"


    // $ANTLR start "entryRuleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:606:1: entryRuleHoldSelfScanner returns [EObject current=null] : iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF ;
    public final EObject entryRuleHoldSelfScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldSelfScanner = null;


        try {
            // InternalSelfCheckoutExperience.g:606:56: (iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF )
            // InternalSelfCheckoutExperience.g:607:2: iv_ruleHoldSelfScanner= ruleHoldSelfScanner EOF
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
    // InternalSelfCheckoutExperience.g:613:1: ruleHoldSelfScanner returns [EObject current=null] : (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) ) ;
    public final EObject ruleHoldSelfScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_scanMachine_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:619:2: ( (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) ) )
            // InternalSelfCheckoutExperience.g:620:2: (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) )
            {
            // InternalSelfCheckoutExperience.g:620:2: (otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) ) )
            // InternalSelfCheckoutExperience.g:621:3: otherlv_0= 'hold' ( (lv_scanMachine_1_0= ruleSelfScanner ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:625:3: ( (lv_scanMachine_1_0= ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:626:4: (lv_scanMachine_1_0= ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:626:4: (lv_scanMachine_1_0= ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:627:5: lv_scanMachine_1_0= ruleSelfScanner
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
    // InternalSelfCheckoutExperience.g:648:1: entryRulePickStatement returns [EObject current=null] : iv_rulePickStatement= rulePickStatement EOF ;
    public final EObject entryRulePickStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:648:54: (iv_rulePickStatement= rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:649:2: iv_rulePickStatement= rulePickStatement EOF
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
    // InternalSelfCheckoutExperience.g:655:1: rulePickStatement returns [EObject current=null] : (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) ) ;
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
            // InternalSelfCheckoutExperience.g:661:2: ( (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) ) )
            // InternalSelfCheckoutExperience.g:662:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) )
            {
            // InternalSelfCheckoutExperience.g:662:2: (otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) ) )
            // InternalSelfCheckoutExperience.g:663:3: otherlv_0= 'pick' otherlv_1= 'up' ( (lv_itemCount_2_0= ruleAddition ) ) ( (lv_itemPicked_3_0= ruleItemDef ) ) ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPickStatementAccess().getPickKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPickStatementAccess().getUpKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:671:3: ( (lv_itemCount_2_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:672:4: (lv_itemCount_2_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:672:4: (lv_itemCount_2_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:673:5: lv_itemCount_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalSelfCheckoutExperience.g:690:3: ( (lv_itemPicked_3_0= ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:691:4: (lv_itemPicked_3_0= ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:691:4: (lv_itemPicked_3_0= ruleItemDef )
            // InternalSelfCheckoutExperience.g:692:5: lv_itemPicked_3_0= ruleItemDef
            {

            					newCompositeNode(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalSelfCheckoutExperience.g:709:3: ( ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) ) )
            // InternalSelfCheckoutExperience.g:710:4: ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) )
            {
            // InternalSelfCheckoutExperience.g:710:4: ( (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop ) )
            // InternalSelfCheckoutExperience.g:711:5: (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop )
            {
            // InternalSelfCheckoutExperience.g:711:5: (lv_holdingItem_4_1= ruleScanAndAddToBasket | lv_holdingItem_4_2= ruleDrop )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:712:6: lv_holdingItem_4_1= ruleScanAndAddToBasket
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
                    // InternalSelfCheckoutExperience.g:728:6: lv_holdingItem_4_2= ruleDrop
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
    // InternalSelfCheckoutExperience.g:750:1: entryRuleItemDef returns [EObject current=null] : iv_ruleItemDef= ruleItemDef EOF ;
    public final EObject entryRuleItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDef = null;


        try {
            // InternalSelfCheckoutExperience.g:750:48: (iv_ruleItemDef= ruleItemDef EOF )
            // InternalSelfCheckoutExperience.g:751:2: iv_ruleItemDef= ruleItemDef EOF
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
    // InternalSelfCheckoutExperience.g:757:1: ruleItemDef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:763:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:764:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:764:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:765:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:765:3: (lv_name_0_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:766:4: lv_name_0_0= RULE_ID
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
    // InternalSelfCheckoutExperience.g:785:1: entryRuleScanAndAddToBasket returns [EObject current=null] : iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF ;
    public final EObject entryRuleScanAndAddToBasket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanAndAddToBasket = null;


        try {
            // InternalSelfCheckoutExperience.g:785:59: (iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:786:2: iv_ruleScanAndAddToBasket= ruleScanAndAddToBasket EOF
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
    // InternalSelfCheckoutExperience.g:792:1: ruleScanAndAddToBasket returns [EObject current=null] : (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalSelfCheckoutExperience.g:798:2: ( (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:799:2: (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:799:2: (otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:800:3: otherlv_0= 'scan' otherlv_1= 'and' otherlv_2= 'add' otherlv_3= 'to' otherlv_4= 'basket' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4());
            		
            // InternalSelfCheckoutExperience.g:820:3: ( (otherlv_5= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:821:4: (otherlv_5= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:821:4: (otherlv_5= RULE_ID )
            // InternalSelfCheckoutExperience.g:822:5: otherlv_5= RULE_ID
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
    // InternalSelfCheckoutExperience.g:837:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalSelfCheckoutExperience.g:837:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:838:2: iv_ruleDrop= ruleDrop EOF
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
    // InternalSelfCheckoutExperience.g:844:1: ruleDrop returns [EObject current=null] : (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:850:2: ( (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSelfCheckoutExperience.g:851:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSelfCheckoutExperience.g:851:2: (otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:852:3: otherlv_0= 'drop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDropAccess().getDropKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:856:3: ( (otherlv_1= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:857:4: (otherlv_1= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:857:4: (otherlv_1= RULE_ID )
            // InternalSelfCheckoutExperience.g:858:5: otherlv_1= RULE_ID
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
    // InternalSelfCheckoutExperience.g:873:1: entryRuleWalkStatement returns [EObject current=null] : iv_ruleWalkStatement= ruleWalkStatement EOF ;
    public final EObject entryRuleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalkStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:873:54: (iv_ruleWalkStatement= ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:874:2: iv_ruleWalkStatement= ruleWalkStatement EOF
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
    // InternalSelfCheckoutExperience.g:880:1: ruleWalkStatement returns [EObject current=null] : (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration ) ;
    public final EObject ruleWalkStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveStatement_0 = null;

        EObject this_TurnStatement_1 = null;

        EObject this_Repeat_2 = null;

        EObject this_VariableDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:886:2: ( (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration ) )
            // InternalSelfCheckoutExperience.g:887:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration )
            {
            // InternalSelfCheckoutExperience.g:887:2: (this_MoveStatement_0= ruleMoveStatement | this_TurnStatement_1= ruleTurnStatement | this_Repeat_2= ruleRepeat | this_VariableDeclaration_3= ruleVariableDeclaration )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:888:3: this_MoveStatement_0= ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:897:3: this_TurnStatement_1= ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:906:3: this_Repeat_2= ruleRepeat
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
                    // InternalSelfCheckoutExperience.g:915:3: this_VariableDeclaration_3= ruleVariableDeclaration
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
    // InternalSelfCheckoutExperience.g:927:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalSelfCheckoutExperience.g:927:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:928:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:934:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:940:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSelfCheckoutExperience.g:941:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSelfCheckoutExperience.g:941:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:942:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:947:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:947:4: (lv_name_1_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:948:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:968:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:969:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:969:4: (lv_value_3_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:970:5: lv_value_3_0= RULE_INT
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
    // InternalSelfCheckoutExperience.g:990:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalSelfCheckoutExperience.g:990:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:991:2: iv_ruleRepeat= ruleRepeat EOF
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
    // InternalSelfCheckoutExperience.g:997:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' ) ;
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
            // InternalSelfCheckoutExperience.g:1003:2: ( (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' ) )
            // InternalSelfCheckoutExperience.g:1004:2: (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' )
            {
            // InternalSelfCheckoutExperience.g:1004:2: (otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end' )
            // InternalSelfCheckoutExperience.g:1005:3: otherlv_0= 'repeat' ( (lv_count_1_0= ruleAddition ) ) otherlv_2= 'times:' ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+ otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:1009:3: ( (lv_count_1_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:1010:4: (lv_count_1_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:1010:4: (lv_count_1_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:1011:5: lv_count_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getCountAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getTimesKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1032:3: ( ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||LA11_0==25||LA11_0==27||LA11_0==32||(LA11_0>=50 && LA11_0<=51)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1033:4: ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:1033:4: ( (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement ) )
            	    // InternalSelfCheckoutExperience.g:1034:5: (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement )
            	    {
            	    // InternalSelfCheckoutExperience.g:1034:5: (lv_statements_3_1= ruleWalkStatement | lv_statements_3_2= rulePickStatement )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==25||LA10_0==27||LA10_0==32||(LA10_0>=50 && LA10_0<=51)) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==20) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:1035:6: lv_statements_3_1= ruleWalkStatement
            	            {

            	            						newCompositeNode(grammarAccess.getRepeatAccess().getStatementsWalkStatementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_25);
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
            	            // InternalSelfCheckoutExperience.g:1051:6: lv_statements_3_2= rulePickStatement
            	            {

            	            						newCompositeNode(grammarAccess.getRepeatAccess().getStatementsPickStatementParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_25);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1077:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:1077:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:1078:2: iv_ruleMoveStatement= ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:1084:1: ruleMoveStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1090:2: ( ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            // InternalSelfCheckoutExperience.g:1091:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            {
            // InternalSelfCheckoutExperience.g:1091:2: ( ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')' )
            // InternalSelfCheckoutExperience.g:1092:3: ( (lv_command_0_0= ruleMoveCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleAddition ) ) otherlv_3= ')'
            {
            // InternalSelfCheckoutExperience.g:1092:3: ( (lv_command_0_0= ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:1093:4: (lv_command_0_0= ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:1093:4: (lv_command_0_0= ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:1094:5: lv_command_0_0= ruleMoveCommand
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSelfCheckoutExperience.g:1115:3: ( (lv_steps_2_0= ruleAddition ) )
            // InternalSelfCheckoutExperience.g:1116:4: (lv_steps_2_0= ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:1116:4: (lv_steps_2_0= ruleAddition )
            // InternalSelfCheckoutExperience.g:1117:5: lv_steps_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1142:1: entryRuleTurnStatement returns [EObject current=null] : iv_ruleTurnStatement= ruleTurnStatement EOF ;
    public final EObject entryRuleTurnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnStatement = null;


        try {
            // InternalSelfCheckoutExperience.g:1142:54: (iv_ruleTurnStatement= ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:1143:2: iv_ruleTurnStatement= ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:1149:1: ruleTurnStatement returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) ) ;
    public final EObject ruleTurnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1155:2: ( (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) ) )
            // InternalSelfCheckoutExperience.g:1156:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) )
            {
            // InternalSelfCheckoutExperience.g:1156:2: (otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) ) )
            // InternalSelfCheckoutExperience.g:1157:3: otherlv_0= 'turn' ( (lv_command_1_0= ruleTurnCommand ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnStatementAccess().getTurnKeyword_0());
            		
            // InternalSelfCheckoutExperience.g:1161:3: ( (lv_command_1_0= ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:1162:4: (lv_command_1_0= ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:1162:4: (lv_command_1_0= ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:1163:5: lv_command_1_0= ruleTurnCommand
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
    // InternalSelfCheckoutExperience.g:1184:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalSelfCheckoutExperience.g:1184:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:1185:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:1191:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1197:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalSelfCheckoutExperience.g:1198:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:1198:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalSelfCheckoutExperience.g:1199:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:1207:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=33 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1208:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:1208:4: ()
            	    // InternalSelfCheckoutExperience.g:1209:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:1215:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalSelfCheckoutExperience.g:1216:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:1216:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalSelfCheckoutExperience.g:1217:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalSelfCheckoutExperience.g:1217:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==33) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==34) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:1218:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,33,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:1229:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,34,FOLLOW_9); 

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

            	    // InternalSelfCheckoutExperience.g:1242:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalSelfCheckoutExperience.g:1243:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalSelfCheckoutExperience.g:1243:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalSelfCheckoutExperience.g:1244:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSelfCheckoutExperience.g:1266:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSelfCheckoutExperience.g:1266:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:1267:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:1273:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1279:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSelfCheckoutExperience.g:1280:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSelfCheckoutExperience.g:1280:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSelfCheckoutExperience.g:1281:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:1289:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1290:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:1290:4: ()
            	    // InternalSelfCheckoutExperience.g:1291:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSelfCheckoutExperience.g:1297:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalSelfCheckoutExperience.g:1298:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalSelfCheckoutExperience.g:1298:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalSelfCheckoutExperience.g:1299:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalSelfCheckoutExperience.g:1299:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==35) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==36) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSelfCheckoutExperience.g:1300:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,35,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSelfCheckoutExperience.g:1311:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,36,FOLLOW_9); 

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

            	    // InternalSelfCheckoutExperience.g:1324:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSelfCheckoutExperience.g:1325:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSelfCheckoutExperience.g:1325:5: (lv_right_3_0= rulePrimary )
            	    // InternalSelfCheckoutExperience.g:1326:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop15;
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
    // InternalSelfCheckoutExperience.g:1348:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSelfCheckoutExperience.g:1348:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:1349:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:1355:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1361:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalSelfCheckoutExperience.g:1362:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalSelfCheckoutExperience.g:1362:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1363:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:1372:3: this_IntVarExpression_1= ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:1381:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalSelfCheckoutExperience.g:1381:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalSelfCheckoutExperience.g:1382:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1403:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalSelfCheckoutExperience.g:1403:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:1404:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:1410:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1416:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalSelfCheckoutExperience.g:1417:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalSelfCheckoutExperience.g:1417:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalSelfCheckoutExperience.g:1418:3: (lv_val_0_0= RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:1418:3: (lv_val_0_0= RULE_INT )
            // InternalSelfCheckoutExperience.g:1419:4: lv_val_0_0= RULE_INT
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
    // InternalSelfCheckoutExperience.g:1438:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalSelfCheckoutExperience.g:1438:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:1439:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:1445:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1451:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:1452:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:1452:2: ( (otherlv_0= RULE_ID ) )
            // InternalSelfCheckoutExperience.g:1453:3: (otherlv_0= RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:1453:3: (otherlv_0= RULE_ID )
            // InternalSelfCheckoutExperience.g:1454:4: otherlv_0= RULE_ID
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
    // InternalSelfCheckoutExperience.g:1468:1: entryRuleCheckout returns [EObject current=null] : iv_ruleCheckout= ruleCheckout EOF ;
    public final EObject entryRuleCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckout = null;


        try {
            // InternalSelfCheckoutExperience.g:1468:49: (iv_ruleCheckout= ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:1469:2: iv_ruleCheckout= ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:1475:1: ruleCheckout returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScanExpression ) ) ( (lv_pay_4_0= rulePay ) ) ) ;
    public final EObject ruleCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_scan_3_0 = null;

        Enumerator lv_pay_4_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1481:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScanExpression ) ) ( (lv_pay_4_0= rulePay ) ) ) )
            // InternalSelfCheckoutExperience.g:1482:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScanExpression ) ) ( (lv_pay_4_0= rulePay ) ) )
            {
            // InternalSelfCheckoutExperience.g:1482:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScanExpression ) ) ( (lv_pay_4_0= rulePay ) ) )
            // InternalSelfCheckoutExperience.g:1483:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'self-checkout' ( (lv_scan_3_0= ruleScanExpression ) ) ( (lv_pay_4_0= rulePay ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckoutAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckoutAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1495:3: ( (lv_scan_3_0= ruleScanExpression ) )
            // InternalSelfCheckoutExperience.g:1496:4: (lv_scan_3_0= ruleScanExpression )
            {
            // InternalSelfCheckoutExperience.g:1496:4: (lv_scan_3_0= ruleScanExpression )
            // InternalSelfCheckoutExperience.g:1497:5: lv_scan_3_0= ruleScanExpression
            {

            					newCompositeNode(grammarAccess.getCheckoutAccess().getScanScanExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_scan_3_0=ruleScanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckoutRule());
            					}
            					set(
            						current,
            						"scan",
            						lv_scan_3_0,
            						"self_checkout_experience.SelfCheckoutExperience.ScanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelfCheckoutExperience.g:1514:3: ( (lv_pay_4_0= rulePay ) )
            // InternalSelfCheckoutExperience.g:1515:4: (lv_pay_4_0= rulePay )
            {
            // InternalSelfCheckoutExperience.g:1515:4: (lv_pay_4_0= rulePay )
            // InternalSelfCheckoutExperience.g:1516:5: lv_pay_4_0= rulePay
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


    // $ANTLR start "entryRuleScanExpression"
    // InternalSelfCheckoutExperience.g:1537:1: entryRuleScanExpression returns [EObject current=null] : iv_ruleScanExpression= ruleScanExpression EOF ;
    public final EObject entryRuleScanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanExpression = null;


        try {
            // InternalSelfCheckoutExperience.g:1537:55: (iv_ruleScanExpression= ruleScanExpression EOF )
            // InternalSelfCheckoutExperience.g:1538:2: iv_ruleScanExpression= ruleScanExpression EOF
            {
             newCompositeNode(grammarAccess.getScanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScanExpression=ruleScanExpression();

            state._fsp--;

             current =iv_ruleScanExpression; 
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
    // $ANTLR end "entryRuleScanExpression"


    // $ANTLR start "ruleScanExpression"
    // InternalSelfCheckoutExperience.g:1544:1: ruleScanExpression returns [EObject current=null] : (this_Scan_0= ruleScan ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )? ) ;
    public final EObject ruleScanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Scan_0 = null;

        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1550:2: ( (this_Scan_0= ruleScan ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )? ) )
            // InternalSelfCheckoutExperience.g:1551:2: (this_Scan_0= ruleScan ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )? )
            {
            // InternalSelfCheckoutExperience.g:1551:2: (this_Scan_0= ruleScan ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )? )
            // InternalSelfCheckoutExperience.g:1552:3: this_Scan_0= ruleScan ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )?
            {

            			newCompositeNode(grammarAccess.getScanExpressionAccess().getScanParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Scan_0=ruleScan();

            state._fsp--;


            			current = this_Scan_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSelfCheckoutExperience.g:1560:3: ( () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1561:4: () otherlv_2= 'then' ( (lv_next_3_0= ruleCarryItems ) )
                    {
                    // InternalSelfCheckoutExperience.g:1561:4: ()
                    // InternalSelfCheckoutExperience.g:1562:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getScanExpressionAccess().getThenKeyword_1_1());
                    			
                    // InternalSelfCheckoutExperience.g:1572:4: ( (lv_next_3_0= ruleCarryItems ) )
                    // InternalSelfCheckoutExperience.g:1573:5: (lv_next_3_0= ruleCarryItems )
                    {
                    // InternalSelfCheckoutExperience.g:1573:5: (lv_next_3_0= ruleCarryItems )
                    // InternalSelfCheckoutExperience.g:1574:6: lv_next_3_0= ruleCarryItems
                    {

                    						newCompositeNode(grammarAccess.getScanExpressionAccess().getNextCarryItemsParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_3_0=ruleCarryItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScanExpressionRule());
                    						}
                    						add(
                    							current,
                    							"next",
                    							lv_next_3_0,
                    							"self_checkout_experience.SelfCheckoutExperience.CarryItems");
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
    // $ANTLR end "ruleScanExpression"


    // $ANTLR start "entryRuleScan"
    // InternalSelfCheckoutExperience.g:1596:1: entryRuleScan returns [EObject current=null] : iv_ruleScan= ruleScan EOF ;
    public final EObject entryRuleScan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScan = null;


        try {
            // InternalSelfCheckoutExperience.g:1596:45: (iv_ruleScan= ruleScan EOF )
            // InternalSelfCheckoutExperience.g:1597:2: iv_ruleScan= ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:1603:1: ruleScan returns [EObject current=null] : (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ) ;
    public final EObject ruleScan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scanMachine_3_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1609:2: ( (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) ) )
            // InternalSelfCheckoutExperience.g:1610:2: (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) )
            {
            // InternalSelfCheckoutExperience.g:1610:2: (otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) ) )
            // InternalSelfCheckoutExperience.g:1611:3: otherlv_0= 'scan' otherlv_1= 'barcode' otherlv_2= 'with' ( (lv_scanMachine_3_0= ruleSelfScanner ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getScanAccess().getScanKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAccess().getBarcodeKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getScanAccess().getWithKeyword_2());
            		
            // InternalSelfCheckoutExperience.g:1623:3: ( (lv_scanMachine_3_0= ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:1624:4: (lv_scanMachine_3_0= ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:1624:4: (lv_scanMachine_3_0= ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:1625:5: lv_scanMachine_3_0= ruleSelfScanner
            {

            					newCompositeNode(grammarAccess.getScanAccess().getScanMachineSelfScannerEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleCarryItems"
    // InternalSelfCheckoutExperience.g:1646:1: entryRuleCarryItems returns [EObject current=null] : iv_ruleCarryItems= ruleCarryItems EOF ;
    public final EObject entryRuleCarryItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarryItems = null;


        try {
            // InternalSelfCheckoutExperience.g:1646:51: (iv_ruleCarryItems= ruleCarryItems EOF )
            // InternalSelfCheckoutExperience.g:1647:2: iv_ruleCarryItems= ruleCarryItems EOF
            {
             newCompositeNode(grammarAccess.getCarryItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarryItems=ruleCarryItems();

            state._fsp--;

             current =iv_ruleCarryItems; 
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
    // $ANTLR end "entryRuleCarryItems"


    // $ANTLR start "ruleCarryItems"
    // InternalSelfCheckoutExperience.g:1653:1: ruleCarryItems returns [EObject current=null] : ( ( (lv_carry_0_0= ruleCarry ) ) otherlv_1= 'all' otherlv_2= 'items' ) ;
    public final EObject ruleCarryItems() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_carry_0_0 = null;



        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1659:2: ( ( ( (lv_carry_0_0= ruleCarry ) ) otherlv_1= 'all' otherlv_2= 'items' ) )
            // InternalSelfCheckoutExperience.g:1660:2: ( ( (lv_carry_0_0= ruleCarry ) ) otherlv_1= 'all' otherlv_2= 'items' )
            {
            // InternalSelfCheckoutExperience.g:1660:2: ( ( (lv_carry_0_0= ruleCarry ) ) otherlv_1= 'all' otherlv_2= 'items' )
            // InternalSelfCheckoutExperience.g:1661:3: ( (lv_carry_0_0= ruleCarry ) ) otherlv_1= 'all' otherlv_2= 'items'
            {
            // InternalSelfCheckoutExperience.g:1661:3: ( (lv_carry_0_0= ruleCarry ) )
            // InternalSelfCheckoutExperience.g:1662:4: (lv_carry_0_0= ruleCarry )
            {
            // InternalSelfCheckoutExperience.g:1662:4: (lv_carry_0_0= ruleCarry )
            // InternalSelfCheckoutExperience.g:1663:5: lv_carry_0_0= ruleCarry
            {

            					newCompositeNode(grammarAccess.getCarryItemsAccess().getCarryCarryEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_carry_0_0=ruleCarry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarryItemsRule());
            					}
            					set(
            						current,
            						"carry",
            						lv_carry_0_0,
            						"self_checkout_experience.SelfCheckoutExperience.Carry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCarryItemsAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCarryItemsAccess().getItemsKeyword_2());
            		

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
    // $ANTLR end "ruleCarryItems"


    // $ANTLR start "ruleLoadShoppingSite"
    // InternalSelfCheckoutExperience.g:1692:1: ruleLoadShoppingSite returns [Enumerator current=null] : (enumLiteral_0= 'load_shop_site' ) ;
    public final Enumerator ruleLoadShoppingSite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1698:2: ( (enumLiteral_0= 'load_shop_site' ) )
            // InternalSelfCheckoutExperience.g:1699:2: (enumLiteral_0= 'load_shop_site' )
            {
            // InternalSelfCheckoutExperience.g:1699:2: (enumLiteral_0= 'load_shop_site' )
            // InternalSelfCheckoutExperience.g:1700:3: enumLiteral_0= 'load_shop_site'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

            			current = grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleLoadShoppingSite"


    // $ANTLR start "ruleDeliveryOptions"
    // InternalSelfCheckoutExperience.g:1709:1: ruleDeliveryOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'premium_delivery' ) | (enumLiteral_1= 'standard_delivery' ) | (enumLiteral_2= 'next_day_delivery' ) ) ;
    public final Enumerator ruleDeliveryOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1715:2: ( ( (enumLiteral_0= 'premium_delivery' ) | (enumLiteral_1= 'standard_delivery' ) | (enumLiteral_2= 'next_day_delivery' ) ) )
            // InternalSelfCheckoutExperience.g:1716:2: ( (enumLiteral_0= 'premium_delivery' ) | (enumLiteral_1= 'standard_delivery' ) | (enumLiteral_2= 'next_day_delivery' ) )
            {
            // InternalSelfCheckoutExperience.g:1716:2: ( (enumLiteral_0= 'premium_delivery' ) | (enumLiteral_1= 'standard_delivery' ) | (enumLiteral_2= 'next_day_delivery' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1717:3: (enumLiteral_0= 'premium_delivery' )
                    {
                    // InternalSelfCheckoutExperience.g:1717:3: (enumLiteral_0= 'premium_delivery' )
                    // InternalSelfCheckoutExperience.g:1718:4: enumLiteral_0= 'premium_delivery'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1725:3: (enumLiteral_1= 'standard_delivery' )
                    {
                    // InternalSelfCheckoutExperience.g:1725:3: (enumLiteral_1= 'standard_delivery' )
                    // InternalSelfCheckoutExperience.g:1726:4: enumLiteral_1= 'standard_delivery'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:1733:3: (enumLiteral_2= 'next_day_delivery' )
                    {
                    // InternalSelfCheckoutExperience.g:1733:3: (enumLiteral_2= 'next_day_delivery' )
                    // InternalSelfCheckoutExperience.g:1734:4: enumLiteral_2= 'next_day_delivery'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDeliveryOptions"


    // $ANTLR start "ruleConfirmEnum"
    // InternalSelfCheckoutExperience.g:1744:1: ruleConfirmEnum returns [Enumerator current=null] : (enumLiteral_0= 'confirm' ) ;
    public final Enumerator ruleConfirmEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1750:2: ( (enumLiteral_0= 'confirm' ) )
            // InternalSelfCheckoutExperience.g:1751:2: (enumLiteral_0= 'confirm' )
            {
            // InternalSelfCheckoutExperience.g:1751:2: (enumLiteral_0= 'confirm' )
            // InternalSelfCheckoutExperience.g:1752:3: enumLiteral_0= 'confirm'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

            			current = grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleConfirmEnum"


    // $ANTLR start "ruleSelfScanner"
    // InternalSelfCheckoutExperience.g:1761:1: ruleSelfScanner returns [Enumerator current=null] : (enumLiteral_0= 'selfscanner' ) ;
    public final Enumerator ruleSelfScanner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1767:2: ( (enumLiteral_0= 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:1768:2: (enumLiteral_0= 'selfscanner' )
            {
            // InternalSelfCheckoutExperience.g:1768:2: (enumLiteral_0= 'selfscanner' )
            // InternalSelfCheckoutExperience.g:1769:3: enumLiteral_0= 'selfscanner'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1778:1: ruleMoveCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleMoveCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1784:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalSelfCheckoutExperience.g:1785:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalSelfCheckoutExperience.g:1785:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            else if ( (LA19_0==51) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1786:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalSelfCheckoutExperience.g:1786:3: (enumLiteral_0= 'forward' )
                    // InternalSelfCheckoutExperience.g:1787:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1794:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalSelfCheckoutExperience.g:1794:3: (enumLiteral_1= 'backward' )
                    // InternalSelfCheckoutExperience.g:1795:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1805:1: ruleTurnCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTurnCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1811:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalSelfCheckoutExperience.g:1812:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalSelfCheckoutExperience.g:1812:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            else if ( (LA20_0==53) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1813:3: (enumLiteral_0= 'left' )
                    {
                    // InternalSelfCheckoutExperience.g:1813:3: (enumLiteral_0= 'left' )
                    // InternalSelfCheckoutExperience.g:1814:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1821:3: (enumLiteral_1= 'right' )
                    {
                    // InternalSelfCheckoutExperience.g:1821:3: (enumLiteral_1= 'right' )
                    // InternalSelfCheckoutExperience.g:1822:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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


    // $ANTLR start "ruleCarry"
    // InternalSelfCheckoutExperience.g:1832:1: ruleCarry returns [Enumerator current=null] : ( (enumLiteral_0= 'bag' ) | (enumLiteral_1= 'hold' ) ) ;
    public final Enumerator ruleCarry() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1838:2: ( ( (enumLiteral_0= 'bag' ) | (enumLiteral_1= 'hold' ) ) )
            // InternalSelfCheckoutExperience.g:1839:2: ( (enumLiteral_0= 'bag' ) | (enumLiteral_1= 'hold' ) )
            {
            // InternalSelfCheckoutExperience.g:1839:2: ( (enumLiteral_0= 'bag' ) | (enumLiteral_1= 'hold' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==54) ) {
                alt21=1;
            }
            else if ( (LA21_0==19) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1840:3: (enumLiteral_0= 'bag' )
                    {
                    // InternalSelfCheckoutExperience.g:1840:3: (enumLiteral_0= 'bag' )
                    // InternalSelfCheckoutExperience.g:1841:4: enumLiteral_0= 'bag'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1848:3: (enumLiteral_1= 'hold' )
                    {
                    // InternalSelfCheckoutExperience.g:1848:3: (enumLiteral_1= 'hold' )
                    // InternalSelfCheckoutExperience.g:1849:4: enumLiteral_1= 'hold'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCarry"


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:1859:1: rulePay returns [Enumerator current=null] : (enumLiteral_0= 'pay' ) ;
    public final Enumerator rulePay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSelfCheckoutExperience.g:1865:2: ( (enumLiteral_0= 'pay' ) )
            // InternalSelfCheckoutExperience.g:1866:2: (enumLiteral_0= 'pay' )
            {
            // InternalSelfCheckoutExperience.g:1866:2: (enumLiteral_0= 'pay' )
            // InternalSelfCheckoutExperience.g:1867:3: enumLiteral_0= 'pay'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C00210A100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000C00010A100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C00012A100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});

}