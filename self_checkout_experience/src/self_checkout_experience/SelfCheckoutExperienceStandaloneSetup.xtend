/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SelfCheckoutExperienceStandaloneSetup extends SelfCheckoutExperienceStandaloneSetupGenerated {

	def static void doSetup() {
		new SelfCheckoutExperienceStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
