/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMTransitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorScenarioFSMTransitionImpl extends ScenarioFSMTransitionImpl<XElevatorProperty, XElevatorScenarioFSMState> implements XElevatorScenarioFSMTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorScenarioFSMTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorScenarioPackage.Literals.XELEVATOR_SCENARIO_FSM_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetGuard(XElevatorProperty newGuard, NotificationChain msgs) {
		return super.basicSetGuard(newGuard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSource(XElevatorScenarioFSMState newSource, NotificationChain msgs) {
		return super.basicSetSource(newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(XElevatorScenarioFSMState newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

} //XElevatorScenarioFSMTransitionImpl
