/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.online_elm.ide.contentassist

import com.google.inject.Inject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import org.xtext.online_elm.services.OnlineElmGrammarAccess

//import static org.xtext.online_elm.online_elm.OnlineElmPackage.Literals.*

class OnlineElmWebContentProposalProvider extends IdeContentProposalProvider {
	
	@Inject extension OnlineElmGrammarAccess
	
	@Inject OnlineElmTemplateProposalProvider templateProvider
	
	override dispatch createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		switch ruleCall.rule {
			
//			case BOOLEANRule: {
//				if ('true'.startsWith(context.prefix)) {
//					val trueEntry = new ContentAssistEntry => [
//						prefix = context.prefix
//						proposal = 'true'
//					]
//					acceptor.accept(trueEntry, proposalPriorities.getDefaultPriority(trueEntry))
//				}
//				if ('false'.startsWith(context.prefix)) {
//					val falseEntry = new ContentAssistEntry => [
//						prefix = context.prefix
//						proposal = 'false'
//					]
//					acceptor.accept(falseEntry, proposalPriorities.getDefaultPriority(falseEntry))
//				}
//			}
			case shapeGroupRule: {
				templateProvider.createShapeGroupProposal(context, acceptor)
			}
			
			case shapeRule: {
				templateProvider.createShapeProposal(context,acceptor)
			}
				
			default:
				super._createProposals(ruleCall, context, acceptor)	
		}
	}
	
//	override dispatch createProposals(Assignment assignment, ContentAssistContext context,
//			IIdeContentProposalAcceptor acceptor) {
//		switch assignment {
//			case circleAccess.nameAssignment_0: {
//				val scope = scopeProvider.getScope(context.currentModel, CIRCLE__)
//				for (description : scope.allElements.filter[getEClass == INPUT_SIGNAL]) {
//					val entry = new ContentAssistEntry => [
//						source = description
//						prefix = context.prefix
//						proposal = description.name.toString
//						description = 'input signal'
//					]
//					acceptor.accept(entry, proposalPriorities.getCrossRefPriority(description, entry))
//				}
//			}
//						
//			case circleAccess.valueAssignment_2,
//			case drawAccess.newValueAssignment_3: {
//				// Proposals are created by RuleCall dispatch method
//			}
//			
//			default:
//				super._createProposals(assignment, context, acceptor)
//		}
//	}
//	
//	override protected filterKeyword(Keyword keyword, ContentAssistContext context) {
//		switch keyword {
//			case stencilAccess.stencilKeyword_0:
//				false
//			default:
//				super.filterKeyword(keyword, context)
//		}
//	}
	
}