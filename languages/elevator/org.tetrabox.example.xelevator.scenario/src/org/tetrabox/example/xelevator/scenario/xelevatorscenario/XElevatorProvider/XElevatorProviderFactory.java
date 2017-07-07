/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage
 * @generated
 */
public interface XElevatorProviderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorProviderFactory eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Button Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Reference</em>'.
	 * @generated
	 */
	ButtonReference createButtonReference();

	/**
	 * Returns a new object of class '<em>Button Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Query</em>'.
	 * @generated
	 */
	ButtonQuery createButtonQuery();

	/**
	 * Returns a new object of class '<em>Elevator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator Reference</em>'.
	 * @generated
	 */
	ElevatorReference createElevatorReference();

	/**
	 * Returns a new object of class '<em>Elevator Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator Query</em>'.
	 * @generated
	 */
	ElevatorQuery createElevatorQuery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XElevatorProviderPackage getXElevatorProviderPackage();

} //XElevatorProviderFactory
