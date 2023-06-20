package Oops;

class Animal1
{
	public void animaldetails()
	{
		System.out.println("animal details");
	}
}


class Dog1 extends Animal1
{
	public void dogdetails()
	{
		System.out.println("dog details");
	}
}


class Tiger extends Animal1
{
	public void Tigerdetails()
	{
		System.out.println("tiger details");
	}
}


public class Hierarchialinheritance {

	public static void main(String[] args) {
	
		Dog1 ob=new Dog1();
		ob.animaldetails();
		ob.dogdetails();
		
		Tiger t=new Tiger();
		t.animaldetails();
		t.Tigerdetails();

	}

}
