package object;

public class O002_ObjectClassGarbageNFinalizeMethod {

}

/*You all know that an object is created in the memory using new operator. Constructor is used to initialize the properties of that 
 * object. When an object is no more required, it must be removed from the memory so that that memory can be reused for other objects. 
 * Removing unwanted objects or abandoned objects from the memory is called garbage collection (GC). In the languages like C++, GC is 
 * performed manually using destructors.*/

/*But, there is no destructors in java. In java, there exist better mechanism to handle the garbage collection. You need not to delete 
 * unwanted objects explicitly. JVM does this for you. JVM implicitly sweeps out abandoned objects from the memory.*/
/*Before moving on to Garbage Collection in java, let’s have a look at the finalize() method of Object class.

finalize() method In Java:
finalize() method is a protected and non-static method of java.lang.Object class. This method will be available in all objects you create 
in java. This method is used to perform some final operations or clean up operations on an object before it is removed from the memory.  
you can override the finalize() method to keep those operations you want to perform before an object is destroyed. Here is the general 
form of finalize() method.*/

/*Garbage Collection In Java :

Whenever you run a java program, JVM creates three threads. 1) main thread   2) Thread Scheduler   3) Garbage Collector Thread. In these 
three threads, main thread is a user thread and remaining two are daemon threads which run in background.

The task of main thread is to execute the main() method. The task of thread scheduler is to schedule the threads. The task of garbage 
collector thread is to sweep out abandoned objects from the heap memory. Abandoned objects or dead objects are those objects which does 
not have live references. Garbage collector thread before sweeping out an abandoned object, it calls finalize() method of that object. 
After finalize() method is executed, object is destroyed from the memory. That means clean up operations which you have kept in the 
finalize() method are executed before an object is destroyed from the memory.

Garbage collector thread does not come to heap memory whenever an object becomes abandoned. It comes once in a while to the heap memory 
and at that time if it sees any abandoned objects, it sweeps out those objects after calling finalize() method on them. Garbage collector 
thread calls finalize() method only once for one object.

Let’s discuss some interesting points about garbage collection and finalize() method.

Some Interesting Points About Garbage Collection And finalize() method In Java :
*/


/*1) In some scenarios, finalize() method is not at all called by the garbage collector thread. For example, When I executed the below 
 * program in my system, finalize() method of Class A is not at all executed.*/
class A01{
    int i = 50;
    @Override
    protected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
    }
}
 
class Test01{
   public static void main(String[] args){
      //Creating two instances of class A
      A01 a1 = new A01();
      A01 a2 = new A01();
 
      //Assigning a2 to a1
      a1 = a2;
      //Now both a1 and a2 will be pointing to same object 
      //An object earlier referred by a1 will become abandoned
      System.out.println("done");
   }
}

/*2) You can make finalize() method to be executed forcefully using either Runtime.getRuntime().runFinalization() OR 
 * Runtime.runFinalizersOnExit(true). But, both the methods have disadvantages. Runtime.getRuntime().runFinalization() makes the just best 
 * effort to execute finalize() method. It is not gauranteed that it will execute finalize() method. Runtime.runFinalizersOnExit(true) is 
 * deprecated in JDK because some times it runs finalize() method on live objects also.*/
class A02{
    int i = 50;
    @Override
    protected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
    }
}
 
class Test02{
   public static void main(String[] args){
      //Creating two instances of class A
      A02 a1 = new A02();
      A02 a2 = new A02();
      //Assigning a2 to a1
      a1 = a2;
      //Making finalize() method to execute forcefully
      Runtime.getRuntime().runFinalization();
      System.out.println("done");
   }
}

/*3) you can call garbage collector explicitly using System.gc() or RunTime.getRunTime().gc(). Again it is just a request to garbage 
 * collector not a command. It is up to garbage collector to honour this request.*/
class A03{
    int i;
    public A03(int i){
        this.i = i;
    }
 
    @Override
    protected void finalize() throws Throwable{
        System.out.println("From Finalize Method, i = "+i);
    }
}
 
class Test03{
   public static void main(String[] args){
       //Creating two instances of class A
       A03 a1 = new A03(10);
       A03 a2 = new A03(20);      
       //Assigning a2 to a1
       a1 = a2;
       //Now both a1 and a2 will be pointing same object 
      //An object earlier referred by a1 will become abandoned
      //Calling garbage collector thread explicitly
       System.gc();              //OR call Runtime.getRuntime().gc();
       System.out.println("done");
   }
}

/*4) finalize() methods are not chained like constructors.i.e there is no calling statement to super class finalize() method inside the 
 * finalize() method of sub class. You need to explicitly call super class finalize() method.*/

protected void finalize() throws Throwable{
    System.out.println("From Finalize Method");
 
    //Calling super class finalize() method explicitly
 
    super.finalize();
}

/*5) Exceptions occurred in finalize() method are not propagated. They are ignored by the garbage collector.

6) You can call finalize() method explicitly on an object before it is abandoned. When you call, only operations kept in finalize() method 
are performed on an object. Object will not be destroyed from the memory.
*/
class A04{
    int i;
    public A04(int i){
        this.i = i;
    }
 
    @Override
    protected void finalize() throws Throwable{
        System.out.println("From Finalize Method, i = "+i);
        //Calling super class finalize() method explicitly
        super.finalize();
    }
}
 
class Test04{
   public static void main(String[] args){
       //Creating two instances of class A
 
       A04 a1 = new A04(10);
       A04 a2 = new A04(20);      
       //Calling finalize() method of a1 before it is abandoned
       try{
           a1.finalize();
       }
       catch (Throwable e){
           e.printStackTrace();
       }
 
       //Assigning a2 to a1
       a1 = a2;
       //Now both a1 and a2 will be pointing same object 
       //An object earlier referred by a1 will become abandoned
       System.out.println("done");
   }
}

/*7) finalize() method on an abandoned object is called only once by the garbage collector thread. GC ignores finalize() method called on 
 * an object by the developer.*/
