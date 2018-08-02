
//This code passes time in two different objects and sum of two time is passed to third object
import java.util.Scanner;

public class TimeClass { // class
	public static void main(String[] args) { // main method

		Timet time1 = new Timet();
		Timet time2 = new Timet();
		Timet time3 = new Timet();

		Scanner sc = new Scanner(System.in); // accepting input
		System.out.println("Enter hour part of time1");
		time1.hours = sc.nextInt();

		System.out.println("Enter minutes part of time1");
		time1.minutes = sc.nextInt();

		System.out.println("Enter  hour part of time2");
		time2.hours = sc.nextInt();

		System.out.println("Enter  minutes part of time2");
		time1.minutes = sc.nextInt();

		int finalhour = time1.add(time1.hours, time2.hours);
		int finalminute = time1.add(time1.minutes, time2.minutes);

		System.out.println("hour=" + finalhour);
		System.out.println("minute=" + finalminute);

		float finalc = time1.add(finalhour, finalminute);
		System.out.println("result=" + finalc);
	}
}
