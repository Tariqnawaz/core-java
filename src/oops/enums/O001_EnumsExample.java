package oops.enums;

public class O001_EnumsExample {
	public static void main(String[] args) {
		System.out.println(ConstantsWithoutEnums.north);
        System.out.println(ConstantsWithoutEnums.south);
        System.out.println(ConstantsWithoutEnums.east);
        System.out.println(ConstantsWithoutEnums.west);
	}
}

/*-----------1st Example--------------*/
/*Enums in java are mainly used for grouping similar kind of constants as a one unit. constants means static and final. 
 *Enums are introduced in JDK 1.5 onward. Before that similar kind of constants are grouped by declaring them as static
 *and final in one class. Below example shows how the constants will look without enums.*/
class ConstantsWithoutEnums{
    public static final String north = "NORTH";
    public static final String south = "SOUTH";
    public static final String east = "EAST";
    public static final String west = "WEST";
    /*called in main method above*/
}

/*-----------2nd Example--------------*/
/* Above constatnts can be defined with enums as below */
enum Directions1{
    NORTH, SOUTH, EAST, WEST;
}
 
class EnumsExample1{
    public static void main(String[] args){
    	Directions1 d1 = Directions1.EAST;
        System.out.println(d1);
 
        Directions1 d2 = Directions1.NORTH;
        System.out.println(d2);
 
        System.out.println(Directions1.SOUTH);
        System.out.println(Directions1.WEST);
    }
}

/*-----------3rd Example--------------*/
/*Let’s see some things-to-remember about java enums.
Enums in java are declared with enum keyword and constants in enums must be valid java identifier. 
It is good practice to declare constants with UPPERCASE letters.*/
enum Days2{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
/*Duplicate enum constants are not allowed.*/

enum Directions2{
    NORTH, NORTH, SOUTH, EAST, WEST;  //Compile Time Error : Duplicate Constants
}

/*-----------4th Example--------------*/
/* Every constant of enum is public, static and final by default. As every constant is static, 
 * they can be accessed directly using enum name.*/
enum enums3{
    A, B, C;
}
 
class EnumsExample3{
    public static void main(String[] args){
    	enums3 en = enums3.A;   //accessing constant A through enum name
    	enums3 en1 = enums3.B;  //accessing constant B through enum name
    	enums3 en2 = enums3.C;  //accessing constant C through enum name
    }
}

/*-----------5th Example--------------*/
/*Enums can have any number of fields. methods and constructors and Each constant will have their own copy of fields and methods.*/
enum enums4{
    A, B, C;
    int i;  //enums can have fields
 
    private enums4(){
        //enums can have Constructor
    }
 
    void methodOfEnum(){
        //enums can have methods
    }
}
 
class EnumsExample4{
    public static void main(String[] args){
    	enums4 en = enums4.A;
        System.out.println(en.i);  //Constant A has field i
        en.methodOfEnum();         //Constant A has methodOfEnum()
 
        enums4 en1 = enums4.B;
        System.out.println(en1.i);  //Constant B has field i
        en1.methodOfEnum();         //Constant B has methodOfEnum()
 
        enums4 en2 = enums4.C;
        System.out.println(en2.i);   //Constant C has field i
        en2.methodOfEnum();          //Constant C has methodOfEnum()
    }
}

/*-----------6th Example--------------*/
/* If enum has only constants, then semicolon (;) at the end of constant declaration is not mandatory. 
 * But, if enum has other members, then semicolon is mandatory. */
enum enums5{
    A, B, C, D     //semicolon at the end of this statement is not mandatory
}
 
enum enums6{
    A, B, C;    //semocolon at the end of this statement is mandatory, because it has other members
 
    int i;  //enums has a field
 
    void methodOfEnum(){
        //enums has a method
    }
}

/*-----------7th Example--------------*/
/*Every enum in java extends java.lang.Enum class. Enum class is an abstract class in java.lang package. 
 *As every enum extends Enum class, it should not extend any other class. Because, Multiple inheritance 
 *is not allowed in java. But enums can implement any number of interfaces.*/

interface AnyInterface7{
    abstract void methodOfInterface();
}
 
enum enums7 implements AnyInterface7{
    A, B, C;
 
    @Override
    public void methodOfInterface(){
        //MethodOfInterface is implemented
    }
}

/*-----------7th Example--------------*/
/* Enums can be declared inside a class. If declared inside a class, they are static by default and can 
 * be accessed directly by Class name. */
class ClassContainingEnum8{
    enum enums{
        A, B, C
    }
}
 
class MainClass8{
    public static void main(String[] args){
        System.out.println(ClassContainingEnum8.enums.A);  //Accessing enums directly using class name
    }
}

/*-----------8th Example--------------*/
/* Enum constants can override generalized method defined in the enum body. */
enum enums9{
    FIRST{
        @Override
        void commonMethod(){
            System.out.println("Common method Overridden in FIRST");
        }
    },
 
    SECOND{
        @Override
        void commonMethod(){
            System.out.println("Common method Overridden in SECOND");
        }
    },
 
    THIRD{
        @Override
        void commonMethod(){
            System.out.println("Common method Overridden in THIRD");
        }
    };
 
    void commonMethod(){
        System.out.println("Generalized method, Common to all constants");
    }
}
 
class EnumsExample9{
    public static void main(String[] args){
        enums9.FIRST.commonMethod();     //Output : Common method Overridden in FIRST
        enums9.SECOND.commonMethod();    //Output : Common method Overridden in SECOND
        enums9.THIRD.commonMethod();     //Output : Common method Overridden in THIRD
    }
}

/*-----------9th Example--------------*/
/* Enum can have abstract method declared in it’s body provided each enum constants must implement it. */
enum enums10{
    FIRST{
        @Override
        void abstractMethod(){
            //Abstract Method Implemented
        }
    },
 
    SECOND{
        @Override
        void abstractMethod(){
            //Abstract Method Implemented
        }
    },
 
    THIRD{
        @Override
        void abstractMethod(){
            //Abstract Method Implemented
        }
    };
    abstract void abstractMethod();
}

/*-----------9th Example--------------*/
/* Enum Constants can have their own fields and method defined in their body, but these fields and methods are 
 * visible only within the constant body. */
enum enums11{
    FIRST{
        int j = 10;   // Field of FIRST
        void methodOfFirst(){
            System.out.println(j);  //Field j can be used within the constant body
        }
 
        @Override
        void abstractMethod(){
            methodOfFirst();     //methodOfFirst() can be used within the constant body
        }
    },
 
    SECOND{
        int k = 20;   //Field of SECOND
        void methodOfSecond(){
            System.out.println(k);  //Field k can be used within the constant body
        }
 
        @Override
        void abstractMethod(){
            methodOfSecond();     //methodOfSecond() can be used within the constant body
        }
    };
    int i;   //this field is available in all constants
    abstract void abstractMethod();  //this method is available in all constants
}
 
class EnumsExample11
{
    public static void main(String[] args)
    {
        System.out.println(enums11.FIRST.j);   //Compile time error : Field j is not visible here
        enums11.FIRST.methodOfFirst();  //Compile time error : methodOfFirst() is not visible here
        enums11.FIRST.abstractMethod();
        System.out.println(enums11.SECOND.k);   //Compile time error : Field k is not visible here
        enums11.SECOND.methodOfSecond();  //Compile time error : methodOfSecond() is not visible here
        enums11.SECOND.abstractMethod();
    }
}


/* After observing all the above features of enums, we come to know that enums can have constuctors, fields and methods. 
 * Enums can implement interface. Enums extend Enum class. That means they have all features of classes. Therefore they 
 * are special type of classes. Moreover, after compilation, .class files are generated for all enums. Then what enum 
 * constants are?….  You can treat them as static inner classes of enums as they can be referred directly using enum name 
 * and they can hold fields and methods in them. */
