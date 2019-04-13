package practical.multiThreading.threadSchedular;

import java.awt.Toolkit;
import java.util.Timer;

public class Schedular_TaskScheduling_StoppingTimerThread_JournalDev {
	Timer timer;
	 Toolkit toolkit; 
	 
	 public Schedular_TaskScheduling_StoppingTimerThread_JournalDev(int sec){
		 toolkit = Toolkit.getDefaultToolkit();
		 timer = new Timer();
		 timer.schedule(new RemainderBeep(), sec*1000);
	 }
	 
	 class RemainderBeep extends Thread{
			public void run(){
				
			}
		}
	 
	public static void main(String[] args) {
		
	}
	

}
