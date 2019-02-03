package protect;

public class Staff extends Person {
	private Staff boss;
	public String toString() {
		return String.format("%s %s %s", name, getId(), boss);
	}
}
