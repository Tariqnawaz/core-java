package oops.polymorphism;

public class O002_MethodOverriding {
	public static void main(String[] args) {
		SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Sub Class
	}

}
/*--------------1st Example -----------------*/
class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}

/*--------------2nd Example -----------------*/
/*Name of the overrided method must be same as in the super class. You can’t change name of the method in subclass.*/
class SuperClass1
{
    void firstMethodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
 
    double secondMethodOfSuperClass()
    {
        return 0.0;
    }
 
    Object thirdMethodOfSuperClass()
    {
        return new Object();
    }
}
 
class SubClass1 extends SuperClass1
{
    /*int firstMethodOfSuperClass()
    {
        //Compile time error, return type must be void not int
    }
 
    void secondMethodOfSuperClass()
    {
        //Complie time error, return type must be double not void
    }*/
 
    String thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return new String();
    }
}    

/*--------------3rd Example -----------------*/
/*You can keep same visibility or increase the visibility of overrided method but you can’t reduce the visibility of overrided methods 
  in the subclass. For example, default method can be overided as default or protected or public method but not as private.For example,*/

class SuperClass2
{
    protected void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass2 extends SuperClass2
{
    /*private void methodOfSuperClass()
    {
        //Compile time error, can't reduce visibility of overrided method
        //here, visibility must be protected or public but not private or default
    }*/
}


