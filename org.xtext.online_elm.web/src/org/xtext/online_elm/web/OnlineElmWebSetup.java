/*
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.online_elm.OnlineElmRuntimeModule;
import org.xtext.online_elm.OnlineElmStandaloneSetup;
import org.xtext.online_elm.ide.OnlineElmIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class OnlineElmWebSetup extends OnlineElmStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new OnlineElmRuntimeModule(), new OnlineElmIdeModule(), new OnlineElmWebModule()));
	}
	
}