package Oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgrm {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream("E://book1.xlsx");
		
		
		
		
		
		try
		{
			int a=20,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("arithemetic exception");
		
		}
		
		System.out.println("hello");
		
		
		try
		{
			int[]a=new int[3];
			a[0]=45;
			a[1]=54;
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("arrayinexboundexception");
		
		
		}
		try
		{
		String s=null;
		
		System.out.println(s.length());
		}	
	
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
			System.out.println("Stringlength exception");
		}
		
		
		
		
		
		
		
		
	}

}
