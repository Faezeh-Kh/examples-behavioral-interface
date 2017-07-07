/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.util;

import fr.inria.diverse.event.commons.model.property.Property;

import fr.inria.diverse.event.commons.model.scenario.Event;
import fr.inria.diverse.event.commons.model.scenario.EventOccurrence;
import fr.inria.diverse.event.commons.model.scenario.Scenario;
import fr.inria.diverse.event.commons.model.scenario.ScenarioElement;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSM;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage
 * @generated
 */
public class XElevatorScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XElevatorScenarioPackage.eINSTANCE;
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
	protected XElevatorScenarioSwitch<Adapter> modelSwitch =
		new XElevatorScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseXElevatorScenario(XElevatorScenario object) {
				return createXElevatorScenarioAdapter();
			}
			@Override
			public Adapter caseXElevatorScenarioElement(XElevatorScenarioElement object) {
				return createXElevatorScenarioElementAdapter();
			}
			@Override
			public Adapter caseXElevatorEventOccurrence(XElevatorEventOccurrence object) {
				return createXElevatorEventOccurrenceAdapter();
			}
			@Override
			public Adapter caseXElevatorScenarioFSM(XElevatorScenarioFSM object) {
				return createXElevatorScenarioFSMAdapter();
			}
			@Override
			public Adapter caseXElevatorScenarioFSMState(XElevatorScenarioFSMState object) {
				return createXElevatorScenarioFSMStateAdapter();
			}
			@Override
			public Adapter caseXElevatorScenarioFSMTransition(XElevatorScenarioFSMTransition object) {
				return createXElevatorScenarioFSMTransitionAdapter();
			}
			@Override
			public <T extends ScenarioElement<?>> Adapter caseScenario(Scenario<T> object) {
				return createScenarioAdapter();
			}
			@Override
			public <P extends Property> Adapter caseScenarioElement(ScenarioElement<P> object) {
				return createScenarioElementAdapter();
			}
			@Override
			public <E extends Event<?>, P extends Property> Adapter caseEventOccurrence(EventOccurrence<E, P> object) {
				return createEventOccurrenceAdapter();
			}
			@Override
			public <P extends Property, E extends Event<?>, S extends ScenarioFSMState<E, T>, T extends ScenarioFSMTransition<P, S>> Adapter caseScenarioFSM(ScenarioFSM<P, E, S, T> object) {
				return createScenarioFSMAdapter();
			}
			@Override
			public <E extends Event<?>, T extends ScenarioFSMTransition<?, ?>> Adapter caseScenarioFSMState(ScenarioFSMState<E, T> object) {
				return createScenarioFSMStateAdapter();
			}
			@Override
			public <P extends Property, S extends ScenarioFSMState<?, ?>> Adapter caseScenarioFSMTransition(ScenarioFSMTransition<P, S> object) {
				return createScenarioFSMTransitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario <em>XElevator Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario
	 * @generated
	 */
	public Adapter createXElevatorScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement
	 * @generated
	 */
	public Adapter createXElevatorScenarioElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence <em>XElevator Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence
	 * @generated
	 */
	public Adapter createXElevatorEventOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM
	 * @generated
	 */
	public Adapter createXElevatorScenarioFSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState <em>FSM State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState
	 * @generated
	 */
	public Adapter createXElevatorScenarioFSMStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition <em>FSM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition
	 * @generated
	 */
	public Adapter createXElevatorScenarioFSMTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioElement
	 * @generated
	 */
	public Adapter createScenarioElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.EventOccurrence <em>Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.EventOccurrence
	 * @generated
	 */
	public Adapter createEventOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioFSM
	 * @generated
	 */
	public Adapter createScenarioFSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState <em>FSM State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState
	 * @generated
	 */
	public Adapter createScenarioFSMStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition <em>FSM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition
	 * @generated
	 */
	public Adapter createScenarioFSMTransitionAdapter() {
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

} //XElevatorScenarioAdapterFactory
