/*
 * generated by Xtext 2.10.0
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.ui.internal.GrammarActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActivityDiagramExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GrammarActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GrammarActivator.getInstance().getInjector(GrammarActivator.ORG_GEMOC_ACTIVITYDIAGRAM_SEQUENTIAL_XACTIVITYDIAGRAM_ACTIVITYDIAGRAM);
	}
	
}
