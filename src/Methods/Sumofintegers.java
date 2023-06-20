package Methods;                // enter a number and find thesum of that integers(eg:345=12)

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.err.println("enter a number");
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Sumofintegers s= new Sumofintegers();
   int sum= s.Sumofintegers(n);
	System.out.println("sum of integers"+sum);
	}


public int Sumofintegers(int n)
{

int r,s=0;
while(n>0) 
{

	r=n%10;
	s=s+r;
	n=n/10;
	
}

return s;

}

}

 