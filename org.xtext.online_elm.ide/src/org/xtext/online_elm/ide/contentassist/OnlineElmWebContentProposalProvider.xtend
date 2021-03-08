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
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator
import org.eclipse.xtext.ide.server.contentassist.ContentAssistService

import org.xtext.online_elm.services.OnlineElmGrammarAccess

import static org.xtext.online_elm.onlineElm.OnlineElmPackage.Literals.*
import org.xtext.online_elm.onlineElm.Stencil

import org.eclipse.xtext.util.TextRegion
import org.eclipse.xtext.util.ReplaceRegion

import org.xtext.online_elm.onlineElm.Color
import org.xtext.online_elm.onlineElm.Shape
import org.xtext.online_elm.onlineElm.ShapeList
import org.xtext.online_elm.onlineElm.BasicShape
import org.xtext.online_elm.onlineElm.Conditional_Shape
import org.xtext.online_elm.onlineElm.Text
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.xtext.online_elm.onlineElm.OnlineElm
import org.xtext.online_elm.onlineElm.MainShape
import org.eclipse.xtext.nodemodel.INode

import org.eclipse.xtext.ide.server.Document
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext.Builder
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.CompletionParams
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.Range
import org.eclipse.xtext.CrossReference
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.GrammarUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EReference

class OnlineElmWebContentProposalProvider extends IdeContentProposalProvider {

	@Inject extension OnlineElmGrammarAccess

	@Inject OnlineElmTemplateProposalProvider templateProvider
	
//	@Inject ContentAssistService caservice

//	@Inject IScopeProvider scopeProvider

//	priority color:
	val COLOR = 850;
	val STENCIL = 800; 
	val MATHEXP = 200;
	val BOOL = 250; 
	val TRANS = 450;
	val CONDI = 100;
	val REF = 700;
	 

//rule
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

			case mainShapeRule: {
				templateProvider.createMainShapeProposal(context, acceptor)
			}
						
			case shapeListRule: {
				val shapelists = context.rootModel.eAllContents.filter(ShapeList)
				val n = shapelists.size+1
				val entry = new ContentAssistEntry => [
					source = description
					proposal = "\nshapeList_" + n + " = [\n  shape\n  ]"
					description = "Create a new shape list"
					label = "ShapeList"
				]
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
				
			}
			
			case local_varRule: { // nothing to propose	
			}
			
			case basicShapeRule: {
//				templateProvider.createBasicShapeProposal(context, acceptor)
				val shapes = context.rootModel.eAllContents.filter(BasicShape)
				val n = shapes.size+1
				val entry = new ContentAssistEntry => [
					source = description
					proposal = "\nshape_" +n+ " = \n  circle 50 |> filled red"
					description = "Create a new shape"
					label = "Shape"
					
					
				]
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
			}
		
			case colorRule: {
				for (color : Color.VALUES) {
					val entry = new ContentAssistEntry => [
						source = description
						prefix = context.prefix
						proposal = color.toString
						description = "Shape filled with " + color.toString

					]
					acceptor.accept(entry, COLOR)
				}
			}
			
			/*
			case conditional_ShapeRule: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(if ✍ then\n  ✍\nelse\n  ✍)"
					label = "if...then...else"
					description = ""
				]
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
			}
			
			case conditional_NumRule: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(if ✍ then\n  ✍\nelse\n  ✍)"
					label = "if...then...else"
					description = ""
				]
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
			}
			
			case conditional_ColorRule: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(if ✍ then\n  ✍\nelse\n  ✍)"
					label = "if ✍ then ✍ else ✍"
					description = ""
				]
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
			}
			*/
			
			case bool_exprRule: {
				val entry_not = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "not ✍"
					label = "not ✍"
					description = ""
				]
				acceptor.accept(entry_not, BOOL)
				val entry_or = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ || ✍"
					label = "✍ || ✍"
					description = ""
				]
				acceptor.accept(entry_or, BOOL)
				val entry_and = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ && ✍"
					label = "✍ && ✍"
					description = ""
				]
				acceptor.accept(entry_and, BOOL)
				val entry_eq = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ == ✍"
					label = "✍ == ✍"
					description = ""
				]
				acceptor.accept(entry_eq, BOOL)
				val entry_neq = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ != ✍"
					label = "✍ != ✍"
					description = ""
				]
				acceptor.accept(entry_neq, BOOL)
				val entry_gt = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ > ✍"
					label = "✍ > ✍"
					description = ""
				]
				acceptor.accept(entry_gt, BOOL)
				val entry_gte = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ >= ✍"
					label = "✍ >= ✍"
					description = ""
				]
				acceptor.accept(entry_gte, BOOL)
				val entry_lt = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ < ✍"
					label = "✍ && ✍"
					description = ""
				]
				acceptor.accept(entry_lt, BOOL)
				val entry_lte = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "✍ <= ✍"
					label = "✍ <= ✍"
					description = ""
				]
				acceptor.accept(entry_lte, BOOL)
			}
			
			case math_expRule: {
				System.out.println(context.lastCompleteNode.text)
				System.out.println("prefix: "+context.prefix)
				System.out.println("text: "+context.currentNode.text)
				val entry_add = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(✍ + ✍)"
					label = "✍ + ✍ "
					description = ""
				]
				acceptor.accept(entry_add, MATHEXP)
				val entry_sub = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(✍ - ✍)"
					label = "✍ - ✍"
					description = ""
				]
				acceptor.accept(entry_sub, MATHEXP)
				val entry_times = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(✍ * ✍)"
					label = "✍ * ✍"
					description = ""
				]
				acceptor.accept(entry_times, MATHEXP)
				val entry_div = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "(✍ / ✍)"
					label = "✍ / ✍"
					description = ""
				]
				acceptor.accept(entry_div, MATHEXP)
			}
			
			
			default:
				super._createProposals(ruleCall, context, acceptor)
		}
		
		
	}

// assignment
	override dispatch createProposals(Assignment assignment, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {
		
		
		switch assignment {
//			case circleAccess.radiusAssignment_1: {
//				val scope = scopeProvider.getScope(context.currentModel, tFLOAT)
//				for (description : scope.allElements.filter[getEClass == INPUT_SIGNAL]) {
//					val entry = new ContentAssistEntry => [
//						getEscapePosition
//					]
//					acceptor.accept(entry, proposalPriorities.getCrossRefPriority(description, entry))
//				}
//			}
			case local_varAccess.nameAssignment_0:{}
			
			case mainShapeAccess.shapeAssignment_4_0:{
//				System.out.println("call main shape "+(t++).toString)
//				System.out.println(assignment.feature.toString)
//				System.out.println(context.currentNode.semanticElement.toString)
//				System.out.println("prefix:"+context.prefix)
//				System.out.println("prefix:"+context.prefix.length)
				stencilProposal(assignment, context, acceptor)
			}
			case mainShapeAccess.moreShapesAssignment_5_2_0: {
//				System.out.println("call main moreshape")
//				System.out.println(assignment.feature.toString)
				stencilProposal(assignment, context, acceptor)
			}
			
			case mainShapeAccess.conditionalAssignment_4_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else ✍"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
//			case mainShapeAccess.shapeRefAssignment_5_2: {
//				
//				System.out.println(context.currentModel.eContainmentFeature.toString())
//				val scope = scopeProvider.getScope(context.rootModel, context.currentNode.semanticElement.eContainmentFeature)
//				System.out.println(scope.allElements.toString())
//				for (description : scope.allElements.filter[getEClass == BASIC_SHAPE]) {
//					System.out.println(description.toString())
//					val entry = new ContentAssistEntry => [
//						proposal = description.name.toString()
//					]
//					
//				acceptor.accept(entry, REF)
//				}
//				val entry = new ContentAssistEntry => [
//					source = description
//					prefix = context.prefix
//					proposal = "name your shape"
//					editPositions.add(new TextRegion(context.currentNode.offset, 15))
//					label = "shape"
//					description = "Input a shape name here, and create a new shape below"
//				]
//				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
//			}
			case mainShapeAccess.moreConditionalAssignment_5_2_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
//			case mainShapeAccess.moreShapeRefAssignment_6_2_2: {
//				val entry = new ContentAssistEntry => [
//					source = description
//					prefix = context.prefix
//					proposal = "name your shape"
//					editPositions.add(new TextRegion(context.currentNode.offset, 15))
//					label = "shape"
//					description = "Input a shape name here, and create a new shape below"
//				]
//				acceptor.accept(entry, REF)
//			}
			case shapeListAccess.shapeAssignment_3_0: {
//				System.out.print("call shapelist shape")
				stencilProposal(assignment, context, acceptor)
			}
			case shapeListAccess.moreShapesAssignment_4_2_0: {
				stencilProposal(assignment, context, acceptor)
			}
			
			case shapeListAccess.conditionalAssignment_3_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
//			case shapeListAccess.shapeRefAssignment_4_2: {
//				val entry = new ContentAssistEntry => [
//					source = description
//					prefix = context.prefix
//					proposal = "name your shape"
//					editPositions.add(new TextRegion(context.currentNode.offset, 15))
//					label = "shape"
//					description = "Input a shape name here, and create a new shape below"
//				]
//				acceptor.accept(entry, REF)
//			}
			case shapeListAccess.moreConditionalAssignment_4_2_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
//			case shapeListAccess.moreShapeRefAssignment_5_2_2: {
//				val entry = new ContentAssistEntry => [
//					source = description
//					prefix = context.prefix
//					proposal = "name your shape"
//					editPositions.add(new TextRegion(context.currentNode.offset, 15))
//					label = "shape"
//					description = "Input a shape name here, and create a new shape below"
//				]
//				acceptor.accept(entry, REF)
//			}
			
			
			case shapeListAccess.nameAssignment_0: {
				if(context.currentNode.parent.semanticElement instanceof BasicShape){
					val shapelists = context.rootModel.eAllContents.filter(ShapeList)
					val n = shapelists.size+1
					val ContentAssistEntry entry = new ContentAssistEntry => [
						label = "Name your new shape list"
						source = description
						prefix = context.prefix
						proposal = "shapelist_" + n.toString
						description = "Input a name starting with a lowecase"
					]
					acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
				
				}
			}
			
			case basicShapeAccess.shapeAssignment_3_0: {
				stencilProposal(assignment, context, acceptor)
			}
			
			case basicShapeAccess.nameAssignment_0: {
//				System.out.println(context.currentNode.parent.semanticElement instanceof BasicShape)
				if(context.currentNode.parent.semanticElement instanceof BasicShape){
					// DONE filter the basicshape, dynamically genereate a shape name with number
					val shapes = context.rootModel.eAllContents.filter(BasicShape)
					val n = shapes.size
					val ContentAssistEntry entry = new ContentAssistEntry => [
						label = "Name your new shape"
						source = description
						prefix = context.prefix
						proposal = "shape_" + n
						description = "Input a name starting with a lowecase"
					]
					acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
					
				}
			}
			
			case basicShapeAccess.conditionalAssignment_3_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
						
			case conditional_ShapeAccess.shape_1Assignment_4_0: {
				stencilProposal(assignment, context, acceptor)
			}
			
			case conditional_ShapeAccess.nested_1Assignment_4_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
			
			case conditional_ShapeAccess.shape_2Assignment_8_0: {
				stencilProposal(assignment, context, acceptor)
			}
			
			case conditional_ShapeAccess.nested_2Assignment_8_1: {
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					proposal = "\nif ✍ then\n  ✍\nelse\n  ✍\n"
					label = "if ✍ then ✍ else"
					description = "Add conditional to choose shape"
				]
				acceptor.accept(entry, CONDI)
			}
			
			case drawAccess.filledAssignment_0_0: {
				val entry_filled = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "filled"
					proposal = "filled ✍"
					description = "Fill shape with color"

				]
				entry_filled.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_filled, proposalPriorities.getDefaultPriority(entry_filled))
			}
			
			case filledAccess.lineType1Assignment_2_3: {
				val LINETYPE = 100
				val entry_solid = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "solid ✍"
					proposal = "solid ✍"
					description = "Outline shape with (width) solid line"

				]
				entry_solid.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_solid, LINETYPE)
				
				val entry_dotted = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "dotted ✍"
					proposal = "dotted ✍"
					description = "Outline shape with (width) dotted line"

				]
				entry_dotted.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_dotted, LINETYPE)
				
				val entry_dashed = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "dashed ✍"
					proposal = "dashed ✍"
					description = "Outline shape with (width) dashed line"

				]
				entry_dashed.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_dashed, LINETYPE)
				
				val entry_dotdash = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "dotdsah ✍"
					proposal = "dotdash ✍"
					description = "Outline shape with (width) dotdash line"

				]
				entry_dotdash.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_dotdash, LINETYPE)
				
				val entry_longdash = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "longdash ✍"
					proposal = "longdash ✍"
					description = "Outline shape with (width) longdash line"

				]
				entry_longdash.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_longdash, LINETYPE)
			}
			
			case drawAccess.outlinedAssignment_0_1: {
				System.out.println("replaced text: "+context.lastCompleteNode.nextSibling.text)
				val entry_outlined = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "outlined"
					proposal = "outlined (solid 5) red"
					description = "Outlined shape with colored line"

				]
				entry_outlined.escapePosition = context.lastCompleteNode.nextSibling.text.length
				acceptor.accept(entry_outlined, proposalPriorities.getDefaultPriority(entry_outlined))
			}
			
			
			case num_valueAccess.refAssignment_3: {
//				System.out.println("time:" + context.prefix)
				val entry = new ContentAssistEntry => [
					source = description
					prefix = context.prefix
					label = "time"
					proposal = "time"
					description = "Refer to the parameter \"time\""

				]
				acceptor.accept(entry, REF)
			}
			
			default:
				super._createProposals(assignment, context, acceptor)
		}
	}


// keyword
	override dispatch void createProposals(Keyword keyword, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {

//		if (!filterKeyword(keyword, context)) {
//			templateProvider.createPlusShapeGroupProposal(context, acceptor)
//
//		}
		if (keyword == mainShapeAccess.plusSignPlusSignKeyword_8_1_0 ||
			keyword == shapeListAccess.plusSignPlusSignKeyword_7_1_0) {
			templateProvider.createPlusShapeGroupProposal(context, acceptor)
		}

		if (keyword == drawAccess.verticalLineGreaterThanSignKeyword_1_0 && context.prefix!="]") {
			System.out.println(context.prefix)
			val ContentAssistEntry entry_move = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "move"
				proposal = " |> move (50, 50) "
				description = 'move (x,y)'
			]
			acceptor.accept(entry_move, TRANS)
			val ContentAssistEntry entry_rotate = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "rotate"
				proposal = " |> rotate ( degrees 90 ) "
				description = 'rotate the shape through degrees '
			]
			acceptor.accept(entry_rotate, TRANS)
			val ContentAssistEntry entry_scale = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "scale"
				proposal = " |> scale 0.5"
				description = 'scale the shape'
			]
			acceptor.accept(entry_scale, TRANS)
			val ContentAssistEntry entry_scaleX = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "scaleX"
				proposal = " |> scaleX 0.5"
				description = 'scale along X-axis'
			]
			acceptor.accept(entry_scaleX, TRANS)
			val ContentAssistEntry entry_scaleY = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "scaleY"
				proposal = " |> scaleY 0.5"
				description = 'scale along X-axis'
			]
			acceptor.accept(entry_scaleY, TRANS)
			
		}

		if (keyword == mainShapeAccess.commaKeyword_5_1 || keyword == shapeListAccess.commaKeyword_4_1) {
			templateProvider.createNewInternalShapeProposal(context, acceptor)
//			val ContentAssistEntry entry = new ContentAssistEntry => [
//				source = description
//				prefix = context.prefix
//				label = ","
//				proposal = ", shape"
//				description = "add another shape"
//			]
//			acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
		}
		
		if (keyword == filledAccess.verticalLineGreaterThanSignKeyword_2_0 ) {
			val ContentAssistEntry entry_addoutline = new ContentAssistEntry => [
				source = description
				prefix = context.prefix
				label = "addOutline"
				proposal = " |> addOutline ( solid 3 ) red "
				description = 'add outline'
			]
			acceptor.accept(entry_addoutline, proposalPriorities.getDefaultPriority(entry_addoutline))
		}

//		switch keyword {
//			case mainShapeAccess.nameMyShapesKeyword_0_0_0: {
//			}
//			default:
//				super._createProposals(keyword, context, acceptor)
//		}

	}

	override protected filterKeyword(Keyword keyword, ContentAssistContext context) {
		switch keyword {
//			case mainShapeAccess.nameMyShapesKeyword_0_0:
//				false
//			case drawAccess.verticalLineGreaterThanSignKeyword_1_0:
//				false
//			case circleAccess.nameCircleKeyword_0_0:
//				false
			default:
				super.filterKeyword(keyword, context)
		}
	}

	def void stencilProposal(Assignment assignment, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {
		
		var int escapePosition=0
		if (context.prefix.length == 0){
			escapePosition = 0
		}
		else if ("text".startsWith(context.prefix)){
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("circle".startsWith(context.prefix)){
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("rect".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("squre".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("roundedRect".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("oval".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("ngon".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
//			System.out.println("next: \n"+context.lastCompleteNode.nextSibling.text)
		}
		else if ("wedge".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("polygon".startsWith(context.prefix)) {
			escapePosition = context.lastCompleteNode.nextSibling.text.length
		}
		else if ("shape".startsWith(context.prefix)) {
			escapePosition = 5
		}
		else {
			escapePosition = 0
		}
//		System.out.println("next: \n"+context.lastCompleteNode.nextSibling.text)
//		System.out.println(escapePosition)
		
			
		val entry_circle = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "circle"
			proposal = stencilProposalContent("circle 50 |> filled red", context)
			description = "circle radius"

		]
		entry_circle.escapePosition = escapePosition
		acceptor.accept(entry_circle, STENCIL)
		
		val entry_rect = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "rect"
			proposal = stencilProposalContent("rect 50 90 |> filled red", context)
			description = "rect width height"

		]
		entry_rect.escapePosition = escapePosition
		acceptor.accept(entry_rect, STENCIL)
		
		val entry_square = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "square"
			proposal = stencilProposalContent("square 50 |> filled red", context)
			description = "square sides"

		]
		entry_square.escapePosition = escapePosition
		acceptor.accept(entry_square, STENCIL)
		
		val entry_roundedRect = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "roundedRect"
			proposal = stencilProposalContent("roundedRect 60 30 5 |> filled red", context)
			description = "roundedRect width height corner_radius"

		]
		entry_roundedRect.escapePosition = escapePosition
		acceptor.accept(entry_roundedRect, STENCIL)
		
		val entry_oval = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "oval"
			proposal = stencilProposalContent("oval 50 90 |> filled red", context)
			description = "oval width height"

		]
		entry_oval.escapePosition = escapePosition
		acceptor.accept(entry_oval, STENCIL)
		
		val entry_ngon = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "ngon"
			proposal = stencilProposalContent("ngon 7 50 |> filled red", context)
			description = "ngon sides radius"

		]
		entry_ngon.escapePosition = escapePosition
		acceptor.accept(entry_ngon, STENCIL)
		
		val entry_wedge = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "wedge"
			proposal = stencilProposalContent("wedge 50 0.5 |> filled red", context)
			description = "wedge radius fraction"

		]
		entry_wedge.escapePosition = escapePosition
		acceptor.accept(entry_wedge, STENCIL)
		
		val entry_polygon = new ContentAssistEntry => [
			source = description
			prefix = context.prefix
			label = "polygon"
			proposal = stencilProposalContent("polygon [ ((-20),(-20)), (20,(-20)), (20,20) ] |> filled red",context)
			description = "polygon points"

		]
		entry_polygon.escapePosition = escapePosition
		acceptor.accept(entry_polygon, STENCIL)
		
		
		val entry_text = new ContentAssistEntry => [
			source = description
			label = "text"
			proposal = stencilProposalContent("text \"content\" |> filled red", context)
			description = "text \"content\""
			prefix = context.prefix
//			textReplacements.add(new ReplaceRegion(context.currentNode.totalTextRegion, "???" ))
		]
		entry_text.escapePosition = escapePosition
		acceptor.accept(entry_text, STENCIL)

	}
	
	
	def String stencilProposalContent(String s, ContentAssistContext context){
	
//		if (context.prefix.equals(context.currentNode.semanticElement.class.toString) || context.prefix.equals(context.currentNode.parent.parent.semanticElement.class.toString)
		if (context.prefix.length == 0) {
//			System.out.println("insert a shape")
			return s+"\n  , " //cursor before the stencil text, insert a shape
		} else {
//			System.out.println("replace a shape")
			return s	// cursor in the stencil text ,replace current shape
		}

	}


//	corss reference
	override dispatch void createProposals(CrossReference reference, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
//		System.out.println("crossRef: "+reference.type.classifier.instanceClassName.toString)
		val curRef = reference.type.classifier.instanceClass
		var extra =''
		System.out.println("curnode: "+context.currentNode.text)
		System.out.println("prenode: "+context.lastCompleteNode.text)
		System.out.println(context.lastCompleteNode.nextSibling.text)
//		System.out.println("replaced text: "+context.lastCompleteNode.nextSibling.text)
		switch curRef{
			case BasicShape: {
				
				if (context.prefix.length == 0){
						extra = '\n  , '
					}
//				System.out.println(context.currentNode.semanticElement)
				val ref = GrammarUtil.getReference(reference)
//				System.out.println(ref.toString)
				val model = context.currentModel
				if (ref !== null && model !== null) {
					val scope = scopeProvider.getScope(model, ref)
//					System.out.println("scope: "+scope)
					
					for ( description : scope.allElements.filter[getEClass == BASIC_SHAPE]){
//						System.out.println(description.toString)
						val crossRefProposal = description + extra
						val entry = new ContentAssistEntry => [
							prefix=context.prefix
							proposal=crossRefProposal
							description="Shape"
							label=description.toString
						]
						entry.escapePosition = context.currentNode.text.length
						acceptor.accept(entry, REF)
						
					}		
					crossrefProposalProvider.lookupCrossReference(scope, reference, context, acceptor,
						getCrossrefFilter(reference, context))
				}
			}
			case ShapeList: {
//				System.out.println(context.currentNode.semanticElement)
				val ref = GrammarUtil.getReference(reference)
//				System.out.println(ref.toString)
				val model = context.currentModel
				if (ref !== null && model !== null) {
					val scope = scopeProvider.getScope(model, ref)
//					System.out.println("scope: "+scope)
					for ( description : scope.allElements.filter[getEClass == SHAPE_LIST]){
//						System.out.println(description.toString)
						val crossRefProposal = description + extra
						val entry = new ContentAssistEntry => [
							prefix=context.prefix
							proposal=crossRefProposal
							description="Shape List"
							label=description.toString
						]
						
						entry.escapePosition = context.currentNode.text.length
						acceptor.accept(entry, REF)
					}		
					crossrefProposalProvider.lookupCrossReference(scope, reference, context, acceptor,
						getCrossrefFilter(reference, context))
				}
			}
			
			default:
				super._createProposals(reference, context, acceptor)
		}

//			EReference eReference = GrammarUtil.getReference(reference, ((EClass) type));

		
	}
	
}


