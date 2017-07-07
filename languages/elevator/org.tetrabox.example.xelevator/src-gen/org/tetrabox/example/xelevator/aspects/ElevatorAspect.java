package org.tetrabox.example.xelevator.aspects;

import com.google.common.collect.Iterables;
import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.DownButton;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.UpButton;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.xelevator.aspects.ButtonAspect;
import org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties;
import org.tetrabox.example.xelevator.aspects.FloorAspect;

@Aspect(className = Elevator.class)
@SuppressWarnings("all")
public class ElevatorAspect {
  @Main
  public static void run(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	_privk3_run(_self_, _self);
	;
}
  
  @Step
  public static void openDoorUp(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_openDoorUp(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "openDoorUp");
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
  public static void openDoorDown(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_openDoorDown(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "openDoorDown");
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
  public static void closeDoor(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_closeDoor(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "closeDoor");
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
  public static void changeToDown(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_changeToDown(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "changeToDown");
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
  public static void changeToUp(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_changeToUp(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "changeToUp");
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
  public static void moveUp(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_moveUp(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "moveUp");
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
  public static void moveDown(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_moveDown(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Elevator", "moveDown");
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
  
  public static boolean doorsOpen(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_doorsOpen(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void doorsOpen(final Elevator _self, final boolean doorsOpen) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	_privk3_doorsOpen(_self_, _self, doorsOpen);
	;
}
  
  public static boolean goingUp(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_goingUp(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void goingUp(final Elevator _self, final boolean goingUp) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	_privk3_goingUp(_self_, _self, goingUp);
	;
}
  
  public static Floor currentFloor(final Elevator _self) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentFloor(_self_, _self);
	;
	return (org.tetrabox.example.xelevator.elevator.Floor) result;
}
  
  public static void currentFloor(final Elevator _self, final Floor currentFloor) {
	final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext
			.getSelf(_self);
	_privk3_currentFloor(_self_, _self, currentFloor);
	;
}
  
  private static List<Consumer<Elevator>> commands(final Elevator _self) {
    final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_commands(_self_, _self);;
    return (java.util.List<java.util.function.Consumer<org.tetrabox.example.xelevator.elevator.Elevator>>)result;
  }
  
  private static void commands(final Elevator _self, final List<Consumer<Elevator>> commands) {
    final org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectContext.getSelf(_self);
    _privk3_commands(_self_, _self,commands);;
  }
  
  protected static void _privk3_run(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
    final Consumer<Elevator> _function = (Elevator e) -> {
      ElevatorAspect.openDoorUp(e);
    };
    _commands.add(_function);
    while ((!ElevatorAspect.commands(_self).isEmpty())) {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      Consumer<Elevator> _remove = _commands_1.remove(0);
      _remove.accept(_self);
    }
  }
  
  protected static void _privk3_openDoorUp(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    List<Button> litButtons = null;
    if (((!ElevatorAspect.doorsOpen(_self)) && ElevatorAspect.goingUp(_self))) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        Floor _requestedFloor = it.getRequestedFloor();
        int _nr = _requestedFloor.getNr();
        Floor _currentFloor = ElevatorAspect.currentFloor(_self);
        int _nr_1 = _currentFloor.getNr();
        return Boolean.valueOf((_nr == _nr_1));
      };
      Iterable<ElevatorButton> _filter = IterableExtensions.<ElevatorButton>filter(_elevatorButtons, _function);
      final Function1<ElevatorButton, Button> _function_1 = (ElevatorButton b) -> {
        return ((Button) b);
      };
      Iterable<Button> _map = IterableExtensions.<ElevatorButton, Button>map(_filter, _function_1);
      final List<Button> buttons = IterableExtensions.<Button>toList(_map);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      EList<Button> _floorButtons = _currentFloor.getFloorButtons();
      final Function1<Button, Boolean> _function_2 = (Button b) -> {
        return Boolean.valueOf((b instanceof UpButton));
      };
      Iterable<Button> _filter_1 = IterableExtensions.<Button>filter(_floorButtons, _function_2);
      Iterables.<Button>addAll(buttons, _filter_1);
      final Function1<Button, Boolean> _function_3 = (Button it) -> {
        return Boolean.valueOf(ButtonAspect.pressed(it));
      };
      Iterable<Button> _filter_2 = IterableExtensions.<Button>filter(buttons, _function_3);
      List<Button> _list = IterableExtensions.<Button>toList(_filter_2);
      litButtons = _list;
      boolean _isEmpty = litButtons.isEmpty();
      boolean _not = (!_isEmpty);
      match = _not;
    }
    if (match) {
      final Consumer<Button> _function_4 = (Button it) -> {
        ButtonAspect.pressed(it, false);
      };
      litButtons.forEach(_function_4);
      ElevatorAspect.doorsOpen(_self, true);
      Floor _currentFloor_1 = ElevatorAspect.currentFloor(_self);
      int _nr = _currentFloor_1.getNr();
      String _plus = ("Elevator stopped at floor " + Integer.valueOf(_nr));
      InputOutput.<String>println(_plus);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_5 = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function_5);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_6 = (Elevator e) -> {
        ElevatorAspect.openDoorDown(e);
      };
      _commands_1.add(_function_6);
    }
  }
  
  protected static void _privk3_openDoorDown(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    List<Button> litButtons = null;
    if (((!ElevatorAspect.doorsOpen(_self)) && (!ElevatorAspect.goingUp(_self)))) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        Floor _requestedFloor = it.getRequestedFloor();
        int _nr = _requestedFloor.getNr();
        Floor _currentFloor = ElevatorAspect.currentFloor(_self);
        int _nr_1 = _currentFloor.getNr();
        return Boolean.valueOf((_nr == _nr_1));
      };
      Iterable<ElevatorButton> _filter = IterableExtensions.<ElevatorButton>filter(_elevatorButtons, _function);
      final Function1<ElevatorButton, Button> _function_1 = (ElevatorButton b) -> {
        return ((Button) b);
      };
      Iterable<Button> _map = IterableExtensions.<ElevatorButton, Button>map(_filter, _function_1);
      final List<Button> buttons = IterableExtensions.<Button>toList(_map);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      EList<Button> _floorButtons = _currentFloor.getFloorButtons();
      final Function1<Button, Boolean> _function_2 = (Button b) -> {
        return Boolean.valueOf((b instanceof DownButton));
      };
      Iterable<Button> _filter_1 = IterableExtensions.<Button>filter(_floorButtons, _function_2);
      Iterables.<Button>addAll(buttons, _filter_1);
      final Function1<Button, Boolean> _function_3 = (Button it) -> {
        return Boolean.valueOf(ButtonAspect.pressed(it));
      };
      Iterable<Button> _filter_2 = IterableExtensions.<Button>filter(buttons, _function_3);
      List<Button> _list = IterableExtensions.<Button>toList(_filter_2);
      litButtons = _list;
      boolean _isEmpty = litButtons.isEmpty();
      boolean _not = (!_isEmpty);
      match = _not;
    }
    if (match) {
      final Consumer<Button> _function_4 = (Button it) -> {
        ButtonAspect.pressed(it, false);
      };
      litButtons.forEach(_function_4);
      ElevatorAspect.doorsOpen(_self, true);
      Floor _currentFloor_1 = ElevatorAspect.currentFloor(_self);
      int _nr = _currentFloor_1.getNr();
      String _plus = ("Elevator stopped at floor " + Integer.valueOf(_nr));
      InputOutput.<String>println(_plus);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_5 = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function_5);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_6 = (Elevator e) -> {
        ElevatorAspect.closeDoor(e);
      };
      _commands_1.add(_function_6);
    }
  }
  
  protected static void _privk3_closeDoor(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    final boolean match = ElevatorAspect.doorsOpen(_self);
    if (match) {
      ElevatorAspect.doorsOpen(_self, false);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_1 = (Elevator e) -> {
        ElevatorAspect.changeToDown(e);
      };
      _commands_1.add(_function_1);
    }
  }
  
  protected static void _privk3_changeToDown(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    boolean _goingUp = ElevatorAspect.goingUp(_self);
    if (_goingUp) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        return Boolean.valueOf((ButtonAspect.pressed(it) && (it.getRequestedFloor().getNr() < ElevatorAspect.currentFloor(_self).getNr())));
      };
      final boolean elevatorButtonMatch = IterableExtensions.<ElevatorButton>exists(_elevatorButtons, _function);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      final boolean floorButtonMatch = FloorAspect.hasLowerFloorLitButton(_currentFloor);
      match = (elevatorButtonMatch || floorButtonMatch);
    }
    if (match) {
      ElevatorAspect.goingUp(_self, false);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_1 = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function_1);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_2 = (Elevator e) -> {
        ElevatorAspect.changeToUp(e);
      };
      _commands_1.add(_function_2);
    }
  }
  
  protected static void _privk3_changeToUp(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    boolean _goingUp = ElevatorAspect.goingUp(_self);
    boolean _not = (!_goingUp);
    if (_not) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        return Boolean.valueOf((ButtonAspect.pressed(it) && (it.getRequestedFloor().getNr() > ElevatorAspect.currentFloor(_self).getNr())));
      };
      final boolean elevatorButtonMatch = IterableExtensions.<ElevatorButton>exists(_elevatorButtons, _function);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      final boolean floorButtonMatch = FloorAspect.hasUpperFloorLitButton(_currentFloor);
      match = (elevatorButtonMatch || floorButtonMatch);
    }
    if (match) {
      ElevatorAspect.goingUp(_self, true);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_1 = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function_1);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_2 = (Elevator e) -> {
        ElevatorAspect.moveUp(e);
      };
      _commands_1.add(_function_2);
    }
  }
  
  protected static void _privk3_moveUp(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    if ((ElevatorAspect.goingUp(_self) && (!ElevatorAspect.doorsOpen(_self)))) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        return Boolean.valueOf((ButtonAspect.pressed(it) && (it.getRequestedFloor().getNr() > ElevatorAspect.currentFloor(_self).getNr())));
      };
      final boolean elevatorButtonMatch = IterableExtensions.<ElevatorButton>exists(_elevatorButtons, _function);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      final boolean floorButtonMatch = FloorAspect.hasUpperFloorLitButton(_currentFloor);
      match = (elevatorButtonMatch || floorButtonMatch);
    }
    if (match) {
      Floor _currentFloor_1 = ElevatorAspect.currentFloor(_self);
      Floor _next = _currentFloor_1.getNext();
      ElevatorAspect.currentFloor(_self, _next);
      List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_1 = (Elevator e) -> {
        ElevatorAspect.openDoorUp(e);
      };
      _commands.add(_function_1);
    } else {
      List<Consumer<Elevator>> _commands_1 = ElevatorAspect.commands(_self);
      final Consumer<Elevator> _function_2 = (Elevator e) -> {
        ElevatorAspect.moveDown(e);
      };
      _commands_1.add(_function_2);
    }
  }
  
  protected static void _privk3_moveDown(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    boolean match = false;
    if (((!ElevatorAspect.goingUp(_self)) && (!ElevatorAspect.doorsOpen(_self)))) {
      EList<ElevatorButton> _elevatorButtons = _self.getElevatorButtons();
      final Function1<ElevatorButton, Boolean> _function = (ElevatorButton it) -> {
        return Boolean.valueOf((ButtonAspect.pressed(it) && (it.getRequestedFloor().getNr() < ElevatorAspect.currentFloor(_self).getNr())));
      };
      final boolean elevatorButtonMatch = IterableExtensions.<ElevatorButton>exists(_elevatorButtons, _function);
      Floor _currentFloor = ElevatorAspect.currentFloor(_self);
      final boolean floorButtonMatch = FloorAspect.hasLowerFloorLitButton(_currentFloor);
      match = (elevatorButtonMatch || floorButtonMatch);
    }
    if (match) {
      Floor _currentFloor_1 = ElevatorAspect.currentFloor(_self);
      Floor _previous = _currentFloor_1.getPrevious();
      ElevatorAspect.currentFloor(_self, _previous);
    }
    List<Consumer<Elevator>> _commands = ElevatorAspect.commands(_self);
    final Consumer<Elevator> _function_1 = (Elevator e) -> {
      ElevatorAspect.openDoorUp(e);
    };
    _commands.add(_function_1);
  }
  
  protected static boolean _privk3_doorsOpen(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isDoorsOpen") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.doorsOpen;
  }
  
  protected static void _privk3_doorsOpen(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self, final boolean doorsOpen) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDoorsOpen")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, doorsOpen);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.doorsOpen = doorsOpen;
    }
  }
  
  protected static boolean _privk3_goingUp(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isGoingUp") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.goingUp;
  }
  
  protected static void _privk3_goingUp(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self, final boolean goingUp) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setGoingUp")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, goingUp);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.goingUp = goingUp;
    }
  }
  
  protected static Floor _privk3_currentFloor(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentFloor") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.xelevator.elevator.Floor) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentFloor;
  }
  
  protected static void _privk3_currentFloor(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self, final Floor currentFloor) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentFloor")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentFloor);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentFloor = currentFloor;
    }
  }
  
  protected static List<Consumer<Elevator>> _privk3_commands(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCommands") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.commands;
  }
  
  protected static void _privk3_commands(final ElevatorAspectElevatorAspectProperties _self_, final Elevator _self, final List<Consumer<Elevator>> commands) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCommands")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, commands);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.commands = commands;
    }
  }
}
