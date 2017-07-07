/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMStateImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramScenarioFSMStateImpl extends ScenarioFSMStateImpl<XActivityDiagramEvent<?>, XActivityDiagramScenarioFSMTransition> implements XActivityDiagramScenarioFSMState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramScenarioFSMStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramScenarioPackage.Literals.XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetEvent(XActivityDiagramEvent<?> newEvent, NotificationChain msgs) {
		return super.basicSetEvent(newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramScenarioFSMTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XActivityDiagramScenarioFSMTransition>(XActivityDiagramScenarioFSMTransition.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
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
	public EList<XActivityDiagramScenarioFSMTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XActivityDiagramScenarioFSMTransition>(XActivityDiagramScenarioFSMTransition.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__INCOMING_TRANSITIONS, ScenarioPackage.SCENARIO_FSM_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ScenarioFSMTransition.class; } };
		}
		return incomingTransitions;
	}

} //XActivityDiagramScenarioFSMStateImpl
