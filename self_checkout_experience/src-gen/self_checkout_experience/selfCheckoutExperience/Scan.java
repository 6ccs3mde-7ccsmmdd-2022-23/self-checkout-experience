/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.Scan#getScanMachine <em>Scan Machine</em>}</li>
 * </ul>
 *
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getScan()
 * @model
 * @generated
 */
public interface Scan extends ScanExpression
{
  /**
   * Returns the value of the '<em><b>Scan Machine</b></em>' attribute.
   * The literals are from the enumeration {@link self_checkout_experience.selfCheckoutExperience.SelfScanner}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scan Machine</em>' attribute.
   * @see self_checkout_experience.selfCheckoutExperience.SelfScanner
   * @see #setScanMachine(SelfScanner)
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getScan_ScanMachine()
   * @model
   * @generated
   */
  SelfScanner getScanMachine();

  /**
   * Sets the value of the '{@link self_checkout_experience.selfCheckoutExperience.Scan#getScanMachine <em>Scan Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scan Machine</em>' attribute.
   * @see self_checkout_experience.selfCheckoutExperience.SelfScanner
   * @see #getScanMachine()
   * @generated
   */
  void setScanMachine(SelfScanner value);

} // Scan
