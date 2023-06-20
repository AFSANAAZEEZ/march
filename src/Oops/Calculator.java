package Oops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter your choice  1. add  2.sub  3. multi   4. div"); 
		int ch= sc.nextInt();
		//char c=sc.next().charAt(0);     // (options a,b,c kodthal
		
		double result=0;
		switch(ch)
		{
		case 1:result=a+b;
		break;
		case 2:result=a-b;
		break;
		case 3:result=a*b;
		break;
		case 4: if(b==0)
	{
	System.out.println("not divisible by 0");		
	}
	else
	{ 
	result=a/b;
	
		break;
	}
		default: System.out.println("invalid choice");
		}
		
		System.out.println("result="+result);
		
			}

}
