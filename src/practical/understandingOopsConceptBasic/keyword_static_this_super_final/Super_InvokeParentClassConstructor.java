package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Super_InvokeParentClassConstructor extends Vehicle1{
	Super_InvokeParentClassConstructor(){  
		   super();//will invoke parent class constructor  
		   System.out.println("Bike is created");  
		  }  
	public static void main(String[] args) {
		Super_InvokeParentClassConstructor s = new Super_InvokeParentClassConstructor();

	}

}
class Vehicle1{  
	  Vehicle1(){System.out.println("Vehicle is created");}  
	} 