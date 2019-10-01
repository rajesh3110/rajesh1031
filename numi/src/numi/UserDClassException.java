import java.util.*;
 class EX extends Exception
{
	
	
	public EX(String s)
	{
		System.out.println(s);
	}
}



public class UserDClassException {

	
	
	
	public static void main(String arg[])
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		
		int age=sc.nextInt();
		try
		  {
		   if(age<=18)
		      {
			    throw new EX(" Age should be greater then equal to  18 : ");
		      }
	      else
			 {
			   System.out.println(" Valid Age "+age);
	          }
		  }
		catch(EX r)
		{
			System.out.println("");
		}
		
		
	}
}
