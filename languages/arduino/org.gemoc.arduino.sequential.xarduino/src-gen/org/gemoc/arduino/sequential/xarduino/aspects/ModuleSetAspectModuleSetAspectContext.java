package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet;

@SuppressWarnings("all")
public class ModuleSetAspectModuleSetAspectContext {
  public final static ModuleSetAspectModuleSetAspectContext INSTANCE = new ModuleSetAspectModuleSetAspectContext();
  
  public static ModuleSetAspectModuleSetAspectProperties getSelf(final ModuleSet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleSet, ModuleSetAspectModuleSetAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet, org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspectModuleSetAspectProperties>();
  
  public Map<ModuleSet, ModuleSetAspectModuleSetAspectProperties> getMap() {
    return map;
  }
}
