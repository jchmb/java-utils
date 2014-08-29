package nl.jchmb.utils.convertor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListConvertor<E> implements Convertor<Collection<E>, List<E>> {
	@Override
	public List<E> convert(Collection<E> object) {
		List<E> listObject = new ArrayList<E>();
		listObject.addAll(object);
		return listObject;
	}
}
