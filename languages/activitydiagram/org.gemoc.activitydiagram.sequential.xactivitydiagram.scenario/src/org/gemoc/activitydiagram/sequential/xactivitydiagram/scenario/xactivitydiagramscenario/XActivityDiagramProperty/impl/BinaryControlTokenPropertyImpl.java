/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import fr.inria.diverse.event.commons.model.property.BinaryProperty;
import fr.inria.diverse.event.commons.model.property.BooleanOperator;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlTokenProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Control Token Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlTokenPropertyImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlTokenPropertyImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlTokenPropertyImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryControlTokenPropertyImpl extends ControlTokenPropertyImpl<ControlToken> implements BinaryControlTokenProperty {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator OPERATOR_EDEFAULT = BooleanOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected ControlTokenProperty<ControlToken> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected ControlTokenProperty<ControlToken> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryControlTokenPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getBinaryControlTokenProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BooleanOperator newOperator) {
		BooleanOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenProperty<ControlToken> getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ControlTokenProperty<ControlToken> newLeft, NotificationChain msgs) {
		ControlTokenProperty<ControlToken> oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(ControlTokenProperty<ControlToken> newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenProperty<ControlToken> getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ControlTokenProperty<ControlToken> newRight, NotificationChain msgs) {
		ControlTokenProperty<ControlToken> oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(ControlTokenProperty<ControlToken> newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT:
				return basicSetLeft(null, msgs);
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT:
				return basicSetRight(null, msgs);
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
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR:
				return getOperator();
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT:
				return getLeft();
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT:
				return getRight();
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
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR:
				setOperator((BooleanOperator)newValue);
				return;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT:
				setLeft((ControlTokenProperty<ControlToken>)newValue);
				return;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT:
				setRight((ControlTokenProperty<ControlToken>)newValue);
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
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT:
				setLeft((ControlTokenProperty<ControlToken>)null);
				return;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT:
				setRight((ControlTokenProperty<ControlToken>)null);
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
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT:
				return left != null;
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT:
				return right != null;
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
		if (baseClass == BinaryProperty.class) {
			switch (derivedFeatureID) {
				case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR: return PropertyPackage.BINARY_PROPERTY__OPERATOR;
				case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT: return PropertyPackage.BINARY_PROPERTY__LEFT;
				case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT: return PropertyPackage.BINARY_PROPERTY__RIGHT;
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
		if (baseClass == BinaryProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.BINARY_PROPERTY__OPERATOR: return XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR;
				case PropertyPackage.BINARY_PROPERTY__LEFT: return XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__LEFT;
				case PropertyPackage.BINARY_PROPERTY__RIGHT: return XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY__RIGHT;
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

} //BinaryControlTokenPropertyImpl