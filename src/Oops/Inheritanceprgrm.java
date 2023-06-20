package Oops;

// create a class named Member having the following members *name*age*phone no*address*salary it is also a method print details of
//members.
//2 classes employee and manager inherits the member class.the employee and manager classes have data members specialization and
// department respectively.Assign values to an employee and manager by making an object of both of the class and print values.

 class Member
{
	
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
	
	public void Printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}

class employee1 extends Member
{
	String Specialization;
}

class Manager extends Member
{
	String department;
}



public class Inheritanceprgrm {

	public static void main(String[] args) {
		employee1 emp1=new employee1();
		emp1.name="arun";
		emp1.age=24;
		emp1.phoneno="9876655444";
		emp1.address="abcd";
		emp1.salary=25000;
		System.out.println(emp1.Specialization="tester");
		emp1.Printdetails();
		
		
		
		Manager mn= new Manager();
		mn.name="khilani";
		mn.age=35;
		mn.phoneno="7907348943";
		mn.salary=35000;
		mn.address="ghfdhjhhg";
		System.out.println(mn.department="automation head");
		mn.Printdetails();
		
		
	}

}
