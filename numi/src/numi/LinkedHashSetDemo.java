package numi;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String args[])
	{
		LinkedHashSet <String>lhs=new LinkedHashSet<String>();
		lhs.add("MUKESH");//Index 0
			
		lhs.add("MOHIT");//Index 1
		lhs.add("POOJA");//Index 2
		lhs.add("SANKET");//Index 3
		lhs.add("RAKESH");//Index 4
		lhs.add("SURESH");//Index 5
		lhs.add("MOHIT");//duplicate
		//hs.add(null); at Sorting time gives the NullPointerException;
		System.out.println("-----------Insertion order is Preserved and Duplicate element not allowed ----------------\n");
		
		System.out.println(lhs+"\n");

		System.out.println("-----------Print Index of LinkedHashSet element using ArrayList -------");
      
		ArrayList<String>al2=new ArrayList<String>(lhs);
		for(int i=0;i<al2.size();i++)
		{
			System.out.println("Index of "+al2.get(i)+ " is "+i);
		}
        
		System.out.println("-----------Print the element using Iterator method iterator()-----------");

        Iterator it=lhs.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		System.out.println("-----------Sort the LinkedHashSet element using ArrayList  sort()-----------");

        ArrayList<String>al=new ArrayList<String>(lhs);
        
        Collections.sort(al);
        for(String g:al)
        {
        	System.out.println(g);
        }
		System.out.println("-----------Reverse the LinkedHashSet element using ArrayList  reverse()-----------");

        Collections.reverse(al);
        for(String g:al)
        {
        	System.out.println(g);
        }
        
        System.out.println("------------Update the Existing LinkedHashSet Using addAll()--------------------");
        HashSet<String>hs1=new HashSet<String>();
        hs1.add("SANKET");
        hs1.add("Balaji");
        lhs.addAll(hs1);
        for(String t:lhs)
        {
        System.out.println(t);
        }
        
        System.out.println("---------------Remove the New element From Existing LinkedHashSet removeAll()------------");
        lhs.removeAll(hs1);
        for(String t:lhs)
        {
        System.out.println(t);
        }
        /*System.out.println("---------------Remove the Specific Element From LinkedHashSet removeIf()------------");
        hs.removeIf(h->hs.contains("AKASH"));
        for(String t:hs)
        {
        System.out.println(t);
        
        }*/
        System.out.println("------------Remove the Element from the LinkedHashSet remove()---------------------");
        lhs.remove("DINESH");
        for(String t:lhs)
        {
        System.out.println(t);
        
        }
        System.out.println("-------------Clear the all data ----------------------------------------------");
        lhs.clear();
        System.out.println(lhs); 
        
	}
}


