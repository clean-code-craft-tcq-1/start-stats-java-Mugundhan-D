package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {
	public static class Stats {
		public float average = Float.NaN;
		public float min = Float.NaN;
		public float max = Float.NaN;

		public Stats(float average, float max, float min) {
			this.average = average;
			this.max = max;
			this.min = min;
		}

		public Stats() {

		}

		public float getAverage() {
			return average;
		}

		public void setAverage(float average) {
			this.average = average;
		}

		public float getMin() {
			return min;
		}

		public void setMin(float min) {
			this.min = min;
		}

		public float getMax() {
			return max;
		}

		public void setMax(float max) {
			this.max = max;
		}
	}

	public static Stats getStatistics(List<Float> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			return new Stats();
		} else {
			float averageofNumbers = getAverageofNumbers(numbers);
			float max = Collections.max(numbers);
			float min = Collections.min(numbers);
			Stats stats = new Stats(averageofNumbers, max, min);
			return stats;
		}
	}

	private static float getAverageofNumbers(List<Float> numbers) {
		float sum = 0;
		for (float mark : numbers) {
			sum += mark;
		}
		return sum / numbers.size();
	}
}
