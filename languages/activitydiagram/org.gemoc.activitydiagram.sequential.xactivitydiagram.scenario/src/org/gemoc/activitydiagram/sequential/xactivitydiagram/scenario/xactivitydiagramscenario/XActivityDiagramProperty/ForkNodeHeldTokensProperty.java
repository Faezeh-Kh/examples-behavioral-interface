/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node Held Tokens Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getForkNodeHeldTokensProperty()
 * @model
 * @generated
 */
public interface ForkNodeHeldTokensProperty extends ForkNodeProperty<ForkNode>, ManyReferenceProperty<ControlTokenProperty<ControlToken>, ForkNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_NODE__HELD_TOKENS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ForkNodeHeldTokensProperty
