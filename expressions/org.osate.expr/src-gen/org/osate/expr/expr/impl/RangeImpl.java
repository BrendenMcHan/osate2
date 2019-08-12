/**
 */
package org.osate.expr.expr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.Expression;
import org.osate.expr.expr.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.RangeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.osate.expr.expr.impl.RangeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.osate.expr.expr.impl.RangeImpl#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends ExpressionImpl implements Range
{
  /**
   * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected Expression minimum;

  /**
   * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected Expression maximum;

  /**
   * The cached value of the '{@link #getDelta() <em>Delta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected Expression delta;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeImpl()
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
    return ExprPackage.Literals.RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getMinimum()
  {
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinimum(Expression newMinimum, NotificationChain msgs)
  {
    Expression oldMinimum = minimum;
    minimum = newMinimum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__MINIMUM, oldMinimum, newMinimum);
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
  public void setMinimum(Expression newMinimum)
  {
    if (newMinimum != minimum)
    {
      NotificationChain msgs = null;
      if (minimum != null)
        msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__MINIMUM, null, msgs);
      if (newMinimum != null)
        msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__MINIMUM, null, msgs);
      msgs = basicSetMinimum(newMinimum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__MINIMUM, newMinimum, newMinimum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getMaximum()
  {
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaximum(Expression newMaximum, NotificationChain msgs)
  {
    Expression oldMaximum = maximum;
    maximum = newMaximum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__MAXIMUM, oldMaximum, newMaximum);
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
  public void setMaximum(Expression newMaximum)
  {
    if (newMaximum != maximum)
    {
      NotificationChain msgs = null;
      if (maximum != null)
        msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__MAXIMUM, null, msgs);
      if (newMaximum != null)
        msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__MAXIMUM, null, msgs);
      msgs = basicSetMaximum(newMaximum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__MAXIMUM, newMaximum, newMaximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getDelta()
  {
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelta(Expression newDelta, NotificationChain msgs)
  {
    Expression oldDelta = delta;
    delta = newDelta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__DELTA, oldDelta, newDelta);
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
  public void setDelta(Expression newDelta)
  {
    if (newDelta != delta)
    {
      NotificationChain msgs = null;
      if (delta != null)
        msgs = ((InternalEObject)delta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__DELTA, null, msgs);
      if (newDelta != null)
        msgs = ((InternalEObject)newDelta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.RANGE__DELTA, null, msgs);
      msgs = basicSetDelta(newDelta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.RANGE__DELTA, newDelta, newDelta));
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
      case ExprPackage.RANGE__MINIMUM:
        return basicSetMinimum(null, msgs);
      case ExprPackage.RANGE__MAXIMUM:
        return basicSetMaximum(null, msgs);
      case ExprPackage.RANGE__DELTA:
        return basicSetDelta(null, msgs);
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
      case ExprPackage.RANGE__MINIMUM:
        return getMinimum();
      case ExprPackage.RANGE__MAXIMUM:
        return getMaximum();
      case ExprPackage.RANGE__DELTA:
        return getDelta();
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
      case ExprPackage.RANGE__MINIMUM:
        setMinimum((Expression)newValue);
        return;
      case ExprPackage.RANGE__MAXIMUM:
        setMaximum((Expression)newValue);
        return;
      case ExprPackage.RANGE__DELTA:
        setDelta((Expression)newValue);
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
      case ExprPackage.RANGE__MINIMUM:
        setMinimum((Expression)null);
        return;
      case ExprPackage.RANGE__MAXIMUM:
        setMaximum((Expression)null);
        return;
      case ExprPackage.RANGE__DELTA:
        setDelta((Expression)null);
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
      case ExprPackage.RANGE__MINIMUM:
        return minimum != null;
      case ExprPackage.RANGE__MAXIMUM:
        return maximum != null;
      case ExprPackage.RANGE__DELTA:
        return delta != null;
    }
    return super.eIsSet(featureID);
  }

} //RangeImpl