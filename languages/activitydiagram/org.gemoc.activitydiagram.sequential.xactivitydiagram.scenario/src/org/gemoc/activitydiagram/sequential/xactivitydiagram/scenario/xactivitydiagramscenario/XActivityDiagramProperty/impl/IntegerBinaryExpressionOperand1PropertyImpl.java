/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;
import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand1Property;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Binary Expression Operand1 Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperand1PropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerBinaryExpressionOperand1PropertyImpl extends IntegerBinaryExpressionPropertyImpl<IntegerBinaryExpression> implements IntegerBinaryExpressionOperand1Property {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpressionProperty<IntegerExpression> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerBinaryExpressionOperand1PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getIntegerBinaryExpressionOperand1Property();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpressionProperty<IntegerExpression> getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(IntegerExpressionProperty<IntegerExpression> newProperty, NotificationChain msgs) {
		IntegerExpressionProperty<IntegerExpression> oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(IntegerExpressionProperty<IntegerExpression> newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.INTEGER_BINARY_EXPRESSION__OPERAND1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY:
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
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY:
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
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY:
				setProperty((IntegerExpressionProperty<IntegerExpression>)newValue);
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
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY:
				setProperty((IntegerExpressionProperty<IntegerExpression>)null);
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
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY:
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
		if (baseClass == SingleReferenceProperty.class) {
			switch (derivedFeatureID) {
				case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY: return PropertyPackage.SINGLE_REFERENCE_PROPERTY__PROPERTY;
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
		if (baseClass == SingleReferenceProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.SINGLE_REFERENCE_PROPERTY__PROPERTY: return XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IntegerBinaryExpressionOperand1PropertyImpl
