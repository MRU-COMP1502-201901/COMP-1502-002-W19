package over;

import java.util.ArrayList;

public class Student extends Person {
	private ArrayList<Session> classes;

	@Override
	public String printVersion() {
		return String.format("%s %s", super.printVersion(), classes);
	}
}
