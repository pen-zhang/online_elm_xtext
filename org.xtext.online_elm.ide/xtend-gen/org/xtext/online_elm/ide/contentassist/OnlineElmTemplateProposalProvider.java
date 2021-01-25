/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.online_elm.ide.contentassist;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.ide.editor.contentassist.AbstractIdeTemplateProposalProvider;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;

@SuppressWarnings("all")
public class OnlineElmTemplateProposalProvider extends AbstractIdeTemplateProposalProvider {
  public void createMainShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("mainShape = [");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<<cursor>>shape");
        _builder.newLine();
        _builder.append("]");
        _builder.newLine();
      }
    };
    final StringConcatenationClient template = _client;
    this.acceptProposal("MainShape", "Create a new main shape", template, context, acceptor);
  }
  
  public void createShapeGroupProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("<<variable(\'group_name\')>> = [");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<<cursor>>shape");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(", shape");
        _builder.newLine();
        _builder.append("]");
        _builder.newLine();
      }
    };
    final StringConcatenationClient template = _client;
    this.acceptProposal("ShapeGroup", "Create a new shape group", template, context, acceptor);
  }
  
  public void createShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("<<variable(\'shape_name\')>> = [");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<<cursor>> ");
        _builder.newLine();
        _builder.append("]");
        _builder.newLine();
      }
    };
    final StringConcatenationClient template = _client;
    this.acceptProposal("Shape", "Create a new shape", template, context, acceptor);
  }
}
