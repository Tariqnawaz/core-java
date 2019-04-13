package threads;

public class O004_ThreadGroup {
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
	}
}

/*--------------1st Example ---------------*/
/*getParent() Method :
It returns the parent of the thread group in the form ClassName[name=name of the parent, maxpri=Maximum priority].
*/
class ThreadGroupsInJava311{
	public static void main(String[] args){
		//Creating Parent Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group ");
		//Creating Child Thread Group
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Thread Group");
		//Printing parent of Child Thread Group
		System.out.println(childGroup.getParent());   //Output : java.lang.ThreadGroup[name=Parent Thread Group ,maxpri=10]
	}
}

/*--------------1st Example ---------------*/
/*2) setDaemon() And isDaemon() Methods :
setDaemon() method is used to set the daemon property of a thread group. isDaemon() is used to check whether a thread group is daemon or not.
*/
class ThreadGroupsInJava312{
	public static void main(String[] args){
		//Creating Thread Group 
		ThreadGroup threadGroup = new ThreadGroup("Thread Group ");
		//Setting the daemon property of thread group
		threadGroup.setDaemon(true);
		//Checking the daemon property of thread group
		System.out.println(threadGroup.isDaemon());   //Output : true
	}
}

/*--------------3rd Example ---------------*/
/*3) setMaxPriority() And getMaxPriority() Methods :
setMaxPriority() is used to set the maximum priority of a thread group. getMaxPriority() method is used to retrieve the maximum priority of 
a thread group.
*/
class ThreadGroupsInJava313{
	public static void main(String[] args){
		//Creating Thread Group 
		ThreadGroup threadGroup = new ThreadGroup("Parent Thread Group ");
		//Setting the maximum priority of thread group
		threadGroup.setMaxPriority(8);
		//getting the maximum priority of thread group
		System.out.println(threadGroup.getMaxPriority());   //Output : 8
	}
}

/*--------------4th Example ---------------*/
/*4) activeCount() and activeGroupCount() Methods
activeCount() returns the number of active threads in a specified group and it’s subgroups. activeGroupCount() returns the numbers of active 
thread groups in a specified group and it’s subgroups.
*/
class ThreadGroupsInJava314{
	public static void main(String[] args){
		//Creating parent Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group ");
		Thread t1 = new Thread(parentGroup, "Thread 1"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(parentGroup, "Thread 2"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t2.start();
		//Creating Child Thread Group

		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");
		Thread t3 = new Thread(childGroup, "Thread 3"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t3.start();
		//Checking Active thread count
		System.out.println(parentGroup.activeCount());     //Output : 3
		//Checking Active thread group count
		System.out.println(parentGroup.activeGroupCount());   //Output : 1
	}
}

/*5) interrupt() Method :
This method is used to interrupt all threads in a group.
*/
class ThreadsInJava314{
	public static void main(String[] args){
		//Creating Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Group ");
		Thread t1 = new Thread(parentGroup, "Thread 1"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					System.out.println("Thread interrupted");
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(parentGroup, "Thread 2"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					System.out.println("Thread interrupted");
				}
			}
		};
		t2.start();
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");
		Thread t3 = new Thread(childGroup, "Thread 3"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					System.out.println("Thread interrupted");
				}
			}
		};
		t3.start();
		//Interrupting whole group
		parentGroup.interrupt();
	}
}

/*6) destroy() Method :
This method is used to destroy the whole thread group and it’s subgroups. Before calling this method, thread group must be empty i.e all 
threads in a group must be exited. Otherwise this method will throw IllegalThreadStateException.
*/
class ThreadGroupsInJava315{
	public static void main(String[] args){
		//Creating Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Group ");
		Thread t1 = new Thread(parentGroup, "Thread 1");
		t1.start();
		Thread t2 = new Thread(parentGroup, "Thread 2");
		t2.start();
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");
		Thread t3 = new Thread(childGroup, "Thread 3");
		t3.start();
		try{
			Thread.sleep(2000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		//Destroying the whole group
		parentGroup.destroy();
	}
}

/*7)enumerate() Method :
There exist four versions of enumerate() method in ThreadGroup class. They are,
public int enumerate(Thread[] list) —> It copies all active threads of a group into specified array of threads.
public int enumerate(Thread[] list, boolean recurse) —> It copies all active threads of a group into specified array of threads. If recurse is true, subgroups are also enumerated.
public int enumerate(ThreadGroup[] list) —> It copies all active subgroups of a thread group into specified array of ThreadGroup.
public int enumerate(ThreadGroup[] list, boolean recurse) —> It copies all active subgroups of a thread group into specified array of ThreadGroup. If recurse is true, subgroups of subgroups are also enumerated.*/

class ThreadsInJava318{
	public static void main(String[] args){
		//Creating Thread Group 
		ThreadGroup parentGroup = new ThreadGroup("Parent Group ");
		Thread t1 = new Thread(parentGroup, "Thread 1"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread(parentGroup, "Thread 2"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t2.start();
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");
		Thread t3 = new Thread(childGroup, "Thread 3"){
			public void run(){
				try{
					Thread.sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t3.start();
		//Enumerating all active threads
		Thread[] threads = new Thread[parentGroup.activeCount()];
		int No_Of_Active_Threads = parentGroup.enumerate(threads);
		System.out.println(No_Of_Active_Threads);
		for (Thread thread : threads){
			System.out.println(thread.getName());
		}
	}
}