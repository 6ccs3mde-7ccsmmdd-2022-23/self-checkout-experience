/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import self_checkout_experience.selfCheckoutExperience.Self_checkout
import self_checkout_experience.selfCheckoutExperience.PickStatement
import self_checkout_experience.selfCheckoutExperience.AddToBag
import self_checkout_experience.selfCheckoutExperience.AddToBasket
import self_checkout_experience.selfCheckoutExperience.Drop
import self_checkout_experience.selfCheckoutExperience.Scan
import self_checkout_experience.selfCheckoutExperience.Checkout
import self_checkout_experience.selfCheckoutExperience.Pay
import self_checkout_experience.selfCheckoutExperience.MoveStatement
import self_checkout_experience.selfCheckoutExperience.TurnStatement
import self_checkout_experience.selfCheckoutExperience.Repeat
import self_checkout_experience.selfCheckoutExperience.WalkStatement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SelfCheckoutExperienceGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as Self_checkout
		
		fsa.generateFile("self_checkout_experience.txt", model.generate)
	}
	
//	def deriveTargetFileNameFor(Self_checkout checkout, Resource resource) {
//		resource.URI.appendFileExtension("txt").lastSegment
//	}
	
	def generate(Self_checkout checkout) '''
		Self checkout summary:
		
		- �checkout.eAllContents.filter(PickStatement).size� pick statements
		- �checkout.eAllContents.filter(AddToBasket).size� add to basket statements
		- �checkout.eAllContents.filter(Drop).size� drop statements
		- �checkout.eAllContents.filter(Checkout).size� go to till statements
		- �checkout.eAllContents.filter(Scan).size� scan statements
		- �checkout.eAllContents.filter(AddToBag).size� add to bag statements
		- �checkout.eAllContents.filter(MoveStatement).size� move statements
		- �checkout.eAllContents.filter(TurnStatement).size� turn statements
		- �checkout.walkstatements.filter(Repeat).size� repeat statements
		- �checkout.eAllContents.filter(WalkStatement).size� Walk statements
		
	'''
}
