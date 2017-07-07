package org.tetrabox.example.elevator.aspects

import elevator.Button
import elevator.DownButton
import elevator.Elevator
import elevator.Floor
import elevator.UpButton
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List

import static extension org.tetrabox.example.elevator.aspects.ButtonAspect.*
import static extension org.tetrabox.example.elevator.aspects.FloorAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.function.Consumer

@Aspect(className=Floor)
class FloorAspect {
	def boolean hasUpperFloorLitButton() {
		val next = _self.next
		if (next != null) {
			if (next.floorButtons.exists[pressed]) {
				true
			} else {
				next.hasUpperFloorLitButton
			}
		} else {
			false
		}
	}
	
	def boolean hasLowerFloorLitButton() {
		val previous = _self.previous
		if (previous != null) {
			if (previous.floorButtons.exists[pressed]) {
				true
			} else {
				previous.hasLowerFloorLitButton
			}
		} else {
			false
		}
	}
}

@Aspect(className=Button)
abstract class ButtonAspect {
	public boolean pressed
	
	@Step(eventTriggerable = true, precondition = "notPressed")
	def void press() {
		println("Button pressed at floor " + _self.requestedFloor.nr)
		_self.pressed = true
	}
	
	def boolean notPressed() {
		return !_self.pressed
	}
}

@Aspect(className=Elevator)
class ElevatorAspect {
	
	public boolean doorsOpen
	public boolean goingUp
	public Floor currentFloor
	private List<Consumer<Elevator>> commands = newArrayList
	
	@Main
	def void run() {
		_self.commands.add([e|e.openDoorUp])
		while(!_self.commands.empty) {
			_self.commands.remove(0).accept(_self)
		}
	}
	
	@Step
	def void openDoorUp() {
		var match = false
		var List<Button> litButtons
		if (!_self.doorsOpen && _self.goingUp) {
			val List<Button> buttons = _self.elevatorButtons
					.filter[requestedFloor.nr == _self.currentFloor.nr]
					.map[b|b as Button].toList
			buttons += _self.currentFloor.floorButtons
					.filter[b|b instanceof UpButton]
			litButtons = buttons.filter[pressed].toList
			match = !litButtons.empty
		}
		if (match) {
			litButtons.forEach[pressed = false]
			_self.doorsOpen = true
			println("Elevator stopped at floor " + _self.currentFloor.nr)
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.openDoorDown])
		}
	}
	
	@Step
	def void openDoorDown() {
		var match = false
		var List<Button> litButtons
		if (!_self.doorsOpen && !_self.goingUp) {
			val List<Button> buttons = _self.elevatorButtons.filter[requestedFloor.nr == _self.currentFloor.nr].map[b|b as Button].toList
			buttons += _self.currentFloor.floorButtons.filter[b|b instanceof DownButton]
			litButtons = buttons.filter[pressed].toList
			match = !litButtons.empty
		}
		if (match) {
			litButtons.forEach[pressed = false]
			_self.doorsOpen = true
			println("Elevator stopped at floor " + _self.currentFloor.nr)
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.closeDoor])
		}
	}
	
	@Step
	def void closeDoor() {
		val match = _self.doorsOpen
		if (match) {
			_self.doorsOpen = false
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.changeToDown])
		}
	}
	
	@Step
	def void changeToDown() {
		var match = false
		if (_self.goingUp) {
			val upperFloorElevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr > _self.currentFloor.nr
			]
			val lowerFloorElevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr < _self.currentFloor.nr
			]
			val upperFloorButtonMatch = _self.currentFloor.hasUpperFloorLitButton
			val lowerFloorButtonMatch = _self.currentFloor.hasLowerFloorLitButton
			match = !(upperFloorElevatorButtonMatch || upperFloorButtonMatch) && (lowerFloorElevatorButtonMatch || lowerFloorButtonMatch)
		}
		if (match) {
			_self.goingUp = false
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.changeToUp])
		}
	}
	
	@Step
	def void changeToUp() {
		var match = false
		if (!_self.goingUp) {
			val upperFloorElevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr > _self.currentFloor.nr
			]
			val lowerFloorElevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr < _self.currentFloor.nr
			]
			val upperFloorButtonMatch = _self.currentFloor.hasUpperFloorLitButton
			val lowerFloorButtonMatch = _self.currentFloor.hasLowerFloorLitButton
			match = !(lowerFloorElevatorButtonMatch || lowerFloorButtonMatch) && (upperFloorElevatorButtonMatch || upperFloorButtonMatch)
		}
		if (match) {
			_self.goingUp = true
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.moveUp])
		}
	}
	
	@Step
	def void moveUp() {
		var match = false
		if (_self.goingUp && !_self.doorsOpen) {
			val elevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr > _self.currentFloor.nr
			]
			val floorButtonMatch = _self.currentFloor.hasUpperFloorLitButton
			match = elevatorButtonMatch || floorButtonMatch
		}
		if (match) {
			_self.currentFloor  = _self.currentFloor.next
			_self.commands.add([e|e.openDoorUp])
		} else {
			_self.commands.add([e|e.moveDown])
		}
	}
	
	@Step
	def void moveDown() {
		var match = false
		if (!_self.goingUp && !_self.doorsOpen) {
			val elevatorButtonMatch = _self.elevatorButtons.exists[
				pressed && requestedFloor.nr < _self.currentFloor.nr
			]
			val floorButtonMatch = _self.currentFloor.hasLowerFloorLitButton
			match = elevatorButtonMatch || floorButtonMatch
		}
		if (match) {
			_self.currentFloor  = _self.currentFloor.previous
		}
		_self.commands.add([e|e.openDoorUp])
	}
}
