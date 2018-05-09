package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
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
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect._privk3_getParameters(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect.getParameters((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String getOutValues(final CallEventOccurrence _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getOutValues(_self_, _self);;
    return (java.lang.String)result;
  }
  
  @Containment
  public static List<AttributeValue> inParameterValues(final CallEventOccurrence _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_inParameterValues(_self_, _self);
	;
	return (java.util.List) result;
}
  
  @Containment
  public static void inParameterValues(final CallEventOccurrence _self, final List<AttributeValue> inParameterValues) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    _privk3_inParameterValues(_self_, _self,inParameterValues);;
  }
  
  @Containment
  public static List<AttributeValue> outParameterValues(final CallEventOccurrence _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_outParameterValues(_self_, _self);
	;
	return (java.util.List) result;
}
  
  @Containment
  public static void outParameterValues(final CallEventOccurrence _self, final List<AttributeValue> outParameterValues) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    _privk3_outParameterValues(_self_, _self,outParameterValues);;
  }
  
  @Containment
  public static AttributeValue returnValue(final CallEventOccurrence _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_returnValue(_self_, _self);
	;
	return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue) result;
}
  
  @Containment
  public static void returnValue(final CallEventOccurrence _self, final AttributeValue returnValue) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectContext
			.getSelf(_self);
	_privk3_returnValue(_self_, _self, returnValue);
	;
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
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(CallEventOccurrenceAspect.inParameterValues(_self), _function), _function_1));
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
    String _join_1 = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(CallEventOccurrenceAspect.outParameterValues(_self), _function_2), _function_3));
    final String outString = ("" + _join_1);
    String _xifexpression = null;
    AttributeValue _returnValue = CallEventOccurrenceAspect.returnValue(_self);
    boolean _tripleNotEquals = (_returnValue != null);
    if (_tripleNotEquals) {
      String _string = AttributeValueAspect.getString(CallEventOccurrenceAspect.returnValue(_self));
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
    String _join = IterableExtensions.join(IterableExtensions.<AttributeValue, String>map(IterableExtensions.<AttributeValue>filter(CallEventOccurrenceAspect.outParameterValues(_self), _function), _function_1));
    final String outString = ("" + _join);
    String _xifexpression = null;
    AttributeValue _returnValue = CallEventOccurrenceAspect.returnValue(_self);
    boolean _tripleNotEquals = (_returnValue != null);
    if (_tripleNotEquals) {
      String _string = AttributeValueAspect.getString(CallEventOccurrenceAspect.returnValue(_self));
      String _plus = ("[out=" + _string);
      _xifexpression = (_plus + "]");
    } else {
      _xifexpression = "";
    }
    final String returnString = ("" + _xifexpression);
    return (outString + returnString);
  }
  
  protected static List<AttributeValue> _privk3_inParameterValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInParameterValues") &&
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
    return _self_.inParameterValues;
  }
  
  protected static void _privk3_inParameterValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self, final List<AttributeValue> inParameterValues) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInParameterValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inParameterValues);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inParameterValues = inParameterValues;
    }
  }
  
  protected static List<AttributeValue> _privk3_outParameterValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOutParameterValues") &&
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
    return _self_.outParameterValues;
  }
  
  protected static void _privk3_outParameterValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self, final List<AttributeValue> outParameterValues) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOutParameterValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, outParameterValues);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.outParameterValues = outParameterValues;
    }
  }
  
  protected static AttributeValue _privk3_returnValue(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getReturnValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.returnValue;
  }
  
  protected static void _privk3_returnValue(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self, final AttributeValue returnValue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setReturnValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, returnValue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.returnValue = returnValue;
    }
  }
}
