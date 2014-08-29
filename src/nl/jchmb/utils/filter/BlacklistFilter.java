package nl.jchmb.utils.filter;

import java.util.ArrayList;
import java.util.Collection;

public class BlacklistFilter<E> implements Filter<E, Collection<E>> {
	private Collection<E> blacklist;
	
	public BlacklistFilter(Collection<E> blacklist) {
		setBlacklist(blacklist);
	}
	
	public void setBlacklist(Collection<E> blacklist) {
		this.blacklist = blacklist;
	}
	
	@Override
	public Collection<E> applyFilter(Collection<E> iterable) {
		Collection<E> filteredCollection = new ArrayList<E>();
		for (E object : iterable) {
			if (!blacklist.contains(object)) {
				filteredCollection.add(object);
			}
		}
		return filteredCollection;
	}
}
