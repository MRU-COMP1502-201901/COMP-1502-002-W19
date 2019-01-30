package whitebox;

public class Program {
	
	public static String foo(int a, int b) {
		String s = "";
		if (a + b >= 2) {
			s += "A";
		}
		if (a >= 1) {
			s += "B";
		}
		return s;
	}
	
}
