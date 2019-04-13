package practical.multiThreadingSynchronization;

public class Synchronization_ReentrantExample {

	public static void main(String args[]){  
		final Synchronization_ReentrantExample re=new Synchronization_ReentrantExample();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		re.m();//calling method of Reentrant class  
		}  
		};  
		t1.start();  
	}

}
class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
} 