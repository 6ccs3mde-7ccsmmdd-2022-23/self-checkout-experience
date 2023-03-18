/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import self_checkout_experience.ide.contentassist.antlr.internal.InternalSelfCheckoutExperienceParser;
import self_checkout_experience.services.SelfCheckoutExperienceGrammarAccess;

public class SelfCheckoutExperienceParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SelfCheckoutExperienceGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SelfCheckoutExperienceGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSelfCheckoutExperienceAccess().getAlternatives(), "rule__SelfCheckoutExperience__Alternatives");
			builder.put(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAlternatives_1_0(), "rule__SelfCheckoutInstore__StatementAlternatives_1_0");
			builder.put(grammarAccess.getPickStatementAccess().getHoldingItemAlternatives_6_0(), "rule__PickStatement__HoldingItemAlternatives_6_0");
			builder.put(grammarAccess.getWalkStatementAccess().getAlternatives(), "rule__WalkStatement__Alternatives");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0(), "rule__Addition__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0(), "rule__Multiplication__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getDeliveryOptionsAccess().getAlternatives(), "rule__DeliveryOptions__Alternatives");
			builder.put(grammarAccess.getMoveCommandAccess().getAlternatives(), "rule__MoveCommand__Alternatives");
			builder.put(grammarAccess.getTurnCommandAccess().getAlternatives(), "rule__TurnCommand__Alternatives");
			builder.put(grammarAccess.getCarryAccess().getAlternatives(), "rule__Carry__Alternatives");
			builder.put(grammarAccess.getSelfCheckoutOnlineAccess().getGroup(), "rule__SelfCheckoutOnline__Group__0");
			builder.put(grammarAccess.getSearchAccess().getGroup(), "rule__Search__Group__0");
			builder.put(grammarAccess.getAddToOnlineBasketAccess().getGroup(), "rule__AddToOnlineBasket__Group__0");
			builder.put(grammarAccess.getRemoveFromOnlineBasketAccess().getGroup(), "rule__RemoveFromOnlineBasket__Group__0");
			builder.put(grammarAccess.getOnlineCheckoutAccess().getGroup(), "rule__OnlineCheckout__Group__0");
			builder.put(grammarAccess.getConfirmAccess().getGroup(), "rule__Confirm__Group__0");
			builder.put(grammarAccess.getSelfCheckoutInstoreAccess().getGroup(), "rule__SelfCheckoutInstore__Group__0");
			builder.put(grammarAccess.getHoldSelfScannerAccess().getGroup(), "rule__HoldSelfScanner__Group__0");
			builder.put(grammarAccess.getPickStatementAccess().getGroup(), "rule__PickStatement__Group__0");
			builder.put(grammarAccess.getScanAndAddToBasketAccess().getGroup(), "rule__ScanAndAddToBasket__Group__0");
			builder.put(grammarAccess.getDropAccess().getGroup(), "rule__Drop__Group__0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
			builder.put(grammarAccess.getRepeatAccess().getGroup(), "rule__Repeat__Group__0");
			builder.put(grammarAccess.getMoveStatementAccess().getGroup(), "rule__MoveStatement__Group__0");
			builder.put(grammarAccess.getTurnStatementAccess().getGroup(), "rule__TurnStatement__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getCheckoutAccess().getGroup(), "rule__Checkout__Group__0");
			builder.put(grammarAccess.getScanExpressionAccess().getGroup(), "rule__ScanExpression__Group__0");
			builder.put(grammarAccess.getScanExpressionAccess().getGroup_1(), "rule__ScanExpression__Group_1__0");
			builder.put(grammarAccess.getScanAccess().getGroup(), "rule__Scan__Group__0");
			builder.put(grammarAccess.getCarryItemsAccess().getGroup(), "rule__CarryItems__Group__0");
			builder.put(grammarAccess.getSelf_checkoutAccess().getSelfCheckoutExperienceAssignment(), "rule__Self_checkout__SelfCheckoutExperienceAssignment");
			builder.put(grammarAccess.getSelfCheckoutOnlineAccess().getLoadShoppingSiteAssignment_0(), "rule__SelfCheckoutOnline__LoadShoppingSiteAssignment_0");
			builder.put(grammarAccess.getSelfCheckoutOnlineAccess().getSearchAssignment_1(), "rule__SelfCheckoutOnline__SearchAssignment_1");
			builder.put(grammarAccess.getSelfCheckoutOnlineAccess().getOnlineCheckoutAssignment_2(), "rule__SelfCheckoutOnline__OnlineCheckoutAssignment_2");
			builder.put(grammarAccess.getSearchAccess().getItemSearchAssignment_2(), "rule__Search__ItemSearchAssignment_2");
			builder.put(grammarAccess.getSearchAccess().getAddToOnlineBasketAssignment_3(), "rule__Search__AddToOnlineBasketAssignment_3");
			builder.put(grammarAccess.getAddToOnlineBasketAccess().getItemCountAssignment_4(), "rule__AddToOnlineBasket__ItemCountAssignment_4");
			builder.put(grammarAccess.getAddToOnlineBasketAccess().getItemAssignment_6(), "rule__AddToOnlineBasket__ItemAssignment_6");
			builder.put(grammarAccess.getAddToOnlineBasketAccess().getRemoveFromOnlineBasketAssignment_7(), "rule__AddToOnlineBasket__RemoveFromOnlineBasketAssignment_7");
			builder.put(grammarAccess.getRemoveFromOnlineBasketAccess().getRemoveItemAssignment_3(), "rule__RemoveFromOnlineBasket__RemoveItemAssignment_3");
			builder.put(grammarAccess.getOnlineCheckoutAccess().getDeliveryOptionsAssignment_1(), "rule__OnlineCheckout__DeliveryOptionsAssignment_1");
			builder.put(grammarAccess.getOnlineCheckoutAccess().getConfirmAssignment_2(), "rule__OnlineCheckout__ConfirmAssignment_2");
			builder.put(grammarAccess.getConfirmAccess().getConfirmEnumAssignment_0(), "rule__Confirm__ConfirmEnumAssignment_0");
			builder.put(grammarAccess.getConfirmAccess().getPayAssignment_1(), "rule__Confirm__PayAssignment_1");
			builder.put(grammarAccess.getSelfCheckoutInstoreAccess().getPickScanMachineAssignment_0(), "rule__SelfCheckoutInstore__PickScanMachineAssignment_0");
			builder.put(grammarAccess.getSelfCheckoutInstoreAccess().getStatementAssignment_1(), "rule__SelfCheckoutInstore__StatementAssignment_1");
			builder.put(grammarAccess.getSelfCheckoutInstoreAccess().getCheckoutAssignment_2(), "rule__SelfCheckoutInstore__CheckoutAssignment_2");
			builder.put(grammarAccess.getHoldSelfScannerAccess().getScanMachineAssignment_1(), "rule__HoldSelfScanner__ScanMachineAssignment_1");
			builder.put(grammarAccess.getPickStatementAccess().getItemCountAssignment_3(), "rule__PickStatement__ItemCountAssignment_3");
			builder.put(grammarAccess.getPickStatementAccess().getItemPickedAssignment_5(), "rule__PickStatement__ItemPickedAssignment_5");
			builder.put(grammarAccess.getPickStatementAccess().getHoldingItemAssignment_6(), "rule__PickStatement__HoldingItemAssignment_6");
			builder.put(grammarAccess.getItemDefAccess().getNameAssignment(), "rule__ItemDef__NameAssignment");
			builder.put(grammarAccess.getScanAndAddToBasketAccess().getItemInBasketAssignment_5(), "rule__ScanAndAddToBasket__ItemInBasketAssignment_5");
			builder.put(grammarAccess.getDropAccess().getItemDroppedAssignment_1(), "rule__Drop__ItemDroppedAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3(), "rule__VariableDeclaration__ValueAssignment_3");
			builder.put(grammarAccess.getRepeatAccess().getCountAssignment_1(), "rule__Repeat__CountAssignment_1");
			builder.put(grammarAccess.getRepeatAccess().getStatementsAssignment_3(), "rule__Repeat__StatementsAssignment_3");
			builder.put(grammarAccess.getMoveStatementAccess().getCommandAssignment_0(), "rule__MoveStatement__CommandAssignment_0");
			builder.put(grammarAccess.getMoveStatementAccess().getStepsAssignment_2(), "rule__MoveStatement__StepsAssignment_2");
			builder.put(grammarAccess.getTurnStatementAccess().getCommandAssignment_1(), "rule__TurnStatement__CommandAssignment_1");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1(), "rule__Addition__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1(), "rule__Multiplication__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
			builder.put(grammarAccess.getIntLiteralAccess().getValAssignment(), "rule__IntLiteral__ValAssignment");
			builder.put(grammarAccess.getIntVarExpressionAccess().getVarAssignment(), "rule__IntVarExpression__VarAssignment");
			builder.put(grammarAccess.getCheckoutAccess().getScanAssignment_3(), "rule__Checkout__ScanAssignment_3");
			builder.put(grammarAccess.getCheckoutAccess().getPayAssignment_4(), "rule__Checkout__PayAssignment_4");
			builder.put(grammarAccess.getScanExpressionAccess().getNextAssignment_1_2(), "rule__ScanExpression__NextAssignment_1_2");
			builder.put(grammarAccess.getScanAccess().getScanMachineAssignment_3(), "rule__Scan__ScanMachineAssignment_3");
			builder.put(grammarAccess.getCarryItemsAccess().getCarryAssignment_0(), "rule__CarryItems__CarryAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SelfCheckoutExperienceGrammarAccess grammarAccess;

	@Override
	protected InternalSelfCheckoutExperienceParser createParser() {
		InternalSelfCheckoutExperienceParser result = new InternalSelfCheckoutExperienceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SelfCheckoutExperienceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SelfCheckoutExperienceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
