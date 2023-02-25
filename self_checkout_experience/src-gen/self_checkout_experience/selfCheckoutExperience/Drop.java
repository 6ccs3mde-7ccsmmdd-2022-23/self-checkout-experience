/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.Drop#getItemDropped <em>Item Dropped</em>}</li>
 * </ul>
 *
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getDrop()
 * @model
 * @generated
 */
public interface Drop extends EObject
{
  /**
   * Returns the value of the '<em><b>Item Dropped</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Dropped</em>' reference.
   * @see #setItemDropped(PickStatement)
   * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getDrop_ItemDropped()
   * @model
   * @generated
   */
  PickStatement getItemDropped();

  /**
   * Sets the value of the '{@link self_checkout_experience.selfCheckoutExperience.Drop#getItemDropped <em>Item Dropped</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Dropped</em>' reference.
   * @see #getItemDropped()
   * @generated
   */
  void setItemDropped(PickStatement value);

} // Drop
