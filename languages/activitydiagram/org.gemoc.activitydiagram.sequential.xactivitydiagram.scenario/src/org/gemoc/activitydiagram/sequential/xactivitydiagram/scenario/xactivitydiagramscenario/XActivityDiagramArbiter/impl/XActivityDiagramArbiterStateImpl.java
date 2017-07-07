/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ArbiterTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterStateImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramArbiterStateImpl extends ArbiterStateImpl<XActivityDiagramProperty, XActivityDiagramArbiterTransition> implements XActivityDiagramArbiterState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramArbiterStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramArbiterPackage.Literals.XACTIVITY_DIAGRAM_ARBITER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramArbiterTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XActivityDiagramArbiterTransition>(XActivityDiagramArbiterTransition.class, this, XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER_STATE__INCOMING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramArbiterTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XActivityDiagramArbiterTransition>(XActivityDiagramArbiterTransition.class, this, XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
		}
		return outgoingTransitions;
	}

} //XActivityDiagramArbiterStateImpl
