package nl.jchmb.utils.alarm;

public interface Alarm {
	public void rewind();
	public AlarmEvent generateEvent();
	public boolean tryTrigger();
	public void trigger();
	public void setInterval(long interval);
	public void setRepeating(boolean repeating);
	public void stop();
}