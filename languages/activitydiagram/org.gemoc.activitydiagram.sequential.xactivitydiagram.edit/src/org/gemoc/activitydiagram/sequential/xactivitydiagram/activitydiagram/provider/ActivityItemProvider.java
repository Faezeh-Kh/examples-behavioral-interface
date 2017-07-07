/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ActivitydiagramPackage.Literals.ACTIVITY__EVENTS);
			childrenFeatures.add(ActivitydiagramPackage.Literals.ACTIVITY__NODES);
			childrenFeatures.add(ActivitydiagramPackage.Literals.ACTIVITY__EDGES);
			childrenFeatures.add(ActivitydiagramPackage.Literals.ACTIVITY__LOCALS);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case ActivitydiagramPackage.ACTIVITY__EVENTS:
			case ActivitydiagramPackage.ACTIVITY__NODES:
			case ActivitydiagramPackage.ACTIVITY__EDGES:
			case ActivitydiagramPackage.ACTIVITY__LOCALS:
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
				(ActivitydiagramPackage.Literals.ACTIVITY__EVENTS,
				 ActivitydiagramFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__NODES,
				 ActivitydiagramFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__EDGES,
				 ActivitydiagramFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__LOCALS,
				 ActivitydiagramFactory.eINSTANCE.createIntegerVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitydiagramPackage.Literals.ACTIVITY__LOCALS,
				 ActivitydiagramFactory.eINSTANCE.createBooleanVariable()));
	}

}
