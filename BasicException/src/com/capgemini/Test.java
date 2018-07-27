package com.capgemini;

import java.util.Scanner;

public class Test { // Test class
	public static void main(String[] args) // Main function
	{
		Factorial fact = new Factorial(); // Object
		int answer;
		try { // Try block
			Scanner sc = new Scanner(System.in); // Accepting input
			System.out.println("Enter value");
			int num = sc.nextInt();
			answer = fact.getFactorial(num);
			System.out.println(fact);
		} catch (Exception e) {
			e.printStackTrace(); // Catch block
		}
	}
}
