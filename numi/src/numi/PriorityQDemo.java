package numi;

import java.util.*;

public class PriorityQDemo {

public static void main(String args[]){  
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		queue.add("Amit");  
		
		queue.add("Vijay");  
		
		queue.add("Karan"); 
		
		queue.add("Jai"); 
		
		queue.add("Rahul");  
		
		
		queue.add("Palak");  

		queue.add("tree");
		queue.add("rajjjiii");
		queue.add("pritek");  



		System.out.println("head:"+queue.element());  
		
		System.out.println("head:"+queue.peek());  
		
		System.out.println("iterating the queue elements:");  
		
		Iterator itr=queue.iterator(); 
		
		while(itr.hasNext())
		{  
			
		System.out.println(itr.next());  
		}  
		queue.remove();  
		
		queue.poll();
		
		System.out.println("after removing two elements:");  
		
		Iterator<String> itr2=queue.iterator();
		
		while(itr2.hasNext())
		{  
			
		System.out.println(itr2.next());  
		
		}
		
		System.out.println("-----------Sorted---------------");
		
		ArrayList<String>al=new ArrayList<String>(queue);
		Collections.sort(al);
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("-----Reverse ------------");
		ArrayList<String>al2=new ArrayList<String>(queue);
		Collections.reverse(al2);
	    for(String s:al2)
		{
			System.out.println(s);
		}
		
		
		}
		
	}	
