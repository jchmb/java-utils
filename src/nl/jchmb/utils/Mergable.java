package nl.jchmb.utils;

public interface Mergable<T extends Mergable<T>> {
	public void merge(Mergable<T> mergable);
}
