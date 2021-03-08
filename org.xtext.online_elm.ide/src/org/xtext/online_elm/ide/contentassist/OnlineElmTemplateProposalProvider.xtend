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
import org.xtext.online_elm.onlineElm.ShapeList

class OnlineElmTemplateProposalProvider extends AbstractIdeTemplateProposalProvider {

	def void createMainShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
//		val StringConcatenationClient template = '''
//			myShapes = [
//				<<cursor>>shapes
//				${cursor}
//			]
//		'''
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("myShapes time = [")
				target.newLine()
				target.append("  ")
				target.append(variable("shape"))
				target.newLine()
				target.append("  ]")
			}
		}

		acceptProposal('MainShape', 'Create a new main shape', template, context, acceptor)
	}

	def void createShapeListProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.newLineIfNotEmpty()
				target.append(variable("list_name"))
				target.append(" = [")
				target.newLine()
				target.append("  ")
				target.append(variable("shapes"))
//				target.append(cursor())
				target.newLine()
				target.append("  ]")
			}
		}
		acceptProposal('ShapeList', 'Create a new shape list', template, context, acceptor)
	}

	def void createBasicShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.newLineIfNotEmpty()
				target.append(variable("new_shape"))
				target.append(" = ")
				target.newLine()
				target.append("  ")
				target.append("circle 50 |> filled red")
//	           target.newLine()
			}
		}
		acceptProposal('Shape', 'Create a new shape', template, context, acceptor)
	}

	def void createCircleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("circle ")
				target.append(variable("radius"))
				target.append(" |> ")
				target.append("filled ")
				target.append(variable("color"))

			}
		}
		acceptProposal('circle', 'Replace with a circle', template, context, acceptor)
	}

	def void createRectProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("rect ")
				target.append(variable("width"))
				target.append(" ")
				target.append(variable("height"))
				target.append(" |> ")
				target.append("filled ")
				target.append(variable("color"))

			}
		}
		acceptProposal('rect', 'Replace with a rectangle', template, context, acceptor)
	}

	def void createTextProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("text ")
				target.append("\"content\"")
				target.append(" |> ")
				target.append("filled ")
				target.append(variable("color"))

			}
		}
		acceptProposal('text', 'Replace with text', template, context, acceptor)
	}

	def void createPlusShapeGroupProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			val shapelists = context.rootModel.eAllContents.filter(ShapeList)
			val n = shapelists.size+1
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.newLineIfNotEmpty()
				target.append("++ ")
				target.append("shapelist_"+n)			
			}
		}
		acceptProposal('combine shapes', 'Combined with another shape list', template, context, acceptor)
//		val end=context.rootNode.length
//		System.out.println(end)
//		context.resource.update(end,0,"test")
	}

	def void createMoveProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("move ")
				target.append("( ")
				target.append(variable("x"))
				target.append(" , ")
				target.append(variable("y"))
				target.append(" )")

			}
		}
		acceptProposal('move', 'Move shape to position (x,y)', template, context, acceptor)
	}

	def void createNewInternalShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.newLineIfNotEmpty()
				target.append(", ")
				target.append(variable("shape"))
			}

		}
		acceptProposal(', shape', 'Add another shape', template, context, acceptor)
	}

	def void createShapeProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val StringConcatenationClient template = new StringConcatenationClient() {
			override protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append("circle 50 |> filled red")
			}

		}
		acceptProposal('default shape', 'Add a circle here', template, context, acceptor)
	}

}
