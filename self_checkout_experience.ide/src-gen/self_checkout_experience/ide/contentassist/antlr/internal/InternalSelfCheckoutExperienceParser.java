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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pay'", "'+'", "'-'", "'*'", "'/'", "'forward'", "'backward'", "'left'", "'right'", "'pick'", "'up'", "'add'", "'to'", "'basket'", "'drop'", "'var'", "'='", "'times'", "'do'", "'end'", "'('", "')'", "'turn'", "'by'", "'degrees'", "'.'", "'go'", "'till'", "'scan'", "'at'", "'bag'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleLoopStatement"
    // InternalSelfCheckoutExperience.g:203:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:204:1: ( ruleLoopStatement EOF )
            // InternalSelfCheckoutExperience.g:205:1: ruleLoopStatement EOF
            {
             before(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementRule()); 
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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalSelfCheckoutExperience.g:212:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:216:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:217:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalSelfCheckoutExperience.g:218:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:219:3: ( rule__LoopStatement__Group__0 )
            // InternalSelfCheckoutExperience.g:219:4: rule__LoopStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopStatement"


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


    // $ANTLR start "entryRuleRealLiteral"
    // InternalSelfCheckoutExperience.g:378:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:379:1: ( ruleRealLiteral EOF )
            // InternalSelfCheckoutExperience.g:380:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalSelfCheckoutExperience.g:387:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:391:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:392:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalSelfCheckoutExperience.g:393:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalSelfCheckoutExperience.g:394:3: ( rule__RealLiteral__ValAssignment )
            // InternalSelfCheckoutExperience.g:394:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalSelfCheckoutExperience.g:403:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:404:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckoutExperience.g:405:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckoutExperience.g:412:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:416:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckoutExperience.g:417:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckoutExperience.g:418:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckoutExperience.g:419:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckoutExperience.g:419:4: rule__IntVarExpression__VarAssignment
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


    // $ANTLR start "entryRuleREAL"
    // InternalSelfCheckoutExperience.g:428:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSelfCheckoutExperience.g:432:1: ( ruleREAL EOF )
            // InternalSelfCheckoutExperience.g:433:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSelfCheckoutExperience.g:443:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:448:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:449:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:449:2: ( ( rule__REAL__Group__0 ) )
            // InternalSelfCheckoutExperience.g:450:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:451:3: ( rule__REAL__Group__0 )
            // InternalSelfCheckoutExperience.g:451:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

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
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleCheckout"
    // InternalSelfCheckoutExperience.g:461:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:462:1: ( ruleCheckout EOF )
            // InternalSelfCheckoutExperience.g:463:1: ruleCheckout EOF
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
    // InternalSelfCheckoutExperience.g:470:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:474:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:475:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:475:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckoutExperience.g:476:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:477:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckoutExperience.g:477:4: rule__Checkout__Group__0
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
    // InternalSelfCheckoutExperience.g:486:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:487:1: ( ruleScan EOF )
            // InternalSelfCheckoutExperience.g:488:1: ruleScan EOF
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
    // InternalSelfCheckoutExperience.g:495:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:499:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:500:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:500:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckoutExperience.g:501:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:502:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckoutExperience.g:502:4: rule__Scan__Group__0
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
    // InternalSelfCheckoutExperience.g:511:1: entryRuleAddToBag : ruleAddToBag EOF ;
    public final void entryRuleAddToBag() throws RecognitionException {
        try {
            // InternalSelfCheckoutExperience.g:512:1: ( ruleAddToBag EOF )
            // InternalSelfCheckoutExperience.g:513:1: ruleAddToBag EOF
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
    // InternalSelfCheckoutExperience.g:520:1: ruleAddToBag : ( ( rule__AddToBag__Group__0 ) ) ;
    public final void ruleAddToBag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:524:2: ( ( ( rule__AddToBag__Group__0 ) ) )
            // InternalSelfCheckoutExperience.g:525:2: ( ( rule__AddToBag__Group__0 ) )
            {
            // InternalSelfCheckoutExperience.g:525:2: ( ( rule__AddToBag__Group__0 ) )
            // InternalSelfCheckoutExperience.g:526:3: ( rule__AddToBag__Group__0 )
            {
             before(grammarAccess.getAddToBagAccess().getGroup()); 
            // InternalSelfCheckoutExperience.g:527:3: ( rule__AddToBag__Group__0 )
            // InternalSelfCheckoutExperience.g:527:4: rule__AddToBag__Group__0
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
    // InternalSelfCheckoutExperience.g:536:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:540:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:541:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:541:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:542:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:543:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:543:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:552:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:556:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckoutExperience.g:557:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckoutExperience.g:557:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckoutExperience.g:558:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckoutExperience.g:559:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckoutExperience.g:559:4: rule__TurnCommand__Alternatives
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
    // InternalSelfCheckoutExperience.g:568:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:572:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckoutExperience.g:573:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckoutExperience.g:573:2: ( ( 'pay' ) )
            // InternalSelfCheckoutExperience.g:574:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckoutExperience.g:575:3: ( 'pay' )
            // InternalSelfCheckoutExperience.g:575:4: 'pay'
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
    // InternalSelfCheckoutExperience.g:583:1: rule__Self_checkout__Alternatives_0 : ( ( ( rule__Self_checkout__PickstatemensAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) );
    public final void rule__Self_checkout__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:587:1: ( ( ( rule__Self_checkout__PickstatemensAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||(LA1_0>=16 && LA1_0<=17)||LA1_0==26||LA1_0==31||LA1_0==33||LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:588:2: ( ( rule__Self_checkout__PickstatemensAssignment_0_0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:588:2: ( ( rule__Self_checkout__PickstatemensAssignment_0_0 ) )
                    // InternalSelfCheckoutExperience.g:589:3: ( rule__Self_checkout__PickstatemensAssignment_0_0 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getPickstatemensAssignment_0_0()); 
                    // InternalSelfCheckoutExperience.g:590:3: ( rule__Self_checkout__PickstatemensAssignment_0_0 )
                    // InternalSelfCheckoutExperience.g:590:4: rule__Self_checkout__PickstatemensAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__PickstatemensAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getPickstatemensAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:594:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    {
                    // InternalSelfCheckoutExperience.g:594:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    // InternalSelfCheckoutExperience.g:595:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_0_1()); 
                    // InternalSelfCheckoutExperience.g:596:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    // InternalSelfCheckoutExperience.g:596:4: rule__Self_checkout__WalkstatementsAssignment_0_1
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
    // InternalSelfCheckoutExperience.g:604:1: rule__PickStatement__HoldingItemAlternatives_4_0 : ( ( ruleAddToBasket ) | ( ruleDrop ) );
    public final void rule__PickStatement__HoldingItemAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:608:1: ( ( ruleAddToBasket ) | ( ruleDrop ) )
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
                    // InternalSelfCheckoutExperience.g:609:2: ( ruleAddToBasket )
                    {
                    // InternalSelfCheckoutExperience.g:609:2: ( ruleAddToBasket )
                    // InternalSelfCheckoutExperience.g:610:3: ruleAddToBasket
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
                    // InternalSelfCheckoutExperience.g:615:2: ( ruleDrop )
                    {
                    // InternalSelfCheckoutExperience.g:615:2: ( ruleDrop )
                    // InternalSelfCheckoutExperience.g:616:3: ruleDrop
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
    // InternalSelfCheckoutExperience.g:625:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleLoopStatement ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:629:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleLoopStatement ) | ( ruleVariableDeclaration ) )
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
            case RULE_INT:
            case RULE_ID:
            case 31:
            case 36:
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
                    // InternalSelfCheckoutExperience.g:630:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckoutExperience.g:630:2: ( ruleMoveStatement )
                    // InternalSelfCheckoutExperience.g:631:3: ruleMoveStatement
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
                    // InternalSelfCheckoutExperience.g:636:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckoutExperience.g:636:2: ( ruleTurnStatement )
                    // InternalSelfCheckoutExperience.g:637:3: ruleTurnStatement
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
                    // InternalSelfCheckoutExperience.g:642:2: ( ruleLoopStatement )
                    {
                    // InternalSelfCheckoutExperience.g:642:2: ( ruleLoopStatement )
                    // InternalSelfCheckoutExperience.g:643:3: ruleLoopStatement
                    {
                     before(grammarAccess.getWalkStatementAccess().getLoopStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;

                     after(grammarAccess.getWalkStatementAccess().getLoopStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:648:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckoutExperience.g:648:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckoutExperience.g:649:3: ruleVariableDeclaration
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


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalSelfCheckoutExperience.g:658:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:662:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:663:2: ( '+' )
                    {
                    // InternalSelfCheckoutExperience.g:663:2: ( '+' )
                    // InternalSelfCheckoutExperience.g:664:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:669:2: ( '-' )
                    {
                    // InternalSelfCheckoutExperience.g:669:2: ( '-' )
                    // InternalSelfCheckoutExperience.g:670:3: '-'
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
    // InternalSelfCheckoutExperience.g:679:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:683:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalSelfCheckoutExperience.g:684:2: ( '*' )
                    {
                    // InternalSelfCheckoutExperience.g:684:2: ( '*' )
                    // InternalSelfCheckoutExperience.g:685:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:690:2: ( '/' )
                    {
                    // InternalSelfCheckoutExperience.g:690:2: ( '/' )
                    // InternalSelfCheckoutExperience.g:691:3: '/'
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
    // InternalSelfCheckoutExperience.g:700:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:704:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_ID||(LA6_1>=12 && LA6_1<=15)||LA6_1==28||LA6_1==32||LA6_1==35) ) {
                    alt6=1;
                }
                else if ( (LA6_1==36) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:705:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:705:2: ( ruleIntLiteral )
                    // InternalSelfCheckoutExperience.g:706:3: ruleIntLiteral
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
                    // InternalSelfCheckoutExperience.g:711:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckoutExperience.g:711:2: ( ruleIntVarExpression )
                    // InternalSelfCheckoutExperience.g:712:3: ruleIntVarExpression
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
                    // InternalSelfCheckoutExperience.g:717:2: ( ruleRealLiteral )
                    {
                    // InternalSelfCheckoutExperience.g:717:2: ( ruleRealLiteral )
                    // InternalSelfCheckoutExperience.g:718:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSelfCheckoutExperience.g:723:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalSelfCheckoutExperience.g:723:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalSelfCheckoutExperience.g:724:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalSelfCheckoutExperience.g:725:3: ( rule__Primary__Group_3__0 )
                    // InternalSelfCheckoutExperience.g:725:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

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
    // InternalSelfCheckoutExperience.g:733:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:737:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:738:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:738:2: ( ( 'forward' ) )
                    // InternalSelfCheckoutExperience.g:739:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:740:3: ( 'forward' )
                    // InternalSelfCheckoutExperience.g:740:4: 'forward'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:744:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckoutExperience.g:744:2: ( ( 'backward' ) )
                    // InternalSelfCheckoutExperience.g:745:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:746:3: ( 'backward' )
                    // InternalSelfCheckoutExperience.g:746:4: 'backward'
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
    // InternalSelfCheckoutExperience.g:754:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:758:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalSelfCheckoutExperience.g:759:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckoutExperience.g:759:2: ( ( 'left' ) )
                    // InternalSelfCheckoutExperience.g:760:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckoutExperience.g:761:3: ( 'left' )
                    // InternalSelfCheckoutExperience.g:761:4: 'left'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckoutExperience.g:765:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckoutExperience.g:765:2: ( ( 'right' ) )
                    // InternalSelfCheckoutExperience.g:766:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckoutExperience.g:767:3: ( 'right' )
                    // InternalSelfCheckoutExperience.g:767:4: 'right'
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
    // InternalSelfCheckoutExperience.g:775:1: rule__Self_checkout__Group__0 : rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 ;
    public final void rule__Self_checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:779:1: ( rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:780:2: rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1
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
    // InternalSelfCheckoutExperience.g:787:1: rule__Self_checkout__Group__0__Impl : ( ( rule__Self_checkout__Alternatives_0 )* ) ;
    public final void rule__Self_checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:791:1: ( ( ( rule__Self_checkout__Alternatives_0 )* ) )
            // InternalSelfCheckoutExperience.g:792:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            {
            // InternalSelfCheckoutExperience.g:792:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            // InternalSelfCheckoutExperience.g:793:2: ( rule__Self_checkout__Alternatives_0 )*
            {
             before(grammarAccess.getSelf_checkoutAccess().getAlternatives_0()); 
            // InternalSelfCheckoutExperience.g:794:2: ( rule__Self_checkout__Alternatives_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=16 && LA9_0<=17)||LA9_0==20||LA9_0==26||LA9_0==31||LA9_0==33||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:794:3: rule__Self_checkout__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Self_checkout__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSelfCheckoutExperience.g:802:1: rule__Self_checkout__Group__1 : rule__Self_checkout__Group__1__Impl ;
    public final void rule__Self_checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:806:1: ( rule__Self_checkout__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:807:2: rule__Self_checkout__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:813:1: rule__Self_checkout__Group__1__Impl : ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) ;
    public final void rule__Self_checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:817:1: ( ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) )
            // InternalSelfCheckoutExperience.g:818:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            {
            // InternalSelfCheckoutExperience.g:818:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            // InternalSelfCheckoutExperience.g:819:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_1()); 
            // InternalSelfCheckoutExperience.g:820:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:820:3: rule__Self_checkout__CheckoutAssignment_1
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
    // InternalSelfCheckoutExperience.g:829:1: rule__PickStatement__Group__0 : rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 ;
    public final void rule__PickStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:833:1: ( rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:834:2: rule__PickStatement__Group__0__Impl rule__PickStatement__Group__1
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
    // InternalSelfCheckoutExperience.g:841:1: rule__PickStatement__Group__0__Impl : ( 'pick' ) ;
    public final void rule__PickStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:845:1: ( ( 'pick' ) )
            // InternalSelfCheckoutExperience.g:846:1: ( 'pick' )
            {
            // InternalSelfCheckoutExperience.g:846:1: ( 'pick' )
            // InternalSelfCheckoutExperience.g:847:2: 'pick'
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
    // InternalSelfCheckoutExperience.g:856:1: rule__PickStatement__Group__1 : rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 ;
    public final void rule__PickStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:860:1: ( rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:861:2: rule__PickStatement__Group__1__Impl rule__PickStatement__Group__2
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
    // InternalSelfCheckoutExperience.g:868:1: rule__PickStatement__Group__1__Impl : ( 'up' ) ;
    public final void rule__PickStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:872:1: ( ( 'up' ) )
            // InternalSelfCheckoutExperience.g:873:1: ( 'up' )
            {
            // InternalSelfCheckoutExperience.g:873:1: ( 'up' )
            // InternalSelfCheckoutExperience.g:874:2: 'up'
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
    // InternalSelfCheckoutExperience.g:883:1: rule__PickStatement__Group__2 : rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 ;
    public final void rule__PickStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:887:1: ( rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:888:2: rule__PickStatement__Group__2__Impl rule__PickStatement__Group__3
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
    // InternalSelfCheckoutExperience.g:895:1: rule__PickStatement__Group__2__Impl : ( ( rule__PickStatement__ItemCountAssignment_2 ) ) ;
    public final void rule__PickStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:899:1: ( ( ( rule__PickStatement__ItemCountAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:900:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:900:1: ( ( rule__PickStatement__ItemCountAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:901:2: ( rule__PickStatement__ItemCountAssignment_2 )
            {
             before(grammarAccess.getPickStatementAccess().getItemCountAssignment_2()); 
            // InternalSelfCheckoutExperience.g:902:2: ( rule__PickStatement__ItemCountAssignment_2 )
            // InternalSelfCheckoutExperience.g:902:3: rule__PickStatement__ItemCountAssignment_2
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
    // InternalSelfCheckoutExperience.g:910:1: rule__PickStatement__Group__3 : rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 ;
    public final void rule__PickStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:914:1: ( rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:915:2: rule__PickStatement__Group__3__Impl rule__PickStatement__Group__4
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
    // InternalSelfCheckoutExperience.g:922:1: rule__PickStatement__Group__3__Impl : ( ( rule__PickStatement__NameAssignment_3 ) ) ;
    public final void rule__PickStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:926:1: ( ( ( rule__PickStatement__NameAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:927:1: ( ( rule__PickStatement__NameAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:927:1: ( ( rule__PickStatement__NameAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:928:2: ( rule__PickStatement__NameAssignment_3 )
            {
             before(grammarAccess.getPickStatementAccess().getNameAssignment_3()); 
            // InternalSelfCheckoutExperience.g:929:2: ( rule__PickStatement__NameAssignment_3 )
            // InternalSelfCheckoutExperience.g:929:3: rule__PickStatement__NameAssignment_3
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
    // InternalSelfCheckoutExperience.g:937:1: rule__PickStatement__Group__4 : rule__PickStatement__Group__4__Impl ;
    public final void rule__PickStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:941:1: ( rule__PickStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:942:2: rule__PickStatement__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:948:1: rule__PickStatement__Group__4__Impl : ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) ;
    public final void rule__PickStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:952:1: ( ( ( rule__PickStatement__HoldingItemAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:953:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:953:1: ( ( rule__PickStatement__HoldingItemAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:954:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_4()); 
            // InternalSelfCheckoutExperience.g:955:2: ( rule__PickStatement__HoldingItemAssignment_4 )
            // InternalSelfCheckoutExperience.g:955:3: rule__PickStatement__HoldingItemAssignment_4
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
    // InternalSelfCheckoutExperience.g:964:1: rule__AddToBasket__Group__0 : rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 ;
    public final void rule__AddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:968:1: ( rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 )
            // InternalSelfCheckoutExperience.g:969:2: rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1
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
    // InternalSelfCheckoutExperience.g:976:1: rule__AddToBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:980:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:981:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:981:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:982:2: 'add'
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
    // InternalSelfCheckoutExperience.g:991:1: rule__AddToBasket__Group__1 : rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 ;
    public final void rule__AddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:995:1: ( rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 )
            // InternalSelfCheckoutExperience.g:996:2: rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2
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
    // InternalSelfCheckoutExperience.g:1003:1: rule__AddToBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1007:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:1008:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:1008:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:1009:2: 'to'
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
    // InternalSelfCheckoutExperience.g:1018:1: rule__AddToBasket__Group__2 : rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 ;
    public final void rule__AddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1022:1: ( rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 )
            // InternalSelfCheckoutExperience.g:1023:2: rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3
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
    // InternalSelfCheckoutExperience.g:1030:1: rule__AddToBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1034:1: ( ( 'basket' ) )
            // InternalSelfCheckoutExperience.g:1035:1: ( 'basket' )
            {
            // InternalSelfCheckoutExperience.g:1035:1: ( 'basket' )
            // InternalSelfCheckoutExperience.g:1036:2: 'basket'
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
    // InternalSelfCheckoutExperience.g:1045:1: rule__AddToBasket__Group__3 : rule__AddToBasket__Group__3__Impl ;
    public final void rule__AddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1049:1: ( rule__AddToBasket__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1050:2: rule__AddToBasket__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1056:1: rule__AddToBasket__Group__3__Impl : ( ( rule__AddToBasket__ItemAssignment_3 ) ) ;
    public final void rule__AddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1060:1: ( ( ( rule__AddToBasket__ItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1061:1: ( ( rule__AddToBasket__ItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1061:1: ( ( rule__AddToBasket__ItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1062:2: ( rule__AddToBasket__ItemAssignment_3 )
            {
             before(grammarAccess.getAddToBasketAccess().getItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1063:2: ( rule__AddToBasket__ItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:1063:3: rule__AddToBasket__ItemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddToBasket__ItemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddToBasketAccess().getItemAssignment_3()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1072:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1076:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckoutExperience.g:1077:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalSelfCheckoutExperience.g:1084:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1088:1: ( ( 'drop' ) )
            // InternalSelfCheckoutExperience.g:1089:1: ( 'drop' )
            {
            // InternalSelfCheckoutExperience.g:1089:1: ( 'drop' )
            // InternalSelfCheckoutExperience.g:1090:2: 'drop'
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
    // InternalSelfCheckoutExperience.g:1099:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1103:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1104:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1110:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1114:1: ( ( ( rule__Drop__ItemAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1115:1: ( ( rule__Drop__ItemAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1115:1: ( ( rule__Drop__ItemAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1116:2: ( rule__Drop__ItemAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1117:2: ( rule__Drop__ItemAssignment_1 )
            // InternalSelfCheckoutExperience.g:1117:3: rule__Drop__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Drop__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getItemAssignment_1()); 

            }


            }

        }
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
    // InternalSelfCheckoutExperience.g:1126:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1130:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckoutExperience.g:1131:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalSelfCheckoutExperience.g:1138:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1142:1: ( ( 'var' ) )
            // InternalSelfCheckoutExperience.g:1143:1: ( 'var' )
            {
            // InternalSelfCheckoutExperience.g:1143:1: ( 'var' )
            // InternalSelfCheckoutExperience.g:1144:2: 'var'
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
    // InternalSelfCheckoutExperience.g:1153:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1157:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckoutExperience.g:1158:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
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
    // InternalSelfCheckoutExperience.g:1165:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1169:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1170:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1170:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1171:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1172:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckoutExperience.g:1172:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckoutExperience.g:1180:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1184:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckoutExperience.g:1185:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
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
    // InternalSelfCheckoutExperience.g:1192:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1196:1: ( ( '=' ) )
            // InternalSelfCheckoutExperience.g:1197:1: ( '=' )
            {
            // InternalSelfCheckoutExperience.g:1197:1: ( '=' )
            // InternalSelfCheckoutExperience.g:1198:2: '='
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
    // InternalSelfCheckoutExperience.g:1207:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1211:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1212:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1218:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1222:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1223:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1223:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1224:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1225:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckoutExperience.g:1225:3: rule__VariableDeclaration__ValueAssignment_3
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


    // $ANTLR start "rule__LoopStatement__Group__0"
    // InternalSelfCheckoutExperience.g:1234:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1238:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1239:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LoopStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0"


    // $ANTLR start "rule__LoopStatement__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1246:1: rule__LoopStatement__Group__0__Impl : ( ( rule__LoopStatement__CountAssignment_0 ) ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1250:1: ( ( ( rule__LoopStatement__CountAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1251:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1251:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1252:2: ( rule__LoopStatement__CountAssignment_0 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1253:2: ( rule__LoopStatement__CountAssignment_0 )
            // InternalSelfCheckoutExperience.g:1253:3: rule__LoopStatement__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0__Impl"


    // $ANTLR start "rule__LoopStatement__Group__1"
    // InternalSelfCheckoutExperience.g:1261:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1265:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1266:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__LoopStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1"


    // $ANTLR start "rule__LoopStatement__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:1273:1: rule__LoopStatement__Group__1__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1277:1: ( ( 'times' ) )
            // InternalSelfCheckoutExperience.g:1278:1: ( 'times' )
            {
            // InternalSelfCheckoutExperience.g:1278:1: ( 'times' )
            // InternalSelfCheckoutExperience.g:1279:2: 'times'
            {
             before(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getTimesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1__Impl"


    // $ANTLR start "rule__LoopStatement__Group__2"
    // InternalSelfCheckoutExperience.g:1288:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1292:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1293:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__LoopStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2"


    // $ANTLR start "rule__LoopStatement__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1300:1: rule__LoopStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1304:1: ( ( 'do' ) )
            // InternalSelfCheckoutExperience.g:1305:1: ( 'do' )
            {
            // InternalSelfCheckoutExperience.g:1305:1: ( 'do' )
            // InternalSelfCheckoutExperience.g:1306:2: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2__Impl"


    // $ANTLR start "rule__LoopStatement__Group__3"
    // InternalSelfCheckoutExperience.g:1315:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1319:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:1320:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__LoopStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3"


    // $ANTLR start "rule__LoopStatement__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1327:1: rule__LoopStatement__Group__3__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1331:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:1332:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:1332:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:1333:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:1333:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1334:3: ( rule__LoopStatement__StatementsAssignment_3 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1335:3: ( rule__LoopStatement__StatementsAssignment_3 )
            // InternalSelfCheckoutExperience.g:1335:4: rule__LoopStatement__StatementsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__LoopStatement__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:1338:2: ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:1339:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1340:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||(LA11_0>=16 && LA11_0<=17)||LA11_0==26||LA11_0==31||LA11_0==33||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1340:4: rule__LoopStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LoopStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__LoopStatement__Group__3__Impl"


    // $ANTLR start "rule__LoopStatement__Group__4"
    // InternalSelfCheckoutExperience.g:1349:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1353:1: ( rule__LoopStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1354:2: rule__LoopStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4"


    // $ANTLR start "rule__LoopStatement__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:1360:1: rule__LoopStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1364:1: ( ( 'end' ) )
            // InternalSelfCheckoutExperience.g:1365:1: ( 'end' )
            {
            // InternalSelfCheckoutExperience.g:1365:1: ( 'end' )
            // InternalSelfCheckoutExperience.g:1366:2: 'end'
            {
             before(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopStatementAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4__Impl"


    // $ANTLR start "rule__MoveStatement__Group__0"
    // InternalSelfCheckoutExperience.g:1376:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1380:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1381:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckoutExperience.g:1388:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1392:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckoutExperience.g:1393:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckoutExperience.g:1393:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckoutExperience.g:1394:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckoutExperience.g:1395:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckoutExperience.g:1395:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckoutExperience.g:1403:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1407:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1408:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
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
    // InternalSelfCheckoutExperience.g:1415:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1419:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1420:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1420:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1421:2: '('
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
    // InternalSelfCheckoutExperience.g:1430:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1434:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1435:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSelfCheckoutExperience.g:1442:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1446:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckoutExperience.g:1447:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1447:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckoutExperience.g:1448:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckoutExperience.g:1449:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckoutExperience.g:1449:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckoutExperience.g:1457:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1461:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:1462:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:1468:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1472:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1473:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1473:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1474:2: ')'
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
    // InternalSelfCheckoutExperience.g:1484:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1488:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckoutExperience.g:1489:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSelfCheckoutExperience.g:1496:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1500:1: ( ( 'turn' ) )
            // InternalSelfCheckoutExperience.g:1501:1: ( 'turn' )
            {
            // InternalSelfCheckoutExperience.g:1501:1: ( 'turn' )
            // InternalSelfCheckoutExperience.g:1502:2: 'turn'
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
    // InternalSelfCheckoutExperience.g:1511:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1515:1: ( rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 )
            // InternalSelfCheckoutExperience.g:1516:2: rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__TurnStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSelfCheckoutExperience.g:1523:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1527:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckoutExperience.g:1528:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1528:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckoutExperience.g:1529:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckoutExperience.g:1530:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckoutExperience.g:1530:3: rule__TurnStatement__CommandAssignment_1
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


    // $ANTLR start "rule__TurnStatement__Group__2"
    // InternalSelfCheckoutExperience.g:1538:1: rule__TurnStatement__Group__2 : rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 ;
    public final void rule__TurnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1542:1: ( rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 )
            // InternalSelfCheckoutExperience.g:1543:2: rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TurnStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__2"


    // $ANTLR start "rule__TurnStatement__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:1550:1: rule__TurnStatement__Group__2__Impl : ( 'by' ) ;
    public final void rule__TurnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1554:1: ( ( 'by' ) )
            // InternalSelfCheckoutExperience.g:1555:1: ( 'by' )
            {
            // InternalSelfCheckoutExperience.g:1555:1: ( 'by' )
            // InternalSelfCheckoutExperience.g:1556:2: 'by'
            {
             before(grammarAccess.getTurnStatementAccess().getByKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__2__Impl"


    // $ANTLR start "rule__TurnStatement__Group__3"
    // InternalSelfCheckoutExperience.g:1565:1: rule__TurnStatement__Group__3 : rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 ;
    public final void rule__TurnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1569:1: ( rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 )
            // InternalSelfCheckoutExperience.g:1570:2: rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TurnStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__3"


    // $ANTLR start "rule__TurnStatement__Group__3__Impl"
    // InternalSelfCheckoutExperience.g:1577:1: rule__TurnStatement__Group__3__Impl : ( ( rule__TurnStatement__DegreesAssignment_3 ) ) ;
    public final void rule__TurnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1581:1: ( ( ( rule__TurnStatement__DegreesAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:1582:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:1582:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:1583:2: ( rule__TurnStatement__DegreesAssignment_3 )
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); 
            // InternalSelfCheckoutExperience.g:1584:2: ( rule__TurnStatement__DegreesAssignment_3 )
            // InternalSelfCheckoutExperience.g:1584:3: rule__TurnStatement__DegreesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__DegreesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__3__Impl"


    // $ANTLR start "rule__TurnStatement__Group__4"
    // InternalSelfCheckoutExperience.g:1592:1: rule__TurnStatement__Group__4 : rule__TurnStatement__Group__4__Impl ;
    public final void rule__TurnStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1596:1: ( rule__TurnStatement__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:1597:2: rule__TurnStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__4"


    // $ANTLR start "rule__TurnStatement__Group__4__Impl"
    // InternalSelfCheckoutExperience.g:1603:1: rule__TurnStatement__Group__4__Impl : ( 'degrees' ) ;
    public final void rule__TurnStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1607:1: ( ( 'degrees' ) )
            // InternalSelfCheckoutExperience.g:1608:1: ( 'degrees' )
            {
            // InternalSelfCheckoutExperience.g:1608:1: ( 'degrees' )
            // InternalSelfCheckoutExperience.g:1609:2: 'degrees'
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTurnStatementAccess().getDegreesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalSelfCheckoutExperience.g:1619:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1623:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckoutExperience.g:1624:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalSelfCheckoutExperience.g:1631:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1635:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:1636:1: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:1636:1: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:1637:2: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:1646:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1650:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1651:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1657:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1661:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1662:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1662:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1663:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1664:2: ( rule__Addition__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1664:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSelfCheckoutExperience.g:1673:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1677:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1678:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalSelfCheckoutExperience.g:1685:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1689:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1690:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1690:1: ( () )
            // InternalSelfCheckoutExperience.g:1691:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1692:2: ()
            // InternalSelfCheckoutExperience.g:1692:3: 
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
    // InternalSelfCheckoutExperience.g:1700:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1704:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1705:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
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
    // InternalSelfCheckoutExperience.g:1712:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1716:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1717:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1717:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1718:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1719:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1719:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1727:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1731:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1732:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1738:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1742:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1743:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1743:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1744:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1745:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1745:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckoutExperience.g:1754:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1758:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckoutExperience.g:1759:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalSelfCheckoutExperience.g:1766:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1770:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:1771:1: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:1771:1: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:1772:2: rulePrimary
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
    // InternalSelfCheckoutExperience.g:1781:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1785:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckoutExperience.g:1786:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckoutExperience.g:1792:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1796:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckoutExperience.g:1797:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckoutExperience.g:1797:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckoutExperience.g:1798:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckoutExperience.g:1799:2: ( rule__Multiplication__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:1799:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSelfCheckoutExperience.g:1808:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1812:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckoutExperience.g:1813:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalSelfCheckoutExperience.g:1820:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1824:1: ( ( () ) )
            // InternalSelfCheckoutExperience.g:1825:1: ( () )
            {
            // InternalSelfCheckoutExperience.g:1825:1: ( () )
            // InternalSelfCheckoutExperience.g:1826:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckoutExperience.g:1827:2: ()
            // InternalSelfCheckoutExperience.g:1827:3: 
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
    // InternalSelfCheckoutExperience.g:1835:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1839:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckoutExperience.g:1840:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
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
    // InternalSelfCheckoutExperience.g:1847:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1851:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckoutExperience.g:1852:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckoutExperience.g:1852:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckoutExperience.g:1853:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckoutExperience.g:1854:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckoutExperience.g:1854:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckoutExperience.g:1862:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1866:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckoutExperience.g:1867:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckoutExperience.g:1873:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1877:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckoutExperience.g:1878:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckoutExperience.g:1878:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckoutExperience.g:1879:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckoutExperience.g:1880:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckoutExperience.g:1880:3: rule__Multiplication__RightAssignment_1_2
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


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalSelfCheckoutExperience.g:1889:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1893:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalSelfCheckoutExperience.g:1894:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalSelfCheckoutExperience.g:1901:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1905:1: ( ( '(' ) )
            // InternalSelfCheckoutExperience.g:1906:1: ( '(' )
            {
            // InternalSelfCheckoutExperience.g:1906:1: ( '(' )
            // InternalSelfCheckoutExperience.g:1907:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalSelfCheckoutExperience.g:1916:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1920:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalSelfCheckoutExperience.g:1921:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalSelfCheckoutExperience.g:1928:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1932:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:1933:1: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:1933:1: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:1934:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalSelfCheckoutExperience.g:1943:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1947:1: ( rule__Primary__Group_3__2__Impl )
            // InternalSelfCheckoutExperience.g:1948:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalSelfCheckoutExperience.g:1954:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1958:1: ( ( ')' ) )
            // InternalSelfCheckoutExperience.g:1959:1: ( ')' )
            {
            // InternalSelfCheckoutExperience.g:1959:1: ( ')' )
            // InternalSelfCheckoutExperience.g:1960:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalSelfCheckoutExperience.g:1970:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1974:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSelfCheckoutExperience.g:1975:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalSelfCheckoutExperience.g:1982:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:1986:1: ( ( ( RULE_INT )? ) )
            // InternalSelfCheckoutExperience.g:1987:1: ( ( RULE_INT )? )
            {
            // InternalSelfCheckoutExperience.g:1987:1: ( ( RULE_INT )? )
            // InternalSelfCheckoutExperience.g:1988:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalSelfCheckoutExperience.g:1989:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelfCheckoutExperience.g:1989:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalSelfCheckoutExperience.g:1997:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2001:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSelfCheckoutExperience.g:2002:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalSelfCheckoutExperience.g:2009:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2013:1: ( ( '.' ) )
            // InternalSelfCheckoutExperience.g:2014:1: ( '.' )
            {
            // InternalSelfCheckoutExperience.g:2014:1: ( '.' )
            // InternalSelfCheckoutExperience.g:2015:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalSelfCheckoutExperience.g:2024:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2028:1: ( rule__REAL__Group__2__Impl )
            // InternalSelfCheckoutExperience.g:2029:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalSelfCheckoutExperience.g:2035:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2039:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2040:1: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2040:1: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2041:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__Checkout__Group__0"
    // InternalSelfCheckoutExperience.g:2051:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2055:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckoutExperience.g:2056:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
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
    // InternalSelfCheckoutExperience.g:2063:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2067:1: ( ( 'go' ) )
            // InternalSelfCheckoutExperience.g:2068:1: ( 'go' )
            {
            // InternalSelfCheckoutExperience.g:2068:1: ( 'go' )
            // InternalSelfCheckoutExperience.g:2069:2: 'go'
            {
             before(grammarAccess.getCheckoutAccess().getGoKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2078:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2082:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckoutExperience.g:2083:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2090:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2094:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2095:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2095:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2096:2: 'to'
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
    // InternalSelfCheckoutExperience.g:2105:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2109:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckoutExperience.g:2110:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSelfCheckoutExperience.g:2117:1: rule__Checkout__Group__2__Impl : ( 'till' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2121:1: ( ( 'till' ) )
            // InternalSelfCheckoutExperience.g:2122:1: ( 'till' )
            {
            // InternalSelfCheckoutExperience.g:2122:1: ( 'till' )
            // InternalSelfCheckoutExperience.g:2123:2: 'till'
            {
             before(grammarAccess.getCheckoutAccess().getTillKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2132:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2136:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckoutExperience.g:2137:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSelfCheckoutExperience.g:2144:1: rule__Checkout__Group__3__Impl : ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2148:1: ( ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) )
            // InternalSelfCheckoutExperience.g:2149:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            {
            // InternalSelfCheckoutExperience.g:2149:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            // InternalSelfCheckoutExperience.g:2150:2: ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* )
            {
            // InternalSelfCheckoutExperience.g:2150:2: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2151:3: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2152:3: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckoutExperience.g:2152:4: rule__Checkout__ScanAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__Checkout__ScanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 

            }

            // InternalSelfCheckoutExperience.g:2155:2: ( ( rule__Checkout__ScanAssignment_3 )* )
            // InternalSelfCheckoutExperience.g:2156:3: ( rule__Checkout__ScanAssignment_3 )*
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2157:3: ( rule__Checkout__ScanAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2157:4: rule__Checkout__ScanAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
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
    // InternalSelfCheckoutExperience.g:2166:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2170:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2171:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2177:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2181:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckoutExperience.g:2182:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckoutExperience.g:2182:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckoutExperience.g:2183:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2184:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckoutExperience.g:2184:3: rule__Checkout__PayAssignment_4
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
    // InternalSelfCheckoutExperience.g:2193:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2197:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckoutExperience.g:2198:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSelfCheckoutExperience.g:2205:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2209:1: ( ( 'scan' ) )
            // InternalSelfCheckoutExperience.g:2210:1: ( 'scan' )
            {
            // InternalSelfCheckoutExperience.g:2210:1: ( 'scan' )
            // InternalSelfCheckoutExperience.g:2211:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2220:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2224:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckoutExperience.g:2225:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSelfCheckoutExperience.g:2232:1: rule__Scan__Group__1__Impl : ( 'at' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2236:1: ( ( 'at' ) )
            // InternalSelfCheckoutExperience.g:2237:1: ( 'at' )
            {
            // InternalSelfCheckoutExperience.g:2237:1: ( 'at' )
            // InternalSelfCheckoutExperience.g:2238:2: 'at'
            {
             before(grammarAccess.getScanAccess().getAtKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2247:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2251:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckoutExperience.g:2252:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
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
    // InternalSelfCheckoutExperience.g:2259:1: rule__Scan__Group__2__Impl : ( 'till' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2263:1: ( ( 'till' ) )
            // InternalSelfCheckoutExperience.g:2264:1: ( 'till' )
            {
            // InternalSelfCheckoutExperience.g:2264:1: ( 'till' )
            // InternalSelfCheckoutExperience.g:2265:2: 'till'
            {
             before(grammarAccess.getScanAccess().getTillKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2274:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl rule__Scan__Group__4 ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2278:1: ( rule__Scan__Group__3__Impl rule__Scan__Group__4 )
            // InternalSelfCheckoutExperience.g:2279:2: rule__Scan__Group__3__Impl rule__Scan__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalSelfCheckoutExperience.g:2286:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__NameAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2290:1: ( ( ( rule__Scan__NameAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2291:1: ( ( rule__Scan__NameAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2291:1: ( ( rule__Scan__NameAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2292:2: ( rule__Scan__NameAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getNameAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2293:2: ( rule__Scan__NameAssignment_3 )
            // InternalSelfCheckoutExperience.g:2293:3: rule__Scan__NameAssignment_3
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
    // InternalSelfCheckoutExperience.g:2301:1: rule__Scan__Group__4 : rule__Scan__Group__4__Impl ;
    public final void rule__Scan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2305:1: ( rule__Scan__Group__4__Impl )
            // InternalSelfCheckoutExperience.g:2306:2: rule__Scan__Group__4__Impl
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
    // InternalSelfCheckoutExperience.g:2312:1: rule__Scan__Group__4__Impl : ( ( rule__Scan__AddToBagAssignment_4 )* ) ;
    public final void rule__Scan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2316:1: ( ( ( rule__Scan__AddToBagAssignment_4 )* ) )
            // InternalSelfCheckoutExperience.g:2317:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            {
            // InternalSelfCheckoutExperience.g:2317:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            // InternalSelfCheckoutExperience.g:2318:2: ( rule__Scan__AddToBagAssignment_4 )*
            {
             before(grammarAccess.getScanAccess().getAddToBagAssignment_4()); 
            // InternalSelfCheckoutExperience.g:2319:2: ( rule__Scan__AddToBagAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSelfCheckoutExperience.g:2319:3: rule__Scan__AddToBagAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalSelfCheckoutExperience.g:2328:1: rule__AddToBag__Group__0 : rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 ;
    public final void rule__AddToBag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2332:1: ( rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 )
            // InternalSelfCheckoutExperience.g:2333:2: rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1
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
    // InternalSelfCheckoutExperience.g:2340:1: rule__AddToBag__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2344:1: ( ( 'add' ) )
            // InternalSelfCheckoutExperience.g:2345:1: ( 'add' )
            {
            // InternalSelfCheckoutExperience.g:2345:1: ( 'add' )
            // InternalSelfCheckoutExperience.g:2346:2: 'add'
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
    // InternalSelfCheckoutExperience.g:2355:1: rule__AddToBag__Group__1 : rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 ;
    public final void rule__AddToBag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2359:1: ( rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 )
            // InternalSelfCheckoutExperience.g:2360:2: rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSelfCheckoutExperience.g:2367:1: rule__AddToBag__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2371:1: ( ( 'to' ) )
            // InternalSelfCheckoutExperience.g:2372:1: ( 'to' )
            {
            // InternalSelfCheckoutExperience.g:2372:1: ( 'to' )
            // InternalSelfCheckoutExperience.g:2373:2: 'to'
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
    // InternalSelfCheckoutExperience.g:2382:1: rule__AddToBag__Group__2 : rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 ;
    public final void rule__AddToBag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2386:1: ( rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 )
            // InternalSelfCheckoutExperience.g:2387:2: rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3
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
    // InternalSelfCheckoutExperience.g:2394:1: rule__AddToBag__Group__2__Impl : ( 'bag' ) ;
    public final void rule__AddToBag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2398:1: ( ( 'bag' ) )
            // InternalSelfCheckoutExperience.g:2399:1: ( 'bag' )
            {
            // InternalSelfCheckoutExperience.g:2399:1: ( 'bag' )
            // InternalSelfCheckoutExperience.g:2400:2: 'bag'
            {
             before(grammarAccess.getAddToBagAccess().getBagKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSelfCheckoutExperience.g:2409:1: rule__AddToBag__Group__3 : rule__AddToBag__Group__3__Impl ;
    public final void rule__AddToBag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2413:1: ( rule__AddToBag__Group__3__Impl )
            // InternalSelfCheckoutExperience.g:2414:2: rule__AddToBag__Group__3__Impl
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
    // InternalSelfCheckoutExperience.g:2420:1: rule__AddToBag__Group__3__Impl : ( ( rule__AddToBag__BagItemAssignment_3 ) ) ;
    public final void rule__AddToBag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2424:1: ( ( ( rule__AddToBag__BagItemAssignment_3 ) ) )
            // InternalSelfCheckoutExperience.g:2425:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            {
            // InternalSelfCheckoutExperience.g:2425:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            // InternalSelfCheckoutExperience.g:2426:2: ( rule__AddToBag__BagItemAssignment_3 )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemAssignment_3()); 
            // InternalSelfCheckoutExperience.g:2427:2: ( rule__AddToBag__BagItemAssignment_3 )
            // InternalSelfCheckoutExperience.g:2427:3: rule__AddToBag__BagItemAssignment_3
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


    // $ANTLR start "rule__Self_checkout__PickstatemensAssignment_0_0"
    // InternalSelfCheckoutExperience.g:2436:1: rule__Self_checkout__PickstatemensAssignment_0_0 : ( rulePickStatement ) ;
    public final void rule__Self_checkout__PickstatemensAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2440:1: ( ( rulePickStatement ) )
            // InternalSelfCheckoutExperience.g:2441:2: ( rulePickStatement )
            {
            // InternalSelfCheckoutExperience.g:2441:2: ( rulePickStatement )
            // InternalSelfCheckoutExperience.g:2442:3: rulePickStatement
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickstatemensPickStatementParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePickStatement();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getPickstatemensPickStatementParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__PickstatemensAssignment_0_0"


    // $ANTLR start "rule__Self_checkout__WalkstatementsAssignment_0_1"
    // InternalSelfCheckoutExperience.g:2451:1: rule__Self_checkout__WalkstatementsAssignment_0_1 : ( ruleWalkStatement ) ;
    public final void rule__Self_checkout__WalkstatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2455:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckoutExperience.g:2456:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckoutExperience.g:2456:2: ( ruleWalkStatement )
            // InternalSelfCheckoutExperience.g:2457:3: ruleWalkStatement
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
    // InternalSelfCheckoutExperience.g:2466:1: rule__Self_checkout__CheckoutAssignment_1 : ( ruleCheckout ) ;
    public final void rule__Self_checkout__CheckoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2470:1: ( ( ruleCheckout ) )
            // InternalSelfCheckoutExperience.g:2471:2: ( ruleCheckout )
            {
            // InternalSelfCheckoutExperience.g:2471:2: ( ruleCheckout )
            // InternalSelfCheckoutExperience.g:2472:3: ruleCheckout
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
    // InternalSelfCheckoutExperience.g:2481:1: rule__PickStatement__ItemCountAssignment_2 : ( ruleAddition ) ;
    public final void rule__PickStatement__ItemCountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2485:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2486:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2486:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2487:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2496:1: rule__PickStatement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PickStatement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2500:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2501:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2501:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2502:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2511:1: rule__PickStatement__HoldingItemAssignment_4 : ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) ;
    public final void rule__PickStatement__HoldingItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2515:1: ( ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) ) )
            // InternalSelfCheckoutExperience.g:2516:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2516:2: ( ( rule__PickStatement__HoldingItemAlternatives_4_0 ) )
            // InternalSelfCheckoutExperience.g:2517:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            {
             before(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_4_0()); 
            // InternalSelfCheckoutExperience.g:2518:3: ( rule__PickStatement__HoldingItemAlternatives_4_0 )
            // InternalSelfCheckoutExperience.g:2518:4: rule__PickStatement__HoldingItemAlternatives_4_0
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


    // $ANTLR start "rule__AddToBasket__ItemAssignment_3"
    // InternalSelfCheckoutExperience.g:2526:1: rule__AddToBasket__ItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBasket__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2530:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2531:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2531:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2532:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBasketAccess().getItemPickStatementCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:2533:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2534:4: RULE_ID
            {
             before(grammarAccess.getAddToBasketAccess().getItemPickStatementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getItemPickStatementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddToBasketAccess().getItemPickStatementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToBasket__ItemAssignment_3"


    // $ANTLR start "rule__Drop__ItemAssignment_1"
    // InternalSelfCheckoutExperience.g:2545:1: rule__Drop__ItemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2549:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2550:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2550:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2551:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemPickStatementCrossReference_1_0()); 
            // InternalSelfCheckoutExperience.g:2552:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2553:4: RULE_ID
            {
             before(grammarAccess.getDropAccess().getItemPickStatementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getItemPickStatementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDropAccess().getItemPickStatementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__ItemAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalSelfCheckoutExperience.g:2564:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2568:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2569:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2569:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2570:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2579:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2583:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2584:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2584:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2585:3: RULE_INT
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


    // $ANTLR start "rule__LoopStatement__CountAssignment_0"
    // InternalSelfCheckoutExperience.g:2594:1: rule__LoopStatement__CountAssignment_0 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2598:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2599:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2599:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2600:3: ruleAddition
            {
             before(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getCountAdditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__CountAssignment_0"


    // $ANTLR start "rule__LoopStatement__StatementsAssignment_3"
    // InternalSelfCheckoutExperience.g:2609:1: rule__LoopStatement__StatementsAssignment_3 : ( ruleWalkStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2613:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckoutExperience.g:2614:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckoutExperience.g:2614:2: ( ruleWalkStatement )
            // InternalSelfCheckoutExperience.g:2615:3: ruleWalkStatement
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsWalkStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWalkStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getStatementsWalkStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__StatementsAssignment_3"


    // $ANTLR start "rule__MoveStatement__CommandAssignment_0"
    // InternalSelfCheckoutExperience.g:2624:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2628:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckoutExperience.g:2629:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckoutExperience.g:2629:2: ( ruleMoveCommand )
            // InternalSelfCheckoutExperience.g:2630:3: ruleMoveCommand
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
    // InternalSelfCheckoutExperience.g:2639:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2643:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2644:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2644:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2645:3: ruleAddition
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
    // InternalSelfCheckoutExperience.g:2654:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2658:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckoutExperience.g:2659:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckoutExperience.g:2659:2: ( ruleTurnCommand )
            // InternalSelfCheckoutExperience.g:2660:3: ruleTurnCommand
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


    // $ANTLR start "rule__TurnStatement__DegreesAssignment_3"
    // InternalSelfCheckoutExperience.g:2669:1: rule__TurnStatement__DegreesAssignment_3 : ( ruleAddition ) ;
    public final void rule__TurnStatement__DegreesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2673:1: ( ( ruleAddition ) )
            // InternalSelfCheckoutExperience.g:2674:2: ( ruleAddition )
            {
            // InternalSelfCheckoutExperience.g:2674:2: ( ruleAddition )
            // InternalSelfCheckoutExperience.g:2675:3: ruleAddition
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getTurnStatementAccess().getDegreesAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnStatement__DegreesAssignment_3"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalSelfCheckoutExperience.g:2684:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2688:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2689:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2689:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2690:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2691:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2691:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2699:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2703:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckoutExperience.g:2704:2: ( ruleMultiplication )
            {
            // InternalSelfCheckoutExperience.g:2704:2: ( ruleMultiplication )
            // InternalSelfCheckoutExperience.g:2705:3: ruleMultiplication
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
    // InternalSelfCheckoutExperience.g:2714:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2718:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckoutExperience.g:2719:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckoutExperience.g:2719:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckoutExperience.g:2720:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckoutExperience.g:2721:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckoutExperience.g:2721:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckoutExperience.g:2729:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2733:1: ( ( rulePrimary ) )
            // InternalSelfCheckoutExperience.g:2734:2: ( rulePrimary )
            {
            // InternalSelfCheckoutExperience.g:2734:2: ( rulePrimary )
            // InternalSelfCheckoutExperience.g:2735:3: rulePrimary
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
    // InternalSelfCheckoutExperience.g:2744:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2748:1: ( ( RULE_INT ) )
            // InternalSelfCheckoutExperience.g:2749:2: ( RULE_INT )
            {
            // InternalSelfCheckoutExperience.g:2749:2: ( RULE_INT )
            // InternalSelfCheckoutExperience.g:2750:3: RULE_INT
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


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalSelfCheckoutExperience.g:2759:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2763:1: ( ( ruleREAL ) )
            // InternalSelfCheckoutExperience.g:2764:2: ( ruleREAL )
            {
            // InternalSelfCheckoutExperience.g:2764:2: ( ruleREAL )
            // InternalSelfCheckoutExperience.g:2765:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalSelfCheckoutExperience.g:2774:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2778:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2779:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2779:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2780:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckoutExperience.g:2781:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2782:4: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2793:1: rule__Checkout__ScanAssignment_3 : ( ruleScan ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2797:1: ( ( ruleScan ) )
            // InternalSelfCheckoutExperience.g:2798:2: ( ruleScan )
            {
            // InternalSelfCheckoutExperience.g:2798:2: ( ruleScan )
            // InternalSelfCheckoutExperience.g:2799:3: ruleScan
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
    // InternalSelfCheckoutExperience.g:2808:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2812:1: ( ( rulePay ) )
            // InternalSelfCheckoutExperience.g:2813:2: ( rulePay )
            {
            // InternalSelfCheckoutExperience.g:2813:2: ( rulePay )
            // InternalSelfCheckoutExperience.g:2814:3: rulePay
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
    // InternalSelfCheckoutExperience.g:2823:1: rule__Scan__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Scan__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2827:1: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2828:2: ( RULE_ID )
            {
            // InternalSelfCheckoutExperience.g:2828:2: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2829:3: RULE_ID
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
    // InternalSelfCheckoutExperience.g:2838:1: rule__Scan__AddToBagAssignment_4 : ( ruleAddToBag ) ;
    public final void rule__Scan__AddToBagAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2842:1: ( ( ruleAddToBag ) )
            // InternalSelfCheckoutExperience.g:2843:2: ( ruleAddToBag )
            {
            // InternalSelfCheckoutExperience.g:2843:2: ( ruleAddToBag )
            // InternalSelfCheckoutExperience.g:2844:3: ruleAddToBag
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
    // InternalSelfCheckoutExperience.g:2853:1: rule__AddToBag__BagItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBag__BagItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckoutExperience.g:2857:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckoutExperience.g:2858:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckoutExperience.g:2858:2: ( ( RULE_ID ) )
            // InternalSelfCheckoutExperience.g:2859:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemScanCrossReference_3_0()); 
            // InternalSelfCheckoutExperience.g:2860:3: ( RULE_ID )
            // InternalSelfCheckoutExperience.g:2861:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001284130032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001080000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001284130030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});

}