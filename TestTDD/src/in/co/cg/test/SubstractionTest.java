package in.co.cg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SubstractionTest { // subtraction class with different cases

	@Test
	public void testSubTwoPositive() {
		Maths math = new Maths();
		int ans = math.sub(2, 2);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testSubTwonegative() { // test cases
		Maths math = new Maths();
		int ans = math.sub(-2, -2);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testSubTwoZeros() {
		Maths math = new Maths();
		int ans = math.sub(0, 0);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testSubOnezeroOnenegative() {
		Maths math = new Maths();
		int ans = math.sub(0, -2);
		Assert.assertEquals(2, ans);
	}

	@Test
	public void testSubonezeroandonepositive() {
		Maths math = new Maths();
		int ans = math.sub(0, 2);
		Assert.assertEquals(-2, ans);
	}
}
