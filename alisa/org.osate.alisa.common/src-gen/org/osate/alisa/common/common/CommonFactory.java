/**
 */
package org.osate.alisa.common.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.alisa.common.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonFactory eINSTANCE = org.osate.alisa.common.common.impl.CommonFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Description Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description Element</em>'.
   * @generated
   */
  DescriptionElement createDescriptionElement();

  /**
   * Returns a new object of class '<em>Show Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Value</em>'.
   * @generated
   */
  ShowValue createShowValue();

  /**
   * Returns a new object of class '<em>Reference Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Path</em>'.
   * @generated
   */
  ReferencePath createReferencePath();

  /**
   * Returns a new object of class '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Expression</em>'.
   * @generated
   */
  PredicateExpression createPredicateExpression();

  /**
   * Returns a new object of class '<em>Constant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Decl</em>'.
   * @generated
   */
  ConstantDecl createConstantDecl();

  /**
   * Returns a new object of class '<em>Constant Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Value</em>'.
   * @generated
   */
  ConstantValue createConstantValue();

  /**
   * Returns a new object of class '<em>String Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Term</em>'.
   * @generated
   */
  StringTerm createStringTerm();

  /**
   * Returns a new object of class '<em>Real Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Term</em>'.
   * @generated
   */
  RealTerm createRealTerm();

  /**
   * Returns a new object of class '<em>Integer Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Term</em>'.
   * @generated
   */
  IntegerTerm createIntegerTerm();

  /**
   * Returns a new object of class '<em>Multi Line String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Line String</em>'.
   * @generated
   */
  MultiLineString createMultiLineString();

  /**
   * Returns a new object of class '<em>Text Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Element</em>'.
   * @generated
   */
  TextElement createTextElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CommonPackage getCommonPackage();

} //CommonFactory