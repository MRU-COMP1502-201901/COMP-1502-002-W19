package prepostcond;

public class Main {
	public static void main(String[] args) {
		// Balance starts at 0
		BankAccount ba = new BankAccount();
		// Balance goes to -1
		ba.transfer(-1);
		// Balance doesn't change
		ba.transferSilentFail(-1);
		// Balance goes to -1 unless asserts enabled, in that case crash on assert fail
		ba.transferAssert(-1);
		// Exception thrown
		ba.transferException(-1);
	}

}
