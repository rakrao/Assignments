
//program about grade system based on marks
import java.util.Scanner;

public class marks {
	public static void main(String[] args) { // main method

		Scanner scan = new Scanner(System.in); // scanner input
		System.out.println("Enter the marks of 3 subjects");
		int m1 = scan.nextInt();
		int m2 = scan.nextInt(); // accepting marks
		int m3 = scan.nextInt();
		if (m1 >= 60 && m2 >= 60)
			System.out.println("Passed");
		else if ((m1 >= 60 && m2 >= 60) || (m2 >= 60 && m3 >= 60) || (m3 >= 60 && m1 >= 60)) // checking logic
			System.out.println("Promoted");
		else if ((m1 >= 60 && m2 < 60 && m3 < 60) || (m1 < 60 && m2 < 60 && m3 < 60))
			System.out.println("Failed");
	}
}