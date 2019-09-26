package numi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;
public class LinkedHashMapDemo {
	
	
	
	public static void main(String arg[])
	{
		
		LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();
	      
		
		  hm.put(101, "sandesh");
	      hm.put(1022,"anita");
	      hm.put(1031,"madhu");
	      hm.put(1014, "Krutuja");
	      hm.put(214, "Rahul");
	      hm.put(103, "Didi");
	      System.out.println("--------print the specific ID from the map: ----");
	      
	      System.out.println(hm.get(102)+"\n");
	      System.out.println(hm.get(101)+"\n");
	 
	      System.out.println("----------Size()-------------");
	      System.out.println(hm.size());
	      
	      //Insertion order is not preserved
	      System.out.println("------------print the all keys and values by using Map entry---\n");
	      
	      for(Map.Entry m:hm.entrySet())
	      {
	    	  System.out.println(" ID -> "+m.getKey()+"  Value -> "+m.getValue()+"\n");
	      }
	      
	      System.out.println("--------Update the Entry by replace---------------------\n");
	      hm.replace(214,"Bharat");
	      for(Map.Entry m:hm.entrySet())
	      {
	    	  System.out.println("Key -> "+m.getKey()+" Value -> "+m.getValue()+"\n");
	    	  
	      }
	      System.out.println("------------sorted using TreeMap-------by Key only ----- \n");
	      
	      
	      TreeMap<Integer,String> ts=new TreeMap<Integer,String>(hm);
	      for(Map.Entry m:ts.entrySet())
	      {
	    	  System.out.println("Key -> "+m.getKey()+" Values -> "+m.getValue());
	    	  
	      }
	      
	      for(Map.Entry m:hm.entrySet())
	      {
	    	  System.out.println(" ID -> "+m.getKey()+"  Value -> "+m.getValue()+"\n");
	      }
	      
	      System.out.println("-----------------Reverse--key --------------- ");
	      ArrayList<Integer>al=new ArrayList<Integer>(hm.keySet());
    	  Collections.reverse(al);
          for(int s:al)
    	  {
    	   System.out.println(s);	
    	   }
          
	      
	      
		
		}
		
	}


