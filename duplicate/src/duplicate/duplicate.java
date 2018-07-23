package duplicate;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word:");
		String word=sc.nextLine();
		int length=word.length();
		char ch;
		String answer="";
		for(int i=0;i<length;i++)
		{
			ch=word.charAt(i);
			if(ch!=' ')
				answer=answer+ch;
			word=word.replace(ch,' ');
			
		}
		System.out.println(answer);
	}

}
