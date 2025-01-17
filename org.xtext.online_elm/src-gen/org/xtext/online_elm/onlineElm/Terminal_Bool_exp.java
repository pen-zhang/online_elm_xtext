/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Bool exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getN1 <em>N1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getN2 <em>N2</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getTerminal_Bool_exp()
 * @model
 * @generated
 */
public interface Terminal_Bool_exp extends EObject
{
  /**
   * Returns the value of the '<em><b>N1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N1</em>' containment reference.
   * @see #setN1(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getTerminal_Bool_exp_N1()
   * @model containment="true"
   * @generated
   */
  Num_value getN1();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getN1 <em>N1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N1</em>' containment reference.
   * @see #getN1()
   * @generated
   */
  void setN1(Num_value value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.online_elm.onlineElm.COMPARISON}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.COMPARISON
   * @see #setComp(COMPARISON)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getTerminal_Bool_exp_Comp()
   * @model
   * @generated
   */
  COMPARISON getComp();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getComp <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' attribute.
   * @see org.xtext.online_elm.onlineElm.COMPARISON
   * @see #getComp()
   * @generated
   */
  void setComp(COMPARISON value);

  /**
   * Returns the value of the '<em><b>N2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N2</em>' containment reference.
   * @see #setN2(Num_value)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getTerminal_Bool_exp_N2()
   * @model containment="true"
   * @generated
   */
  Num_value getN2();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.Terminal_Bool_exp#getN2 <em>N2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N2</em>' containment reference.
   * @see #getN2()
   * @generated
   */
  void setN2(Num_value value);

} // Terminal_Bool_exp
