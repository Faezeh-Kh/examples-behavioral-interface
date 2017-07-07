package org.tetrabox.example.xelevator.aspects;

import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.Floor;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties;

@Aspect(className = Button.class)
@SuppressWarnings("all")
public abstract class ButtonAspect {
  @Step(eventTriggerable = true, precondition = "notPressed")
  public static void press(final Button _self) {
	final org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectContext
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
		manager.executeStep(_self, command, "Button", "press");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  public static boolean notPressed(final Button _self) {
	final org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_notPressed(_self_, _self);
	;
	return (boolean) result;
}
  
  public static boolean pressed(final Button _self) {
	final org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_pressed(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void pressed(final Button _self, final boolean pressed) {
	final org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectContext
			.getSelf(_self);
	_privk3_pressed(_self_, _self, pressed);
	;
}
  
  protected static void _privk3_press(final ButtonAspectButtonAspectProperties _self_, final Button _self) {
    Floor _requestedFloor = _self.getRequestedFloor();
    int _nr = _requestedFloor.getNr();
    String _plus = ("Button pressed at floor " + Integer.valueOf(_nr));
    InputOutput.<String>println(_plus);
    ButtonAspect.pressed(_self, true);
  }
  
  protected static boolean _privk3_notPressed(final ButtonAspectButtonAspectProperties _self_, final Button _self) {
    boolean _pressed = ButtonAspect.pressed(_self);
    return (!_pressed);
  }
  
  protected static boolean _privk3_pressed(final ButtonAspectButtonAspectProperties _self_, final Button _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isPressed") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.pressed;
  }
  
  protected static void _privk3_pressed(final ButtonAspectButtonAspectProperties _self_, final Button _self, final boolean pressed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPressed")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, pressed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.pressed = pressed;
    }
  }
}
