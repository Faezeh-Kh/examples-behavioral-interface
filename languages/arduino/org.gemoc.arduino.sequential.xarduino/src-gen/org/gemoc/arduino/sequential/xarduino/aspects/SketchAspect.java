package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.aspects.BlockAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;

@Aspect(className = Sketch.class)
@SuppressWarnings("all")
public class SketchAspect {
  public static void execute(final Sketch _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final SketchAspectSketchAspectProperties _self_, final Sketch _self) {
    while (true) {
      BlockAspect.execute(_self.getBlock());
    }
  }
}
