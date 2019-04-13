package oops.polymorphism;

public class O004_DynamicPolymorphism {

	static void util(SuperClass4 superclass)
    {
        superclass.methodOfSuperClass();
        //For each execution of this method, different objects will be passed to it.
        //which Object will be used is determined during run time only.
        //This shows dynamic polymorphism.
    }
 
    public static void main(String[] args)
    {
        SuperClass4 superclass1 = new SuperClass4();
        SubClass4 subclass = new SubClass4();
        SuperClass4 superclass2 = new SubClass4();
 
        util(superclass1);  //SuperClass object is passes to util()
        util(subclass);     //SubClass object is passed to util()
        util(superclass2); //SubClass object is passed to util()
    }

}

class SuperClass4
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
class SubClass4 extends SuperClass4
{
    //Super Class Method Overrided
    void methodOfSuperClass()
    {
        System.out.println("From Sub Class");
    }
}
