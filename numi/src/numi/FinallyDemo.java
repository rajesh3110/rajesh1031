import java.util.*;
public class FinallyDemo {
	
	
	public static void main(String ag[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		try
		{
			System.out.println("Enter the a number ");
			int a=sc.nextInt();
			System.out.println("Enter the b number ");

			int b=sc.nextInt();
			b=b/a;
			System.out.println(b);
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
		
		
		
		
		
		finally
		{
			System.out.println("Finally is alway executed ");
		}
		
		System.out.println("Rest code is fine : ");
	}

}
