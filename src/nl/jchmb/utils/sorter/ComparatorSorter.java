package nl.jchmb.utils.sorter;

import java.util.Comparator;
import java.util.List;

public interface ComparatorSorter<T, U extends List<T>> extends Sorter<T, U> {
	public void setComparator(Comparator<T> comparator);
}
