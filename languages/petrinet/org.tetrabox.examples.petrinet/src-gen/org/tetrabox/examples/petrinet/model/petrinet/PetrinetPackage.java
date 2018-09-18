/**
 */
package org.tetrabox.examples.petrinet.model.petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.NamedElementImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetriNetImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PLACES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PlaceImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.TransitionImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PLACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.InputEdgeImpl <em>Input Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.InputEdgeImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getInputEdge()
	 * @generated
	 */
	int INPUT_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__PLACE = EDGE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__TRANSITION = EDGE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Input Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.OutputEdgeImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getOutputEdge()
	 * @generated
	 */
	int OUTPUT_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__PLACE = EDGE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__TRANSITION = EDGE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Output Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.InhibitorEdgeImpl <em>Inhibitor Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.InhibitorEdgeImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getInhibitorEdge()
	 * @generated
	 */
	int INHIBITOR_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_EDGE__PLACE = EDGE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_EDGE__TRANSITION = EDGE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Inhibitor Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inhibitor Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.ReadEdgeImpl <em>Read Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.ReadEdgeImpl
	 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getReadEdge()
	 * @generated
	 */
	int READ_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EDGE__NAME = EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EDGE__PLACE = EDGE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EDGE__TRANSITION = EDGE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Read Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getEdges()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Edges();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

	/**
	 * Returns the meta object for the reference list '{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Place#getEdges()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Edges();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link org.tetrabox.examples.petrinet.model.petrinet.Transition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Transition#getEdges()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Edges();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Place();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Transition();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.InputEdge <em>Input Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Edge</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.InputEdge
	 * @generated
	 */
	EClass getInputEdge();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.OutputEdge <em>Output Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Edge</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.OutputEdge
	 * @generated
	 */
	EClass getOutputEdge();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.InhibitorEdge <em>Inhibitor Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibitor Edge</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.InhibitorEdge
	 * @generated
	 */
	EClass getInhibitorEdge();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.ReadEdge <em>Read Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Edge</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.ReadEdge
	 * @generated
	 */
	EClass getReadEdge();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.petrinet.model.petrinet.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.examples.petrinet.model.petrinet.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetriNetImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TRANSITIONS = eINSTANCE.getPetriNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__EDGES = eINSTANCE.getPetriNet_Edges();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PlaceImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__EDGES = eINSTANCE.getPlace_Edges();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.TransitionImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EDGES = eINSTANCE.getTransition_Edges();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.EdgeImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PLACE = eINSTANCE.getEdge_Place();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TRANSITION = eINSTANCE.getEdge_Transition();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.InputEdgeImpl <em>Input Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.InputEdgeImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getInputEdge()
		 * @generated
		 */
		EClass INPUT_EDGE = eINSTANCE.getInputEdge();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.OutputEdgeImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getOutputEdge()
		 * @generated
		 */
		EClass OUTPUT_EDGE = eINSTANCE.getOutputEdge();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.InhibitorEdgeImpl <em>Inhibitor Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.InhibitorEdgeImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getInhibitorEdge()
		 * @generated
		 */
		EClass INHIBITOR_EDGE = eINSTANCE.getInhibitorEdge();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.ReadEdgeImpl <em>Read Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.ReadEdgeImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getReadEdge()
		 * @generated
		 */
		EClass READ_EDGE = eINSTANCE.getReadEdge();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.petrinet.model.petrinet.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.NamedElementImpl
		 * @see org.tetrabox.examples.petrinet.model.petrinet.impl.PetrinetPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //PetrinetPackage
