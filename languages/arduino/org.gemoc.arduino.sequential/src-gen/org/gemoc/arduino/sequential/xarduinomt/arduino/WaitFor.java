/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getWaitFor()
 * @model
 * @generated
 */
public interface WaitFor extends Instruction {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.gemoc.arduino.sequential.xarduinomt.arduino.Module)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getWaitFor_Module()
	 * @model
	 * @generated
	 */
	org.gemoc.arduino.sequential.xarduinomt.arduino.Module getModule();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.gemoc.arduino.sequential.xarduinomt.arduino.Module value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setActivated();

} // WaitFor
