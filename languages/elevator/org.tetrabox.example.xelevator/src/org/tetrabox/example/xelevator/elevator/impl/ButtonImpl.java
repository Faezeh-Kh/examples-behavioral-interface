/**
 */
package org.tetrabox.example.xelevator.elevator.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.ElevatorPackage;
import org.tetrabox.example.xelevator.elevator.Floor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ButtonImpl#getRequestedFloor <em>Requested Floor</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.elevator.impl.ButtonImpl#isPressed <em>Pressed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ButtonImpl extends EObjectImpl implements Button {
	/**
	 * The cached value of the '{@link #getRequestedFloor() <em>Requested Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedFloor()
	 * @generated
	 * @ordered
	 */
	protected Floor requestedFloor;

	/**
	 * The default value of the '{@link #isPressed() <em>Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPressed() <em>Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPressed()
	 * @generated
	 * @ordered
	 */
	protected boolean pressed = PRESSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElevatorPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getRequestedFloor() {
		if (requestedFloor != null && requestedFloor.eIsProxy()) {
			InternalEObject oldRequestedFloor = (InternalEObject)requestedFloor;
			requestedFloor = (Floor)eResolveProxy(oldRequestedFloor);
			if (requestedFloor != oldRequestedFloor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElevatorPackage.BUTTON__REQUESTED_FLOOR, oldRequestedFloor, requestedFloor));
			}
		}
		return requestedFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetRequestedFloor() {
		return requestedFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedFloor(Floor newRequestedFloor) {
		Floor oldRequestedFloor = requestedFloor;
		requestedFloor = newRequestedFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElevatorPackage.BUTTON__REQUESTED_FLOOR, oldRequestedFloor, requestedFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPressed() {
		return pressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressed(boolean newPressed) {
		boolean oldPressed = pressed;
		pressed = newPressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElevatorPackage.BUTTON__PRESSED, oldPressed, pressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void press() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean notPressed() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElevatorPackage.BUTTON__REQUESTED_FLOOR:
				if (resolve) return getRequestedFloor();
				return basicGetRequestedFloor();
			case ElevatorPackage.BUTTON__PRESSED:
				return isPressed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ElevatorPackage.BUTTON__REQUESTED_FLOOR:
				setRequestedFloor((Floor)newValue);
				return;
			case ElevatorPackage.BUTTON__PRESSED:
				setPressed((Boolean)newValue);
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
			case ElevatorPackage.BUTTON__REQUESTED_FLOOR:
				setRequestedFloor((Floor)null);
				return;
			case ElevatorPackage.BUTTON__PRESSED:
				setPressed(PRESSED_EDEFAULT);
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
			case ElevatorPackage.BUTTON__REQUESTED_FLOOR:
				return requestedFloor != null;
			case ElevatorPackage.BUTTON__PRESSED:
				return pressed != PRESSED_EDEFAULT;
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
		result.append(" (pressed: ");
		result.append(pressed);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
