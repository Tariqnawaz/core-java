package oops.accessModifiers.package2;

import oops.accessModifiers.package1.O001_AccessModifiersProtected;

public class O001_AccessModifiersProtected1 extends O001_AccessModifiersProtected{
	void methodOfClassD()
    {
        System.out.println(i);        //Protected field can be inherited to any sub class 
 
        O001_AccessModifiersProtected a = new O001_AccessModifiersProtected();
        //System.out.println(a.i);     Protected field can not be used outside the package
        //a.methodOfClassA();          Protected method can not be used outside the package
        //A.B b = new A.B();           Protected inner class can not be used outside the package
    }
	
	public static void main(String[] args) {

	}

}


