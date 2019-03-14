package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet;

@SuppressWarnings("all")
public class ModuleGetAspectModuleGetAspectContext {
  public final static ModuleGetAspectModuleGetAspectContext INSTANCE = new ModuleGetAspectModuleGetAspectContext();
  
  public static ModuleGetAspectModuleGetAspectProperties getSelf(final ModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleGet, ModuleGetAspectModuleGetAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet, org.gemoc.arduino.sequential.xarduino.aspects.ModuleGetAspectModuleGetAspectProperties>();
  
  public Map<ModuleGet, ModuleGetAspectModuleGetAspectProperties> getMap() {
    return map;
  }
}
