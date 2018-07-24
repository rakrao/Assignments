package complex;

import java.util.Scanner;

public class TestComp {
	public static void main(String[] args) {
		
		
		comp Comp1=new comp();
		comp Comp2=new comp();
		comp Comp3=new comp();
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter real part of first number");
Comp1.real=sc.nextFloat();

System.out.println("Enter imaginary part of first number");
Comp1.imaginary=sc.nextFloat();

System.out.println("Enter real part of second number");
Comp2.real=sc.nextFloat();

System.out.println("Enter imaginary part of first number");
Comp2.imaginary=sc.nextFloat();

float finalreal = Comp1.add(Comp1.real,Comp2.real); 
float finalimaginary = Comp1.add(Comp1.imaginary,Comp2.imaginary);

System.out.println("real="+finalreal);
System.out.println("imaginary="+finalimaginary);

float finalc=Comp3.add(finalreal,finalimaginary);
System.out.println("result="+finalc);
}
}
