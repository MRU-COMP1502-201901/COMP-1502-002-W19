package over;

public class Person {
	private String name;
	private int id;

	public String printVersion() {
		return String.format("%s(%s)", name, id);
	}
}
