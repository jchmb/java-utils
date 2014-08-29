package nl.jchmb.utils.selector;

import java.util.Collection;

public interface LimitSelector<E, T extends Collection<E>> extends Selector<E, T> {
	public void setLimit(int limit);
}
