package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryOperatorKind;

@Aspect(className = UnaryExpression.class)
@SuppressWarnings("all")
public class UnaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Integer evaluate(final UnaryExpression _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  protected static Integer _privk3_evaluate(final UnaryExpressionAspectUnaryExpressionAspectProperties _self_, final UnaryExpression _self) {
    Integer res = null;
    Integer operand = ExpressionAspect.evaluate(_self.getOperand());
    UnaryOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case MINUS:
          res = Integer.valueOf((-(operand).intValue()));
          break;
        case NEG:
          int _xifexpression = (int) 0;
          if (((operand).intValue() == 0)) {
            _xifexpression = 1;
          } else {
            _xifexpression = 0;
          }
          res = Integer.valueOf(_xifexpression);
          break;
        default:
          UnaryOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      UnaryOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}
