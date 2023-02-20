/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckout.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import self_checkout_experience.selfCheckout.Checkout;
import self_checkout_experience.selfCheckout.Pick;
import self_checkout_experience.selfCheckout.SelfCheckoutPackage;
import self_checkout_experience.selfCheckout.Self_checkout;
import self_checkout_experience.selfCheckout.WalkStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self checkout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckout.impl.Self_checkoutImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckout.impl.Self_checkoutImpl#getWalkstatements <em>Walkstatements</em>}</li>
 *   <li>{@link self_checkout_experience.selfCheckout.impl.Self_checkoutImpl#getCheckout <em>Checkout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Self_checkoutImpl extends MinimalEObjectImpl.Container implements Self_checkout
{
  /**
   * The cached value of the '{@link #getPick() <em>Pick</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPick()
   * @generated
   * @ordered
   */
  protected EList<Pick> pick;

  /**
   * The cached value of the '{@link #getWalkstatements() <em>Walkstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWalkstatements()
   * @generated
   * @ordered
   */
  protected EList<WalkStatement> walkstatements;

  /**
   * The cached value of the '{@link #getCheckout() <em>Checkout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckout()
   * @generated
   * @ordered
   */
  protected Checkout checkout;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Self_checkoutImpl()
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
    return SelfCheckoutPackage.Literals.SELF_CHECKOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Pick> getPick()
  {
    if (pick == null)
    {
      pick = new EObjectContainmentEList<Pick>(Pick.class, this, SelfCheckoutPackage.SELF_CHECKOUT__PICK);
    }
    return pick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<WalkStatement> getWalkstatements()
  {
    if (walkstatements == null)
    {
      walkstatements = new EObjectContainmentEList<WalkStatement>(WalkStatement.class, this, SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS);
    }
    return walkstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checkout getCheckout()
  {
    return checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckout(Checkout newCheckout, NotificationChain msgs)
  {
    Checkout oldCheckout = checkout;
    checkout = newCheckout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT, oldCheckout, newCheckout);
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
  public void setCheckout(Checkout newCheckout)
  {
    if (newCheckout != checkout)
    {
      NotificationChain msgs = null;
      if (checkout != null)
        msgs = ((InternalEObject)checkout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT, null, msgs);
      if (newCheckout != null)
        msgs = ((InternalEObject)newCheckout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT, null, msgs);
      msgs = basicSetCheckout(newCheckout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT, newCheckout, newCheckout));
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
      case SelfCheckoutPackage.SELF_CHECKOUT__PICK:
        return ((InternalEList<?>)getPick()).basicRemove(otherEnd, msgs);
      case SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS:
        return ((InternalEList<?>)getWalkstatements()).basicRemove(otherEnd, msgs);
      case SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT:
        return basicSetCheckout(null, msgs);
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
      case SelfCheckoutPackage.SELF_CHECKOUT__PICK:
        return getPick();
      case SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS:
        return getWalkstatements();
      case SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT:
        return getCheckout();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelfCheckoutPackage.SELF_CHECKOUT__PICK:
        getPick().clear();
        getPick().addAll((Collection<? extends Pick>)newValue);
        return;
      case SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS:
        getWalkstatements().clear();
        getWalkstatements().addAll((Collection<? extends WalkStatement>)newValue);
        return;
      case SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT:
        setCheckout((Checkout)newValue);
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
      case SelfCheckoutPackage.SELF_CHECKOUT__PICK:
        getPick().clear();
        return;
      case SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS:
        getWalkstatements().clear();
        return;
      case SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT:
        setCheckout((Checkout)null);
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
      case SelfCheckoutPackage.SELF_CHECKOUT__PICK:
        return pick != null && !pick.isEmpty();
      case SelfCheckoutPackage.SELF_CHECKOUT__WALKSTATEMENTS:
        return walkstatements != null && !walkstatements.isEmpty();
      case SelfCheckoutPackage.SELF_CHECKOUT__CHECKOUT:
        return checkout != null;
    }
    return super.eIsSet(featureID);
  }

} //Self_checkoutImpl
