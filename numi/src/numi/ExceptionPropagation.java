
public class ExceptionPropagation {

	
	void third()
	{
		try
		{
		int a=0;
		int b=30;
		b=b/a;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException s)
		{
			
			System.out.println(s);
		}
		System.out.println("third function ");
	
	}
	
	
	void second()
	{
		third();
		
		System.out.println("Second function ");
		
	}
	
   void first()
   {
	   second();
	   
	   
		System.out.println("first function ");

	   
   }
	
	
	
	
	public static void main(String a[])
	{
		
		ExceptionPropagation p=new ExceptionPropagation();
		
		p.first();
		
	}

	
	
}
