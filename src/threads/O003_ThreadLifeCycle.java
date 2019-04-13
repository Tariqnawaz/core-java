package threads;

/*There are six thread states. They are NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING and TERMINATED. At any point of time, thread will 
be in any one of these states.
java.lang.Thread class has one member of enum type called State. All states of a thread are stored in this enum as constants. Let’s extract 
these thread states programmatically. Execute the below program, it prints all states of a thread.
*/
public class O003_ThreadLifeCycle {

}

class ThreadsInJava217{
    public static void main(String[] args){
        Thread.State[] states = Thread.State.values();
        for (Thread.State state : states){
            System.out.println(state);
        }
    }
}
/*The output of this program will be,
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
*/

/*These are the states of a thread in Java . let’s discuss these thread states one by one.
1) NEW
A thread will be in this state before calling start() method.
*/
class JavaThreadLifeCycle1{
    public static void main(String[] args){
        Thread t = new Thread();
        //Checking the state before starting the thread
        System.out.println(t.getState());     //Output : NEW
    }
}

/*2) RUNNABLE
A thread will be in this state after calling the start() method.
*/
class JavaThreadLifeCycle2{
    public static void main(String[] args){
        Thread t = new Thread();
        t.start();
        //Checking the state after starting the thread
        System.out.println(t.getState());     //Output : RUNNABLE
    }
}

/*3) BLOCKED
A thread will be in this state when a thread is waiting for object lock to enter into synchronized method/block or a thread will be in this state if deadlock occurs. Below example shows the states of two threads when deadlock occurs.
*/
class Shared201{
    synchronized void methodOne(Shared201 s){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        s.methodTwo(this);
    }
 
    synchronized void methodTwo(Shared201 s){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        s.methodOne(this);
    }
}
 
class ThreadsInJava218{
    public static void main(String[] args){
        final Shared201 s1 = new Shared201();
        final Shared201 s2 = new Shared201();
 
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
    }
}

/*4)  WAITING
A thread will be in this state when wait() or join() method is called. Below example shows the thread state when join() method is called.
*/

class ThreadsInJava213{
    public static void main(String[] args){
        final Thread t1 = new Thread(){
            public void run(){
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
 
        Thread t2 = new Thread(){
            public void run(){
                try{
                    t1.join();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t2.start();
        t1.start();
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Checking the state of t2 after it calls join() on t1
        System.out.println(t2.getState());     //Output : WAITING
    }
}

/*5) TIMED_WAITING
A thread will be in this state when thread is sleeping. i.e A thread will be in this state when sleep() or wait() with timeOut or join() 
with timeOut is called.
*/
class ThreadsInJava214{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                try{
                    Thread.sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
 
        t.start();
 
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
 
        //Checking the state when thread is sleeping
        System.out.println(t.getState());     //Output : TIMED_WAITING
    }
}

/*6) TERMINATED
A thread will be in this state once it finishes it’s execution.
*/
class ThreadsInJava215{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                for(int i = 0; i <= 25; i++){
                    System.out.println(i);
                }
            }
        };
 
        t.start();
 
        try{
            Thread.sleep(2000);      //Main thread is sleeping for 2 sec
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Checking the state when thread t is finished it's execution
        System.out.println(t.getState());     //Output : TERMINATED
    }
}
