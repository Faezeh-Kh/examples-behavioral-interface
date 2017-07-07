/**
 */
package elevator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link elevator.Elevator#getElevatorButtons <em>Elevator Buttons</em>}</li>
 * </ul>
 *
 * @see elevator.ModelPackage#getElevator()
 * @model
 * @generated
 */
public interface Elevator extends EObject {
	/**
	 * Returns the value of the '<em><b>Elevator Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link elevator.ElevatorButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevator Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevator Buttons</em>' containment reference list.
	 * @see elevator.ModelPackage#getElevator_ElevatorButtons()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElevatorButton> getElevatorButtons();

} // Elevator
