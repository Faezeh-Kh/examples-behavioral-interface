package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Constant;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class ConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Integer evaluate(final Constant _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  protected static Integer _privk3_evaluate(final ConstantAspectConstantAspectProperties _self_, final Constant _self) {
    return Integer.valueOf(_self.getValue());
  }
}
