/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import self_checkout_experience.selfCheckoutExperience.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage
 * @generated
 */
public class SelfCheckoutExperienceAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SelfCheckoutExperiencePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfCheckoutExperienceAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SelfCheckoutExperiencePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfCheckoutExperienceSwitch<Adapter> modelSwitch =
    new SelfCheckoutExperienceSwitch<Adapter>()
    {
      @Override
      public Adapter caseSelf_checkout(Self_checkout object)
      {
        return createSelf_checkoutAdapter();
      }
      @Override
      public Adapter caseHoldSelfScanner(HoldSelfScanner object)
      {
        return createHoldSelfScannerAdapter();
      }
      @Override
      public Adapter casePickStatement(PickStatement object)
      {
        return createPickStatementAdapter();
      }
      @Override
      public Adapter caseItemDef(ItemDef object)
      {
        return createItemDefAdapter();
      }
      @Override
      public Adapter caseScanAndAddToBasket(ScanAndAddToBasket object)
      {
        return createScanAndAddToBasketAdapter();
      }
      @Override
      public Adapter caseDrop(Drop object)
      {
        return createDropAdapter();
      }
      @Override
      public Adapter caseWalkStatement(WalkStatement object)
      {
        return createWalkStatementAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseRepeat(Repeat object)
      {
        return createRepeatAdapter();
      }
      @Override
      public Adapter caseMoveStatement(MoveStatement object)
      {
        return createMoveStatementAdapter();
      }
      @Override
      public Adapter caseTurnStatement(TurnStatement object)
      {
        return createTurnStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseIntVarExpression(IntVarExpression object)
      {
        return createIntVarExpressionAdapter();
      }
      @Override
      public Adapter caseCheckout(Checkout object)
      {
        return createCheckoutAdapter();
      }
      @Override
      public Adapter caseScanExpression(ScanExpression object)
      {
        return createScanExpressionAdapter();
      }
      @Override
      public Adapter caseScan(Scan object)
      {
        return createScanAdapter();
      }
      @Override
      public Adapter caseCarryItems(CarryItems object)
      {
        return createCarryItemsAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseComplexScan(ComplexScan object)
      {
        return createComplexScanAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Self_checkout <em>Self checkout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Self_checkout
   * @generated
   */
  public Adapter createSelf_checkoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.HoldSelfScanner <em>Hold Self Scanner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.HoldSelfScanner
   * @generated
   */
  public Adapter createHoldSelfScannerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.PickStatement <em>Pick Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.PickStatement
   * @generated
   */
  public Adapter createPickStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.ItemDef <em>Item Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.ItemDef
   * @generated
   */
  public Adapter createItemDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket <em>Scan And Add To Basket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket
   * @generated
   */
  public Adapter createScanAndAddToBasketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Drop <em>Drop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Drop
   * @generated
   */
  public Adapter createDropAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.WalkStatement <em>Walk Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.WalkStatement
   * @generated
   */
  public Adapter createWalkStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Repeat
   * @generated
   */
  public Adapter createRepeatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.MoveStatement <em>Move Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.MoveStatement
   * @generated
   */
  public Adapter createMoveStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.TurnStatement <em>Turn Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.TurnStatement
   * @generated
   */
  public Adapter createTurnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.IntVarExpression <em>Int Var Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.IntVarExpression
   * @generated
   */
  public Adapter createIntVarExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Checkout <em>Checkout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Checkout
   * @generated
   */
  public Adapter createCheckoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.ScanExpression <em>Scan Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.ScanExpression
   * @generated
   */
  public Adapter createScanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Scan <em>Scan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Scan
   * @generated
   */
  public Adapter createScanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.CarryItems <em>Carry Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.CarryItems
   * @generated
   */
  public Adapter createCarryItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link self_checkout_experience.selfCheckoutExperience.ComplexScan <em>Complex Scan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see self_checkout_experience.selfCheckoutExperience.ComplexScan
   * @generated
   */
  public Adapter createComplexScanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SelfCheckoutExperienceAdapterFactory
