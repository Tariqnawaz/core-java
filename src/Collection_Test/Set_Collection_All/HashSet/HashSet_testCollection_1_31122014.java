package Collection_Test.Set_Collection_All.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_testCollection_1_31122014 {
	//hashset contain only unique
	public static void main(String args[]){  
		   
		  HashSet<String> al=new HashSet<String>();  
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
