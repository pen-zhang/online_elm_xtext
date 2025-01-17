/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Point#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getPoint_X()
   * @model containment="true"
   * @generated
   */
  Num_value getX();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Point#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(Num_value value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getPoint_Y()
   * @model containment="true"
   * @generated
   */
  Num_value getY();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Point#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(Num_value value);

} // Point
