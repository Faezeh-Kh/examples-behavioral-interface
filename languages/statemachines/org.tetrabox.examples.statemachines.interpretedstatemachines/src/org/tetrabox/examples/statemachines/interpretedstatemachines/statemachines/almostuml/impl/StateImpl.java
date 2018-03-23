/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#getDeferrableTriggers <em>Deferrable Triggers</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#isIsEntryCompleted <em>Is Entry Completed</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#isIsDoActivityCompleted <em>Is Do Activity Completed</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.StateImpl#isIsExitCompleted <em>Is Exit Completed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The cached value of the '{@link #getDeferrableTriggers() <em>Deferrable Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTriggers;

	/**
	 * The default value of the '{@link #isIsEntryCompleted() <em>Is Entry Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntryCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTRY_COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntryCompleted() <em>Is Entry Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntryCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntryCompleted = IS_ENTRY_COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDoActivityCompleted() <em>Is Do Activity Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDoActivityCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DO_ACTIVITY_COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDoActivityCompleted() <em>Is Do Activity Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDoActivityCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean isDoActivityCompleted = IS_DO_ACTIVITY_COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExitCompleted() <em>Is Exit Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExitCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXIT_COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExitCompleted() <em>Is Exit Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExitCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean isExitCompleted = IS_EXIT_COMPLETED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlmostumlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList<Region>(Region.class, this, AlmostumlPackage.STATE__REGIONS, AlmostumlPackage.REGION__STATE);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Behavior newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Behavior newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Behavior newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlmostumlPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTriggers() {
		if (deferrableTriggers == null) {
			deferrableTriggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS);
		}
		return deferrableTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEntryCompleted() {
		return isEntryCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntryCompleted(boolean newIsEntryCompleted) {
		boolean oldIsEntryCompleted = isEntryCompleted;
		isEntryCompleted = newIsEntryCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__IS_ENTRY_COMPLETED, oldIsEntryCompleted, isEntryCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDoActivityCompleted() {
		return isDoActivityCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDoActivityCompleted(boolean newIsDoActivityCompleted) {
		boolean oldIsDoActivityCompleted = isDoActivityCompleted;
		isDoActivityCompleted = newIsDoActivityCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED, oldIsDoActivityCompleted, isDoActivityCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExitCompleted() {
		return isExitCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExitCompleted(boolean newIsExitCompleted) {
		boolean oldIsExitCompleted = isExitCompleted;
		isExitCompleted = newIsExitCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__IS_EXIT_COMPLETED, oldIsExitCompleted, isExitCompleted));
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
			case AlmostumlPackage.STATE__REGIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegions()).basicAdd(otherEnd, msgs);
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
			case AlmostumlPackage.STATE__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case AlmostumlPackage.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				return basicSetDoActivity(null, msgs);
			case AlmostumlPackage.STATE__EXIT:
				return basicSetExit(null, msgs);
			case AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
				return ((InternalEList<?>)getDeferrableTriggers()).basicRemove(otherEnd, msgs);
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
			case AlmostumlPackage.STATE__REGIONS:
				return getRegions();
			case AlmostumlPackage.STATE__ENTRY:
				return getEntry();
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				return getDoActivity();
			case AlmostumlPackage.STATE__EXIT:
				return getExit();
			case AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
				return getDeferrableTriggers();
			case AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
				return isIsEntryCompleted();
			case AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
				return isIsDoActivityCompleted();
			case AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
				return isIsExitCompleted();
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
			case AlmostumlPackage.STATE__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case AlmostumlPackage.STATE__ENTRY:
				setEntry((Behavior)newValue);
				return;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)newValue);
				return;
			case AlmostumlPackage.STATE__EXIT:
				setExit((Behavior)newValue);
				return;
			case AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
				getDeferrableTriggers().clear();
				getDeferrableTriggers().addAll((Collection<? extends Trigger>)newValue);
				return;
			case AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
				setIsEntryCompleted((Boolean)newValue);
				return;
			case AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
				setIsDoActivityCompleted((Boolean)newValue);
				return;
			case AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
				setIsExitCompleted((Boolean)newValue);
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
			case AlmostumlPackage.STATE__REGIONS:
				getRegions().clear();
				return;
			case AlmostumlPackage.STATE__ENTRY:
				setEntry((Behavior)null);
				return;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)null);
				return;
			case AlmostumlPackage.STATE__EXIT:
				setExit((Behavior)null);
				return;
			case AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
				getDeferrableTriggers().clear();
				return;
			case AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
				setIsEntryCompleted(IS_ENTRY_COMPLETED_EDEFAULT);
				return;
			case AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
				setIsDoActivityCompleted(IS_DO_ACTIVITY_COMPLETED_EDEFAULT);
				return;
			case AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
				setIsExitCompleted(IS_EXIT_COMPLETED_EDEFAULT);
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
			case AlmostumlPackage.STATE__REGIONS:
				return regions != null && !regions.isEmpty();
			case AlmostumlPackage.STATE__ENTRY:
				return entry != null;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
			case AlmostumlPackage.STATE__EXIT:
				return exit != null;
			case AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
				return deferrableTriggers != null && !deferrableTriggers.isEmpty();
			case AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
				return isEntryCompleted != IS_ENTRY_COMPLETED_EDEFAULT;
			case AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
				return isDoActivityCompleted != IS_DO_ACTIVITY_COMPLETED_EDEFAULT;
			case AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
				return isExitCompleted != IS_EXIT_COMPLETED_EDEFAULT;
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
		result.append(" (isEntryCompleted: ");
		result.append(isEntryCompleted);
		result.append(", isDoActivityCompleted: ");
		result.append(isDoActivityCompleted);
		result.append(", isExitCompleted: ");
		result.append(isExitCompleted);
		result.append(')');
		return result.toString();
	}

} //StateImpl
