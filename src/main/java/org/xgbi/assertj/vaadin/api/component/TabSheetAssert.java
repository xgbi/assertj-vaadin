package org.xgbi.assertj.vaadin.api.component;

import java.util.Collection;

import com.vaadin.ui.Component.Listener;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;

/**
 * Assertions for Vaadin {@link TabSheet}.
 * 
 * @author Vincent Demeester
 * 
 */
public class TabSheetAssert extends ComponentContainerAssert {

	public TabSheetAssert(TabSheet actual) {
		super(actual, TabSheetAssert.class);
	}

	// visible for test
	protected TabSheet getActual() {
		return (TabSheet) super.getActual();
	}

	/**
	 * Assert that the {@link TabSheet} has a least one {@link Listener} for the
	 * given event type.
	 * 
	 * @param eventType
	 *            the event type to look for in the actual {@link TabSheet}.
	 * @return this {@link TabSheetAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} has no {@link Listener} for
	 *             the given type.
	 */
	public TabSheetAssert hasListener(Class<?> eventType) {
		isNotNull();
		Collection<?> listeners = getActual().getListeners(eventType);
		if (listeners.isEmpty()) {
			failWithMessage(
					"Expected at least 1 listener of event type : <%s>",
					eventType);
		}
		return this;
	}

	/**
	 * Assert that the {@link TabSheet} has no {@link Tab}.
	 * 
	 * @return this {@link TabSheetAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} is {@code null}
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} has tabs.
	 */
	public TabSheetAssert hasNoTab() {
		return hasTabCount(0);
	}

	/**
	 * Assert that the {@link TabSheet} has the given number of Tab.
	 * 
	 * @param count
	 *            the number of tab to look for in the actual {@link TabSheet}.
	 * @return this {@link TabSheetAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} is {@code null}
	 * @throws AssertionError
	 *             if the actual {@link TabSheet} has a different number of tabs
	 *             from the given one.
	 */
	public TabSheetAssert hasTabCount(int count) {
		isNotNull();
		int numberOfTabs = getActual().getComponentCount();
		if (numberOfTabs != count) {
			failWithMessage(
					"Expected to have <%s> tabs, but <%s> were present.",
					count, numberOfTabs);
		}
		return this;
	}
}
