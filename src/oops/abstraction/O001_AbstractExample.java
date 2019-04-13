package oops.abstraction;

public class O001_AbstractExample {
	/* Yes, In the computer science, Abstraction is used to separate ideas from their implementation. Abstraction in java is used to 
	   define only ideas in one class so that the idea can be implemented by its sub classes according to their requirements.*/
	
	public static void main(String[] args)
    {
        //AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
        //ConcreteClass object is auto-upcasted to AbsractClass
    }
}

/*------------1st  Example -----------------------*/
abstract class AbstractClass
{
    abstract void abstractMethod();
}
 
class ConcreteClass extends AbstractClass
{
    void abstractMethod()
    {
        System.out.println("abstract method");
    }
    /*called in main method */
}

/*------------2nd  Example -----------------------*/
/* The methods which are not implemented or which don’t have definitions must be declared with ‘abstract’ keyword and the class which contains
  it must be also declared as abstract.*/

//It gives compile time error
/*class AbstractClass1
{
 void abstractMethod();  //This method must be declared as abstract or must be defined
 abstract void abstractMethod();  //The Class must be also declared as abstract
}*/

//   *****   *****     *****   *****
//This is OK
abstract class AbstractClass1
{
 abstract void abstractMethod();
}

/*------------3rd  Example -----------------------*/
/* It is not compulsory that abstract class must have abstract methods. It may or may not have abstract methods. But the class which has at
   least one abstract method must be declared as abstract.*/
abstract class AbstractClass2
{
    void methodOne()
    {
        //Concrete Method
    }
    //No Abstract methods but class is abstract
}

/*------------4th  Example -----------------------*/
/*You can’t create objects to abstract class even though it does not contain any abstract methods.*/
abstract class AbstractClass3
{
    void methodOne()
    {
        //Concrete Method
    }
 
    void methodTwo()
    {
        //Concrete Method
    }
}
 
/*public class Abstraction3
{
    public static void main(String[] args)
    {
        AbstractClass3 a = new AbstractClass3();  //Compile time error
        //You can't create objects to AbstractClass
        //even though it does not contain any abstract methods.
    }
}*/

/*------------5th  Example -----------------------*/
/*Abstract Class can be a combination of concrete and abstract methods.*/
abstract class AbstractClass4
{
    void methodOne()
    {
        //Concrete Method
    }
 
    void methodTwo()
    {
        //Concrete Method
    }
 
    abstract void methodThree();  //Abstract Method
 
    abstract void methodFour();  //Abstract Method
}
/*------------6th  Example -----------------------*/	
/*Any class extending an abstract class must implement all abstract methods. If it does not implement, it must be declared as abstract.*/
abstract class AbstractClass5
{
    abstract void abstractMethodOne();  //Abstract Method
 
    abstract void abstractMethodTwo();  //Abstract Method
}
 
class ConcreteClass5 extends AbstractClass5
{
    void abstractMethodOne()
    {
        //abstractMethodOne() is implemented
    }
 
    //This class must implement second abstract method also,
    //otherwise, this class has to be declared as abstract
 
    void abstractMethodTwo()
    {
        //abstractMethodTwo() is also implemented.
        //No need to declare this class as abstract
    }
}

/*------------7th  Example -----------------------*/
/*Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors, then compiler will keep default constructor.*/
abstract class AbstractClass6
{
    AbstractClass6()
    {
        //First Constructor
    }
 
    AbstractClass6(int i)
    {
        //Second Constructor
    }
 
    abstract void abstractMethodOne();  //Abstract Method
}

/*------------8th  Example -----------------------*/
/*Abstract methods can not be private. Because, abstract methods must be implemented somehow in the sub classes. If you declare them as private, then
  you can’t use them outside the class.*/
abstract class AbstractClass7
{
    /*private abstract void abstractMethodOne();
    //Compile time error, abstract method can not be private.*/
}

/*------------9th  Example -----------------------*/
/*Constructors and fields can not be declared as abstract.*/
abstract class AbstractClass8
{
    /*abstract int i;
    //Compile time error, field can not be abstract
 
    abstract AbstractClass8()
    {
        //Compile time error, constructor can not be abstract
    }*/
}

/*------------10th  Example -----------------------*/
/*Abstract methods can not be static.*/
abstract class AbstractClass9
{
    /*static abstract void abstractMethod();
    //Compile time error, abstract methods can not be static
*/}









