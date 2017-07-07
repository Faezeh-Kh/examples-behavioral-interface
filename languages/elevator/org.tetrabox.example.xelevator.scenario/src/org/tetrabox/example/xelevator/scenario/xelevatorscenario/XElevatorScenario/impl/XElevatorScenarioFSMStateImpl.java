/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMStateImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorScenarioFSMStateImpl extends ScenarioFSMStateImpl<XElevatorEvent<?>, XElevatorScenarioFSMTransition> implements XElevatorScenarioFSMState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorScenarioFSMStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorScenarioPackage.Literals.XELEVATOR_SCENARIO_FSM_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetEvent(XElevatorEvent<?> newEvent, NotificationChain msgs) {
		return super.basicSetEvent(newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioFSMTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XElevatorScenarioFSMTransition>(XElevatorScenarioFSMTransition.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioFSMTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XElevatorScenarioFSMTransition>(XElevatorScenarioFSMTransition.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_STATE__INCOMING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
		}
		return incomingTransitions;
	}

} //XElevatorScenarioFSMStateImpl
