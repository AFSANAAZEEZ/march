package Oops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r; 
		int s=0 ;
		
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		
		int n =sc.nextInt();                         //i/p: 121             o/p:121
		 int temp=n;
		while(n>0)
		{
		
		r=n%10;
		s=s*10+r;
		n=n/10;
		}
		
            System.out.println(s);
         if(s==temp)
         {
		  System.out.println("palindrome");
         }
         else
         {
       	  System.out.println(" not palindrome");
         }
		
	}

}
