/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Operation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Operation#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Operation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Math_exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Math_exp)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOperation_Left()
   * @model containment="true"
   * @generated
   */
  Math_exp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Operation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Math_exp value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.MATH_OP}.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.MATH_OP}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see org.xtext.online_elm.onlineElm.MATH_OP
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOperation_Op()
   * @model unique="false"
   * @generated
   */
  EList<MATH_OP> getOp();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.Math_exp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOperation_Right()
   * @model containment="true"
   * @generated
   */
  EList<Math_exp> getRight();

} // Operation
