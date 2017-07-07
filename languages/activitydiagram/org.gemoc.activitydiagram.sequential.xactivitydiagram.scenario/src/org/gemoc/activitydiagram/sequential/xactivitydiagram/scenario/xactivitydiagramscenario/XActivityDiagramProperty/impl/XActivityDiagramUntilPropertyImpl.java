/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.UntilPropertyImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramAbstractProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XActivity Diagram Until Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramUntilPropertyImpl extends UntilPropertyImpl<XActivityDiagramAbstractProperty> implements XActivityDiagramUntilProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramUntilPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getXActivityDiagramUntilProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeftFormula(XActivityDiagramAbstractProperty newLeftFormula, NotificationChain msgs) {
		return super.basicSetLeftFormula(newLeftFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRightFormula(XActivityDiagramAbstractProperty newRightFormula, NotificationChain msgs) {
		return super.basicSetRightFormula(newRightFormula, msgs);
	}

} //XActivityDiagramUntilPropertyImpl
