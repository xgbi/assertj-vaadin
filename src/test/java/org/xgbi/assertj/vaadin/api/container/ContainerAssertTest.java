package org.xgbi.assertj.vaadin.api.container;

import static org.junit.Assert.*;
import static org.xgbi.assertj.vaadin.api.Assertions.assertThat;

import org.junit.Test;

import com.vaadin.data.Container;
import com.vaadin.data.util.IndexedContainer;

public class ContainerAssertTest {

	@Test
	public void isEmpty_should_throw_AssertionError_if_actual_is_null() {
		Container actual = null;
		try {
			assertThat(actual).isEmpty();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("\nExpecting actual not to be null", e.getMessage());
		}
	}

	@Test
	public void isEmpty_should_throw_AssertionError_if_not_empty() {
		Container actual = new IndexedContainer();
		actual.addItem();
		try {
			assertThat(actual).isEmpty();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("Expected to be empty (no items).", e.getMessage());
		}
	}
	
	@Test
	public void isEmpty_should_be_pass_if_empty() {
		Container actual = new IndexedContainer();
		assertThat(actual).isEmpty();
		assertTrue(true);
	}
	
	@Test
	public void isNotEmpty_should_throw_AssertionError_if_actual_is_null() {
		Container actual = null;
		try {
			assertThat(actual).isNotEmpty();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("\nExpecting actual not to be null", e.getMessage());
		}
	}

	@Test
	public void isNotEmpty_should_throw_AssertionError_if_empty() {
		Container actual = new IndexedContainer();
		try {
			assertThat(actual).isNotEmpty();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("Expected to have at least one item.", e.getMessage());
		}
	}
	
	@Test
	public void isNotEmpty_should_be_pass_if_not_empty() {
		Container actual = new IndexedContainer();
		actual.addItem();
		assertThat(actual).isNotEmpty();
		assertTrue(true);
	}
	
	@Test
	public void hasNoProperties_should_throw_AssertionError_if_actual_is_null() {
		Container actual = null;
		try {
			assertThat(actual).hasNoProperties();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("\nExpecting actual not to be null", e.getMessage());
		}
	}
	
	@Test
	public void hasNoProperties_should_throw_AssertionError_if_actual_has_properties() {
		Container actual = new IndexedContainer();
		actual.addContainerProperty("test", String.class, "");
		try {
			assertThat(actual).hasNoProperties();
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("Expected to have no properties, but had [['test']].", e.getMessage());
		}
	}
	
	@Test
	public void hasNoProperties_should_pass_if_has_no_properties() {
		
	}

}
