package uk.ac.wlv.refactored;

public class Matcher {

	public Matcher() {}

	public boolean match(int[] expected, int[] actual, 
			int clipLimit, int delta) {
		if (lengthsMatch(expected, actual)) {
			clipLargeValues(actual, clipLimit);
			return withinDelta(expected, actual, delta);
		}
		return false;
	}

	private boolean lengthsMatch(int[] expected, int[] actual) {
		if (actual.length != expected.length) {
			return false;
		}
		return true;
	}

	private void clipLargeValues(int[] actual, int clipLimit) {
		for (int i = 0; i < actual.length; i++) {
			if (actual[i] > clipLimit) {
				actual[i] = clipLimit;
			}
		}
	}

	private boolean withinDelta(int[] expected, int[] actual, int delta) {
		for (int i = 0; i < actual.length; i++) {
			if (Math.abs(expected[i] - actual[i]) > delta) {
				return false;
			}
		}
		return true;
	}
}