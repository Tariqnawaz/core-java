package oops.inheritance.package1;

public class B extends A{
	
    void methodOfClassB()
    {
        //System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
    }

}
