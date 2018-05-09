/**
 */
package statemachines;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.Constraint#getValue <em>Value</em>}</li>
 *   <li>{@link statemachines.Constraint#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint<T, V> extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see statemachines.StatemachinesPackage#getConstraint_Value()
	 * @model
	 * @generated
	 */
	V getValue();

	/**
	 * Sets the value of the '{@link statemachines.Constraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(V value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Object)
	 * @see statemachines.StatemachinesPackage#getConstraint_Attribute()
	 * @model kind="reference"
	 * @generated
	 */
	T getAttribute();

	/**
	 * Sets the value of the '{@link statemachines.Constraint#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(T value);

} // Constraint
