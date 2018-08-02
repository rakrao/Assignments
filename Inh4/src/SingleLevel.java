//program about single level inheritance
public class SingleLevel {
	int num1 = 10;
	int num2 = 20; // instance member

	class Main extends SingleLevel {
		public static void main(String[] args) { // main method
			int num3 = 5;
			int result = num1 + num2 + num3; // logic
			System.out.println("Result=" + result);

		}
	}
}
