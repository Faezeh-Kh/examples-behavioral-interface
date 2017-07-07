/**
 */
package org.tetrabox.example.xelevatormt.elevator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.xelevatormt.elevator.Button#getRequestedFloor <em>Requested Floor</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevatormt.elevator.Button#isPressed <em>Pressed</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getButton()
 * @model abstract="true"
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Floor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Floor</em>' reference.
	 * @see #setRequestedFloor(Floor)
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getButton_RequestedFloor()
	 * @model
	 * @generated
	 */
	Floor getRequestedFloor();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.xelevatormt.elevator.Button#getRequestedFloor <em>Requested Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Floor</em>' reference.
	 * @see #getRequestedFloor()
	 * @generated
	 */
	void setRequestedFloor(Floor value);

	/**
	 * Returns the value of the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressed</em>' attribute.
	 * @see #setPressed(boolean)
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorPackage#getButton_Pressed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPressed();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.xelevatormt.elevator.Button#isPressed <em>Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressed</em>' attribute.
	 * @see #isPressed()
	 * @generated
	 */
	void setPressed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void press();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean notPressed();

} // Button
