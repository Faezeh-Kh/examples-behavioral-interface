package org.gemoc.arduino.sequential.xarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryOperatorKind;

@Aspect(className = BinaryExpression.class)
@SuppressWarnings("all")
public class BinaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Integer evaluate(final BinaryExpression _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  protected static Integer _privk3_evaluate(final BinaryExpressionAspectBinaryExpressionAspectProperties _self_, final BinaryExpression _self) {
    Integer res = null;
    Integer iLeft = ExpressionAspect.evaluate(_self.getLeft());
    Integer iRight = ExpressionAspect.evaluate(_self.getRight());
    BinaryOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case DIV:
          res = Integer.valueOf(((iLeft).intValue() / (iRight).intValue()));
          break;
        case MAX:
          res = Integer.valueOf(Math.max((iLeft).intValue(), (iRight).intValue()));
          break;
        case MIN:
          res = Integer.valueOf(Math.min((iLeft).intValue(), (iRight).intValue()));
          break;
        case SUB:
          res = Integer.valueOf(((iLeft).intValue() - (iRight).intValue()));
          break;
        case MUL:
          res = Integer.valueOf(((iLeft).intValue() * (iRight).intValue()));
          break;
        case ADD:
          res = Integer.valueOf(((iLeft).intValue() + (iRight).intValue()));
          break;
        case LT:
          int _xifexpression = (int) 0;
          boolean _lessThan = (iLeft.compareTo(iRight) < 0);
          if (_lessThan) {
            _xifexpression = 1;
          } else {
            _xifexpression = 0;
          }
          res = Integer.valueOf(_xifexpression);
          break;
        case LE:
          int _xifexpression_1 = (int) 0;
          boolean _lessEqualsThan = (iLeft.compareTo(iRight) <= 0);
          if (_lessEqualsThan) {
            _xifexpression_1 = 1;
          } else {
            _xifexpression_1 = 0;
          }
          res = Integer.valueOf(_xifexpression_1);
          break;
        case EQ:
          int _xifexpression_2 = (int) 0;
          boolean _equals = Objects.equal(iLeft, iRight);
          if (_equals) {
            _xifexpression_2 = 1;
          } else {
            _xifexpression_2 = 0;
          }
          res = Integer.valueOf(_xifexpression_2);
          break;
        case GE:
          int _xifexpression_3 = (int) 0;
          boolean _greaterEqualsThan = (iLeft.compareTo(iRight) >= 0);
          if (_greaterEqualsThan) {
            _xifexpression_3 = 1;
          } else {
            _xifexpression_3 = 0;
          }
          res = Integer.valueOf(_xifexpression_3);
          break;
        case GT:
          int _xifexpression_4 = (int) 0;
          boolean _greaterThan = (iLeft.compareTo(iRight) > 0);
          if (_greaterThan) {
            _xifexpression_4 = 1;
          } else {
            _xifexpression_4 = 0;
          }
          res = Integer.valueOf(_xifexpression_4);
          break;
        case NEQ:
          int _xifexpression_5 = (int) 0;
          boolean _notEquals = (!Objects.equal(iLeft, iRight));
          if (_notEquals) {
            _xifexpression_5 = 1;
          } else {
            _xifexpression_5 = 0;
          }
          res = Integer.valueOf(_xifexpression_5);
          break;
        default:
          BinaryOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}
