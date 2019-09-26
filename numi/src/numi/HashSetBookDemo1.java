package numi;
import java.util.*;
public class HashSetBookDemo1 {

	int id;
	String name;
	String Address;
	public HashSetBookDemo1(int i,String n,String a)
	{
		this.id=i;
		this.name=n;
		this.Address=a;
	}
	
	public static void main(String args[])
	{
		HashSetBookDemo1 b1=new HashSetBookDemo1(214,"RAJESH BHOSALE","Anna Bhau Sathe Nagar MOHOL");
		
		HashSetBookDemo1 b2=new HashSetBookDemo1(215,"BHUSHAN KURLE","Muradbad Mumbai ");

		HashSetBookDemo1 b3=new HashSetBookDemo1(201,"SOURABH GORE ","AHMADNAGAR");
		HashSetBookDemo1 b4=new HashSetBookDemo1(58,"AUDUMBAR BADGIRE","LATUR");

		
		HashSet <HashSetBookDemo1>h=new HashSet<HashSetBookDemo1>();
		h.add(b1);
		h.add(b2);
		h.add(b3);
		
		h.add(b4);
		for(HashSetBookDemo1 br:h)
		{
			System.out.println("ID - "+br.id+" Name - "+br.name+" Address - "+br.Address);
		}
		
		
	}

}
