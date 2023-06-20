package Oops;

interface Bankapplication
{
	public void showdetails();
	public void  balance();
	public void deposit();
	public void withdraw();
}

class Sbi implements Bankapplication
{
	
@Override
public void showdetails() 
{
 String customername;
 String accountnumber;
 String bankdetails;
 
	
	System.out.println("customername=");
	System.out.println("Accountnumber");
	System.out.println("bankdetails");
}

@Override
public void balance() {
	 System.out.println("current balance");
	
}

@Override
public void deposit() {
	// TODO Auto-generated method stub
	
}

@Override
public void withdraw() {
	// TODO Auto-generated method stub
	
}
}


public class Bankapplicationprgrm {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
