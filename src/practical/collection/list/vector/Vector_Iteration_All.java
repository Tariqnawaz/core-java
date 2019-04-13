package practical.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Iteration_All {

	public static void main(String[] args) {
		 // Create a Vector 
	    Vector<String> vector = new Vector<String>();
	 
	    // Add elements into Vector
	    vector.add("Chaitanya");
	    vector.add("Shubham");
	    vector.add("Apoorv");
	    vector.add("Jin");
	    vector.add("Jacob");
	 
	    // Get Enumeration of Vector elements 
	    Enumeration en = vector.elements();
	 
	    /* Display Vector elements using hashMoreElements()
	     * and nextElement() methods. 
	     */
	    System.out.println("Vector elements are: ");
	    while(en.hasMoreElements())
	       System.out.println(en.nextElement());
	    
	    /********Iterator**********/
	    
	    Vector<String> vectorr = new Vector<String>();
	    
	     //Adding elements to the Vector
	    vectorr.add("Mango");
	    vectorr.add("Orange");
	    vectorr.add("Apple");
	    vectorr.add("Grapes");
	    vectorr.add("Kiwi");
	 
	     //Obtaining an iterator
	     Iterator it = vectorr.iterator();

	     System.out.println("vectorr elements are:");
	     while(it.hasNext()){
	       System.out.println(it.next());
	     }
	     
	     /********List Iterator**********/
	     
	  // Create a Vector
	     Vector<String> vectors = new Vector<String>();
	 
	     //Adding elements to the Vector
	     vectors.add("Item1");
	     vectors.add("Item2");
	     vectors.add("Item3");
	     vectors.add("Item4");
	     vectors.add("Item5");
	 
	     ListIterator litr = vectors.listIterator();
	     System.out.println("Traversing in Forward Direction:");
	     while(litr.hasNext())
	     {
	       System.out.println(litr.next());
	     }
	 
	     System.out.println("\nTraversing in Backward Direction:");
	     while(litr.hasPrevious())
	     {
	       System.out.println(litr.previous());
	     }
	}

}
