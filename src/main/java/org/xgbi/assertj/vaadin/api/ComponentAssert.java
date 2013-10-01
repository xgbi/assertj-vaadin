package org.xgbi.assertj.vaadin.api;

import com.vaadin.terminal.Resource;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;

/**
 * Assertions for Vaadin {@link Component}.
 * 
 * @author Vincent Demeester
 * 
 */
public class ComponentAssert extends AbstractAssert<ComponentAssert, Component> {

	public ComponentAssert(Component actual) {
		super(actual, ComponentAssert.class);
	}

	protected ComponentAssert(Component actual, Class<?> type) {
		super(actual, type);
	}

	// visible for test
	protected Component getActual() {
		return actual;
	}

	/**
	 * Assert that the {@link Component} is read-only.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is not read-only.
	 */
	public ComponentAssert isReadOnly() {
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage(
					"The component <%s> should be read-only, but was not.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is not read-only.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is read-only.
	 */
	public ComponentAssert isNotReadOnly() {
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage(
					"The component <%s> should not be read-only, but was.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is enabled.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is not enabled.
	 */
	public ComponentAssert isEnabled() {
		isNotNull();
		if (!actual.isEnabled()) {
			failWithMessage(
					"The component <%s> should be enabled, but was not.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is not enabled.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is enabled.
	 */
	public ComponentAssert isNotEnabled() {
		isNotNull();
		if (actual.isEnabled()) {
			failWithMessage(
					"The component <%s> should not be enabled, but was.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is not enabled. This is an alias for
	 * {@link #isNotEnabled()}.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is enabled.
	 */
	public ComponentAssert isDisabled() {
		return isNotEnabled();
	}

	/**
	 * Assert that the {@link Component} is immediate.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is not immediate.
	 */
	public ComponentAssert isImmediate() {
		isNotNull();
		if (!actual.isImmediate()) {
			failWithMessage(
					"The component <%s> should be immediate, but was not.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is not immediate.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is immediate.
	 */
	public ComponentAssert isNotImmediate() {
		isNotNull();
		if (actual.isImmediate()) {
			failWithMessage(
					"The component <%s> should not be immediate, but was.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is visible.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is not visible.
	 */
	public ComponentAssert isVisible() {
		isNotNull();
		if (!actual.isVisible()) {
			failWithMessage(
					"The component <%s> should be visible, but was not.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} is not visible.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} is visible.
	 */
	public ComponentAssert isNotVisible() {
		isNotNull();
		if (actual.isVisible()) {
			failWithMessage(
					"The component <%s> should not be visible, but was.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has the given styleName.
	 * 
	 * @param style
	 *            The style name to look for in the actual {@link TabSheet}.
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s styleName is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s styleName is not the given
	 *             styleName.
	 */
	public ComponentAssert hasStyleName(String style) {
		isNotNull();
		if (actual.getStyleName() == null) {
			failWithMessage(
					"Component <%s> should have the style <%s> but was null.",
					actual, style);
		}
		if (!actual.getStyleName().equals(style)) {
			failWithMessage(
					"Component <%s> should have the style <%s> but was <%s>.",
					actual, style, actual.getStyleName());
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has the given caption.
	 * 
	 * @param caption
	 *            The caption to look for in actual {@link Component}.
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s caption is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s caption is not the given
	 *             caption.
	 */
	public ComponentAssert hasCaption(String caption) {
		isNotNull();
		if (actual.getCaption() == null) {
			failWithMessage(
					"Component <%s> should have the caption <%s> but was null.",
					actual, caption);
		}
		if (!actual.getCaption().equals(caption)) {
			failWithMessage(
					"Component <%s> should have the caption <%s> but was <%s>.",
					actual, caption, actual.getCaption());
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has no caption.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} has a caption.
	 */
	public ComponentAssert hasNoCaption() {
		isNotNull();
		if (actual.getCaption() != null) {
			failWithMessage(
					"Component <%s> should have no caption but had one.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has the given icon.
	 * 
	 * @param icon
	 *            the icon to look for in the actual {@link Component}.
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s icon is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s icon is not the given
	 *             styleName.
	 */
	public ComponentAssert hasIcon(Resource icon) {
		isNotNull();
		if (actual.getIcon() == null) {
			failWithMessage(
					"Component <%s> should have the icon <%s> but was null.",
					actual, icon);
		}
		if (actual.getIcon() != icon) {
			failWithMessage(
					"Component <%s> should have the icon <%s> but was <%s>.",
					actual, icon, actual.getIcon());
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has no icon.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} has an icon.
	 */
	public ComponentAssert hasNoIcon() {
		isNotNull();
		if (actual.getIcon() != null) {
			failWithMessage("Component <%s> should have no icon but had one.",
					actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has a parent.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} has no parent.
	 */
	public ComponentAssert hasParent() {
		isNotNull();
		if (actual.getParent() == null) {
			failWithMessage(
					"Component <%s> should have a parent but had none.", actual);
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has the given parent.
	 * 
	 * @param parent
	 *            the parent component to look for in the actual
	 *            {@link Component}.
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s parent is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component}'s parent is not the given
	 *             parent.
	 */
	public ComponentAssert hasParent(Component parent) {
		isNotNull();
		hasParent();
		if (actual.getParent() != parent) {
			failWithMessage(
					"Component <%s> should have the parent <%s> but was <%s>.",
					actual, parent, actual.getParent());
		}
		return this;
	}

	/**
	 * Assert that the {@link Component} has no parent.
	 * 
	 * @return this {@link ComponentAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Component} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Component} has a parent.
	 */
	public ComponentAssert hasNoParent() {
		isNotNull();
		if (actual.getParent() != null) {
			failWithMessage(
					"Component <%s> should have no parent, but had one.",
					actual);
		}
		return this;
	}

}
