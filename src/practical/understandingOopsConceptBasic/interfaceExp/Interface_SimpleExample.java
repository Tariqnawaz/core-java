package practical.understandingOopsConceptBasic.interfaceExp;

public class Interface_SimpleExample implements printable5{

	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
		Interface_SimpleExample obj = new Interface_SimpleExample();  
	obj.print();  
	}

}
interface printable5{  
void print();  
} 

/*
An interface in java is a blueprint of a class. It has static constants and abstract methods only.

The interface in java is a mechanism to achieve fully abstraction. There can be only abstract methods in the java interface
 not method body. It is used to achieve fully abstraction and multiple inheritance in Java.

Java Interface also represents IS-A relationship.

It cannot be instantiated just like abstract class.

Why use Java interface?

There are mainly three reasons to use interface. They are given below.

It is used to achieve fully abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.
*/