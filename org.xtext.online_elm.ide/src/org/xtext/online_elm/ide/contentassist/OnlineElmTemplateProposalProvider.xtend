/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.online_elm.ide.contentassist

import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.ide.editor.contentassist.AbstractIdeTemplateProposalProvider
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor

class OnlineElmTemplateProposalProvider extends AbstractIdeTemplateProposalProvider {
	
	def void createMainShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = '''
			mainShape = [
				<<cursor>>shape
			]
		'''
		acceptProposal('MainShape', 'Create a new main shape', template, context, acceptor)
	}
	
	def void createShapeGroupProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = '''
			<<variable('group_name')>> = [
				<<cursor>>shape
				, shape
			]
		'''
		acceptProposal('ShapeGroup', 'Create a new shape group', template, context, acceptor)
	}
	
	def void createShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = '''
			<<variable('shape_name')>> = [
				<<cursor>> 
			]
		'''
		acceptProposal('Shape', 'Create a new shape', template, context, acceptor)
	}
	
}
