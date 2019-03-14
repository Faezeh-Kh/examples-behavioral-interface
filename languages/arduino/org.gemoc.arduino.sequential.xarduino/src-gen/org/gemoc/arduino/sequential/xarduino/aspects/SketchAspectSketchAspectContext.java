package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;

@SuppressWarnings("all")
public class SketchAspectSketchAspectContext {
  public final static SketchAspectSketchAspectContext INSTANCE = new SketchAspectSketchAspectContext();
  
  public static SketchAspectSketchAspectProperties getSelf(final Sketch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sketch, SketchAspectSketchAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Sketch, org.gemoc.arduino.sequential.xarduino.aspects.SketchAspectSketchAspectProperties>();
  
  public Map<Sketch, SketchAspectSketchAspectProperties> getMap() {
    return map;
  }
}
