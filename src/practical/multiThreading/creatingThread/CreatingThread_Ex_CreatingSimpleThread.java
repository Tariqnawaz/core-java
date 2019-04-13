package practical.multiThreading.creatingThread;

public class CreatingThread_Ex_CreatingSimpleThread {

	public static void main(String[] args) {
		new SimpleThread("Google").start();
		new SimpleThread("Yahoo").start();
		new SimpleThread("PayPal").start();
		new SimpleThread("Windows").start();
	}

}

class SimpleThread extends Thread{
	public SimpleThread(String name){
		super(name);
	}
 public void run(){
	 for(int i = 0 ; i <=5 ;i++){
		 System.out.println("Loop "+ i + " Name is " + getName());
		 try {
			sleep((int) (Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 System.out.println("Test Finished for: " + getName());
 }
}
