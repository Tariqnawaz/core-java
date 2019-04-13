package Collection_Test.Set_Collection_All.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_testCollection_1_31122014 {

	public static void main(String args[]){  
		   
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
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
