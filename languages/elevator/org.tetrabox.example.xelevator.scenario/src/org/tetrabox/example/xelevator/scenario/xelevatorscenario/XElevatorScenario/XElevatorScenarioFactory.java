/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage
 * @generated
 */
public interface XElevatorScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorScenarioFactory eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XElevator Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XElevator Scenario</em>'.
	 * @generated
	 */
	XElevatorScenario createXElevatorScenario();

	/**
	 * Returns a new object of class '<em>XElevator Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XElevator Event Occurrence</em>'.
	 * @generated
	 */
	XElevatorEventOccurrence createXElevatorEventOccurrence();

	/**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
	XElevatorScenarioFSM createXElevatorScenarioFSM();

	/**
	 * Returns a new object of class '<em>FSM State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM State</em>'.
	 * @generated
	 */
	XElevatorScenarioFSMState createXElevatorScenarioFSMState();

	/**
	 * Returns a new object of class '<em>FSM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Transition</em>'.
	 * @generated
	 */
	XElevatorScenarioFSMTransition createXElevatorScenarioFSMTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XElevatorScenarioPackage getXElevatorScenarioPackage();

} //XElevatorScenarioFactory
