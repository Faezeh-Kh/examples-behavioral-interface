/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentOpaqueActionContainerProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assignment Opaque Action Container Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentOpaqueActionContainerPropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAssignmentOpaqueActionContainerPropertyImpl extends VariableAssignmentPropertyImpl<VariableAssignment> implements VariableAssignmentOpaqueActionContainerProperty {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected OpaqueActionProperty<OpaqueAction> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignmentOpaqueActionContainerPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getVariableAssignmentOpaqueActionContainerProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionProperty<OpaqueAction> getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(OpaqueActionProperty<OpaqueAction> newProperty, NotificationChain msgs) {
		OpaqueActionProperty<OpaqueAction> oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(OpaqueActionProperty<OpaqueAction> newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY:
				return getProperty();
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
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY:
				setProperty((OpaqueActionProperty<OpaqueAction>)newValue);
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
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY:
				setProperty((OpaqueActionProperty<OpaqueAction>)null);
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
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerReferenceProperty.class) {
			switch (derivedFeatureID) {
				case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY: return PropertyPackage.CONTAINER_REFERENCE_PROPERTY__PROPERTY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerReferenceProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.CONTAINER_REFERENCE_PROPERTY__PROPERTY: return XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableAssignmentOpaqueActionContainerPropertyImpl
