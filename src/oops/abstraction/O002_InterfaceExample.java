package oops.abstraction;

public class O002_InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*----------------1st Example -------------------------------*/
/*Interfaces are declared with keyword ‘interface‘ and interfaces are implemented by the class using ‘implements‘ keyword.*/

interface InterfaceClass1{
//Some Abstract methods
}

class AnyClass1 implements InterfaceClass1
{
//Use 'implements' while implementing Interfaces
//Don't use 'extends'
}

/*----------------2nd Example -------------------------------*/
/*Interfaces should contain only abstract methods. Interfaces should not contain a single concrete method.*/


interface InterfaceClass2{
abstract void abstractMethodOne();  //abstract method

abstract void abstractMethodTwo();  //abstract method

/*void concreteMethod(){
    //Compile Time Error.
    //Concrete Methods are not allowed in interface
}*/
}

/*----------------3rd Example -------------------------------*/
/*Interface can have two types of members.  1) Fields     2) Abstract Methods.*/

interface InterfaceClass3{
int i = 0;      //Field

abstract void abstractMethodOne();  //abstract method

abstract void abstractMethodTwo();  //abstract method
}

/*----------------4th Example -------------------------------*/
/*By default, Every field of an interface is public, static and final (we will discuss about final keyword Later). 
  You can’t use any other modifiers other than these three for a field of an interface.*/
interface InterfaceClass4{
int i = 0;
//By default, field is public, static and final
//Following statements give compile time errors

/*private double d = 10;
protected long l = 15;*/

//You can't use any other modifiers other than public, static and final
}

/*----------------5th Example -------------------------------*/
/*You can’t change the value of a field once they are initialized. Because they are static and final. Therefore, sometimes fields are 
 called as Constants. (We will discuss this feature in detail while covering ‘final’ keyword)*/
interface InterfaceClass5{
int i = 0;
}

class AnyClass2 implements InterfaceClass5{
void methodOne(){
    //Following statement gives compile time error.

    //InterfaceClass5.i = 10;

    //final field can not be re-assigned
}
}

/*----------------6th Example -------------------------------*/
/*By default, All methods of an interface are public and abstract.*/

interface InterfaceClass6{
void abstractMethodOne();  //Abstract method

void abstractMethodTwo();  //Abstract Method

    //No need to use abstract keyword,
    //by default methods are public and abstract
}

/*----------------7th Example -------------------------------*/
/*Like classes, for every interface .class file will be generated after compilation.
While implementing any interface methods inside a class, that method must be declared as public. Because,
according to method overriding rule, you can’t reduce visibility of super class method. By default, every member of an interface
is public and while implementing you should not reduce this visibility.*/

/*interface InterfaceClass7{
void methodOne();
}

class AnyClass3 implements InterfaceClass7
{
void methodOne()
{
    //It gives compile time error.
    //Interface methods must be implemented as public
}
}*/

/*----------------8th Example -------------------------------*/
/*By default, Interface itself is not public but by default interface itself is abstract like below,*/


abstract interface InterfaceClass8{
//By default interface is abstract
//No need to use abstract keyword
}

/*SIB – Static Initialization Block and IIB – Instance Initialization Block are not allowed in interfaces.*/

interface InterfaceClassOne9{
/*static
{
    //compile time error
    //SIB's are not allowed in interfaces
}

{
    //Here also compile time error.
    //IIB's are not allowed in interfaces
}

void methodOne();  //abstract method
*/}

/*----------------9th Example -------------------------------*/
/*As we all know that, any class in java can not extend more than one class. But class can implement more than one interfaces. 
 This is how multiple inheritance is implemented in java.*/


interface InterfaceClassOne10
{
void methodOne();
}

interface InterfaceClassTwo10
{
void methodTwo();
}

class AnyClass10 implements InterfaceClassOne10, InterfaceClassTwo10
{
public void methodOne()
{
    //method of first interface is implemented
}

//method of Second interface must also be implemented.
//Otherwise, you have to declare this class as abstract.

public void methodTwo()
{
    //Now, method of Second interface is also implemented.
    //No need to declare this class as abstract
}
}