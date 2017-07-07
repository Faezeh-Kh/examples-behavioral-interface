/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.util;

import fr.inria.diverse.event.commons.model.property.AbstractProperty;
import fr.inria.diverse.event.commons.model.property.BinaryProperty;
import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;
import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;
import fr.inria.diverse.event.commons.model.property.NegationTemporalProperty;
import fr.inria.diverse.event.commons.model.property.NextProperty;
import fr.inria.diverse.event.commons.model.property.Property;
import fr.inria.diverse.event.commons.model.property.ReleaseProperty;
import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;
import fr.inria.diverse.event.commons.model.property.StateProperty;
import fr.inria.diverse.event.commons.model.property.StepProperty;
import fr.inria.diverse.event.commons.model.property.TemporalProperty;
import fr.inria.diverse.event.commons.model.property.UnaryProperty;
import fr.inria.diverse.event.commons.model.property.UntilProperty;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.DownButton;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.FloorButton;
import org.tetrabox.example.xelevator.elevator.UpButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage
 * @generated
 */
public class XElevatorPropertyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorPropertyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorPropertyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XElevatorPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorPropertySwitch<Adapter> modelSwitch =
		new XElevatorPropertySwitch<Adapter>() {
			@Override
			public Adapter caseElevatorOpenDoorUpProperty(ElevatorOpenDoorUpProperty object) {
				return createElevatorOpenDoorUpPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorCloseDoorProperty(ElevatorCloseDoorProperty object) {
				return createElevatorCloseDoorPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorMoveUpProperty(ElevatorMoveUpProperty object) {
				return createElevatorMoveUpPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorChangeToUpProperty(ElevatorChangeToUpProperty object) {
				return createElevatorChangeToUpPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorOpenDoorDownProperty(ElevatorOpenDoorDownProperty object) {
				return createElevatorOpenDoorDownPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorMoveDownProperty(ElevatorMoveDownProperty object) {
				return createElevatorMoveDownPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorChangeToDownProperty(ElevatorChangeToDownProperty object) {
				return createElevatorChangeToDownPropertyAdapter();
			}
			@Override
			public Adapter caseButtonPressProperty(ButtonPressProperty object) {
				return createButtonPressPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorAbstractProperty(XElevatorAbstractProperty object) {
				return createXElevatorAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorTemporalProperty(XElevatorTemporalProperty object) {
				return createXElevatorTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorProperty(XElevatorProperty object) {
				return createXElevatorPropertyAdapter();
			}
			@Override
			public <T> Adapter caseXElevatorStateProperty(XElevatorStateProperty<T> object) {
				return createXElevatorStatePropertyAdapter();
			}
			@Override
			public <T> Adapter caseXElevatorStepProperty(XElevatorStepProperty<T> object) {
				return createXElevatorStepPropertyAdapter();
			}
			@Override
			public <T extends Floor> Adapter caseFloorProperty(FloorProperty<T> object) {
				return createFloorPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryFloorProperty(UnaryFloorProperty object) {
				return createUnaryFloorPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryFloorProperty(BinaryFloorProperty object) {
				return createBinaryFloorPropertyAdapter();
			}
			@Override
			public Adapter caseFloorNextProperty(FloorNextProperty object) {
				return createFloorNextPropertyAdapter();
			}
			@Override
			public Adapter caseFloorNrProperty(FloorNrProperty object) {
				return createFloorNrPropertyAdapter();
			}
			@Override
			public Adapter caseButtonContainerProperty(ButtonContainerProperty object) {
				return createButtonContainerPropertyAdapter();
			}
			@Override
			public <T extends Button> Adapter caseButtonProperty(ButtonProperty<T> object) {
				return createButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryButtonProperty(UnaryButtonProperty object) {
				return createUnaryButtonPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryButtonProperty(BinaryButtonProperty object) {
				return createBinaryButtonPropertyAdapter();
			}
			@Override
			public Adapter caseButtonRequestedFloorProperty(ButtonRequestedFloorProperty object) {
				return createButtonRequestedFloorPropertyAdapter();
			}
			@Override
			public Adapter caseButtonPressedProperty(ButtonPressedProperty object) {
				return createButtonPressedPropertyAdapter();
			}
			@Override
			public Adapter caseFloorFloorButtonsProperty(FloorFloorButtonsProperty object) {
				return createFloorFloorButtonsPropertyAdapter();
			}
			@Override
			public Adapter caseFloorPreviousProperty(FloorPreviousProperty object) {
				return createFloorPreviousPropertyAdapter();
			}
			@Override
			public <T extends Elevator> Adapter caseElevatorProperty(ElevatorProperty<T> object) {
				return createElevatorPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryElevatorProperty(UnaryElevatorProperty object) {
				return createUnaryElevatorPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryElevatorProperty(BinaryElevatorProperty object) {
				return createBinaryElevatorPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorButtonContainerProperty(ElevatorButtonContainerProperty object) {
				return createElevatorButtonContainerPropertyAdapter();
			}
			@Override
			public <T extends ElevatorButton> Adapter caseElevatorButtonProperty(ElevatorButtonProperty<T> object) {
				return createElevatorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryElevatorButtonProperty(UnaryElevatorButtonProperty object) {
				return createUnaryElevatorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryElevatorButtonProperty(BinaryElevatorButtonProperty object) {
				return createBinaryElevatorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorButtonRequestedFloorProperty(ElevatorButtonRequestedFloorProperty object) {
				return createElevatorButtonRequestedFloorPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorButtonPressedProperty(ElevatorButtonPressedProperty object) {
				return createElevatorButtonPressedPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorElevatorButtonsProperty(ElevatorElevatorButtonsProperty object) {
				return createElevatorElevatorButtonsPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorDoorsOpenProperty(ElevatorDoorsOpenProperty object) {
				return createElevatorDoorsOpenPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorGoingUpProperty(ElevatorGoingUpProperty object) {
				return createElevatorGoingUpPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorCurrentFloorProperty(ElevatorCurrentFloorProperty object) {
				return createElevatorCurrentFloorPropertyAdapter();
			}
			@Override
			public <T extends FloorButton> Adapter caseFloorButtonProperty(FloorButtonProperty<T> object) {
				return createFloorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryFloorButtonProperty(UnaryFloorButtonProperty object) {
				return createUnaryFloorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryFloorButtonProperty(BinaryFloorButtonProperty object) {
				return createBinaryFloorButtonPropertyAdapter();
			}
			@Override
			public Adapter caseFloorButtonRequestedFloorProperty(FloorButtonRequestedFloorProperty object) {
				return createFloorButtonRequestedFloorPropertyAdapter();
			}
			@Override
			public Adapter caseFloorButtonPressedProperty(FloorButtonPressedProperty object) {
				return createFloorButtonPressedPropertyAdapter();
			}
			@Override
			public <T extends UpButton> Adapter caseUpButtonProperty(UpButtonProperty<T> object) {
				return createUpButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryUpButtonProperty(UnaryUpButtonProperty object) {
				return createUnaryUpButtonPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryUpButtonProperty(BinaryUpButtonProperty object) {
				return createBinaryUpButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUpButtonRequestedFloorProperty(UpButtonRequestedFloorProperty object) {
				return createUpButtonRequestedFloorPropertyAdapter();
			}
			@Override
			public Adapter caseUpButtonPressedProperty(UpButtonPressedProperty object) {
				return createUpButtonPressedPropertyAdapter();
			}
			@Override
			public <T extends DownButton> Adapter caseDownButtonProperty(DownButtonProperty<T> object) {
				return createDownButtonPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryDownButtonProperty(UnaryDownButtonProperty object) {
				return createUnaryDownButtonPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryDownButtonProperty(BinaryDownButtonProperty object) {
				return createBinaryDownButtonPropertyAdapter();
			}
			@Override
			public Adapter caseDownButtonRequestedFloorProperty(DownButtonRequestedFloorProperty object) {
				return createDownButtonRequestedFloorPropertyAdapter();
			}
			@Override
			public Adapter caseDownButtonPressedProperty(DownButtonPressedProperty object) {
				return createDownButtonPressedPropertyAdapter();
			}
			@Override
			public <T extends ElevatorSystem> Adapter caseElevatorSystemProperty(ElevatorSystemProperty<T> object) {
				return createElevatorSystemPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryElevatorSystemProperty(UnaryElevatorSystemProperty object) {
				return createUnaryElevatorSystemPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryElevatorSystemProperty(BinaryElevatorSystemProperty object) {
				return createBinaryElevatorSystemPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorContainerProperty(ElevatorContainerProperty object) {
				return createElevatorContainerPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorSystemElevatorsProperty(ElevatorSystemElevatorsProperty object) {
				return createElevatorSystemElevatorsPropertyAdapter();
			}
			@Override
			public Adapter caseFloorContainerProperty(FloorContainerProperty object) {
				return createFloorContainerPropertyAdapter();
			}
			@Override
			public Adapter caseElevatorSystemFloorsProperty(ElevatorSystemFloorsProperty object) {
				return createElevatorSystemFloorsPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorNextProperty(XElevatorNextProperty object) {
				return createXElevatorNextPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorUntilProperty(XElevatorUntilProperty object) {
				return createXElevatorUntilPropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorReleaseProperty(XElevatorReleaseProperty object) {
				return createXElevatorReleasePropertyAdapter();
			}
			@Override
			public Adapter caseXElevatorNegationTemporalProperty(XElevatorNegationTemporalProperty object) {
				return createXElevatorNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseAbstractProperty(AbstractProperty object) {
				return createAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStepProperty(StepProperty<T> object) {
				return createStepPropertyAdapter();
			}
			@Override
			public Adapter caseTemporalProperty(TemporalProperty object) {
				return createTemporalPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStateProperty(StateProperty<T> object) {
				return createStatePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseUnaryProperty(UnaryProperty<P, T> object) {
				return createUnaryPropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseBinaryProperty(BinaryProperty<P, T> object) {
				return createBinaryPropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
				return createSingleReferencePropertyAdapter();
			}
			@Override
			public <T> Adapter caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
				return createIntegerAttributePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
				return createContainerReferencePropertyAdapter();
			}
			@Override
			public <T> Adapter caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
				return createBooleanAttributePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
				return createManyReferencePropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseNextProperty(NextProperty<P> object) {
				return createNextPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseUntilProperty(UntilProperty<P> object) {
				return createUntilPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseReleaseProperty(ReleaseProperty<P> object) {
				return createReleasePropertyAdapter();
			}
			@Override
			public <P extends TemporalProperty> Adapter caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
				return createNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty <em>Elevator Open Door Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty
	 * @generated
	 */
	public Adapter createElevatorOpenDoorUpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCloseDoorProperty <em>Elevator Close Door Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCloseDoorProperty
	 * @generated
	 */
	public Adapter createElevatorCloseDoorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty <em>Elevator Move Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty
	 * @generated
	 */
	public Adapter createElevatorMoveUpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToUpProperty <em>Elevator Change To Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToUpProperty
	 * @generated
	 */
	public Adapter createElevatorChangeToUpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty <em>Elevator Open Door Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty
	 * @generated
	 */
	public Adapter createElevatorOpenDoorDownPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveDownProperty <em>Elevator Move Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveDownProperty
	 * @generated
	 */
	public Adapter createElevatorMoveDownPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToDownProperty <em>Elevator Change To Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToDownProperty
	 * @generated
	 */
	public Adapter createElevatorChangeToDownPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty <em>Button Press Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty
	 * @generated
	 */
	public Adapter createButtonPressPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty <em>XElevator Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty
	 * @generated
	 */
	public Adapter createXElevatorAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty <em>XElevator Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty
	 * @generated
	 */
	public Adapter createXElevatorTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty <em>XElevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty
	 * @generated
	 */
	public Adapter createXElevatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty <em>XElevator State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty
	 * @generated
	 */
	public Adapter createXElevatorStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStepProperty <em>XElevator Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStepProperty
	 * @generated
	 */
	public Adapter createXElevatorStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty <em>Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty
	 * @generated
	 */
	public Adapter createFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorProperty <em>Unary Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorProperty
	 * @generated
	 */
	public Adapter createUnaryFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorProperty <em>Binary Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorProperty
	 * @generated
	 */
	public Adapter createBinaryFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNextProperty <em>Floor Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNextProperty
	 * @generated
	 */
	public Adapter createFloorNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNrProperty <em>Floor Nr Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNrProperty
	 * @generated
	 */
	public Adapter createFloorNrPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonContainerProperty <em>Button Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonContainerProperty
	 * @generated
	 */
	public Adapter createButtonContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty
	 * @generated
	 */
	public Adapter createButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryButtonProperty <em>Unary Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryButtonProperty
	 * @generated
	 */
	public Adapter createUnaryButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryButtonProperty <em>Binary Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryButtonProperty
	 * @generated
	 */
	public Adapter createBinaryButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonRequestedFloorProperty <em>Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonRequestedFloorProperty
	 * @generated
	 */
	public Adapter createButtonRequestedFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressedProperty <em>Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressedProperty
	 * @generated
	 */
	public Adapter createButtonPressedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorFloorButtonsProperty <em>Floor Floor Buttons Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorFloorButtonsProperty
	 * @generated
	 */
	public Adapter createFloorFloorButtonsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorPreviousProperty <em>Floor Previous Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorPreviousProperty
	 * @generated
	 */
	public Adapter createFloorPreviousPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorProperty <em>Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorProperty
	 * @generated
	 */
	public Adapter createElevatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorProperty <em>Unary Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorProperty
	 * @generated
	 */
	public Adapter createUnaryElevatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorProperty <em>Binary Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorProperty
	 * @generated
	 */
	public Adapter createBinaryElevatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty <em>Elevator Button Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty
	 * @generated
	 */
	public Adapter createElevatorButtonContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonProperty <em>Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonProperty
	 * @generated
	 */
	public Adapter createElevatorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorButtonProperty <em>Unary Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorButtonProperty
	 * @generated
	 */
	public Adapter createUnaryElevatorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorButtonProperty <em>Binary Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorButtonProperty
	 * @generated
	 */
	public Adapter createBinaryElevatorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonRequestedFloorProperty <em>Elevator Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonRequestedFloorProperty
	 * @generated
	 */
	public Adapter createElevatorButtonRequestedFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonPressedProperty <em>Elevator Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonPressedProperty
	 * @generated
	 */
	public Adapter createElevatorButtonPressedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorElevatorButtonsProperty <em>Elevator Elevator Buttons Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorElevatorButtonsProperty
	 * @generated
	 */
	public Adapter createElevatorElevatorButtonsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorDoorsOpenProperty <em>Elevator Doors Open Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorDoorsOpenProperty
	 * @generated
	 */
	public Adapter createElevatorDoorsOpenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorGoingUpProperty <em>Elevator Going Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorGoingUpProperty
	 * @generated
	 */
	public Adapter createElevatorGoingUpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCurrentFloorProperty <em>Elevator Current Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCurrentFloorProperty
	 * @generated
	 */
	public Adapter createElevatorCurrentFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty <em>Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty
	 * @generated
	 */
	public Adapter createFloorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorButtonProperty <em>Unary Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorButtonProperty
	 * @generated
	 */
	public Adapter createUnaryFloorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorButtonProperty <em>Binary Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorButtonProperty
	 * @generated
	 */
	public Adapter createBinaryFloorButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonRequestedFloorProperty <em>Floor Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonRequestedFloorProperty
	 * @generated
	 */
	public Adapter createFloorButtonRequestedFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonPressedProperty <em>Floor Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonPressedProperty
	 * @generated
	 */
	public Adapter createFloorButtonPressedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty <em>Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty
	 * @generated
	 */
	public Adapter createUpButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty <em>Unary Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty
	 * @generated
	 */
	public Adapter createUnaryUpButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryUpButtonProperty <em>Binary Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryUpButtonProperty
	 * @generated
	 */
	public Adapter createBinaryUpButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonRequestedFloorProperty <em>Up Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonRequestedFloorProperty
	 * @generated
	 */
	public Adapter createUpButtonRequestedFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonPressedProperty <em>Up Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonPressedProperty
	 * @generated
	 */
	public Adapter createUpButtonPressedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty <em>Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty
	 * @generated
	 */
	public Adapter createDownButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryDownButtonProperty <em>Unary Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryDownButtonProperty
	 * @generated
	 */
	public Adapter createUnaryDownButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryDownButtonProperty <em>Binary Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryDownButtonProperty
	 * @generated
	 */
	public Adapter createBinaryDownButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonRequestedFloorProperty <em>Down Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonRequestedFloorProperty
	 * @generated
	 */
	public Adapter createDownButtonRequestedFloorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonPressedProperty <em>Down Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonPressedProperty
	 * @generated
	 */
	public Adapter createDownButtonPressedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemProperty <em>Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemProperty
	 * @generated
	 */
	public Adapter createElevatorSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorSystemProperty <em>Unary Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorSystemProperty
	 * @generated
	 */
	public Adapter createUnaryElevatorSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty <em>Binary Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty
	 * @generated
	 */
	public Adapter createBinaryElevatorSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorContainerProperty <em>Elevator Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorContainerProperty
	 * @generated
	 */
	public Adapter createElevatorContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemElevatorsProperty <em>Elevator System Elevators Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemElevatorsProperty
	 * @generated
	 */
	public Adapter createElevatorSystemElevatorsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorContainerProperty <em>Floor Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorContainerProperty
	 * @generated
	 */
	public Adapter createFloorContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemFloorsProperty <em>Elevator System Floors Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemFloorsProperty
	 * @generated
	 */
	public Adapter createElevatorSystemFloorsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty <em>XElevator Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty
	 * @generated
	 */
	public Adapter createXElevatorNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty <em>XElevator Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty
	 * @generated
	 */
	public Adapter createXElevatorUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty <em>XElevator Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty
	 * @generated
	 */
	public Adapter createXElevatorReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty <em>XElevator Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty
	 * @generated
	 */
	public Adapter createXElevatorNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.AbstractProperty
	 * @generated
	 */
	public Adapter createAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StepProperty <em>Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StepProperty
	 * @generated
	 */
	public Adapter createStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.TemporalProperty <em>Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.TemporalProperty
	 * @generated
	 */
	public Adapter createTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StateProperty
	 * @generated
	 */
	public Adapter createStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UnaryProperty
	 * @generated
	 */
	public Adapter createUnaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BinaryProperty
	 * @generated
	 */
	public Adapter createBinaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.SingleReferenceProperty <em>Single Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.SingleReferenceProperty
	 * @generated
	 */
	public Adapter createSingleReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty <em>Integer Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty
	 * @generated
	 */
	public Adapter createIntegerAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty <em>Container Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty
	 * @generated
	 */
	public Adapter createContainerReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty <em>Boolean Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty
	 * @generated
	 */
	public Adapter createBooleanAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ManyReferenceProperty <em>Many Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ManyReferenceProperty
	 * @generated
	 */
	public Adapter createManyReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NextProperty <em>Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NextProperty
	 * @generated
	 */
	public Adapter createNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UntilProperty <em>Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UntilProperty
	 * @generated
	 */
	public Adapter createUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ReleaseProperty <em>Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ReleaseProperty
	 * @generated
	 */
	public Adapter createReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NegationTemporalProperty <em>Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NegationTemporalProperty
	 * @generated
	 */
	public Adapter createNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XElevatorPropertyAdapterFactory
