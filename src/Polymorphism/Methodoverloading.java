package Polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Methodoverloading ob= new Methodoverloading();
 ob.add();
 ob.add(45,76);
 ob.add(205.87, 0);
 ob.add(5.98,67);
 
	}

	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)
	
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b){
		{
			double c=a+b;
			System.out.println(c);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
