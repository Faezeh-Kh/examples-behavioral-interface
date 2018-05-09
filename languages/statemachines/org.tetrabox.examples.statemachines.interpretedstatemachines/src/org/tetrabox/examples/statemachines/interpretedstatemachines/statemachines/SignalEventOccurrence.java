/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence#getAttributeValues <em>Attribute Values</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getSignalEventOccurrence()
 * @model
 * @generated
 */
public interface SignalEventOccurrence extends EventOccurrence {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getSignalEventOccurrence_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Attribute Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Values</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getSignalEventOccurrence_AttributeValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValue> getAttributeValues();

} // SignalEventOccurrence
