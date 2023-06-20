package Methods;

import java.util.Scanner;

public class Average3numbers {

	public static void main(String[] args) {
	System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		Average3numbers ob=new Average3numbers();
		ob.average(n1,n2,n3);
		
		
	}

	
	public void average(int n1,int n2,int n3)
	{
		int sum=n1+n2+n3;
		int average=sum/3;
		System.out.println(average);
	}
	
	
	
	
	
	
	
}
