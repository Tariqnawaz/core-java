package beginnersBook.map.treeMap;

import java.util.TreeMap;

public class TreeMap_Remove {

	public static void main(String[] args) {
		// Create a TreeMap
	    TreeMap<String, String> treemap = new TreeMap<String, String>();
	 
	    // Add key-value pairs to the TreeMap
	    treemap.put("Key1","Item1");
	    treemap.put("Key2","Item2");
	    treemap.put("Key3","Item3");
	    treemap.put("Key4","Item4");
	    treemap.put("Key5","Item5");
	 
	    // TreeMap Elements Before remove
	    System.out.println("Before: TreeMap contains: "+treemap);

	    // Removing element which is mapped to Key3
	    /* public V remove(Object key): Removes the mapping 
	     * for this key from this TreeMap if present.
	     */
	    Object removedElement = treemap.remove("Key3");
	    System.out.println("Removed Element: "+removedElement);
	 
	    // TreeMap Elements after remove
	    System.out.println("After: TreeMap contains: "+treemap);
	    
	    /**Remove All**/
	    
	 // Create a TreeMap
	    TreeMap<String, String> treemap1 = new TreeMap<String, String>();
	 
	    // Add key-value pairs to the TreeMap
	    treemap1.put("Key1","Item1");
	    treemap1.put("Key2","Item2");
	    treemap1.put("Key3","Item3");
	    treemap1.put("Key4","Item4");
	    treemap1.put("Key5","Item5");
	 
	    // TreeMap elements before calling clear()
	    System.out.println("Before: TreeMap contains: "+treemap1);
	 
	    // Make TreeMap empty
	    /* public void clear(): It removes all of the mappings from 
	     * this map. The map will be empty after this call returns.
	     */
	    treemap1.clear();
	 
	    //TreeMap elements after calling clear()
	    System.out.println("After: TreeMap contains: "+treemap1);
	}

}
