package nl.jchmb.utils.alarm;

public abstract class DefaultAlarm implements Alarm {
	private long interval;
	private long ticks = -1;
	private boolean repeating;
	
	public DefaultAlarm(long interval, boolean repeating) {
		setInterval(interval);
		setRepeating(repeating);
	}
	
	@Override
	public void rewind() {
		setTicks(System.currentTimeMillis() + getInterval());
	}
	
	protected long getInterval() {
		return interval;
	}
	
	protected void setTicks(long ticks) {
		this.ticks = ticks;
	}
	
	public boolean tryTrigger() {
		if (ticks > 0 && System.currentTimeMillis() >= ticks) {
			if (repeating) {
				rewind();
			} else {
				ticks = -1;
			}
			trigger();
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
	
	public void stop() {
		this.ticks = -1;
	}

	@Override
	public AlarmEvent generateEvent() {
		return new DefaultAlarmEvent(this);
	}
}
