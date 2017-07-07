/**
 */
package org.tetrabox.example.xelevator.elevator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.DownButton;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.ElevatorFactory;
import org.tetrabox.example.xelevator.elevator.ElevatorPackage;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.FloorButton;
import org.tetrabox.example.xelevator.elevator.UpButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElevatorPackageImpl extends EPackageImpl implements ElevatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorSystemEClass = null;

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
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElevatorPackageImpl() {
		super(eNS_URI, ElevatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElevatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElevatorPackage init() {
		if (isInited) return (ElevatorPackage)EPackage.Registry.INSTANCE.getEPackage(ElevatorPackage.eNS_URI);

		// Obtain or create and register package
		ElevatorPackageImpl theElevatorPackage = (ElevatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElevatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElevatorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theElevatorPackage.createPackageContents();

		// Initialize created meta-data
		theElevatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElevatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElevatorPackage.eNS_URI, theElevatorPackage);
		return theElevatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Next() {
		return (EReference)floorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_Nr() {
		return (EAttribute)floorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_FloorButtons() {
		return (EReference)floorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Previous() {
		return (EReference)floorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_RequestedFloor() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Pressed() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevator() {
		return elevatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElevator_ElevatorButtons() {
		return (EReference)elevatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElevator_DoorsOpen() {
		return (EAttribute)elevatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElevator_GoingUp() {
		return (EAttribute)elevatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElevator_CurrentFloor() {
		return (EReference)elevatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorButton() {
		return elevatorButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorButton() {
		return floorButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpButton() {
		return upButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownButton() {
		return downButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorSystem() {
		return elevatorSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElevatorSystem_Elevators() {
		return (EReference)elevatorSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElevatorSystem_Floors() {
		return (EReference)elevatorSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorFactory getElevatorFactory() {
		return (ElevatorFactory)getEFactoryInstance();
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
		floorEClass = createEClass(FLOOR);
		createEReference(floorEClass, FLOOR__NEXT);
		createEAttribute(floorEClass, FLOOR__NR);
		createEReference(floorEClass, FLOOR__FLOOR_BUTTONS);
		createEReference(floorEClass, FLOOR__PREVIOUS);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__REQUESTED_FLOOR);
		createEAttribute(buttonEClass, BUTTON__PRESSED);

		elevatorEClass = createEClass(ELEVATOR);
		createEReference(elevatorEClass, ELEVATOR__ELEVATOR_BUTTONS);
		createEAttribute(elevatorEClass, ELEVATOR__DOORS_OPEN);
		createEAttribute(elevatorEClass, ELEVATOR__GOING_UP);
		createEReference(elevatorEClass, ELEVATOR__CURRENT_FLOOR);

		elevatorButtonEClass = createEClass(ELEVATOR_BUTTON);

		floorButtonEClass = createEClass(FLOOR_BUTTON);

		upButtonEClass = createEClass(UP_BUTTON);

		downButtonEClass = createEClass(DOWN_BUTTON);

		elevatorSystemEClass = createEClass(ELEVATOR_SYSTEM);
		createEReference(elevatorSystemEClass, ELEVATOR_SYSTEM__ELEVATORS);
		createEReference(elevatorSystemEClass, ELEVATOR_SYSTEM__FLOORS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elevatorButtonEClass.getESuperTypes().add(this.getButton());
		floorButtonEClass.getESuperTypes().add(this.getButton());
		upButtonEClass.getESuperTypes().add(this.getFloorButton());
		downButtonEClass.getESuperTypes().add(this.getFloorButton());

		// Initialize classes and features; add operations and parameters
		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloor_Next(), this.getFloor(), this.getFloor_Previous(), "next", null, 0, 1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_Nr(), ecorePackage.getEInt(), "nr", null, 0, 1, Floor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFloor_FloorButtons(), this.getButton(), null, "floorButtons", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloor_Previous(), this.getFloor(), this.getFloor_Next(), "previous", null, 0, 1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(floorEClass, ecorePackage.getEBoolean(), "hasUpperFloorLitButton", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(floorEClass, ecorePackage.getEBoolean(), "hasLowerFloorLitButton", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_RequestedFloor(), this.getFloor(), null, "requestedFloor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Pressed(), ecorePackage.getEBoolean(), "pressed", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(buttonEClass, null, "press", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(buttonEClass, ecorePackage.getEBoolean(), "notPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorEClass, Elevator.class, "Elevator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElevator_ElevatorButtons(), this.getElevatorButton(), null, "elevatorButtons", null, 0, -1, Elevator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElevator_DoorsOpen(), ecorePackage.getEBoolean(), "doorsOpen", null, 0, 1, Elevator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElevator_GoingUp(), ecorePackage.getEBoolean(), "goingUp", null, 0, 1, Elevator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElevator_CurrentFloor(), this.getFloor(), null, "currentFloor", null, 0, 1, Elevator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(elevatorEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "openDoorUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "openDoorDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "closeDoor", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "changeToDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "changeToUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "moveUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elevatorEClass, null, "moveDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elevatorButtonEClass, ElevatorButton.class, "ElevatorButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floorButtonEClass, FloorButton.class, "FloorButton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upButtonEClass, UpButton.class, "UpButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(downButtonEClass, DownButton.class, "DownButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorSystemEClass, ElevatorSystem.class, "ElevatorSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElevatorSystem_Elevators(), this.getElevator(), null, "elevators", null, 0, -1, ElevatorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElevatorSystem_Floors(), this.getFloor(), null, "floors", null, 0, -1, ElevatorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (floorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (floorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (buttonEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (buttonEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getButton_Pressed(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elevatorEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElevator_DoorsOpen(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElevator_GoingUp(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElevator_CurrentFloor(), 
		   source, 
		   new String[] {
		   });
	}

} //ElevatorPackageImpl
