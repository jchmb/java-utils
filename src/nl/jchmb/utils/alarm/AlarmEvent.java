package nl.jchmb.utils.alarm;

import nl.jchmb.utils.event.Event;

public interface AlarmEvent extends Event {
	public Alarm getAlarm();
}
