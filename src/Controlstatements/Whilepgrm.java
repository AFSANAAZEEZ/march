package Controlstatements;

public class Whilepgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3456;
		int c=0;
		while (n>0) //1. 3456>0       2.345>0     3.34>0    4.3
		{
		n=n/10; //3456/10=345         345/10      34/10      3/10
		c++   ; //1                    2             3         4
		}   
		System.out.println("count="+c);
		
		
	}

}


//int n=3456
//o/p=4

//int n=3456
//o/p= 6543







