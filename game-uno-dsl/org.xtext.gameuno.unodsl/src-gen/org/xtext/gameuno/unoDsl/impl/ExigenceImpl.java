/**
 * generated by Xtext 2.23.0
 */
package org.xtext.gameuno.unoDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.gameuno.unoDsl.Carte;
import org.xtext.gameuno.unoDsl.Exigence;
import org.xtext.gameuno.unoDsl.UnoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exigence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getLinker1 <em>Linker1</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getLinker2 <em>Linker2</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getCarte <em>Carte</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getLinker3 <em>Linker3</em>}</li>
 *   <li>{@link org.xtext.gameuno.unoDsl.impl.ExigenceImpl#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExigenceImpl extends MinimalEObjectImpl.Container implements Exigence
{
  /**
   * The default value of the '{@link #getExpr1() <em>Expr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected static final String EXPR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected String expr1 = EXPR1_EDEFAULT;

  /**
   * The default value of the '{@link #getLinker1() <em>Linker1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker1()
   * @generated
   * @ordered
   */
  protected static final String LINKER1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinker1() <em>Linker1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker1()
   * @generated
   * @ordered
   */
  protected String linker1 = LINKER1_EDEFAULT;

  /**
   * The default value of the '{@link #getLinker2() <em>Linker2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker2()
   * @generated
   * @ordered
   */
  protected static final String LINKER2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinker2() <em>Linker2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker2()
   * @generated
   * @ordered
   */
  protected String linker2 = LINKER2_EDEFAULT;

  /**
   * The cached value of the '{@link #getCarte() <em>Carte</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarte()
   * @generated
   * @ordered
   */
  protected EList<Carte> carte;

  /**
   * The default value of the '{@link #getLinker3() <em>Linker3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker3()
   * @generated
   * @ordered
   */
  protected static final String LINKER3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinker3() <em>Linker3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker3()
   * @generated
   * @ordered
   */
  protected String linker3 = LINKER3_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected static final String EXPR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected String expr2 = EXPR2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExigenceImpl()
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
    return UnoDslPackage.Literals.EXIGENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr1(String newExpr1)
  {
    String oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.EXIGENCE__EXPR1, oldExpr1, expr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLinker1()
  {
    return linker1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinker1(String newLinker1)
  {
    String oldLinker1 = linker1;
    linker1 = newLinker1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.EXIGENCE__LINKER1, oldLinker1, linker1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLinker2()
  {
    return linker2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinker2(String newLinker2)
  {
    String oldLinker2 = linker2;
    linker2 = newLinker2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.EXIGENCE__LINKER2, oldLinker2, linker2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Carte> getCarte()
  {
    if (carte == null)
    {
      carte = new EObjectContainmentEList<Carte>(Carte.class, this, UnoDslPackage.EXIGENCE__CARTE);
    }
    return carte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLinker3()
  {
    return linker3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinker3(String newLinker3)
  {
    String oldLinker3 = linker3;
    linker3 = newLinker3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.EXIGENCE__LINKER3, oldLinker3, linker3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr2(String newExpr2)
  {
    String oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.EXIGENCE__EXPR2, oldExpr2, expr2));
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
      case UnoDslPackage.EXIGENCE__CARTE:
        return ((InternalEList<?>)getCarte()).basicRemove(otherEnd, msgs);
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
      case UnoDslPackage.EXIGENCE__EXPR1:
        return getExpr1();
      case UnoDslPackage.EXIGENCE__LINKER1:
        return getLinker1();
      case UnoDslPackage.EXIGENCE__LINKER2:
        return getLinker2();
      case UnoDslPackage.EXIGENCE__CARTE:
        return getCarte();
      case UnoDslPackage.EXIGENCE__LINKER3:
        return getLinker3();
      case UnoDslPackage.EXIGENCE__EXPR2:
        return getExpr2();
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
      case UnoDslPackage.EXIGENCE__EXPR1:
        setExpr1((String)newValue);
        return;
      case UnoDslPackage.EXIGENCE__LINKER1:
        setLinker1((String)newValue);
        return;
      case UnoDslPackage.EXIGENCE__LINKER2:
        setLinker2((String)newValue);
        return;
      case UnoDslPackage.EXIGENCE__CARTE:
        getCarte().clear();
        getCarte().addAll((Collection<? extends Carte>)newValue);
        return;
      case UnoDslPackage.EXIGENCE__LINKER3:
        setLinker3((String)newValue);
        return;
      case UnoDslPackage.EXIGENCE__EXPR2:
        setExpr2((String)newValue);
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
      case UnoDslPackage.EXIGENCE__EXPR1:
        setExpr1(EXPR1_EDEFAULT);
        return;
      case UnoDslPackage.EXIGENCE__LINKER1:
        setLinker1(LINKER1_EDEFAULT);
        return;
      case UnoDslPackage.EXIGENCE__LINKER2:
        setLinker2(LINKER2_EDEFAULT);
        return;
      case UnoDslPackage.EXIGENCE__CARTE:
        getCarte().clear();
        return;
      case UnoDslPackage.EXIGENCE__LINKER3:
        setLinker3(LINKER3_EDEFAULT);
        return;
      case UnoDslPackage.EXIGENCE__EXPR2:
        setExpr2(EXPR2_EDEFAULT);
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
      case UnoDslPackage.EXIGENCE__EXPR1:
        return EXPR1_EDEFAULT == null ? expr1 != null : !EXPR1_EDEFAULT.equals(expr1);
      case UnoDslPackage.EXIGENCE__LINKER1:
        return LINKER1_EDEFAULT == null ? linker1 != null : !LINKER1_EDEFAULT.equals(linker1);
      case UnoDslPackage.EXIGENCE__LINKER2:
        return LINKER2_EDEFAULT == null ? linker2 != null : !LINKER2_EDEFAULT.equals(linker2);
      case UnoDslPackage.EXIGENCE__CARTE:
        return carte != null && !carte.isEmpty();
      case UnoDslPackage.EXIGENCE__LINKER3:
        return LINKER3_EDEFAULT == null ? linker3 != null : !LINKER3_EDEFAULT.equals(linker3);
      case UnoDslPackage.EXIGENCE__EXPR2:
        return EXPR2_EDEFAULT == null ? expr2 != null : !EXPR2_EDEFAULT.equals(expr2);
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
    result.append(" (expr1: ");
    result.append(expr1);
    result.append(", linker1: ");
    result.append(linker1);
    result.append(", linker2: ");
    result.append(linker2);
    result.append(", linker3: ");
    result.append(linker3);
    result.append(", expr2: ");
    result.append(expr2);
    result.append(')');
    return result.toString();
  }

} //ExigenceImpl
