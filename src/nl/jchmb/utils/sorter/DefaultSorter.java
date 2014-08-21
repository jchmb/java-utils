package nl.jchmb.utils.sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultSorter<T extends Comparable<T>, U extends List<T>> implements Sorter<T, U> {
	@Override
	public void sort(List<T> list) {
		Collections.sort(list);
	}

	@Override
	public void sort(List<T> list, Comparator<T> comparator) {
		Collections.sort(list, comparator);
	}
}
