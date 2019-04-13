package Collection_Test.javaConceptOfTheDayCollection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class O001_CollectionMapInterface {

}

class JavaHashMapExample1{    
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
    }    
}
/*Output :
Size Of The Map : 7
—————–
The elements are :
null : null
Ashwin : 87.55
Dhanjay : 74.23
Chetan : 68.13
Bharat : 95.65
Kartik : 65.42
Sandesh : null
—————–
Does this map has Chetan as key? true
Does this map has 74.23 as value? true
—————–
Value removed from the map : 65.42
*/

/* Converting hashmap to arraylist */
class HashMapToArrayListExample1{       
    public static void main(String[] args){
        //Creating a HashMap object
        HashMap<String, String> studentPerformanceMap = new HashMap<String, String>();
        //Adding elements to HashMap
        studentPerformanceMap.put("John Kevin", "Average");
        studentPerformanceMap.put("Rakesh Sharma", "Good");
        studentPerformanceMap.put("Prachi D", "Very Good");
        studentPerformanceMap.put("Ivan Jose", "Very Bad");
        studentPerformanceMap.put("Smith Jacob", "Very Good");
        studentPerformanceMap.put("Anjali N", "Bad");
         
        //Getting Set of keys
        Set<String> keySet = studentPerformanceMap.keySet();
        //Creating an ArrayList of keys
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
        System.out.println("ArrayList Of Keys :");
        for (String key : listOfKeys){
            System.out.println(key);
        }
        System.out.println("--------------------------");
        //Getting Collection of values
        Collection<String> values = studentPerformanceMap.values();
        //Creating an ArrayList of values
        ArrayList<String> listOfValues = new ArrayList<String>(values);
        System.out.println("ArrayList Of Values :"); 
        for (String value : listOfValues) {
            System.out.println(value);
        }
        System.out.println("--------------------------");
        //Getting the Set of entries
        Set<Entry<String, String>> entrySet = studentPerformanceMap.entrySet();
        //Creating an ArrayList Of Entry objects
        ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String,String>>(entrySet);
        System.out.println("ArrayList of Key-Values :");
        for (Entry<String, String> entry : listOfEntry){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }    
}
/*Output :

ArrayList Of Keys :
Rakesh Sharma
Anjali N
Smith Jacob
John Kevin
Ivan Jose
Prachi D
————————–
ArrayList Of Values :
Good
Bad
Very Good
Average
Very Bad
Very Good
————————–
ArrayList of Key-Values :
Rakesh Sharma : Good
Anjali N : Bad
Smith Jacob : Very Good
John Kevin : Average
Ivan Jose : Very Bad
Prachi D : Very Good*/


/* How To Synchronize ArrayList In Java? */
/*ArrayList, HashSet and HashMap are three most frequently used data structures in java. As they are most used, they are not synchronized for the sake of performance. But, java provides the methods to make them synchronized as and when the need arises. These methods are introduced in java.util.Collections class. Collections class is an utility class which has some useful methods helpful for operations on collection types. In this post, we will see how to synchronize ArrayList, HashSet and HashMap in java.*/
/*How to synchronize ArrayList, HashSet and HashMap in java?
synchronize arraylist, hashset and hashmap
How To Synchronize ArrayList In Java?*/

/*To synchronize ArrayList, we use Collections.synchronizedList() method. This method returns synchronized list backed by the 
specified list. There is an advise from javadocs that while iterating over the synchronized list, you must use it in a synchronized 
block. Failed to do so may result in non-deterministic behavior.*/

 
class SynchronizedListExample1{   
    public static void main(String[] args){
        //Creating non synchronized ArrayList object
        ArrayList<String> list = new ArrayList<String>();
        //Adding elements to list
        list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JSF");
        //Getting synchronized list
        List<String> synchronizedList = Collections.synchronizedList(list);
        //you must use synchronized block while iterating over synchronizedList
        synchronized (synchronizedList){
            Iterator<String> it = synchronizedList.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }    
}
/*OUTPUT :
JAVA
STRUTS
JSP
SERVLETS
JSF*/

/*How To Synchronize HashSet In Java?
We use Collections.synchronizedSet() method to synchronize HashSet. This method returns synchronized set backed by the specified set.
 There is also an advice from javadocs that you must use this synchronized set in a synchronized block while iterating over it. If 
 you don’t do this, it may result in non-deterministic behavior.
*/
class SynchronizedHashSetExample2{   
    public static void main(String[] args){
        //Creating non synchronized HashSet object
        HashSet<String> set = new HashSet<String>();
        //Adding elements to set
        set.add("JAVA");
        set.add("STRUTS");
        set.add("JSP");
        set.add("SERVLETS");
        set.add("JSF");
        //Getting synchronized set
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        //you must use synchronized block while iterating over synchronizedSet
        synchronized (synchronizedSet){
            Iterator<String> it = synchronizedSet.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }    
}
/*Output :

SERVLETS
STRUTS
JSP
JAVA
JSF
*/
/*How To Synchronize HashMap In Java?
We use Collections.synchronizedMap() to synchronize HashMap. This method returns synchronized map backed by the specified map. You must iterate it in a synchronized block to avoid unexpected behavior.
*/
class SynchronizedHashMapExample3{   
    public static void main(String[] args){
        //Creating HashMap object which is not synchronized
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //Adding elements to map
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
        //Getting synchronized map
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
        Set<String> keySet = synchronizedMap.keySet();
        System.out.println("Keys.............");
        //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap){
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
         
        Collection<Integer> values = synchronizedMap.values();
        System.out.println("Values.............");
        //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap){
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }    
}
/*Output :
Keys………….
ONE
TWO
THREE
FOUR
FIVE
Values………….
1
2
3
4
5
*/


/* How HashMap Works Internally In Java? */
/*If the data is the most important part of an application, then data structure chosen to handle that data is even more important. 
 * Because, data structure arranges the data so that insertion of new elements or searching of old elements will be faster. Java 
 * provides wide range of data structures to handle the data. You can choose array, list, queue, set or map. Each of these are used 
 * in different scenarios. It is up to you to select which one is better for your application.*/

/*If your application demands faster insertion and faster retrieval then HashMap is the ultimate choice. While selecting the data 
 * structure, you must keep two things in your mind. First one is that the data structure must give better performance while 
 * inserting the new elements and second one is that it should give even more better performance while searching for an element.
 * Because insertion and retrieval are two operations which you perform very frequently in your applications. These things will 
 * matter even more when you are handling the big data. HashMap is the most sought after data structure when you are handling the 
 * big data with more preference to insertion and retrieval operations.

HashMap is the most used data structure in java because it gives almost constant time performance of O(1) for put and get operations 
irrespective of how big is the data. As you already know, HashMap stores the data in the form of key-value pairs. In this post, 
we will see how HashMap works internally in java and how it stores the elements to give O(1) performance for put and get operations.*/

/*HashMap Internal Structure :
HashMap stores the data in the form of key-value pairs. Each key-value pair is stored in an object of Entry<K, V> class. 
Entry<K, V> class is the static inner class of HashMap which is defined like below.
*/
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
/**
     * The table, resized as necessary. Length MUST Always be a power of two.
     */
/*    transient Entry<K,V>[] table;
To summarize the whole HashMap structure, each key-value pair is stored in an object of Entry<K, V> class. This class has an 
attribute called next which holds the pointer to next key-value pair. This makes the key-value pairs stored as a linked list. 
All these Entry<K, V> objects are stored in an array called table[]. The below image best describes the HashMap structure.
(HashMapInternalStructure.png image).
*/

/*The above image roughly shows how the HashMap stores its elements. Internally it uses an array of Entry<K, V> class called 
 * table[] to store the key-value pairs. But how HashMap allocates slot in table[] array to each of its key-value pair is very 
 * interesting. It doesn’t inserts the objects as you put them into HashMap i.e first element at index 0, second element at index 
 * 1 and so on. Instead it uses the hashcode of the key to decide the index for a particular key-value pair. It is called Hashing.

What Is Hashing?
The whole HashMap data structure is based on the principle of Hashing. Hashing is nothing but the function or algorithm or method 
which when applied on any object/variable returns an unique integer value representing that object/variable. This unique integer 
value is called hash code. Hash function or simply hash said to be the best if it returns the same hash code each time it is called 
on the same object. Two objects can have same hash code.
Whenever you insert new key-value pair using put() method, HashMap blindly doesn’t allocate slot in the table[] array. Instead it 
calls hash function on the key. HashMap has its own hash function to calculate the hash code of the key. This function is 
implemented so that it overcomes poorly implemented hashCode() methods. Below is implementation code of hash().*/

/**
 * Retrieve object hash code and applies a supplemental hash function to the
 * result hash, which defends against poor quality hash functions.  This is
 * critical because HashMap uses power-of-two length hash tables, that
 * otherwise encounter collisions for hashCodes that do not differ
 * in lower bits. Note: Null keys always map to hash 0, thus index 0.
 */
final int hash(Object k) {
    int h = 0;
    if (useAltHashing) {
        if (k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }
        h = hashSeed;
    }

    h ^= k.hashCode();

    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}
/*After calculating the hash code of the key, it calls indexFor() method by passing the hash code of the key and length of the 
 * table[] array. This method returns the index in the table[] array for that particular key-value pair.*/
/**
 * Returns index for hash code h.
 */
static int indexFor(int h, int length) {
    return h & (length-1);
}

/*Now, let’s see how put() method works in detail.
How put() method works?
Below is the code implementation of put() method in the HashMap class.
*/

/**
 * Associates the specified value with the specified key in this map.
 * If the map previously contained a mapping for the key, the old
 * value is replaced.
 *
 * @param key key with which the specified value is to be associated
 * @param value value to be associated with the specified key
 * @return the previous value associated with <tt>key</tt>, or
 *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
 *         (A <tt>null</tt> return can also indicate that the map
 *         previously associated <tt>null</tt> with <tt>key</tt>.)
 */
public V put(K key, V value) {
    if (key == null)
        return putForNullKey(value);
    int hash = hash(key);
    int i = indexFor(hash, table.length);
    for (Entry<K,V> e = table[i]; e != null; e = e.next) {
        Object k;
        if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
            V oldValue = e.value;
            e.value = value;
            e.recordAccess(this);
            return oldValue;
        }
    }

    modCount++;
    addEntry(hash, key, value, i);
    return null;
}

/*Let’s see how this code works step by step.
Step 1 : First checks whether the key is null or not. If the key is null, it calls putForNullKey() method. table[0] is always 
reserved for null key. Because, hash code of null is 0.
Step 2 : If the key is not null, then it calculates the hash code of the key by calling hash() method.
Step 3 : Calls indexFor() method by passing the hash code calculated in step 2 and length of the table[] array. This method 
returns index in table[] array for the specified key-value pair.
Step 4 : After getting the index, it checks all keys present in the linked list at that index ( or bucket). If the key is 
already present in the linked list, it replaces the old value with new value.
Step 5 : If the key is not present in the linked list, it appends the specified key-value pair at the end of the linked list.
(HowPutMethodWorks.png image && FlowchartOfPutMethod.png)*/

/*How get() method Works?
Let’s see how get() method has implemented.
*/

/**
* Returns the value to which the specified key is mapped, or {@code null}
* if this map contains no mapping for the key.
*
*
 
* More formally, if this map contains a mapping from a key {@code k} to a
* value {@code v} such that {@code (key==null ? k==null :
* key.equals(k))}, then this method returns {@code v}; otherwise it returns
* {@code null}. (There can be at most one such mapping.)
*
* 
 
* A return value of {@code null} does not <i>necessarily</i> indicate that
* the map contains no mapping for the key; it's also possible that the map
* explicitly maps the key to {@code null}. The {@link #containsKey
* containsKey} operation may be used to distinguish these two cases.
*
* @see #put(Object, Object)
*/
public V get(Object key) {
    if (key == null)
    return getForNullKey();
    int hash = hash(key.hashCode());
    for (Entry<K , V> e = table[indexFor(hash, table.length)]; e != null; e = e.next) {
        Object k;
        if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
            return e.value;
    }
    return null;
}
/*Step 1 : First checks whether specified key is null or not. If the key is null, it calls getForNullKey() method.
Step 2 : If the key is not null, hash code of the specified key is calculated.
Step 3 : indexFor() method is used to find out the index of the specified key in the table[] array.
Step 4 : After getting index, it will iterate though linked list at that position and checks for the key using equals() method. 
If the key is found, it returns the value associated with it. otherwise returns null.

*/