/**
 */
package org.tetrabox.example.xelevatormt.elevator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getElevators <em>Elevators</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getFloors <em>Floors</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getElevatorSystem()
 * @model
 * @generated
 */
public interface ElevatorSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Elevators</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.xelevatormt.elevator.Elevator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevators</em>' containment reference list.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getElevatorSystem_Elevators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elevator> getElevators();

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.xelevatormt.elevator.Floor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' containment reference list.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getElevatorSystem_Floors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Floor> getFloors();

} // ElevatorSystem
