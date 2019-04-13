package threads;

public class O005_Threads7Points2Remember {

}

/*1) If you start a thread that is already started, you will get java.lang.IllegalThreadStateException at run time. There will be no 
 * compilation errors.*/
class ThreadsInJava_1{
    public static void main(String[] args){
        Thread t = new Thread();
        t.start();
        t.start();    //This statement will throw java.lang.IllegalThreadStateException
    }
}

/*2) Exception is thread wise not execution wise. i.e exception effects the thread in which it occurs. Other threads will execute normally. 
 * In the below example, exception occurs in thread t1. only this thread will be terminated abruptly. Thread t2 will continue to execute it’s 
 * task.*/
class ThreadsInJava_2{
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                String s = null;
                System.out.println(s.length());  //This statement will throw NullPointerException
                System.out.println("This statement will not be executed");
            }
        };
 
        Thread t2 = new Thread(){
            public void run(){
                for(int i = 0; i <= 1000; i++){
                    System.out.println(i);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

/*3) As we all know that start() method internally calls run() method. What happens when you call run() method directly?. When you call run() 
 * method of a thread directly, calling thread will execute the task defined in the run() method. For example, in the below program main thread is calling run() method of thread t. In this case, main thread will execute run() method not thread t.*/
class ThreadsInJava_3{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName());    //Output : main
            }
        };
        t.run();
    }
}

/*4) Which one is better way to implement threads in java. Is it using Thread class or using Runnable interface?. It is the most confusing 
 * question for a java developer. I am of opinion that when multiple threads need to execute same task, then use Runnable interface. 
 * If multiple threads need to execute different tasks, then go for Thread class.*/

/*5) Setting the priority to a thread is not effective as we thought. Setting Priority of a thread is just an advice to OS not an instruction. 
 * It is up to OS to consider this advice.*/

/*6) Every thread in java is a member of a thread group. When a java application first starts up, Java runtime system creates a thread group 
 * called main. main thread is also member of this group.*/

class ThreadsInJava_4{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println(t.getThreadGroup());    
        //Output : java.lang.ThreadGroup[name=main,maxpri=10]
    }
}
 
/*7) A thread is a permanent member of a thread group to which it joins during creation. You can’t move a thread to a new group after 
 * creating it.*/

/*****************************************************************************************/
/* How To Stop A Thread In Java? */
class MyThread_1 extends Thread{
    //Initially setting the flag as true
    private volatile boolean flag = true;
    //This method will set flag as false
    public void stopRunning(){
        flag = false;
    }
     
    @Override
    public void run(){
        //Keep the task in while loop
        //This will make thread continue to run until flag becomes false
        while (flag){
            System.out.println("I am running....");
        }
        System.out.println("Stopped Running....");
    }
}
 
class MainClass_1{   
    public static void main(String[] args){
        MyThread_1 thread = new MyThread_1();
        thread.start();
        try{
            Thread.sleep(100);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //call stopRunning() method whenever you want to stop a thread
        thread.stopRunning();
    }    
}

/* How To Stop A Thread In Java Using interrupt() Method? */
class MyThread_2 extends Thread{    
    @Override
    public void run(){
        while (!Thread.interrupted()){
            System.out.println("I am running....");
        }
        System.out.println("Stopped Running.....");
    }
}
 
class MainClass_2{   
    public static void main(String[] args){
        MyThread_2 thread = new MyThread_2();  
        thread.start();
        try{
            Thread.sleep(100);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //interrupting the thread
        thread.interrupt();
    }    
}

