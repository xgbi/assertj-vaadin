package org.xgbi.assertj.vaadin.api;

import org.assertj.core.internal.Objects;
import org.assertj.core.util.VisibleForTesting;

/**
 * Local version of the base class for all assertions.
 * 
 * @param <S>
 *            the "self" type of this assertion class. Please read &quot;<a
 *            href="http://bit.ly/anMa4g" target="_blank">Emulating 'self types'
 *            using Java Generics to simplify fluent API
 *            implementation</a>&quot; for more details.
 * @param <A>
 *            the type of the "actual" value.
 * 
 * @author Vincent Demeester
 */
public abstract class AbstractAssert<S extends AbstractAssert<S, A>, A> extends
		org.assertj.core.api.AbstractAssert<AbstractAssert<S, A>, A> {
	@VisibleForTesting
	Objects objects = Objects.instance();
	
	  protected final S myself;

	@SuppressWarnings("unchecked")
	protected AbstractAssert(A actual, Class<?> selfType) {
		super(actual, selfType);
		myself = (S) selfType.cast(this);
	}

	public S isNotNull(Object object) {
		objects.assertNotNull(info, object);
		return myself;
	}
	
	public void throwIllegalArgumentExceptionIfTrue(boolean condition, String errorMessage) {
		if (condition) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

}
