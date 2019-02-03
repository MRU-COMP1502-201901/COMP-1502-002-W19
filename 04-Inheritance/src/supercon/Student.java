package supercon;

import java.util.ArrayList;

public class Student extends Person {
	
	private ArrayList<Session> classes;
	
	public Student(String name, int id, ArrayList<Session> classes) {
		super(name, id);
		this.classes = classes;
	}
}
