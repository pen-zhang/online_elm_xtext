/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.ide;

import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.xtext.online_elm.ide.AbstractOnlineElmIdeModule;
import org.xtext.online_elm.ide.contentassist.OnlineElmWebContentProposalProvider;

/**
 * Use this class to register ide components.
 */
@SuppressWarnings("all")
public class OnlineElmIdeModule extends AbstractOnlineElmIdeModule {
  public Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
    return OnlineElmWebContentProposalProvider.class;
  }
}
