/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Token Control Flow Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlTokenControlFlowContainerProperty()
 * @model
 * @generated
 */
public interface ControlTokenControlFlowContainerProperty extends ControlTokenProperty<ControlToken>, ContainerReferenceProperty<ActivityEdgeProperty<ActivityEdge>, ControlToken> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlTokenControlFlowContainerProperty
