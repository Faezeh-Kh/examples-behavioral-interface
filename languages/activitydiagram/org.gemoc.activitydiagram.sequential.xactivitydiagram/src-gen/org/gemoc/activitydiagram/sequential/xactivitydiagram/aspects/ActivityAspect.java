package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @InitializeModel
  public static void initializeModel(final Activity _self, final EList<String> args) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  @Main
  public static void main(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  @Step
  public static void execute(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Activity", "execute");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_initializeModel(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final EList<String> args) {
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.execute(_self);
  }
  
  private static void super_execute(final Activity _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function = (Variable v) -> {
      VariableAspect.init(v);
    };
    _locals.forEach(_function);
    EList<ActivityNode> _nodes = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_1 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    Iterable<ActivityNode> _filter = IterableExtensions.<ActivityNode>filter(_nodes, _function_1);
    final ActivityNode initialNode = IterableExtensions.<ActivityNode>head(_filter);
    ActivityNode toExecute = null;
    EList<ActivityNode> _nodes_1 = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf(((node instanceof AcceptEventAction) && Objects.equal(((AcceptEventAction) node).getIncoming(), null)));
    };
    Iterable<ActivityNode> _filter_1 = IterableExtensions.<ActivityNode>filter(_nodes_1, _function_2);
    final List<ActivityNode> freeAcceptEventActions = IterableExtensions.<ActivityNode>toList(_filter_1);
    final boolean finiteExecution = freeAcceptEventActions.isEmpty();
    boolean _notEquals = (!Objects.equal(initialNode, null));
    if (_notEquals) {
      ActivityNodeAspect.execute(initialNode);
    }
    EList<ActivityNode> _nodes_2 = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
      return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(_nodes_2, _function_3);
    if (finiteExecution) {
      while (((!Objects.equal(list, null)) && (IterableExtensions.size(list) > 0))) {
        {
          final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
          ActivityNode _get = ((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0];
          toExecute = _get;
          ActivityNodeAspect.execute(toExecute);
          EList<ActivityNode> _nodes_3 = _self.getNodes();
          final Function1<ActivityNode, Boolean> _function_4 = (ActivityNode node) -> {
            return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
          };
          Iterable<ActivityNode> _filter_2 = IterableExtensions.<ActivityNode>filter(_nodes_3, _function_4);
          list = _filter_2;
        }
      }
    } else {
      final Random rand = new Random();
      final int size = freeAcceptEventActions.size();
      while (true) {
        {
          int _size = IterableExtensions.size(list);
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
            ActivityNode _get = ((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0];
            toExecute = _get;
          } else {
            int _nextInt = rand.nextInt(size);
            ActivityNode _get_1 = freeAcceptEventActions.get(_nextInt);
            toExecute = _get_1;
          }
          ActivityNodeAspect.execute(toExecute);
          EList<ActivityNode> _nodes_3 = _self.getNodes();
          final Function1<ActivityNode, Boolean> _function_4 = (ActivityNode node) -> {
            return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
          };
          Iterable<ActivityNode> _filter_2 = IterableExtensions.<ActivityNode>filter(_nodes_3, _function_4);
          list = _filter_2;
        }
      }
    }
  }
}
