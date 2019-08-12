/**
 */
package org.osate.expr.expr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.NamedElement;

import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.WrappedNamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wrapped Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.WrappedNamedElementImpl#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WrappedNamedElementImpl extends ValueImpl implements WrappedNamedElement
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected NamedElement elem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WrappedNamedElementImpl()
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
    return ExprPackage.Literals.WRAPPED_NAMED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getElem()
  {
    if (elem != null && ((EObject)elem).eIsProxy())
    {
      InternalEObject oldElem = (InternalEObject)elem;
      elem = (NamedElement)eResolveProxy(oldElem);
      if (elem != oldElem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM, oldElem, elem));
      }
    }
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElem(NamedElement newElem)
  {
    NamedElement oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM, oldElem, elem));
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
      case ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
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
      case ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM:
        setElem((NamedElement)newValue);
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
      case ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM:
        setElem((NamedElement)null);
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
      case ExprPackage.WRAPPED_NAMED_ELEMENT__ELEM:
        return elem != null;
    }
    return super.eIsSet(featureID);
  }

} //WrappedNamedElementImpl