/**
 */
package org.osate.assure.assure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.assure.assure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.assure.assure.AssurePackage
 * @generated
 */
public class AssureSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AssurePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssureSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AssurePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AssurePackage.CASE_RESULT:
      {
        CaseResult caseResult = (CaseResult)theEObject;
        T result = caseCaseResult(caseResult);
        if (result == null) result = caseAggregateResult(caseResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.CLAIM_RESULT:
      {
        ClaimResult claimResult = (ClaimResult)theEObject;
        T result = caseClaimResult(claimResult);
        if (result == null) result = caseAggregateResult(claimResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.HAZARD_RESULT:
      {
        HazardResult hazardResult = (HazardResult)theEObject;
        T result = caseHazardResult(hazardResult);
        if (result == null) result = caseAggregateResult(hazardResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.AGGREGATE_RESULT:
      {
        AggregateResult aggregateResult = (AggregateResult)theEObject;
        T result = caseAggregateResult(aggregateResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.ASSUMPTION_RESULT:
      {
        AssumptionResult assumptionResult = (AssumptionResult)theEObject;
        T result = caseAssumptionResult(assumptionResult);
        if (result == null) result = caseAggregateResult(assumptionResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.PRECONDITION_RESULT:
      {
        PreconditionResult preconditionResult = (PreconditionResult)theEObject;
        T result = casePreconditionResult(preconditionResult);
        if (result == null) result = caseAggregateResult(preconditionResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT:
      {
        VerificationActivityResult verificationActivityResult = (VerificationActivityResult)theEObject;
        T result = caseVerificationActivityResult(verificationActivityResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.VERIFICATION_RESULT:
      {
        VerificationResult verificationResult = (VerificationResult)theEObject;
        T result = caseVerificationResult(verificationResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.FAIL_THEN_RESULT:
      {
        FailThenResult failThenResult = (FailThenResult)theEObject;
        T result = caseFailThenResult(failThenResult);
        if (result == null) result = caseVerificationActivityResult(failThenResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AssurePackage.AND_THEN_RESULT:
      {
        AndThenResult andThenResult = (AndThenResult)theEObject;
        T result = caseAndThenResult(andThenResult);
        if (result == null) result = caseVerificationActivityResult(andThenResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseResult(CaseResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Claim Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Claim Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClaimResult(ClaimResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardResult(HazardResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregateResult(AggregateResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assumption Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assumption Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssumptionResult(AssumptionResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreconditionResult(PreconditionResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Activity Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Activity Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationActivityResult(VerificationActivityResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationResult(VerificationResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fail Then Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Then Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFailThenResult(FailThenResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Then Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Then Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndThenResult(AndThenResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AssureSwitch
