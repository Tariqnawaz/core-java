package practical.innerClass;

public class InnerClass_AnonymousInnerClass {

	 public static void main(String args[]){  
		  Person p=new Person(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  
}
abstract class Person{  
	  abstract void eat();  
	}

/*
Person p=new Person(){  
void eat(){System.out.println("nice fruits");}  
};  

*/

/*
 Internal class generated by the compiler
 
import java.io.PrintStream;  
static class TestAnonymousInner$1 extends Person  
{  
   TestAnonymousInner$1(){}  
   void eat()  
    {  
        System.out.println("nice fruits");  
    }  
}  
*/