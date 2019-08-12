/**
 */
package org.osate.expr.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInteger Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.EIntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.osate.expr.expr.ExprPackage#getEIntegerLiteral()
 * @model
 * @generated
 */
public interface EIntegerLiteral extends NumberLiteral
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(long)
   * @see org.osate.expr.expr.ExprPackage#getEIntegerLiteral_Value()
   * @model dataType="org.osate.aadl2.Integer"
   * @generated
   */
  long getValue();

  /**
   * Sets the value of the '{@link org.osate.expr.expr.EIntegerLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(long value);

} // EIntegerLiteral