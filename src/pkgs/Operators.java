package pkgs;

public class Operators {

	public static void main(String[] args) {
		
		//Arithemetic operator
	
		int a=20, b=30;
		System.out.println("a+b="+(a+b));    //30
      	System.out.println("a-b="+(a-b));    //-10
		System.out.println("a*b="+(a*b));  //600
		System.out.println("a/b="+(a/b)); //quotient 0
		System.out.println("a%b="+(a%b));  //reminder 
		
		//Assignment operators
		int c=30, d=20;
		System.out.println("c+=d="+(c+=d));  //c=c+d  30+20=50
		System.out.println("c-=d="+(c-=d));  //c=c-d   50-20=30
		System.out.println("c*=d="+(c*=d));  //c=c*d   30*20=600
		System.out.println("c/=d="+(c/=d));  //c=c/d   600/20=30
		System.out.println("c%=d="+(c%=d));   //c=c%d  30/20=10
		
		//Relational operators
		System.out.println(a>b);  //false
		System.out.println(a<b);  //true
		System.out.println(a<=b); //
		System.out.println(a>=b);
		System.out.println(a==b);
		
		//Logical operator
/*    A       B    A&&B   A||B  !A   !B
	  0       0     0       0    1    1
	  0        1     0      1    1    0
	  1        0     0      1    0     1
	  1        1     1      1    0     0  */
		 String username="abc";
		 String password="123";
		System.out.println(username=="abc" && password=="123"); //true
		System.out.println(username=="abc" || password=="123");//false
		System.out.println(!(username=="abc")); //false
		
		//urinary operator
		  //++  increment by 1
		  //--  decrement by  1
		  
		int d1=2;
		System.out.println(d1++); //2(first print 2 then increment)
        System.out.println(d1);		// 3
        
     
		
		
		
	}

}
