package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class ControlAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While) {
		org.gemoc.arduino.sequential.xarduino.aspects.WhileAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If) {
		org.gemoc.arduino.sequential.xarduino.aspects.IfAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control) {
		org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Control) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static void super_execute(final Control _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ControlAspectControlAspectProperties _self_, final Control _self) {
  }
}
