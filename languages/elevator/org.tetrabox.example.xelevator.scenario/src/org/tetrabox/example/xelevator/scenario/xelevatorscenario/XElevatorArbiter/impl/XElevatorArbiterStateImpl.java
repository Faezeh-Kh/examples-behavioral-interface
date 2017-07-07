/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ArbiterTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterStateImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterTransition;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorArbiterStateImpl extends ArbiterStateImpl<XElevatorProperty, XElevatorArbiterTransition> implements XElevatorArbiterState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorArbiterStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorArbiterPackage.Literals.XELEVATOR_ARBITER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorArbiterTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XElevatorArbiterTransition>(XElevatorArbiterTransition.class, this, XElevatorArbiterPackage.XELEVATOR_ARBITER_STATE__INCOMING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
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
	public EList<XElevatorArbiterTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XElevatorArbiterTransition>(XElevatorArbiterTransition.class, this, XElevatorArbiterPackage.XELEVATOR_ARBITER_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
		}
		return outgoingTransitions;
	}

} //XElevatorArbiterStateImpl
