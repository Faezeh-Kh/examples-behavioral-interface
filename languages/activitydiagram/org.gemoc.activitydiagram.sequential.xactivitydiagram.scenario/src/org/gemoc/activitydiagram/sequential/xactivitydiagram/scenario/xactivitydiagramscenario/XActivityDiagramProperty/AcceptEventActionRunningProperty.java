/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action Running Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getAcceptEventActionRunningProperty()
 * @model
 * @generated
 */
public interface AcceptEventActionRunningProperty extends AcceptEventActionProperty<AcceptEventAction>, BooleanAttributeProperty<AcceptEventAction> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_NODE__RUNNING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // AcceptEventActionRunningProperty
