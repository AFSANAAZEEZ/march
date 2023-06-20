package Oops;


class Animal
{

	public void animalfood()
     {
        System.out.println("animalfood");
     }
}

class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}

class babydog extends Dog
{
	public void babydogfeature()
	{
		System.out.println("babydog");
		
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog ob=new Dog();
		ob.animalfood();
		ob.breed();
		
		babydog bd=new babydog();
		bd.animalfood();
		bd.breed();
		bd.babydogfeature();
		
		bd.babydogfeature();
				                                                                                                     
	}

}
