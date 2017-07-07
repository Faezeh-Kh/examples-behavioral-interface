/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Target Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlFlowTargetProperty()
 * @model
 * @generated
 */
public interface ControlFlowTargetProperty extends ControlFlowProperty<ControlFlow>, SingleReferenceProperty<ActivityNodeProperty<ActivityNode>, ControlFlow> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_EDGE__TARGET;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlFlowTargetProperty
