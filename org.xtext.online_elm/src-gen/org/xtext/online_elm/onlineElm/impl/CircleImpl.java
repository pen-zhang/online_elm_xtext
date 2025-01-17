/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.online_elm.onlineElm.Circle;
import org.xtext.online_elm.onlineElm.Num_value;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.CircleImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends StencilImpl implements Circle
{
  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected Num_value radius;

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
  public Num_value getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRadius(Num_value newRadius, NotificationChain msgs)
  {
    Num_value oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.CIRCLE__RADIUS, oldRadius, newRadius);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRadius(Num_value newRadius)
  {
    if (newRadius != radius)
    {
      NotificationChain msgs = null;
      if (radius != null)
        msgs = ((InternalEObject)radius).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.CIRCLE__RADIUS, null, msgs);
      if (newRadius != null)
        msgs = ((InternalEObject)newRadius).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.CIRCLE__RADIUS, null, msgs);
      msgs = basicSetRadius(newRadius, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.CIRCLE__RADIUS, newRadius, newRadius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OnlineElmPackage.CIRCLE__RADIUS:
        return basicSetRadius(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OnlineElmPackage.CIRCLE__RADIUS:
        return getRadius();
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
      case OnlineElmPackage.CIRCLE__RADIUS:
        setRadius((Num_value)newValue);
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
      case OnlineElmPackage.CIRCLE__RADIUS:
        setRadius((Num_value)null);
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
      case OnlineElmPackage.CIRCLE__RADIUS:
        return radius != null;
    }
    return super.eIsSet(featureID);
  }

} //CircleImpl
