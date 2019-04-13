package practical.understandingOopsConceptBasic.polymorphism;

public class Runtime_PolymorphismExample extends Bike{
	
	void run(){System.out.println("running safely with 60km");} 
	public static void main(String[] args) {
		 Bike b = new Runtime_PolymorphismExample();//upcasting  
		    b.run();  

	}
}
class Bike{  
	  void run(){System.out.println("running");}  
}  
