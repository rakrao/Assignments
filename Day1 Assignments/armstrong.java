
//program to find armstrong number
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) // main method
	{
		for (int k = 100; k < 1000; k++) // for loop
		{
			int n = k;
			int d = 0;
			int s = 0;
			while (n > 0) {
				d = n % 10; // logic
				s = s + (d * d * d);
				n = n / 10;
			}
			if (k == s) {
				System.out.println(k + "is Armstrong number"); // printing values
			}
		}
	}
}