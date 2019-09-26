package numi;
import java.util.*;
public class TreeSetBookDemo implements Comparable<TreeSetBookDemo> {
	
	int id;
	String name;
	String address;
	int mob;
	
	public int compareTo(TreeSetBookDemo b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
	
	public TreeSetBookDemo(int i,String n,String a,int m)
	{
	this.id=i;
	this.name=n;
	this.address=a;
	this.mob=m;
	}
	
	
	public static void main(String arg[])
	{
		
		TreeSetBookDemo d1=new TreeSetBookDemo(1,"Rajesh","Mohol",864002739);
		TreeSetBookDemo d2=new TreeSetBookDemo(2,"Rakesh","Pune",895002739);
		TreeSetBookDemo d3=new TreeSetBookDemo(3,"Ranjit","ramwadi",9850062);
		TreeSetBookDemo d4=new TreeSetBookDemo(4,"amol","PCMC",96262029);
		TreeSetBookDemo d5=new TreeSetBookDemo(5,"rani","chinchwadi",862802739);

		
		TreeSet <TreeSetBookDemo>set=new TreeSet<TreeSetBookDemo>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		set.add(d5);
		//ArrayList <String>al=new ArrayList<String>(set);
		
		for(TreeSetBookDemo d:set)
		{
			System.out.println("Id -> "+d.id+" Name -> "+d.name+" Address -> "+d.address+"  Mobile No -> "+d.mob);
		}
		
		
	}
	
}
