package practical.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedList_Poll_PollFirst_PollLast {

	public static void main(String[] args) {
		// Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();

	     // Add few Elements
	     list.add("Element1");
	     list.add("Element2");
	     list.add("Element3");
	     list.add("Element4");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list);

	     /* poll(): Retrieves and removes the head (first element)
	      * of this list.
	      */
	     System.out.println("Element removed: "+list.poll());

	     // Displaying list elements after poll() operation
	     System.out.println("LinkedList after: "+list);
	     
	     /***********PollFirst**********/
	     
	     // Create a LinkedList of Strings
	     LinkedList<String> list1 = new LinkedList<String>();

	     // Add few Elements
	     list1.add("Element5");
	     list1.add("Element6");
	     list1.add("Element7");
	     list1.add("Element8");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list1);

	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed: "+list1.pollFirst());

	     // Display list after calling pollFirst() method
	     System.out.println("LinkedList after: "+list1);
	     
	     /**********poll last**************/
	     
	  // Create a LinkedList of Strings
	     LinkedList<String> list2 = new LinkedList<String>();

	     // Add few Elements
	     list2.add("Element9");
	     list2.add("Element10");
	     list2.add("Element11");
	     list2.add("Element12");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list2);

	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed: "+list2.pollLast());

	     // Display after calling pollLast() method
	     System.out.println("LinkedList after: "+list2);
	}

}
