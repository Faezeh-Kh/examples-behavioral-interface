package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@Aspect(className = SignalEventOccurrence.class)
@SuppressWarnings("all")
public class SigmalEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final SignalEventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspect._privk3_getParameters(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect.getParameters((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @Containment
  public static List<AttributeValue> attributeValues(final SignalEventOccurrence _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_attributeValues(_self_, _self);
	;
	return (java.util.List) result;
}
  
  @Containment
  public static void attributeValues(final SignalEventOccurrence _self, final List<AttributeValue> attributeValues) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext.getSelf(_self);
    _privk3_attributeValues(_self_, _self,attributeValues);;
  }
  
  protected static String _privk3_getParameters(final SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self) {
    final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf((__attribute != null));
    };
    final Function1<AttributeValue, String> _function_1 = (AttributeValue v) -> {
      String _string = AttributeValueAspect.getString(v);
      String _plus = ("[in=" + _string);
      return (_plus + "]");
    };
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(SigmalEventOccurrenceAspect.attributeValues(_self), _function), _function_1));
    return ("" + _join);
  }
  
  protected static List<AttributeValue> _privk3_attributeValues(final SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getAttributeValues") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.attributeValues;
  }
  
  protected static void _privk3_attributeValues(final SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self, final List<AttributeValue> attributeValues) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setAttributeValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, attributeValues);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.attributeValues = attributeValues;
    }
  }
}
