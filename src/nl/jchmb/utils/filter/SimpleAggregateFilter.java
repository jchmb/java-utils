package nl.jchmb.utils.filter;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleAggregateFilter<T, U extends Collection<T>> implements AggregateFilter<T, U> {
	private Collection<Filter<T, U>> filters;
	
	public SimpleAggregateFilter() {
		filters = new ArrayList<Filter<T, U>>();
	}
	
	@Override
	public U applyFilter(U iterable) {
		for (Filter<T, U> filter : filters) {
			iterable = filter.applyFilter(iterable);
		}
		return iterable;
	}

	@Override
	public void addFilter(Filter<T, U> filter) {
		filters.add(filter);
	}

}
