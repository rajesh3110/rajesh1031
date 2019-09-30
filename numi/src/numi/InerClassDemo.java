
import java.util.*;
class Outer 
{
	 Scanner sc=new Scanner(System.in);
	 int age;
	 int salary;
	 String name;
	class Inner 
	{
		
	  public void getdata()
		{
		  System.out.println("Enter the name : ");
		  
          name=sc.next();
		  
		  System.out.println("Enter the age ");
		  
		  age=sc.nextInt();
		  
		  System.out.println("Enter the salary ");

		  salary=sc.nextInt();
		  
			
		}
	  
	   public void display()
	   {
		   if(salary>=23000)
		   {
		   System.out.println("Name - : "+name +" Age -:  "+age);
		   }
		   else
		   {
			   System.out.println("Salary should be greater then equal to 23000");
		   }
		   
	   }
	  
	  
	  
	}
	

}

public class InerClassDemo 
{
	

 public static void main(String a[])
 {
	 
	Outer.Inner o=new Outer().new Inner();
	
	o.getdata();
	o.display();
	

}
}
