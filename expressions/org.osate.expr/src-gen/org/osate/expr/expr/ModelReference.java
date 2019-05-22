/**
 * generated by Xtext 2.17.0
 */
package org.osate.expr.expr;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.ModelReference#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.osate.expr.expr.ModelReference#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @see org.osate.expr.expr.ExprPackage#getModelReference()
 * @model
 * @generated
 */
public interface ModelReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Model Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Element</em>' reference.
   * @see #setModelElement(NamedElement)
   * @see org.osate.expr.expr.ExprPackage#getModelReference_ModelElement()
   * @model
   * @generated
   */
  NamedElement getModelElement();

  /**
   * Sets the value of the '{@link org.osate.expr.expr.ModelReference#getModelElement <em>Model Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Element</em>' reference.
   * @see #getModelElement()
   * @generated
   */
  void setModelElement(NamedElement value);

  /**
   * Returns the value of the '<em><b>Prev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prev</em>' containment reference.
   * @see #setPrev(ModelReference)
   * @see org.osate.expr.expr.ExprPackage#getModelReference_Prev()
   * @model containment="true"
   * @generated
   */
  ModelReference getPrev();

  /**
   * Sets the value of the '{@link org.osate.expr.expr.ModelReference#getPrev <em>Prev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prev</em>' containment reference.
   * @see #getPrev()
   * @generated
   */
  void setPrev(ModelReference value);

} // ModelReference
