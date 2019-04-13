package practical.collection.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet_ConvertHashSetToList_or_ArrayList {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		 
	     //add elements to HashSet
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a List of HashSet elements
	     List<String> list = new ArrayList<String>(hset);
	 
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	}

}
