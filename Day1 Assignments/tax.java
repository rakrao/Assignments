import java.util.Scanner;
public class tax{
public static void main(String[] args){
double income,tax;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the income");
income=scan.nextInt();
if(income<=180000)
	System.out.println("Tax is nil");
else if(income>=181000 && income<300000)
{
	tax=0.10*income;
	System.out.println("Tax is "+tax);
}
else if(income>=300001 && income<500000)
{		tax=0.20*income;
	System.out.println("Tax is "+tax);
}
else if(income>=500001 && income<1000000)
{	tax=0.30*income;
	System.out.println("Tax is "+tax);
}
}
}