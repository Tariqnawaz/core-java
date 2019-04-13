package Collection_Test.Sorting.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting_testCollection_1_31122014 {
//Example of Sorting the elements of List that contains string objects
	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  
}
