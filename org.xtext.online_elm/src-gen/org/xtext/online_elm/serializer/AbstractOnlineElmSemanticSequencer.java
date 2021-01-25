/*
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.online_elm.onlineElm.BasicShape;
import org.xtext.online_elm.onlineElm.Bool_exp;
import org.xtext.online_elm.onlineElm.Circle;
import org.xtext.online_elm.onlineElm.Draw;
import org.xtext.online_elm.onlineElm.Fill;
import org.xtext.online_elm.onlineElm.MainShape;
import org.xtext.online_elm.onlineElm.Math_exp;
import org.xtext.online_elm.onlineElm.Move;
import org.xtext.online_elm.onlineElm.Num_value;
import org.xtext.online_elm.onlineElm.OnlineElm;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;
import org.xtext.online_elm.onlineElm.Rect;
import org.xtext.online_elm.onlineElm.Shape;
import org.xtext.online_elm.onlineElm.ShapeGroup;
import org.xtext.online_elm.onlineElm.Terminal_Bool_exp;
import org.xtext.online_elm.onlineElm.Text;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractOnlineElmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OnlineElmGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OnlineElmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OnlineElmPackage.BASIC_SHAPE:
				sequence_BasicShape(context, (BasicShape) semanticObject); 
				return; 
			case OnlineElmPackage.BOOL_EXP:
				if (rule == grammarAccess.getBool_expRule()) {
					sequence_Bool_exp(context, (Bool_exp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getShapeRule()
						|| rule == grammarAccess.getConditionalRule()) {
					sequence_Bool_exp_Conditional(context, (Bool_exp) semanticObject); 
					return; 
				}
				else break;
			case OnlineElmPackage.CIRCLE:
				sequence_Circle(context, (Circle) semanticObject); 
				return; 
			case OnlineElmPackage.DRAW:
				sequence_Draw(context, (Draw) semanticObject); 
				return; 
			case OnlineElmPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case OnlineElmPackage.MAIN_SHAPE:
				sequence_MainShape(context, (MainShape) semanticObject); 
				return; 
			case OnlineElmPackage.MATH_EXP:
				sequence_Math_exp(context, (Math_exp) semanticObject); 
				return; 
			case OnlineElmPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case OnlineElmPackage.NUM_VALUE:
				sequence_Num_value(context, (Num_value) semanticObject); 
				return; 
			case OnlineElmPackage.ONLINE_ELM:
				sequence_OnlineElm(context, (OnlineElm) semanticObject); 
				return; 
			case OnlineElmPackage.RECT:
				sequence_Rect(context, (Rect) semanticObject); 
				return; 
			case OnlineElmPackage.SHAPE:
				sequence_Shape(context, (Shape) semanticObject); 
				return; 
			case OnlineElmPackage.SHAPE_GROUP:
				sequence_ShapeGroup(context, (ShapeGroup) semanticObject); 
				return; 
			case OnlineElmPackage.TERMINAL_BOOL_EXP:
				sequence_Terminal_Bool_exp(context, (Terminal_Bool_exp) semanticObject); 
				return; 
			case OnlineElmPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ShapeDef returns BasicShape
	 *     BasicShape returns BasicShape
	 *
	 * Constraint:
	 *     (name=ID shape=Shape)
	 */
	protected void sequence_BasicShape(ISerializationContext context, BasicShape semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.SHAPE_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.SHAPE_DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.BASIC_SHAPE__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.BASIC_SHAPE__SHAPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBasicShapeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBasicShapeAccess().getShapeShapeParserRuleCall_2_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bool_exp returns Bool_exp
	 *
	 * Constraint:
	 *     (left=Terminal_Bool_exp (operator+=BOOL_OP rights+=Terminal_Bool_exp)*)
	 */
	protected void sequence_Bool_exp(ISerializationContext context, Bool_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Shape returns Bool_exp
	 *     Conditional returns Bool_exp
	 *
	 * Constraint:
	 *     (left=Terminal_Bool_exp (operator+=BOOL_OP rights+=Terminal_Bool_exp)* exp1=Shape exp2=Shape)
	 */
	protected void sequence_Bool_exp_Conditional(ISerializationContext context, Bool_exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stencil returns Circle
	 *     Circle returns Circle
	 *
	 * Constraint:
	 *     (name='circle' diameter=FLOAT)
	 */
	protected void sequence_Circle(ISerializationContext context, Circle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.CIRCLE__DIAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.CIRCLE__DIAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCircleAccess().getNameCircleKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCircleAccess().getDiameterFLOATTerminalRuleCall_1_0(), semanticObject.getDiameter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Draw returns Draw
	 *
	 * Constraint:
	 *     (filledColor=Fill position=Move?)
	 */
	protected void sequence_Draw(ISerializationContext context, Draw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (name='filled' color=Color)
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.FILL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.FILL__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.FILL__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.FILL__COLOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillAccess().getNameFilledKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFillAccess().getColorColorEnumRuleCall_1_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainShape returns MainShape
	 *
	 * Constraint:
	 *     (name='myShapes' (s1=Shape | s11=[BasicShape|ID]) s2+=Shape? (s22+=[BasicShape|ID]? s2+=Shape?)* sg+=[ShapeGroup|ID]*)
	 */
	protected void sequence_MainShape(ISerializationContext context, MainShape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Num_value returns Math_exp
	 *     Math_exp returns Math_exp
	 *
	 * Constraint:
	 *     (n1=FLOAT op1=MATH_OP n2=FLOAT)
	 */
	protected void sequence_Math_exp(ISerializationContext context, Math_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MATH_EXP__N1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MATH_EXP__N1));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MATH_EXP__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MATH_EXP__OP1));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MATH_EXP__N2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MATH_EXP__N2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMath_expAccess().getN1FLOATTerminalRuleCall_1_0(), semanticObject.getN1());
		feeder.accept(grammarAccess.getMath_expAccess().getOp1MATH_OPEnumRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getMath_expAccess().getN2FLOATTerminalRuleCall_3_0(), semanticObject.getN2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (name='move' x=Num_value y=Num_value)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MOVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MOVE__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MOVE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MOVE__X));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.MOVE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.MOVE__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getNameMoveKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMoveAccess().getXNum_valueParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getMoveAccess().getYNum_valueParserRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Num_value returns Num_value
	 *
	 * Constraint:
	 *     num=FLOAT
	 */
	protected void sequence_Num_value(ISerializationContext context, Num_value semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.NUM_VALUE__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.NUM_VALUE__NUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNum_valueAccess().getNumFLOATTerminalRuleCall_0_0(), semanticObject.getNum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OnlineElm returns OnlineElm
	 *
	 * Constraint:
	 *     (entry=MainShape | shapes+=ShapeDef)+
	 */
	protected void sequence_OnlineElm(ISerializationContext context, OnlineElm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stencil returns Rect
	 *     Rect returns Rect
	 *
	 * Constraint:
	 *     (name='rect' edgeX=FLOAT edgeY=FLOAT)
	 */
	protected void sequence_Rect(ISerializationContext context, Rect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.RECT__EDGE_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.RECT__EDGE_X));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.RECT__EDGE_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.RECT__EDGE_Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRectAccess().getNameRectKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRectAccess().getEdgeXFLOATTerminalRuleCall_1_0(), semanticObject.getEdgeX());
		feeder.accept(grammarAccess.getRectAccess().getEdgeYFLOATTerminalRuleCall_2_0(), semanticObject.getEdgeY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShapeDef returns ShapeGroup
	 *     ShapeGroup returns ShapeGroup
	 *
	 * Constraint:
	 *     (name=ID (s1=Shape | s11=[BasicShape|ID]) s22+=[BasicShape|ID]? (s2+=Shape? s22+=[BasicShape|ID]?)* sg+=[ShapeGroup|ID]*)
	 */
	protected void sequence_ShapeGroup(ISerializationContext context, ShapeGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Shape returns Shape
	 *
	 * Constraint:
	 *     (stencil=Stencil draw=Draw)
	 */
	protected void sequence_Shape(ISerializationContext context, Shape semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.SHAPE__STENCIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.SHAPE__STENCIL));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.SHAPE__DRAW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.SHAPE__DRAW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeAccess().getStencilStencilParserRuleCall_0_0_0(), semanticObject.getStencil());
		feeder.accept(grammarAccess.getShapeAccess().getDrawDrawParserRuleCall_0_2_0(), semanticObject.getDraw());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Terminal_Bool_exp returns Terminal_Bool_exp
	 *
	 * Constraint:
	 *     (n1=Num_value comp=COMPARISON n2=Num_value)
	 */
	protected void sequence_Terminal_Bool_exp(ISerializationContext context, Terminal_Bool_exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__N1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__N1));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__COMP));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__N2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.TERMINAL_BOOL_EXP__N2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminal_Bool_expAccess().getN1Num_valueParserRuleCall_0_0(), semanticObject.getN1());
		feeder.accept(grammarAccess.getTerminal_Bool_expAccess().getCompCOMPARISONEnumRuleCall_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getTerminal_Bool_expAccess().getN2Num_valueParserRuleCall_2_0(), semanticObject.getN2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Stencil returns Text
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (name='text' content=STRING)
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.STENCIL__NAME));
			if (transientValues.isValueTransient(semanticObject, OnlineElmPackage.Literals.TEXT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OnlineElmPackage.Literals.TEXT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAccess().getNameTextKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
}