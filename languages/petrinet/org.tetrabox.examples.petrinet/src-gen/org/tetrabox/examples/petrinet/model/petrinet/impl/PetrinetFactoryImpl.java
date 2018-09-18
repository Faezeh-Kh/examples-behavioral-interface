/**
 */
package org.tetrabox.examples.petrinet.model.petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.examples.petrinet.model.petrinet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetFactoryImpl extends EFactoryImpl implements PetrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetFactory init() {
		try {
			PetrinetFactory thePetrinetFactory = (PetrinetFactory) EPackage.Registry.INSTANCE
					.getEFactory(PetrinetPackage.eNS_URI);
			if (thePetrinetFactory != null) {
				return thePetrinetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetFactoryImpl() {
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
		case PetrinetPackage.PETRI_NET:
			return createPetriNet();
		case PetrinetPackage.PLACE:
			return createPlace();
		case PetrinetPackage.TRANSITION:
			return createTransition();
		case PetrinetPackage.INPUT_EDGE:
			return createInputEdge();
		case PetrinetPackage.OUTPUT_EDGE:
			return createOutputEdge();
		case PetrinetPackage.INHIBITOR_EDGE:
			return createInhibitorEdge();
		case PetrinetPackage.READ_EDGE:
			return createReadEdge();
		case PetrinetPackage.NAMED_ELEMENT:
			return createNamedElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEdge createInputEdge() {
		InputEdgeImpl inputEdge = new InputEdgeImpl();
		return inputEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEdge createOutputEdge() {
		OutputEdgeImpl outputEdge = new OutputEdgeImpl();
		return outputEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InhibitorEdge createInhibitorEdge() {
		InhibitorEdgeImpl inhibitorEdge = new InhibitorEdgeImpl();
		return inhibitorEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadEdge createReadEdge() {
		ReadEdgeImpl readEdge = new ReadEdgeImpl();
		return readEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetPackage getPetrinetPackage() {
		return (PetrinetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetPackage getPackage() {
		return PetrinetPackage.eINSTANCE;
	}

} //PetrinetFactoryImpl
