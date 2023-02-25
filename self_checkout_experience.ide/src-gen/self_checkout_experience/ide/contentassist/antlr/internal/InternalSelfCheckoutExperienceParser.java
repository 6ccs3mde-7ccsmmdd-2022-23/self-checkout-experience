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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pay'", "'+'", "'-'", "'*'", "'/'", "'forward'", "'backward'", "'left'", "'right'", "'pick'", "'up'", "'add'", "'to'", "'basket'", "'drop'", "'var'", "'='", "'repeat'", "'times:'", "'end'", "'('", "')'", "'turn'", "'go'", "'till'", "'scan'", "'at'", "'bag'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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


    // $ANTLR start "entryRulePickStatement"
    // InternalSelfCheckoutExperience.g:78:1: entryRulePickStatement : rulePickStatement EOF ;
    public final void entryRulePickStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:79:1: ( rulePickStatement EOF )
            // InternalSelfCheckoutExperience.g:80:1: rulePickStatement EOF
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
    // InternalSelfCheckoutExperience.g:87:1: rulePickStatement : ( ( rule__PickStatement__Group__0 ) ) ;
    public final void rulePickStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:91:2: ( ( ( rule__PickStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__PickStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:92:2: ( ( rule__PickStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:93:3: ( rule__PickStatement__Group__0 )
            {
             before(grammarAccess.getPickStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:94:3: ( rule__PickStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:94:4: rule__PickStatement__Group__0
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


    // $ANTLR start "entryRuleAddToBasket"
    // InternalSelfCheckoutExperience.g:103:1: entryRuleAddToBasket : ruleAddToBasket EOF ;
    public final void entryRuleAddToBasket() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:104:1: ( ruleAddToBasket EOF )
            // InternalSelfCheckoutExperience.g:105:1: ruleAddToBasket EOF
            {
             before(grammarAccess.getAddToBasketRule()); 
            pushFollow(FOLLOW_1);
            ruleAddToBasket();

            state._fsp--;

             after(grammarAccess.getAddToBasketRule()); 
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
    // $ANTLR end "entryRuleAddToBasket"


    // $ANTLR start "ruleAddToBasket"
    // InternalSelfCheckoutExperience.g:112:1: ruleAddToBasket : ( ( rule__AddToBasket__Group__0 ) ) ;
    public final void ruleAddToBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:116:2: ( ( ( rule__AddToBasket__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__AddToBasket__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:117:2: ( ( rule__AddToBasket__Group__0 ) )
            // InternalSelfCheckoutExperience.g:118:3: ( rule__AddToBasket__Group__0 )
            {
             before(grammarAccess.getAddToBasketAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:119:3: ( rule__AddToBasket__Group__0 )
            // InternalSelfCheckoutExperience.g:119:4: rule__AddToBasket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddToBasket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToBasketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddToBasket"


    // $ANTLR start "entryRuleDrop"
    // InternalSelfCheckoutExperience.g:128:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:129:1: ( ruleDrop EOF )
            // InternalSelfCheckoutExperience.g:130:1: ruleDrop EOF
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
    // InternalSelfCheckoutExperience.g:137:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:141:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:142:2: ( ( rule__Drop__Group__0 ) )
            // InternalSelfCheckoutExperience.g:143:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:144:3: ( rule__Drop__Group__0 )
            // InternalSelfCheckoutExperience.g:144:4: rule__Drop__Group__0
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
    // InternalSelfCheckoutExperience.g:153:1: entryRuleWalkStatement : ruleWalkStatement EOF ;
    public final void entryRuleWalkStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:154:1: ( ruleWalkStatement EOF )
            // InternalSelfCheckoutExperience.g:155:1: ruleWalkStatement EOF
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
    // InternalSelfCheckoutExperience.g:162:1: ruleWalkStatement : ( ( rule__WalkStatement__Alternatives ) ) ;
    public final void ruleWalkStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:166:2: ( ( ( rule__WalkStatement__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__WalkStatement__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:167:2: ( ( rule__WalkStatement__Alternatives ) )
            // InternalSelfCheckoutExperience.g:168:3: ( rule__WalkStatement__Alternatives )
            {
             before(grammarAccess.getWalkStatementAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:169:3: ( rule__WalkStatement__Alternatives )
            // InternalSelfCheckoutExperience.g:169:4: rule__WalkStatement__Alternatives
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
    // InternalSelfCheckoutExperience.g:178:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:179:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckoutExperience.g:180:1: ruleVariableDeclaration EOF
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
    // InternalSelfCheckoutExperience.g:187:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:191:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:192:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckoutExperience.g:193:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:194:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckoutExperience.g:194:4: rule__VariableDeclaration__Group__0
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
    // InternalSelfCheckoutExperience.g:203:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:204:1: ( ruleRepeat EOF )
            // InternalSelfCheckoutExperience.g:205:1: ruleRepeat EOF
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
    // InternalSelfCheckoutExperience.g:212:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:216:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__Repeat__Group__0 ) )
            // InternalSelfCheckoutExperience.g:218:3: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:219:3: ( rule__Repeat__Group__0 )
            // InternalSelfCheckoutExperience.g:219:4: rule__Repeat__Group__0
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
    // InternalSelfCheckoutExperience.g:228:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:229:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckoutExperience.g:230:1: ruleMoveStatement EOF
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
    // InternalSelfCheckoutExperience.g:237:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:241:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:242:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:243:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:244:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:244:4: rule__MoveStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:253:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:254:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckoutExperience.g:255:1: ruleTurnStatement EOF
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
    // InternalSelfCheckoutExperience.g:262:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:266:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:267:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:268:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:269:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:269:4: rule__TurnStatement__Group__0
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
    // InternalSelfCheckoutExperience.g:278:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:279:1: ( ruleAddition EOF )
            // InternalSelfCheckoutExperience.g:280:1: ruleAddition EOF
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
    // InternalSelfCheckoutExperience.g:287:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:291:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:292:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckoutExperience.g:293:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:294:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckoutExperience.g:294:4: rule__Addition__Group__0
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
    // InternalSelfCheckoutExperience.g:303:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:304:1: ( ruleMultiplication EOF )
            // InternalSelfCheckoutExperience.g:305:1: ruleMultiplication EOF
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
    // InternalSelfCheckoutExperience.g:312:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:316:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckoutExperience.g:318:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:319:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckoutExperience.g:319:4: rule__Multiplication__Group__0
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
    // InternalSelfCheckoutExperience.g:328:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:329:1: ( rulePrimary EOF )
            // InternalSelfCheckoutExperience.g:330:1: rulePrimary EOF
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
    // InternalSelfCheckoutExperience.g:337:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:341:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:342:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckoutExperience.g:343:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:344:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckoutExperience.g:344:4: rule__Primary__Alternatives
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
    // InternalSelfCheckoutExperience.g:353:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:354:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckoutExperience.g:355:1: ruleIntLiteral EOF
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
    // InternalSelfCheckoutExperience.g:362:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:366:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:367:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:368:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:369:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:369:4: rule__IntLiteral__ValAssignment
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
    // InternalSelfCheckoutExperience.g:378:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:379:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:380:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:387:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:391:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:393:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:394:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:394:4: rule__IntVarExpression__VarAssignment
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
    // InternalSelfCheckoutExperience.g:403:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:404:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:405:1: ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:412:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:416:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:418:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:419:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:419:4: rule__Checkout__Group__0
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


    // $ANTLR start "entryRuleScan"
    // InternalSelfCheckoutExperience.g:428:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:429:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:430:1: ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:437:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:441:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:442:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:443:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:444:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:444:4: rule__Scan__Group__0
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
    // InternalSelfCheckoutExperience.g:453:1: entryRuleAddToBag : ruleAddToBag EOF ;
    public final void entryRuleAddToBag() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:454:1: ( ruleAddToBag EOF )
            // InternalSelfCheckoutExperience.g:455:1: ruleAddToBag EOF
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
    // InternalSelfCheckoutExperience.g:462:1: ruleAddToBag : ( ( rule__AddToBag__Group__0 ) ) ;
    public final void ruleAddToBag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:466:2: ( ( ( rule__AddToBag__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__AddToBag__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:467:2: ( ( rule__AddToBag__Group__0 ) )
            // InternalSelfCheckoutExperience.g:468:3: ( rule__AddToBag__Group__0 )
            {
             before(grammarAccess.getAddToBagAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:469:3: ( rule__AddToBag__Group__0 )
            // InternalSelfCheckoutExperience.g:469:4: rule__AddToBag__Group__0
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


    // $ANTLR start "ruleMoveCommand"
    // InternalSelfCheckoutExperience.g:478:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:482:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:483:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:483:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:484:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:485:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:485:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:494:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:498:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:499:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:499:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:500:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:501:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:501:4: rule__TurnCommand__Alternatives
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


    // $ANTLR start "rulePay"
    // InternalSelfCheckoutExperience.g:510:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:514:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:515:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:515:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:516:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:517:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:517:4: 'pay'
            {
            match(input,11,FOLLOW_2); 

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


    // $ANTLR start "rule__Self_checkout__Alternatives_0"
    // InternalSelfCheckoutExperience.g:525:1: rule__Self_checkout__Alternatives_0 : ( ( ( rule__Self_checkout__PickstatementsAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) );
    public final void rule__Self_checkout__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:529:1: ( ( ( rule__Self_checkout__PickstatementsAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==26||LA1_0==28||LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:530:2: ( ( rule__Self_checkout__PickstatementsAssignment_0_0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:530:2: ( ( rule__Self_checkout__PickstatementsAssignment_0_0 ) )
                    // InternalSelfCheckoutExperience.g:531:3: ( rule__Self_checkout__PickstatementsAssignment_0_0 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getPickstatementsAssignment_0_0()); 
                    // InternalSelfCheckoutExperience.g:532:3: ( rule__Self_checkout__PickstatementsAssignment_0_0 )
                    // InternalSelfCheckoutExperience.g:532:4: rule__Self_checkout__PickstatementsAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__PickstatementsAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getPickstatementsAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:536:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    {
                    // InternalSelfCheckoutExperience.g:536:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    // InternalSelfCheckoutExperience.g:537:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_0_1()); 
                    // InternalSelfCheckoutExperience.g:538:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    // InternalSelfCheckoutExperience.g:538:4: rule__Self_checkout__WalkstatementsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__WalkstatementsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_0_1()); 

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
    // $ANTLR end "rule__Self_checkout__Alternatives_0"


    // $ANTLR start "rule__PickStatement__HoldingItemAlternatives_4_0"
    // InternalSelfCheckoutExperience.g:546:1: rule__PickStatement__HoldingItemAlternatives_4_0 : ( ( ruleAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:550:1: ( ( ruleAddToBasket ) | ( ruleDrop ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:551:2: ( ruleAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:551:2: ( ruleAddToBasket )
                    // InternalSelfCheckoutExperience.g:552:3: ruleAddToBasket
                    {
                     before(grammarAccess.getPickStatementAccess().getHoldingItemAddToBasketParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddToBasket();

                    state._fsp--;

                     after(grammarAccess.getPickStatementAccess().getHoldingItemAddToBasketParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:557:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:557:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:558:3: ruleDrop
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
    // InternalSelfCheckoutExperience.g:567:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:571:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleRepeat ) | ( ruleVariableDeclaration ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 26:
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
                    // InternalSelfCheckoutExperience.g:572:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:572:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:573:3: ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:578:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:578:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:579:3: ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:584:2: ( ruleRepeat )
                    {
                    // InternalSelfCheckoutExperience.g:584:2: ( ruleRepeat )
                    // InternalSelfCheckoutExperience.g:585:3: ruleRepeat
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
                    // InternalSelfCheckoutExperience.g:590:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:590:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:591:3: ruleVariableDeclaration
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
    // InternalSelfCheckoutExperience.g:600:1: rule__Repeat__StatementsAlternatives_3_0 : ( ( ruleWalkStatement ) | ( rulePickStatement ) );
    public final void rule__Repeat__StatementsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:604:1: ( ( ruleWalkStatement ) | ( rulePickStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=17)||LA4_0==26||LA4_0==28||LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:605:2: ( ruleWalkStatement )
                    {
                    // InternalSelfCheckoutExperience.g:605:2: ( ruleWalkStatement )
                    // InternalSelfCheckoutExperience.g:606:3: ruleWalkStatement
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
                    // InternalSelfCheckoutExperience.g:611:2: ( rulePickStatement )
                    {
                    // InternalSelfCheckoutExperience.g:611:2: ( rulePickStatement )
                    // InternalSelfCheckoutExperience.g:612:3: rulePickStatement
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
    // InternalSelfCheckoutExperience.g:621:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:625:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:626:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:626:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:627:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:632:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:632:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:633:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:642:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:646:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:647:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:647:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:648:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:653:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:653:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:654:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:663:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:667:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__Primary__Group_2__0 ) ) )
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
            case 31:
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
                    // InternalSelfCheckoutExperience.g:668:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:668:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:669:3: ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:674:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:674:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:675:3: ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:680:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:680:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSelfCheckoutExperience.g:681:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalSelfCheckoutExperience.g:682:3: ( rule__Primary__Group_2__0 )
                    // InternalSelfCheckoutExperience.g:682:4: rule__Primary__Group_2__0
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
    // InternalSelfCheckoutExperience.g:690:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:694:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:695:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:695:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:696:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:697:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:697:4: 'forward'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:701:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:701:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:702:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:703:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:703:4: 'backward'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:711:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:715:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:716:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:716:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:717:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:718:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:718:4: 'left'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:722:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:722:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:723:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:724:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:724:4: 'right'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalSelfCheckoutExperience.g:732:1: rule__Self_checkout__Group__0 : rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 ;
    public final void rule__Self_checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:736:1: ( rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:737:2: rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1
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
    // InternalSelfCheckoutExperience.g:744:1: rule__Self_checkout__Group__0__Impl : ( ( rule__Self_checkout__Alternatives_0 )* ) ;
    public final void rule__Self_checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:748:1: ( ( ( rule__Self_checkout__Alternatives_0 )* ) )
            // InternalSelfCheckoutExperience.g:749:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            {
            // InternalSelfCheckoutExperience.g:749:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            // InternalSelfCheckoutExperience.g:750:2: ( rule__Self_checkout__Alternatives_0 )*
            {
             before(grammarAccess.getSelf_checkoutAccess().getAlternatives_0()); 
            // InternalSelfCheckoutExperience.g:751:2: ( rule__Self_checkout__Alternatives_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=16 && LA10_0<=17)||LA10_0==20||LA10_0==26||LA10_0==28||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:751:3: rule__Self_checkout__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Self_checkout__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSelf_checkoutAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:759:1: rule__Self_checkout__Group__1 : rule__Self_checkout__Group__1__Impl ;
    public final void rule__Self_checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:763:1: ( rule__Self_checkout__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:764:2: rule__Self_checkout__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Self_checkout__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:770:1: rule__Self_checkout__Group__1__Impl : ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) ;
    public final void rule__Self_checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:774:1: ( ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) )
            // InternalSelfCheckoutExperience.g:775:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            {
            // InternalSelfCheckoutExperience.g:775:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            // InternalSelfCheckoutExperience.g:776:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_1()); 
            // InternalSelfCheckoutExperience.g:777:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:777:3: rule__Self_checkout__CheckoutAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__CheckoutAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PickStatement__Group__0"
    // InternalSelfCheckoutExperience.g:786:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:790:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:791:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSelfCheckoutExperience.g:798:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:802:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:803:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:803:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:804:2: 'pick'
            {
             before(grammarAccess.getPickStatementAccess().getPickKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:813:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:817:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:818:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:825:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:829:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:830:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:830:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:831:2: 'up'
            {
             before(grammarAccess.getPickStatementAccess().getUpKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:840:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:844:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:845:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
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
    // InternalSelfCheckoutExperience.g:852:1: rule__PickStatement__Group__2__Impl : ( ( rule__PickStatement__ItemCountAssignment_2 ) ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:856:1: ( ( ( rule__PickStatement__ItemCountAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:857:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:857:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:858:2: ( rule__PickStatement__ItemCountAssignment_2 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 
            // InternalSelfCheckoutExperience.g:859:2: ( rule__PickStatement__ItemCountAssignment_2 )
            // InternalSelfCheckoutExperience.g:859:3: rule__PickStatement__ItemCountAssignment_2
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
    // InternalSelfCheckoutExperience.g:867:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:871:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:872:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckoutExperience.g:879:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__NameAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:883:1: ( ( ( rule__PickStatement__NameAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:884:1: ( ( rule__PickStatement__NameAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:884:1: ( ( rule__PickStatement__NameAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:885:2: ( rule__PickStatement__NameAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getNameAssignment_3()); 
            // InternalSelfCheckoutExperience.g:886:2: ( rule__PickStatement__NameAssignment_3 )
            // InternalSelfCheckoutExperience.g:886:3: rule__PickStatement__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PickStatement__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPickStatementAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:894:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:898:1: ( rule__PickStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:899:2: rule__PickStatement__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:905:1: rule__PickStatement__Group__4__Impl : ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:909:1: ( ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:910:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:910:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:911:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:912:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:912:3: rule__PickStatement__HoldingItemAssignment_4
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


    // $ANTLR start "rule__AddToBasket__Group__0"
    // InternalSelfCheckoutExperience.g:921:1: rule__AddToBasket__Group__0 : rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 ;
    public final void rule__AddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:925:1: ( rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:926:2: rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AddToBasket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBasket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__0"


    // $ANTLR start "rule__AddToBasket__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:933:1: rule__AddToBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:937:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:938:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:938:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:939:2: 'add'
            {
             before(grammarAccess.getAddToBasketAccess().getAddKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__0__Impl"


    // $ANTLR start "rule__AddToBasket__Group__1"
    // InternalSelfCheckoutExperience.g:948:1: rule__AddToBasket__Group__1 : rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 ;
    public final void rule__AddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:952:1: ( rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:953:2: rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AddToBasket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBasket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__1"


    // $ANTLR start "rule__AddToBasket__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:960:1: rule__AddToBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:964:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:965:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:965:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:966:2: 'to'
            {
             before(grammarAccess.getAddToBasketAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__1__Impl"


    // $ANTLR start "rule__AddToBasket__Group__2"
    // InternalSelfCheckoutExperience.g:975:1: rule__AddToBasket__Group__2 : rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 ;
    public final void rule__AddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:979:1: ( rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:980:2: rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AddToBasket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToBasket__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__2"


    // $ANTLR start "rule__AddToBasket__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:987:1: rule__AddToBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:991:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:992:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:992:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:993:2: 'basket'
            {
             before(grammarAccess.getAddToBasketAccess().getBasketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getBasketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__2__Impl"


    // $ANTLR start "rule__AddToBasket__Group__3"
    // InternalSelfCheckoutExperience.g:1002:1: rule__AddToBasket__Group__3 : rule__AddToBasket__Group__3__Impl ;
    public final void rule__AddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1006:1: ( rule__AddToBasket__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1007:2: rule__AddToBasket__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToBasket__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__3"


    // $ANTLR start "rule__AddToBasket__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1013:1: rule__AddToBasket__Group__3__Impl : ( ( rule__AddToBasket__ItemInBasketAssignment_3 ) ) ;
    public final void rule__AddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1017:1: ( ( ( rule__AddToBasket__ItemInBasketAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1018:1: ( ( rule__AddToBasket__ItemInBasketAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1018:1: ( ( rule__AddToBasket__ItemInBasketAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1019:2: ( rule__AddToBasket__ItemInBasketAssignment_3 )
            {
             before(grammarAccess.getAddToBasketAccess().getItemInBasketAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1020:2: ( rule__AddToBasket__ItemInBasketAssignment_3 )
            // InternalSelfCheckoutExperience.g:1020:3: rule__AddToBasket__ItemInBasketAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddToBasket__ItemInBasketAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddToBasketAccess().getItemInBasketAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__Group__3__Impl"


    // $ANTLR start "rule__Drop__Group__0"
    // InternalSelfCheckoutExperience.g:1029:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1033:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:1034:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalSelfCheckoutExperience.g:1041:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1045:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:1046:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:1046:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:1047:2: 'drop'
            {
             before(grammarAccess.getDropAccess().getDropKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1056:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1060:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1061:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1067:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemDroppedAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1071:1: ( ( ( rule__Drop__ItemDroppedAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1072:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1072:1: ( ( rule__Drop__ItemDroppedAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1073:2: ( rule__Drop__ItemDroppedAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemDroppedAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1074:2: ( rule__Drop__ItemDroppedAssignment_1 )
            // InternalSelfCheckoutExperience.g:1074:3: rule__Drop__ItemDroppedAssignment_1
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
    // InternalSelfCheckoutExperience.g:1083:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1087:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:1088:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalSelfCheckoutExperience.g:1095:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1099:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:1100:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:1100:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:1101:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1110:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1114:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:1115:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckoutExperience.g:1122:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1126:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1127:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1127:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1128:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1129:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:1129:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckoutExperience.g:1137:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1141:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:1142:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckoutExperience.g:1149:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1153:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:1154:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:1154:1: ( '=' )
            // InternalSelfCheckoutExperience.g:1155:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1164:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1168:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1169:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1175:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1179:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1180:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1180:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1181:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1182:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:1182:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalSelfCheckoutExperience.g:1191:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1195:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalSelfCheckoutExperience.g:1196:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1203:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1207:1: ( ( 'repeat' ) )
            // InternalSelfCheckoutExperience.g:1208:1: ( 'repeat' )
            {
            // InternalSelfCheckoutExperience.g:1208:1: ( 'repeat' )
            // InternalSelfCheckoutExperience.g:1209:2: 'repeat'
            {
             before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1218:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1222:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalSelfCheckoutExperience.g:1223:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckoutExperience.g:1230:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__CountAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1234:1: ( ( ( rule__Repeat__CountAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1235:1: ( ( rule__Repeat__CountAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1235:1: ( ( rule__Repeat__CountAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1236:2: ( rule__Repeat__CountAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getCountAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1237:2: ( rule__Repeat__CountAssignment_1 )
            // InternalSelfCheckoutExperience.g:1237:3: rule__Repeat__CountAssignment_1
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
    // InternalSelfCheckoutExperience.g:1245:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl rule__Repeat__Group__3 ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1249:1: ( rule__Repeat__Group__2__Impl rule__Repeat__Group__3 )
            // InternalSelfCheckoutExperience.g:1250:2: rule__Repeat__Group__2__Impl rule__Repeat__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSelfCheckoutExperience.g:1257:1: rule__Repeat__Group__2__Impl : ( 'times:' ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1261:1: ( ( 'times:' ) )
            // InternalSelfCheckoutExperience.g:1262:1: ( 'times:' )
            {
            // InternalSelfCheckoutExperience.g:1262:1: ( 'times:' )
            // InternalSelfCheckoutExperience.g:1263:2: 'times:'
            {
             before(grammarAccess.getRepeatAccess().getTimesKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1272:1: rule__Repeat__Group__3 : rule__Repeat__Group__3__Impl rule__Repeat__Group__4 ;
    public final void rule__Repeat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1276:1: ( rule__Repeat__Group__3__Impl rule__Repeat__Group__4 )
            // InternalSelfCheckoutExperience.g:1277:2: rule__Repeat__Group__3__Impl rule__Repeat__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSelfCheckoutExperience.g:1284:1: rule__Repeat__Group__3__Impl : ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) ;
    public final void rule__Repeat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1288:1: ( ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:1289:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:1289:1: ( ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:1290:2: ( ( rule__Repeat__StatementsAssignment_3 ) ) ( ( rule__Repeat__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:1290:2: ( ( rule__Repeat__StatementsAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1291:3: ( rule__Repeat__StatementsAssignment_3 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1292:3: ( rule__Repeat__StatementsAssignment_3 )
            // InternalSelfCheckoutExperience.g:1292:4: rule__Repeat__StatementsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__Repeat__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:1295:2: ( ( rule__Repeat__StatementsAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:1296:3: ( rule__Repeat__StatementsAssignment_3 )*
            {
             before(grammarAccess.getRepeatAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1297:3: ( rule__Repeat__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=16 && LA12_0<=17)||LA12_0==20||LA12_0==26||LA12_0==28||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1297:4: rule__Repeat__StatementsAssignment_3
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
    // InternalSelfCheckoutExperience.g:1306:1: rule__Repeat__Group__4 : rule__Repeat__Group__4__Impl ;
    public final void rule__Repeat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1310:1: ( rule__Repeat__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1311:2: rule__Repeat__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:1317:1: rule__Repeat__Group__4__Impl : ( 'end' ) ;
    public final void rule__Repeat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1321:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:1322:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:1322:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:1323:2: 'end'
            {
             before(grammarAccess.getRepeatAccess().getEndKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1333:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1337:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1338:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSelfCheckoutExperience.g:1345:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1349:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1350:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1350:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1351:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1352:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:1352:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckoutExperience.g:1360:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1364:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1365:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1372:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1376:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1377:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1377:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1378:2: '('
            {
             before(grammarAccess.getMoveStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1387:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1391:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1392:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1399:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1403:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1404:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1404:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1405:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1406:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:1406:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckoutExperience.g:1414:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1418:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1419:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1425:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1429:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1430:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1430:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1431:2: ')'
            {
             before(grammarAccess.getMoveStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1441:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1445:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1446:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:1453:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1457:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:1458:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:1458:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:1459:2: 'turn'
            {
             before(grammarAccess.getTurnStatementAccess().getTurnKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1468:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1472:1: ( rule__TurnStatement__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1473:2: rule__TurnStatement__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1479:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1483:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1484:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1484:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1485:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1486:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:1486:3: rule__TurnStatement__CommandAssignment_1
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
    // InternalSelfCheckoutExperience.g:1495:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1499:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:1500:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1507:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1511:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:1512:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:1512:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:1513:2: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:1522:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1526:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1527:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1533:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1537:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1538:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1538:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1539:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1540:2: ( rule__Addition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1540:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalSelfCheckoutExperience.g:1549:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1553:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1554:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1561:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1565:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1566:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1566:1: ( () )
            // InternalSelfCheckoutExperience.g:1567:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1568:2: ()
            // InternalSelfCheckoutExperience.g:1568:3: 
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
    // InternalSelfCheckoutExperience.g:1576:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1580:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1581:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1588:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1592:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1593:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1593:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1594:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1595:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1595:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1603:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1607:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1608:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1614:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1618:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1619:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1619:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1620:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1621:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1621:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:1630:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1634:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:1635:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:1642:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1646:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:1647:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:1647:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:1648:2: rulePrimary
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
    // InternalSelfCheckoutExperience.g:1657:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1661:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1662:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1668:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1672:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1673:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1673:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1674:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1675:2: ( rule__Multiplication__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=15)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1675:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalSelfCheckoutExperience.g:1684:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1688:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1689:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSelfCheckoutExperience.g:1696:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1700:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1701:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1701:1: ( () )
            // InternalSelfCheckoutExperience.g:1702:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1703:2: ()
            // InternalSelfCheckoutExperience.g:1703:3: 
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
    // InternalSelfCheckoutExperience.g:1711:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1715:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1716:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1723:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1727:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1728:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1728:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1729:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1730:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1730:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1738:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1742:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1743:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1749:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1753:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1754:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1754:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1755:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1756:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1756:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:1765:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1769:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSelfCheckoutExperience.g:1770:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckoutExperience.g:1777:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1781:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1782:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1782:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1783:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1792:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1796:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSelfCheckoutExperience.g:1797:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1804:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1808:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:1809:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:1809:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:1810:2: ruleAddition
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
    // InternalSelfCheckoutExperience.g:1819:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1823:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSelfCheckoutExperience.g:1824:2: rule__Primary__Group_2__2__Impl
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
    // InternalSelfCheckoutExperience.g:1830:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1834:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1835:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1835:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1836:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1846:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1850:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:1851:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
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
    // InternalSelfCheckoutExperience.g:1858:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1862:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:1863:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:1863:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:1864:2: 'go'
            {
             before(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1873:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1877:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:1878:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSelfCheckoutExperience.g:1885:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1889:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1890:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1890:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1891:2: 'to'
            {
             before(grammarAccess.getCheckoutAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:1900:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1904:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:1905:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSelfCheckoutExperience.g:1912:1: rule__Checkout__Group__2__Impl : ( 'till' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1916:1: ( ( 'till' ) )
            // InternalSelfCheckoutExperience.g:1917:1: ( 'till' )
            {
            // InternalSelfCheckoutExperience.g:1917:1: ( 'till' )
            // InternalSelfCheckoutExperience.g:1918:2: 'till'
            {
             before(grammarAccess.getCheckoutAccess().getTillKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCheckoutAccess().getTillKeyword_2()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1927:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1931:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:1932:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSelfCheckoutExperience.g:1939:1: rule__Checkout__Group__3__Impl : ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1943:1: ( ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:1944:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:1944:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:1945:2: ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:1945:2: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1946:3: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1947:3: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:1947:4: rule__Checkout__ScanAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Checkout__ScanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:1950:2: ( ( rule__Checkout__ScanAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:1951:3: ( rule__Checkout__ScanAssignment_3 )*
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1952:3: ( rule__Checkout__ScanAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1952:4: rule__Checkout__ScanAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Checkout__ScanAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 

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
    // $ANTLR end "rule__Checkout__Group__3__Impl"


    // $ANTLR start "rule__Checkout__Group__4"
    // InternalSelfCheckoutExperience.g:1961:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1965:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1966:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:1972:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1976:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:1977:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:1977:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:1978:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:1979:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckoutExperience.g:1979:3: rule__Checkout__PayAssignment_4
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


    // $ANTLR start "rule__Scan__Group__0"
    // InternalSelfCheckoutExperience.g:1988:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1992:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:1993:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2000:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2004:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2005:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2005:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2006:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2015:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2019:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:2020:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSelfCheckoutExperience.g:2027:1: rule__Scan__Group__1__Impl : ( 'at' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2031:1: ( ( 'at' ) )
            // InternalSelfCheckoutExperience.g:2032:1: ( 'at' )
            {
            // InternalSelfCheckoutExperience.g:2032:1: ( 'at' )
            // InternalSelfCheckoutExperience.g:2033:2: 'at'
            {
             before(grammarAccess.getScanAccess().getAtKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getAtKeyword_1()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2042:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2046:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:2047:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2054:1: rule__Scan__Group__2__Impl : ( 'till' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2058:1: ( ( 'till' ) )
            // InternalSelfCheckoutExperience.g:2059:1: ( 'till' )
            {
            // InternalSelfCheckoutExperience.g:2059:1: ( 'till' )
            // InternalSelfCheckoutExperience.g:2060:2: 'till'
            {
             before(grammarAccess.getScanAccess().getTillKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getTillKeyword_2()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2069:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl rule__Scan__Group__4 ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2073:1: ( rule__Scan__Group__3__Impl rule__Scan__Group__4 )
            // InternalSelfCheckoutExperience.g:2074:2: rule__Scan__Group__3__Impl rule__Scan__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Scan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scan__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:2081:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__NameAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2085:1: ( ( ( rule__Scan__NameAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2086:1: ( ( rule__Scan__NameAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2086:1: ( ( rule__Scan__NameAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2087:2: ( rule__Scan__NameAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getNameAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2088:2: ( rule__Scan__NameAssignment_3 )
            // InternalSelfCheckoutExperience.g:2088:3: rule__Scan__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scan__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScanAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Scan__Group__4"
    // InternalSelfCheckoutExperience.g:2096:1: rule__Scan__Group__4 : rule__Scan__Group__4__Impl ;
    public final void rule__Scan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2100:1: ( rule__Scan__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2101:2: rule__Scan__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scan__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__4"


    // $ANTLR start "rule__Scan__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:2107:1: rule__Scan__Group__4__Impl : ( ( rule__Scan__AddToBagAssignment_4 )* ) ;
    public final void rule__Scan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2111:1: ( ( ( rule__Scan__AddToBagAssignment_4 )* ) )
            // InternalSelfCheckoutExperience.g:2112:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            {
            // InternalSelfCheckoutExperience.g:2112:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            // InternalSelfCheckoutExperience.g:2113:2: ( rule__Scan__AddToBagAssignment_4 )*
            {
             before(grammarAccess.getScanAccess().getAddToBagAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2114:2: ( rule__Scan__AddToBagAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2114:3: rule__Scan__AddToBagAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Scan__AddToBagAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScanAccess().getAddToBagAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__4__Impl"


    // $ANTLR start "rule__AddToBag__Group__0"
    // InternalSelfCheckoutExperience.g:2123:1: rule__AddToBag__Group__0 : rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 ;
    public final void rule__AddToBag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2127:1: ( rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 )
            // InternalSelfCheckoutExperience.g:2128:2: rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckoutExperience.g:2135:1: rule__AddToBag__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2139:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2140:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2140:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2141:2: 'add'
            {
             before(grammarAccess.getAddToBagAccess().getAddKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2150:1: rule__AddToBag__Group__1 : rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 ;
    public final void rule__AddToBag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2154:1: ( rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 )
            // InternalSelfCheckoutExperience.g:2155:2: rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSelfCheckoutExperience.g:2162:1: rule__AddToBag__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2166:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2167:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2167:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2168:2: 'to'
            {
             before(grammarAccess.getAddToBagAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getToKeyword_1()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2177:1: rule__AddToBag__Group__2 : rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 ;
    public final void rule__AddToBag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2181:1: ( rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 )
            // InternalSelfCheckoutExperience.g:2182:2: rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSelfCheckoutExperience.g:2189:1: rule__AddToBag__Group__2__Impl : ( 'bag' ) ;
    public final void rule__AddToBag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2193:1: ( ( 'bag' ) )
            // InternalSelfCheckoutExperience.g:2194:1: ( 'bag' )
            {
            // InternalSelfCheckoutExperience.g:2194:1: ( 'bag' )
            // InternalSelfCheckoutExperience.g:2195:2: 'bag'
            {
             before(grammarAccess.getAddToBagAccess().getBagKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getBagKeyword_2()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2204:1: rule__AddToBag__Group__3 : rule__AddToBag__Group__3__Impl ;
    public final void rule__AddToBag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2208:1: ( rule__AddToBag__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2209:2: rule__AddToBag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToBag__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:2215:1: rule__AddToBag__Group__3__Impl : ( ( rule__AddToBag__BagItemAssignment_3 ) ) ;
    public final void rule__AddToBag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2219:1: ( ( ( rule__AddToBag__BagItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2220:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2220:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2221:2: ( rule__AddToBag__BagItemAssignment_3 )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2222:2: ( rule__AddToBag__BagItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:2222:3: rule__AddToBag__BagItemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddToBag__BagItemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddToBagAccess().getBagItemAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Self_checkout__PickstatementsAssignment_0_0"
    // InternalSelfCheckoutExperience.g:2231:1: rule__Self_checkout__PickstatementsAssignment_0_0 : ( rulePickStatement ) ;
    public final void rule__Self_checkout__PickstatementsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2235:1: ( ( rulePickStatement ) )
            // InternalSelfCheckoutExperience.g:2236:2: ( rulePickStatement )
            {
            // InternalSelfCheckoutExperience.g:2236:2: ( rulePickStatement )
            // InternalSelfCheckoutExperience.g:2237:3: rulePickStatement
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickstatementsPickStatementParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePickStatement();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getPickstatementsPickStatementParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__PickstatementsAssignment_0_0"


    // $ANTLR start "rule__Self_checkout__WalkstatementsAssignment_0_1"
    // InternalSelfCheckoutExperience.g:2246:1: rule__Self_checkout__WalkstatementsAssignment_0_1 : ( ruleWalkStatement ) ;
    public final void rule__Self_checkout__WalkstatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2250:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckoutExperience.g:2251:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckoutExperience.g:2251:2: ( ruleWalkStatement )
            // InternalSelfCheckoutExperience.g:2252:3: ruleWalkStatement
            {
             before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWalkStatement();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getWalkstatementsWalkStatementParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__WalkstatementsAssignment_0_1"


    // $ANTLR start "rule__Self_checkout__CheckoutAssignment_1"
    // InternalSelfCheckoutExperience.g:2261:1: rule__Self_checkout__CheckoutAssignment_1 : ( ruleCheckout ) ;
    public final void rule__Self_checkout__CheckoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2265:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:2266:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:2266:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:2267:3: ruleCheckout
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckout();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getCheckoutCheckoutParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__CheckoutAssignment_1"


    // $ANTLR start "rule__PickStatement__ItemCountAssignment_2"
    // InternalSelfCheckoutExperience.g:2276:1: rule__PickStatement__ItemCountAssignment_2 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2280:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2281:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2281:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2282:3: ruleAddition
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


    // $ANTLR start "rule__PickStatement__NameAssignment_3"
    // InternalSelfCheckoutExperience.g:2291:1: rule__PickStatement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PickStatement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2295:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2296:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2296:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2297:3: RULE_ID
            {
             before(grammarAccess.getPickStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPickStatementAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PickStatement__NameAssignment_3"


    // $ANTLR start "rule__PickStatement__HoldingItemAssignment_4"
    // InternalSelfCheckoutExperience.g:2306:1: rule__PickStatement__HoldingItemAssignment_4 : ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2310:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) )
            // InternalSelfCheckoutExperience.g:2311:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2311:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            // InternalSelfCheckoutExperience.g:2312:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 
            // InternalSelfCheckoutExperience.g:2313:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            // InternalSelfCheckoutExperience.g:2313:4: rule__PickStatement__HoldingItemAlternatives_4_0
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


    // $ANTLR start "rule__AddToBasket__ItemInBasketAssignment_3"
    // InternalSelfCheckoutExperience.g:2321:1: rule__AddToBasket__ItemInBasketAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBasket__ItemInBasketAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2325:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2326:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2326:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2327:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBasketAccess().getItemInBasketPickStatementCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:2328:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2329:4: RULE_ID
            {
             before(grammarAccess.getAddToBasketAccess().getItemInBasketPickStatementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getItemInBasketPickStatementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddToBasketAccess().getItemInBasketPickStatementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__ItemInBasketAssignment_3"


    // $ANTLR start "rule__Drop__ItemDroppedAssignment_1"
    // InternalSelfCheckoutExperience.g:2340:1: rule__Drop__ItemDroppedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemDroppedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2344:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2345:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2345:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2346:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemDroppedPickStatementCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:2347:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2348:4: RULE_ID
            {
             before(grammarAccess.getDropAccess().getItemDroppedPickStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getItemDroppedPickStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDropAccess().getItemDroppedPickStatementCrossReference_1_0()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2359:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2363:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2364:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2364:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2365:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2374:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2378:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2379:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2379:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2380:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:2389:1: rule__Repeat__CountAssignment_1 : ( ruleAddition ) ;
    public final void rule__Repeat__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2393:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2394:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2394:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2395:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2404:1: rule__Repeat__StatementsAssignment_3 : ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) ;
    public final void rule__Repeat__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2408:1: ( ( ( rule__Repeat__StatementsAlternatives_3_0 ) ) )
            // InternalSelfCheckoutExperience.g:2409:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2409:2: ( ( rule__Repeat__StatementsAlternatives_3_0 ) )
            // InternalSelfCheckoutExperience.g:2410:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            {
             before(grammarAccess.getRepeatAccess().getStatementsAlternatives_3_0()); 
            // InternalSelfCheckoutExperience.g:2411:3: ( rule__Repeat__StatementsAlternatives_3_0 )
            // InternalSelfCheckoutExperience.g:2411:4: rule__Repeat__StatementsAlternatives_3_0
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
    // InternalSelfCheckoutExperience.g:2419:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2423:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:2424:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:2424:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:2425:3: ruleMoveCommand
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
    // InternalSelfCheckoutExperience.g:2434:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2438:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2439:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2439:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2440:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2449:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2453:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:2454:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:2454:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:2455:3: ruleTurnCommand
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
    // InternalSelfCheckoutExperience.g:2464:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2468:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2469:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2469:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2470:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2471:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2471:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2479:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2483:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2484:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2484:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2485:3: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:2494:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2498:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2499:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2499:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2500:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2501:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2501:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2509:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2513:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:2514:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:2514:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:2515:3: rulePrimary
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
    // InternalSelfCheckoutExperience.g:2524:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2528:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2529:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2529:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2530:3: RULE_INT
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
    // InternalSelfCheckoutExperience.g:2539:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2543:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2544:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2544:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2545:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:2546:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2547:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2558:1: rule__Checkout__ScanAssignment_3 : ( ruleScan ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2562:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:2563:2: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:2563:2: ( ruleScan )
            // InternalSelfCheckoutExperience.g:2564:3: ruleScan
            {
             before(grammarAccess.getCheckoutAccess().getScanScanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScan();

            state._fsp--;

             after(grammarAccess.getCheckoutAccess().getScanScanParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:2573:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2577:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:2578:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:2578:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:2579:3: rulePay
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


    // $ANTLR start "rule__Scan__NameAssignment_3"
    // InternalSelfCheckoutExperience.g:2588:1: rule__Scan__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Scan__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2592:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2593:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2593:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2594:3: RULE_ID
            {
             before(grammarAccess.getScanAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__NameAssignment_3"


    // $ANTLR start "rule__Scan__AddToBagAssignment_4"
    // InternalSelfCheckoutExperience.g:2603:1: rule__Scan__AddToBagAssignment_4 : ( ruleAddToBag ) ;
    public final void rule__Scan__AddToBagAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2607:1: ( ( ruleAddToBag ) )
            // InternalSelfCheckoutExperience.g:2608:2: ( ruleAddToBag )
            {
            // InternalSelfCheckoutExperience.g:2608:2: ( ruleAddToBag )
            // InternalSelfCheckoutExperience.g:2609:3: ruleAddToBag
            {
             before(grammarAccess.getScanAccess().getAddToBagAddToBagParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddToBag();

            state._fsp--;

             after(grammarAccess.getScanAccess().getAddToBagAddToBagParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__AddToBagAssignment_4"


    // $ANTLR start "rule__AddToBag__BagItemAssignment_3"
    // InternalSelfCheckoutExperience.g:2618:1: rule__AddToBag__BagItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBag__BagItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2622:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2623:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2623:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2624:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemScanCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:2625:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2626:4: RULE_ID
            {
             before(grammarAccess.getAddToBagAccess().getBagItemScanIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToBagAccess().getBagItemScanIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddToBagAccess().getBagItemScanCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBag__BagItemAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000214130002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000214130000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});

}