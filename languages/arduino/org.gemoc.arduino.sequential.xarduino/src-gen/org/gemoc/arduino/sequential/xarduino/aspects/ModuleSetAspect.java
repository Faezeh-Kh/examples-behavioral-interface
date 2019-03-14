package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet;

@Aspect(className = ModuleSet.class)
@SuppressWarnings("all")
public class ModuleSetAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final ModuleSet _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.SetLed) {
		org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.SetLed) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspect._privk3_execute(_self_,
						(org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ModuleSet", "execute");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static void super_execute(final ModuleSet _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleSetAspectModuleSetAspectProperties _self_, final ModuleSet _self) {
  }
}
