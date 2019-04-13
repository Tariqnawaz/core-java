package beginnersBook.map.hashMap;

import java.util.HashMap;

public class HashMap_Remove_RemoveAll_IsEmpty {

	public static void main(String[] args) {
		// Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    hashmap.put(33,"Value3");
	    hashmap.put(44,"Value4");
	    hashmap.put(55,"Value5");
	    hashmap.put(66,"Value6");
	 
	    // Displaying HashMap Elements
	    System.out.println("HashMap Elements: " + hashmap);

	    // Removing Key-Value pairs for key 33
	    Object removedElement1 = hashmap.remove(33);
	    System.out.println("Element removed is: " +removedElement1);
	 
	    // Removing Key-Value pairs for key 55
	    Object removedElement2 = hashmap.remove(55);
	    System.out.println("Element removed is: " +removedElement2);

	    // Displaying HashMap Elements after remove
	    System.out.println("After Remove:");
	    System.out.println("--------------");
	    System.out.println("HashMap Elements: " + hashmap);
	    
	    /** Check is empty**/
	    
	 // Create a HashMap
	    HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
	 
	 
	    // Checking whether HashMap is empty or not
	    /* isEmpty() method signature and description -
	     * public boolean isEmpty(): Returns true if this map 
	     * contains no key-value mappings.
	     */
	    System.out.println("Is HashMap Empty? "+hmap.isEmpty());
	 
	    // Adding few elements
	    hmap.put(11, "Jack");
	    hmap.put(22, "Rock");
	    hmap.put(33, "Rick");
	    hmap.put(44, "Smith");
	    hmap.put(55, "Will");
	 
	    // Checking again
	    System.out.println("Is HashMap Empty? "+hmap.isEmpty());
	    
	    /**Remove All**/
	    
	 // Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap1.put(11,"Value1");
	    hashmap1.put(22,"Value2");
	    hashmap1.put(33,"Value3");
	    hashmap1.put(44,"Value4");
	    hashmap1.put(55,"Value5");
	 
	    // Displaying HashMap Elements
	    System.out.println("HashMap Elements: " + hashmap1);

	    // Removing all Mapping
	    hashmap1.clear();

	    // Displaying HashMap Elements after remove
	    System.out.println("After calling clear():");
	    System.out.println("---------------------");
	    System.out.println("HashMap Elements: " + hashmap1); 
	 }
	}


