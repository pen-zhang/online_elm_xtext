/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getShape_1 <em>Shape 1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getNested_1 <em>Nested 1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getShape_2 <em>Shape 2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getNested_2 <em>Nested 2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getColor_1 <em>Color 1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getColor_2 <em>Color 2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getNum_1 <em>Num 1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getNum_2 <em>Num 2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getStr_1 <em>Str 1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_expr#getStr_2 <em>Str 2</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr()
 * @model
 * @generated
 */
public interface Bool_expr extends Conditional_Shape, Conditional_Color, Conditional_Num, Conditional_Str
{
  /**
   * Returns the value of the '<em><b>Shape 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape 1</em>' containment reference.
   * @see #setShape_1(Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Shape_1()
   * @model containment="true"
   * @generated
   */
  Shape getShape_1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getShape_1 <em>Shape 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape 1</em>' containment reference.
   * @see #getShape_1()
   * @generated
   */
  void setShape_1(Shape value);

  /**
   * Returns the value of the '<em><b>Nested 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested 1</em>' containment reference.
   * @see #setNested_1(EObject)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Nested_1()
   * @model containment="true"
   * @generated
   */
  EObject getNested_1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getNested_1 <em>Nested 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested 1</em>' containment reference.
   * @see #getNested_1()
   * @generated
   */
  void setNested_1(EObject value);

  /**
   * Returns the value of the '<em><b>Shape 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape 2</em>' containment reference.
   * @see #setShape_2(Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Shape_2()
   * @model containment="true"
   * @generated
   */
  Shape getShape_2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getShape_2 <em>Shape 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape 2</em>' containment reference.
   * @see #getShape_2()
   * @generated
   */
  void setShape_2(Shape value);

  /**
   * Returns the value of the '<em><b>Nested 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested 2</em>' containment reference.
   * @see #setNested_2(EObject)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Nested_2()
   * @model containment="true"
   * @generated
   */
  EObject getNested_2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getNested_2 <em>Nested 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested 2</em>' containment reference.
   * @see #getNested_2()
   * @generated
   */
  void setNested_2(EObject value);

  /**
   * Returns the value of the '<em><b>Color 1</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color 1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #setColor_1(Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Color_1()
   * @model
   * @generated
   */
  Color getColor_1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getColor_1 <em>Color 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color 1</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #getColor_1()
   * @generated
   */
  void setColor_1(Color value);

  /**
   * Returns the value of the '<em><b>Color 2</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.Color}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color 2</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #setColor_2(Color)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Color_2()
   * @model
   * @generated
   */
  Color getColor_2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getColor_2 <em>Color 2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color 2</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.Color
   * @see #getColor_2()
   * @generated
   */
  void setColor_2(Color value);

  /**
   * Returns the value of the '<em><b>Num 1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num 1</em>' attribute.
   * @see #setNum_1(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Num_1()
   * @model
   * @generated
   */
  String getNum_1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getNum_1 <em>Num 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num 1</em>' attribute.
   * @see #getNum_1()
   * @generated
   */
  void setNum_1(String value);

  /**
   * Returns the value of the '<em><b>Num 2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num 2</em>' attribute.
   * @see #setNum_2(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Num_2()
   * @model
   * @generated
   */
  String getNum_2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getNum_2 <em>Num 2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num 2</em>' attribute.
   * @see #getNum_2()
   * @generated
   */
  void setNum_2(String value);

  /**
   * Returns the value of the '<em><b>Str 1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str 1</em>' attribute.
   * @see #setStr_1(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Str_1()
   * @model
   * @generated
   */
  String getStr_1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getStr_1 <em>Str 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str 1</em>' attribute.
   * @see #getStr_1()
   * @generated
   */
  void setStr_1(String value);

  /**
   * Returns the value of the '<em><b>Str 2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str 2</em>' attribute.
   * @see #setStr_2(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_expr_Str_2()
   * @model
   * @generated
   */
  String getStr_2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_expr#getStr_2 <em>Str 2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str 2</em>' attribute.
   * @see #getStr_2()
   * @generated
   */
  void setStr_2(String value);

} // Bool_expr
