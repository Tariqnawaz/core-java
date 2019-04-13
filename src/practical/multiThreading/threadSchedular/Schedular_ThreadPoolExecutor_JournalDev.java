package practical.multiThreading.threadSchedular;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedular_ThreadPoolExecutor_JournalDev {

	public static void main(String[] args) {
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);
				
		/*3rd mplementation
		 * scheduleWithFixedDelay(Runnable command,long initialDelay,long delay,TimeUnit unit)
		 * 
		 */
		for (int i = 0; i < 3; i++) {
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Worker worker = new Worker("do heavy processing");
		    threadPool.scheduleWithFixedDelay(worker, 0, 1,
		            TimeUnit.SECONDS);
		}
		
		
		/*
		 * 2nd method implementation
		 * scheduleAtFixedRate(Runnable command,long initialDelay,long period,TimeUnit unit)
		 * 
		 * for (int i = 0; i < 3; i++) {
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Worker worker = new Worker("do heavy processing");
		    // schedule task to execute at fixed rate
		    threadPool.scheduleAtFixedRate(worker, 0, 10, TimeUnit.SECONDS);
		}
		 */
		
		/*
		 * 1st method implementation
		 for(int i=0 ; i<3;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Worker worker = new Worker("Heavy Processing");
			threadPool.schedule(worker, 0, TimeUnit.SECONDS);
		}
		*/
		
		
		
		
		
		while(!threadPool.isTerminated()){
			// wait for all task for finish
		}
		System.out.println("finished all threads");
	}

}

class Worker implements Runnable{

	private String command;
	
	public Worker(String s){
		this.command = s;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+ " Start time " + new Date());
		processCommand();
		System.out.println(Thread.currentThread().getName()+ " End time " + new Date());
	}
	
	public void processCommand(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String toString(){
		return this.command;
	}
	
}
