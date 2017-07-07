package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties;

@Aspect(className = JoinNode.class)
@SuppressWarnings("all")
public class JoinNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static boolean hasOffers(final JoinNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffers(_self_, _self);
	;
	return (boolean) result;
}
  
  @OverrideAspectMethod
  @Step
  public static void execute(final JoinNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectContext
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
		manager.executeStep(_self, command, "JoinNode", "execute");
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
  
  private static boolean super_hasOffers(final JoinNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge e) -> {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(e);
      boolean _isEmpty = _offeredTokens.isEmpty();
      return Boolean.valueOf((!_isEmpty));
    };
    return IterableExtensions.<ActivityEdge>forall(_incoming, _function);
  }
  
  private static void super_execute(final JoinNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Consumer<ActivityEdge> _function = (ActivityEdge e) -> {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(e);
      ControlToken _head = IterableExtensions.<ControlToken>head(_offeredTokens);
      ActivityNodeAspect.addToken(_self, _head);
    };
    _incoming.forEach(_function);
    EList<ControlToken> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    _heldTokens.clear();
    final ControlToken token = ActivitydiagramFactory.eINSTANCE.createControlToken();
    ActivityNodeAspect.addToken(_self, token);
    ActivityEdge _outgoing = _self.getOutgoing();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_outgoing);
    _offeredTokens.add(token);
  }
}
