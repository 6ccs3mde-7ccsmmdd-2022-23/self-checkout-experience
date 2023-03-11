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
    // InternalSelfCheckoutExperience.g:62:1: ruleSelf_checkout : ( ( rule__Self_checkout__SelfCheckoutExperienceAssignment )* ) ;
    public final void ruleSelf_checkout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:66:2: ( ( ( rule__Self_checkout__SelfCheckoutExperienceAssignment )* ) )
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__SelfCheckoutExperienceAssignment )* )
            {
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__SelfCheckoutExperienceAssignment )* )
            // InternalSelfCheckoutExperience.g:68:3: ( rule__Self_checkout__SelfCheckoutExperienceAssignment )*
            {
             before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutExperienceAssignment()); 
            // InternalSelfCheckoutExperience.g:69:3: ( rule__Self_checkout__SelfCheckoutExperienceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:69:4: rule__Self_checkout__SelfCheckoutExperienceAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Self_checkout__SelfCheckoutExperienceAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutExperienceAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSelfCheckoutExperience"
    // InternalSelfCheckoutExperience.g:78:1: entryRuleSelfCheckoutExperience : ruleSelfCheckoutExperience EOF ;
    public final void entryRuleSelfCheckoutExperience() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:79:1: ( ruleSelfCheckoutExperience EOF )
            // InternalSelfCheckoutExperience.g:80:1: ruleSelfCheckoutExperience EOF
            {
             before(grammarAccess.getSelfCheckoutExperienceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfCheckoutExperience();

            state._fsp--;

             after(grammarAccess.getSelfCheckoutExperienceRule()); 
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
    // $ANTLR end "entryRuleSelfCheckoutExperience"


    // $ANTLR start "ruleSelfCheckoutExperience"
    // InternalSelfCheckoutExperience.g:87:1: ruleSelfCheckoutExperience : ( ( rule__SelfCheckoutExperience__Alternatives ) ) ;
    public final void ruleSelfCheckoutExperience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:91:2: ( ( ( rule__SelfCheckoutExperience__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__SelfCheckoutExperience__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__SelfCheckoutExperience__Alternatives ) )
            // InternalSelfCheckoutExperience.g:93:3: ( rule__SelfCheckoutExperience__Alternatives )
            {
             before(grammarAccess.getSelfCheckoutExperienceAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:94:3: ( rule__SelfCheckoutExperience__Alternatives )
            // InternalSelfCheckoutExperience.g:94:4: rule__SelfCheckoutExperience__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutExperience__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutExperienceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfCheckoutExperience"


    // $ANTLR start "entryRuleSelfCheckoutOnline"
    // InternalSelfCheckoutExperience.g:103:1: entryRuleSelfCheckoutOnline : ruleSelfCheckoutOnline EOF ;
    public final void entryRuleSelfCheckoutOnline() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:104:1: ( ruleSelfCheckoutOnline EOF )
            // InternalSelfCheckoutExperience.g:105:1: ruleSelfCheckoutOnline EOF
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
    // InternalSelfCheckoutExperience.g:112:1: ruleSelfCheckoutOnline : ( ( rule__SelfCheckoutOnline__Group__0 ) ) ;
    public final void ruleSelfCheckoutOnline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:116:2: ( ( ( rule__SelfCheckoutOnline__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__SelfCheckoutOnline__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__SelfCheckoutOnline__Group__0 ) )
            // InternalSelfCheckoutExperience.g:118:3: ( rule__SelfCheckoutOnline__Group__0 )
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:119:3: ( rule__SelfCheckoutOnline__Group__0 )
            // InternalSelfCheckoutExperience.g:119:4: rule__SelfCheckoutOnline__Group__0
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
    // InternalSelfCheckoutExperience.g:128:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:129:1: ( ruleSearch EOF )
            // InternalSelfCheckoutExperience.g:130:1: ruleSearch EOF
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
    // InternalSelfCheckoutExperience.g:137:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:141:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__Search__Group__0 ) )
            // InternalSelfCheckoutExperience.g:143:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:144:3: ( rule__Search__Group__0 )
            // InternalSelfCheckoutExperience.g:144:4: rule__Search__Group__0
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
    // InternalSelfCheckoutExperience.g:153:1: entryRuleAddToOnlineBasket : ruleAddToOnlineBasket EOF ;
    public final void entryRuleAddToOnlineBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:154:1: ( ruleAddToOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:155:1: ruleAddToOnlineBasket EOF
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
    // InternalSelfCheckoutExperience.g:162:1: ruleAddToOnlineBasket : ( ( rule__AddToOnlineBasket__Group__0 ) ) ;
    public final void ruleAddToOnlineBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:166:2: ( ( ( rule__AddToOnlineBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__AddToOnlineBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__AddToOnlineBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:168:3: ( rule__AddToOnlineBasket__Group__0 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:169:3: ( rule__AddToOnlineBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:169:4: rule__AddToOnlineBasket__Group__0
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
    // InternalSelfCheckoutExperience.g:178:1: entryRuleRemoveFromOnlineBasket : ruleRemoveFromOnlineBasket EOF ;
    public final void entryRuleRemoveFromOnlineBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:179:1: ( ruleRemoveFromOnlineBasket EOF )
            // InternalSelfCheckoutExperience.g:180:1: ruleRemoveFromOnlineBasket EOF
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
    // InternalSelfCheckoutExperience.g:187:1: ruleRemoveFromOnlineBasket : ( ( rule__RemoveFromOnlineBasket__Group__0 ) ) ;
    public final void ruleRemoveFromOnlineBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:191:2: ( ( ( rule__RemoveFromOnlineBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__RemoveFromOnlineBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__RemoveFromOnlineBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:193:3: ( rule__RemoveFromOnlineBasket__Group__0 )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:194:3: ( rule__RemoveFromOnlineBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:194:4: rule__RemoveFromOnlineBasket__Group__0
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
    // InternalSelfCheckoutExperience.g:203:1: entryRuleOnlineCheckout : ruleOnlineCheckout EOF ;
    public final void entryRuleOnlineCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:204:1: ( ruleOnlineCheckout EOF )
            // InternalSelfCheckoutExperience.g:205:1: ruleOnlineCheckout EOF
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
    // InternalSelfCheckoutExperience.g:212:1: ruleOnlineCheckout : ( ( rule__OnlineCheckout__Group__0 ) ) ;
    public final void ruleOnlineCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:216:2: ( ( ( rule__OnlineCheckout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__OnlineCheckout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__OnlineCheckout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:218:3: ( rule__OnlineCheckout__Group__0 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:219:3: ( rule__OnlineCheckout__Group__0 )
            // InternalSelfCheckoutExperience.g:219:4: rule__OnlineCheckout__Group__0
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
    // InternalSelfCheckoutExperience.g:228:1: entryRuleConfirm : ruleConfirm EOF ;
    public final void entryRuleConfirm() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:229:1: ( ruleConfirm EOF )
            // InternalSelfCheckoutExperience.g:230:1: ruleConfirm EOF
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
    // InternalSelfCheckoutExperience.g:237:1: ruleConfirm : ( ( rule__Confirm__Group__0 ) ) ;
    public final void ruleConfirm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:241:2: ( ( ( rule__Confirm__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__Confirm__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__Confirm__Group__0 ) )
            // InternalSelfCheckoutExperience.g:243:3: ( rule__Confirm__Group__0 )
            {
             before(grammarAccess.getConfirmAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:244:3: ( rule__Confirm__Group__0 )
            // InternalSelfCheckoutExperience.g:244:4: rule__Confirm__Group__0
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
    // InternalSelfCheckoutExperience.g:253:1: entryRuleSelfCheckoutInstore : ruleSelfCheckoutInstore EOF ;
    public final void entryRuleSelfCheckoutInstore() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:254:1: ( ruleSelfCheckoutInstore EOF )
            // InternalSelfCheckoutExperience.g:255:1: ruleSelfCheckoutInstore EOF
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
    // InternalSelfCheckoutExperience.g:262:1: ruleSelfCheckoutInstore : ( ( rule__SelfCheckoutInstore__Group__0 ) ) ;
    public final void ruleSelfCheckoutInstore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:266:2: ( ( ( rule__SelfCheckoutInstore__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__SelfCheckoutInstore__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__SelfCheckoutInstore__Group__0 ) )
            // InternalSelfCheckoutExperience.g:268:3: ( rule__SelfCheckoutInstore__Group__0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:269:3: ( rule__SelfCheckoutInstore__Group__0 )
            // InternalSelfCheckoutExperience.g:269:4: rule__SelfCheckoutInstore__Group__0
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
    // InternalSelfCheckoutExperience.g:278:1: entryRuleHoldSelfScanner : ruleHoldSelfScanner EOF ;
    public final void entryRuleHoldSelfScanner() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:279:1: ( ruleHoldSelfScanner EOF )
            // InternalSelfCheckoutExperience.g:280:1: ruleHoldSelfScanner EOF
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
    // InternalSelfCheckoutExperience.g:287:1: ruleHoldSelfScanner : ( ( rule__HoldSelfScanner__Group__0 ) ) ;
    public final void ruleHoldSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:291:2: ( ( ( rule__HoldSelfScanner__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            // InternalSelfCheckoutExperience.g:293:3: ( rule__HoldSelfScanner__Group__0 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:294:3: ( rule__HoldSelfScanner__Group__0 )
            // InternalSelfCheckoutExperience.g:294:4: rule__HoldSelfScanner__Group__0
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
    // InternalSelfCheckoutExperience.g:303:1: entryRulePickStatement : rulePickStatement EOF ;
    public final void entryRulePickStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:304:1: ( rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:305:1: rulePickStatement EOF
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
    // InternalSelfCheckoutExperience.g:312:1: rulePickStatement : ( ( rule__PickStatement__Group__0 ) ) ;
    public final void rulePickStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:316:2: ( ( ( rule__PickStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__PickStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__PickStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:318:3: ( rule__PickStatement__Group__0 )
            {
             before(grammarAccess.getPickStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:319:3: ( rule__PickStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:319:4: rule__PickStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:328:1: entryRuleItemDef : ruleItemDef EOF ;
    public final void entryRuleItemDef() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:329:1: ( ruleItemDef EOF )
            // InternalSelfCheckoutExperience.g:330:1: ruleItemDef EOF
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
    // InternalSelfCheckoutExperience.g:337:1: ruleItemDef : ( ( rule__ItemDef__NameAssignment ) ) ;
    public final void ruleItemDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:341:2: ( ( ( rule__ItemDef__NameAssignment ) ) )
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__ItemDef__NameAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__ItemDef__NameAssignment ) )
            // InternalSelfCheckoutExperience.g:343:3: ( rule__ItemDef__NameAssignment )
            {
             before(grammarAccess.getItemDefAccess().getNameAssignment()); 
            // InternalSelfCheckoutExperience.g:344:3: ( rule__ItemDef__NameAssignment )
            // InternalSelfCheckoutExperience.g:344:4: rule__ItemDef__NameAssignment
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
    // InternalSelfCheckoutExperience.g:353:1: entryRuleScanAndAddToBasket : ruleScanAndAddToBasket EOF ;
    public final void entryRuleScanAndAddToBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:354:1: ( ruleScanAndAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:355:1: ruleScanAndAddToBasket EOF
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
    // InternalSelfCheckoutExperience.g:362:1: ruleScanAndAddToBasket : ( ( rule__ScanAndAddToBasket__Group__0 ) ) ;
    public final void ruleScanAndAddToBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:366:2: ( ( ( rule__ScanAndAddToBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:368:3: ( rule__ScanAndAddToBasket__Group__0 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:369:3: ( rule__ScanAndAddToBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:369:4: rule__ScanAndAddToBasket__Group__0
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
    // InternalSelfCheckoutExperience.g:378:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:379:1: ( ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:380:1: ruleDrop EOF
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
    // InternalSelfCheckoutExperience.g:387:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:391:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__Drop__Group__0 ) )
            // InternalSelfCheckoutExperience.g:393:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:394:3: ( rule__Drop__Group__0 )
            // InternalSelfCheckoutExperience.g:394:4: rule__Drop__Group__0
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
    // InternalSelfCheckoutExperience.g:403:1: entryRuleWalkStatement : ruleWalkStatement EOF ;
    public final void entryRuleWalkStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:404:1: ( ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:405:1: ruleWalkStatement EOF
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
    // InternalSelfCheckoutExperience.g:412:1: ruleWalkStatement : ( ( rule__WalkStatement__Alternatives ) ) ;
    public final void ruleWalkStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:416:2: ( ( ( rule__WalkStatement__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__WalkStatement__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__WalkStatement__Alternatives ) )
            // InternalSelfCheckoutExperience.g:418:3: ( rule__WalkStatement__Alternatives )
            {
             before(grammarAccess.getWalkStatementAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:419:3: ( rule__WalkStatement__Alternatives )
            // InternalSelfCheckoutExperience.g:419:4: rule__WalkStatement__Alternatives
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
    // InternalSelfCheckoutExperience.g:428:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:429:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:430:1: ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:437:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:441:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckoutExperience.g:443:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:444:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckoutExperience.g:444:4: rule__VariableDeclaration__Group__0
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
    // InternalSelfCheckoutExperience.g:453:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:454:1: ( ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:455:1: ruleRepeat EOF
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
    // InternalSelfCheckoutExperience.g:462:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:466:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__Repeat__Group__0 ) )
            // InternalSelfCheckoutExperience.g:468:3: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:469:3: ( rule__Repeat__Group__0 )
            // InternalSelfCheckoutExperience.g:469:4: rule__Repeat__Group__0
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
    // InternalSelfCheckoutExperience.g:478:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:479:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:480:1: ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:487:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:491:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:493:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:494:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:494:4: rule__MoveStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:503:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:504:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:505:1: ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:512:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:516:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:518:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:519:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:519:4: rule__TurnStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:528:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:529:1: ( ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:530:1: ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:537:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:541:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckoutExperience.g:543:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:544:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckoutExperience.g:544:4: rule__Addition__Group__0
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
    // InternalSelfCheckoutExperience.g:553:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:554:1: ( ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:555:1: ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:562:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:566:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckoutExperience.g:568:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:569:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckoutExperience.g:569:4: rule__Multiplication__Group__0
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
    // InternalSelfCheckoutExperience.g:578:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:579:1: ( rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:580:1: rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:587:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:591:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckoutExperience.g:593:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:594:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckoutExperience.g:594:4: rule__Primary__Alternatives
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
    // InternalSelfCheckoutExperience.g:603:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:604:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:605:1: ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:612:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:616:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:618:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:619:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:619:4: rule__IntLiteral__ValAssignment
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
    // InternalSelfCheckoutExperience.g:628:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:629:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:630:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:637:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:641:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:643:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:644:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:644:4: rule__IntVarExpression__VarAssignment
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
    // InternalSelfCheckoutExperience.g:653:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:654:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:655:1: ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:662:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:666:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:667:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:667:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:668:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:669:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:669:4: rule__Checkout__Group__0
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
    // InternalSelfCheckoutExperience.g:678:1: entryRuleScanExpression : ruleScanExpression EOF ;
    public final void entryRuleScanExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:679:1: ( ruleScanExpression EOF )
            // InternalSelfCheckoutExperience.g:680:1: ruleScanExpression EOF
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
    // InternalSelfCheckoutExperience.g:687:1: ruleScanExpression : ( ( rule__ScanExpression__Group__0 ) ) ;
    public final void ruleScanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:691:2: ( ( ( rule__ScanExpression__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:692:2: ( ( rule__ScanExpression__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:692:2: ( ( rule__ScanExpression__Group__0 ) )
            // InternalSelfCheckoutExperience.g:693:3: ( rule__ScanExpression__Group__0 )
            {
             before(grammarAccess.getScanExpressionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:694:3: ( rule__ScanExpression__Group__0 )
            // InternalSelfCheckoutExperience.g:694:4: rule__ScanExpression__Group__0
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
    // InternalSelfCheckoutExperience.g:703:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:704:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:705:1: ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:712:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:716:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:717:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:717:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:718:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:719:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:719:4: rule__Scan__Group__0
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
    // InternalSelfCheckoutExperience.g:728:1: entryRuleCarryItems : ruleCarryItems EOF ;
    public final void entryRuleCarryItems() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:729:1: ( ruleCarryItems EOF )
            // InternalSelfCheckoutExperience.g:730:1: ruleCarryItems EOF
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
    // InternalSelfCheckoutExperience.g:737:1: ruleCarryItems : ( ( rule__CarryItems__Group__0 ) ) ;
    public final void ruleCarryItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:741:2: ( ( ( rule__CarryItems__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:742:2: ( ( rule__CarryItems__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:742:2: ( ( rule__CarryItems__Group__0 ) )
            // InternalSelfCheckoutExperience.g:743:3: ( rule__CarryItems__Group__0 )
            {
             before(grammarAccess.getCarryItemsAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:744:3: ( rule__CarryItems__Group__0 )
            // InternalSelfCheckoutExperience.g:744:4: rule__CarryItems__Group__0
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
    // InternalSelfCheckoutExperience.g:753:1: ruleLoadShoppingSite : ( ( 'load_shop_site' ) ) ;
    public final void ruleLoadShoppingSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:757:1: ( ( ( 'load_shop_site' ) ) )
            // InternalSelfCheckoutExperience.g:758:2: ( ( 'load_shop_site' ) )
            {
            // InternalSelfCheckoutExperience.g:758:2: ( ( 'load_shop_site' ) )
            // InternalSelfCheckoutExperience.g:759:3: ( 'load_shop_site' )
            {
             before(grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:760:3: ( 'load_shop_site' )
            // InternalSelfCheckoutExperience.g:760:4: 'load_shop_site'
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
    // InternalSelfCheckoutExperience.g:769:1: ruleDeliveryOptions : ( ( rule__DeliveryOptions__Alternatives ) ) ;
    public final void ruleDeliveryOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:773:1: ( ( ( rule__DeliveryOptions__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:774:2: ( ( rule__DeliveryOptions__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:774:2: ( ( rule__DeliveryOptions__Alternatives ) )
            // InternalSelfCheckoutExperience.g:775:3: ( rule__DeliveryOptions__Alternatives )
            {
             before(grammarAccess.getDeliveryOptionsAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:776:3: ( rule__DeliveryOptions__Alternatives )
            // InternalSelfCheckoutExperience.g:776:4: rule__DeliveryOptions__Alternatives
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
    // InternalSelfCheckoutExperience.g:785:1: ruleConfirmEnum : ( ( 'confirm' ) ) ;
    public final void ruleConfirmEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:789:1: ( ( ( 'confirm' ) ) )
            // InternalSelfCheckoutExperience.g:790:2: ( ( 'confirm' ) )
            {
            // InternalSelfCheckoutExperience.g:790:2: ( ( 'confirm' ) )
            // InternalSelfCheckoutExperience.g:791:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:792:3: ( 'confirm' )
            // InternalSelfCheckoutExperience.g:792:4: 'confirm'
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
    // InternalSelfCheckoutExperience.g:801:1: ruleSelfScanner : ( ( 'selfscanner' ) ) ;
    public final void ruleSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:805:1: ( ( ( 'selfscanner' ) ) )
            // InternalSelfCheckoutExperience.g:806:2: ( ( 'selfscanner' ) )
            {
            // InternalSelfCheckoutExperience.g:806:2: ( ( 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:807:3: ( 'selfscanner' )
            {
             before(grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:808:3: ( 'selfscanner' )
            // InternalSelfCheckoutExperience.g:808:4: 'selfscanner'
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
    // InternalSelfCheckoutExperience.g:817:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:821:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:822:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:822:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:823:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:824:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:824:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:833:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:837:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:838:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:838:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:839:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:840:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:840:4: rule__TurnCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:849:1: ruleCarry : ( ( rule__Carry__Alternatives ) ) ;
    public final void ruleCarry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:853:1: ( ( ( rule__Carry__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:854:2: ( ( rule__Carry__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:854:2: ( ( rule__Carry__Alternatives ) )
            // InternalSelfCheckoutExperience.g:855:3: ( rule__Carry__Alternatives )
            {
             before(grammarAccess.getCarryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:856:3: ( rule__Carry__Alternatives )
            // InternalSelfCheckoutExperience.g:856:4: rule__Carry__Alternatives
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
    // InternalSelfCheckoutExperience.g:865:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:869:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:870:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:870:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:871:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:872:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:872:4: 'pay'
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


    // $ANTLR start "rule__SelfCheckoutExperience__Alternatives"
    // InternalSelfCheckoutExperience.g:880:1: rule__SelfCheckoutExperience__Alternatives : ( ( ruleSelfCheckoutOnline ) | ( ruleSelfCheckoutInstore ) );
    public final void rule__SelfCheckoutExperience__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:884:1: ( ( ruleSelfCheckoutOnline ) | ( ruleSelfCheckoutInstore ) )
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
                    // InternalSelfCheckoutExperience.g:885:2: ( ruleSelfCheckoutOnline )
                    {
                    // InternalSelfCheckoutExperience.g:885:2: ( ruleSelfCheckoutOnline )
                    // InternalSelfCheckoutExperience.g:886:3: ruleSelfCheckoutOnline
                    {
                     before(grammarAccess.getSelfCheckoutExperienceAccess().getSelfCheckoutOnlineParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelfCheckoutOnline();

                    state._fsp--;

                     after(grammarAccess.getSelfCheckoutExperienceAccess().getSelfCheckoutOnlineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:891:2: ( ruleSelfCheckoutInstore )
                    {
                    // InternalSelfCheckoutExperience.g:891:2: ( ruleSelfCheckoutInstore )
                    // InternalSelfCheckoutExperience.g:892:3: ruleSelfCheckoutInstore
                    {
                     before(grammarAccess.getSelfCheckoutExperienceAccess().getSelfCheckoutInstoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelfCheckoutInstore();

                    state._fsp--;

                     after(grammarAccess.getSelfCheckoutExperienceAccess().getSelfCheckoutInstoreParserRuleCall_1()); 

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
    // $ANTLR end "rule__SelfCheckoutExperience__Alternatives"


    // $ANTLR start "rule__SelfCheckoutInstore__StatementAlternatives_1_0"
    // InternalSelfCheckoutExperience.g:901:1: rule__SelfCheckoutInstore__StatementAlternatives_1_0 : ( ( rulePickStatement ) | ( ruleWalkStatement ) );
    public final void rule__SelfCheckoutInstore__StatementAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:905:1: ( ( rulePickStatement ) | ( ruleWalkStatement ) )
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
                    // InternalSelfCheckoutExperience.g:906:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:906:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:907:3: rulePickStatement
                    {
                     before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementPickStatementParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePickStatement();

                    state._fsp--;

                     after(grammarAccess.getSelfCheckoutInstoreAccess().getStatementPickStatementParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:912:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:912:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:913:3: ruleWalkStatement
                    {
                     before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementWalkStatementParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWalkStatement();

                    state._fsp--;

                     after(grammarAccess.getSelfCheckoutInstoreAccess().getStatementWalkStatementParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__SelfCheckoutInstore__StatementAlternatives_1_0"


    // $ANTLR start "rule__PickStatement__HoldingItemAlternatives_4_0"
    // InternalSelfCheckoutExperience.g:922:1: rule__PickStatement__HoldingItemAlternatives_4_0 : ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:926:1: ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) )
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
                    // InternalSelfCheckoutExperience.g:927:2: ( ruleScanAndAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:927:2: ( ruleScanAndAddToBasket )
                    // InternalSelfCheckoutExperience.g:928:3: ruleScanAndAddToBasket
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
                    // InternalSelfCheckoutExperience.g:933:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:933:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:934:3: ruleDrop
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
    // InternalSelfCheckoutExperience.g:943:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:947:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) )
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
                    // InternalSelfCheckoutExperience.g:948:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:948:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:949:3: ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:954:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:954:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:955:3: ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:960:2: ( ruleRepeat )
                    {
                    // InternalSelfCheckoutExperience.g:960:2: ( ruleRepeat )
                    // InternalSelfCheckoutExperience.g:961:3: ruleRepeat
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
                    // InternalSelfCheckoutExperience.g:966:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:966:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:967:3: ruleVariableDeclaration
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
    // InternalSelfCheckoutExperience.g:976:1: rule__Repeat__StatementsAlternatives_3_0 : ( ( ruleWalkStatement ) | ( rulePickStatement ) );
    public final void rule__Repeat__StatementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:980:1: ( ( ruleWalkStatement ) | ( rulePickStatement ) )
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
                    // InternalSelfCheckoutExperience.g:981:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:981:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:982:3: ruleWalkStatement
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
                    // InternalSelfCheckoutExperience.g:987:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:987:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:988:3: rulePickStatement
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
    // InternalSelfCheckoutExperience.g:997:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1001:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalSelfCheckoutExperience.g:1002:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:1002:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:1003:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1008:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:1008:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:1009:3: '-'
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
    // InternalSelfCheckoutExperience.g:1018:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1022:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalSelfCheckoutExperience.g:1023:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:1023:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:1024:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1029:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:1029:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:1030:3: '/'
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
    // InternalSelfCheckoutExperience.g:1039:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1043:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
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
                    // InternalSelfCheckoutExperience.g:1044:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:1044:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:1045:3: ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:1050:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:1050:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:1051:3: ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:1056:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:1056:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSelfCheckoutExperience.g:1057:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalSelfCheckoutExperience.g:1058:3: ( rule__Primary__Group_2__0 )
                    // InternalSelfCheckoutExperience.g:1058:4: rule__Primary__Group_2__0
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
    // InternalSelfCheckoutExperience.g:1066:1: rule__DeliveryOptions__Alternatives : ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) );
    public final void rule__DeliveryOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1070:1: ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1071:2: ( ( 'premium_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1071:2: ( ( 'premium_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1072:3: ( 'premium_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1073:3: ( 'premium_delivery' )
                    // InternalSelfCheckoutExperience.g:1073:4: 'premium_delivery'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1077:2: ( ( 'standard_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1077:2: ( ( 'standard_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1078:3: ( 'standard_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1079:3: ( 'standard_delivery' )
                    // InternalSelfCheckoutExperience.g:1079:4: 'standard_delivery'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:1083:2: ( ( 'next_day_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1083:2: ( ( 'next_day_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1084:3: ( 'next_day_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2()); 
                    // InternalSelfCheckoutExperience.g:1085:3: ( 'next_day_delivery' )
                    // InternalSelfCheckoutExperience.g:1085:4: 'next_day_delivery'
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
    // InternalSelfCheckoutExperience.g:1093:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1097:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1098:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1098:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:1099:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1100:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:1100:4: 'forward'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1104:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1104:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:1105:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1106:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:1106:4: 'backward'
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
    // InternalSelfCheckoutExperience.g:1114:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1118:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1119:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1119:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:1120:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1121:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:1121:4: 'left'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1125:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1125:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:1126:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1127:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:1127:4: 'right'
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
    // InternalSelfCheckoutExperience.g:1135:1: rule__Carry__Alternatives : ( ( ( 'bag' ) ) | ( ( 'hold' ) ) );
    public final void rule__Carry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1139:1: ( ( ( 'bag' ) ) | ( ( 'hold' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1140:2: ( ( 'bag' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1140:2: ( ( 'bag' ) )
                    // InternalSelfCheckoutExperience.g:1141:3: ( 'bag' )
                    {
                     before(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1142:3: ( 'bag' )
                    // InternalSelfCheckoutExperience.g:1142:4: 'bag'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1146:2: ( ( 'hold' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1146:2: ( ( 'hold' ) )
                    // InternalSelfCheckoutExperience.g:1147:3: ( 'hold' )
                    {
                     before(grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1148:3: ( 'hold' )
                    // InternalSelfCheckoutExperience.g:1148:4: 'hold'
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
    // InternalSelfCheckoutExperience.g:1156:1: rule__SelfCheckoutOnline__Group__0 : rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 ;
    public final void rule__SelfCheckoutOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1160:1: ( rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 )
            // InternalSelfCheckoutExperience.g:1161:2: rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSelfCheckoutExperience.g:1168:1: rule__SelfCheckoutOnline__Group__0__Impl : ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) ;
    public final void rule__SelfCheckoutOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1172:1: ( ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1173:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1173:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1174:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1175:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            // InternalSelfCheckoutExperience.g:1175:3: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0
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
    // InternalSelfCheckoutExperience.g:1183:1: rule__SelfCheckoutOnline__Group__1 : rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 ;
    public final void rule__SelfCheckoutOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1187:1: ( rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 )
            // InternalSelfCheckoutExperience.g:1188:2: rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSelfCheckoutExperience.g:1195:1: rule__SelfCheckoutOnline__Group__1__Impl : ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) ;
    public final void rule__SelfCheckoutOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1199:1: ( ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) )
            // InternalSelfCheckoutExperience.g:1200:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1200:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            // InternalSelfCheckoutExperience.g:1201:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getSearchAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1202:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1202:3: rule__SelfCheckoutOnline__SearchAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalSelfCheckoutExperience.g:1210:1: rule__SelfCheckoutOnline__Group__2 : rule__SelfCheckoutOnline__Group__2__Impl ;
    public final void rule__SelfCheckoutOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1214:1: ( rule__SelfCheckoutOnline__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1215:2: rule__SelfCheckoutOnline__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1221:1: rule__SelfCheckoutOnline__Group__2__Impl : ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1225:1: ( ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1226:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1226:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1227:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1228:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1228:3: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2
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
    // InternalSelfCheckoutExperience.g:1237:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1241:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalSelfCheckoutExperience.g:1242:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1249:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1253:1: ( ( 'search' ) )
            // InternalSelfCheckoutExperience.g:1254:1: ( 'search' )
            {
            // InternalSelfCheckoutExperience.g:1254:1: ( 'search' )
            // InternalSelfCheckoutExperience.g:1255:2: 'search'
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
    // InternalSelfCheckoutExperience.g:1264:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1268:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalSelfCheckoutExperience.g:1269:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1276:1: rule__Search__Group__1__Impl : ( 'for' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1280:1: ( ( 'for' ) )
            // InternalSelfCheckoutExperience.g:1281:1: ( 'for' )
            {
            // InternalSelfCheckoutExperience.g:1281:1: ( 'for' )
            // InternalSelfCheckoutExperience.g:1282:2: 'for'
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
    // InternalSelfCheckoutExperience.g:1291:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1295:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalSelfCheckoutExperience.g:1296:2: rule__Search__Group__2__Impl rule__Search__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:1303:1: rule__Search__Group__2__Impl : ( ( rule__Search__ItemSearchAssignment_2 ) ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1307:1: ( ( ( rule__Search__ItemSearchAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1308:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1308:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1309:2: ( rule__Search__ItemSearchAssignment_2 )
            {
             before(grammarAccess.getSearchAccess().getItemSearchAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1310:2: ( rule__Search__ItemSearchAssignment_2 )
            // InternalSelfCheckoutExperience.g:1310:3: rule__Search__ItemSearchAssignment_2
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
    // InternalSelfCheckoutExperience.g:1318:1: rule__Search__Group__3 : rule__Search__Group__3__Impl ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1322:1: ( rule__Search__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1323:2: rule__Search__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1329:1: rule__Search__Group__3__Impl : ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1333:1: ( ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) )
            // InternalSelfCheckoutExperience.g:1334:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            {
            // InternalSelfCheckoutExperience.g:1334:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            // InternalSelfCheckoutExperience.g:1335:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            {
             before(grammarAccess.getSearchAccess().getAddToOnlineBasketAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1336:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1336:3: rule__Search__AddToOnlineBasketAssignment_3
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
    // InternalSelfCheckoutExperience.g:1345:1: rule__AddToOnlineBasket__Group__0 : rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 ;
    public final void rule__AddToOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1349:1: ( rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1350:2: rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckoutExperience.g:1357:1: rule__AddToOnlineBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1361:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:1362:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:1362:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:1363:2: 'add'
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
    // InternalSelfCheckoutExperience.g:1372:1: rule__AddToOnlineBasket__Group__1 : rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 ;
    public final void rule__AddToOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1376:1: ( rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1377:2: rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSelfCheckoutExperience.g:1384:1: rule__AddToOnlineBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1388:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1389:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1389:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1390:2: 'to'
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
    // InternalSelfCheckoutExperience.g:1399:1: rule__AddToOnlineBasket__Group__2 : rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 ;
    public final void rule__AddToOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1403:1: ( rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1404:2: rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:1411:1: rule__AddToOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1415:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1416:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1416:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1417:2: 'basket'
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
    // InternalSelfCheckoutExperience.g:1426:1: rule__AddToOnlineBasket__Group__3 : rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 ;
    public final void rule__AddToOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1430:1: ( rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:1431:2: rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1438:1: rule__AddToOnlineBasket__Group__3__Impl : ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) ) ;
    public final void rule__AddToOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1442:1: ( ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1443:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1443:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1444:2: ( rule__AddToOnlineBasket__ItemCountAssignment_3 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1445:2: ( rule__AddToOnlineBasket__ItemCountAssignment_3 )
            // InternalSelfCheckoutExperience.g:1445:3: rule__AddToOnlineBasket__ItemCountAssignment_3
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
    // InternalSelfCheckoutExperience.g:1453:1: rule__AddToOnlineBasket__Group__4 : rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 ;
    public final void rule__AddToOnlineBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1457:1: ( rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:1458:2: rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:1465:1: rule__AddToOnlineBasket__Group__4__Impl : ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) ) ;
    public final void rule__AddToOnlineBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1469:1: ( ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1470:1: ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1470:1: ( ( rule__AddToOnlineBasket__ItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1471:2: ( rule__AddToOnlineBasket__ItemAssignment_4 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1472:2: ( rule__AddToOnlineBasket__ItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:1472:3: rule__AddToOnlineBasket__ItemAssignment_4
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
    // InternalSelfCheckoutExperience.g:1480:1: rule__AddToOnlineBasket__Group__5 : rule__AddToOnlineBasket__Group__5__Impl ;
    public final void rule__AddToOnlineBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1484:1: ( rule__AddToOnlineBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:1485:2: rule__AddToOnlineBasket__Group__5__Impl
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
    // InternalSelfCheckoutExperience.g:1491:1: rule__AddToOnlineBasket__Group__5__Impl : ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? ) ;
    public final void rule__AddToOnlineBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1495:1: ( ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? ) )
            // InternalSelfCheckoutExperience.g:1496:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? )
            {
            // InternalSelfCheckoutExperience.g:1496:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )? )
            // InternalSelfCheckoutExperience.g:1497:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )?
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:1498:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1498:3: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5
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
    // InternalSelfCheckoutExperience.g:1507:1: rule__RemoveFromOnlineBasket__Group__0 : rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 ;
    public final void rule__RemoveFromOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1511:1: ( rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1512:2: rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:1519:1: rule__RemoveFromOnlineBasket__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1523:1: ( ( 'remove' ) )
            // InternalSelfCheckoutExperience.g:1524:1: ( 'remove' )
            {
            // InternalSelfCheckoutExperience.g:1524:1: ( 'remove' )
            // InternalSelfCheckoutExperience.g:1525:2: 'remove'
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
    // InternalSelfCheckoutExperience.g:1534:1: rule__RemoveFromOnlineBasket__Group__1 : rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 ;
    public final void rule__RemoveFromOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1538:1: ( rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1539:2: rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSelfCheckoutExperience.g:1546:1: rule__RemoveFromOnlineBasket__Group__1__Impl : ( 'from' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1550:1: ( ( 'from' ) )
            // InternalSelfCheckoutExperience.g:1551:1: ( 'from' )
            {
            // InternalSelfCheckoutExperience.g:1551:1: ( 'from' )
            // InternalSelfCheckoutExperience.g:1552:2: 'from'
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
    // InternalSelfCheckoutExperience.g:1561:1: rule__RemoveFromOnlineBasket__Group__2 : rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 ;
    public final void rule__RemoveFromOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1565:1: ( rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1566:2: rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1573:1: rule__RemoveFromOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1577:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1578:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1578:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1579:2: 'basket'
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
    // InternalSelfCheckoutExperience.g:1588:1: rule__RemoveFromOnlineBasket__Group__3 : rule__RemoveFromOnlineBasket__Group__3__Impl ;
    public final void rule__RemoveFromOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1592:1: ( rule__RemoveFromOnlineBasket__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1593:2: rule__RemoveFromOnlineBasket__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1599:1: rule__RemoveFromOnlineBasket__Group__3__Impl : ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) ;
    public final void rule__RemoveFromOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1603:1: ( ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1604:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1604:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1605:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1606:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:1606:3: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3
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
    // InternalSelfCheckoutExperience.g:1615:1: rule__OnlineCheckout__Group__0 : rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 ;
    public final void rule__OnlineCheckout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1619:1: ( rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 )
            // InternalSelfCheckoutExperience.g:1620:2: rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSelfCheckoutExperience.g:1627:1: rule__OnlineCheckout__Group__0__Impl : ( 'checkout' ) ;
    public final void rule__OnlineCheckout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1631:1: ( ( 'checkout' ) )
            // InternalSelfCheckoutExperience.g:1632:1: ( 'checkout' )
            {
            // InternalSelfCheckoutExperience.g:1632:1: ( 'checkout' )
            // InternalSelfCheckoutExperience.g:1633:2: 'checkout'
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
    // InternalSelfCheckoutExperience.g:1642:1: rule__OnlineCheckout__Group__1 : rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 ;
    public final void rule__OnlineCheckout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1646:1: ( rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 )
            // InternalSelfCheckoutExperience.g:1647:2: rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSelfCheckoutExperience.g:1654:1: rule__OnlineCheckout__Group__1__Impl : ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) ;
    public final void rule__OnlineCheckout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1658:1: ( ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1659:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1659:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1660:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1661:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            // InternalSelfCheckoutExperience.g:1661:3: rule__OnlineCheckout__DeliveryOptionsAssignment_1
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
    // InternalSelfCheckoutExperience.g:1669:1: rule__OnlineCheckout__Group__2 : rule__OnlineCheckout__Group__2__Impl ;
    public final void rule__OnlineCheckout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1673:1: ( rule__OnlineCheckout__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1674:2: rule__OnlineCheckout__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1680:1: rule__OnlineCheckout__Group__2__Impl : ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) ;
    public final void rule__OnlineCheckout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1684:1: ( ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1685:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1685:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1686:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getConfirmAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1687:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            // InternalSelfCheckoutExperience.g:1687:3: rule__OnlineCheckout__ConfirmAssignment_2
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
    // InternalSelfCheckoutExperience.g:1696:1: rule__Confirm__Group__0 : rule__Confirm__Group__0__Impl rule__Confirm__Group__1 ;
    public final void rule__Confirm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1700:1: ( rule__Confirm__Group__0__Impl rule__Confirm__Group__1 )
            // InternalSelfCheckoutExperience.g:1701:2: rule__Confirm__Group__0__Impl rule__Confirm__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSelfCheckoutExperience.g:1708:1: rule__Confirm__Group__0__Impl : ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) ;
    public final void rule__Confirm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1712:1: ( ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1713:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1713:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1714:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            {
             before(grammarAccess.getConfirmAccess().getConfirmEnumAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1715:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            // InternalSelfCheckoutExperience.g:1715:3: rule__Confirm__ConfirmEnumAssignment_0
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
    // InternalSelfCheckoutExperience.g:1723:1: rule__Confirm__Group__1 : rule__Confirm__Group__1__Impl ;
    public final void rule__Confirm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1727:1: ( rule__Confirm__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1728:2: rule__Confirm__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1734:1: rule__Confirm__Group__1__Impl : ( ( rule__Confirm__PayAssignment_1 ) ) ;
    public final void rule__Confirm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1738:1: ( ( ( rule__Confirm__PayAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1739:1: ( ( rule__Confirm__PayAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1739:1: ( ( rule__Confirm__PayAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1740:2: ( rule__Confirm__PayAssignment_1 )
            {
             before(grammarAccess.getConfirmAccess().getPayAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1741:2: ( rule__Confirm__PayAssignment_1 )
            // InternalSelfCheckoutExperience.g:1741:3: rule__Confirm__PayAssignment_1
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
    // InternalSelfCheckoutExperience.g:1750:1: rule__SelfCheckoutInstore__Group__0 : rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 ;
    public final void rule__SelfCheckoutInstore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1754:1: ( rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 )
            // InternalSelfCheckoutExperience.g:1755:2: rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1762:1: rule__SelfCheckoutInstore__Group__0__Impl : ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) ;
    public final void rule__SelfCheckoutInstore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1766:1: ( ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1767:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1767:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1768:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1769:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            // InternalSelfCheckoutExperience.g:1769:3: rule__SelfCheckoutInstore__PickScanMachineAssignment_0
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
    // InternalSelfCheckoutExperience.g:1777:1: rule__SelfCheckoutInstore__Group__1 : rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 ;
    public final void rule__SelfCheckoutInstore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1781:1: ( rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 )
            // InternalSelfCheckoutExperience.g:1782:2: rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1789:1: rule__SelfCheckoutInstore__Group__1__Impl : ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* ) ;
    public final void rule__SelfCheckoutInstore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1793:1: ( ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* ) )
            // InternalSelfCheckoutExperience.g:1794:1: ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1794:1: ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* )
            // InternalSelfCheckoutExperience.g:1795:2: ( rule__SelfCheckoutInstore__StatementAssignment_1 )*
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1796:2: ( rule__SelfCheckoutInstore__StatementAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=22 && LA18_0<=23)||LA18_0==36||LA18_0==41||LA18_0==43||LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1796:3: rule__SelfCheckoutInstore__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SelfCheckoutInstore__StatementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAssignment_1()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1804:1: rule__SelfCheckoutInstore__Group__2 : rule__SelfCheckoutInstore__Group__2__Impl ;
    public final void rule__SelfCheckoutInstore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1808:1: ( rule__SelfCheckoutInstore__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1809:2: rule__SelfCheckoutInstore__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1815:1: rule__SelfCheckoutInstore__Group__2__Impl : ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutInstore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1819:1: ( ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1820:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1820:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1821:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1822:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1822:3: rule__SelfCheckoutInstore__CheckoutAssignment_2
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
    // InternalSelfCheckoutExperience.g:1831:1: rule__HoldSelfScanner__Group__0 : rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 ;
    public final void rule__HoldSelfScanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1835:1: ( rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 )
            // InternalSelfCheckoutExperience.g:1836:2: rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1843:1: rule__HoldSelfScanner__Group__0__Impl : ( 'hold' ) ;
    public final void rule__HoldSelfScanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1847:1: ( ( 'hold' ) )
            // InternalSelfCheckoutExperience.g:1848:1: ( 'hold' )
            {
            // InternalSelfCheckoutExperience.g:1848:1: ( 'hold' )
            // InternalSelfCheckoutExperience.g:1849:2: 'hold'
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
    // InternalSelfCheckoutExperience.g:1858:1: rule__HoldSelfScanner__Group__1 : rule__HoldSelfScanner__Group__1__Impl ;
    public final void rule__HoldSelfScanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1862:1: ( rule__HoldSelfScanner__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1863:2: rule__HoldSelfScanner__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1869:1: rule__HoldSelfScanner__Group__1__Impl : ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) ;
    public final void rule__HoldSelfScanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1873:1: ( ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1874:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1874:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1875:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1876:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            // InternalSelfCheckoutExperience.g:1876:3: rule__HoldSelfScanner__ScanMachineAssignment_1
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
    // InternalSelfCheckoutExperience.g:1885:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1889:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1890:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSelfCheckoutExperience.g:1897:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1901:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:1902:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:1902:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:1903:2: 'pick'
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
    // InternalSelfCheckoutExperience.g:1912:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1916:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1917:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:1924:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1928:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:1929:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:1929:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:1930:2: 'up'
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
    // InternalSelfCheckoutExperience.g:1939:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1943:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1944:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1951:1: rule__PickStatement__Group__2__Impl : ( ( rule__PickStatement__ItemCountAssignment_2 ) ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1955:1: ( ( ( rule__PickStatement__ItemCountAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1956:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1956:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1957:2: ( rule__PickStatement__ItemCountAssignment_2 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1958:2: ( rule__PickStatement__ItemCountAssignment_2 )
            // InternalSelfCheckoutExperience.g:1958:3: rule__PickStatement__ItemCountAssignment_2
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
    // InternalSelfCheckoutExperience.g:1966:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1970:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:1971:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:1978:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1982:1: ( ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1983:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1983:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1984:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1985:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            // InternalSelfCheckoutExperience.g:1985:3: rule__PickStatement__ItemPickedAssignment_3
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
    // InternalSelfCheckoutExperience.g:1993:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1997:1: ( rule__PickStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1998:2: rule__PickStatement__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2004:1: rule__PickStatement__Group__4__Impl : ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2008:1: ( ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:2009:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:2009:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:2010:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2011:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:2011:3: rule__PickStatement__HoldingItemAssignment_4
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
    // InternalSelfCheckoutExperience.g:2020:1: rule__ScanAndAddToBasket__Group__0 : rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 ;
    public final void rule__ScanAndAddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2024:1: ( rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:2025:2: rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSelfCheckoutExperience.g:2032:1: rule__ScanAndAddToBasket__Group__0__Impl : ( 'scan' ) ;
    public final void rule__ScanAndAddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2036:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2037:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2037:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2038:2: 'scan'
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
    // InternalSelfCheckoutExperience.g:2047:1: rule__ScanAndAddToBasket__Group__1 : rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 ;
    public final void rule__ScanAndAddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2051:1: ( rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:2052:2: rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:2059:1: rule__ScanAndAddToBasket__Group__1__Impl : ( 'and' ) ;
    public final void rule__ScanAndAddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2063:1: ( ( 'and' ) )
            // InternalSelfCheckoutExperience.g:2064:1: ( 'and' )
            {
            // InternalSelfCheckoutExperience.g:2064:1: ( 'and' )
            // InternalSelfCheckoutExperience.g:2065:2: 'and'
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
    // InternalSelfCheckoutExperience.g:2074:1: rule__ScanAndAddToBasket__Group__2 : rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 ;
    public final void rule__ScanAndAddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2078:1: ( rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:2079:2: rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckoutExperience.g:2086:1: rule__ScanAndAddToBasket__Group__2__Impl : ( 'add' ) ;
    public final void rule__ScanAndAddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2090:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2091:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2091:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2092:2: 'add'
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
    // InternalSelfCheckoutExperience.g:2101:1: rule__ScanAndAddToBasket__Group__3 : rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 ;
    public final void rule__ScanAndAddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2105:1: ( rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:2106:2: rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSelfCheckoutExperience.g:2113:1: rule__ScanAndAddToBasket__Group__3__Impl : ( 'to' ) ;
    public final void rule__ScanAndAddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2117:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2118:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2118:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2119:2: 'to'
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
    // InternalSelfCheckoutExperience.g:2128:1: rule__ScanAndAddToBasket__Group__4 : rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 ;
    public final void rule__ScanAndAddToBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2132:1: ( rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:2133:2: rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2140:1: rule__ScanAndAddToBasket__Group__4__Impl : ( 'basket' ) ;
    public final void rule__ScanAndAddToBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2144:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:2145:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:2145:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:2146:2: 'basket'
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
    // InternalSelfCheckoutExperience.g:2155:1: rule__ScanAndAddToBasket__Group__5 : rule__ScanAndAddToBasket__Group__5__Impl ;
    public final void rule__ScanAndAddToBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2159:1: ( rule__ScanAndAddToBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:2160:2: rule__ScanAndAddToBasket__Group__5__Impl
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
    // InternalSelfCheckoutExperience.g:2166:1: rule__ScanAndAddToBasket__Group__5__Impl : ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) ;
    public final void rule__ScanAndAddToBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2170:1: ( ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) )
            // InternalSelfCheckoutExperience.g:2171:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            {
            // InternalSelfCheckoutExperience.g:2171:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            // InternalSelfCheckoutExperience.g:2172:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:2173:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            // InternalSelfCheckoutExperience.g:2173:3: rule__ScanAndAddToBasket__ItemInBasketAssignment_5
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
    // InternalSelfCheckoutExperience.g:2182:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2186:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:2187:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2194:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2198:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:2199:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:2199:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:2200:2: 'drop'
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
    // InternalSelfCheckoutExperience.g:2209:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2213:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2214:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2220:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemDroppedAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2224:1: ( ( ( rule__Drop__ItemDroppedAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2225:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2225:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2226:2: ( rule__Drop__ItemDroppedAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2227:2: ( rule__Drop__ItemDroppedAssignment_1 )
            // InternalSelfCheckoutExperience.g:2227:3: rule__Drop__ItemDroppedAssignment_1
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
    // InternalSelfCheckoutExperience.g:2236:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2240:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:2241:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2248:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2252:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:2253:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:2253:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:2254:2: 'var'
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
    // InternalSelfCheckoutExperience.g:2263:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2267:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:2268:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSelfCheckoutExperience.g:2275:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2279:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2280:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2280:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2281:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2282:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:2282:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckoutExperience.g:2290:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2294:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:2295:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSelfCheckoutExperience.g:2302:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2306:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:2307:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:2307:1: ( '=' )
            // InternalSelfCheckoutExperience.g:2308:2: '='
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
    // InternalSelfCheckoutExperience.g:2317:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2321:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2322:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2328:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2332:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2333:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2333:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2334:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2335:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:2335:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalSelfCheckoutExperience.g:2344:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2348:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalSelfCheckoutExperience.g:2349:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2356:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2360:1: ( ( 'repeat' ) )
            // InternalSelfCheckoutExperience.g:2361:1: ( 'repeat' )
            {
            // InternalSelfCheckoutExperience.g:2361:1: ( 'repeat' )
            // InternalSelfCheckoutExperience.g:2362:2: 'repeat'
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
    // InternalSelfCheckoutExperience.g:2371:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2375:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalSelfCheckoutExperience.g:2376:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSelfCheckoutExperience.g:2383:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__CountAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2387:1: ( ( ( rule__Repeat__CountAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2388:1: ( ( rule__Repeat__CountAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2388:1: ( ( rule__Repeat__CountAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2389:2: ( rule__Repeat__CountAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getCountAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2390:2: ( rule__Repeat__CountAssignment_1 )
            // InternalSelfCheckoutExperience.g:2390:3: rule__Repeat__CountAssignment_1
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
    // InternalSelfCheckoutExperience.g:2398:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl rule__Repeat__Group__3 ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2402:1: ( rule__Repeat__Group__2__Impl rule__Repeat__Group__3 )
            // InternalSelfCheckoutExperience.g:2403:2: rule__Repeat__Group__2__Impl rule__Repeat__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSelfCheckoutExperience.g:2410:1: rule__Repeat__Group__2__Impl : ( 'times:' ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2414:1: ( ( 'times:' ) )
            // InternalSelfCheckoutExperience.g:2415:1: ( 'times:' )
            {
            // InternalSelfCheckoutExperience.g:2415:1: ( 'times:' )
            // InternalSelfCheckoutExperience.g:2416:2: 'times:'
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
    // InternalSelfCheckoutExperience.g:2425:1: rule__Repeat__Group__3 : rule__Repeat__Group__3__Impl rule__Repeat__Group__4 ;
    public final void rule__Repeat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2429:1: ( rule__Repeat__Group__3__Impl rule__Repeat__Group__4 )
            // InternalSelfCheckoutExperience.g:2430:2: rule__Repeat__Group__3__Impl rule__Repeat__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2437:1: rule__Repeat__Group__3__Impl : ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) ;
    public final void rule__Repeat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2441:1: ( ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:2442:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:2442:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:2443:2: ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:2443:2: ( ( rule__Repeat__StatementsAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2444:3: ( rule__Repeat__StatementsAssignment_3 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2445:3: ( rule__Repeat__StatementsAssignment_3 )
            // InternalSelfCheckoutExperience.g:2445:4: rule__Repeat__StatementsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Repeat__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:2448:2: ( ( rule__Repeat__StatementsAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:2449:3: ( rule__Repeat__StatementsAssignment_3 )*
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2450:3: ( rule__Repeat__StatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=22 && LA20_0<=23)||LA20_0==36||LA20_0==41||LA20_0==43||LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2450:4: rule__Repeat__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:2459:1: rule__Repeat__Group__4 : rule__Repeat__Group__4__Impl ;
    public final void rule__Repeat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2463:1: ( rule__Repeat__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2464:2: rule__Repeat__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2470:1: rule__Repeat__Group__4__Impl : ( 'end' ) ;
    public final void rule__Repeat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2474:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:2475:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:2475:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:2476:2: 'end'
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
    // InternalSelfCheckoutExperience.g:2486:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2490:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2491:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSelfCheckoutExperience.g:2498:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2502:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:2503:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2503:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:2504:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:2505:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:2505:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckoutExperience.g:2513:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2517:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:2518:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2525:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2529:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2530:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2530:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2531:2: '('
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
    // InternalSelfCheckoutExperience.g:2540:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2544:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:2545:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2552:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2556:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:2557:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2557:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:2558:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:2559:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:2559:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckoutExperience.g:2567:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2571:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2572:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2578:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2582:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2583:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2583:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2584:2: ')'
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
    // InternalSelfCheckoutExperience.g:2594:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2598:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2599:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSelfCheckoutExperience.g:2606:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2610:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:2611:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:2611:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:2612:2: 'turn'
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
    // InternalSelfCheckoutExperience.g:2621:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2625:1: ( rule__TurnStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2626:2: rule__TurnStatement__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2632:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2636:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2637:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2637:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2638:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2639:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:2639:3: rule__TurnStatement__CommandAssignment_1
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
    // InternalSelfCheckoutExperience.g:2648:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2652:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:2653:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSelfCheckoutExperience.g:2660:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2664:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2665:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2665:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2666:2: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:2675:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2679:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2680:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2686:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2690:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:2691:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:2691:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:2692:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2693:2: ( rule__Addition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=15 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2693:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalSelfCheckoutExperience.g:2702:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2706:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2707:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSelfCheckoutExperience.g:2714:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2718:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2719:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2719:1: ( () )
            // InternalSelfCheckoutExperience.g:2720:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2721:2: ()
            // InternalSelfCheckoutExperience.g:2721:3: 
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
    // InternalSelfCheckoutExperience.g:2729:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2733:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2734:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2741:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2745:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:2746:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2746:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:2747:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:2748:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:2748:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:2756:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2760:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:2761:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:2767:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2771:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:2772:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2772:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:2773:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:2774:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:2774:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:2783:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2787:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:2788:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSelfCheckoutExperience.g:2795:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2799:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:2800:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:2800:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:2801:2: rulePrimary
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
    // InternalSelfCheckoutExperience.g:2810:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2814:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2815:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2821:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2825:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:2826:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:2826:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:2827:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2828:2: ( rule__Multiplication__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=18)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2828:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalSelfCheckoutExperience.g:2837:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2841:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2842:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSelfCheckoutExperience.g:2849:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2853:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2854:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2854:1: ( () )
            // InternalSelfCheckoutExperience.g:2855:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2856:2: ()
            // InternalSelfCheckoutExperience.g:2856:3: 
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
    // InternalSelfCheckoutExperience.g:2864:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2868:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2869:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2876:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2880:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:2881:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2881:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:2882:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:2883:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:2883:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:2891:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2895:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:2896:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:2902:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2906:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:2907:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2907:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:2908:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:2909:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:2909:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:2918:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2922:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSelfCheckoutExperience.g:2923:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2930:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2934:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2935:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2935:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2936:2: '('
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
    // InternalSelfCheckoutExperience.g:2945:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2949:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSelfCheckoutExperience.g:2950:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2957:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2961:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2962:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2962:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2963:2: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2972:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2976:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSelfCheckoutExperience.g:2977:2: rule__Primary__Group_2__2__Impl
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
    // InternalSelfCheckoutExperience.g:2983:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2987:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2988:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2988:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2989:2: ')'
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
    // InternalSelfCheckoutExperience.g:2999:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3003:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:3004:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckoutExperience.g:3011:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3015:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:3016:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:3016:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:3017:2: 'go'
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
    // InternalSelfCheckoutExperience.g:3026:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3030:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:3031:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSelfCheckoutExperience.g:3038:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3042:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:3043:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:3043:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:3044:2: 'to'
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
    // InternalSelfCheckoutExperience.g:3053:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3057:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:3058:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSelfCheckoutExperience.g:3065:1: rule__Checkout__Group__2__Impl : ( 'self-checkout' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3069:1: ( ( 'self-checkout' ) )
            // InternalSelfCheckoutExperience.g:3070:1: ( 'self-checkout' )
            {
            // InternalSelfCheckoutExperience.g:3070:1: ( 'self-checkout' )
            // InternalSelfCheckoutExperience.g:3071:2: 'self-checkout'
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
    // InternalSelfCheckoutExperience.g:3080:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3084:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:3085:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSelfCheckoutExperience.g:3092:1: rule__Checkout__Group__3__Impl : ( ( rule__Checkout__ScanAssignment_3 ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3096:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3097:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3097:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3098:2: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3099:2: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:3099:3: rule__Checkout__ScanAssignment_3
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
    // InternalSelfCheckoutExperience.g:3107:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3111:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:3112:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:3118:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3122:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:3123:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:3123:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:3124:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:3125:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckoutExperience.g:3125:3: rule__Checkout__PayAssignment_4
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
    // InternalSelfCheckoutExperience.g:3134:1: rule__ScanExpression__Group__0 : rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 ;
    public final void rule__ScanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3138:1: ( rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 )
            // InternalSelfCheckoutExperience.g:3139:2: rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSelfCheckoutExperience.g:3146:1: rule__ScanExpression__Group__0__Impl : ( ruleScan ) ;
    public final void rule__ScanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3150:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:3151:1: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:3151:1: ( ruleScan )
            // InternalSelfCheckoutExperience.g:3152:2: ruleScan
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
    // InternalSelfCheckoutExperience.g:3161:1: rule__ScanExpression__Group__1 : rule__ScanExpression__Group__1__Impl ;
    public final void rule__ScanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3165:1: ( rule__ScanExpression__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:3166:2: rule__ScanExpression__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:3172:1: rule__ScanExpression__Group__1__Impl : ( ( rule__ScanExpression__Group_1__0 )? ) ;
    public final void rule__ScanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3176:1: ( ( ( rule__ScanExpression__Group_1__0 )? ) )
            // InternalSelfCheckoutExperience.g:3177:1: ( ( rule__ScanExpression__Group_1__0 )? )
            {
            // InternalSelfCheckoutExperience.g:3177:1: ( ( rule__ScanExpression__Group_1__0 )? )
            // InternalSelfCheckoutExperience.g:3178:2: ( rule__ScanExpression__Group_1__0 )?
            {
             before(grammarAccess.getScanExpressionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:3179:2: ( rule__ScanExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:3179:3: rule__ScanExpression__Group_1__0
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
    // InternalSelfCheckoutExperience.g:3188:1: rule__ScanExpression__Group_1__0 : rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 ;
    public final void rule__ScanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3192:1: ( rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 )
            // InternalSelfCheckoutExperience.g:3193:2: rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSelfCheckoutExperience.g:3200:1: rule__ScanExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ScanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3204:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:3205:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:3205:1: ( () )
            // InternalSelfCheckoutExperience.g:3206:2: ()
            {
             before(grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0()); 
            // InternalSelfCheckoutExperience.g:3207:2: ()
            // InternalSelfCheckoutExperience.g:3207:3: 
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
    // InternalSelfCheckoutExperience.g:3215:1: rule__ScanExpression__Group_1__1 : rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 ;
    public final void rule__ScanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3219:1: ( rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 )
            // InternalSelfCheckoutExperience.g:3220:2: rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSelfCheckoutExperience.g:3227:1: rule__ScanExpression__Group_1__1__Impl : ( 'then' ) ;
    public final void rule__ScanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3231:1: ( ( 'then' ) )
            // InternalSelfCheckoutExperience.g:3232:1: ( 'then' )
            {
            // InternalSelfCheckoutExperience.g:3232:1: ( 'then' )
            // InternalSelfCheckoutExperience.g:3233:2: 'then'
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
    // InternalSelfCheckoutExperience.g:3242:1: rule__ScanExpression__Group_1__2 : rule__ScanExpression__Group_1__2__Impl ;
    public final void rule__ScanExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3246:1: ( rule__ScanExpression__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:3247:2: rule__ScanExpression__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:3253:1: rule__ScanExpression__Group_1__2__Impl : ( ( rule__ScanExpression__NextAssignment_1_2 ) ) ;
    public final void rule__ScanExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3257:1: ( ( ( rule__ScanExpression__NextAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:3258:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:3258:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:3259:2: ( rule__ScanExpression__NextAssignment_1_2 )
            {
             before(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:3260:2: ( rule__ScanExpression__NextAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:3260:3: rule__ScanExpression__NextAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:3269:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3273:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:3274:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSelfCheckoutExperience.g:3281:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3285:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:3286:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:3286:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:3287:2: 'scan'
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
    // InternalSelfCheckoutExperience.g:3296:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3300:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:3301:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSelfCheckoutExperience.g:3308:1: rule__Scan__Group__1__Impl : ( 'barcode' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3312:1: ( ( 'barcode' ) )
            // InternalSelfCheckoutExperience.g:3313:1: ( 'barcode' )
            {
            // InternalSelfCheckoutExperience.g:3313:1: ( 'barcode' )
            // InternalSelfCheckoutExperience.g:3314:2: 'barcode'
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
    // InternalSelfCheckoutExperience.g:3323:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3327:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:3328:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:3335:1: rule__Scan__Group__2__Impl : ( 'with' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3339:1: ( ( 'with' ) )
            // InternalSelfCheckoutExperience.g:3340:1: ( 'with' )
            {
            // InternalSelfCheckoutExperience.g:3340:1: ( 'with' )
            // InternalSelfCheckoutExperience.g:3341:2: 'with'
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
    // InternalSelfCheckoutExperience.g:3350:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3354:1: ( rule__Scan__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:3355:2: rule__Scan__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:3361:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__ScanMachineAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3365:1: ( ( ( rule__Scan__ScanMachineAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3366:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3366:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3367:2: ( rule__Scan__ScanMachineAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getScanMachineAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3368:2: ( rule__Scan__ScanMachineAssignment_3 )
            // InternalSelfCheckoutExperience.g:3368:3: rule__Scan__ScanMachineAssignment_3
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
    // InternalSelfCheckoutExperience.g:3377:1: rule__CarryItems__Group__0 : rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 ;
    public final void rule__CarryItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3381:1: ( rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 )
            // InternalSelfCheckoutExperience.g:3382:2: rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSelfCheckoutExperience.g:3389:1: rule__CarryItems__Group__0__Impl : ( ( rule__CarryItems__CarryAssignment_0 ) ) ;
    public final void rule__CarryItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3393:1: ( ( ( rule__CarryItems__CarryAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:3394:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3394:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:3395:2: ( rule__CarryItems__CarryAssignment_0 )
            {
             before(grammarAccess.getCarryItemsAccess().getCarryAssignment_0()); 
            // InternalSelfCheckoutExperience.g:3396:2: ( rule__CarryItems__CarryAssignment_0 )
            // InternalSelfCheckoutExperience.g:3396:3: rule__CarryItems__CarryAssignment_0
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
    // InternalSelfCheckoutExperience.g:3404:1: rule__CarryItems__Group__1 : rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 ;
    public final void rule__CarryItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3408:1: ( rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 )
            // InternalSelfCheckoutExperience.g:3409:2: rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSelfCheckoutExperience.g:3416:1: rule__CarryItems__Group__1__Impl : ( 'all' ) ;
    public final void rule__CarryItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3420:1: ( ( 'all' ) )
            // InternalSelfCheckoutExperience.g:3421:1: ( 'all' )
            {
            // InternalSelfCheckoutExperience.g:3421:1: ( 'all' )
            // InternalSelfCheckoutExperience.g:3422:2: 'all'
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
    // InternalSelfCheckoutExperience.g:3431:1: rule__CarryItems__Group__2 : rule__CarryItems__Group__2__Impl ;
    public final void rule__CarryItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3435:1: ( rule__CarryItems__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:3436:2: rule__CarryItems__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:3442:1: rule__CarryItems__Group__2__Impl : ( 'items' ) ;
    public final void rule__CarryItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3446:1: ( ( 'items' ) )
            // InternalSelfCheckoutExperience.g:3447:1: ( 'items' )
            {
            // InternalSelfCheckoutExperience.g:3447:1: ( 'items' )
            // InternalSelfCheckoutExperience.g:3448:2: 'items'
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


    // $ANTLR start "rule__Self_checkout__SelfCheckoutExperienceAssignment"
    // InternalSelfCheckoutExperience.g:3458:1: rule__Self_checkout__SelfCheckoutExperienceAssignment : ( ruleSelfCheckoutExperience ) ;
    public final void rule__Self_checkout__SelfCheckoutExperienceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3462:1: ( ( ruleSelfCheckoutExperience ) )
            // InternalSelfCheckoutExperience.g:3463:2: ( ruleSelfCheckoutExperience )
            {
            // InternalSelfCheckoutExperience.g:3463:2: ( ruleSelfCheckoutExperience )
            // InternalSelfCheckoutExperience.g:3464:3: ruleSelfCheckoutExperience
            {
             before(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutExperienceSelfCheckoutExperienceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfCheckoutExperience();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutExperienceSelfCheckoutExperienceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__SelfCheckoutExperienceAssignment"


    // $ANTLR start "rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0"
    // InternalSelfCheckoutExperience.g:3473:1: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 : ( ruleLoadShoppingSite ) ;
    public final void rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3477:1: ( ( ruleLoadShoppingSite ) )
            // InternalSelfCheckoutExperience.g:3478:2: ( ruleLoadShoppingSite )
            {
            // InternalSelfCheckoutExperience.g:3478:2: ( ruleLoadShoppingSite )
            // InternalSelfCheckoutExperience.g:3479:3: ruleLoadShoppingSite
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
    // InternalSelfCheckoutExperience.g:3488:1: rule__SelfCheckoutOnline__SearchAssignment_1 : ( ruleSearch ) ;
    public final void rule__SelfCheckoutOnline__SearchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3492:1: ( ( ruleSearch ) )
            // InternalSelfCheckoutExperience.g:3493:2: ( ruleSearch )
            {
            // InternalSelfCheckoutExperience.g:3493:2: ( ruleSearch )
            // InternalSelfCheckoutExperience.g:3494:3: ruleSearch
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
    // InternalSelfCheckoutExperience.g:3503:1: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 : ( ruleOnlineCheckout ) ;
    public final void rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3507:1: ( ( ruleOnlineCheckout ) )
            // InternalSelfCheckoutExperience.g:3508:2: ( ruleOnlineCheckout )
            {
            // InternalSelfCheckoutExperience.g:3508:2: ( ruleOnlineCheckout )
            // InternalSelfCheckoutExperience.g:3509:3: ruleOnlineCheckout
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
    // InternalSelfCheckoutExperience.g:3518:1: rule__Search__ItemSearchAssignment_2 : ( ruleItemDef ) ;
    public final void rule__Search__ItemSearchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3522:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:3523:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:3523:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:3524:3: ruleItemDef
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
    // InternalSelfCheckoutExperience.g:3533:1: rule__Search__AddToOnlineBasketAssignment_3 : ( ruleAddToOnlineBasket ) ;
    public final void rule__Search__AddToOnlineBasketAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3537:1: ( ( ruleAddToOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3538:2: ( ruleAddToOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3538:2: ( ruleAddToOnlineBasket )
            // InternalSelfCheckoutExperience.g:3539:3: ruleAddToOnlineBasket
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
    // InternalSelfCheckoutExperience.g:3548:1: rule__AddToOnlineBasket__ItemCountAssignment_3 : ( ruleAddition ) ;
    public final void rule__AddToOnlineBasket__ItemCountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3552:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3553:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3553:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3554:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:3563:1: rule__AddToOnlineBasket__ItemAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AddToOnlineBasket__ItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3567:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3568:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3568:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3569:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_4_0()); 
            // InternalSelfCheckoutExperience.g:3570:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3571:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3582:1: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5 : ( ruleRemoveFromOnlineBasket ) ;
    public final void rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3586:1: ( ( ruleRemoveFromOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3587:2: ( ruleRemoveFromOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3587:2: ( ruleRemoveFromOnlineBasket )
            // InternalSelfCheckoutExperience.g:3588:3: ruleRemoveFromOnlineBasket
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
    // InternalSelfCheckoutExperience.g:3597:1: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RemoveFromOnlineBasket__RemoveItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3601:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3602:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3602:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3603:3: ( RULE_ID )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:3604:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3605:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3616:1: rule__OnlineCheckout__DeliveryOptionsAssignment_1 : ( ruleDeliveryOptions ) ;
    public final void rule__OnlineCheckout__DeliveryOptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3620:1: ( ( ruleDeliveryOptions ) )
            // InternalSelfCheckoutExperience.g:3621:2: ( ruleDeliveryOptions )
            {
            // InternalSelfCheckoutExperience.g:3621:2: ( ruleDeliveryOptions )
            // InternalSelfCheckoutExperience.g:3622:3: ruleDeliveryOptions
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
    // InternalSelfCheckoutExperience.g:3631:1: rule__OnlineCheckout__ConfirmAssignment_2 : ( ruleConfirm ) ;
    public final void rule__OnlineCheckout__ConfirmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3635:1: ( ( ruleConfirm ) )
            // InternalSelfCheckoutExperience.g:3636:2: ( ruleConfirm )
            {
            // InternalSelfCheckoutExperience.g:3636:2: ( ruleConfirm )
            // InternalSelfCheckoutExperience.g:3637:3: ruleConfirm
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
    // InternalSelfCheckoutExperience.g:3646:1: rule__Confirm__ConfirmEnumAssignment_0 : ( ruleConfirmEnum ) ;
    public final void rule__Confirm__ConfirmEnumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3650:1: ( ( ruleConfirmEnum ) )
            // InternalSelfCheckoutExperience.g:3651:2: ( ruleConfirmEnum )
            {
            // InternalSelfCheckoutExperience.g:3651:2: ( ruleConfirmEnum )
            // InternalSelfCheckoutExperience.g:3652:3: ruleConfirmEnum
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
    // InternalSelfCheckoutExperience.g:3661:1: rule__Confirm__PayAssignment_1 : ( rulePay ) ;
    public final void rule__Confirm__PayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3665:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:3666:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:3666:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:3667:3: rulePay
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
    // InternalSelfCheckoutExperience.g:3676:1: rule__SelfCheckoutInstore__PickScanMachineAssignment_0 : ( ruleHoldSelfScanner ) ;
    public final void rule__SelfCheckoutInstore__PickScanMachineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3680:1: ( ( ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3681:2: ( ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3681:2: ( ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:3682:3: ruleHoldSelfScanner
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


    // $ANTLR start "rule__SelfCheckoutInstore__StatementAssignment_1"
    // InternalSelfCheckoutExperience.g:3691:1: rule__SelfCheckoutInstore__StatementAssignment_1 : ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) ) ;
    public final void rule__SelfCheckoutInstore__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3695:1: ( ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3696:2: ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3696:2: ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) )
            // InternalSelfCheckoutExperience.g:3697:3: ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAlternatives_1_0()); 
            // InternalSelfCheckoutExperience.g:3698:3: ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 )
            // InternalSelfCheckoutExperience.g:3698:4: rule__SelfCheckoutInstore__StatementAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfCheckoutInstore__StatementAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfCheckoutInstore__StatementAssignment_1"


    // $ANTLR start "rule__SelfCheckoutInstore__CheckoutAssignment_2"
    // InternalSelfCheckoutExperience.g:3706:1: rule__SelfCheckoutInstore__CheckoutAssignment_2 : ( ruleCheckout ) ;
    public final void rule__SelfCheckoutInstore__CheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3710:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:3711:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:3711:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:3712:3: ruleCheckout
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
    // InternalSelfCheckoutExperience.g:3721:1: rule__HoldSelfScanner__ScanMachineAssignment_1 : ( ruleSelfScanner ) ;
    public final void rule__HoldSelfScanner__ScanMachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3725:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3726:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3726:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:3727:3: ruleSelfScanner
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
    // InternalSelfCheckoutExperience.g:3736:1: rule__PickStatement__ItemCountAssignment_2 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3740:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3741:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3741:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3742:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:3751:1: rule__PickStatement__ItemPickedAssignment_3 : ( ruleItemDef ) ;
    public final void rule__PickStatement__ItemPickedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3755:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:3756:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:3756:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:3757:3: ruleItemDef
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
    // InternalSelfCheckoutExperience.g:3766:1: rule__PickStatement__HoldingItemAssignment_4 : ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3770:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) )
            // InternalSelfCheckoutExperience.g:3771:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3771:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            // InternalSelfCheckoutExperience.g:3772:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 
            // InternalSelfCheckoutExperience.g:3773:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            // InternalSelfCheckoutExperience.g:3773:4: rule__PickStatement__HoldingItemAlternatives_4_0
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
    // InternalSelfCheckoutExperience.g:3781:1: rule__ItemDef__NameAssignment : ( RULE_ID ) ;
    public final void rule__ItemDef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3785:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3786:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:3786:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3787:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3796:1: rule__ScanAndAddToBasket__ItemInBasketAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ScanAndAddToBasket__ItemInBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3800:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3801:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3801:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3802:3: ( RULE_ID )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0()); 
            // InternalSelfCheckoutExperience.g:3803:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3804:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3815:1: rule__Drop__ItemDroppedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemDroppedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3819:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3820:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3820:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3821:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:3822:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3823:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3834:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3838:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3839:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:3839:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3840:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3849:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3853:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:3854:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:3854:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:3855:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:3864:1: rule__Repeat__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__Repeat__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3868:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3869:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3869:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3870:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:3879:1: rule__Repeat__StatementsAssignment_3 : ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) ;
    public final void rule__Repeat__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3883:1: ( ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) )
            // InternalSelfCheckoutExperience.g:3884:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3884:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            // InternalSelfCheckoutExperience.g:3885:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAlternatives_3_0()); 
            // InternalSelfCheckoutExperience.g:3886:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            // InternalSelfCheckoutExperience.g:3886:4: rule__Repeat__StatementsAlternatives_3_0
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
    // InternalSelfCheckoutExperience.g:3894:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3898:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:3899:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:3899:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:3900:3: ruleMoveCommand
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
    // InternalSelfCheckoutExperience.g:3909:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3913:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3914:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3914:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3915:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:3924:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3928:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:3929:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:3929:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:3930:3: ruleTurnCommand
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
    // InternalSelfCheckoutExperience.g:3939:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3943:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3944:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3944:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:3945:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:3946:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:3946:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:3954:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3958:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:3959:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:3959:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:3960:3: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:3969:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3973:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3974:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3974:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:3975:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:3976:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:3976:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:3984:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3988:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:3989:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:3989:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:3990:3: rulePrimary
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
    // InternalSelfCheckoutExperience.g:3999:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4003:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:4004:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:4004:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:4005:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:4014:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4018:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:4019:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:4019:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4020:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:4021:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4022:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:4033:1: rule__Checkout__ScanAssignment_3 : ( ruleScanExpression ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4037:1: ( ( ruleScanExpression ) )
            // InternalSelfCheckoutExperience.g:4038:2: ( ruleScanExpression )
            {
            // InternalSelfCheckoutExperience.g:4038:2: ( ruleScanExpression )
            // InternalSelfCheckoutExperience.g:4039:3: ruleScanExpression
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
    // InternalSelfCheckoutExperience.g:4048:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4052:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:4053:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:4053:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:4054:3: rulePay
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
    // InternalSelfCheckoutExperience.g:4063:1: rule__ScanExpression__NextAssignment_1_2 : ( ruleCarryItems ) ;
    public final void rule__ScanExpression__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4067:1: ( ( ruleCarryItems ) )
            // InternalSelfCheckoutExperience.g:4068:2: ( ruleCarryItems )
            {
            // InternalSelfCheckoutExperience.g:4068:2: ( ruleCarryItems )
            // InternalSelfCheckoutExperience.g:4069:3: ruleCarryItems
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
    // InternalSelfCheckoutExperience.g:4078:1: rule__Scan__ScanMachineAssignment_3 : ( ruleSelfScanner ) ;
    public final void rule__Scan__ScanMachineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4082:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:4083:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:4083:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:4084:3: ruleSelfScanner
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
    // InternalSelfCheckoutExperience.g:4093:1: rule__CarryItems__CarryAssignment_0 : ( ruleCarry ) ;
    public final void rule__CarryItems__CarryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4097:1: ( ( ruleCarry ) )
            // InternalSelfCheckoutExperience.g:4098:2: ( ruleCarry )
            {
            // InternalSelfCheckoutExperience.g:4098:2: ( ruleCarry )
            // InternalSelfCheckoutExperience.g:4099:3: ruleCarry
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00030A1000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00010A1000C00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00010A1000C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});

}