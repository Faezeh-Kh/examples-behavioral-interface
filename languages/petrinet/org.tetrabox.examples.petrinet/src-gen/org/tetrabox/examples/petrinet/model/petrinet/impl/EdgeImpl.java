/**
 */
package org.tetrabox.examples.petrinet.model.petrinet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tetrabox.examples.petrinet.model.petrinet.Edge;
import org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage;
import org.tetrabox.examples.petrinet.model.petrinet.Place;
import org.tetrabox.examples.petrinet.model.petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EdgeImpl extends NamedElementImpl implements Edge {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject) place;
			place = (Place) eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.EDGE__PLACE, oldPlace,
							place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.EDGE__PLACE,
					oldPlace, newPlace);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject) place).eInverseRemove(this, PetrinetPackage.PLACE__EDGES, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject) newPlace).eInverseAdd(this, PetrinetPackage.PLACE__EDGES, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.EDGE__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject) transition;
			transition = (Transition) eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.EDGE__TRANSITION,
							oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PetrinetPackage.EDGE__TRANSITION, oldTransition, newTransition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject) transition).eInverseRemove(this, PetrinetPackage.TRANSITION__EDGES,
						Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject) newTransition).eInverseAdd(this, PetrinetPackage.TRANSITION__EDGES,
						Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.EDGE__TRANSITION, newTransition,
					newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetrinetPackage.EDGE__PLACE:
			if (place != null)
				msgs = ((InternalEObject) place).eInverseRemove(this, PetrinetPackage.PLACE__EDGES, Place.class, msgs);
			return basicSetPlace((Place) otherEnd, msgs);
		case PetrinetPackage.EDGE__TRANSITION:
			if (transition != null)
				msgs = ((InternalEObject) transition).eInverseRemove(this, PetrinetPackage.TRANSITION__EDGES,
						Transition.class, msgs);
			return basicSetTransition((Transition) otherEnd, msgs);
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
		case PetrinetPackage.EDGE__PLACE:
			return basicSetPlace(null, msgs);
		case PetrinetPackage.EDGE__TRANSITION:
			return basicSetTransition(null, msgs);
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
		case PetrinetPackage.EDGE__PLACE:
			if (resolve)
				return getPlace();
			return basicGetPlace();
		case PetrinetPackage.EDGE__TRANSITION:
			if (resolve)
				return getTransition();
			return basicGetTransition();
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
		case PetrinetPackage.EDGE__PLACE:
			setPlace((Place) newValue);
			return;
		case PetrinetPackage.EDGE__TRANSITION:
			setTransition((Transition) newValue);
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
		case PetrinetPackage.EDGE__PLACE:
			setPlace((Place) null);
			return;
		case PetrinetPackage.EDGE__TRANSITION:
			setTransition((Transition) null);
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
		case PetrinetPackage.EDGE__PLACE:
			return place != null;
		case PetrinetPackage.EDGE__TRANSITION:
			return transition != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
