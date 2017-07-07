/**
 */
package org.tetrabox.example.xelevator.elevator;

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
 *   <li>{@link org.tetrabox.example.xelevator.elevator.Elevator#getElevatorButtons <em>Elevator Buttons</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.Elevator#isDoorsOpen <em>Doors Open</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.Elevator#isGoingUp <em>Going Up</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.Elevator#getCurrentFloor <em>Current Floor</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#getElevator()
 * @model
 * @generated
 */
public interface Elevator extends EObject {
	/**
	 * Returns the value of the '<em><b>Elevator Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.xelevator.elevator.ElevatorButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevator Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevator Buttons</em>' containment reference list.
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#getElevator_ElevatorButtons()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElevatorButton> getElevatorButtons();

	/**
	 * Returns the value of the '<em><b>Doors Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors Open</em>' attribute.
	 * @see #setDoorsOpen(boolean)
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#getElevator_DoorsOpen()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDoorsOpen();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.xelevator.elevator.Elevator#isDoorsOpen <em>Doors Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doors Open</em>' attribute.
	 * @see #isDoorsOpen()
	 * @generated
	 */
	void setDoorsOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Going Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Going Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Going Up</em>' attribute.
	 * @see #setGoingUp(boolean)
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#getElevator_GoingUp()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGoingUp();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.xelevator.elevator.Elevator#isGoingUp <em>Going Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Going Up</em>' attribute.
	 * @see #isGoingUp()
	 * @generated
	 */
	void setGoingUp(boolean value);

	/**
	 * Returns the value of the '<em><b>Current Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Floor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Floor</em>' reference.
	 * @see #setCurrentFloor(Floor)
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#getElevator_CurrentFloor()
	 * @model
	 * @generated
	 */
	Floor getCurrentFloor();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.xelevator.elevator.Elevator#getCurrentFloor <em>Current Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Floor</em>' reference.
	 * @see #getCurrentFloor()
	 * @generated
	 */
	void setCurrentFloor(Floor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openDoorUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openDoorDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void closeDoor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeToDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeToUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveDown();

} // Elevator
