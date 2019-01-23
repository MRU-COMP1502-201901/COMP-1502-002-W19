package howstatic.financial;

public class Financial {
	/**
	 * Return amount taxed based on rate and amount tax is rate is applied to
	 * @param percent Percent 0-100 to be taxed
	 * @param amount Amount to tax
	 * @return The portion of amount that you would be taxed under the given percent weight
	 */
	public static double percentOf(double percent, double amount) {
		return (percent / 100) * amount;
	}
}
