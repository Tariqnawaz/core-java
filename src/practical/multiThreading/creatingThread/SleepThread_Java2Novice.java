package practical.multiThreading.creatingThread;

import java.util.ArrayList;
import java.util.List;

public class SleepThread_Java2Novice {

	public static void main(String[] args) {
	List<SleepThread> list = new ArrayList<SleepThread>();
	for(int i=0 ; i<4;i++){
		SleepThread sleep = new SleepThread(i+10);
		list.add(sleep);
		sleep.start();
	}
	for(SleepThread sleepThread : list){
		try {
			sleepThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
class SleepThread extends Thread{
	private int suspendCount;
	public SleepThread(int suspendCount){
		this.suspendCount = suspendCount;
	}
	public void run(){
		for(int i=0;i<=50;i++){
			if(i%suspendCount == 0){
				System.out.println("Thread Name is: " +getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

/*
Java Thread Sleep
It makes current executing thread to sleep specified number of milli seconds. Below example shows sample code for thread sleep.
*/