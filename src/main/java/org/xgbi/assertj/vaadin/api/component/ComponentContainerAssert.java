package org.xgbi.assertj.vaadin.api.component;

import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;

/**
 * Assertions for Vaadin {@link ComponentContainer}.
 * 
 * @author Vincent Demeester
 * 
 */
public class ComponentContainerAssert extends ComponentAssert {

	public ComponentContainerAssert(ComponentContainer actual) {
		super(actual, ComponentContainerAssert.class);
	}

	protected ComponentContainerAssert(Component actual, Class<?> type) {
		super(actual, type);
	}

	// visible for test
	protected ComponentContainer getActual() {
		return (ComponentContainer) super.getActual();
	}

}
