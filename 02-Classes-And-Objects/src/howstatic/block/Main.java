package howstatic.block;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<String> vetoed_names = new ArrayList<>();
	static {
		vetoed_names.add("Jonathan Hudson");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		while (!s.isEmpty()) {
			if (vetoed_names.contains(s)) {
				System.out.println("No to " + s);
			} else {
				System.out.println(s + " is ok");
			}
			s = scanner.nextLine();
		}
	}

}
