import java.util.Scanner;
public class average{
public static void main(String[] args){
int s1,s2,s3;
Scanner sc=new Scanner(System.in);
int arr1[]=new int[3];
int arr2[]=new int[3];
int arr3[]=new int[3];
Sytem.out.println("Enter marks of student 1");
for(i=0;i<3;i++)
{
arr1[]=sc.nextInt();
}
Sytem.out.println("Enter marks of student 2");
for(i=0;i<3;i++)
{
arr2[]=sc.nextInt();
}
Sytem.out.println("Enter marks of student 3");
for(i=0;i<3;i++)
{
arr3[]=sc.nextInt();
}
Total1=arr1[0]+arr2[0]+arr3[0];
Total2=arr1[1]+arr2[1]+arr3[1];
Total3=arr1[2]+arr2[2]+arr3[2];
Total=Total1+Total2+Total3;
avg1=Total1/3;
avg2=Total1/3;
avg3=Total1/3;
avg=Total/3;
s1=arr1[0]+arr1[1]+arr1[2];
s2=arr2[0]+arr2[1]+arr2[2];
s3=arr3[0]+arr3[1]+arr3[2];
a1=s1/3;
a2=s2/3;
a3=s3/3;
}
}