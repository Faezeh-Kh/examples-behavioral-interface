/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node Outgoing Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getJoinNodeOutgoingProperty()
 * @model
 * @generated
 */
public interface JoinNodeOutgoingProperty extends JoinNodeProperty<JoinNode>, SingleReferenceProperty<ActivityEdgeProperty<ActivityEdge>, JoinNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.JOIN_NODE__OUTGOING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // JoinNodeOutgoingProperty
