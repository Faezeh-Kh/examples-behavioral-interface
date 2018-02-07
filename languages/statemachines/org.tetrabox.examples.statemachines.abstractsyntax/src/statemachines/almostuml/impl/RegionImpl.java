/**
 */
package statemachines.almostuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachines.almostuml.AlmostumlPackage;
import statemachines.almostuml.Region;
import statemachines.almostuml.State;
import statemachines.almostuml.StateMachine;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getVertice <em>Vertice</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The cached value of the '{@link #getVertice() <em>Vertice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertice()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertice;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlmostumlPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertice() {
		if (vertice == null) {
			vertice = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, AlmostumlPackage.REGION__VERTICE, AlmostumlPackage.VERTEX__CONTAINER);
		}
		return vertice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, AlmostumlPackage.REGION__TRANSITIONS, AlmostumlPackage.TRANSITION__CONTAINER);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != AlmostumlPackage.REGION__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, AlmostumlPackage.REGION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != AlmostumlPackage.REGION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, AlmostumlPackage.STATE_MACHINE__REGIONS, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.REGION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != AlmostumlPackage.REGION__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, AlmostumlPackage.REGION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != AlmostumlPackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, AlmostumlPackage.STATE__REGIONS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.REGION__STATE, newState, newState));
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
			case AlmostumlPackage.REGION__VERTICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertice()).basicAdd(otherEnd, msgs);
			case AlmostumlPackage.REGION__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case AlmostumlPackage.REGION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case AlmostumlPackage.REGION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case AlmostumlPackage.REGION__VERTICE:
				return ((InternalEList<?>)getVertice()).basicRemove(otherEnd, msgs);
			case AlmostumlPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case AlmostumlPackage.REGION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case AlmostumlPackage.REGION__STATE:
				return basicSetState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AlmostumlPackage.REGION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, AlmostumlPackage.STATE_MACHINE__REGIONS, StateMachine.class, msgs);
			case AlmostumlPackage.REGION__STATE:
				return eInternalContainer().eInverseRemove(this, AlmostumlPackage.STATE__REGIONS, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlmostumlPackage.REGION__VERTICE:
				return getVertice();
			case AlmostumlPackage.REGION__TRANSITIONS:
				return getTransitions();
			case AlmostumlPackage.REGION__STATE_MACHINE:
				return getStateMachine();
			case AlmostumlPackage.REGION__STATE:
				return getState();
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
			case AlmostumlPackage.REGION__VERTICE:
				getVertice().clear();
				getVertice().addAll((Collection<? extends Vertex>)newValue);
				return;
			case AlmostumlPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case AlmostumlPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case AlmostumlPackage.REGION__STATE:
				setState((State)newValue);
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
			case AlmostumlPackage.REGION__VERTICE:
				getVertice().clear();
				return;
			case AlmostumlPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				return;
			case AlmostumlPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case AlmostumlPackage.REGION__STATE:
				setState((State)null);
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
			case AlmostumlPackage.REGION__VERTICE:
				return vertice != null && !vertice.isEmpty();
			case AlmostumlPackage.REGION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case AlmostumlPackage.REGION__STATE_MACHINE:
				return getStateMachine() != null;
			case AlmostumlPackage.REGION__STATE:
				return getState() != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
