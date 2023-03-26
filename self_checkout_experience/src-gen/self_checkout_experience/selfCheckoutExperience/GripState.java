/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.selfCheckoutExperience;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grip State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage#getGripState()
 * @model
 * @generated
 */
public enum GripState implements Enumerator
{
  /**
   * The '<em><b>Grip</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRIP_VALUE
   * @generated
   * @ordered
   */
  GRIP(0, "grip", "grip"),

  /**
   * The '<em><b>Release</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELEASE_VALUE
   * @generated
   * @ordered
   */
  RELEASE(1, "release", "release");

  /**
   * The '<em><b>Grip</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRIP
   * @model name="grip"
   * @generated
   * @ordered
   */
  public static final int GRIP_VALUE = 0;

  /**
   * The '<em><b>Release</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELEASE
   * @model name="release"
   * @generated
   * @ordered
   */
  public static final int RELEASE_VALUE = 1;

  /**
   * An array of all the '<em><b>Grip State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GripState[] VALUES_ARRAY =
    new GripState[]
    {
      GRIP,
      RELEASE,
    };

  /**
   * A public read-only list of all the '<em><b>Grip State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GripState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Grip State</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GripState get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GripState result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Grip State</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GripState getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GripState result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Grip State</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GripState get(int value)
  {
    switch (value)
    {
      case GRIP_VALUE: return GRIP;
      case RELEASE_VALUE: return RELEASE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private GripState(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //GripState
