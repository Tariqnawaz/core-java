package practical.understandingOopsConceptBasic.polymorphism;

public class Dynamic_PolymorphismExample extends Animal1{
	void eat(){System.out.println("dog is eating...");}
	public static void main(String[] args) {
		 Animal1 a=new Dynamic_PolymorphismExample();  
		  a.eat(); 

	}

}
class Animal1{  
	 void eat(){System.out.println("animal is eating...");}  
	}

/*
Connecting a method call to the method body is known as binding.

There are two types of binding

static binding (also known as early binding).
dynamic binding (also known as late binding).
*/