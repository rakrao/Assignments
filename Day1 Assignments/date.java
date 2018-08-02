
//program about date formatting
import java.util.Scanner;

public class date {
	public static void main(String[] args) { // main method

		Scanner sc = new Scanner(System.in); // Scanner input
		int day, month, year, date;
		System.out.println("Enter the date in format DD,MM,YY");
		date = sc.nextInt();
		month = sc.nextInt(); // accepting date
		year = sc.nextInt();
		String mon = null;
		switch (month) // switch case
		{
		case 1:
			mon = "January";
			break;
		case 2:
			mon = "Feb";
			break;
		case 3:
			mon = "March";
			break;
		case 4:
			mon = "April";
			break;
		case 5:
			mon = "may";
			break;
		case 6:
			mon = "june";
			break;
		case 7:
			mon = "July";
			break;
		case 8:
			mon = "august";
			break;
		case 9:
			mon = "september";
			break;
		case 10:
			mon = "october";
			break;
		case 11:
			mon = "november";
			break;
		case 12:
			mon = "december";
			break;
		default:
			System.out.println("Invalid");

		}
		System.out.println(date + "/" + mon + "/" + year);

	}
}