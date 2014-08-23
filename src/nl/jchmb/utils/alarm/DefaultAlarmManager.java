package nl.jchmb.utils.alarm;

import java.util.ArrayList;
import java.util.Collection;

public class DefaultAlarmManager implements AlarmManager {
	private Collection<Alarm> alarms;
	
	public DefaultAlarmManager() {
		alarms = new ArrayList<Alarm>();
	}
	
	@Override
	public void addAlarm(Alarm alarm) {
		alarms.add(alarm);
	}

	@Override
	public void tryTrigger() {
		for (Alarm alarm : alarms) {
			alarm.tryTrigger();
		}
	}
}
