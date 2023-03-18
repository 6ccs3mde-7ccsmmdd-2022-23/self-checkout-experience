/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import self_checkout_experience.selfCheckoutExperience.GripState;
import self_checkout_experience.selfCheckoutExperience.HoldBasketStatement;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hold Basket Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.impl.HoldBasketStatementImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoldBasketStatementImpl extends WalkStatementImpl implements HoldBasketStatement
{
  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final GripState STATE_EDEFAULT = GripState.UP;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected GripState state = STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HoldBasketStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SelfCheckoutExperiencePackage.Literals.HOLD_BASKET_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GripState getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(GripState newState)
  {
    GripState oldState = state;
    state = newState == null ? STATE_EDEFAULT : newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT__STATE:
        return getState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT__STATE:
        setState((GripState)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT__STATE:
        setState(STATE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT__STATE:
        return state != STATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //HoldBasketStatementImpl
