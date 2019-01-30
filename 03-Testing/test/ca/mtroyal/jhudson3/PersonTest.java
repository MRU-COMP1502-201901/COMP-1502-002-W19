package ca.mtroyal.jhudson3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
		Person.resetNextId();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructor() {
		Person p = new Person("Alice");
	}

	@Test
	public void constructorInitName() {
		Person p = new Person("Alice");
		assertEquals("Alice", p.getName());
	}

	@Test
	public void constructorInitId() {
		Person p = new Person("Alice");
		assertEquals("Alice", p.getName());
		assertEquals(1, p.getId());
	}

	@Test
	public void constructorInitIdMult() {
		Person p1 = new Person("Alice");
		Person p2 = new Person("Bob");
		Person p3 = new Person("Carol");
		assertEquals("Alice", p1.getName());
		assertEquals(1, p1.getId());
		assertEquals("Bob", p2.getName());
		assertEquals(2, p2.getId());
		assertEquals("Carol", p3.getName());
		assertEquals(3, p3.getId());
	}

}
