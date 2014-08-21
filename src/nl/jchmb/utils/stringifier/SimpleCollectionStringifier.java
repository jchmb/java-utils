package nl.jchmb.utils.stringifier;

import java.util.Collection;

public class SimpleCollectionStringifier<T> implements CollectionStringifier<T> {
	private static final String DEFAULT_SEPARATOR = "\n";
	
	private Stringifier<T> stringifier;
	private String separator = DEFAULT_SEPARATOR;
	
	@Override
	public String stringify(Collection<T> collection) {
		StringBuilder stringBuilder = new StringBuilder();
		int count = 0;
		for (T object : collection) {
			if (count++ > 0) {
				stringBuilder.append(separator);
			}
			stringBuilder.append(stringifier.stringify(object));
		}
		return stringBuilder.toString();
	}

	@Override
	public void setStringifier(Stringifier<T> stringifier) {
		this.stringifier = stringifier;
	}
	
	public void setSeparator(String separator) {
		this.separator = separator;
	}
}
