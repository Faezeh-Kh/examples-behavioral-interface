/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramEventFactoryImpl extends EFactoryImpl implements XActivityDiagramEventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XActivityDiagramEventFactory init() {
		try {
			XActivityDiagramEventFactory theXActivityDiagramEventFactory = (XActivityDiagramEventFactory)EPackage.Registry.INSTANCE.getEFactory(XActivityDiagramEventPackage.eNS_URI);
			if (theXActivityDiagramEventFactory != null) {
				return theXActivityDiagramEventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XActivityDiagramEventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramEventFactoryImpl() {
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
			case XActivityDiagramEventPackage.ACCEPT_EVENT_ACTION_ACCEPT_EVENT: return createAcceptEventActionAcceptEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionAcceptEvent createAcceptEventActionAcceptEvent() {
		AcceptEventActionAcceptEventImpl acceptEventActionAcceptEvent = new AcceptEventActionAcceptEventImpl();
		return acceptEventActionAcceptEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramEventPackage getXActivityDiagramEventPackage() {
		return (XActivityDiagramEventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XActivityDiagramEventPackage getPackage() {
		return XActivityDiagramEventPackage.eINSTANCE;
	}

} //XActivityDiagramEventFactoryImpl
