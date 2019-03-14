package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@Aspect(className = SignalEventOccurrence.class)
@SuppressWarnings("all")
public class SignalEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final SignalEventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspect._privk3_getParameters(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self) {
    final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf((__attribute != null));
    };
    final Function1<AttributeValue, String> _function_1 = (AttributeValue v) -> {
      String _string = AttributeValueAspect.getString(v);
      String _plus = ("[in=" + _string);
      return (_plus + "]");
    };
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(_self.getAttributeValues(), _function), _function_1));
    return ("" + _join);
  }
}
