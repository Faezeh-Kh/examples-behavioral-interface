package org.tetrabox.examples.petrinet;

import java.util.Collections;

import org.eclipse.gemoc.executionframework.event.manager.SimpleImplementationRelationship;

public class PetriNetImplementationRelationship extends SimpleImplementationRelationship {

	public PetriNetImplementationRelationship() {
		super(loadBehavioralInterface("platform:/plugin/org.tetrabox.examples.petrinet/model/PetriNet.bi"), Collections.emptySet());
	}
}
