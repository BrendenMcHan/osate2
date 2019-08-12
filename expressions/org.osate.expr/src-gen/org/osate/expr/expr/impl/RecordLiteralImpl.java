/**
 */
package org.osate.expr.expr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.FieldValue;
import org.osate.expr.expr.RecordLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.RecordLiteralImpl#getFieldValues <em>Field Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordLiteralImpl extends LiteralImpl implements RecordLiteral
{
  /**
   * The cached value of the '{@link #getFieldValues() <em>Field Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldValues()
   * @generated
   * @ordered
   */
  protected EList<FieldValue> fieldValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordLiteralImpl()
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
    return ExprPackage.Literals.RECORD_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FieldValue> getFieldValues()
  {
    if (fieldValues == null)
    {
      fieldValues = new EObjectContainmentEList<FieldValue>(FieldValue.class, this, ExprPackage.RECORD_LITERAL__FIELD_VALUES);
    }
    return fieldValues;
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
      case ExprPackage.RECORD_LITERAL__FIELD_VALUES:
        return ((InternalEList<?>)getFieldValues()).basicRemove(otherEnd, msgs);
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
      case ExprPackage.RECORD_LITERAL__FIELD_VALUES:
        return getFieldValues();
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
      case ExprPackage.RECORD_LITERAL__FIELD_VALUES:
        getFieldValues().clear();
        getFieldValues().addAll((Collection<? extends FieldValue>)newValue);
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
      case ExprPackage.RECORD_LITERAL__FIELD_VALUES:
        getFieldValues().clear();
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
      case ExprPackage.RECORD_LITERAL__FIELD_VALUES:
        return fieldValues != null && !fieldValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecordLiteralImpl