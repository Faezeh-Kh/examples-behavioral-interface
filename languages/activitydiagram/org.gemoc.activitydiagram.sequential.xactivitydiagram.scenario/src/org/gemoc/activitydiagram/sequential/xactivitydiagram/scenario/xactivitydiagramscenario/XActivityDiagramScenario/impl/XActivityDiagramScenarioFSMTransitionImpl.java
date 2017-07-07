/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMTransitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramScenarioFSMTransitionImpl extends ScenarioFSMTransitionImpl<XActivityDiagramProperty, XActivityDiagramScenarioFSMState> implements XActivityDiagramScenarioFSMTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramScenarioFSMTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramScenarioPackage.Literals.XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetGuard(XActivityDiagramProperty newGuard, NotificationChain msgs) {
		return super.basicSetGuard(newGuard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSource(XActivityDiagramScenarioFSMState newSource, NotificationChain msgs) {
		return super.basicSetSource(newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(XActivityDiagramScenarioFSMState newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

} //XActivityDiagramScenarioFSMTransitionImpl
