/**
 */
package org.tetrabox.example.xelevator.elevator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage
 * @generated
 */
public interface ElevatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElevatorFactory eINSTANCE = org.tetrabox.example.xelevator.elevator.impl.ElevatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor</em>'.
	 * @generated
	 */
	Floor createFloor();

	/**
	 * Returns a new object of class '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator</em>'.
	 * @generated
	 */
	Elevator createElevator();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	ElevatorButton createElevatorButton();

	/**
	 * Returns a new object of class '<em>Up Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Up Button</em>'.
	 * @generated
	 */
	UpButton createUpButton();

	/**
	 * Returns a new object of class '<em>Down Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Down Button</em>'.
	 * @generated
	 */
	DownButton createDownButton();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	ElevatorSystem createElevatorSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ElevatorPackage getElevatorPackage();

} //ElevatorFactory
