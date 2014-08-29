package nl.jchmb.utils.convertor;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayToCollectionConvertor<E> implements Convertor<E[], Collection<E>> {
	@Override
	public Collection<E> convert(E[] objects) {
		Collection<E> collection = new ArrayList<E>();
		for (E object : objects) {
			collection.add(object);
		}
		return collection;
	}
}
