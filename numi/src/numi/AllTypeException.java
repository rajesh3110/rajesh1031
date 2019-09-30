
import java.util.*;
import java.io.*;
public class AllTypeException {


public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("-ArithmeticException-\n");
	int a=0;
	int b=10;
	int c; 
	try
	{
	
	c=b/a;
	}
	catch(Exception e)
	{
	System.out.println(b/(a+2));
	}
	
	
	System.out.println("-NullPointerException-\n");
	try
	{
		String a1=null;
		System.out.println(a1.length());
		
	}
	catch(Exception e)
	{
		System.out.println(e);

	}
	
	
	System.out.println("-ArrayIndexOutOfBoundsException-\n");

	try
	{
    int n[]=new int[10];
    System.out.println(n[111]);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	
	System.out.println("-NumberFormatException-\n");
	try 
	{
		

		String s="abc";  
		int i=Integer.parseInt(s);System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	System.out.println("-StringIndexOutOfBoundException-\n");

	try
	{
    String name="Rajesh"; 
    System.out.println(name.charAt(23));
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("-FileNotFound-\n");

	try
	{
    File r=new File("E://file.text");
    FileReader br=new FileReader(r);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Done");
	}
	
	
}

}
