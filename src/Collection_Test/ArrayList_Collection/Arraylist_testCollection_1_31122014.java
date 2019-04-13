package Collection_Test.ArrayList_Collection;


import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist_testCollection_1_31122014 {

	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  /*Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements
		  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  } 
			  
      		  Two ways to iterate the elements of collection in java
             By Iterator interface.
             By for-each loop.

		  */
		  for(String obj:al)  
			    System.out.println(obj);  
			 }  
	}


