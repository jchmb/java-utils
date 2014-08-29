package nl.jchmb.utils.sorter;

import java.util.Collections;
import java.util.List;

public class ReverseSorter<E, U extends List<E>> implements Sorter<E, U> {
	@Override
	public void sort(U list) {
		Collections.reverse(list);
	}
}