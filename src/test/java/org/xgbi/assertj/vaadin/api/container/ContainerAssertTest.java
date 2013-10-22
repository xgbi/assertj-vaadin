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
		Container actual = new IndexedContainer();
		assertThat(actual).hasNoProperties();
	}

	@Test
	public void hasPropertyId_should_throw_IllegalArgumentException_if_propertyId_is_null() {
		Container actual = new IndexedContainer();
		try {
			assertThat(actual).hasPropertyId(null);
			fail("should throw an IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
			assertEquals("The propertyId to look for should not be null.", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyId_should_throw_AssertionError_if_actual_is_null() {
		Container actual = null;
		try {
			assertThat(actual).hasPropertyId("test");
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("\nExpecting actual not to be null", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyId_should_throw_AssertionError_if_actual_does_not_contain_propertyId() {
		Container actual = new IndexedContainer();
		try {
			assertThat(actual).hasPropertyId("test");
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("Expected to contain the propertyId ['test'], but did not.", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyId_should_pass_if_actual_does_contain_propertyId() {
		Container actual = new IndexedContainer();
		actual.addContainerProperty("test", String.class, "");
		assertThat(actual).hasPropertyId("test");
	}
	
	@Test
	public void hasPropertyIds_should_throw_IllegalArgumentException_if_propertyId_is_null() {
		Container actual = new IndexedContainer();
		try {
			assertThat(actual).hasPropertyIds((Object[]) null);
			fail("should throw an IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
			assertEquals("The propertyIds to look for should not be null.", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyIds_should_throw_IllegalArgumentException_if_propertyId_is_empty() {
		Container actual = new IndexedContainer();
		try {
			assertThat(actual).hasPropertyIds(new Object[]{});
			fail("should throw an IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
			assertEquals("The propertyIds to look for should not be empty.", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyIds_should_throw_AssertionError_if_actual_is_null() {
		Container actual = null;
		try {
			assertThat(actual).hasPropertyIds("test");
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("\nExpecting actual not to be null", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyIds_should_throw_AssertionError_if_actual_does_not_contain_one_of_the_propertyId() {
		Container actual = new IndexedContainer();
		actual.addContainerProperty("test", String.class, "");
		try {
			assertThat(actual).hasPropertyIds("test", "titi");
			fail("should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("Expected to contain the propertyId ['titi'], but did not.", e.getMessage());
		}
	}
	
	@Test
	public void hasPropertyIds_should_pass_if_actual_does_contain_propertyId() {
		Container actual = new IndexedContainer();
		actual.addContainerProperty("test", String.class, "");
		actual.addContainerProperty("titi", String.class, "");
		assertThat(actual).hasPropertyIds("test", "titi");
	}

}
