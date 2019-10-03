import java.util.*;
import java.io.*;

class InvalidAge extends Exception
{

	InvalidAge(String a)
	{
      System.out.println("Invalid Age : ");///super(a);
	}

}


public class CustomException {

	
	
    static void validate(int age) throws InvalidAge
   {
	  if(age <=18)
	  {
		  throw new InvalidAge(" ");
	  }
	  else
	  {
		  System.out.println("valid");
	  }
    	
    	
   }
		
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Age : ");
	  int n=sc.nextInt();
	  
	 try
	  {
   validate(n);
     	}
	catch(Exception e)
	
	 {
		
	  }
	
	
	
	}
}
