package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Led;
import org.gemoc.arduino.sequential.xarduino.arduino.SetLed;

@Aspect(className = SetLed.class)
@SuppressWarnings("all")
public abstract class SetLedAspect extends ModuleSetAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final SetLed _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "SetLed", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final SetLed _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final SetLedAspectSetLedAspectProperties _self_, final SetLed _self) {
    Led _led = _self.getLed();
    ModuleAspect.level(_led, ExpressionAspect.evaluate(_self.getValue()));
  }
}
