package numi;

import java.util.HashSet;
import java.util.*;
public class ArrayDequeBookDemo {

	int id;
	String name;
	String Address;
	public ArrayDequeBookDemo(int i,String n,String a)
	{
		this.id=i;
		this.name=n;
		this.Address=a;
	}
	
	public static void main(String args[])
	{
		ArrayDequeBookDemo b1=new ArrayDequeBookDemo(214,"RAJESH BHOSALE","Anna Bhau Sathe Nagar MOHOL");
		
		ArrayDequeBookDemo b2=new ArrayDequeBookDemo(215,"BHUSHAN KURLE","Muradbad Mumbai ");

		ArrayDequeBookDemo b3=new ArrayDequeBookDemo(201,"SOURABH  ","AHMADNAGAR");
		ArrayDequeBookDemo b4=new ArrayDequeBookDemo(58,"AUDUMBAR ","LATUR");

		
		ArrayDeque <ArrayDequeBookDemo>h=new ArrayDeque<ArrayDequeBookDemo>();
		h.add(b1);
		h.add(b2);
		h.add(b3);
		
		h.add(b4);
		for(ArrayDequeBookDemo br:h)
		{
			System.out.println("ID - "+br.id+" Name - "+br.name+" Address - "+br.Address);
		}
		
		
	}

}
