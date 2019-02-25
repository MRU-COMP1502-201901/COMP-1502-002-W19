package CompareIt;

public class Person implements Comparable<Person> {

	private String name;
	private int id;
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}	
	@Override
	public String toString() {
		return String.format("Person(%s,%s)", name, id);
	}

	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

}

