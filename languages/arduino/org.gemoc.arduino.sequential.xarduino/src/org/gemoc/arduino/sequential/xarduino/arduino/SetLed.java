/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Led</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.SetLed#getLed <em>Led</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getSetLed()
 * @model
 * @generated
 */
public interface SetLed extends ModuleSet {
	/**
	 * Returns the value of the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Led</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led</em>' reference.
	 * @see #setLed(Led)
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getSetLed_Led()
	 * @model required="true"
	 * @generated
	 */
	Led getLed();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduino.arduino.SetLed#getLed <em>Led</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led</em>' reference.
	 * @see #getLed()
	 * @generated
	 */
	void setLed(Led value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // SetLed
