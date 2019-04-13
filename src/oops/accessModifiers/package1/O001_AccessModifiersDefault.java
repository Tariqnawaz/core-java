package oops.accessModifiers.package1;

public class O001_AccessModifiersDefault {
	public static void main(String[] args) {

	}
}

/*---------- 1st Example--------------*/
class A
{
    int i;
 
    A()
    {
        //Constructor with default modifier
    }
 
    void methodOfClassA()
    {
        //Method with default access modifier
        System.out.println(i);
        B b = new B();
    }
 
    class B
    {
      //Inner Class with default access modifier
    }
}

/*---------- 2nd Example--------------*/
class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Default field can be inherited within package 
 
        A a = new A();
        System.out.println(a.i);     //Default field can be used within the package
        a.methodOfClassA();          //Default method can be used within the package
        A.B b = new A.B();           //Default inner class can be used within the package
    }
}

/*--------- 3rd Example --------------*/

//import pack1.A;      Class A with default access modifier not visible outside the package

/*class D extends A      Default Class can not have sub class outside the package
{
  void methodOfClassD()
  {
      System.out.println(i);        Default field can not be inherited outside package 

      A a = new A();           Can't use constructor with default access modifier outside the package
      System.out.println(a.i);     Default field can not be used outside the package
      a.methodOfClassA();          Default method can not be used outside the package
      A.B b = new A.B();           Default inner class can not be used outside the package
  }
}*/

