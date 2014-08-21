package nl.jchmb.utils.filter;

import java.util.Collection;

public interface Filter<T, U extends Collection<T>> {
	public U applyFilter(U iterable);
}
