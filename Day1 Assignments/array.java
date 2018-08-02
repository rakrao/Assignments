
//program to understand sorting using array
import java.util.Scanner;

public class array {
	public static void main(String[] args) { // main method
		int i;
		int key = 0;
		int arr[] = new int[15];
		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter the array elements");

		for (i = 0; i < 15; i++) {
			arr[i] = sc.nextInt(); // for loop to accept array inputs

		}
		System.out.println("Enter the key to be searched");
		key = sc.nextInt();
		for (i = 0; i < 15; i++) {
			if (key == arr[i]) { // for loop to find key
				System.out.println("Key is found");
				return;
			} else {
				System.out.println("Key not found");
				return;
			}
		}
	}
}