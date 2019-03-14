/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;

/**
 * This is the item provider adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider extends VertexItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
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

			addIsEntryCompletedPropertyDescriptor(object);
			addIsDoActivityCompletedPropertyDescriptor(object);
			addIsExitCompletedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Entry Completed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEntryCompletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isEntryCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isEntryCompleted_feature", "_UI_State_type"),
				 StatemachinesPackage.Literals.STATE__IS_ENTRY_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Do Activity Completed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDoActivityCompletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isDoActivityCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isDoActivityCompleted_feature", "_UI_State_type"),
				 StatemachinesPackage.Literals.STATE__IS_DO_ACTIVITY_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Exit Completed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExitCompletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_isExitCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_isExitCompleted_feature", "_UI_State_type"),
				 StatemachinesPackage.Literals.STATE__IS_EXIT_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__REGIONS);
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__ENTRY);
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__DO_ACTIVITY);
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__EXIT);
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__DEFERRABLE_TRIGGERS);
			childrenFeatures.add(StatemachinesPackage.Literals.STATE__CONNECTION_POINT);
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
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") :
			getString("_UI_State_type") + " " + label;
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

		switch (notification.getFeatureID(State.class)) {
			case StatemachinesPackage.STATE__IS_ENTRY_COMPLETED:
			case StatemachinesPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
			case StatemachinesPackage.STATE__IS_EXIT_COMPLETED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StatemachinesPackage.STATE__REGIONS:
			case StatemachinesPackage.STATE__ENTRY:
			case StatemachinesPackage.STATE__DO_ACTIVITY:
			case StatemachinesPackage.STATE__EXIT:
			case StatemachinesPackage.STATE__DEFERRABLE_TRIGGERS:
			case StatemachinesPackage.STATE__CONNECTION_POINT:
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
				(StatemachinesPackage.Literals.STATE__REGIONS,
				 StatemachinesFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__ENTRY,
				 StatemachinesFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__ENTRY,
				 StatemachinesFactory.eINSTANCE.createOperationBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__DO_ACTIVITY,
				 StatemachinesFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__DO_ACTIVITY,
				 StatemachinesFactory.eINSTANCE.createOperationBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__EXIT,
				 StatemachinesFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__EXIT,
				 StatemachinesFactory.eINSTANCE.createOperationBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__DEFERRABLE_TRIGGERS,
				 StatemachinesFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(StatemachinesPackage.Literals.STATE__CONNECTION_POINT,
				 StatemachinesFactory.eINSTANCE.createPseudostate()));
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
			childFeature == StatemachinesPackage.Literals.STATE__ENTRY ||
			childFeature == StatemachinesPackage.Literals.STATE__DO_ACTIVITY ||
			childFeature == StatemachinesPackage.Literals.STATE__EXIT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
