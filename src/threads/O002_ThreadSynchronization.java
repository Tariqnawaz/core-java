package threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/*Synchronization in java is a strategy or a method to avoid thread interference and hence protecting the data from inconsistency. 
 * synchronization is also one of the way to make code thread safe. Through synchronization, we can make the threads to execute particular 
 * method or block in sync not simultaneously.*/
public class O002_ThreadSynchronization {
	/*-----------------1st Example--------------------*/
	public static void main(String[] args){
        final Shared110 s1 = new Shared110();
 
        Thread t1 = new Thread("Thread - 1"){
            @Override
            public void run(){
                s1.SharedMethod();
            }
        };
 
        Thread t2 = new Thread("Thread - 2"){
            @Override
            public void run(){
                s1.SharedMethod();
            }
        };
        t1.start();
        t2.start();
    }
}

class Shared110{
    int i;
    synchronized void SharedMethod(){
        Thread t = Thread.currentThread();
 
        for(i = 0; i <= 1000; i++){
            System.out.println(t.getName()+" : "+i);
        }
    }
}

/* In the above example, both threads t1 and t2 wants to execute sharedMethod() of s1 object. But, sharedMethod() is declared as 
 * synchronized. So, whichever thread enters first into sharedMethod(), it continues to execute that method. The other thread waits for 
 * first thread to finish it’s execution of sharedMethod(). It never enters into sharedMethod() until first thread is done with that method. 
 * That means, both threads are executing sharedMethod() one by one not simultaneously. This protects the value of “i” in the memory for a 
 * particular thread.*/

/*-----------------2nd Example--------------------*/
/*Synchronized Blocks :*/
class Shared111{
    static void staticMethod(){
        synchronized (Shared111.class){
            //static synchronized block
        }
    }
 
    void NonStaticMethod(){
        synchronized (this){
            //Non-static synchronized block
        }
    }
 
    void anotherNonStaticMethod(){
        synchronized (new Shared111()){
            //Non-static synchronized block
        }
    }
}

/*10 Points-To-Remember About Synchronization In Java :*/
/*1) You can use synchronized keyword only with methods but not with variables, constructors, static initializer and instance initializers.*/
class Shared112{
    synchronized int i;    //compile time error, can't use synchronized keyword with variables
    synchronized public Shared112(){
        //compile time error, constructors can not be synchronized
    }
 
    synchronized static{
        //Compile time error, Static initializer can not be synchronized
    }
 
    synchronized{
        //Compile time error, Instance initializer can not be synchronized
    }
}


/*2) Constructors, Static initializer and instance initializer can’t be declared with synchronized keyword, but they can contain 
 * synchronized blocks.*/
class Shared121{
    public Shared121(){
        synchronized (this){
            //synchronized block inside a constructor
        }
    }
 
    static{
        synchronized (Shared121.class){
            //synchronized block inside a static initializer
        }
    }
 
    {
        synchronized (this){
            //synchronized block inside a instance initializer
        }
    }
}

/*3) Both static and non-static methods can use synchronized keyword. For static methods, thread need class level lock and for non-static 
 * methods, thread need object level lock.*/
class Shared122{
    synchronized static void staticMethod(){
        //static synchronized method
    }
 
    synchronized void NonStaticMethod(){
        //Non-static Synchronized method
    }
}

/*4) It is possible that both static synchronized and non-static synchronized methods can run simultaneously. Because, static methods need 
 * class level lock and non-static methods need object level lock.*/

/*5) A method can contain any number of synchronized blocks. This is like synchronizing multiple parts of a method.*/
class Shared123{
    static void staticMethod(){
        synchronized (Shared123.class){
            //static synchronized block - 1
        }
 
        synchronized (Shared123.class){
            //static synchronized block - 2
        }
    }
 
    void NonStaticMethod(){
        synchronized (this){
            //Non-static Synchronized block - 1
        }
 
        synchronized (this){
            //Non-static Synchronized block - 2
        }
    }
}

/*6) Synchronization blocks can be nested.*/
synchronized (this){
    synchronized (this){
        //Nested synchronized blocks
    }
}
/*
7) Lock acquired by the thread before executing a synchronized method or block must be released after the completion of execution, 
no matter whether execution is completed normally or abnormally (due to exceptions).

8) Synchronization in java is Re-entrant in nature. A thread can not acquire a lock that is owned by another thread. But, a thread can 
acquire a lock that it already owns. That means if a synchronized method gives a call to another synchronized method which needs same lock, 
then currently executing thread can directly enter into that method or block without acquiring the lock.

9) synchronized method or block is very slow. They decrease the performance of an application. So, special care need to be taken while 
using synchronization. Use synchronization only when you needed it the most.
 
10) Use synchronized blocks instead of synchronized methods. Because, synchronizing some part of a method improves the performance than 
synchronizing the whole method.*/

/* What Is Deadlock In Java? */
/*1) Deadlock in java is a condition which occurs when two or more threads get blocked waiting for each other for an infinite period of time 
 * to release the resources(Locks) they hold. Deadlock is the common problem in multi threaded programming which can completely stops the 
 * execution of an application. So, extra care need to be taken while writing the multi threaded programs so that deadlock never occurs.*/

class Shared124{
    synchronized void methodOne(Shared124 s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodOne...");
        System.out.println(t.getName()+"is calling methodTwo...");
        s.methodTwo(this);
 
        System.out.println(t.getName()+"is finished executing methodOne...");
    }
 
    synchronized void methodTwo(Shared124 s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodTwo...");
        System.out.println(t.getName()+"is calling methodOne...");
 
        s.methodOne(this);
        System.out.println(t.getName()+"is finished executing methodTwo...");
    }
}
 
class DeadLockInJava124{
    public static void main(String[] args){
        final Shared124 s1 = new Shared124();
        final Shared124 s2 = new Shared124();
        Thread t1 = new Thread(){
            public void run(){
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread(){
            @Override
            public void run(){
                s2.methodTwo(s1);
            }
        };
        t1.start();
        t2.start();
    }
}

/*In the above multithreaded program, thread t1 and t2 are concurrent threads i.e they are executing their task simultaneously. There are 
 two Shared class objects, s1 and s2, which are shared by both the threads. Shared class has two synchronized methods, methodOne() and 
 methodTwo(). That means, only one thread can execute these methods at a given time.*/

/*First, thread t1 enters the methodOne() of s1 object by acquiring the object lock of s1. At the same time, thread t2 also enters the 
 methodTwo() of s2 object by acquiring the object lock of s2. methodOne() of s1 object, currently executing by thread t1, calls methodTwo() 
 of s2 object from it’s body. So, thead t1 tries to acquire the object lock of s2 object. But object lock of s2 object is already acquired 
 by thread t2. So, thread t1 waits for thread t2 to release the object lock of s2 object.*/

/*At the same time, thread t2 is also executing methodTwo() of s2 object. methodTwo() of s2 object also makes a call to methodOne() of s1 
 * object. So, thread t2 tries to acquire the object lock of s1 object. But, it is already acquired by thread t1. So, thread t2 also waits 
 * for thread t1 to release the object lock of s1 object.*/

/**********************************************************************************************/
/*How To Detect The Deadlocked Threads In Java*/
class Shared125{
    synchronized void methodOne(Shared125 s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodOne...");
 
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        System.out.println(t.getName()+"is calling methodTwo...");
        s.methodTwo(this);
        System.out.println(t.getName()+"is finished executing methodOne...");
    }
 
    synchronized void methodTwo(Shared125 s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodTwo...");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.getName()+"is calling methodOne...");
 
        s.methodOne(this);
        System.out.println(t.getName()+"is finished executing methodTwo...");
    }
}
 
class ThreadsInJava125{
    public static void main(String[] args){
        final Shared125 s1 = new Shared125();
        final Shared125 s2 = new Shared125();
 
        Thread t1 = new Thread(){
            public void run(){
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread(){
            @Override
            public void run(){
                s2.methodTwo(s1);
            }
        };
        t1.start();
        t2.start();
 
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long ids[] = bean.findMonitorDeadlockedThreads();
        if(ids != null){
            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
 
            for (ThreadInfo threadInfo1 : threadInfo){
                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
 
                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
 
                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
 
                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
 
                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
            }
        }
        else
        {
            System.out.println("No Deadlocked Threads");
        }
    }
    
/* How To Avoid The Deadlock In Java */  
/* Deadlock is a dangerous condition, if it happens , it will bring the whole application to complete halt. So, extra care need to be 
 * taken to avoid the deadlock. Followings are some tips that can be used to avoid the deadlock in java.

Try to avoid nested synchronized blocks. Nested synchronized blocks makes a thread to acquire another lock while it is already 
holding one lock. This may create the deadlock if another thread wants the same lock which is currently held by this thread.*/   
/*----------1st Example-------------*/
    synchronized (Lock A)
    {
        //Some statements
     
        synchronized (Lock B)
        {
            //Try to avoid this block
        }
    }    
    
/*----------2nd Example-------------*/    
 /*Another deadlock preventive tip is to specify the time for a thread to acquire the lock. If it fails to acquire the specified lock in 
  * the given time, then it should give up trying for a lock and retry after some time. Such method of specifying time to acquire the lock 
  * is called lock timeout.*/   
    void method(){
        //Some statements
        synchronized (this){
            //Locking only some part of the method
        }
        //Some statements
    }
    

/* Interthread Communication Using wait(), notify() and notifyAll() */  
/* Threads can communicate with each other using wait(), notify() and notifyAll() methods. These methods are final methods of 
 * java.lang.Object class. That means every class in java will have these methods.  */    
    
    class Shared126{
        synchronized void methodOne(){
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+" is relasing the lock and going to wait");
            try{
                wait();        //releases the lock of this object and waits
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
     
            System.out.println(t.getName()+" got the object lock back and can continue with it's execution");
        }
     
        synchronized void methodTwo(){
            Thread t = Thread.currentThread();
            try{
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            notify();     //wakes up one thread randomly which is waiting for lock of this object
            System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());
        }
    }
     
    class ThreadsInJava126{
        public static void main(String[] args){
            final Shared126 s = new Shared126();
            Thread t1 = new Thread(){
                public void run(){
                    s.methodOne();   //t1 calling methodOne() of 's' object
                }
            };
     
            Thread t2 = new Thread(){
                @Override
                public void run(){
                    s.methodTwo();   //t2 calling methodTwo() of 's' object
                }
            };
            t1.start();
            t2.start();
        }
    }


/*In this example, Thread t1 and t2 are sharing shared class object ‘s’. Thread t1 is calling methodOne() and thread t2 is calling 
 * methodTwo() of ‘s’ object. Both the methods are synchronized. That means, for any thread to enter these methods, they must acquire 
 * lock of ‘s’ object.

First, thread t1 acquires the object lock and enters methodOne(). Thread t2 waits for thread t1 to release the object lock. Thread t1 
calls wait() method within methodOne(). As soon as, it calls wait() method, It releases the lock of ‘s’ object and goes for wait. Thread 
t2 acquires this lock and enters methodTwo(). After entering methodTwo(), thread t2 sleeps for 5 seconds and calls notify() method on this 
object. It wakes up thread t1 which is waiting for this object lock. As soon as, thread t2 releases the object lock after finishing it’s 
execution of methodTwo(), thread t1 acquires this lock and executes remaining statements of methodOne(). In this manner, both threads t1 
and t2 communicate with each other and share the lock.    
*/

/*********************************************************************************************************************/
/* Thread Interruption In Java */    
/*Thread interruption in java is a mechanism in which a thread which is either sleeping or waiting can be made to stop sleeping or waiting. 
 Thread interruption is like telling the thread that it should stop waiting or sleeping and return to running status. Thread interruption 
 is programmatically implemented using interrupt() method of java.lang.Thread class. interrupt() method is a non-static public method of 
 Thread class. Here is the method signature of interrupt() method.*/

/*public void interrupt()
The whole thread interruption mechanism depends on an internal flag called interrupt status. The initial value of this flag for any thread 
is false. When you call interrupt() method on a thread, interrupt status of that thread will be set to true. When a thread throws 
InterruptedException, this status will be set to false again. Remember, InterruptedException is thrown when a thread is interrupted while 
it is sleeping or waiting. Many methods of Thread class like sleep(), wait(), join() throw InterruptedException.
*/
/*---------------1st Example-----------------*/
class ThreadsInJava127{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                try{
                    Thread.sleep(10000);        //Thread is sleeping for 10 seconds
                }
                catch (InterruptedException e){
                    System.out.println("Thread is interrupted");
                }
            }
        };
 
        t.start();
        try{
            Thread.sleep(3000);      //Main thread is sleeping for 3 seconds
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        t.interrupt();         //main thread is interrupting thread t
    }
}
/*In the above example, main thread is creating and starting thread t. Thread t is going to sleep for 10 seconds as soon as it started. 
main thread, after starting thread t, is also going to sleep for 3 seconds. After sleeping for 3 seconds, main thread calls interrupt() 
method on thread t. It interrupts sleeping thread t. It causes the InterruptedException.*/

/*---------------2nd Example-----------------*/
/*Some Things-To-Remember About Thread Interruption In Java :
You can check whether a particular thread is interrupted or not using isInterrupted() method of Thread class. This method returns current 
interrupt status of a thread.
*/    		
class ThreadsInJava128{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println(isInterrupted());         //Output : true
                try{
                    Thread.sleep(10000);        //Thread is going to sleep for 10 seconds
                }
                catch (InterruptedException e){
                    System.out.println("Thread is interrupted");
                }
                System.out.println(isInterrupted());       //Output : false
            }
        };
        t.start();
        t.interrupt();         //main thread is interrupting thread t
    }
}
/*Interrupted thread will not be eligible to go for sleep. i.e If you call interrupt() method on a thread which is not yet slept but running, 
such thread will throw InterruptedException while going to sleep. Look at the below example. In this example, thread t is interrupted by main 
thread as soon as it is started. But thread t will not throw InterruptedException as soon as it is interrupted. Instead it will continue to 
print 1000 numbers. While going to sleep after printing the numbers it will raise InterruptedException.*/

/*---------------3rd Example-----------------*/
class ThreadsInJava129{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                for(int i = 0; i <= 1000; i++){
                    System.out.println(i);
                }
 
                try{
                    Thread.sleep(10000);        //Thread is going to sleep for 10 seconds
                }
                catch (InterruptedException e){
                    System.out.println("Thread is interrupted");
                }
            }
        };
 
        t.start();
        t.interrupt();         //main thread is interrupting thread t
    }
}
/*A thread can interrupt itself. i.e a thread can call interrupt() method on it’s own.*/
class ThreadsInJava130{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println(isInterrupted());         //Output : false
                interrupt();              //Thread interrupting itself
                System.out.println(isInterrupted());        //Output : true
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println("Thread interrupted");
                }
                System.out.println(isInterrupted());       //Output : false
            }
        };
        t.start();
    }
}
/*There is one more method to check interrupt status of a thread, called interrupted() method. It is a static method of Thread class. 
 It also returns the current interrupt status of a thread like isInterrupted() method. But, it clears interrupt status of a thread. i.e 
 if interrupt status of a thread is true, then it will set the status to false.*/
class ThreadsInJava131{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println(interrupted());         //Output : false
                interrupt();
                System.out.println(interrupted());        //Output : true
                System.out.println(interrupted());       //Output : false
            }
        };
        t.start();
    }
}
/*interrupt() method will throw SecurityException if current thread can not interrupt a calling thread.*/    
    
