package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;

@Aspect(className = AttributeValue.class)
@SuppressWarnings("all")
public abstract class AttributeValueAspect {
  @Abstract
  protected static int get_value(final AttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspect.get_value((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspect.get_value((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect._privk3_get_value(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  @Abstract
  protected static void set_value(final AttributeValue _self, final int value) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspect.set_value((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue)_self,value);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspect.set_value((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue)_self,value);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect._privk3_set_value(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Abstract
  protected static Attribute get_attribute(final AttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspect.get_attribute((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspect.get_attribute((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect._privk3_get_attribute(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute)result;
  }
  
  @Abstract
  protected static String getString(final AttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspect.getString((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspect.getString((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect._privk3_getString(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static int _privk3_get_value(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_set_value(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self, final int value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static Attribute _privk3_get_attribute(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static String _privk3_getString(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
