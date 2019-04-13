package practical.understandingOopsConceptBasic.instanceOfOperator;

public class InstanceOf_WithOutDowncasting extends Animal2{
	 static void method(Animal2 a) {  
		 InstanceOf_WithOutDowncasting d=(InstanceOf_WithOutDowncasting)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	  }  
	public static void main(String[] args) {
		Animal2 a=new InstanceOf_WithOutDowncasting();  
		InstanceOf_WithOutDowncasting.method(a); 

	}

}
class Animal2{ } 
