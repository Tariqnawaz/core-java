package practical.multiThreading.creatingThread;

public class CreatingThread_Ex_JavaTPoint extends Thread {
	
	public void run(){
		System.out.println("running thread run method");
	}

	public static void main(String[] args) {
		CreatingThread_Ex_JavaTPoint t = new CreatingThread_Ex_JavaTPoint();
		t.start();
	}

}
