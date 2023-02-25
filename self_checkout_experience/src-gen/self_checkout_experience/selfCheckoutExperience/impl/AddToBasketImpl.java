/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import self_checkout_experience.selfCheckoutExperience.AddToBasket;
import self_checkout_experience.selfCheckoutExperience.PickStatement;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add To Basket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.impl.AddToBasketImpl#getItemInBasket <em>Item In Basket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddToBasketImpl extends MinimalEObjectImpl.Container implements AddToBasket
{
  /**
   * The cached value of the '{@link #getItemInBasket() <em>Item In Basket</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemInBasket()
   * @generated
   * @ordered
   */
  protected PickStatement itemInBasket;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddToBasketImpl()
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
    return SelfCheckoutExperiencePackage.Literals.ADD_TO_BASKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PickStatement getItemInBasket()
  {
    if (itemInBasket != null && itemInBasket.eIsProxy())
    {
      InternalEObject oldItemInBasket = (InternalEObject)itemInBasket;
      itemInBasket = (PickStatement)eResolveProxy(oldItemInBasket);
      if (itemInBasket != oldItemInBasket)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET, oldItemInBasket, itemInBasket));
      }
    }
    return itemInBasket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PickStatement basicGetItemInBasket()
  {
    return itemInBasket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItemInBasket(PickStatement newItemInBasket)
  {
    PickStatement oldItemInBasket = itemInBasket;
    itemInBasket = newItemInBasket;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET, oldItemInBasket, itemInBasket));
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
      case SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET:
        if (resolve) return getItemInBasket();
        return basicGetItemInBasket();
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
      case SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET:
        setItemInBasket((PickStatement)newValue);
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
      case SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET:
        setItemInBasket((PickStatement)null);
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
      case SelfCheckoutExperiencePackage.ADD_TO_BASKET__ITEM_IN_BASKET:
        return itemInBasket != null;
    }
    return super.eIsSet(featureID);
  }

} //AddToBasketImpl
