package nl.jchmb.utils.merger;

public interface Merger<T> {
	public boolean canMerge(T object1, T object2);
	public T merge(T object1, T object2);
}
