package org.xgbi.assertj.vaadin.api.component;

import static org.assertj.core.util.FailureMessages.actualIsNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.xgbi.assertj.vaadin.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.xgbi.assertj.vaadin.api.BaseTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;

@RunWith(BlockJUnit4ClassRunner.class)
public class ComponentAssertTest extends BaseTest {

	@Test
	public void isReadOnlyShouldFailIfActualIsNull() {
		Component actual = null;
		try {
			assertThat(actual).isReadOnly();
			fail("Should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals(actualIsNull(), e.getMessage());
		}
	}

	@Test
	public void isReadOnlyShouldFailIfNotReadOnly() {
		Component actual = new Label();
		try {
			assertThat(actual).isReadOnly();
			fail("Should throw an AssertionError.");
		} catch (AssertionError e) {
			assertEquals("The component <> should be read-only, but was not.", e.getMessage());
		}
	}
	
	@Test
	public void isReadOnlyShouldPassIfReadOnly() {
		Component actual = new Label();
		actual.setReadOnly(true);
		assertThat(actual).isReadOnly();
	}
}
