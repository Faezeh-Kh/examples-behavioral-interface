/**
 */
package statemachines;

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
 *   <li>{@link statemachines.Behavior#getEmittedSignals <em>Emitted Signals</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Emitted Signals</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.SignalEventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitted Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitted Signals</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getBehavior_EmittedSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalEventOccurrence> getEmittedSignals();

} // Behavior
