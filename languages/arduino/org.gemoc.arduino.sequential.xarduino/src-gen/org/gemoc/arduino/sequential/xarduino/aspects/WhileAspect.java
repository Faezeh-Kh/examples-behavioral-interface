package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.BlockAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlAspect {
  @OverrideAspectMethod
  public static void execute(final While _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final While _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final WhileAspectWhileAspectProperties _self_, final While _self) {
    while (((ExpressionAspect.evaluate(_self.getCondition())).intValue() != 0)) {
      BlockAspect.execute(_self.getBlock());
    }
  }
}
