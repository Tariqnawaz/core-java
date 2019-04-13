package practical.multiThreading.creatingThread;

public class DaemonThread_User_Vs_Daemon_Javacodegeeks {

	public static void main(String[] args) {
		// Create a new daemon thread and start it
		
				/*DeamonThread1 daemonThread = new DeamonThread1();
				daemonThread.setDaemon(true);
				daemonThread.start();

				// Create a new user thread and start it
				Thread userThread = new Thread(new UserThread1());
				userThread.start();*/
				
				
	/*
	 Now let’s see what will happen when mark the first daemon thread as non daemon user thread using setDaemon(false) and running
	 the example again using the new UserThreadTest class. We will notice that the user thread has died and the JVM still waits for
	 daemon thread to finish its execution, it doesn’t terminates the running daemon thread.
	 */
				
		DeamonThread1 daemonThread = new DeamonThread1();
		daemonThread.setDaemon(false);
		daemonThread.start();

		// Create a new user thread and start it
		Thread userThread = new Thread(new UserThread1());
		userThread.start();

	}

}

class DeamonThread1 extends Thread{
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Daemon thread is running");
				Thread.sleep(1000);
			}

		} catch (InterruptedException ie) {
			ie.printStackTrace();

		} finally {
			System.out.println("Daemon Thread exiting"); // never called
		}
	}
}

class UserThread1 extends Thread{
	
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("User thread is running");
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();

		} finally {
			System.out.println("User Thread exiting");
		}
	}
}
