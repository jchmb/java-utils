package nl.jchmb.utils.filter;

public interface Filter<T, U extends Iterable<T>> {
	public U applyFilter(U iterable);
}
