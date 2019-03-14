package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

@Aspect(className = EventOccurrence.class)
@SuppressWarnings("all")
public abstract class EventOccurrenceAspect {
  @Abstract
  protected static String getParameters(final EventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect#String getParameters() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspect.getParameters((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect#String getParameters() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect#String getParameters() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect.getParameters((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect#String getParameters() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect._privk3_getParameters(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final EventOccurrenceAspectEventOccurrenceAspectProperties _self_, final EventOccurrence _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
