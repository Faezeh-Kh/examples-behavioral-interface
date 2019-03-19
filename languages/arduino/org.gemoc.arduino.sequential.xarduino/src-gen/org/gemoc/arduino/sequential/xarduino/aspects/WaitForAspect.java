package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.WaitFor;

@Aspect(className = WaitFor.class)
@SuppressWarnings("all")
public class WaitForAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final WaitFor _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext
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
		manager.executeStep(_self, command, "WaitFor", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static boolean isValidated(final WaitFor _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValidated()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	result = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_isValidated(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  @Step
  private static void loop(final WaitFor _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void loop()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_loop(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "WaitFor", "loop");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static void setActivated(final WaitFor _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext
			.getSelf(_self);
	_privk3_setActivated(_self_, _self);
	;
}
  
  private static boolean waiting(final WaitFor _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean waiting()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	result = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_waiting(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  private static void waiting(final WaitFor _self, final boolean waiting) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void waiting(boolean)
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_waiting(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self,waiting);
    };
  }
  
  private static boolean moduleActivated(final WaitFor _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean moduleActivated()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	result = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_moduleActivated(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  private static void moduleActivated(final WaitFor _self, final boolean moduleActivated) {
    final org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void moduleActivated(boolean)
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspect._privk3_moduleActivated(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.WaitFor)_self,moduleActivated);
    };
  }
  
  private static void super_execute(final WaitFor _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    if (((_self.getValue() != null) && WaitForAspect.isValidated(_self))) {
      WaitForAspect.moduleActivated(_self, false);
      WaitForAspect.waiting(_self, false);
      return;
    }
    WaitForAspect.waiting(_self, true);
    while ((!(WaitForAspect.moduleActivated(_self) && WaitForAspect.isValidated(_self)))) {
      {
        WaitForAspect.moduleActivated(_self, false);
        WaitForAspect.loop(_self);
      }
    }
    WaitForAspect.moduleActivated(_self, false);
    WaitForAspect.waiting(_self, false);
  }
  
  protected static boolean _privk3_isValidated(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    return ((_self.getValue() == null) || ((ModuleAspect.level(_self.getModule())).intValue() == _self.getValue().getValue()));
  }
  
  protected static void _privk3_loop(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
      Thread.sleep(100);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_setActivated(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    boolean _waiting = WaitForAspect.waiting(_self);
    if (_waiting) {
      WaitForAspect.moduleActivated(_self, true);
    }
  }
  
  protected static boolean _privk3_waiting(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isWaiting") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.waiting;
  }
  
  protected static void _privk3_waiting(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self, final boolean waiting) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setWaiting")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, waiting);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.waiting = waiting;
    }
  }
  
  protected static boolean _privk3_moduleActivated(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isModuleActivated") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.moduleActivated;
  }
  
  protected static void _privk3_moduleActivated(final WaitForAspectWaitForAspectProperties _self_, final WaitFor _self, final boolean moduleActivated) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setModuleActivated")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, moduleActivated);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.moduleActivated = moduleActivated;
    }
  }
}
