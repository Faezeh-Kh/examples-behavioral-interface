/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSM;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramScenarioFSMImpl extends ScenarioFSMImpl<XActivityDiagramProperty, XActivityDiagramEvent<?>, XActivityDiagramScenarioFSMState, XActivityDiagramScenarioFSMTransition> implements XActivityDiagramScenarioFSM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramScenarioFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramScenarioPackage.Literals.XACTIVITY_DIAGRAM_SCENARIO_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramScenarioFSMState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XActivityDiagramScenarioFSMState>(XActivityDiagramScenarioFSMState.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM__STATES);
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
	public void setInitialState(XActivityDiagramScenarioFSMState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramScenarioFSMState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XActivityDiagramScenarioFSMState>(XActivityDiagramScenarioFSMState.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM__ACCEPTING_STATES);
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
	public EList<XActivityDiagramScenarioFSMTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XActivityDiagramScenarioFSMTransition>(XActivityDiagramScenarioFSMTransition.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM__TRANSITIONS);
		}
		return transitions;
	}

} //XActivityDiagramScenarioFSMImpl
