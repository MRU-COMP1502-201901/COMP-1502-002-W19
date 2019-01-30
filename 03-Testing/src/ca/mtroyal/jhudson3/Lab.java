package ca.mtroyal.jhudson3;

import java.util.ArrayList;

public class Lab {

	private ArrayList<Person> list;

	public Lab() {
		list = new ArrayList<>();
	}

	public void addPerson(Person p) {
		list.add(p);
	}

	public ArrayList<Person> getList() {
		return list;
	}

}
