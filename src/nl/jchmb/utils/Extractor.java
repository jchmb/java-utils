package nl.jchmb.utils;

public interface Extractor<T, U> {
	public T extract(U object);
}
