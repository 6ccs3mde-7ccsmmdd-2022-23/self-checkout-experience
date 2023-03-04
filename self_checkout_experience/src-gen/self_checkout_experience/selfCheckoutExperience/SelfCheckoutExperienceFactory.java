/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage
 * @generated
 */
public interface SelfCheckoutExperienceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SelfCheckoutExperienceFactory eINSTANCE = self_checkout_experience.selfCheckoutExperience.impl.SelfCheckoutExperienceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Self checkout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self checkout</em>'.
   * @generated
   */
  Self_checkout createSelf_checkout();

  /**
   * Returns a new object of class '<em>Pick Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pick Statement</em>'.
   * @generated
   */
  PickStatement createPickStatement();

  /**
   * Returns a new object of class '<em>Item Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Def</em>'.
   * @generated
   */
  ItemDef createItemDef();

  /**
   * Returns a new object of class '<em>Add To Basket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add To Basket</em>'.
   * @generated
   */
  AddToBasket createAddToBasket();

  /**
   * Returns a new object of class '<em>Drop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop</em>'.
   * @generated
   */
  Drop createDrop();

  /**
   * Returns a new object of class '<em>Walk Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Walk Statement</em>'.
   * @generated
   */
  WalkStatement createWalkStatement();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat</em>'.
   * @generated
   */
  Repeat createRepeat();

  /**
   * Returns a new object of class '<em>Move Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Statement</em>'.
   * @generated
   */
  MoveStatement createMoveStatement();

  /**
   * Returns a new object of class '<em>Turn Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Turn Statement</em>'.
   * @generated
   */
  TurnStatement createTurnStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Int Var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Var Expression</em>'.
   * @generated
   */
  IntVarExpression createIntVarExpression();

  /**
   * Returns a new object of class '<em>Checkout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Checkout</em>'.
   * @generated
   */
  Checkout createCheckout();

  /**
   * Returns a new object of class '<em>Scan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scan</em>'.
   * @generated
   */
  Scan createScan();

  /**
   * Returns a new object of class '<em>Add To Bag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add To Bag</em>'.
   * @generated
   */
  AddToBag createAddToBag();

  /**
   * Returns a new object of class '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition</em>'.
   * @generated
   */
  Addition createAddition();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SelfCheckoutExperiencePackage getSelfCheckoutExperiencePackage();

} //SelfCheckoutExperienceFactory
