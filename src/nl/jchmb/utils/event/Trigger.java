package nl.jchmb.utils.event;

public interface Trigger<T extends Event> {
	public void trigger(T event);
}