/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Offered Tokens Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlFlowOfferedTokensProperty()
 * @model
 * @generated
 */
public interface ControlFlowOfferedTokensProperty extends ControlFlowProperty<ControlFlow>, ManyReferenceProperty<ControlTokenProperty<ControlToken>, ControlFlow> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_EDGE__OFFERED_TOKENS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlFlowOfferedTokensProperty
