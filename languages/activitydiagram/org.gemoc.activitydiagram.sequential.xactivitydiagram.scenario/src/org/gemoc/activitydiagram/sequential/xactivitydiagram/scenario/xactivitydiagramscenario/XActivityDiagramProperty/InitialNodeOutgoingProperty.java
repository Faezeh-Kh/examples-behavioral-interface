/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Node Outgoing Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getInitialNodeOutgoingProperty()
 * @model
 * @generated
 */
public interface InitialNodeOutgoingProperty extends InitialNodeProperty<InitialNode>, SingleReferenceProperty<ActivityEdgeProperty<ActivityEdge>, InitialNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.INITIAL_NODE__OUTGOING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // InitialNodeOutgoingProperty
