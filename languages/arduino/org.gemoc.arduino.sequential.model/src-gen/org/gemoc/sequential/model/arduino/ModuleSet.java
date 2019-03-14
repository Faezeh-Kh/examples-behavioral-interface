/**
 */
package org.gemoc.sequential.model.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sequential.model.arduino.ModuleSet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getModuleSet()
 * @model abstract="true"
 * @generated
 */
public interface ModuleSet extends Instruction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getModuleSet_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sequential.model.arduino.ModuleSet#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // ModuleSet
