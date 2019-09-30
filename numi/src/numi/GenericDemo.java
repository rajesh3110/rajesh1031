
import java.util.*;

class Rajesh <T,U>
{
	
	
	T obj1;
	
	U obj2;

	Rajesh(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	public void display()
	{
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	
}

class GenericDemo {

  public static void main(String arg[])
  {
	  Rajesh <String,Integer>r=new Rajesh<String,Integer>("RAJESH",22);
	    ArrayList<String>al=new ArrayList<String>();
		
		al.add("Rajesh");
		al.add("sale");
		
		Collections.sort(al);
		
		System.out.println(al.get(0));
		
		System.out.println(al);
		
		
		
	    
		r.display();
	  
	
		
  }

}
