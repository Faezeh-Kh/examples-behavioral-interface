/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action Accept Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.AcceptEventActionAcceptEventImpl#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptEventActionAcceptEventImpl extends XActivityDiagramEventImpl<AcceptEventAction> implements AcceptEventActionAcceptEvent {
	/**
	 * The cached value of the '{@link #getEventProvider() <em>Event Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventProvider()
	 * @generated
	 * @ordered
	 */
	protected EventProvider eventProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionAcceptEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramEventPackage.Literals.ACCEPT_EVENT_ACTION_ACCEPT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventProvider getEventProvider() {
		return eventProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventProvider(EventProvider newEventProvider, NotificationChain msgs) {
		EventProvider oldEventProvider = eventProvider;
		eventProvider = newEventProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER, oldEventProvider, newEventProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventProvider(EventProvider newEventProvider) {
		if (newEventProvider != eventProvider) {
			NotificationChain msgs = null;
			if (eventProvider != null)
				msgs = ((InternalEObject)eventProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER, null, msgs);
			if (newEventProvider != null)
				msgs = ((InternalEObject)newEventProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER, null, msgs);
			msgs = basicSetEventProvider(newEventProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER, newEventProvider, newEventProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER:
				return basicSetEventProvider(null, msgs);
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
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER:
				return getEventProvider();
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
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER:
				setEventProvider((EventProvider)newValue);
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
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER:
				setEventProvider((EventProvider)null);
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
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER:
				return eventProvider != null;
		}
		return super.eIsSet(featureID);
	}

} //AcceptEventActionAcceptEventImpl
