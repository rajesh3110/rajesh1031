package numi;
import java.util.*;
public class LinkedHashSetBookDemo {

	int id;
	String name;
	String Address;
	int pincode;
	public LinkedHashSetBookDemo(int i,String n,String a,int p)
	
	{
		
		this.id=i;
		this.name=n;
		this.Address=a;
		this.pincode=p;
	}
	
	public static void main(String arg[])
	{
		
		LinkedHashSetBookDemo l1=new LinkedHashSetBookDemo(102,"Rajesh","Mohol",411057);
		LinkedHashSetBookDemo l2=new LinkedHashSetBookDemo(103,"Mukesh","Solapur",41115);
		LinkedHashSetBookDemo l3=new LinkedHashSetBookDemo(104,"Dines","Mumbai",41189);

		LinkedHashSet <LinkedHashSetBookDemo>h=new LinkedHashSet<LinkedHashSetBookDemo>();
		
		h.add(l1);
		h.add(l2);
		h.add(l3);
		for(LinkedHashSetBookDemo r:h)
		{
			System.out.println("ID - "+r.id+ " Name -"+r.name+" Address -"+r.Address+" Pincode - "+r.pincode);
		}
		
		
	}
	
	
	
}