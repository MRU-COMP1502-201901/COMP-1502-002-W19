package prepostcond;

public class BankAccount {
	private int balance;

	/**
	 * Deposits money into this account
	 * 
	 * @param amount The amount of money to deposit (Pre-condition: amount >= 0)
	 */
	public void transfer(double amount) {
		this.balance += amount;
	}

	/**
	 * Deposits money into this account
	 * 
	 * @param amount The amount of money to deposit
	 * @throws IllegalArgumentException if amount < 0 (Pre-condition: amount >= 0)
	 */
	public void transferException(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount < 0");
		}
		this.balance += amount;
	}

	/**
	 * Deposits money into this account
	 * 
	 * @param amount The amount of money to deposit (Pre-condition: amount >= 0)
	 */
	public void transferAssert(double amount) {
		// Asserts only checked if jvm is flagged to check
		assert amount >= 0;
		this.balance += amount;
	}

	/**
	 * Deposits money into this account
	 * 
	 * @param amount The amount of money to deposit (Pre-condition: amount >= 0)
	 */
	public void transferSilentFail(double amount) {
		// Asserts only checked if jvm is flagged to check
		if (amount < 0) {
			return;
		}
		this.balance += amount;
	}
}
