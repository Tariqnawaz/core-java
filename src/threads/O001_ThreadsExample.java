package threads;

public class O001_ThreadsExample {
	/*---------------1st Example---------------*/
	//Main Thread
    public static void main(String[] args){
        for (int i = 0; i <= 100; i++){
            System.out.println("From Main Thread");
        }
    }
    /* When you run this program, java command creates a primary thread or main thread which is responsible for executing main method. 
     * That’s why, execution of all java programs start with main() method.This is an example of single thread execution. */
}

/*---------------2st Example---------------*/
/* Java supports multi thread execution. i.e Java program can have more than one threads that can run simultaneously. This is called 
 * multithreaded programming.*/
//Defining first thread with task
//The task of this thread is to print the numbers from 0 to 1000 times
class Thread1 extends Thread{
  @Override
  public void run(){
      for(int i = 0; i <= 1000; i++){
          System.out.println(i);
      }
  }
}

//Defining second thread with task
//The task of this thread is to print the numbers from 1001 to 2000
class Thread2 extends Thread{
  @Override
  public void run(){
      for(int i = 1001; i<= 2000; i++){
          System.out.println(i);
      }
  }
}

class ThreadsInJava{
  //Main Thread
  public static void main(String[] args){
      //Creating first thread
      Thread1 t1 = new Thread1();
      t1.start();

      //Creating second thread
      Thread2 t2 = new Thread2();
      t2.start();
  }
}

/*---------------Creating Threads In Java---------------*/
/* By Extending Thread Class*/
/*---------------1st Example---------------*/
class MyThread1 extends Thread{
    @Override
    public void run(){
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++){
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
 
class ThreadsInJava1{
    //Main Thread
    public static void main(String[] args){
        //Creating and starting MyThread.
        MyThread1 myThread = new MyThread1();
        myThread.start();
    }
}

/*---------------2nd Example---------------*/
/* By Implementing Runnable interface*/
class MyThread2 implements Runnable{
    @Override
    public void run(){
        //Keep the task to be performed here
    }
    
    public static void main(String[] args){
    	MyThread2 myThread = new MyThread2();    //Creating object of your thread that implements Runnable interface
    	Thread t = new Thread(myThread);       //passing your thread object to the constructor of Thread class
    	t.start();                             //Starting the thread
    }
}

/*---------------3rd Example---------------*/
/* By Implementing Runnable interface*/
class MyThread3 implements Runnable{
    @Override
    public void run(){
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++){
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
 
class ThreadsInJava3{
    //Main Thread
    public static void main(String[] args){
        MyThread3 myThread = new MyThread3();    //instantiating your thread class that implements Runnable interface
        Thread t = new Thread(myThread);       //Creating an object to Thread class by passing your thread as an argument
        t.start();                            //Starting the thread
    }
}

							/*Thread As A Nested Class or Static Inner Class*/
/*Thread class can be defined as a nested class or static inner class of the usage class. This method is useful when only one class uses 
  the thread and it’s task more oftenly.*/
class UsageClass4{
    //Thread class as a nested class or Static Inner Class of the usage class
    static class MyThread4 extends Thread{
        @Override
        public void run(){
            System.out.println("Keep some task here.....");
        }
    }
 
    //Another thread class as a nested class or Static Inner Class of the usage class
    static class MyThread5 implements Runnable{
        @Override
        public void run(){
            System.out.println("Keep some task here......");
        }
    }
 
    public static void main(String[] args){
        //Using the MyThread1 and it's task
        MyThread4 thread1 = new MyThread4();
        thread1.start();
        //Using MyThread2 and it's task
        MyThread5 thread2 = new MyThread5();
        Thread t = new Thread(thread2);
        t.start();
    }
}

						/*Thread As A Member Inner Class or Non-static Inner Class*/
/*This method is also useful when one class uses thread and it’s task more excessively.*/
class UsageClass5
{
    //Thread class as a member inner class or Non-static Inner Class of the usage class
    class MyThread1 extends Thread{
        @Override
        public void run(){
            System.out.println("Keep Some task here.....");
        }
    }
 
    //Another thread class as a member inner class or Non-Static Inner Class of the usage class
    class MyThread2 implements Runnable{
        @Override
        public void run(){
            System.out.println("Keep some task here.....");
        }
    }
 
    public static void main(String[] args){
        //Using MyThread1 and it's task
        MyThread1 thread1 = new UsageClass5().new MyThread1();
        thread1.start();
        //Using MyThread2 and it's task
        MyThread2 thread2 = new UsageClass5().new MyThread2();
        Thread t = new Thread(thread2);
        t.start();
    }
}

								/*Thread As A Local Inner Class*/
/*The thread class can be defined as a local inner class of the method of the usage class. If declared so, only that method can use 
 the functionality of that thread.*/
class UsageClass6{
    public static void main(String[] args){
        //Thread as a Local Inner Class
        class MyThread1 extends Thread{
            @Override
            public void run(){
                System.out.println("Keep some task here.....");
            }
        }
 
        //Another thread as a Local Inner Class
        class MyThread2 implements Runnable{
            @Override
            public void run(){
                System.out.println("Keep some task here.....");
            }
        }
 
        //Using MyThread1 and it's task
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        //Using MyThread2 and it's task
 
        MyThread2 thread2 = new MyThread2();
        Thread t = new Thread(thread2);
        t.start();
    }
}

/*Thread As An Anonymous Inner Class*/
/*Threads can be declared as anonymous inner class. This method is useful when some task is needed only once. You can’t use the thread 
 * which is declared as anonymous inner class multiple times. You can use it only once.*/

class UsageClass7{
    public static void main(String[] args){
        //Thread as an anonymous inner class
        new Thread(){
            @Override
            public void run(){
                System.out.println("Keep some task here.....");
            }
        }.start();
 
        //Thread as an anonymous inner class
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Keep some task here.....");
 
            }
        }).start();
    }
}

/*Usage class itself as a thread class.*/
/*You can declare usage class itself as a thread class. If declared so, other classes can also use the thread and it’s task.*/
class UsageClass8 extends Thread{
    @Override
    public void run(){
        System.out.println("Keep some task here.....");
    }
 
    public static void main(String[] args){
        //Using thread and it's task
        UsageClass8 t = new UsageClass8();
        t.start();
    }
}
 
//Another Usage Class
class AnotherUsageClass8{
    void method(){
        //Using the thread and it's task
        UsageClass8 t = new UsageClass8();
        t.start();
    }
}

									/*Types Of Threads In Java*/
/*
 1) User Thread
 2) Daemon Thread*/

/*-----------------1st Example-------------------*/
/*You can convert user thread into daemon thread explicitly by calling setDaemon() method of the thread.*/
class UserThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is an user thread....");
        }
    }
}
 
class ThreadsInJava11{
    //Main Thread
    public static void main(String[] args){
        UserThread userThread = new UserThread();   //Creating the UserThread
        userThread.setDaemon(true);        //Changing the thread as Daemon
        userThread.start();               //Starting the thread
    }
}

/*-----------------2nd Example-------------------*/
/*You can’t set a daemon property after starting the thread. If you try to set the daemon property when the thread is active, 
 It will throw a IllegalThreadStateException at run time.*/
class UserThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is an user thread....");
        }
    }
}
 
class ThreadsInJava12{
    public static void main(String[] args){
        UserThread userThread = new UserThread();   //Creating the UserThread
        userThread.start();               //Starting the thread
        userThread.setDaemon(true);        //This statement will throw IllegalThreadStateException
    }
}

/*-----------------3rd Example-------------------*/
/*You can check whether the thread is user thread or a daemon thread by using isDaemon() method of Thread class. This method 
 returns “true” for a daemon thread and “false” for a user thread.*/
class UserThread2 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is an user thread....");
        }
    }
}
 
class ThreadsInJava13{
    public static void main(String[] args){
        UserThread userThread = new UserThread();   //Creating the UserThread
        System.out.println(userThread.isDaemon());    //Output : false
        userThread.setDaemon(true);         //changing the thread as Daemon
        userThread.start();                 //Starting the thread
        System.out.println(userThread.isDaemon());      //Output : true
    }
}

/*-----------------4th Example-------------------*/
/*Daemon property of a thread is inherited from it’s parent thread. i.e The thread created by user thread will be user thread and the 
 thread created by daemon thread will be a daemon thread.*/
class Thread6 extends Thread{
    @Override
    public void run(){
        Thread t = new Thread();      //Creating a child thread
        System.out.println(t.isDaemon());   //Checking the Daemon property of a child thread
    }
}
 
class ThreadsInJava15{
    public static void main(String[] args){
        Thread6 t1 = new Thread6();   //Creating the Thread1
        t1.start();                 //Starting the thread
 
        Thread6 t2 = new Thread6();   //Creating the Thread1
        t2.setDaemon(true);         //changing the thread as Daemon
        t2.start();          //Starting the thread
    }
}

/*-----------------5th Example-------------------*/
/*The main thread or primary thread created by JVM is an user thread.
Demonstration of User thread and daemon thread  :  In the below program, The task of daemon thread will not be completed.
Program terminates as soon as user thread finishes it’s task. It will not wait for daemon thread to finish it’s task.
*/
class UserThread3 extends Thread{
    @Override
    public void run(){
        System.out.println("This is a user thread.....");
    }
}
 
class DaemonThread1 extends Thread{
    public DaemonThread1(){
        setDaemon(true);
    }
 
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is daemon thread....."+i);
        }
    }
}
 
class ThreadsInJava16{
    public static void main(String[] args){
        DaemonThread1 daemon = new DaemonThread1();   //Creating the DaemonThread
         daemon.start();                 //Starting the daemon thread
         UserThread3 userThread = new UserThread3();   //Creating the UserThread
        userThread.start();          //Starting the user thread
    }
}
/*You can convert user thread into daemon thread explicitly by calling setDaemon() method of the thread.*/

/*-----------Naming A Thread In Java-------------------*/
/*-----------------1st Example --------------*/
/*You can give a name to a thread by using setName() method of Thread class. You can also retrieve the name of a thread using 
  getName() method of a Thread class. These two methods are public and final. Below is the method signatures of these methods.
 
1)  public final void setName(String name)   —-> It changes the name of the thread to “name”.
2)  public final String getName()   —-> Returns the name of the thread.*/

class MyThread01 extends Thread{
    @Override
    public void run(){
        System.out.println("Keep some task here....");
    }
}
 
class ThreadsInJava01{
    public static void main(String[] args){
        MyThread01 thread = new MyThread01();     //Creating a thread
        thread.start();                     //Starting a thread
        thread.setName("My Thread");        //Giving a name to the thread
        String name = thread.getName();    //Retreiveing the name of the thread
        System.out.println(name);   //Output : My Thread
    }
}

/*Some Things-To-Remember about Naming a thread in java :
setName() method may throw a SecurityException at run time if the current thread can not modify the name of the specified thread.
You can change the name of a thread at any state of the thread.
*/
class MyThread02 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }
}
 
class ThreadsInJava02{
    public static void main(String[] args){
        MyThread01 thread = new MyThread01();     
        thread.setName("My Thread");        //Changing the name of the thread before starting the thread
        thread.start();                     
        thread.setName("My Thread");        //changing the name of the thread when thread is active
        try{
            thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        thread.setName("My Thread");     //Changing the name of the thread when thread is sleeping
    }
}

/*Default Name Of The Thread :
In Java, All threads have names. If you are not providing the name to a thread, thread will get default name. Default name of the 
thread will be consist of a word “Thread”, followed by hyphen (-) and followed by an integer number starting with 0.
*/

class ThreadsInJava03{
    public static void main(String[] args){
        Thread t = new Thread();
        System.out.println(t.getName());    //Output : Thread-0
    }
}

/*How to retrieve a name of the primary thread or main thread?
First, get the reference of the main thread by using currentThread() method of Thread class. currentThread() method returns the reference 
of currently executing thread. After, getting the reference of the main thread, use the getName() method to retrieve the name of the thread.
*/
class ThreadsInJava04{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());    //Output : main
    }
}

/*Can we change the name of the main thread ?
Yes, we can change the name of the main thread. It can be done by first getting the reference of the main thread by using currentThread() 
method and then calling setName() method on it.
*/
class ThreadsInJava05{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        t.setName("main-thread-name-modified");
        System.out.println(t.getName());    //Output : main-thread-name-modified
    }
}

/*Another method of naming a thread in java :
You can pass name of the thread while creating the object to thread. There is a constructor in Thread class which takes name of the thread 
as an argument.
*/
class MyThread06 extends Thread{
    public MyThread06(String name){
        super(name);
    }
 
    @Override
    public void run(){
        System.out.println(getName());      //Output : My Thread
    }
}
 
class ThreadsInJava06{
    public static void main(String[] args){
        MyThread06 t = new MyThread06("My Thread");    //passing the name while creating the thread
        t.start();
    }
}

/*-----------How to identify a thread in java?-------------------*/
/*From JDK 1.5 onward, One more method added to java.lang.Thread class. That is getID() method. This method returns the unique long number 
 associated with a thread. That can be used as an identifier of a thread. Below is the method signature of getID() method.*/
/*-----------------1st Example --------------*/
class MyThread001 extends Thread{
    @Override
    public void run(){
        System.out.println(getId()+" is running");   //Output : 8 is running
    }
}
 
class ThreadsInJava001{
    public static void main(String[] args){
        MyThread001 t = new MyThread001();    
        t.start();      
        System.out.println(t.getId());     //Output : 8
    }
}

/*Some Things-To-Remember about Identifying a Thread In Java :
1) Thread ID is a unique positive long number. It remains the same for a thread during its whole life term. Thread ID may be reused when 
the thread is terminated.
2) Can we use the thread ID before a thread is started?
Thread ID is generated as soon as the thread is created. So, you can use the thread ID before starting the thread.*/

/*-----------------2nd Example --------------*/
class MyThread002 extends Thread{
    @Override
    public void run(){
        System.out.println(getId()+" is running");   //Output : 8 is running
    }
}
 
class ThreadsInJava002{
    public static void main(String[] args){
        MyThread002 t = new MyThread002();     //Creating the thread
        System.out.println(t.getId());     //Using the thread ID before starting the thread
        t.start();           //starting the thread
    }
}

/*3) Does thread ID changes when the thread name is changed?.
Thread ID doesn’t change when the name of a thread is changed. Therefore, if the thread name is changed, still thread can be identified by 
it’s ID.
*/
/*-----------------3rd Example --------------*/
class ThreadsInJava003{
    public static void main(String[] args){
        Thread t = new Thread("Name-Of-A-Thread");
        System.out.println(t.getName());     //Output : Name-Of-A-Thread
        System.out.println(t.getId());       //Output : 8
        t.setName("Name-Of-A-Thread-Changed");
        System.out.println(t.getName());    //Output : Name-Of-A-Thread-Changed
        System.out.println(t.getId());      //Output : 8
    }
}

/*4) How to get ID of the main thread?
First, get the reference of main thread using currentThread() method of Thread class. After getting the reference of main thread, call the 
getId() method on it.
*/
/*-----------------4th Example --------------*/
class ThreadsInJava004{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        long ID = t.getId();
        System.out.println(ID);
    }
}

/*5) Can we give our own ID to the thread?
No, we can’t assign our own ID to the thread. But, we can change the way getID() returns the thread ID as it is not a final method.
*/
/*-----------------5th Example --------------*/
class MyThread006 extends Thread{
    @Override
    public long getId(){
        long l = super.getId() + 1;    // It increases the thread ID by 1
        return l;
    }
 
    @Override
    public void run(){
        System.out.println(getId());    //Output : 9
    }
}
 
class ThreadsInJava006{
    public static void main(String[] args){
        MyThread006 thread = new MyThread006();
        thread.start();
    }
}

/*-----------Priority Of A Thread In Java-------------------*/
/*As we know, Java allows multithreaded programming. i.e Java application can have more than one threads running simultaneously. 
  When an application has multiple threads they are choosen to execute on priority basis. A thread with highest priority is choosen 
  first for execution than the thread with lowest priority.
 
There are two methods in java.lang.Thread class related to priority of a thread. They are setPriority() and getPriority methods. 
setPriority() method is used to set the priority of a thread and getPriority() method is used to retrieve the priority of a thread. 
Below is the method signatures of these methods.

public final void setPriority(int newPriority)  —> Changes the priority of a thread to newPriority.
public final int getPriority()  —>  Returns the priority of a thread.*/

/*-----------------1st Example --------------*/
class MyThread100 extends Thread{
    public MyThread100(String name){
        super(name);
    }
 
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("from "+getName());
        }
    }
}
 
class ThreadsInJava100{
    public static void main(String[] args){
        MyThread100 t1 = new MyThread100("Thread 1");
        t1.setPriority(5);         //Setting the priority of Thread 1
        t1.start();
        MyThread100 t2 = new MyThread100("Thread 2");
        t1.setPriority(7);         //Setting the priority of Thread 2
        t2.start();
 
        System.out.println(t1.getPriority());      //Output : 5
       System.out.println(t2.getPriority());      //Output : 7
    }
}

/*-----------------2nd Example --------------*/
/*Some Things-To-Remember about priority of a thread in java :

There are three constant fields in java.lang.Thread class related to priority of a thread. They are,
MIN_PRIORITY   —> It defines the lowest priority that a thread can have and It’s value is 1.

NORM_PRIORITY  —> It defines the normal priority that a thread can have and it’s value is 5.

MAX_PRIORITY  —> It defines the highest priority that a thread can have and it’s value is 10.*/
class ThreadsInJava101{
    public static void main(String[] args){
        System.out.println(Thread.MIN_PRIORITY);     //Output : 1
        System.out.println(Thread.NORM_PRIORITY);    //Output : 5
        System.out.println(Thread.MAX_PRIORITY);     //Output : 10
    }
}

/*-----------------3rd Example --------------*/
/*setPriority() method may throw two exceptions. One is IllegelArgumentException if supplied priority is not in the range of MIN_PRIORITY 
  and MAX_PRIORITY and another one is SecurityException if current thread can not modify the priority of a specified thread.*/
class ThreadsInJava103{
    public static void main(String[] args){
        Thread t = new Thread();
        t.setPriority(12);    //This statement throws IllegalArgumentException at run time
        t.start();
    }
}

/*-----------------4th Example --------------*/
/*How to retrieve the priority of a main thread?
First, get the reference to a main thread using currentThread() method of Thread class. After getting the reference of main thread, call 
getPriority() method on it.
*/
class ThreadsInJava104{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());    //Output : 5
    }
}

/*-----------------5th Example --------------*/
/*Can we change the priority of a main thread?.
Yes, we can change the priority of a main thread. First, get the reference of main thread using CurrentThread() method. Then call 
setPriority() method on it.
*/
class ThreadsInJava105{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        t.setPriority(8);
        System.out.println(t.getPriority());    //Output : 8
    }
}

/*-----------------6th Example --------------*/
/*The priority of a main thread, if explicitly not set, is always 5 i.e NORM_PRIORITY.
The default priority of a thread is same as that of it’s parent.*/
class ThreadsInJava106{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        t.setPriority(8);
        Thread t1 = new Thread("Child Thread");      //Creating the child thread
        System.out.println(t1.getPriority());       //Output : 8
    }
}

/*-----------Thread.sleep() Method In Java-------------------*/
/*Thread.sleep() method makes the currently executing thread to pause it’s execution for a specified period of time. There are two 
  overloaded forms of sleep() method available in java.lang.Thread class. They are,

1) public static void sleep(long millis) throws InterruptedException
—> It causes the currently executing thread to sleep for specified number of milliseconds.
2) public static void sleep(long millis, int nanos) throws InterruptedException
—> It makes the currently executing thread to sleep for specified number of milliseconds plus specified number of nanoseconds.*/

/*-----------------1st Example --------------*/
class ThreadsInJava201{
    public static void main(String[] args){
        System.out.println("Before Sleeping");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        System.out.println("After Sleeping");
    }
}

/*In the above example, the main thread first prints “Before Sleeping”. After that it pauses for 5000 milisseconds(5 seconds) and prints 
 * “After Sleeping”. Notice that the statement “Thread.sleep(5000)” is enclosed within try-catch blocks.*/


/*Some Things-To-Remember About Thread.sleep() Method In Java :
It is always current thread that is going to sleep. For example, In the below example, main thread is going to sleep not “My Thread” even 
though you are calling sleep() method on “My Thread”.
*/
/*-----------------2nd Example --------------*/
class MyThread202 extends Thread{
    public MyThread202(String name){
        super(name);
    }
 
    @Override
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println(i);
        }
    }
}
 
class ThreadsInJava202{
    public static void main(String[] args){
        MyThread202 thread = new MyThread202("My Thread");
        thread.start(); 
        System.out.println("Before Sleeping");
        try{
            thread.sleep(5000);       //main thread is going for sleep not My Thread
        }
        catch (InterruptedException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("After Sleeping");
    }
}

/*-----------------3rd Example --------------*/
/*It is a bad practice to call sleep() method with an instance of Thread class as in the above example. If you want a particular thread to 
 sleep for a while, then call sleep() method inside the run() method of that thread.*/
class MyThread203 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
 
            try{
                sleep(1000);            //this thread sleeps for 1 second
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
 
class ThreadsInJava203{
    public static void main(String[] args){
        MyThread203 thread = new MyThread203();
        thread.start();
    }
}

/*-----------------4th Example --------------*/
/*An example for using second form of sleep() method.*/
class ThreadsInJava204{
    public static void main(String[] args){
        System.out.println("Before Sleeping");
 
        try{
            Thread.sleep(5000, 500000);       //thread sleeps for about 5.5 seconds
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("After Sleeping");
    }
}

/*-----------------5th Example --------------*/
/*Thread.sleep() method may also throws IllegalArgumentException if miilis value is negative or nanos value is not in the range 0 – 999999.*/
class ThreadsInJava205{
    public static void main(String[] args){
        System.out.println("Before Sleeping");
        try{
            Thread.sleep(-5000);          //This statement throws IllegalArgumentException
        }
        catch (Exception e){
            e.printStackTrace();
        }
 
        System.out.println("In between sleep");
 
        try{
            Thread.sleep(1000, 50000000);       //This statement throws IllegalArgumentException
        }
        catch (Exception e){
            e.printStackTrace();
        }
 
        System.out.println("After Sleeping");
    }
}

/*-----------Joining The Threads In Java-------------------*/
/*join() method of java.lang.Thread class is used to mantain the order of execution of threads. Using join() method, you can make the 
 * currently executing thread to wait for the some other threads to finish their task. For example, Let’s us assume that there are two 
 * threads namely, thread1 and thread2. You can make thread1 to hold it’s execution for some time so that thread2 can finish it’s task. 
 * After, thread2 finishes it’s task, thread1 resumes it’s execution.For this to happen, you should call join() method on thread2 within 
 * thread1.
 
Like sleep() method, join() method is also overloaded in Thread class. There are three forms of join() method available in Thread class.
1) public final void join() throws InterruptedException
—> Currently executing thread waits for a thread to finish it’s task on which it is called.

2) public final void join(long millis) throws InterruptedException
—> currently executing thread waits at most millis milliseconds for a thread to finish it’s task on which it is called.

3) public final void join(long millis, int nanos) throws InterruptedException
—> Currently executing thread waits at most millis milliseconds plus nanos nanoseconds for a thread to finish it’s task on which it is 
   called.*/

/*-----------------1st Example --------------*/
class ThreadsInJava301{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("main thread started : Task is to print numbers from 0 to 3000");
        final Thread t1 = new Thread(){
            @Override
            public void run(){
                //Thread t1 started : Task is to print numbers from 0 to 1000"
                for(int i = 0; i <= 1000; i++){
                    System.out.println(i);
                }
                System.out.println("Numbers from 0 to 1000 are printed");
            }
        };
        final Thread t2 = new Thread(){
            @Override
            public void run(){
                //Thread t2 started : Task is to print numbers from 1001 to 2000
                try{
                    t1.join(5000, 500000);   //waits at most 5.5 seconds for thread t1 to finish it's task
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
 
                for(int i = 1001; i <= 2000; i++){
                    System.out.println(i);
                }
                System.out.println("Numbers from 1001 to 2000 are printed");
            }
        };
 
        Thread t3 = new Thread(){
            @Override
            public void run(){
                //Thread t3 started : Task is to print numbers from 2001 to 3000
                try{
                    t2.join(5000);   //waits at most 5 seconds for thread t2 to finish it's task
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
 
                for(int i = 2001; i <= 3000; i++){
                    System.out.println(i);
                }
                System.out.println("Numbers from 2001 to 3000 are printed");
            }
        };
        t3.start();
        t2.start();
        t1.start();
        t3.join();     //Waits for t3 thread to finish it's task
        //No need enclose this join statement in try-catch blocks as we have already specified the exception with throws clause.
        System.out.println("Task is finished");
    }
}
/*The main task of above example is to print the numbers from 0 to 3000. This task is devided into three parts and each part is assigned 
 * to one thread. i.e The task of printing the numbers from 0 to 1000 is assigned to thread t1, printing the numbers from 1001 to 2000 is 
 * assigned to thread t2 and printing the numbers from 2001 to 3000 is assigned to thread t3.The main thread creates and starts these 
 * three threads. main thread also calls join method on thread t3 (Line 79). So main thread waits until thread t3 finishes it’s task. 
 * Before starting it’s task, thread t3 calls join method on thread t2 (Line 57). So, thread t3 waits at most 5 seconds for thread t2 to 
 * finish it’s task. Thread t2 also calls join method on thread t1 (Line 32). So, thread t2 waits at most 5.5 seconds for thread t1 to 
 * finish it’s task. So, first t1 finishes it’s task and then t2 finishes it’s task and after that t3 finishes it’s task. After all these 
 * three threads finish their task, main threads completes the task.*/


/*-----------Thread Interference In Java-------------------*/
/*Thread interference in java is a condition which occurs when more than one threads, executing simultaneously, access same piece of data. 
 * When more than one threads have access to same data, it is possible that data may get corrupted or one may not get the desired output. 
 * Thread interference occurs when code written is not thread safe.*/

/*-----------------1st Example --------------*/
class Shared401{
    int i;
    void SharedMethod(){
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }
}
 
class ThreadsInJava401{
    public static void main(String[] args){
        final Shared401 s1 = new Shared401();
 
        Thread t1 = new Thread(){
            @Override
            public void run(){
                s1.SharedMethod();
            }
        };
 
        Thread t2 = new Thread(){
            @Override
            public void run(){
                s1.SharedMethod();
            }
        };
        t1.start();
        t2.start();
    }
}

/*In the above example, There are two threads namely t1 and t2, and they are using same Shared class object s1. Both t1 and t2 are 
 * calling sharedMethod() of s1 object from their run() method. As we are starting thread t1 first, let’s assume that thread t1 is 
 * executing the last statement of sharedMethod() (Line 12) and thread t2 has finished executing the first statement of sharedMethod() 
 * (Line 7). While executing last statement, thread t1 will be expecting value of “i” as 30 as it has assigned 30 to it in the previous 
 * statement (Line 11), but t2 has changed value of “i” to 10 while executing the first statement. So, t1 will read value of “i” as 10 
 * not 30 as it is expecting.*/

/*This is an example of Thread Interference. Thread interference occurs when sequence of steps of more than one threads overlap. You can 
 * follow the Oracle documentation of thread interference here. The above example can be described by the diagram as below.*/








