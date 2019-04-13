package oops.wrapperClasses;

public class O005_WrapperClassAutoWideningVsAutoBoxingVsAutoUpCasting {
	/*----------1st Example----------------*/
	static void overloadedMethod(Integer I){
        System.out.println("Integer Wrapper Class Type");
    }
 
    static void overloadedMethod(long l){
        System.out.println("long primitive type");
    }
 
    public static void main(String[] args){
        int i = 21;
        overloadedMethod(i);
    }
    
    /*In the above example, ‘overloadedMethod’ is overloaded. One method takes Integer wrapper class type as an argument 
     * and another method takes primitive long type as an argument. In the main method, we are calling this ‘overloadedMethod’ 
     * by passing primitive int type as an argument. When you run this program, you will get “long primitive type” as output. 
     * That means, auto-widening is happening not auto-boxing.*/
}

/*----------2nd Example----------------*/
/* Now, make little modification to the above example. Change the argument of second method from primitive long type to Long 
 * wrapper class type.*/
class WrapperClasses41{
    static void overloadedMethod(Integer I){
        System.out.println("Integer Wrapper Class Type");
    }
 
    static void overloadedMethod(Long L){
        System.out.println("Long Wrapper Class Type");
    }
 
    public static void main(String[] args){
        int i = 21;
        overloadedMethod(i);
    }
    /* Now run this program. you will get “Integer Wrapper Class Type” as output. That means auto-boxing is happening. */
}

/*----------3rd Example----------------*/
/* Now, make one more modification to the above program. Change the argument of first method from Integer Wrapper Class 
 * Type to Double Wrapper Class Type.*/
class WrapperClasses42{
    static void overloadedMethod(Double D){
        System.out.println("Double Wrapper Class Type");
    }
 
    static void overloadedMethod(Long L){
        System.out.println("Long Wrapper Class Type");
    }
 
    public static void main(String[] args){
        int i = 21;
        overloadedMethod(i);   //compile time error
    }
    
    /* Above example gives compile time error. Because, there is no method definition which takes int type as an argument. 
     * Primitive int type can be auto-widened to big sized primitive types or can be auto-boxed to Integer wrapper class type 
     * but can not be converted into Double or Long wrapper class type.*/
}

/*----------4th Example----------------*/
/* Now, add one more overloadedMethod which takes Number Class type as an argument to the above class.*/
class WrapperClasses43{
    static void overloadedMethod(Number N){
        System.out.println("Number Class Type");
    }
 
    static void overloadedMethod(Double D){
        System.out.println("Double Wrapper Class Type");
    }
 
    static void overloadedMethod(Long L){
        System.out.println("Long Wrapper Class Type");
    }
 
    public static void main(String[] args){
        int i = 21;
 
        overloadedMethod(i);
    }
    /* Now run this program, you will get “Number Class Type” as output. What happened here is, internally primitive int 
     * type is auto-boxed to Integer type and Integer type is auto-UpCasted to Number type as Integer wrapper class is a 
     * sub class of Number class.*/
}












