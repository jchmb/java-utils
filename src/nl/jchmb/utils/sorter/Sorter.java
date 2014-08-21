package nl.jchmb.utils.sorter;

import java.util.List;

/**
 * Sorter class.
 * 
 * @author jchmb
 *
 * @param <T>
 * @param <U>
 */
public interface Sorter<T, U extends List<T>> {
	public void sort(U list);
}