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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load_shop_site'", "'confirm'", "'selfscanner'", "'pay'", "'+'", "'-'", "'*'", "'/'", "'premium_delivery'", "'standard_delivery'", "'next_day_delivery'", "'up'", "'down'", "'forward'", "'backward'", "'left'", "'right'", "'bag'", "'hold'", "'search'", "'for'", "'add'", "'to'", "'basket'", "'('", "')'", "'remove'", "'from'", "'checkout'", "'pick'", "'scan'", "'and'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'turn'", "'go'", "'self-checkout'", "'then'", "'barcode'", "'with'", "'all'", "'items'"
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
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

                if ( (LA1_0==11||LA1_0==29) ) {
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


    // $ANTLR start "entryRuleHoldBasketStatement"
    // InternalSelfCheckoutExperience.g:428:1: entryRuleHoldBasketStatement : ruleHoldBasketStatement EOF ;
    public final void entryRuleHoldBasketStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:429:1: ( ruleHoldBasketStatement EOF )
            // InternalSelfCheckoutExperience.g:430:1: ruleHoldBasketStatement EOF
            {
             before(grammarAccess.getHoldBasketStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleHoldBasketStatement();

            state._fsp--;

             after(grammarAccess.getHoldBasketStatementRule()); 
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
    // $ANTLR end "entryRuleHoldBasketStatement"


    // $ANTLR start "ruleHoldBasketStatement"
    // InternalSelfCheckoutExperience.g:437:1: ruleHoldBasketStatement : ( ( rule__HoldBasketStatement__Group__0 ) ) ;
    public final void ruleHoldBasketStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:441:2: ( ( ( rule__HoldBasketStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__HoldBasketStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__HoldBasketStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:443:3: ( rule__HoldBasketStatement__Group__0 )
            {
             before(grammarAccess.getHoldBasketStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:444:3: ( rule__HoldBasketStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:444:4: rule__HoldBasketStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HoldBasketStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoldBasketStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHoldBasketStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSelfCheckoutExperience.g:453:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:454:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:455:1: ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:462:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:466:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckoutExperience.g:468:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:469:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckoutExperience.g:469:4: rule__VariableDeclaration__Group__0
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
    // InternalSelfCheckoutExperience.g:478:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:479:1: ( ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:480:1: ruleRepeat EOF
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
    // InternalSelfCheckoutExperience.g:487:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:491:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__Repeat__Group__0 ) )
            // InternalSelfCheckoutExperience.g:493:3: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:494:3: ( rule__Repeat__Group__0 )
            // InternalSelfCheckoutExperience.g:494:4: rule__Repeat__Group__0
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
    // InternalSelfCheckoutExperience.g:503:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:504:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:505:1: ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:512:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:516:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:518:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:519:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:519:4: rule__MoveStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:528:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:529:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:530:1: ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:537:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:541:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:543:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:544:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:544:4: rule__TurnStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:553:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:554:1: ( ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:555:1: ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:562:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:566:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:567:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckoutExperience.g:568:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:569:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckoutExperience.g:569:4: rule__Addition__Group__0
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
    // InternalSelfCheckoutExperience.g:578:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:579:1: ( ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:580:1: ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:587:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:591:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:592:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckoutExperience.g:593:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:594:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckoutExperience.g:594:4: rule__Multiplication__Group__0
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
    // InternalSelfCheckoutExperience.g:603:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:604:1: ( rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:605:1: rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:612:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:616:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:617:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckoutExperience.g:618:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:619:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckoutExperience.g:619:4: rule__Primary__Alternatives
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
    // InternalSelfCheckoutExperience.g:628:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:629:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:630:1: ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:637:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:641:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:642:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:643:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:644:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:644:4: rule__IntLiteral__ValAssignment
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalSelfCheckoutExperience.g:653:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSelfCheckoutExperience.g:657:1: ( ruleINTEGER EOF )
            // InternalSelfCheckoutExperience.g:658:1: ruleINTEGER EOF
            {
             before(grammarAccess.getINTEGERRule()); 
            pushFollow(FOLLOW_1);
            ruleINTEGER();

            state._fsp--;

             after(grammarAccess.getINTEGERRule()); 
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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalSelfCheckoutExperience.g:668:1: ruleINTEGER : ( RULE_INT ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:673:2: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:674:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:674:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:675:3: RULE_INT
            {
             before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalSelfCheckoutExperience.g:686:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:687:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:688:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:695:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:699:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:700:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:700:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:701:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:702:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:702:4: rule__IntVarExpression__VarAssignment
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
    // InternalSelfCheckoutExperience.g:711:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:712:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:713:1: ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:720:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:724:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:725:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:725:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:726:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:727:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:727:4: rule__Checkout__Group__0
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
    // InternalSelfCheckoutExperience.g:736:1: entryRuleScanExpression : ruleScanExpression EOF ;
    public final void entryRuleScanExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:737:1: ( ruleScanExpression EOF )
            // InternalSelfCheckoutExperience.g:738:1: ruleScanExpression EOF
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
    // InternalSelfCheckoutExperience.g:745:1: ruleScanExpression : ( ( rule__ScanExpression__Group__0 ) ) ;
    public final void ruleScanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:749:2: ( ( ( rule__ScanExpression__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:750:2: ( ( rule__ScanExpression__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:750:2: ( ( rule__ScanExpression__Group__0 ) )
            // InternalSelfCheckoutExperience.g:751:3: ( rule__ScanExpression__Group__0 )
            {
             before(grammarAccess.getScanExpressionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:752:3: ( rule__ScanExpression__Group__0 )
            // InternalSelfCheckoutExperience.g:752:4: rule__ScanExpression__Group__0
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
    // InternalSelfCheckoutExperience.g:761:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:762:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:763:1: ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:770:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:774:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:775:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:775:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:776:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:777:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:777:4: rule__Scan__Group__0
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
    // InternalSelfCheckoutExperience.g:786:1: entryRuleCarryItems : ruleCarryItems EOF ;
    public final void entryRuleCarryItems() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:787:1: ( ruleCarryItems EOF )
            // InternalSelfCheckoutExperience.g:788:1: ruleCarryItems EOF
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
    // InternalSelfCheckoutExperience.g:795:1: ruleCarryItems : ( ( rule__CarryItems__Group__0 ) ) ;
    public final void ruleCarryItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:799:2: ( ( ( rule__CarryItems__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:800:2: ( ( rule__CarryItems__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:800:2: ( ( rule__CarryItems__Group__0 ) )
            // InternalSelfCheckoutExperience.g:801:3: ( rule__CarryItems__Group__0 )
            {
             before(grammarAccess.getCarryItemsAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:802:3: ( rule__CarryItems__Group__0 )
            // InternalSelfCheckoutExperience.g:802:4: rule__CarryItems__Group__0
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
    // InternalSelfCheckoutExperience.g:811:1: ruleLoadShoppingSite : ( ( 'load_shop_site' ) ) ;
    public final void ruleLoadShoppingSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:815:1: ( ( ( 'load_shop_site' ) ) )
            // InternalSelfCheckoutExperience.g:816:2: ( ( 'load_shop_site' ) )
            {
            // InternalSelfCheckoutExperience.g:816:2: ( ( 'load_shop_site' ) )
            // InternalSelfCheckoutExperience.g:817:3: ( 'load_shop_site' )
            {
             before(grammarAccess.getLoadShoppingSiteAccess().getLoad_shop_siteEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:818:3: ( 'load_shop_site' )
            // InternalSelfCheckoutExperience.g:818:4: 'load_shop_site'
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
    // InternalSelfCheckoutExperience.g:827:1: ruleDeliveryOptions : ( ( rule__DeliveryOptions__Alternatives ) ) ;
    public final void ruleDeliveryOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:831:1: ( ( ( rule__DeliveryOptions__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:832:2: ( ( rule__DeliveryOptions__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:832:2: ( ( rule__DeliveryOptions__Alternatives ) )
            // InternalSelfCheckoutExperience.g:833:3: ( rule__DeliveryOptions__Alternatives )
            {
             before(grammarAccess.getDeliveryOptionsAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:834:3: ( rule__DeliveryOptions__Alternatives )
            // InternalSelfCheckoutExperience.g:834:4: rule__DeliveryOptions__Alternatives
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
    // InternalSelfCheckoutExperience.g:843:1: ruleConfirmEnum : ( ( 'confirm' ) ) ;
    public final void ruleConfirmEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:847:1: ( ( ( 'confirm' ) ) )
            // InternalSelfCheckoutExperience.g:848:2: ( ( 'confirm' ) )
            {
            // InternalSelfCheckoutExperience.g:848:2: ( ( 'confirm' ) )
            // InternalSelfCheckoutExperience.g:849:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmEnumAccess().getConfirmEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:850:3: ( 'confirm' )
            // InternalSelfCheckoutExperience.g:850:4: 'confirm'
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
    // InternalSelfCheckoutExperience.g:859:1: ruleSelfScanner : ( ( 'selfscanner' ) ) ;
    public final void ruleSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:863:1: ( ( ( 'selfscanner' ) ) )
            // InternalSelfCheckoutExperience.g:864:2: ( ( 'selfscanner' ) )
            {
            // InternalSelfCheckoutExperience.g:864:2: ( ( 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:865:3: ( 'selfscanner' )
            {
             before(grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:866:3: ( 'selfscanner' )
            // InternalSelfCheckoutExperience.g:866:4: 'selfscanner'
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


    // $ANTLR start "ruleGripState"
    // InternalSelfCheckoutExperience.g:875:1: ruleGripState : ( ( rule__GripState__Alternatives ) ) ;
    public final void ruleGripState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:879:1: ( ( ( rule__GripState__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:880:2: ( ( rule__GripState__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:880:2: ( ( rule__GripState__Alternatives ) )
            // InternalSelfCheckoutExperience.g:881:3: ( rule__GripState__Alternatives )
            {
             before(grammarAccess.getGripStateAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:882:3: ( rule__GripState__Alternatives )
            // InternalSelfCheckoutExperience.g:882:4: rule__GripState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GripState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGripStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGripState"


    // $ANTLR start "ruleMoveCommand"
    // InternalSelfCheckoutExperience.g:891:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:895:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:896:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:896:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:897:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:898:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:898:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:907:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:911:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:912:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:912:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:913:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:914:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:914:4: rule__TurnCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:923:1: ruleCarry : ( ( rule__Carry__Alternatives ) ) ;
    public final void ruleCarry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:927:1: ( ( ( rule__Carry__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:928:2: ( ( rule__Carry__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:928:2: ( ( rule__Carry__Alternatives ) )
            // InternalSelfCheckoutExperience.g:929:3: ( rule__Carry__Alternatives )
            {
             before(grammarAccess.getCarryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:930:3: ( rule__Carry__Alternatives )
            // InternalSelfCheckoutExperience.g:930:4: rule__Carry__Alternatives
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
    // InternalSelfCheckoutExperience.g:939:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:943:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:944:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:944:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:945:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:946:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:946:4: 'pay'
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
    // InternalSelfCheckoutExperience.g:954:1: rule__SelfCheckoutExperience__Alternatives : ( ( ruleSelfCheckoutOnline ) | ( ruleSelfCheckoutInstore ) );
    public final void rule__SelfCheckoutExperience__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:958:1: ( ( ruleSelfCheckoutOnline ) | ( ruleSelfCheckoutInstore ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:959:2: ( ruleSelfCheckoutOnline )
                    {
                    // InternalSelfCheckoutExperience.g:959:2: ( ruleSelfCheckoutOnline )
                    // InternalSelfCheckoutExperience.g:960:3: ruleSelfCheckoutOnline
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
                    // InternalSelfCheckoutExperience.g:965:2: ( ruleSelfCheckoutInstore )
                    {
                    // InternalSelfCheckoutExperience.g:965:2: ( ruleSelfCheckoutInstore )
                    // InternalSelfCheckoutExperience.g:966:3: ruleSelfCheckoutInstore
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
    // InternalSelfCheckoutExperience.g:975:1: rule__SelfCheckoutInstore__StatementAlternatives_1_0 : ( ( rulePickStatement ) | ( ruleWalkStatement ) );
    public final void rule__SelfCheckoutInstore__StatementAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:979:1: ( ( rulePickStatement ) | ( ruleWalkStatement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=24 && LA3_0<=25)||LA3_0==34||LA3_0==44||LA3_0==46||LA3_0==49) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:980:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:980:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:981:3: rulePickStatement
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
                    // InternalSelfCheckoutExperience.g:986:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:986:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:987:3: ruleWalkStatement
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


    // $ANTLR start "rule__PickStatement__HoldingItemAlternatives_6_0"
    // InternalSelfCheckoutExperience.g:996:1: rule__PickStatement__HoldingItemAlternatives_6_0 : ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1000:1: ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==43) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1001:2: ( ruleScanAndAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:1001:2: ( ruleScanAndAddToBasket )
                    // InternalSelfCheckoutExperience.g:1002:3: ruleScanAndAddToBasket
                    {
                     before(grammarAccess.getPickStatementAccess().getHoldingItemScanAndAddToBasketParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScanAndAddToBasket();

                    state._fsp--;

                     after(grammarAccess.getPickStatementAccess().getHoldingItemScanAndAddToBasketParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1007:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:1007:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:1008:3: ruleDrop
                    {
                     before(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDrop();

                    state._fsp--;

                     after(grammarAccess.getPickStatementAccess().getHoldingItemDropParserRuleCall_6_0_1()); 

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
    // $ANTLR end "rule__PickStatement__HoldingItemAlternatives_6_0"


    // $ANTLR start "rule__WalkStatement__Alternatives"
    // InternalSelfCheckoutExperience.g:1017:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleHoldBasketStatement ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1021:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleHoldBasketStatement ) | ( ruleVariableDeclaration ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1022:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:1022:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:1023:3: ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:1028:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:1028:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:1029:3: ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:1034:2: ( ruleRepeat )
                    {
                    // InternalSelfCheckoutExperience.g:1034:2: ( ruleRepeat )
                    // InternalSelfCheckoutExperience.g:1035:3: ruleRepeat
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
                    // InternalSelfCheckoutExperience.g:1040:2: ( ruleHoldBasketStatement )
                    {
                    // InternalSelfCheckoutExperience.g:1040:2: ( ruleHoldBasketStatement )
                    // InternalSelfCheckoutExperience.g:1041:3: ruleHoldBasketStatement
                    {
                     before(grammarAccess.getWalkStatementAccess().getHoldBasketStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHoldBasketStatement();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getHoldBasketStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSelfCheckoutExperience.g:1046:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:1046:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:1047:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getWalkStatementAccess().getVariableDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getVariableDeclarationParserRuleCall_4()); 

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


    // $ANTLR start "rule__Repeat__StatementAlternatives_3_0"
    // InternalSelfCheckoutExperience.g:1056:1: rule__Repeat__StatementAlternatives_3_0 : ( ( rulePickStatement ) | ( ruleWalkStatement ) );
    public final void rule__Repeat__StatementAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1060:1: ( ( rulePickStatement ) | ( ruleWalkStatement ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=24 && LA6_0<=25)||LA6_0==34||LA6_0==44||LA6_0==46||LA6_0==49) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1061:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:1061:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:1062:3: rulePickStatement
                    {
                     before(grammarAccess.getRepeatAccess().getStatementPickStatementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePickStatement();

                    state._fsp--;

                     after(grammarAccess.getRepeatAccess().getStatementPickStatementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1067:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:1067:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:1068:3: ruleWalkStatement
                    {
                     before(grammarAccess.getRepeatAccess().getStatementWalkStatementParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWalkStatement();

                    state._fsp--;

                     after(grammarAccess.getRepeatAccess().getStatementWalkStatementParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Repeat__StatementAlternatives_3_0"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalSelfCheckoutExperience.g:1077:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1081:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalSelfCheckoutExperience.g:1082:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:1082:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:1083:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1088:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:1088:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:1089:3: '-'
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
    // InternalSelfCheckoutExperience.g:1098:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1102:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalSelfCheckoutExperience.g:1103:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:1103:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:1104:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1109:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:1109:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:1110:3: '/'
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
    // InternalSelfCheckoutExperience.g:1119:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1123:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
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
            case 35:
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
                    // InternalSelfCheckoutExperience.g:1124:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:1124:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:1125:3: ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:1130:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:1130:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:1131:3: ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:1136:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:1136:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSelfCheckoutExperience.g:1137:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalSelfCheckoutExperience.g:1138:3: ( rule__Primary__Group_2__0 )
                    // InternalSelfCheckoutExperience.g:1138:4: rule__Primary__Group_2__0
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
    // InternalSelfCheckoutExperience.g:1146:1: rule__DeliveryOptions__Alternatives : ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) );
    public final void rule__DeliveryOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1150:1: ( ( ( 'premium_delivery' ) ) | ( ( 'standard_delivery' ) ) | ( ( 'next_day_delivery' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1151:2: ( ( 'premium_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1151:2: ( ( 'premium_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1152:3: ( 'premium_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1153:3: ( 'premium_delivery' )
                    // InternalSelfCheckoutExperience.g:1153:4: 'premium_delivery'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getPremium_deliveryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1157:2: ( ( 'standard_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1157:2: ( ( 'standard_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1158:3: ( 'standard_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1159:3: ( 'standard_delivery' )
                    // InternalSelfCheckoutExperience.g:1159:4: 'standard_delivery'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeliveryOptionsAccess().getStandard_deliveryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelfCheckoutExperience.g:1163:2: ( ( 'next_day_delivery' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1163:2: ( ( 'next_day_delivery' ) )
                    // InternalSelfCheckoutExperience.g:1164:3: ( 'next_day_delivery' )
                    {
                     before(grammarAccess.getDeliveryOptionsAccess().getNext_day_deliveryEnumLiteralDeclaration_2()); 
                    // InternalSelfCheckoutExperience.g:1165:3: ( 'next_day_delivery' )
                    // InternalSelfCheckoutExperience.g:1165:4: 'next_day_delivery'
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


    // $ANTLR start "rule__GripState__Alternatives"
    // InternalSelfCheckoutExperience.g:1173:1: rule__GripState__Alternatives : ( ( ( 'up' ) ) | ( ( 'down' ) ) );
    public final void rule__GripState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1177:1: ( ( ( 'up' ) ) | ( ( 'down' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1178:2: ( ( 'up' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1178:2: ( ( 'up' ) )
                    // InternalSelfCheckoutExperience.g:1179:3: ( 'up' )
                    {
                     before(grammarAccess.getGripStateAccess().getUpEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1180:3: ( 'up' )
                    // InternalSelfCheckoutExperience.g:1180:4: 'up'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getGripStateAccess().getUpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1184:2: ( ( 'down' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1184:2: ( ( 'down' ) )
                    // InternalSelfCheckoutExperience.g:1185:3: ( 'down' )
                    {
                     before(grammarAccess.getGripStateAccess().getDownEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1186:3: ( 'down' )
                    // InternalSelfCheckoutExperience.g:1186:4: 'down'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getGripStateAccess().getDownEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__GripState__Alternatives"


    // $ANTLR start "rule__MoveCommand__Alternatives"
    // InternalSelfCheckoutExperience.g:1194:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1198:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1199:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1199:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:1200:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1201:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:1201:4: 'forward'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1205:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1205:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:1206:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1207:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:1207:4: 'backward'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1215:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1219:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalSelfCheckoutExperience.g:1220:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1220:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:1221:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1222:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:1222:4: 'left'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1226:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1226:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:1227:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1228:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:1228:4: 'right'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1236:1: rule__Carry__Alternatives : ( ( ( 'bag' ) ) | ( ( 'hold' ) ) );
    public final void rule__Carry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1240:1: ( ( ( 'bag' ) ) | ( ( 'hold' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1241:2: ( ( 'bag' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1241:2: ( ( 'bag' ) )
                    // InternalSelfCheckoutExperience.g:1242:3: ( 'bag' )
                    {
                     before(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:1243:3: ( 'bag' )
                    // InternalSelfCheckoutExperience.g:1243:4: 'bag'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getCarryAccess().getBagEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:1247:2: ( ( 'hold' ) )
                    {
                    // InternalSelfCheckoutExperience.g:1247:2: ( ( 'hold' ) )
                    // InternalSelfCheckoutExperience.g:1248:3: ( 'hold' )
                    {
                     before(grammarAccess.getCarryAccess().getHoldEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:1249:3: ( 'hold' )
                    // InternalSelfCheckoutExperience.g:1249:4: 'hold'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:1257:1: rule__SelfCheckoutOnline__Group__0 : rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 ;
    public final void rule__SelfCheckoutOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1261:1: ( rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1 )
            // InternalSelfCheckoutExperience.g:1262:2: rule__SelfCheckoutOnline__Group__0__Impl rule__SelfCheckoutOnline__Group__1
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
    // InternalSelfCheckoutExperience.g:1269:1: rule__SelfCheckoutOnline__Group__0__Impl : ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) ;
    public final void rule__SelfCheckoutOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1273:1: ( ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1274:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1274:1: ( ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1275:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1276:2: ( rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 )
            // InternalSelfCheckoutExperience.g:1276:3: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0
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
    // InternalSelfCheckoutExperience.g:1284:1: rule__SelfCheckoutOnline__Group__1 : rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 ;
    public final void rule__SelfCheckoutOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1288:1: ( rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2 )
            // InternalSelfCheckoutExperience.g:1289:2: rule__SelfCheckoutOnline__Group__1__Impl rule__SelfCheckoutOnline__Group__2
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
    // InternalSelfCheckoutExperience.g:1296:1: rule__SelfCheckoutOnline__Group__1__Impl : ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) ;
    public final void rule__SelfCheckoutOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1300:1: ( ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* ) )
            // InternalSelfCheckoutExperience.g:1301:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1301:1: ( ( rule__SelfCheckoutOnline__SearchAssignment_1 )* )
            // InternalSelfCheckoutExperience.g:1302:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getSearchAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1303:2: ( rule__SelfCheckoutOnline__SearchAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1303:3: rule__SelfCheckoutOnline__SearchAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SelfCheckoutOnline__SearchAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSelfCheckoutExperience.g:1311:1: rule__SelfCheckoutOnline__Group__2 : rule__SelfCheckoutOnline__Group__2__Impl ;
    public final void rule__SelfCheckoutOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1315:1: ( rule__SelfCheckoutOnline__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1316:2: rule__SelfCheckoutOnline__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1322:1: rule__SelfCheckoutOnline__Group__2__Impl : ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1326:1: ( ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1327:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1327:1: ( ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1328:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1329:2: ( rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1329:3: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2
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
    // InternalSelfCheckoutExperience.g:1338:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1342:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalSelfCheckoutExperience.g:1343:2: rule__Search__Group__0__Impl rule__Search__Group__1
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
    // InternalSelfCheckoutExperience.g:1350:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1354:1: ( ( 'search' ) )
            // InternalSelfCheckoutExperience.g:1355:1: ( 'search' )
            {
            // InternalSelfCheckoutExperience.g:1355:1: ( 'search' )
            // InternalSelfCheckoutExperience.g:1356:2: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1365:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1369:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalSelfCheckoutExperience.g:1370:2: rule__Search__Group__1__Impl rule__Search__Group__2
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
    // InternalSelfCheckoutExperience.g:1377:1: rule__Search__Group__1__Impl : ( 'for' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1381:1: ( ( 'for' ) )
            // InternalSelfCheckoutExperience.g:1382:1: ( 'for' )
            {
            // InternalSelfCheckoutExperience.g:1382:1: ( 'for' )
            // InternalSelfCheckoutExperience.g:1383:2: 'for'
            {
             before(grammarAccess.getSearchAccess().getForKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1392:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1396:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalSelfCheckoutExperience.g:1397:2: rule__Search__Group__2__Impl rule__Search__Group__3
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
    // InternalSelfCheckoutExperience.g:1404:1: rule__Search__Group__2__Impl : ( ( rule__Search__ItemSearchAssignment_2 ) ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1408:1: ( ( ( rule__Search__ItemSearchAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1409:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1409:1: ( ( rule__Search__ItemSearchAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1410:2: ( rule__Search__ItemSearchAssignment_2 )
            {
             before(grammarAccess.getSearchAccess().getItemSearchAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1411:2: ( rule__Search__ItemSearchAssignment_2 )
            // InternalSelfCheckoutExperience.g:1411:3: rule__Search__ItemSearchAssignment_2
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
    // InternalSelfCheckoutExperience.g:1419:1: rule__Search__Group__3 : rule__Search__Group__3__Impl ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1423:1: ( rule__Search__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1424:2: rule__Search__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1430:1: rule__Search__Group__3__Impl : ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1434:1: ( ( ( rule__Search__AddToOnlineBasketAssignment_3 )? ) )
            // InternalSelfCheckoutExperience.g:1435:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            {
            // InternalSelfCheckoutExperience.g:1435:1: ( ( rule__Search__AddToOnlineBasketAssignment_3 )? )
            // InternalSelfCheckoutExperience.g:1436:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            {
             before(grammarAccess.getSearchAccess().getAddToOnlineBasketAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1437:2: ( rule__Search__AddToOnlineBasketAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1437:3: rule__Search__AddToOnlineBasketAssignment_3
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
    // InternalSelfCheckoutExperience.g:1446:1: rule__AddToOnlineBasket__Group__0 : rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 ;
    public final void rule__AddToOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1450:1: ( rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1451:2: rule__AddToOnlineBasket__Group__0__Impl rule__AddToOnlineBasket__Group__1
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
    // InternalSelfCheckoutExperience.g:1458:1: rule__AddToOnlineBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1462:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:1463:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:1463:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:1464:2: 'add'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getAddKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1473:1: rule__AddToOnlineBasket__Group__1 : rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 ;
    public final void rule__AddToOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1477:1: ( rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1478:2: rule__AddToOnlineBasket__Group__1__Impl rule__AddToOnlineBasket__Group__2
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
    // InternalSelfCheckoutExperience.g:1485:1: rule__AddToOnlineBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1489:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1490:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1490:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1491:2: 'to'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getToKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1500:1: rule__AddToOnlineBasket__Group__2 : rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 ;
    public final void rule__AddToOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1504:1: ( rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1505:2: rule__AddToOnlineBasket__Group__2__Impl rule__AddToOnlineBasket__Group__3
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
    // InternalSelfCheckoutExperience.g:1512:1: rule__AddToOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1516:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1517:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1517:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1518:2: 'basket'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getBasketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1527:1: rule__AddToOnlineBasket__Group__3 : rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 ;
    public final void rule__AddToOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1531:1: ( rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:1532:2: rule__AddToOnlineBasket__Group__3__Impl rule__AddToOnlineBasket__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:1539:1: rule__AddToOnlineBasket__Group__3__Impl : ( '(' ) ;
    public final void rule__AddToOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1543:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1544:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1544:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1545:2: '('
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getLeftParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1554:1: rule__AddToOnlineBasket__Group__4 : rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 ;
    public final void rule__AddToOnlineBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1558:1: ( rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:1559:2: rule__AddToOnlineBasket__Group__4__Impl rule__AddToOnlineBasket__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:1566:1: rule__AddToOnlineBasket__Group__4__Impl : ( ( rule__AddToOnlineBasket__ItemCountAssignment_4 ) ) ;
    public final void rule__AddToOnlineBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1570:1: ( ( ( rule__AddToOnlineBasket__ItemCountAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1571:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1571:1: ( ( rule__AddToOnlineBasket__ItemCountAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1572:2: ( rule__AddToOnlineBasket__ItemCountAssignment_4 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1573:2: ( rule__AddToOnlineBasket__ItemCountAssignment_4 )
            // InternalSelfCheckoutExperience.g:1573:3: rule__AddToOnlineBasket__ItemCountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__ItemCountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_4()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1581:1: rule__AddToOnlineBasket__Group__5 : rule__AddToOnlineBasket__Group__5__Impl rule__AddToOnlineBasket__Group__6 ;
    public final void rule__AddToOnlineBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1585:1: ( rule__AddToOnlineBasket__Group__5__Impl rule__AddToOnlineBasket__Group__6 )
            // InternalSelfCheckoutExperience.g:1586:2: rule__AddToOnlineBasket__Group__5__Impl rule__AddToOnlineBasket__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AddToOnlineBasket__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__6();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:1593:1: rule__AddToOnlineBasket__Group__5__Impl : ( ')' ) ;
    public final void rule__AddToOnlineBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1597:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1598:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1598:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1599:2: ')'
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddToOnlineBasket__Group__6"
    // InternalSelfCheckoutExperience.g:1608:1: rule__AddToOnlineBasket__Group__6 : rule__AddToOnlineBasket__Group__6__Impl rule__AddToOnlineBasket__Group__7 ;
    public final void rule__AddToOnlineBasket__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1612:1: ( rule__AddToOnlineBasket__Group__6__Impl rule__AddToOnlineBasket__Group__7 )
            // InternalSelfCheckoutExperience.g:1613:2: rule__AddToOnlineBasket__Group__6__Impl rule__AddToOnlineBasket__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__AddToOnlineBasket__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__6"


    // $ANTLR start "rule__AddToOnlineBasket__Group__6__Impl"
    // InternalSelfCheckoutExperience.g:1620:1: rule__AddToOnlineBasket__Group__6__Impl : ( ( rule__AddToOnlineBasket__ItemAssignment_6 ) ) ;
    public final void rule__AddToOnlineBasket__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1624:1: ( ( ( rule__AddToOnlineBasket__ItemAssignment_6 ) ) )
            // InternalSelfCheckoutExperience.g:1625:1: ( ( rule__AddToOnlineBasket__ItemAssignment_6 ) )
            {
            // InternalSelfCheckoutExperience.g:1625:1: ( ( rule__AddToOnlineBasket__ItemAssignment_6 ) )
            // InternalSelfCheckoutExperience.g:1626:2: ( rule__AddToOnlineBasket__ItemAssignment_6 )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_6()); 
            // InternalSelfCheckoutExperience.g:1627:2: ( rule__AddToOnlineBasket__ItemAssignment_6 )
            // InternalSelfCheckoutExperience.g:1627:3: rule__AddToOnlineBasket__ItemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__ItemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__6__Impl"


    // $ANTLR start "rule__AddToOnlineBasket__Group__7"
    // InternalSelfCheckoutExperience.g:1635:1: rule__AddToOnlineBasket__Group__7 : rule__AddToOnlineBasket__Group__7__Impl ;
    public final void rule__AddToOnlineBasket__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1639:1: ( rule__AddToOnlineBasket__Group__7__Impl )
            // InternalSelfCheckoutExperience.g:1640:2: rule__AddToOnlineBasket__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToOnlineBasket__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__7"


    // $ANTLR start "rule__AddToOnlineBasket__Group__7__Impl"
    // InternalSelfCheckoutExperience.g:1646:1: rule__AddToOnlineBasket__Group__7__Impl : ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )? ) ;
    public final void rule__AddToOnlineBasket__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1650:1: ( ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )? ) )
            // InternalSelfCheckoutExperience.g:1651:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )? )
            {
            // InternalSelfCheckoutExperience.g:1651:1: ( ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )? )
            // InternalSelfCheckoutExperience.g:1652:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )?
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_7()); 
            // InternalSelfCheckoutExperience.g:1653:2: ( rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1653:3: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__Group__7__Impl"


    // $ANTLR start "rule__RemoveFromOnlineBasket__Group__0"
    // InternalSelfCheckoutExperience.g:1662:1: rule__RemoveFromOnlineBasket__Group__0 : rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 ;
    public final void rule__RemoveFromOnlineBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1666:1: ( rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1667:2: rule__RemoveFromOnlineBasket__Group__0__Impl rule__RemoveFromOnlineBasket__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSelfCheckoutExperience.g:1674:1: rule__RemoveFromOnlineBasket__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1678:1: ( ( 'remove' ) )
            // InternalSelfCheckoutExperience.g:1679:1: ( 'remove' )
            {
            // InternalSelfCheckoutExperience.g:1679:1: ( 'remove' )
            // InternalSelfCheckoutExperience.g:1680:2: 'remove'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1689:1: rule__RemoveFromOnlineBasket__Group__1 : rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 ;
    public final void rule__RemoveFromOnlineBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1693:1: ( rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1694:2: rule__RemoveFromOnlineBasket__Group__1__Impl rule__RemoveFromOnlineBasket__Group__2
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
    // InternalSelfCheckoutExperience.g:1701:1: rule__RemoveFromOnlineBasket__Group__1__Impl : ( 'from' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1705:1: ( ( 'from' ) )
            // InternalSelfCheckoutExperience.g:1706:1: ( 'from' )
            {
            // InternalSelfCheckoutExperience.g:1706:1: ( 'from' )
            // InternalSelfCheckoutExperience.g:1707:2: 'from'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getFromKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1716:1: rule__RemoveFromOnlineBasket__Group__2 : rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 ;
    public final void rule__RemoveFromOnlineBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1720:1: ( rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1721:2: rule__RemoveFromOnlineBasket__Group__2__Impl rule__RemoveFromOnlineBasket__Group__3
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
    // InternalSelfCheckoutExperience.g:1728:1: rule__RemoveFromOnlineBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__RemoveFromOnlineBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1732:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1733:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1733:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1734:2: 'basket'
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getBasketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1743:1: rule__RemoveFromOnlineBasket__Group__3 : rule__RemoveFromOnlineBasket__Group__3__Impl ;
    public final void rule__RemoveFromOnlineBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1747:1: ( rule__RemoveFromOnlineBasket__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1748:2: rule__RemoveFromOnlineBasket__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1754:1: rule__RemoveFromOnlineBasket__Group__3__Impl : ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) ;
    public final void rule__RemoveFromOnlineBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1758:1: ( ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1759:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1759:1: ( ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1760:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1761:2: ( rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:1761:3: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3
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
    // InternalSelfCheckoutExperience.g:1770:1: rule__OnlineCheckout__Group__0 : rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 ;
    public final void rule__OnlineCheckout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1774:1: ( rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1 )
            // InternalSelfCheckoutExperience.g:1775:2: rule__OnlineCheckout__Group__0__Impl rule__OnlineCheckout__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSelfCheckoutExperience.g:1782:1: rule__OnlineCheckout__Group__0__Impl : ( 'checkout' ) ;
    public final void rule__OnlineCheckout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1786:1: ( ( 'checkout' ) )
            // InternalSelfCheckoutExperience.g:1787:1: ( 'checkout' )
            {
            // InternalSelfCheckoutExperience.g:1787:1: ( 'checkout' )
            // InternalSelfCheckoutExperience.g:1788:2: 'checkout'
            {
             before(grammarAccess.getOnlineCheckoutAccess().getCheckoutKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1797:1: rule__OnlineCheckout__Group__1 : rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 ;
    public final void rule__OnlineCheckout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1801:1: ( rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2 )
            // InternalSelfCheckoutExperience.g:1802:2: rule__OnlineCheckout__Group__1__Impl rule__OnlineCheckout__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1809:1: rule__OnlineCheckout__Group__1__Impl : ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) ;
    public final void rule__OnlineCheckout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1813:1: ( ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1814:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1814:1: ( ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1815:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1816:2: ( rule__OnlineCheckout__DeliveryOptionsAssignment_1 )
            // InternalSelfCheckoutExperience.g:1816:3: rule__OnlineCheckout__DeliveryOptionsAssignment_1
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
    // InternalSelfCheckoutExperience.g:1824:1: rule__OnlineCheckout__Group__2 : rule__OnlineCheckout__Group__2__Impl ;
    public final void rule__OnlineCheckout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1828:1: ( rule__OnlineCheckout__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1829:2: rule__OnlineCheckout__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1835:1: rule__OnlineCheckout__Group__2__Impl : ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) ;
    public final void rule__OnlineCheckout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1839:1: ( ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1840:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1840:1: ( ( rule__OnlineCheckout__ConfirmAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1841:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            {
             before(grammarAccess.getOnlineCheckoutAccess().getConfirmAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1842:2: ( rule__OnlineCheckout__ConfirmAssignment_2 )
            // InternalSelfCheckoutExperience.g:1842:3: rule__OnlineCheckout__ConfirmAssignment_2
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
    // InternalSelfCheckoutExperience.g:1851:1: rule__Confirm__Group__0 : rule__Confirm__Group__0__Impl rule__Confirm__Group__1 ;
    public final void rule__Confirm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1855:1: ( rule__Confirm__Group__0__Impl rule__Confirm__Group__1 )
            // InternalSelfCheckoutExperience.g:1856:2: rule__Confirm__Group__0__Impl rule__Confirm__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:1863:1: rule__Confirm__Group__0__Impl : ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) ;
    public final void rule__Confirm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1867:1: ( ( ( rule__Confirm__ConfirmEnumAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1868:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1868:1: ( ( rule__Confirm__ConfirmEnumAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1869:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            {
             before(grammarAccess.getConfirmAccess().getConfirmEnumAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1870:2: ( rule__Confirm__ConfirmEnumAssignment_0 )
            // InternalSelfCheckoutExperience.g:1870:3: rule__Confirm__ConfirmEnumAssignment_0
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
    // InternalSelfCheckoutExperience.g:1878:1: rule__Confirm__Group__1 : rule__Confirm__Group__1__Impl ;
    public final void rule__Confirm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1882:1: ( rule__Confirm__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1883:2: rule__Confirm__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1889:1: rule__Confirm__Group__1__Impl : ( ( rule__Confirm__PayAssignment_1 ) ) ;
    public final void rule__Confirm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1893:1: ( ( ( rule__Confirm__PayAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1894:1: ( ( rule__Confirm__PayAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1894:1: ( ( rule__Confirm__PayAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1895:2: ( rule__Confirm__PayAssignment_1 )
            {
             before(grammarAccess.getConfirmAccess().getPayAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1896:2: ( rule__Confirm__PayAssignment_1 )
            // InternalSelfCheckoutExperience.g:1896:3: rule__Confirm__PayAssignment_1
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
    // InternalSelfCheckoutExperience.g:1905:1: rule__SelfCheckoutInstore__Group__0 : rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 ;
    public final void rule__SelfCheckoutInstore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1909:1: ( rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1 )
            // InternalSelfCheckoutExperience.g:1910:2: rule__SelfCheckoutInstore__Group__0__Impl rule__SelfCheckoutInstore__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1917:1: rule__SelfCheckoutInstore__Group__0__Impl : ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) ;
    public final void rule__SelfCheckoutInstore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1921:1: ( ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1922:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1922:1: ( ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1923:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1924:2: ( rule__SelfCheckoutInstore__PickScanMachineAssignment_0 )
            // InternalSelfCheckoutExperience.g:1924:3: rule__SelfCheckoutInstore__PickScanMachineAssignment_0
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
    // InternalSelfCheckoutExperience.g:1932:1: rule__SelfCheckoutInstore__Group__1 : rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 ;
    public final void rule__SelfCheckoutInstore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1936:1: ( rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2 )
            // InternalSelfCheckoutExperience.g:1937:2: rule__SelfCheckoutInstore__Group__1__Impl rule__SelfCheckoutInstore__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1944:1: rule__SelfCheckoutInstore__Group__1__Impl : ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* ) ;
    public final void rule__SelfCheckoutInstore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1948:1: ( ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* ) )
            // InternalSelfCheckoutExperience.g:1949:1: ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* )
            {
            // InternalSelfCheckoutExperience.g:1949:1: ( ( rule__SelfCheckoutInstore__StatementAssignment_1 )* )
            // InternalSelfCheckoutExperience.g:1950:2: ( rule__SelfCheckoutInstore__StatementAssignment_1 )*
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1951:2: ( rule__SelfCheckoutInstore__StatementAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=24 && LA19_0<=25)||LA19_0==34||LA19_0==40||LA19_0==44||LA19_0==46||LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1951:3: rule__SelfCheckoutInstore__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SelfCheckoutInstore__StatementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalSelfCheckoutExperience.g:1959:1: rule__SelfCheckoutInstore__Group__2 : rule__SelfCheckoutInstore__Group__2__Impl ;
    public final void rule__SelfCheckoutInstore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1963:1: ( rule__SelfCheckoutInstore__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:1964:2: rule__SelfCheckoutInstore__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:1970:1: rule__SelfCheckoutInstore__Group__2__Impl : ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) ;
    public final void rule__SelfCheckoutInstore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1974:1: ( ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:1975:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:1975:1: ( ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:1976:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1977:2: ( rule__SelfCheckoutInstore__CheckoutAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1977:3: rule__SelfCheckoutInstore__CheckoutAssignment_2
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
    // InternalSelfCheckoutExperience.g:1986:1: rule__HoldSelfScanner__Group__0 : rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 ;
    public final void rule__HoldSelfScanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1990:1: ( rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 )
            // InternalSelfCheckoutExperience.g:1991:2: rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:1998:1: rule__HoldSelfScanner__Group__0__Impl : ( 'hold' ) ;
    public final void rule__HoldSelfScanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2002:1: ( ( 'hold' ) )
            // InternalSelfCheckoutExperience.g:2003:1: ( 'hold' )
            {
            // InternalSelfCheckoutExperience.g:2003:1: ( 'hold' )
            // InternalSelfCheckoutExperience.g:2004:2: 'hold'
            {
             before(grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2013:1: rule__HoldSelfScanner__Group__1 : rule__HoldSelfScanner__Group__1__Impl ;
    public final void rule__HoldSelfScanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2017:1: ( rule__HoldSelfScanner__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2018:2: rule__HoldSelfScanner__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2024:1: rule__HoldSelfScanner__Group__1__Impl : ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) ;
    public final void rule__HoldSelfScanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2028:1: ( ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2029:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2029:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2030:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2031:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            // InternalSelfCheckoutExperience.g:2031:3: rule__HoldSelfScanner__ScanMachineAssignment_1
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
    // InternalSelfCheckoutExperience.g:2040:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2044:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2045:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSelfCheckoutExperience.g:2052:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2056:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:2057:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:2057:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:2058:2: 'pick'
            {
             before(grammarAccess.getPickStatementAccess().getPickKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2067:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2071:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:2072:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
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
    // InternalSelfCheckoutExperience.g:2079:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2083:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:2084:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:2084:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:2085:2: 'up'
            {
             before(grammarAccess.getPickStatementAccess().getUpKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2094:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2098:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:2099:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:2106:1: rule__PickStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2110:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2111:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2111:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2112:2: '('
            {
             before(grammarAccess.getPickStatementAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPickStatementAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2121:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2125:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:2126:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:2133:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__ItemCountAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2137:1: ( ( ( rule__PickStatement__ItemCountAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2138:1: ( ( rule__PickStatement__ItemCountAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2138:1: ( ( rule__PickStatement__ItemCountAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2139:2: ( rule__PickStatement__ItemCountAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2140:2: ( rule__PickStatement__ItemCountAssignment_3 )
            // InternalSelfCheckoutExperience.g:2140:3: rule__PickStatement__ItemCountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__ItemCountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getItemCountAssignment_3()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2148:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl rule__PickStatement__Group__5 ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2152:1: ( rule__PickStatement__Group__4__Impl rule__PickStatement__Group__5 )
            // InternalSelfCheckoutExperience.g:2153:2: rule__PickStatement__Group__4__Impl rule__PickStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__PickStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__5();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:2160:1: rule__PickStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2164:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2165:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2165:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2166:2: ')'
            {
             before(grammarAccess.getPickStatementAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPickStatementAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PickStatement__Group__5"
    // InternalSelfCheckoutExperience.g:2175:1: rule__PickStatement__Group__5 : rule__PickStatement__Group__5__Impl rule__PickStatement__Group__6 ;
    public final void rule__PickStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2179:1: ( rule__PickStatement__Group__5__Impl rule__PickStatement__Group__6 )
            // InternalSelfCheckoutExperience.g:2180:2: rule__PickStatement__Group__5__Impl rule__PickStatement__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__PickStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__5"


    // $ANTLR start "rule__PickStatement__Group__5__Impl"
    // InternalSelfCheckoutExperience.g:2187:1: rule__PickStatement__Group__5__Impl : ( ( rule__PickStatement__ItemPickedAssignment_5 ) ) ;
    public final void rule__PickStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2191:1: ( ( ( rule__PickStatement__ItemPickedAssignment_5 ) ) )
            // InternalSelfCheckoutExperience.g:2192:1: ( ( rule__PickStatement__ItemPickedAssignment_5 ) )
            {
            // InternalSelfCheckoutExperience.g:2192:1: ( ( rule__PickStatement__ItemPickedAssignment_5 ) )
            // InternalSelfCheckoutExperience.g:2193:2: ( rule__PickStatement__ItemPickedAssignment_5 )
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedAssignment_5()); 
            // InternalSelfCheckoutExperience.g:2194:2: ( rule__PickStatement__ItemPickedAssignment_5 )
            // InternalSelfCheckoutExperience.g:2194:3: rule__PickStatement__ItemPickedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__ItemPickedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getItemPickedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__5__Impl"


    // $ANTLR start "rule__PickStatement__Group__6"
    // InternalSelfCheckoutExperience.g:2202:1: rule__PickStatement__Group__6 : rule__PickStatement__Group__6__Impl ;
    public final void rule__PickStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2206:1: ( rule__PickStatement__Group__6__Impl )
            // InternalSelfCheckoutExperience.g:2207:2: rule__PickStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__6"


    // $ANTLR start "rule__PickStatement__Group__6__Impl"
    // InternalSelfCheckoutExperience.g:2213:1: rule__PickStatement__Group__6__Impl : ( ( rule__PickStatement__HoldingItemAssignment_6 ) ) ;
    public final void rule__PickStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2217:1: ( ( ( rule__PickStatement__HoldingItemAssignment_6 ) ) )
            // InternalSelfCheckoutExperience.g:2218:1: ( ( rule__PickStatement__HoldingItemAssignment_6 ) )
            {
            // InternalSelfCheckoutExperience.g:2218:1: ( ( rule__PickStatement__HoldingItemAssignment_6 ) )
            // InternalSelfCheckoutExperience.g:2219:2: ( rule__PickStatement__HoldingItemAssignment_6 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_6()); 
            // InternalSelfCheckoutExperience.g:2220:2: ( rule__PickStatement__HoldingItemAssignment_6 )
            // InternalSelfCheckoutExperience.g:2220:3: rule__PickStatement__HoldingItemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__HoldingItemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__Group__6__Impl"


    // $ANTLR start "rule__ScanAndAddToBasket__Group__0"
    // InternalSelfCheckoutExperience.g:2229:1: rule__ScanAndAddToBasket__Group__0 : rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 ;
    public final void rule__ScanAndAddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2233:1: ( rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:2234:2: rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSelfCheckoutExperience.g:2241:1: rule__ScanAndAddToBasket__Group__0__Impl : ( 'scan' ) ;
    public final void rule__ScanAndAddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2245:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2246:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2246:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2247:2: 'scan'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2256:1: rule__ScanAndAddToBasket__Group__1 : rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 ;
    public final void rule__ScanAndAddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2260:1: ( rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:2261:2: rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2
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
    // InternalSelfCheckoutExperience.g:2268:1: rule__ScanAndAddToBasket__Group__1__Impl : ( 'and' ) ;
    public final void rule__ScanAndAddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2272:1: ( ( 'and' ) )
            // InternalSelfCheckoutExperience.g:2273:1: ( 'and' )
            {
            // InternalSelfCheckoutExperience.g:2273:1: ( 'and' )
            // InternalSelfCheckoutExperience.g:2274:2: 'and'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2283:1: rule__ScanAndAddToBasket__Group__2 : rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 ;
    public final void rule__ScanAndAddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2287:1: ( rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:2288:2: rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3
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
    // InternalSelfCheckoutExperience.g:2295:1: rule__ScanAndAddToBasket__Group__2__Impl : ( 'add' ) ;
    public final void rule__ScanAndAddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2299:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2300:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2300:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2301:2: 'add'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2310:1: rule__ScanAndAddToBasket__Group__3 : rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 ;
    public final void rule__ScanAndAddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2314:1: ( rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:2315:2: rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4
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
    // InternalSelfCheckoutExperience.g:2322:1: rule__ScanAndAddToBasket__Group__3__Impl : ( 'to' ) ;
    public final void rule__ScanAndAddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2326:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2327:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2327:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2328:2: 'to'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2337:1: rule__ScanAndAddToBasket__Group__4 : rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 ;
    public final void rule__ScanAndAddToBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2341:1: ( rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:2342:2: rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5
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
    // InternalSelfCheckoutExperience.g:2349:1: rule__ScanAndAddToBasket__Group__4__Impl : ( 'basket' ) ;
    public final void rule__ScanAndAddToBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2353:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:2354:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:2354:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:2355:2: 'basket'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2364:1: rule__ScanAndAddToBasket__Group__5 : rule__ScanAndAddToBasket__Group__5__Impl ;
    public final void rule__ScanAndAddToBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2368:1: ( rule__ScanAndAddToBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:2369:2: rule__ScanAndAddToBasket__Group__5__Impl
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
    // InternalSelfCheckoutExperience.g:2375:1: rule__ScanAndAddToBasket__Group__5__Impl : ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) ;
    public final void rule__ScanAndAddToBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2379:1: ( ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) )
            // InternalSelfCheckoutExperience.g:2380:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            {
            // InternalSelfCheckoutExperience.g:2380:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            // InternalSelfCheckoutExperience.g:2381:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:2382:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            // InternalSelfCheckoutExperience.g:2382:3: rule__ScanAndAddToBasket__ItemInBasketAssignment_5
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
    // InternalSelfCheckoutExperience.g:2391:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2395:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:2396:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalSelfCheckoutExperience.g:2403:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2407:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:2408:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:2408:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:2409:2: 'drop'
            {
             before(grammarAccess.getDropAccess().getDropKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2418:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2422:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2423:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2429:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemDroppedAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2433:1: ( ( ( rule__Drop__ItemDroppedAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2434:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2434:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2435:2: ( rule__Drop__ItemDroppedAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2436:2: ( rule__Drop__ItemDroppedAssignment_1 )
            // InternalSelfCheckoutExperience.g:2436:3: rule__Drop__ItemDroppedAssignment_1
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


    // $ANTLR start "rule__HoldBasketStatement__Group__0"
    // InternalSelfCheckoutExperience.g:2445:1: rule__HoldBasketStatement__Group__0 : rule__HoldBasketStatement__Group__0__Impl rule__HoldBasketStatement__Group__1 ;
    public final void rule__HoldBasketStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2449:1: ( rule__HoldBasketStatement__Group__0__Impl rule__HoldBasketStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2450:2: rule__HoldBasketStatement__Group__0__Impl rule__HoldBasketStatement__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__HoldBasketStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HoldBasketStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldBasketStatement__Group__0"


    // $ANTLR start "rule__HoldBasketStatement__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2457:1: rule__HoldBasketStatement__Group__0__Impl : ( 'basket' ) ;
    public final void rule__HoldBasketStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2461:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:2462:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:2462:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:2463:2: 'basket'
            {
             before(grammarAccess.getHoldBasketStatementAccess().getBasketKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHoldBasketStatementAccess().getBasketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldBasketStatement__Group__0__Impl"


    // $ANTLR start "rule__HoldBasketStatement__Group__1"
    // InternalSelfCheckoutExperience.g:2472:1: rule__HoldBasketStatement__Group__1 : rule__HoldBasketStatement__Group__1__Impl ;
    public final void rule__HoldBasketStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2476:1: ( rule__HoldBasketStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2477:2: rule__HoldBasketStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HoldBasketStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldBasketStatement__Group__1"


    // $ANTLR start "rule__HoldBasketStatement__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2483:1: rule__HoldBasketStatement__Group__1__Impl : ( ( rule__HoldBasketStatement__StateAssignment_1 ) ) ;
    public final void rule__HoldBasketStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2487:1: ( ( ( rule__HoldBasketStatement__StateAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2488:1: ( ( rule__HoldBasketStatement__StateAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2488:1: ( ( rule__HoldBasketStatement__StateAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2489:2: ( rule__HoldBasketStatement__StateAssignment_1 )
            {
             before(grammarAccess.getHoldBasketStatementAccess().getStateAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2490:2: ( rule__HoldBasketStatement__StateAssignment_1 )
            // InternalSelfCheckoutExperience.g:2490:3: rule__HoldBasketStatement__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HoldBasketStatement__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHoldBasketStatementAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldBasketStatement__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalSelfCheckoutExperience.g:2499:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2503:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:2504:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalSelfCheckoutExperience.g:2511:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2515:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:2516:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:2516:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:2517:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2526:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2530:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:2531:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSelfCheckoutExperience.g:2538:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2542:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2543:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2543:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2544:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2545:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:2545:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckoutExperience.g:2553:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2557:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:2558:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2565:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2569:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:2570:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:2570:1: ( '=' )
            // InternalSelfCheckoutExperience.g:2571:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2580:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2584:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2585:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2591:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2595:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2596:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2596:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2597:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2598:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:2598:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalSelfCheckoutExperience.g:2607:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2611:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalSelfCheckoutExperience.g:2612:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:2619:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2623:1: ( ( 'repeat' ) )
            // InternalSelfCheckoutExperience.g:2624:1: ( 'repeat' )
            {
            // InternalSelfCheckoutExperience.g:2624:1: ( 'repeat' )
            // InternalSelfCheckoutExperience.g:2625:2: 'repeat'
            {
             before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2634:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2638:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalSelfCheckoutExperience.g:2639:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSelfCheckoutExperience.g:2646:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__CountAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2650:1: ( ( ( rule__Repeat__CountAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2651:1: ( ( rule__Repeat__CountAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2651:1: ( ( rule__Repeat__CountAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2652:2: ( rule__Repeat__CountAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getCountAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2653:2: ( rule__Repeat__CountAssignment_1 )
            // InternalSelfCheckoutExperience.g:2653:3: rule__Repeat__CountAssignment_1
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
    // InternalSelfCheckoutExperience.g:2661:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl rule__Repeat__Group__3 ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2665:1: ( rule__Repeat__Group__2__Impl rule__Repeat__Group__3 )
            // InternalSelfCheckoutExperience.g:2666:2: rule__Repeat__Group__2__Impl rule__Repeat__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2673:1: rule__Repeat__Group__2__Impl : ( 'times:' ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2677:1: ( ( 'times:' ) )
            // InternalSelfCheckoutExperience.g:2678:1: ( 'times:' )
            {
            // InternalSelfCheckoutExperience.g:2678:1: ( 'times:' )
            // InternalSelfCheckoutExperience.g:2679:2: 'times:'
            {
             before(grammarAccess.getRepeatAccess().getTimesKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2688:1: rule__Repeat__Group__3 : rule__Repeat__Group__3__Impl rule__Repeat__Group__4 ;
    public final void rule__Repeat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2692:1: ( rule__Repeat__Group__3__Impl rule__Repeat__Group__4 )
            // InternalSelfCheckoutExperience.g:2693:2: rule__Repeat__Group__3__Impl rule__Repeat__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSelfCheckoutExperience.g:2700:1: rule__Repeat__Group__3__Impl : ( ( ( rule__Repeat__StatementAssignment_3 ) ) ( ( rule__Repeat__StatementAssignment_3 )* ) ) ;
    public final void rule__Repeat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2704:1: ( ( ( ( rule__Repeat__StatementAssignment_3 ) ) ( ( rule__Repeat__StatementAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:2705:1: ( ( ( rule__Repeat__StatementAssignment_3 ) ) ( ( rule__Repeat__StatementAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:2705:1: ( ( ( rule__Repeat__StatementAssignment_3 ) ) ( ( rule__Repeat__StatementAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:2706:2: ( ( rule__Repeat__StatementAssignment_3 ) ) ( ( rule__Repeat__StatementAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:2706:2: ( ( rule__Repeat__StatementAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2707:3: ( rule__Repeat__StatementAssignment_3 )
            {
             before(grammarAccess.getRepeatAccess().getStatementAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2708:3: ( rule__Repeat__StatementAssignment_3 )
            // InternalSelfCheckoutExperience.g:2708:4: rule__Repeat__StatementAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__Repeat__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:2711:2: ( ( rule__Repeat__StatementAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:2712:3: ( rule__Repeat__StatementAssignment_3 )*
            {
             before(grammarAccess.getRepeatAccess().getStatementAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2713:3: ( rule__Repeat__StatementAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=24 && LA21_0<=25)||LA21_0==34||LA21_0==40||LA21_0==44||LA21_0==46||LA21_0==49) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2713:4: rule__Repeat__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Repeat__StatementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRepeatAccess().getStatementAssignment_3()); 

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
    // InternalSelfCheckoutExperience.g:2722:1: rule__Repeat__Group__4 : rule__Repeat__Group__4__Impl ;
    public final void rule__Repeat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2726:1: ( rule__Repeat__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2727:2: rule__Repeat__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2733:1: rule__Repeat__Group__4__Impl : ( 'end' ) ;
    public final void rule__Repeat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2737:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:2738:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:2738:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:2739:2: 'end'
            {
             before(grammarAccess.getRepeatAccess().getEndKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2749:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2753:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2754:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2761:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2765:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:2766:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2766:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:2767:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:2768:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:2768:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckoutExperience.g:2776:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2780:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:2781:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:2788:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2792:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2793:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2793:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2794:2: '('
            {
             before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2803:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2807:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:2808:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:2815:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2819:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:2820:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2820:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:2821:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:2822:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:2822:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckoutExperience.g:2830:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2834:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2835:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2841:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2845:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2846:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2846:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2847:2: ')'
            {
             before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2857:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2861:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:2862:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSelfCheckoutExperience.g:2869:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2873:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:2874:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:2874:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:2875:2: 'turn'
            {
             before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2884:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2888:1: ( rule__TurnStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2889:2: rule__TurnStatement__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2895:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2899:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:2900:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:2900:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:2901:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:2902:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:2902:3: rule__TurnStatement__CommandAssignment_1
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
    // InternalSelfCheckoutExperience.g:2911:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2915:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:2916:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSelfCheckoutExperience.g:2923:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2927:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2928:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2928:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2929:2: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:2938:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2942:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2943:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2949:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2953:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:2954:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:2954:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:2955:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2956:2: ( rule__Addition__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=15 && LA22_0<=16)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2956:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSelfCheckoutExperience.g:2965:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2969:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2970:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSelfCheckoutExperience.g:2977:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2981:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2982:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2982:1: ( () )
            // InternalSelfCheckoutExperience.g:2983:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2984:2: ()
            // InternalSelfCheckoutExperience.g:2984:3: 
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
    // InternalSelfCheckoutExperience.g:2992:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2996:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2997:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:3004:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3008:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:3009:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:3009:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:3010:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:3011:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:3011:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:3019:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3023:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:3024:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:3030:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3034:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:3035:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:3035:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:3036:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:3037:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:3037:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:3046:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3050:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:3051:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSelfCheckoutExperience.g:3058:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3062:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:3063:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:3063:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:3064:2: rulePrimary
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
    // InternalSelfCheckoutExperience.g:3073:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3077:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:3078:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:3084:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3088:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:3089:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:3089:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:3090:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:3091:2: ( rule__Multiplication__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:3091:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSelfCheckoutExperience.g:3100:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3104:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:3105:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSelfCheckoutExperience.g:3112:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3116:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:3117:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:3117:1: ( () )
            // InternalSelfCheckoutExperience.g:3118:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:3119:2: ()
            // InternalSelfCheckoutExperience.g:3119:3: 
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
    // InternalSelfCheckoutExperience.g:3127:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3131:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:3132:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:3139:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3143:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:3144:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:3144:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:3145:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:3146:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:3146:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:3154:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3158:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:3159:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:3165:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3169:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:3170:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:3170:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:3171:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:3172:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:3172:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:3181:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3185:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSelfCheckoutExperience.g:3186:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:3193:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3197:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:3198:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:3198:1: ( '(' )
            // InternalSelfCheckoutExperience.g:3199:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3208:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3212:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSelfCheckoutExperience.g:3213:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:3220:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3224:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3225:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3225:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3226:2: ruleAddition
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
    // InternalSelfCheckoutExperience.g:3235:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3239:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSelfCheckoutExperience.g:3240:2: rule__Primary__Group_2__2__Impl
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
    // InternalSelfCheckoutExperience.g:3246:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3250:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:3251:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:3251:1: ( ')' )
            // InternalSelfCheckoutExperience.g:3252:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3262:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3266:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:3267:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
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
    // InternalSelfCheckoutExperience.g:3274:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3278:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:3279:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:3279:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:3280:2: 'go'
            {
             before(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3289:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3293:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:3294:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSelfCheckoutExperience.g:3301:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3305:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:3306:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:3306:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:3307:2: 'to'
            {
             before(grammarAccess.getCheckoutAccess().getToKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3316:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3320:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:3321:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSelfCheckoutExperience.g:3328:1: rule__Checkout__Group__2__Impl : ( 'self-checkout' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3332:1: ( ( 'self-checkout' ) )
            // InternalSelfCheckoutExperience.g:3333:1: ( 'self-checkout' )
            {
            // InternalSelfCheckoutExperience.g:3333:1: ( 'self-checkout' )
            // InternalSelfCheckoutExperience.g:3334:2: 'self-checkout'
            {
             before(grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3343:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3347:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:3348:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:3355:1: rule__Checkout__Group__3__Impl : ( ( rule__Checkout__ScanAssignment_3 ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3359:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3360:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3360:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3361:2: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3362:2: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:3362:3: rule__Checkout__ScanAssignment_3
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
    // InternalSelfCheckoutExperience.g:3370:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3374:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:3375:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:3381:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 )? ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3385:1: ( ( ( rule__Checkout__PayAssignment_4 )? ) )
            // InternalSelfCheckoutExperience.g:3386:1: ( ( rule__Checkout__PayAssignment_4 )? )
            {
            // InternalSelfCheckoutExperience.g:3386:1: ( ( rule__Checkout__PayAssignment_4 )? )
            // InternalSelfCheckoutExperience.g:3387:2: ( rule__Checkout__PayAssignment_4 )?
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:3388:2: ( rule__Checkout__PayAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:3388:3: rule__Checkout__PayAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checkout__PayAssignment_4();

                    state._fsp--;


                    }
                    break;

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
    // InternalSelfCheckoutExperience.g:3397:1: rule__ScanExpression__Group__0 : rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 ;
    public final void rule__ScanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3401:1: ( rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 )
            // InternalSelfCheckoutExperience.g:3402:2: rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSelfCheckoutExperience.g:3409:1: rule__ScanExpression__Group__0__Impl : ( ruleScan ) ;
    public final void rule__ScanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3413:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:3414:1: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:3414:1: ( ruleScan )
            // InternalSelfCheckoutExperience.g:3415:2: ruleScan
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
    // InternalSelfCheckoutExperience.g:3424:1: rule__ScanExpression__Group__1 : rule__ScanExpression__Group__1__Impl ;
    public final void rule__ScanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3428:1: ( rule__ScanExpression__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:3429:2: rule__ScanExpression__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:3435:1: rule__ScanExpression__Group__1__Impl : ( ( rule__ScanExpression__Group_1__0 )? ) ;
    public final void rule__ScanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3439:1: ( ( ( rule__ScanExpression__Group_1__0 )? ) )
            // InternalSelfCheckoutExperience.g:3440:1: ( ( rule__ScanExpression__Group_1__0 )? )
            {
            // InternalSelfCheckoutExperience.g:3440:1: ( ( rule__ScanExpression__Group_1__0 )? )
            // InternalSelfCheckoutExperience.g:3441:2: ( rule__ScanExpression__Group_1__0 )?
            {
             before(grammarAccess.getScanExpressionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:3442:2: ( rule__ScanExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:3442:3: rule__ScanExpression__Group_1__0
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
    // InternalSelfCheckoutExperience.g:3451:1: rule__ScanExpression__Group_1__0 : rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 ;
    public final void rule__ScanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3455:1: ( rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 )
            // InternalSelfCheckoutExperience.g:3456:2: rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSelfCheckoutExperience.g:3463:1: rule__ScanExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ScanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3467:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:3468:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:3468:1: ( () )
            // InternalSelfCheckoutExperience.g:3469:2: ()
            {
             before(grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0()); 
            // InternalSelfCheckoutExperience.g:3470:2: ()
            // InternalSelfCheckoutExperience.g:3470:3: 
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
    // InternalSelfCheckoutExperience.g:3478:1: rule__ScanExpression__Group_1__1 : rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 ;
    public final void rule__ScanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3482:1: ( rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 )
            // InternalSelfCheckoutExperience.g:3483:2: rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSelfCheckoutExperience.g:3490:1: rule__ScanExpression__Group_1__1__Impl : ( 'then' ) ;
    public final void rule__ScanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3494:1: ( ( 'then' ) )
            // InternalSelfCheckoutExperience.g:3495:1: ( 'then' )
            {
            // InternalSelfCheckoutExperience.g:3495:1: ( 'then' )
            // InternalSelfCheckoutExperience.g:3496:2: 'then'
            {
             before(grammarAccess.getScanExpressionAccess().getThenKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3505:1: rule__ScanExpression__Group_1__2 : rule__ScanExpression__Group_1__2__Impl ;
    public final void rule__ScanExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3509:1: ( rule__ScanExpression__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:3510:2: rule__ScanExpression__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:3516:1: rule__ScanExpression__Group_1__2__Impl : ( ( rule__ScanExpression__NextAssignment_1_2 ) ) ;
    public final void rule__ScanExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3520:1: ( ( ( rule__ScanExpression__NextAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:3521:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:3521:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:3522:2: ( rule__ScanExpression__NextAssignment_1_2 )
            {
             before(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:3523:2: ( rule__ScanExpression__NextAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:3523:3: rule__ScanExpression__NextAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:3532:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3536:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:3537:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSelfCheckoutExperience.g:3544:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3548:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:3549:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:3549:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:3550:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3559:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3563:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:3564:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalSelfCheckoutExperience.g:3571:1: rule__Scan__Group__1__Impl : ( 'barcode' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3575:1: ( ( 'barcode' ) )
            // InternalSelfCheckoutExperience.g:3576:1: ( 'barcode' )
            {
            // InternalSelfCheckoutExperience.g:3576:1: ( 'barcode' )
            // InternalSelfCheckoutExperience.g:3577:2: 'barcode'
            {
             before(grammarAccess.getScanAccess().getBarcodeKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3586:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3590:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:3591:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:3598:1: rule__Scan__Group__2__Impl : ( 'with' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3602:1: ( ( 'with' ) )
            // InternalSelfCheckoutExperience.g:3603:1: ( 'with' )
            {
            // InternalSelfCheckoutExperience.g:3603:1: ( 'with' )
            // InternalSelfCheckoutExperience.g:3604:2: 'with'
            {
             before(grammarAccess.getScanAccess().getWithKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3613:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3617:1: ( rule__Scan__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:3618:2: rule__Scan__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:3624:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__ScanMachineAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3628:1: ( ( ( rule__Scan__ScanMachineAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:3629:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:3629:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:3630:2: ( rule__Scan__ScanMachineAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getScanMachineAssignment_3()); 
            // InternalSelfCheckoutExperience.g:3631:2: ( rule__Scan__ScanMachineAssignment_3 )
            // InternalSelfCheckoutExperience.g:3631:3: rule__Scan__ScanMachineAssignment_3
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
    // InternalSelfCheckoutExperience.g:3640:1: rule__CarryItems__Group__0 : rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 ;
    public final void rule__CarryItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3644:1: ( rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1 )
            // InternalSelfCheckoutExperience.g:3645:2: rule__CarryItems__Group__0__Impl rule__CarryItems__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSelfCheckoutExperience.g:3652:1: rule__CarryItems__Group__0__Impl : ( ( rule__CarryItems__CarryAssignment_0 ) ) ;
    public final void rule__CarryItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3656:1: ( ( ( rule__CarryItems__CarryAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:3657:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3657:1: ( ( rule__CarryItems__CarryAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:3658:2: ( rule__CarryItems__CarryAssignment_0 )
            {
             before(grammarAccess.getCarryItemsAccess().getCarryAssignment_0()); 
            // InternalSelfCheckoutExperience.g:3659:2: ( rule__CarryItems__CarryAssignment_0 )
            // InternalSelfCheckoutExperience.g:3659:3: rule__CarryItems__CarryAssignment_0
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
    // InternalSelfCheckoutExperience.g:3667:1: rule__CarryItems__Group__1 : rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 ;
    public final void rule__CarryItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3671:1: ( rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2 )
            // InternalSelfCheckoutExperience.g:3672:2: rule__CarryItems__Group__1__Impl rule__CarryItems__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalSelfCheckoutExperience.g:3679:1: rule__CarryItems__Group__1__Impl : ( 'all' ) ;
    public final void rule__CarryItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3683:1: ( ( 'all' ) )
            // InternalSelfCheckoutExperience.g:3684:1: ( 'all' )
            {
            // InternalSelfCheckoutExperience.g:3684:1: ( 'all' )
            // InternalSelfCheckoutExperience.g:3685:2: 'all'
            {
             before(grammarAccess.getCarryItemsAccess().getAllKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3694:1: rule__CarryItems__Group__2 : rule__CarryItems__Group__2__Impl ;
    public final void rule__CarryItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3698:1: ( rule__CarryItems__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:3699:2: rule__CarryItems__Group__2__Impl
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
    // InternalSelfCheckoutExperience.g:3705:1: rule__CarryItems__Group__2__Impl : ( 'items' ) ;
    public final void rule__CarryItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3709:1: ( ( 'items' ) )
            // InternalSelfCheckoutExperience.g:3710:1: ( 'items' )
            {
            // InternalSelfCheckoutExperience.g:3710:1: ( 'items' )
            // InternalSelfCheckoutExperience.g:3711:2: 'items'
            {
             before(grammarAccess.getCarryItemsAccess().getItemsKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:3721:1: rule__Self_checkout__SelfCheckoutExperienceAssignment : ( ruleSelfCheckoutExperience ) ;
    public final void rule__Self_checkout__SelfCheckoutExperienceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3725:1: ( ( ruleSelfCheckoutExperience ) )
            // InternalSelfCheckoutExperience.g:3726:2: ( ruleSelfCheckoutExperience )
            {
            // InternalSelfCheckoutExperience.g:3726:2: ( ruleSelfCheckoutExperience )
            // InternalSelfCheckoutExperience.g:3727:3: ruleSelfCheckoutExperience
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
    // InternalSelfCheckoutExperience.g:3736:1: rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0 : ( ruleLoadShoppingSite ) ;
    public final void rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3740:1: ( ( ruleLoadShoppingSite ) )
            // InternalSelfCheckoutExperience.g:3741:2: ( ruleLoadShoppingSite )
            {
            // InternalSelfCheckoutExperience.g:3741:2: ( ruleLoadShoppingSite )
            // InternalSelfCheckoutExperience.g:3742:3: ruleLoadShoppingSite
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
    // InternalSelfCheckoutExperience.g:3751:1: rule__SelfCheckoutOnline__SearchAssignment_1 : ( ruleSearch ) ;
    public final void rule__SelfCheckoutOnline__SearchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3755:1: ( ( ruleSearch ) )
            // InternalSelfCheckoutExperience.g:3756:2: ( ruleSearch )
            {
            // InternalSelfCheckoutExperience.g:3756:2: ( ruleSearch )
            // InternalSelfCheckoutExperience.g:3757:3: ruleSearch
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
    // InternalSelfCheckoutExperience.g:3766:1: rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2 : ( ruleOnlineCheckout ) ;
    public final void rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3770:1: ( ( ruleOnlineCheckout ) )
            // InternalSelfCheckoutExperience.g:3771:2: ( ruleOnlineCheckout )
            {
            // InternalSelfCheckoutExperience.g:3771:2: ( ruleOnlineCheckout )
            // InternalSelfCheckoutExperience.g:3772:3: ruleOnlineCheckout
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
    // InternalSelfCheckoutExperience.g:3781:1: rule__Search__ItemSearchAssignment_2 : ( ruleItemDef ) ;
    public final void rule__Search__ItemSearchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3785:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:3786:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:3786:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:3787:3: ruleItemDef
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
    // InternalSelfCheckoutExperience.g:3796:1: rule__Search__AddToOnlineBasketAssignment_3 : ( ruleAddToOnlineBasket ) ;
    public final void rule__Search__AddToOnlineBasketAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3800:1: ( ( ruleAddToOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3801:2: ( ruleAddToOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3801:2: ( ruleAddToOnlineBasket )
            // InternalSelfCheckoutExperience.g:3802:3: ruleAddToOnlineBasket
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


    // $ANTLR start "rule__AddToOnlineBasket__ItemCountAssignment_4"
    // InternalSelfCheckoutExperience.g:3811:1: rule__AddToOnlineBasket__ItemCountAssignment_4 : ( ruleAddition ) ;
    public final void rule__AddToOnlineBasket__ItemCountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3815:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:3816:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:3816:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:3817:3: ruleAddition
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemCountAdditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddToOnlineBasketAccess().getItemCountAdditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__ItemCountAssignment_4"


    // $ANTLR start "rule__AddToOnlineBasket__ItemAssignment_6"
    // InternalSelfCheckoutExperience.g:3826:1: rule__AddToOnlineBasket__ItemAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__AddToOnlineBasket__ItemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3830:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3831:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3831:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3832:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_6_0()); 
            // InternalSelfCheckoutExperience.g:3833:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3834:4: RULE_ID
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAddToOnlineBasketAccess().getItemItemDefCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__ItemAssignment_6"


    // $ANTLR start "rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7"
    // InternalSelfCheckoutExperience.g:3845:1: rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7 : ( ruleRemoveFromOnlineBasket ) ;
    public final void rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3849:1: ( ( ruleRemoveFromOnlineBasket ) )
            // InternalSelfCheckoutExperience.g:3850:2: ( ruleRemoveFromOnlineBasket )
            {
            // InternalSelfCheckoutExperience.g:3850:2: ( ruleRemoveFromOnlineBasket )
            // InternalSelfCheckoutExperience.g:3851:3: ruleRemoveFromOnlineBasket
            {
             before(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketRemoveFromOnlineBasketParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRemoveFromOnlineBasket();

            state._fsp--;

             after(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketRemoveFromOnlineBasketParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7"


    // $ANTLR start "rule__RemoveFromOnlineBasket__RemoveItemAssignment_3"
    // InternalSelfCheckoutExperience.g:3860:1: rule__RemoveFromOnlineBasket__RemoveItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RemoveFromOnlineBasket__RemoveItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3864:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:3865:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:3865:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:3866:3: ( RULE_ID )
            {
             before(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemItemDefCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:3867:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:3868:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:3879:1: rule__OnlineCheckout__DeliveryOptionsAssignment_1 : ( ruleDeliveryOptions ) ;
    public final void rule__OnlineCheckout__DeliveryOptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3883:1: ( ( ruleDeliveryOptions ) )
            // InternalSelfCheckoutExperience.g:3884:2: ( ruleDeliveryOptions )
            {
            // InternalSelfCheckoutExperience.g:3884:2: ( ruleDeliveryOptions )
            // InternalSelfCheckoutExperience.g:3885:3: ruleDeliveryOptions
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
    // InternalSelfCheckoutExperience.g:3894:1: rule__OnlineCheckout__ConfirmAssignment_2 : ( ruleConfirm ) ;
    public final void rule__OnlineCheckout__ConfirmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3898:1: ( ( ruleConfirm ) )
            // InternalSelfCheckoutExperience.g:3899:2: ( ruleConfirm )
            {
            // InternalSelfCheckoutExperience.g:3899:2: ( ruleConfirm )
            // InternalSelfCheckoutExperience.g:3900:3: ruleConfirm
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
    // InternalSelfCheckoutExperience.g:3909:1: rule__Confirm__ConfirmEnumAssignment_0 : ( ruleConfirmEnum ) ;
    public final void rule__Confirm__ConfirmEnumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3913:1: ( ( ruleConfirmEnum ) )
            // InternalSelfCheckoutExperience.g:3914:2: ( ruleConfirmEnum )
            {
            // InternalSelfCheckoutExperience.g:3914:2: ( ruleConfirmEnum )
            // InternalSelfCheckoutExperience.g:3915:3: ruleConfirmEnum
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
    // InternalSelfCheckoutExperience.g:3924:1: rule__Confirm__PayAssignment_1 : ( rulePay ) ;
    public final void rule__Confirm__PayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3928:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:3929:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:3929:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:3930:3: rulePay
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
    // InternalSelfCheckoutExperience.g:3939:1: rule__SelfCheckoutInstore__PickScanMachineAssignment_0 : ( ruleHoldSelfScanner ) ;
    public final void rule__SelfCheckoutInstore__PickScanMachineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3943:1: ( ( ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3944:2: ( ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3944:2: ( ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:3945:3: ruleHoldSelfScanner
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
    // InternalSelfCheckoutExperience.g:3954:1: rule__SelfCheckoutInstore__StatementAssignment_1 : ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) ) ;
    public final void rule__SelfCheckoutInstore__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3958:1: ( ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:3959:2: ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:3959:2: ( ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 ) )
            // InternalSelfCheckoutExperience.g:3960:3: ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 )
            {
             before(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAlternatives_1_0()); 
            // InternalSelfCheckoutExperience.g:3961:3: ( rule__SelfCheckoutInstore__StatementAlternatives_1_0 )
            // InternalSelfCheckoutExperience.g:3961:4: rule__SelfCheckoutInstore__StatementAlternatives_1_0
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
    // InternalSelfCheckoutExperience.g:3969:1: rule__SelfCheckoutInstore__CheckoutAssignment_2 : ( ruleCheckout ) ;
    public final void rule__SelfCheckoutInstore__CheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3973:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:3974:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:3974:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:3975:3: ruleCheckout
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
    // InternalSelfCheckoutExperience.g:3984:1: rule__HoldSelfScanner__ScanMachineAssignment_1 : ( ruleSelfScanner ) ;
    public final void rule__HoldSelfScanner__ScanMachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3988:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3989:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3989:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:3990:3: ruleSelfScanner
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


    // $ANTLR start "rule__PickStatement__ItemCountAssignment_3"
    // InternalSelfCheckoutExperience.g:3999:1: rule__PickStatement__ItemCountAssignment_3 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4003:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:4004:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:4004:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:4005:3: ruleAddition
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPickStatementAccess().getItemCountAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__ItemCountAssignment_3"


    // $ANTLR start "rule__PickStatement__ItemPickedAssignment_5"
    // InternalSelfCheckoutExperience.g:4014:1: rule__PickStatement__ItemPickedAssignment_5 : ( ruleItemDef ) ;
    public final void rule__PickStatement__ItemPickedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4018:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:4019:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:4019:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:4020:3: ruleItemDef
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleItemDef();

            state._fsp--;

             after(grammarAccess.getPickStatementAccess().getItemPickedItemDefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__ItemPickedAssignment_5"


    // $ANTLR start "rule__PickStatement__HoldingItemAssignment_6"
    // InternalSelfCheckoutExperience.g:4029:1: rule__PickStatement__HoldingItemAssignment_6 : ( ( rule__PickStatement__HoldingItemAlternatives_6_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4033:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_6_0 ) ) )
            // InternalSelfCheckoutExperience.g:4034:2: ( ( rule__PickStatement__HoldingItemAlternatives_6_0 ) )
            {
            // InternalSelfCheckoutExperience.g:4034:2: ( ( rule__PickStatement__HoldingItemAlternatives_6_0 ) )
            // InternalSelfCheckoutExperience.g:4035:3: ( rule__PickStatement__HoldingItemAlternatives_6_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_6_0()); 
            // InternalSelfCheckoutExperience.g:4036:3: ( rule__PickStatement__HoldingItemAlternatives_6_0 )
            // InternalSelfCheckoutExperience.g:4036:4: rule__PickStatement__HoldingItemAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__HoldingItemAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__HoldingItemAssignment_6"


    // $ANTLR start "rule__ItemDef__NameAssignment"
    // InternalSelfCheckoutExperience.g:4044:1: rule__ItemDef__NameAssignment : ( RULE_ID ) ;
    public final void rule__ItemDef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4048:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4049:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:4049:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4050:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:4059:1: rule__ScanAndAddToBasket__ItemInBasketAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ScanAndAddToBasket__ItemInBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4063:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:4064:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:4064:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4065:3: ( RULE_ID )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0()); 
            // InternalSelfCheckoutExperience.g:4066:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4067:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:4078:1: rule__Drop__ItemDroppedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemDroppedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4082:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:4083:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:4083:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4084:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:4085:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4086:4: RULE_ID
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


    // $ANTLR start "rule__HoldBasketStatement__StateAssignment_1"
    // InternalSelfCheckoutExperience.g:4097:1: rule__HoldBasketStatement__StateAssignment_1 : ( ruleGripState ) ;
    public final void rule__HoldBasketStatement__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4101:1: ( ( ruleGripState ) )
            // InternalSelfCheckoutExperience.g:4102:2: ( ruleGripState )
            {
            // InternalSelfCheckoutExperience.g:4102:2: ( ruleGripState )
            // InternalSelfCheckoutExperience.g:4103:3: ruleGripState
            {
             before(grammarAccess.getHoldBasketStatementAccess().getStateGripStateEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGripState();

            state._fsp--;

             after(grammarAccess.getHoldBasketStatementAccess().getStateGripStateEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldBasketStatement__StateAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalSelfCheckoutExperience.g:4112:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4116:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4117:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:4117:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4118:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:4127:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4131:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:4132:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:4132:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:4133:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:4142:1: rule__Repeat__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__Repeat__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4146:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:4147:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:4147:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:4148:3: ruleAddition
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


    // $ANTLR start "rule__Repeat__StatementAssignment_3"
    // InternalSelfCheckoutExperience.g:4157:1: rule__Repeat__StatementAssignment_3 : ( ( rule__Repeat__StatementAlternatives_3_0 ) ) ;
    public final void rule__Repeat__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4161:1: ( ( ( rule__Repeat__StatementAlternatives_3_0 ) ) )
            // InternalSelfCheckoutExperience.g:4162:2: ( ( rule__Repeat__StatementAlternatives_3_0 ) )
            {
            // InternalSelfCheckoutExperience.g:4162:2: ( ( rule__Repeat__StatementAlternatives_3_0 ) )
            // InternalSelfCheckoutExperience.g:4163:3: ( rule__Repeat__StatementAlternatives_3_0 )
            {
             before(grammarAccess.getRepeatAccess().getStatementAlternatives_3_0()); 
            // InternalSelfCheckoutExperience.g:4164:3: ( rule__Repeat__StatementAlternatives_3_0 )
            // InternalSelfCheckoutExperience.g:4164:4: rule__Repeat__StatementAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__StatementAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__StatementAssignment_3"


    // $ANTLR start "rule__MoveStatement__CommandAssignment_0"
    // InternalSelfCheckoutExperience.g:4172:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4176:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:4177:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:4177:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:4178:3: ruleMoveCommand
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
    // InternalSelfCheckoutExperience.g:4187:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4191:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:4192:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:4192:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:4193:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:4202:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4206:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:4207:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:4207:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:4208:3: ruleTurnCommand
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
    // InternalSelfCheckoutExperience.g:4217:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4221:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:4222:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:4222:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:4223:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:4224:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:4224:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:4232:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4236:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:4237:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:4237:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:4238:3: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:4247:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4251:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:4252:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:4252:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:4253:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:4254:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:4254:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:4262:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4266:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:4267:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:4267:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:4268:3: rulePrimary
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
    // InternalSelfCheckoutExperience.g:4277:1: rule__IntLiteral__ValAssignment : ( ruleINTEGER ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4281:1: ( ( ruleINTEGER ) )
            // InternalSelfCheckoutExperience.g:4282:2: ( ruleINTEGER )
            {
            // InternalSelfCheckoutExperience.g:4282:2: ( ruleINTEGER )
            // InternalSelfCheckoutExperience.g:4283:3: ruleINTEGER
            {
             before(grammarAccess.getIntLiteralAccess().getValINTEGERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINTEGER();

            state._fsp--;

             after(grammarAccess.getIntLiteralAccess().getValINTEGERParserRuleCall_0()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:4292:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4296:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:4297:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:4297:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:4298:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:4299:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:4300:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:4311:1: rule__Checkout__ScanAssignment_3 : ( ruleScanExpression ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4315:1: ( ( ruleScanExpression ) )
            // InternalSelfCheckoutExperience.g:4316:2: ( ruleScanExpression )
            {
            // InternalSelfCheckoutExperience.g:4316:2: ( ruleScanExpression )
            // InternalSelfCheckoutExperience.g:4317:3: ruleScanExpression
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
    // InternalSelfCheckoutExperience.g:4326:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4330:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:4331:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:4331:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:4332:3: rulePay
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
    // InternalSelfCheckoutExperience.g:4341:1: rule__ScanExpression__NextAssignment_1_2 : ( ruleCarryItems ) ;
    public final void rule__ScanExpression__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4345:1: ( ( ruleCarryItems ) )
            // InternalSelfCheckoutExperience.g:4346:2: ( ruleCarryItems )
            {
            // InternalSelfCheckoutExperience.g:4346:2: ( ruleCarryItems )
            // InternalSelfCheckoutExperience.g:4347:3: ruleCarryItems
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
    // InternalSelfCheckoutExperience.g:4356:1: rule__Scan__ScanMachineAssignment_3 : ( ruleSelfScanner ) ;
    public final void rule__Scan__ScanMachineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4360:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:4361:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:4361:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:4362:3: ruleSelfScanner
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
    // InternalSelfCheckoutExperience.g:4371:1: rule__CarryItems__CarryAssignment_0 : ( ruleCarry ) ;
    public final void rule__CarryItems__CarryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:4375:1: ( ( ruleCarry ) )
            // InternalSelfCheckoutExperience.g:4376:2: ( ruleCarry )
            {
            // InternalSelfCheckoutExperience.g:4376:2: ( ruleCarry )
            // InternalSelfCheckoutExperience.g:4377:3: ruleCarry
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0006510403000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002510403000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002510403000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});

}