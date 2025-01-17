/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Square#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends Stencil
{
  /**
   * Returns the value of the '<em><b>Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Side</em>' containment reference.
   * @see #setSide(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getSquare_Side()
   * @model containment="true"
   * @generated
   */
  Num_value getSide();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Square#getSide <em>Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Side</em>' containment reference.
   * @see #getSide()
   * @generated
   */
  void setSide(Num_value value);

} // Square
