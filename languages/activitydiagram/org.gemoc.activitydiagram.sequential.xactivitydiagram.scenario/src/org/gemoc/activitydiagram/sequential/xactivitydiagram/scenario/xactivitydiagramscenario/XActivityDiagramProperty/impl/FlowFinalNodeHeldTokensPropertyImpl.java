/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;
import fr.inria.diverse.event.commons.model.property.PropertyPackage;
import fr.inria.diverse.event.commons.model.property.Quantifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeHeldTokensProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Final Node Held Tokens Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeHeldTokensPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeHeldTokensPropertyImpl#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowFinalNodeHeldTokensPropertyImpl extends FlowFinalNodePropertyImpl<FlowFinalNode> implements FlowFinalNodeHeldTokensProperty {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected ControlTokenProperty<ControlToken> property;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowFinalNodeHeldTokensPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getFlowFinalNodeHeldTokensProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenProperty<ControlToken> getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(ControlTokenProperty<ControlToken> newProperty, NotificationChain msgs) {
		ControlTokenProperty<ControlToken> oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(ControlTokenProperty<ControlToken> newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_NODE__HELD_TOKENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY:
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
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY:
				return getProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER:
				return getQuantifier();
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
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY:
				setProperty((ControlTokenProperty<ControlToken>)newValue);
				return;
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
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
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY:
				setProperty((ControlTokenProperty<ControlToken>)null);
				return;
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
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
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY:
				return property != null;
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
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
		if (baseClass == ManyReferenceProperty.class) {
			switch (derivedFeatureID) {
				case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY: return PropertyPackage.MANY_REFERENCE_PROPERTY__PROPERTY;
				case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER: return PropertyPackage.MANY_REFERENCE_PROPERTY__QUANTIFIER;
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
		if (baseClass == ManyReferenceProperty.class) {
			switch (baseFeatureID) {
				case PropertyPackage.MANY_REFERENCE_PROPERTY__PROPERTY: return XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY;
				case PropertyPackage.MANY_REFERENCE_PROPERTY__QUANTIFIER: return XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER;
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
		result.append(" (quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

} //FlowFinalNodeHeldTokensPropertyImpl
