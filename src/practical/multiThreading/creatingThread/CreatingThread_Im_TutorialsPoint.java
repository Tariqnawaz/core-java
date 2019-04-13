package practical.multiThreading.creatingThread;

public class CreatingThread_Im_TutorialsPoint {

	public static void main(String[] args) {
		Tutorails R1 = new Tutorails( "Thread-1");
	      R1.start();
	      
	      Tutorails R2 = new Tutorails( "Thread-2");
	      R2.start();
	}

}

class Tutorails implements Runnable{
	
	String threadName;
	Thread runner;
	
	public Tutorails(String name){
		this.threadName = name;
	}
	@Override
	public void run() {
		System.out.println("inside run");
		for(int i=0;i<4;i++){
			System.out.println("Thread Name is: " +i+ " " +threadName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Thread: "+threadName);
	}
	
	public void start(){
		if(runner == null){
			runner = new Thread(this , threadName);
			runner.start();
		}
	}
	
}