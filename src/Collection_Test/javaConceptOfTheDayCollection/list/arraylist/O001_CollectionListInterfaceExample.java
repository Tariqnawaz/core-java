package Collection_Test.javaConceptOfTheDayCollection.list.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class O001_CollectionListInterfaceExample {

}

/*You can define ArrayList as re-sizable array. Size of the ArrayList is not fixed. ArrayList can grow and shrink dynamically.*/
class ArrayListDemo1{
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
    }
}
/*2) Elements can be inserted at or deleted from a particular position.*/
class ArrayListDemo2{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ZERO");
        list.add("TWO");
        list.add("FOUR");
        System.out.println(list);     //Output : [ZERO, TWO, FOUR]
 
        list.add(2, "THREE");       //Inserting an element at index 2
        list.add(1, "ONE");     //Inserting an element at index 1
        System.out.println(list);    //Output : [ZERO, ONE, TWO, THREE, FOUR]
 
        list.remove(3);       //Removing an element from index 3
        System.out.println(list);    //Output : [ZERO, ONE, TWO, FOUR]
    }
}
/*3) ArrayList class has many methods to manipulate the stored objects.
ArrayList class has methods to perform solo modifications ( add(), remove()… ), bulk modifications ( addAll(), removeAll(), 
retainAll()… ), searching( indexOf(), lasIndexOf() ) and iterations( iterator() ).

4) If generics are not used, ArrayList can hold any type of objects.
*/
class ArrayListDemo3{
    public static void main(String[] args){
        ArrayList list = new ArrayList();     //ArrayList without generics
        list.add("ZERO");    //adding string type object
        list.add(1);        //adding primitive int type
        list.add(20.24);    //adding primitive double type
        list.add(new Float(23.56));   //Adding Float wrapper type object
        list.add(new Long(25));      //Adding Long wrapper type object
        System.out.println(list);     //Output : [ZERO, 1, 20.24, 23.56, 25]
    }
}

/*5) Many are of the assumption that multiple insertion and removal operations on ArrayList will decrease the performance of 
 * an application. But, there will be no significant change in the performance of an application if you use ArrayList instead 
 * of arrays. Below example shows time taken to add 1000 string elements to ArrayList and array.*/
class ArrayListDemo4{
    public static void main(String[] args){
        String[] namesArray = new String[1000];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < namesArray.length; i++){
            namesArray[i] = "Name"+i;
        }
 
        long endTime = System.currentTimeMillis();          
        System.out.println("Time taken by Array : "+(endTime - startTime)+"ms");
        ArrayList<String> nameList = new ArrayList<String>();     
        startTime = System.currentTimeMillis();
 
        for (int i = 0; i <= 1000; i++){
            nameList.add("Name"+i);
        }
 
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList : "+(endTime-startTime)+"ms");
    }
}
/*Output :
Time taken by Array : 6ms
Time taken by ArrayList : 6ms
*/
/*6) You can traverse an ArrayList in both the directions – forward and backward using ListIterator.*/
class ArrayListDemo5{
    public static void main(String[] args){    
        ArrayList<String> list = new ArrayList<String>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
         
        ListIterator iterator = list.listIterator();
        System.out.println("Elements in forward direction");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Elements in backward direction");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
/*7) ArrayList can hold multiple null elements.*/
class ArrayListDemo6{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();     
        list.add(100);
        list.add(null);
        list.add(null);
        System.out.println(list);     //Output : [100, null, null]
    }
}

/*8) ArrayList can hold duplicate elements.*/
class ArrayListDemo9{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();     
        list.add(100);
        list.add(100);
        list.add(100);
        System.out.println(list);     //Output : [100, 100, 100]
    }
}
/*(Above two advantages(7 and 8) are also applicable to arrays. But, you can treat them as bonus with all above advantages of ArrayList.)*/

/*****************************************************************************************************************************/
/* How To Modify An ArrayList? */
/* 1) Elementary Modification Operations On ArrayList : */
class ArrayListDemo10{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ONE");     //Adds "ONE" at the end of the list
        list.add("TWO");     //Adds "TWO" at the end of the list
        list.add("THREE");   //Adds "THREE" at the end of the list
        list.add("FOUR");    //Adds "FOUR" at the end of the list
        System.out.println(list);    //Output : [ONE, TWO, THREE, FOUR]
        list.add(3, "INSERTED");   //Inserts "INSERTED" at position 3
        System.out.println(list);   //Output : [ONE, TWO, THREE, INSERTED, FOUR]
        list.add(1, "INSERTED");   //Inserts "INSERTED" at position 1
        System.out.println(list);     //Output : [ONE, INSERTED, TWO, THREE, INSERTED, FOUR]
        list.remove("INSERTED");    //Removes first occurence of "INSERTED"
        System.out.println(list);     //Output : [ONE, TWO, THREE, INSERTED, FOUR]
        list.remove(3);           //Removes an element at position 3
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
        list.set(3, "REPLACED");    //Replaces an element at position 3 with "REPLACED"
        System.out.println(list);     //Output : [ONE, TWO, THREE, REPLACED]
    }
}

/* 2) Bulk Modification Operations On ArrayList : */
class ArrayListDemo11{
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("ONE");     
        list1.add("TWO");     
        list1.add("THREE");   
        list1.add("FOUR");    
        System.out.println(list1);     //Output : [ONE, TWO, THREE, FOUR]
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("THREE");
        list2.add("FOUR");
        list2.add("FIVE");
        list2.add("SIX");
        System.out.println(list2);     //Output : [THREE, FOUR, FIVE, SIX]
        list1.addAll(list2);   //Appends list2 at the end of list1
        System.out.println(list1);    //Output : [ONE, TWO, THREE, FOUR, THREE, FOUR, FIVE, SIX]
        list1.removeAll(list2);    //Removes the elements of list1 which are also elements of list2
        System.out.println(list1);    //Output : [ONE, TWO]
        list1.addAll(2, list2);    //Inserts all elements of list2 into list1 at position 2
        System.out.println(list1);    //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX]
        list1.retainAll(list2);    //Retains all elements of list1 which are also elements of list2
        System.out.println(list1);    //Output : [THREE, FOUR, FIVE, SIX]
        list1.clear();      //Removes all elements of list1
        System.out.println(list1);   //Output : []
    }
}

/********************************************************************************************************************/
/* Difference Between Iterator And ListIterator In Java. */
/*1) Using Iterator, you can traverse List, Set and Queue type of objects. But using ListIterator, you can traverse only List 
 * objects. In Set and Queue types, there is no method to get the ListIterator object. But, In List types, there is a method 
 * called listIterator() which returns ListIterator object.*/

class IteratorAndListIterator1{
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        //Traversing list elements using Iterator
        java.util.Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
 
        Queue queue = new PriorityQueue(list);
        //Traversing queue elements using Iterator
        java.util.Iterator iterator2 = queue.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        Set set = new HashSet(list);
        //Traversing set elements using Iterator
        java.util.Iterator iterator3 = set.iterator();
 
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        //Traversing list elements using ListIterator
        ListIterator listIterator1 = list.listIterator();
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }
 
        //Traversing queue and set elements using ListIterator is not possible
        ListIterator listIterator2 = queue.listIterator();    //Compile time error, there is no such method in Queue
        ListIterator listIterator3 = set.listIterator();     //Compile time error, there is no such method in Set
    }
}

/*2) Using Iterator, we can traverse the elements only in forward direction. But, using ListIterator you can traverse the 
 * elements in both the directions – forward and backward. ListIterator has those methods to support the traversing of elements 
 * in both the directions.*/
class IteratorAndListIterator2{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        //Traversing list elements in forward direction using Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //        OUTPUT :
        //        FIRST
        //        SECOND
        //        THIRD
 
        //Traversing list elements in forward direction using ListIterator
 
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //        OUTPUT :
        //        FIRST
        //        SECOND
        //        THIRD
 
        //Traversing list elements in backward direction using ListIterator
 
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
 
        //        OUTPUT :
        //        THIRD
        //        SECOND
        //        FIRST
    }
}

/*3) Using ListIterator, you can obtain index of next and previous elements. But, it is not possible with Iterator interface.*/

class IteratorAndListIterator3{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            //Getting index of next element
            System.out.println(listIterator.nextIndex()+" : "+listIterator.next());
        }
        //        OUTPUT :
        //        0 : FIRST
        //        1 : SECOND
        //        2 : THIRD
 
        while (listIterator.hasPrevious()){
            //Getting index of previous element
            System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
        }
 
        //        OUTPUT :
        //        2 : THIRD
        //        1 : SECOND
        //        0 : FIRST
    }
}
/*4) Using ListIterator, you can perform modifications(insert, replace, remove) on the list. But, using Iterator you can only remove the elements from the collection.*/

class IteratorAndListIterator4{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
       ListIterator<String> listIterator = list.listIterator();
        System.out.println(list);       //Output :    [FIRST, SECOND, THIRD]
        while (listIterator.hasNext()){
            listIterator.next();
            //Modifying an element returned by next()
            listIterator.set("MODIFIED");
        }
 
        System.out.println(list);       //Output :    [MODIFIED, MODIFIED, MODIFIED]
        Iterator<String> iterator = list.iterator();
 
        while (iterator.hasNext()){
            iterator.next();
            //Removing an element
            iterator.remove();
        }
        System.out.println(list);    //Output : []
    }
}

 
/*5) Using ListIterator, you can iterate a list from the specified index. It is not possible with Iterator.*/
class IteratorAndListIterator5{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        list.add("FOURTH");
        list.add("FIFTH");
        //Iterating list from index 2 using ListIterator
        ListIterator<String> listIterator = list.listIterator(2);
 
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
 
        //        OUTPUT :
        //        THIRD
        //        FOURTH
        //        FIFTH
    }
}

/************************************************************************************************************************/
/* Different Ways Of Iterating An ArrayList In Java */
/*Iteration Using Normal for loop :

This method is useful when you also need index of the elements along with the elements itself. Using this method, you can 
also iterate a part of an ArrayList. Here is the template for this method.

for (int i = 0; i < list.size(); i++){
        type_of_element element = list.get(i);
}

Iteration Using Iterator :
This method is useful when you don’t want index of an element, but you want to remove the elements as you iterate through an 
ArrayList.

while (iterator.hasNext()){
    System.out.println(iterator.next());
    //Removing an element from ArrayList
    iterator.remove();
}

Iteration Using ListIterator :
If you want to iterate the list in both the directions – forward and backward, then use the ListIterator method. One more advantage 
of this method is, you can start iteration from a specific element in an ArrayList.
while (listIterator.hasNext() or listIterator.hasPrevious()){
    System.out.println(listIterator.next());
 
        System.out.println(listIterator.previous());
}

Iteration Using Enhanced for loop :
This method is useful when you don’t need indexes of elements and you just want to access the elements without removing them or 
modifying them (it is the most common case). This method is also short and very easy to write.

for (type_of_element element : list){
    System.out.println(element);
}*/

class ArrayListIteration6{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        list.add("FOURTH");
        list.add("FIFTH");
 
        //1. Using for loop
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //2. Using Iterator
        Iterator<String> it = list.iterator();
 
        while (it.hasNext()){
            System.out.println(it.next());
            //Removing an element from list
            it.remove();
        }
        //3. Using ListIterator
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()){
            System.out.println(listIt.next());
        }
        //4. Using enhanced for loop
        
        for (String element : list){
            System.out.println(element);
        }
    }
}

/***************************************************************************************************************************/
/*Vector Class*/
/* The Vector Class is also dynamically grow-able and shrink-able collection of objects like an ArrayList class. But, the main 
 * difference between ArrayList and Vector is that Vector class is synchronized. That means, only one thread can enter into vector 
 * object at any moment of time. */

/* Vector class has same features as ArrayList. Vector class also extends AbstractList class and implements List interface. It 
 * also implements 3 marker interfaces – RandomAccess, Cloneable and Serializable. Below is the hierarchy diagram of Vector class. */

class MainClass7{
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
    }
}

/*Unlike an ArrayList, you can set the size of the Vector manually. If the new size is greater than the current size, the new slots 
 * will be filled with null elements. If the new size is smaller than current size, then the extra elements will be discarded.*/

class MainClass8{
    public static void main(String[] args){
        //Creating Vector with default initial capacity of 10
        Vector<Integer> vector = new Vector<Integer>();
        //Adding elements to vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        //Retrieving the current size of vector
        System.out.println(vector.size());      //Output : 4
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
    }
}

/*You can traverse the vector using Enumeration object. Vector class has a method called elements() which returns an Enumeration object consisting of all elements of Vector.*/
class MainClass9{
    public static void main(String[] args){
        //Creating Vector with default initial capacity of 10
        Vector<Integer> vector = new Vector<Integer>();
        //Adding elements to vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        //Getting Enumeration object
        Enumeration<Integer> en = vector.elements();
        //traversing elements of Vector using Enumeration
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
 //        Output :
//        10
//        20
//        30
//        40
    }
}

/*Vector class has separate methods to retrieve first and last element of vector object. You will not find these methods in 
 * ArrayList class. firstElement() retrieves first element and lastElement() method retrieves last element of the vector.*/
class MainClass10{
    public static void main(String[] args){
        //Creating Vector with default initial capacity of 10
        Vector<Integer> vector = new Vector<Integer>();
        //Adding elements to vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        //Getting first element
        System.out.println(vector.firstElement());     //Output : 10
        //Getting last element
        System.out.println(vector.lastElement());      //Output : 40
    }
}

/******************************************************************************************************************************/
/* Why Not To Use Vector Class In Your Code? */
/*1) You can achieve Thread Safety without Vector.
Vector class has only one advantage over ArrayList i.e it is thread safety. But, you can achieve thread safe ArrayList by using 
synchronizedList() method of Collections class. Below is the sample code.
*/
class MainClass11{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.synchronizedList(list);
        //It returns Synchronized list backed by original list.
    }
}

/*2) Thread Safeness of Vector class is time consuming.
3) Enumeration Vs Iterator
4) Is Vector class poorly designed?
*/
