/*
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OnlineElmAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/online_elm/parser/antlr/internal/InternalOnlineElm.tokens");
	}
}