/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyFactory;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlTokenActivityFinalNodeContainerPropertyItemProvider extends ControlTokenPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenActivityFinalNodeContainerPropertyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ControlTokenActivityFinalNodeContainerProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlTokenActivityFinalNodeContainerProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ControlTokenActivityFinalNodeContainerProperty_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ControlTokenActivityFinalNodeContainerProperty.class)) {
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY__PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 PropertyFactory.eINSTANCE.createContainerReferenceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 PropertyFactory.eINSTANCE.createManyBooleanAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 PropertyFactory.eINSTANCE.createManyIntegerAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 PropertyFactory.eINSTANCE.createManyStringAttributeProperty()));
	}

}
