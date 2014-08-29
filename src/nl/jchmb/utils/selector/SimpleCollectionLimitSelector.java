package nl.jchmb.utils.selector;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollectionLimitSelector<E> implements LimitSelector<E, Collection<E>> {
	private int limit = 1;
	
	@Override
	public Collection<E> applySelection(Collection<E> collection) {
		Collection<E> selection = new ArrayList<E>();
		int i = 0;
		for (E object : collection) {
			if (i++ >= limit) {
				break;
			}
			selection.add(object);
		}
		return selection;
	}

	@Override
	public void setLimit(int limit) {
		this.limit = limit;
	}

}
