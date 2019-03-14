package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.NamedElement;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue;

@Aspect(className = OperationBehavior.class)
@SuppressWarnings("all")
public class OperationBehaviorAspect extends BehaviorAspect {
  @Step
  @OverrideAspectMethod
  protected static void execute(final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspect._privk3_execute(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior)_self,eventOccurrence);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {eventOccurrence}, command, "OperationBehavior", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspect._privk3_execute(_self_, _self,eventOccurrence);
  }
  
  protected static void _privk3_execute(final OperationBehaviorAspectOperationBehaviorAspectProperties _self_, final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final CallEventOccurrence callEventOccurrence = ((CallEventOccurrence) eventOccurrence);
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
      AttributeValue paramValue = IterableExtensions.<AttributeValue>findFirst(callEventOccurrence.getOutParameterValues(), _function_1);
      if ((paramValue == null)) {
        if ((attribute instanceof BooleanAttribute)) {
          paramValue = StatemachinesFactory.eINSTANCE.createBooleanAttributeValue();
          ((BooleanAttributeValue) paramValue).setAttribute(((BooleanAttribute)attribute));
        } else {
          if ((attribute instanceof IntegerAttribute)) {
            paramValue = StatemachinesFactory.eINSTANCE.createIntegerAttributeValue();
            ((IntegerAttributeValue) paramValue).setAttribute(((IntegerAttribute) attribute));
          } else {
            paramValue = StatemachinesFactory.eINSTANCE.createStringAttributeValue();
            ((StringAttributeValue) paramValue).setAttribute(((StringAttribute) attribute));
          }
        }
        boolean _contains = outParameters.contains(attribute);
        if (_contains) {
          callEventOccurrence.getOutParameterValues().add(paramValue);
        } else {
          boolean _equals = Objects.equal(returnParameter, attribute);
          if (_equals) {
            callEventOccurrence.setReturnValue(paramValue);
          }
        }
      }
      AttributeValueAspect.set_value(paramValue, value);
    };
    _self.getAttributeValues().forEach(_function);
    EObject _eContainer = _self.eContainer();
    String _name = ((NamedElement) _eContainer).getName();
    String _plus = (_name + 
      "(");
    String _name_1 = _self.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ")");
    String _xifexpression = null;
    if ((eventOccurrence != null)) {
      _xifexpression = EventOccurrenceAspect.getParameters(eventOccurrence);
    } else {
      _xifexpression = "";
    }
    String _plus_3 = (_plus_2 + _xifexpression);
    InputOutput.<String>println(_plus_3);
  }
}
