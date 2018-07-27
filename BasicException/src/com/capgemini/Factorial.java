//This code explains Exception handling
package com.capgemini;

public class Factorial { // factorial class
	public int getFactorial(int num) throws Exception {
		if (num < 2) {
			throw new Exception("InvalidInputException"); // exception
		}

		int i;
		int fact = 1;
		for (i = 1; i <= num; i++) // logic
		{
			fact = fact * i;
		}
		System.out.println(fact);
		if (fact > 255) {
			throw new Exception("FactorialException"); // exception
		}
		return fact;
	}

}
