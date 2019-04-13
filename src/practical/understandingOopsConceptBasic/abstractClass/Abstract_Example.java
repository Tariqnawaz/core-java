package practical.understandingOopsConceptBasic.abstractClass;

public class Abstract_Example extends Bike{

	void run(){System.out.println("running safely..");}
	public static void main(String[] args) {
		Bike obj = new Abstract_Example();  
		 obj.run();
	}

}
abstract class Bike{  
	  abstract void run();  
	}
