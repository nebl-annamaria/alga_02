import java.util.Scanner;

public class FindKthDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		sc.nextLine();

		StringBuilder actualOutput = new StringBuilder();
		for (int i = 1; i <= q; i++) {
			long k = Long.parseLong(sc.nextLine());
			actualOutput.append(FindKthDigit.findKthDigit(k)).append("\n");
		}

		System.out.println(actualOutput);
	}

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
