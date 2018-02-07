/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateMachineEventImpl extends InterpretedStateMachinesDSLEventImpl implements StateMachineEvent {
	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine stateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterpretedstatemachineseventPackage.Literals.STATE_MACHINE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (stateMachine != null && stateMachine.eIsProxy()) {
			InternalEObject oldStateMachine = (InternalEObject)stateMachine;
			stateMachine = (StateMachine)eResolveProxy(oldStateMachine);
			if (stateMachine != oldStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE, oldStateMachine, stateMachine));
			}
		}
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetStateMachine() {
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		StateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE, oldStateMachine, stateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE:
				if (resolve) return getStateMachine();
				return basicGetStateMachine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT__STATE_MACHINE:
				return stateMachine != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineEventImpl
