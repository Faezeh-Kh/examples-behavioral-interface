/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action Accept Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage#getAcceptEventActionAcceptEvent()
 * @model
 * @generated
 */
public interface AcceptEventActionAcceptEvent extends XActivityDiagramEvent<AcceptEventAction> {
	/**
	 * Returns the value of the '<em><b>Event Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Provider</em>' containment reference.
	 * @see #setEventProvider(EventProvider)
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage#getAcceptEventActionAcceptEvent_EventProvider()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventProvider getEventProvider();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent#getEventProvider <em>Event Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Provider</em>' containment reference.
	 * @see #getEventProvider()
	 * @generated
	 */
	void setEventProvider(EventProvider value);

} // AcceptEventActionAcceptEvent
