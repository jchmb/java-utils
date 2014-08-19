package nl.jchmb.utils.filter;

import java.util.Collection;

public class AcceptingFilter<T> implements CollectionFilter<T> {
	@Override
	public Collection<T> applyFilter(Collection<T> collection) {
		return collection;
	}
}
