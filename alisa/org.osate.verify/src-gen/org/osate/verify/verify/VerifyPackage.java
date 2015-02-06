/**
 */
package org.osate.verify.verify;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.verify.verify.VerifyFactory
 * @model kind="package"
 * @generated
 */
public interface VerifyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "verify";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/verify/Verify";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "verify";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VerifyPackage eINSTANCE = org.osate.verify.verify.impl.VerifyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationImpl <em>Verification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerification()
   * @generated
   */
  int VERIFICATION = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Verification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationPlanImpl <em>Verification Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationPlanImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPlan()
   * @generated
   */
  int VERIFICATION_PLAN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__TITLE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__TARGET = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Claim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__CLAIM = 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__RATIONALE = 5;

  /**
   * The feature id for the '<em><b>Plan Assumption</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN__PLAN_ASSUMPTION = 6;

  /**
   * The number of structural features of the '<em>Verification Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PLAN_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ClaimImpl <em>Claim</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ClaimImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getClaim()
   * @generated
   */
  int CLAIM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__TITLE = 1;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__WEIGHT = 2;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__REQUIREMENT = 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__ASSERT = 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__RATIONALE = 5;

  /**
   * The feature id for the '<em><b>Subclaim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM__SUBCLAIM = 6;

  /**
   * The number of structural features of the '<em>Claim</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationContainerImpl <em>Verification Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationContainerImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationContainer()
   * @generated
   */
  int VERIFICATION_CONTAINER = 5;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONTAINER__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Verification Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationLibraryImpl <em>Verification Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationLibraryImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationLibrary()
   * @generated
   */
  int VERIFICATION_LIBRARY = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__CONTENT = VERIFICATION_CONTAINER__CONTENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__NAME = VERIFICATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__TITLE = VERIFICATION_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__TARGET = VERIFICATION_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__DESCRIPTION = VERIFICATION_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Verification Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY_FEATURE_COUNT = VERIFICATION_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationFolderImpl <em>Verification Folder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationFolderImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationFolder()
   * @generated
   */
  int VERIFICATION_FOLDER = 4;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FOLDER__CONTENT = VERIFICATION_CONTAINER__CONTENT;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FOLDER__LABEL = VERIFICATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verification Folder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FOLDER_FEATURE_COUNT = VERIFICATION_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationActionImpl <em>Verification Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationActionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationAction()
   * @generated
   */
  int VERIFICATION_ACTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTION__REQUIREMENT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTION__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Verification Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationActivityImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationActivity()
   * @generated
   */
  int VERIFICATION_ACTIVITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__NAME = VERIFICATION_ACTION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TITLE = VERIFICATION_ACTION__TITLE;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__REQUIREMENT = VERIFICATION_ACTION__REQUIREMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__DESCRIPTION = VERIFICATION_ACTION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__METHOD = VERIFICATION_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TIMEOUT = VERIFICATION_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__RATIONALE = VERIFICATION_ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Verification Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY_FEATURE_COUNT = VERIFICATION_ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationConditionImpl <em>Verification Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationConditionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationCondition()
   * @generated
   */
  int VERIFICATION_CONDITION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__ASSERT = 3;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION__RATIONALE = 4;

  /**
   * The number of structural features of the '<em>Verification Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CONDITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.ArgumentExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getArgumentExpr()
   * @generated
   */
  int ARGUMENT_EXPR = 8;

  /**
   * The number of structural features of the '<em>Argument Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationMethodRegistryImpl <em>Verification Method Registry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationMethodRegistryImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethodRegistry()
   * @generated
   */
  int VERIFICATION_METHOD_REGISTRY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY__METHODS = 3;

  /**
   * The number of structural features of the '<em>Verification Method Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_REGISTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationMethodImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethod()
   * @generated
   */
  int VERIFICATION_METHOD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__NAME = VERIFICATION_ACTION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__TITLE = VERIFICATION_ACTION__TITLE;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__REQUIREMENT = VERIFICATION_ACTION__REQUIREMENT;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__DESCRIPTION = VERIFICATION_ACTION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Method Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__METHOD_TYPE = VERIFICATION_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__METHOD_PATH = VERIFICATION_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Marker</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__MARKER = VERIFICATION_ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__CATEGORY = VERIFICATION_ACTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__CONDITIONS = VERIFICATION_ACTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Verification Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_FEATURE_COUNT = VERIFICATION_ACTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationAssumptionImpl <em>Verification Assumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationAssumptionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationAssumption()
   * @generated
   */
  int VERIFICATION_ASSUMPTION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__NAME = VERIFICATION_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__TITLE = VERIFICATION_CONDITION__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__DESCRIPTION = VERIFICATION_CONDITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__ASSERT = VERIFICATION_CONDITION__ASSERT;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__RATIONALE = VERIFICATION_CONDITION__RATIONALE;

  /**
   * The number of structural features of the '<em>Verification Assumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION_FEATURE_COUNT = VERIFICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.VerificationPreconditionImpl <em>Verification Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.VerificationPreconditionImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPrecondition()
   * @generated
   */
  int VERIFICATION_PRECONDITION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__NAME = VERIFICATION_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__TITLE = VERIFICATION_CONDITION__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__DESCRIPTION = VERIFICATION_CONDITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__ASSERT = VERIFICATION_CONDITION__ASSERT;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION__RATIONALE = VERIFICATION_CONDITION__RATIONALE;

  /**
   * The number of structural features of the '<em>Verification Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_PRECONDITION_FEATURE_COUNT = VERIFICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.AllExprImpl <em>All Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.AllExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAllExpr()
   * @generated
   */
  int ALL_EXPR = 14;

  /**
   * The feature id for the '<em><b>All</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPR__ALL = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>All Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.AndThenExprImpl <em>And Then Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.AndThenExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAndThenExpr()
   * @generated
   */
  int AND_THEN_EXPR = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_THEN_EXPR__LEFT = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_THEN_EXPR__RIGHT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Then Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_THEN_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.FailThenExprImpl <em>Fail Then Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.FailThenExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getFailThenExpr()
   * @generated
   */
  int FAIL_THEN_EXPR = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_EXPR__LEFT = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_EXPR__RIGHT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fail Then Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_THEN_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.WhenExprImpl <em>When Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.WhenExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getWhenExpr()
   * @generated
   */
  int WHEN_EXPR = 17;

  /**
   * The feature id for the '<em><b>Verification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXPR__VERIFICATION = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXPR__CONDITION = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.impl.RefExprImpl <em>Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.impl.RefExprImpl
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getRefExpr()
   * @generated
   */
  int REF_EXPR = 18;

  /**
   * The feature id for the '<em><b>Verification</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__VERIFICATION = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__WEIGHT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.verify.verify.SupportedTypes <em>Supported Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.verify.verify.SupportedTypes
   * @see org.osate.verify.verify.impl.VerifyPackageImpl#getSupportedTypes()
   * @generated
   */
  int SUPPORTED_TYPES = 19;


  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.Verification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification</em>'.
   * @see org.osate.verify.verify.Verification
   * @generated
   */
  EClass getVerification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.Verification#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.osate.verify.verify.Verification#getContents()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_Contents();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationPlan <em>Verification Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Plan</em>'.
   * @see org.osate.verify.verify.VerificationPlan
   * @generated
   */
  EClass getVerificationPlan();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getName()
   * @see #getVerificationPlan()
   * @generated
   */
  EAttribute getVerificationPlan_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getTitle()
   * @see #getVerificationPlan()
   * @generated
   */
  EAttribute getVerificationPlan_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationPlan#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getTarget()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getDescription()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationPlan#getClaim <em>Claim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Claim</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getClaim()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Claim();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getRationale()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_Rationale();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.VerificationPlan#getPlanAssumption <em>Plan Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Plan Assumption</em>'.
   * @see org.osate.verify.verify.VerificationPlan#getPlanAssumption()
   * @see #getVerificationPlan()
   * @generated
   */
  EReference getVerificationPlan_PlanAssumption();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.Claim <em>Claim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Claim</em>'.
   * @see org.osate.verify.verify.Claim
   * @generated
   */
  EClass getClaim();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.Claim#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.Claim#getName()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.Claim#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.Claim#getTitle()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Title();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.Claim#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.osate.verify.verify.Claim#getWeight()
   * @see #getClaim()
   * @generated
   */
  EAttribute getClaim_Weight();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.Claim#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requirement</em>'.
   * @see org.osate.verify.verify.Claim#getRequirement()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Requirement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.Claim#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert</em>'.
   * @see org.osate.verify.verify.Claim#getAssert()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Assert();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.Claim#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.Claim#getRationale()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Rationale();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.Claim#getSubclaim <em>Subclaim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subclaim</em>'.
   * @see org.osate.verify.verify.Claim#getSubclaim()
   * @see #getClaim()
   * @generated
   */
  EReference getClaim_Subclaim();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationLibrary <em>Verification Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Library</em>'.
   * @see org.osate.verify.verify.VerificationLibrary
   * @generated
   */
  EClass getVerificationLibrary();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationLibrary#getName()
   * @see #getVerificationLibrary()
   * @generated
   */
  EAttribute getVerificationLibrary_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationLibrary#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationLibrary#getTitle()
   * @see #getVerificationLibrary()
   * @generated
   */
  EAttribute getVerificationLibrary_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationLibrary#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.verify.verify.VerificationLibrary#getTarget()
   * @see #getVerificationLibrary()
   * @generated
   */
  EReference getVerificationLibrary_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationLibrary#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationLibrary#getDescription()
   * @see #getVerificationLibrary()
   * @generated
   */
  EReference getVerificationLibrary_Description();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationFolder <em>Verification Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Folder</em>'.
   * @see org.osate.verify.verify.VerificationFolder
   * @generated
   */
  EClass getVerificationFolder();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationFolder#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.osate.verify.verify.VerificationFolder#getLabel()
   * @see #getVerificationFolder()
   * @generated
   */
  EAttribute getVerificationFolder_Label();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationContainer <em>Verification Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Container</em>'.
   * @see org.osate.verify.verify.VerificationContainer
   * @generated
   */
  EClass getVerificationContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationContainer#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.osate.verify.verify.VerificationContainer#getContent()
   * @see #getVerificationContainer()
   * @generated
   */
  EReference getVerificationContainer_Content();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Activity</em>'.
   * @see org.osate.verify.verify.VerificationActivity
   * @generated
   */
  EClass getVerificationActivity();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationActivity#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getMethod()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Method();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationActivity#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getTimeout()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Timeout();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationActivity#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.VerificationActivity#getRationale()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Rationale();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationCondition <em>Verification Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Condition</em>'.
   * @see org.osate.verify.verify.VerificationCondition
   * @generated
   */
  EClass getVerificationCondition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationCondition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getName()
   * @see #getVerificationCondition()
   * @generated
   */
  EAttribute getVerificationCondition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationCondition#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getTitle()
   * @see #getVerificationCondition()
   * @generated
   */
  EAttribute getVerificationCondition_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationCondition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getDescription()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationCondition#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getAssert()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Assert();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationCondition#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see org.osate.verify.verify.VerificationCondition#getRationale()
   * @see #getVerificationCondition()
   * @generated
   */
  EReference getVerificationCondition_Rationale();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.ArgumentExpr <em>Argument Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Expr</em>'.
   * @see org.osate.verify.verify.ArgumentExpr
   * @generated
   */
  EClass getArgumentExpr();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationAction <em>Verification Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Action</em>'.
   * @see org.osate.verify.verify.VerificationAction
   * @generated
   */
  EClass getVerificationAction();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationAction#getName()
   * @see #getVerificationAction()
   * @generated
   */
  EAttribute getVerificationAction_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationAction#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationAction#getTitle()
   * @see #getVerificationAction()
   * @generated
   */
  EAttribute getVerificationAction_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationAction#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requirement</em>'.
   * @see org.osate.verify.verify.VerificationAction#getRequirement()
   * @see #getVerificationAction()
   * @generated
   */
  EReference getVerificationAction_Requirement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationAction#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationAction#getDescription()
   * @see #getVerificationAction()
   * @generated
   */
  EReference getVerificationAction_Description();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationMethodRegistry <em>Verification Method Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Method Registry</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry
   * @generated
   */
  EClass getVerificationMethodRegistry();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethodRegistry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getName()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EAttribute getVerificationMethodRegistry_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethodRegistry#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getTitle()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EAttribute getVerificationMethodRegistry_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.VerificationMethodRegistry#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getDescription()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EReference getVerificationMethodRegistry_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationMethodRegistry#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.osate.verify.verify.VerificationMethodRegistry#getMethods()
   * @see #getVerificationMethodRegistry()
   * @generated
   */
  EReference getVerificationMethodRegistry_Methods();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationMethod <em>Verification Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Method</em>'.
   * @see org.osate.verify.verify.VerificationMethod
   * @generated
   */
  EClass getVerificationMethod();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#getMethodType <em>Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Type</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getMethodType()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_MethodType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#getMethodPath <em>Method Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Path</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getMethodPath()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_MethodPath();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.VerificationMethod#getMarker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Marker</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getMarker()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Marker();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.VerificationMethod#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getCategory()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Category();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.VerificationMethod#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.osate.verify.verify.VerificationMethod#getConditions()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Conditions();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationAssumption <em>Verification Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Assumption</em>'.
   * @see org.osate.verify.verify.VerificationAssumption
   * @generated
   */
  EClass getVerificationAssumption();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.VerificationPrecondition <em>Verification Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Precondition</em>'.
   * @see org.osate.verify.verify.VerificationPrecondition
   * @generated
   */
  EClass getVerificationPrecondition();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.AllExpr <em>All Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All Expr</em>'.
   * @see org.osate.verify.verify.AllExpr
   * @generated
   */
  EClass getAllExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.verify.verify.AllExpr#getAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>All</em>'.
   * @see org.osate.verify.verify.AllExpr#getAll()
   * @see #getAllExpr()
   * @generated
   */
  EReference getAllExpr_All();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.AndThenExpr <em>And Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Then Expr</em>'.
   * @see org.osate.verify.verify.AndThenExpr
   * @generated
   */
  EClass getAndThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.AndThenExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.verify.verify.AndThenExpr#getLeft()
   * @see #getAndThenExpr()
   * @generated
   */
  EReference getAndThenExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.AndThenExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.verify.verify.AndThenExpr#getRight()
   * @see #getAndThenExpr()
   * @generated
   */
  EReference getAndThenExpr_Right();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.FailThenExpr <em>Fail Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fail Then Expr</em>'.
   * @see org.osate.verify.verify.FailThenExpr
   * @generated
   */
  EClass getFailThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.FailThenExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.verify.verify.FailThenExpr#getLeft()
   * @see #getFailThenExpr()
   * @generated
   */
  EReference getFailThenExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.FailThenExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.verify.verify.FailThenExpr#getRight()
   * @see #getFailThenExpr()
   * @generated
   */
  EReference getFailThenExpr_Right();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.WhenExpr <em>When Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Expr</em>'.
   * @see org.osate.verify.verify.WhenExpr
   * @generated
   */
  EClass getWhenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.verify.verify.WhenExpr#getVerification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verification</em>'.
   * @see org.osate.verify.verify.WhenExpr#getVerification()
   * @see #getWhenExpr()
   * @generated
   */
  EReference getWhenExpr_Verification();

  /**
   * Returns the meta object for the reference list '{@link org.osate.verify.verify.WhenExpr#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Condition</em>'.
   * @see org.osate.verify.verify.WhenExpr#getCondition()
   * @see #getWhenExpr()
   * @generated
   */
  EReference getWhenExpr_Condition();

  /**
   * Returns the meta object for class '{@link org.osate.verify.verify.RefExpr <em>Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Expr</em>'.
   * @see org.osate.verify.verify.RefExpr
   * @generated
   */
  EClass getRefExpr();

  /**
   * Returns the meta object for the reference '{@link org.osate.verify.verify.RefExpr#getVerification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification</em>'.
   * @see org.osate.verify.verify.RefExpr#getVerification()
   * @see #getRefExpr()
   * @generated
   */
  EReference getRefExpr_Verification();

  /**
   * Returns the meta object for the attribute '{@link org.osate.verify.verify.RefExpr#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.osate.verify.verify.RefExpr#getWeight()
   * @see #getRefExpr()
   * @generated
   */
  EAttribute getRefExpr_Weight();

  /**
   * Returns the meta object for enum '{@link org.osate.verify.verify.SupportedTypes <em>Supported Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Supported Types</em>'.
   * @see org.osate.verify.verify.SupportedTypes
   * @generated
   */
  EEnum getSupportedTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VerifyFactory getVerifyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationImpl <em>Verification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerification()
     * @generated
     */
    EClass VERIFICATION = eINSTANCE.getVerification();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__CONTENTS = eINSTANCE.getVerification_Contents();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationPlanImpl <em>Verification Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationPlanImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPlan()
     * @generated
     */
    EClass VERIFICATION_PLAN = eINSTANCE.getVerificationPlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_PLAN__NAME = eINSTANCE.getVerificationPlan_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_PLAN__TITLE = eINSTANCE.getVerificationPlan_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__TARGET = eINSTANCE.getVerificationPlan_Target();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__DESCRIPTION = eINSTANCE.getVerificationPlan_Description();

    /**
     * The meta object literal for the '<em><b>Claim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__CLAIM = eINSTANCE.getVerificationPlan_Claim();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__RATIONALE = eINSTANCE.getVerificationPlan_Rationale();

    /**
     * The meta object literal for the '<em><b>Plan Assumption</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_PLAN__PLAN_ASSUMPTION = eINSTANCE.getVerificationPlan_PlanAssumption();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ClaimImpl <em>Claim</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ClaimImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getClaim()
     * @generated
     */
    EClass CLAIM = eINSTANCE.getClaim();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__NAME = eINSTANCE.getClaim_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__TITLE = eINSTANCE.getClaim_Title();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAIM__WEIGHT = eINSTANCE.getClaim_Weight();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__REQUIREMENT = eINSTANCE.getClaim_Requirement();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__ASSERT = eINSTANCE.getClaim_Assert();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__RATIONALE = eINSTANCE.getClaim_Rationale();

    /**
     * The meta object literal for the '<em><b>Subclaim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM__SUBCLAIM = eINSTANCE.getClaim_Subclaim();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationLibraryImpl <em>Verification Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationLibraryImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationLibrary()
     * @generated
     */
    EClass VERIFICATION_LIBRARY = eINSTANCE.getVerificationLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_LIBRARY__NAME = eINSTANCE.getVerificationLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_LIBRARY__TITLE = eINSTANCE.getVerificationLibrary_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_LIBRARY__TARGET = eINSTANCE.getVerificationLibrary_Target();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_LIBRARY__DESCRIPTION = eINSTANCE.getVerificationLibrary_Description();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationFolderImpl <em>Verification Folder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationFolderImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationFolder()
     * @generated
     */
    EClass VERIFICATION_FOLDER = eINSTANCE.getVerificationFolder();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_FOLDER__LABEL = eINSTANCE.getVerificationFolder_Label();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationContainerImpl <em>Verification Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationContainerImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationContainer()
     * @generated
     */
    EClass VERIFICATION_CONTAINER = eINSTANCE.getVerificationContainer();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONTAINER__CONTENT = eINSTANCE.getVerificationContainer_Content();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationActivityImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationActivity()
     * @generated
     */
    EClass VERIFICATION_ACTIVITY = eINSTANCE.getVerificationActivity();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__METHOD = eINSTANCE.getVerificationActivity_Method();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__TIMEOUT = eINSTANCE.getVerificationActivity_Timeout();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__RATIONALE = eINSTANCE.getVerificationActivity_Rationale();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationConditionImpl <em>Verification Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationConditionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationCondition()
     * @generated
     */
    EClass VERIFICATION_CONDITION = eINSTANCE.getVerificationCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_CONDITION__NAME = eINSTANCE.getVerificationCondition_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_CONDITION__TITLE = eINSTANCE.getVerificationCondition_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__DESCRIPTION = eINSTANCE.getVerificationCondition_Description();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__ASSERT = eINSTANCE.getVerificationCondition_Assert();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CONDITION__RATIONALE = eINSTANCE.getVerificationCondition_Rationale();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.ArgumentExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getArgumentExpr()
     * @generated
     */
    EClass ARGUMENT_EXPR = eINSTANCE.getArgumentExpr();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationActionImpl <em>Verification Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationActionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationAction()
     * @generated
     */
    EClass VERIFICATION_ACTION = eINSTANCE.getVerificationAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTION__NAME = eINSTANCE.getVerificationAction_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTION__TITLE = eINSTANCE.getVerificationAction_Title();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTION__REQUIREMENT = eINSTANCE.getVerificationAction_Requirement();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTION__DESCRIPTION = eINSTANCE.getVerificationAction_Description();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationMethodRegistryImpl <em>Verification Method Registry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationMethodRegistryImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethodRegistry()
     * @generated
     */
    EClass VERIFICATION_METHOD_REGISTRY = eINSTANCE.getVerificationMethodRegistry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD_REGISTRY__NAME = eINSTANCE.getVerificationMethodRegistry_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD_REGISTRY__TITLE = eINSTANCE.getVerificationMethodRegistry_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD_REGISTRY__DESCRIPTION = eINSTANCE.getVerificationMethodRegistry_Description();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD_REGISTRY__METHODS = eINSTANCE.getVerificationMethodRegistry_Methods();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationMethodImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationMethod()
     * @generated
     */
    EClass VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

    /**
     * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__METHOD_TYPE = eINSTANCE.getVerificationMethod_MethodType();

    /**
     * The meta object literal for the '<em><b>Method Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__METHOD_PATH = eINSTANCE.getVerificationMethod_MethodPath();

    /**
     * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__MARKER = eINSTANCE.getVerificationMethod_Marker();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__CATEGORY = eINSTANCE.getVerificationMethod_Category();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__CONDITIONS = eINSTANCE.getVerificationMethod_Conditions();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationAssumptionImpl <em>Verification Assumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationAssumptionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationAssumption()
     * @generated
     */
    EClass VERIFICATION_ASSUMPTION = eINSTANCE.getVerificationAssumption();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.VerificationPreconditionImpl <em>Verification Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.VerificationPreconditionImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getVerificationPrecondition()
     * @generated
     */
    EClass VERIFICATION_PRECONDITION = eINSTANCE.getVerificationPrecondition();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.AllExprImpl <em>All Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.AllExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAllExpr()
     * @generated
     */
    EClass ALL_EXPR = eINSTANCE.getAllExpr();

    /**
     * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALL_EXPR__ALL = eINSTANCE.getAllExpr_All();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.AndThenExprImpl <em>And Then Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.AndThenExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getAndThenExpr()
     * @generated
     */
    EClass AND_THEN_EXPR = eINSTANCE.getAndThenExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_THEN_EXPR__LEFT = eINSTANCE.getAndThenExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_THEN_EXPR__RIGHT = eINSTANCE.getAndThenExpr_Right();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.FailThenExprImpl <em>Fail Then Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.FailThenExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getFailThenExpr()
     * @generated
     */
    EClass FAIL_THEN_EXPR = eINSTANCE.getFailThenExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAIL_THEN_EXPR__LEFT = eINSTANCE.getFailThenExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAIL_THEN_EXPR__RIGHT = eINSTANCE.getFailThenExpr_Right();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.WhenExprImpl <em>When Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.WhenExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getWhenExpr()
     * @generated
     */
    EClass WHEN_EXPR = eINSTANCE.getWhenExpr();

    /**
     * The meta object literal for the '<em><b>Verification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXPR__VERIFICATION = eINSTANCE.getWhenExpr_Verification();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_EXPR__CONDITION = eINSTANCE.getWhenExpr_Condition();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.impl.RefExprImpl <em>Ref Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.impl.RefExprImpl
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getRefExpr()
     * @generated
     */
    EClass REF_EXPR = eINSTANCE.getRefExpr();

    /**
     * The meta object literal for the '<em><b>Verification</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_EXPR__VERIFICATION = eINSTANCE.getRefExpr_Verification();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_EXPR__WEIGHT = eINSTANCE.getRefExpr_Weight();

    /**
     * The meta object literal for the '{@link org.osate.verify.verify.SupportedTypes <em>Supported Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.verify.verify.SupportedTypes
     * @see org.osate.verify.verify.impl.VerifyPackageImpl#getSupportedTypes()
     * @generated
     */
    EEnum SUPPORTED_TYPES = eINSTANCE.getSupportedTypes();

  }

} //VerifyPackage