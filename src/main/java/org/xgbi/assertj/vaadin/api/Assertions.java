package org.xgbi.assertj.vaadin.api;

import com.vaadin.data.Container;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.TabSheet;

/**
 * The entry point for all Vaadin assertions.
 * 
 * @author Vincent Demeester
 *
 */
public class Assertions {

	public static ContainerAssert assertThat(Container actual) {
		return new ContainerAssert(actual);
	}
	
	public static ComponentAssert assertThat(Component actual) {
		return new ComponentAssert(actual);
	}
	
	public static ComponentContainerAssert assertThat(ComponentContainer actual) {
		return new ComponentContainerAssert(actual);
	}
	
	public static TabSheetAssert assertThat(TabSheet actual) {
		return new TabSheetAssert(actual);
	}
	
	/** Creates a new <code>{@link Assertions}</code */
	protected Assertions() {}
}
