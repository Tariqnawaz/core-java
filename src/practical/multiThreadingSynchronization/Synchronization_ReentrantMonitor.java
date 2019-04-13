package practical.multiThreadingSynchronization;

public class Synchronization_ReentrantMonitor {

	public synchronized void m() {  
	    n();  
	    System.out.println("this is m() method");  
	    }  
	    public synchronized void n() {  
	    System.out.println("this is n() method");  
	    }  
}
