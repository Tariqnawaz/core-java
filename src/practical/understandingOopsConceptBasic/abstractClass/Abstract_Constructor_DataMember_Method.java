package practical.understandingOopsConceptBasic.abstractClass;

public class Abstract_Constructor_DataMember_Method {

	public static void main(String[] args) {
		Bike1 obj = new Honda();  
		  obj.run();  
		  obj.changeGear();  

	}

}
//example of abstract class that have method body  
abstract class Bike1{  
 Bike1(){System.out.println("bike is created");}  
 abstract void run();  
 void changeGear(){System.out.println("gear changed");}  
}  

class Honda extends Bike1{  
void run(){System.out.println("running safely..");}  
}  
