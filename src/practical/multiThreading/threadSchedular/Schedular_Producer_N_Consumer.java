package practical.multiThreading.threadSchedular;

public class Schedular_Producer_N_Consumer {

	public static void main(String[] args) {
		 Shared s = new Shared ();
	      new Producer (s).start ();
	      new Consumer (s).start ();
	}

}

class Shared{
	private char c = '\u0000';

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
}
class Producer extends Thread{
	private Shared shared;
	
	public Producer(Shared s) {
		this.shared = s;
	}
	
	public void run(){
		for(char ch = 'A' ;ch<='Z';ch++){
			try {
				Thread.sleep((int) (Math.random()*400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			shared.setC(ch);
			System.out.println(ch + "producer by producer  ");
		}
	}
}
class Consumer extends Thread{
	private Shared s;
	Consumer (Shared s)
	   {
	      this.s = s;
	   }
	public void run(){
		char ch = 0;
		do{
			try {
				Thread.sleep((int) (Math.random()*4000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ch = s.getC();
	         System.out.println (ch + " consumed by consumer.");
		}while(ch!='Z');
	}
}


