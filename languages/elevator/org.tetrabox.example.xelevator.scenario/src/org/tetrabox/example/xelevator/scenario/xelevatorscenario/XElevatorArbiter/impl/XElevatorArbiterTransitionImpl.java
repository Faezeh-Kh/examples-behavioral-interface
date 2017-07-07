/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterTransitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterTransition;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorArbiterTransitionImpl extends ArbiterTransitionImpl<XElevatorProperty, XElevatorArbiterState> implements XElevatorArbiterTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorArbiterTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorArbiterPackage.Literals.XELEVATOR_ARBITER_TRANSITION;
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
	public NotificationChain basicSetSource(XElevatorArbiterState newSource, NotificationChain msgs) {
		return super.basicSetSource(newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(XElevatorArbiterState newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

} //XElevatorArbiterTransitionImpl
