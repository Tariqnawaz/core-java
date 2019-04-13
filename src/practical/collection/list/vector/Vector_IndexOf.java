package practical.collection.list.vector;

import java.util.Vector;

public class Vector_IndexOf {

	public static void main(String[] args) {
		 // Create a Vector object
	     Vector<String> vector = new Vector<String>();
	 
	     //Add elements to Vector
	     vector.add("Kate");
	     vector.add("Patt");
	     vector.add("Kluge");
	     vector.add("Karon");
	     vector.add("Patt");
	     vector.add("Monica");
	     vector.add("Patt");
	 
	     //This would return the index of first occurrence
	     int first_index = vector.indexOf("Patt");
	     System.out.println("First Occurrence of Patt at index: "+first_index);
	 
	     //This would return the index of last occurrence
	     int last_index = vector.lastIndexOf("Patt");
	     System.out.println("Last Occurrence of Patt at index: "+last_index);
	 
	     //This would start search from index 2(inclusive)
	     int after_index = vector.indexOf("Patt", 2);
	     System.out.println("Occurrence after index 2: "+after_index);
	 
	     //This would search the element backward starting from index 6(inclusive)
	     int before_index = vector.lastIndexOf("Patt", 6);
	     System.out.println("Occurrence before index 6: "+before_index);
	}

}
