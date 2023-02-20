/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckout.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import self_checkout_experience.selfCheckout.Pick;
import self_checkout_experience.selfCheckout.SelfCheckoutPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckout.impl.PickImpl#getName <em>Name</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckout.impl.PickImpl#getHoldingItem <em>Holding Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PickImpl extends MinimalEObjectImpl.Container implements Pick
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHoldingItem() <em>Holding Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoldingItem()
   * @generated
   * @ordered
   */
  protected EObject holdingItem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PickImpl()
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
    return SelfCheckoutPackage.Literals.PICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutPackage.PICK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getHoldingItem()
  {
    return holdingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHoldingItem(EObject newHoldingItem, NotificationChain msgs)
  {
    EObject oldHoldingItem = holdingItem;
    holdingItem = newHoldingItem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfCheckoutPackage.PICK__HOLDING_ITEM, oldHoldingItem, newHoldingItem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHoldingItem(EObject newHoldingItem)
  {
    if (newHoldingItem != holdingItem)
    {
      NotificationChain msgs = null;
      if (holdingItem != null)
        msgs = ((InternalEObject)holdingItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfCheckoutPackage.PICK__HOLDING_ITEM, null, msgs);
      if (newHoldingItem != null)
        msgs = ((InternalEObject)newHoldingItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfCheckoutPackage.PICK__HOLDING_ITEM, null, msgs);
      msgs = basicSetHoldingItem(newHoldingItem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutPackage.PICK__HOLDING_ITEM, newHoldingItem, newHoldingItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SelfCheckoutPackage.PICK__HOLDING_ITEM:
        return basicSetHoldingItem(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SelfCheckoutPackage.PICK__NAME:
        return getName();
      case SelfCheckoutPackage.PICK__HOLDING_ITEM:
        return getHoldingItem();
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
      case SelfCheckoutPackage.PICK__NAME:
        setName((String)newValue);
        return;
      case SelfCheckoutPackage.PICK__HOLDING_ITEM:
        setHoldingItem((EObject)newValue);
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
      case SelfCheckoutPackage.PICK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SelfCheckoutPackage.PICK__HOLDING_ITEM:
        setHoldingItem((EObject)null);
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
      case SelfCheckoutPackage.PICK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SelfCheckoutPackage.PICK__HOLDING_ITEM:
        return holdingItem != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PickImpl
