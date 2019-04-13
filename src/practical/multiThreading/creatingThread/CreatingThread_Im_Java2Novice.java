package practical.multiThreading.creatingThread;

class CreatingThread implements Runnable{
	public static int count = 0;
	
	@Override
	public void run() {
		while(CreatingThread.count <= 10){
			System.out.println("Run method starts" +count +" " +(++CreatingThread.count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
public class CreatingThread_Im_Java2Novice {  
	public static void main(String arg[]){
		System.out.println("Starting Main Thread...");
		CreatingThread th = new CreatingThread();
		Thread t = new Thread(th);
		t.start();
		while(CreatingThread.count <= 10){
			System.out.println("Main method starts" +(++CreatingThread.count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("End of Main Thread...");
	}
}
