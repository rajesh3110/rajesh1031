package numi;
import java.util.*;	

public class HashTableDemo {
	
	




	public static void main(String arg[])
	{
		
		
		
		Hashtable<Integer,String>pr=new Hashtable<Integer,String>();
		pr.put(121, "Rajesh");
		
		pr.put(1, "Bhosale");
		
		pr.put(110, "Aruna");
		
	    //sorted By Values only 
        ///synchronized, in contrast to HashMap.
		for(Map.Entry r:pr.entrySet())
		{
			System.out.println(r.getKey()+" "+r.getValue());
		}
		
		
		   
	    System.out.println("---------------check key -------------------------");
	    System.out.println(pr.containsKey(101));
	    
	    System.out.println("---------------check value  -------------------------");
	    System.out.println(pr.containsValue("Rajesh"));
	    
	    
	    System.out.println("---------------check key  -------------------------");
	    System.out.println(pr.containsKey(132));
	    
	    System.out.println("---------------check  value  -------------------------");
	    System.out.println(pr.containsValue("rasd"));
	    
	    
		Hashtable<Integer,String>hm=new Hashtable<Integer,String>();

	    hm.put(100,"Amit");  
	    hm.put(102,"Ravi");  
	    hm.put(101,"Vijay");  
	    hm.put(103,"Rahul");  
	    
	    for(Map.Entry m:hm.entrySet()){  
	     System.out.println(m.getKey()+" "+m.getValue());  
	    }  
	    
	}
	

}

