/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outlined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Outlined#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Outlined#getLineType <em>Line Type</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Outlined#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Outlined#getOutlinedColor1 <em>Outlined Color1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Outlined#getOutlinedColor2 <em>Outlined Color2</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined()
 * @model
 * @generated
 */
public interface Outlined extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Outlined#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Line Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.LineType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Type</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.LineType
   * @see #setLineType(LineType)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined_LineType()
   * @model
   * @generated
   */
  LineType getLineType();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Outlined#getLineType <em>Line Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Type</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.LineType
   * @see #getLineType()
   * @generated
   */
  void setLineType(LineType value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined_Width()
   * @model
   * @generated
   */
  String getWidth();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Outlined#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(String value);

  /**
   * Returns the value of the '<em><b>Outlined Color1</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outlined Color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #setOutlinedColor1(Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined_OutlinedColor1()
   * @model
   * @generated
   */
  Color getOutlinedColor1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Outlined#getOutlinedColor1 <em>Outlined Color1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outlined Color1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #getOutlinedColor1()
   * @generated
   */
  void setOutlinedColor1(Color value);

  /**
   * Returns the value of the '<em><b>Outlined Color2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outlined Color2</em>' containment reference.
   * @see #setOutlinedColor2(Conditional_Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOutlined_OutlinedColor2()
   * @model containment="true"
   * @generated
   */
  Conditional_Color getOutlinedColor2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Outlined#getOutlinedColor2 <em>Outlined Color2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outlined Color2</em>' containment reference.
   * @see #getOutlinedColor2()
   * @generated
   */
  void setOutlinedColor2(Conditional_Color value);

} // Outlined
