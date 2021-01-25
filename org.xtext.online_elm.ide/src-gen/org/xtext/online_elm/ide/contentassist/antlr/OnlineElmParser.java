/*
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.online_elm.ide.contentassist.antlr.internal.InternalOnlineElmParser;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;

public class OnlineElmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OnlineElmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OnlineElmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMainShapeAccess().getAlternatives_3(), "rule__MainShape__Alternatives_3");
			builder.put(grammarAccess.getMainShapeAccess().getAlternatives_4(), "rule__MainShape__Alternatives_4");
			builder.put(grammarAccess.getShapeDefAccess().getAlternatives(), "rule__ShapeDef__Alternatives");
			builder.put(grammarAccess.getShapeGroupAccess().getAlternatives_3(), "rule__ShapeGroup__Alternatives_3");
			builder.put(grammarAccess.getShapeGroupAccess().getAlternatives_4(), "rule__ShapeGroup__Alternatives_4");
			builder.put(grammarAccess.getShapeAccess().getAlternatives(), "rule__Shape__Alternatives");
			builder.put(grammarAccess.getNum_valueAccess().getAlternatives(), "rule__Num_value__Alternatives");
			builder.put(grammarAccess.getStencilAccess().getAlternatives(), "rule__Stencil__Alternatives");
			builder.put(grammarAccess.getBOOL_OPAccess().getAlternatives(), "rule__BOOL_OP__Alternatives");
			builder.put(grammarAccess.getMATH_OPAccess().getAlternatives(), "rule__MATH_OP__Alternatives");
			builder.put(grammarAccess.getCOMPARISONAccess().getAlternatives(), "rule__COMPARISON__Alternatives");
			builder.put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
			builder.put(grammarAccess.getMainShapeAccess().getGroup(), "rule__MainShape__Group__0");
			builder.put(grammarAccess.getMainShapeAccess().getGroup_4_0(), "rule__MainShape__Group_4_0__0");
			builder.put(grammarAccess.getMainShapeAccess().getGroup_6(), "rule__MainShape__Group_6__0");
			builder.put(grammarAccess.getShapeGroupAccess().getGroup(), "rule__ShapeGroup__Group__0");
			builder.put(grammarAccess.getShapeGroupAccess().getGroup_4_0(), "rule__ShapeGroup__Group_4_0__0");
			builder.put(grammarAccess.getShapeGroupAccess().getGroup_6(), "rule__ShapeGroup__Group_6__0");
			builder.put(grammarAccess.getBasicShapeAccess().getGroup(), "rule__BasicShape__Group__0");
			builder.put(grammarAccess.getShapeAccess().getGroup_0(), "rule__Shape__Group_0__0");
			builder.put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
			builder.put(grammarAccess.getBool_expAccess().getGroup(), "rule__Bool_exp__Group__0");
			builder.put(grammarAccess.getBool_expAccess().getGroup_2(), "rule__Bool_exp__Group_2__0");
			builder.put(grammarAccess.getTerminal_Bool_expAccess().getGroup(), "rule__Terminal_Bool_exp__Group__0");
			builder.put(grammarAccess.getMath_expAccess().getGroup(), "rule__Math_exp__Group__0");
			builder.put(grammarAccess.getCircleAccess().getGroup(), "rule__Circle__Group__0");
			builder.put(grammarAccess.getRectAccess().getGroup(), "rule__Rect__Group__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getDrawAccess().getGroup(), "rule__Draw__Group__0");
			builder.put(grammarAccess.getDrawAccess().getGroup_1(), "rule__Draw__Group_1__0");
			builder.put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
			builder.put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
			builder.put(grammarAccess.getOnlineElmAccess().getEntryAssignment_0(), "rule__OnlineElm__EntryAssignment_0");
			builder.put(grammarAccess.getOnlineElmAccess().getShapesAssignment_1(), "rule__OnlineElm__ShapesAssignment_1");
			builder.put(grammarAccess.getMainShapeAccess().getNameAssignment_0(), "rule__MainShape__NameAssignment_0");
			builder.put(grammarAccess.getMainShapeAccess().getS1Assignment_3_0(), "rule__MainShape__S1Assignment_3_0");
			builder.put(grammarAccess.getMainShapeAccess().getS11Assignment_3_1(), "rule__MainShape__S11Assignment_3_1");
			builder.put(grammarAccess.getMainShapeAccess().getS2Assignment_4_0_1(), "rule__MainShape__S2Assignment_4_0_1");
			builder.put(grammarAccess.getMainShapeAccess().getS22Assignment_4_1(), "rule__MainShape__S22Assignment_4_1");
			builder.put(grammarAccess.getMainShapeAccess().getSgAssignment_6_1(), "rule__MainShape__SgAssignment_6_1");
			builder.put(grammarAccess.getShapeGroupAccess().getNameAssignment_0(), "rule__ShapeGroup__NameAssignment_0");
			builder.put(grammarAccess.getShapeGroupAccess().getS1Assignment_3_0(), "rule__ShapeGroup__S1Assignment_3_0");
			builder.put(grammarAccess.getShapeGroupAccess().getS11Assignment_3_1(), "rule__ShapeGroup__S11Assignment_3_1");
			builder.put(grammarAccess.getShapeGroupAccess().getS2Assignment_4_0_1(), "rule__ShapeGroup__S2Assignment_4_0_1");
			builder.put(grammarAccess.getShapeGroupAccess().getS22Assignment_4_1(), "rule__ShapeGroup__S22Assignment_4_1");
			builder.put(grammarAccess.getShapeGroupAccess().getSgAssignment_6_1(), "rule__ShapeGroup__SgAssignment_6_1");
			builder.put(grammarAccess.getBasicShapeAccess().getNameAssignment_0(), "rule__BasicShape__NameAssignment_0");
			builder.put(grammarAccess.getBasicShapeAccess().getShapeAssignment_2(), "rule__BasicShape__ShapeAssignment_2");
			builder.put(grammarAccess.getShapeAccess().getStencilAssignment_0_0(), "rule__Shape__StencilAssignment_0_0");
			builder.put(grammarAccess.getShapeAccess().getDrawAssignment_0_2(), "rule__Shape__DrawAssignment_0_2");
			builder.put(grammarAccess.getConditionalAccess().getExp1Assignment_3(), "rule__Conditional__Exp1Assignment_3");
			builder.put(grammarAccess.getConditionalAccess().getExp2Assignment_5(), "rule__Conditional__Exp2Assignment_5");
			builder.put(grammarAccess.getBool_expAccess().getLeftAssignment_1(), "rule__Bool_exp__LeftAssignment_1");
			builder.put(grammarAccess.getBool_expAccess().getOperatorAssignment_2_0(), "rule__Bool_exp__OperatorAssignment_2_0");
			builder.put(grammarAccess.getBool_expAccess().getRightsAssignment_2_1(), "rule__Bool_exp__RightsAssignment_2_1");
			builder.put(grammarAccess.getTerminal_Bool_expAccess().getN1Assignment_0(), "rule__Terminal_Bool_exp__N1Assignment_0");
			builder.put(grammarAccess.getTerminal_Bool_expAccess().getCompAssignment_1(), "rule__Terminal_Bool_exp__CompAssignment_1");
			builder.put(grammarAccess.getTerminal_Bool_expAccess().getN2Assignment_2(), "rule__Terminal_Bool_exp__N2Assignment_2");
			builder.put(grammarAccess.getNum_valueAccess().getNumAssignment_0(), "rule__Num_value__NumAssignment_0");
			builder.put(grammarAccess.getMath_expAccess().getN1Assignment_1(), "rule__Math_exp__N1Assignment_1");
			builder.put(grammarAccess.getMath_expAccess().getOp1Assignment_2(), "rule__Math_exp__Op1Assignment_2");
			builder.put(grammarAccess.getMath_expAccess().getN2Assignment_3(), "rule__Math_exp__N2Assignment_3");
			builder.put(grammarAccess.getCircleAccess().getNameAssignment_0(), "rule__Circle__NameAssignment_0");
			builder.put(grammarAccess.getCircleAccess().getDiameterAssignment_1(), "rule__Circle__DiameterAssignment_1");
			builder.put(grammarAccess.getRectAccess().getNameAssignment_0(), "rule__Rect__NameAssignment_0");
			builder.put(grammarAccess.getRectAccess().getEdgeXAssignment_1(), "rule__Rect__EdgeXAssignment_1");
			builder.put(grammarAccess.getRectAccess().getEdgeYAssignment_2(), "rule__Rect__EdgeYAssignment_2");
			builder.put(grammarAccess.getTextAccess().getNameAssignment_0(), "rule__Text__NameAssignment_0");
			builder.put(grammarAccess.getTextAccess().getContentAssignment_1(), "rule__Text__ContentAssignment_1");
			builder.put(grammarAccess.getDrawAccess().getFilledColorAssignment_0(), "rule__Draw__FilledColorAssignment_0");
			builder.put(grammarAccess.getDrawAccess().getPositionAssignment_1_1(), "rule__Draw__PositionAssignment_1_1");
			builder.put(grammarAccess.getFillAccess().getNameAssignment_0(), "rule__Fill__NameAssignment_0");
			builder.put(grammarAccess.getFillAccess().getColorAssignment_1(), "rule__Fill__ColorAssignment_1");
			builder.put(grammarAccess.getMoveAccess().getNameAssignment_0(), "rule__Move__NameAssignment_0");
			builder.put(grammarAccess.getMoveAccess().getXAssignment_2(), "rule__Move__XAssignment_2");
			builder.put(grammarAccess.getMoveAccess().getYAssignment_4(), "rule__Move__YAssignment_4");
			builder.put(grammarAccess.getOnlineElmAccess().getUnorderedGroup(), "rule__OnlineElm__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OnlineElmGrammarAccess grammarAccess;

	@Override
	protected InternalOnlineElmParser createParser() {
		InternalOnlineElmParser result = new InternalOnlineElmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OnlineElmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OnlineElmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
