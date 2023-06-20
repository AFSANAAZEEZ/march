package Methods;

public class Shapesarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapesarea ob =new Shapesarea();
		ob.triArea();
		int rectArea =ob.rectArea();
        		
		
		System.out.println("rectangle area="+rectArea);
		System.out.println("circle area=" +ob.circleArea(2.2));
		ob.squareArea(5);
		
	}

	
	//Area of a triangle
	//1.method without returntype and without parameter
	
	public void triArea()
	{
	double b=12,h=6;
	double c=0.5*b*h;
	System.out.println("area of triangle="+c);
	
	}
	
	//2.area of rectangle
	
	//2.method with retyrntype and without parameter
	
	public int rectArea()
	{
	int l=12,b=6;
	int c=l*b;
	return c;
	}
	
//Area of circle
	//method with returntype and with parameter
	
	public double circleArea(double a)
	{
	double c=3.14*a*a;
	return c;
	}

	//area of square
	
	//method without returntype and with parameter
	
	public void squareArea(int a)
	{
		int c=a*a;
		System.out.println("area of square="+c);
		
	}
	
	
	
	
}
