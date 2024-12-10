public class FindKthDigit {
	public static char findKthDigit(long k) {
		return findKthDigitRecursive(k, 1, 1);
	}

	private static char findKthDigitRecursive(long k, long digitLength, long start) {
		long count = 9 * start;
		if (k <= digitLength * count) {
			long number = start + (k - 1) / digitLength;
			int digitIndex = (int) ((k - 1) % digitLength);
			return Long.toString(number).charAt(digitIndex);
		}
		return findKthDigitRecursive(k - digitLength * count, digitLength + 1, start * 10);
	}
}
