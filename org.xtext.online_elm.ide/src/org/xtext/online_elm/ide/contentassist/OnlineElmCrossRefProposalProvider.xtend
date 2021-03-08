package org.xtext.online_elm.ide.contentassist

import org.eclipse.xtext.ide.editor.contentassist.IdeCrossrefProposalProvider
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.scoping.IScope

class OnlineElmCrossRefProposalProvider extends IdeCrossrefProposalProvider {
	override void lookupCrossReference(IScope scope, CrossReference crossReference, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor, Predicate<IEObjectDescription> filter) {
		
			}			
			
}