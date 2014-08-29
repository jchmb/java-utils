package nl.jchmb.utils.fetcher;

public class NullFetcher<V> implements Fetcher<V> {
	public V fetch() {
		return null;
	}
}
