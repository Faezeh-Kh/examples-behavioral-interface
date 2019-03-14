package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;

@Aspect(className = org.gemoc.arduino.sequential.xarduino.arduino.Module.class)
@SuppressWarnings("all")
public abstract class ModuleAspect {
  protected static Project getProject(final org.gemoc.arduino.sequential.xarduino.arduino.Module _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Project getProject()
    if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Module){
    	result = org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect._privk3_getProject(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.Module)_self);
    };
    return (org.gemoc.arduino.sequential.xarduino.arduino.Project)result;
  }
  
  public static Integer level(final org.gemoc.arduino.sequential.xarduino.arduino.Module _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_level(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  public static void level(final org.gemoc.arduino.sequential.xarduino.arduino.Module _self, final Integer level) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectContext
			.getSelf(_self);
	_privk3_level(_self_, _self, level);
	;
}
  
  protected static Project _privk3_getProject(final ModuleAspectModuleAspectProperties _self_, final org.gemoc.arduino.sequential.xarduino.arduino.Module _self) {
    Project project = null;
    EObject current = _self.eContainer();
    while ((current != null)) {
      {
        if ((current instanceof Project)) {
          project = ((Project) current);
          return project;
        }
        current = current.eContainer();
      }
    }
    return project;
  }
  
  protected static Integer _privk3_level(final ModuleAspectModuleAspectProperties _self_, final org.gemoc.arduino.sequential.xarduino.arduino.Module _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLevel") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.level;
  }
  
  protected static void _privk3_level(final ModuleAspectModuleAspectProperties _self_, final org.gemoc.arduino.sequential.xarduino.arduino.Module _self, final Integer level) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLevel")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, level);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.level = level;
    }
  }
}
