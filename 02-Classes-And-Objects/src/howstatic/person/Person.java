package howstatic.person;

public class Person {

	private String name;
	private int id;
	private static int next_id = 1;

	public Person(String name) {
		this.name = name;
		this.id = next_id;
		next_id++;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
