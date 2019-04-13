package practical.multiThreadingSynchronization;

public class Synchronization_InterruptingAThread extends Thread{  
	public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException e){  
		throw new RuntimeException("Thread interrupted..."+e);  
		}
		}

	public static void main(String args[]){  
		Synchronization_InterruptingAThread t1=new Synchronization_InterruptingAThread();  
		t1.start();  
		try{  
		t1.interrupt();  
		}catch(Exception e){System.out.println("Exception handled "+e);}  
		  
		}  

}

  
