package oops.accessModifiers.package2;

public class O001_AccessModifiersDefault {
	public static void main(String[] args) {

	}

}

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