/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import self_checkout_experience.selfCheckoutExperience.AddToBag;
import self_checkout_experience.selfCheckoutExperience.Addition;
import self_checkout_experience.selfCheckoutExperience.Checkout;
import self_checkout_experience.selfCheckoutExperience.Drop;
import self_checkout_experience.selfCheckoutExperience.HoldSelfScanner;
import self_checkout_experience.selfCheckoutExperience.IntLiteral;
import self_checkout_experience.selfCheckoutExperience.IntVarExpression;
import self_checkout_experience.selfCheckoutExperience.ItemDef;
import self_checkout_experience.selfCheckoutExperience.MoveStatement;
import self_checkout_experience.selfCheckoutExperience.Multiplication;
import self_checkout_experience.selfCheckoutExperience.PickStatement;
import self_checkout_experience.selfCheckoutExperience.Repeat;
import self_checkout_experience.selfCheckoutExperience.Scan;
import self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;
import self_checkout_experience.selfCheckoutExperience.Self_checkout;
import self_checkout_experience.selfCheckoutExperience.TurnStatement;
import self_checkout_experience.selfCheckoutExperience.VariableDeclaration;
import self_checkout_experience.services.SelfCheckoutExperienceGrammarAccess;

@SuppressWarnings("all")
public class SelfCheckoutExperienceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SelfCheckoutExperienceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SelfCheckoutExperiencePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SelfCheckoutExperiencePackage.ADD_TO_BAG:
				sequence_AddToBag(context, (AddToBag) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.CHECKOUT:
				sequence_Checkout(context, (Checkout) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.DROP:
				sequence_Drop(context, (Drop) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.HOLD_SELF_SCANNER:
				sequence_HoldSelfScanner(context, (HoldSelfScanner) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.ITEM_DEF:
				sequence_ItemDef(context, (ItemDef) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.MOVE_STATEMENT:
				sequence_MoveStatement(context, (MoveStatement) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.PICK_STATEMENT:
				sequence_PickStatement(context, (PickStatement) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.REPEAT:
				sequence_Repeat(context, (Repeat) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.SCAN:
				sequence_Scan(context, (Scan) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.SCAN_AND_ADD_TO_BASKET:
				sequence_ScanAndAddToBasket(context, (ScanAndAddToBasket) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.SELF_CHECKOUT:
				sequence_Self_checkout(context, (Self_checkout) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.TURN_STATEMENT:
				sequence_TurnStatement(context, (TurnStatement) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddToBag returns AddToBag
	 *
	 * Constraint:
	 *     bag=Bag
	 */
	protected void sequence_AddToBag(ISerializationContext context, AddToBag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BAG__BAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BAG__BAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddToBagAccess().getBagBagEnumRuleCall_4_0(), semanticObject.getBag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Primary returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator+='+' | operator+='-') right+=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Checkout returns Checkout
	 *
	 * Constraint:
	 *     (scan=Scan pay=Pay)
	 */
	protected void sequence_Checkout(ISerializationContext context, Checkout semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.CHECKOUT__SCAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.CHECKOUT__SCAN));
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.CHECKOUT__PAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.CHECKOUT__PAY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckoutAccess().getScanScanParserRuleCall_3_0(), semanticObject.getScan());
		feeder.accept(grammarAccess.getCheckoutAccess().getPayPayEnumRuleCall_4_0(), semanticObject.getPay());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Drop returns Drop
	 *
	 * Constraint:
	 *     itemDropped=[ItemDef|ID]
	 */
	protected void sequence_Drop(ISerializationContext context, Drop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.DROP__ITEM_DROPPED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.DROP__ITEM_DROPPED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropAccess().getItemDroppedItemDefIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.DROP__ITEM_DROPPED, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HoldSelfScanner returns HoldSelfScanner
	 *
	 * Constraint:
	 *     scanMachine=SelfScanner
	 */
	protected void sequence_HoldSelfScanner(ISerializationContext context, HoldSelfScanner semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.HOLD_SELF_SCANNER__SCAN_MACHINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.HOLD_SELF_SCANNER__SCAN_MACHINE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHoldSelfScannerAccess().getScanMachineSelfScannerEnumRuleCall_1_0(), semanticObject.getScanMachine());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntLiteral
	 *     Addition.Addition_1_0 returns IntLiteral
	 *     Multiplication returns IntLiteral
	 *     Multiplication.Multiplication_1_0 returns IntLiteral
	 *     Primary returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.INT_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.INT_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntVarExpression
	 *     Addition.Addition_1_0 returns IntVarExpression
	 *     Multiplication returns IntVarExpression
	 *     Multiplication.Multiplication_1_0 returns IntVarExpression
	 *     Primary returns IntVarExpression
	 *     IntVarExpression returns IntVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 */
	protected void sequence_IntVarExpression(ISerializationContext context, IntVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.INT_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.INT_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.INT_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ItemDef returns ItemDef
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ItemDef(ISerializationContext context, ItemDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.ITEM_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.ITEM_DEF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemDefAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WalkStatement returns MoveStatement
	 *     MoveStatement returns MoveStatement
	 *
	 * Constraint:
	 *     (command=MoveCommand steps=Addition)
	 */
	protected void sequence_MoveStatement(ISerializationContext context, MoveStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.MOVE_STATEMENT__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.MOVE_STATEMENT__COMMAND));
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.MOVE_STATEMENT__STEPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.MOVE_STATEMENT__STEPS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveStatementAccess().getCommandMoveCommandEnumRuleCall_0_0(), semanticObject.getCommand());
		feeder.accept(grammarAccess.getMoveStatementAccess().getStepsAdditionParserRuleCall_2_0(), semanticObject.getSteps());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Primary returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator+='*' | operator+='/') right+=Primary)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PickStatement returns PickStatement
	 *
	 * Constraint:
	 *     (itemCount=Addition itemPicked=ItemDef (holdingItem=ScanAndAddToBasket | holdingItem=Drop))
	 */
	protected void sequence_PickStatement(ISerializationContext context, PickStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WalkStatement returns Repeat
	 *     Repeat returns Repeat
	 *
	 * Constraint:
	 *     (count=Addition (statements+=WalkStatement | statements+=PickStatement)+)
	 */
	protected void sequence_Repeat(ISerializationContext context, Repeat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScanAndAddToBasket returns ScanAndAddToBasket
	 *
	 * Constraint:
	 *     itemInBasket=[ItemDef|ID]
	 */
	protected void sequence_ScanAndAddToBasket(ISerializationContext context, ScanAndAddToBasket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.SCAN_AND_ADD_TO_BASKET__ITEM_IN_BASKET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.SCAN_AND_ADD_TO_BASKET__ITEM_IN_BASKET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketItemDefIDTerminalRuleCall_5_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.SCAN_AND_ADD_TO_BASKET__ITEM_IN_BASKET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scan returns Scan
	 *
	 * Constraint:
	 *     (scanMachine=SelfScanner addToBag=AddToBag?)
	 */
	protected void sequence_Scan(ISerializationContext context, Scan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Self_checkout returns Self_checkout
	 *
	 * Constraint:
	 *     (pickScanMachine=HoldSelfScanner (pickstatements+=PickStatement | walkstatements+=WalkStatement)* checkout=Checkout?)
	 */
	protected void sequence_Self_checkout(ISerializationContext context, Self_checkout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WalkStatement returns TurnStatement
	 *     TurnStatement returns TurnStatement
	 *
	 * Constraint:
	 *     command=TurnCommand
	 */
	protected void sequence_TurnStatement(ISerializationContext context, TurnStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0(), semanticObject.getCommand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WalkStatement returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.VARIABLE_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.VARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.VARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
