/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage
 * @generated
 */
public interface XActivityDiagramScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XActivityDiagramScenarioFactory eINSTANCE = org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XActivity Diagram Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XActivity Diagram Scenario</em>'.
	 * @generated
	 */
	XActivityDiagramScenario createXActivityDiagramScenario();

	/**
	 * Returns a new object of class '<em>XActivity Diagram Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XActivity Diagram Event Occurrence</em>'.
	 * @generated
	 */
	XActivityDiagramEventOccurrence createXActivityDiagramEventOccurrence();

	/**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
	XActivityDiagramScenarioFSM createXActivityDiagramScenarioFSM();

	/**
	 * Returns a new object of class '<em>FSM State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM State</em>'.
	 * @generated
	 */
	XActivityDiagramScenarioFSMState createXActivityDiagramScenarioFSMState();

	/**
	 * Returns a new object of class '<em>FSM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Transition</em>'.
	 * @generated
	 */
	XActivityDiagramScenarioFSMTransition createXActivityDiagramScenarioFSMTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XActivityDiagramScenarioPackage getXActivityDiagramScenarioPackage();

} //XActivityDiagramScenarioFactory
