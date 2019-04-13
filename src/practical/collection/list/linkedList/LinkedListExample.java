package practical.collection.list.linkedList;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.add("Adil");
	linkedList.add("Raju");
	linkedList.add("Shadaf");
	linkedList.add("Saddam");
	linkedList.add("Sarfaraz");
	linkedList.add("Afsar");
	System.out.println("Linked List content the following element :" + linkedList);
	
	/*Add First and Last Element*/
	System.out.println("Add First and Last Element");
	linkedList.addFirst("First Item");
	linkedList.addLast("Last Item");
	System.out.println("LinkedList Content after addtion of new element : " + linkedList);
	
	/*This is how to get and set Values*/
	System.out.println("/* How to get and set Values*/");
	Object firstVar = linkedList.get(0);
	System.out.println("First Element " +firstVar);
	linkedList.set(0,"Changed First Item");
	Object firstVar2 = linkedList.get(0);
	System.out.println("FirstVar after updated by set method.. =  " + firstVar2);
	
	/*Remove first and last element*/
	System.out.println("Remove first and last element");
	linkedList.removeFirst();
	linkedList.removeLast();
	System.out.println("LinkedList after deletion of first and last element" + linkedList);
	
	/* Add to a Position and remove from a position*/
	System.out.println("Add to a Position and remove from a position");
	linkedList.add(0, "New Item add at First position");
	linkedList.remove(2);
	System.out.println("LinkedList final content in this program " +linkedList);
	
	/**To remove all elements 
	 * method is clear();
	 * to remove element form a specfic position another way is 
	 * remove("saddam");
	 * **/
	
	}
}
