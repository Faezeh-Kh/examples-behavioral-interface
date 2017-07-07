/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.property.provider.NextPropertyItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.provider.XElevatorscenarioEditPlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorNextPropertyItemProvider extends NextPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorNextPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XElevatorNextProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XElevatorNextProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XElevatorNextProperty_type");
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
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCloseDoorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEXT_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNegationTemporalProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XElevatorscenarioEditPlugin.INSTANCE;
	}

}
