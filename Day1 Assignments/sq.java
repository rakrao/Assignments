import java.util.Scanner;
public class sq{
public static void main(String args[]){
int i;
Scanner scan=new Scanner(System.in);
System.out.println("Enter any number");
int num=scan.nextInt();
int total=0;
total=num*num;
System.out.println("Square of "+ num + " is: "+total);

}
}