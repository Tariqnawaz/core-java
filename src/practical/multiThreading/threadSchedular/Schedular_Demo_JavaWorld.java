package practical.multiThreading.threadSchedular;

public class Schedular_Demo_JavaWorld {

	public static void main(String[] args) {
		new Pi("Thread A ").start();
		new Pi("Thread B ").start();

	}

}

class Pi extends Thread{
	
	public Pi(String s){
		super(s);
	}
	
	double calculatePi(){
		
		boolean negative = true;
		double pi = 0.0;
		
		for(int i = 3 ; i < 100000 ; i+=2){
			
			if(negative){
				pi -= (1.0/i);
			}else{
				pi += (1.0/i);
				negative = !negative;
			}
		}
		pi +=1.0;
		pi *=4.0;
		
		return pi ;
	}
	
	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(getName() + " " + calculatePi());
		}
	}
}
