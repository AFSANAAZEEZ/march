package String;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.java program to count all vowels in a string
		
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word");
		String s1=sc.next();
		System.out.println("enterd word="+s1);
		
		for(int i=0;i<s1.length();i++)
		{
		 
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i' ||s1.charAt(i)=='o'	||s1.charAt(i)=='u')		

{
        c++;

}
		}
		
System.out.println("vowel count="+c);


		
		
			}

}
