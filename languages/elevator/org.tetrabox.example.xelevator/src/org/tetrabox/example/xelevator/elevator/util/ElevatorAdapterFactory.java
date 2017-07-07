/**
 */
package org.tetrabox.example.xelevator.elevator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.xelevator.elevator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.elevator.ElevatorPackage
 * @generated
 */
public class ElevatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ElevatorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ElevatorPackage.eINSTANCE;
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
	protected ElevatorSwitch<Adapter> modelSwitch =
		new ElevatorSwitch<Adapter>() {
			@Override
			public Adapter caseFloor(Floor object) {
				return createFloorAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseElevator(Elevator object) {
				return createElevatorAdapter();
			}
			@Override
			public Adapter caseElevatorButton(ElevatorButton object) {
				return createElevatorButtonAdapter();
			}
			@Override
			public Adapter caseFloorButton(FloorButton object) {
				return createFloorButtonAdapter();
			}
			@Override
			public Adapter caseUpButton(UpButton object) {
				return createUpButtonAdapter();
			}
			@Override
			public Adapter caseDownButton(DownButton object) {
				return createDownButtonAdapter();
			}
			@Override
			public Adapter caseElevatorSystem(ElevatorSystem object) {
				return createElevatorSystemAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.Elevator
	 * @generated
	 */
	public Adapter createElevatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.ElevatorButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorButton
	 * @generated
	 */
	public Adapter createElevatorButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.FloorButton <em>Floor Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.FloorButton
	 * @generated
	 */
	public Adapter createFloorButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.UpButton <em>Up Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.UpButton
	 * @generated
	 */
	public Adapter createUpButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.DownButton <em>Down Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.DownButton
	 * @generated
	 */
	public Adapter createDownButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.elevator.ElevatorSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.elevator.ElevatorSystem
	 * @generated
	 */
	public Adapter createElevatorSystemAdapter() {
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

} //ElevatorAdapterFactory
