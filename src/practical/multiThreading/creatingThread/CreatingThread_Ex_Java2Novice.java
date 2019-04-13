package practical.multiThreading.creatingThread;

public class CreatingThread_Ex_Java2Novice {

	public static void main(String[] args) {
		CreatingThread1 th = new CreatingThread1();
		th.start();
		while(CreatingThread1.myCount <= 10){
			System.out.println("Main method" +(++CreatingThread1.myCount));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main method ends" );
	}

}
class CreatingThread1 extends Thread{
	public static int myCount = 0;
	public void run(){
		while(CreatingThread1.myCount <= 10){
			System.out.println("Run method" +(++CreatingThread1.myCount));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
