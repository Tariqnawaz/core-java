package practical.multiThreading.creatingThread;

public class CreatingThread_Im_JavaTPoint implements Runnable{

	public static void main(String[] args) {
		CreatingThread_Im_JavaTPoint t = new CreatingThread_Im_JavaTPoint();
		Thread th = new Thread(t);
		th.start();

	}

	@Override
	public void run() {
		System.out.println("Implements Runnable Interface..... running run method ");
	}

}
