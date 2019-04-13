package practical.collection.list.vector;

import java.util.Collections;
import java.util.Vector;

public class Vector_Sort {

	public static void main(String[] args) {
		 // Create a Vector
	    Vector<String> vector = new Vector<String>();
	 
	    //Add elements to Vector
	    vector.add("Walter");
	    vector.add("Anna");
	    vector.add("Hank");
	    vector.add("Flynn");
	    vector.add("Tom");
	 
	    // By Default Vector maintains the insertion order
	    System.out.println("Vector elements before sorting: ");
	    for(int i=0; i < vector.size(); i++){
	       //get(i) method fetches the element from index i
	       System.out.println(vector.get(i));
	    }

	    // Collection.sort() sorts the collection in ascending order
	    Collections.sort(vector);
	 
	    //Display Vector elements after sorting using Collection.sort
	    System.out.println("Vector elements after sorting: :");
	    for(int i=0; i < vector.size(); i++){
	       System.out.println(vector.get(i));
	    }
	}

}
