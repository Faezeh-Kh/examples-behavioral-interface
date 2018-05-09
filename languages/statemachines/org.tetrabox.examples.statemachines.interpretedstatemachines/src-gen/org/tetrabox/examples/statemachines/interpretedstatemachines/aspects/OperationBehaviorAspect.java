package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;

@Aspect(className = OperationBehavior.class)
@SuppressWarnings("all")
public class OperationBehaviorAspect {
  protected static void execute(final OperationBehavior _self, final CallEventOccurrence callEventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,callEventOccurrence);;
  }
  
  protected static void _privk3_execute(final OperationBehaviorAspectOperationBehaviorAspectProperties _self_, final OperationBehavior _self, final CallEventOccurrence callEventOccurrence) {
    final Operation op = callEventOccurrence.getOperation();
    EList<Attribute> _outParameters = op.getOutParameters();
    final ArrayList<Attribute> outParameters = new ArrayList<Attribute>(_outParameters);
    final Attribute returnParameter = op.getReturn();
    final Consumer<AttributeValue> _function = (AttributeValue toSet) -> {
      final Attribute attribute = AttributeValueAspect.get_attribute(toSet);
      final int value = AttributeValueAspect.get_value(toSet);
      final Function1<AttributeValue, Boolean> _function_1 = (AttributeValue v) -> {
        Attribute __attribute = AttributeValueAspect.get_attribute(v);
        return Boolean.valueOf(Objects.equal(__attribute, attribute));
      };
      AttributeValue paramValue = IterableExtensions.<AttributeValue>findFirst(CallEventOccurrenceAspect.outParameterValues(callEventOccurrence), _function_1);
      if ((paramValue == null)) {
        if ((attribute instanceof BooleanAttribute)) {
          paramValue = StatemachinesFactory.eINSTANCE.createBooleanAttributeValue();
          ((BooleanAttributeValue) paramValue).setAttribute(((BooleanAttribute)attribute));
        } else {
          paramValue = StatemachinesFactory.eINSTANCE.createIntegerAttributeValue();
          ((IntegerAttributeValue) paramValue).setAttribute(((IntegerAttribute) attribute));
        }
        boolean _contains = outParameters.contains(attribute);
        if (_contains) {
          CallEventOccurrenceAspect.outParameterValues(callEventOccurrence).add(paramValue);
        } else {
          boolean _equals = Objects.equal(returnParameter, attribute);
          if (_equals) {
            CallEventOccurrenceAspect.returnValue(callEventOccurrence, paramValue);
          }
        }
      }
      AttributeValueAspect.set_value(paramValue, value);
    };
    _self.getAttributeValues().forEach(_function);
  }
}
