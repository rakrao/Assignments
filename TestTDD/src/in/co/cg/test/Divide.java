package in.co.cg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Divide { // Divide class with different cases

	@Test
	public void testDivTwoPositive() {
		Maths math = new Maths();
		int ans = math.div(4, 2);
		Assert.assertEquals(2, ans);
	}

	@Test
	public void testDivTwoNegative() { // test cases
		Maths math = new Maths();
		int ans = math.div(-4, -2);
		Assert.assertEquals(2, ans);
	}

	@Test
	public void testDivonepositiveonenegative() {
		Maths math = new Maths();
		int ans = math.div(6, -3);
		Assert.assertEquals(-2, ans);
	}

	@Test
	public void testDivonenegativeonepositive() {
		Maths math = new Maths();
		int ans = math.div(-8, 4);
		Assert.assertEquals(-2, ans);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void throwsExceptionwhenDivisionZero() {
		Maths math = new Maths();
		int ans = math.div(8, 0);
	}

}
