package practical.multiThreadingSynchronization;

public class Synchronization_InterruptingAThreadBehaveNormally extends Thread {

	public void run(){  
		for(int i=1;i<=5;i++)  
		System.out.println(i);  
		}  
		  
		public static void main(String args[]){  
			Synchronization_InterruptingAThreadBehaveNormally t1=new Synchronization_InterruptingAThreadBehaveNormally();  
		t1.start();  
		  
		t1.interrupt();  
		  
		}  
}
