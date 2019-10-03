

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmailvalidation {


	
	public static void main(String ar[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gmail address  : ");
        String gmail=sc.nextLine();
        
       
        String patt="^([a-zA-Z]+)([0-9]+)@gmail.com$";
		
        Pattern p=Pattern.compile(patt);
		
		
		
		Matcher mat=p.matcher(gmail);
		
		
			 
				if(mat.matches()==true)
			{
					     
			
					System.out.println("Email is valid "+gmail);
			}
				
			else
				
			{
				
				System.out.println("Email is not valid "+gmail);
			}
				
			
		
		
		
		
		
	
	
}



}
