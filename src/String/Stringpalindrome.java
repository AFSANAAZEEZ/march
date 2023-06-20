package String;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="malayalam";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		System.out.println("reverse="+r);
		
		if(s.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
