package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.aspects.BlockAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final If _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectContext
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
		manager.executeStep(_self, command, "If", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final If _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.ControlAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IfAspectIfAspectProperties _self_, final If _self) {
    Integer _evaluate = ExpressionAspect.evaluate(_self.getCondition());
    boolean _notEquals = ((_evaluate).intValue() != 0);
    if (_notEquals) {
      BlockAspect.execute(_self.getBlock());
    } else {
      Block _elseBlock = _self.getElseBlock();
      boolean _tripleNotEquals = (_elseBlock != null);
      if (_tripleNotEquals) {
        BlockAspect.execute(_self.getElseBlock());
      }
    }
  }
}
