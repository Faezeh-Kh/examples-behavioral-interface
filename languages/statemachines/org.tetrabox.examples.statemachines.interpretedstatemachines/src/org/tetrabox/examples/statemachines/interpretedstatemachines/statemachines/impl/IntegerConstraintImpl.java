/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerConstraintImpl extends ConstraintImpl<IntegerAttribute, Integer> implements IntegerConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesPackage.Literals.INTEGER_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Integer newValue) {
		super.setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAttribute(IntegerAttribute newAttribute) {
		super.setAttribute(newAttribute);
	}

} //IntegerConstraintImpl
