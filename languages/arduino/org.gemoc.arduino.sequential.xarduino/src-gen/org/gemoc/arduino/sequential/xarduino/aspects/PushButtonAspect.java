package org.gemoc.arduino.sequential.xarduino.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduino.arduino.WaitFor;

@Aspect(className = PushButton.class)
@SuppressWarnings("all")
public class PushButtonAspect extends ModuleAspect {
  @Step
  public static void press(final PushButton _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_press(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "PushButton", "press");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void release(final PushButton _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_release(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "PushButton", "release");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_press(final PushButtonAspectPushButtonAspectProperties _self_, final PushButton _self) {
    ModuleAspect.level(_self, Integer.valueOf(1));
    final Function1<WaitFor, Boolean> _function = (WaitFor w) -> {
      org.gemoc.arduino.sequential.xarduino.arduino.Module _module = w.getModule();
      return Boolean.valueOf(Objects.equal(_module, _self));
    };
    final Procedure1<WaitFor> _function_1 = (WaitFor w) -> {
      WaitForAspect.setActivated(w);
    };
    IteratorExtensions.<WaitFor>forEach(IteratorExtensions.<WaitFor>filter(Iterators.<WaitFor>filter(ModuleAspect.getProject(_self).getSketch().eAllContents(), WaitFor.class), _function), _function_1);
  }
  
  protected static void _privk3_release(final PushButtonAspectPushButtonAspectProperties _self_, final PushButton _self) {
    ModuleAspect.level(_self, Integer.valueOf(0));
  }
}
