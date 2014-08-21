package nl.jchmb.utils.sorter;

import java.util.Collections;
import java.util.List;

public class DefaultSorter<T extends Comparable<T>, U extends List<T>> implements Sorter<T, U> {
	@Override
	public void sort(U list) {
		Collections.sort(list);
	}
}
