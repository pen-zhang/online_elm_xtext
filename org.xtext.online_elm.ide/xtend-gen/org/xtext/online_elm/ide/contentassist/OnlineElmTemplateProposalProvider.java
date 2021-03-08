/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.online_elm.ide.contentassist;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.ide.editor.contentassist.AbstractIdeTemplateProposalProvider;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.online_elm.onlineElm.ShapeList;

@SuppressWarnings("all")
public class OnlineElmTemplateProposalProvider extends AbstractIdeTemplateProposalProvider {
  public void createMainShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("myShapes time = [");
        target.newLine();
        target.append("  ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("shape"));
        target.newLine();
        target.append("  ]");
      }
    };
    this.acceptProposal("MainShape", "Create a new main shape", template, context, acceptor);
  }
  
  public void createShapeListProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.newLineIfNotEmpty();
        target.append(OnlineElmTemplateProposalProvider.this.variable("list_name"));
        target.append(" = [");
        target.newLine();
        target.append("  ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("shapes"));
        target.newLine();
        target.append("  ]");
      }
    };
    this.acceptProposal("ShapeList", "Create a new shape list", template, context, acceptor);
  }
  
  public void createBasicShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.newLineIfNotEmpty();
        target.append(OnlineElmTemplateProposalProvider.this.variable("new_shape"));
        target.append(" = ");
        target.newLine();
        target.append("  ");
        target.append("circle 50 |> filled red");
      }
    };
    this.acceptProposal("Shape", "Create a new shape", template, context, acceptor);
  }
  
  public void createCircleProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("circle ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("radius"));
        target.append(" |> ");
        target.append("filled ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("color"));
      }
    };
    this.acceptProposal("circle", "Replace with a circle", template, context, acceptor);
  }
  
  public void createRectProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("rect ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("width"));
        target.append(" ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("height"));
        target.append(" |> ");
        target.append("filled ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("color"));
      }
    };
    this.acceptProposal("rect", "Replace with a rectangle", template, context, acceptor);
  }
  
  public void createTextProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("text ");
        target.append("\"content\"");
        target.append(" |> ");
        target.append("filled ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("color"));
      }
    };
    this.acceptProposal("text", "Replace with text", template, context, acceptor);
  }
  
  public void createPlusShapeGroupProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    abstract class __OnlineElmTemplateProposalProvider_7 extends StringConcatenationClient {
      Iterator<ShapeList> shapelists;
      
      int n;
    }
    
    final StringConcatenationClient template = new __OnlineElmTemplateProposalProvider_7() {
      {
        shapelists = Iterators.<ShapeList>filter(context.getRootModel().eAllContents(), ShapeList.class);
        
        n = (IteratorExtensions.size(this.shapelists) + 1);
      }
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.newLineIfNotEmpty();
        target.append("++ ");
        target.append(("shapelist_" + Integer.valueOf(this.n)));
      }
    };
    this.acceptProposal("combine shapes", "Combined with another shape list", template, context, acceptor);
  }
  
  public void createMoveProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("move ");
        target.append("( ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("x"));
        target.append(" , ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("y"));
        target.append(" )");
      }
    };
    this.acceptProposal("move", "Move shape to position (x,y)", template, context, acceptor);
  }
  
  public void createNewInternalShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.newLineIfNotEmpty();
        target.append(", ");
        target.append(OnlineElmTemplateProposalProvider.this.variable("shape"));
      }
    };
    this.acceptProposal(", shape", "Add another shape", template, context, acceptor);
  }
  
  public void createShapeProposal(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    final StringConcatenationClient template = new StringConcatenationClient() {
      @Override
      protected void appendTo(final StringConcatenationClient.TargetStringConcatenation target) {
        target.append("circle 50 |> filled red");
      }
    };
    this.acceptProposal("default shape", "Add a circle here", template, context, acceptor);
  }
}
