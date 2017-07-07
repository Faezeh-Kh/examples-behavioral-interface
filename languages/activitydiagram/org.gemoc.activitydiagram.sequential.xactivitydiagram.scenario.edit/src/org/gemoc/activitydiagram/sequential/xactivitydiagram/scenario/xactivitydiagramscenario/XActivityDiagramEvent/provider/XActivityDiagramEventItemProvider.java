/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.provider;


import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.provider.EventItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.provider.XActivityDiagramscenarioEditPlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderFactory;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramEventItemProvider extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramEventItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XActivityDiagramEvent_type");
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
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createAcceptEventActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createAcceptEventActionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createEventReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createEventQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createMergeNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createMergeNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createIntegerVariableAssignmentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createIntegerVariableAssignmentQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createFinalNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createFinalNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createFlowFinalNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createFlowFinalNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createDecisionNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createDecisionNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createVariableAssignmentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createVariableAssignmentQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createBooleanVariableAssignmentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createBooleanVariableAssignmentQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createOpaqueActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createOpaqueActionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityFinalNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createActivityFinalNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createVariableQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createInitialNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createInitialNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createJoinNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createJoinNodeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createForkNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER,
				 XActivityDiagramProviderFactory.eINSTANCE.createForkNodeQuery()));
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
