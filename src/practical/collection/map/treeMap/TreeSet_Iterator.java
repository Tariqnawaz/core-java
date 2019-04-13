package beginnersBook.map.treeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSet_Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a TreeMap
	    TreeMap<String, String> treemap = new TreeMap<String, String>();
	 
	    // Add key-value pairs to the TreeMap
	    treemap.put("Key1","Item1");
	    treemap.put("Key2","Item2");
	    treemap.put("Key3","Item3");
	    treemap.put("Key4","Item4");
	    treemap.put("Key5","Item5");
	 
	    // Get a set of the entries
	    Set set = treemap.entrySet();
	 
	    // Get an iterator
	    Iterator it = set.iterator();
	 
	    // Display elements
	    while(it.hasNext()) {
	      Map.Entry me = (Map.Entry)it.next();
	      System.out.print("Key is: "+me.getKey() + " & ");
	      System.out.println("Value is: "+me.getValue());
	    } 
	    
	    /***Iterator reverse order***/
	    
	    Map<String, String> treemap1 = new TreeMap<String, String>(Collections.reverseOrder());

	    	    // Put elements to the map
	    	    treemap1.put("Key1", "Jack");
	    	    treemap1.put("Key2", "Rick");
	    	    treemap1.put("Key3", "Kate");
	    	    treemap1.put("Key4", "Tom");
	    	    treemap1.put("Key5", "Steve");
	    	 
	    	    Set set1 = treemap1.entrySet();
	    	    Iterator i = set1.iterator();
	    	    // Display elements
	    	    while(i.hasNext()) {
	    	      Map.Entry me = (Map.Entry)i.next();
	    	      System.out.print(me.getKey() + ": ");
	    	      System.out.println(me.getValue());
	    	    }

	}

}
