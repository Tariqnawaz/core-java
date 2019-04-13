package oops.nestedClasses;

public class O002_NonStaticNestedClasses {
	/*Nested classes which are declared as non-static or nested classes which can be accessed only though instantiating it’s outer 
	  class are called non-static nested classes. Non-static nested classes are also called as Inner Classes.
	They are 3 types of Inner Classes in java.
	
	Member Inner Classes
	Local Inner Classes
	Anonymous Inner classes*/
	
	/*---------------------1st Example---------------------------------*/
	/*-------------------Member Inner Classes--------------------------*/
	/*Member Inner Classes are non-static nested classes which are declared as non-static members of outer class.
	Let’s discuss important observations about member inner classes.
	Member inner classes must contain only non-static members. Static members are not allowed inside member inner classes.*/
	
	class InnerClass1{
        int i;    //can contain non-static field
        static int j = 10;    //It gives compile time error
        //Should not contain static field
        void methodOne(){
            //can have non-static method
        }
        static void methodTwo(){
            //Compile time error
            //should not contain static method
        }
    }
}

/*---------------------2nd Example---------------------------------*/
/*But, here is the interesting point. You can declare a static field inside a member inner class if the field is final. 
 And such field must be initialized at the time of declaration only. Remember, this rule is only for the fields not for the methods.*/

class OuterClass2{
    class InnerClass2{
        int i;    //can contain non-static field
        static final int j = 10;   //can contain static and final field
        //it must be initialized at the time of declaration.
    }
}

/*---------------------3rd Example---------------------------------*/
/*Member inner class may contain any number of IIB’s but should not contain any SIB’s.*/

class OuterClass3{
    class InnerClass3{
        int i;
        {
            System.out.println("First IIB");
        }
 
        {
            System.out.println("Second IIB");
        }
 
        static{
            //compile time error
            //Member Inner Class should not contain SIB
        }
    }
}

/*---------------------4th Example---------------------------------*/
/*We can access both static and non-static members of outer class inside a member inner class.*/

class OuterClass4{
    int i;     //Non-static field of OuterClass
    static int j;    //Static field of OuterClass
 
    void methodOne(){
        System.out.println("Non-Static Method Of OuterClass");
    }
 
    static void methodTwo(){
        System.out.println("Static Method Of OuterClass");
    }
 
    class InnerClass4{
        void methodOfInnerClass(){
            System.out.println(i); //can use non-static field of OuterClass
            System.out.println(j);   //can use static field of OuterClass
            methodOne();    //can call non-static method of OuterClass
            methodTwo();    //can call static method of OuterClass
        }
    }
}

/*---------------------5th Example---------------------------------*/
/*Below example shows how to instantiate member inner class and how to access it’s members.*/

class OuterClass5{
    class InnerClass5{
        int i;     //Non-static field of InnerClass
        static final int j = 10;  //static and final field of InnerClass
        void methodOne(){
            System.out.println("Non-static method of InnerClass");
        }
    }
}
 
/*---------------------6th Example---------------------------------*/
class InnerClasses6
{
    public static void main(String args[])
    {
        OuterClass5 outer = new OuterClass5();  //creating an instance of OuterClass
 
        OuterClass5.InnerClass5 inner = outer.new InnerClass5();  //creating an instance of InnerClass
 
        System.out.println(inner.i);    //accessing non-static field of InnerClass
 
        System.out.println(OuterClass5.InnerClass5.j);    //static field can be accessed directly through class name
 
        inner.methodOne();     //accessing non-static method of InnerClass
    }
}

/*---------------------7th Example---------------------------------*/
/*All members of outer class are accessible inside member inner class and all members of member inner class are accessible 
 inside the outer class irrespective of their visibility.*/

class OuterClass7{
    private int i;   //private field of OuterClass
    int j;           //Default field of OuterClass
    protected int k; //protected field of OuterClass
    public int m;    //public field of OuterClass
 
    void methodOfOuterClass(){
        InnerClass7 inner = new InnerClass7(); //creating instance of InnerClass
 
        System.out.println(inner.a);  //accessing private field of InnerClass
 
        System.out.println(inner.b);  //accessing default field of InnerClass
 
        System.out.println(inner.c);  //accessing protected field of InnerClass
 
        System.out.println(inner.d);  //accessing public field of InnerClass
    }
 
    class InnerClass7
    {
        private int a;    //private field of InnerClass
        int b;            //Default field of InnerClass
        protected int c;  //protected field of InnerClass
        public int d;     //public field of InnerClass
        void methodOfInnerClass(){
            OuterClass7 outer = new OuterClass7(); //creating an instance of OuterClass
            System.out.println(outer.i);    //accessing private field of OuterClass
            System.out.println(outer.j);    //accessing default field of OuterClass
            System.out.println(outer.k);    //accessing protected field of OuterClass
            System.out.println(outer.m);    //accessing public field of OuterClass
        }
    }
}

/*---------------------8th Example---------------------------------*/
/*Member inner classes can be abstract or can be final but not both.*/

class OuterClass10{
    abstract class InnerClassOne{
        //abstract Inner Class
    }
 
    final class InnerClassTwo{
        //final inner class
    }
}
