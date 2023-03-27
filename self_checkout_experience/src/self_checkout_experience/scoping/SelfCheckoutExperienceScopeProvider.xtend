package self_checkout_experience.scoping
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EReference
import static extension org.eclipse.xtext.EcoreUtil2.*
import static org.eclipse.xtext.scoping.Scopes.*
import org.eclipse.emf.ecore.EObject
import self_checkout_experience.selfCheckoutExperience.IntVarExpression
import self_checkout_experience.selfCheckoutExperience.VariableDeclaration
import self_checkout_experience.selfCheckoutExperience.Repeat
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutInstore
import self_checkout_experience.selfCheckoutExperience.AddToOnlineBasket
import self_checkout_experience.selfCheckoutExperience.ItemDef
import self_checkout_experience.selfCheckoutExperience.Drop
import self_checkout_experience.selfCheckoutExperience.RemoveFromOnlineBasket
import self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket
import self_checkout_experience.selfCheckoutExperience.Search
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutOnline

class SelfCheckoutExperienceScopeProvider extends AbstractDeclarativeScopeProvider { 

	//scope for variable declarations
	def IScope scope_IntVarExpression_var(IntVarExpression context, EReference ref){
		val containedInLoop = context.getContainerOfType(Repeat)
		if (containedInLoop !== null){
			containedInLoop.visibleVariablesScope
		}
		else{
			val containingProgram = context.getContainerOfType(SelfCheckoutInstore)
			scopeFor(containingProgram.statement.filter(VariableDeclaration))
			}
	}
	def IScope visibleVariablesScope(EObject context){
		if (context instanceof Repeat){
			scopeFor(context.statement.filter(VariableDeclaration), context.eContainer.visibleVariablesScope)
		}
		else if (context instanceof SelfCheckoutInstore){
			scopeFor(context.statement.filter(VariableDeclaration))
		}
	}

//NOTE: THESE SCOPING RULES WERE ATTEMPTED SO THAT A *FUTURE VERSION* OF OUR DSML WOULD SCOPE FOR ITEMDEF
//	//item scoping for instore store
//	def IScope scope_ScanAndAddToBasket_itemInBasket(ScanAndAddToBasket context, EReference ref){
//		val containedInLoop = context.getContainerOfType(Repeat)
//		if (containedInLoop !== null){
//			containedInLoop.visibleInstoreItemScope
//		}
//		else{
//			val containingProgram = context.getContainerOfType(SelfCheckoutInstore)
//			scopeFor(containingProgram.statement.filter(ItemDef))
//		}
//	}
//	def IScope scope_Drop_itemDropped(Drop context, EReference ref){
//		val containedInLoop = context.getContainerOfType(Repeat)
//		if (containedInLoop !== null){
//			containedInLoop.visibleInstoreItemScope
//		}
//		else{
//			val containingProgram = context.getContainerOfType(SelfCheckoutInstore)
//			scopeFor(containingProgram.statement.filter(ItemDef))
//		}
//	}
//	def IScope visibleInstoreItemScope(EObject context){
//		if (context instanceof Repeat){
//			scopeFor(context.statement.filter(ItemDef), context.eContainer.visibleInstoreItemScope)
//		}
//		else if (context instanceof SelfCheckoutInstore){
//			scopeFor(context.statement.filter(ItemDef))
//		}
//	}
//	
//	//item scoping for online store
//	def IScope scope_RemoveFromOnlineBasket_removeItem(RemoveFromOnlineBasket remove, EReference ref){
//		val removeContainer = remove.getContainerOfType(SelfCheckoutOnline)
//		val result = removeContainer.search.filter(ItemDef)
//		if (removeContainer !== null){
//			scopeFor(result)
//		}
//	}
//	
//	def IScope scope_AddToOnlineBasket_item(AddToOnlineBasket add2Basket, EReference ref){
//		val add2BasketContainer = add2Basket.getContainerOfType(SelfCheckoutOnline)
//		val result = add2BasketContainer.search.filter(ItemDef)
//		if (add2BasketContainer !== null){
//			scopeFor(result)
//		}
//	}
	
}


