/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Activity Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getEventActivityContainerProperty()
 * @model
 * @generated
 */
public interface EventActivityContainerProperty extends EventProperty<Event>, ContainerReferenceProperty<ActivityProperty<Activity>, Event> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // EventActivityContainerProperty
