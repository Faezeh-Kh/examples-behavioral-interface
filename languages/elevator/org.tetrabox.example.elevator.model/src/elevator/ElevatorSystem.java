/**
 */
package elevator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link elevator.ElevatorSystem#getElevators <em>Elevators</em>}</li>
 *   <li>{@link elevator.ElevatorSystem#getFloors <em>Floors</em>}</li>
 * </ul>
 *
 * @see elevator.ModelPackage#getElevatorSystem()
 * @model
 * @generated
 */
public interface ElevatorSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Elevators</b></em>' containment reference list.
	 * The list contents are of type {@link elevator.Elevator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevators</em>' containment reference list.
	 * @see elevator.ModelPackage#getElevatorSystem_Elevators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elevator> getElevators();

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' containment reference list.
	 * The list contents are of type {@link elevator.Floor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' containment reference list.
	 * @see elevator.ModelPackage#getElevatorSystem_Floors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Floor> getFloors();

} // ElevatorSystem
