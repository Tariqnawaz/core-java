package Collection_Test.javaConceptOfTheDayCollection.list.linkedList;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class O002_CollectionLinkedListInterface {

}

/* Java PriorityQueue Example With Default Comparator : */
class PriorityQueueExample1{
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

/*Java PriorityQueue Example With Customized Comparator :
In this example, we create a PriorityQueue with our own Comparator. We try to create a PriorityQueue of ‘Employee‘ objects ordered 
in the ascending order of their salaries. That means head element always will be an ‘Employee‘ object with lowest salary.*/

class Employee2{
    String name;
    int salary;
    //Constructor Of Employee
    public Employee2(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
 
    @Override
    public String toString(){
        return name+" : "+salary;
    }
}

/*In the above class, toString() method is overrided so that it returns the contents of the object.
Let’s define our own Comparator class ‘MyComparator‘ which compares the salary of two Employees.
*/
class MyComparator implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 e1, Employee2 e2){
        return e1.salary - e2.salary;
    }
}

/*Here is the whole code of the above example.*/
//Employee Class
class Employee{
    String name;
    int salary;
    //Constructor Of Employee
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
 
    @Override
    public String toString(){
        return name+" : "+salary;
    }
}
 
//MyComparator Class
class MyComparator1 implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 e1, Employee2 e2)
    {
        return e1.salary - e2.salary;
    }
}
 
class PriorityQueueExample2{
    public static void main(String[] args){
        //Instantiating MyComaparator
        MyComparator1 comparator = new MyComparator1();
        //Creating PriorityQueue of Employee objects with MyComparator as Comparator
        PriorityQueue<Employee2> pQueue = new PriorityQueue<Employee2>(7, comparator);
        //Adding Employee objects to pQueue
        pQueue.offer(new Employee2("AAA", 15000));
        pQueue.offer(new Employee2("BBB", 12000));
        pQueue.offer(new Employee2("CCC", 7500));
        pQueue.offer(new Employee2("DDD", 17500));
        pQueue.offer(new Employee2("EEE", 21500));
        pQueue.offer(new Employee2("FFF", 29000));
        pQueue.offer(new Employee2("GGG", 14300));
        //Removing the head elements
        System.out.println(pQueue.poll());       //Output --> CCC : 7500
        System.out.println(pQueue.poll());       //Output --> BBB : 12000
        System.out.println(pQueue.poll());       //Output --> GGG : 14300
        System.out.println(pQueue.poll());       //Output --> AAA : 15000
        System.out.println(pQueue.poll());       //Output --> DDD : 17500
        System.out.println(pQueue.poll());       //Output --> EEE : 21500
        System.out.println(pQueue.poll());       //Output --> FFF : 29000
    }
}

/* Java Collection Framework – The ArrayDeque Class */
/* The ArrayDeque class in Java is introduced from JDK 1.6. It is an implementation of Deque Interface which allows insertion of 
 * elements at both the ends. It does not have any restrictions on capacity. It expands automatically as we add more elements. 
 * The ArrayDeque class extends AbstractCollection class and implements Deque interface. It also implements Cloneable and 
 * Serializable marker interfaces. */

/*Examples Of ArrayDeque class :
1) ArrayDeque As Queue*/
class ArrayDequeExample3{
    public static void main(String[] args){
        //Creating an array deque
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        //Adding elements at the tail of arrayDeque
        arrayDeque.offer("One");
        arrayDeque.offer("Two");
        arrayDeque.offer("Three");
        arrayDeque.offer("Four");
        arrayDeque.offer("Five");
        //Printing the elements of arrayDeque
        System.out.println(arrayDeque);     //Output : [One, Two, Three, Four, Five]
        //Removing the elements from the head of arrayDeque
        System.out.println(arrayDeque.poll());    //Output : One
        System.out.println(arrayDeque.poll());    //Output : Two
    }
}

/*2) ArrayDeque As Stack*/
class ArrayDequeExample4{
    public static void main(String[] args){
        //Creating an array deque
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        //pushing elements into arrayDeque
        arrayDeque.push("One");
        arrayDeque.push("Two");
        arrayDeque.push("Three");
        arrayDeque.push("Four");
        arrayDeque.push("Five");
        //Printing the elements of arrayDeque
        System.out.println(arrayDeque);     //Output : [Five, Four, Three, Two, One]
        //popping up the elements from arrayDeque
        System.out.println(arrayDeque.pop());    //Output : Five
        System.out.println(arrayDeque.pop());    //Output : Four
    }
}
