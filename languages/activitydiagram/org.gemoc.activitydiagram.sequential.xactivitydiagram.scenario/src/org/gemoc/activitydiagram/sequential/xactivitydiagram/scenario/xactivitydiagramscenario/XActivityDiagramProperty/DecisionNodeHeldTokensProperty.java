/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node Held Tokens Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getDecisionNodeHeldTokensProperty()
 * @model
 * @generated
 */
public interface DecisionNodeHeldTokensProperty extends DecisionNodeProperty<DecisionNode>, ManyReferenceProperty<ControlTokenProperty<ControlToken>, DecisionNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_NODE__HELD_TOKENS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // DecisionNodeHeldTokensProperty
