//program about complex number
package complex;

import java.util.Scanner;

public class TestComp {
	public static void main(String[] args) {
		// main function

		comp Comp1 = new comp();
		comp Comp2 = new comp(); // creating objects
		comp Comp3 = new comp();

		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter real part of first number");
		Comp1.real = sc.nextFloat();

		System.out.println("Enter imaginary part of first number");
		Comp1.imaginary = sc.nextFloat();

		System.out.println("Enter real part of second number");
		Comp2.real = sc.nextFloat();

		System.out.println("Enter imaginary part of first number");
		Comp2.imaginary = sc.nextFloat();

		float finalreal = Comp1.add(Comp1.real, Comp2.real);
		float finalimaginary = Comp1.add(Comp1.imaginary, Comp2.imaginary);

		System.out.println("real=" + finalreal);
		System.out.println("imaginary=" + finalimaginary); // printing values

		float finalc = Comp3.add(finalreal, finalimaginary);
		System.out.println("result=" + finalc);
	}
}
