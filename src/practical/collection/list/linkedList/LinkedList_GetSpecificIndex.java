package practical.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedList_GetSpecificIndex {

	public static void main(String[] args) {
		// Creating LinkedList of String Elements
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Populating it with String values
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("EE");

	    System.out.println("LinkedList Elements : ");
	    //get(i) returns element present at index i
	    for(int i=0; i < linkedlist.size(); i++){
	      System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
	    } 
	}

}
