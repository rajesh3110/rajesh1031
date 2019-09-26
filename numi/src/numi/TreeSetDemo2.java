package numi;
import java.util.*;
public class TreeSetDemo2 {


	
	 public static void main(String args[]){  
		 TreeSet<String> set=new TreeSet<String>();  
		         set.add("Ravi");  
		         set.add("Vijay");  
		         set.add("Ajay");  
		         set.add("Dinesh");
		         set.add("DDDDDDD");
		         
		         System.out.println("Traversing element through Iterator in descending order");  
		         
		         Iterator i=set.descendingIterator();  
		         while(i.hasNext())  
		         {  
		             System.out.println(i.next());  
		         }  
		         System.out.println("--------Print using For Loop-----");
		         for(String l:set)
		         {
		        	 System.out.println(l);
		         }
		         
		         System.out.println("----------Print the Index----");
		         ArrayList<String> al=new ArrayList<String>(set);
		         for(int i1=0;i1<al.size();i1++)
		         {
		        	 System.out.println(al.get(i1)+" index is "+i1);
		         }
		           
		 }  
		}  