package nl.jchmb.utils.merger;

import java.util.ArrayList;
import java.util.Collection;

public class Intersection<E> implements CollectionMerger<E> {
	@Override
	public boolean canMerge(Collection<E> object1, Collection<E> object2) {
		return true;
	}

	@Override
	public Collection<E> merge(Collection<E> c1, Collection<E> c2) {
		Collection<E> intersection = new ArrayList<E>();
		for (E e1 : c1) {
			if (c2.contains(e1)) {
				intersection.add(e1);
			}
		}
		return intersection;
	}
}
