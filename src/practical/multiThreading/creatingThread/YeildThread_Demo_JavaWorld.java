package practical.multiThreading.creatingThread;

public class YeildThread_Demo_JavaWorld extends Thread{
	static boolean finished = false;
	static int sum = 0;
	
	public void run(){
		while(!finished){
			System.out.println("sum"+sum);
		}
	}
	public static void main(String[] args) {
		new YeildThread_Demo_JavaWorld();
		for(int i = 0 ; i<10000;i++){
			sum++;
			if(args.length == 0){
				Thread.yield();
			}
		}
		finished = true;
	}

}
