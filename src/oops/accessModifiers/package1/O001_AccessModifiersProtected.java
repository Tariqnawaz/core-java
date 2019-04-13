package oops.accessModifiers.package1;

public class O001_AccessModifiersProtected {
	
	 protected int i;
	 
	    protected void methodOfClassA()
	    {
	        //Protected method
	        System.out.println(i); //Protected field can be used within class
	        B b = new B();         //Protected Inner Class can be used within class.
	    }
	 
	    protected class B
	    {
	      //Protected Inner Class
	    }
	 
	class C extends O001_AccessModifiersProtected
	{
	    void methodOfClassC()
	    {
	        System.out.println(i);        //Protected field can be inherited to any sub class 
	 
	        O001_AccessModifiersProtected a = new O001_AccessModifiersProtected();
	        System.out.println(a.i);     //Protected field can be used within the package
	        a.methodOfClassA();          //Protected method can be used within the package
	        O001_AccessModifiersProtected.B b = new O001_AccessModifiersProtected.B();           //Protected Inner Class can be used within the package
	    }
	}
	
	public static void main(String[] args) {

	}
}

