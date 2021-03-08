package org.xtext.online_elm.ide.contentassist;

import com.google.common.base.Predicate;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeCrossrefProposalProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

@SuppressWarnings("all")
public class OnlineElmCrossRefProposalProvider extends IdeCrossrefProposalProvider {
  @Override
  public void lookupCrossReference(final IScope scope, final CrossReference crossReference, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor, final Predicate<IEObjectDescription> filter) {
  }
}
