/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyFactory;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElevatorButtonContainerPropertyItemProvider extends ElevatorButtonPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorButtonContainerPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ElevatorButtonContainerProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElevatorButtonContainerProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ElevatorButtonContainerProperty_type");
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

		switch (notification.getFeatureID(ElevatorButtonContainerProperty.class)) {
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_CONTAINER_PROPERTY__PROPERTY:
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
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY__PROPERTY,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

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
