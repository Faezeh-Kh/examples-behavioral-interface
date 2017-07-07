/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node Incoming Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getDecisionNodeIncomingProperty()
 * @model
 * @generated
 */
public interface DecisionNodeIncomingProperty extends DecisionNodeProperty<DecisionNode>, SingleReferenceProperty<ActivityEdgeProperty<ActivityEdge>, DecisionNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.DECISION_NODE__INCOMING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // DecisionNodeIncomingProperty
