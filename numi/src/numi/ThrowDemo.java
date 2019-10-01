import java.util.*;



public class ThrowDemo {

	
	static void validateAGe(int age)
	{
		
		if(age<18)
		{
			throw new ArithmeticException("Entered Age is InValid");
		
		}
		else
		{
			System.out.println("Entered Age is Valid ");
		}
	}

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		validateAGe(age);
		
		
		
		
		
	}
}
