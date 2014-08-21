package nl.jchmb.utils.stringifier;

import java.util.Collection;

public interface CollectionStringifier<T> extends Stringifier<Collection<T>> {
	public void setStringifier(Stringifier<T> stringifier);
}
