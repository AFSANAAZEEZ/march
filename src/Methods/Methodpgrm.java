package Methods;

public class Methodpgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Methodpgrm ob=new Methodpgrm();
	ob.add();
	int sub=ob.sub();
    System.out.println("sub="+sub);
    System.out.println(ob.mul(20, 10));
	ob.div(34 ,45);
	}

	//1.method without return type  and without parameter
	public void add()
	{
	int a=30; int b=40;
	int c=a+b;
	System.out.println(c);
	}
	
	//2.method with returntype and without parameter
	
public int sub()
{
int a=30,b=10;
int c=a-b;
return c ;
}
	
	//method with returntype and with parameter
	public int mul(int a, int b)
	{
	int c=a*b;
	return c;
	}
	
	//4.method without returntype and with parameter
	
	public void div(double a, double b)
	{
	double c=a/b;
	System.out.println(c);
	}
	
	
	
	
	
	
	
	
}
