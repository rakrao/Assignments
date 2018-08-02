
//program about armstrong number
import java.util.Scanner;

public class arm {
	public static void main(String[] args) { // main method
		int c = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10; // logic
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number"); // printing values
		else
			System.out.println("Not armstrong number");
	}
}
