package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  protected static boolean evaluate(final Constraint _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspect._privk3_evaluate(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final EventOccurrence eventOccurrence) {
    final Object attribute = _self.getAttribute();
    if ((attribute == null)) {
      return true;
    }
    ArrayList<AttributeValue> _xifexpression = null;
    if ((eventOccurrence instanceof SignalEventOccurrence)) {
      EList<AttributeValue> _attributeValues = ((SignalEventOccurrence)eventOccurrence).getAttributeValues();
      _xifexpression = new ArrayList<AttributeValue>(_attributeValues);
    } else {
      ArrayList<AttributeValue> _xifexpression_1 = null;
      if ((eventOccurrence instanceof CallEventOccurrence)) {
        ArrayList<AttributeValue> _xblockexpression = null;
        {
          EList<AttributeValue> _inParameterValues = ((CallEventOccurrence)eventOccurrence).getInParameterValues();
          final ArrayList<AttributeValue> result = new ArrayList<AttributeValue>(_inParameterValues);
          result.addAll(((CallEventOccurrence)eventOccurrence).getOutParameterValues());
          result.add(((CallEventOccurrence)eventOccurrence).getReturnValue());
          _xblockexpression = result;
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    final ArrayList<AttributeValue> values = _xifexpression;
    final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
      Attribute __attribute = AttributeValueAspect.get_attribute(v);
      return Boolean.valueOf(Objects.equal(__attribute, attribute));
    };
    final AttributeValue eventAttributeValue = IterableExtensions.<AttributeValue>findFirst(values, _function);
    if ((eventAttributeValue == null)) {
      return false;
    }
    Object _value = _self.getValue();
    if ((_value instanceof Boolean)) {
      int __value = AttributeValueAspect.get_value(eventAttributeValue);
      int _xifexpression_2 = (int) 0;
      Object _value_1 = _self.getValue();
      if ((((Boolean) _value_1)).booleanValue()) {
        _xifexpression_2 = 1;
      } else {
        _xifexpression_2 = 0;
      }
      return (__value == _xifexpression_2);
    }
    int __value_1 = AttributeValueAspect.get_value(eventAttributeValue);
    Object _value_2 = _self.getValue();
    return Objects.equal(Integer.valueOf(__value_1), _value_2);
  }
}
