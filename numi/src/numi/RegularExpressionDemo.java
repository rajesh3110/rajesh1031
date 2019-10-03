import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	
	
	public static void main(String ar[])
	{
		
		Scanner sc=new Scanner(System.in);
         
		System.out.println("Enter the pattern ");
		
		String pat=sc.nextLine();
		
		System.out.println("Enter the String ");
		
		String st1=sc.nextLine();
		
		Pattern pa=Pattern.compile(pat);
		
		Matcher matc=pa.matcher(st1);
		
		
		while(matc.find())
		{
			
			System.out.println("Start index is");
			System.out.println(matc.start());

			
			System.out.println("End index is ");
			System.out.println(matc.end());
			
			
			
			System.out.println("group ");
			System.out.println(matc.group());
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
   
	
}
