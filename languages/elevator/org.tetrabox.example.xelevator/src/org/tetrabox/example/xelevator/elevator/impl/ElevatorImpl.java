/**
 */
package org.tetrabox.example.xelevator.elevator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.ElevatorPackage;
import org.tetrabox.example.xelevator.elevator.Floor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ElevatorImpl#getElevatorButtons <em>Elevator Buttons</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ElevatorImpl#isDoorsOpen <em>Doors Open</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ElevatorImpl#isGoingUp <em>Going Up</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ElevatorImpl#getCurrentFloor <em>Current Floor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElevatorImpl extends EObjectImpl implements Elevator {
	/**
	 * The cached value of the '{@link #getElevatorButtons() <em>Elevator Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevatorButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<ElevatorButton> elevatorButtons;

	/**
	 * The default value of the '{@link #isDoorsOpen() <em>Doors Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoorsOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOORS_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoorsOpen() <em>Doors Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoorsOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean doorsOpen = DOORS_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isGoingUp() <em>Going Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoingUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GOING_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGoingUp() <em>Going Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoingUp()
	 * @generated
	 * @ordered
	 */
	protected boolean goingUp = GOING_UP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentFloor() <em>Current Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFloor()
	 * @generated
	 * @ordered
	 */
	protected Floor currentFloor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElevatorPackage.Literals.ELEVATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElevatorButton> getElevatorButtons() {
		if (elevatorButtons == null) {
			elevatorButtons = new EObjectContainmentEList<ElevatorButton>(ElevatorButton.class, this, ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS);
		}
		return elevatorButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoorsOpen() {
		return doorsOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorsOpen(boolean newDoorsOpen) {
		boolean oldDoorsOpen = doorsOpen;
		doorsOpen = newDoorsOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElevatorPackage.ELEVATOR__DOORS_OPEN, oldDoorsOpen, doorsOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGoingUp() {
		return goingUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoingUp(boolean newGoingUp) {
		boolean oldGoingUp = goingUp;
		goingUp = newGoingUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElevatorPackage.ELEVATOR__GOING_UP, oldGoingUp, goingUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getCurrentFloor() {
		if (currentFloor != null && currentFloor.eIsProxy()) {
			InternalEObject oldCurrentFloor = (InternalEObject)currentFloor;
			currentFloor = (Floor)eResolveProxy(oldCurrentFloor);
			if (currentFloor != oldCurrentFloor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElevatorPackage.ELEVATOR__CURRENT_FLOOR, oldCurrentFloor, currentFloor));
			}
		}
		return currentFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetCurrentFloor() {
		return currentFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentFloor(Floor newCurrentFloor) {
		Floor oldCurrentFloor = currentFloor;
		currentFloor = newCurrentFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElevatorPackage.ELEVATOR__CURRENT_FLOOR, oldCurrentFloor, currentFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openDoorUp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openDoorDown() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeDoor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeToDown() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeToUp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveUp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveDown() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
				return ((InternalEList<?>)getElevatorButtons()).basicRemove(otherEnd, msgs);
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
			case ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
				return getElevatorButtons();
			case ElevatorPackage.ELEVATOR__DOORS_OPEN:
				return isDoorsOpen();
			case ElevatorPackage.ELEVATOR__GOING_UP:
				return isGoingUp();
			case ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
				if (resolve) return getCurrentFloor();
				return basicGetCurrentFloor();
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
			case ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
				getElevatorButtons().clear();
				getElevatorButtons().addAll((Collection<? extends ElevatorButton>)newValue);
				return;
			case ElevatorPackage.ELEVATOR__DOORS_OPEN:
				setDoorsOpen((Boolean)newValue);
				return;
			case ElevatorPackage.ELEVATOR__GOING_UP:
				setGoingUp((Boolean)newValue);
				return;
			case ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
				setCurrentFloor((Floor)newValue);
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
			case ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
				getElevatorButtons().clear();
				return;
			case ElevatorPackage.ELEVATOR__DOORS_OPEN:
				setDoorsOpen(DOORS_OPEN_EDEFAULT);
				return;
			case ElevatorPackage.ELEVATOR__GOING_UP:
				setGoingUp(GOING_UP_EDEFAULT);
				return;
			case ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
				setCurrentFloor((Floor)null);
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
			case ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
				return elevatorButtons != null && !elevatorButtons.isEmpty();
			case ElevatorPackage.ELEVATOR__DOORS_OPEN:
				return doorsOpen != DOORS_OPEN_EDEFAULT;
			case ElevatorPackage.ELEVATOR__GOING_UP:
				return goingUp != GOING_UP_EDEFAULT;
			case ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
				return currentFloor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (doorsOpen: ");
		result.append(doorsOpen);
		result.append(", goingUp: ");
		result.append(goingUp);
		result.append(')');
		return result.toString();
	}

} //ElevatorImpl
