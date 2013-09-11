package org.xgbi.assertj.vaadin.api;

import org.assertj.core.api.AbstractAssert;

import com.vaadin.data.Container;

public class ContainerAssert extends AbstractAssert<ContainerAssert, Container> {

	protected ContainerAssert(Container actual) {
		super(actual, ContainerAssert.class);
	}
	
	// visible for test
	protected Container getActual() {
		return actual;
	}
	
	public ContainerAssert isEmpty() {
		isNotNull();
		// FIXME implement this
		return this;
	}
	
	

}
