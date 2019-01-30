package ca.mtroyal.jhudson3;

public class Person {

	private String name;
	private int id;
	private static int next_id = 1;

	public Person(String name) {
		super();
		this.name = name;
		this.id = Person.next_id;
		Person.next_id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void resetNextId() {
		Person.next_id = 1;
	}

}
