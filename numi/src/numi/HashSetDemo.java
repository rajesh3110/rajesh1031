package numi;
import java.util.*;


public class HashSetDemo {

	

	public static void main(String args[])
	{
		HashSet <String>hs=new HashSet<String>();
		hs.add("MOHIT");
		
		hs.add("SANDESH");
		hs.add("RAJESH");
		hs.add("ROHIT");
		hs.add("AKASH");
		hs.add("DINESH");
		
		//hs.add(null); at Sorting time gives the NullPointerException;
		System.out.println("-----------Insertion order is not Preserved and Duplicate element not allowed ----------------\n");
		
		System.out.println(hs+"\n");

		System.out.println("-----------Print the element using for loop -------");
        for(String t:hs)
        {
		System.out.println(t);
        }
		System.out.println("-----------Print Index of HashSet element using ArrayList -------");

    	ArrayList<String>al2=new ArrayList<String>(hs);
		for(int i=0;i<al2.size();i++)
		{
			System.out.println("Index of "+al2.get(i)+ " is "+i);
		}
        
        
        
        
		System.out.println("-----------Print the element using Iterator method iterator()-----------");

        Iterator it=hs.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		System.out.println("-----------Sort the HashSet element using ArrayList  sort()-----------");

        ArrayList<String>al=new ArrayList<String>(hs);
        
        Collections.sort(al);
        for(String g:al)
        {
        	System.out.println(g);
        }
		System.out.println("-----------Reverse the HashSet element using ArrayList  reverse()-----------");

        Collections.reverse(al);
        for(String g:al)
        {
        	System.out.println(g);
        }
        
        System.out.println("------------Update the Existing HashSet Using addAll()--------------------");
        HashSet<String>hs1=new HashSet<String>();
        hs1.add("SANKET");
        hs1.add("Balaji");
        hs.addAll(hs1);
        for(String t:hs)
        {
        System.out.println(t);
        }
        
        System.out.println("---------------Remove the New element From Existing HashSet removeAll()------------");
        hs.removeAll(hs1);
        for(String t:hs)
        {
        System.out.println(t);
        }
        /*System.out.println("---------------Remove the Specific Element From HashSet removeIf()------------");
        hs.removeIf(h->hs.contains("AKASH"));
        for(String t:hs)
        {
        System.out.println(t);
        
        }*/
        System.out.println("------------Remove the Element from the HashSet remove()---------------------");
        hs.remove("DINESH");
        for(String t:hs)
        {
        System.out.println(t);
        
        }
        System.out.println("-------------Clear the all data ----------------------------------------------");
        hs.clear();
        System.out.println(hs); 
        
	}
}


