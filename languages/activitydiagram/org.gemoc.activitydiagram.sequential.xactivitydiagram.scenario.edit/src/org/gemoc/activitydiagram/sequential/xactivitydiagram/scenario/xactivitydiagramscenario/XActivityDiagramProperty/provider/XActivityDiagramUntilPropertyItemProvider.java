/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.property.provider.UntilPropertyItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.provider.XActivityDiagramscenarioEditPlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramUntilPropertyItemProvider extends UntilPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramUntilPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XActivityDiagramUntilProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XActivityDiagramUntilProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XActivityDiagramUntilProperty_type");
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
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRemoveTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionAcceptProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeAddTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeTerminateProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionWaitForEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableInitProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramNegationTemporalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRemoveTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionAcceptProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeAddTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeTerminateProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionWaitForEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableInitProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XActivityDiagramPropertyFactory.eINSTANCE.createXActivityDiagramNegationTemporalProperty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA ||
			childFeature == PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XActivityDiagramscenarioEditPlugin.INSTANCE;
	}

}
