import java.util.Scanner;
public class marks{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the marks of 3 subjects");
int m1=scan.nextInt();
int m2=scan.nextInt();
int m3=scan.nextInt();
if(m1>=60&&m2>=60)
System.out.println("Passed");
else if((m1>=60&&m2>=60)||(m2>=60&&m3>=60)||(m3>=60&&m1>=60))
System.out.println("Promoted");
else if((m1>=60&&m2<60&&m3<60)||(m1<60&&m2<60&&m3<60))
System.out.println("Failed");
}
}