package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue;

@Aspect(className = StringAttributeValue.class)
@SuppressWarnings("all")
public class StringAttributeValueAspect extends AttributeValueAspect {
  @OverrideAspectMethod
  protected static String get_value(final StringAttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String get_value()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspect._privk3_get_value(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue)_self);
    };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  protected static void set_value(final StringAttributeValue _self, final String value) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void set_value(String)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspect._privk3_set_value(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue)_self,value);
    };
  }
  
  @OverrideAspectMethod
  protected static Attribute get_attribute(final StringAttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspect._privk3_get_attribute(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue)_self);
    };
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute)result;
  }
  
  @OverrideAspectMethod
  protected static String getString(final StringAttributeValue _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getString()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspect._privk3_getString(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_get_value(final StringAttributeValueAspectStringAttributeValueAspectProperties _self_, final StringAttributeValue _self) {
    return _self.getValue();
  }
  
  protected static void _privk3_set_value(final StringAttributeValueAspectStringAttributeValueAspectProperties _self_, final StringAttributeValue _self, final String value) {
    _self.setValue(value);
  }
  
  protected static Attribute _privk3_get_attribute(final StringAttributeValueAspectStringAttributeValueAspectProperties _self_, final StringAttributeValue _self) {
    return _self.getAttribute();
  }
  
  protected static String _privk3_getString(final StringAttributeValueAspectStringAttributeValueAspectProperties _self_, final StringAttributeValue _self) {
    return _self.getValue();
  }
}
