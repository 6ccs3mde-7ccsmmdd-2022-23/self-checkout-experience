/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import self_checkout_experience.selfCheckout.Modelss

@ExtendWith(InjectionExtension)
@InjectWith(SelfCheckoutInjectorProvider)
class SelfCheckoutParsingTest {
	@Inject
	ParseHelper<Modelss> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}
