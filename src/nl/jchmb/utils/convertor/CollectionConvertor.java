package nl.jchmb.utils.convertor;

import java.util.Collection;

public interface CollectionConvertor<T, U> extends Convertor<Collection<T>, Collection<U>> {
	public void setConvertor(Convertor<T, U> convertor);
}
