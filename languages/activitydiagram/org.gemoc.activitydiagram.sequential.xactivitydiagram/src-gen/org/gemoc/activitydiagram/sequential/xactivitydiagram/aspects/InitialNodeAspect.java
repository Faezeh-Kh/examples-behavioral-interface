package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  public static void sendOffer(final InitialNode _self, final ControlToken token) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
			.getSelf(_self);
	_privk3_sendOffer(_self_, _self, token);
	;
}
  
  @OverrideAspectMethod
  @Step
  public static void execute(final InitialNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext
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
		manager.executeStep(_self, command, "InitialNode", "execute");
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
  
  protected static void _privk3_sendOffer(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self, final ControlToken token) {
    ActivityEdge _outgoing = _self.getOutgoing();
    ActivityEdgeAspect.sendOffer(_outgoing, token);
  }
  
  private static void super_execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    ControlToken t = ActivitydiagramFactory.eINSTANCE.createControlToken();
    ActivityNodeAspect.addToken(_self, t);
    InitialNodeAspect.sendOffer(_self, t);
  }
}
