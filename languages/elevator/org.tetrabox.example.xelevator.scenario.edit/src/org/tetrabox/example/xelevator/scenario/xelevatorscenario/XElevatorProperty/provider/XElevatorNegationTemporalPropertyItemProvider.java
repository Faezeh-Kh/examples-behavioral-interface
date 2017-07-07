/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.provider;


import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.property.provider.NegationTemporalPropertyItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.provider.XElevatorscenarioEditPlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorNegationTemporalPropertyItemProvider extends NegationTemporalPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorNegationTemporalPropertyItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XElevatorNegationTemporalProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XElevatorNegationTemporalProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XElevatorNegationTemporalProperty_type");
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
				(PropertyPackage.Literals.NEGATION_TEMPORAL_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEGATION_TEMPORAL_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorUntilProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEGATION_TEMPORAL_PROPERTY__FORMULA,
				 XElevatorPropertyFactory.eINSTANCE.createXElevatorReleaseProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertyPackage.Literals.NEGATION_TEMPORAL_PROPERTY__FORMULA,
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
