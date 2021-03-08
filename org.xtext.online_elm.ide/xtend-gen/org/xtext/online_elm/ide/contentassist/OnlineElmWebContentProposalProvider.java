/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.online_elm.ide.contentassist;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.online_elm.ide.contentassist.OnlineElmTemplateProposalProvider;
import org.xtext.online_elm.onlineElm.BasicShape;
import org.xtext.online_elm.onlineElm.Color;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;
import org.xtext.online_elm.onlineElm.ShapeList;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;

@SuppressWarnings("all")
public class OnlineElmWebContentProposalProvider extends IdeContentProposalProvider {
  @Inject
  @Extension
  private OnlineElmGrammarAccess _onlineElmGrammarAccess;
  
  @Inject
  private OnlineElmTemplateProposalProvider templateProvider;
  
  private final int COLOR = 850;
  
  private final int STENCIL = 800;
  
  private final int MATHEXP = 200;
  
  private final int BOOL = 250;
  
  private final int TRANS = 450;
  
  private final int CONDI = 100;
  
  private final int REF = 700;
  
  @Override
  protected void _createProposals(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    AbstractRule _rule = ruleCall.getRule();
    boolean _matched = false;
    ParserRule _mainShapeRule = this._onlineElmGrammarAccess.getMainShapeRule();
    if (Objects.equal(_rule, _mainShapeRule)) {
      _matched=true;
      this.templateProvider.createMainShapeProposal(context, acceptor);
    }
    if (!_matched) {
      ParserRule _shapeListRule = this._onlineElmGrammarAccess.getShapeListRule();
      if (Objects.equal(_rule, _shapeListRule)) {
        _matched=true;
        final Iterator<ShapeList> shapelists = Iterators.<ShapeList>filter(context.getRootModel().eAllContents(), ShapeList.class);
        int _size = IteratorExtensions.size(shapelists);
        final int n = (_size + 1);
        ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setProposal((("\nshapeList_" + Integer.valueOf(n)) + " = [\n  shape\n  ]"));
          it.setDescription("Create a new shape list");
          it.setLabel("ShapeList");
        };
        final ContentAssistEntry entry = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function);
        acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
      }
    }
    if (!_matched) {
      ParserRule _local_varRule = this._onlineElmGrammarAccess.getLocal_varRule();
      if (Objects.equal(_rule, _local_varRule)) {
        _matched=true;
      }
    }
    if (!_matched) {
      ParserRule _basicShapeRule = this._onlineElmGrammarAccess.getBasicShapeRule();
      if (Objects.equal(_rule, _basicShapeRule)) {
        _matched=true;
        final Iterator<BasicShape> shapes = Iterators.<BasicShape>filter(context.getRootModel().eAllContents(), BasicShape.class);
        int _size_1 = IteratorExtensions.size(shapes);
        final int n_1 = (_size_1 + 1);
        ContentAssistEntry _contentAssistEntry_1 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_1 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setProposal((("\nshape_" + Integer.valueOf(n_1)) + " = \n  circle 50 |> filled red"));
          it.setDescription("Create a new shape");
          it.setLabel("Shape");
        };
        final ContentAssistEntry entry_1 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_1, _function_1);
        acceptor.accept(entry_1, this.getProposalPriorities().getDefaultPriority(entry_1));
      }
    }
    if (!_matched) {
      EnumRule _colorRule = this._onlineElmGrammarAccess.getColorRule();
      if (Objects.equal(_rule, _colorRule)) {
        _matched=true;
        for (final Color color : Color.VALUES) {
          {
            ContentAssistEntry _contentAssistEntry_2 = new ContentAssistEntry();
            final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
              it.setSource(it.getDescription());
              it.setPrefix(context.getPrefix());
              it.setProposal(color.toString());
              String _string = color.toString();
              String _plus = ("Shape filled with " + _string);
              it.setDescription(_plus);
            };
            final ContentAssistEntry entry_2 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_2, _function_2);
            acceptor.accept(entry_2, this.COLOR);
          }
        }
      }
    }
    if (!_matched) {
      ParserRule _bool_exprRule = this._onlineElmGrammarAccess.getBool_exprRule();
      if (Objects.equal(_rule, _bool_exprRule)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_2 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("not \u270d");
          it.setLabel("not \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_not = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_2, _function_2);
        acceptor.accept(entry_not, this.BOOL);
        ContentAssistEntry _contentAssistEntry_3 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_3 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d || \u270d");
          it.setLabel("\u270d || \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_or = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_3, _function_3);
        acceptor.accept(entry_or, this.BOOL);
        ContentAssistEntry _contentAssistEntry_4 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_4 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d && \u270d");
          it.setLabel("\u270d && \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_and = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_4, _function_4);
        acceptor.accept(entry_and, this.BOOL);
        ContentAssistEntry _contentAssistEntry_5 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_5 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d == \u270d");
          it.setLabel("\u270d == \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_eq = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_5, _function_5);
        acceptor.accept(entry_eq, this.BOOL);
        ContentAssistEntry _contentAssistEntry_6 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_6 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d != \u270d");
          it.setLabel("\u270d != \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_neq = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_6, _function_6);
        acceptor.accept(entry_neq, this.BOOL);
        ContentAssistEntry _contentAssistEntry_7 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_7 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d > \u270d");
          it.setLabel("\u270d > \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_gt = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_7, _function_7);
        acceptor.accept(entry_gt, this.BOOL);
        ContentAssistEntry _contentAssistEntry_8 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_8 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d >= \u270d");
          it.setLabel("\u270d >= \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_gte = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_8, _function_8);
        acceptor.accept(entry_gte, this.BOOL);
        ContentAssistEntry _contentAssistEntry_9 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_9 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d < \u270d");
          it.setLabel("\u270d && \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_lt = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_9, _function_9);
        acceptor.accept(entry_lt, this.BOOL);
        ContentAssistEntry _contentAssistEntry_10 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_10 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\u270d <= \u270d");
          it.setLabel("\u270d <= \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_lte = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_10, _function_10);
        acceptor.accept(entry_lte, this.BOOL);
      }
    }
    if (!_matched) {
      ParserRule _math_expRule = this._onlineElmGrammarAccess.getMath_expRule();
      if (Objects.equal(_rule, _math_expRule)) {
        _matched=true;
        System.out.println(context.getLastCompleteNode().getText());
        String _prefix = context.getPrefix();
        String _plus = ("prefix: " + _prefix);
        System.out.println(_plus);
        String _text = context.getCurrentNode().getText();
        String _plus_1 = ("text: " + _text);
        System.out.println(_plus_1);
        ContentAssistEntry _contentAssistEntry_11 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_11 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("(\u270d + \u270d)");
          it.setLabel("\u270d + \u270d ");
          it.setDescription("");
        };
        final ContentAssistEntry entry_add = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_11, _function_11);
        acceptor.accept(entry_add, this.MATHEXP);
        ContentAssistEntry _contentAssistEntry_12 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_12 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("(\u270d - \u270d)");
          it.setLabel("\u270d - \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_sub = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_12, _function_12);
        acceptor.accept(entry_sub, this.MATHEXP);
        ContentAssistEntry _contentAssistEntry_13 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_13 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("(\u270d * \u270d)");
          it.setLabel("\u270d * \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_times = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_13, _function_13);
        acceptor.accept(entry_times, this.MATHEXP);
        ContentAssistEntry _contentAssistEntry_14 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_14 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("(\u270d / \u270d)");
          it.setLabel("\u270d / \u270d");
          it.setDescription("");
        };
        final ContentAssistEntry entry_div = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_14, _function_14);
        acceptor.accept(entry_div, this.MATHEXP);
      }
    }
    if (!_matched) {
      super._createProposals(ruleCall, context, acceptor);
    }
  }
  
  @Override
  protected void _createProposals(final Assignment assignment, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    boolean _matched = false;
    Assignment _nameAssignment_0 = this._onlineElmGrammarAccess.getLocal_varAccess().getNameAssignment_0();
    if (Objects.equal(assignment, _nameAssignment_0)) {
      _matched=true;
    }
    if (!_matched) {
      Assignment _shapeAssignment_4_0 = this._onlineElmGrammarAccess.getMainShapeAccess().getShapeAssignment_4_0();
      if (Objects.equal(assignment, _shapeAssignment_4_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _moreShapesAssignment_5_2_0 = this._onlineElmGrammarAccess.getMainShapeAccess().getMoreShapesAssignment_5_2_0();
      if (Objects.equal(assignment, _moreShapesAssignment_5_2_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _conditionalAssignment_4_1 = this._onlineElmGrammarAccess.getMainShapeAccess().getConditionalAssignment_4_1();
      if (Objects.equal(assignment, _conditionalAssignment_4_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else \u270d");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function);
        acceptor.accept(entry, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _moreConditionalAssignment_5_2_1 = this._onlineElmGrammarAccess.getMainShapeAccess().getMoreConditionalAssignment_5_2_1();
      if (Objects.equal(assignment, _moreConditionalAssignment_5_2_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_1 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_1 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_1 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_1, _function_1);
        acceptor.accept(entry_1, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _shapeAssignment_3_0 = this._onlineElmGrammarAccess.getShapeListAccess().getShapeAssignment_3_0();
      if (Objects.equal(assignment, _shapeAssignment_3_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _moreShapesAssignment_4_2_0 = this._onlineElmGrammarAccess.getShapeListAccess().getMoreShapesAssignment_4_2_0();
      if (Objects.equal(assignment, _moreShapesAssignment_4_2_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _conditionalAssignment_3_1 = this._onlineElmGrammarAccess.getShapeListAccess().getConditionalAssignment_3_1();
      if (Objects.equal(assignment, _conditionalAssignment_3_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_2 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_2 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_2, _function_2);
        acceptor.accept(entry_2, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _moreConditionalAssignment_4_2_1 = this._onlineElmGrammarAccess.getShapeListAccess().getMoreConditionalAssignment_4_2_1();
      if (Objects.equal(assignment, _moreConditionalAssignment_4_2_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_3 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_3 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_3 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_3, _function_3);
        acceptor.accept(entry_3, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _nameAssignment_0_1 = this._onlineElmGrammarAccess.getShapeListAccess().getNameAssignment_0();
      if (Objects.equal(assignment, _nameAssignment_0_1)) {
        _matched=true;
        EObject _semanticElement = context.getCurrentNode().getParent().getSemanticElement();
        if ((_semanticElement instanceof BasicShape)) {
          final Iterator<ShapeList> shapelists = Iterators.<ShapeList>filter(context.getRootModel().eAllContents(), ShapeList.class);
          int _size = IteratorExtensions.size(shapelists);
          final int n = (_size + 1);
          ContentAssistEntry _contentAssistEntry_4 = new ContentAssistEntry();
          final Procedure1<ContentAssistEntry> _function_4 = (ContentAssistEntry it) -> {
            it.setLabel("Name your new shape list");
            it.setSource(it.getDescription());
            it.setPrefix(context.getPrefix());
            String _string = Integer.valueOf(n).toString();
            String _plus = ("shapelist_" + _string);
            it.setProposal(_plus);
            it.setDescription("Input a name starting with a lowecase");
          };
          final ContentAssistEntry entry_4 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_4, _function_4);
          acceptor.accept(entry_4, this.getProposalPriorities().getDefaultPriority(entry_4));
        }
      }
    }
    if (!_matched) {
      Assignment _shapeAssignment_3_0_1 = this._onlineElmGrammarAccess.getBasicShapeAccess().getShapeAssignment_3_0();
      if (Objects.equal(assignment, _shapeAssignment_3_0_1)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _nameAssignment_0_2 = this._onlineElmGrammarAccess.getBasicShapeAccess().getNameAssignment_0();
      if (Objects.equal(assignment, _nameAssignment_0_2)) {
        _matched=true;
        EObject _semanticElement_1 = context.getCurrentNode().getParent().getSemanticElement();
        if ((_semanticElement_1 instanceof BasicShape)) {
          final Iterator<BasicShape> shapes = Iterators.<BasicShape>filter(context.getRootModel().eAllContents(), BasicShape.class);
          final int n_1 = IteratorExtensions.size(shapes);
          ContentAssistEntry _contentAssistEntry_5 = new ContentAssistEntry();
          final Procedure1<ContentAssistEntry> _function_5 = (ContentAssistEntry it) -> {
            it.setLabel("Name your new shape");
            it.setSource(it.getDescription());
            it.setPrefix(context.getPrefix());
            it.setProposal(("shape_" + Integer.valueOf(n_1)));
            it.setDescription("Input a name starting with a lowecase");
          };
          final ContentAssistEntry entry_5 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_5, _function_5);
          acceptor.accept(entry_5, this.getProposalPriorities().getDefaultPriority(entry_5));
        }
      }
    }
    if (!_matched) {
      Assignment _conditionalAssignment_3_1_1 = this._onlineElmGrammarAccess.getBasicShapeAccess().getConditionalAssignment_3_1();
      if (Objects.equal(assignment, _conditionalAssignment_3_1_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_6 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_6 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_6 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_6, _function_6);
        acceptor.accept(entry_6, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _shape_1Assignment_4_0 = this._onlineElmGrammarAccess.getConditional_ShapeAccess().getShape_1Assignment_4_0();
      if (Objects.equal(assignment, _shape_1Assignment_4_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _nested_1Assignment_4_1 = this._onlineElmGrammarAccess.getConditional_ShapeAccess().getNested_1Assignment_4_1();
      if (Objects.equal(assignment, _nested_1Assignment_4_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_7 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_7 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_7 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_7, _function_7);
        acceptor.accept(entry_7, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _shape_2Assignment_8_0 = this._onlineElmGrammarAccess.getConditional_ShapeAccess().getShape_2Assignment_8_0();
      if (Objects.equal(assignment, _shape_2Assignment_8_0)) {
        _matched=true;
        this.stencilProposal(assignment, context, acceptor);
      }
    }
    if (!_matched) {
      Assignment _nested_2Assignment_8_1 = this._onlineElmGrammarAccess.getConditional_ShapeAccess().getNested_2Assignment_8_1();
      if (Objects.equal(assignment, _nested_2Assignment_8_1)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_8 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_8 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setProposal("\nif \u270d then\n  \u270d\nelse\n  \u270d\n");
          it.setLabel("if \u270d then \u270d else");
          it.setDescription("Add conditional to choose shape");
        };
        final ContentAssistEntry entry_8 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_8, _function_8);
        acceptor.accept(entry_8, this.CONDI);
      }
    }
    if (!_matched) {
      Assignment _filledAssignment_0_0 = this._onlineElmGrammarAccess.getDrawAccess().getFilledAssignment_0_0();
      if (Objects.equal(assignment, _filledAssignment_0_0)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_9 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_9 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("filled");
          it.setProposal("filled \u270d");
          it.setDescription("Fill shape with color");
        };
        final ContentAssistEntry entry_filled = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_9, _function_9);
        entry_filled.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_filled, this.getProposalPriorities().getDefaultPriority(entry_filled));
      }
    }
    if (!_matched) {
      Assignment _lineType1Assignment_2_3 = this._onlineElmGrammarAccess.getFilledAccess().getLineType1Assignment_2_3();
      if (Objects.equal(assignment, _lineType1Assignment_2_3)) {
        _matched=true;
        final int LINETYPE = 100;
        ContentAssistEntry _contentAssistEntry_10 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_10 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("solid \u270d");
          it.setProposal("solid \u270d");
          it.setDescription("Outline shape with (width) solid line");
        };
        final ContentAssistEntry entry_solid = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_10, _function_10);
        entry_solid.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_solid, LINETYPE);
        ContentAssistEntry _contentAssistEntry_11 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_11 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("dotted \u270d");
          it.setProposal("dotted \u270d");
          it.setDescription("Outline shape with (width) dotted line");
        };
        final ContentAssistEntry entry_dotted = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_11, _function_11);
        entry_dotted.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_dotted, LINETYPE);
        ContentAssistEntry _contentAssistEntry_12 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_12 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("dashed \u270d");
          it.setProposal("dashed \u270d");
          it.setDescription("Outline shape with (width) dashed line");
        };
        final ContentAssistEntry entry_dashed = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_12, _function_12);
        entry_dashed.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_dashed, LINETYPE);
        ContentAssistEntry _contentAssistEntry_13 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_13 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("dotdsah \u270d");
          it.setProposal("dotdash \u270d");
          it.setDescription("Outline shape with (width) dotdash line");
        };
        final ContentAssistEntry entry_dotdash = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_13, _function_13);
        entry_dotdash.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_dotdash, LINETYPE);
        ContentAssistEntry _contentAssistEntry_14 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_14 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("longdash \u270d");
          it.setProposal("longdash \u270d");
          it.setDescription("Outline shape with (width) longdash line");
        };
        final ContentAssistEntry entry_longdash = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_14, _function_14);
        entry_longdash.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_longdash, LINETYPE);
      }
    }
    if (!_matched) {
      Assignment _outlinedAssignment_0_1 = this._onlineElmGrammarAccess.getDrawAccess().getOutlinedAssignment_0_1();
      if (Objects.equal(assignment, _outlinedAssignment_0_1)) {
        _matched=true;
        String _text = context.getLastCompleteNode().getNextSibling().getText();
        String _plus = ("replaced text: " + _text);
        System.out.println(_plus);
        ContentAssistEntry _contentAssistEntry_15 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_15 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("outlined");
          it.setProposal("outlined (solid 5) red");
          it.setDescription("Outlined shape with colored line");
        };
        final ContentAssistEntry entry_outlined = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_15, _function_15);
        entry_outlined.setEscapePosition(Integer.valueOf(context.getLastCompleteNode().getNextSibling().getText().length()));
        acceptor.accept(entry_outlined, this.getProposalPriorities().getDefaultPriority(entry_outlined));
      }
    }
    if (!_matched) {
      Assignment _refAssignment_3 = this._onlineElmGrammarAccess.getNum_valueAccess().getRefAssignment_3();
      if (Objects.equal(assignment, _refAssignment_3)) {
        _matched=true;
        ContentAssistEntry _contentAssistEntry_16 = new ContentAssistEntry();
        final Procedure1<ContentAssistEntry> _function_16 = (ContentAssistEntry it) -> {
          it.setSource(it.getDescription());
          it.setPrefix(context.getPrefix());
          it.setLabel("time");
          it.setProposal("time");
          it.setDescription("Refer to the parameter \"time\"");
        };
        final ContentAssistEntry entry_9 = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_16, _function_16);
        acceptor.accept(entry_9, this.REF);
      }
    }
    if (!_matched) {
      super._createProposals(assignment, context, acceptor);
    }
  }
  
  @Override
  protected void _createProposals(final Keyword keyword, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    if ((Objects.equal(keyword, this._onlineElmGrammarAccess.getMainShapeAccess().getPlusSignPlusSignKeyword_8_1_0()) || 
      Objects.equal(keyword, this._onlineElmGrammarAccess.getShapeListAccess().getPlusSignPlusSignKeyword_7_1_0()))) {
      this.templateProvider.createPlusShapeGroupProposal(context, acceptor);
    }
    if ((Objects.equal(keyword, this._onlineElmGrammarAccess.getDrawAccess().getVerticalLineGreaterThanSignKeyword_1_0()) && (!Objects.equal(context.getPrefix(), "]")))) {
      System.out.println(context.getPrefix());
      ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("move");
        it.setProposal(" |> move (50, 50) ");
        it.setDescription("move (x,y)");
      };
      final ContentAssistEntry entry_move = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function);
      acceptor.accept(entry_move, this.TRANS);
      ContentAssistEntry _contentAssistEntry_1 = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function_1 = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("rotate");
        it.setProposal(" |> rotate ( degrees 90 ) ");
        it.setDescription("rotate the shape through degrees ");
      };
      final ContentAssistEntry entry_rotate = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_1, _function_1);
      acceptor.accept(entry_rotate, this.TRANS);
      ContentAssistEntry _contentAssistEntry_2 = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("scale");
        it.setProposal(" |> scale 0.5");
        it.setDescription("scale the shape");
      };
      final ContentAssistEntry entry_scale = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_2, _function_2);
      acceptor.accept(entry_scale, this.TRANS);
      ContentAssistEntry _contentAssistEntry_3 = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function_3 = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("scaleX");
        it.setProposal(" |> scaleX 0.5");
        it.setDescription("scale along X-axis");
      };
      final ContentAssistEntry entry_scaleX = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_3, _function_3);
      acceptor.accept(entry_scaleX, this.TRANS);
      ContentAssistEntry _contentAssistEntry_4 = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function_4 = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("scaleY");
        it.setProposal(" |> scaleY 0.5");
        it.setDescription("scale along X-axis");
      };
      final ContentAssistEntry entry_scaleY = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_4, _function_4);
      acceptor.accept(entry_scaleY, this.TRANS);
    }
    if ((Objects.equal(keyword, this._onlineElmGrammarAccess.getMainShapeAccess().getCommaKeyword_5_1()) || Objects.equal(keyword, this._onlineElmGrammarAccess.getShapeListAccess().getCommaKeyword_4_1()))) {
      this.templateProvider.createNewInternalShapeProposal(context, acceptor);
    }
    Keyword _verticalLineGreaterThanSignKeyword_2_0 = this._onlineElmGrammarAccess.getFilledAccess().getVerticalLineGreaterThanSignKeyword_2_0();
    boolean _equals = Objects.equal(keyword, _verticalLineGreaterThanSignKeyword_2_0);
    if (_equals) {
      ContentAssistEntry _contentAssistEntry_5 = new ContentAssistEntry();
      final Procedure1<ContentAssistEntry> _function_5 = (ContentAssistEntry it) -> {
        it.setSource(it.getDescription());
        it.setPrefix(context.getPrefix());
        it.setLabel("addOutline");
        it.setProposal(" |> addOutline ( solid 3 ) red ");
        it.setDescription("add outline");
      };
      final ContentAssistEntry entry_addoutline = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_5, _function_5);
      acceptor.accept(entry_addoutline, this.getProposalPriorities().getDefaultPriority(entry_addoutline));
    }
  }
  
  @Override
  protected boolean filterKeyword(final Keyword keyword, final ContentAssistContext context) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      _switchResult = super.filterKeyword(keyword, context);
    }
    return _switchResult;
  }
  
  public void stencilProposal(final Assignment assignment, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    int escapePosition = 0;
    int _length = context.getPrefix().length();
    boolean _equals = (_length == 0);
    if (_equals) {
      escapePosition = 0;
    } else {
      boolean _startsWith = "text".startsWith(context.getPrefix());
      if (_startsWith) {
        escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
      } else {
        boolean _startsWith_1 = "circle".startsWith(context.getPrefix());
        if (_startsWith_1) {
          escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
        } else {
          boolean _startsWith_2 = "rect".startsWith(context.getPrefix());
          if (_startsWith_2) {
            escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
          } else {
            boolean _startsWith_3 = "squre".startsWith(context.getPrefix());
            if (_startsWith_3) {
              escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
            } else {
              boolean _startsWith_4 = "roundedRect".startsWith(context.getPrefix());
              if (_startsWith_4) {
                escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
              } else {
                boolean _startsWith_5 = "oval".startsWith(context.getPrefix());
                if (_startsWith_5) {
                  escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
                } else {
                  boolean _startsWith_6 = "ngon".startsWith(context.getPrefix());
                  if (_startsWith_6) {
                    escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
                  } else {
                    boolean _startsWith_7 = "wedge".startsWith(context.getPrefix());
                    if (_startsWith_7) {
                      escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
                    } else {
                      boolean _startsWith_8 = "polygon".startsWith(context.getPrefix());
                      if (_startsWith_8) {
                        escapePosition = context.getLastCompleteNode().getNextSibling().getText().length();
                      } else {
                        boolean _startsWith_9 = "shape".startsWith(context.getPrefix());
                        if (_startsWith_9) {
                          escapePosition = 5;
                        } else {
                          escapePosition = 0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("circle");
      it.setProposal(this.stencilProposalContent("circle 50 |> filled red", context));
      it.setDescription("circle radius");
    };
    final ContentAssistEntry entry_circle = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function);
    entry_circle.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_circle, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_1 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_1 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("rect");
      it.setProposal(this.stencilProposalContent("rect 50 90 |> filled red", context));
      it.setDescription("rect width height");
    };
    final ContentAssistEntry entry_rect = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_1, _function_1);
    entry_rect.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_rect, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_2 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("square");
      it.setProposal(this.stencilProposalContent("square 50 |> filled red", context));
      it.setDescription("square sides");
    };
    final ContentAssistEntry entry_square = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_2, _function_2);
    entry_square.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_square, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_3 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_3 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("roundedRect");
      it.setProposal(this.stencilProposalContent("roundedRect 60 30 5 |> filled red", context));
      it.setDescription("roundedRect width height corner_radius");
    };
    final ContentAssistEntry entry_roundedRect = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_3, _function_3);
    entry_roundedRect.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_roundedRect, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_4 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_4 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("oval");
      it.setProposal(this.stencilProposalContent("oval 50 90 |> filled red", context));
      it.setDescription("oval width height");
    };
    final ContentAssistEntry entry_oval = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_4, _function_4);
    entry_oval.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_oval, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_5 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_5 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("ngon");
      it.setProposal(this.stencilProposalContent("ngon 7 50 |> filled red", context));
      it.setDescription("ngon sides radius");
    };
    final ContentAssistEntry entry_ngon = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_5, _function_5);
    entry_ngon.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_ngon, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_6 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_6 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("wedge");
      it.setProposal(this.stencilProposalContent("wedge 50 0.5 |> filled red", context));
      it.setDescription("wedge radius fraction");
    };
    final ContentAssistEntry entry_wedge = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_6, _function_6);
    entry_wedge.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_wedge, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_7 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_7 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setPrefix(context.getPrefix());
      it.setLabel("polygon");
      it.setProposal(this.stencilProposalContent("polygon [ ((-20),(-20)), (20,(-20)), (20,20) ] |> filled red", context));
      it.setDescription("polygon points");
    };
    final ContentAssistEntry entry_polygon = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_7, _function_7);
    entry_polygon.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_polygon, this.STENCIL);
    ContentAssistEntry _contentAssistEntry_8 = new ContentAssistEntry();
    final Procedure1<ContentAssistEntry> _function_8 = (ContentAssistEntry it) -> {
      it.setSource(it.getDescription());
      it.setLabel("text");
      it.setProposal(this.stencilProposalContent("text \"content\" |> filled red", context));
      it.setDescription("text \"content\"");
      it.setPrefix(context.getPrefix());
    };
    final ContentAssistEntry entry_text = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry_8, _function_8);
    entry_text.setEscapePosition(Integer.valueOf(escapePosition));
    acceptor.accept(entry_text, this.STENCIL);
  }
  
  public String stencilProposalContent(final String s, final ContentAssistContext context) {
    int _length = context.getPrefix().length();
    boolean _equals = (_length == 0);
    if (_equals) {
      return (s + "\n  , ");
    } else {
      return s;
    }
  }
  
  @Override
  protected void _createProposals(final CrossReference reference, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final Class<?> curRef = reference.getType().getClassifier().getInstanceClass();
    String extra = "";
    String _text = context.getCurrentNode().getText();
    String _plus = ("curnode: " + _text);
    System.out.println(_plus);
    String _text_1 = context.getLastCompleteNode().getText();
    String _plus_1 = ("prenode: " + _text_1);
    System.out.println(_plus_1);
    System.out.println(context.getLastCompleteNode().getNextSibling().getText());
    boolean _matched = false;
    if (Objects.equal(curRef, BasicShape.class)) {
      _matched=true;
      int _length = context.getPrefix().length();
      boolean _equals = (_length == 0);
      if (_equals) {
        extra = "\n  , ";
      }
      final EReference ref = GrammarUtil.getReference(reference);
      final EObject model = context.getCurrentModel();
      if (((ref != null) && (model != null))) {
        final IScope scope = this.getScopeProvider().getScope(model, ref);
        final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
          EClass _eClass = it.getEClass();
          return Boolean.valueOf(Objects.equal(_eClass, OnlineElmPackage.Literals.BASIC_SHAPE));
        };
        Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(scope.getAllElements(), _function);
        for (final IEObjectDescription description : _filter) {
          {
            final String crossRefProposal = (description + extra);
            ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
            final Procedure1<ContentAssistEntry> _function_1 = (ContentAssistEntry it) -> {
              it.setPrefix(context.getPrefix());
              it.setProposal(crossRefProposal);
              it.setDescription("Shape");
              it.setLabel(description.toString());
            };
            final ContentAssistEntry entry = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function_1);
            entry.setEscapePosition(Integer.valueOf(context.getCurrentNode().getText().length()));
            acceptor.accept(entry, this.REF);
          }
        }
        this.getCrossrefProposalProvider().lookupCrossReference(scope, reference, context, acceptor, 
          this.getCrossrefFilter(reference, context));
      }
    }
    if (!_matched) {
      if (Objects.equal(curRef, ShapeList.class)) {
        _matched=true;
        final EReference ref_1 = GrammarUtil.getReference(reference);
        final EObject model_1 = context.getCurrentModel();
        if (((ref_1 != null) && (model_1 != null))) {
          final IScope scope_1 = this.getScopeProvider().getScope(model_1, ref_1);
          final Function1<IEObjectDescription, Boolean> _function_1 = (IEObjectDescription it) -> {
            EClass _eClass = it.getEClass();
            return Boolean.valueOf(Objects.equal(_eClass, OnlineElmPackage.Literals.SHAPE_LIST));
          };
          Iterable<IEObjectDescription> _filter_1 = IterableExtensions.<IEObjectDescription>filter(scope_1.getAllElements(), _function_1);
          for (final IEObjectDescription description_1 : _filter_1) {
            {
              final String crossRefProposal = (description_1 + extra);
              ContentAssistEntry _contentAssistEntry = new ContentAssistEntry();
              final Procedure1<ContentAssistEntry> _function_2 = (ContentAssistEntry it) -> {
                it.setPrefix(context.getPrefix());
                it.setProposal(crossRefProposal);
                it.setDescription("Shape List");
                it.setLabel(description_1.toString());
              };
              final ContentAssistEntry entry = ObjectExtensions.<ContentAssistEntry>operator_doubleArrow(_contentAssistEntry, _function_2);
              entry.setEscapePosition(Integer.valueOf(context.getCurrentNode().getText().length()));
              acceptor.accept(entry, this.REF);
            }
          }
          this.getCrossrefProposalProvider().lookupCrossReference(scope_1, reference, context, acceptor, 
            this.getCrossrefFilter(reference, context));
        }
      }
    }
    if (!_matched) {
      super._createProposals(reference, context, acceptor);
    }
  }
  
  @Override
  public void createProposals(final AbstractElement assignment, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    if (assignment instanceof Assignment) {
      _createProposals((Assignment)assignment, context, acceptor);
      return;
    } else if (assignment instanceof CrossReference) {
      _createProposals((CrossReference)assignment, context, acceptor);
      return;
    } else if (assignment instanceof Keyword) {
      _createProposals((Keyword)assignment, context, acceptor);
      return;
    } else if (assignment instanceof RuleCall) {
      _createProposals((RuleCall)assignment, context, acceptor);
      return;
    } else if (assignment != null) {
      _createProposals(assignment, context, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, context, acceptor).toString());
    }
  }
}
