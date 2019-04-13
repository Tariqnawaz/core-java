package practical.multiThreading.creatingThread;

public class DaemonThread_Journaldev extends Thread{

	public static void main(String[] args) {
		DaemonThread_Journaldev t = new DaemonThread_Journaldev();
		t.setDaemon(true);
		t.start();
		//continue program
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Finishing program");

	}
	
	public void run(){
		while(true){
			processSomething();
		}
	}
	
	private void processSomething(){
		 try {
	            System.out.println("Processing daemon thread");
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
