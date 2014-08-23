package nl.jchmb.utils.alarm;

import nl.jchmb.utils.event.Trigger;

public class DefaultAlarm implements Alarm {
	private long interval;
	private long ticks = -1;
	private boolean repeating;
	private Trigger<AlarmEvent> trigger;
	
	public DefaultAlarm(long interval, boolean repeating) {
		setInterval(interval);
		setRepeating(repeating);
	}
	
	@Override
	public void rewind() {
		this.ticks = System.currentTimeMillis() + interval;
	}
	
	public boolean tryTrigger() {
		if (ticks > 0 && System.currentTimeMillis() >= ticks) {
			if (repeating) {
				rewind();
			} else {
				ticks = -1;
			}
			if (trigger != null) {
				trigger.trigger(generateEvent());
			}
			return true;
		}
		return false;
	}
	
	@Override
	public void setInterval(long interval) {
		this.interval = interval;
	}

	@Override
	public void setRepeating(boolean repeating) {
		this.repeating = repeating;
	}
	
	@Override
	public void setTrigger(Trigger<AlarmEvent> trigger) {
		this.trigger = trigger;
	}
	
	public void stop() {
		this.ticks = -1;
	}

	@Override
	public AlarmEvent generateEvent() {
		return new DefaultAlarmEvent(this);
	}
}
