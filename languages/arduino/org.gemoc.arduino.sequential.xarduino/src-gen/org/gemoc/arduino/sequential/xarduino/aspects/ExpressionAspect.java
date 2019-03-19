package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class ExpressionAspect {
  @Abstract
  public static Integer evaluate(final Expression _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Constant) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.Constant) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Expression) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Expression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Integer) result;
}
  
  protected static Integer _privk3_evaluate(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
