package org.xgbi.assertj.vaadin.api;

import java.util.Collection;

import com.vaadin.data.Container;

public class ContainerAssert extends AbstractAssert<ContainerAssert, Container> {

	protected ContainerAssert(Container actual) {
		super(actual, ContainerAssert.class);
	}

	/**
	 * Assert that the {@link Container} is empty, a.k.a. has no items at all
	 * (not checking the propertyIds)..
	 * 
	 * @return the {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Container} is ``null``.
	 * @throws AssertionError
	 *             if the actual {@link Container} is not empty.
	 */
	public ContainerAssert isEmpty() {
		isNotNull();
		if (getActual().size() != 0) {
			failWithMessage("Expected to be empty (no items).");
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} is not empty, a.k.a. has at least one
	 * item (not checking the propertyIds)..
	 * 
	 * @return the {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Container} is ``null``.
	 * @throws AssertionError
	 *             if the actual {@link Container} is empty.
	 */
	public ContainerAssert isNotEmpty() {
		isNotNull();
		if (getActual().size() == 0) {
			failWithMessage("Expected to have a least one item.");
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has no propertyIds.
	 * 
	 * @return the {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container}'s propertyIds collection is
	 *             {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} has some propertyIds.
	 */
	public ContainerAssert hasNoProperties() {
		isNotNull();
		Collection<?> propertyIds = getActual().getContainerPropertyIds();
		isNotNull(propertyIds);
		if (!propertyIds.isEmpty()) {
			failWithMessage("Expected to have no properties, but had [%s].",
					propertyIds);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given propertyId.
	 * 
	 * @param propertyId
	 *            the propertyId (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given propertyId is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container}'s propertyIds collection is
	 *             {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does not contains the given
	 *             propertyId.
	 */
	public ContainerAssert hasPropertyId(Object propertyId) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyId == null,
				"The propertyId to look for should not be null");
		Collection<?> actualPropertyIds = getActual().getContainerPropertyIds();
		isNotNull(actualPropertyIds);
		if (!actualPropertyIds.contains(propertyId)) {
			failWithMessage(
					"Expected to contain the propertyId [%s], but did not.",
					propertyId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given propertyIds (several).
	 * 
	 * @param propertyIds
	 *            the propertyIds (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given propertyIds is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container}'s propertyIds collection is
	 *             {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does not contains the given
	 *             propertyId.
	 */
	public ContainerAssert hasPropertyIds(Object... propertyIds) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyIds == null,
				"The propertyIds to look for should not be null");
		throwIllegalArgumentExceptionIfTrue(propertyIds.length == 0,
				"The propertyIds to look for should not be empty");
		for (Object propertyId : propertyIds) {
			hasPropertyId(propertyId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has not the given propertyId.
	 * 
	 * @param propertyId
	 *            the propertyId (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given propertyId is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container}'s propertyIds collection is
	 *             {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does contains the given
	 *             propertyId.
	 */
	public ContainerAssert hasNotPropertyId(Object propertyId) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyId == null,
				"The propertyId to look for should not be null");
		Collection<?> actualPropertyIds = getActual().getContainerPropertyIds();
		isNotNull(actualPropertyIds);
		if (actualPropertyIds.contains(propertyId)) {
			failWithMessage(
					"Expected to contain the propertyId [%s], but did not.",
					propertyId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has not the given propertyIds
	 * (several).
	 * 
	 * @param propertyIds
	 *            the propertyIds (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given propertyIds is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container}'s propertyIds collection is
	 *             {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does contains one of the
	 *             given propertyId.
	 */
	public ContainerAssert hasNotPropertyIds(Object... propertyIds) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyIds == null,
				"The propertyIds to look for should not be null");
		throwIllegalArgumentExceptionIfTrue(propertyIds.length == 0,
				"The propertyIds to look for should not be empty");
		for (Object propertyId : propertyIds) {
			hasNotPropertyId(propertyId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given itemId.
	 * 
	 * @param itemId
	 *            the itemId (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given itemId is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does not contains the given
	 *             itemId.
	 */
	public ContainerAssert hasItemId(Object itemId) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(itemId == null,
				"The itemId to look for should not be null");
		if (!getActual().containsId(itemId)) {
			failWithMessage(
					"Expected to contain the itemId [%s], but did not.",
					itemId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has not the given itemId.
	 * 
	 * @param itemId
	 *            the itemId (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given itemId is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does contains the given
	 *             itemId.
	 */
	public ContainerAssert hasNotItemId(Object itemId) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(itemId == null,
				"The itemId to look for should not be null");
		if (getActual().containsId(itemId)) {
			failWithMessage(
					"Expected to not contain the itemId [%s], but did.",
					itemId);
		}
		return this;
	}
	
	public ContainerAssert hasProperty(Object propertyId, Object itemId) {
		// FIXME implementation
		return this;
	}

	public ContainerAssert hasTypeFor(Object propertyId, Class<?> type) {
		// FIXME implementation
		return this;
	}

	public ContainerAssert hasSize(int size) {
		// FIXME implementation
		return this;
	}

	// visible for test
	protected Container getActual() {
		return actual;
	}
}
