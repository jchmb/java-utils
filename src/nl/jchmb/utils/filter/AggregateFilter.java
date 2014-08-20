package nl.jchmb.utils.filter;

public interface AggregateFilter<T, U extends Iterable<T>> extends Filter<T, U> {
	public void addFilter(Filter<T, U> filter);
}
