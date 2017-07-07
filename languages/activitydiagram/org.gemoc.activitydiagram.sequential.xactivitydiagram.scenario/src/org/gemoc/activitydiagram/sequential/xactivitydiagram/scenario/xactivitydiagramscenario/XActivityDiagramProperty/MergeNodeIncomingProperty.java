/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node Incoming Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getMergeNodeIncomingProperty()
 * @model
 * @generated
 */
public interface MergeNodeIncomingProperty extends MergeNodeProperty<MergeNode>, ManyReferenceProperty<ActivityEdgeProperty<ActivityEdge>, MergeNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.MERGE_NODE__INCOMING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // MergeNodeIncomingProperty
