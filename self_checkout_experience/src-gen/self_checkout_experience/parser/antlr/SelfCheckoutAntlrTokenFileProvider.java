/*
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SelfCheckoutAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("self_checkout_experience/parser/antlr/internal/InternalSelfCheckout.tokens");
	}
}
