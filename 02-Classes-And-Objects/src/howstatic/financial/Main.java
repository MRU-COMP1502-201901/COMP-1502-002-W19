package howstatic.financial;

public class Main {
	public static void main(String[] args) {
		double taxRate = 30;
		double total = 10000;
		double tax = Financial.percentOf(taxRate, total);
		System.out.println(String.format("You are taxed $%.2f on $%.2f at %.2f percent", tax, total, taxRate));
	}
}
