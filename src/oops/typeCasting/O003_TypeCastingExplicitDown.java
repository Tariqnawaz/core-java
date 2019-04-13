package oops.typeCasting;

public class O003_TypeCastingExplicitDown {
	/* Explicit down Casting is used to change the type of object from super class type to sub class type. i.e you have to explicitly convert an 
	   object of super class type to an object of sub class type*/
	public static void main(String[] args)
    {
        A a = new A();
        B b = (B) a;   //A type is explicitly downcasted to B type
        C c = (C) a;   //A type is explicitly downcasted to C type
        D d = (D) a;   //A type is explicitly downcasted to D type
        B b1 = new B();
        D d1 = (D) b1;  //B type is explicitly downcasted to D type
        d1 = (D) new C();  //C type is explicitly downcasted to D type
    }

}



class AA
{
    int i = 10;
}
 
class BB extends AA
{
    int j = 20;
}
 
class CCC extends BB
{
    int k = 30;
}
 
class DD extends CCC
{
    int m = 40;
}
