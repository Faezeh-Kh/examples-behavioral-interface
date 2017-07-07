/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Token Initial Node Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlTokenInitialNodeContainerProperty()
 * @model
 * @generated
 */
public interface ControlTokenInitialNodeContainerProperty extends ControlTokenProperty<ControlToken>, ContainerReferenceProperty<ActivityNodeProperty<ActivityNode>, ControlToken> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlTokenInitialNodeContainerProperty
