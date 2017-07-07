/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorProviderFactoryImpl extends EFactoryImpl implements XElevatorProviderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XElevatorProviderFactory init() {
		try {
			XElevatorProviderFactory theXElevatorProviderFactory = (XElevatorProviderFactory)EPackage.Registry.INSTANCE.getEFactory(XElevatorProviderPackage.eNS_URI);
			if (theXElevatorProviderFactory != null) {
				return theXElevatorProviderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XElevatorProviderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorProviderFactoryImpl() {
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
			case XElevatorProviderPackage.BUTTON_REFERENCE: return createButtonReference();
			case XElevatorProviderPackage.BUTTON_QUERY: return createButtonQuery();
			case XElevatorProviderPackage.ELEVATOR_REFERENCE: return createElevatorReference();
			case XElevatorProviderPackage.ELEVATOR_QUERY: return createElevatorQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonReference createButtonReference() {
		ButtonReferenceImpl buttonReference = new ButtonReferenceImpl();
		return buttonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonQuery createButtonQuery() {
		ButtonQueryImpl buttonQuery = new ButtonQueryImpl();
		return buttonQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorReference createElevatorReference() {
		ElevatorReferenceImpl elevatorReference = new ElevatorReferenceImpl();
		return elevatorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorQuery createElevatorQuery() {
		ElevatorQueryImpl elevatorQuery = new ElevatorQueryImpl();
		return elevatorQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorProviderPackage getXElevatorProviderPackage() {
		return (XElevatorProviderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XElevatorProviderPackage getPackage() {
		return XElevatorProviderPackage.eINSTANCE;
	}

} //XElevatorProviderFactoryImpl
