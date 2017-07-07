/**
 */
package elevator.impl;

import elevator.Elevator;
import elevator.ElevatorSystem;
import elevator.Floor;
import elevator.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link elevator.impl.ElevatorSystemImpl#getElevators <em>Elevators</em>}</li>
 *   <li>{@link elevator.impl.ElevatorSystemImpl#getFloors <em>Floors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElevatorSystemImpl extends MinimalEObjectImpl.Container implements ElevatorSystem {
	/**
	 * The cached value of the '{@link #getElevators() <em>Elevators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevators()
	 * @generated
	 * @ordered
	 */
	protected EList<Elevator> elevators;

	/**
	 * The cached value of the '{@link #getFloors() <em>Floors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> floors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ELEVATOR_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elevator> getElevators() {
		if (elevators == null) {
			elevators = new EObjectContainmentEList<Elevator>(Elevator.class, this, ModelPackage.ELEVATOR_SYSTEM__ELEVATORS);
		}
		return elevators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Floor> getFloors() {
		if (floors == null) {
			floors = new EObjectContainmentEList<Floor>(Floor.class, this, ModelPackage.ELEVATOR_SYSTEM__FLOORS);
		}
		return floors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ELEVATOR_SYSTEM__ELEVATORS:
				return ((InternalEList<?>)getElevators()).basicRemove(otherEnd, msgs);
			case ModelPackage.ELEVATOR_SYSTEM__FLOORS:
				return ((InternalEList<?>)getFloors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ELEVATOR_SYSTEM__ELEVATORS:
				return getElevators();
			case ModelPackage.ELEVATOR_SYSTEM__FLOORS:
				return getFloors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ELEVATOR_SYSTEM__ELEVATORS:
				getElevators().clear();
				getElevators().addAll((Collection<? extends Elevator>)newValue);
				return;
			case ModelPackage.ELEVATOR_SYSTEM__FLOORS:
				getFloors().clear();
				getFloors().addAll((Collection<? extends Floor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ELEVATOR_SYSTEM__ELEVATORS:
				getElevators().clear();
				return;
			case ModelPackage.ELEVATOR_SYSTEM__FLOORS:
				getFloors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ELEVATOR_SYSTEM__ELEVATORS:
				return elevators != null && !elevators.isEmpty();
			case ModelPackage.ELEVATOR_SYSTEM__FLOORS:
				return floors != null && !floors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElevatorSystemImpl
