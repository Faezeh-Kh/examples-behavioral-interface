/**
 */
package statemachines.impl;

import org.eclipse.emf.ecore.EClass;

import statemachines.BooleanAttribute;
import statemachines.BooleanConstraint;
import statemachines.StatemachinesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BooleanConstraintImpl extends ConstraintImpl<BooleanAttribute, Boolean> implements BooleanConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesPackage.Literals.BOOLEAN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Boolean newValue) {
		super.setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAttribute(BooleanAttribute newAttribute) {
		super.setAttribute(newAttribute);
	}

} //BooleanConstraintImpl
