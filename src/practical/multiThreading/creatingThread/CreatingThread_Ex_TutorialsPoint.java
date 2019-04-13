package practical.multiThreading.creatingThread;

public class CreatingThread_Ex_TutorialsPoint {
	
	
	public static void main(String[] args) {
		TutorialsExtends T1 = new TutorialsExtends( "Thread-1");
	    T1.start();
	    
	    TutorialsExtends T2 = new TutorialsExtends( "Thread-2");
	    T2.start();
		

	}

}
class TutorialsExtends extends Thread{
	String threadName;
	Thread runner;
	public TutorialsExtends(String name){
		this.threadName = name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("threadname is: " +i+" " +threadName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Existing Thread: "+threadName);
	}
	
	public void start(){
		if(runner == null){
			runner = new Thread(this , threadName);
			runner.start();
		}
	}
}
