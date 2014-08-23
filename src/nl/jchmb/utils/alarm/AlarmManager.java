package nl.jchmb.utils.alarm;

public interface AlarmManager {
	public void addAlarm(Alarm alarm);
	public void tryTrigger();
}