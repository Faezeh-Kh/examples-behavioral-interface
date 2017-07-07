/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionWaitForEventProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action Wait For Event Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptEventActionWaitForEventPropertyImpl extends XActivityDiagramStepPropertyImpl<AcceptEventAction> implements AcceptEventActionWaitForEventProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionWaitForEventPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getAcceptEventActionWaitForEventProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACCEPT_EVENT_ACTION.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("waitForEvent")) {
				result = op;
			}
		}
		return result;
		
	}

} //AcceptEventActionWaitForEventPropertyImpl
