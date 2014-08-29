package nl.jchmb.utils.selector;

import java.util.Collection;

public interface Selector<E, T extends Collection<E>> {
	public T applySelection(T collection);
}
