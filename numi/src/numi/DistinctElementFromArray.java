import java.util.*;
public class DistinctElementFromArray {
	
	
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int array[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		
		int uni=0;//[]=new int[array.length];
		
		for(int i=0;i<array.length;i++)
		
		{
		 int j;
			for(j=0;j<i;j++)
			
			
				if(array[i]==array[j])
				
					
					break;//uni=array[i];
				
			
			if(i==j)
			
				System.out.println(array[i]);
			
		
		}
		
		//System.out.println(uni);
	}

}
