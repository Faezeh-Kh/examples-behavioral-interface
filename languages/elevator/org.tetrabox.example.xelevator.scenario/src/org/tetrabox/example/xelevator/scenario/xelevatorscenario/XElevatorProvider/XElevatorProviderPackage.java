/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderFactory
 * @model kind="package"
 * @generated
 */
public interface XElevatorProviderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XElevatorProvider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.xelevator/scenario/XElevatorProvider/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XElevatorProvider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorProviderPackage eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonProviderImpl <em>Button Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonProviderImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonProvider()
	 * @generated
	 */
	int BUTTON_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>Button Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonReferenceImpl <em>Button Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonReferenceImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonReference()
	 * @generated
	 */
	int BUTTON_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Button Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonQueryImpl <em>Button Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonQueryImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonQuery()
	 * @generated
	 */
	int BUTTON_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Button Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorProviderImpl <em>Elevator Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorProviderImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorProvider()
	 * @generated
	 */
	int ELEVATOR_PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Elevator Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_PROVIDER_FEATURE_COUNT = ScenarioPackage.ELEMENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorReferenceImpl <em>Elevator Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorReferenceImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorReference()
	 * @generated
	 */
	int ELEVATOR_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_REFERENCE__ELEMENT = ScenarioPackage.ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The number of structural features of the '<em>Elevator Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_REFERENCE_FEATURE_COUNT = ScenarioPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorQueryImpl <em>Elevator Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorQueryImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorQuery()
	 * @generated
	 */
	int ELEVATOR_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_QUERY__QUERY = ScenarioPackage.ELEMENT_QUERY__QUERY;

	/**
	 * The number of structural features of the '<em>Elevator Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_QUERY_FEATURE_COUNT = ScenarioPackage.ELEMENT_QUERY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider <em>Button Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Provider</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider
	 * @generated
	 */
	EClass getButtonProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference <em>Button Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Reference</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference
	 * @generated
	 */
	EClass getButtonReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery <em>Button Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Query</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery
	 * @generated
	 */
	EClass getButtonQuery();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider <em>Elevator Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Provider</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider
	 * @generated
	 */
	EClass getElevatorProvider();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference <em>Elevator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Reference</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference
	 * @generated
	 */
	EClass getElevatorReference();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorQuery <em>Elevator Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Query</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorQuery
	 * @generated
	 */
	EClass getElevatorQuery();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XElevatorProviderFactory getXElevatorProviderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonProviderImpl <em>Button Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonProviderImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonProvider()
		 * @generated
		 */
		EClass BUTTON_PROVIDER = eINSTANCE.getButtonProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonReferenceImpl <em>Button Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonReferenceImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonReference()
		 * @generated
		 */
		EClass BUTTON_REFERENCE = eINSTANCE.getButtonReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonQueryImpl <em>Button Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ButtonQueryImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getButtonQuery()
		 * @generated
		 */
		EClass BUTTON_QUERY = eINSTANCE.getButtonQuery();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorProviderImpl <em>Elevator Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorProviderImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorProvider()
		 * @generated
		 */
		EClass ELEVATOR_PROVIDER = eINSTANCE.getElevatorProvider();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorReferenceImpl <em>Elevator Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorReferenceImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorReference()
		 * @generated
		 */
		EClass ELEVATOR_REFERENCE = eINSTANCE.getElevatorReference();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorQueryImpl <em>Elevator Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.ElevatorQueryImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl#getElevatorQuery()
		 * @generated
		 */
		EClass ELEVATOR_QUERY = eINSTANCE.getElevatorQuery();

	}

} //XElevatorProviderPackage
