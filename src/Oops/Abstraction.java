package Oops;

abstract class Car{
	
	abstract public void speedlimit();
	
	public void carengine ()
	{
		System.out.println("car engine");
	}
}


class Maruti extends Car
{

	@Override
	public void speedlimit() {
		
		System.out.println("maruti speedlimit");
		
	}
	
}


class BMW extends Car
{

	@Override
	public void speedlimit() {
		
		System.out.println("BMW speedlimit");
		
	}
		
	}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maruti m=new Maruti();
		m.carengine();
		m.speedlimit();
					
	}

}
