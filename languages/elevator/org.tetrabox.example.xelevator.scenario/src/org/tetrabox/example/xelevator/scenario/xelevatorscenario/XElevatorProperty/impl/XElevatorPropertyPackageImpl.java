/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.xelevator.elevator.ElevatorPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl.XElevatorArbiterPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryDownButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryUpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonContainerProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressedProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonRequestedFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonPressedProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonRequestedFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonPressedProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonRequestedFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToDownProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCloseDoorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorContainerProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCurrentFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorDoorsOpenProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorElevatorButtonsProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorGoingUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveDownProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemElevatorsProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemFloorsProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonPressedProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonRequestedFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorContainerProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorFloorButtonsProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNextProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNrProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorPreviousProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryDownButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorSystemProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonPressedProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonRequestedFloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStepProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorPropertyPackageImpl extends EPackageImpl implements XElevatorPropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorOpenDoorUpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorCloseDoorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorMoveUpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorChangeToUpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorOpenDoorDownPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorMoveDownPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorChangeToDownPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPressPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorAbstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorTemporalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorStatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorStepPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorNextPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorNrPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonRequestedFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPressedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorFloorButtonsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorPreviousPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryElevatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryElevatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorButtonContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryElevatorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryElevatorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorButtonRequestedFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorButtonPressedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorElevatorButtonsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorDoorsOpenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorGoingUpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorCurrentFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFloorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFloorButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorButtonRequestedFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorButtonPressedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryUpButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryUpButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upButtonRequestedFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upButtonPressedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDownButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDownButtonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downButtonRequestedFloorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downButtonPressedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorSystemPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryElevatorSystemPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryElevatorSystemPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorSystemElevatorsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorSystemFloorsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorNextPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorUntilPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorReleasePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorNegationTemporalPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XElevatorPropertyPackageImpl() {
		super(eNS_URI, XElevatorPropertyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XElevatorPropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XElevatorPropertyPackage init() {
		if (isInited) return (XElevatorPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI);

		// Obtain or create and register package
		XElevatorPropertyPackageImpl theXElevatorPropertyPackage = (XElevatorPropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XElevatorPropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XElevatorPropertyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ElevatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XElevatorArbiterPackageImpl theXElevatorArbiterPackage = (XElevatorArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) instanceof XElevatorArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) : XElevatorArbiterPackage.eINSTANCE);
		XElevatorEventPackageImpl theXElevatorEventPackage = (XElevatorEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) instanceof XElevatorEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) : XElevatorEventPackage.eINSTANCE);
		XElevatorProviderPackageImpl theXElevatorProviderPackage = (XElevatorProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) instanceof XElevatorProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) : XElevatorProviderPackage.eINSTANCE);
		XElevatorScenarioPackageImpl theXElevatorScenarioPackage = (XElevatorScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) instanceof XElevatorScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) : XElevatorScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXElevatorPropertyPackage.createPackageContents();
		theXElevatorArbiterPackage.createPackageContents();
		theXElevatorEventPackage.createPackageContents();
		theXElevatorProviderPackage.createPackageContents();
		theXElevatorScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXElevatorPropertyPackage.initializePackageContents();
		theXElevatorArbiterPackage.initializePackageContents();
		theXElevatorEventPackage.initializePackageContents();
		theXElevatorProviderPackage.initializePackageContents();
		theXElevatorScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXElevatorPropertyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XElevatorPropertyPackage.eNS_URI, theXElevatorPropertyPackage);
		return theXElevatorPropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorOpenDoorUpProperty() {
		return elevatorOpenDoorUpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorCloseDoorProperty() {
		return elevatorCloseDoorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorMoveUpProperty() {
		return elevatorMoveUpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorChangeToUpProperty() {
		return elevatorChangeToUpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorOpenDoorDownProperty() {
		return elevatorOpenDoorDownPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorMoveDownProperty() {
		return elevatorMoveDownPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorChangeToDownProperty() {
		return elevatorChangeToDownPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonPressProperty() {
		return buttonPressPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorAbstractProperty() {
		return xElevatorAbstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorTemporalProperty() {
		return xElevatorTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorProperty() {
		return xElevatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorStateProperty() {
		return xElevatorStatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorStepProperty() {
		return xElevatorStepPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorProperty() {
		return floorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFloorProperty() {
		return unaryFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFloorProperty() {
		return binaryFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorNextProperty() {
		return floorNextPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorNrProperty() {
		return floorNrPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonContainerProperty() {
		return buttonContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonProperty() {
		return buttonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryButtonProperty() {
		return unaryButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryButtonProperty() {
		return binaryButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonRequestedFloorProperty() {
		return buttonRequestedFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonPressedProperty() {
		return buttonPressedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorFloorButtonsProperty() {
		return floorFloorButtonsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorPreviousProperty() {
		return floorPreviousPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorProperty() {
		return elevatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryElevatorProperty() {
		return unaryElevatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryElevatorProperty() {
		return binaryElevatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorButtonContainerProperty() {
		return elevatorButtonContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorButtonProperty() {
		return elevatorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryElevatorButtonProperty() {
		return unaryElevatorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryElevatorButtonProperty() {
		return binaryElevatorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorButtonRequestedFloorProperty() {
		return elevatorButtonRequestedFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorButtonPressedProperty() {
		return elevatorButtonPressedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorElevatorButtonsProperty() {
		return elevatorElevatorButtonsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorDoorsOpenProperty() {
		return elevatorDoorsOpenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorGoingUpProperty() {
		return elevatorGoingUpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorCurrentFloorProperty() {
		return elevatorCurrentFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorButtonProperty() {
		return floorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFloorButtonProperty() {
		return unaryFloorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFloorButtonProperty() {
		return binaryFloorButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorButtonRequestedFloorProperty() {
		return floorButtonRequestedFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorButtonPressedProperty() {
		return floorButtonPressedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpButtonProperty() {
		return upButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryUpButtonProperty() {
		return unaryUpButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryUpButtonProperty() {
		return binaryUpButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpButtonRequestedFloorProperty() {
		return upButtonRequestedFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpButtonPressedProperty() {
		return upButtonPressedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownButtonProperty() {
		return downButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryDownButtonProperty() {
		return unaryDownButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDownButtonProperty() {
		return binaryDownButtonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownButtonRequestedFloorProperty() {
		return downButtonRequestedFloorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownButtonPressedProperty() {
		return downButtonPressedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorSystemProperty() {
		return elevatorSystemPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryElevatorSystemProperty() {
		return unaryElevatorSystemPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryElevatorSystemProperty() {
		return binaryElevatorSystemPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorContainerProperty() {
		return elevatorContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorSystemElevatorsProperty() {
		return elevatorSystemElevatorsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorContainerProperty() {
		return floorContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorSystemFloorsProperty() {
		return elevatorSystemFloorsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorNextProperty() {
		return xElevatorNextPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorUntilProperty() {
		return xElevatorUntilPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorReleaseProperty() {
		return xElevatorReleasePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorNegationTemporalProperty() {
		return xElevatorNegationTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorPropertyFactory getXElevatorPropertyFactory() {
		return (XElevatorPropertyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elevatorOpenDoorUpPropertyEClass = createEClass(ELEVATOR_OPEN_DOOR_UP_PROPERTY);

		elevatorCloseDoorPropertyEClass = createEClass(ELEVATOR_CLOSE_DOOR_PROPERTY);

		elevatorMoveUpPropertyEClass = createEClass(ELEVATOR_MOVE_UP_PROPERTY);

		elevatorChangeToUpPropertyEClass = createEClass(ELEVATOR_CHANGE_TO_UP_PROPERTY);

		elevatorOpenDoorDownPropertyEClass = createEClass(ELEVATOR_OPEN_DOOR_DOWN_PROPERTY);

		elevatorMoveDownPropertyEClass = createEClass(ELEVATOR_MOVE_DOWN_PROPERTY);

		elevatorChangeToDownPropertyEClass = createEClass(ELEVATOR_CHANGE_TO_DOWN_PROPERTY);

		buttonPressPropertyEClass = createEClass(BUTTON_PRESS_PROPERTY);

		xElevatorAbstractPropertyEClass = createEClass(XELEVATOR_ABSTRACT_PROPERTY);

		xElevatorTemporalPropertyEClass = createEClass(XELEVATOR_TEMPORAL_PROPERTY);

		xElevatorPropertyEClass = createEClass(XELEVATOR_PROPERTY);

		xElevatorStatePropertyEClass = createEClass(XELEVATOR_STATE_PROPERTY);

		xElevatorStepPropertyEClass = createEClass(XELEVATOR_STEP_PROPERTY);

		floorPropertyEClass = createEClass(FLOOR_PROPERTY);

		unaryFloorPropertyEClass = createEClass(UNARY_FLOOR_PROPERTY);

		binaryFloorPropertyEClass = createEClass(BINARY_FLOOR_PROPERTY);

		floorNextPropertyEClass = createEClass(FLOOR_NEXT_PROPERTY);

		floorNrPropertyEClass = createEClass(FLOOR_NR_PROPERTY);

		buttonContainerPropertyEClass = createEClass(BUTTON_CONTAINER_PROPERTY);

		buttonPropertyEClass = createEClass(BUTTON_PROPERTY);

		unaryButtonPropertyEClass = createEClass(UNARY_BUTTON_PROPERTY);

		binaryButtonPropertyEClass = createEClass(BINARY_BUTTON_PROPERTY);

		buttonRequestedFloorPropertyEClass = createEClass(BUTTON_REQUESTED_FLOOR_PROPERTY);

		buttonPressedPropertyEClass = createEClass(BUTTON_PRESSED_PROPERTY);

		floorFloorButtonsPropertyEClass = createEClass(FLOOR_FLOOR_BUTTONS_PROPERTY);

		floorPreviousPropertyEClass = createEClass(FLOOR_PREVIOUS_PROPERTY);

		elevatorPropertyEClass = createEClass(ELEVATOR_PROPERTY);

		unaryElevatorPropertyEClass = createEClass(UNARY_ELEVATOR_PROPERTY);

		binaryElevatorPropertyEClass = createEClass(BINARY_ELEVATOR_PROPERTY);

		elevatorButtonContainerPropertyEClass = createEClass(ELEVATOR_BUTTON_CONTAINER_PROPERTY);

		elevatorButtonPropertyEClass = createEClass(ELEVATOR_BUTTON_PROPERTY);

		unaryElevatorButtonPropertyEClass = createEClass(UNARY_ELEVATOR_BUTTON_PROPERTY);

		binaryElevatorButtonPropertyEClass = createEClass(BINARY_ELEVATOR_BUTTON_PROPERTY);

		elevatorButtonRequestedFloorPropertyEClass = createEClass(ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY);

		elevatorButtonPressedPropertyEClass = createEClass(ELEVATOR_BUTTON_PRESSED_PROPERTY);

		elevatorElevatorButtonsPropertyEClass = createEClass(ELEVATOR_ELEVATOR_BUTTONS_PROPERTY);

		elevatorDoorsOpenPropertyEClass = createEClass(ELEVATOR_DOORS_OPEN_PROPERTY);

		elevatorGoingUpPropertyEClass = createEClass(ELEVATOR_GOING_UP_PROPERTY);

		elevatorCurrentFloorPropertyEClass = createEClass(ELEVATOR_CURRENT_FLOOR_PROPERTY);

		floorButtonPropertyEClass = createEClass(FLOOR_BUTTON_PROPERTY);

		unaryFloorButtonPropertyEClass = createEClass(UNARY_FLOOR_BUTTON_PROPERTY);

		binaryFloorButtonPropertyEClass = createEClass(BINARY_FLOOR_BUTTON_PROPERTY);

		floorButtonRequestedFloorPropertyEClass = createEClass(FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY);

		floorButtonPressedPropertyEClass = createEClass(FLOOR_BUTTON_PRESSED_PROPERTY);

		upButtonPropertyEClass = createEClass(UP_BUTTON_PROPERTY);

		unaryUpButtonPropertyEClass = createEClass(UNARY_UP_BUTTON_PROPERTY);

		binaryUpButtonPropertyEClass = createEClass(BINARY_UP_BUTTON_PROPERTY);

		upButtonRequestedFloorPropertyEClass = createEClass(UP_BUTTON_REQUESTED_FLOOR_PROPERTY);

		upButtonPressedPropertyEClass = createEClass(UP_BUTTON_PRESSED_PROPERTY);

		downButtonPropertyEClass = createEClass(DOWN_BUTTON_PROPERTY);

		unaryDownButtonPropertyEClass = createEClass(UNARY_DOWN_BUTTON_PROPERTY);

		binaryDownButtonPropertyEClass = createEClass(BINARY_DOWN_BUTTON_PROPERTY);

		downButtonRequestedFloorPropertyEClass = createEClass(DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY);

		downButtonPressedPropertyEClass = createEClass(DOWN_BUTTON_PRESSED_PROPERTY);

		elevatorSystemPropertyEClass = createEClass(ELEVATOR_SYSTEM_PROPERTY);

		unaryElevatorSystemPropertyEClass = createEClass(UNARY_ELEVATOR_SYSTEM_PROPERTY);

		binaryElevatorSystemPropertyEClass = createEClass(BINARY_ELEVATOR_SYSTEM_PROPERTY);

		elevatorContainerPropertyEClass = createEClass(ELEVATOR_CONTAINER_PROPERTY);

		elevatorSystemElevatorsPropertyEClass = createEClass(ELEVATOR_SYSTEM_ELEVATORS_PROPERTY);

		floorContainerPropertyEClass = createEClass(FLOOR_CONTAINER_PROPERTY);

		elevatorSystemFloorsPropertyEClass = createEClass(ELEVATOR_SYSTEM_FLOORS_PROPERTY);

		xElevatorNextPropertyEClass = createEClass(XELEVATOR_NEXT_PROPERTY);

		xElevatorUntilPropertyEClass = createEClass(XELEVATOR_UNTIL_PROPERTY);

		xElevatorReleasePropertyEClass = createEClass(XELEVATOR_RELEASE_PROPERTY);

		xElevatorNegationTemporalPropertyEClass = createEClass(XELEVATOR_NEGATION_TEMPORAL_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ElevatorPackage theElevatorPackage = (ElevatorPackage)EPackage.Registry.INSTANCE.getEPackage(ElevatorPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters
		ETypeParameter xElevatorStatePropertyEClass_T = addETypeParameter(xElevatorStatePropertyEClass, "T");
		ETypeParameter xElevatorStepPropertyEClass_T = addETypeParameter(xElevatorStepPropertyEClass, "T");
		ETypeParameter floorPropertyEClass_T = addETypeParameter(floorPropertyEClass, "T");
		ETypeParameter buttonPropertyEClass_T = addETypeParameter(buttonPropertyEClass, "T");
		ETypeParameter elevatorPropertyEClass_T = addETypeParameter(elevatorPropertyEClass, "T");
		ETypeParameter elevatorButtonPropertyEClass_T = addETypeParameter(elevatorButtonPropertyEClass, "T");
		ETypeParameter floorButtonPropertyEClass_T = addETypeParameter(floorButtonPropertyEClass, "T");
		ETypeParameter upButtonPropertyEClass_T = addETypeParameter(upButtonPropertyEClass, "T");
		ETypeParameter downButtonPropertyEClass_T = addETypeParameter(downButtonPropertyEClass, "T");
		ETypeParameter elevatorSystemPropertyEClass_T = addETypeParameter(elevatorSystemPropertyEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theElevatorPackage.getFloor());
		floorPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getButton());
		buttonPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getElevator());
		elevatorPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getElevatorButton());
		elevatorButtonPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getFloorButton());
		floorButtonPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getUpButton());
		upButtonPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getDownButton());
		downButtonPropertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theElevatorPackage.getElevatorSystem());
		elevatorSystemPropertyEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getXElevatorStepProperty());
		EGenericType g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorOpenDoorUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorCloseDoorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorMoveUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorChangeToUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorOpenDoorDownPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorMoveDownPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorChangeToDownPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStepProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonPressPropertyEClass.getEGenericSuperTypes().add(g1);
		xElevatorAbstractPropertyEClass.getESuperTypes().add(thePropertyPackage.getAbstractProperty());
		xElevatorTemporalPropertyEClass.getESuperTypes().add(thePropertyPackage.getTemporalProperty());
		xElevatorTemporalPropertyEClass.getESuperTypes().add(this.getXElevatorAbstractProperty());
		xElevatorPropertyEClass.getESuperTypes().add(thePropertyPackage.getProperty());
		xElevatorPropertyEClass.getESuperTypes().add(this.getXElevatorAbstractProperty());
		g1 = createEGenericType(thePropertyPackage.getStateProperty());
		g2 = createEGenericType(xElevatorStatePropertyEClass_T);
		g1.getETypeArguments().add(g2);
		xElevatorStatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorProperty());
		xElevatorStatePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getStepProperty());
		g2 = createEGenericType(xElevatorStepPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		xElevatorStepPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorProperty());
		xElevatorStepPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStateProperty());
		g2 = createEGenericType(floorPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		floorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		unaryFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		unaryFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		binaryFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		binaryFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorNrPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getIntegerAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorNrPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStateProperty());
		g2 = createEGenericType(buttonPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		buttonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		unaryButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		unaryButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		binaryButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		binaryButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorFloorButtonsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorFloorButtonsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorPreviousPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorPreviousPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStateProperty());
		g2 = createEGenericType(elevatorPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		elevatorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		unaryElevatorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getElevatorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevator());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		unaryElevatorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		binaryElevatorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getElevatorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevator());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		binaryElevatorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getElevatorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevator());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(elevatorButtonPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		elevatorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		unaryElevatorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getElevatorButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		unaryElevatorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		binaryElevatorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getElevatorButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		binaryElevatorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorButton());
		g1.getETypeArguments().add(g2);
		elevatorButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorElevatorButtonsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getElevatorButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorElevatorButtonsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorDoorsOpenPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorDoorsOpenPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorGoingUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorGoingUpPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorCurrentFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorCurrentFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProperty());
		g2 = createEGenericType(floorButtonPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		floorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		unaryFloorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getFloorButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloorButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		unaryFloorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		binaryFloorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getFloorButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloorButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		binaryFloorButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		floorButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		floorButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		floorButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getFloorButton());
		g1.getETypeArguments().add(g2);
		floorButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(upButtonPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		upButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUpButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		unaryUpButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getUpButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getUpButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		unaryUpButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUpButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		binaryUpButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getUpButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getUpButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		binaryUpButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUpButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		upButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		upButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUpButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		upButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getUpButton());
		g1.getETypeArguments().add(g2);
		upButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorButtonProperty());
		g2 = createEGenericType(downButtonPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		downButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDownButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		unaryDownButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getDownButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getDownButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		unaryDownButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDownButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		binaryDownButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getDownButtonProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getDownButton());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		binaryDownButtonPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDownButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		downButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getSingleReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		downButtonRequestedFloorPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDownButtonProperty());
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		downButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBooleanAttributeProperty());
		g2 = createEGenericType(theElevatorPackage.getDownButton());
		g1.getETypeArguments().add(g2);
		downButtonPressedPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorStateProperty());
		g2 = createEGenericType(elevatorSystemPropertyEClass_T);
		g1.getETypeArguments().add(g2);
		elevatorSystemPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorSystemProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		unaryElevatorSystemPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUnaryProperty());
		g2 = createEGenericType(this.getElevatorSystemProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		unaryElevatorSystemPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorSystemProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		binaryElevatorSystemPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getBinaryProperty());
		g2 = createEGenericType(this.getElevatorSystemProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		binaryElevatorSystemPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProperty());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getElevatorSystemProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorSystemProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		elevatorSystemElevatorsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getElevatorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevator());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		elevatorSystemElevatorsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFloorProperty());
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getContainerReferenceProperty());
		g2 = createEGenericType(this.getElevatorSystemProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getFloor());
		g1.getETypeArguments().add(g2);
		floorContainerPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorSystemProperty());
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		elevatorSystemFloorsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getManyReferenceProperty());
		g2 = createEGenericType(this.getFloorProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getFloor());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theElevatorPackage.getElevatorSystem());
		g1.getETypeArguments().add(g2);
		elevatorSystemFloorsPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getNextProperty());
		g2 = createEGenericType(this.getXElevatorAbstractProperty());
		g1.getETypeArguments().add(g2);
		xElevatorNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorTemporalProperty());
		xElevatorNextPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getUntilProperty());
		g2 = createEGenericType(this.getXElevatorAbstractProperty());
		g1.getETypeArguments().add(g2);
		xElevatorUntilPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorTemporalProperty());
		xElevatorUntilPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getReleaseProperty());
		g2 = createEGenericType(this.getXElevatorAbstractProperty());
		g1.getETypeArguments().add(g2);
		xElevatorReleasePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorTemporalProperty());
		xElevatorReleasePropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePropertyPackage.getNegationTemporalProperty());
		g2 = createEGenericType(this.getXElevatorTemporalProperty());
		g1.getETypeArguments().add(g2);
		xElevatorNegationTemporalPropertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorTemporalProperty());
		xElevatorNegationTemporalPropertyEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(elevatorOpenDoorUpPropertyEClass, ElevatorOpenDoorUpProperty.class, "ElevatorOpenDoorUpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorOpenDoorUpPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorCloseDoorPropertyEClass, ElevatorCloseDoorProperty.class, "ElevatorCloseDoorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorCloseDoorPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorMoveUpPropertyEClass, ElevatorMoveUpProperty.class, "ElevatorMoveUpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorMoveUpPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorChangeToUpPropertyEClass, ElevatorChangeToUpProperty.class, "ElevatorChangeToUpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorChangeToUpPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorOpenDoorDownPropertyEClass, ElevatorOpenDoorDownProperty.class, "ElevatorOpenDoorDownProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorOpenDoorDownPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorMoveDownPropertyEClass, ElevatorMoveDownProperty.class, "ElevatorMoveDownProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorMoveDownPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorChangeToDownPropertyEClass, ElevatorChangeToDownProperty.class, "ElevatorChangeToDownProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorChangeToDownPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonPressPropertyEClass, ButtonPressProperty.class, "ButtonPressProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(buttonPressPropertyEClass, ecorePackage.getEOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xElevatorAbstractPropertyEClass, XElevatorAbstractProperty.class, "XElevatorAbstractProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorTemporalPropertyEClass, XElevatorTemporalProperty.class, "XElevatorTemporalProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorPropertyEClass, XElevatorProperty.class, "XElevatorProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorStatePropertyEClass, XElevatorStateProperty.class, "XElevatorStateProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorStepPropertyEClass, XElevatorStepProperty.class, "XElevatorStepProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floorPropertyEClass, FloorProperty.class, "FloorProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryFloorPropertyEClass, UnaryFloorProperty.class, "UnaryFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryFloorPropertyEClass, BinaryFloorProperty.class, "BinaryFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floorNextPropertyEClass, FloorNextProperty.class, "FloorNextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorNextPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorNrPropertyEClass, FloorNrProperty.class, "FloorNrProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorNrPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonContainerPropertyEClass, ButtonContainerProperty.class, "ButtonContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(buttonContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonPropertyEClass, ButtonProperty.class, "ButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryButtonPropertyEClass, UnaryButtonProperty.class, "UnaryButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryButtonPropertyEClass, BinaryButtonProperty.class, "BinaryButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonRequestedFloorPropertyEClass, ButtonRequestedFloorProperty.class, "ButtonRequestedFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(buttonRequestedFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonPressedPropertyEClass, ButtonPressedProperty.class, "ButtonPressedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(buttonPressedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorFloorButtonsPropertyEClass, FloorFloorButtonsProperty.class, "FloorFloorButtonsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorFloorButtonsPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorPreviousPropertyEClass, FloorPreviousProperty.class, "FloorPreviousProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorPreviousPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorPropertyEClass, ElevatorProperty.class, "ElevatorProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryElevatorPropertyEClass, UnaryElevatorProperty.class, "UnaryElevatorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryElevatorPropertyEClass, BinaryElevatorProperty.class, "BinaryElevatorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorButtonContainerPropertyEClass, ElevatorButtonContainerProperty.class, "ElevatorButtonContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorButtonContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorButtonPropertyEClass, ElevatorButtonProperty.class, "ElevatorButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryElevatorButtonPropertyEClass, UnaryElevatorButtonProperty.class, "UnaryElevatorButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryElevatorButtonPropertyEClass, BinaryElevatorButtonProperty.class, "BinaryElevatorButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorButtonRequestedFloorPropertyEClass, ElevatorButtonRequestedFloorProperty.class, "ElevatorButtonRequestedFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorButtonRequestedFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorButtonPressedPropertyEClass, ElevatorButtonPressedProperty.class, "ElevatorButtonPressedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorButtonPressedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorElevatorButtonsPropertyEClass, ElevatorElevatorButtonsProperty.class, "ElevatorElevatorButtonsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorElevatorButtonsPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorDoorsOpenPropertyEClass, ElevatorDoorsOpenProperty.class, "ElevatorDoorsOpenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorDoorsOpenPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorGoingUpPropertyEClass, ElevatorGoingUpProperty.class, "ElevatorGoingUpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorGoingUpPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorCurrentFloorPropertyEClass, ElevatorCurrentFloorProperty.class, "ElevatorCurrentFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorCurrentFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorButtonPropertyEClass, FloorButtonProperty.class, "FloorButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryFloorButtonPropertyEClass, UnaryFloorButtonProperty.class, "UnaryFloorButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryFloorButtonPropertyEClass, BinaryFloorButtonProperty.class, "BinaryFloorButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floorButtonRequestedFloorPropertyEClass, FloorButtonRequestedFloorProperty.class, "FloorButtonRequestedFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorButtonRequestedFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorButtonPressedPropertyEClass, FloorButtonPressedProperty.class, "FloorButtonPressedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorButtonPressedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(upButtonPropertyEClass, UpButtonProperty.class, "UpButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryUpButtonPropertyEClass, UnaryUpButtonProperty.class, "UnaryUpButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryUpButtonPropertyEClass, BinaryUpButtonProperty.class, "BinaryUpButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upButtonRequestedFloorPropertyEClass, UpButtonRequestedFloorProperty.class, "UpButtonRequestedFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(upButtonRequestedFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(upButtonPressedPropertyEClass, UpButtonPressedProperty.class, "UpButtonPressedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(upButtonPressedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(downButtonPropertyEClass, DownButtonProperty.class, "DownButtonProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryDownButtonPropertyEClass, UnaryDownButtonProperty.class, "UnaryDownButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryDownButtonPropertyEClass, BinaryDownButtonProperty.class, "BinaryDownButtonProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(downButtonRequestedFloorPropertyEClass, DownButtonRequestedFloorProperty.class, "DownButtonRequestedFloorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(downButtonRequestedFloorPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(downButtonPressedPropertyEClass, DownButtonPressedProperty.class, "DownButtonPressedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(downButtonPressedPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorSystemPropertyEClass, ElevatorSystemProperty.class, "ElevatorSystemProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryElevatorSystemPropertyEClass, UnaryElevatorSystemProperty.class, "UnaryElevatorSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryElevatorSystemPropertyEClass, BinaryElevatorSystemProperty.class, "BinaryElevatorSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorContainerPropertyEClass, ElevatorContainerProperty.class, "ElevatorContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorSystemElevatorsPropertyEClass, ElevatorSystemElevatorsProperty.class, "ElevatorSystemElevatorsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorSystemElevatorsPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floorContainerPropertyEClass, FloorContainerProperty.class, "FloorContainerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(floorContainerPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorSystemFloorsPropertyEClass, ElevatorSystemFloorsProperty.class, "ElevatorSystemFloorsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(elevatorSystemFloorsPropertyEClass, ecorePackage.getEStructuralFeature(), "getFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xElevatorNextPropertyEClass, XElevatorNextProperty.class, "XElevatorNextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorUntilPropertyEClass, XElevatorUntilProperty.class, "XElevatorUntilProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorReleasePropertyEClass, XElevatorReleaseProperty.class, "XElevatorReleaseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorNegationTemporalPropertyEClass, XElevatorNegationTemporalProperty.class, "XElevatorNegationTemporalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XElevatorPropertyPackageImpl
