package oops.accessModifiers.package2;

import oops.accessModifiers.package1.O001_AccessModifiersPublic;

public class O001_AccessModifiersPublic1 extends O001_AccessModifiersPublic{
	void methodOfClassD()
    {
        System.out.println(i);        //public field can be inherited to any sub class 
 
        O001_AccessModifiersPublic1 a = new O001_AccessModifiersPublic1();
        System.out.println(a.i);     //Public field can be used anywhere
        a.methodOfClassA();          //Public method can be used anywhere
        O001_AccessModifiersPublic1.B b = new O001_AccessModifiersPublic.B();           //Public inner class can be used anywhere
    }
	public static void main(String[] args) {
		
	}

}
