package practical.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Iterator {

	public static void main(String[] args) {
	 // Create a HashSet
     HashSet<String> hset = new HashSet<String>();
 
     //add elements to HashSet
     hset.add("Chaitanya");
     hset.add("Rahul");
     hset.add("Tim");
     hset.add("Rick");
     hset.add("Harry");
 
     Iterator<String> it = hset.iterator();
     while(it.hasNext()){
        System.out.println(it.next());
     }
     
     /******with out iterator******/
     Set<String> hset1 = new HashSet<String>();
     
     //add elements to HashSet
     hset1.add("Chaitanya");
     hset1.add("Rahul");
     hset1.add("Tim");
     hset.add("Rick");
     hset1.add("Harry");
 
     for (String temp : hset1) {
        System.out.println(temp);
     }
     
	}

}
