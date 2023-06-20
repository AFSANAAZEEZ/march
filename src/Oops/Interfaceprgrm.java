package Oops;

interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
	
}

interface creditcard     //DOUBT
{
	public void creditcarddetails();
		
}

class SBI implements Bank,creditcard
{

	@Override
	public void creditcarddetails() {
		 System.out.println("creditcard");
		
	}

	@Override
	public void deposit() {
		System.out.println("sbideposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbiwithdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("sbibalance");
		
	}
	}
class Federal implements Bank
{

@Override
public void deposit() {
	System.out.println("federaldeposit");
	
}

@Override
public void withdraw() {
	System.out.println("federalwithdraw");
	
}

@Override
public void balance() {
	System.out.println("federalbalance");
	
}

}

public class Interfaceprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank ob=new SBI();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
		
	ob=new Federal();
	ob.balance();
	ob.deposit();
	ob.withdraw();	
		
	
	
	}

}


