package prepostcond;

/**
 * <h1>Helper Class for Integer</h1>
 * <p>
 * Static methods for determining if a positive integer is a
 * <a href="https://en.wikipedia.org/wiki/Prime_number">prime</a> number and for
 * determining if one integer is divisible by another. <b>You can bold text as
 * well</b>
 * </p>
 *
 * @author Jonathan Hudson
 * @version 1.0
 * @since 2018-01-19
 */
public class Helper {

	/**
	 * Is integer number
	 *
	 * @param number Integer number &gt; 0
	 * @return Boolean true if number is prime, otherwise false
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i < (number / 2) + 1; i++) {
			if (isDivisible(number, i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Is first integer evenly divisible by the second
	 *
	 * @param dividend First integer to be divided by second divisor integer
	 * @param divisor  Second integer to divide the first dividend integer
	 * @return Boolean true if dividend % divisor == 0, false otherwise
	 */
	public static boolean isDivisible(int dividend, int divisor) {
		return dividend % divisor == 0;
	}
}
