package org.tetrabox.example.xelevator.aspects;

import com.google.common.base.Objects;
import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.Floor;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.xelevator.aspects.ButtonAspect;
import org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties;

@Aspect(className = Floor.class)
@SuppressWarnings("all")
public class FloorAspect {
  public static boolean hasUpperFloorLitButton(final Floor _self) {
	final org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasUpperFloorLitButton(_self_, _self);
	;
	return (boolean) result;
}
  
  public static boolean hasLowerFloorLitButton(final Floor _self) {
	final org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties _self_ = org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasLowerFloorLitButton(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_hasUpperFloorLitButton(final FloorAspectFloorAspectProperties _self_, final Floor _self) {
    boolean _xblockexpression = false;
    {
      final Floor next = _self.getNext();
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(next, null));
      if (_notEquals) {
        boolean _xifexpression_1 = false;
        EList<Button> _floorButtons = next.getFloorButtons();
        final Function1<Button, Boolean> _function = (Button it) -> {
          return Boolean.valueOf(ButtonAspect.pressed(it));
        };
        boolean _exists = IterableExtensions.<Button>exists(_floorButtons, _function);
        if (_exists) {
          _xifexpression_1 = true;
        } else {
          _xifexpression_1 = FloorAspect.hasUpperFloorLitButton(next);
        }
        _xifexpression = _xifexpression_1;
      } else {
        _xifexpression = false;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static boolean _privk3_hasLowerFloorLitButton(final FloorAspectFloorAspectProperties _self_, final Floor _self) {
    boolean _xblockexpression = false;
    {
      final Floor previous = _self.getPrevious();
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(previous, null));
      if (_notEquals) {
        boolean _xifexpression_1 = false;
        EList<Button> _floorButtons = previous.getFloorButtons();
        final Function1<Button, Boolean> _function = (Button it) -> {
          return Boolean.valueOf(ButtonAspect.pressed(it));
        };
        boolean _exists = IterableExtensions.<Button>exists(_floorButtons, _function);
        if (_exists) {
          _xifexpression_1 = true;
        } else {
          _xifexpression_1 = FloorAspect.hasLowerFloorLitButton(previous);
        }
        _xifexpression = _xifexpression_1;
      } else {
        _xifexpression = false;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
