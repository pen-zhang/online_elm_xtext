/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_exp#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_exp#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_exp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_exp#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Bool_exp#getRights <em>Rights</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp()
 * @model
 * @generated
 */
public interface Bool_exp extends Conditional
{
  /**
   * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' containment reference.
   * @see #setExp1(Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp_Exp1()
   * @model containment="true"
   * @generated
   */
  Shape getExp1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_exp#getExp1 <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' containment reference.
   * @see #getExp1()
   * @generated
   */
  void setExp1(Shape value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp_Exp2()
   * @model containment="true"
   * @generated
   */
  Shape getExp2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_exp#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(Shape value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Terminal_Bool_exp)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp_Left()
   * @model containment="true"
   * @generated
   */
  Terminal_Bool_exp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Bool_exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Terminal_Bool_exp value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.BOOL_OP}.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.BOOL_OP}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.xtext.online_elm.onlineElm.BOOL_OP
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp_Operator()
   * @model unique="false"
   * @generated
   */
  EList<BOOL_OP> getOperator();

  /**
   * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rights</em>' containment reference list.
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getBool_exp_Rights()
   * @model containment="true"
   * @generated
   */
  EList<Terminal_Bool_exp> getRights();

} // Bool_exp