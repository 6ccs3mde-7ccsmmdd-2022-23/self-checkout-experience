package self_checkout_experience.ide.contentassist.antlr.internal;

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
import self_checkout_experience.services.SelfCheckoutExperienceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSelfCheckoutExperienceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load_shop_site'", "'confirm'", "'selfscanner'", "'pay'", "'+'", "'-'", "'*'", "'/'", "'premium_delivery'", "'standard_delivery'", "'next_day_delivery'", "'forward'", "'backward'", "'left'", "'right'", "'bag'", "'hold'", "'search'", "'for'", "'add'", "'to'", "'basket'", "'remove'", "'from'", "'checkout'", "'pick'", "'up'", "'scan'", "'and'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'('", "')'", "'turn'", "'go'", "'self-checkout'", "'then'", "'barcode'", "'with'", "'all'", "'items'"
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

    	public void setGrammarAccess(SelfCheckoutExperienceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSelf_checkout"
    // InternalSelfCheckoutExperience.g:53:1: entryRuleSelf_checkout : ruleSelf_checkout EOF ;
    public final void entryRuleSelf_checkout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:54:1: ( ruleSelf_checkout EOF )
            // InternalSelfCheckoutExperience.g:55:1: ruleSelf_checkout EOF
            {
             before(grammarAccess.getSelf_checkoutRule()); 
            pushFollow(FOLLOW_1);
            ruleSelf_checkout();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutRule()); 
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
    // $ANTLR end "entryRuleSelf_checkout"


    // $ANTLR start "ruleSelf_checkout"
    // InternalSelfCheckoutExperience.g:62:1: ruleSelf_checkout : ( ( rule__Self_checkout__Alternatives )? ) ;
    public final void ruleSelf_checkout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:66:2: ( ( ( rule__Self_checkout__Alternatives )? ) )
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__Alternatives )? )
            {
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__Alternatives )? )
            // InternalSelfCheckoutExperience.g:68:3: ( rule__Self_checkout__Alternatives )?
            {
             before(grammarAccess.getSelf_checkoutAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:69:3: ( rule__Self_checkout__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:69:4: rule__Self_checkout__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelf_checkoutAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelf_checkout"


    // $ANTLR start "entryRuleSelfCheckoutOnline"
    // InternalSelfCheckoutExperience.g:78:1: entryRuleSelfCheckoutOnline : ruleSelfCheckoutOnline EOF ;
    public final void entryRuleSelfCheckoutOnline() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:79:1: ( ruleSelfCheckoutOnline EOF )
            // InternalSelfCheckoutExperience.g:80:1: ruleSelfCheckoutOnline EOF
            {
             before(grammarAccess.getSelfCheckoutOnlineRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfCheckoutOnline();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutOnlineRule()); 
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
    // $ANTLR end "entryRuleSelfCheckoutOnline"


    // $ANTLR start "ruleSelfCheckoutOnline"
    // InternalSelfCheckoutExperience.g:87:1: ruleSelfCheckoutOnline : ( ( rule__SelfCheckoutOnline__Group__0 ) ) ;
    public final void ruleSelfCheckoutOnline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:91:2: ( ( ( rule__SelfCheckoutOnline__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__SelfCheckoutOnline__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__SelfCheckoutOnline__Group__0 ) )
            // InternalSelfCheckoutExperience.g:93:3: ( rule__SelfCheckoutOnline__Group__0 )
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:94:3: ( rule__SelfCheckoutOnline__Group__0 )
            // InternalSelfCheckoutExperience.g:94:4: rule__SelfCheckoutOnline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutOnline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutOnlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfCheckoutOnline"


    // $ANTLR start "entryRuleSearch"
    // InternalSelfCheckoutExperience.g:103:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:104:1: ( ruleSearch EOF )
            // InternalSelfCheckoutExperience.g:105:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalSelfCheckoutExperience.g:112:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:116:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__Search__Group__0 ) )
            // InternalSelfCheckoutExperience.g:118:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:119:3: ( rule__Search__Group__0 )
            // InternalSelfCheckoutExperience.g:119:4: rule__Search__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleAddToOnlineBasket"
    // InternalSelfCheckoutExperience.g:128:1: entryRuleAddToOnlineBasket : ruleAddToOnlineBasket EOF ;
    public final void entryRuleAddToOnlineBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:129:1: ( ruleAddToOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:130:1: ruleAddToOnlineBasket EOF
            {
             before(grammarAccess.getAddToOnlineBasketRule()); 
            pushFollow(FOLLOW_1);
            ruleAddToOnlineBasket();

            state._fsp--;

             after(grammarAccess.getAddToOnlineBasketRule()); 
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
    // $ANTLR end "entryRuleAddToOnlineBasket"


    // $ANTLR start "ruleAddToOnlineBasket"
    // InternalSelfCheckoutExperience.g:137:1: ruleAddToOnlineBasket : ( ( rule__AddToOnlineBasket__Group__0 ) ) ;
    public final void ruleAddToOnlineBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:141:2: ( ( ( rule__AddToOnlineBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__AddToOnlineBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__AddToOnlineBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:143:3: ( rule__AddToOnlineBasket__Group__0 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:144:3: ( rule__AddToOnlineBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:144:4: rule__AddToOnlineBasket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToOnlineBasketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddToOnlineBasket"


    // $ANTLR start "entryRuleRemoveFromOnlineBasket"
    // InternalSelfCheckoutExperience.g:153:1: entryRuleRemoveFromOnlineBasket : ruleRemoveFromOnlineBasket EOF ;
    public final void entryRuleRemoveFromOnlineBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:154:1: ( ruleRemoveFromOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:155:1: ruleRemoveFromOnlineBasket EOF
            {
             before(grammarAccess.getRemoveFromOnlineBasketRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveFromOnlineBasket();

            state._fsp--;

             after(grammarAccess.getRemoveFromOnlineBasketRule()); 
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
    // $ANTLR end "entryRuleRemoveFromOnlineBasket"


    // $ANTLR start "ruleRemoveFromOnlineBasket"
    // InternalSelfCheckoutExperience.g:162:1: ruleRemoveFromOnlineBasket : ( ( rule__RemoveFromOnlineBasket__Group__0 ) ) ;
    public final void ruleRemoveFromOnlineBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:166:2: ( ( ( rule__RemoveFromOnlineBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__RemoveFromOnlineBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__RemoveFromOnlineBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:168:3: ( rule__RemoveFromOnlineBasket__Group__0 )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:169:3: ( rule__RemoveFromOnlineBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:169:4: rule__RemoveFromOnlineBasket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveFromOnlineBasketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveFromOnlineBasket"


    // $ANTLR start "entryRuleOnlineCheckout"
    // InternalSelfCheckoutExperience.g:178:1: entryRuleOnlineCheckout : ruleOnlineCheckout EOF ;
    public final void entryRuleOnlineCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:179:1: ( ruleOnlineCheckout EOF )
            // InternalSelfCheckoutExperience.g:180:1: ruleOnlineCheckout EOF
            {
             before(grammarAccess.getOnlineCheckoutRule()); 
            pushFollow(FOLLOW_1);
            ruleOnlineCheckout();

            state._fsp--;

             after(grammarAccess.getOnlineCheckoutRule()); 
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
    // $ANTLR end "entryRuleOnlineCheckout"


    // $ANTLR start "ruleOnlineCheckout"
    // InternalSelfCheckoutExperience.g:187:1: ruleOnlineCheckout : ( ( rule__OnlineCheckout__Group__0 ) ) ;
    public final void ruleOnlineCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:191:2: ( ( ( rule__OnlineCheckout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__OnlineCheckout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__OnlineCheckout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:193:3: ( rule__OnlineCheckout__Group__0 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:194:3: ( rule__OnlineCheckout__Group__0 )
            // InternalSelfCheckoutExperience.g:194:4: rule__OnlineCheckout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlineCheckoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnlineCheckout"


    // $ANTLR start "entryRuleConfirm"
    // InternalSelfCheckoutExperience.g:203:1: entryRuleConfirm : ruleConfirm EOF ;
    public final void entryRuleConfirm() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:204:1: ( ruleConfirm EOF )
            // InternalSelfCheckoutExperience.g:205:1: ruleConfirm EOF
            {
             before(grammarAccess.getConfirmRule()); 
            pushFollow(FOLLOW_1);
            ruleConfirm();

            state._fsp--;

             after(grammarAccess.getConfirmRule()); 
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
    // $ANTLR end "entryRuleConfirm"


    // $ANTLR start "ruleConfirm"
    // InternalSelfCheckoutExperience.g:212:1: ruleConfirm : ( ( rule__Confirm__Group__0 ) ) ;
    public final void ruleConfirm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:216:2: ( ( ( rule__Confirm__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__Confirm__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__Confirm__Group__0 ) )
            // InternalSelfCheckoutExperience.g:218:3: ( rule__Confirm__Group__0 )
            {
             before(grammarAccess.getConfirmAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:219:3: ( rule__Confirm__Group__0 )
            // InternalSelfCheckoutExperience.g:219:4: rule__Confirm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Confirm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfirm"


    // $ANTLR start "entryRuleSelfCheckoutInstore"
    // InternalSelfCheckoutExperience.g:228:1: entryRuleSelfCheckoutInstore : ruleSelfCheckoutInstore EOF ;
    public final void entryRuleSelfCheckoutInstore() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:229:1: ( ruleSelfCheckoutInstore EOF )
            // InternalSelfCheckoutExperience.g:230:1: ruleSelfCheckoutInstore EOF
            {
             before(grammarAccess.getSelfCheckoutInstoreRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfCheckoutInstore();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutInstoreRule()); 
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
    // $ANTLR end "entryRuleSelfCheckoutInstore"


    // $ANTLR start "ruleSelfCheckoutInstore"
    // InternalSelfCheckoutExperience.g:237:1: ruleSelfCheckoutInstore : ( ( rule__SelfCheckoutInstore__Group__0 ) ) ;
    public final void ruleSelfCheckoutInstore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:241:2: ( ( ( rule__SelfCheckoutInstore__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__SelfCheckoutInstore__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__SelfCheckoutInstore__Group__0 ) )
            // InternalSelfCheckoutExperience.g:243:3: ( rule__SelfCheckoutInstore__Group__0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:244:3: ( rule__SelfCheckoutInstore__Group__0 )
            // InternalSelfCheckoutExperience.g:244:4: rule__SelfCheckoutInstore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutInstoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfCheckoutInstore"


    // $ANTLR start "entryRuleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:253:1: entryRuleHoldSelfScanner : ruleHoldSelfScanner EOF ;
    public final void entryRuleHoldSelfScanner() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:254:1: ( ruleHoldSelfScanner EOF )
            // InternalSelfCheckoutExperience.g:255:1: ruleHoldSelfScanner EOF
            {
             before(grammarAccess.getHoldSelfScannerRule()); 
            pushFollow(FOLLOW_1);
            ruleHoldSelfScanner();

            state._fsp--;

             after(grammarAccess.getHoldSelfScannerRule()); 
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
    // $ANTLR end "entryRuleHoldSelfScanner"


    // $ANTLR start "ruleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:262:1: ruleHoldSelfScanner : ( ( rule__HoldSelfScanner__Group__0 ) ) ;
    public final void ruleHoldSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:266:2: ( ( ( rule__HoldSelfScanner__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            // InternalSelfCheckoutExperience.g:268:3: ( rule__HoldSelfScanner__Group__0 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:269:3: ( rule__HoldSelfScanner__Group__0 )
            // InternalSelfCheckoutExperience.g:269:4: rule__HoldSelfScanner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HoldSelfScanner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoldSelfScannerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHoldSelfScanner"


    // $ANTLR start "entryRulePickStatement"
    // InternalSelfCheckoutExperience.g:278:1: entryRulePickStatement : rulePickStatement EOF ;
    public final void entryRulePickStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:279:1: ( rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:280:1: rulePickStatement EOF
            {
             before(grammarAccess.getPickStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePickStatement();

            state._fsp--;

             after(grammarAccess.getPickStatementRule()); 
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
    // $ANTLR end "entryRulePickStatement"


    // $ANTLR start "rulePickStatement"
    // InternalSelfCheckoutExperience.g:287:1: rulePickStatement : ( ( rule__PickStatement__Group__0 ) ) ;
    public final void rulePickStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:291:2: ( ( ( rule__PickStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__PickStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__PickStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:293:3: ( rule__PickStatement__Group__0 )
            {
             before(grammarAccess.getPickStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:294:3: ( rule__PickStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:294:4: rule__PickStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePickStatement"


    // $ANTLR start "entryRuleItemDef"
    // InternalSelfCheckoutExperience.g:303:1: entryRuleItemDef : ruleItemDef EOF ;
    public final void entryRuleItemDef() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:304:1: ( ruleItemDef EOF )
            // InternalSelfCheckoutExperience.g:305:1: ruleItemDef EOF
            {
             before(grammarAccess.getItemDefRule()); 
            pushFollow(FOLLOW_1);
            ruleItemDef();

            state._fsp--;

             after(grammarAccess.getItemDefRule()); 
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
    // $ANTLR end "entryRuleItemDef"


    // $ANTLR start "ruleItemDef"
    // InternalSelfCheckoutExperience.g:312:1: ruleItemDef : ( ( rule__ItemDef__NameAssignment ) ) ;
    public final void ruleItemDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:316:2: ( ( ( rule__ItemDef__NameAssignment ) ) )
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__ItemDef__NameAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__ItemDef__NameAssignment ) )
            // InternalSelfCheckoutExperience.g:318:3: ( rule__ItemDef__NameAssignment )
            {
             before(grammarAccess.getItemDefAccess().getNameAssignment()); 
            // InternalSelfCheckoutExperience.g:319:3: ( rule__ItemDef__NameAssignment )
            // InternalSelfCheckoutExperience.g:319:4: rule__ItemDef__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ItemDef__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemDefAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemDef"


    // $ANTLR start "entryRuleScanAndAddToBasket"
    // InternalSelfCheckoutExperience.g:328:1: entryRuleScanAndAddToBasket : ruleScanAndAddToBasket EOF ;
    public final void entryRuleScanAndAddToBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:329:1: ( ruleScanAndAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:330:1: ruleScanAndAddToBasket EOF
            {
             before(grammarAccess.getScanAndAddToBasketRule()); 
            pushFollow(FOLLOW_1);
            ruleScanAndAddToBasket();

            state._fsp--;

             after(grammarAccess.getScanAndAddToBasketRule()); 
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
    // $ANTLR end "entryRuleScanAndAddToBasket"


    // $ANTLR start "ruleScanAndAddToBasket"
    // InternalSelfCheckoutExperience.g:337:1: ruleScanAndAddToBasket : ( ( rule__ScanAndAddToBasket__Group__0 ) ) ;
    public final void ruleScanAndAddToBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:341:2: ( ( ( rule__ScanAndAddToBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:343:3: ( rule__ScanAndAddToBasket__Group__0 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:344:3: ( rule__ScanAndAddToBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:344:4: rule__ScanAndAddToBasket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScanAndAddToBasketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScanAndAddToBasket"


    // $ANTLR start "entryRuleDrop"
    // InternalSelfCheckoutExperience.g:353:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:354:1: ( ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:355:1: ruleDrop EOF
            {
             before(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            ruleDrop();

            state._fsp--;

             after(grammarAccess.getDropRule()); 
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
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalSelfCheckoutExperience.g:362:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:366:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__Drop__Group__0 ) )
            // InternalSelfCheckoutExperience.g:368:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:369:3: ( rule__Drop__Group__0 )
            // InternalSelfCheckoutExperience.g:369:4: rule__Drop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleWalkStatement"
    // InternalSelfCheckoutExperience.g:378:1: entryRuleWalkStatement : ruleWalkStatement EOF ;
    public final void entryRuleWalkStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:379:1: ( ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:380:1: ruleWalkStatement EOF
            {
             before(grammarAccess.getWalkStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWalkStatement();

            state._fsp--;

             after(grammarAccess.getWalkStatementRule()); 
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
    // $ANTLR end "entryRuleWalkStatement"


    // $ANTLR start "ruleWalkStatement"
    // InternalSelfCheckoutExperience.g:387:1: ruleWalkStatement : ( ( rule__WalkStatement__Alternatives ) ) ;
    public final void ruleWalkStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:391:2: ( ( ( rule__WalkStatement__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__WalkStatement__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__WalkStatement__Alternatives ) )
            // InternalSelfCheckoutExperience.g:393:3: ( rule__WalkStatement__Alternatives )
            {
             before(grammarAccess.getWalkStatementAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:394:3: ( rule__WalkStatement__Alternatives )
            // InternalSelfCheckoutExperience.g:394:4: rule__WalkStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WalkStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWalkStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWalkStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSelfCheckoutExperience.g:403:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:404:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:405:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSelfCheckoutExperience.g:412:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:416:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckoutExperience.g:418:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:419:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckoutExperience.g:419:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleRepeat"
    // InternalSelfCheckoutExperience.g:428:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:429:1: ( ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:430:1: ruleRepeat EOF
            {
             before(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            ruleRepeat();

            state._fsp--;

             after(grammarAccess.getRepeatRule()); 
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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalSelfCheckoutExperience.g:437:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:441:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__Repeat__Group__0 ) )
            // InternalSelfCheckoutExperience.g:443:3: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:444:3: ( rule__Repeat__Group__0 )
            // InternalSelfCheckoutExperience.g:444:4: rule__Repeat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalSelfCheckoutExperience.g:453:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:454:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:455:1: ruleMoveStatement EOF
            {
             before(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveStatement();

            state._fsp--;

             after(grammarAccess.getMoveStatementRule()); 
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
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalSelfCheckoutExperience.g:462:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:466:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:468:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:469:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:469:4: rule__MoveStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleTurnStatement"
    // InternalSelfCheckoutExperience.g:478:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:479:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:480:1: ruleTurnStatement EOF
            {
             before(grammarAccess.getTurnStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnStatement();

            state._fsp--;

             after(grammarAccess.getTurnStatementRule()); 
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
    // $ANTLR end "entryRuleTurnStatement"


    // $ANTLR start "ruleTurnStatement"
    // InternalSelfCheckoutExperience.g:487:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:491:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:493:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:494:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:494:4: rule__TurnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalSelfCheckoutExperience.g:503:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:504:1: ( ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:505:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalSelfCheckoutExperience.g:512:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:516:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckoutExperience.g:518:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:519:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckoutExperience.g:519:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSelfCheckoutExperience.g:528:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:529:1: ( ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:530:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalSelfCheckoutExperience.g:537:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:541:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckoutExperience.g:543:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:544:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckoutExperience.g:544:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalSelfCheckoutExperience.g:553:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:554:1: ( rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:555:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSelfCheckoutExperience.g:562:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:566:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckoutExperience.g:568:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:569:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckoutExperience.g:569:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalSelfCheckoutExperience.g:578:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:579:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:580:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalSelfCheckoutExperience.g:587:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:591:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:593:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:594:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:594:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalSelfCheckoutExperience.g:603:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:604:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:605:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalSelfCheckoutExperience.g:612:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:616:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:618:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:619:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:619:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleCheckout"
    // InternalSelfCheckoutExperience.g:628:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:629:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:630:1: ruleCheckout EOF
            {
             before(grammarAccess.getCheckoutRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckout();

            state._fsp--;

             after(grammarAccess.getCheckoutRule()); 
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
    // $ANTLR end "entryRuleCheckout"


    // $ANTLR start "ruleCheckout"
    // InternalSelfCheckoutExperience.g:637:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:641:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:643:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:644:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:644:4: rule__Checkout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckout"


    // $ANTLR start "entryRuleScanExpression"
    // InternalSelfCheckoutExperience.g:653:1: entryRuleScanExpression : ruleScanExpression EOF ;
    public final void entryRuleScanExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:654:1: ( ruleScanExpression EOF )
            // InternalSelfCheckoutExperience.g:655:1: ruleScanExpression EOF
            {
             before(grammarAccess.getScanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleScanExpression();

            state._fsp--;

             after(grammarAccess.getScanExpressionRule()); 
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
    // $ANTLR end "entryRuleScanExpression"


    // $ANTLR start "ruleScanExpression"
    // InternalSelfCheckoutExperience.g:662:1: ruleScanExpression : ( ( rule__ScanExpression__Group__0 ) ) ;
    public final void ruleScanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:666:2: ( ( ( rule__ScanExpression__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:667:2: ( ( rule__ScanExpression__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:667:2: ( ( rule__ScanExpression__Group__0 ) )
            // InternalSelfCheckoutExperience.g:668:3: ( rule__ScanExpression__Group__0 )
            {
             before(grammarAccess.getScanExpressionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:669:3: ( rule__ScanExpression__Group__0 )
            // InternalSelfCheckoutExperience.g:669:4: rule__ScanExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScanExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScanExpression"


    // $ANTLR start "entryRuleScan"
    // InternalSelfCheckoutExperience.g:678:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:679:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:680:1: ruleScan EOF
            {
             before(grammarAccess.getScanRule()); 
            pushFollow(FOLLOW_1);
            ruleScan();

            state._fsp--;

             after(grammarAccess.getScanRule()); 
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
    // $ANTLR end "entryRuleScan"


    // $ANTLR start "ruleScan"
    // InternalSelfCheckoutExperience.g:687:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:691:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:692:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:692:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:693:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:694:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:694:4: rule__Scan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScan"


    // $ANTLR start "entryRuleCarryItems"
    // InternalSelfCheckoutExperience.g:703:1: entryRuleCarryItems : ruleCarryItems EOF ;
    public final void entryRuleCarryItems() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:704:1: ( ruleCarryItems EOF )
            // InternalSelfCheckoutExperience.g:705:1: ruleCarryItems EOF
            {
             before(grammarAccess.getCarryItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleCarryItems();

            state._fsp--;

             after(grammarAccess.getCarryItemsRule()); 
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
    // $ANTLR end "entryRuleCarryItems"


    // $ANTLR start "ruleCarryItems"
    // InternalSelfCheckoutExperience.g:712:1: ruleCarryItems : ( ( rule__CarryItems__Group__0 ) ) ;
    public final void ruleCarryItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:716:2: ( ( ( rule__CarryItems__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:717:2: ( ( rule__CarryItems__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:717:2: ( ( rule__CarryItems__Group__0 ) )
            // InternalSelfCheckoutExperience.g:718:3: ( rule__CarryItems__Group__0 )
            {
             before(grammarAccess.getCarryItemsAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:719:3: ( rule__CarryItems__Group__0 )
            // InternalSelfCheckoutExperience.g:719:4: rule__CarryItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CarryItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarryItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarryItems"


    // $ANTLR start "ruleLoadShoppingSite"
    // InternalSelfCheckoutExperience.g:728:1: ruleLoadShoppingSite : ( ( 'load_shop_site' ) ) ;
    public final void ruleLoadShoppingSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:732:1: ( ( ( 'load_shop_site' ) ) )
            // InternalSelfCheckoutExperience.g:733:2: ( ( 'load_shop_site' ) )
            {
            // InternalSelfCheckoutExperience.g:733:2: ( ( 'load_shop_site' ) )
            // InternalSelfCheckoutExperience.g:734:3: ( 'load_shop_site' )
            {
             before(grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:735:3: ( 'load_shop_site' )
            // InternalSelfCheckoutExperience.g:735:4: 'load_shop_site'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadShoppingSite"


    // $ANTLR start "ruleDeliveryOptions"
    // InternalSelfCheckoutExperience.g:744:1: ruleDeliveryOptions : ( ( rule__DeliveryOptions__Alternatives ) ) ;
    public final void ruleDeliveryOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:748:1: ( ( ( rule__DeliveryOptions__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:749:2: ( ( rule__DeliveryOptions__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:749:2: ( ( rule__DeliveryOptions__Alternatives ) )
            // InternalSelfCheckoutExperience.g:750:3: ( rule__DeliveryOptions__Alternatives )
            {
             before(grammarAccess.getDeliveryOptionsAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:751:3: ( rule__DeliveryOptions__Alternatives )
            // InternalSelfCheckoutExperience.g:751:4: rule__DeliveryOptions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryOptions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryOptionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryOptions"


    // $ANTLR start "ruleConfirmEnum"
    // InternalSelfCheckoutExperience.g:760:1: ruleConfirmEnum : ( ( 'confirm' ) ) ;
    public final void ruleConfirmEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:764:1: ( ( ( 'confirm' ) ) )
            // InternalSelfCheckoutExperience.g:765:2: ( ( 'confirm' ) )
            {
            // InternalSelfCheckoutExperience.g:765:2: ( ( 'confirm' ) )
            // InternalSelfCheckoutExperience.g:766:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:767:3: ( 'confirm' )
            // InternalSelfCheckoutExperience.g:767:4: 'confirm'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfirmEnum"


    // $ANTLR start "ruleSelfScanner"
    // InternalSelfCheckoutExperience.g:776:1: ruleSelfScanner : ( ( 'selfscanner' ) ) ;
    public final void ruleSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:780:1: ( ( ( 'selfscanner' ) ) )
            // InternalSelfCheckoutExperience.g:781:2: ( ( 'selfscanner' ) )
            {
            // InternalSelfCheckoutExperience.g:781:2: ( ( 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:782:3: ( 'selfscanner' )
            {
             before(grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:783:3: ( 'selfscanner' )
            // InternalSelfCheckoutExperience.g:783:4: 'selfscanner'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfScanner"


    // $ANTLR start "ruleMoveCommand"
    // InternalSelfCheckoutExperience.g:792:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:796:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:797:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:797:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:798:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:799:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:799:4: rule__MoveCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalSelfCheckoutExperience.g:808:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:812:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:813:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:813:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:814:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:815:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:815:4: rule__TurnCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TurnCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTurnCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnCommand"


    // $ANTLR start "ruleCarry"
    // InternalSelfCheckoutExperience.g:824:1: ruleCarry : ( ( rule__Carry__Alternatives ) ) ;
    public final void ruleCarry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:828:1: ( ( ( rule__Carry__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:829:2: ( ( rule__Carry__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:829:2: ( ( rule__Carry__Alternatives ) )
            // InternalSelfCheckoutExperience.g:830:3: ( rule__Carry__Alternatives )
            {
             before(grammarAccess.getCarryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:831:3: ( rule__Carry__Alternatives )
            // InternalSelfCheckoutExperience.g:831:4: rule__Carry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Carry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCarryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarry"


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:840:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:844:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:845:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:845:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:846:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:847:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:847:4: 'pay'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePay"


    // $ANTLR start "rule__Self_checkout__Alternatives"
    // InternalSelfCheckoutExperience.g:855:1: rule__Self_checkout__Alternatives : ( ( ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 ) ) | ( ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 ) ) );
    public final void rule__Self_checkout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:859:1: ( ( ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 ) ) | ( ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:860:2: ( ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:860:2: ( ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 ) )
                    // InternalSelfCheckoutExperience.g:861:3: ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutOnlineAssignment_0()); 
                    // InternalSelfCheckoutExperience.g:862:3: ( rule__Self_checkout__SelfCheckoutOnlineAssignment_0 )
                    // InternalSelfCheckoutExperience.g:862:4: rule__Self_checkout__SelfCheckoutOnlineAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__SelfCheckoutOnlineAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutOnlineAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:866:2: ( ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 ) )
                    {
                    // InternalSelfCheckoutExperience.g:866:2: ( ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 ) )
                    // InternalSelfCheckoutExperience.g:867:3: ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutInstoreAssignment_1()); 
                    // InternalSelfCheckoutExperience.g:868:3: ( rule__Self_checkout__SelfCheckoutInstoreAssignment_1 )
                    // InternalSelfCheckoutExperience.g:868:4: rule__Self_checkout__SelfCheckoutInstoreAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__SelfCheckoutInstoreAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutInstoreAssignment_1()); 

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
    // $ANTLR end "rule__Self_checkout__Alternatives"


    // $ANTLR start "rule__SelfCheckoutInstore__Alternatives_1"
    // InternalSelfCheckoutExperience.g:876:1: rule__SelfCheckoutInstore__Alternatives_1 : ( ( ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 ) ) | ( ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 ) ) );
    public final void rule__SelfCheckoutInstore__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:880:1: ( ( ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 ) ) | ( ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=22 && LA3_0<=23)||LA3_0==41||LA3_0==43||LA3_0==48) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:881:2: ( ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:881:2: ( ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 ) )
                    // InternalSelfCheckoutExperience.g:882:3: ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 )
                    {
                     before(grammarAccess.getSelfCheckoutInstoreAccess().getPickstatementsAssignment_1_0()); 
                    // InternalSelfCheckoutExperience.g:883:3: ( rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 )
                    // InternalSelfCheckoutExperience.g:883:4: rule__SelfCheckoutInstore__PickstatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfCheckoutInstore__PickstatementsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelfCheckoutInstoreAccess().getPickstatementsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:887:2: ( ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 ) )
                    {
                    // InternalSelfCheckoutExperience.g:887:2: ( ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 ) )
                    // InternalSelfCheckoutExperience.g:888:3: ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getSelfCheckoutInstoreAccess().getWalkstatementsAssignment_1_1()); 
                    // InternalSelfCheckoutExperience.g:889:3: ( rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 )
                    // InternalSelfCheckoutExperience.g:889:4: rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelfCheckoutInstoreAccess().getWalkstatementsAssignment_1_1()); 

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
    // $ANTLR end "rule__SelfCheckoutInstore__Alternatives_1"


    // $ANTLR start "rule__PickStatement__HoldingItemAlternatives_4_0"
    // InternalSelfCheckoutExperience.g:897:1: rule__PickStatement__HoldingItemAlternatives_4_0 : ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:901:1: ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==40) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:902:2: ( ruleScanAndAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:902:2: ( ruleScanAndAddToBasket )
                    // InternalSelfCheckoutExperience.g:903:3: ruleScanAndAddToBasket
                    {
                     before(grammarAccess.getPickStatementAccess().getHoldingItemScanAndAddToBasketParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScanAndAddToBasket();

                    state._fsp--;

                     after(grammarAccess.getPickStatementAccess().getHoldingItemScanAndAddToBasketParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:908:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:908:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:909:3: ruleDrop
                    {
                     before(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDrop();

                    state._fsp--;

                     after(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_4_0_1()); 

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
    // $ANTLR end "rule__PickStatement__HoldingItemAlternatives_4_0"


    // $ANTLR start "rule__WalkStatement__Alternatives"
    // InternalSelfCheckoutExperience.g:918:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:922:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case 41:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:923:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:923:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:924:3: ruleMoveStatement
                    {
                     before(grammarAccess.getWalkStatementAccess().getMoveStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStatement();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getMoveStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:929:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:929:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:930:3: ruleTurnStatement
                    {
                     before(grammarAccess.getWalkStatementAccess().getTurnStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnStatement();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getTurnStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:935:2: ( ruleRepeat )
                    {
                    // InternalSelfCheckoutExperience.g:935:2: ( ruleRepeat )
                    // InternalSelfCheckoutExperience.g:936:3: ruleRepeat
                    {
                     before(grammarAccess.getWalkStatementAccess().getRepeatParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRepeat();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getRepeatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:941:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:941:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:942:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getWalkStatementAccess().getVariableDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getVariableDeclarationParserRuleCall_3()); 

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
    // $ANTLR end "rule__WalkStatement__Alternatives"


    // $ANTLR start "rule__Repeat__StatementsAlternatives_3_0"
    // InternalSelfCheckoutExperience.g:951:1: rule__Repeat__StatementsAlternatives_3_0 : ( ( ruleWalkStatement ) | ( rulePickStatement ) );
    public final void rule__Repeat__StatementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:955:1: ( ( ruleWalkStatement ) | ( rulePickStatement ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)||LA6_0==41||LA6_0==43||LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:956:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:956:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:957:3: ruleWalkStatement
                    {
                     before(grammarAccess.getRepeatAccess().getStatementsWalkStatementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWalkStatement();

                    state._fsp--;

                     after(grammarAccess.getRepeatAccess().getStatementsWalkStatementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:962:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:962:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:963:3: rulePickStatement
                    {
                     before(grammarAccess.getRepeatAccess().getStatementsPickStatementParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePickStatement();

                    state._fsp--;

                     after(grammarAccess.getRepeatAccess().getStatementsPickStatementParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Repeat__StatementsAlternatives_3_0"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalSelfCheckoutExperience.g:972:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:976:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:977:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:977:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:978:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:983:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:983:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:984:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalSelfCheckoutExperience.g:993:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:997:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:998:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:998:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:999:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1004:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:1004:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:1005:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalSelfCheckoutExperience.g:1014:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1018:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 46:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1019:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:1019:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:1020:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1025:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:1025:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:1026:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:1031:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:1031:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSelfCheckoutExperience.g:1032:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalSelfCheckoutExperience.g:1033:3: ( rule__Primary__Group_2__0 )
                    // InternalSelfCheckoutExperience.g:1033:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__DeliveryOptions__Alternatives"
    // InternalSelfCheckoutExperience.g:1041:1: rule__DeliveryOptions__Alternatives : ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) );
    public final void rule__DeliveryOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1045:1: ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1046:2: ( ( 'premium_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1046:2: ( ( 'premium_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1047:3: ( 'premium_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1048:3: ( 'premium_delivery' )
                    // InternalSelfCheckoutExperience.g:1048:4: 'premium_delivery'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1052:2: ( ( 'standard_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1052:2: ( ( 'standard_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1053:3: ( 'standard_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1054:3: ( 'standard_delivery' )
                    // InternalSelfCheckoutExperience.g:1054:4: 'standard_delivery'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:1058:2: ( ( 'next_day_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1058:2: ( ( 'next_day_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1059:3: ( 'next_day_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2()); 
                    // InternalSelfCheckoutExperience.g:1060:3: ( 'next_day_delivery' )
                    // InternalSelfCheckoutExperience.g:1060:4: 'next_day_delivery'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DeliveryOptions__Alternatives"


    // $ANTLR start "rule__MoveCommand__Alternatives"
    // InternalSelfCheckoutExperience.g:1068:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1072:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1073:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1073:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:1074:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1075:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:1075:4: 'forward'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1079:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1079:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:1080:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1081:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:1081:4: 'backward'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MoveCommand__Alternatives"


    // $ANTLR start "rule__TurnCommand__Alternatives"
    // InternalSelfCheckoutExperience.g:1089:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1093:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1094:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1094:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:1095:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1096:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:1096:4: 'left'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1100:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1100:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:1101:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1102:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:1102:4: 'right'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TurnCommand__Alternatives"


    // $ANTLR start "rule__Carry__Alternatives"
    // InternalSelfCheckoutExperience.g:1110:1: rule__Carry__Alternatives : ( ( ( 'bag' ) ) | ( ( 'hold' ) ) );
    public final void rule__Carry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1114:1: ( ( ( 'bag' ) ) | ( ( 'hold' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1115:2: ( ( 'bag' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1115:2: ( ( 'bag' ) )
                    // InternalSelfCheckoutExperience.g:1116:3: ( 'bag' )
                    {
                     before(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1117:3: ( 'bag' )
                    // InternalSelfCheckoutExperience.g:1117:4: 'bag'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1121:2: ( ( 'hold' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1121:2: ( ( 'hold' ) )
                    // InternalSelfCheckoutExperience.g:1122:3: ( 'hold' )
                    {
                     before(grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1123:3: ( 'hold' )
                    // InternalSelfCheckoutExperience.g:1123:4: 'hold'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Carry__Alternatives"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__0"
    // InternalSelfCheckoutExperience.g:1131:1: rule__SelfCheckoutOnline__Group__0 : rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 ;
    public final void rule__SelfCheckoutOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1135:1: ( rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 )
            // InternalSelfCheckoutExperience.g:1136:2: rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelfCheckoutOnline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfCheckoutOnline__Group__1();

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
    // $ANTLR end "rule__SelfCheckoutOnline__Group__0"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1143:1: rule__SelfCheckoutOnline__Group__0__Impl : ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) ;
    public final void rule__SelfCheckoutOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1147:1: ( ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1148:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1148:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1149:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1150:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            // InternalSelfCheckoutExperience.g:1150:3: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__Group__0__Impl"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__1"
    // InternalSelfCheckoutExperience.g:1158:1: rule__SelfCheckoutOnline__Group__1 : rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 ;
    public final void rule__SelfCheckoutOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1162:1: ( rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 )
            // InternalSelfCheckoutExperience.g:1163:2: rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SelfCheckoutOnline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfCheckoutOnline__Group__2();

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
    // $ANTLR end "rule__SelfCheckoutOnline__Group__1"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1170:1: rule__SelfCheckoutOnline__Group__1__Impl : ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) ;
    public final void rule__SelfCheckoutOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1174:1: ( ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) )
            // InternalSelfCheckoutExperience.g:1175:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1175:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            // InternalSelfCheckoutExperience.g:1176:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getSearchAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1177:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1177:3: rule__SelfCheckoutOnline__SearchAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SelfCheckoutOnline__SearchAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSelfCheckoutOnlineAccess().getSearchAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__Group__1__Impl"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__2"
    // InternalSelfCheckoutExperience.g:1185:1: rule__SelfCheckoutOnline__Group__2 : rule__SelfCheckoutOnline__Group__2__Impl ;
    public final void rule__SelfCheckoutOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1189:1: ( rule__SelfCheckoutOnline__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1190:2: rule__SelfCheckoutOnline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutOnline__Group__2__Impl();

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
    // $ANTLR end "rule__SelfCheckoutOnline__Group__2"


    // $ANTLR start "rule__SelfCheckoutOnline__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1196:1: rule__SelfCheckoutOnline__Group__2__Impl : ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1200:1: ( ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1201:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1201:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1202:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1203:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1203:3: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__Group__2__Impl"


    // $ANTLR start "rule__Search__Group__0"
    // InternalSelfCheckoutExperience.g:1212:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1216:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalSelfCheckoutExperience.g:1217:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__1();

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
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1224:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1228:1: ( ( 'search' ) )
            // InternalSelfCheckoutExperience.g:1229:1: ( 'search' )
            {
            // InternalSelfCheckoutExperience.g:1229:1: ( 'search' )
            // InternalSelfCheckoutExperience.g:1230:2: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getSearchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // InternalSelfCheckoutExperience.g:1239:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1243:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalSelfCheckoutExperience.g:1244:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Search__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__2();

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
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1251:1: rule__Search__Group__1__Impl : ( 'for' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1255:1: ( ( 'for' ) )
            // InternalSelfCheckoutExperience.g:1256:1: ( 'for' )
            {
            // InternalSelfCheckoutExperience.g:1256:1: ( 'for' )
            // InternalSelfCheckoutExperience.g:1257:2: 'for'
            {
             before(grammarAccess.getSearchAccess().getForKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__2"
    // InternalSelfCheckoutExperience.g:1266:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1270:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalSelfCheckoutExperience.g:1271:2: rule__Search__Group__2__Impl rule__Search__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Search__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__3();

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
    // $ANTLR end "rule__Search__Group__2"


    // $ANTLR start "rule__Search__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1278:1: rule__Search__Group__2__Impl : ( ( rule__Search__ItemSearchAssignment_2 ) ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1282:1: ( ( ( rule__Search__ItemSearchAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1283:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1283:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1284:2: ( rule__Search__ItemSearchAssignment_2 )
            {
             before(grammarAccess.getSearchAccess().getItemSearchAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1285:2: ( rule__Search__ItemSearchAssignment_2 )
            // InternalSelfCheckoutExperience.g:1285:3: rule__Search__ItemSearchAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Search__ItemSearchAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getItemSearchAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__2__Impl"


    // $ANTLR start "rule__Search__Group__3"
    // InternalSelfCheckoutExperience.g:1293:1: rule__Search__Group__3 : rule__Search__Group__3__Impl ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1297:1: ( rule__Search__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1298:2: rule__Search__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__3__Impl();

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
    // $ANTLR end "rule__Search__Group__3"


    // $ANTLR start "rule__Search__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1304:1: rule__Search__Group__3__Impl : ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1308:1: ( ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) )
            // InternalSelfCheckoutExperience.g:1309:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            {
            // InternalSelfCheckoutExperience.g:1309:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            // InternalSelfCheckoutExperience.g:1310:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            {
             before(grammarAccess.getSearchAccess().getAddToOnlineBasketAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1311:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1311:3: rule__Search__AddToOnlineBasketAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Search__AddToOnlineBasketAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSearchAccess().getAddToOnlineBasketAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__3__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__0"
    // InternalSelfCheckoutExperience.g:1320:1: rule__AddToOnlineBasket__Group__0 : rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 ;
    public final void rule__AddToOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1324:1: ( rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1325:2: rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AddToOnlineBasket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__1();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__0"


    // $ANTLR start "rule__AddToOnlineBasket__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1332:1: rule__AddToOnlineBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1336:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:1337:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:1337:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:1338:2: 'add'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getAddKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__0__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__1"
    // InternalSelfCheckoutExperience.g:1347:1: rule__AddToOnlineBasket__Group__1 : rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 ;
    public final void rule__AddToOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1351:1: ( rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1352:2: rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AddToOnlineBasket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__2();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__1"


    // $ANTLR start "rule__AddToOnlineBasket__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1359:1: rule__AddToOnlineBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1363:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1364:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1364:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1365:2: 'to'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getToKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__1__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__2"
    // InternalSelfCheckoutExperience.g:1374:1: rule__AddToOnlineBasket__Group__2 : rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 ;
    public final void rule__AddToOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1378:1: ( rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1379:2: rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AddToOnlineBasket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__3();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__2"


    // $ANTLR start "rule__AddToOnlineBasket__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1386:1: rule__AddToOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1390:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1391:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1391:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1392:2: 'basket'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getBasketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getBasketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__2__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__3"
    // InternalSelfCheckoutExperience.g:1401:1: rule__AddToOnlineBasket__Group__3 : rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 ;
    public final void rule__AddToOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1405:1: ( rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:1406:2: rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AddToOnlineBasket__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__4();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__3"


    // $ANTLR start "rule__AddToOnlineBasket__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1413:1: rule__AddToOnlineBasket__Group__3__Impl : ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) ) ;
    public final void rule__AddToOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1417:1: ( ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1418:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1418:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1419:2: ( rule__AddToOnlineBasket__ItemCountAssignment_3 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1420:2: ( rule__AddToOnlineBasket__ItemCountAssignment_3 )
            // InternalSelfCheckoutExperience.g:1420:3: rule__AddToOnlineBasket__ItemCountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__ItemCountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__3__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__4"
    // InternalSelfCheckoutExperience.g:1428:1: rule__AddToOnlineBasket__Group__4 : rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 ;
    public final void rule__AddToOnlineBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1432:1: ( rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:1433:2: rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__AddToOnlineBasket__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__5();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__4"


    // $ANTLR start "rule__AddToOnlineBasket__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:1440:1: rule__AddToOnlineBasket__Group__4__Impl : ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) ) ;
    public final void rule__AddToOnlineBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1444:1: ( ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1445:1: ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1445:1: ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1446:2: ( rule__AddToOnlineBasket__ItemAssignment_4 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1447:2: ( rule__AddToOnlineBasket__ItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:1447:3: rule__AddToOnlineBasket__ItemAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__ItemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__4__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__5"
    // InternalSelfCheckoutExperience.g:1455:1: rule__AddToOnlineBasket__Group__5 : rule__AddToOnlineBasket__Group__5__Impl ;
    public final void rule__AddToOnlineBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1459:1: ( rule__AddToOnlineBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:1460:2: rule__AddToOnlineBasket__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__5__Impl();

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
    // $ANTLR end "rule__AddToOnlineBasket__Group__5"


    // $ANTLR start "rule__AddToOnlineBasket__Group__5__Impl"
    // InternalSelfCheckoutExperience.g:1466:1: rule__AddToOnlineBasket__Group__5__Impl : ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? ) ;
    public final void rule__AddToOnlineBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1470:1: ( ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? ) )
            // InternalSelfCheckoutExperience.g:1471:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? )
            {
            // InternalSelfCheckoutExperience.g:1471:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? )
            // InternalSelfCheckoutExperience.g:1472:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )?
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:1473:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1473:3: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__5__Impl"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__0"
    // InternalSelfCheckoutExperience.g:1482:1: rule__RemoveFromOnlineBasket__Group__0 : rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 ;
    public final void rule__RemoveFromOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1486:1: ( rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1487:2: rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RemoveFromOnlineBasket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__Group__1();

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
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__0"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1494:1: rule__RemoveFromOnlineBasket__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1498:1: ( ( 'remove' ) )
            // InternalSelfCheckoutExperience.g:1499:1: ( 'remove' )
            {
            // InternalSelfCheckoutExperience.g:1499:1: ( 'remove' )
            // InternalSelfCheckoutExperience.g:1500:2: 'remove'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__0__Impl"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__1"
    // InternalSelfCheckoutExperience.g:1509:1: rule__RemoveFromOnlineBasket__Group__1 : rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 ;
    public final void rule__RemoveFromOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1513:1: ( rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1514:2: rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RemoveFromOnlineBasket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__Group__2();

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
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__1"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1521:1: rule__RemoveFromOnlineBasket__Group__1__Impl : ( 'from' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1525:1: ( ( 'from' ) )
            // InternalSelfCheckoutExperience.g:1526:1: ( 'from' )
            {
            // InternalSelfCheckoutExperience.g:1526:1: ( 'from' )
            // InternalSelfCheckoutExperience.g:1527:2: 'from'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getFromKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRemoveFromOnlineBasketAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__1__Impl"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__2"
    // InternalSelfCheckoutExperience.g:1536:1: rule__RemoveFromOnlineBasket__Group__2 : rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 ;
    public final void rule__RemoveFromOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1540:1: ( rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1541:2: rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RemoveFromOnlineBasket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__Group__3();

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
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__2"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1548:1: rule__RemoveFromOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1552:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1553:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1553:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1554:2: 'basket'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getBasketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRemoveFromOnlineBasketAccess().getBasketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__2__Impl"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__3"
    // InternalSelfCheckoutExperience.g:1563:1: rule__RemoveFromOnlineBasket__Group__3 : rule__RemoveFromOnlineBasket__Group__3__Impl ;
    public final void rule__RemoveFromOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1567:1: ( rule__RemoveFromOnlineBasket__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1568:2: rule__RemoveFromOnlineBasket__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__Group__3__Impl();

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
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__3"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1574:1: rule__RemoveFromOnlineBasket__Group__3__Impl : ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) ;
    public final void rule__RemoveFromOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1578:1: ( ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1579:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1579:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1580:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1581:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:1581:3: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RemoveFromOnlineBasket__RemoveItemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveFromOnlineBasket__Group__3__Impl"


    // $ANTLR start "rule__OnlineCheckout__Group__0"
    // InternalSelfCheckoutExperience.g:1590:1: rule__OnlineCheckout__Group__0 : rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 ;
    public final void rule__OnlineCheckout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1594:1: ( rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 )
            // InternalSelfCheckoutExperience.g:1595:2: rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OnlineCheckout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__Group__1();

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
    // $ANTLR end "rule__OnlineCheckout__Group__0"


    // $ANTLR start "rule__OnlineCheckout__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1602:1: rule__OnlineCheckout__Group__0__Impl : ( 'checkout' ) ;
    public final void rule__OnlineCheckout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1606:1: ( ( 'checkout' ) )
            // InternalSelfCheckoutExperience.g:1607:1: ( 'checkout' )
            {
            // InternalSelfCheckoutExperience.g:1607:1: ( 'checkout' )
            // InternalSelfCheckoutExperience.g:1608:2: 'checkout'
            {
             before(grammarAccess.getOnlineCheckoutAccess().getCheckoutKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOnlineCheckoutAccess().getCheckoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineCheckout__Group__0__Impl"


    // $ANTLR start "rule__OnlineCheckout__Group__1"
    // InternalSelfCheckoutExperience.g:1617:1: rule__OnlineCheckout__Group__1 : rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 ;
    public final void rule__OnlineCheckout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1621:1: ( rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 )
            // InternalSelfCheckoutExperience.g:1622:2: rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OnlineCheckout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__Group__2();

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
    // $ANTLR end "rule__OnlineCheckout__Group__1"


    // $ANTLR start "rule__OnlineCheckout__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1629:1: rule__OnlineCheckout__Group__1__Impl : ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) ;
    public final void rule__OnlineCheckout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1633:1: ( ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1634:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1634:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1635:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1636:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            // InternalSelfCheckoutExperience.g:1636:3: rule__OnlineCheckout__DeliveryOptionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__DeliveryOptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineCheckout__Group__1__Impl"


    // $ANTLR start "rule__OnlineCheckout__Group__2"
    // InternalSelfCheckoutExperience.g:1644:1: rule__OnlineCheckout__Group__2 : rule__OnlineCheckout__Group__2__Impl ;
    public final void rule__OnlineCheckout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1648:1: ( rule__OnlineCheckout__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1649:2: rule__OnlineCheckout__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__Group__2__Impl();

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
    // $ANTLR end "rule__OnlineCheckout__Group__2"


    // $ANTLR start "rule__OnlineCheckout__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1655:1: rule__OnlineCheckout__Group__2__Impl : ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) ;
    public final void rule__OnlineCheckout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1659:1: ( ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1660:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1660:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1661:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getConfirmAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1662:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            // InternalSelfCheckoutExperience.g:1662:3: rule__OnlineCheckout__ConfirmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OnlineCheckout__ConfirmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnlineCheckoutAccess().getConfirmAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineCheckout__Group__2__Impl"


    // $ANTLR start "rule__Confirm__Group__0"
    // InternalSelfCheckoutExperience.g:1671:1: rule__Confirm__Group__0 : rule__Confirm__Group__0__Impl rule__Confirm__Group__1 ;
    public final void rule__Confirm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1675:1: ( rule__Confirm__Group__0__Impl rule__Confirm__Group__1 )
            // InternalSelfCheckoutExperience.g:1676:2: rule__Confirm__Group__0__Impl rule__Confirm__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Confirm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Confirm__Group__1();

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
    // $ANTLR end "rule__Confirm__Group__0"


    // $ANTLR start "rule__Confirm__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1683:1: rule__Confirm__Group__0__Impl : ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) ;
    public final void rule__Confirm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1687:1: ( ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1688:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1688:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1689:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            {
             before(grammarAccess.getConfirmAccess().getConfirmEnumAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1690:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            // InternalSelfCheckoutExperience.g:1690:3: rule__Confirm__ConfirmEnumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Confirm__ConfirmEnumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAccess().getConfirmEnumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Confirm__Group__0__Impl"


    // $ANTLR start "rule__Confirm__Group__1"
    // InternalSelfCheckoutExperience.g:1698:1: rule__Confirm__Group__1 : rule__Confirm__Group__1__Impl ;
    public final void rule__Confirm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1702:1: ( rule__Confirm__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1703:2: rule__Confirm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Confirm__Group__1__Impl();

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
    // $ANTLR end "rule__Confirm__Group__1"


    // $ANTLR start "rule__Confirm__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1709:1: rule__Confirm__Group__1__Impl : ( ( rule__Confirm__PayAssignment_1 ) ) ;
    public final void rule__Confirm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1713:1: ( ( ( rule__Confirm__PayAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1714:1: ( ( rule__Confirm__PayAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1714:1: ( ( rule__Confirm__PayAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1715:2: ( rule__Confirm__PayAssignment_1 )
            {
             before(grammarAccess.getConfirmAccess().getPayAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1716:2: ( rule__Confirm__PayAssignment_1 )
            // InternalSelfCheckoutExperience.g:1716:3: rule__Confirm__PayAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Confirm__PayAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAccess().getPayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Confirm__Group__1__Impl"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__0"
    // InternalSelfCheckoutExperience.g:1725:1: rule__SelfCheckoutInstore__Group__0 : rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 ;
    public final void rule__SelfCheckoutInstore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1729:1: ( rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 )
            // InternalSelfCheckoutExperience.g:1730:2: rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SelfCheckoutInstore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__Group__1();

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
    // $ANTLR end "rule__SelfCheckoutInstore__Group__0"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1737:1: rule__SelfCheckoutInstore__Group__0__Impl : ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) ;
    public final void rule__SelfCheckoutInstore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1741:1: ( ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1742:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1742:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1743:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1744:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            // InternalSelfCheckoutExperience.g:1744:3: rule__SelfCheckoutInstore__PickScanMachineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__PickScanMachineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__Group__0__Impl"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__1"
    // InternalSelfCheckoutExperience.g:1752:1: rule__SelfCheckoutInstore__Group__1 : rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 ;
    public final void rule__SelfCheckoutInstore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1756:1: ( rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 )
            // InternalSelfCheckoutExperience.g:1757:2: rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SelfCheckoutInstore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__Group__2();

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
    // $ANTLR end "rule__SelfCheckoutInstore__Group__1"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1764:1: rule__SelfCheckoutInstore__Group__1__Impl : ( ( rule__SelfCheckoutInstore__Alternatives_1 )* ) ;
    public final void rule__SelfCheckoutInstore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1768:1: ( ( ( rule__SelfCheckoutInstore__Alternatives_1 )* ) )
            // InternalSelfCheckoutExperience.g:1769:1: ( ( rule__SelfCheckoutInstore__Alternatives_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1769:1: ( ( rule__SelfCheckoutInstore__Alternatives_1 )* )
            // InternalSelfCheckoutExperience.g:1770:2: ( rule__SelfCheckoutInstore__Alternatives_1 )*
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getAlternatives_1()); 
            // InternalSelfCheckoutExperience.g:1771:2: ( rule__SelfCheckoutInstore__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=22 && LA18_0<=23)||LA18_0==36||LA18_0==41||LA18_0==43||LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1771:3: rule__SelfCheckoutInstore__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SelfCheckoutInstore__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSelfCheckoutInstoreAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__Group__1__Impl"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__2"
    // InternalSelfCheckoutExperience.g:1779:1: rule__SelfCheckoutInstore__Group__2 : rule__SelfCheckoutInstore__Group__2__Impl ;
    public final void rule__SelfCheckoutInstore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1783:1: ( rule__SelfCheckoutInstore__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1784:2: rule__SelfCheckoutInstore__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__Group__2__Impl();

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
    // $ANTLR end "rule__SelfCheckoutInstore__Group__2"


    // $ANTLR start "rule__SelfCheckoutInstore__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1790:1: rule__SelfCheckoutInstore__Group__2__Impl : ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutInstore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1794:1: ( ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1795:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1795:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1796:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1797:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1797:3: rule__SelfCheckoutInstore__CheckoutAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfCheckoutInstore__CheckoutAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__Group__2__Impl"


    // $ANTLR start "rule__HoldSelfScanner__Group__0"
    // InternalSelfCheckoutExperience.g:1806:1: rule__HoldSelfScanner__Group__0 : rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 ;
    public final void rule__HoldSelfScanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1810:1: ( rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 )
            // InternalSelfCheckoutExperience.g:1811:2: rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HoldSelfScanner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HoldSelfScanner__Group__1();

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
    // $ANTLR end "rule__HoldSelfScanner__Group__0"


    // $ANTLR start "rule__HoldSelfScanner__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1818:1: rule__HoldSelfScanner__Group__0__Impl : ( 'hold' ) ;
    public final void rule__HoldSelfScanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1822:1: ( ( 'hold' ) )
            // InternalSelfCheckoutExperience.g:1823:1: ( 'hold' )
            {
            // InternalSelfCheckoutExperience.g:1823:1: ( 'hold' )
            // InternalSelfCheckoutExperience.g:1824:2: 'hold'
            {
             before(grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldSelfScanner__Group__0__Impl"


    // $ANTLR start "rule__HoldSelfScanner__Group__1"
    // InternalSelfCheckoutExperience.g:1833:1: rule__HoldSelfScanner__Group__1 : rule__HoldSelfScanner__Group__1__Impl ;
    public final void rule__HoldSelfScanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1837:1: ( rule__HoldSelfScanner__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1838:2: rule__HoldSelfScanner__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HoldSelfScanner__Group__1__Impl();

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
    // $ANTLR end "rule__HoldSelfScanner__Group__1"


    // $ANTLR start "rule__HoldSelfScanner__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1844:1: rule__HoldSelfScanner__Group__1__Impl : ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) ;
    public final void rule__HoldSelfScanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1848:1: ( ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1849:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1849:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1850:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1851:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            // InternalSelfCheckoutExperience.g:1851:3: rule__HoldSelfScanner__ScanMachineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HoldSelfScanner__ScanMachineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldSelfScanner__Group__1__Impl"


    // $ANTLR start "rule__PickStatement__Group__0"
    // InternalSelfCheckoutExperience.g:1860:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1864:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1865:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PickStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__1();

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
    // $ANTLR end "rule__PickStatement__Group__0"


    // $ANTLR start "rule__PickStatement__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1872:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1876:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:1877:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:1877:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:1878:2: 'pick'
            {
             before(grammarAccess.getPickStatementAccess().getPickKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPickStatementAccess().getPickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__0__Impl"


    // $ANTLR start "rule__PickStatement__Group__1"
    // InternalSelfCheckoutExperience.g:1887:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1891:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1892:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PickStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__2();

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
    // $ANTLR end "rule__PickStatement__Group__1"


    // $ANTLR start "rule__PickStatement__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1899:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1903:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:1904:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:1904:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:1905:2: 'up'
            {
             before(grammarAccess.getPickStatementAccess().getUpKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPickStatementAccess().getUpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__1__Impl"


    // $ANTLR start "rule__PickStatement__Group__2"
    // InternalSelfCheckoutExperience.g:1914:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1918:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1919:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PickStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__3();

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
    // $ANTLR end "rule__PickStatement__Group__2"


    // $ANTLR start "rule__PickStatement__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1926:1: rule__PickStatement__Group__2__Impl : ( ( rule__PickStatement__ItemCountAssignment_2 ) ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1930:1: ( ( ( rule__PickStatement__ItemCountAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1931:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1931:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1932:2: ( rule__PickStatement__ItemCountAssignment_2 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1933:2: ( rule__PickStatement__ItemCountAssignment_2 )
            // InternalSelfCheckoutExperience.g:1933:3: rule__PickStatement__ItemCountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__ItemCountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__2__Impl"


    // $ANTLR start "rule__PickStatement__Group__3"
    // InternalSelfCheckoutExperience.g:1941:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1945:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:1946:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__PickStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__4();

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
    // $ANTLR end "rule__PickStatement__Group__3"


    // $ANTLR start "rule__PickStatement__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1953:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1957:1: ( ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1958:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1958:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1959:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1960:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            // InternalSelfCheckoutExperience.g:1960:3: rule__PickStatement__ItemPickedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__ItemPickedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getItemPickedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__3__Impl"


    // $ANTLR start "rule__PickStatement__Group__4"
    // InternalSelfCheckoutExperience.g:1968:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1972:1: ( rule__PickStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1973:2: rule__PickStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__4__Impl();

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
    // $ANTLR end "rule__PickStatement__Group__4"


    // $ANTLR start "rule__PickStatement__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:1979:1: rule__PickStatement__Group__4__Impl : ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1983:1: ( ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1984:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1984:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1985:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1986:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:1986:3: rule__PickStatement__HoldingItemAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__HoldingItemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__4__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__0"
    // InternalSelfCheckoutExperience.g:1995:1: rule__ScanAndAddToBasket__Group__0 : rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 ;
    public final void rule__ScanAndAddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1999:1: ( rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:2000:2: rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ScanAndAddToBasket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__1();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__0"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2007:1: rule__ScanAndAddToBasket__Group__0__Impl : ( 'scan' ) ;
    public final void rule__ScanAndAddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2011:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2012:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2012:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2013:2: 'scan'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__0__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__1"
    // InternalSelfCheckoutExperience.g:2022:1: rule__ScanAndAddToBasket__Group__1 : rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 ;
    public final void rule__ScanAndAddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2026:1: ( rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:2027:2: rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ScanAndAddToBasket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__2();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__1"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2034:1: rule__ScanAndAddToBasket__Group__1__Impl : ( 'and' ) ;
    public final void rule__ScanAndAddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2038:1: ( ( 'and' ) )
            // InternalSelfCheckoutExperience.g:2039:1: ( 'and' )
            {
            // InternalSelfCheckoutExperience.g:2039:1: ( 'and' )
            // InternalSelfCheckoutExperience.g:2040:2: 'and'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__1__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__2"
    // InternalSelfCheckoutExperience.g:2049:1: rule__ScanAndAddToBasket__Group__2 : rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 ;
    public final void rule__ScanAndAddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2053:1: ( rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:2054:2: rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ScanAndAddToBasket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__3();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__2"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2061:1: rule__ScanAndAddToBasket__Group__2__Impl : ( 'add' ) ;
    public final void rule__ScanAndAddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2065:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2066:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2066:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2067:2: 'add'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__2__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__3"
    // InternalSelfCheckoutExperience.g:2076:1: rule__ScanAndAddToBasket__Group__3 : rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 ;
    public final void rule__ScanAndAddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2080:1: ( rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:2081:2: rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ScanAndAddToBasket__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__4();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__3"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:2088:1: rule__ScanAndAddToBasket__Group__3__Impl : ( 'to' ) ;
    public final void rule__ScanAndAddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2092:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2093:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2093:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2094:2: 'to'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__3__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__4"
    // InternalSelfCheckoutExperience.g:2103:1: rule__ScanAndAddToBasket__Group__4 : rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 ;
    public final void rule__ScanAndAddToBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2107:1: ( rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:2108:2: rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ScanAndAddToBasket__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__5();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__4"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:2115:1: rule__ScanAndAddToBasket__Group__4__Impl : ( 'basket' ) ;
    public final void rule__ScanAndAddToBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2119:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:2120:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:2120:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:2121:2: 'basket'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__4__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__5"
    // InternalSelfCheckoutExperience.g:2130:1: rule__ScanAndAddToBasket__Group__5 : rule__ScanAndAddToBasket__Group__5__Impl ;
    public final void rule__ScanAndAddToBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2134:1: ( rule__ScanAndAddToBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:2135:2: rule__ScanAndAddToBasket__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__Group__5__Impl();

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
    // $ANTLR end "rule__ScanAndAddToBasket__Group__5"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__5__Impl"
    // InternalSelfCheckoutExperience.g:2141:1: rule__ScanAndAddToBasket__Group__5__Impl : ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) ;
    public final void rule__ScanAndAddToBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2145:1: ( ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) )
            // InternalSelfCheckoutExperience.g:2146:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            {
            // InternalSelfCheckoutExperience.g:2146:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            // InternalSelfCheckoutExperience.g:2147:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:2148:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            // InternalSelfCheckoutExperience.g:2148:3: rule__ScanAndAddToBasket__ItemInBasketAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ScanAndAddToBasket__ItemInBasketAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__Group__5__Impl"


    // $ANTLR start "rule__Drop__Group__0"
    // InternalSelfCheckoutExperience.g:2157:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2161:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:2162:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Drop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group__1();

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
    // $ANTLR end "rule__Drop__Group__0"


    // $ANTLR start "rule__Drop__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2169:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2173:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:2174:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:2174:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:2175:2: 'drop'
            {
             before(grammarAccess.getDropAccess().getDropKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getDropKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__0__Impl"


    // $ANTLR start "rule__Drop__Group__1"
    // InternalSelfCheckoutExperience.g:2184:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2188:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2189:2: rule__Drop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__1__Impl();

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
    // $ANTLR end "rule__Drop__Group__1"


    // $ANTLR start "rule__Drop__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2195:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemDroppedAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2199:1: ( ( ( rule__Drop__ItemDroppedAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2200:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2200:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2201:2: ( rule__Drop__ItemDroppedAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2202:2: ( rule__Drop__ItemDroppedAssignment_1 )
            // InternalSelfCheckoutExperience.g:2202:3: rule__Drop__ItemDroppedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Drop__ItemDroppedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalSelfCheckoutExperience.g:2211:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2215:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:2216:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2223:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2227:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:2228:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:2228:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:2229:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalSelfCheckoutExperience.g:2238:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2242:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:2243:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2250:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2254:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2255:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2255:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2256:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2257:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:2257:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalSelfCheckoutExperience.g:2265:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2269:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:2270:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2277:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2281:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:2282:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:2282:1: ( '=' )
            // InternalSelfCheckoutExperience.g:2283:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalSelfCheckoutExperience.g:2292:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2296:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2297:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:2303:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2307:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2308:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2308:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2309:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2310:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:2310:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Repeat__Group__0"
    // InternalSelfCheckoutExperience.g:2319:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2323:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalSelfCheckoutExperience.g:2324:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Repeat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repeat__Group__1();

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
    // $ANTLR end "rule__Repeat__Group__0"


    // $ANTLR start "rule__Repeat__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2331:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2335:1: ( ( 'repeat' ) )
            // InternalSelfCheckoutExperience.g:2336:1: ( 'repeat' )
            {
            // InternalSelfCheckoutExperience.g:2336:1: ( 'repeat' )
            // InternalSelfCheckoutExperience.g:2337:2: 'repeat'
            {
             before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__0__Impl"


    // $ANTLR start "rule__Repeat__Group__1"
    // InternalSelfCheckoutExperience.g:2346:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2350:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalSelfCheckoutExperience.g:2351:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Repeat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repeat__Group__2();

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
    // $ANTLR end "rule__Repeat__Group__1"


    // $ANTLR start "rule__Repeat__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2358:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__CountAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2362:1: ( ( ( rule__Repeat__CountAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2363:1: ( ( rule__Repeat__CountAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2363:1: ( ( rule__Repeat__CountAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2364:2: ( rule__Repeat__CountAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getCountAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2365:2: ( rule__Repeat__CountAssignment_1 )
            // InternalSelfCheckoutExperience.g:2365:3: rule__Repeat__CountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__1__Impl"


    // $ANTLR start "rule__Repeat__Group__2"
    // InternalSelfCheckoutExperience.g:2373:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl rule__Repeat__Group__3 ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2377:1: ( rule__Repeat__Group__2__Impl rule__Repeat__Group__3 )
            // InternalSelfCheckoutExperience.g:2378:2: rule__Repeat__Group__2__Impl rule__Repeat__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Repeat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repeat__Group__3();

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
    // $ANTLR end "rule__Repeat__Group__2"


    // $ANTLR start "rule__Repeat__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2385:1: rule__Repeat__Group__2__Impl : ( 'times:' ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2389:1: ( ( 'times:' ) )
            // InternalSelfCheckoutExperience.g:2390:1: ( 'times:' )
            {
            // InternalSelfCheckoutExperience.g:2390:1: ( 'times:' )
            // InternalSelfCheckoutExperience.g:2391:2: 'times:'
            {
             before(grammarAccess.getRepeatAccess().getTimesKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRepeatAccess().getTimesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__2__Impl"


    // $ANTLR start "rule__Repeat__Group__3"
    // InternalSelfCheckoutExperience.g:2400:1: rule__Repeat__Group__3 : rule__Repeat__Group__3__Impl rule__Repeat__Group__4 ;
    public final void rule__Repeat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2404:1: ( rule__Repeat__Group__3__Impl rule__Repeat__Group__4 )
            // InternalSelfCheckoutExperience.g:2405:2: rule__Repeat__Group__3__Impl rule__Repeat__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Repeat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repeat__Group__4();

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
    // $ANTLR end "rule__Repeat__Group__3"


    // $ANTLR start "rule__Repeat__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:2412:1: rule__Repeat__Group__3__Impl : ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) ;
    public final void rule__Repeat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2416:1: ( ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:2417:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:2417:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:2418:2: ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:2418:2: ( ( rule__Repeat__StatementsAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2419:3: ( rule__Repeat__StatementsAssignment_3 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2420:3: ( rule__Repeat__StatementsAssignment_3 )
            // InternalSelfCheckoutExperience.g:2420:4: rule__Repeat__StatementsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Repeat__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:2423:2: ( ( rule__Repeat__StatementsAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:2424:3: ( rule__Repeat__StatementsAssignment_3 )*
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2425:3: ( rule__Repeat__StatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=22 && LA20_0<=23)||LA20_0==36||LA20_0==41||LA20_0==43||LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2425:4: rule__Repeat__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Repeat__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__Repeat__Group__3__Impl"


    // $ANTLR start "rule__Repeat__Group__4"
    // InternalSelfCheckoutExperience.g:2434:1: rule__Repeat__Group__4 : rule__Repeat__Group__4__Impl ;
    public final void rule__Repeat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2438:1: ( rule__Repeat__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2439:2: rule__Repeat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__4__Impl();

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
    // $ANTLR end "rule__Repeat__Group__4"


    // $ANTLR start "rule__Repeat__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:2445:1: rule__Repeat__Group__4__Impl : ( 'end' ) ;
    public final void rule__Repeat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2449:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:2450:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:2450:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:2451:2: 'end'
            {
             before(grammarAccess.getRepeatAccess().getEndKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRepeatAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__4__Impl"


    // $ANTLR start "rule__MoveStatement__Group__0"
    // InternalSelfCheckoutExperience.g:2461:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2465:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2466:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MoveStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__1();

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
    // $ANTLR end "rule__MoveStatement__Group__0"


    // $ANTLR start "rule__MoveStatement__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2473:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2477:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:2478:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2478:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:2479:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:2480:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:2480:3: rule__MoveStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__0__Impl"


    // $ANTLR start "rule__MoveStatement__Group__1"
    // InternalSelfCheckoutExperience.g:2488:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2492:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:2493:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MoveStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__2();

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
    // $ANTLR end "rule__MoveStatement__Group__1"


    // $ANTLR start "rule__MoveStatement__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2500:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2504:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2505:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2505:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2506:2: '('
            {
             before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__1__Impl"


    // $ANTLR start "rule__MoveStatement__Group__2"
    // InternalSelfCheckoutExperience.g:2515:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2519:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:2520:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MoveStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3();

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
    // $ANTLR end "rule__MoveStatement__Group__2"


    // $ANTLR start "rule__MoveStatement__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2527:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2531:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:2532:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2532:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:2533:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:2534:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:2534:3: rule__MoveStatement__StepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__StepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__2__Impl"


    // $ANTLR start "rule__MoveStatement__Group__3"
    // InternalSelfCheckoutExperience.g:2542:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2546:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2547:2: rule__MoveStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3__Impl();

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
    // $ANTLR end "rule__MoveStatement__Group__3"


    // $ANTLR start "rule__MoveStatement__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:2553:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2557:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2558:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2558:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2559:2: ')'
            {
             before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__3__Impl"


    // $ANTLR start "rule__TurnStatement__Group__0"
    // InternalSelfCheckoutExperience.g:2569:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2573:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2574:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__TurnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__1();

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
    // $ANTLR end "rule__TurnStatement__Group__0"


    // $ANTLR start "rule__TurnStatement__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2581:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2585:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:2586:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:2586:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:2587:2: 'turn'
            {
             before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__0__Impl"


    // $ANTLR start "rule__TurnStatement__Group__1"
    // InternalSelfCheckoutExperience.g:2596:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2600:1: ( rule__TurnStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2601:2: rule__TurnStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__1__Impl();

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
    // $ANTLR end "rule__TurnStatement__Group__1"


    // $ANTLR start "rule__TurnStatement__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2607:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2611:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2612:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2612:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2613:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2614:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:2614:3: rule__TurnStatement__CommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__CommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalSelfCheckoutExperience.g:2623:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2627:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:2628:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2635:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2639:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2640:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2640:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2641:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalSelfCheckoutExperience.g:2650:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2654:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2655:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2661:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2665:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:2666:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:2666:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:2667:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2668:2: ( rule__Addition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=15 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2668:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalSelfCheckoutExperience.g:2677:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2681:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2682:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalSelfCheckoutExperience.g:2689:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2693:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2694:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2694:1: ( () )
            // InternalSelfCheckoutExperience.g:2695:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2696:2: ()
            // InternalSelfCheckoutExperience.g:2696:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalSelfCheckoutExperience.g:2704:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2708:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2709:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalSelfCheckoutExperience.g:2716:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2720:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:2721:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2721:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:2722:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:2723:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:2723:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalSelfCheckoutExperience.g:2731:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2735:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:2736:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalSelfCheckoutExperience.g:2742:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2746:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:2747:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2747:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:2748:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:2749:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:2749:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalSelfCheckoutExperience.g:2758:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2762:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:2763:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2770:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2774:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:2775:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:2775:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:2776:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalSelfCheckoutExperience.g:2785:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2789:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2790:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2796:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2800:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:2801:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:2801:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:2802:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2803:2: ( rule__Multiplication__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=18)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2803:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalSelfCheckoutExperience.g:2812:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2816:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2817:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalSelfCheckoutExperience.g:2824:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2828:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2829:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2829:1: ( () )
            // InternalSelfCheckoutExperience.g:2830:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2831:2: ()
            // InternalSelfCheckoutExperience.g:2831:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalSelfCheckoutExperience.g:2839:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2843:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2844:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalSelfCheckoutExperience.g:2851:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2855:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:2856:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2856:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:2857:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:2858:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:2858:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalSelfCheckoutExperience.g:2866:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2870:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:2871:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalSelfCheckoutExperience.g:2877:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2881:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:2882:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2882:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:2883:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:2884:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:2884:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalSelfCheckoutExperience.g:2893:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2897:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSelfCheckoutExperience.g:2898:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalSelfCheckoutExperience.g:2905:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2909:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2910:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2910:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2911:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalSelfCheckoutExperience.g:2920:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2924:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSelfCheckoutExperience.g:2925:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalSelfCheckoutExperience.g:2932:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2936:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2937:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2937:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2938:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalSelfCheckoutExperience.g:2947:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2951:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSelfCheckoutExperience.g:2952:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalSelfCheckoutExperience.g:2958:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2962:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2963:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2963:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2964:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Checkout__Group__0"
    // InternalSelfCheckoutExperience.g:2974:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2978:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:2979:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Checkout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkout__Group__1();

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
    // $ANTLR end "rule__Checkout__Group__0"


    // $ANTLR start "rule__Checkout__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2986:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2990:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:2991:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:2991:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:2992:2: 'go'
            {
             before(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__Group__0__Impl"


    // $ANTLR start "rule__Checkout__Group__1"
    // InternalSelfCheckoutExperience.g:3001:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3005:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:3006:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Checkout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkout__Group__2();

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
    // $ANTLR end "rule__Checkout__Group__1"


    // $ANTLR start "rule__Checkout__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:3013:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3017:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:3018:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:3018:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:3019:2: 'to'
            {
             before(grammarAccess.getCheckoutAccess().getToKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCheckoutAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__Group__1__Impl"


    // $ANTLR start "rule__Checkout__Group__2"
    // InternalSelfCheckoutExperience.g:3028:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3032:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:3033:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Checkout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkout__Group__3();

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
    // $ANTLR end "rule__Checkout__Group__2"


    // $ANTLR start "rule__Checkout__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:3040:1: rule__Checkout__Group__2__Impl : ( 'self-checkout' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3044:1: ( ( 'self-checkout' ) )
            // InternalSelfCheckoutExperience.g:3045:1: ( 'self-checkout' )
            {
            // InternalSelfCheckoutExperience.g:3045:1: ( 'self-checkout' )
            // InternalSelfCheckoutExperience.g:3046:2: 'self-checkout'
            {
             before(grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__Group__2__Impl"


    // $ANTLR start "rule__Checkout__Group__3"
    // InternalSelfCheckoutExperience.g:3055:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3059:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:3060:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Checkout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkout__Group__4();

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
    // $ANTLR end "rule__Checkout__Group__3"


    // $ANTLR start "rule__Checkout__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:3067:1: rule__Checkout__Group__3__Impl : ( ( rule__Checkout__ScanAssignment_3 ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3071:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3072:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3072:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3073:2: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3074:2: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:3074:3: rule__Checkout__ScanAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkout__ScanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__Group__3__Impl"


    // $ANTLR start "rule__Checkout__Group__4"
    // InternalSelfCheckoutExperience.g:3082:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3086:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:3087:2: rule__Checkout__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkout__Group__4__Impl();

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
    // $ANTLR end "rule__Checkout__Group__4"


    // $ANTLR start "rule__Checkout__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:3093:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3097:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:3098:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:3098:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:3099:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:3100:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckoutExperience.g:3100:3: rule__Checkout__PayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Checkout__PayAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__Group__4__Impl"


    // $ANTLR start "rule__ScanExpression__Group__0"
    // InternalSelfCheckoutExperience.g:3109:1: rule__ScanExpression__Group__0 : rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 ;
    public final void rule__ScanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3113:1: ( rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 )
            // InternalSelfCheckoutExperience.g:3114:2: rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ScanExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group__1();

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
    // $ANTLR end "rule__ScanExpression__Group__0"


    // $ANTLR start "rule__ScanExpression__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:3121:1: rule__ScanExpression__Group__0__Impl : ( ruleScan ) ;
    public final void rule__ScanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3125:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:3126:1: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:3126:1: ( ruleScan )
            // InternalSelfCheckoutExperience.g:3127:2: ruleScan
            {
             before(grammarAccess.getScanExpressionAccess().getScanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleScan();

            state._fsp--;

             after(grammarAccess.getScanExpressionAccess().getScanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__Group__0__Impl"


    // $ANTLR start "rule__ScanExpression__Group__1"
    // InternalSelfCheckoutExperience.g:3136:1: rule__ScanExpression__Group__1 : rule__ScanExpression__Group__1__Impl ;
    public final void rule__ScanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3140:1: ( rule__ScanExpression__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:3141:2: rule__ScanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ScanExpression__Group__1"


    // $ANTLR start "rule__ScanExpression__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:3147:1: rule__ScanExpression__Group__1__Impl : ( ( rule__ScanExpression__Group_1__0 )? ) ;
    public final void rule__ScanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3151:1: ( ( ( rule__ScanExpression__Group_1__0 )? ) )
            // InternalSelfCheckoutExperience.g:3152:1: ( ( rule__ScanExpression__Group_1__0 )? )
            {
            // InternalSelfCheckoutExperience.g:3152:1: ( ( rule__ScanExpression__Group_1__0 )? )
            // InternalSelfCheckoutExperience.g:3153:2: ( rule__ScanExpression__Group_1__0 )?
            {
             before(grammarAccess.getScanExpressionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:3154:2: ( rule__ScanExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:3154:3: rule__ScanExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScanExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScanExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__Group__1__Impl"


    // $ANTLR start "rule__ScanExpression__Group_1__0"
    // InternalSelfCheckoutExperience.g:3163:1: rule__ScanExpression__Group_1__0 : rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 ;
    public final void rule__ScanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3167:1: ( rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 )
            // InternalSelfCheckoutExperience.g:3168:2: rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ScanExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group_1__1();

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
    // $ANTLR end "rule__ScanExpression__Group_1__0"


    // $ANTLR start "rule__ScanExpression__Group_1__0__Impl"
    // InternalSelfCheckoutExperience.g:3175:1: rule__ScanExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ScanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3179:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:3180:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:3180:1: ( () )
            // InternalSelfCheckoutExperience.g:3181:2: ()
            {
             before(grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0()); 
            // InternalSelfCheckoutExperience.g:3182:2: ()
            // InternalSelfCheckoutExperience.g:3182:3: 
            {
            }

             after(grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ScanExpression__Group_1__1"
    // InternalSelfCheckoutExperience.g:3190:1: rule__ScanExpression__Group_1__1 : rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 ;
    public final void rule__ScanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3194:1: ( rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 )
            // InternalSelfCheckoutExperience.g:3195:2: rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2
            {
            pushFollow(FOLLOW_37);
            rule__ScanExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group_1__2();

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
    // $ANTLR end "rule__ScanExpression__Group_1__1"


    // $ANTLR start "rule__ScanExpression__Group_1__1__Impl"
    // InternalSelfCheckoutExperience.g:3202:1: rule__ScanExpression__Group_1__1__Impl : ( 'then' ) ;
    public final void rule__ScanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3206:1: ( ( 'then' ) )
            // InternalSelfCheckoutExperience.g:3207:1: ( 'then' )
            {
            // InternalSelfCheckoutExperience.g:3207:1: ( 'then' )
            // InternalSelfCheckoutExperience.g:3208:2: 'then'
            {
             before(grammarAccess.getScanExpressionAccess().getThenKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getScanExpressionAccess().getThenKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ScanExpression__Group_1__2"
    // InternalSelfCheckoutExperience.g:3217:1: rule__ScanExpression__Group_1__2 : rule__ScanExpression__Group_1__2__Impl ;
    public final void rule__ScanExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3221:1: ( rule__ScanExpression__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:3222:2: rule__ScanExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScanExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ScanExpression__Group_1__2"


    // $ANTLR start "rule__ScanExpression__Group_1__2__Impl"
    // InternalSelfCheckoutExperience.g:3228:1: rule__ScanExpression__Group_1__2__Impl : ( ( rule__ScanExpression__NextAssignment_1_2 ) ) ;
    public final void rule__ScanExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3232:1: ( ( ( rule__ScanExpression__NextAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:3233:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:3233:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:3234:2: ( rule__ScanExpression__NextAssignment_1_2 )
            {
             before(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:3235:2: ( rule__ScanExpression__NextAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:3235:3: rule__ScanExpression__NextAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ScanExpression__NextAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Scan__Group__0"
    // InternalSelfCheckoutExperience.g:3244:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3248:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:3249:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Scan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scan__Group__1();

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
    // $ANTLR end "rule__Scan__Group__0"


    // $ANTLR start "rule__Scan__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:3256:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3260:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:3261:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:3261:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:3262:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getScanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__0__Impl"


    // $ANTLR start "rule__Scan__Group__1"
    // InternalSelfCheckoutExperience.g:3271:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3275:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:3276:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Scan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scan__Group__2();

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
    // $ANTLR end "rule__Scan__Group__1"


    // $ANTLR start "rule__Scan__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:3283:1: rule__Scan__Group__1__Impl : ( 'barcode' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3287:1: ( ( 'barcode' ) )
            // InternalSelfCheckoutExperience.g:3288:1: ( 'barcode' )
            {
            // InternalSelfCheckoutExperience.g:3288:1: ( 'barcode' )
            // InternalSelfCheckoutExperience.g:3289:2: 'barcode'
            {
             before(grammarAccess.getScanAccess().getBarcodeKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getBarcodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__1__Impl"


    // $ANTLR start "rule__Scan__Group__2"
    // InternalSelfCheckoutExperience.g:3298:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3302:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:3303:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Scan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scan__Group__3();

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
    // $ANTLR end "rule__Scan__Group__2"


    // $ANTLR start "rule__Scan__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:3310:1: rule__Scan__Group__2__Impl : ( 'with' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3314:1: ( ( 'with' ) )
            // InternalSelfCheckoutExperience.g:3315:1: ( 'with' )
            {
            // InternalSelfCheckoutExperience.g:3315:1: ( 'with' )
            // InternalSelfCheckoutExperience.g:3316:2: 'with'
            {
             before(grammarAccess.getScanAccess().getWithKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__2__Impl"


    // $ANTLR start "rule__Scan__Group__3"
    // InternalSelfCheckoutExperience.g:3325:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3329:1: ( rule__Scan__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:3330:2: rule__Scan__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scan__Group__3__Impl();

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
    // $ANTLR end "rule__Scan__Group__3"


    // $ANTLR start "rule__Scan__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:3336:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__ScanMachineAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3340:1: ( ( ( rule__Scan__ScanMachineAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3341:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3341:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3342:2: ( rule__Scan__ScanMachineAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getScanMachineAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3343:2: ( rule__Scan__ScanMachineAssignment_3 )
            // InternalSelfCheckoutExperience.g:3343:3: rule__Scan__ScanMachineAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scan__ScanMachineAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScanAccess().getScanMachineAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__3__Impl"


    // $ANTLR start "rule__CarryItems__Group__0"
    // InternalSelfCheckoutExperience.g:3352:1: rule__CarryItems__Group__0 : rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 ;
    public final void rule__CarryItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3356:1: ( rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 )
            // InternalSelfCheckoutExperience.g:3357:2: rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__CarryItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarryItems__Group__1();

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
    // $ANTLR end "rule__CarryItems__Group__0"


    // $ANTLR start "rule__CarryItems__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:3364:1: rule__CarryItems__Group__0__Impl : ( ( rule__CarryItems__CarryAssignment_0 ) ) ;
    public final void rule__CarryItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3368:1: ( ( ( rule__CarryItems__CarryAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:3369:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3369:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:3370:2: ( rule__CarryItems__CarryAssignment_0 )
            {
             before(grammarAccess.getCarryItemsAccess().getCarryAssignment_0()); 
            // InternalSelfCheckoutExperience.g:3371:2: ( rule__CarryItems__CarryAssignment_0 )
            // InternalSelfCheckoutExperience.g:3371:3: rule__CarryItems__CarryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CarryItems__CarryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCarryItemsAccess().getCarryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarryItems__Group__0__Impl"


    // $ANTLR start "rule__CarryItems__Group__1"
    // InternalSelfCheckoutExperience.g:3379:1: rule__CarryItems__Group__1 : rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 ;
    public final void rule__CarryItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3383:1: ( rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 )
            // InternalSelfCheckoutExperience.g:3384:2: rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__CarryItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarryItems__Group__2();

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
    // $ANTLR end "rule__CarryItems__Group__1"


    // $ANTLR start "rule__CarryItems__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:3391:1: rule__CarryItems__Group__1__Impl : ( 'all' ) ;
    public final void rule__CarryItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3395:1: ( ( 'all' ) )
            // InternalSelfCheckoutExperience.g:3396:1: ( 'all' )
            {
            // InternalSelfCheckoutExperience.g:3396:1: ( 'all' )
            // InternalSelfCheckoutExperience.g:3397:2: 'all'
            {
             before(grammarAccess.getCarryItemsAccess().getAllKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCarryItemsAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarryItems__Group__1__Impl"


    // $ANTLR start "rule__CarryItems__Group__2"
    // InternalSelfCheckoutExperience.g:3406:1: rule__CarryItems__Group__2 : rule__CarryItems__Group__2__Impl ;
    public final void rule__CarryItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3410:1: ( rule__CarryItems__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:3411:2: rule__CarryItems__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CarryItems__Group__2__Impl();

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
    // $ANTLR end "rule__CarryItems__Group__2"


    // $ANTLR start "rule__CarryItems__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:3417:1: rule__CarryItems__Group__2__Impl : ( 'items' ) ;
    public final void rule__CarryItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3421:1: ( ( 'items' ) )
            // InternalSelfCheckoutExperience.g:3422:1: ( 'items' )
            {
            // InternalSelfCheckoutExperience.g:3422:1: ( 'items' )
            // InternalSelfCheckoutExperience.g:3423:2: 'items'
            {
             before(grammarAccess.getCarryItemsAccess().getItemsKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCarryItemsAccess().getItemsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarryItems__Group__2__Impl"


    // $ANTLR start "rule__Self_checkout__SelfCheckoutOnlineAssignment_0"
    // InternalSelfCheckoutExperience.g:3433:1: rule__Self_checkout__SelfCheckoutOnlineAssignment_0 : ( ruleSelfCheckoutOnline ) ;
    public final void rule__Self_checkout__SelfCheckoutOnlineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3437:1: ( ( ruleSelfCheckoutOnline ) )
            // InternalSelfCheckoutExperience.g:3438:2: ( ruleSelfCheckoutOnline )
            {
            // InternalSelfCheckoutExperience.g:3438:2: ( ruleSelfCheckoutOnline )
            // InternalSelfCheckoutExperience.g:3439:3: ruleSelfCheckoutOnline
            {
             before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutOnlineSelfCheckoutOnlineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfCheckoutOnline();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutOnlineSelfCheckoutOnlineParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__SelfCheckoutOnlineAssignment_0"


    // $ANTLR start "rule__Self_checkout__SelfCheckoutInstoreAssignment_1"
    // InternalSelfCheckoutExperience.g:3448:1: rule__Self_checkout__SelfCheckoutInstoreAssignment_1 : ( ruleSelfCheckoutInstore ) ;
    public final void rule__Self_checkout__SelfCheckoutInstoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3452:1: ( ( ruleSelfCheckoutInstore ) )
            // InternalSelfCheckoutExperience.g:3453:2: ( ruleSelfCheckoutInstore )
            {
            // InternalSelfCheckoutExperience.g:3453:2: ( ruleSelfCheckoutInstore )
            // InternalSelfCheckoutExperience.g:3454:3: ruleSelfCheckoutInstore
            {
             before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutInstoreSelfCheckoutInstoreParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfCheckoutInstore();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutInstoreSelfCheckoutInstoreParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__SelfCheckoutInstoreAssignment_1"


    // $ANTLR start "rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0"
    // InternalSelfCheckoutExperience.g:3463:1: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 : ( ruleLoadShoppingSite ) ;
    public final void rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3467:1: ( ( ruleLoadShoppingSite ) )
            // InternalSelfCheckoutExperience.g:3468:2: ( ruleLoadShoppingSite )
            {
            // InternalSelfCheckoutExperience.g:3468:2: ( ruleLoadShoppingSite )
            // InternalSelfCheckoutExperience.g:3469:3: ruleLoadShoppingSite
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteLoadShoppingSiteEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLoadShoppingSite();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteLoadShoppingSiteEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0"


    // $ANTLR start "rule__SelfCheckoutOnline__SearchAssignment_1"
    // InternalSelfCheckoutExperience.g:3478:1: rule__SelfCheckoutOnline__SearchAssignment_1 : ( ruleSearch ) ;
    public final void rule__SelfCheckoutOnline__SearchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3482:1: ( ( ruleSearch ) )
            // InternalSelfCheckoutExperience.g:3483:2: ( ruleSearch )
            {
            // InternalSelfCheckoutExperience.g:3483:2: ( ruleSearch )
            // InternalSelfCheckoutExperience.g:3484:3: ruleSearch
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getSearchSearchParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutOnlineAccess().getSearchSearchParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__SearchAssignment_1"


    // $ANTLR start "rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2"
    // InternalSelfCheckoutExperience.g:3493:1: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 : ( ruleOnlineCheckout ) ;
    public final void rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3497:1: ( ( ruleOnlineCheckout ) )
            // InternalSelfCheckoutExperience.g:3498:2: ( ruleOnlineCheckout )
            {
            // InternalSelfCheckoutExperience.g:3498:2: ( ruleOnlineCheckout )
            // InternalSelfCheckoutExperience.g:3499:3: ruleOnlineCheckout
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutOnlineCheckoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOnlineCheckout();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutOnlineCheckoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2"


    // $ANTLR start "rule__Search__ItemSearchAssignment_2"
    // InternalSelfCheckoutExperience.g:3508:1: rule__Search__ItemSearchAssignment_2 : ( ruleItemDef ) ;
    public final void rule__Search__ItemSearchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3512:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:3513:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:3513:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:3514:3: ruleItemDef
            {
             before(grammarAccess.getSearchAccess().getItemSearchItemDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItemDef();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getItemSearchItemDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__ItemSearchAssignment_2"


    // $ANTLR start "rule__Search__AddToOnlineBasketAssignment_3"
    // InternalSelfCheckoutExperience.g:3523:1: rule__Search__AddToOnlineBasketAssignment_3 : ( ruleAddToOnlineBasket ) ;
    public final void rule__Search__AddToOnlineBasketAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3527:1: ( ( ruleAddToOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3528:2: ( ruleAddToOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3528:2: ( ruleAddToOnlineBasket )
            // InternalSelfCheckoutExperience.g:3529:3: ruleAddToOnlineBasket
            {
             before(grammarAccess.getSearchAccess().getAddToOnlineBasketAddToOnlineBasketParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddToOnlineBasket();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getAddToOnlineBasketAddToOnlineBasketParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__AddToOnlineBasketAssignment_3"


    // $ANTLR start "rule__AddToOnlineBasket__ItemCountAssignment_3"
    // InternalSelfCheckoutExperience.g:3538:1: rule__AddToOnlineBasket__ItemCountAssignment_3 : ( ruleAddition ) ;
    public final void rule__AddToOnlineBasket__ItemCountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3542:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3543:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3543:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3544:3: ruleAddition
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemCountAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddToOnlineBasketAccess().getItemCountAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__ItemCountAssignment_3"


    // $ANTLR start "rule__AddToOnlineBasket__ItemAssignment_4"
    // InternalSelfCheckoutExperience.g:3553:1: rule__AddToOnlineBasket__ItemAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AddToOnlineBasket__ItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3557:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3558:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3558:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3559:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_4_0()); 
            // InternalSelfCheckoutExperience.g:3560:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3561:4: RULE_ID
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__ItemAssignment_4"


    // $ANTLR start "rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5"
    // InternalSelfCheckoutExperience.g:3572:1: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 : ( ruleRemoveFromOnlineBasket ) ;
    public final void rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3576:1: ( ( ruleRemoveFromOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3577:2: ( ruleRemoveFromOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3577:2: ( ruleRemoveFromOnlineBasket )
            // InternalSelfCheckoutExperience.g:3578:3: ruleRemoveFromOnlineBasket
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketRemoveFromOnlineBasketParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRemoveFromOnlineBasket();

            state._fsp--;

             after(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketRemoveFromOnlineBasketParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5"


    // $ANTLR start "rule__RemoveFromOnlineBasket__RemoveItemAssignment_3"
    // InternalSelfCheckoutExperience.g:3587:1: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RemoveFromOnlineBasket__RemoveItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3591:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3592:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3592:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3593:3: ( RULE_ID )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:3594:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3595:4: RULE_ID
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveFromOnlineBasket__RemoveItemAssignment_3"


    // $ANTLR start "rule__OnlineCheckout__DeliveryOptionsAssignment_1"
    // InternalSelfCheckoutExperience.g:3606:1: rule__OnlineCheckout__DeliveryOptionsAssignment_1 : ( ruleDeliveryOptions ) ;
    public final void rule__OnlineCheckout__DeliveryOptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3610:1: ( ( ruleDeliveryOptions ) )
            // InternalSelfCheckoutExperience.g:3611:2: ( ruleDeliveryOptions )
            {
            // InternalSelfCheckoutExperience.g:3611:2: ( ruleDeliveryOptions )
            // InternalSelfCheckoutExperience.g:3612:3: ruleDeliveryOptions
            {
             before(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsDeliveryOptionsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeliveryOptions();

            state._fsp--;

             after(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsDeliveryOptionsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineCheckout__DeliveryOptionsAssignment_1"


    // $ANTLR start "rule__OnlineCheckout__ConfirmAssignment_2"
    // InternalSelfCheckoutExperience.g:3621:1: rule__OnlineCheckout__ConfirmAssignment_2 : ( ruleConfirm ) ;
    public final void rule__OnlineCheckout__ConfirmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3625:1: ( ( ruleConfirm ) )
            // InternalSelfCheckoutExperience.g:3626:2: ( ruleConfirm )
            {
            // InternalSelfCheckoutExperience.g:3626:2: ( ruleConfirm )
            // InternalSelfCheckoutExperience.g:3627:3: ruleConfirm
            {
             before(grammarAccess.getOnlineCheckoutAccess().getConfirmConfirmParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConfirm();

            state._fsp--;

             after(grammarAccess.getOnlineCheckoutAccess().getConfirmConfirmParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlineCheckout__ConfirmAssignment_2"


    // $ANTLR start "rule__Confirm__ConfirmEnumAssignment_0"
    // InternalSelfCheckoutExperience.g:3636:1: rule__Confirm__ConfirmEnumAssignment_0 : ( ruleConfirmEnum ) ;
    public final void rule__Confirm__ConfirmEnumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3640:1: ( ( ruleConfirmEnum ) )
            // InternalSelfCheckoutExperience.g:3641:2: ( ruleConfirmEnum )
            {
            // InternalSelfCheckoutExperience.g:3641:2: ( ruleConfirmEnum )
            // InternalSelfCheckoutExperience.g:3642:3: ruleConfirmEnum
            {
             before(grammarAccess.getConfirmAccess().getConfirmEnumConfirmEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfirmEnum();

            state._fsp--;

             after(grammarAccess.getConfirmAccess().getConfirmEnumConfirmEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Confirm__ConfirmEnumAssignment_0"


    // $ANTLR start "rule__Confirm__PayAssignment_1"
    // InternalSelfCheckoutExperience.g:3651:1: rule__Confirm__PayAssignment_1 : ( rulePay ) ;
    public final void rule__Confirm__PayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3655:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:3656:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:3656:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:3657:3: rulePay
            {
             before(grammarAccess.getConfirmAccess().getPayPayEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePay();

            state._fsp--;

             after(grammarAccess.getConfirmAccess().getPayPayEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Confirm__PayAssignment_1"


    // $ANTLR start "rule__SelfCheckoutInstore__PickScanMachineAssignment_0"
    // InternalSelfCheckoutExperience.g:3666:1: rule__SelfCheckoutInstore__PickScanMachineAssignment_0 : ( ruleHoldSelfScanner ) ;
    public final void rule__SelfCheckoutInstore__PickScanMachineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3670:1: ( ( ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3671:2: ( ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3671:2: ( ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:3672:3: ruleHoldSelfScanner
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHoldSelfScanner();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__PickScanMachineAssignment_0"


    // $ANTLR start "rule__SelfCheckoutInstore__PickstatementsAssignment_1_0"
    // InternalSelfCheckoutExperience.g:3681:1: rule__SelfCheckoutInstore__PickstatementsAssignment_1_0 : ( rulePickStatement ) ;
    public final void rule__SelfCheckoutInstore__PickstatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3685:1: ( ( rulePickStatement ) )
            // InternalSelfCheckoutExperience.g:3686:2: ( rulePickStatement )
            {
            // InternalSelfCheckoutExperience.g:3686:2: ( rulePickStatement )
            // InternalSelfCheckoutExperience.g:3687:3: rulePickStatement
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getPickstatementsPickStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePickStatement();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutInstoreAccess().getPickstatementsPickStatementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__PickstatementsAssignment_1_0"


    // $ANTLR start "rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1"
    // InternalSelfCheckoutExperience.g:3696:1: rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1 : ( ruleWalkStatement ) ;
    public final void rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3700:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckoutExperience.g:3701:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckoutExperience.g:3701:2: ( ruleWalkStatement )
            // InternalSelfCheckoutExperience.g:3702:3: ruleWalkStatement
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWalkStatement();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutInstoreAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__WalkstatementsAssignment_1_1"


    // $ANTLR start "rule__SelfCheckoutInstore__CheckoutAssignment_2"
    // InternalSelfCheckoutExperience.g:3711:1: rule__SelfCheckoutInstore__CheckoutAssignment_2 : ( ruleCheckout ) ;
    public final void rule__SelfCheckoutInstore__CheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3715:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:3716:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:3716:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:3717:3: ruleCheckout
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutCheckoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckout();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutCheckoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__CheckoutAssignment_2"


    // $ANTLR start "rule__HoldSelfScanner__ScanMachineAssignment_1"
    // InternalSelfCheckoutExperience.g:3726:1: rule__HoldSelfScanner__ScanMachineAssignment_1 : ( ruleSelfScanner ) ;
    public final void rule__HoldSelfScanner__ScanMachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3730:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3731:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3731:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:3732:3: ruleSelfScanner
            {
             before(grammarAccess.getHoldSelfScannerAccess().getScanMachineSelfScannerEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfScanner();

            state._fsp--;

             after(grammarAccess.getHoldSelfScannerAccess().getScanMachineSelfScannerEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldSelfScanner__ScanMachineAssignment_1"


    // $ANTLR start "rule__PickStatement__ItemCountAssignment_2"
    // InternalSelfCheckoutExperience.g:3741:1: rule__PickStatement__ItemCountAssignment_2 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3745:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3746:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3746:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3747:3: ruleAddition
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__ItemCountAssignment_2"


    // $ANTLR start "rule__PickStatement__ItemPickedAssignment_3"
    // InternalSelfCheckoutExperience.g:3756:1: rule__PickStatement__ItemPickedAssignment_3 : ( ruleItemDef ) ;
    public final void rule__PickStatement__ItemPickedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3760:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:3761:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:3761:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:3762:3: ruleItemDef
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItemDef();

            state._fsp--;

             after(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__ItemPickedAssignment_3"


    // $ANTLR start "rule__PickStatement__HoldingItemAssignment_4"
    // InternalSelfCheckoutExperience.g:3771:1: rule__PickStatement__HoldingItemAssignment_4 : ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3775:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) )
            // InternalSelfCheckoutExperience.g:3776:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3776:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            // InternalSelfCheckoutExperience.g:3777:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 
            // InternalSelfCheckoutExperience.g:3778:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            // InternalSelfCheckoutExperience.g:3778:4: rule__PickStatement__HoldingItemAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__HoldingItemAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__HoldingItemAssignment_4"


    // $ANTLR start "rule__ItemDef__NameAssignment"
    // InternalSelfCheckoutExperience.g:3786:1: rule__ItemDef__NameAssignment : ( RULE_ID ) ;
    public final void rule__ItemDef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3790:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3791:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:3791:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3792:3: RULE_ID
            {
             before(grammarAccess.getItemDefAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemDefAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDef__NameAssignment"


    // $ANTLR start "rule__ScanAndAddToBasket__ItemInBasketAssignment_5"
    // InternalSelfCheckoutExperience.g:3801:1: rule__ScanAndAddToBasket__ItemInBasketAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ScanAndAddToBasket__ItemInBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3805:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3806:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3806:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3807:3: ( RULE_ID )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0()); 
            // InternalSelfCheckoutExperience.g:3808:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3809:4: RULE_ID
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanAndAddToBasket__ItemInBasketAssignment_5"


    // $ANTLR start "rule__Drop__ItemDroppedAssignment_1"
    // InternalSelfCheckoutExperience.g:3820:1: rule__Drop__ItemDroppedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemDroppedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3824:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3825:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3825:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3826:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:3827:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3828:4: RULE_ID
            {
             before(grammarAccess.getDropAccess().getItemDroppedItemDefIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getItemDroppedItemDefIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__ItemDroppedAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalSelfCheckoutExperience.g:3839:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3843:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3844:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:3844:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3845:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalSelfCheckoutExperience.g:3854:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3858:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:3859:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:3859:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:3860:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__Repeat__CountAssignment_1"
    // InternalSelfCheckoutExperience.g:3869:1: rule__Repeat__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__Repeat__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3873:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3874:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3874:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3875:3: ruleAddition
            {
             before(grammarAccess.getRepeatAccess().getCountAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRepeatAccess().getCountAdditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__CountAssignment_1"


    // $ANTLR start "rule__Repeat__StatementsAssignment_3"
    // InternalSelfCheckoutExperience.g:3884:1: rule__Repeat__StatementsAssignment_3 : ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) ;
    public final void rule__Repeat__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3888:1: ( ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) )
            // InternalSelfCheckoutExperience.g:3889:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3889:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            // InternalSelfCheckoutExperience.g:3890:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAlternatives_3_0()); 
            // InternalSelfCheckoutExperience.g:3891:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            // InternalSelfCheckoutExperience.g:3891:4: rule__Repeat__StatementsAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__StatementsAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementsAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__StatementsAssignment_3"


    // $ANTLR start "rule__MoveStatement__CommandAssignment_0"
    // InternalSelfCheckoutExperience.g:3899:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3903:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:3904:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:3904:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:3905:3: ruleMoveCommand
            {
             before(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveCommand();

            state._fsp--;

             after(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__CommandAssignment_0"


    // $ANTLR start "rule__MoveStatement__StepsAssignment_2"
    // InternalSelfCheckoutExperience.g:3914:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3918:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3919:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3919:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3920:3: ruleAddition
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__StepsAssignment_2"


    // $ANTLR start "rule__TurnStatement__CommandAssignment_1"
    // InternalSelfCheckoutExperience.g:3929:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3933:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:3934:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:3934:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:3935:3: ruleTurnCommand
            {
             before(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnCommand();

            state._fsp--;

             after(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__CommandAssignment_1"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalSelfCheckoutExperience.g:3944:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3948:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3949:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3949:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:3950:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:3951:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:3951:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalSelfCheckoutExperience.g:3959:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3963:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:3964:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:3964:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:3965:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalSelfCheckoutExperience.g:3974:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3978:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3979:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3979:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:3980:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:3981:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:3981:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalSelfCheckoutExperience.g:3989:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3993:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:3994:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:3994:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:3995:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalSelfCheckoutExperience.g:4004:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4008:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:4009:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:4009:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:4010:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalSelfCheckoutExperience.g:4019:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4023:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:4024:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:4024:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4025:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:4026:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4027:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"


    // $ANTLR start "rule__Checkout__ScanAssignment_3"
    // InternalSelfCheckoutExperience.g:4038:1: rule__Checkout__ScanAssignment_3 : ( ruleScanExpression ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4042:1: ( ( ruleScanExpression ) )
            // InternalSelfCheckoutExperience.g:4043:2: ( ruleScanExpression )
            {
            // InternalSelfCheckoutExperience.g:4043:2: ( ruleScanExpression )
            // InternalSelfCheckoutExperience.g:4044:3: ruleScanExpression
            {
             before(grammarAccess.getCheckoutAccess().getScanScanExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScanExpression();

            state._fsp--;

             after(grammarAccess.getCheckoutAccess().getScanScanExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__ScanAssignment_3"


    // $ANTLR start "rule__Checkout__PayAssignment_4"
    // InternalSelfCheckoutExperience.g:4053:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4057:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:4058:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:4058:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:4059:3: rulePay
            {
             before(grammarAccess.getCheckoutAccess().getPayPayEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePay();

            state._fsp--;

             after(grammarAccess.getCheckoutAccess().getPayPayEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkout__PayAssignment_4"


    // $ANTLR start "rule__ScanExpression__NextAssignment_1_2"
    // InternalSelfCheckoutExperience.g:4068:1: rule__ScanExpression__NextAssignment_1_2 : ( ruleCarryItems ) ;
    public final void rule__ScanExpression__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4072:1: ( ( ruleCarryItems ) )
            // InternalSelfCheckoutExperience.g:4073:2: ( ruleCarryItems )
            {
            // InternalSelfCheckoutExperience.g:4073:2: ( ruleCarryItems )
            // InternalSelfCheckoutExperience.g:4074:3: ruleCarryItems
            {
             before(grammarAccess.getScanExpressionAccess().getNextCarryItemsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCarryItems();

            state._fsp--;

             after(grammarAccess.getScanExpressionAccess().getNextCarryItemsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScanExpression__NextAssignment_1_2"


    // $ANTLR start "rule__Scan__ScanMachineAssignment_3"
    // InternalSelfCheckoutExperience.g:4083:1: rule__Scan__ScanMachineAssignment_3 : ( ruleSelfScanner ) ;
    public final void rule__Scan__ScanMachineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4087:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:4088:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:4088:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:4089:3: ruleSelfScanner
            {
             before(grammarAccess.getScanAccess().getScanMachineSelfScannerEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfScanner();

            state._fsp--;

             after(grammarAccess.getScanAccess().getScanMachineSelfScannerEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__ScanMachineAssignment_3"


    // $ANTLR start "rule__CarryItems__CarryAssignment_0"
    // InternalSelfCheckoutExperience.g:4098:1: rule__CarryItems__CarryAssignment_0 : ( ruleCarry ) ;
    public final void rule__CarryItems__CarryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4102:1: ( ( ruleCarry ) )
            // InternalSelfCheckoutExperience.g:4103:2: ( ruleCarry )
            {
            // InternalSelfCheckoutExperience.g:4103:2: ( ruleCarry )
            // InternalSelfCheckoutExperience.g:4104:3: ruleCarry
            {
             before(grammarAccess.getCarryItemsAccess().getCarryCarryEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCarry();

            state._fsp--;

             after(grammarAccess.getCarryItemsAccess().getCarryCarryEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarryItems__CarryAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00030A1000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00010A1000C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00010A1000C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});

}