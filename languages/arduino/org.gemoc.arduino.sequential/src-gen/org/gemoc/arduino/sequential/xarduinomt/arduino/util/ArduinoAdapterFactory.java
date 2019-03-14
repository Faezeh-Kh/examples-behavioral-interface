/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Board;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Constant;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Control;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Delay;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.If;
import org.gemoc.arduino.sequential.xarduinomt.arduino.InputModule;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Instruction;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Led;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleGet;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleSet;
import org.gemoc.arduino.sequential.xarduinomt.arduino.NamedElement;
import org.gemoc.arduino.sequential.xarduinomt.arduino.OutputModule;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Project;
import org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor;
import org.gemoc.arduino.sequential.xarduinomt.arduino.While;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
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
	protected ArduinoSwitch<Adapter> modelSwitch =
		new ArduinoSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseModule(org.gemoc.arduino.sequential.xarduinomt.arduino.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseOutputModule(OutputModule object) {
				return createOutputModuleAdapter();
			}
			@Override
			public Adapter caseLed(Led object) {
				return createLedAdapter();
			}
			@Override
			public Adapter caseInputModule(InputModule object) {
				return createInputModuleAdapter();
			}
			@Override
			public Adapter casePushButton(PushButton object) {
				return createPushButtonAdapter();
			}
			@Override
			public Adapter caseSketch(Sketch object) {
				return createSketchAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseModuleSet(ModuleSet object) {
				return createModuleSetAdapter();
			}
			@Override
			public Adapter caseSetLed(SetLed object) {
				return createSetLedAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseWaitFor(WaitFor object) {
				return createWaitForAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseModuleGet(ModuleGet object) {
				return createModuleGetAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.OutputModule <em>Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.OutputModule
	 * @generated
	 */
	public Adapter createOutputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Led
	 * @generated
	 */
	public Adapter createLedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.InputModule <em>Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.InputModule
	 * @generated
	 */
	public Adapter createInputModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton <em>Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton
	 * @generated
	 */
	public Adapter createPushButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleSet <em>Module Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleSet
	 * @generated
	 */
	public Adapter createModuleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed <em>Set Led</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed
	 * @generated
	 */
	public Adapter createSetLedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor <em>Wait For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor
	 * @generated
	 */
	public Adapter createWaitForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleGet <em>Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleGet
	 * @generated
	 */
	public Adapter createModuleGetAdapter() {
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

} //ArduinoAdapterFactory
