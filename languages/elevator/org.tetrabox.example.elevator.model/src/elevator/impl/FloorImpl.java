/**
 */
package elevator.impl;

import elevator.Button;
import elevator.Floor;
import elevator.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link elevator.impl.FloorImpl#getNext <em>Next</em>}</li>
 *   <li>{@link elevator.impl.FloorImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link elevator.impl.FloorImpl#getFloorButtons <em>Floor Buttons</em>}</li>
 *   <li>{@link elevator.impl.FloorImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorImpl extends MinimalEObjectImpl.Container implements Floor {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Floor next;

	/**
	 * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloorButtons() <em>Floor Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> floorButtons;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Floor previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FLOOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Floor)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FLOOR__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Floor newNext, NotificationChain msgs) {
		Floor oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FLOOR__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Floor newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, ModelPackage.FLOOR__PREVIOUS, Floor.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ModelPackage.FLOOR__PREVIOUS, Floor.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FLOOR__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNr() {
		int i = 0;
		Floor previous = this.previous;
		while (previous != null) {
			previous = previous.getPrevious();
			i++;
		}
		return i; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getFloorButtons() {
		if (floorButtons == null) {
			floorButtons = new EObjectContainmentEList<Button>(Button.class, this, ModelPackage.FLOOR__FLOOR_BUTTONS);
		}
		return floorButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Floor)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FLOOR__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Floor newPrevious, NotificationChain msgs) {
		Floor oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FLOOR__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Floor newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, ModelPackage.FLOOR__NEXT, Floor.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, ModelPackage.FLOOR__NEXT, Floor.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FLOOR__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FLOOR__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, ModelPackage.FLOOR__PREVIOUS, Floor.class, msgs);
				return basicSetNext((Floor)otherEnd, msgs);
			case ModelPackage.FLOOR__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, ModelPackage.FLOOR__NEXT, Floor.class, msgs);
				return basicSetPrevious((Floor)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FLOOR__NEXT:
				return basicSetNext(null, msgs);
			case ModelPackage.FLOOR__FLOOR_BUTTONS:
				return ((InternalEList<?>)getFloorButtons()).basicRemove(otherEnd, msgs);
			case ModelPackage.FLOOR__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case ModelPackage.FLOOR__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ModelPackage.FLOOR__NR:
				return getNr();
			case ModelPackage.FLOOR__FLOOR_BUTTONS:
				return getFloorButtons();
			case ModelPackage.FLOOR__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
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
			case ModelPackage.FLOOR__NEXT:
				setNext((Floor)newValue);
				return;
			case ModelPackage.FLOOR__FLOOR_BUTTONS:
				getFloorButtons().clear();
				getFloorButtons().addAll((Collection<? extends Button>)newValue);
				return;
			case ModelPackage.FLOOR__PREVIOUS:
				setPrevious((Floor)newValue);
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
			case ModelPackage.FLOOR__NEXT:
				setNext((Floor)null);
				return;
			case ModelPackage.FLOOR__FLOOR_BUTTONS:
				getFloorButtons().clear();
				return;
			case ModelPackage.FLOOR__PREVIOUS:
				setPrevious((Floor)null);
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
			case ModelPackage.FLOOR__NEXT:
				return next != null;
			case ModelPackage.FLOOR__NR:
				return getNr() != NR_EDEFAULT;
			case ModelPackage.FLOOR__FLOOR_BUTTONS:
				return floorButtons != null && !floorButtons.isEmpty();
			case ModelPackage.FLOOR__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

} //FloorImpl
