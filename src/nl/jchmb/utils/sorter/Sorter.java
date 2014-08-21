package nl.jchmb.utils.sorter;

import java.util.Comparator;
import java.util.List;

public interface Sorter<T extends Comparable<T>, U extends List<T>> {
	public void sort(List<T> list);
	public void sort(List<T> list, Comparator<T> comparator);
}