

import java.util.Scanner;
import java.io.*;
public class ArrayList {
	
public static void main(String[] args) {
			 
	
	System.out.println("Enter number of cities :");
	File inputDataFile = new File(args[0]);
	
	Scanner scanner = new Scanner(System.in);
	Scanner inFile = new Scanner(inputDataFile);
	int length = inFile.nextInt();
	String names[] = new String[length];
	String stdin=null;
	for(int i=0;i<length;i++)
	{
		names[i]=inFile.nextLine(); 
	}
	System.out.println("Enter name that to be searched :");
	while(stdin.hasNext()) {
		System.out.println("Enter name that to be searched :");
		String input=stdin.next();
		for(int i=0;i<length;i++)
		{
			if(input.equalsIgnoreCase(names[i])) {
				System.out.println("We found"+names[i]+"in our database");
				break;
			}
			else {
				continue;
			}
		}
	}
}
}

	



