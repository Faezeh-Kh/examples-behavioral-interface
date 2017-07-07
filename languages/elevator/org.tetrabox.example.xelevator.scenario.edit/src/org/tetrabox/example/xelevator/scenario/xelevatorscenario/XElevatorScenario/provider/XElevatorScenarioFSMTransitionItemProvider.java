/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.provider;


import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.provider.ScenarioFSMTransitionItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.provider.XElevatorscenarioEditPlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition;

/**
 * This is the item provider adapter for a {@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorScenarioFSMTransitionItemProvider extends ScenarioFSMTransitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFSMTransitionItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XElevatorScenarioFSMTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XElevatorScenarioFSMTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XElevatorScenarioFSMTransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XElevatorScenarioFSMTransition_type") :
			getString("_UI_XElevatorScenarioFSMTransition_type") + " " + label;
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
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCloseDoorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorChangeToDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorMoveDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorOpenDoorDownProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNextProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorNrProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorFloorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorPreviousProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorElevatorButtonsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorDoorsOpenProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorGoingUpProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorCurrentFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryFloorButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryUpButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUpButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryDownButtonProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonRequestedFloorProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createDownButtonPressedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createUnaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createBinaryElevatorSystemProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemElevatorsProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createFloorContainerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION__GUARD,
				 XElevatorPropertyFactory.eINSTANCE.createElevatorSystemFloorsProperty()));
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
