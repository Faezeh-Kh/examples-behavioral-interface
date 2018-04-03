package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind;
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
  
  private static Region getRegion(final Transition _self, final EObject object) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getRegion(_self_, _self,object);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region)result;
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
  
  private static Region _leastCommonAncestor(final Transition _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3__leastCommonAncestor(_self_, _self);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region)result;
  }
  
  private static void _leastCommonAncestor(final Transition _self, final Region _leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3__leastCommonAncestor(_self_, _self,_leastCommonAncestor);;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final EventOccurrence eventOccurrence) {
    TransitionAspect.exitSource(_self, eventOccurrence);
    Behavior _effect = _self.getEffect();
    boolean _tripleNotEquals = (_effect != null);
    if (_tripleNotEquals) {
      String _name = _self.getName();
      String _plus = (_name + "(");
      String _name_1 = _self.getEffect().getName();
      String _plus_1 = (_plus + _name_1);
      String _plus_2 = (_plus_1 + ")");
      InputOutput.<String>println(_plus_2);
    }
    TransitionAspect.traversed(_self, true);
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
            final Function1<Region, Boolean> _function = (Region r) -> {
              Region _container = _self.getTarget().getContainer();
              return Boolean.valueOf(Objects.equal(r, _container));
            };
            final Region containingRegion = IterableExtensions.<Region>findFirst(containingState.getRegions(), _function);
            if ((containingRegion != null)) {
              final Function1<Vertex, Boolean> _function_1 = (Vertex it) -> {
                return Boolean.valueOf(VertexAspect.isActive(it));
              };
              final Vertex vertexToExit = IterableExtensions.<Vertex>findFirst(containingRegion.getVertice(), _function_1);
              if ((vertexToExit != null)) {
                VertexAspect.exit(vertexToExit, _self, eventOccurrence, null);
              }
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
    if (((_self.getSource() instanceof Pseudostate) && Objects.equal(((Pseudostate) _self.getSource()).getKind(), PseudostateKind.ENTRYPOINT))) {
      Vertex _source = _self.getSource();
      return ((Pseudostate) _source).getState();
    }
    boolean _contains = VertexAspect.contains(_self.getSource(), _self.getTarget());
    if (_contains) {
      Vertex _source_1 = _self.getSource();
      return ((State) _source_1);
    }
    Vertex _target = _self.getTarget();
    return ((State) _target);
  }
  
  protected static Region _privk3_getRegion(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final EObject object) {
    if ((object instanceof Region)) {
      return ((Region) object);
    } else {
      if ((object instanceof State)) {
        return ((State) object).getContainer();
      }
    }
    return null;
  }
  
  protected static Region _privk3_getLeastCommonAncestor(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    State _parentState = VertexAspect.getParentState(_self.getSource());
    State _parentState_1 = VertexAspect.getParentState(_self.getTarget());
    boolean _notEquals = (!Objects.equal(_parentState, _parentState_1));
    if (_notEquals) {
      Region __leastCommonAncestor = TransitionAspect._leastCommonAncestor(_self);
      boolean _tripleEquals = (__leastCommonAncestor == null);
      if (_tripleEquals) {
        Region result = null;
        State parentSourceState = VertexAspect.getParentState(_self.getSource());
        State parentTargetState = VertexAspect.getParentState(_self.getTarget());
        if ((((parentSourceState != null) && parentSourceState.getConnectionPoint().contains(_self.getSource())) && 
          StateAspect.contains(parentSourceState, _self.getTarget()))) {
          final Function1<Region, Boolean> _function = (Region it) -> {
            return Boolean.valueOf(RegionAspect.contains(it, _self.getTarget()));
          };
          result = IterableExtensions.<Region>findFirst(parentSourceState.getRegions(), _function);
        } else {
          if ((((parentTargetState != null) && parentTargetState.getConnectionPoint().contains(_self.getTarget())) && 
            StateAspect.contains(parentTargetState, _self.getSource()))) {
            final Function1<Region, Boolean> _function_1 = (Region it) -> {
              return Boolean.valueOf(RegionAspect.contains(it, _self.getSource()));
            };
            result = IterableExtensions.<Region>findFirst(parentTargetState.getRegions(), _function_1);
          } else {
            final ArrayList<EObject> sourceAncestors = new ArrayList<EObject>();
            final ArrayList<EObject> targetAncestors = new ArrayList<EObject>();
            EObject currentAncestor = _self.getSource().eContainer();
            while ((!(currentAncestor instanceof StateMachine))) {
              {
                if (((currentAncestor instanceof Region) || (currentAncestor instanceof State))) {
                  sourceAncestors.add(currentAncestor);
                }
                currentAncestor = currentAncestor.eContainer();
              }
            }
            currentAncestor = _self.getTarget().eContainer();
            while ((!(currentAncestor instanceof StateMachine))) {
              {
                if (((currentAncestor instanceof Region) || (currentAncestor instanceof State))) {
                  targetAncestors.add(currentAncestor);
                }
                currentAncestor = currentAncestor.eContainer();
              }
            }
            for (int i = 0; ((i < sourceAncestors.size()) && (result == null)); i++) {
              for (int j = 0; ((j < targetAncestors.size()) && (result == null)); j++) {
                EObject _get = sourceAncestors.get(i);
                EObject _get_1 = targetAncestors.get(j);
                boolean _equals = Objects.equal(_get, _get_1);
                if (_equals) {
                  result = TransitionAspect.getRegion(_self, sourceAncestors.get(i));
                }
              }
            }
          }
        }
        TransitionAspect._leastCommonAncestor(_self, result);
      }
    }
    return TransitionAspect._leastCommonAncestor(_self);
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
  
  protected static Region _privk3__leastCommonAncestor(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("get_leastCommonAncestor") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_._leastCommonAncestor;
  }
  
  protected static void _privk3__leastCommonAncestor(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Region _leastCommonAncestor) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("set_leastCommonAncestor")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, _leastCommonAncestor);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_._leastCommonAncestor = _leastCommonAncestor;
    }
  }
}
