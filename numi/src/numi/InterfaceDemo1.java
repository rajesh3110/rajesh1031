import java.util.*;
interface A
{
	
	void get();
	
}

interface B extends A
{

	void show();

}

class rajesh implements A,B
{
	Scanner sc=new Scanner(System.in);
	String name;
	int n;
	
	public void get()
	{
		System.out.println("Enter the totla record of student :");
		int vs=sc.nextInt();
		for(int i=0;i<vs;i++)
		{
		System.out.println("Enter the name : ");
		name=sc.next();
		
		System.out.println("Enter the rollno number :");
		n=sc.nextInt();
		}
		
		
	}
	
	public void show()
	{
		if(n>=10)
		{
		System.out.println(" Roll number -> "+n+ "  Name   -> "+name);
		}
		else
		{
			System.out.println("no");
		}
		
	}
}

public class InterfaceDemo1 {

	public static void main(String arg[])
	{
		
		rajesh r=new rajesh();
		r.get();
		r.show();
		
	}
	
}
