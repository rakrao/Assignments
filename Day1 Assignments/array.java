import java.util.Scanner;
public class array{
public static void main(String[] args){
int i;
int key=0;
int arr[]=new int[15];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");


for(i=0;i<15;i++)
{
arr[i]=sc.nextInt();

}
System.out.println("Enter the key to be searched");
key=sc.nextInt();
for(i=0;i<15;i++)
{
if(key==arr[i]){
System.out.println("Key is found");
return;
}
else{
System.out.println("Key not found");
return;
}
}
} 
}