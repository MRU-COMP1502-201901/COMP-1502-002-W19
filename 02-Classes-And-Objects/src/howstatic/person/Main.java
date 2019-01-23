package howstatic.person;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Person p = new Person(name);
	}
}
