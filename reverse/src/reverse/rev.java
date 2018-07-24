//This finds reverse of a string 
package reverse;
import java.util.Scanner;

public class rev {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse =" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String");
		System.out.println(reverse);
	}

}
