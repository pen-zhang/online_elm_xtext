/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Compare_expr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getCompare_expr()
 * @model
 * @generated
 */
public interface Compare_expr extends Not_expr
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getCompare_expr_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Compare_expr#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

} // Compare_expr
