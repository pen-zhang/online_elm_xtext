/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.ShapeDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.ShapeDef#getShape <em>Shape</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.ShapeDef#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getShapeDef()
 * @model
 * @generated
 */
public interface ShapeDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getShapeDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.ShapeDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' containment reference.
   * @see #setShape(Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getShapeDef_Shape()
   * @model containment="true"
   * @generated
   */
  Shape getShape();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.ShapeDef#getShape <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' containment reference.
   * @see #getShape()
   * @generated
   */
  void setShape(Shape value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(Conditional_Shape)
   * @see org.xtext.online_elm.onlineElm.OnlineElmPackage#getShapeDef_Conditional()
   * @model containment="true"
   * @generated
   */
  Conditional_Shape getConditional();

  /**
   * Sets the value of the '{@link org.xtext.online_elm.onlineElm.ShapeDef#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(Conditional_Shape value);

} // ShapeDef
