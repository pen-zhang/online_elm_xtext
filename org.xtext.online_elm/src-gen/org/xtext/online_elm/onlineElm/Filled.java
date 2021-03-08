/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getFilledColor1 <em>Filled Color1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getFilledColor2 <em>Filled Color2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getLineType1 <em>Line Type1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getWidth1 <em>Width1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Filled#getOutline_color1 <em>Outline color1</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled()
 * @model
 * @generated
 */
public interface Filled extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Filled Color1</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filled Color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #setFilledColor1(Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_FilledColor1()
   * @model
   * @generated
   */
  Color getFilledColor1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getFilledColor1 <em>Filled Color1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filled Color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #getFilledColor1()
   * @generated
   */
  void setFilledColor1(Color value);

  /**
   * Returns the value of the '<em><b>Filled Color2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filled Color2</em>' containment reference.
   * @see #setFilledColor2(Conditional_Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_FilledColor2()
   * @model containment="true"
   * @generated
   */
  Conditional_Color getFilledColor2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getFilledColor2 <em>Filled Color2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filled Color2</em>' containment reference.
   * @see #getFilledColor2()
   * @generated
   */
  void setFilledColor2(Conditional_Color value);

  /**
   * Returns the value of the '<em><b>Line Type1</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.LineType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Type1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.LineType
   * @see #setLineType1(LineType)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_LineType1()
   * @model
   * @generated
   */
  LineType getLineType1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getLineType1 <em>Line Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Type1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.LineType
   * @see #getLineType1()
   * @generated
   */
  void setLineType1(LineType value);

  /**
   * Returns the value of the '<em><b>Width1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width1</em>' attribute.
   * @see #setWidth1(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_Width1()
   * @model
   * @generated
   */
  String getWidth1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getWidth1 <em>Width1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width1</em>' attribute.
   * @see #getWidth1()
   * @generated
   */
  void setWidth1(String value);

  /**
   * Returns the value of the '<em><b>Outline color1</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outline color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #setOutline_color1(Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getFilled_Outline_color1()
   * @model
   * @generated
   */
  Color getOutline_color1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Filled#getOutline_color1 <em>Outline color1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outline color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #getOutline_color1()
   * @generated
   */
  void setOutline_color1(Color value);

} // Filled