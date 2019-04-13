package oops.nestedClasses;

public class O001_StaticNestedClasses {
	int i;       //Field as a member
	void methodOne(){
        //method as a member
    }
 
    class NestedClass{
        //class as a member
    }
}

/*There are 2 types of Nested Classes.
Static Nested Classes
Non-Static Nested Classes or Inner Classes*/

							/* Static Nested Classes In Java */
/*-------------1st Example-----------------*/
/*If nested class is declared as static, then that nested class is called as static nested class.*/

class OuterClass1{
    int i;       //Field as a member
    void methodOne(){
        //method as a member
    }
 
    static class NestedClass1{
        //class as a member which is declared as static
    }
}

/*-------------2nd Example-----------------*/
/*Let’s discuss some interesting points about Static Nested Classes.
Static nested classes can contain both static and non-static members.
*/
class OuterClass2{
    //Some members of OuterClass
    static class NestedClass2{
        static int i;    //Static Field
        int j;      //Non-static Field
        void methodOne(){
            //Non-static method
        }
        static void methodTwo(){
            //Static Method
        }
    }
}

/*-------------3rd Example-----------------*/
/*We can access only static members of outer class inside a static nested class. We can’t access non-static members of outer class 
 * inside a static nested class.*/
class OuterClass3{
    static int i;  //static field of OuterClass
    int j;         //Non-static field of OuterClass
    void methodOne(){
        //Non-static method of OuterClass
    }
 
    static void methodTwo(){
        //static method of OuterClass
    }
 
    static class NestedClass3{
        void methodOfInnerClass()
        {
            System.out.println(i);    //static field can be accessed
            System.out.println(j);    //This gives Compile time error
            //can't access non-static field
            methodTwo();   //can access static method
            methodOne();   //This gives Compile time error
            //can't access non-static method
        }
    }
}

/*-------------4th Example-----------------*/
/*We have seen that static methods can’t be abstract but static nested classes can be abstract.*/
class OuterClass4{
    //static and abstract inner class
    abstract static class NestedClass4{
        abstract void methodOne();  //abstract method of NestedClass
 
        void methodTwo(){
            //concrete method of NestedClass
        }
    }
}

/*-------------5th Example-----------------*/
/*Static nested class can be final.*/
class OuterClass5{
    //final and static nested class
    final static class NestedClass5
    {
        void methodOne(){
            //concrete method of NestedClass
        }
    }
}

/*-------------6th Example-----------------*/
/*Below example shows how to refer Objects of the static nested class.*/
class OuterClass6{
    int i = 10;   //Non-static Field of OuterClass
    static void methodOne(){
        System.out.println("Static method of OuterClass");
    }
 
    static class NestedClassOne6{
        int i = 20;   //Non-static Field of NestedClassOne
        static void methodOne(){
            System.out.println("Static method of NestedClassOne");
        }
    }
 
    static class NestedClassTwo6{
        int i = 30;    //Non-static Field of NestedClassTwo
 
        static void methodOne(){
            System.out.println("static method of NestedClassTwo");
        }
    }
}
 
/*-------------7th Example-----------------*/
class NestedClasses7
{
    public static void main(String[] args)
    {
        OuterClass6.methodOne();      //static member can be accessed directly through class name.
        OuterClass6 outer = new OuterClass6();
        System.out.println(outer.i);  //Instance member must be accessed through object reference
 
        OuterClass6.NestedClassOne6.methodOne();  //static member can be accessed directly through class name.
        OuterClass6.NestedClassOne6 nestedOne = new OuterClass6.NestedClassOne6();
        System.out.println(nestedOne.i);     //Instance member must be accessed through object reference
 
        OuterClass6.NestedClassTwo6.methodOne();  //static member can be accessed directly through class name.
        OuterClass6.NestedClassTwo6 nestedTwo = new OuterClass6.NestedClassTwo6();
        System.out.println(nestedTwo.i);     //Instance member must be accessed through object reference
    }
}

/*-------------8th Example-----------------*/
/*Constructors and methods of nested classes can be overloaded.*/
class OuterClass8{
    static class NestedClass8{
        NestedClass8(){
            //First constructor
        }
 
        NestedClass8(int i){
            //Second Constructor
        }
 
        NestedClass8(int i, int j){
            //Third Constructor
        }
 
        void methodOne(){
            //Overloaded method
        }
 
        void methodOne(int i){
            //Overloaded method
        }
 
        void methodOne(int i, int j){
            //Overloaded method
        }
    }
}

/*-------------9tht Example-----------------*/
/*Static Nested Classes can be chained. i.e Nested class may contain another nested class and that nested class may contain another nested class and so on.*/

class OuterClass9{
    static class NestedClass9{
        static class NestedClassOne9{
            static class NestedClassTwo9{
                static class NestedclassThree9{
                    static void methodOne(){
                        System.out.println("Chain Of Nested Classes");
                    }
                }
            }
        }
    }
}
 
/*-------------10th Example-----------------*/
class NestedClasses10{
    public static void main(String[] args){
        OuterClass9.NestedClass9.NestedClassOne9.NestedClassTwo9.NestedclassThree9.methodOne();
    }
}

/*-------------11th Example-----------------*/
/*If you compile the above program, for each class, .class file will be generated. The generated .class files are –  OuterClass.class, 
 OuterClass$NestedClass.class, OuterClass$NestedClass$NestedClassOne.class, OuterClass$NestedClass$NestedClassOne$NestedClassTwo.class, 
 OuterClass$NestedClass$NestedClassOne$NestedClassTwo$NestedclassThree.class.
If you observe names of generated .class files, you will come to know that name contains name of outer class and nested classes seperated by $.*/