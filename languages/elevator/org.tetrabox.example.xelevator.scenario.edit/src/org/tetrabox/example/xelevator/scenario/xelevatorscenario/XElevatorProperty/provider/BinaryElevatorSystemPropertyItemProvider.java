/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.provider;


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

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryElevatorSystemPropertyItemProvider extends ElevatorSystemPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryElevatorSystemPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns BinaryElevatorSystemProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryElevatorSystemProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BooleanOperator labelValue = ((BinaryElevatorSystemProperty)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryElevatorSystemProperty_type") :
			getString("_UI_BinaryElevatorSystemProperty_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryElevatorSystemProperty.class)) {
			case XElevatorPropertyPackage.BINARY_ELEVATOR_SYSTEM_PROPERTY__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XElevatorPropertyPackage.BINARY_ELEVATOR_SYSTEM_PROPERTY__LEFT:
			case XElevatorPropertyPackage.BINARY_ELEVATOR_SYSTEM_PROPERTY__RIGHT:
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
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__LEFT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

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
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.BINARY_PROPERTY__RIGHT,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

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
