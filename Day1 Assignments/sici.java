
//program about simple and compound interest
import java.util.Scanner;

public class sici {
	public static void main(String[] args) { // main method
		double pr, rate, t, sim, com;
		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter the amount:");
		pr = sc.nextDouble();
		System.out.println("Enter the no. of years:");
		t = sc.nextDouble();
		System.out.println("Enter the rate of interest:");
		rate = sc.nextDouble();
		sim = (pr * t * rate) / 100; // logic for calculation
		com = pr * Math.pow(1.0 + rate / 100.0, t) - pr;
		System.out.println("Simple interest=" + sim);
		System.out.println("Compound interest=" + com); // printing values
	}
}