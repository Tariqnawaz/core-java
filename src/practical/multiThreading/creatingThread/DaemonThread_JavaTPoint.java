package practical.multiThreading.creatingThread;

public class DaemonThread_JavaTPoint extends Thread{
	
	public DaemonThread_JavaTPoint(){
		setDaemon(true);
	}
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon Thread Works");
		}else{
			System.out.println("user thread works");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread_JavaTPoint t = new DaemonThread_JavaTPoint();
		DaemonThread_JavaTPoint t1 = new DaemonThread_JavaTPoint();
		DaemonThread_JavaTPoint t2= new DaemonThread_JavaTPoint();
		t.start();
		t1.start();
		t2.start();
		
	}

}
