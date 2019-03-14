package org.tetrabox.examples.petrinet.semantics;

import java.util.Map;

import org.tetrabox.examples.petrinet.model.petrinet.Transition;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.petrinet.model.petrinet.Transition, TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
