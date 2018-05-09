/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Event Occurrence Received Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage#getStateMachineEventOccurrenceReceivedEvent()
 * @model
 * @generated
 */
public interface StateMachineEventOccurrenceReceivedEvent extends StateMachineEvent {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventOccurrence)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage#getStateMachineEventOccurrenceReceivedEvent_Event()
	 * @model containment="true"
	 * @generated
	 */
	EventOccurrence getEvent();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventOccurrence value);

} // StateMachineEventOccurrenceReceivedEvent
