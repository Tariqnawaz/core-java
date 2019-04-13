package practical.understandingOopsConceptBasic.instanceOfOperator;

public class InstanceOf_Downcasting extends Animal1{

	static void method(Animal1 a) {  
	    if(a instanceof InstanceOf_Downcasting){  
	    	InstanceOf_Downcasting d=(InstanceOf_Downcasting)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	    }  
	  } 
	public static void main(String[] args) {
		Animal1 a=new InstanceOf_Downcasting();  
		InstanceOf_Downcasting.method(a);

	}

}
class Animal1{ }  
