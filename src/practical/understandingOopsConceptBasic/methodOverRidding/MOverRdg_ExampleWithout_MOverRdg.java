package practical.understandingOopsConceptBasic.methodOverRidding;

public class MOverRdg_ExampleWithout_MOverRdg extends Vehicle {

	public static void main(String[] args) {
		MOverRdg_ExampleWithout_MOverRdg m = new MOverRdg_ExampleWithout_MOverRdg();
		m.run();
	}

}
class Vehicle{  
	  void run(){System.out.println("Vehicle is running");}  
	}