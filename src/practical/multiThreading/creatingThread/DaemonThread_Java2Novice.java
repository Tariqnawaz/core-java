package practical.multiThreading.creatingThread;

public class DaemonThread_Java2Novice extends Thread {
	public DaemonThread_Java2Novice(){
		setDaemon(true);
	}
	public void run(){
		System.out.println("daemon thread " + isDaemon());
	}

	public static void main(String[] args) {
		DaemonThread_Java2Novice th = new DaemonThread_Java2Novice();
		th.start();
	
	}

}
