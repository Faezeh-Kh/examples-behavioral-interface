/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action Incoming Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getOpaqueActionIncomingProperty()
 * @model
 * @generated
 */
public interface OpaqueActionIncomingProperty extends OpaqueActionProperty<OpaqueAction>, SingleReferenceProperty<ActivityEdgeProperty<ActivityEdge>, OpaqueAction> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTION__INCOMING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // OpaqueActionIncomingProperty
