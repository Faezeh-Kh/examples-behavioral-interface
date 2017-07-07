package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;

@Aspect(className = AcceptEventAction.class)
@SuppressWarnings("all")
public class AcceptEventActionAspect extends ActivityNodeAspect {
  public static void sendOffer(final AcceptEventAction _self, final ControlToken token) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
			.getSelf(_self);
	_privk3_sendOffer(_self_, _self, token);
	;
}
  
  public static boolean canAccept(final AcceptEventAction _self, final Event event) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_canAccept(_self_, _self, event);
	;
	return (boolean) result;
}
  
  @Step(eventTriggerable = true, precondition = "canAccept")
  public static void accept(final AcceptEventAction _self, final Event event) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_accept(_self_, _self, event);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "AcceptEventAction", "accept");
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
  
  @Step
  public static void waitForEvent(final AcceptEventAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_waitForEvent(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "AcceptEventAction", "waitForEvent");
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
  
  @OverrideAspectMethod
  @Step
  public static void execute(final AcceptEventAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
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
		manager.executeStep(_self, command, "AcceptEventAction", "execute");
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
  
  @OverrideAspectMethod
  public static boolean hasOffers(final AcceptEventAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffers(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static void _privk3_sendOffer(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self, final ControlToken token) {
    ActivityEdge _outgoing = _self.getOutgoing();
    ActivityEdgeAspect.sendOffer(_outgoing, token);
  }
  
  protected static boolean _privk3_canAccept(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self, final Event event) {
    return (Objects.equal(_self.getIncoming(), null) || (!ActivityEdgeAspect.offeredTokens(_self.getIncoming()).isEmpty()));
  }
  
  protected static void _privk3_accept(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self, final Event event) {
    Event _eventType = _self.getEventType();
    EClass _eClass = _eventType.eClass();
    EClass _eClass_1 = event.eClass();
    boolean _equals = Objects.equal(_eClass, _eClass_1);
    if (_equals) {
      ActivityEdge _incoming = _self.getIncoming();
      boolean _equals_1 = Objects.equal(_incoming, null);
      if (_equals_1) {
        ControlToken t = ActivitydiagramFactory.eINSTANCE.createControlToken();
        ActivityNodeAspect.addToken(_self, t);
      } else {
        ActivityEdge _incoming_1 = _self.getIncoming();
        EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming_1);
        final ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
        boolean _notEquals = (!Objects.equal(token, null));
        if (_notEquals) {
          ActivityNodeAspect.addToken(_self, token);
        }
      }
    }
  }
  
  protected static void _privk3_waitForEvent(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self) {
  }
  
  private static void super_execute(final AcceptEventAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self) {
    ActivityEdge _incoming = _self.getIncoming();
    boolean _notEquals = (!Objects.equal(_incoming, null));
    if (_notEquals) {
      while (ActivityNodeAspect.heldTokens(_self).isEmpty()) {
        AcceptEventActionAspect.waitForEvent(_self);
      }
      EList<ControlToken> _heldTokens = ActivityNodeAspect.heldTokens(_self);
      ControlToken _head = IterableExtensions.<ControlToken>head(_heldTokens);
      AcceptEventActionAspect.sendOffer(_self, _head);
    } else {
      EList<ControlToken> _heldTokens_1 = ActivityNodeAspect.heldTokens(_self);
      boolean _isEmpty = _heldTokens_1.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<ControlToken> _heldTokens_2 = ActivityNodeAspect.heldTokens(_self);
        ControlToken _head_1 = IterableExtensions.<ControlToken>head(_heldTokens_2);
        AcceptEventActionAspect.sendOffer(_self, _head_1);
      }
    }
  }
  
  private static boolean super_hasOffers(final AcceptEventAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self) {
    return ((!Objects.equal(_self.getIncoming(), null)) && (!ActivityEdgeAspect.offeredTokens(_self.getIncoming()).isEmpty()));
  }
}
