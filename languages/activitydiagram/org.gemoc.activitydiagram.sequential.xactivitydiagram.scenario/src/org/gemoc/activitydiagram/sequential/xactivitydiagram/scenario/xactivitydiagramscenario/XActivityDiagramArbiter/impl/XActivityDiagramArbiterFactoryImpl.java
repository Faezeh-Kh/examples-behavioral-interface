/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramArbiterFactoryImpl extends EFactoryImpl implements XActivityDiagramArbiterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XActivityDiagramArbiterFactory init() {
		try {
			XActivityDiagramArbiterFactory theXActivityDiagramArbiterFactory = (XActivityDiagramArbiterFactory)EPackage.Registry.INSTANCE.getEFactory(XActivityDiagramArbiterPackage.eNS_URI);
			if (theXActivityDiagramArbiterFactory != null) {
				return theXActivityDiagramArbiterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XActivityDiagramArbiterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterFactoryImpl() {
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
			case XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER: return createXActivityDiagramArbiter();
			case XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER_STATE: return createXActivityDiagramArbiterState();
			case XActivityDiagramArbiterPackage.XACTIVITY_DIAGRAM_ARBITER_TRANSITION: return createXActivityDiagramArbiterTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiter createXActivityDiagramArbiter() {
		XActivityDiagramArbiterImpl xActivityDiagramArbiter = new XActivityDiagramArbiterImpl();
		return xActivityDiagramArbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterState createXActivityDiagramArbiterState() {
		XActivityDiagramArbiterStateImpl xActivityDiagramArbiterState = new XActivityDiagramArbiterStateImpl();
		return xActivityDiagramArbiterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterTransition createXActivityDiagramArbiterTransition() {
		XActivityDiagramArbiterTransitionImpl xActivityDiagramArbiterTransition = new XActivityDiagramArbiterTransitionImpl();
		return xActivityDiagramArbiterTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterPackage getXActivityDiagramArbiterPackage() {
		return (XActivityDiagramArbiterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XActivityDiagramArbiterPackage getPackage() {
		return XActivityDiagramArbiterPackage.eINSTANCE;
	}

} //XActivityDiagramArbiterFactoryImpl
