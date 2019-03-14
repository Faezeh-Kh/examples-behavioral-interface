package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryOperatorKind;

@SuppressWarnings("all")
public class UnaryExpressionAdapter extends EObjectAdapter<UnaryExpression> implements org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryExpressionAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public UnaryOperatorKind getOperator() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.sequential.xarduino.arduino.UnaryOperatorKind.get(o.getValue()));
  }
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public Integer evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspect.evaluate(adaptee);
  }
  
  protected final static UnaryOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERATOR:
    		return getOperator();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryOperatorKind)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
