/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionExecuteProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Action Execute Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OpaqueActionExecutePropertyImpl extends XActivityDiagramStepPropertyImpl<OpaqueAction> implements OpaqueActionExecuteProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueActionExecutePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getOpaqueActionExecuteProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.OPAQUE_ACTION.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("execute")) {
				result = op;
			}
		}
		return result;
		
	}

} //OpaqueActionExecutePropertyImpl
