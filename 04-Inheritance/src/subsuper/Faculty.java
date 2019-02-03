package subsuper;

import java.util.ArrayList;

public class Faculty extends Person {
	
	private ArrayList<Session> lectures;
	public Faculty(String name, int id, ArrayList<Session> lectures) {
		super(name, id);
		this.lectures = lectures;
	}
	
	@Override
	public String printVersion() {
		return String.format("%s Sessions->%s", super.printVersion(), lectures);
	}
}

