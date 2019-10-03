import java.io.*;
class R
{
	
	void run()throws IOException
	{
		
		System.out.println("Parent : ");
	}
}

public class OverridenThrowMethod extends R {
	
	
	
	void run()throws IOException
	{
		
		System.out.println("Child : ");
		show();
	}
	void show()
	{
		System.out.println("child another method");
	}
	
	public static void main(String arg[])
	{
		
	
	
	
	R tr=new OverridenThrowMethod ();
	
try
{
	tr.run();
}
catch(Exception e)
{
	System.out.println(e);
}
	



}
}
