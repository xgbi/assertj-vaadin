package org.xgbi.assertj.vaadin.api.container;

import java.util.Collection;

import org.xgbi.assertj.vaadin.api.AbstractAssert;

import com.vaadin.data.Container;
import com.vaadin.data.Property;

/**
 * Assertions for Vaadin {@link Container}.
 * 
 * @author Vincent Demeester
 * 
 */
public class ContainerAssert extends AbstractAssert<ContainerAssert, Container> {

	public ContainerAssert(Container actual) {
		super(actual, ContainerAssert.class);
	}

	protected ContainerAssert(Container actual, Class<?> type) {
		super(actual, type);
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
					"Expected to contain the itemId [%s], but did not.", itemId);
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
					"Expected to not contain the itemId [%s], but did.", itemId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given {@link Property}
	 * identified by the given itemId and propertyId.
	 * 
	 * @param itemId
	 *            the itemId (Object) to look for in the actual
	 *            {@link Container}.
	 * @param propertyId
	 *            the propertyId (Object) to look for in the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given itemId is {@code null}.
	 * @throws IllegalArgumentException
	 *             if the given propertyId is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does contains the
	 *             {@link Property} identified by the given itemId and
	 *             propertyId.
	 */
	public ContainerAssert hasProperty(Object propertyId, Object itemId) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyId == null,
				"The propertyId to look for should not be null");
		throwIllegalArgumentExceptionIfTrue(itemId == null,
				"The itemId to look for should not be null");
		Property property = getActual()
				.getContainerProperty(itemId, propertyId);
		if (property == null) {
			failWithMessage(
					"Expected to contain a property identified by itemId [%s] and propertyId [%s]",
					itemId, propertyId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given type for the
	 * {@link Property} identified by the given propertyId.
	 * 
	 * @param propertyId
	 *            the propertyId (Object) to look for in the actual
	 *            {@link Container}.
	 * @param expectedType
	 *            the type to look for in the actual {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given propertyId is {@code null}.
	 * @throws IllegalArgumentException
	 *             if the given type is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does not have the given type
	 *             for the property identified by the given propertyId.
	 */
	public ContainerAssert hasTypeFor(Object propertyId, Class<?> expectedType) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(propertyId == null,
				"The propertyId to look for should not be null");
		throwIllegalArgumentExceptionIfTrue(expectedType == null,
				"The type to look for should not be null");
		Class<?> actualType = getActual().getType(propertyId);
		if (!expectedType.equals(actualType)) {
			failWithMessage(
					"Expected property identified by [%s] to have the type [%s], but had [%s]",
					propertyId, expectedType, actualType);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} has the given size.
	 * 
	 * @param size
	 *            the size (Object) to look for in the actual {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} does not have the given size.
	 */
	public ContainerAssert hasSize(int size) {
		isNotNull();
		if (getActual().size() != size) {
			failWithMessage("Expected to have a size of [%s], but was [%s]",
					size, getActual().size());
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} is equal to the given {@link Container}
	 * .
	 * 
	 * <p>
	 * NB: This is a naive approach as it just check that it has the same
	 * propertyIds and itemIds. In a near future it might do more
	 * <em>introspection</em>, on each cells.
	 * 
	 * @param container
	 *            the container (Object) to compare to the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given container is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is not equal to the given
	 *             {@link Container}.
	 */
	public ContainerAssert equals(Container container) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(container == null,
				"The container to look for should not be null");
		Collection<?> expectedPropertyIds = container.getContainerPropertyIds();
		Collection<?> expectedItemIds = container.getItemIds();
		for (Object expectedPropertyId : expectedPropertyIds) {
			hasPropertyId(expectedPropertyId);
		}
		for (Object expectedItemId : expectedItemIds) {
			hasItemId(expectedItemId);
		}
		return this;
	}

	/**
	 * Assert that the {@link Container} is the same (reference) to the given
	 * {@link Container}.
	 * 
	 * @param container
	 *            the container (Object) to compare to the actual
	 *            {@link Container}.
	 * @return this {@link ContainerAssert} for assertions chaining.
	 * 
	 * @throws IllegalArgumentException
	 *             if the given container is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is {@code null}.
	 * @throws AssertionError
	 *             if the actual {@link Container} is not the same as the given
	 *             {@link Container}.
	 */
	public ContainerAssert same(Container container) {
		isNotNull();
		throwIllegalArgumentExceptionIfTrue(container == null,
				"The container to look for should not be null");
		if (getActual() != container) {
			failWithMessage(
					"Expected container [%s] to be the same as [%s] but was not.",
					getActual(), container);
		}
		return this;
	}

	// visible for test
	protected Container getActual() {
		return actual;
	}
}
