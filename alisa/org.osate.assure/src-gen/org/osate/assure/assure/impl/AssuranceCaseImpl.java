/**
 */
package org.osate.assure.assure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.alisa.workbench.alisa.AssurancePlan;

import org.osate.assure.assure.AssuranceCase;
import org.osate.assure.assure.AssurePackage;
import org.osate.assure.assure.ClaimResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assurance Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getClaimResult <em>Claim Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.AssuranceCaseImpl#getSubAssuranceCase <em>Sub Assurance Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssuranceCaseImpl extends AssureResultImpl implements AssuranceCase
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
  protected AssurancePlan target;

  /**
   * The default value of the '{@link #getTargetSystem() <em>Target System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSystem()
   * @generated
   * @ordered
   */
  protected static final String TARGET_SYSTEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetSystem() <em>Target System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSystem()
   * @generated
   * @ordered
   */
  protected String targetSystem = TARGET_SYSTEM_EDEFAULT;

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
   * The cached value of the '{@link #getSubAssuranceCase() <em>Sub Assurance Case</em>}' containment reference list.
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
  protected AssuranceCaseImpl()
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
    return AssurePackage.Literals.ASSURANCE_CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.ASSURANCE_CASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssurancePlan getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (AssurancePlan)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssurePackage.ASSURANCE_CASE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssurancePlan basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(AssurancePlan newTarget)
  {
    AssurancePlan oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.ASSURANCE_CASE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetSystem()
  {
    return targetSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetSystem(String newTargetSystem)
  {
    String oldTargetSystem = targetSystem;
    targetSystem = newTargetSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.ASSURANCE_CASE__TARGET_SYSTEM, oldTargetSystem, targetSystem));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.ASSURANCE_CASE__MESSAGE, oldMessage, message));
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
      claimResult = new EObjectContainmentEList<ClaimResult>(ClaimResult.class, this, AssurePackage.ASSURANCE_CASE__CLAIM_RESULT);
    }
    return claimResult;
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
      subAssuranceCase = new EObjectContainmentEList<AssuranceCase>(AssuranceCase.class, this, AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE);
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
      case AssurePackage.ASSURANCE_CASE__CLAIM_RESULT:
        return ((InternalEList<?>)getClaimResult()).basicRemove(otherEnd, msgs);
      case AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE:
        return ((InternalEList<?>)getSubAssuranceCase()).basicRemove(otherEnd, msgs);
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
      case AssurePackage.ASSURANCE_CASE__NAME:
        return getName();
      case AssurePackage.ASSURANCE_CASE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AssurePackage.ASSURANCE_CASE__TARGET_SYSTEM:
        return getTargetSystem();
      case AssurePackage.ASSURANCE_CASE__MESSAGE:
        return getMessage();
      case AssurePackage.ASSURANCE_CASE__CLAIM_RESULT:
        return getClaimResult();
      case AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE:
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
      case AssurePackage.ASSURANCE_CASE__NAME:
        setName((String)newValue);
        return;
      case AssurePackage.ASSURANCE_CASE__TARGET:
        setTarget((AssurancePlan)newValue);
        return;
      case AssurePackage.ASSURANCE_CASE__TARGET_SYSTEM:
        setTargetSystem((String)newValue);
        return;
      case AssurePackage.ASSURANCE_CASE__MESSAGE:
        setMessage((String)newValue);
        return;
      case AssurePackage.ASSURANCE_CASE__CLAIM_RESULT:
        getClaimResult().clear();
        getClaimResult().addAll((Collection<? extends ClaimResult>)newValue);
        return;
      case AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE:
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
      case AssurePackage.ASSURANCE_CASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AssurePackage.ASSURANCE_CASE__TARGET:
        setTarget((AssurancePlan)null);
        return;
      case AssurePackage.ASSURANCE_CASE__TARGET_SYSTEM:
        setTargetSystem(TARGET_SYSTEM_EDEFAULT);
        return;
      case AssurePackage.ASSURANCE_CASE__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case AssurePackage.ASSURANCE_CASE__CLAIM_RESULT:
        getClaimResult().clear();
        return;
      case AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE:
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
      case AssurePackage.ASSURANCE_CASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AssurePackage.ASSURANCE_CASE__TARGET:
        return target != null;
      case AssurePackage.ASSURANCE_CASE__TARGET_SYSTEM:
        return TARGET_SYSTEM_EDEFAULT == null ? targetSystem != null : !TARGET_SYSTEM_EDEFAULT.equals(targetSystem);
      case AssurePackage.ASSURANCE_CASE__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case AssurePackage.ASSURANCE_CASE__CLAIM_RESULT:
        return claimResult != null && !claimResult.isEmpty();
      case AssurePackage.ASSURANCE_CASE__SUB_ASSURANCE_CASE:
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
    result.append(", targetSystem: ");
    result.append(targetSystem);
    result.append(", message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //AssuranceCaseImpl