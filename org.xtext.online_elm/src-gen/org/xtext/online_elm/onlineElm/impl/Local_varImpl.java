/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.online_elm.onlineElm.Local_var;
import org.xtext.online_elm.onlineElm.Num_value;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Local_varImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Local_varImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Local_varImpl extends MinimalEObjectImpl.Container implements Local_var
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Num_value var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Local_varImpl()
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
    return OnlineElmPackage.Literals.LOCAL_VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.LOCAL_VAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Num_value getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Num_value newVar, NotificationChain msgs)
  {
    Num_value oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.LOCAL_VAR__VAR, oldVar, newVar);
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
  public void setVar(Num_value newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.LOCAL_VAR__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.LOCAL_VAR__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.LOCAL_VAR__VAR, newVar, newVar));
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
      case OnlineElmPackage.LOCAL_VAR__VAR:
        return basicSetVar(null, msgs);
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
      case OnlineElmPackage.LOCAL_VAR__NAME:
        return getName();
      case OnlineElmPackage.LOCAL_VAR__VAR:
        return getVar();
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
      case OnlineElmPackage.LOCAL_VAR__NAME:
        setName((String)newValue);
        return;
      case OnlineElmPackage.LOCAL_VAR__VAR:
        setVar((Num_value)newValue);
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
      case OnlineElmPackage.LOCAL_VAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OnlineElmPackage.LOCAL_VAR__VAR:
        setVar((Num_value)null);
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
      case OnlineElmPackage.LOCAL_VAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OnlineElmPackage.LOCAL_VAR__VAR:
        return var != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Local_varImpl
