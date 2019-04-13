package Collection_Test.javaConceptOfTheDayCollection.set.hashSet;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class O001_CollectionInterfaceHashSet {

}

/*Properties Of HashSet Class In Java :

HashSet class uses HashMap internally to store the objects. The keys of that HashMap object will be the elements of HashSet and their values will be a constant.
HashSet does not allow duplicate elements. If you try to insert a duplicate element, older element will be overwritten.
*/
class HashSetExample1{
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
    }
}

/*HashSet can have maximum one null element.*/
class HashSetExample2{
    public static void main(String[] args){
        //Creating HashSet object
        HashSet<String> set = new HashSet<String>();
        //Adding elements to HashSet
        set.add("ONE");
        set.add("TWO");
        set.add("THREE");
        set.add("FOUR");
        //Adding 3 null elements to hashSet
        set.add(null);
        set.add(null);
        set.add(null);
        //Printing the elements of HashSet
        System.out.println(set);     //Output : [null, ONE, TWO, THREE, FOUR]
        //You can notice that HashSet contains only one null element
    }
}

/*HashSet doesn’t maintain any order. The order of the elements will be largely unpredictable. And it also doesn’t guarantee that order will remain constant over time.
HashSet offers constant time performance for insertion, removal and retrieval operations.
HashSet class is not synchronized. If you want synchronized HashSet, use Collections.synchronizedSet() method.
*/
class HashSetExample3{
    public static void main(String[] args){
        //Creating HashSet object
        HashSet<String> set = new HashSet<String>();
        //Adding elements to HashSet
        set.add("BANGALORE");
        set.add("DELHI");
        set.add("CHENNAI");
        set.add("MUMBAI");
        set.add("AHMEDABAD");
        //getting synchronized set
        Set<String> syncSet = Collections.synchronizedSet(set);
 
    }
}

/* How HashSet Works Internally In Java? */
/*HashSet uses HashMap internally to store it’s objects. Whenever you create a HashSet object, one HashMap object associated with 
 * it is also created. This HashMap object is used to store the elements you enter in the HashSet. The elements you add into HashSet 
 * are stored as keys of this HashMap object. The value associated with those keys will be a constant.*/

/*Every constructor of HashSet class internally creates one HashMap object. You can check this in the source code of HashSet class 
 * in JDK installation directory. Below is the some sample code of the constructors of HashSet class.
private transient HashMap<E,Object> map;*/
 
//Constructor - 1
public HashSet(){
        map = new HashMap<>();          //Creating internally backing HashMap object
}
 
//Constructor - 2
public HashSet(Collection<? extends E> c){
        map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));     //Creating internally backing HashMap object
        addAll(c);
}
 
//Constructor - 3
public HashSet(int initialCapacity, float loadFactor){
        map = new HashMap<>(initialCapacity, loadFactor);        //Creating internally backing HashMap object
}
 
//Constructor - 4
public HashSet(int initialCapacity){
        map = new HashMap<>(initialCapacity);          //Creating internally backing HashMap object
}

/*You can notice that each and every constructor internally creates one new HashMap object.
How HashSet Works Internally In Java?
Whenever you insert an element into HashSet using add() method, it actually creates an entry in the internally backing HashMap 
object with element you have specified as it’s key and constant called “PRESENT” as it’s value. This “PRESENT” is defined in the 
HashSet class as below.
*/

// Dummy value to associate with an Object in the backing Map
/*private static final Object PRESENT = new Object();
Let’s have a look at add() method of HashSet class.*/


public boolean add(E e){
        return map.put(e, PRESENT)==null;
}

/*You can notice that, add() method of HashSet class internally calls put() method of backing HashMap object by passing the element 
 * you have specified as a key and constant “PRESENT” as it’s value.*/

/*remove() method also works in the same manner.*/
public boolean remove(Object o){
        return map.remove(o)==PRESENT;
}

/*Let’s see one example of HashSet and how it maintains HashMap internally.*/

class HashSetExample4{
    public static void main(String[] args){
        //Creating One HashSet object
        HashSet<String> set = new HashSet<String>();
        //Adding elements to HashSet
        set.add("RED");
        set.add("GREEN");
        set.add("BLUE");
        set.add("PINK");
       //Removing "RED" from HashSet
        set.remove("RED");
    }
}

/*See the below picture how above program works internally. You can observe that internal HashMap object contains elements of 
 * HashSet as keys and constant “PRESENT” as their value.

How HashSet Works Internally In Java
In the same manner, all methods of HashSet class process internally backing HashMap object to get the desired result. If you know 
how HashMap works, it will be easy for you to understand how HashSet works. You go through the source code of HashSet class once, 
you will get a clear picture about how HashSet works internally in Java.*/


/* Java HashSet Example*/
/*Java HashSet is very powerful Collection type when you want a collection of unique objects. HashSet doesn’t allow duplicate 
 * elements. HashSet also gives constant time performance for insertion, removal and retrieval operations. It is also important to 
 * note that HashSet doesn’t maintain any order. So, It is recommended to use HashSet if you want a collection of unique elements 
 * and order of elements is not so important. If you want your elements to be ordered in some way, you can use LinkedHashSet or 
 * TreeSet.*/

/*In this Java article, we will see one real time example of HashSet.
Let’s create one HashSet of Student records where each Student record contains three fields – name, rollNo and department. In 
these, rollNo will be unique for all students.
Let’s create Student class with three fields – name, rollNo and department.
*/

/*Here is the whole program.*/
class Student{
    String name;
    int rollNo;
    String department;
    public Student(String name, int rollNo, String department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
 
    @Override
    public int hashCode(){
        return rollNo;
    }
 
    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        return (rollNo == student.rollNo);
    }
 
    @Override
    public String toString(){
        return rollNo+", "+name+", "+department;
    }
}
 
class MainClass5{
    public static void main(String[] args){
        HashSet<Student> set = new HashSet<Student>();
        //Adding elements to HashSet
        set.add(new Student("Avinash", 121, "ECE"));
        set.add(new Student("Bharat", 101, "EEE"));
        set.add(new Student("Malini", 151, "Civil"));
        set.add(new Student("Suresh", 200, "IT"));
        set.add(new Student("Vikram", 550, "CS"));
        set.add(new Student("Bharat", 301, "IT"));
        set.add(new Student("Amit", 301, "IT"));           //duplicate element
        set.add(new Student("Bhavya", 872, "ECE"));
        set.add(new Student("Naman", 301, "CS"));        //duplicate element
        set.add(new Student("Samson", 565, "Civil"));
        //Iterating through HashSet
 
       Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student student = (Student) it.next();
            System.out.println(student);
        }
    }
}

/*Java Collection Framework – The LinkedHashSet Class*/
/*The LinkedHashSet in java is an ordered version of HashSet which internally maintains one doubly linked list running through 
 * it’s elements. This doubly linked list is responsible for maintaining the insertion order of the elements. Unlike HashSet which 
 * maintains no order, LinkedHashSet maintains insertion order of elements. i.e elements are placed in the order they are inserted. 
 * LinkedHashSet is recommended over HashSet if you want a unique collection of objects in an insertion order.*/

/*The LinkedHashSet class extends HashSet class and implements Set interface. It also implements Cloneable and Serializable marker 
 * interfaces. Below is the hierarchy diagram of LinkedHashSet class in java.*/
 
/*Properties Of LinkedHashSet Class In Java:

LinkedHashSet internally uses LinkedHashMap to store it’s elements just like HashSet which internally uses HashMap to store it’s 
elements.
LinkedHashSet maintains insertion order. This is the main difference between LinkedHashSet and HashSet.
*/
class LinkedHashSetExample6{
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
    }
}

/*LinkedhashSet also gives constant time performance for insertion, removal and retrieval operations. The performance of 
 * LinkedHashSet is slightly less than the Hashset as it has to maintain doubly linked list internally to order it’s elements.
Iterator returned by LinkedHashSet is fail-fast. i.e if the LinkedHashSet is modified at any time after the Iterator is created, 
it throws ConcurrentModificationException.
*/
class LinkedHashSetExample7{
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
        //Getting Iterator object
        Iterator<String> it = set.iterator();
 
        //Modifying the LinkedHashSet after the Iterator is created
        set.add("JSF");
 
        while (it.hasNext()){
            //This statement will throw ConcurrentModificationException
            System.out.println(it.next());
        }
    }
}

/*LinkedHashSet doesn’t allow duplicate elements and allows only one null element.*/

public class LinkedHashSetExample{
    public static void main(String[] args){
        //Creating LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        //Adding elements to LinkedHashSet
        set.add("BLUE");
        set.add("RED");
       set.add("GREEN");
        set.add("BLUE");     //duplicate element
       set.add("BLACK");
        set.add("WHITE");
        //Adding two null elements
        set.add(null);
        set.add(null);
        //printing the elements of LinkedHashSet
        System.out.println(set);     //Output : [BLUE, RED, GREEN, BLACK, WHITE, null]
 
        //You can notice that LinkedHashSet doesn't allow duplicates and allows only one null element
    }
}

/*LinkedHashSet is not synchronized. To get the synchronized LinkedHashSet, use Collections.synchronizedSet() method.*/

/* How LinkedHashSet Works Internally In Java? */
/*LinkedHashSet is an extended version of HashSet. HashSet doesn’t follow any order where as LinkedHashSet maintains insertion order.
 * HashSet uses HashMap object internally to store it’s elements where as LinkedHashSet uses LinkedHashMap object internally to store and process it’s elements. In this article, we will see how LinkedHashSet works internally and how it maintains insertion order.*/

/*Let’s start with constructors of LinkedHashSet class. There are 4 constructors in LinkedHashSet class. All these constructors are 
 * simply calling to super class constructor i.e constructor of HashSet class. Below is the how the constructors are defined in 
 * LinkedHashSet class.*/

//Constructor - 1
public LinkedHashSet(int initialCapacity, float loadFactor){
      super(initialCapacity, loadFactor, true);              //Calling super class constructor
}
 
//Constructor - 2
public LinkedHashSet(int initialCapacity){
        super(initialCapacity, .75f, true);             //Calling super class constructor
}
 
//Constructor - 3
public LinkedHashSet(){
        super(16, .75f, true);                //Calling super class constructor
}
 
//Constructor - 4
public LinkedHashSet(Collection<? extends E> c){
        super(Math.max(2*c.size(), 11), .75f, true);          //Calling super class constructor
        addAll(c);
}
/*In the above code snippet, you might have noticed that all 4 constructors are calling the same super class constructor. This 
 * constructor is a package private constructor which is used only by the LinkedHashSet class. This constructor takes initial 
 * capacity, load factor and one boolean dummy value as it’s arguments. This boolean dummy value is just used to differentiate 
 * this constructor from other constructors of HashSet class which take initial capacity and load factor as their arguments. Here 
 * is the how this constructor is defined in HashSet class.*/

HashSet(int initialCapacity, float loadFactor, boolean dummy){
        map = new LinkedHashMap<>(initialCapacity, loadFactor);
}

/*As you are seeing, this constructor internally creates one new LinkedHashMap object. This LinkedHashMap object is used by the 
 * LinkedHashSet to store it’s elements.
LinkedHashSet doesn’t have it’s own methods. All methods are inherited from it’s super class i.e HashSet. So. all operations on 
LinkedHashSet work in the same manner as that of HashSet. The only change is the internal object used to store the elements. In 
hashSet, elements you insert are stored as keys of HashMap object. Where as in LinkedHashSet, elements you insert are stored as 
keys of LinkedHashMap object. The values of these keys will be the same constant i.e “PRESENT“. We have seen this in How HashSet 
works internally in Java.
*/

/*How LinkedHashSet Maintains Insertion Order?
LinkedHashSet uses LinkedHashMap object to store it’s elements. The elements you insert in the LinkedHashSet are stored as keys of 
this LinkedHashMap object. Each key, value pair in the LinkedHashMap are instances of it’s static inner class called Entry<K, V>. 
This Entry<K, V> class extends HashMap.Entry class. The insertion order of elements into LinkedHashMap are maintained by adding two 
new fields to this class. They are before and after. These two fields hold the references to previous and next elements. These two 
fields make LinkedHashMap to function as a doubly linked list.
*/
private static class Entry<K,V> extends HashMap.Entry<K,V>{
        // These fields comprise the doubly linked list used for iteration.
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, HashMap.Entry<K,V> next) {
            super(hash, key, value, next);
        }
}

/*The first two fields of above inner class of LinkedHashMap – before and after are responsible for maintaining the insertion order 
 * of the LinkedHashSet. The header field of LinkedHashMap stores the head of this doubly linked list. It is declared like below,*/

/*private transient Entry<K,V> header;        //Stores the head of the doubly linked list
In LinkedHashMap, the same set of Entry objects (rather references to Entry objects) are arranged in two different manner. One is 
the HashMap and another one is Doubly linked list. The Entry objects just sit on heap memory, unaware of that they are part of two 
different data structures.
Let’s see one example of LinkedHashSet to know how it works internally.
*/

class LinkedHashSetExample2{
    public static void main(String[] args){
        //Creating LinkedHashSet
       LinkedHashSet<String> set = new LinkedHashSet<String>();
        //Adding elements to LinkedHashSet
        set.add("BLUE");
        set.add("RED");
        set.add("GREEN");    
        set.add("BLACK");
    }
}

/*Look at the below image to see how above program works.
How LinkedHashSet Works Internally In Java
*/
/*If you know how LinkedHashMap works internally, it will be easy for you to understand how LinkedHashSet works internally. Go 
 * through source code of LinkedHashSet class and LinkedHashMap class once, you will get precise understanding about how 
 * LinkedHashSet works internally in Java.*/

/* Java LinkedHashSet Example */
/* As you already know, LinkedHashSet is an ordered version of HashSet. That means, HashSet doesn’t maintain any order where as 
 * LinkedHashSet maintains insertion order of the elements. LinkedHashSet uses doubly linked list internally to maintain the 
 * insertion order of it’s elements. We have seen this in How LinkedHashSet Works Internally In Java?. As LinkedHashSet maintains 
 * doubly linked list (along with HashMap), the performance of LinkedHashSet is slightly slower than the HashSet. But, 
 * LinkedHashSet will be very useful when you need a collection of elements placed in the order they have inserted. We will see 
 * one such example of LinkedHashSet in this article. */

/*Below is the code for the whole program.*/
class Customer{
    String name;
    int id;
    public Customer(String name, int id){
        this.name = name;
        this.id = id;
    }
 
    @Override
    public int hashCode(){
        return id;
    }
 
    @Override
    public boolean equals(Object obj){
        Customer customer = (Customer) obj;
        return (id == customer.id);
    }
 
    @Override
    public String toString(){
        return id+" : "+name;
    }
}
 
class MainClass{
    public static void main(String[] args){
        //Creating LinkedHashSet
        LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();
        //Adding elements to LinkedHashSet
        set.add(new Customer("Jack", 021));
        set.add(new Customer("Peter", 105));
        set.add(new Customer("Ramesh", 415));    
        set.add(new Customer("Julian", 814));
        set.add(new Customer("Avinash", 105));      //Duplicate Element
        set.add(new Customer("Sapna", 879));
        set.add(new Customer("John", 546));
        set.add(new Customer("Moni", 254));
        set.add(new Customer("Ravi", 105));        //Duplicate Element
        //Getting Iterator object
        Iterator<Customer> it = set.iterator();
        while (it.hasNext()){
            Customer customer = (Customer) it.next();
            System.out.println(customer);
        }
    }
}

/*********************************************Java Collection Framework – The TreeSet Class*****************************************************************************/
/* The TreeSet is another popular implementation of Set interface. We have seen other two implementations of Set interface – 
 * HashSet and LinkedHashSet. HashSet doesn’t maintain any order where as LinkedHashSet maintains insertion order. The main 
 * difference between these two implementations and Treeset is, elements in TreeSet are sorted according to supplied Comparator. 
 * You need to supply this Comparator while creating a TreeSet itself. If you don’t pass any Comparator while creating a TreeSet, 
 * elements will be placed in their natural ascending order.

The TreeSet class in java is a direct implementation of NavigableSet interface which in turn extends SortedSet interface (which in 
turn extends Set interface). Below is the hierarchy diagram of TreeSet class.*/

/*Properties Of TreeSet Class In Java :
The elements in TreeSet are sorted according to specified Comparator. If no Comparator is specified, elements will be placed 
according to their natural ascending order.
*/
class TreeSetExample1{
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
    }
}

/*Elements inserted in the TreeSet must be of Comparable type and elements must be mutually comparable. If the elements are not 
 * mutually comparable, you will get ClassCastException at run time.*/
class TreeSetExample2{
    public static void main(String[] args){
        //Creating a TreeSet
        TreeSet<Object> set = new TreeSet<Object>();
        //Adding elements to TreeSet
        set.add("kkk");      //inserting String type element
        set.add(10);        //inserting Integer type element
        set.add(new Object());      //inserting Object type element
        set.add(20.65);     //inserting Double type element
        //The elements inserted are not mutually comparable. So, it will throw ClassCastException.
    }
}

/*TreeSet does not allow even a single null element.*/
class TreeSetExample3{
    public static void main(String[] args){
        //Creating a TreeSet
        TreeSet<String> set = new TreeSet<String>();
        //Adding elements to TreeSet
        set.add("aaa");      
        set.add(null);    //It will throw NullPointerException
        set.add("ccc");      
        set.add("ddd");
    }
}
/*TreeSet is not synchronized. To get a synchronized TreeSet, use Collections.synchronizedSortedSet() method.*/
class TreeSetExample4{
    public static void main(String[] args){
        //Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //Getting a synchronized TreeSet
        Set<String> set = Collections.synchronizedSortedSet(treeSet);
    }
}

/*TreeSet gives performance of order log(n) for insertion, removal and retrieval operations.
Iterator returned by TreeSet is of fail-fast nature. That means, If TreeSet is modified after the creation of Iterator object, 
you will get ConcurrentModificationException.
*/
class TreeSetExample5{
    public static void main(String[] args){
        //Creating a TreeSet
        TreeSet<String> set = new TreeSet<String>();
        //Adding elements to TreeSet
        set.add("aaa");      
        set.add("bbb");    
        set.add("ccc");      
       set.add("ddd");
        //Getting Iterator object
        Iterator<String> it = set.iterator();
        //Modifying the TreeSet after getting Iterator object
        set.add("eee");
        while (it.hasNext()){
            //This statement will throw ConcurrentModificationException
            System.out.println(it.next());
        }
    }
}

/*TreeSet internally uses TreeMap to store it’s elements just like HashSet and LinkedHashSet which use HashMap and LinkedHashMap 
 * respectively to store their elements.*/

/*The whole code for this example is,*/
class TreeSetExample6{
    public static void main(String[] args){
        //Creating a TreeSet without supplying any Comparator
        TreeSet<Integer> set = new TreeSet<Integer>();
        //Adding elements to TreeSet
        set.add(23);      
        set.add(11);    
        set.add(41);      
        set.add(7);
        set.add(69);
        set.add(18);
        set.add(38);
        //printing elements of TreeSet
        System.out.println(set);      //Output : [7, 11, 18, 23, 38, 41, 69]
    }
}

/* Important Note : TreeSet doesn’t use hashCode() and equals() methods to compare it’s elements. It uses compare() (or compareTo())
 *  method to determine the equality of two elements. Therefore, I have kept the code which compares two Student objects based on 
 *  their id in compare method itself. This removes possible duplicate elements (elements having same id) from the TreeSet.*/

/*Java TreeSet Example With Comparator :
In this example, we create one TreeSet by supplying a customized Comparator. In this example, we will try to create a TreeSet of 
Student objects ordered in the descending order of the percentage of marks they have obtained. That means, student with highest 
marks will be placed at the top.
Let’s create ‘Student’ class with three fields – id, name and perc_Of_Marks_Obtained.
*/

/*Below is the whole code of the above example.*/
// Student Class
 
class Student1{
    int id;
    String name;
    int perc_Of_Marks_Obtained;
    public Student1(int id, String name, int perc_Of_Marks_Obtained){
        this.id = id;
        this.name = name;
        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
    }
 
    @Override
    public String toString(){
        return id+" : "+name+" : "+perc_Of_Marks_Obtained;
    }
}
//MyComparator Class
class MyComparator implements Comparator<Student>{
    @Override
    public int compare(Student1 s1, Student1 s2){
        if(s1.id == s2.id){
            return 0;
        }
        else{
            return s2.perc_Of_Marks_Obtained - s1.perc_Of_Marks_Obtained;
        }
    }
}
//MainClass
class MainClass2{
    public static void main(String[] args){
        //Instantiating MyComparator
        MyComparator comparator = new MyComparator();
        //Creating TreeSet with 'MyComparator' as Comparator.
       TreeSet<Student> set = new TreeSet<Student>(comparator);
        //Adding elements to TreeSet
 
        set.add(new Student1(121, "Santosh", 85));
        set.add(new Student1(231, "Cherry", 71));
        set.add(new Student(417, "David", 82));
        set.add(new Student(562, "Praveen", 91));
        set.add(new Student(231, "Raj", 61));         //Duplicate element
        set.add(new Student(458, "John", 76));
        set.add(new Student(874, "Peter", 83));
       set.add(new Student(231, "Hari", 52));       //Duplicate element
        set.add(new Student(568, "Daniel", 89));
        //Iterating though TreeSet
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

