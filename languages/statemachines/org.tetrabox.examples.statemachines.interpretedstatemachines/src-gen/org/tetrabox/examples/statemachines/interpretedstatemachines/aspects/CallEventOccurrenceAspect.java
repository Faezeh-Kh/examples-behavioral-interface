package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;

@Aspect(className = CallEventOccurrence.class)
@SuppressWarnings("all")
public class CallEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final CallEventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect._privk3_getParameters(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String getOutValues(final CallEventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getOutValues()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect._privk3_getOutValues(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf((__attribute != null));
    };
    final Function1<AttributeValue, String> _function_1 = (AttributeValue v) -> {
      String _string = AttributeValueAspect.getString(v);
      String _plus = ("[in=" + _string);
      return (_plus + "]");
    };
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(_self.getInParameterValues(), _function), _function_1));
    final String inString = ("" + _join);
    final Function1<AttributeValue, Boolean> _function_2 = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf((__attribute != null));
    };
    final Function1<AttributeValue, String> _function_3 = (AttributeValue v) -> {
      String _string = AttributeValueAspect.getString(v);
      String _plus = ("[out=" + _string);
      return (_plus + "]");
    };
    String _join_1 = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(_self.getOutParameterValues(), _function_2), _function_3));
    final String outString = ("" + _join_1);
    String _xifexpression = null;
    AttributeValue _returnValue = _self.getReturnValue();
    boolean _tripleNotEquals = (_returnValue != null);
    if (_tripleNotEquals) {
      String _string = AttributeValueAspect.getString(_self.getReturnValue());
      String _plus = ("[out=" + _string);
      _xifexpression = (_plus + "]");
    } else {
      _xifexpression = "";
    }
    final String returnString = ("" + _xifexpression);
    return ((inString + outString) + returnString);
  }
  
  protected static String _privk3_getOutValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf((__attribute != null));
    };
    final Function1<AttributeValue, String> _function_1 = (AttributeValue v) -> {
      String _string = AttributeValueAspect.getString(v);
      String _plus = ("[out=" + _string);
      return (_plus + "]");
    };
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(_self.getOutParameterValues(), _function), _function_1));
    final String outString = ("" + _join);
    String _xifexpression = null;
    AttributeValue _returnValue = _self.getReturnValue();
    boolean _tripleNotEquals = (_returnValue != null);
    if (_tripleNotEquals) {
      String _string = AttributeValueAspect.getString(_self.getReturnValue());
      String _plus = ("[out=" + _string);
      _xifexpression = (_plus + "]");
    } else {
      _xifexpression = "";
    }
    final String returnString = ("" + _xifexpression);
    return (outString + returnString);
  }
}
