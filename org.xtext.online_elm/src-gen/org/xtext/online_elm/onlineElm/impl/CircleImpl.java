/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.online_elm.onlineElm.Circle;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.CircleImpl#getDiameter <em>Diameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends StencilImpl implements Circle
{
  /**
   * The default value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiameter()
   * @generated
   * @ordered
   */
  protected static final float DIAMETER_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiameter()
   * @generated
   * @ordered
   */
  protected float diameter = DIAMETER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CircleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OnlineElmPackage.Literals.CIRCLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getDiameter()
  {
    return diameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDiameter(float newDiameter)
  {
    float oldDiameter = diameter;
    diameter = newDiameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.CIRCLE__DIAMETER, oldDiameter, diameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OnlineElmPackage.CIRCLE__DIAMETER:
        return getDiameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OnlineElmPackage.CIRCLE__DIAMETER:
        setDiameter((Float)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OnlineElmPackage.CIRCLE__DIAMETER:
        setDiameter(DIAMETER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OnlineElmPackage.CIRCLE__DIAMETER:
        return diameter != DIAMETER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (diameter: ");
    result.append(diameter);
    result.append(')');
    return result.toString();
  }

} //CircleImpl
