/**
 */
package org.osate.assure.assure;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.ComponentImplementation;

import org.osate.alisa.workbench.alisa.AssurancePlan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getClaimResult <em>Claim Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.AssuranceEvidence#getSubAssuranceEvidence <em>Sub Assurance Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence()
 * @model
 * @generated
 */
public interface AssuranceEvidence extends AssureResult
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.AssuranceEvidence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(AssurancePlan)
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_Target()
   * @model
   * @generated
   */
  AssurancePlan getTarget();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.AssuranceEvidence#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(AssurancePlan value);

  /**
   * Returns the value of the '<em><b>Target System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target System</em>' reference.
   * @see #setTargetSystem(ComponentImplementation)
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_TargetSystem()
   * @model
   * @generated
   */
  ComponentImplementation getTargetSystem();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.AssuranceEvidence#getTargetSystem <em>Target System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target System</em>' reference.
   * @see #getTargetSystem()
   * @generated
   */
  void setTargetSystem(ComponentImplementation value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.AssuranceEvidence#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

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
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_ClaimResult()
   * @model containment="true"
   * @generated
   */
  EList<ClaimResult> getClaimResult();

  /**
   * Returns the value of the '<em><b>Sub Assurance Evidence</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.assure.assure.AssuranceEvidence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Assurance Evidence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Assurance Evidence</em>' containment reference list.
   * @see org.osate.assure.assure.AssurePackage#getAssuranceEvidence_SubAssuranceEvidence()
   * @model containment="true"
   * @generated
   */
  EList<AssuranceEvidence> getSubAssuranceEvidence();

} // AssuranceEvidence