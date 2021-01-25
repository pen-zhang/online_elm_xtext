/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.online_elm.ide.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.online_elm.ide.contentassist.OnlineElmTemplateProposalProvider;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;

@SuppressWarnings("all")
public class OnlineElmWebContentProposalProvider extends IdeContentProposalProvider {
  @Inject
  @Extension
  private OnlineElmGrammarAccess _onlineElmGrammarAccess;
  
  @Inject
  private OnlineElmTemplateProposalProvider templateProvider;
  
  @Override
  protected void _createProposals(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    AbstractRule _rule = ruleCall.getRule();
    boolean _matched = false;
    ParserRule _shapeGroupRule = this._onlineElmGrammarAccess.getShapeGroupRule();
    if (Objects.equal(_rule, _shapeGroupRule)) {
      _matched=true;
      this.templateProvider.createShapeGroupProposal(context, acceptor);
    }
    if (!_matched) {
      ParserRule _shapeRule = this._onlineElmGrammarAccess.getShapeRule();
      if (Objects.equal(_rule, _shapeRule)) {
        _matched=true;
        this.templateProvider.createShapeProposal(context, acceptor);
      }
    }
    if (!_matched) {
      super._createProposals(ruleCall, context, acceptor);
    }
  }
  
  @Override
  public void createProposals(final AbstractElement ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    if (ruleCall instanceof Assignment) {
      _createProposals((Assignment)ruleCall, context, acceptor);
      return;
    } else if (ruleCall instanceof CrossReference) {
      _createProposals((CrossReference)ruleCall, context, acceptor);
      return;
    } else if (ruleCall instanceof Keyword) {
      _createProposals((Keyword)ruleCall, context, acceptor);
      return;
    } else if (ruleCall instanceof RuleCall) {
      _createProposals((RuleCall)ruleCall, context, acceptor);
      return;
    } else if (ruleCall != null) {
      _createProposals(ruleCall, context, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ruleCall, context, acceptor).toString());
    }
  }
}
