/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.provider;


import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.provider.ElementQueryItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.provider.XActivityDiagramscenarioEditPlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeQuery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityFinalNodeQueryItemProvider extends ElementQueryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeQueryItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ActivityFinalNodeQuery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityFinalNodeQuery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ActivityFinalNodeQuery_type");
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
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ELEMENT_QUERY__QUERY,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));
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
