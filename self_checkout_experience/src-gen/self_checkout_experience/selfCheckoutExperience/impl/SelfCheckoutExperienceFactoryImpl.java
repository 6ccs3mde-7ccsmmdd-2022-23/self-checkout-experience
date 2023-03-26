/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import self_checkout_experience.selfCheckoutExperience.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfCheckoutExperienceFactoryImpl extends EFactoryImpl implements SelfCheckoutExperienceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelfCheckoutExperienceFactory init()
  {
    try
    {
      SelfCheckoutExperienceFactory theSelfCheckoutExperienceFactory = (SelfCheckoutExperienceFactory)EPackage.Registry.INSTANCE.getEFactory(SelfCheckoutExperiencePackage.eNS_URI);
      if (theSelfCheckoutExperienceFactory != null)
      {
        return theSelfCheckoutExperienceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SelfCheckoutExperienceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfCheckoutExperienceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT: return createSelf_checkout();
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT_EXPERIENCE: return createSelfCheckoutExperience();
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT_ONLINE: return createSelfCheckoutOnline();
      case SelfCheckoutExperiencePackage.SEARCH: return createSearch();
      case SelfCheckoutExperiencePackage.ADD_TO_ONLINE_BASKET: return createAddToOnlineBasket();
      case SelfCheckoutExperiencePackage.REMOVE_FROM_ONLINE_BASKET: return createRemoveFromOnlineBasket();
      case SelfCheckoutExperiencePackage.ONLINE_CHECKOUT: return createOnlineCheckout();
      case SelfCheckoutExperiencePackage.CONFIRM: return createConfirm();
      case SelfCheckoutExperiencePackage.SELF_CHECKOUT_INSTORE: return createSelfCheckoutInstore();
      case SelfCheckoutExperiencePackage.HOLD_SELF_SCANNER: return createHoldSelfScanner();
      case SelfCheckoutExperiencePackage.PICK_STATEMENT: return createPickStatement();
      case SelfCheckoutExperiencePackage.ITEM_DEF: return createItemDef();
      case SelfCheckoutExperiencePackage.SCAN_AND_ADD_TO_BASKET: return createScanAndAddToBasket();
      case SelfCheckoutExperiencePackage.DROP: return createDrop();
      case SelfCheckoutExperiencePackage.WALK_STATEMENT: return createWalkStatement();
      case SelfCheckoutExperiencePackage.HOLD_BASKET_STATEMENT: return createHoldBasketStatement();
      case SelfCheckoutExperiencePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case SelfCheckoutExperiencePackage.REPEAT: return createRepeat();
      case SelfCheckoutExperiencePackage.MOVE_STATEMENT: return createMoveStatement();
      case SelfCheckoutExperiencePackage.TURN_STATEMENT: return createTurnStatement();
      case SelfCheckoutExperiencePackage.INT_EXPRESSION: return createIntExpression();
      case SelfCheckoutExperiencePackage.INT_LITERAL: return createIntLiteral();
      case SelfCheckoutExperiencePackage.INT_VAR_EXPRESSION: return createIntVarExpression();
      case SelfCheckoutExperiencePackage.CHECKOUT: return createCheckout();
      case SelfCheckoutExperiencePackage.SCAN_EXPRESSION: return createScanExpression();
      case SelfCheckoutExperiencePackage.SCAN: return createScan();
      case SelfCheckoutExperiencePackage.CARRY_ITEMS: return createCarryItems();
      case SelfCheckoutExperiencePackage.ADDITION: return createAddition();
      case SelfCheckoutExperiencePackage.MULTIPLICATION: return createMultiplication();
      case SelfCheckoutExperiencePackage.COMPLEX_SCAN: return createComplexScan();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SelfCheckoutExperiencePackage.LOAD_SHOPPING_SITE:
        return createLoadShoppingSiteFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.DELIVERY_OPTIONS:
        return createDeliveryOptionsFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.CONFIRM_ENUM:
        return createConfirmEnumFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.SELF_SCANNER:
        return createSelfScannerFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.GRIP_STATE:
        return createGripStateFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.MOVE_COMMAND:
        return createMoveCommandFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.TURN_COMMAND:
        return createTurnCommandFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.CARRY:
        return createCarryFromString(eDataType, initialValue);
      case SelfCheckoutExperiencePackage.PAY:
        return createPayFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SelfCheckoutExperiencePackage.LOAD_SHOPPING_SITE:
        return convertLoadShoppingSiteToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.DELIVERY_OPTIONS:
        return convertDeliveryOptionsToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.CONFIRM_ENUM:
        return convertConfirmEnumToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.SELF_SCANNER:
        return convertSelfScannerToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.GRIP_STATE:
        return convertGripStateToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.MOVE_COMMAND:
        return convertMoveCommandToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.TURN_COMMAND:
        return convertTurnCommandToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.CARRY:
        return convertCarryToString(eDataType, instanceValue);
      case SelfCheckoutExperiencePackage.PAY:
        return convertPayToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Self_checkout createSelf_checkout()
  {
    Self_checkoutImpl self_checkout = new Self_checkoutImpl();
    return self_checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfCheckoutExperience createSelfCheckoutExperience()
  {
    SelfCheckoutExperienceImpl selfCheckoutExperience = new SelfCheckoutExperienceImpl();
    return selfCheckoutExperience;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfCheckoutOnline createSelfCheckoutOnline()
  {
    SelfCheckoutOnlineImpl selfCheckoutOnline = new SelfCheckoutOnlineImpl();
    return selfCheckoutOnline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Search createSearch()
  {
    SearchImpl search = new SearchImpl();
    return search;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddToOnlineBasket createAddToOnlineBasket()
  {
    AddToOnlineBasketImpl addToOnlineBasket = new AddToOnlineBasketImpl();
    return addToOnlineBasket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveFromOnlineBasket createRemoveFromOnlineBasket()
  {
    RemoveFromOnlineBasketImpl removeFromOnlineBasket = new RemoveFromOnlineBasketImpl();
    return removeFromOnlineBasket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnlineCheckout createOnlineCheckout()
  {
    OnlineCheckoutImpl onlineCheckout = new OnlineCheckoutImpl();
    return onlineCheckout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Confirm createConfirm()
  {
    ConfirmImpl confirm = new ConfirmImpl();
    return confirm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfCheckoutInstore createSelfCheckoutInstore()
  {
    SelfCheckoutInstoreImpl selfCheckoutInstore = new SelfCheckoutInstoreImpl();
    return selfCheckoutInstore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoldSelfScanner createHoldSelfScanner()
  {
    HoldSelfScannerImpl holdSelfScanner = new HoldSelfScannerImpl();
    return holdSelfScanner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PickStatement createPickStatement()
  {
    PickStatementImpl pickStatement = new PickStatementImpl();
    return pickStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemDef createItemDef()
  {
    ItemDefImpl itemDef = new ItemDefImpl();
    return itemDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScanAndAddToBasket createScanAndAddToBasket()
  {
    ScanAndAddToBasketImpl scanAndAddToBasket = new ScanAndAddToBasketImpl();
    return scanAndAddToBasket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Drop createDrop()
  {
    DropImpl drop = new DropImpl();
    return drop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WalkStatement createWalkStatement()
  {
    WalkStatementImpl walkStatement = new WalkStatementImpl();
    return walkStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HoldBasketStatement createHoldBasketStatement()
  {
    HoldBasketStatementImpl holdBasketStatement = new HoldBasketStatementImpl();
    return holdBasketStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Repeat createRepeat()
  {
    RepeatImpl repeat = new RepeatImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveStatement createMoveStatement()
  {
    MoveStatementImpl moveStatement = new MoveStatementImpl();
    return moveStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TurnStatement createTurnStatement()
  {
    TurnStatementImpl turnStatement = new TurnStatementImpl();
    return turnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntExpression createIntExpression()
  {
    IntExpressionImpl intExpression = new IntExpressionImpl();
    return intExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntVarExpression createIntVarExpression()
  {
    IntVarExpressionImpl intVarExpression = new IntVarExpressionImpl();
    return intVarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checkout createCheckout()
  {
    CheckoutImpl checkout = new CheckoutImpl();
    return checkout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScanExpression createScanExpression()
  {
    ScanExpressionImpl scanExpression = new ScanExpressionImpl();
    return scanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scan createScan()
  {
    ScanImpl scan = new ScanImpl();
    return scan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CarryItems createCarryItems()
  {
    CarryItemsImpl carryItems = new CarryItemsImpl();
    return carryItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComplexScan createComplexScan()
  {
    ComplexScanImpl complexScan = new ComplexScanImpl();
    return complexScan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadShoppingSite createLoadShoppingSiteFromString(EDataType eDataType, String initialValue)
  {
    LoadShoppingSite result = LoadShoppingSite.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLoadShoppingSiteToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeliveryOptions createDeliveryOptionsFromString(EDataType eDataType, String initialValue)
  {
    DeliveryOptions result = DeliveryOptions.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeliveryOptionsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfirmEnum createConfirmEnumFromString(EDataType eDataType, String initialValue)
  {
    ConfirmEnum result = ConfirmEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConfirmEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfScanner createSelfScannerFromString(EDataType eDataType, String initialValue)
  {
    SelfScanner result = SelfScanner.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSelfScannerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GripState createGripStateFromString(EDataType eDataType, String initialValue)
  {
    GripState result = GripState.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGripStateToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveCommand createMoveCommandFromString(EDataType eDataType, String initialValue)
  {
    MoveCommand result = MoveCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMoveCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnCommand createTurnCommandFromString(EDataType eDataType, String initialValue)
  {
    TurnCommand result = TurnCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTurnCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Carry createCarryFromString(EDataType eDataType, String initialValue)
  {
    Carry result = Carry.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCarryToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pay createPayFromString(EDataType eDataType, String initialValue)
  {
    Pay result = Pay.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPayToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfCheckoutExperiencePackage getSelfCheckoutExperiencePackage()
  {
    return (SelfCheckoutExperiencePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SelfCheckoutExperiencePackage getPackage()
  {
    return SelfCheckoutExperiencePackage.eINSTANCE;
  }

} //SelfCheckoutExperienceFactoryImpl
