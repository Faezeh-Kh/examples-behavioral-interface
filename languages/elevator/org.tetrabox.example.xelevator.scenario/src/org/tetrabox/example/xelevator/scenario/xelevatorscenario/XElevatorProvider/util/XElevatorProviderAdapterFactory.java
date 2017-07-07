/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage
 * @generated
 */
public class XElevatorProviderAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorProviderPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorProviderAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XElevatorProviderPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorProviderSwitch<Adapter> modelSwitch =
		new XElevatorProviderSwitch<Adapter>() {
			@Override
			public Adapter caseButtonProvider(ButtonProvider object) {
				return createButtonProviderAdapter();
			}
			@Override
			public Adapter caseButtonReference(ButtonReference object) {
				return createButtonReferenceAdapter();
			}
			@Override
			public Adapter caseButtonQuery(ButtonQuery object) {
				return createButtonQueryAdapter();
			}
			@Override
			public Adapter caseElevatorProvider(ElevatorProvider object) {
				return createElevatorProviderAdapter();
			}
			@Override
			public Adapter caseElevatorReference(ElevatorReference object) {
				return createElevatorReferenceAdapter();
			}
			@Override
			public Adapter caseElevatorQuery(ElevatorQuery object) {
				return createElevatorQueryAdapter();
			}
			@Override
			public <T> Adapter caseElementProvider(ElementProvider<T> object) {
				return createElementProviderAdapter();
			}
			@Override
			public <T> Adapter caseElementReference(ElementReference<T> object) {
				return createElementReferenceAdapter();
			}
			@Override
			public <T, P extends StateProperty<T>> Adapter caseElementQuery(ElementQuery<T, P> object) {
				return createElementQueryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider <em>Button Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider
	 * @generated
	 */
	public Adapter createButtonProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference <em>Button Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference
	 * @generated
	 */
	public Adapter createButtonReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery <em>Button Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery
	 * @generated
	 */
	public Adapter createButtonQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider <em>Elevator Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider
	 * @generated
	 */
	public Adapter createElevatorProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference <em>Elevator Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference
	 * @generated
	 */
	public Adapter createElevatorReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorQuery <em>Elevator Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorQuery
	 * @generated
	 */
	public Adapter createElevatorQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementProvider <em>Element Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementProvider
	 * @generated
	 */
	public Adapter createElementProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementQuery <em>Element Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementQuery
	 * @generated
	 */
	public Adapter createElementQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XElevatorProviderAdapterFactory
