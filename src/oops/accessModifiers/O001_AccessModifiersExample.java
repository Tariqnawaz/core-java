package oops.accessModifiers;

public class O001_AccessModifiersExample {
	public static void main(String[] args) {
		
	}

}

/*----------Private Access Modifiers-------------*/
/*---------------1st Example --------------------*/
class A{
    private int i;
    private void methodOfClassA(){
        //Private Method
        System.out.println(i);  //Private field can be used within class
        B b = new B();          //Private inner class can be used within class
    }
 
    private class B{
      //Private Inner Class
    }
}
 
class C extends A
{
    void methodOfClassC()
    {
        //System.out.println(i);  Private member can not be inherited
        A a = new A();
        //System.out.println(a.i);     Private field can not be used outside the class
        //a.methodOfClassA();          Private method can not be used outside the class
        //A.B b = new A.B();           Private inner class can not be used outside the class
    }
}

/*---------------2nd Example --------------------*/
/*private class AA
{
     //Outer class Can not be private
}*/

class AAA
{
    private AAA()
    {
        //Private Constructor
    }
    private AAA(int i)
    {
        //Private constructor
    }
}
 
/*class B extends AAA
{
    //Can't create subclass to the class
    //which has only private constructors
}*/


/*--Default or Package or No-Access Modifiers--*/
/*---------------1st Example --------------------*/
/*check example of default access modifiers in pakage folder*/

/*------------------------------------------------------------------------------------------------------------*/

/*----------------------------Protected------------------------------------*/
/*---------------1st Example --------------------*/
/*check example of Protected in pakage folder*/



