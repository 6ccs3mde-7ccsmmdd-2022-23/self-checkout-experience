/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.MoveStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.MoveStatement#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getMoveStatement()
 * @model
 * @generated
 */
public interface MoveStatement extends WalkStatement
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * The literals are from the enumeration {@link self_checkout_experience.selfCheckoutExperience.MoveCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see self_checkout_experience.selfCheckoutExperience.MoveCommand
   * @see #setCommand(MoveCommand)
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getMoveStatement_Command()
   * @model
   * @generated
   */
  MoveCommand getCommand();

  /**
   * Sets the value of the '{@link self_checkout_experience.selfCheckoutExperience.MoveStatement#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see self_checkout_experience.selfCheckoutExperience.MoveCommand
   * @see #getCommand()
   * @generated
   */
  void setCommand(MoveCommand value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference.
   * @see #setSteps(IntExpression)
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getMoveStatement_Steps()
   * @model containment="true"
   * @generated
   */
  IntExpression getSteps();

  /**
   * Sets the value of the '{@link self_checkout_experience.selfCheckoutExperience.MoveStatement#getSteps <em>Steps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Steps</em>' containment reference.
   * @see #getSteps()
   * @generated
   */
  void setSteps(IntExpression value);

} // MoveStatement
