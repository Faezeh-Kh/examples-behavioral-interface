/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventType#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getCallEventType()
 * @model
 * @generated
 */
public interface CallEventType extends EventType {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getCallEventType_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventType#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // CallEventType
