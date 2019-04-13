package practical.understandingOopsConceptBasic.accessModifiers;

public class AcessModifiers_Private {

	public static void main(String[] args) {
	
	}

}
class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  

/*

In this example, we have created two classes A and Simple. A class contains private data member and private method. We are 
accessing these private members from outside the class, so there is compile time error.

If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:


*/