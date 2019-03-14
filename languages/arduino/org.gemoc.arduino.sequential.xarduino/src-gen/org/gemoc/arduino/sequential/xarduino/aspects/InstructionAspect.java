package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static void execute(final Instruction _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.SetLed) {
		org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.SetLed) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If) {
		org.gemoc.arduino.sequential.xarduino.aspects.IfAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor) {
		org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.WaitFor) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While) {
		org.gemoc.arduino.sequential.xarduino.aspects.WhileAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control) {
		org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Control) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet) {
		org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Delay) {
		org.gemoc.arduino.sequential.xarduino.aspects.DelayAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Delay) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Instruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static void finalize(final Instruction _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectContext
			.getSelf(_self);
	_privk3_finalize(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
