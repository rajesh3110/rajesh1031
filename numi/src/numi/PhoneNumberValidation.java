

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumberValidation {

	public static void main(String ag[])
	{
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Phone number :");
	
	String phone=sc.next();
	
	
	String phPattern="([0-9]+){10}";
	
	Pattern pat=Pattern.compile(phPattern);
	
	Matcher m=pat.matcher(phone);
	
	if(m.matches()==true)
	{
		System.out.println("Phone number is correct");
	}
	
	else
	{
		System.out.println("Phone number is not correct ");
	}
	
	
	
	
		
	}
}
