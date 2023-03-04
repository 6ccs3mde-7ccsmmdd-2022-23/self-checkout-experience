/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import self_checkout_experience.selfCheckoutExperience.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage
 * @generated
 */
public class SelfCheckoutExperienceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SelfCheckoutExperiencePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfCheckoutExperienceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SelfCheckoutExperiencePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT:
      {
        Self_checkout self_checkout = (Self_checkout)theEObject;
        T result = caseSelf_checkout(self_checkout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT_ONLINE:
      {
        SelfCheckoutOnline selfCheckoutOnline = (SelfCheckoutOnline)theEObject;
        T result = caseSelfCheckoutOnline(selfCheckoutOnline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SEARCH:
      {
        Search search = (Search)theEObject;
        T result = caseSearch(search);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.ADD_TO_ONLINE_BASKET:
      {
        AddToOnlineBasket addToOnlineBasket = (AddToOnlineBasket)theEObject;
        T result = caseAddToOnlineBasket(addToOnlineBasket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET:
      {
        RemoveFromOnlineBasket removeFromOnlineBasket = (RemoveFromOnlineBasket)theEObject;
        T result = caseRemoveFromOnlineBasket(removeFromOnlineBasket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.ONLINE_CHECKOUT:
      {
        OnlineCheckout onlineCheckout = (OnlineCheckout)theEObject;
        T result = caseOnlineCheckout(onlineCheckout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.CONFIRM:
      {
        Confirm confirm = (Confirm)theEObject;
        T result = caseConfirm(confirm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT_INSTORE:
      {
        SelfCheckoutInstore selfCheckoutInstore = (SelfCheckoutInstore)theEObject;
        T result = caseSelfCheckoutInstore(selfCheckoutInstore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.HOLD_SELF_SCANNER:
      {
        HoldSelfScanner holdSelfScanner = (HoldSelfScanner)theEObject;
        T result = caseHoldSelfScanner(holdSelfScanner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.PICK_STATEMENT:
      {
        PickStatement pickStatement = (PickStatement)theEObject;
        T result = casePickStatement(pickStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.ITEM_DEF:
      {
        ItemDef itemDef = (ItemDef)theEObject;
        T result = caseItemDef(itemDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SCAN_AND_ADD_TO_BASKET:
      {
        ScanAndAddToBasket scanAndAddToBasket = (ScanAndAddToBasket)theEObject;
        T result = caseScanAndAddToBasket(scanAndAddToBasket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.DROP:
      {
        Drop drop = (Drop)theEObject;
        T result = caseDrop(drop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.WALK_STATEMENT:
      {
        WalkStatement walkStatement = (WalkStatement)theEObject;
        T result = caseWalkStatement(walkStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseWalkStatement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.REPEAT:
      {
        Repeat repeat = (Repeat)theEObject;
        T result = caseRepeat(repeat);
        if (result == null) result = caseWalkStatement(repeat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.MOVE_STATEMENT:
      {
        MoveStatement moveStatement = (MoveStatement)theEObject;
        T result = caseMoveStatement(moveStatement);
        if (result == null) result = caseWalkStatement(moveStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.TURN_STATEMENT:
      {
        TurnStatement turnStatement = (TurnStatement)theEObject;
        T result = caseTurnStatement(turnStatement);
        if (result == null) result = caseWalkStatement(turnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.INT_EXPRESSION:
      {
        IntExpression intExpression = (IntExpression)theEObject;
        T result = caseIntExpression(intExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseIntExpression(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.INT_VAR_EXPRESSION:
      {
        IntVarExpression intVarExpression = (IntVarExpression)theEObject;
        T result = caseIntVarExpression(intVarExpression);
        if (result == null) result = caseIntExpression(intVarExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.CHECKOUT:
      {
        Checkout checkout = (Checkout)theEObject;
        T result = caseCheckout(checkout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SCAN_EXPRESSION:
      {
        ScanExpression scanExpression = (ScanExpression)theEObject;
        T result = caseScanExpression(scanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.SCAN:
      {
        Scan scan = (Scan)theEObject;
        T result = caseScan(scan);
        if (result == null) result = caseScanExpression(scan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.CARRY_ITEMS:
      {
        CarryItems carryItems = (CarryItems)theEObject;
        T result = caseCarryItems(carryItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseIntExpression(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseIntExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelfCheckoutExperiencePackage.COMPLEX_SCAN:
      {
        ComplexScan complexScan = (ComplexScan)theEObject;
        T result = caseComplexScan(complexScan);
        if (result == null) result = caseScanExpression(complexScan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self checkout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self checkout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelf_checkout(Self_checkout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Checkout Online</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Checkout Online</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfCheckoutOnline(SelfCheckoutOnline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearch(Search object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add To Online Basket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add To Online Basket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddToOnlineBasket(AddToOnlineBasket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove From Online Basket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove From Online Basket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveFromOnlineBasket(RemoveFromOnlineBasket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Online Checkout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Online Checkout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnlineCheckout(OnlineCheckout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Confirm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Confirm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfirm(Confirm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Checkout Instore</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Checkout Instore</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfCheckoutInstore(SelfCheckoutInstore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hold Self Scanner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hold Self Scanner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHoldSelfScanner(HoldSelfScanner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pick Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pick Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePickStatement(PickStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemDef(ItemDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scan And Add To Basket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scan And Add To Basket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScanAndAddToBasket(ScanAndAddToBasket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrop(Drop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Walk Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Walk Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWalkStatement(WalkStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeat(Repeat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveStatement(MoveStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Turn Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Turn Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTurnStatement(TurnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExpression(IntExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Var Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Var Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntVarExpression(IntVarExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckout(Checkout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scan Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scan Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScanExpression(ScanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScan(Scan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carry Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carry Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarryItems(CarryItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Scan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Scan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexScan(ComplexScan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SelfCheckoutExperienceSwitch
