import java.util.*;
interface draw
{
	
	void balance(int n);
	final static Scanner sc=new Scanner(System.in);
	//int result=0;
}


class credit implements draw
{
	
    

	public void balance(int n)
	{
	    
		System.out.println("Enter the amount to credit :");
	    int c=sc.nextInt();
	    int result1=n+c;
		System.out.println("Balance is Credit in account : "+result1+"\n");
	}
}


class debit implements draw
{
	public void balance(int n)
	{
		System.out.println("Enter the amount to debit : ");
		int d=sc.nextInt();
	    int result=n-d;	
		System.out.println("Balance is Debited in account : "+result+"\n");	}
}

public class InterfaceDemo2 {

    final static Scanner sc=new Scanner(System.in);

	public static void main(String arg[])
	{
		draw rt=new credit();
	    draw r=new debit();
		
		System.out.println("1.Enter for Credit  \n2.Enter for Debit \n ");
		int choice=sc.nextInt();
		int n;
		System.out.println("Enter the amount Initial amount : ");
		n=sc.nextInt();
		if(choice==1)
		{
		
			
			rt.balance(n);
		}

		else
		{
	
		    r.balance(n);
		}
		

	
	}
}
