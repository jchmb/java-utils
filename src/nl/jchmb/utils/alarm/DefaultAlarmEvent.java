package nl.jchmb.utils.alarm;

public class DefaultAlarmEvent implements AlarmEvent {
	private Alarm alarm;
	
	public DefaultAlarmEvent(Alarm alarm) {
		this.alarm = alarm;
	}
	
	@Override
	public Alarm getAlarm() {
		return alarm;
	}
}
