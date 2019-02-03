package protect;

import java.util.ArrayList;

public class Faculty extends Person {
	private ArrayList<Session> lectures;
	public String toString() {
		return String.format("%s %s %s", name, getId(), lectures);
	}
}

