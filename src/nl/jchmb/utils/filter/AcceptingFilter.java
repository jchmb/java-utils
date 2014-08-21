package nl.jchmb.utils.filter;

import java.util.Collection;

public class AcceptingFilter<T, U extends Collection<T>> implements Filter<T, U> {
	@Override
	public U applyFilter(U collection) {
		return collection;
	}
}
