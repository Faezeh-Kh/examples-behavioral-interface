package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspect;

@Aspect(className = ActivityFinalNode.class)
@SuppressWarnings("all")
public class ActivityFinalNodeAspect extends FinalNodeAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final ActivityFinalNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectContext
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
		manager.executeStep(_self, command, "ActivityFinalNode", "execute");
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
  
  private static void super_execute(final ActivityFinalNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ActivityFinalNodeAspectActivityFinalNodeAspectProperties _self_, final ActivityFinalNode _self) {
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    final ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
    ActivityNodeAspect.addToken(_self, token);
    System.out.println("Final node reached");
  }
}
