package CompareIt;

public class Person2 implements Comparable<Person2> {

	private String name;
	private int id;

	public Person2(String name, int id) {
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
	public int compareTo(Person2 other) {
		int result = this.name.compareTo(other.name);
		if(result != 0) {
			return result;
		}
		if (this.id < other.id) {
			return -1;
		}
		if (this.id > other.id) {
			return 1;
		}
		return 0;
	}

}
