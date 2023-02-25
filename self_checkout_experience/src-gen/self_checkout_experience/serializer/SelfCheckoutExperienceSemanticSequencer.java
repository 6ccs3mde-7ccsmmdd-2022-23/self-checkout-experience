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
import self_checkout_experience.selfCheckoutExperience.AddToBasket;
import self_checkout_experience.selfCheckoutExperience.Addition;
import self_checkout_experience.selfCheckoutExperience.Checkout;
import self_checkout_experience.selfCheckoutExperience.Drop;
import self_checkout_experience.selfCheckoutExperience.IntLiteral;
import self_checkout_experience.selfCheckoutExperience.IntVarExpression;
import self_checkout_experience.selfCheckoutExperience.LoopStatement;
import self_checkout_experience.selfCheckoutExperience.MoveStatement;
import self_checkout_experience.selfCheckoutExperience.Multiplication;
import self_checkout_experience.selfCheckoutExperience.PickStatement;
import self_checkout_experience.selfCheckoutExperience.RealLiteral;
import self_checkout_experience.selfCheckoutExperience.Scan;
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
			case SelfCheckoutExperiencePackage.ADD_TO_BASKET:
				sequence_AddToBasket(context, (AddToBasket) semanticObject); 
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
			case SelfCheckoutExperiencePackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.LOOP_STATEMENT:
				sequence_LoopStatement(context, (LoopStatement) semanticObject); 
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
			case SelfCheckoutExperiencePackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case SelfCheckoutExperiencePackage.SCAN:
				sequence_Scan(context, (Scan) semanticObject); 
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
	 *     bagItem=[Scan|ID]
	 */
	protected void sequence_AddToBag(ISerializationContext context, AddToBag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BAG__BAG_ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BAG__BAG_ITEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddToBagAccess().getBagItemScanIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.ADD_TO_BAG__BAG_ITEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AddToBasket returns AddToBasket
	 *
	 * Constraint:
	 *     item=[PickStatement|ID]
	 */
	protected void sequence_AddToBasket(ISerializationContext context, AddToBasket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BASKET__ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.ADD_TO_BASKET__ITEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddToBasketAccess().getItemPickStatementIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.ADD_TO_BASKET__ITEM, false));
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
	 *     (scan+=Scan+ pay=Pay)
	 */
	protected void sequence_Checkout(ISerializationContext context, Checkout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Drop returns Drop
	 *
	 * Constraint:
	 *     item=[PickStatement|ID]
	 */
	protected void sequence_Drop(ISerializationContext context, Drop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.DROP__ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.DROP__ITEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropAccess().getItemPickStatementIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SelfCheckoutExperiencePackage.Literals.DROP__ITEM, false));
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
	 *     WalkStatement returns LoopStatement
	 *     LoopStatement returns LoopStatement
	 *
	 * Constraint:
	 *     (count=Addition statements+=WalkStatement+)
	 */
	protected void sequence_LoopStatement(ISerializationContext context, LoopStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (itemCount=Addition name=ID (holdingItem=AddToBasket | holdingItem=Drop))
	 */
	protected void sequence_PickStatement(ISerializationContext context, PickStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns RealLiteral
	 *     Addition.Addition_1_0 returns RealLiteral
	 *     Multiplication returns RealLiteral
	 *     Multiplication.Multiplication_1_0 returns RealLiteral
	 *     Primary returns RealLiteral
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.REAL_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.REAL_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scan returns Scan
	 *
	 * Constraint:
	 *     (name=ID addToBag+=AddToBag*)
	 */
	protected void sequence_Scan(ISerializationContext context, Scan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Self_checkout returns Self_checkout
	 *
	 * Constraint:
	 *     (((pickstatemens+=PickStatement | walkstatements+=WalkStatement)+ checkout=Checkout) | checkout=Checkout)?
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
	 *     (command=TurnCommand degrees=Addition)
	 */
	protected void sequence_TurnStatement(ISerializationContext context, TurnStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__COMMAND));
			if (transientValues.isValueTransient(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__DEGREES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelfCheckoutExperiencePackage.Literals.TURN_STATEMENT__DEGREES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnStatementAccess().getCommandTurnCommandEnumRuleCall_1_0(), semanticObject.getCommand());
		feeder.accept(grammarAccess.getTurnStatementAccess().getDegreesAdditionParserRuleCall_3_0(), semanticObject.getDegrees());
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
