/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoFactory;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryOperatorKind;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Board;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Constant;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Delay;
import org.gemoc.arduino.sequential.xarduinomt.arduino.If;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Led;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleGet;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Project;
import org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryOperatorKind;
import org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor;
import org.gemoc.arduino.sequential.xarduinomt.arduino.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoFactory init() {
		try {
			ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoPackage.eNS_URI);
			if (theArduinoFactory != null) {
				return theArduinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactoryImpl() {
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
			case ArduinoPackage.PROJECT: return createProject();
			case ArduinoPackage.BOARD: return createBoard();
			case ArduinoPackage.LED: return createLed();
			case ArduinoPackage.PUSH_BUTTON: return createPushButton();
			case ArduinoPackage.SKETCH: return createSketch();
			case ArduinoPackage.BLOCK: return createBlock();
			case ArduinoPackage.IF: return createIf();
			case ArduinoPackage.WHILE: return createWhile();
			case ArduinoPackage.SET_LED: return createSetLed();
			case ArduinoPackage.DELAY: return createDelay();
			case ArduinoPackage.WAIT_FOR: return createWaitFor();
			case ArduinoPackage.CONSTANT: return createConstant();
			case ArduinoPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case ArduinoPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case ArduinoPackage.MODULE_GET: return createModuleGet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.UNARY_OPERATOR_KIND:
				return createUnaryOperatorKindFromString(eDataType, initialValue);
			case ArduinoPackage.BINARY_OPERATOR_KIND:
				return createBinaryOperatorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.UNARY_OPERATOR_KIND:
				return convertUnaryOperatorKindToString(eDataType, instanceValue);
			case ArduinoPackage.BINARY_OPERATOR_KIND:
				return convertBinaryOperatorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Led createLed() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButton createPushButton() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLed createSetLed() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitFor createWaitFor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleGet createModuleGet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorKind createUnaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		UnaryOperatorKind result = UnaryOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperatorKind createBinaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		BinaryOperatorKind result = BinaryOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoPackage getArduinoPackage() {
		return (ArduinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoPackage getPackage() {
		return ArduinoPackage.eINSTANCE;
	}

} //ArduinoFactoryImpl
