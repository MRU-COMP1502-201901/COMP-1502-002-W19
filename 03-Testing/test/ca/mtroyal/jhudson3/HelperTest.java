package ca.mtroyal.jhudson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelperTest {

	@Test
	public void isDivisible4by5() {
		assertEquals(false, Helper.isDivisibleBy(4, 5));
	}

	@Test
	public void isDivisible4by4() {
		assertEquals(true, Helper.isDivisibleBy(4, 4));
	}

	@Test
	public void isDivisible5by3() {
		assertEquals(false, Helper.isDivisibleBy(4, 3));
	}

	@Test
	public void isDivisible5by2() {
		assertEquals(true, Helper.isDivisibleBy(4, 2));
	}

	@Test
	public void isDivisible5by1() {
		assertEquals(true, Helper.isDivisibleBy(4, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isDivisible5by0() {
		Helper.isDivisibleBy(4, 0);
	}

	@Test
	public void isDivisible5byNeg1() {
		assertEquals(true, Helper.isDivisibleBy(4, -1));
	}

	@Test
	public void isDivisible5byNeg2() {
		assertEquals(true, Helper.isDivisibleBy(4, -2));
	}

	@Test
	public void isDivisible5byNeg3() {
		assertEquals(false, Helper.isDivisibleBy(4, -3));
	}

	@Test

	public void isDivisible5byNeg4() {
		assertEquals(true, Helper.isDivisibleBy(4, -4));
	}

	@Test
	public void isDivisible5byNeg5() {
		assertEquals(false, Helper.isDivisibleBy(4, -5));
	}

	@Test
	public void isPrime5() {
		assertEquals(true, Helper.isPrime(5));
	}

	@Test
	public void isPrime4() {
		assertEquals(false, Helper.isPrime(4));
	}

	@Test
	public void isPrime3() {
		assertEquals(true, Helper.isPrime(3));
	}

	@Test
	public void isPrime2() {
		assertEquals(true, Helper.isPrime(2));
	}

	@Test
	public void isPrime1() {
		assertEquals(true, Helper.isPrime(1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isPrime0() {
		Helper.isPrime(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void isPrimeNeg1() {
		Helper.isPrime(-1);
	}

	@Test
	public void isPrime43() {
		assertEquals(true, Helper.isPrime(43));
	}

	@Test
	public void isPrime57() {
		assertEquals(false, Helper.isPrime(57));
	}

}
