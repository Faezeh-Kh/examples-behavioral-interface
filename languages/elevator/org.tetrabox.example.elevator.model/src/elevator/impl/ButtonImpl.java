/**
 */
package elevator.impl;

import elevator.Button;
import elevator.Floor;
import elevator.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link elevator.impl.ButtonImpl#getRequestedFloor <em>Requested Floor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ButtonImpl extends MinimalEObjectImpl.Container implements Button {
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
		return ModelPackage.Literals.BUTTON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BUTTON__REQUESTED_FLOOR, oldRequestedFloor, requestedFloor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__REQUESTED_FLOOR, oldRequestedFloor, requestedFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BUTTON__REQUESTED_FLOOR:
				if (resolve) return getRequestedFloor();
				return basicGetRequestedFloor();
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
			case ModelPackage.BUTTON__REQUESTED_FLOOR:
				setRequestedFloor((Floor)newValue);
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
			case ModelPackage.BUTTON__REQUESTED_FLOOR:
				setRequestedFloor((Floor)null);
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
			case ModelPackage.BUTTON__REQUESTED_FLOOR:
				return requestedFloor != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonImpl
