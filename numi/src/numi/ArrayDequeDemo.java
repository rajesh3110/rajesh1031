package numi;
import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("rajesh");  
	    deque.offer("seeta");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");  
	    
	    System.out.println("After offerFirst Traversal...");  
	    
	    for(String s:deque)
	    {  
	        System.out.println(s);  
	    }  		
	   
	    deque.pollLast();  
	    
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque)
	    {  
	        System.out.println(s);  
	    }  
	    System.out.println("---------sorting by the ArrayList-------- ");
	    
	    ArrayList<String>al=new ArrayList<String>(deque);
	    Collections.sort(al);
	    for(String s:al)
	    {  
	        System.out.println(s);  
	    } 
	    System.out.println("---------reverse by the ArrayList-------- ");

	    Collections.reverse(al);
	    
	    for(String s:al)
	    {  
	        System.out.println(s);  
	    }
	    
	    
	    
	    
	    
	}  
	}  