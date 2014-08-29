package nl.jchmb.utils.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayConvertor {
	public static List<Long> convert(long[] values) {
		List<Long> list = new ArrayList<Long>();
		for (long value : values) {
			list.add(value);
		}
		return list;
	}
}
