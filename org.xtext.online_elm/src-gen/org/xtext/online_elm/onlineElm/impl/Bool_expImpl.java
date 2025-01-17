/**
 * generated by Xtext 2.24.0
 */
package org.xtext.online_elm.onlineElm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.online_elm.onlineElm.BOOL_OP;
import org.xtext.online_elm.onlineElm.Bool_exp;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;
import org.xtext.online_elm.onlineElm.Shape;
import org.xtext.online_elm.onlineElm.Terminal_Bool_exp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Bool_expImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Bool_expImpl#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Bool_expImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Bool_expImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.Bool_expImpl#getRights <em>Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bool_expImpl extends ConditionalImpl implements Bool_exp
{
  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected Shape exp1;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected Shape exp2;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Terminal_Bool_exp left;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<BOOL_OP> operator;

  /**
   * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRights()
   * @generated
   * @ordered
   */
  protected EList<Terminal_Bool_exp> rights;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Bool_expImpl()
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
    return OnlineElmPackage.Literals.BOOL_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Shape getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp1(Shape newExp1, NotificationChain msgs)
  {
    Shape oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__EXP1, oldExp1, newExp1);
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
  public void setExp1(Shape newExp1)
  {
    if (newExp1 != exp1)
    {
      NotificationChain msgs = null;
      if (exp1 != null)
        msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__EXP1, null, msgs);
      if (newExp1 != null)
        msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__EXP1, null, msgs);
      msgs = basicSetExp1(newExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__EXP1, newExp1, newExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Shape getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(Shape newExp2, NotificationChain msgs)
  {
    Shape oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__EXP2, oldExp2, newExp2);
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
  public void setExp2(Shape newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__EXP2, newExp2, newExp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Terminal_Bool_exp getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Terminal_Bool_exp newLeft, NotificationChain msgs)
  {
    Terminal_Bool_exp oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__LEFT, oldLeft, newLeft);
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
  public void setLeft(Terminal_Bool_exp newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.BOOL_EXP__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.BOOL_EXP__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BOOL_OP> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<BOOL_OP>(BOOL_OP.class, this, OnlineElmPackage.BOOL_EXP__OPERATOR);
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Terminal_Bool_exp> getRights()
  {
    if (rights == null)
    {
      rights = new EObjectContainmentEList<Terminal_Bool_exp>(Terminal_Bool_exp.class, this, OnlineElmPackage.BOOL_EXP__RIGHTS);
    }
    return rights;
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
      case OnlineElmPackage.BOOL_EXP__EXP1:
        return basicSetExp1(null, msgs);
      case OnlineElmPackage.BOOL_EXP__EXP2:
        return basicSetExp2(null, msgs);
      case OnlineElmPackage.BOOL_EXP__LEFT:
        return basicSetLeft(null, msgs);
      case OnlineElmPackage.BOOL_EXP__RIGHTS:
        return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
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
      case OnlineElmPackage.BOOL_EXP__EXP1:
        return getExp1();
      case OnlineElmPackage.BOOL_EXP__EXP2:
        return getExp2();
      case OnlineElmPackage.BOOL_EXP__LEFT:
        return getLeft();
      case OnlineElmPackage.BOOL_EXP__OPERATOR:
        return getOperator();
      case OnlineElmPackage.BOOL_EXP__RIGHTS:
        return getRights();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OnlineElmPackage.BOOL_EXP__EXP1:
        setExp1((Shape)newValue);
        return;
      case OnlineElmPackage.BOOL_EXP__EXP2:
        setExp2((Shape)newValue);
        return;
      case OnlineElmPackage.BOOL_EXP__LEFT:
        setLeft((Terminal_Bool_exp)newValue);
        return;
      case OnlineElmPackage.BOOL_EXP__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends BOOL_OP>)newValue);
        return;
      case OnlineElmPackage.BOOL_EXP__RIGHTS:
        getRights().clear();
        getRights().addAll((Collection<? extends Terminal_Bool_exp>)newValue);
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
      case OnlineElmPackage.BOOL_EXP__EXP1:
        setExp1((Shape)null);
        return;
      case OnlineElmPackage.BOOL_EXP__EXP2:
        setExp2((Shape)null);
        return;
      case OnlineElmPackage.BOOL_EXP__LEFT:
        setLeft((Terminal_Bool_exp)null);
        return;
      case OnlineElmPackage.BOOL_EXP__OPERATOR:
        getOperator().clear();
        return;
      case OnlineElmPackage.BOOL_EXP__RIGHTS:
        getRights().clear();
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
      case OnlineElmPackage.BOOL_EXP__EXP1:
        return exp1 != null;
      case OnlineElmPackage.BOOL_EXP__EXP2:
        return exp2 != null;
      case OnlineElmPackage.BOOL_EXP__LEFT:
        return left != null;
      case OnlineElmPackage.BOOL_EXP__OPERATOR:
        return operator != null && !operator.isEmpty();
      case OnlineElmPackage.BOOL_EXP__RIGHTS:
        return rights != null && !rights.isEmpty();
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //Bool_expImpl
