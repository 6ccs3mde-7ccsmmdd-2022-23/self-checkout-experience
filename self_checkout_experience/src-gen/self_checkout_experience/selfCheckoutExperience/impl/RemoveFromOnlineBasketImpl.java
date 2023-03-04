/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import self_checkout_experience.selfCheckoutExperience.ItemDef;
import self_checkout_experience.selfCheckoutExperience.RemoveFromOnlineBasket;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove From Online Basket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.impl.RemoveFromOnlineBasketImpl#getRemoveItem <em>Remove Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveFromOnlineBasketImpl extends MinimalEObjectImpl.Container implements RemoveFromOnlineBasket
{
  /**
   * The cached value of the '{@link #getRemoveItem() <em>Remove Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveItem()
   * @generated
   * @ordered
   */
  protected ItemDef removeItem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveFromOnlineBasketImpl()
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
    return SelfCheckoutExperiencePackage.Literals.REMOVE_FROM_ONLINE_BASKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemDef getRemoveItem()
  {
    if (removeItem != null && removeItem.eIsProxy())
    {
      InternalEObject oldRemoveItem = (InternalEObject)removeItem;
      removeItem = (ItemDef)eResolveProxy(oldRemoveItem);
      if (removeItem != oldRemoveItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM, oldRemoveItem, removeItem));
      }
    }
    return removeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDef basicGetRemoveItem()
  {
    return removeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRemoveItem(ItemDef newRemoveItem)
  {
    ItemDef oldRemoveItem = removeItem;
    removeItem = newRemoveItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM, oldRemoveItem, removeItem));
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
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM:
        if (resolve) return getRemoveItem();
        return basicGetRemoveItem();
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
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM:
        setRemoveItem((ItemDef)newValue);
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
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM:
        setRemoveItem((ItemDef)null);
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
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET__REMOVE_ITEM:
        return removeItem != null;
    }
    return super.eIsSet(featureID);
  }

} //RemoveFromOnlineBasketImpl
