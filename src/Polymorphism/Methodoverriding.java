package Polymorphism;

class Car
{
	public void accelator()
	{
		
	
  System.out.println("accelator");
}
}


class BMW extends Car
{
	@Override
	
		public void accelator()
	{
		System.out.println("BMW accelator");
		super.accelator();
	}
}




public class Methodoverriding {

	public static void main(String[] args) {
		
BMW ob=new BMW();
ob.accelator();
		
		

	}

}
