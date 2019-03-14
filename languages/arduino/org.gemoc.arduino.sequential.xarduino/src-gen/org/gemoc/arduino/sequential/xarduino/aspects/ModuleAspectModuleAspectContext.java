package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties;

@SuppressWarnings("all")
public class ModuleAspectModuleAspectContext {
  public final static ModuleAspectModuleAspectContext INSTANCE = new ModuleAspectModuleAspectContext();
  
  public static ModuleAspectModuleAspectProperties getSelf(final org.gemoc.arduino.sequential.xarduino.arduino.Module _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.gemoc.arduino.sequential.xarduino.arduino.Module, ModuleAspectModuleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Module, org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspectModuleAspectProperties>();
  
  public Map<org.gemoc.arduino.sequential.xarduino.arduino.Module, ModuleAspectModuleAspectProperties> getMap() {
    return map;
  }
}
