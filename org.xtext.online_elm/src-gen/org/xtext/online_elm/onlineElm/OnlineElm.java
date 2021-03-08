/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Elm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.OnlineElm#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.OnlineElm#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.OnlineElm#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOnlineElm()
 * @model
 * @generated
 */
public interface OnlineElm extends EObject
{
  /**
   * Returns the value of the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' containment reference.
   * @see #setEntry(MainShape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOnlineElm_Entry()
   * @model containment="true"
   * @generated
   */
  MainShape getEntry();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.OnlineElm#getEntry <em>Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry</em>' containment reference.
   * @see #getEntry()
   * @generated
   */
  void setEntry(MainShape value);

  /**
   * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.ShapeDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shapes</em>' containment reference list.
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOnlineElm_Shapes()
   * @model containment="true"
   * @generated
   */
  EList<ShapeDef> getShapes();

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.online_elm.onlineElm.Local_var}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference list.
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getOnlineElm_Var()
   * @model containment="true"
   * @generated
   */
  EList<Local_var> getVar();

} // OnlineElm
