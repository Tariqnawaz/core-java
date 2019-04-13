package practical.multiThreading.creatingThread;

public class GuessANumber_Ex_TutorialsPoint {

	public static void main(String[] args) {
		GuessANumber t = new GuessANumber(27);
		GuessANumber t1 = new GuessANumber(75);
		t.start();
		t1.start();
	}

}
class GuessANumber extends Thread{
	
	public int guessNumber;
	
	public GuessANumber(int number){
		this.guessNumber = number;
	}
	
	public void run(){
		int guess = 0;
		int counter = 0;
		do{
			guess = (int) (Math.random() * 100 + 1);
			System.out.println(this.getName() +"Guesses " + guess);
			counter++;
		}while(guess != guessNumber);
		System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses.**");
	}
}
