/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.Addition#getLeft <em>Left</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.Addition#getOperator <em>Operator</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.Addition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends IntExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(IntExpression)
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getAddition_Left()
   * @model containment="true"
   * @generated
   */
  IntExpression getLeft();

  /**
   * Sets the value of the '{@link self_checkout_experience.selfCheckoutExperience.Addition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IntExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getAddition_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link self_checkout_experience.selfCheckoutExperience.IntExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getAddition_Right()
   * @model containment="true"
   * @generated
   */
  EList<IntExpression> getRight();

} // Addition
