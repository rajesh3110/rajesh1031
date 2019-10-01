
public class NestedTRY {
	
	public static void main(String args[]){  
	
		try{
			  
			      try
		            {
		    	
		               System.out.println("going to divide");  
		                int b =39/0;  
		            }
		    
		    
		        catch(ArithmeticException e){System.out.println(e);}  
                  int a[]=new int[5];  

		                     try
		                       {  
		                         a[3]=4; 
		                         for(int i=0;i<a.length;i++)
		     		        	{
		     		        	System.out.println(a[i]);
		     		        	}
		                         
		                       }
		        catch(ArrayIndexOutOfBoundsException e)
		            {
		        	for(int i=0;i<a.length;i++)
		        	{
		        	System.out.println(a[i]);
		        	}
		        	System.out.println(e);
		             }  
		     
		        System.out.println("other statement");
		    
		  }
		catch(Exception e){System.out.println("handeled");}  
		  
		  System.out.println("normal flow..");  
		 }  
		}  
