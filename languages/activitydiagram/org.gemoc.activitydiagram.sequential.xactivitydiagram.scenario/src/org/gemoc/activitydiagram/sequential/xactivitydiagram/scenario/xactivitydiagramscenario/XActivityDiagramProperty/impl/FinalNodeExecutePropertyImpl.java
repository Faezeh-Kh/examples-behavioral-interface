/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeExecuteProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node Execute Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinalNodeExecutePropertyImpl extends XActivityDiagramStepPropertyImpl<FinalNode> implements FinalNodeExecuteProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeExecutePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getFinalNodeExecuteProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.FINAL_NODE.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("execute")) {
				result = op;
			}
		}
		return result;
		
	}

} //FinalNodeExecutePropertyImpl
