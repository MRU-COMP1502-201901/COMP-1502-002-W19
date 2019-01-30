package whitebox;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void statementCoverage() {
		int a = 1;
		int b = 1;
		String expected = "AB";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void branchCoverage1() {
		int a = 1;
		int b = 1;
		String expected = "AB";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void branchCoverage2() {
		int a = 0;
		int b = 0;
		String expected = "";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void pathCoverage1() {
		int a = 1;
		int b = 1;
		String expected = "AB";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void pathCoverage2() {
		int a = 1;
		int b = 0;
		String expected = "B";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void pathCoverage3() {
		int a = 0;
		int b = 2;
		String expected = "A";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void pathCoverage4() {
		int a = 0;
		int b = 0;
		String expected = "";
		String actual = Program.foo(a, b);
		assertEquals(expected, actual);
	}

}
