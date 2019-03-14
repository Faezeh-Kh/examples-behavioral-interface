/**
 */
package statemachines.impl;

import org.eclipse.emf.ecore.EClass;

import statemachines.StatemachinesPackage;
import statemachines.StringAttribute;
import statemachines.StringConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringConstraintImpl extends ConstraintImpl<StringAttribute, String> implements StringConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesPackage.Literals.STRING_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		super.setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAttribute(StringAttribute newAttribute) {
		super.setAttribute(newAttribute);
	}

} //StringConstraintImpl
