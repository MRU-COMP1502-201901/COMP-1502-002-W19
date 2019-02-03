package subsuper;

import java.util.ArrayList;

public class Student extends Person {
	private ArrayList<Session> classes;
	public Student(String name, int id, ArrayList<Session> classes) {
		super(name, id);
		this.classes = classes;
	}

	@Override
	public String printVersion() {
		return String.format("%s Classes->%s", super.printVersion(), classes);
	}
}
