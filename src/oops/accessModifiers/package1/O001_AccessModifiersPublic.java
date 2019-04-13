package oops.accessModifiers.package1;

public class O001_AccessModifiersPublic {
	public int i;
	 
    public void methodOfClassA()
    {
        //public method
        System.out.println(i); //public field can be used anywhere
        B b = new B();         //public Inner Class can be used anywhere.
    }
 
    public class B
    {
      //public Inner Class
    }
	public static void main(String[] args) {

	}

}

class CC extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //public field can be inherited to any sub class 
 
        A a = new A();
        System.out.println(a.i);     //public field can be used anywhere
        a.methodOfClassA();          //public method can be used anywhere
        A.B b = new A.B();           //public Inner Class can be used anywhere.
    }
}
