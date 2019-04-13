package oops.polymorphism;

public class O003_StaticPolymorphism {

	public static void main(String[] args)
    {
        A a = new A();  //A-Class variable refers to A-Class object
        a = new B();    //A-Class variable refers to B-Class object
        a = new C();    //A-Class variable refers to C-Class object
    }

}

class A
{
     //Some Statements
}
class B extends A
{
     //Some Statements
}
class C extends B
{
    //Some Statements
}