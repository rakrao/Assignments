//program about duplication
package duplicate;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) // main method
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word:");
		String word = sc.nextLine(); // accepting input
		int length = word.length();
		char ch;
		String answer = "";
		for (int i = 0; i < length; i++) // for loop
		{
			ch = word.charAt(i);
			if (ch != ' ')
				answer = answer + ch; // logic
			word = word.replace(ch, ' ');

		}
		System.out.println(answer);
	}

}
