package oops.typeCasting;

public class O003_TypeCastingAutoUp {
	/* Auto-Up Casting is used to change the type of object from sub class type to super class type. i.e an object of sub class type
	  is automatically converted to an object of super class type*/
	public static void main(String[] args)
    {
        D d = new D();
        C c = d;       // D type object is Auto-Up Casted to C type
        B b = d;      // D type object is Auto-Up Casted to B type
        C c1 = new C();
        A a = c1;    // C type object is Auto-Up Casted to A type
        A a1 = new B(); // B type object is Auto-Up Casted to A type
    }
}

class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}
 
