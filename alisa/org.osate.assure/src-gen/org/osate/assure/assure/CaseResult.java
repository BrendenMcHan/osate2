/**
 */
package org.osate.assure.assure;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.Classifier;

import org.osate.aadl2.instance.InstanceObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.assure.assure.CaseResult#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.assure.assure.CaseResult#getInstanceURI <em>Instance URI</em>}</li>
 *   <li>{@link org.osate.assure.assure.CaseResult#getPassCount <em>Pass Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.CaseResult#getSubCaseResult <em>Sub Case Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.CaseResult#getClaimResult <em>Claim Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.CaseResult#getHazardResult <em>Hazard Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.assure.assure.AssurePackage#getCaseResult()
 * @model
 * @generated
 */
public interface CaseResult extends AggregateResult
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Classifier)
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_Target()
   * @model
   * @generated
   */
  Classifier getTarget();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.CaseResult#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Classifier value);

  /**
   * Returns the value of the '<em><b>Instance URI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance URI</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance URI</em>' reference.
   * @see #setInstanceURI(InstanceObject)
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_InstanceURI()
   * @model
   * @generated
   */
  InstanceObject getInstanceURI();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.CaseResult#getInstanceURI <em>Instance URI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance URI</em>' reference.
   * @see #getInstanceURI()
   * @generated
   */
  void setInstanceURI(InstanceObject value);

  /**
   * Returns the value of the '<em><b>Pass Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pass Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pass Count</em>' attribute.
   * @see #setPassCount(int)
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_PassCount()
   * @model
   * @generated
   */
  int getPassCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.CaseResult#getPassCount <em>Pass Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pass Count</em>' attribute.
   * @see #getPassCount()
   * @generated
   */
  void setPassCount(int value);

  /**
   * Returns the value of the '<em><b>Sub Case Result</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.assure.assure.CaseResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Case Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Case Result</em>' containment reference list.
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_SubCaseResult()
   * @model containment="true"
   * @generated
   */
  EList<CaseResult> getSubCaseResult();

  /**
   * Returns the value of the '<em><b>Claim Result</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.assure.assure.ClaimResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Claim Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Claim Result</em>' containment reference list.
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_ClaimResult()
   * @model containment="true"
   * @generated
   */
  EList<ClaimResult> getClaimResult();

  /**
   * Returns the value of the '<em><b>Hazard Result</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.assure.assure.HazardResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hazard Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazard Result</em>' containment reference list.
   * @see org.osate.assure.assure.AssurePackage#getCaseResult_HazardResult()
   * @model containment="true"
   * @generated
   */
  EList<HazardResult> getHazardResult();

} // CaseResult