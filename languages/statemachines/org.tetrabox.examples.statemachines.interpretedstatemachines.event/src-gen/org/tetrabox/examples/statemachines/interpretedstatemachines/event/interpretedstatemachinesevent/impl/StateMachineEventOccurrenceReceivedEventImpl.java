/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Event Occurrence Received Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineEventOccurrenceReceivedEventImpl extends StateMachineEventImpl implements StateMachineEventOccurrenceReceivedEvent {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence event;

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
	public EventOccurrence getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventOccurrence newEvent, NotificationChain msgs) {
		EventOccurrence oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(EventOccurrence newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT:
				return basicSetEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT:
				return getEvent();
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT:
				setEvent((EventOccurrence)newValue);
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT:
				setEvent((EventOccurrence)null);
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
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineEventOccurrenceReceivedEventImpl
