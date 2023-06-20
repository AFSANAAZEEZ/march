package Oops;
//create a class monkey with jump() and bite() methods.create a class human with speak method which inherits this monkey class 
//and implements basic animal interface with eat and sleep methods 

interface Basicanimal
{
	public void eat();
	public void sleep();
}


class Monkey
{
	public void jump()
	{
		System.out.println("monkeyjump");
	}
	
	public void bite()
	{
		System.out.println("bite");
	}
}

class Human extends Monkey implements Basicanimal
{

	public void speak()
	{
		System.out.println("speak");
	}
@Override
public void eat() {
	System.out.println("eat");
	
}

@Override
public void sleep() {
System.out.println("sleep");
	
}	
}


public class prblms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human ob=new Human();
		ob.bite();
	    ob.eat();
		ob.sleep();
		ob.speak();
		ob.jump();
		
		
		
		
	}

}
