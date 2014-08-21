package nl.jchmb.utils.convertor;

public interface Convertor<T, U> {
	public U convert(T object);
}
