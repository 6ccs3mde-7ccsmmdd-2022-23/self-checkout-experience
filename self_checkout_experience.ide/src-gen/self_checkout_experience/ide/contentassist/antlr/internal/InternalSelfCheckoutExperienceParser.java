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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'selfscanner'", "'bag'", "'pay'", "'+'", "'-'", "'*'", "'/'", "'forward'", "'backward'", "'left'", "'right'", "'hold'", "'pick'", "'up'", "'scan'", "'and'", "'add'", "'to'", "'basket'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'('", "')'", "'turn'", "'go'", "'self-checkout'", "'then'", "'barcode'", "'with'", "'all'", "'items'"
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
    public static final int T__45=45;
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
    // InternalSelfCheckoutExperience.g:62:1: ruleSelf_checkout : ( ( rule__Self_checkout__Group__0 ) ) ;
    public final void ruleSelf_checkout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:66:2: ( ( ( rule__Self_checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:67:2: ( ( rule__Self_checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:68:3: ( rule__Self_checkout__Group__0 )
            {
             before(grammarAccess.getSelf_checkoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:69:3: ( rule__Self_checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:69:4: rule__Self_checkout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Self_checkout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelf_checkoutAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleHoldSelfScanner"
    // InternalSelfCheckoutExperience.g:78:1: entryRuleHoldSelfScanner : ruleHoldSelfScanner EOF ;
    public final void entryRuleHoldSelfScanner() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:79:1: ( ruleHoldSelfScanner EOF )
            // InternalSelfCheckoutExperience.g:80:1: ruleHoldSelfScanner EOF
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
    // InternalSelfCheckoutExperience.g:87:1: ruleHoldSelfScanner : ( ( rule__HoldSelfScanner__Group__0 ) ) ;
    public final void ruleHoldSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:91:2: ( ( ( rule__HoldSelfScanner__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__HoldSelfScanner__Group__0 ) )
            // InternalSelfCheckoutExperience.g:93:3: ( rule__HoldSelfScanner__Group__0 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:94:3: ( rule__HoldSelfScanner__Group__0 )
            // InternalSelfCheckoutExperience.g:94:4: rule__HoldSelfScanner__Group__0
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
    // InternalSelfCheckoutExperience.g:103:1: entryRulePickStatement : rulePickStatement EOF ;
    public final void entryRulePickStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:104:1: ( rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:105:1: rulePickStatement EOF
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
    // InternalSelfCheckoutExperience.g:112:1: rulePickStatement : ( ( rule__PickStatement__Group__0 ) ) ;
    public final void rulePickStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:116:2: ( ( ( rule__PickStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__PickStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__PickStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:118:3: ( rule__PickStatement__Group__0 )
            {
             before(grammarAccess.getPickStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:119:3: ( rule__PickStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:119:4: rule__PickStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:128:1: entryRuleItemDef : ruleItemDef EOF ;
    public final void entryRuleItemDef() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:129:1: ( ruleItemDef EOF )
            // InternalSelfCheckoutExperience.g:130:1: ruleItemDef EOF
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
    // InternalSelfCheckoutExperience.g:137:1: ruleItemDef : ( ( rule__ItemDef__NameAssignment ) ) ;
    public final void ruleItemDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:141:2: ( ( ( rule__ItemDef__NameAssignment ) ) )
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__ItemDef__NameAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__ItemDef__NameAssignment ) )
            // InternalSelfCheckoutExperience.g:143:3: ( rule__ItemDef__NameAssignment )
            {
             before(grammarAccess.getItemDefAccess().getNameAssignment()); 
            // InternalSelfCheckoutExperience.g:144:3: ( rule__ItemDef__NameAssignment )
            // InternalSelfCheckoutExperience.g:144:4: rule__ItemDef__NameAssignment
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
    // InternalSelfCheckoutExperience.g:153:1: entryRuleScanAndAddToBasket : ruleScanAndAddToBasket EOF ;
    public final void entryRuleScanAndAddToBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:154:1: ( ruleScanAndAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:155:1: ruleScanAndAddToBasket EOF
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
    // InternalSelfCheckoutExperience.g:162:1: ruleScanAndAddToBasket : ( ( rule__ScanAndAddToBasket__Group__0 ) ) ;
    public final void ruleScanAndAddToBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:166:2: ( ( ( rule__ScanAndAddToBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__ScanAndAddToBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:168:3: ( rule__ScanAndAddToBasket__Group__0 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:169:3: ( rule__ScanAndAddToBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:169:4: rule__ScanAndAddToBasket__Group__0
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
    // InternalSelfCheckoutExperience.g:178:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:179:1: ( ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:180:1: ruleDrop EOF
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
    // InternalSelfCheckoutExperience.g:187:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:191:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__Drop__Group__0 ) )
            // InternalSelfCheckoutExperience.g:193:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:194:3: ( rule__Drop__Group__0 )
            // InternalSelfCheckoutExperience.g:194:4: rule__Drop__Group__0
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
    // InternalSelfCheckoutExperience.g:203:1: entryRuleWalkStatement : ruleWalkStatement EOF ;
    public final void entryRuleWalkStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:204:1: ( ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:205:1: ruleWalkStatement EOF
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
    // InternalSelfCheckoutExperience.g:212:1: ruleWalkStatement : ( ( rule__WalkStatement__Alternatives ) ) ;
    public final void ruleWalkStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:216:2: ( ( ( rule__WalkStatement__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__WalkStatement__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__WalkStatement__Alternatives ) )
            // InternalSelfCheckoutExperience.g:218:3: ( rule__WalkStatement__Alternatives )
            {
             before(grammarAccess.getWalkStatementAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:219:3: ( rule__WalkStatement__Alternatives )
            // InternalSelfCheckoutExperience.g:219:4: rule__WalkStatement__Alternatives
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
    // InternalSelfCheckoutExperience.g:228:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:229:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:230:1: ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:237:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:241:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckoutExperience.g:243:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:244:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckoutExperience.g:244:4: rule__VariableDeclaration__Group__0
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
    // InternalSelfCheckoutExperience.g:253:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:254:1: ( ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:255:1: ruleRepeat EOF
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
    // InternalSelfCheckoutExperience.g:262:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:266:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__Repeat__Group__0 ) )
            // InternalSelfCheckoutExperience.g:268:3: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:269:3: ( rule__Repeat__Group__0 )
            // InternalSelfCheckoutExperience.g:269:4: rule__Repeat__Group__0
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
    // InternalSelfCheckoutExperience.g:278:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:279:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:280:1: ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:287:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:291:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:293:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:294:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:294:4: rule__MoveStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:303:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:304:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:305:1: ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:312:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:316:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:318:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:319:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:319:4: rule__TurnStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:328:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:329:1: ( ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:330:1: ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:337:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:341:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckoutExperience.g:343:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:344:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckoutExperience.g:344:4: rule__Addition__Group__0
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
    // InternalSelfCheckoutExperience.g:353:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:354:1: ( ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:355:1: ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:362:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:366:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckoutExperience.g:368:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:369:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckoutExperience.g:369:4: rule__Multiplication__Group__0
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
    // InternalSelfCheckoutExperience.g:378:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:379:1: ( rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:380:1: rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:387:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:391:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckoutExperience.g:393:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:394:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckoutExperience.g:394:4: rule__Primary__Alternatives
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
    // InternalSelfCheckoutExperience.g:403:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:404:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:405:1: ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:412:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:416:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:418:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:419:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:419:4: rule__IntLiteral__ValAssignment
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
    // InternalSelfCheckoutExperience.g:428:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:429:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:430:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:437:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:441:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:443:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:444:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:444:4: rule__IntVarExpression__VarAssignment
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
    // InternalSelfCheckoutExperience.g:453:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:454:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:455:1: ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:462:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:466:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:468:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:469:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:469:4: rule__Checkout__Group__0
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
    // InternalSelfCheckoutExperience.g:478:1: entryRuleScanExpression : ruleScanExpression EOF ;
    public final void entryRuleScanExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:479:1: ( ruleScanExpression EOF )
            // InternalSelfCheckoutExperience.g:480:1: ruleScanExpression EOF
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
    // InternalSelfCheckoutExperience.g:487:1: ruleScanExpression : ( ( rule__ScanExpression__Group__0 ) ) ;
    public final void ruleScanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:491:2: ( ( ( rule__ScanExpression__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__ScanExpression__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:492:2: ( ( rule__ScanExpression__Group__0 ) )
            // InternalSelfCheckoutExperience.g:493:3: ( rule__ScanExpression__Group__0 )
            {
             before(grammarAccess.getScanExpressionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:494:3: ( rule__ScanExpression__Group__0 )
            // InternalSelfCheckoutExperience.g:494:4: rule__ScanExpression__Group__0
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
    // InternalSelfCheckoutExperience.g:503:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:504:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:505:1: ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:512:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:516:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:517:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:518:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:519:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:519:4: rule__Scan__Group__0
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


    // $ANTLR start "entryRuleAddToBag"
    // InternalSelfCheckoutExperience.g:528:1: entryRuleAddToBag : ruleAddToBag EOF ;
    public final void entryRuleAddToBag() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:529:1: ( ruleAddToBag EOF )
            // InternalSelfCheckoutExperience.g:530:1: ruleAddToBag EOF
            {
             before(grammarAccess.getAddToBagRule()); 
            pushFollow(FOLLOW_1);
            ruleAddToBag();

            state._fsp--;

             after(grammarAccess.getAddToBagRule()); 
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
    // $ANTLR end "entryRuleAddToBag"


    // $ANTLR start "ruleAddToBag"
    // InternalSelfCheckoutExperience.g:537:1: ruleAddToBag : ( ( rule__AddToBag__Group__0 ) ) ;
    public final void ruleAddToBag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:541:2: ( ( ( rule__AddToBag__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__AddToBag__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:542:2: ( ( rule__AddToBag__Group__0 ) )
            // InternalSelfCheckoutExperience.g:543:3: ( rule__AddToBag__Group__0 )
            {
             before(grammarAccess.getAddToBagAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:544:3: ( rule__AddToBag__Group__0 )
            // InternalSelfCheckoutExperience.g:544:4: rule__AddToBag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToBagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddToBag"


    // $ANTLR start "ruleSelfScanner"
    // InternalSelfCheckoutExperience.g:553:1: ruleSelfScanner : ( ( 'selfscanner' ) ) ;
    public final void ruleSelfScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:557:1: ( ( ( 'selfscanner' ) ) )
            // InternalSelfCheckoutExperience.g:558:2: ( ( 'selfscanner' ) )
            {
            // InternalSelfCheckoutExperience.g:558:2: ( ( 'selfscanner' ) )
            // InternalSelfCheckoutExperience.g:559:3: ( 'selfscanner' )
            {
             before(grammarAccess.getSelfScannerAccess().getSelfscannerEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:560:3: ( 'selfscanner' )
            // InternalSelfCheckoutExperience.g:560:4: 'selfscanner'
            {
            match(input,11,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:569:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:573:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:574:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:574:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:575:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:576:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:576:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:585:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:589:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:590:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:590:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:591:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:592:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:592:4: rule__TurnCommand__Alternatives
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


    // $ANTLR start "ruleBag"
    // InternalSelfCheckoutExperience.g:601:1: ruleBag : ( ( 'bag' ) ) ;
    public final void ruleBag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:605:1: ( ( ( 'bag' ) ) )
            // InternalSelfCheckoutExperience.g:606:2: ( ( 'bag' ) )
            {
            // InternalSelfCheckoutExperience.g:606:2: ( ( 'bag' ) )
            // InternalSelfCheckoutExperience.g:607:3: ( 'bag' )
            {
             before(grammarAccess.getBagAccess().getBagEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:608:3: ( 'bag' )
            // InternalSelfCheckoutExperience.g:608:4: 'bag'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getBagAccess().getBagEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBag"


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:617:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:621:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:622:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:622:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:623:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:624:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:624:4: 'pay'
            {
            match(input,13,FOLLOW_2); 

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


    // $ANTLR start "rule__Self_checkout__Alternatives_1"
    // InternalSelfCheckoutExperience.g:632:1: rule__Self_checkout__Alternatives_1 : ( ( ( rule__Self_checkout__PickstatementsAssignment_1_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_1_1 ) ) );
    public final void rule__Self_checkout__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:636:1: ( ( ( rule__Self_checkout__PickstatementsAssignment_1_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=18 && LA1_0<=19)||LA1_0==31||LA1_0==33||LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:637:2: ( ( rule__Self_checkout__PickstatementsAssignment_1_0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:637:2: ( ( rule__Self_checkout__PickstatementsAssignment_1_0 ) )
                    // InternalSelfCheckoutExperience.g:638:3: ( rule__Self_checkout__PickstatementsAssignment_1_0 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getPickstatementsAssignment_1_0()); 
                    // InternalSelfCheckoutExperience.g:639:3: ( rule__Self_checkout__PickstatementsAssignment_1_0 )
                    // InternalSelfCheckoutExperience.g:639:4: rule__Self_checkout__PickstatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__PickstatementsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getPickstatementsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:643:2: ( ( rule__Self_checkout__WalkstatementsAssignment_1_1 ) )
                    {
                    // InternalSelfCheckoutExperience.g:643:2: ( ( rule__Self_checkout__WalkstatementsAssignment_1_1 ) )
                    // InternalSelfCheckoutExperience.g:644:3: ( rule__Self_checkout__WalkstatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_1_1()); 
                    // InternalSelfCheckoutExperience.g:645:3: ( rule__Self_checkout__WalkstatementsAssignment_1_1 )
                    // InternalSelfCheckoutExperience.g:645:4: rule__Self_checkout__WalkstatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__WalkstatementsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_1_1()); 

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
    // $ANTLR end "rule__Self_checkout__Alternatives_1"


    // $ANTLR start "rule__PickStatement__HoldingItemAlternatives_4_0"
    // InternalSelfCheckoutExperience.g:653:1: rule__PickStatement__HoldingItemAlternatives_4_0 : ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:657:1: ( ( ruleScanAndAddToBasket ) | ( ruleDrop ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:658:2: ( ruleScanAndAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:658:2: ( ruleScanAndAddToBasket )
                    // InternalSelfCheckoutExperience.g:659:3: ruleScanAndAddToBasket
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
                    // InternalSelfCheckoutExperience.g:664:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:664:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:665:3: ruleDrop
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
    // InternalSelfCheckoutExperience.g:674:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:678:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:679:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:679:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:680:3: ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:685:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:685:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:686:3: ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:691:2: ( ruleRepeat )
                    {
                    // InternalSelfCheckoutExperience.g:691:2: ( ruleRepeat )
                    // InternalSelfCheckoutExperience.g:692:3: ruleRepeat
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
                    // InternalSelfCheckoutExperience.g:697:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:697:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:698:3: ruleVariableDeclaration
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
    // InternalSelfCheckoutExperience.g:707:1: rule__Repeat__StatementsAlternatives_3_0 : ( ( ruleWalkStatement ) | ( rulePickStatement ) );
    public final void rule__Repeat__StatementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:711:1: ( ( ruleWalkStatement ) | ( rulePickStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)||LA4_0==31||LA4_0==33||LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:712:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:712:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:713:3: ruleWalkStatement
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
                    // InternalSelfCheckoutExperience.g:718:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:718:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:719:3: rulePickStatement
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
    // InternalSelfCheckoutExperience.g:728:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:732:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:733:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:733:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:734:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:739:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:739:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:740:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:749:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:753:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:754:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:754:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:755:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:760:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:760:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:761:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:770:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:774:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 36:
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
                    // InternalSelfCheckoutExperience.g:775:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:775:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:776:3: ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:781:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:781:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:782:3: ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:787:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:787:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSelfCheckoutExperience.g:788:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalSelfCheckoutExperience.g:789:3: ( rule__Primary__Group_2__0 )
                    // InternalSelfCheckoutExperience.g:789:4: rule__Primary__Group_2__0
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


    // $ANTLR start "rule__MoveCommand__Alternatives"
    // InternalSelfCheckoutExperience.g:797:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:801:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:802:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:802:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:803:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:804:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:804:4: 'forward'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:808:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:808:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:809:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:810:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:810:4: 'backward'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:818:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:822:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:823:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:823:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:824:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:825:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:825:4: 'left'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:829:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:829:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:830:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:831:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:831:4: 'right'
                    {
                    match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rule__Self_checkout__Group__0"
    // InternalSelfCheckoutExperience.g:839:1: rule__Self_checkout__Group__0 : rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 ;
    public final void rule__Self_checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:843:1: ( rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:844:2: rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Self_checkout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Self_checkout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__0"


    // $ANTLR start "rule__Self_checkout__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:851:1: rule__Self_checkout__Group__0__Impl : ( ( rule__Self_checkout__PickScanMachineAssignment_0 ) ) ;
    public final void rule__Self_checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:855:1: ( ( ( rule__Self_checkout__PickScanMachineAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:856:1: ( ( rule__Self_checkout__PickScanMachineAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:856:1: ( ( rule__Self_checkout__PickScanMachineAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:857:2: ( rule__Self_checkout__PickScanMachineAssignment_0 )
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickScanMachineAssignment_0()); 
            // InternalSelfCheckoutExperience.g:858:2: ( rule__Self_checkout__PickScanMachineAssignment_0 )
            // InternalSelfCheckoutExperience.g:858:3: rule__Self_checkout__PickScanMachineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Self_checkout__PickScanMachineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelf_checkoutAccess().getPickScanMachineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__0__Impl"


    // $ANTLR start "rule__Self_checkout__Group__1"
    // InternalSelfCheckoutExperience.g:866:1: rule__Self_checkout__Group__1 : rule__Self_checkout__Group__1__Impl rule__Self_checkout__Group__2 ;
    public final void rule__Self_checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:870:1: ( rule__Self_checkout__Group__1__Impl rule__Self_checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:871:2: rule__Self_checkout__Group__1__Impl rule__Self_checkout__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Self_checkout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Self_checkout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__1"


    // $ANTLR start "rule__Self_checkout__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:878:1: rule__Self_checkout__Group__1__Impl : ( ( rule__Self_checkout__Alternatives_1 )* ) ;
    public final void rule__Self_checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:882:1: ( ( ( rule__Self_checkout__Alternatives_1 )* ) )
            // InternalSelfCheckoutExperience.g:883:1: ( ( rule__Self_checkout__Alternatives_1 )* )
            {
            // InternalSelfCheckoutExperience.g:883:1: ( ( rule__Self_checkout__Alternatives_1 )* )
            // InternalSelfCheckoutExperience.g:884:2: ( rule__Self_checkout__Alternatives_1 )*
            {
             before(grammarAccess.getSelf_checkoutAccess().getAlternatives_1()); 
            // InternalSelfCheckoutExperience.g:885:2: ( rule__Self_checkout__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=19)||LA10_0==23||LA10_0==31||LA10_0==33||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:885:3: rule__Self_checkout__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Self_checkout__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSelf_checkoutAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__1__Impl"


    // $ANTLR start "rule__Self_checkout__Group__2"
    // InternalSelfCheckoutExperience.g:893:1: rule__Self_checkout__Group__2 : rule__Self_checkout__Group__2__Impl ;
    public final void rule__Self_checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:897:1: ( rule__Self_checkout__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:898:2: rule__Self_checkout__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Self_checkout__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__2"


    // $ANTLR start "rule__Self_checkout__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:904:1: rule__Self_checkout__Group__2__Impl : ( ( rule__Self_checkout__CheckoutAssignment_2 )? ) ;
    public final void rule__Self_checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:908:1: ( ( ( rule__Self_checkout__CheckoutAssignment_2 )? ) )
            // InternalSelfCheckoutExperience.g:909:1: ( ( rule__Self_checkout__CheckoutAssignment_2 )? )
            {
            // InternalSelfCheckoutExperience.g:909:1: ( ( rule__Self_checkout__CheckoutAssignment_2 )? )
            // InternalSelfCheckoutExperience.g:910:2: ( rule__Self_checkout__CheckoutAssignment_2 )?
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_2()); 
            // InternalSelfCheckoutExperience.g:911:2: ( rule__Self_checkout__CheckoutAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:911:3: rule__Self_checkout__CheckoutAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__CheckoutAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__Group__2__Impl"


    // $ANTLR start "rule__HoldSelfScanner__Group__0"
    // InternalSelfCheckoutExperience.g:920:1: rule__HoldSelfScanner__Group__0 : rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 ;
    public final void rule__HoldSelfScanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:924:1: ( rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1 )
            // InternalSelfCheckoutExperience.g:925:2: rule__HoldSelfScanner__Group__0__Impl rule__HoldSelfScanner__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSelfCheckoutExperience.g:932:1: rule__HoldSelfScanner__Group__0__Impl : ( 'hold' ) ;
    public final void rule__HoldSelfScanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:936:1: ( ( 'hold' ) )
            // InternalSelfCheckoutExperience.g:937:1: ( 'hold' )
            {
            // InternalSelfCheckoutExperience.g:937:1: ( 'hold' )
            // InternalSelfCheckoutExperience.g:938:2: 'hold'
            {
             before(grammarAccess.getHoldSelfScannerAccess().getHoldKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:947:1: rule__HoldSelfScanner__Group__1 : rule__HoldSelfScanner__Group__1__Impl ;
    public final void rule__HoldSelfScanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:951:1: ( rule__HoldSelfScanner__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:952:2: rule__HoldSelfScanner__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:958:1: rule__HoldSelfScanner__Group__1__Impl : ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) ;
    public final void rule__HoldSelfScanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:962:1: ( ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:963:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:963:1: ( ( rule__HoldSelfScanner__ScanMachineAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:964:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            {
             before(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1()); 
            // InternalSelfCheckoutExperience.g:965:2: ( rule__HoldSelfScanner__ScanMachineAssignment_1 )
            // InternalSelfCheckoutExperience.g:965:3: rule__HoldSelfScanner__ScanMachineAssignment_1
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
    // InternalSelfCheckoutExperience.g:974:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:978:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:979:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:986:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:990:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:991:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:991:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:992:2: 'pick'
            {
             before(grammarAccess.getPickStatementAccess().getPickKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1001:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1005:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1006:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1013:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1017:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:1018:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:1018:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:1019:2: 'up'
            {
             before(grammarAccess.getPickStatementAccess().getUpKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1028:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1032:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1033:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:1040:1: rule__PickStatement__Group__2__Impl : ( ( rule__PickStatement__ItemCountAssignment_2 ) ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1044:1: ( ( ( rule__PickStatement__ItemCountAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1045:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1045:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1046:2: ( rule__PickStatement__ItemCountAssignment_2 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1047:2: ( rule__PickStatement__ItemCountAssignment_2 )
            // InternalSelfCheckoutExperience.g:1047:3: rule__PickStatement__ItemCountAssignment_2
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
    // InternalSelfCheckoutExperience.g:1055:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1059:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:1060:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckoutExperience.g:1067:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1071:1: ( ( ( rule__PickStatement__ItemPickedAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1072:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1072:1: ( ( rule__PickStatement__ItemPickedAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1073:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getItemPickedAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1074:2: ( rule__PickStatement__ItemPickedAssignment_3 )
            // InternalSelfCheckoutExperience.g:1074:3: rule__PickStatement__ItemPickedAssignment_3
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
    // InternalSelfCheckoutExperience.g:1082:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1086:1: ( rule__PickStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1087:2: rule__PickStatement__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:1093:1: rule__PickStatement__Group__4__Impl : ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1097:1: ( ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1098:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1098:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1099:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1100:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:1100:3: rule__PickStatement__HoldingItemAssignment_4
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
    // InternalSelfCheckoutExperience.g:1109:1: rule__ScanAndAddToBasket__Group__0 : rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 ;
    public final void rule__ScanAndAddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1113:1: ( rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:1114:2: rule__ScanAndAddToBasket__Group__0__Impl rule__ScanAndAddToBasket__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSelfCheckoutExperience.g:1121:1: rule__ScanAndAddToBasket__Group__0__Impl : ( 'scan' ) ;
    public final void rule__ScanAndAddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1125:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:1126:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:1126:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:1127:2: 'scan'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getScanKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1136:1: rule__ScanAndAddToBasket__Group__1 : rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 ;
    public final void rule__ScanAndAddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1140:1: ( rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:1141:2: rule__ScanAndAddToBasket__Group__1__Impl rule__ScanAndAddToBasket__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:1148:1: rule__ScanAndAddToBasket__Group__1__Impl : ( 'and' ) ;
    public final void rule__ScanAndAddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1152:1: ( ( 'and' ) )
            // InternalSelfCheckoutExperience.g:1153:1: ( 'and' )
            {
            // InternalSelfCheckoutExperience.g:1153:1: ( 'and' )
            // InternalSelfCheckoutExperience.g:1154:2: 'and'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAndKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1163:1: rule__ScanAndAddToBasket__Group__2 : rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 ;
    public final void rule__ScanAndAddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1167:1: ( rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1168:2: rule__ScanAndAddToBasket__Group__2__Impl rule__ScanAndAddToBasket__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:1175:1: rule__ScanAndAddToBasket__Group__2__Impl : ( 'add' ) ;
    public final void rule__ScanAndAddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1179:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:1180:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:1180:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:1181:2: 'add'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getAddKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1190:1: rule__ScanAndAddToBasket__Group__3 : rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 ;
    public final void rule__ScanAndAddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1194:1: ( rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4 )
            // InternalSelfCheckoutExperience.g:1195:2: rule__ScanAndAddToBasket__Group__3__Impl rule__ScanAndAddToBasket__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:1202:1: rule__ScanAndAddToBasket__Group__3__Impl : ( 'to' ) ;
    public final void rule__ScanAndAddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1206:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1207:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1207:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1208:2: 'to'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getToKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1217:1: rule__ScanAndAddToBasket__Group__4 : rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 ;
    public final void rule__ScanAndAddToBasket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1221:1: ( rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5 )
            // InternalSelfCheckoutExperience.g:1222:2: rule__ScanAndAddToBasket__Group__4__Impl rule__ScanAndAddToBasket__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:1229:1: rule__ScanAndAddToBasket__Group__4__Impl : ( 'basket' ) ;
    public final void rule__ScanAndAddToBasket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1233:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1234:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1234:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1235:2: 'basket'
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getBasketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1244:1: rule__ScanAndAddToBasket__Group__5 : rule__ScanAndAddToBasket__Group__5__Impl ;
    public final void rule__ScanAndAddToBasket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1248:1: ( rule__ScanAndAddToBasket__Group__5__Impl )
            // InternalSelfCheckoutExperience.g:1249:2: rule__ScanAndAddToBasket__Group__5__Impl
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
    // InternalSelfCheckoutExperience.g:1255:1: rule__ScanAndAddToBasket__Group__5__Impl : ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) ;
    public final void rule__ScanAndAddToBasket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1259:1: ( ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) ) )
            // InternalSelfCheckoutExperience.g:1260:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            {
            // InternalSelfCheckoutExperience.g:1260:1: ( ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 ) )
            // InternalSelfCheckoutExperience.g:1261:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5()); 
            // InternalSelfCheckoutExperience.g:1262:2: ( rule__ScanAndAddToBasket__ItemInBasketAssignment_5 )
            // InternalSelfCheckoutExperience.g:1262:3: rule__ScanAndAddToBasket__ItemInBasketAssignment_5
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
    // InternalSelfCheckoutExperience.g:1271:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1275:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:1276:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:1283:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1287:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:1288:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:1288:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:1289:2: 'drop'
            {
             before(grammarAccess.getDropAccess().getDropKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1298:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1302:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1303:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1309:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemDroppedAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1313:1: ( ( ( rule__Drop__ItemDroppedAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1314:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1314:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1315:2: ( rule__Drop__ItemDroppedAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1316:2: ( rule__Drop__ItemDroppedAssignment_1 )
            // InternalSelfCheckoutExperience.g:1316:3: rule__Drop__ItemDroppedAssignment_1
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
    // InternalSelfCheckoutExperience.g:1325:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1329:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:1330:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:1337:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1341:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:1342:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:1342:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:1343:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1352:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1356:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:1357:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSelfCheckoutExperience.g:1364:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1368:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1369:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1369:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1370:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1371:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:1371:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckoutExperience.g:1379:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1383:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:1384:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSelfCheckoutExperience.g:1391:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1395:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:1396:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:1396:1: ( '=' )
            // InternalSelfCheckoutExperience.g:1397:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1406:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1410:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1411:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1417:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1421:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1422:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1422:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1423:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1424:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:1424:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalSelfCheckoutExperience.g:1433:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1437:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalSelfCheckoutExperience.g:1438:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1445:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1449:1: ( ( 'repeat' ) )
            // InternalSelfCheckoutExperience.g:1450:1: ( 'repeat' )
            {
            // InternalSelfCheckoutExperience.g:1450:1: ( 'repeat' )
            // InternalSelfCheckoutExperience.g:1451:2: 'repeat'
            {
             before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1460:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1464:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalSelfCheckoutExperience.g:1465:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSelfCheckoutExperience.g:1472:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__CountAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1476:1: ( ( ( rule__Repeat__CountAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1477:1: ( ( rule__Repeat__CountAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1477:1: ( ( rule__Repeat__CountAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1478:2: ( rule__Repeat__CountAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getCountAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1479:2: ( rule__Repeat__CountAssignment_1 )
            // InternalSelfCheckoutExperience.g:1479:3: rule__Repeat__CountAssignment_1
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
    // InternalSelfCheckoutExperience.g:1487:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl rule__Repeat__Group__3 ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1491:1: ( rule__Repeat__Group__2__Impl rule__Repeat__Group__3 )
            // InternalSelfCheckoutExperience.g:1492:2: rule__Repeat__Group__2__Impl rule__Repeat__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1499:1: rule__Repeat__Group__2__Impl : ( 'times:' ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1503:1: ( ( 'times:' ) )
            // InternalSelfCheckoutExperience.g:1504:1: ( 'times:' )
            {
            // InternalSelfCheckoutExperience.g:1504:1: ( 'times:' )
            // InternalSelfCheckoutExperience.g:1505:2: 'times:'
            {
             before(grammarAccess.getRepeatAccess().getTimesKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1514:1: rule__Repeat__Group__3 : rule__Repeat__Group__3__Impl rule__Repeat__Group__4 ;
    public final void rule__Repeat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1518:1: ( rule__Repeat__Group__3__Impl rule__Repeat__Group__4 )
            // InternalSelfCheckoutExperience.g:1519:2: rule__Repeat__Group__3__Impl rule__Repeat__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:1526:1: rule__Repeat__Group__3__Impl : ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) ;
    public final void rule__Repeat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1530:1: ( ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:1531:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:1531:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:1532:2: ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:1532:2: ( ( rule__Repeat__StatementsAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1533:3: ( rule__Repeat__StatementsAssignment_3 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1534:3: ( rule__Repeat__StatementsAssignment_3 )
            // InternalSelfCheckoutExperience.g:1534:4: rule__Repeat__StatementsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__Repeat__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:1537:2: ( ( rule__Repeat__StatementsAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:1538:3: ( rule__Repeat__StatementsAssignment_3 )*
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1539:3: ( rule__Repeat__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=19)||LA12_0==23||LA12_0==31||LA12_0==33||LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1539:4: rule__Repeat__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Repeat__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSelfCheckoutExperience.g:1548:1: rule__Repeat__Group__4 : rule__Repeat__Group__4__Impl ;
    public final void rule__Repeat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1552:1: ( rule__Repeat__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1553:2: rule__Repeat__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:1559:1: rule__Repeat__Group__4__Impl : ( 'end' ) ;
    public final void rule__Repeat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1563:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:1564:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:1564:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:1565:2: 'end'
            {
             before(grammarAccess.getRepeatAccess().getEndKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1575:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1579:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1580:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1587:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1591:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1592:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1592:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1593:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1594:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:1594:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckoutExperience.g:1602:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1606:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1607:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1614:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1618:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1619:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1619:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1620:2: '('
            {
             before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1629:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1633:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1634:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSelfCheckoutExperience.g:1641:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1645:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1646:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1646:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1647:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1648:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:1648:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckoutExperience.g:1656:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1660:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1661:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1667:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1671:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1672:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1672:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1673:2: ')'
            {
             before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1683:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1687:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1688:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:1695:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1699:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:1700:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:1700:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:1701:2: 'turn'
            {
             before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1710:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1714:1: ( rule__TurnStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1715:2: rule__TurnStatement__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1721:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1725:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1726:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1726:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1727:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1728:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:1728:3: rule__TurnStatement__CommandAssignment_1
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
    // InternalSelfCheckoutExperience.g:1737:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1741:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:1742:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSelfCheckoutExperience.g:1749:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1753:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:1754:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:1754:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:1755:2: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:1764:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1768:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1769:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1775:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1779:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1780:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1780:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1781:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1782:2: ( rule__Addition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1782:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSelfCheckoutExperience.g:1791:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1795:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1796:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSelfCheckoutExperience.g:1803:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1807:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1808:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1808:1: ( () )
            // InternalSelfCheckoutExperience.g:1809:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1810:2: ()
            // InternalSelfCheckoutExperience.g:1810:3: 
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
    // InternalSelfCheckoutExperience.g:1818:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1822:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1823:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1830:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1834:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1835:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1835:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1836:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1837:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1837:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1845:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1849:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1850:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1856:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1860:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1861:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1861:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1862:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1863:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1863:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:1872:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1876:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:1877:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSelfCheckoutExperience.g:1884:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1888:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:1889:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:1889:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:1890:2: rulePrimary
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
    // InternalSelfCheckoutExperience.g:1899:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1903:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1904:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1910:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1914:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1915:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1915:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1916:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1917:2: ( rule__Multiplication__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1917:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSelfCheckoutExperience.g:1926:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1930:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1931:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSelfCheckoutExperience.g:1938:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1942:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1943:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1943:1: ( () )
            // InternalSelfCheckoutExperience.g:1944:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1945:2: ()
            // InternalSelfCheckoutExperience.g:1945:3: 
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
    // InternalSelfCheckoutExperience.g:1953:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1957:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1958:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:1965:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1969:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1970:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1970:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1971:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1972:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1972:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1980:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1984:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1985:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1991:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1995:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1996:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1996:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1997:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1998:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1998:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:2007:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2011:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSelfCheckoutExperience.g:2012:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2019:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2023:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:2024:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:2024:1: ( '(' )
            // InternalSelfCheckoutExperience.g:2025:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2034:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2038:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSelfCheckoutExperience.g:2039:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSelfCheckoutExperience.g:2046:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2050:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2051:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2051:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2052:2: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2061:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2065:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSelfCheckoutExperience.g:2066:2: rule__Primary__Group_2__2__Impl
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
    // InternalSelfCheckoutExperience.g:2072:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2076:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:2077:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:2077:1: ( ')' )
            // InternalSelfCheckoutExperience.g:2078:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2088:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2092:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:2093:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:2100:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2104:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:2105:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:2105:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:2106:2: 'go'
            {
             before(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2115:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2119:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:2120:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSelfCheckoutExperience.g:2127:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2131:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2132:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2132:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2133:2: 'to'
            {
             before(grammarAccess.getCheckoutAccess().getToKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2142:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2146:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:2147:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2154:1: rule__Checkout__Group__2__Impl : ( 'self-checkout' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2158:1: ( ( 'self-checkout' ) )
            // InternalSelfCheckoutExperience.g:2159:1: ( 'self-checkout' )
            {
            // InternalSelfCheckoutExperience.g:2159:1: ( 'self-checkout' )
            // InternalSelfCheckoutExperience.g:2160:2: 'self-checkout'
            {
             before(grammarAccess.getCheckoutAccess().getSelfCheckoutKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2169:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2173:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:2174:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalSelfCheckoutExperience.g:2181:1: rule__Checkout__Group__3__Impl : ( ( rule__Checkout__ScanAssignment_3 ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2185:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2186:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2186:1: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2187:2: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2188:2: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:2188:3: rule__Checkout__ScanAssignment_3
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
    // InternalSelfCheckoutExperience.g:2196:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2200:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2201:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2207:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2211:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:2212:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:2212:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:2213:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2214:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckoutExperience.g:2214:3: rule__Checkout__PayAssignment_4
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
    // InternalSelfCheckoutExperience.g:2223:1: rule__ScanExpression__Group__0 : rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 ;
    public final void rule__ScanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2227:1: ( rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1 )
            // InternalSelfCheckoutExperience.g:2228:2: rule__ScanExpression__Group__0__Impl rule__ScanExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2235:1: rule__ScanExpression__Group__0__Impl : ( ruleScan ) ;
    public final void rule__ScanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2239:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:2240:1: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:2240:1: ( ruleScan )
            // InternalSelfCheckoutExperience.g:2241:2: ruleScan
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
    // InternalSelfCheckoutExperience.g:2250:1: rule__ScanExpression__Group__1 : rule__ScanExpression__Group__1__Impl ;
    public final void rule__ScanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2254:1: ( rule__ScanExpression__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:2255:2: rule__ScanExpression__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:2261:1: rule__ScanExpression__Group__1__Impl : ( ( rule__ScanExpression__Group_1__0 )? ) ;
    public final void rule__ScanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2265:1: ( ( ( rule__ScanExpression__Group_1__0 )? ) )
            // InternalSelfCheckoutExperience.g:2266:1: ( ( rule__ScanExpression__Group_1__0 )? )
            {
            // InternalSelfCheckoutExperience.g:2266:1: ( ( rule__ScanExpression__Group_1__0 )? )
            // InternalSelfCheckoutExperience.g:2267:2: ( rule__ScanExpression__Group_1__0 )?
            {
             before(grammarAccess.getScanExpressionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:2268:2: ( rule__ScanExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:2268:3: rule__ScanExpression__Group_1__0
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
    // InternalSelfCheckoutExperience.g:2277:1: rule__ScanExpression__Group_1__0 : rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 ;
    public final void rule__ScanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2281:1: ( rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1 )
            // InternalSelfCheckoutExperience.g:2282:2: rule__ScanExpression__Group_1__0__Impl rule__ScanExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2289:1: rule__ScanExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ScanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2293:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:2294:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:2294:1: ( () )
            // InternalSelfCheckoutExperience.g:2295:2: ()
            {
             before(grammarAccess.getScanExpressionAccess().getComplexScanStartAction_1_0()); 
            // InternalSelfCheckoutExperience.g:2296:2: ()
            // InternalSelfCheckoutExperience.g:2296:3: 
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
    // InternalSelfCheckoutExperience.g:2304:1: rule__ScanExpression__Group_1__1 : rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 ;
    public final void rule__ScanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2308:1: ( rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2 )
            // InternalSelfCheckoutExperience.g:2309:2: rule__ScanExpression__Group_1__1__Impl rule__ScanExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:2316:1: rule__ScanExpression__Group_1__1__Impl : ( 'then' ) ;
    public final void rule__ScanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2320:1: ( ( 'then' ) )
            // InternalSelfCheckoutExperience.g:2321:1: ( 'then' )
            {
            // InternalSelfCheckoutExperience.g:2321:1: ( 'then' )
            // InternalSelfCheckoutExperience.g:2322:2: 'then'
            {
             before(grammarAccess.getScanExpressionAccess().getThenKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2331:1: rule__ScanExpression__Group_1__2 : rule__ScanExpression__Group_1__2__Impl ;
    public final void rule__ScanExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2335:1: ( rule__ScanExpression__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:2336:2: rule__ScanExpression__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:2342:1: rule__ScanExpression__Group_1__2__Impl : ( ( rule__ScanExpression__NextAssignment_1_2 ) ) ;
    public final void rule__ScanExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2346:1: ( ( ( rule__ScanExpression__NextAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:2347:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:2347:1: ( ( rule__ScanExpression__NextAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:2348:2: ( rule__ScanExpression__NextAssignment_1_2 )
            {
             before(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:2349:2: ( rule__ScanExpression__NextAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:2349:3: rule__ScanExpression__NextAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:2358:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2362:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:2363:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSelfCheckoutExperience.g:2370:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2374:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2375:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2375:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2376:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2385:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2389:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:2390:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSelfCheckoutExperience.g:2397:1: rule__Scan__Group__1__Impl : ( 'barcode' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2401:1: ( ( 'barcode' ) )
            // InternalSelfCheckoutExperience.g:2402:1: ( 'barcode' )
            {
            // InternalSelfCheckoutExperience.g:2402:1: ( 'barcode' )
            // InternalSelfCheckoutExperience.g:2403:2: 'barcode'
            {
             before(grammarAccess.getScanAccess().getBarcodeKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2412:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2416:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:2417:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSelfCheckoutExperience.g:2424:1: rule__Scan__Group__2__Impl : ( 'with' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2428:1: ( ( 'with' ) )
            // InternalSelfCheckoutExperience.g:2429:1: ( 'with' )
            {
            // InternalSelfCheckoutExperience.g:2429:1: ( 'with' )
            // InternalSelfCheckoutExperience.g:2430:2: 'with'
            {
             before(grammarAccess.getScanAccess().getWithKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2439:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2443:1: ( rule__Scan__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2444:2: rule__Scan__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2450:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__ScanMachineAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2454:1: ( ( ( rule__Scan__ScanMachineAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2455:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2455:1: ( ( rule__Scan__ScanMachineAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2456:2: ( rule__Scan__ScanMachineAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getScanMachineAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2457:2: ( rule__Scan__ScanMachineAssignment_3 )
            // InternalSelfCheckoutExperience.g:2457:3: rule__Scan__ScanMachineAssignment_3
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


    // $ANTLR start "rule__AddToBag__Group__0"
    // InternalSelfCheckoutExperience.g:2466:1: rule__AddToBag__Group__0 : rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 ;
    public final void rule__AddToBag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2470:1: ( rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 )
            // InternalSelfCheckoutExperience.g:2471:2: rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AddToBag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__0"


    // $ANTLR start "rule__AddToBag__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:2478:1: rule__AddToBag__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2482:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2483:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2483:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2484:2: 'add'
            {
             before(grammarAccess.getAddToBagAccess().getAddKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__0__Impl"


    // $ANTLR start "rule__AddToBag__Group__1"
    // InternalSelfCheckoutExperience.g:2493:1: rule__AddToBag__Group__1 : rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 ;
    public final void rule__AddToBag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2497:1: ( rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 )
            // InternalSelfCheckoutExperience.g:2498:2: rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__AddToBag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__1"


    // $ANTLR start "rule__AddToBag__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2505:1: rule__AddToBag__Group__1__Impl : ( 'all' ) ;
    public final void rule__AddToBag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2509:1: ( ( 'all' ) )
            // InternalSelfCheckoutExperience.g:2510:1: ( 'all' )
            {
            // InternalSelfCheckoutExperience.g:2510:1: ( 'all' )
            // InternalSelfCheckoutExperience.g:2511:2: 'all'
            {
             before(grammarAccess.getAddToBagAccess().getAllKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__1__Impl"


    // $ANTLR start "rule__AddToBag__Group__2"
    // InternalSelfCheckoutExperience.g:2520:1: rule__AddToBag__Group__2 : rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 ;
    public final void rule__AddToBag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2524:1: ( rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 )
            // InternalSelfCheckoutExperience.g:2525:2: rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AddToBag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__2"


    // $ANTLR start "rule__AddToBag__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2532:1: rule__AddToBag__Group__2__Impl : ( 'items' ) ;
    public final void rule__AddToBag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2536:1: ( ( 'items' ) )
            // InternalSelfCheckoutExperience.g:2537:1: ( 'items' )
            {
            // InternalSelfCheckoutExperience.g:2537:1: ( 'items' )
            // InternalSelfCheckoutExperience.g:2538:2: 'items'
            {
             before(grammarAccess.getAddToBagAccess().getItemsKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getItemsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__2__Impl"


    // $ANTLR start "rule__AddToBag__Group__3"
    // InternalSelfCheckoutExperience.g:2547:1: rule__AddToBag__Group__3 : rule__AddToBag__Group__3__Impl rule__AddToBag__Group__4 ;
    public final void rule__AddToBag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2551:1: ( rule__AddToBag__Group__3__Impl rule__AddToBag__Group__4 )
            // InternalSelfCheckoutExperience.g:2552:2: rule__AddToBag__Group__3__Impl rule__AddToBag__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__AddToBag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__3"


    // $ANTLR start "rule__AddToBag__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:2559:1: rule__AddToBag__Group__3__Impl : ( 'to' ) ;
    public final void rule__AddToBag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2563:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2564:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2564:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2565:2: 'to'
            {
             before(grammarAccess.getAddToBagAccess().getToKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__3__Impl"


    // $ANTLR start "rule__AddToBag__Group__4"
    // InternalSelfCheckoutExperience.g:2574:1: rule__AddToBag__Group__4 : rule__AddToBag__Group__4__Impl ;
    public final void rule__AddToBag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2578:1: ( rule__AddToBag__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2579:2: rule__AddToBag__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__4"


    // $ANTLR start "rule__AddToBag__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:2585:1: rule__AddToBag__Group__4__Impl : ( ( rule__AddToBag__BagAssignment_4 ) ) ;
    public final void rule__AddToBag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2589:1: ( ( ( rule__AddToBag__BagAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:2590:1: ( ( rule__AddToBag__BagAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:2590:1: ( ( rule__AddToBag__BagAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:2591:2: ( rule__AddToBag__BagAssignment_4 )
            {
             before(grammarAccess.getAddToBagAccess().getBagAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2592:2: ( rule__AddToBag__BagAssignment_4 )
            // InternalSelfCheckoutExperience.g:2592:3: rule__AddToBag__BagAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddToBag__BagAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddToBagAccess().getBagAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__Group__4__Impl"


    // $ANTLR start "rule__Self_checkout__PickScanMachineAssignment_0"
    // InternalSelfCheckoutExperience.g:2601:1: rule__Self_checkout__PickScanMachineAssignment_0 : ( ruleHoldSelfScanner ) ;
    public final void rule__Self_checkout__PickScanMachineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2605:1: ( ( ruleHoldSelfScanner ) )
            // InternalSelfCheckoutExperience.g:2606:2: ( ruleHoldSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:2606:2: ( ruleHoldSelfScanner )
            // InternalSelfCheckoutExperience.g:2607:3: ruleHoldSelfScanner
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHoldSelfScanner();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getPickScanMachineHoldSelfScannerParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__PickScanMachineAssignment_0"


    // $ANTLR start "rule__Self_checkout__PickstatementsAssignment_1_0"
    // InternalSelfCheckoutExperience.g:2616:1: rule__Self_checkout__PickstatementsAssignment_1_0 : ( rulePickStatement ) ;
    public final void rule__Self_checkout__PickstatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2620:1: ( ( rulePickStatement ) )
            // InternalSelfCheckoutExperience.g:2621:2: ( rulePickStatement )
            {
            // InternalSelfCheckoutExperience.g:2621:2: ( rulePickStatement )
            // InternalSelfCheckoutExperience.g:2622:3: rulePickStatement
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickstatementsPickStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePickStatement();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getPickstatementsPickStatementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__PickstatementsAssignment_1_0"


    // $ANTLR start "rule__Self_checkout__WalkstatementsAssignment_1_1"
    // InternalSelfCheckoutExperience.g:2631:1: rule__Self_checkout__WalkstatementsAssignment_1_1 : ( ruleWalkStatement ) ;
    public final void rule__Self_checkout__WalkstatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2635:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckoutExperience.g:2636:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckoutExperience.g:2636:2: ( ruleWalkStatement )
            // InternalSelfCheckoutExperience.g:2637:3: ruleWalkStatement
            {
             before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWalkStatement();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__WalkstatementsAssignment_1_1"


    // $ANTLR start "rule__Self_checkout__CheckoutAssignment_2"
    // InternalSelfCheckoutExperience.g:2646:1: rule__Self_checkout__CheckoutAssignment_2 : ( ruleCheckout ) ;
    public final void rule__Self_checkout__CheckoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2650:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:2651:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:2651:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:2652:3: ruleCheckout
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckout();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__CheckoutAssignment_2"


    // $ANTLR start "rule__HoldSelfScanner__ScanMachineAssignment_1"
    // InternalSelfCheckoutExperience.g:2661:1: rule__HoldSelfScanner__ScanMachineAssignment_1 : ( ruleSelfScanner ) ;
    public final void rule__HoldSelfScanner__ScanMachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2665:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:2666:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:2666:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:2667:3: ruleSelfScanner
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
    // InternalSelfCheckoutExperience.g:2676:1: rule__PickStatement__ItemCountAssignment_2 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2680:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2681:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2681:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2682:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2691:1: rule__PickStatement__ItemPickedAssignment_3 : ( ruleItemDef ) ;
    public final void rule__PickStatement__ItemPickedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2695:1: ( ( ruleItemDef ) )
            // InternalSelfCheckoutExperience.g:2696:2: ( ruleItemDef )
            {
            // InternalSelfCheckoutExperience.g:2696:2: ( ruleItemDef )
            // InternalSelfCheckoutExperience.g:2697:3: ruleItemDef
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
    // InternalSelfCheckoutExperience.g:2706:1: rule__PickStatement__HoldingItemAssignment_4 : ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2710:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) )
            // InternalSelfCheckoutExperience.g:2711:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2711:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            // InternalSelfCheckoutExperience.g:2712:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 
            // InternalSelfCheckoutExperience.g:2713:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            // InternalSelfCheckoutExperience.g:2713:4: rule__PickStatement__HoldingItemAlternatives_4_0
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
    // InternalSelfCheckoutExperience.g:2721:1: rule__ItemDef__NameAssignment : ( RULE_ID ) ;
    public final void rule__ItemDef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2725:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2726:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2726:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2727:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2736:1: rule__ScanAndAddToBasket__ItemInBasketAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ScanAndAddToBasket__ItemInBasketAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2740:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2741:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2741:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2742:3: ( RULE_ID )
            {
             before(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefCrossReference_5_0()); 
            // InternalSelfCheckoutExperience.g:2743:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2744:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2755:1: rule__Drop__ItemDroppedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemDroppedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2759:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2760:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2760:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2761:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemDroppedItemDefCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:2762:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2763:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2774:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2778:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2779:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2779:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2780:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2789:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2793:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2794:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2794:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2795:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:2804:1: rule__Repeat__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__Repeat__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2808:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2809:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2809:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2810:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2819:1: rule__Repeat__StatementsAssignment_3 : ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) ;
    public final void rule__Repeat__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2823:1: ( ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) )
            // InternalSelfCheckoutExperience.g:2824:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2824:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            // InternalSelfCheckoutExperience.g:2825:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAlternatives_3_0()); 
            // InternalSelfCheckoutExperience.g:2826:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            // InternalSelfCheckoutExperience.g:2826:4: rule__Repeat__StatementsAlternatives_3_0
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
    // InternalSelfCheckoutExperience.g:2834:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2838:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:2839:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:2839:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:2840:3: ruleMoveCommand
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
    // InternalSelfCheckoutExperience.g:2849:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2853:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2854:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2854:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2855:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2864:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2868:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:2869:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:2869:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:2870:3: ruleTurnCommand
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
    // InternalSelfCheckoutExperience.g:2879:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2883:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2884:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2884:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2885:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2886:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2886:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2894:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2898:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2899:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2899:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2900:3: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:2909:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2913:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2914:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2914:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2915:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2916:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2916:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2924:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2928:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:2929:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:2929:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:2930:3: rulePrimary
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
    // InternalSelfCheckoutExperience.g:2939:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2943:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2944:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2944:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2945:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:2954:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2958:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2959:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2959:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2960:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:2961:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2962:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2973:1: rule__Checkout__ScanAssignment_3 : ( ruleScanExpression ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2977:1: ( ( ruleScanExpression ) )
            // InternalSelfCheckoutExperience.g:2978:2: ( ruleScanExpression )
            {
            // InternalSelfCheckoutExperience.g:2978:2: ( ruleScanExpression )
            // InternalSelfCheckoutExperience.g:2979:3: ruleScanExpression
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
    // InternalSelfCheckoutExperience.g:2988:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2992:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:2993:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:2993:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:2994:3: rulePay
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
    // InternalSelfCheckoutExperience.g:3003:1: rule__ScanExpression__NextAssignment_1_2 : ( ruleAddToBag ) ;
    public final void rule__ScanExpression__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3007:1: ( ( ruleAddToBag ) )
            // InternalSelfCheckoutExperience.g:3008:2: ( ruleAddToBag )
            {
            // InternalSelfCheckoutExperience.g:3008:2: ( ruleAddToBag )
            // InternalSelfCheckoutExperience.g:3009:3: ruleAddToBag
            {
             before(grammarAccess.getScanExpressionAccess().getNextAddToBagParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddToBag();

            state._fsp--;

             after(grammarAccess.getScanExpressionAccess().getNextAddToBagParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:3018:1: rule__Scan__ScanMachineAssignment_3 : ( ruleSelfScanner ) ;
    public final void rule__Scan__ScanMachineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3022:1: ( ( ruleSelfScanner ) )
            // InternalSelfCheckoutExperience.g:3023:2: ( ruleSelfScanner )
            {
            // InternalSelfCheckoutExperience.g:3023:2: ( ruleSelfScanner )
            // InternalSelfCheckoutExperience.g:3024:3: ruleSelfScanner
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


    // $ANTLR start "rule__AddToBag__BagAssignment_4"
    // InternalSelfCheckoutExperience.g:3033:1: rule__AddToBag__BagAssignment_4 : ( ruleBag ) ;
    public final void rule__AddToBag__BagAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:3037:1: ( ( ruleBag ) )
            // InternalSelfCheckoutExperience.g:3038:2: ( ruleBag )
            {
            // InternalSelfCheckoutExperience.g:3038:2: ( ruleBag )
            // InternalSelfCheckoutExperience.g:3039:3: ruleBag
            {
             before(grammarAccess.getAddToBagAccess().getBagBagEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBag();

            state._fsp--;

             after(grammarAccess.getAddToBagAccess().getBagBagEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__BagAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C2808C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000042808C0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000042808C0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001000L});

}