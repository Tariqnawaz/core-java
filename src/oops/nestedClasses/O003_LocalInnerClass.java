package oops.nestedClasses;

/*
Local inner class in java is non-static nested class which is declared inside a method or a block.
Let’s discuss some of behaviors of Local Inner Class in java.
Local inner classes must be defined inside a method or a block.*/	
public class O003_LocalInnerClass {
	/*----------------1st Example-----------------*/
	static{
        class LocalInnerClassOne{
            //Class defined inside Static Initialization Block
        }
    }
 
    {
        class LocalInnerClassTwo{
            //Class defined inside Instance Initialization Block
        }
    }
 
    void methodOne(){
        class LocalInnerClassThree{
            //Class defined inside a non-static method
        }
    }
 
    static void methodTwo(){
        class LocalInnerClassFour{
            //Class defined inside a static method
        }
    }
 
    void methodThree(){
        if(true){
            class LocalInnerClassFive{
                //Class defined inside if-statement
            }
        }
 
        for(int i=0; i<=5; i++){
            class LocalInnerClassSix{
                //Class defined inside a for loop
            }
        }
    }	
}

/*----------------2nd Example-----------------*/
/*Local Inner Classes can’t be static. Because, local inner classes are nothing but local variables and local variables can’t be static.*/
class OuterClass11{
    void methodOne(){
        static class LocalInnerClass{
            //compile time error
            //Local Inner class can't be static
        }
    }
}

/*----------------3rd Example-----------------*/
/*Local inner classes can’t have static members. Only non-static members are allowed inside local inner classes. But local inner classes can 
 contain static and final field.*/
class OuterClass21{
    void methodOne(){
        class LocalInnerClass{
            int i;     //can contain Non-static field
            static final int j = 10; //can contain static and final field
            static int k;   //Compile time error : can't have static field
 
            {
                //can contain instance initializer
            }
 
            static{
                //can't have static initializer
            }
 
            void methodOne(){
                //can contain non-static method
            }
 
            static void methodTwo(){
                //compile time error : can't have static method
            }
        }
    }
}

/*----------------4th Example-----------------*/
/*To access members of local inner class, you must create an instance of it.*/
class OuterClass31{
    void methodOne(){
        class LocalInnerClass{
            int i;     //Non-static field
            static final int j = 10; //static and final field
            void methodOne(){
                System.out.println("From LocalInnerClass");
            }
        }
 
        System.out.println(LocalInnerClass.j);  //static and final field can be accessed directly through class name
        LocalInnerClass inner = new LocalInnerClass();  //Creatin an object to LocalInnerClass
        System.out.println(inner.i);     //accessing non-static field through object reference
        inner.methodOne();   //calling non-static method through object reference
    }
}
 
class InnerClasses1{
    public static void main(String args[]){
        OuterClass3 outer = new OuterClass3();
        outer.methodOne();
    }
}

/*----------------5th Example-----------------*/
/*Local inner classes are local to a method or a block in which they are defined. i.e you can’t use local inner classes outside the 
 method or block in which they are defined.*/
class OuterClass41{
    void methodOne(){
        class LocalInnerClass{
            int i;     //Non-static field
            static final int j = 10; //static and final field
            void methodOne(){
                System.out.println("From LocalInnerClass");
            }
        }
        LocalInnerClass inner = new LocalInnerClass();  
        //can use LocalInnerClass within the method in which it is defined
    }
    void methodTwo()
    {
        LocalInnerClass inner = new LocalInnerClass();  //compile time error
        //can't use LocalInnerClass outside the methodOne().
    }
}

/*----------------6th Example-----------------*/
/*Only final local variables of methods or blocks containing local inner class can be used inside local inner class.*/
class OuterClass51{
    void methodOne(){
        int i;    //Non-final local variable
        final int j;   //final local variable
        class LocalInnerClass{
            void methodOne(){
                System.out.println(i);  //compile time error
                //can't use non-final local variable
                System.out.println(j);  //can use final local variable
            }
        }
    }
}

/*----------------7th Example-----------------*/
/*Local inner classes can not be declared with access modifiers. i.e Local inner classes can not be private, protected and public. 
 But they can have private, public, protected and default members in them.*/
class OuterClass61{
    void methodOne(){
        private class LocalInnerClassOne{
            //Compile time error
            //Local inner class can't be private
        }
 
        protected class LocalInnerClassTwo{
            //Compile time error
            //Local inner class can't be protected
        }
 
        public class LocalInnerClassThree{
            //Compile time error
            //Local inner class can't be public
        }
 
        class LocalInnerClassFour{
            private int i;    //can have private member
            protected int j;  //can have protected member
            public int k;    //can have public member
            int m;          //can have default member
        }
    }
}

/*----------------8th Example-----------------*/
/*Local inner classes can be abstract or can be final but not both.*/
class OuterClass91{
    void methodOne(){
        abstract class LocalInnerClassOne{
            //abstract local inner class
        }
 
        final class LocalInnerClassTwo{
            //final local inner class
        }
    }
}


/*----------------Anonymous Inner Class In Java-----------------*/
/*----------------1st Example-----------------*/
/*Anonymous inner class, the name itself suggest that it is a class without a name. Anonymous inner class in java is an inner 
  class or non-static nested class without a name.*/

class SuperClass11{
    void methodOne()
    {
        System.out.println("From SuperClass");
    }
 
    void methodTwo()
    {
        System.out.println("From SuperClass");
    }
}

/*----------------2nd Example-----------------*/
/*Let’s consider that we have a requirement in which the above class ‘SuperClass’ has to be re-used with little modification to the ‘methodOne()’. 
 To do this, we have to create a subclass to ‘SuperClass’ and override the ‘methodOne()’ method. Let’s implement this.*/
class SubClass21 extends SuperClass11{
    @Override
    void methodOne(){
        System.out.println("From Sub Class");
    }
}

/*----------------3rd Example-----------------*/
/*To use the methodOne(), we have to create an object of ‘SubClass’ type and call ‘methodOne()’ from that object.*/
class InnerClasses21{
    public static void main(String args[]){
        SubClass subclass = new SubClass();
        subclass.methodOne();
    }
}

/*----------------4th Example-----------------*/
/*This method of implementing is little bit lengthy. There is one more method of implementing this requirement which takes less time than this and 
 you need to write only few lines of code to implement this requirement. That is called Anonymous Inner Class.*/
class InnerClasses22{
    public static void main(String args[]){
        SuperClass superclass = new SuperClass(){
            @Override
            void methodOne(){
                System.out.println("From Anonymous Inner Class");
            }
        };
        superclass.methodOne();
    }
}

/*----------------5th Example-----------------*/
/*Anonymous inner classes don’t have name. They are nameless.
You can create only one object to anonymous inner class. If you want to create another object, you have to write the whole class again.
*/
class InnerClasses23{
    public static void main(String args[]){
        //First Object Creation
        SuperClass11 firstObject = new SuperClass11(){
            @Override
            void methodOne(){
                System.out.println("From First Object");
            }
        };
 
        //Second Object Creation
        SuperClass11 secondObject = new SuperClass11(){
            @Override
            void methodOne(){
                System.out.println("From Second Object");
            }
        };
    }
}

/*----------------6th Example-----------------*/
/*When you are creating an anonymous inner class, you are actually creating a sub class to a class which needs to be modified. This sub class doesn’t
  have name and it is declared in another class. That’s why it is called Anonymous Inner Class.
While creating an anonymous inner class you are also creating an object to that subclass and it is referenced by super class reference variable. 
This also shows the polymorphism. Because, Super class reference variable can refer to super class object and also it’s sub class object.
Using anonymous inner class, you can implement both abstract classes and interfaces.*/

abstract class AbstractClass{
    abstract void methodOne();
    abstract void methodTwo();
}
 
interface InterfaceClass{
    abstract void methodOfInterface();
}
 
class InnerClasses24{
    public static void main(String args[]){
        //Implementing abstract class
        AbstractClass a = new AbstractClass(){
            @Override
            void methodOne(){
                System.out.println("From AbstractClass");
 
            }
 
            //You have to override second abstract method also,
            //otherwise, you will get compile time error.
            @Override
            void methodTwo(){
                System.out.println("From AbstractClass");
            }
        };
 
        //Implementing Interface
        InterfaceClass i = new InterfaceClass(){
            @Override
            public void methodOfInterface(){
                System.out.println("From Interface");
            }
        };
    }
}



