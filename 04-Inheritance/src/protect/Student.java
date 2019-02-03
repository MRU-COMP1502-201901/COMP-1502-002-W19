package protect;

import java.util.ArrayList;

public class Student extends Person {
	private ArrayList<Session> classes;
	public String toString() {
		return String.format("%s %s %s", name, getId(), classes);
	}
}
