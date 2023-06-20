package String;

import java.util.Scanner;

public class Stringoperationsprblm {

	public static void main(String[] args) {
	
		//to concatenate s="jmeter"   s1="performance testing tool"
		
		String s="jmeter";
		String s1="performance testing tool";	
		System.out.println(s.concat(s1));
		
		//2.i/p:java language is platform dependant check language is present in given string
	
		String s2="java language is platform dependant";
		if(s2.contains("language"))
		{
			System.out.println("language is present");
		}
		else
		{	
			System.out.println("language not present");
		
		}
	
	}

}
