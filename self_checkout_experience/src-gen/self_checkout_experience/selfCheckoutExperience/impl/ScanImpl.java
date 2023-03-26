/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import self_checkout_experience.selfCheckoutExperience.Scan;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;
import self_checkout_experience.selfCheckoutExperience.SelfScanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link self_checkout_experience.selfCheckoutExperience.impl.ScanImpl#getScanMachine <em>Scan Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScanImpl extends ScanExpressionImpl implements Scan
{
  /**
   * The default value of the '{@link #getScanMachine() <em>Scan Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScanMachine()
   * @generated
   * @ordered
   */
  protected static final SelfScanner SCAN_MACHINE_EDEFAULT = SelfScanner.SELFSCANNER;

  /**
   * The cached value of the '{@link #getScanMachine() <em>Scan Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScanMachine()
   * @generated
   * @ordered
   */
  protected SelfScanner scanMachine = SCAN_MACHINE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScanImpl()
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
    return SelfCheckoutExperiencePackage.Literals.SCAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfScanner getScanMachine()
  {
    return scanMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScanMachine(SelfScanner newScanMachine)
  {
    SelfScanner oldScanMachine = scanMachine;
    scanMachine = newScanMachine == null ? SCAN_MACHINE_EDEFAULT : newScanMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelfCheckoutExperiencePackage.SCAN__SCAN_MACHINE, oldScanMachine, scanMachine));
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
      case SelfCheckoutExperiencePackage.SCAN__SCAN_MACHINE:
        return getScanMachine();
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
      case SelfCheckoutExperiencePackage.SCAN__SCAN_MACHINE:
        setScanMachine((SelfScanner)newValue);
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
      case SelfCheckoutExperiencePackage.SCAN__SCAN_MACHINE:
        setScanMachine(SCAN_MACHINE_EDEFAULT);
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
      case SelfCheckoutExperiencePackage.SCAN__SCAN_MACHINE:
        return scanMachine != SCAN_MACHINE_EDEFAULT;
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
    result.append(" (scanMachine: ");
    result.append(scanMachine);
    result.append(')');
    return result.toString();
  }

} //ScanImpl
