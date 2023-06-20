package Array;

import java.util.Scanner;

public class Sumaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]ar=new int[3];
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		
	for(int i=0;i<3;i++)
	{
		ar[i]=sc.nextInt();
	
		
		
	}
	int s=0; 
	int avg=0;
	for(int v:ar)
	{
		s=s+v;
		avg=s/3;
	}
	
	System.out.println("sum="+s);
	System.out.println("avg="+avg);
	
			
		
	}

}
