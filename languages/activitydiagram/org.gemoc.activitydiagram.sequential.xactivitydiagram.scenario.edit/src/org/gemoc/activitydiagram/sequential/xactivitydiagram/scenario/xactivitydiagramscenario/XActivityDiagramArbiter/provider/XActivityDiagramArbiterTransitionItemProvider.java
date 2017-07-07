/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.provider;


import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.provider.ArbiterTransitionItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramArbiterTransitionItemProvider extends ArbiterTransitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterTransitionItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XActivityDiagramArbiterTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XActivityDiagramArbiterTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XActivityDiagramArbiterTransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XActivityDiagramArbiterTransition_type") :
			getString("_UI_XActivityDiagramArbiterTransition_type") + " " + label;
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
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRemoveTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionAcceptProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeAddTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeTerminateProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionWaitForEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableInitProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeExecuteProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.ARBITER_TRANSITION__GUARD,
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
