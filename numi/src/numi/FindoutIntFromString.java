import java.util.*;
public class FindoutIntFromString {
	
	public static void main(String ar[])throws Exception
	{
		
		String s="Gf 55 20.2 Strin 50f , > . 54544 ,sdfadss, fasdf r9rer ";
		
		
		Scanner sc=new Scanner(s);
		while(sc.hasNext())
		{
			if(sc.hasNextInt())
			{
				System.out.println("Int Is Found - "+sc.nextInt());
			}
			
			else
			{
				System.out.println("Int Is not Found  - "+sc.next());
			}
			
			
		}
		sc.close();
		
	}

}
