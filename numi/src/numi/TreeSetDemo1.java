package numi;
import java.util.*;  
public class TreeSetDemo1 {

	
	
	


	 public static void main(String args[]){ 

	  TreeSet<String> al=new TreeSet<String>();  
	  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  al.add("Dinesh");
      al.add("DDDDDDD");
	  
	  Iterator<String> itr=al.iterator();  
	  
	  while(itr.hasNext())
	  {  
	   System.out.println(itr.next());  
	  }  
	  System.out.println("----size----------------");
	  System.out.println(al.size());

      System.out.println("---------Printing the Reverse---------------");
      ArrayList<String>al1=new ArrayList<String>(al);
      Collections.reverse(al1);
      for(String arl:al1)
      {
    	  System.out.println(arl);
      }
      System.out.println("---------Printing Highest And Lowest Value---------------");

      System.out.println("Highest Value: "+al.pollFirst());  

      System.out.println("Lowest Value: "+al.pollLast());  

	 }  
	}  