package nl.jchmb.utils.convertor;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollectionConvertor<T, U> implements CollectionConvertor<T, U> {
	private Convertor<T, U> convertor;

	@Override
	public Collection<U> convert(Collection<T> collection) {
		Collection<U> convertedCollection = new ArrayList<U>();
		for (T object : collection) {
			convertedCollection.add(convertor.convert(object));
		}
		return convertedCollection;
	}

	@Override
	public void setConvertor(Convertor<T, U> convertor) {
		this.convertor = convertor;
	}
}
