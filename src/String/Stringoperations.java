package String;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.concatenation
		
	String s="hello";
	String s1="                 welcome";
	String s2="how are you";
	
	System.out.println(s.concat(s1)); //hellowelcome
	System.out.println(s.concat(s+s1));	
	System.out.println(1+2+s+4+5);       //3hello45
		
		//2.equals
		
	System.out.println(s.equals(s1));    //false
	System.out.println(s.equals(s2));    //false
	System.out.println("s.equalsIgnorecade(s2)"); //true     
	
	 //3.contains
	System.out.println(s2.contains("how")); //true
		
	//	4.toUppercase & toLowercase
	System.out.println(s.toUpperCase());
	System.out.println(s2.toLowerCase());
		
	//5.trim
	System.out.println(s1.trim());         //space remove
	
	//6.length
	System.out.println(s.length());
	
	//7.startswith
	System.out.println(s2.startsWith("hello"));
	
	//8.endswith
	System.out.println(s2.endsWith("you"));
	
	//9.substring
	System.out.println(s2.substring(2,6)); //llo
	
	//charAt
	System.out.println(s.charAt(1)); //e
	
	//11. split
	String[]sr=s.split("  ");
	for(String v:sr)
	{
		System.out.println(v);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
