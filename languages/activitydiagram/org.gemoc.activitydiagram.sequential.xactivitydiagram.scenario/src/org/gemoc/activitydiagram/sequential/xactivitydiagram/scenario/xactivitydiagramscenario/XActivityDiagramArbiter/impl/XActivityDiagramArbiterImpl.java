/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XActivity Diagram Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramArbiterImpl extends ArbiterImpl<XActivityDiagramProperty, XActivityDiagramArbiterState, XActivityDiagramArbiterTransition> implements XActivityDiagramArbiter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramArbiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramArbiterPackage.Literals.XACTIVITY_DIAGRAM_ARBITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramArbiterState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XActivityDiagramArbiterState>(XActivityDiagramArbiterState.class, this, XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramArbiterTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XActivityDiagramArbiterTransition>(XActivityDiagramArbiterTransition.class, this, XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInitialState(XActivityDiagramArbiterState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramArbiterState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XActivityDiagramArbiterState>(XActivityDiagramArbiterState.class, this, XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER__ACCEPTING_STATES);
		}
		return acceptingStates;
	}

} //XActivityDiagramArbiterImpl
