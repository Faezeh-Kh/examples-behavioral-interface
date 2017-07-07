/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiter;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterTransition;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorArbiterImpl extends ArbiterImpl<XElevatorProperty, XElevatorArbiterState, XElevatorArbiterTransition> implements XElevatorArbiter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorArbiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorArbiterPackage.Literals.XELEVATOR_ARBITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorArbiterState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XElevatorArbiterState>(XElevatorArbiterState.class, this, XElevatorArbiterPackage.XELEVATOR_ARBITER__STATES);
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
	public EList<XElevatorArbiterTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XElevatorArbiterTransition>(XElevatorArbiterTransition.class, this, XElevatorArbiterPackage.XELEVATOR_ARBITER__TRANSITIONS);
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
	public void setInitialState(XElevatorArbiterState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorArbiterState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XElevatorArbiterState>(XElevatorArbiterState.class, this, XElevatorArbiterPackage.XELEVATOR_ARBITER__ACCEPTING_STATES);
		}
		return acceptingStates;
	}

} //XElevatorArbiterImpl
