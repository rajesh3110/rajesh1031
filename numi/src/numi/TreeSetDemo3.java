package numi;
import java.util.*;

public class TreeSetDemo3 {

	
	
	public static void main(String arg[])
	{
		
		
		
		TreeSet <String> tr=new TreeSet<String>();
		
		tr.add("Rajesh");
		tr.add("Rahul");
		tr.add("Amol");
		
		tr.add("taker");
		
		System.out.println("-----Descending Iterator -------");
		Iterator it=tr.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("---------Ascending Order---------");
        
		ArrayList <String>al=new ArrayList<String>(tr);
        Collections.sort(al);
        for(String s:al)
        {
        	System.out.println(s);
        }
	  
	   System.out.println("-----------DescendingSet()------");
        
        System.out.println(tr.descendingSet());
        
 	   System.out.println("-----------First()-------");

        System.out.println(tr.first());
        
        
  	   System.out.println("-----------last()-------");

       System.out.println(tr.last());
       
        
	}
}
