/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.assure.assure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.ComponentImplementation;

import org.osate.assure.assure.AssuranceCase;
import org.osate.assure.assure.AssurePackage;
import org.osate.assure.assure.ClaimResult;
import org.osate.assure.assure.ModelResult;
import org.osate.assure.assure.SubsystemResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getClaimResult <em>Claim Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getSubsystemResult <em>Subsystem Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.ModelResultImpl#getSubAssuranceCase <em>Sub Assurance Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelResultImpl extends AssureResultImpl implements ModelResult
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
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ComponentImplementation target;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getClaimResult() <em>Claim Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimResult()
   * @generated
   * @ordered
   */
  protected EList<ClaimResult> claimResult;

  /**
   * The cached value of the '{@link #getSubsystemResult() <em>Subsystem Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsystemResult()
   * @generated
   * @ordered
   */
  protected EList<SubsystemResult> subsystemResult;

  /**
   * The cached value of the '{@link #getSubAssuranceCase() <em>Sub Assurance Case</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubAssuranceCase()
   * @generated
   * @ordered
   */
  protected EList<AssuranceCase> subAssuranceCase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelResultImpl()
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
    return AssurePackage.Literals.MODEL_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.MODEL_RESULT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImplementation getTarget()
  {
    if (target != null && ((EObject)target).eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ComponentImplementation)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssurePackage.MODEL_RESULT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImplementation basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ComponentImplementation newTarget)
  {
    ComponentImplementation oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.MODEL_RESULT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.MODEL_RESULT__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClaimResult> getClaimResult()
  {
    if (claimResult == null)
    {
      claimResult = new EObjectContainmentEList<ClaimResult>(ClaimResult.class, this, AssurePackage.MODEL_RESULT__CLAIM_RESULT);
    }
    return claimResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubsystemResult> getSubsystemResult()
  {
    if (subsystemResult == null)
    {
      subsystemResult = new EObjectContainmentEList<SubsystemResult>(SubsystemResult.class, this, AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT);
    }
    return subsystemResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssuranceCase> getSubAssuranceCase()
  {
    if (subAssuranceCase == null)
    {
      subAssuranceCase = new EObjectResolvingEList<AssuranceCase>(AssuranceCase.class, this, AssurePackage.MODEL_RESULT__SUB_ASSURANCE_CASE);
    }
    return subAssuranceCase;
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
      case AssurePackage.MODEL_RESULT__CLAIM_RESULT:
        return ((InternalEList<?>)getClaimResult()).basicRemove(otherEnd, msgs);
      case AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT:
        return ((InternalEList<?>)getSubsystemResult()).basicRemove(otherEnd, msgs);
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
      case AssurePackage.MODEL_RESULT__NAME:
        return getName();
      case AssurePackage.MODEL_RESULT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AssurePackage.MODEL_RESULT__MESSAGE:
        return getMessage();
      case AssurePackage.MODEL_RESULT__CLAIM_RESULT:
        return getClaimResult();
      case AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT:
        return getSubsystemResult();
      case AssurePackage.MODEL_RESULT__SUB_ASSURANCE_CASE:
        return getSubAssuranceCase();
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
      case AssurePackage.MODEL_RESULT__NAME:
        setName((String)newValue);
        return;
      case AssurePackage.MODEL_RESULT__TARGET:
        setTarget((ComponentImplementation)newValue);
        return;
      case AssurePackage.MODEL_RESULT__MESSAGE:
        setMessage((String)newValue);
        return;
      case AssurePackage.MODEL_RESULT__CLAIM_RESULT:
        getClaimResult().clear();
        getClaimResult().addAll((Collection<? extends ClaimResult>)newValue);
        return;
      case AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT:
        getSubsystemResult().clear();
        getSubsystemResult().addAll((Collection<? extends SubsystemResult>)newValue);
        return;
      case AssurePackage.MODEL_RESULT__SUB_ASSURANCE_CASE:
        getSubAssuranceCase().clear();
        getSubAssuranceCase().addAll((Collection<? extends AssuranceCase>)newValue);
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
      case AssurePackage.MODEL_RESULT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AssurePackage.MODEL_RESULT__TARGET:
        setTarget((ComponentImplementation)null);
        return;
      case AssurePackage.MODEL_RESULT__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case AssurePackage.MODEL_RESULT__CLAIM_RESULT:
        getClaimResult().clear();
        return;
      case AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT:
        getSubsystemResult().clear();
        return;
      case AssurePackage.MODEL_RESULT__SUB_ASSURANCE_CASE:
        getSubAssuranceCase().clear();
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
      case AssurePackage.MODEL_RESULT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AssurePackage.MODEL_RESULT__TARGET:
        return target != null;
      case AssurePackage.MODEL_RESULT__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case AssurePackage.MODEL_RESULT__CLAIM_RESULT:
        return claimResult != null && !claimResult.isEmpty();
      case AssurePackage.MODEL_RESULT__SUBSYSTEM_RESULT:
        return subsystemResult != null && !subsystemResult.isEmpty();
      case AssurePackage.MODEL_RESULT__SUB_ASSURANCE_CASE:
        return subAssuranceCase != null && !subAssuranceCase.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //ModelResultImpl
