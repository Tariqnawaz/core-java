package practical.multiThreading.threadSchedular;

import java.util.Timer;
import java.util.TimerTask;

public class Schedular_TaskScheduling {
	Timer timer;
	
	Schedular_TaskScheduling(int sec){
		timer = new Timer();
		timer.schedule(new RemainderTask(), sec*1000);
	}
	class RemainderTask extends TimerTask{
		@Override
		public void run() {
		System.out.println("Time's Up");
		timer.cancel();
		}
	}
	public static void main(String[] args) {
		new Schedular_TaskScheduling(5);
		System.out.println("Timer Scheduled");

	}

}
