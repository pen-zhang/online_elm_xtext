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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.online_elm.onlineElm.BasicShape;
import org.xtext.online_elm.onlineElm.OnlineElmPackage;
import org.xtext.online_elm.onlineElm.Shape;
import org.xtext.online_elm.onlineElm.ShapeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.ShapeGroupImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.ShapeGroupImpl#getS11 <em>S11</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.ShapeGroupImpl#getS2 <em>S2</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.ShapeGroupImpl#getS22 <em>S22</em>}</li>
 *   <li>{@link org.xtext.online_elm.onlineElm.impl.ShapeGroupImpl#getSg <em>Sg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeGroupImpl extends ShapeDefImpl implements ShapeGroup
{
  /**
   * The cached value of the '{@link #getS1() <em>S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS1()
   * @generated
   * @ordered
   */
  protected Shape s1;

  /**
   * The cached value of the '{@link #getS11() <em>S11</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS11()
   * @generated
   * @ordered
   */
  protected BasicShape s11;

  /**
   * The cached value of the '{@link #getS2() <em>S2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS2()
   * @generated
   * @ordered
   */
  protected EList<Shape> s2;

  /**
   * The cached value of the '{@link #getS22() <em>S22</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS22()
   * @generated
   * @ordered
   */
  protected EList<BasicShape> s22;

  /**
   * The cached value of the '{@link #getSg() <em>Sg</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSg()
   * @generated
   * @ordered
   */
  protected EList<ShapeGroup> sg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeGroupImpl()
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
    return OnlineElmPackage.Literals.SHAPE_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Shape getS1()
  {
    return s1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS1(Shape newS1, NotificationChain msgs)
  {
    Shape oldS1 = s1;
    s1 = newS1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OnlineElmPackage.SHAPE_GROUP__S1, oldS1, newS1);
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
  public void setS1(Shape newS1)
  {
    if (newS1 != s1)
    {
      NotificationChain msgs = null;
      if (s1 != null)
        msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.SHAPE_GROUP__S1, null, msgs);
      if (newS1 != null)
        msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OnlineElmPackage.SHAPE_GROUP__S1, null, msgs);
      msgs = basicSetS1(newS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.SHAPE_GROUP__S1, newS1, newS1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicShape getS11()
  {
    if (s11 != null && s11.eIsProxy())
    {
      InternalEObject oldS11 = (InternalEObject)s11;
      s11 = (BasicShape)eResolveProxy(oldS11);
      if (s11 != oldS11)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnlineElmPackage.SHAPE_GROUP__S11, oldS11, s11));
      }
    }
    return s11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicShape basicGetS11()
  {
    return s11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setS11(BasicShape newS11)
  {
    BasicShape oldS11 = s11;
    s11 = newS11;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OnlineElmPackage.SHAPE_GROUP__S11, oldS11, s11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Shape> getS2()
  {
    if (s2 == null)
    {
      s2 = new EObjectContainmentEList<Shape>(Shape.class, this, OnlineElmPackage.SHAPE_GROUP__S2);
    }
    return s2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BasicShape> getS22()
  {
    if (s22 == null)
    {
      s22 = new EObjectResolvingEList<BasicShape>(BasicShape.class, this, OnlineElmPackage.SHAPE_GROUP__S22);
    }
    return s22;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ShapeGroup> getSg()
  {
    if (sg == null)
    {
      sg = new EObjectResolvingEList<ShapeGroup>(ShapeGroup.class, this, OnlineElmPackage.SHAPE_GROUP__SG);
    }
    return sg;
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
      case OnlineElmPackage.SHAPE_GROUP__S1:
        return basicSetS1(null, msgs);
      case OnlineElmPackage.SHAPE_GROUP__S2:
        return ((InternalEList<?>)getS2()).basicRemove(otherEnd, msgs);
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
      case OnlineElmPackage.SHAPE_GROUP__S1:
        return getS1();
      case OnlineElmPackage.SHAPE_GROUP__S11:
        if (resolve) return getS11();
        return basicGetS11();
      case OnlineElmPackage.SHAPE_GROUP__S2:
        return getS2();
      case OnlineElmPackage.SHAPE_GROUP__S22:
        return getS22();
      case OnlineElmPackage.SHAPE_GROUP__SG:
        return getSg();
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
      case OnlineElmPackage.SHAPE_GROUP__S1:
        setS1((Shape)newValue);
        return;
      case OnlineElmPackage.SHAPE_GROUP__S11:
        setS11((BasicShape)newValue);
        return;
      case OnlineElmPackage.SHAPE_GROUP__S2:
        getS2().clear();
        getS2().addAll((Collection<? extends Shape>)newValue);
        return;
      case OnlineElmPackage.SHAPE_GROUP__S22:
        getS22().clear();
        getS22().addAll((Collection<? extends BasicShape>)newValue);
        return;
      case OnlineElmPackage.SHAPE_GROUP__SG:
        getSg().clear();
        getSg().addAll((Collection<? extends ShapeGroup>)newValue);
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
      case OnlineElmPackage.SHAPE_GROUP__S1:
        setS1((Shape)null);
        return;
      case OnlineElmPackage.SHAPE_GROUP__S11:
        setS11((BasicShape)null);
        return;
      case OnlineElmPackage.SHAPE_GROUP__S2:
        getS2().clear();
        return;
      case OnlineElmPackage.SHAPE_GROUP__S22:
        getS22().clear();
        return;
      case OnlineElmPackage.SHAPE_GROUP__SG:
        getSg().clear();
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
      case OnlineElmPackage.SHAPE_GROUP__S1:
        return s1 != null;
      case OnlineElmPackage.SHAPE_GROUP__S11:
        return s11 != null;
      case OnlineElmPackage.SHAPE_GROUP__S2:
        return s2 != null && !s2.isEmpty();
      case OnlineElmPackage.SHAPE_GROUP__S22:
        return s22 != null && !s22.isEmpty();
      case OnlineElmPackage.SHAPE_GROUP__SG:
        return sg != null && !sg.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ShapeGroupImpl
