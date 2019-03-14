package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet;

@Aspect(className = ModuleGet.class)
@SuppressWarnings("all")
public class ModuleGetAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Integer evaluate(final ModuleGet _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  protected static Integer _privk3_evaluate(final ModuleGetAspectModuleGetAspectProperties _self_, final ModuleGet _self) {
    return ModuleAspect.level(_self.getModule());
  }
}
