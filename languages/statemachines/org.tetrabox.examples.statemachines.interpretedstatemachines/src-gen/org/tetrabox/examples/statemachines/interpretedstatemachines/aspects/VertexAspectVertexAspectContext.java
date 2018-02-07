package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public final static VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
