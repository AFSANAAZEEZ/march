package String;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//4. String s3="selenium webdriver is used for webapplication testing "split the string and print all the words,
		// stop execution when webapplication is display
		
		String s= "selenium webdriver is used for webapplication testing";
		
		String a[]=s.split(" ");
		
		for (String s1:a)
		{
			System.out.println(s1);
			
			if(s1.contains("webapplication"))
				
			{
				
				break;
			}
		}
			
		
		
		

	}

}
