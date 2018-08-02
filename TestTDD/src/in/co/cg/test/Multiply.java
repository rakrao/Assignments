package in.co.cg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Multiply { // multiply class with different test cases

	@Test
	public void testMulTwopositive() {
		Maths math = new Maths();
		int ans = math.mul(2, 2);
		Assert.assertEquals(4, ans);

	}

	@Test
	public void testMulTwoNegative() { // test cases
		Maths math = new Maths();
		int ans = math.mul(-2, -2);
		Assert.assertEquals(4, ans);

	}

	@Test
	public void testMulTwoZeros() {
		Maths math = new Maths();
		int ans = math.mul(0, 0);
		Assert.assertEquals(0, ans);

	}

	@Test
	public void testMulOnepositiveOneNegative() {
		Maths math = new Maths();
		int ans = math.mul(3, -4);
		Assert.assertEquals(-12, ans);

	}

	@Test
	public void testMulOneZeroOnePositive() {
		Maths math = new Maths();
		int ans = math.mul(0, 5);
		Assert.assertEquals(0, ans);

	}

	@Test
	public void testMulOneZeroOneNegative() {
		Maths math = new Maths();
		int ans = math.mul(0, -8);
		Assert.assertEquals(0, ans);

	}
}
