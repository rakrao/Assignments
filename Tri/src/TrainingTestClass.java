
//This finds whether the given triangle is equilateral , isosceles or right angled
import java.util.Scanner;

public class TrainingTestClass {

	public static void main(String[] args) { // main method
		Triangle triangle1 = new Triangle(0, 0, 0);
		int side1, side2, side3;
		Scanner scanner = new Scanner(System.in); // accepting input
		System.out.println("Enter first side");
		side1 = scanner.nextInt();
		triangle1.setSide1(side1);
		System.out.println("Enter second side");
		side2 = scanner.nextInt();
		triangle1.setSide1(side2);
		System.out.println("Enter third side");
		side3 = scanner.nextInt();
		triangle1.setSide1(side3);
		int result1, result2 = 0;
		boolean result3;
		result1 = triangle1.Equilateral(side1, side2, side3);
		if (result1 == 1) {
			System.out.println("Equilateral:yes"); // if else condition
		} else {
			System.out.println("Equilateral:no");
		}
		result1 = triangle1.Isosceles(side1, side2, side3);
		if (result2 == 1) {
			System.out.println("Isosceles:yes");
		} else {
			System.out.println("Isosceles:no");
		}
		boolean result31 = triangle1.isRight(side1, side2, side3);
		if (result31 == true) {
			System.out.println("Right angle:yes");
		} else {
			System.out.println("Right angle:no");
		}
	}
}
