package ca.mtroyal.jhudson3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LabTest {

	private static Person p1, p2, p3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p1 = new Person("Alice");
		p2 = new Person("Bob");
		p3 = new Person("Carol");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void constructor() {
		Lab lab = new Lab();
	}

	@Test
	public void constructorInit() {
		Lab lab = new Lab();
		assertEquals(new ArrayList<Person>(), lab.getList());
	}

	@Test
	public void addPerson3() {
		Lab lab = new Lab();
		lab.addPerson(p1);
		lab.addPerson(p2);
		lab.addPerson(p3);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		assertEquals(list, lab.getList());
	}

}
