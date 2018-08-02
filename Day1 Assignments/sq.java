
//program to find square
import java.util.Scanner;

public class sq {
	public static void main(String args[]) { // main method
		int i;
		Scanner scan = new Scanner(System.in); // scanner input
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int total = 0;
		total = num * num; // logic
		System.out.println("Square of " + num + " is: " + total); // printing values

	}
}