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
		if (randomInterval > 0) {
			generatedInterval = Math.abs(random.nextLong() % randomInterval);
		} else {
			generatedInterval = 0;
		}
		return super.getInterval() + generatedInterval;
	}
}
