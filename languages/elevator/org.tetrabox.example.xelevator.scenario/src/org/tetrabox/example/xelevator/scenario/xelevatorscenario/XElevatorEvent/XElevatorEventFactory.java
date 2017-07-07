/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage
 * @generated
 */
public interface XElevatorEventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorEventFactory eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Button Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Press Event</em>'.
	 * @generated
	 */
	ButtonPressEvent createButtonPressEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XElevatorEventPackage getXElevatorEventPackage();

} //XElevatorEventFactory
