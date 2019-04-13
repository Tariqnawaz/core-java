package oops.keyword;

public class O002_ThisKeyword {
	/*------------ 1st Example ---------------*/
	/*this keyword is used to access other members of the same class. Using this keyword, you can access methods, fields and 
	  constructors of the same class within the class. this refers to current instance of the class.*/
	int i;
	O002_ThisKeyword(){
        System.out.println("First Constructor");
    }
 
	O002_ThisKeyword(int j){
        this();    //calling statement to First Constructor
        System.out.println("Second Constructor");
    }
 
    void methodOne(){
        System.out.println("From method one");
    }
 
    void methodTwo(){
        System.out.println(this.i);  //Accessing same class field
        this.methodOne();      //Accessing same class method
    }
}

/*------------ 2nd Example ---------------*/
/*You can’t use super and this keywords in a static method and in a static initialization block even though you are referring static members.*/
class SuperClassOne12
{
    int i;      //Non-Static member
 
    static void methodOne()
    {
        //static method
        System.out.println("From Super Class");
    }
}
 
class SubClassOne1 extends SuperClassOne12
{
    static{
       /* System.out.println(super.i);
        this.methodTwo();
        //Above statements give compile time error
        //You can't use super and this keywords inside SIB*/  
    }
 
    static void methodTwo(){
        /*super.methodOne();
        this.methodOne();
        //These also give compile time error
        //You can't use super and this keywords inside static method
        //even though you are accessing static methods*/ 
   }
}
/*------------ 3rd Example ---------------*/
/*You should call super() and this() calling statements inside the constructors only and they must be first statement in the constructors.*/
class SuperClassOne13
{
    void methodOne()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClassOne2 extends SuperClassOne13
{
    public SubClassOne2(){
        /*System.out.println("constructors");
        super();
        //compile time error
        //super() calling statement must be first statement in constructor*/ 
   }
    void methodTwo(){
        /*super();
        this();
        //compile time error
        //you should call super() and this()
        //calling statements only in constructors.*/ 
   }
}






