/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterTransitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramArbiterTransitionImpl extends ArbiterTransitionImpl<XActivityDiagramProperty, XActivityDiagramArbiterState> implements XActivityDiagramArbiterTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramArbiterTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramArbiterPackage.Literals.XACTIVITY_DIAGRAM_ARBITER_TRANSITION;
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
	public NotificationChain basicSetSource(XActivityDiagramArbiterState newSource, NotificationChain msgs) {
		return super.basicSetSource(newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(XActivityDiagramArbiterState newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

} //XActivityDiagramArbiterTransitionImpl
