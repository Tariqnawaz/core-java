package practical.understandingOopsConceptBasic.inheritance;

public class Inheritance_MultipleInheritanceNotSupported extends A {

	public static void main(String[] args) {
		Inheritance_MultipleInheritanceNotSupported obj=new Inheritance_MultipleInheritanceNotSupported();  
		   obj.msg();//Now which msg() method would be invoked? 
	}

}
class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  

// if i extands class b then it will give compile time error