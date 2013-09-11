package org.xgbi.assertj.vaadin.api;

import com.vaadin.data.Container;

public class Assertions {

	// FIXME
	public static ContainerAssert assertThat(Container container) {
		return new ContainerAssert(container);
	}
	
	/** Creates a new <code>{@link Assertions}</code */
	protected Assertions() {}
}
