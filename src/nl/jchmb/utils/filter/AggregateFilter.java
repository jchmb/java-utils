package nl.jchmb.utils.filter;

import java.util.Collection;

public interface AggregateFilter<T, U extends Collection<T>> extends Filter<T, U> {
	public void addFilter(Filter<T, U> filter);
}
