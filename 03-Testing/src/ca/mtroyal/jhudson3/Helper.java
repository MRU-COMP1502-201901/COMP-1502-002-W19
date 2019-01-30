package ca.mtroyal.jhudson3;

public class Helper {

	/**
	 * Is integer a evenly divisible by integer b?
	 * 
	 * @param a First integer a
	 * @param b Second integer b != 0
	 * @return True if a is evenly divisble by b, False otherwise
	 * @throws IllegalArgumentException If integer b == 0
	 */
	public static boolean isDivisibleBy(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		return a % b == 0;
	}

	/**
	 * Is integer n prime?
	 * 
	 * @param n Integer n
	 * @return True if n >= 1 is a prime number
	 * @throws IllegalArgumentException If integer n < 1
	 */
	public static boolean isPrime(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Prime is only defined for integers n >= 1");
		}
		for (int i = 2; i <= n / 2; i++) {
			if (isDivisibleBy(n, i)) {
				return false;
			}
		}
		return true;
	}

}
