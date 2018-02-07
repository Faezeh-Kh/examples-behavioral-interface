package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.TransitionKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self, eventOccurrence);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void exitSource(final Transition _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_exitSource(_self_, _self,eventOccurrence);;
  }
  
  private static void enterTarget(final Transition _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_enterTarget(_self_, _self,eventOccurrence);;
  }
  
  private static State getContainingState(final Transition _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getContainingState(_self_, _self);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)result;
  }
  
  private static Region getLeastCommonAncestor(final Transition _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getLeastCommonAncestor(_self_, _self);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region)result;
  }
  
  protected static boolean traversed(final Transition _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_traversed(_self_, _self);;
    return (boolean)result;
  }
  
  protected static void traversed(final Transition _self, final boolean traversed) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_traversed(_self_, _self,traversed);;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final EventOccurrence eventOccurrence) {
    TransitionAspect.exitSource(_self, eventOccurrence);
    TransitionAspect.traversed(_self, true);
    String _name = _self.getName();
    String _plus = ("Traversed " + _name);
    InputOutput.<String>println(_plus);
    TransitionAspect.enterTarget(_self, eventOccurrence);
  }
  
  protected static void _privk3_exitSource(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final EventOccurrence eventOccurrence) {
    TransitionKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case EXTERNAL:
          boolean _isExitable = VertexAspect.isExitable(_self.getSource(), _self);
          if (_isExitable) {
            boolean _isEnterable = VertexAspect.isEnterable(_self.getTarget(), _self);
            if (_isEnterable) {
              VertexAspect.exit(_self.getSource(), _self, eventOccurrence, TransitionAspect.getLeastCommonAncestor(_self));
            } else {
              VertexAspect.exit(_self.getSource(), _self, eventOccurrence, null);
            }
          }
          break;
        case INTERNAL:
          return;
        case LOCAL:
          boolean _isExitable_1 = VertexAspect.isExitable(_self.getSource(), _self);
          if (_isExitable_1) {
            final State containingState = TransitionAspect.getContainingState(_self);
            final ArrayList<Vertex> hierarchy = new ArrayList<Vertex>();
            EObject currentElement = _self.getTarget();
            while ((!Objects.equal(currentElement, containingState))) {
              {
                currentElement = currentElement.eContainer();
                if ((currentElement instanceof Vertex)) {
                  hierarchy.add(((Vertex)currentElement));
                }
              }
            }
            final Vertex vertexToExit = IterableExtensions.<Vertex>last(hierarchy);
            if ((vertexToExit != null)) {
              VertexAspect.exit(vertexToExit, _self, eventOccurrence, null);
            }
            Vertex _source = _self.getSource();
            boolean _notEquals = (!Objects.equal(_source, containingState));
            if (_notEquals) {
              VertexAspect.exit(_self.getSource(), _self, eventOccurrence, TransitionAspect.getLeastCommonAncestor(_self));
            }
          }
          break;
        default:
          break;
      }
    }
  }
  
  protected static void _privk3_enterTarget(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final EventOccurrence eventOccurrence) {
    TransitionKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case EXTERNAL:
          boolean _isEnterable = VertexAspect.isEnterable(_self.getTarget(), _self);
          if (_isEnterable) {
            VertexAspect.enter(_self.getTarget(), _self, eventOccurrence, TransitionAspect.getLeastCommonAncestor(_self));
          } else {
            Vertex _target = _self.getTarget();
            if ((_target instanceof State)) {
              Region targetContainingRegion = _self.getTarget().getContainer();
              RegionAspect.completed(targetContainingRegion, true);
              Vertex _target_1 = _self.getTarget();
              boolean _hasCompleted = StateAspect.hasCompleted(((State) _target_1));
              if (_hasCompleted) {
                Vertex _target_2 = _self.getTarget();
                StateAspect.complete(((State) _target_2));
              }
            }
          }
          break;
        case INTERNAL:
          return;
        case LOCAL:
          boolean _isEnterable_1 = VertexAspect.isEnterable(_self.getTarget(), _self);
          if (_isEnterable_1) {
            Vertex _target_3 = _self.getTarget();
            State _containingState = TransitionAspect.getContainingState(_self);
            boolean _notEquals = (!Objects.equal(_target_3, _containingState));
            if (_notEquals) {
              VertexAspect.enter(_self.getTarget(), _self, eventOccurrence, TransitionAspect.getLeastCommonAncestor(_self));
            }
          }
          break;
        default:
          break;
      }
    }
  }
  
  protected static State _privk3_getContainingState(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    State containingState = null;
    boolean _contains = VertexAspect.contains(_self.getSource(), _self.getTarget());
    if (_contains) {
      Vertex _source = _self.getSource();
      containingState = ((State) _source);
    } else {
      Vertex _target = _self.getTarget();
      containingState = ((State) _target);
    }
    return containingState;
  }
  
  protected static Region _privk3_getLeastCommonAncestor(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    final ArrayList<Region> sourceAncestors = new ArrayList<Region>();
    final ArrayList<Region> targetAncestors = new ArrayList<Region>();
    EObject currentAncestor = _self.getSource().getContainer();
    while ((!(currentAncestor instanceof StateMachine))) {
      {
        if ((currentAncestor instanceof Region)) {
          sourceAncestors.add(((Region)currentAncestor));
        }
        currentAncestor = currentAncestor.eContainer();
      }
    }
    currentAncestor = _self.getTarget().getContainer();
    while ((!(currentAncestor instanceof StateMachine))) {
      {
        if ((currentAncestor instanceof Region)) {
          targetAncestors.add(((Region)currentAncestor));
        }
        currentAncestor = currentAncestor.eContainer();
      }
    }
    Region result = null;
    for (int i = 0; (((i < sourceAncestors.size()) && (i < targetAncestors.size())) && (result == null)); i++) {
      Region _get = sourceAncestors.get(i);
      Region _get_1 = targetAncestors.get(i);
      boolean _equals = Objects.equal(_get, _get_1);
      if (_equals) {
        result = sourceAncestors.get(i);
      }
    }
    return result;
  }
  
  protected static boolean _privk3_traversed(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isTraversed") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.traversed;
  }
  
  protected static void _privk3_traversed(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final boolean traversed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTraversed")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, traversed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.traversed = traversed;
    }
  }
}
