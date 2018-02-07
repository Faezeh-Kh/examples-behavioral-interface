package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;

@SuppressWarnings("all")
public class PseudostateAspectPseudostateAspectContext {
  public final static PseudostateAspectPseudostateAspectContext INSTANCE = new PseudostateAspectPseudostateAspectContext();
  
  public static PseudostateAspectPseudostateAspectProperties getSelf(final Pseudostate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties>();
  
  public Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> getMap() {
    return map;
  }
}
