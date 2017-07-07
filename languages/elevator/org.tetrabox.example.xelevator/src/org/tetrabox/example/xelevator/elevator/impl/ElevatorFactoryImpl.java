/**
 */
package org.tetrabox.example.xelevator.elevator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.elevator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElevatorFactoryImpl extends EFactoryImpl implements ElevatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElevatorFactory init() {
		try {
			ElevatorFactory theElevatorFactory = (ElevatorFactory)EPackage.Registry.INSTANCE.getEFactory(ElevatorPackage.eNS_URI);
			if (theElevatorFactory != null) {
				return theElevatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElevatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ElevatorPackage.FLOOR: return createFloor();
			case ElevatorPackage.ELEVATOR: return createElevator();
			case ElevatorPackage.ELEVATOR_BUTTON: return createElevatorButton();
			case ElevatorPackage.UP_BUTTON: return createUpButton();
			case ElevatorPackage.DOWN_BUTTON: return createDownButton();
			case ElevatorPackage.ELEVATOR_SYSTEM: return createElevatorSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elevator createElevator() {
		ElevatorImpl elevator = new ElevatorImpl();
		return elevator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorButton createElevatorButton() {
		ElevatorButtonImpl elevatorButton = new ElevatorButtonImpl();
		return elevatorButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpButton createUpButton() {
		UpButtonImpl upButton = new UpButtonImpl();
		return upButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownButton createDownButton() {
		DownButtonImpl downButton = new DownButtonImpl();
		return downButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorSystem createElevatorSystem() {
		ElevatorSystemImpl elevatorSystem = new ElevatorSystemImpl();
		return elevatorSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorPackage getElevatorPackage() {
		return (ElevatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElevatorPackage getPackage() {
		return ElevatorPackage.eINSTANCE;
	}

} //ElevatorFactoryImpl
