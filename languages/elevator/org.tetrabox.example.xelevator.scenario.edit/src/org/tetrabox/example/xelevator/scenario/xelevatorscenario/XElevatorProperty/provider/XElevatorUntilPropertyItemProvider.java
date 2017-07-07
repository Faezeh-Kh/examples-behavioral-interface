/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.property.provider.UntilPropertyItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.provider.XElevatorscenarioEditPlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorUntilPropertyItemProvider extends UntilPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorUntilPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XElevatorUntilProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XElevatorUntilProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XElevatorUntilProperty_type");
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
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCloseDoorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__LEFT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNegationTemporalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCloseDoorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.UNTIL_PROPERTY__RIGHT_FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNegationTemporalProperty()));
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
		return XElevatorscenarioEditPlugin.INSTANCE;
	}

}
