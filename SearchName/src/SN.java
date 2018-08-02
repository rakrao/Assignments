import java.util.Scanner;

public class SN {
public static void main(String[] args) {  //main
	int n;
	Scanner scanner=new Scanner(System.in);  //accepting input
	System.out.println("Enter the number of names");
	n=scanner.nextInt();
	String names[]=new String[n];
	System.out.println("Enter the names");
	for(i=0;i<n;i++)
	{
		name[i]=scanner.nextLine();
		
	}
	String searchname;
	for(i=0;i<n;i++)
	{
		for(int j==i;j<n;j++)  //for loop
		{
			if(names[i].compareTo(searchname)==0)
			{
				System.out.println("Found");
				return;
			}
			else
			{
				System.out.println("Not Found");  //print values
				return;
			}
		}
	}
}
}
