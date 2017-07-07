/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorArbiterFactoryImpl extends EFactoryImpl implements XElevatorArbiterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XElevatorArbiterFactory init() {
		try {
			XElevatorArbiterFactory theXElevatorArbiterFactory = (XElevatorArbiterFactory)EPackage.Registry.INSTANCE.getEFactory(XElevatorArbiterPackage.eNS_URI);
			if (theXElevatorArbiterFactory != null) {
				return theXElevatorArbiterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XElevatorArbiterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XElevatorArbiterPackage.XELEVATOR_ARBITER: return createXElevatorArbiter();
			case XElevatorArbiterPackage.XELEVATOR_ARBITER_STATE: return createXElevatorArbiterState();
			case XElevatorArbiterPackage.XELEVATOR_ARBITER_TRANSITION: return createXElevatorArbiterTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiter createXElevatorArbiter() {
		XElevatorArbiterImpl xElevatorArbiter = new XElevatorArbiterImpl();
		return xElevatorArbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterState createXElevatorArbiterState() {
		XElevatorArbiterStateImpl xElevatorArbiterState = new XElevatorArbiterStateImpl();
		return xElevatorArbiterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterTransition createXElevatorArbiterTransition() {
		XElevatorArbiterTransitionImpl xElevatorArbiterTransition = new XElevatorArbiterTransitionImpl();
		return xElevatorArbiterTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterPackage getXElevatorArbiterPackage() {
		return (XElevatorArbiterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XElevatorArbiterPackage getPackage() {
		return XElevatorArbiterPackage.eINSTANCE;
	}

} //XElevatorArbiterFactoryImpl
