package Collection_Test.Set_Collection_All.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_testCollection_1_31122014 {
	//maintains ascending order.
	public static void main(String args[]){  
		   
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }
}
