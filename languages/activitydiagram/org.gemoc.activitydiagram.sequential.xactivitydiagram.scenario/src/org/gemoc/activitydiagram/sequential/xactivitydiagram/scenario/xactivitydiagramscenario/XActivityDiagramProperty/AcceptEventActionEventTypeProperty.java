/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action Event Type Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getAcceptEventActionEventTypeProperty()
 * @model
 * @generated
 */
public interface AcceptEventActionEventTypeProperty extends AcceptEventActionProperty<AcceptEventAction>, SingleReferenceProperty<EventProperty<Event>, AcceptEventAction> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACCEPT_EVENT_ACTION__EVENT_TYPE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // AcceptEventActionEventTypeProperty
