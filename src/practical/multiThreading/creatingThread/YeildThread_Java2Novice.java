package practical.multiThreading.creatingThread;

import java.util.ArrayList;
import java.util.List;

public class YeildThread_Java2Novice {

	public static void main(String[] args) {
		List<YeildThread> list = new ArrayList<YeildThread>();
		for(int i=0;i<3;i++){
			YeildThread y = new YeildThread(i+10);
			list.add(y);
			y.start();
		}
		for(YeildThread ye:list){
			try {
				ye.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
class YeildThread extends Thread{
	private int stopCount;
	public YeildThread(int count){
		this.stopCount = count;
	}
	public void run(){
		for(int i=0;i<50;i++){
			if(i%stopCount == 0){
				System.out.println("Stoping Thread Name: " +getName());
				yield();
			}
		}
	}
}
