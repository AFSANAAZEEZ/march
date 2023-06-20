package Oops;

class Emp
{
   private  String Empname;
	private String Empdesignation;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpdesignation() {
		return Empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		Empdesignation = empdesignation;
	}
	
}




public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp ob=new Emp();
		ob.setEmpname("Arun");
	    ob.setEmpdesignation("Developer");
	   System.out.println(ob.getEmpname() );
	   System.out.println(ob.getEmpdesignation());
	
	}

}
