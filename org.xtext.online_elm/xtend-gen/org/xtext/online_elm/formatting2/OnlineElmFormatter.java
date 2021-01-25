/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.online_elm.onlineElm.Circle;
import org.xtext.online_elm.onlineElm.MainShape;
import org.xtext.online_elm.onlineElm.OnlineElm;
import org.xtext.online_elm.onlineElm.ShapeDef;
import org.xtext.online_elm.services.OnlineElmGrammarAccess;

@SuppressWarnings("all")
public class OnlineElmFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private OnlineElmGrammarAccess _onlineElmGrammarAccess;
  
  protected void _format(final OnlineElm onlineElm, @Extension final IFormattableDocument document) {
    document.<MainShape>format(onlineElm.getEntry());
    EList<ShapeDef> _shapes = onlineElm.getShapes();
    for (final ShapeDef shapeDef : _shapes) {
      document.<ShapeDef>format(shapeDef);
    }
  }
  
  protected void _format(final MainShape mainShape, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(mainShape).keyword("[");
    final ISemanticRegion close = this.textRegionExtensions.regionFor(mainShape).keyword("]");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(mainShape).keyword("mainShape ="), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.surround(close, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
  }
  
  protected void _format(final Circle circle, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(circle).keyword("Circle"), _function);
    document.<Float>format(Float.valueOf(circle.getDiameter()));
  }
  
  public void format(final Object circle, final IFormattableDocument document) {
    if (circle instanceof XtextResource) {
      _format((XtextResource)circle, document);
      return;
    } else if (circle instanceof Circle) {
      _format((Circle)circle, document);
      return;
    } else if (circle instanceof MainShape) {
      _format((MainShape)circle, document);
      return;
    } else if (circle instanceof OnlineElm) {
      _format((OnlineElm)circle, document);
      return;
    } else if (circle instanceof EObject) {
      _format((EObject)circle, document);
      return;
    } else if (circle == null) {
      _format((Void)null, document);
      return;
    } else if (circle != null) {
      _format(circle, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(circle, document).toString());
    }
  }
}