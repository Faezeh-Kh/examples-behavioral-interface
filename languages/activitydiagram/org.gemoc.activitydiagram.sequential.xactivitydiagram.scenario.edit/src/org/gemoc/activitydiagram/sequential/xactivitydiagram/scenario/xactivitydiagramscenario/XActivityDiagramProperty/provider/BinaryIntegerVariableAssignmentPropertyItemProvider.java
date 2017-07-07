/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.provider;


import fr.inria.diverse.event.commons.model.property.BooleanOperator;
import fr.inria.diverse.event.commons.model.property.PropertyFactory;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryIntegerVariableAssignmentPropertyItemProvider extends IntegerVariableAssignmentPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerVariableAssignmentPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryProperty_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryProperty_operator_feature", "_UI_BinaryProperty_type"),
				 PropertyPackage.Literals.BINARY_PROPERTY__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(PropertyPackage.Literals.BINARY_PROPERTY__LEFT);
			childrenFeatures.add(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT);
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
	 * This returns BinaryIntegerVariableAssignmentProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryIntegerVariableAssignmentProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BooleanOperator labelValue = ((BinaryIntegerVariableAssignmentProperty)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryIntegerVariableAssignmentProperty_type") :
			getString("_UI_BinaryIntegerVariableAssignmentProperty_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryIntegerVariableAssignmentProperty.class)) {
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__LEFT:
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__RIGHT:
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
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 PropertyFactory.eINSTANCE.createContainerReferenceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 PropertyFactory.eINSTANCE.createManyBooleanAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 PropertyFactory.eINSTANCE.createManyIntegerAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 PropertyFactory.eINSTANCE.createManyStringAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryNamedElementProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createNamedElementNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createEventNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEventsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlTokenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityEdgeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityEdgeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgeOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityEdgesProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableActivityContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityLocalsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlFlowProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowSourceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowTargetProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlFlowContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowOfferedTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlFlowGuardProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOpaqueActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createVariableAssignmentOpaqueActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createOpaqueActionAssignmentsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryAcceptEventActionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenAcceptEventActionContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionEventTypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createAcceptEventActionOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryControlNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenControlNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryInitialNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenInitialNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createInitialNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryDecisionNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenDecisionNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createDecisionNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryMergeNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenMergeNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createMergeNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryForkNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenForkNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createForkNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryJoinNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenJoinNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createJoinNodeOutgoingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryActivityFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenActivityFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createActivityFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryFlowFinalNodeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeActivityProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeRunningProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createControlTokenFlowFinalNodeContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeHeldTokensProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createFlowFinalNodeIncomingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableNameProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableInitialValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableCurrentValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerValueValueProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerComparisonExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerComparisonExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanUnaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperandProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanUnaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanBinaryExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand1Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperand2Property()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanBinaryExpressionOperatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryBooleanVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanExpressionBooleanVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBooleanVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryIntegerVariableAssignmentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentAssigneeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerExpressionIntegerVariableAssignmentContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createIntegerVariableAssignmentExpressionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createUnaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XActivityDiagramPropertyFactory.eINSTANCE.createBinaryOfferProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 PropertyFactory.eINSTANCE.createContainerReferenceProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 PropertyFactory.eINSTANCE.createManyBooleanAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 PropertyFactory.eINSTANCE.createManyIntegerAttributeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 PropertyFactory.eINSTANCE.createManyStringAttributeProperty()));
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
			childFeature == PropertyPackage.Literals.BINARY_PROPERTY__LEFT ||
			childFeature == PropertyPackage.Literals.BINARY_PROPERTY__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
