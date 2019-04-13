package Collection_Test.javaConceptOfTheDayCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import oops.inheritance.package2.E;

public class CollectionConsolidatedProgram {
	public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        System.out.println(list.size());     //Output : 3
 
        //Inserting some more elements
        list.add("FOUR");
        list.add("FIVE");
        System.out.println(list.size());    //Output : 5
        
      //Removing an element
        list.remove("TWO");
        System.out.println(list.size());    //Output : 4
        
        //Modification Operations On ArrayList
        list.add(2, "THREE");               //Inserting an element at index 2
        list.add(1, "ONE");                 //Inserting an element at index 1
        System.out.println(list);    
        
      //bulk Modification Operations On ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("THREE");
        list2.add("FOUR");
        list2.add("FIVE");
        System.out.println(list2);          //Output : [THREE, FOUR, FIVE, SIX]
        list.addAll(list2);                 //Appends list2 at the end of list1
        System.out.println(list);           //Output : [ONE, TWO, THREE, FOUR, THREE, FOUR, FIVE, SIX]
        list.removeAll(list2);              //Removes the elements of list1 which are also elements of list2
        System.out.println(list);           //Output : [ONE, TWO]
        list.addAll(2, list2);              //Inserts all elements of list2 into list1 at position 2
        System.out.println(list);           //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX]
        list.retainAll(list2);              //Retains all elements of list1 which are also elements of list2
        System.out.println(list);           //Output : [THREE, FOUR, FIVE, SIX]
        list.clear();                       //Removes all elements of list1
        System.out.println(list);           //Output : []
        
        //Arraylist can hold multiple null value and duplicate elements
        list.add(null);
        list.add(null);
        list.add("A");
        list.add("A");
        list.add("A");
        System.out.println(list);     //Output : [100, null, null]
        
        //traverse an ArrayList in both the directions 
        ListIterator iterator = list.listIterator();
        System.out.println("Elements in forward direction");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Elements in backward direction");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        
        Collections.synchronizedList(list);
        //It returns Synchronized list backed by original list.
    }
}

/* Vector Class */
class VectorClassExample{
    public static void main(String[] args){
        //Creating vector object with capacity of 3 and with default capacity increment i.e 0
        Vector<Integer> vector = new Vector<Integer>(3);
        //Printing Current Capacity of Vector
        System.out.println(vector.capacity());      //Output : 3
        //Adding 4 elements (greater than the capacity) to vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        //again Printing Current Capacity of Vector
        System.out.println(vector.capacity());     //Output : 6
        
       //Setting the size of vector as 10.
        vector.setSize(10);
        //Now retrieving the current size of vector
        System.out.println(vector.size());    //Output : 10
        //Printing the elements of vector. notice that 6 null elements are inserted
        System.out.println(vector);     //Output : [10, 20, 30, 40, null, null, null, null, null, null]
        //Again changing the size of vector to 3
        vector.setSize(3);
        //Printing the elements of vector. notice that extra elements are removed.
        System.out.println(vector);    //Output : [10, 20, 30]
        
      //Getting Enumeration object
        Enumeration<Integer> en = vector.elements();
        //traversing elements of Vector using Enumeration
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        
       //Getting first element
        System.out.println(vector.firstElement());     //Output : 10
        //Getting last element
        System.out.println(vector.lastElement());      //Output : 40
    }
}

/* Java PriorityQueue Example With Default Comparator : */
class PriorityQueueExample{
    public static void main(String[] args){
        //Creating a PriorityQueue with default Comparator.
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        //Inserting elements into pQueue.
        pQueue.offer(21);
        pQueue.offer(17);
        pQueue.offer(37);
        pQueue.offer(41);
        pQueue.offer(9);
        pQueue.offer(67);
        pQueue.offer(31);
        //Removing the head elements
        System.out.println(pQueue.poll());     //Output : 9
        System.out.println(pQueue.poll());     //Output : 17
        System.out.println(pQueue.poll());     //Output : 21
        System.out.println(pQueue.poll());     //Output : 31
        System.out.println(pQueue.poll());     //Output : 37
        System.out.println(pQueue.poll());     //Output : 41
        System.out.println(pQueue.poll());     //Output : 67
    }
}

/* HashSet Example */
class HashSetExample{
	public HashSetExample(){
		 Map<String,String> map = new HashMap<String,String>();          //Creating internally backing HashMap object
	}
	 
	//Constructor - 2
	public HashSetExample(Collection<? extends E> c){
		Map<String,String> map = new HashMap<String,String>(Math.max((int) (c.size()/.75f) + 1, 16));     //Creating internally backing HashMap object
	       //addAll(c);
	}
	 
	//Constructor - 3
	public HashSetExample(int initialCapacity, float loadFactor){
		Map<String,String> map = new HashMap<String,String>(initialCapacity, loadFactor);        //Creating internally backing HashMap object
	}
	 
	//Constructor - 4
	public HashSetExample(int initialCapacity){
		Map<String,String> map = new HashMap<String,String>(initialCapacity);          //Creating internally backing HashMap object
	}
	
	/*public boolean add(E e){
        return map.put(e, PRESENT)==null;
    }
	public boolean remove(Object o){
        return map.remove(o)==PRESENT;
	}*/
    public static void main(String[] args){
        //Creating HashSet object
        HashSet<String> set = new HashSet<String>();
        //Adding elements to HashSet
        set.add("JAVA");
        set.add("JSP");
        set.add("STRUTS");
        set.add("HIBERNATE");
        set.add("JSP");
        set.add("JAVA");
        //Printing the elements of HashSet
        System.out.println(set);     //Output : [STRUTS, HIBERNATE, JSP, JAVA]
        //You can notice that duplicate elements are not added to HashSet
        
        set.add(null);
        set.add(null);
        set.add(null);
        //Printing the elements of HashSet
        System.out.println(set);
        
        Set<String> syncSet = Collections.synchronizedSet(set);
    }
}

/* LinkedHashSet */
class LinkedHashSetExample{
	//Constructor - 1
	public LinkedHashSetExample(int initialCapacity, float loadFactor){
	   //   super(initialCapacity, loadFactor, true);              //Calling super class constructor
	}
	 
	//Constructor - 2
	public LinkedHashSetExample(int initialCapacity){
	    //    super(initialCapacity, .75f, true);             //Calling super class constructor
	}
	 
	//Constructor - 3
	public LinkedHashSetExample(){
	       // super(16, .75f, true);                //Calling super class constructor
	}
	 
	//Constructor - 4
	public LinkedHashSetExample(Collection<? extends E> c){
	     //   super(Math.max(2*c.size(), 11), .75f, true);          //Calling super class constructor
	     //  addAll(c);
	}
	/*In the above code snippet, you might have noticed that all 4 constructors are calling the same super class constructor. This 
	 * constructor is a package private constructor which is used only by the LinkedHashSet class. This constructor takes initial 
	 * capacity, load factor and one boolean dummy value as it’s arguments. This boolean dummy value is just used to differentiate 
	 * this constructor from other constructors of HashSet class which take initial capacity and load factor as their arguments. Here 
	 * is the how this constructor is defined in HashSet class.*/
	
	/*HashSet(int initialCapacity, float loadFactor, boolean dummy){
        map = new LinkedHashMap<>(initialCapacity, loadFactor);
	}*/
	
	/*this constructor internally creates one new LinkedHashMap object. This LinkedHashMap object is used by the 
	  LinkedHashSet to store it’s elements.*/
	
	// This method is responsible for maintaining insertion order in LinkedHashSet
	private static class Entry<K,V> extends HashMap.Entry<K,V>{
        // These fields comprise the doubly linked list used for iteration.
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, HashMap.Entry<K,V> next) {
            super(hash, key, value, next);
        }
	}
	/*The first two fields of above inner class of LinkedHashMap – before and after are responsible for maintaining the insertion order 
	 of the LinkedHashSet. The header field of LinkedHashMap stores the head of this doubly linked list. It is declared like below,
	/*private transient Entry<K,V> header;        //Stores the head of the doubly linked list*/
    public static void main(String[] args){
        //Creating LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        //Adding elements to LinkedHashSet
        set.add("JAVA");
        set.add("J2EE");
        set.add("STRUTS");
        set.add("JSP");
        set.add("JDBC");
        set.add("HIBERNATE");
        //Printing elements of LinkedHashSet
        System.out.println(set);     
        //Output : [JAVA, J2EE, STRUTS, JSP, JDBC, HIBERNATE]
       //Notice the order of elements. They are placed according to their insertion order.
        
      //Getting Iterator object
        Iterator<String> it = set.iterator();
        //Modifying the LinkedHashSet after the Iterator is created
        set.add("JSF");
        while (it.hasNext()){
            //This statement will throw ConcurrentModificationException
            System.out.println(it.next());
        }
        
        //LinkedHashSet doesn’t allow duplicate elements and allows only one null element.
        set.add(null);
        set.add(null);
        set.add("JDBC");
        //printing the elements of LinkedHashSet
        System.out.println(set);  
    }
}

/* TreeSet */
class TreeSetExample{
    public static void main(String[] args){
        //Creating a TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>();
        //Adding elements to TreeSet
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(80);
        set.add(30);
        //Printing elements of TreeSet
        System.out.println(set);      //Output : [10, 20, 30, 40, 80]
        //Notice that elements are placed in the sorted order.
        Set<Integer> treeSet = Collections.synchronizedSortedSet(set);
        
        set.add(null);    //It will throw NullPointerException
        
        /*Elements inserted in the TreeSet must be of Comparable type and elements must be mutually comparable. If the elements are 
          not mutually comparable, you will get ClassCastException at run time.*/
        //Creating a TreeSet
        TreeSet<Object> set1 = new TreeSet<Object>();
        //Adding elements to TreeSet
        set1.add("kkk");      //inserting String type element
        set1.add(10);        //inserting Integer type element
        set1.add(new Object());      //inserting Object type element
        set1.add(20.65);     //inserting Double type element
        //The elements inserted are not mutually comparable. So, it will throw ClassCastException.
    }
}

/* HashMap */
class JavaHashMapExample{    
    public static void main(String[] args){
        //Defining the HashMap
        HashMap<String, Double> map = new HashMap<String, Double>();
        //Adding some elements to HashMap
        map.put("Ashwin", 87.55);
        map.put("Bharat", 95.65);
        map.put("Chetan", 68.13);
        map.put("Dhanjay", 74.23);
        map.put("Kartik", 65.42);
        //HashMap can have one null key and multiple null values
        map.put(null, null);
        map.put("Sandesh", null);
        //Getting the size of the map
        System.out.println("Size Of The Map : "+map.size());
        System.out.println("-----------------");
        //Displaying the elements
        System.out.println("The elements are :");
        Set set = map.keySet();
        Iterator keySetIterator = set.iterator();
        while (keySetIterator.hasNext()){
            Object key = keySetIterator.next();
            System.out.println(key+"  : "+map.get(key));
        }
        System.out.println("-----------------");
        //Checking the map for a particular key/value
        System.out.println("Does this map has Chetan as key? "+map.containsKey("Chetan"));
        System.out.println("Does this map has 74.23 as value? "+map.containsValue(74.23));
        System.out.println("-----------------");
        //Removing an element from the map
        System.out.println("Value removed from the map : "+map.remove("Kartik"));
        
        /* Converting hashmap to arraylist */
      //Getting Set of keys
        Set<String> keySet = map.keySet();
        //Creating an ArrayList of keys
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
        System.out.println("ArrayList Of Keys :");
        for (String key : listOfKeys){
            System.out.println(key);
        }
        System.out.println("--------------------------");
        //Getting Collection of values
        Collection<Double> values = map.values();
        //Creating an ArrayList of values
        ArrayList<Double> listOfValues = new ArrayList<Double>(values);
        System.out.println("ArrayList Of Values :"); 
        for (Double value : listOfValues) {
            System.out.println(value);
        }
        
        /* Synchronize HashMap */
        //Getting synchronized map
        Map<String, Double> synchronizedMap = Collections.synchronizedMap(map);
        Set<String> keySet1 = synchronizedMap.keySet();
        System.out.println("Keys.............");
        //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap){
            Iterator<String> it = keySet1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
         
        Collection<Double> values1 = synchronizedMap.values();
        System.out.println("Values.............");
        //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap){
            Iterator<Double> it = values1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }    
}

/*HashMap stores the data in the form of key-value pairs. Each key-value pair is stored in an object of Entry<K, V> class. 
Entry<K, V> class is the static inner class of HashMap which is defined like below.*/

static class Entry<K,V> implements Map.Entry<K,V>{
        final K key;
        V value;
        Entry<K,V> next;
        int hash;
 
        //Some methods are defined here
}
/*As you see, this inner class has four fields. key, value, next and hash.
key : It stores the key of an element and its final.
value : It holds the value of an element.
next : It holds the pointer to next key-value pair. This attribute makes the key-value pairs stored as a linked list.
hash : It holds the hashcode of the key.
These Entry objects are stored in an array called table[]. This array is initially of size 16. It is defined like below.
*/
