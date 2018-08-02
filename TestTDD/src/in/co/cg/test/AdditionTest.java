//program about Junit
package in.co.cg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AdditionTest { // Add class with different cases

	@Test

	public void testAddTwoPositive() {
		Maths math = new Maths();
		int ans = math.add(2, 2);
		Assert.assertEquals(4, ans);
	}

	public void testAddTwoNegative() {
		Maths math = new Maths();
		int ans = math.add(-2, -2);
		Assert.assertEquals(-4, ans); // test casesF
	}

	public void testAddTwoZeros() {
		Maths math = new Maths();
		int ans = math.add(0, 0);
		Assert.assertEquals(0, ans);
	}

	public void testAddOneZeroAndOneGreaterPositive() {
		Maths math = new Maths();
		int ans = math.add(0, 2);
		Assert.assertEquals(2, ans);
	}

	public void testAddOneZeroAndOneNegative() {
		Maths math = new Maths();
		int ans = math.add(0, -2);
		Assert.assertEquals(-2, ans);
	}

}
