/**
 */
package elevator.impl;

import elevator.Elevator;
import elevator.ElevatorButton;
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
 * An implementation of the model object '<em><b>Elevator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link elevator.impl.ElevatorImpl#getElevatorButtons <em>Elevator Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElevatorImpl extends MinimalEObjectImpl.Container implements Elevator {
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
		return ModelPackage.Literals.ELEVATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElevatorButton> getElevatorButtons() {
		if (elevatorButtons == null) {
			elevatorButtons = new EObjectContainmentEList<ElevatorButton>(ElevatorButton.class, this, ModelPackage.ELEVATOR__ELEVATOR_BUTTONS);
		}
		return elevatorButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ELEVATOR__ELEVATOR_BUTTONS:
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
			case ModelPackage.ELEVATOR__ELEVATOR_BUTTONS:
				return getElevatorButtons();
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
			case ModelPackage.ELEVATOR__ELEVATOR_BUTTONS:
				getElevatorButtons().clear();
				getElevatorButtons().addAll((Collection<? extends ElevatorButton>)newValue);
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
			case ModelPackage.ELEVATOR__ELEVATOR_BUTTONS:
				getElevatorButtons().clear();
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
			case ModelPackage.ELEVATOR__ELEVATOR_BUTTONS:
				return elevatorButtons != null && !elevatorButtons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElevatorImpl
