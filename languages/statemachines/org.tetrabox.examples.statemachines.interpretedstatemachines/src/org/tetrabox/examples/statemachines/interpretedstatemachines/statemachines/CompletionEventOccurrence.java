/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getCompletionEventOccurrence()
 * @model
 * @generated
 */
public interface CompletionEventOccurrence extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getCompletionEventOccurrence_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // CompletionEventOccurrence
