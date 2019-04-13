package threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThradsConsolidateJavaProgram {
	public static void main(String[] args){
		ExtendingThreadClass t1 = new ExtendingThreadClass("Main-Thread");
		System.out.println(t1.getId());                //Using the thread ID before starting the thread
		t1.start();
		 System.out.println("Before Sleeping");
	        try{
	            t1.sleep(5000);       //main thread is going for sleep not My Thread
	        }
	        catch (InterruptedException e){
	            e.printStackTrace();
	        }
	        System.out.println("After Sleeping");
		
	        
		t1.setName("My Thread");                      //Giving a name to the thread
        String name = t1.getName();                   //Retreiveing the name of the thread
        System.out.println(name);                     //Output : My Thread
        
        Thread t = Thread.currentThread();            // retrieving a name of the primary thread or main thread.
        System.out.println(t.getName());              //Output : main
        System.out.println(t.getPriority());          //Output : 5 // retrieving a priority of the primary thread or main thread.
        t.setPriority(8);
        System.out.println(t.getPriority());          //Output : 8 // Changing priority of the primary thread or main thread.
        long ID = t.getId();                          // retrieving a id of the primary thread or main thread.
        System.out.println(ID);
        long l = t.getId() + 1;                       // we can change the way getID() returns the thread ID as it is not a final method.
        System.out.println(l);
        
        t.setName("main-thread-name-modified");
        System.out.println(t.getName());    //Output : main-thread-name-modified
        System.out.println(t.getId());    //Output : 8  // returning unique id
        
		ImplementingRunnableInterface t2 = new ImplementingRunnableInterface();
		Thread t3 = new Thread(t2);
		t3.start();
		System.out.println("Before Sleeping");
		try{
            Thread.sleep(5000, 500000);       //thread sleeps for about 5.5 seconds
            //Thread.sleep(-5000);          //This statement throws IllegalArgumentException
            //Thread.sleep(1000, 50000000);       //This statement throws IllegalArgumentException
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("After Sleeping");
		
		
		/*Nested Class*/
		NestedClassImplementingThread.StaticExtendingThread t4 = new NestedClassImplementingThread.StaticExtendingThread(); 
		t4.start();
		NestedClassImplementingThread.StaticImplementingRunnableInterface t5 = new NestedClassImplementingThread.StaticImplementingRunnableInterface();
		Thread t6 = new Thread(t5);
		t6.start();
		
		/* Priority Of A Thread */
		ExtendingThreadClass t7 = new ExtendingThreadClass("Thread 1");
		t7.setPriority(5);         //Setting the priority of Thread 1
		t7.start();
        ExtendingThreadClass t8 = new ExtendingThreadClass("Thread 2");
        t8.setPriority(7);         //Setting the priority of Thread 2
        t8.start();
 
        System.out.println(t7.getPriority());      //Output : 5
        System.out.println(t8.getPriority());      //Output : 7
        
        System.out.println(Thread.MIN_PRIORITY);     //Output : 1
        System.out.println(Thread.NORM_PRIORITY);    //Output : 5
        System.out.println(Thread.MAX_PRIORITY);     //Output : 10
		
	}
}

/*Example 1.*/
class ExtendingThreadClass extends Thread{
	public void run() {
		for(int i = 0 ; i<=5;i++){
			System.out.println("ExtendingThreadClass : "+i);
			 System.out.println(getId()+" is running"); 
			 System.out.println("from "+getName());
			 try{
	                sleep(1000);            //this thread sleeps for 1 second
	            }
	            catch (InterruptedException e){
	                e.printStackTrace();
	            }
		}
	}
	
	public ExtendingThreadClass(String name){
        super(name);
    }
}

class ImplementingRunnableInterface implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i<=5;i++){
			System.out.println("ImplementingRunnableInterface : "+i);
		}
	}
}

/*Example 2.*/
class NestedClassImplementingThread{
	/* Static Inner Class*/
	static class StaticExtendingThread extends Thread{
		public void run(){
			System.out.println("Keep some task here.....");
		}
	}
	static class StaticImplementingRunnableInterface implements Runnable{
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}
	
	/* Member Inner Class*/
	class MemberExtendingThread extends Thread{
		public void run(){
			System.out.println("Keep some task here.....");
		}
	}
	
	class MemberImplementingRunnableInterface implements Runnable{
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}
	
	/* Local Inner Class*/
	public void localInnerClass(){
		class InnerExtendingThread extends Thread{
			public void run(){
				System.out.println("Keep some task here.....");
			}
		}
		
		class InnerImplementingRunnableInterface implements Runnable{
			@Override
			public void run() {
				System.out.println("Keep some task here.....");
			}
		}
	}
}

 /*Example 3*/
class MyUserThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is an user thread....");
        }
    }
    
    public static void main(String[] args){
    	UserThread userThread = new UserThread();   //Creating the UserThread
    	System.out.println(userThread.isDaemon());    //Output : false
        userThread.setDaemon(true);        //Changing the thread as Daemon
        userThread.start();  
       // userThread.setDaemon(true);        //This statement will throw IllegalThreadStateException
        System.out.println(userThread.isDaemon());      //Output : true
    }
}

 /*Example 3.1*/
class MyUserThread3 extends Thread{
    @Override
    public void run(){
        System.out.println("This is a user thread.....");
    }
}
 
class MyDaemonThread1 extends Thread{
    public MyDaemonThread1(){
        setDaemon(true);
    }
 
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("This is daemon thread....."+i);
        }
    }
}

class MyThreadsInJava16{
    public static void main(String[] args){
        DaemonThread1 daemon = new DaemonThread1();   //Creating the DaemonThread
         daemon.start();                 //Starting the daemon thread
         UserThread3 userThread = new UserThread3();   //Creating the UserThread
        userThread.start();          //Starting the user thread
    }
}

/*Example 4.  Synchronization*/
class Synchronization{
    int i;
    synchronized void SharedMethod(){
        Thread t = Thread.currentThread();
        for(i = 0; i <= 1000; i++){
            System.out.println(t.getName()+" : "+i);
        }
    }
}
class SynchronizationMain{
	public static void main(String[] args){
		final Synchronization s1 = new Synchronization();
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
/* In the above example, both threads t1 and t2 wants to execute sharedMethod() of s1 object. But, sharedMethod() is declared as 
 * synchronized. So, whichever thread enters first into sharedMethod(), it continues to execute that method. The other thread waits for 
 * first thread to finish it’s execution of sharedMethod(). It never enters into sharedMethod() until first thread is done with that method. 
 * That means, both threads are executing sharedMethod() one by one not simultaneously. This protects the value of “i” in the memory for a 
 * particular thread.*/
/*Synchronized Blocks :*/
class SynchronisedBlock{
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

/* Dead Lock Example 5*/
/*How To Detect The Deadlocked Threads In Java*/
class DeadLockExample{
    synchronized void methodOne(DeadLockExample s){
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
 
    synchronized void methodTwo(DeadLockExample s){
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
 
class DeadLockMain{
    public static void main(String[] args){
        final DeadLockExample s1 = new DeadLockExample();
        final DeadLockExample s2 = new DeadLockExample();
 
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
        else{
            System.out.println("No Deadlocked Threads");
        }
    }
}

/* Thread Interruption In Java Example 6*/
class ThreadInterruptionExample{
    public static void main(String[] args){
    	Thread t = new Thread(){
        	public void run(){
            	System.out.println(isInterrupted());         //Output : false
                interrupt();                                 //Thread interrupting itself
                System.out.println(isInterrupted());        //Output : true
                
                /* This is static method to check status of interrupted thread
                System.out.println(interrupted());         //Output : false
                interrupt();
                System.out.println(interrupted());        //Output : true
                System.out.println(interrupted());       //Output : false */ 
               try{
                    Thread.sleep(10000);                    //Thread is sleeping for 10 seconds
                }
                catch (InterruptedException e){
                    System.out.println("Thread is interrupted");
                }
                System.out.println(isInterrupted());       //Output : false
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

/* Thread Life Cycle Example 7*/
class JavaThreadLifeCycleExample{
	
	/* Blocked State */
	synchronized void methodOne(JavaThreadLifeCycleExample s){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
 
        s.methodTwo(this);
    }
 
    synchronized void methodTwo(JavaThreadLifeCycleExample s){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
 
        s.methodOne(this);
    }
    /* Blocked State */
    
    public static void main(String[] args){
    	/* New & Runnable */
        Thread t = new Thread();
        //Checking the state before starting the thread
        System.out.println(t.getState());     //Output : NEW
        t.start();
        //Checking the state after starting the thread
        System.out.println(t.getState());     //Output : RUNNABLE
        /* New & Runnable */
        
        /* Blocked State */
        final JavaThreadLifeCycleExample s1 = new JavaThreadLifeCycleExample();
        final JavaThreadLifeCycleExample s2 = new JavaThreadLifeCycleExample();
 
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
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Checking states of both the threads
 
        System.out.println(t1.getState());     //Output : BLOCKED
        System.out.println(t2.getState());     //Output : BLOCKED
        
        /* Blocked State */
        
        /* Waiting State */
        final Thread t3 = new Thread(){
            public void run(){
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
 
        Thread t4 = new Thread(){
            public void run(){
                try{
                    t3.join();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t4.start();
        t3.start();
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Checking the state of t2 after it calls join() on t1
        System.out.println(t4.getState());     //Output : WAITING
        /* Waiting State */
        
        /* TIMED_WAITING State */
        Thread t5 = new Thread(){
            public void run(){
                try{
                    Thread.sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
 
        t5.start();
 
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        //Checking the state when thread is sleeping
        System.out.println(t.getState());     //Output : TIMED_WAITING
        /* TIMED_WAITING State */
        
        /* TERMINATED State */
        Thread t6 = new Thread(){
            public void run(){
                for(int i = 0; i <= 25; i++){
                    System.out.println(i);
                }
            }
        };
 
        t6.start();
 
        try{
            Thread.sleep(2000);      //Main thread is sleeping for 2 sec
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Checking the state when thread t is finished it's execution
        System.out.println(t.getState());     //Output : TERMINATED
        /* TERMINATED State */
    }
}

/* Thread Group*/
class ThreadGroupExample {
	
	public static void main(String[] args){
		//Creating Parent Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group");
		//Adding threads to ThreadGroup while creating threads itself
		Thread t1 = new Thread(parentGroup, "Thread 1");
		Thread t2 = new Thread(parentGroup, "Thread 2");
		//Creating child thread group
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Thread Group");
		//Adding a thread to child thread group
		Thread t3 = new Thread(childGroup, "Thread 3");
		
		System.out.println(childGroup.getParent());   //Output : java.lang.ThreadGroup[name=Parent Thread Group ,maxpri=10]
		
		/* for isDaemon & setDaemon */
		
		//Creating Thread Group 
		ThreadGroup threadGroup = new ThreadGroup("Thread Group ");
		//Setting the daemon property of thread group
		threadGroup.setDaemon(true);
		//Checking the daemon property of thread group
		System.out.println(threadGroup.isDaemon());   //Output : true
		
		/* for isDaemon & setDaemon */
		
		/* for setMaxPriority */
		
		//Creating Thread Group 
		ThreadGroup threadGroup1 = new ThreadGroup("Parent Thread Group ");
		//Setting the maximum priority of thread group
		threadGroup1.setMaxPriority(8);
		//getting the maximum priority of thread group
		System.out.println(threadGroup1.getMaxPriority());   //Output : 8
		
		/* for setMaxPriority */
		
		/* for activeCount & activeGroupCount */
		
		//Creating parent Thread Group 
		ThreadGroup parentGroup1 = new ThreadGroup("Parent Thread Group ");
		Thread t11 = new Thread(parentGroup, "Thread 1"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t11.start();
		Thread t21 = new Thread(parentGroup, "Thread 2"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t21.start();
		//Creating Child Thread Group

		ThreadGroup childGroup1 = new ThreadGroup(parentGroup, "Child Group");
		Thread t31 = new Thread(childGroup, "Thread 3"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t31.start();
		//Checking Active thread count
		System.out.println(parentGroup1.activeCount());     //Output : 3
		//Checking Active thread group count
		System.out.println(parentGroup1.activeGroupCount());   //Output : 1
		
		/* for activeCount & activeGroupCount */
		//Enumerating all active threads
		Thread[] threads = new Thread[parentGroup1.activeCount()];
		int No_Of_Active_Threads = parentGroup1.enumerate(threads);
		System.out.println(No_Of_Active_Threads);
		for (Thread thread : threads){
			System.out.println(thread.getName());
		}
		
		parentGroup1.interrupt(); 		//Interrupting whole group
		parentGroup1.destroy();         //Destroying the whole group
		
	}
}


