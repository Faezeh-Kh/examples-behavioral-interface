/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorScenarioFSMImpl extends ScenarioFSMImpl<XElevatorProperty, XElevatorEvent<?>, XElevatorScenarioFSMState, XElevatorScenarioFSMTransition> implements XElevatorScenarioFSM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorScenarioFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorScenarioPackage.Literals.XELEVATOR_SCENARIO_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioFSMState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XElevatorScenarioFSMState>(XElevatorScenarioFSMState.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInitialState(XElevatorScenarioFSMState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioFSMState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XElevatorScenarioFSMState>(XElevatorScenarioFSMState.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM__ACCEPTING_STATES);
		}
		return acceptingStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioFSMTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XElevatorScenarioFSMTransition>(XElevatorScenarioFSMTransition.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM__TRANSITIONS);
		}
		return transitions;
	}

} //XElevatorScenarioFSMImpl
