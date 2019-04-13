package oops.keyword;

/*--------------1st Example------------- */
public class O001_SuperKeyword {
	int i;    //Field
	O001_SuperKeyword(int j){
        System.out.println("Super Class Constructor");
    }
 
    void methodOfSuperClass(){     //method
        System.out.println("From method of super class");
    }
	
}

class SubClass extends O001_SuperKeyword
{
    SubClass(){
        super(10);
        //Calling statement to super class constructor
    }
 
    void methodOfSubClass(){
        System.out.println(super.i);  //super class field is accessed
        super.methodOfSuperClass();  // super class method is called
        System.out.println("From method of sub class");
    }
}

/*--------------2nd Example------------- */
/*If you want same implementation as that of super class method in the sub class, but want to add some more extra statements to it, 
 in such cases, super keyword will be very useful. First call the super class method using super keyword and after it add extra statements
 according to requirements in the sub class method.*/
 
class SuperClass12{
    void methodOfSuperClass(){
        //Some task
    }
}
 
class SubClass1 extends SuperClass12{
    void methodOfSubClass(){
        super.methodOfSuperClass();  // super class method is called
        //add some other extra statements fulfilling the requirements
    }
 
    //you can implement same task by overriding super class method also
    void methodOfSuperClass(){
        //super class method is overrided.
        super.methodOfSuperClass();
        //add some other extra statements fulfilling the requirements
    }
}