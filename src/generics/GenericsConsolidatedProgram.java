package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsConsolidatedProgram {
	public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
    //    list.add(123);       Compile time error
        for (String str : list){
            //No type casting needed. ClasscastException Never occurs
            System.out.println(str);
        }
        
        /* Generic Example with single type parameter */
        GenericClass1<String> gen1 = new GenericClass1<String>("It must be string");
        GenericClass1<Integer> gen11 = new GenericClass1<Integer>(10);
        GenericClass1<Double> gen111 = new GenericClass1<Double>(15.0);
        gen1.setT("Value Changed");        //Passing String to setT() method
        String s = gen1.getT();              //getT() method returning string
        gen11.setT(new Integer(123));      //Compile time error. You can't pass Integer type to setT() method now
        gen111.setT(new Double(23.56));    //Compile time error. You can't pass Double type to setT() method now
        
       //GenericClass<int> gen1 = new GenericClass<int>(123);   //Error, can't use primitive type
       // GenericClass<float> gen2 = new GenericClass<float>(23.56);  //Error, can't use primitive type
       
        /* Generic Example with two type parameter */
        GenericClass01<String, Integer> gen01 = new GenericClass01<String, Integer>("Value of t1", new Integer(123));
        GenericClass01<Integer, String> gen02 = new GenericClass01<Integer, String>(new Integer(123), "Value of t2");
        System.out.println(gen01.getT1());       //Output : Value of t1
        System.out.println(gen01.getT2());       //Output : 123
        System.out.println(gen02.getT1());       //Output : 123
        System.out.println(gen02.getT2());       //Output : Value of t2
        
        //You can pass your own type while creating an instance to the generic class
        GenericExample<ParsingThisClassAsAType> gen010 = new GenericExample<ParsingThisClassAsAType>(new ParsingThisClassAsAType(10));     //Passing A-type as type parameter
        GenericExample<ParsingThisClassAsAType> gen020 = new GenericExample<ParsingThisClassAsAType>(new ParsingThisClassAsAType(20));     //Passing A-type as type parameter
        System.out.println(gen010.getT().i);    //Output : 10 
        System.out.println(gen020.getT().i);    //Output : 20
        
        // defining method and constructor in generics
        GenericExample.genericMethod(new Integer(123));     //Passing Integer type as an argument 
        GenericExample.genericMethod("I am string");        //Passing String type as an argument
        GenericExample.genericMethod(new Double(25.89));    //Passing Double type as an argument
        GenericClass1<String> gen011 = new GenericClass1<String>("It must be string");
    }
}

class GenericExample<T>{
    T t;
    public GenericExample(T t){
        this.t = t;
    }
    public void setT(T t){
        this.t = t;
    }
 
    public T getT(){
        return t;
    }
    
    static <T> void genericMethod(T t1){
        T t2 = t1;
        System.out.println(t2);
    }
}

/*Generic Class With Two Type Parameters :
Below is an example of a generic class with two type parameters.
*/
class GenericExample1<T1, T2>{
    T1 t1;
    T2 t2;
    public GenericExample1(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }
 
    public T1 getT1(){
        return t1;
    }
 
    public void setT2(T2 t2){
        this.t2 = t2;
    }
 
    public T2 getT2(){
        return t2;
    }
}

class ParsingThisClassAsAType{
    int i;
 
    public ParsingThisClassAsAType(int i){
        this.i = i;
    }
}

/* Generics Interface */
interface GenericInterfaceExample<T>{
    void setT(T t);    
    T getT();
}

class GenericExampleClass<T> implements GenericInterface1<T>{
	 
}

/* Bounded Types in generics */
class GenericBoundedClass<T extends Number>{    //Declaring Number class as upper bound of T
    T t;
    public GenericBoundedClass(T t){
        this.t = t;
    }
 
    public T getT(){
        return t;
    }
}

class GenericBoundedClassMain{
	public static void main(String[] args){
		//Creating object by passing Number as a type parameter
		GenericBoundedClass<Number> gen1 = new GenericBoundedClass<Number>(123);
        //Creating object by passing Integer as a type parameter
		GenericBoundedClass<Integer> gen2 = new GenericBoundedClass<Integer>(new Integer(456));
        //Creating object by passing Double as a type parameter
		GenericBoundedClass<Double> gen3 = new GenericBoundedClass<Double>(new Double(23.589));
        //Creating object by passing Long as a type parameter
		GenericBoundedClass<Long> gen4 = new GenericBoundedClass<Long>(new Long(12));
	}
}