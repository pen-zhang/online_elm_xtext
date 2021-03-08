/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Rotate#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Tranform
{
  /**
   * Returns the value of the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degree</em>' containment reference.
   * @see #setDegree(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getRotate_Degree()
   * @model containment="true"
   * @generated
   */
  Num_value getDegree();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Rotate#getDegree <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degree</em>' containment reference.
   * @see #getDegree()
   * @generated
   */
  void setDegree(Num_value value);

} // Rotate