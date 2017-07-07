/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;
import fr.inria.diverse.event.commons.model.property.UnaryOperator;
import fr.inria.diverse.event.commons.model.property.UnaryProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.xelevator.elevator.UpButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Up Button Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryUpButtonPropertyImpl extends UpButtonPropertyImpl<UpButton> implements UnaryUpButtonProperty {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperator OPERATOR_EDEFAULT = UnaryOperator.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected UpButtonProperty<UpButton> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryUpButtonPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.UNARY_UP_BUTTON_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(UnaryOperator newOperator) {
		UnaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpButtonProperty<UpButton> getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(UpButtonProperty<UpButton> newProperty, NotificationChain msgs) {
		UpButtonProperty<UpButton> oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(UpButtonProperty<UpButton> newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY:
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
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR:
				return getOperator();
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY:
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
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR:
				setOperator((UnaryOperator)newValue);
				return;
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY:
				setProperty((UpButtonProperty<UpButton>)newValue);
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
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY:
				setProperty((UpButtonProperty<UpButton>)null);
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
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY:
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
		if (baseClass == UnaryProperty.class) {
			switch (derivedFeatureID) {
				case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR: return PropertyPackage.UNARY_PROPERTY__OPERATOR;
				case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY: return PropertyPackage.UNARY_PROPERTY__PROPERTY;
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
		if (baseClass == UnaryProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.UNARY_PROPERTY__OPERATOR: return XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__OPERATOR;
				case PropertyPackage.UNARY_PROPERTY__PROPERTY: return XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY__PROPERTY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryUpButtonPropertyImpl
