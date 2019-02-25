package CompareIt;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
//	public static void main(String[] args) {
//		Person p1 = new Person("Bob", 99);
//		Person p2 = new Person("Carol", 1);
//		Person p3 = new Person("Alex", 33);
//		ArrayList<Person> list = new ArrayList<>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//	}
//	public static void main(String[] args) {
//		Person2 p1 = new Person2("Bob", 99);
//		Person2 p2 = new Person2("Bob", 1);
//		Person2 p3 = new Person2("Alex", 33);
//		ArrayList<Person2> list = new ArrayList<>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//	}
	public static void main(String[] args) {
		Person p1 = new Person("Bob", 99);
		Person p2 = new Person("Bob", 1);
		Person p3 = new Person("Alex", 33);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new PersonComparator());
		System.out.println(list);
	}
}
