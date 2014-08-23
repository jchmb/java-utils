package nl.jchmb.utils.alarm;

import nl.jchmb.utils.event.Trigger;

public interface Alarm {
	public void rewind();
	public AlarmEvent generateEvent();
	public void setTrigger(Trigger<AlarmEvent> trigger);
	public boolean tryTrigger();
	public void setInterval(long interval);
	public void setRepeating(boolean repeating);
	public void stop();
}