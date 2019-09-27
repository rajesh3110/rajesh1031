package numi;
import java.util.*;
public class TreeMapBook {

	
	int id;
	String name;
	String address;
	public TreeMapBook(int i,String n,String n1)
	{
		this.id=i;
		this.name=n;
		this.address=n1;
		
	}
	
	public static void main(String arg[])
	{
		
		TreeMapBook b1=new TreeMapBook(101,"RAJESH","Mohol");
		TreeMapBook b2=new TreeMapBook(102,"Dinesh","Pandharpur	");
		TreeMapBook b3=new TreeMapBook(101,"Mangesh","Solapur");

		TreeMap<Integer,TreeMapBook> tr=new TreeMap<Integer,TreeMapBook>();
		
		tr.put(1,b1);
		tr.put(2, b2);
		tr.put(3, b3);
		
		for(Map.Entry<Integer,TreeMapBook> r:tr.entrySet())
		{
			int key=r.getKey();
			TreeMapBook b=r.getValue();
			System.out.println(key+ " Details ");
			System.out.println("Name - > "+b.name+" Address -> "+b.address);
			
		}
		
		
	}

}
