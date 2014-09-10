package nl.jchmb.utils.alarm;

import java.util.Random;

public abstract class DefaultRandomAlarm extends DefaultAlarm {
	private long randomInterval;

	public DefaultRandomAlarm(long interval, long randomInterval, boolean repeating) {
		super(interval, repeating);
		this.randomInterval = randomInterval;
	}
	
	protected long getInterval() {
		long generatedInterval;
		Random random = new Random();
		generatedInterval = random.nextLong() % randomInterval;
		return super.getInterval() + generatedInterval;
	}
}
