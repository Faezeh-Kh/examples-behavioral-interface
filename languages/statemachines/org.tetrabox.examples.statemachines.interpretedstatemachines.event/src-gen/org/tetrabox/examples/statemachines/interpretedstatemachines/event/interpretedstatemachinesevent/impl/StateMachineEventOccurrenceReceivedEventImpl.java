/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Event Occurrence Received Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineEventOccurrenceReceivedEventImpl extends StateMachineEventImpl implements StateMachineEventOccurrenceReceivedEvent {
	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected CustomEvent eventType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineEventOccurrenceReceivedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterpretedstatemachineseventPackage.Literals.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent getEventType() {
		if (eventType != null && eventType.eIsProxy()) {
			InternalEObject oldEventType = (InternalEObject)eventType;
			eventType = (CustomEvent)eResolveProxy(oldEventType);
			if (eventType != oldEventType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE, oldEventType, eventType));
			}
		}
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent basicGetEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(CustomEvent newEventType) {
		CustomEvent oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE:
				if (resolve) return getEventType();
				return basicGetEventType();
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE:
				setEventType((CustomEvent)newValue);
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE:
				setEventType((CustomEvent)null);
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE:
				return eventType != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineEventOccurrenceReceivedEventImpl
