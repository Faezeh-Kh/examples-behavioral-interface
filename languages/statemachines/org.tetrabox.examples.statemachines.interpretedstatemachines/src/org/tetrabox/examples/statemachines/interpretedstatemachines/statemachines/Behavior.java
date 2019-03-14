/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior#getEmittedSignals <em>Emitted Signals</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Emitted Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitted Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitted Signals</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#getBehavior_EmittedSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalEventOccurrence> getEmittedSignals();

} // Behavior
