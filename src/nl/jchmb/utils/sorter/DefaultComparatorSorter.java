package nl.jchmb.utils.sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultComparatorSorter<T, U extends List<T>> implements ComparatorSorter<T, U> {
	private Comparator<T> comparator;
	
	public DefaultComparatorSorter() {
		
	}
	
	@Override
	public void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	@Override
	public void sort(U list) {
		Collections.sort(list, comparator);
	}
}
