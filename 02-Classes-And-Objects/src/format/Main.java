package format;

public class Main {
	public static void main(String[] args) {
		int integer = 1234;
		double dbl = 333.33;
		String str_s = "shrt";
		System.out.println(integer + dbl);
		System.out.println(integer + dbl + str_s);
		System.out.println(str_s + integer + dbl);
		System.out.println(str_s + " " + integer + " " + dbl);
		
		String formated = String.format("<%d> <%15d> <%-15d> <%+15d> <%015d>", integer, integer, integer, integer, integer);
		System.out.println(formated);
		
		formated = String.format("<%f> <%15f> <%-15f> <%+15f> <%015f> <%015.2f>", dbl, dbl, dbl, dbl, dbl, dbl);
		System.out.println(formated);
		
		formated = String.format("<%s> <%20s> <%-20s> <%.2s> ", str_s, str_s, str_s, str_s);
		System.out.println(formated);
	}
}
