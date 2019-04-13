package practical.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedList_Push_N_Pop {

	public static void main(String[] args) {
		// Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();

	     // Add few Elements
	     list.add("Jack");
	     list.add("Robert");
	     list.add("Chaitanya");
	     list.add("kate");

	     // Display LinkList elements
	     System.out.println("LinkedList contains: "+list);

	     // push Element the list
	     list.push("NEW ELEMENT");

	     // Display after push operation
	     System.out.println("LinkedList contains: "+list);
	  
	     /***********Pop method***************/
	     
	  // Create a LinkedList of Strings
	     LinkedList<String> list1 = new LinkedList<String>();

	     // Add few Elements
	     list1.add("Jack");
	     list1.add("Robert");
	     list1.add("Chaitanya");
	     list1.add("kate");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list1);

	     // pop Element from list and display it
	     System.out.println("Element removed: "+list1.pop());

	     // Display after pop operation
	     System.out.println("LinkedList after: "+list1);
	     

	}

}
