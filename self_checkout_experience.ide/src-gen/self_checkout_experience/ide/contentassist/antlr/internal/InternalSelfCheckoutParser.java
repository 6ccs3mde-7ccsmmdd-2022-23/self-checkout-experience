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
import self_checkout_experience.services.SelfCheckoutGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSelfCheckoutParser extends AbstractInternalContentAssistParser {
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


        public InternalSelfCheckoutParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSelfCheckoutParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSelfCheckoutParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSelfCheckout.g"; }


    	private SelfCheckoutGrammarAccess grammarAccess;

    	public void setGrammarAccess(SelfCheckoutGrammarAccess grammarAccess) {
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
    // InternalSelfCheckout.g:53:1: entryRuleSelf_checkout : ruleSelf_checkout EOF ;
    public final void entryRuleSelf_checkout() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:54:1: ( ruleSelf_checkout EOF )
            // InternalSelfCheckout.g:55:1: ruleSelf_checkout EOF
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
    // InternalSelfCheckout.g:62:1: ruleSelf_checkout : ( ( rule__Self_checkout__Group__0 ) ) ;
    public final void ruleSelf_checkout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:66:2: ( ( ( rule__Self_checkout__Group__0 ) ) )
            // InternalSelfCheckout.g:67:2: ( ( rule__Self_checkout__Group__0 ) )
            {
            // InternalSelfCheckout.g:67:2: ( ( rule__Self_checkout__Group__0 ) )
            // InternalSelfCheckout.g:68:3: ( rule__Self_checkout__Group__0 )
            {
             before(grammarAccess.getSelf_checkoutAccess().getGroup()); 
            // InternalSelfCheckout.g:69:3: ( rule__Self_checkout__Group__0 )
            // InternalSelfCheckout.g:69:4: rule__Self_checkout__Group__0
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


    // $ANTLR start "entryRuleChoose"
    // InternalSelfCheckout.g:78:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:79:1: ( ruleChoose EOF )
            // InternalSelfCheckout.g:80:1: ruleChoose EOF
            {
             before(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            ruleChoose();

            state._fsp--;

             after(grammarAccess.getChooseRule()); 
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
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalSelfCheckout.g:87:1: ruleChoose : ( ( rule__Choose__PickAssignment ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:91:2: ( ( ( rule__Choose__PickAssignment ) ) )
            // InternalSelfCheckout.g:92:2: ( ( rule__Choose__PickAssignment ) )
            {
            // InternalSelfCheckout.g:92:2: ( ( rule__Choose__PickAssignment ) )
            // InternalSelfCheckout.g:93:3: ( rule__Choose__PickAssignment )
            {
             before(grammarAccess.getChooseAccess().getPickAssignment()); 
            // InternalSelfCheckout.g:94:3: ( rule__Choose__PickAssignment )
            // InternalSelfCheckout.g:94:4: rule__Choose__PickAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Choose__PickAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getPickAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRulePick"
    // InternalSelfCheckout.g:103:1: entryRulePick : rulePick EOF ;
    public final void entryRulePick() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:104:1: ( rulePick EOF )
            // InternalSelfCheckout.g:105:1: rulePick EOF
            {
             before(grammarAccess.getPickRule()); 
            pushFollow(FOLLOW_1);
            rulePick();

            state._fsp--;

             after(grammarAccess.getPickRule()); 
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
    // $ANTLR end "entryRulePick"


    // $ANTLR start "rulePick"
    // InternalSelfCheckout.g:112:1: rulePick : ( ( rule__Pick__Group__0 ) ) ;
    public final void rulePick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:116:2: ( ( ( rule__Pick__Group__0 ) ) )
            // InternalSelfCheckout.g:117:2: ( ( rule__Pick__Group__0 ) )
            {
            // InternalSelfCheckout.g:117:2: ( ( rule__Pick__Group__0 ) )
            // InternalSelfCheckout.g:118:3: ( rule__Pick__Group__0 )
            {
             before(grammarAccess.getPickAccess().getGroup()); 
            // InternalSelfCheckout.g:119:3: ( rule__Pick__Group__0 )
            // InternalSelfCheckout.g:119:4: rule__Pick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePick"


    // $ANTLR start "entryRuleAddToBasket"
    // InternalSelfCheckout.g:128:1: entryRuleAddToBasket : ruleAddToBasket EOF ;
    public final void entryRuleAddToBasket() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:129:1: ( ruleAddToBasket EOF )
            // InternalSelfCheckout.g:130:1: ruleAddToBasket EOF
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
    // InternalSelfCheckout.g:137:1: ruleAddToBasket : ( ( rule__AddToBasket__Group__0 ) ) ;
    public final void ruleAddToBasket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:141:2: ( ( ( rule__AddToBasket__Group__0 ) ) )
            // InternalSelfCheckout.g:142:2: ( ( rule__AddToBasket__Group__0 ) )
            {
            // InternalSelfCheckout.g:142:2: ( ( rule__AddToBasket__Group__0 ) )
            // InternalSelfCheckout.g:143:3: ( rule__AddToBasket__Group__0 )
            {
             before(grammarAccess.getAddToBasketAccess().getGroup()); 
            // InternalSelfCheckout.g:144:3: ( rule__AddToBasket__Group__0 )
            // InternalSelfCheckout.g:144:4: rule__AddToBasket__Group__0
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
    // InternalSelfCheckout.g:153:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:154:1: ( ruleDrop EOF )
            // InternalSelfCheckout.g:155:1: ruleDrop EOF
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
    // InternalSelfCheckout.g:162:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:166:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalSelfCheckout.g:167:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalSelfCheckout.g:167:2: ( ( rule__Drop__Group__0 ) )
            // InternalSelfCheckout.g:168:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalSelfCheckout.g:169:3: ( rule__Drop__Group__0 )
            // InternalSelfCheckout.g:169:4: rule__Drop__Group__0
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
    // InternalSelfCheckout.g:178:1: entryRuleWalkStatement : ruleWalkStatement EOF ;
    public final void entryRuleWalkStatement() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:179:1: ( ruleWalkStatement EOF )
            // InternalSelfCheckout.g:180:1: ruleWalkStatement EOF
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
    // InternalSelfCheckout.g:187:1: ruleWalkStatement : ( ( rule__WalkStatement__Alternatives ) ) ;
    public final void ruleWalkStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:191:2: ( ( ( rule__WalkStatement__Alternatives ) ) )
            // InternalSelfCheckout.g:192:2: ( ( rule__WalkStatement__Alternatives ) )
            {
            // InternalSelfCheckout.g:192:2: ( ( rule__WalkStatement__Alternatives ) )
            // InternalSelfCheckout.g:193:3: ( rule__WalkStatement__Alternatives )
            {
             before(grammarAccess.getWalkStatementAccess().getAlternatives()); 
            // InternalSelfCheckout.g:194:3: ( rule__WalkStatement__Alternatives )
            // InternalSelfCheckout.g:194:4: rule__WalkStatement__Alternatives
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
    // InternalSelfCheckout.g:203:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:204:1: ( ruleVariableDeclaration EOF )
            // InternalSelfCheckout.g:205:1: ruleVariableDeclaration EOF
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
    // InternalSelfCheckout.g:212:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:216:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalSelfCheckout.g:217:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalSelfCheckout.g:217:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalSelfCheckout.g:218:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalSelfCheckout.g:219:3: ( rule__VariableDeclaration__Group__0 )
            // InternalSelfCheckout.g:219:4: rule__VariableDeclaration__Group__0
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
    // InternalSelfCheckout.g:228:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:229:1: ( ruleLoopStatement EOF )
            // InternalSelfCheckout.g:230:1: ruleLoopStatement EOF
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
    // InternalSelfCheckout.g:237:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:241:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalSelfCheckout.g:242:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalSelfCheckout.g:242:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalSelfCheckout.g:243:3: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // InternalSelfCheckout.g:244:3: ( rule__LoopStatement__Group__0 )
            // InternalSelfCheckout.g:244:4: rule__LoopStatement__Group__0
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
    // InternalSelfCheckout.g:253:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:254:1: ( ruleMoveStatement EOF )
            // InternalSelfCheckout.g:255:1: ruleMoveStatement EOF
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
    // InternalSelfCheckout.g:262:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:266:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalSelfCheckout.g:267:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalSelfCheckout.g:267:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalSelfCheckout.g:268:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalSelfCheckout.g:269:3: ( rule__MoveStatement__Group__0 )
            // InternalSelfCheckout.g:269:4: rule__MoveStatement__Group__0
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
    // InternalSelfCheckout.g:278:1: entryRuleTurnStatement : ruleTurnStatement EOF ;
    public final void entryRuleTurnStatement() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:279:1: ( ruleTurnStatement EOF )
            // InternalSelfCheckout.g:280:1: ruleTurnStatement EOF
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
    // InternalSelfCheckout.g:287:1: ruleTurnStatement : ( ( rule__TurnStatement__Group__0 ) ) ;
    public final void ruleTurnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:291:2: ( ( ( rule__TurnStatement__Group__0 ) ) )
            // InternalSelfCheckout.g:292:2: ( ( rule__TurnStatement__Group__0 ) )
            {
            // InternalSelfCheckout.g:292:2: ( ( rule__TurnStatement__Group__0 ) )
            // InternalSelfCheckout.g:293:3: ( rule__TurnStatement__Group__0 )
            {
             before(grammarAccess.getTurnStatementAccess().getGroup()); 
            // InternalSelfCheckout.g:294:3: ( rule__TurnStatement__Group__0 )
            // InternalSelfCheckout.g:294:4: rule__TurnStatement__Group__0
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
    // InternalSelfCheckout.g:303:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:304:1: ( ruleAddition EOF )
            // InternalSelfCheckout.g:305:1: ruleAddition EOF
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
    // InternalSelfCheckout.g:312:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:316:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalSelfCheckout.g:317:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalSelfCheckout.g:317:2: ( ( rule__Addition__Group__0 ) )
            // InternalSelfCheckout.g:318:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalSelfCheckout.g:319:3: ( rule__Addition__Group__0 )
            // InternalSelfCheckout.g:319:4: rule__Addition__Group__0
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
    // InternalSelfCheckout.g:328:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:329:1: ( ruleMultiplication EOF )
            // InternalSelfCheckout.g:330:1: ruleMultiplication EOF
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
    // InternalSelfCheckout.g:337:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:341:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalSelfCheckout.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalSelfCheckout.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalSelfCheckout.g:343:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalSelfCheckout.g:344:3: ( rule__Multiplication__Group__0 )
            // InternalSelfCheckout.g:344:4: rule__Multiplication__Group__0
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
    // InternalSelfCheckout.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:354:1: ( rulePrimary EOF )
            // InternalSelfCheckout.g:355:1: rulePrimary EOF
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
    // InternalSelfCheckout.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSelfCheckout.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSelfCheckout.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalSelfCheckout.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSelfCheckout.g:369:3: ( rule__Primary__Alternatives )
            // InternalSelfCheckout.g:369:4: rule__Primary__Alternatives
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
    // InternalSelfCheckout.g:378:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:379:1: ( ruleIntLiteral EOF )
            // InternalSelfCheckout.g:380:1: ruleIntLiteral EOF
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
    // InternalSelfCheckout.g:387:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:391:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalSelfCheckout.g:392:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalSelfCheckout.g:392:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalSelfCheckout.g:393:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalSelfCheckout.g:394:3: ( rule__IntLiteral__ValAssignment )
            // InternalSelfCheckout.g:394:4: rule__IntLiteral__ValAssignment
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
    // InternalSelfCheckout.g:403:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:404:1: ( ruleRealLiteral EOF )
            // InternalSelfCheckout.g:405:1: ruleRealLiteral EOF
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
    // InternalSelfCheckout.g:412:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:416:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalSelfCheckout.g:417:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalSelfCheckout.g:417:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalSelfCheckout.g:418:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalSelfCheckout.g:419:3: ( rule__RealLiteral__ValAssignment )
            // InternalSelfCheckout.g:419:4: rule__RealLiteral__ValAssignment
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
    // InternalSelfCheckout.g:428:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:429:1: ( ruleIntVarExpression EOF )
            // InternalSelfCheckout.g:430:1: ruleIntVarExpression EOF
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
    // InternalSelfCheckout.g:437:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:441:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalSelfCheckout.g:442:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalSelfCheckout.g:442:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalSelfCheckout.g:443:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalSelfCheckout.g:444:3: ( rule__IntVarExpression__VarAssignment )
            // InternalSelfCheckout.g:444:4: rule__IntVarExpression__VarAssignment
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
    // InternalSelfCheckout.g:453:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSelfCheckout.g:457:1: ( ruleREAL EOF )
            // InternalSelfCheckout.g:458:1: ruleREAL EOF
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
    // InternalSelfCheckout.g:468:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:473:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSelfCheckout.g:474:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSelfCheckout.g:474:2: ( ( rule__REAL__Group__0 ) )
            // InternalSelfCheckout.g:475:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalSelfCheckout.g:476:3: ( rule__REAL__Group__0 )
            // InternalSelfCheckout.g:476:4: rule__REAL__Group__0
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
    // InternalSelfCheckout.g:486:1: entryRuleCheckout : ruleCheckout EOF ;
    public final void entryRuleCheckout() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:487:1: ( ruleCheckout EOF )
            // InternalSelfCheckout.g:488:1: ruleCheckout EOF
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
    // InternalSelfCheckout.g:495:1: ruleCheckout : ( ( rule__Checkout__Group__0 ) ) ;
    public final void ruleCheckout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:499:2: ( ( ( rule__Checkout__Group__0 ) ) )
            // InternalSelfCheckout.g:500:2: ( ( rule__Checkout__Group__0 ) )
            {
            // InternalSelfCheckout.g:500:2: ( ( rule__Checkout__Group__0 ) )
            // InternalSelfCheckout.g:501:3: ( rule__Checkout__Group__0 )
            {
             before(grammarAccess.getCheckoutAccess().getGroup()); 
            // InternalSelfCheckout.g:502:3: ( rule__Checkout__Group__0 )
            // InternalSelfCheckout.g:502:4: rule__Checkout__Group__0
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
    // InternalSelfCheckout.g:511:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:512:1: ( ruleScan EOF )
            // InternalSelfCheckout.g:513:1: ruleScan EOF
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
    // InternalSelfCheckout.g:520:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:524:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalSelfCheckout.g:525:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalSelfCheckout.g:525:2: ( ( rule__Scan__Group__0 ) )
            // InternalSelfCheckout.g:526:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalSelfCheckout.g:527:3: ( rule__Scan__Group__0 )
            // InternalSelfCheckout.g:527:4: rule__Scan__Group__0
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
    // InternalSelfCheckout.g:536:1: entryRuleAddToBag : ruleAddToBag EOF ;
    public final void entryRuleAddToBag() throws RecognitionException {
        try {
            // InternalSelfCheckout.g:537:1: ( ruleAddToBag EOF )
            // InternalSelfCheckout.g:538:1: ruleAddToBag EOF
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
    // InternalSelfCheckout.g:545:1: ruleAddToBag : ( ( rule__AddToBag__Group__0 ) ) ;
    public final void ruleAddToBag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:549:2: ( ( ( rule__AddToBag__Group__0 ) ) )
            // InternalSelfCheckout.g:550:2: ( ( rule__AddToBag__Group__0 ) )
            {
            // InternalSelfCheckout.g:550:2: ( ( rule__AddToBag__Group__0 ) )
            // InternalSelfCheckout.g:551:3: ( rule__AddToBag__Group__0 )
            {
             before(grammarAccess.getAddToBagAccess().getGroup()); 
            // InternalSelfCheckout.g:552:3: ( rule__AddToBag__Group__0 )
            // InternalSelfCheckout.g:552:4: rule__AddToBag__Group__0
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
    // InternalSelfCheckout.g:561:1: ruleMoveCommand : ( ( rule__MoveCommand__Alternatives ) ) ;
    public final void ruleMoveCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:565:1: ( ( ( rule__MoveCommand__Alternatives ) ) )
            // InternalSelfCheckout.g:566:2: ( ( rule__MoveCommand__Alternatives ) )
            {
            // InternalSelfCheckout.g:566:2: ( ( rule__MoveCommand__Alternatives ) )
            // InternalSelfCheckout.g:567:3: ( rule__MoveCommand__Alternatives )
            {
             before(grammarAccess.getMoveCommandAccess().getAlternatives()); 
            // InternalSelfCheckout.g:568:3: ( rule__MoveCommand__Alternatives )
            // InternalSelfCheckout.g:568:4: rule__MoveCommand__Alternatives
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
    // InternalSelfCheckout.g:577:1: ruleTurnCommand : ( ( rule__TurnCommand__Alternatives ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:581:1: ( ( ( rule__TurnCommand__Alternatives ) ) )
            // InternalSelfCheckout.g:582:2: ( ( rule__TurnCommand__Alternatives ) )
            {
            // InternalSelfCheckout.g:582:2: ( ( rule__TurnCommand__Alternatives ) )
            // InternalSelfCheckout.g:583:3: ( rule__TurnCommand__Alternatives )
            {
             before(grammarAccess.getTurnCommandAccess().getAlternatives()); 
            // InternalSelfCheckout.g:584:3: ( rule__TurnCommand__Alternatives )
            // InternalSelfCheckout.g:584:4: rule__TurnCommand__Alternatives
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
    // InternalSelfCheckout.g:593:1: rulePay : ( ( 'pay' ) ) ;
    public final void rulePay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:597:1: ( ( ( 'pay' ) ) )
            // InternalSelfCheckout.g:598:2: ( ( 'pay' ) )
            {
            // InternalSelfCheckout.g:598:2: ( ( 'pay' ) )
            // InternalSelfCheckout.g:599:3: ( 'pay' )
            {
             before(grammarAccess.getPayAccess().getPayEnumLiteralDeclaration()); 
            // InternalSelfCheckout.g:600:3: ( 'pay' )
            // InternalSelfCheckout.g:600:4: 'pay'
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
    // InternalSelfCheckout.g:608:1: rule__Self_checkout__Alternatives_0 : ( ( ( rule__Self_checkout__PickAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) );
    public final void rule__Self_checkout__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:612:1: ( ( ( rule__Self_checkout__PickAssignment_0_0 ) ) | ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) ) )
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
                    // InternalSelfCheckout.g:613:2: ( ( rule__Self_checkout__PickAssignment_0_0 ) )
                    {
                    // InternalSelfCheckout.g:613:2: ( ( rule__Self_checkout__PickAssignment_0_0 ) )
                    // InternalSelfCheckout.g:614:3: ( rule__Self_checkout__PickAssignment_0_0 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getPickAssignment_0_0()); 
                    // InternalSelfCheckout.g:615:3: ( rule__Self_checkout__PickAssignment_0_0 )
                    // InternalSelfCheckout.g:615:4: rule__Self_checkout__PickAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Self_checkout__PickAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelf_checkoutAccess().getPickAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:619:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    {
                    // InternalSelfCheckout.g:619:2: ( ( rule__Self_checkout__WalkstatementsAssignment_0_1 ) )
                    // InternalSelfCheckout.g:620:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    {
                     before(grammarAccess.getSelf_checkoutAccess().getWalkstatementsAssignment_0_1()); 
                    // InternalSelfCheckout.g:621:3: ( rule__Self_checkout__WalkstatementsAssignment_0_1 )
                    // InternalSelfCheckout.g:621:4: rule__Self_checkout__WalkstatementsAssignment_0_1
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


    // $ANTLR start "rule__Pick__HoldingItemAlternatives_3_0"
    // InternalSelfCheckout.g:629:1: rule__Pick__HoldingItemAlternatives_3_0 : ( ( ruleAddToBasket ) | ( ruleDrop ) );
    public final void rule__Pick__HoldingItemAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:633:1: ( ( ruleAddToBasket ) | ( ruleDrop ) )
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
                    // InternalSelfCheckout.g:634:2: ( ruleAddToBasket )
                    {
                    // InternalSelfCheckout.g:634:2: ( ruleAddToBasket )
                    // InternalSelfCheckout.g:635:3: ruleAddToBasket
                    {
                     before(grammarAccess.getPickAccess().getHoldingItemAddToBasketParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddToBasket();

                    state._fsp--;

                     after(grammarAccess.getPickAccess().getHoldingItemAddToBasketParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:640:2: ( ruleDrop )
                    {
                    // InternalSelfCheckout.g:640:2: ( ruleDrop )
                    // InternalSelfCheckout.g:641:3: ruleDrop
                    {
                     before(grammarAccess.getPickAccess().getHoldingItemDropParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDrop();

                    state._fsp--;

                     after(grammarAccess.getPickAccess().getHoldingItemDropParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Pick__HoldingItemAlternatives_3_0"


    // $ANTLR start "rule__WalkStatement__Alternatives"
    // InternalSelfCheckout.g:650:1: rule__WalkStatement__Alternatives : ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleLoopStatement ) | ( ruleVariableDeclaration ) );
    public final void rule__WalkStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:654:1: ( ( ruleMoveStatement ) | ( ruleTurnStatement ) | ( ruleLoopStatement ) | ( ruleVariableDeclaration ) )
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
                    // InternalSelfCheckout.g:655:2: ( ruleMoveStatement )
                    {
                    // InternalSelfCheckout.g:655:2: ( ruleMoveStatement )
                    // InternalSelfCheckout.g:656:3: ruleMoveStatement
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
                    // InternalSelfCheckout.g:661:2: ( ruleTurnStatement )
                    {
                    // InternalSelfCheckout.g:661:2: ( ruleTurnStatement )
                    // InternalSelfCheckout.g:662:3: ruleTurnStatement
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
                    // InternalSelfCheckout.g:667:2: ( ruleLoopStatement )
                    {
                    // InternalSelfCheckout.g:667:2: ( ruleLoopStatement )
                    // InternalSelfCheckout.g:668:3: ruleLoopStatement
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
                    // InternalSelfCheckout.g:673:2: ( ruleVariableDeclaration )
                    {
                    // InternalSelfCheckout.g:673:2: ( ruleVariableDeclaration )
                    // InternalSelfCheckout.g:674:3: ruleVariableDeclaration
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
    // InternalSelfCheckout.g:683:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:687:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalSelfCheckout.g:688:2: ( '+' )
                    {
                    // InternalSelfCheckout.g:688:2: ( '+' )
                    // InternalSelfCheckout.g:689:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:694:2: ( '-' )
                    {
                    // InternalSelfCheckout.g:694:2: ( '-' )
                    // InternalSelfCheckout.g:695:3: '-'
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
    // InternalSelfCheckout.g:704:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:708:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalSelfCheckout.g:709:2: ( '*' )
                    {
                    // InternalSelfCheckout.g:709:2: ( '*' )
                    // InternalSelfCheckout.g:710:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:715:2: ( '/' )
                    {
                    // InternalSelfCheckout.g:715:2: ( '/' )
                    // InternalSelfCheckout.g:716:3: '/'
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
    // InternalSelfCheckout.g:725:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:729:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==36) ) {
                    alt6=3;
                }
                else if ( (LA6_1==EOF||(LA6_1>=12 && LA6_1<=15)||LA6_1==28||LA6_1==32||LA6_1==35) ) {
                    alt6=1;
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
                    // InternalSelfCheckout.g:730:2: ( ruleIntLiteral )
                    {
                    // InternalSelfCheckout.g:730:2: ( ruleIntLiteral )
                    // InternalSelfCheckout.g:731:3: ruleIntLiteral
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
                    // InternalSelfCheckout.g:736:2: ( ruleIntVarExpression )
                    {
                    // InternalSelfCheckout.g:736:2: ( ruleIntVarExpression )
                    // InternalSelfCheckout.g:737:3: ruleIntVarExpression
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
                    // InternalSelfCheckout.g:742:2: ( ruleRealLiteral )
                    {
                    // InternalSelfCheckout.g:742:2: ( ruleRealLiteral )
                    // InternalSelfCheckout.g:743:3: ruleRealLiteral
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
                    // InternalSelfCheckout.g:748:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalSelfCheckout.g:748:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalSelfCheckout.g:749:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalSelfCheckout.g:750:3: ( rule__Primary__Group_3__0 )
                    // InternalSelfCheckout.g:750:4: rule__Primary__Group_3__0
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
    // InternalSelfCheckout.g:758:1: rule__MoveCommand__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__MoveCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:762:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
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
                    // InternalSelfCheckout.g:763:2: ( ( 'forward' ) )
                    {
                    // InternalSelfCheckout.g:763:2: ( ( 'forward' ) )
                    // InternalSelfCheckout.g:764:3: ( 'forward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckout.g:765:3: ( 'forward' )
                    // InternalSelfCheckout.g:765:4: 'forward'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoveCommandAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:769:2: ( ( 'backward' ) )
                    {
                    // InternalSelfCheckout.g:769:2: ( ( 'backward' ) )
                    // InternalSelfCheckout.g:770:3: ( 'backward' )
                    {
                     before(grammarAccess.getMoveCommandAccess().getBackwardEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckout.g:771:3: ( 'backward' )
                    // InternalSelfCheckout.g:771:4: 'backward'
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
    // InternalSelfCheckout.g:779:1: rule__TurnCommand__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TurnCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:783:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalSelfCheckout.g:784:2: ( ( 'left' ) )
                    {
                    // InternalSelfCheckout.g:784:2: ( ( 'left' ) )
                    // InternalSelfCheckout.g:785:3: ( 'left' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSelfCheckout.g:786:3: ( 'left' )
                    // InternalSelfCheckout.g:786:4: 'left'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnCommandAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelfCheckout.g:790:2: ( ( 'right' ) )
                    {
                    // InternalSelfCheckout.g:790:2: ( ( 'right' ) )
                    // InternalSelfCheckout.g:791:3: ( 'right' )
                    {
                     before(grammarAccess.getTurnCommandAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalSelfCheckout.g:792:3: ( 'right' )
                    // InternalSelfCheckout.g:792:4: 'right'
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
    // InternalSelfCheckout.g:800:1: rule__Self_checkout__Group__0 : rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 ;
    public final void rule__Self_checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:804:1: ( rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1 )
            // InternalSelfCheckout.g:805:2: rule__Self_checkout__Group__0__Impl rule__Self_checkout__Group__1
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
    // InternalSelfCheckout.g:812:1: rule__Self_checkout__Group__0__Impl : ( ( rule__Self_checkout__Alternatives_0 )* ) ;
    public final void rule__Self_checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:816:1: ( ( ( rule__Self_checkout__Alternatives_0 )* ) )
            // InternalSelfCheckout.g:817:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            {
            // InternalSelfCheckout.g:817:1: ( ( rule__Self_checkout__Alternatives_0 )* )
            // InternalSelfCheckout.g:818:2: ( rule__Self_checkout__Alternatives_0 )*
            {
             before(grammarAccess.getSelf_checkoutAccess().getAlternatives_0()); 
            // InternalSelfCheckout.g:819:2: ( rule__Self_checkout__Alternatives_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=16 && LA9_0<=17)||LA9_0==20||LA9_0==26||LA9_0==31||LA9_0==33||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSelfCheckout.g:819:3: rule__Self_checkout__Alternatives_0
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
    // InternalSelfCheckout.g:827:1: rule__Self_checkout__Group__1 : rule__Self_checkout__Group__1__Impl ;
    public final void rule__Self_checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:831:1: ( rule__Self_checkout__Group__1__Impl )
            // InternalSelfCheckout.g:832:2: rule__Self_checkout__Group__1__Impl
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
    // InternalSelfCheckout.g:838:1: rule__Self_checkout__Group__1__Impl : ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) ;
    public final void rule__Self_checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:842:1: ( ( ( rule__Self_checkout__CheckoutAssignment_1 )? ) )
            // InternalSelfCheckout.g:843:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            {
            // InternalSelfCheckout.g:843:1: ( ( rule__Self_checkout__CheckoutAssignment_1 )? )
            // InternalSelfCheckout.g:844:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            {
             before(grammarAccess.getSelf_checkoutAccess().getCheckoutAssignment_1()); 
            // InternalSelfCheckout.g:845:2: ( rule__Self_checkout__CheckoutAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSelfCheckout.g:845:3: rule__Self_checkout__CheckoutAssignment_1
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


    // $ANTLR start "rule__Pick__Group__0"
    // InternalSelfCheckout.g:854:1: rule__Pick__Group__0 : rule__Pick__Group__0__Impl rule__Pick__Group__1 ;
    public final void rule__Pick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:858:1: ( rule__Pick__Group__0__Impl rule__Pick__Group__1 )
            // InternalSelfCheckout.g:859:2: rule__Pick__Group__0__Impl rule__Pick__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Pick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__0"


    // $ANTLR start "rule__Pick__Group__0__Impl"
    // InternalSelfCheckout.g:866:1: rule__Pick__Group__0__Impl : ( 'pick' ) ;
    public final void rule__Pick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:870:1: ( ( 'pick' ) )
            // InternalSelfCheckout.g:871:1: ( 'pick' )
            {
            // InternalSelfCheckout.g:871:1: ( 'pick' )
            // InternalSelfCheckout.g:872:2: 'pick'
            {
             before(grammarAccess.getPickAccess().getPickKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPickAccess().getPickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__0__Impl"


    // $ANTLR start "rule__Pick__Group__1"
    // InternalSelfCheckout.g:881:1: rule__Pick__Group__1 : rule__Pick__Group__1__Impl rule__Pick__Group__2 ;
    public final void rule__Pick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:885:1: ( rule__Pick__Group__1__Impl rule__Pick__Group__2 )
            // InternalSelfCheckout.g:886:2: rule__Pick__Group__1__Impl rule__Pick__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Pick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pick__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__1"


    // $ANTLR start "rule__Pick__Group__1__Impl"
    // InternalSelfCheckout.g:893:1: rule__Pick__Group__1__Impl : ( 'up' ) ;
    public final void rule__Pick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:897:1: ( ( 'up' ) )
            // InternalSelfCheckout.g:898:1: ( 'up' )
            {
            // InternalSelfCheckout.g:898:1: ( 'up' )
            // InternalSelfCheckout.g:899:2: 'up'
            {
             before(grammarAccess.getPickAccess().getUpKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPickAccess().getUpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__1__Impl"


    // $ANTLR start "rule__Pick__Group__2"
    // InternalSelfCheckout.g:908:1: rule__Pick__Group__2 : rule__Pick__Group__2__Impl rule__Pick__Group__3 ;
    public final void rule__Pick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:912:1: ( rule__Pick__Group__2__Impl rule__Pick__Group__3 )
            // InternalSelfCheckout.g:913:2: rule__Pick__Group__2__Impl rule__Pick__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Pick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pick__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__2"


    // $ANTLR start "rule__Pick__Group__2__Impl"
    // InternalSelfCheckout.g:920:1: rule__Pick__Group__2__Impl : ( ( rule__Pick__NameAssignment_2 ) ) ;
    public final void rule__Pick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:924:1: ( ( ( rule__Pick__NameAssignment_2 ) ) )
            // InternalSelfCheckout.g:925:1: ( ( rule__Pick__NameAssignment_2 ) )
            {
            // InternalSelfCheckout.g:925:1: ( ( rule__Pick__NameAssignment_2 ) )
            // InternalSelfCheckout.g:926:2: ( rule__Pick__NameAssignment_2 )
            {
             before(grammarAccess.getPickAccess().getNameAssignment_2()); 
            // InternalSelfCheckout.g:927:2: ( rule__Pick__NameAssignment_2 )
            // InternalSelfCheckout.g:927:3: rule__Pick__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pick__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPickAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__2__Impl"


    // $ANTLR start "rule__Pick__Group__3"
    // InternalSelfCheckout.g:935:1: rule__Pick__Group__3 : rule__Pick__Group__3__Impl ;
    public final void rule__Pick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:939:1: ( rule__Pick__Group__3__Impl )
            // InternalSelfCheckout.g:940:2: rule__Pick__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pick__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__3"


    // $ANTLR start "rule__Pick__Group__3__Impl"
    // InternalSelfCheckout.g:946:1: rule__Pick__Group__3__Impl : ( ( rule__Pick__HoldingItemAssignment_3 ) ) ;
    public final void rule__Pick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:950:1: ( ( ( rule__Pick__HoldingItemAssignment_3 ) ) )
            // InternalSelfCheckout.g:951:1: ( ( rule__Pick__HoldingItemAssignment_3 ) )
            {
            // InternalSelfCheckout.g:951:1: ( ( rule__Pick__HoldingItemAssignment_3 ) )
            // InternalSelfCheckout.g:952:2: ( rule__Pick__HoldingItemAssignment_3 )
            {
             before(grammarAccess.getPickAccess().getHoldingItemAssignment_3()); 
            // InternalSelfCheckout.g:953:2: ( rule__Pick__HoldingItemAssignment_3 )
            // InternalSelfCheckout.g:953:3: rule__Pick__HoldingItemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pick__HoldingItemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPickAccess().getHoldingItemAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__Group__3__Impl"


    // $ANTLR start "rule__AddToBasket__Group__0"
    // InternalSelfCheckout.g:962:1: rule__AddToBasket__Group__0 : rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 ;
    public final void rule__AddToBasket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:966:1: ( rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1 )
            // InternalSelfCheckout.g:967:2: rule__AddToBasket__Group__0__Impl rule__AddToBasket__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckout.g:974:1: rule__AddToBasket__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBasket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:978:1: ( ( 'add' ) )
            // InternalSelfCheckout.g:979:1: ( 'add' )
            {
            // InternalSelfCheckout.g:979:1: ( 'add' )
            // InternalSelfCheckout.g:980:2: 'add'
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
    // InternalSelfCheckout.g:989:1: rule__AddToBasket__Group__1 : rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 ;
    public final void rule__AddToBasket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:993:1: ( rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2 )
            // InternalSelfCheckout.g:994:2: rule__AddToBasket__Group__1__Impl rule__AddToBasket__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSelfCheckout.g:1001:1: rule__AddToBasket__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBasket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1005:1: ( ( 'to' ) )
            // InternalSelfCheckout.g:1006:1: ( 'to' )
            {
            // InternalSelfCheckout.g:1006:1: ( 'to' )
            // InternalSelfCheckout.g:1007:2: 'to'
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
    // InternalSelfCheckout.g:1016:1: rule__AddToBasket__Group__2 : rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 ;
    public final void rule__AddToBasket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1020:1: ( rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3 )
            // InternalSelfCheckout.g:1021:2: rule__AddToBasket__Group__2__Impl rule__AddToBasket__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckout.g:1028:1: rule__AddToBasket__Group__2__Impl : ( 'basket' ) ;
    public final void rule__AddToBasket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1032:1: ( ( 'basket' ) )
            // InternalSelfCheckout.g:1033:1: ( 'basket' )
            {
            // InternalSelfCheckout.g:1033:1: ( 'basket' )
            // InternalSelfCheckout.g:1034:2: 'basket'
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
    // InternalSelfCheckout.g:1043:1: rule__AddToBasket__Group__3 : rule__AddToBasket__Group__3__Impl ;
    public final void rule__AddToBasket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1047:1: ( rule__AddToBasket__Group__3__Impl )
            // InternalSelfCheckout.g:1048:2: rule__AddToBasket__Group__3__Impl
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
    // InternalSelfCheckout.g:1054:1: rule__AddToBasket__Group__3__Impl : ( ( rule__AddToBasket__ItemAssignment_3 ) ) ;
    public final void rule__AddToBasket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1058:1: ( ( ( rule__AddToBasket__ItemAssignment_3 ) ) )
            // InternalSelfCheckout.g:1059:1: ( ( rule__AddToBasket__ItemAssignment_3 ) )
            {
            // InternalSelfCheckout.g:1059:1: ( ( rule__AddToBasket__ItemAssignment_3 ) )
            // InternalSelfCheckout.g:1060:2: ( rule__AddToBasket__ItemAssignment_3 )
            {
             before(grammarAccess.getAddToBasketAccess().getItemAssignment_3()); 
            // InternalSelfCheckout.g:1061:2: ( rule__AddToBasket__ItemAssignment_3 )
            // InternalSelfCheckout.g:1061:3: rule__AddToBasket__ItemAssignment_3
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
    // InternalSelfCheckout.g:1070:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1074:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalSelfCheckout.g:1075:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalSelfCheckout.g:1082:1: rule__Drop__Group__0__Impl : ( 'drop' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1086:1: ( ( 'drop' ) )
            // InternalSelfCheckout.g:1087:1: ( 'drop' )
            {
            // InternalSelfCheckout.g:1087:1: ( 'drop' )
            // InternalSelfCheckout.g:1088:2: 'drop'
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
    // InternalSelfCheckout.g:1097:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1101:1: ( rule__Drop__Group__1__Impl )
            // InternalSelfCheckout.g:1102:2: rule__Drop__Group__1__Impl
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
    // InternalSelfCheckout.g:1108:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__ItemAssignment_1 ) ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1112:1: ( ( ( rule__Drop__ItemAssignment_1 ) ) )
            // InternalSelfCheckout.g:1113:1: ( ( rule__Drop__ItemAssignment_1 ) )
            {
            // InternalSelfCheckout.g:1113:1: ( ( rule__Drop__ItemAssignment_1 ) )
            // InternalSelfCheckout.g:1114:2: ( rule__Drop__ItemAssignment_1 )
            {
             before(grammarAccess.getDropAccess().getItemAssignment_1()); 
            // InternalSelfCheckout.g:1115:2: ( rule__Drop__ItemAssignment_1 )
            // InternalSelfCheckout.g:1115:3: rule__Drop__ItemAssignment_1
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
    // InternalSelfCheckout.g:1124:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1128:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalSelfCheckout.g:1129:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalSelfCheckout.g:1136:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1140:1: ( ( 'var' ) )
            // InternalSelfCheckout.g:1141:1: ( 'var' )
            {
            // InternalSelfCheckout.g:1141:1: ( 'var' )
            // InternalSelfCheckout.g:1142:2: 'var'
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
    // InternalSelfCheckout.g:1151:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1155:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalSelfCheckout.g:1156:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSelfCheckout.g:1163:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1167:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalSelfCheckout.g:1168:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalSelfCheckout.g:1168:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalSelfCheckout.g:1169:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalSelfCheckout.g:1170:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalSelfCheckout.g:1170:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalSelfCheckout.g:1178:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1182:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalSelfCheckout.g:1183:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckout.g:1190:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1194:1: ( ( '=' ) )
            // InternalSelfCheckout.g:1195:1: ( '=' )
            {
            // InternalSelfCheckout.g:1195:1: ( '=' )
            // InternalSelfCheckout.g:1196:2: '='
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
    // InternalSelfCheckout.g:1205:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1209:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalSelfCheckout.g:1210:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalSelfCheckout.g:1216:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1220:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalSelfCheckout.g:1221:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalSelfCheckout.g:1221:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalSelfCheckout.g:1222:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalSelfCheckout.g:1223:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalSelfCheckout.g:1223:3: rule__VariableDeclaration__ValueAssignment_3
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
    // InternalSelfCheckout.g:1232:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1236:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalSelfCheckout.g:1237:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSelfCheckout.g:1244:1: rule__LoopStatement__Group__0__Impl : ( ( rule__LoopStatement__CountAssignment_0 ) ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1248:1: ( ( ( rule__LoopStatement__CountAssignment_0 ) ) )
            // InternalSelfCheckout.g:1249:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            {
            // InternalSelfCheckout.g:1249:1: ( ( rule__LoopStatement__CountAssignment_0 ) )
            // InternalSelfCheckout.g:1250:2: ( rule__LoopStatement__CountAssignment_0 )
            {
             before(grammarAccess.getLoopStatementAccess().getCountAssignment_0()); 
            // InternalSelfCheckout.g:1251:2: ( rule__LoopStatement__CountAssignment_0 )
            // InternalSelfCheckout.g:1251:3: rule__LoopStatement__CountAssignment_0
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
    // InternalSelfCheckout.g:1259:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1263:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalSelfCheckout.g:1264:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSelfCheckout.g:1271:1: rule__LoopStatement__Group__1__Impl : ( 'times' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1275:1: ( ( 'times' ) )
            // InternalSelfCheckout.g:1276:1: ( 'times' )
            {
            // InternalSelfCheckout.g:1276:1: ( 'times' )
            // InternalSelfCheckout.g:1277:2: 'times'
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
    // InternalSelfCheckout.g:1286:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1290:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalSelfCheckout.g:1291:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSelfCheckout.g:1298:1: rule__LoopStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1302:1: ( ( 'do' ) )
            // InternalSelfCheckout.g:1303:1: ( 'do' )
            {
            // InternalSelfCheckout.g:1303:1: ( 'do' )
            // InternalSelfCheckout.g:1304:2: 'do'
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
    // InternalSelfCheckout.g:1313:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1317:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalSelfCheckout.g:1318:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSelfCheckout.g:1325:1: rule__LoopStatement__Group__3__Impl : ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1329:1: ( ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) ) )
            // InternalSelfCheckout.g:1330:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            {
            // InternalSelfCheckout.g:1330:1: ( ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* ) )
            // InternalSelfCheckout.g:1331:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) ) ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            {
            // InternalSelfCheckout.g:1331:2: ( ( rule__LoopStatement__StatementsAssignment_3 ) )
            // InternalSelfCheckout.g:1332:3: ( rule__LoopStatement__StatementsAssignment_3 )
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckout.g:1333:3: ( rule__LoopStatement__StatementsAssignment_3 )
            // InternalSelfCheckout.g:1333:4: rule__LoopStatement__StatementsAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__LoopStatement__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 

            }

            // InternalSelfCheckout.g:1336:2: ( ( rule__LoopStatement__StatementsAssignment_3 )* )
            // InternalSelfCheckout.g:1337:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStatementsAssignment_3()); 
            // InternalSelfCheckout.g:1338:3: ( rule__LoopStatement__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||(LA11_0>=16 && LA11_0<=17)||LA11_0==26||LA11_0==31||LA11_0==33||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSelfCheckout.g:1338:4: rule__LoopStatement__StatementsAssignment_3
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
    // InternalSelfCheckout.g:1347:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1351:1: ( rule__LoopStatement__Group__4__Impl )
            // InternalSelfCheckout.g:1352:2: rule__LoopStatement__Group__4__Impl
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
    // InternalSelfCheckout.g:1358:1: rule__LoopStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1362:1: ( ( 'end' ) )
            // InternalSelfCheckout.g:1363:1: ( 'end' )
            {
            // InternalSelfCheckout.g:1363:1: ( 'end' )
            // InternalSelfCheckout.g:1364:2: 'end'
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
    // InternalSelfCheckout.g:1374:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1378:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalSelfCheckout.g:1379:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
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
    // InternalSelfCheckout.g:1386:1: rule__MoveStatement__Group__0__Impl : ( ( rule__MoveStatement__CommandAssignment_0 ) ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1390:1: ( ( ( rule__MoveStatement__CommandAssignment_0 ) ) )
            // InternalSelfCheckout.g:1391:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            {
            // InternalSelfCheckout.g:1391:1: ( ( rule__MoveStatement__CommandAssignment_0 ) )
            // InternalSelfCheckout.g:1392:2: ( rule__MoveStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getMoveStatementAccess().getCommandAssignment_0()); 
            // InternalSelfCheckout.g:1393:2: ( rule__MoveStatement__CommandAssignment_0 )
            // InternalSelfCheckout.g:1393:3: rule__MoveStatement__CommandAssignment_0
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
    // InternalSelfCheckout.g:1401:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1405:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalSelfCheckout.g:1406:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckout.g:1413:1: rule__MoveStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1417:1: ( ( '(' ) )
            // InternalSelfCheckout.g:1418:1: ( '(' )
            {
            // InternalSelfCheckout.g:1418:1: ( '(' )
            // InternalSelfCheckout.g:1419:2: '('
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
    // InternalSelfCheckout.g:1428:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1432:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalSelfCheckout.g:1433:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
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
    // InternalSelfCheckout.g:1440:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__StepsAssignment_2 ) ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1444:1: ( ( ( rule__MoveStatement__StepsAssignment_2 ) ) )
            // InternalSelfCheckout.g:1445:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            {
            // InternalSelfCheckout.g:1445:1: ( ( rule__MoveStatement__StepsAssignment_2 ) )
            // InternalSelfCheckout.g:1446:2: ( rule__MoveStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getMoveStatementAccess().getStepsAssignment_2()); 
            // InternalSelfCheckout.g:1447:2: ( rule__MoveStatement__StepsAssignment_2 )
            // InternalSelfCheckout.g:1447:3: rule__MoveStatement__StepsAssignment_2
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
    // InternalSelfCheckout.g:1455:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1459:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalSelfCheckout.g:1460:2: rule__MoveStatement__Group__3__Impl
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
    // InternalSelfCheckout.g:1466:1: rule__MoveStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1470:1: ( ( ')' ) )
            // InternalSelfCheckout.g:1471:1: ( ')' )
            {
            // InternalSelfCheckout.g:1471:1: ( ')' )
            // InternalSelfCheckout.g:1472:2: ')'
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
    // InternalSelfCheckout.g:1482:1: rule__TurnStatement__Group__0 : rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 ;
    public final void rule__TurnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1486:1: ( rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1 )
            // InternalSelfCheckout.g:1487:2: rule__TurnStatement__Group__0__Impl rule__TurnStatement__Group__1
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
    // InternalSelfCheckout.g:1494:1: rule__TurnStatement__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1498:1: ( ( 'turn' ) )
            // InternalSelfCheckout.g:1499:1: ( 'turn' )
            {
            // InternalSelfCheckout.g:1499:1: ( 'turn' )
            // InternalSelfCheckout.g:1500:2: 'turn'
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
    // InternalSelfCheckout.g:1509:1: rule__TurnStatement__Group__1 : rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 ;
    public final void rule__TurnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1513:1: ( rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2 )
            // InternalSelfCheckout.g:1514:2: rule__TurnStatement__Group__1__Impl rule__TurnStatement__Group__2
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
    // InternalSelfCheckout.g:1521:1: rule__TurnStatement__Group__1__Impl : ( ( rule__TurnStatement__CommandAssignment_1 ) ) ;
    public final void rule__TurnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1525:1: ( ( ( rule__TurnStatement__CommandAssignment_1 ) ) )
            // InternalSelfCheckout.g:1526:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            {
            // InternalSelfCheckout.g:1526:1: ( ( rule__TurnStatement__CommandAssignment_1 ) )
            // InternalSelfCheckout.g:1527:2: ( rule__TurnStatement__CommandAssignment_1 )
            {
             before(grammarAccess.getTurnStatementAccess().getCommandAssignment_1()); 
            // InternalSelfCheckout.g:1528:2: ( rule__TurnStatement__CommandAssignment_1 )
            // InternalSelfCheckout.g:1528:3: rule__TurnStatement__CommandAssignment_1
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
    // InternalSelfCheckout.g:1536:1: rule__TurnStatement__Group__2 : rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 ;
    public final void rule__TurnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1540:1: ( rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3 )
            // InternalSelfCheckout.g:1541:2: rule__TurnStatement__Group__2__Impl rule__TurnStatement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckout.g:1548:1: rule__TurnStatement__Group__2__Impl : ( 'by' ) ;
    public final void rule__TurnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1552:1: ( ( 'by' ) )
            // InternalSelfCheckout.g:1553:1: ( 'by' )
            {
            // InternalSelfCheckout.g:1553:1: ( 'by' )
            // InternalSelfCheckout.g:1554:2: 'by'
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
    // InternalSelfCheckout.g:1563:1: rule__TurnStatement__Group__3 : rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 ;
    public final void rule__TurnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1567:1: ( rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4 )
            // InternalSelfCheckout.g:1568:2: rule__TurnStatement__Group__3__Impl rule__TurnStatement__Group__4
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
    // InternalSelfCheckout.g:1575:1: rule__TurnStatement__Group__3__Impl : ( ( rule__TurnStatement__DegreesAssignment_3 ) ) ;
    public final void rule__TurnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1579:1: ( ( ( rule__TurnStatement__DegreesAssignment_3 ) ) )
            // InternalSelfCheckout.g:1580:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            {
            // InternalSelfCheckout.g:1580:1: ( ( rule__TurnStatement__DegreesAssignment_3 ) )
            // InternalSelfCheckout.g:1581:2: ( rule__TurnStatement__DegreesAssignment_3 )
            {
             before(grammarAccess.getTurnStatementAccess().getDegreesAssignment_3()); 
            // InternalSelfCheckout.g:1582:2: ( rule__TurnStatement__DegreesAssignment_3 )
            // InternalSelfCheckout.g:1582:3: rule__TurnStatement__DegreesAssignment_3
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
    // InternalSelfCheckout.g:1590:1: rule__TurnStatement__Group__4 : rule__TurnStatement__Group__4__Impl ;
    public final void rule__TurnStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1594:1: ( rule__TurnStatement__Group__4__Impl )
            // InternalSelfCheckout.g:1595:2: rule__TurnStatement__Group__4__Impl
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
    // InternalSelfCheckout.g:1601:1: rule__TurnStatement__Group__4__Impl : ( 'degrees' ) ;
    public final void rule__TurnStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1605:1: ( ( 'degrees' ) )
            // InternalSelfCheckout.g:1606:1: ( 'degrees' )
            {
            // InternalSelfCheckout.g:1606:1: ( 'degrees' )
            // InternalSelfCheckout.g:1607:2: 'degrees'
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
    // InternalSelfCheckout.g:1617:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1621:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalSelfCheckout.g:1622:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalSelfCheckout.g:1629:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1633:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckout.g:1634:1: ( ruleMultiplication )
            {
            // InternalSelfCheckout.g:1634:1: ( ruleMultiplication )
            // InternalSelfCheckout.g:1635:2: ruleMultiplication
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
    // InternalSelfCheckout.g:1644:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1648:1: ( rule__Addition__Group__1__Impl )
            // InternalSelfCheckout.g:1649:2: rule__Addition__Group__1__Impl
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
    // InternalSelfCheckout.g:1655:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1659:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalSelfCheckout.g:1660:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalSelfCheckout.g:1660:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalSelfCheckout.g:1661:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalSelfCheckout.g:1662:2: ( rule__Addition__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSelfCheckout.g:1662:3: rule__Addition__Group_1__0
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
    // InternalSelfCheckout.g:1671:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1675:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalSelfCheckout.g:1676:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalSelfCheckout.g:1683:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1687:1: ( ( () ) )
            // InternalSelfCheckout.g:1688:1: ( () )
            {
            // InternalSelfCheckout.g:1688:1: ( () )
            // InternalSelfCheckout.g:1689:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalSelfCheckout.g:1690:2: ()
            // InternalSelfCheckout.g:1690:3: 
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
    // InternalSelfCheckout.g:1698:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1702:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalSelfCheckout.g:1703:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckout.g:1710:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1714:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckout.g:1715:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckout.g:1715:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalSelfCheckout.g:1716:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckout.g:1717:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalSelfCheckout.g:1717:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalSelfCheckout.g:1725:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1729:1: ( rule__Addition__Group_1__2__Impl )
            // InternalSelfCheckout.g:1730:2: rule__Addition__Group_1__2__Impl
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
    // InternalSelfCheckout.g:1736:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1740:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalSelfCheckout.g:1741:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckout.g:1741:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalSelfCheckout.g:1742:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckout.g:1743:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalSelfCheckout.g:1743:3: rule__Addition__RightAssignment_1_2
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
    // InternalSelfCheckout.g:1752:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1756:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalSelfCheckout.g:1757:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalSelfCheckout.g:1764:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1768:1: ( ( rulePrimary ) )
            // InternalSelfCheckout.g:1769:1: ( rulePrimary )
            {
            // InternalSelfCheckout.g:1769:1: ( rulePrimary )
            // InternalSelfCheckout.g:1770:2: rulePrimary
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
    // InternalSelfCheckout.g:1779:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1783:1: ( rule__Multiplication__Group__1__Impl )
            // InternalSelfCheckout.g:1784:2: rule__Multiplication__Group__1__Impl
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
    // InternalSelfCheckout.g:1790:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1794:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalSelfCheckout.g:1795:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalSelfCheckout.g:1795:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalSelfCheckout.g:1796:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalSelfCheckout.g:1797:2: ( rule__Multiplication__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelfCheckout.g:1797:3: rule__Multiplication__Group_1__0
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
    // InternalSelfCheckout.g:1806:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1810:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalSelfCheckout.g:1811:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalSelfCheckout.g:1818:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1822:1: ( ( () ) )
            // InternalSelfCheckout.g:1823:1: ( () )
            {
            // InternalSelfCheckout.g:1823:1: ( () )
            // InternalSelfCheckout.g:1824:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalSelfCheckout.g:1825:2: ()
            // InternalSelfCheckout.g:1825:3: 
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
    // InternalSelfCheckout.g:1833:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1837:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalSelfCheckout.g:1838:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckout.g:1845:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1849:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalSelfCheckout.g:1850:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalSelfCheckout.g:1850:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalSelfCheckout.g:1851:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalSelfCheckout.g:1852:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalSelfCheckout.g:1852:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalSelfCheckout.g:1860:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1864:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalSelfCheckout.g:1865:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalSelfCheckout.g:1871:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1875:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalSelfCheckout.g:1876:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalSelfCheckout.g:1876:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalSelfCheckout.g:1877:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalSelfCheckout.g:1878:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalSelfCheckout.g:1878:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalSelfCheckout.g:1887:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1891:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalSelfCheckout.g:1892:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSelfCheckout.g:1899:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1903:1: ( ( '(' ) )
            // InternalSelfCheckout.g:1904:1: ( '(' )
            {
            // InternalSelfCheckout.g:1904:1: ( '(' )
            // InternalSelfCheckout.g:1905:2: '('
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
    // InternalSelfCheckout.g:1914:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1918:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalSelfCheckout.g:1919:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
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
    // InternalSelfCheckout.g:1926:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1930:1: ( ( ruleAddition ) )
            // InternalSelfCheckout.g:1931:1: ( ruleAddition )
            {
            // InternalSelfCheckout.g:1931:1: ( ruleAddition )
            // InternalSelfCheckout.g:1932:2: ruleAddition
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
    // InternalSelfCheckout.g:1941:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1945:1: ( rule__Primary__Group_3__2__Impl )
            // InternalSelfCheckout.g:1946:2: rule__Primary__Group_3__2__Impl
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
    // InternalSelfCheckout.g:1952:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1956:1: ( ( ')' ) )
            // InternalSelfCheckout.g:1957:1: ( ')' )
            {
            // InternalSelfCheckout.g:1957:1: ( ')' )
            // InternalSelfCheckout.g:1958:2: ')'
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
    // InternalSelfCheckout.g:1968:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1972:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSelfCheckout.g:1973:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
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
    // InternalSelfCheckout.g:1980:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1984:1: ( ( ( RULE_INT )? ) )
            // InternalSelfCheckout.g:1985:1: ( ( RULE_INT )? )
            {
            // InternalSelfCheckout.g:1985:1: ( ( RULE_INT )? )
            // InternalSelfCheckout.g:1986:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalSelfCheckout.g:1987:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelfCheckout.g:1987:3: RULE_INT
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
    // InternalSelfCheckout.g:1995:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:1999:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSelfCheckout.g:2000:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSelfCheckout.g:2007:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2011:1: ( ( '.' ) )
            // InternalSelfCheckout.g:2012:1: ( '.' )
            {
            // InternalSelfCheckout.g:2012:1: ( '.' )
            // InternalSelfCheckout.g:2013:2: '.'
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
    // InternalSelfCheckout.g:2022:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2026:1: ( rule__REAL__Group__2__Impl )
            // InternalSelfCheckout.g:2027:2: rule__REAL__Group__2__Impl
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
    // InternalSelfCheckout.g:2033:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2037:1: ( ( RULE_INT ) )
            // InternalSelfCheckout.g:2038:1: ( RULE_INT )
            {
            // InternalSelfCheckout.g:2038:1: ( RULE_INT )
            // InternalSelfCheckout.g:2039:2: RULE_INT
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
    // InternalSelfCheckout.g:2049:1: rule__Checkout__Group__0 : rule__Checkout__Group__0__Impl rule__Checkout__Group__1 ;
    public final void rule__Checkout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2053:1: ( rule__Checkout__Group__0__Impl rule__Checkout__Group__1 )
            // InternalSelfCheckout.g:2054:2: rule__Checkout__Group__0__Impl rule__Checkout__Group__1
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
    // InternalSelfCheckout.g:2061:1: rule__Checkout__Group__0__Impl : ( 'go' ) ;
    public final void rule__Checkout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2065:1: ( ( 'go' ) )
            // InternalSelfCheckout.g:2066:1: ( 'go' )
            {
            // InternalSelfCheckout.g:2066:1: ( 'go' )
            // InternalSelfCheckout.g:2067:2: 'go'
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
    // InternalSelfCheckout.g:2076:1: rule__Checkout__Group__1 : rule__Checkout__Group__1__Impl rule__Checkout__Group__2 ;
    public final void rule__Checkout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2080:1: ( rule__Checkout__Group__1__Impl rule__Checkout__Group__2 )
            // InternalSelfCheckout.g:2081:2: rule__Checkout__Group__1__Impl rule__Checkout__Group__2
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
    // InternalSelfCheckout.g:2088:1: rule__Checkout__Group__1__Impl : ( 'to' ) ;
    public final void rule__Checkout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2092:1: ( ( 'to' ) )
            // InternalSelfCheckout.g:2093:1: ( 'to' )
            {
            // InternalSelfCheckout.g:2093:1: ( 'to' )
            // InternalSelfCheckout.g:2094:2: 'to'
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
    // InternalSelfCheckout.g:2103:1: rule__Checkout__Group__2 : rule__Checkout__Group__2__Impl rule__Checkout__Group__3 ;
    public final void rule__Checkout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2107:1: ( rule__Checkout__Group__2__Impl rule__Checkout__Group__3 )
            // InternalSelfCheckout.g:2108:2: rule__Checkout__Group__2__Impl rule__Checkout__Group__3
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
    // InternalSelfCheckout.g:2115:1: rule__Checkout__Group__2__Impl : ( 'till' ) ;
    public final void rule__Checkout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2119:1: ( ( 'till' ) )
            // InternalSelfCheckout.g:2120:1: ( 'till' )
            {
            // InternalSelfCheckout.g:2120:1: ( 'till' )
            // InternalSelfCheckout.g:2121:2: 'till'
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
    // InternalSelfCheckout.g:2130:1: rule__Checkout__Group__3 : rule__Checkout__Group__3__Impl rule__Checkout__Group__4 ;
    public final void rule__Checkout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2134:1: ( rule__Checkout__Group__3__Impl rule__Checkout__Group__4 )
            // InternalSelfCheckout.g:2135:2: rule__Checkout__Group__3__Impl rule__Checkout__Group__4
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
    // InternalSelfCheckout.g:2142:1: rule__Checkout__Group__3__Impl : ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) ;
    public final void rule__Checkout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2146:1: ( ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) ) )
            // InternalSelfCheckout.g:2147:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            {
            // InternalSelfCheckout.g:2147:1: ( ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* ) )
            // InternalSelfCheckout.g:2148:2: ( ( rule__Checkout__ScanAssignment_3 ) ) ( ( rule__Checkout__ScanAssignment_3 )* )
            {
            // InternalSelfCheckout.g:2148:2: ( ( rule__Checkout__ScanAssignment_3 ) )
            // InternalSelfCheckout.g:2149:3: ( rule__Checkout__ScanAssignment_3 )
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckout.g:2150:3: ( rule__Checkout__ScanAssignment_3 )
            // InternalSelfCheckout.g:2150:4: rule__Checkout__ScanAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__Checkout__ScanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 

            }

            // InternalSelfCheckout.g:2153:2: ( ( rule__Checkout__ScanAssignment_3 )* )
            // InternalSelfCheckout.g:2154:3: ( rule__Checkout__ScanAssignment_3 )*
            {
             before(grammarAccess.getCheckoutAccess().getScanAssignment_3()); 
            // InternalSelfCheckout.g:2155:3: ( rule__Checkout__ScanAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSelfCheckout.g:2155:4: rule__Checkout__ScanAssignment_3
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
    // InternalSelfCheckout.g:2164:1: rule__Checkout__Group__4 : rule__Checkout__Group__4__Impl ;
    public final void rule__Checkout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2168:1: ( rule__Checkout__Group__4__Impl )
            // InternalSelfCheckout.g:2169:2: rule__Checkout__Group__4__Impl
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
    // InternalSelfCheckout.g:2175:1: rule__Checkout__Group__4__Impl : ( ( rule__Checkout__PayAssignment_4 ) ) ;
    public final void rule__Checkout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2179:1: ( ( ( rule__Checkout__PayAssignment_4 ) ) )
            // InternalSelfCheckout.g:2180:1: ( ( rule__Checkout__PayAssignment_4 ) )
            {
            // InternalSelfCheckout.g:2180:1: ( ( rule__Checkout__PayAssignment_4 ) )
            // InternalSelfCheckout.g:2181:2: ( rule__Checkout__PayAssignment_4 )
            {
             before(grammarAccess.getCheckoutAccess().getPayAssignment_4()); 
            // InternalSelfCheckout.g:2182:2: ( rule__Checkout__PayAssignment_4 )
            // InternalSelfCheckout.g:2182:3: rule__Checkout__PayAssignment_4
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
    // InternalSelfCheckout.g:2191:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2195:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalSelfCheckout.g:2196:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
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
    // InternalSelfCheckout.g:2203:1: rule__Scan__Group__0__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2207:1: ( ( 'scan' ) )
            // InternalSelfCheckout.g:2208:1: ( 'scan' )
            {
            // InternalSelfCheckout.g:2208:1: ( 'scan' )
            // InternalSelfCheckout.g:2209:2: 'scan'
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
    // InternalSelfCheckout.g:2218:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl rule__Scan__Group__2 ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2222:1: ( rule__Scan__Group__1__Impl rule__Scan__Group__2 )
            // InternalSelfCheckout.g:2223:2: rule__Scan__Group__1__Impl rule__Scan__Group__2
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
    // InternalSelfCheckout.g:2230:1: rule__Scan__Group__1__Impl : ( 'at' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2234:1: ( ( 'at' ) )
            // InternalSelfCheckout.g:2235:1: ( 'at' )
            {
            // InternalSelfCheckout.g:2235:1: ( 'at' )
            // InternalSelfCheckout.g:2236:2: 'at'
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
    // InternalSelfCheckout.g:2245:1: rule__Scan__Group__2 : rule__Scan__Group__2__Impl rule__Scan__Group__3 ;
    public final void rule__Scan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2249:1: ( rule__Scan__Group__2__Impl rule__Scan__Group__3 )
            // InternalSelfCheckout.g:2250:2: rule__Scan__Group__2__Impl rule__Scan__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckout.g:2257:1: rule__Scan__Group__2__Impl : ( 'till' ) ;
    public final void rule__Scan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2261:1: ( ( 'till' ) )
            // InternalSelfCheckout.g:2262:1: ( 'till' )
            {
            // InternalSelfCheckout.g:2262:1: ( 'till' )
            // InternalSelfCheckout.g:2263:2: 'till'
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
    // InternalSelfCheckout.g:2272:1: rule__Scan__Group__3 : rule__Scan__Group__3__Impl rule__Scan__Group__4 ;
    public final void rule__Scan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2276:1: ( rule__Scan__Group__3__Impl rule__Scan__Group__4 )
            // InternalSelfCheckout.g:2277:2: rule__Scan__Group__3__Impl rule__Scan__Group__4
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
    // InternalSelfCheckout.g:2284:1: rule__Scan__Group__3__Impl : ( ( rule__Scan__NameAssignment_3 ) ) ;
    public final void rule__Scan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2288:1: ( ( ( rule__Scan__NameAssignment_3 ) ) )
            // InternalSelfCheckout.g:2289:1: ( ( rule__Scan__NameAssignment_3 ) )
            {
            // InternalSelfCheckout.g:2289:1: ( ( rule__Scan__NameAssignment_3 ) )
            // InternalSelfCheckout.g:2290:2: ( rule__Scan__NameAssignment_3 )
            {
             before(grammarAccess.getScanAccess().getNameAssignment_3()); 
            // InternalSelfCheckout.g:2291:2: ( rule__Scan__NameAssignment_3 )
            // InternalSelfCheckout.g:2291:3: rule__Scan__NameAssignment_3
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
    // InternalSelfCheckout.g:2299:1: rule__Scan__Group__4 : rule__Scan__Group__4__Impl ;
    public final void rule__Scan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2303:1: ( rule__Scan__Group__4__Impl )
            // InternalSelfCheckout.g:2304:2: rule__Scan__Group__4__Impl
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
    // InternalSelfCheckout.g:2310:1: rule__Scan__Group__4__Impl : ( ( rule__Scan__AddToBagAssignment_4 )* ) ;
    public final void rule__Scan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2314:1: ( ( ( rule__Scan__AddToBagAssignment_4 )* ) )
            // InternalSelfCheckout.g:2315:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            {
            // InternalSelfCheckout.g:2315:1: ( ( rule__Scan__AddToBagAssignment_4 )* )
            // InternalSelfCheckout.g:2316:2: ( rule__Scan__AddToBagAssignment_4 )*
            {
             before(grammarAccess.getScanAccess().getAddToBagAssignment_4()); 
            // InternalSelfCheckout.g:2317:2: ( rule__Scan__AddToBagAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSelfCheckout.g:2317:3: rule__Scan__AddToBagAssignment_4
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
    // InternalSelfCheckout.g:2326:1: rule__AddToBag__Group__0 : rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 ;
    public final void rule__AddToBag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2330:1: ( rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1 )
            // InternalSelfCheckout.g:2331:2: rule__AddToBag__Group__0__Impl rule__AddToBag__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSelfCheckout.g:2338:1: rule__AddToBag__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddToBag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2342:1: ( ( 'add' ) )
            // InternalSelfCheckout.g:2343:1: ( 'add' )
            {
            // InternalSelfCheckout.g:2343:1: ( 'add' )
            // InternalSelfCheckout.g:2344:2: 'add'
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
    // InternalSelfCheckout.g:2353:1: rule__AddToBag__Group__1 : rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 ;
    public final void rule__AddToBag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2357:1: ( rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2 )
            // InternalSelfCheckout.g:2358:2: rule__AddToBag__Group__1__Impl rule__AddToBag__Group__2
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
    // InternalSelfCheckout.g:2365:1: rule__AddToBag__Group__1__Impl : ( 'to' ) ;
    public final void rule__AddToBag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2369:1: ( ( 'to' ) )
            // InternalSelfCheckout.g:2370:1: ( 'to' )
            {
            // InternalSelfCheckout.g:2370:1: ( 'to' )
            // InternalSelfCheckout.g:2371:2: 'to'
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
    // InternalSelfCheckout.g:2380:1: rule__AddToBag__Group__2 : rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 ;
    public final void rule__AddToBag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2384:1: ( rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3 )
            // InternalSelfCheckout.g:2385:2: rule__AddToBag__Group__2__Impl rule__AddToBag__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSelfCheckout.g:2392:1: rule__AddToBag__Group__2__Impl : ( 'bag' ) ;
    public final void rule__AddToBag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2396:1: ( ( 'bag' ) )
            // InternalSelfCheckout.g:2397:1: ( 'bag' )
            {
            // InternalSelfCheckout.g:2397:1: ( 'bag' )
            // InternalSelfCheckout.g:2398:2: 'bag'
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
    // InternalSelfCheckout.g:2407:1: rule__AddToBag__Group__3 : rule__AddToBag__Group__3__Impl ;
    public final void rule__AddToBag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2411:1: ( rule__AddToBag__Group__3__Impl )
            // InternalSelfCheckout.g:2412:2: rule__AddToBag__Group__3__Impl
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
    // InternalSelfCheckout.g:2418:1: rule__AddToBag__Group__3__Impl : ( ( rule__AddToBag__BagItemAssignment_3 ) ) ;
    public final void rule__AddToBag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2422:1: ( ( ( rule__AddToBag__BagItemAssignment_3 ) ) )
            // InternalSelfCheckout.g:2423:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            {
            // InternalSelfCheckout.g:2423:1: ( ( rule__AddToBag__BagItemAssignment_3 ) )
            // InternalSelfCheckout.g:2424:2: ( rule__AddToBag__BagItemAssignment_3 )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemAssignment_3()); 
            // InternalSelfCheckout.g:2425:2: ( rule__AddToBag__BagItemAssignment_3 )
            // InternalSelfCheckout.g:2425:3: rule__AddToBag__BagItemAssignment_3
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


    // $ANTLR start "rule__Self_checkout__PickAssignment_0_0"
    // InternalSelfCheckout.g:2434:1: rule__Self_checkout__PickAssignment_0_0 : ( rulePick ) ;
    public final void rule__Self_checkout__PickAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2438:1: ( ( rulePick ) )
            // InternalSelfCheckout.g:2439:2: ( rulePick )
            {
            // InternalSelfCheckout.g:2439:2: ( rulePick )
            // InternalSelfCheckout.g:2440:3: rulePick
            {
             before(grammarAccess.getSelf_checkoutAccess().getPickPickParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePick();

            state._fsp--;

             after(grammarAccess.getSelf_checkoutAccess().getPickPickParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self_checkout__PickAssignment_0_0"


    // $ANTLR start "rule__Self_checkout__WalkstatementsAssignment_0_1"
    // InternalSelfCheckout.g:2449:1: rule__Self_checkout__WalkstatementsAssignment_0_1 : ( ruleWalkStatement ) ;
    public final void rule__Self_checkout__WalkstatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2453:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckout.g:2454:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckout.g:2454:2: ( ruleWalkStatement )
            // InternalSelfCheckout.g:2455:3: ruleWalkStatement
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
    // InternalSelfCheckout.g:2464:1: rule__Self_checkout__CheckoutAssignment_1 : ( ruleCheckout ) ;
    public final void rule__Self_checkout__CheckoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2468:1: ( ( ruleCheckout ) )
            // InternalSelfCheckout.g:2469:2: ( ruleCheckout )
            {
            // InternalSelfCheckout.g:2469:2: ( ruleCheckout )
            // InternalSelfCheckout.g:2470:3: ruleCheckout
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


    // $ANTLR start "rule__Choose__PickAssignment"
    // InternalSelfCheckout.g:2479:1: rule__Choose__PickAssignment : ( rulePick ) ;
    public final void rule__Choose__PickAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2483:1: ( ( rulePick ) )
            // InternalSelfCheckout.g:2484:2: ( rulePick )
            {
            // InternalSelfCheckout.g:2484:2: ( rulePick )
            // InternalSelfCheckout.g:2485:3: rulePick
            {
             before(grammarAccess.getChooseAccess().getPickPickParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePick();

            state._fsp--;

             after(grammarAccess.getChooseAccess().getPickPickParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__PickAssignment"


    // $ANTLR start "rule__Pick__NameAssignment_2"
    // InternalSelfCheckout.g:2494:1: rule__Pick__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pick__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2498:1: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2499:2: ( RULE_ID )
            {
            // InternalSelfCheckout.g:2499:2: ( RULE_ID )
            // InternalSelfCheckout.g:2500:3: RULE_ID
            {
             before(grammarAccess.getPickAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPickAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__NameAssignment_2"


    // $ANTLR start "rule__Pick__HoldingItemAssignment_3"
    // InternalSelfCheckout.g:2509:1: rule__Pick__HoldingItemAssignment_3 : ( ( rule__Pick__HoldingItemAlternatives_3_0 ) ) ;
    public final void rule__Pick__HoldingItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2513:1: ( ( ( rule__Pick__HoldingItemAlternatives_3_0 ) ) )
            // InternalSelfCheckout.g:2514:2: ( ( rule__Pick__HoldingItemAlternatives_3_0 ) )
            {
            // InternalSelfCheckout.g:2514:2: ( ( rule__Pick__HoldingItemAlternatives_3_0 ) )
            // InternalSelfCheckout.g:2515:3: ( rule__Pick__HoldingItemAlternatives_3_0 )
            {
             before(grammarAccess.getPickAccess().getHoldingItemAlternatives_3_0()); 
            // InternalSelfCheckout.g:2516:3: ( rule__Pick__HoldingItemAlternatives_3_0 )
            // InternalSelfCheckout.g:2516:4: rule__Pick__HoldingItemAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Pick__HoldingItemAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPickAccess().getHoldingItemAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pick__HoldingItemAssignment_3"


    // $ANTLR start "rule__AddToBasket__ItemAssignment_3"
    // InternalSelfCheckout.g:2524:1: rule__AddToBasket__ItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBasket__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2528:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckout.g:2529:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckout.g:2529:2: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2530:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBasketAccess().getItemPickCrossReference_3_0()); 
            // InternalSelfCheckout.g:2531:3: ( RULE_ID )
            // InternalSelfCheckout.g:2532:4: RULE_ID
            {
             before(grammarAccess.getAddToBasketAccess().getItemPickIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToBasketAccess().getItemPickIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddToBasketAccess().getItemPickCrossReference_3_0()); 

            }


            }

        }
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
    // InternalSelfCheckout.g:2543:1: rule__Drop__ItemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2547:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckout.g:2548:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckout.g:2548:2: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2549:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getItemPickCrossReference_1_0()); 
            // InternalSelfCheckout.g:2550:3: ( RULE_ID )
            // InternalSelfCheckout.g:2551:4: RULE_ID
            {
             before(grammarAccess.getDropAccess().getItemPickIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getItemPickIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDropAccess().getItemPickCrossReference_1_0()); 

            }


            }

        }
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
    // InternalSelfCheckout.g:2562:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2566:1: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2567:2: ( RULE_ID )
            {
            // InternalSelfCheckout.g:2567:2: ( RULE_ID )
            // InternalSelfCheckout.g:2568:3: RULE_ID
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
    // InternalSelfCheckout.g:2577:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2581:1: ( ( RULE_INT ) )
            // InternalSelfCheckout.g:2582:2: ( RULE_INT )
            {
            // InternalSelfCheckout.g:2582:2: ( RULE_INT )
            // InternalSelfCheckout.g:2583:3: RULE_INT
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
    // InternalSelfCheckout.g:2592:1: rule__LoopStatement__CountAssignment_0 : ( ruleAddition ) ;
    public final void rule__LoopStatement__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2596:1: ( ( ruleAddition ) )
            // InternalSelfCheckout.g:2597:2: ( ruleAddition )
            {
            // InternalSelfCheckout.g:2597:2: ( ruleAddition )
            // InternalSelfCheckout.g:2598:3: ruleAddition
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
    // InternalSelfCheckout.g:2607:1: rule__LoopStatement__StatementsAssignment_3 : ( ruleWalkStatement ) ;
    public final void rule__LoopStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2611:1: ( ( ruleWalkStatement ) )
            // InternalSelfCheckout.g:2612:2: ( ruleWalkStatement )
            {
            // InternalSelfCheckout.g:2612:2: ( ruleWalkStatement )
            // InternalSelfCheckout.g:2613:3: ruleWalkStatement
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
    // InternalSelfCheckout.g:2622:1: rule__MoveStatement__CommandAssignment_0 : ( ruleMoveCommand ) ;
    public final void rule__MoveStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2626:1: ( ( ruleMoveCommand ) )
            // InternalSelfCheckout.g:2627:2: ( ruleMoveCommand )
            {
            // InternalSelfCheckout.g:2627:2: ( ruleMoveCommand )
            // InternalSelfCheckout.g:2628:3: ruleMoveCommand
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
    // InternalSelfCheckout.g:2637:1: rule__MoveStatement__StepsAssignment_2 : ( ruleAddition ) ;
    public final void rule__MoveStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2641:1: ( ( ruleAddition ) )
            // InternalSelfCheckout.g:2642:2: ( ruleAddition )
            {
            // InternalSelfCheckout.g:2642:2: ( ruleAddition )
            // InternalSelfCheckout.g:2643:3: ruleAddition
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
    // InternalSelfCheckout.g:2652:1: rule__TurnStatement__CommandAssignment_1 : ( ruleTurnCommand ) ;
    public final void rule__TurnStatement__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2656:1: ( ( ruleTurnCommand ) )
            // InternalSelfCheckout.g:2657:2: ( ruleTurnCommand )
            {
            // InternalSelfCheckout.g:2657:2: ( ruleTurnCommand )
            // InternalSelfCheckout.g:2658:3: ruleTurnCommand
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
    // InternalSelfCheckout.g:2667:1: rule__TurnStatement__DegreesAssignment_3 : ( ruleAddition ) ;
    public final void rule__TurnStatement__DegreesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2671:1: ( ( ruleAddition ) )
            // InternalSelfCheckout.g:2672:2: ( ruleAddition )
            {
            // InternalSelfCheckout.g:2672:2: ( ruleAddition )
            // InternalSelfCheckout.g:2673:3: ruleAddition
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
    // InternalSelfCheckout.g:2682:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2686:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckout.g:2687:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckout.g:2687:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckout.g:2688:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckout.g:2689:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckout.g:2689:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckout.g:2697:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2701:1: ( ( ruleMultiplication ) )
            // InternalSelfCheckout.g:2702:2: ( ruleMultiplication )
            {
            // InternalSelfCheckout.g:2702:2: ( ruleMultiplication )
            // InternalSelfCheckout.g:2703:3: ruleMultiplication
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
    // InternalSelfCheckout.g:2712:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2716:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalSelfCheckout.g:2717:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSelfCheckout.g:2717:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalSelfCheckout.g:2718:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSelfCheckout.g:2719:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalSelfCheckout.g:2719:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalSelfCheckout.g:2727:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2731:1: ( ( rulePrimary ) )
            // InternalSelfCheckout.g:2732:2: ( rulePrimary )
            {
            // InternalSelfCheckout.g:2732:2: ( rulePrimary )
            // InternalSelfCheckout.g:2733:3: rulePrimary
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
    // InternalSelfCheckout.g:2742:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2746:1: ( ( RULE_INT ) )
            // InternalSelfCheckout.g:2747:2: ( RULE_INT )
            {
            // InternalSelfCheckout.g:2747:2: ( RULE_INT )
            // InternalSelfCheckout.g:2748:3: RULE_INT
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
    // InternalSelfCheckout.g:2757:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2761:1: ( ( ruleREAL ) )
            // InternalSelfCheckout.g:2762:2: ( ruleREAL )
            {
            // InternalSelfCheckout.g:2762:2: ( ruleREAL )
            // InternalSelfCheckout.g:2763:3: ruleREAL
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
    // InternalSelfCheckout.g:2772:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2776:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckout.g:2777:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckout.g:2777:2: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2778:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalSelfCheckout.g:2779:3: ( RULE_ID )
            // InternalSelfCheckout.g:2780:4: RULE_ID
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
    // InternalSelfCheckout.g:2791:1: rule__Checkout__ScanAssignment_3 : ( ruleScan ) ;
    public final void rule__Checkout__ScanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2795:1: ( ( ruleScan ) )
            // InternalSelfCheckout.g:2796:2: ( ruleScan )
            {
            // InternalSelfCheckout.g:2796:2: ( ruleScan )
            // InternalSelfCheckout.g:2797:3: ruleScan
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
    // InternalSelfCheckout.g:2806:1: rule__Checkout__PayAssignment_4 : ( rulePay ) ;
    public final void rule__Checkout__PayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2810:1: ( ( rulePay ) )
            // InternalSelfCheckout.g:2811:2: ( rulePay )
            {
            // InternalSelfCheckout.g:2811:2: ( rulePay )
            // InternalSelfCheckout.g:2812:3: rulePay
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
    // InternalSelfCheckout.g:2821:1: rule__Scan__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Scan__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2825:1: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2826:2: ( RULE_ID )
            {
            // InternalSelfCheckout.g:2826:2: ( RULE_ID )
            // InternalSelfCheckout.g:2827:3: RULE_ID
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
    // InternalSelfCheckout.g:2836:1: rule__Scan__AddToBagAssignment_4 : ( ruleAddToBag ) ;
    public final void rule__Scan__AddToBagAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2840:1: ( ( ruleAddToBag ) )
            // InternalSelfCheckout.g:2841:2: ( ruleAddToBag )
            {
            // InternalSelfCheckout.g:2841:2: ( ruleAddToBag )
            // InternalSelfCheckout.g:2842:3: ruleAddToBag
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
    // InternalSelfCheckout.g:2851:1: rule__AddToBag__BagItemAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddToBag__BagItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelfCheckout.g:2855:1: ( ( ( RULE_ID ) ) )
            // InternalSelfCheckout.g:2856:2: ( ( RULE_ID ) )
            {
            // InternalSelfCheckout.g:2856:2: ( ( RULE_ID ) )
            // InternalSelfCheckout.g:2857:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToBagAccess().getBagItemScanCrossReference_3_0()); 
            // InternalSelfCheckout.g:2858:3: ( RULE_ID )
            // InternalSelfCheckout.g:2859:4: RULE_ID
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001284130030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001080000030L});
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