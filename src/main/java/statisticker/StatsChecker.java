package statisticker;

public class StatsChecker {

	float maxThreshold;
	IAlerter[] alerters;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		for (Float number : numbers) {
			if (number > maxThreshold) {
				for (IAlerter alerter : alerters) {
					if (alerter instanceof EmailAlert) {
						((EmailAlert) alerter).emailSent = true;
					} else if (alerter instanceof LEDAlert) {
						((LEDAlert) alerter).ledGlows = true;
					}
				}
			}
		}
	}

}
