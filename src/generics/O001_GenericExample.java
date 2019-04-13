package generics;

import java.util.ArrayList;

/* Errors are integral part of coding. Some errors occur at compile time and some errors occur at run time. Errors which occur at compile 
 * time can be easily identified and can be removed. But, run time errors occur when an application is running in real time. If they happen, 
 * they cause abrupt termination of an application.

ClassCastException is also such an exception which happens only at run time. It occurs when data of one type can not be casted to another 
type. You will never get a single clue about this exception during compilation. Look at the below code which throws ClassCastException at 
run time. But, you will never be get notified about this exception at compile time.*/

public class O001_GenericExample {
	public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("JAVA");
        list.add(123);
 
        for (Object object : list){
            //Below statement throws ClassCastException at run time
            String str = (String) object;       //Type casting
            System.out.println(str);
        }
    }
}
/* In this example, ‘list’ contains elements of String type as well as int type. When you try to cast it’s elements to string type in the 
 * for loop, element of string type is casted without throwing errors but element of int type throws ClassCastException. */

/*You can avoid ClassCastException by using generics in your code. The above example can be re-written using generics like below.*/
class GenericsInJava1{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
    //    list.add(123);       Compile time error
        for (String str : list){
            //No type casting needed. ClasscastException Never occurs
            System.out.println(str);
        }
    }
}
/*Now, ‘list’ is declared so that it can hold only string type. If you try to add elements of different type, it gives compile time error. 
 * Therefore, ClassCastException never occurs while executing the for loop.*/

/*****************************************************************************************************************************************/
/* Defining Generic Class */
/*we have seen why we need to use generics. Generics are used to check the type compatibility at the compile time and hence removing the 
 * chances of occuring ClassCastException at run time. In this particular post, we will see how to define our own generic class.*/

/*The syntax for defining generic class is as follows,
class Class_Name<T1, T2, T3 ... Tn>
{
    //Generic Type or Parameterized type
}
Where T1, T2, T3 … Tn (T stands for Type) enclosed within angle brackets (<>) are called type parameters and class ‘Class_Name‘ is called 
generic type or parameterized type.*/

/*Now, let’s try to define one generic class based on the above format.*/
class GenericClass1<T>{
    T t;
    public GenericClass1(T t){
        this.t = t;
    }
    public void setT(T t){
        this.t = t;
    }
 
    public T getT(){
        return t;
    }
}

/*While creating an instance to the above generic class, you can pass any class type as a type parameter and that class type replaces 
 * generic ‘T’ for that object. For example, if you pass String type as a type parameter then String will be the type of variable ‘t’. 
 * If you pass Integer as type parameter than Integer will be the type of variable ‘t’.

In the other words, when you pass a type while creating an object to the generic class, that object works only with that type. For example, 
If you pass String type while creating an object to the above generic class then that object works only with String type. That means setT() 
method takes String type as an argument and getT() method returns String type. If you pass any other type to setT() method, it gives compile 
time error. Hence, strictly checking type casting during compilation.
*/

class GenericsInJava2{
    public static void main(String[] args){
        GenericClass1<String> gen1 = new GenericClass1<String>("It must be string");
        gen1.setT("Value Changed");        //Passing String to setT() method
        String s = gen1.getT();              //getT() method returning string
        gen1.setT(new Integer(123));      //Compile time error. You can't pass Integer type to setT() method now
        gen1.setT(new Double(23.56));    //Compile time error. You can't pass Double type to setT() method now
    }
}

/*If you create an object by using Integer type as a type parameter then that object works only with Integer type.*/
class GenericsInJava3{
    public static void main(String[] args){
        GenericClass1<Integer> gen1 = new GenericClass1<Integer>(new Integer(123));
        gen1.setT(456);             //Passing Integer type to setT() method
        Integer I = gen1.getT();      //getT() method returning Integer type
        gen1.setT(new String("123"));      //Compile time error. You can't pass String type to setT() method now
        gen1.setT(new Double(23.56));    //Compile time error. You can't pass Double type to setT() method now
    }
}

/*Generics Work Only With Derived Types :
While creating an instance of generic class, you must pass only derived types. You can’t pass primitive types. If you pass primitive type, 
it gives compile time error. i.e generics works only with derived type.
*/
class GenericsInJava4{
    public static void main(String[] args){
        GenericClass<int> gen1 = new GenericClass<int>(123);   //Error, can't use primitive type
        GenericClass<float> gen2 = new GenericClass<float>(23.56);  //Error, can't use primitive type
    }
}

/*Objects Of Same Generic Class Differ Based On Their Type Parameters :
Objects of same generic class differ depending upon their type parameters. For example, object of above generic class created using String 
type is not compatible with an object of same class created using Integer type.
*/
class GenericsInJava5{
    public static void main(String[] args){
        GenericClass1<String> gen1 = new GenericClass1<String>("Value Of t");
        GenericClass1<Integer> gen2 = new GenericClass1<Integer>(new Integer(20));
        gen1 = gen2;        //Error : Type mismatch
        gen2 = gen1;        //Error : Type mismatch
    }
}

/*Generic Class With Two Type Parameters :
Below is an example of a generic class with two type parameters.
*/
class GenericClass01<T1, T2>{
    T1 t1;
    T2 t2;
    public GenericClass01(T1 t1, T2 t2){
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
 
class GenericsInJava6{
    public static void main(String[] args){
        GenericClass01<String, Integer> gen1 = new GenericClass01<String, Integer>("Value of t1", new Integer(123));
        GenericClass01<Integer, String> gen2 = new GenericClass01<Integer, String>(new Integer(123), "Value of t2");
         System.out.println(gen1.getT1());       //Output : Value of t1
        System.out.println(gen1.getT2());       //Output : 123
        System.out.println(gen2.getT1());       //Output : 123
        System.out.println(gen2.getT2());       //Output : Value of t2
    }
}

 
/*You can pass your own type while creating an instance to the generic class. Here is an example for that.*/
class GenericClass02<T>{
    T t;
    public GenericClass02(T t){
        this.t = t;
    }
    public void setT(T t){
        this.t = t;
    }
 
    public T getT(){
        return t;
    }
}
 
class A{
    int i;
 
    public A(int i){
        this.i = i;
    }
}
 
class GenericsInJava7{
    public static void main(String[] args){
        GenericClass02<A> gen1 = new GenericClass02<A>(new A(10));     //Passing A-type as type parameter
        GenericClass02<A> gen2 = new GenericClass02<A>(new A(20));     //Passing A-type as type parameter
        System.out.println(gen1.getT().i);    //Output : 10 
        System.out.println(gen2.getT().i);    //Output : 20
    }
}

/**********************************************************************************************************************/
/* Rules To Follow While Implementing Generic Interfaces */
/*Like generic classes, you can also define generic interfaces. The same syntax used to define generic classes is also used to define generic 
 interfaces. Here is an example of generic interface.*/
interface GenericInterface1<T>{
    void setT(T t);    
    T getT();
}

/*While implementing generic interfaces you have to follow some rules. Below is the discussion of those rules.

Rules To Follow While Implementing Generic Interfaces :
Only generic classes can implement generic interfaces. Normal classes can’t implement generic interfaces. For example, above generic 
interface can be implemented as,
*/
class GenericClass03<T> implements GenericInterface1<T>{
 
}
/*Not like below. It gives compile time error.*/

class NormalClass implements GenericInterface1<T>{
     //Compile time error
}

/*Here is the full implementation of above generic interface.*/
class GenericClass<T> implements GenericInterface1<T>{
    T t;
    //Implementing setT() method
    @Override
    public void setT(T t){
        this.t = t;
    }
    //Implementing getT() method
    @Override
    public T getT(){
        return t;
    }
}

/*A normal class can implement a generic interface if type parameter of generic interface is a wrapper class. For example, below 
 * implementation of GenericInterface is legal.*/
interface GenericInterface2<Integer>{
       //Generic interface with Integer as type parameter
}
 
class NormalClass implements GenericInterface2<Integer>{
       //Normal class implementing generic interface
}

/*Class implementing generic interface at least must have same number and same type of parameters and at most can have any number and any 
 * type of parameters.*/
interface GenericInterface3<T>{
    //Generic interface with one type parameter
}
 
class GenericClass11<T> implements GenericInterface3<T>
{
    //Class with same type parameter
}
 
class GenericClass2<T, V> implements GenericInterface<T>
{
    //Class with two type parameters
}
 
class GenericClass12<T1, T2> implements GenericInterface<T>{
    //Compile time error, class having different type of parameters
}

/*You can change the type of parameter passed to generic interface while implementing it. When changed, the class which is implementing s
 * hould have new type as parameter and also, you have to change old type with new type while implementing the methods.*/
interface GenericInterface4<T>{
    void setT(T t);
 
    T getT();
}
 
//Changing the type of parameter passed to GenericInterface while implementing
 
class GenericClass14<V> implements GenericInterface4<V>{
    V t;
 
    @Override
    public void setT(V t){    //Changing the type of parameter
        this.t = t;
    }
 
    @Override
    public V getT()          //Changing the return type
    {
        return t;
    }
}

/*Generic interface can have any number of type parameters. Class implementing generic interface at least must have  same type of 
 * parameters and at most can have any number of parameters*/
interface GenericInterface5<T1, T2, T3, T4>{
    //Generic interface with 4 type parameters
}
 
class GenericClass15<T1, T2, T3, T4, T5> implements GenericInterfac5e<T1, T2, T3, T4>{
    //Generic class with 5 type parameters implementing generic interface with 4 type parameters
}
 
class GenericClass16<T1, T2, T3> implements GenericInterface5<T1, T2, T3, T4>{
    //Compile time error, must have same number of type parameters
}
 
class GenericClass3<T1, T2, T5, T6> implements GenericInterface5<T1, T2, T3, T4>{
    //Compile time error. must have same type of parameters
}

/*Class can implement more than one generic interfaces. If implemented, class should have type parameters of both the interfaces.*/
interface GenericInterface6<T1>
{
    //Generic interface with one type parameter
}


interface GenericInterface7<T2, T3>
{
    //Generic interface with two type parameters
}
 
class GenericClass17<T1,T2, T3> implements GenericInterface6<T1>, GenericInterface7<T2, T3>
{
    //Class having parameters of both the interfaces
}

/**********************************************************************************************************************************/
/* Can We Define Methods And Constructors As Generic? */

/* Generics are very useful and flexible feature of Java. Generics provide safe type casting to your coding. Along with safe type casting, 
 * they also give flexibility to your coding. For example, Once you write a class or interface using generics, you can use any type to 
 * create objects to them. In simple words, You can make objects to work with any type using generics.*/

class NonGenericClass1{    
    static <T> void genericMethod(T t1){
        T t2 = t1;
        System.out.println(t2);
    }
}
class GenericsInJava18{
    public static void main(String[] args){
        NonGenericClass1.genericMethod(new Integer(123));     //Passing Integer type as an argument 
        NonGenericClass1.genericMethod("I am string");        //Passing String type as an argument
        NonGenericClass1.genericMethod(new Double(25.89));    //Passing Double type as an argument
    }
}

/*Constructors As Generics :
As we all know that constructors are like methods but without return types. Like methods, constructors also can be generic. Even non-generic 
class can have generic constructors. Here is an example in which constructor of a non-generic class is defined as generic.
*/
class NonGenericClass2{    
    public <T> NonGenericClass2(T t1){
        T t2 = t1;
        System.out.println(t2);
    }
}
 
class GenericsInJava19{
    public static void main(String[] args){
        //Creating object by passing Integer as an argument
    	NonGenericClass2 nonGen1 = new NonGenericClass2(123);
        //Creating object by passing String as an argument
        NonGenericClass2 nonGen2 = new NonGenericClass2("abc");
        //Creating object by passing Double as an argument
        NonGenericClass2 nonGen3 = new NonGenericClass2(25.69);
    }
}

/****************************************************************************************************************************/
/* What Are Bounded Types And Why They Are Used? */
/*In the earlier posts, We have seen that while creating objects to generic classes we can pass any derived type as type parameters. 
 * Many times it will be useful to limit the types that can be passed to type parameters. For that purpose, bounded types or bounded type 
 * parameters are introduced in generics. Using bounded types, you can make the objects of generic class to have data of specific derived 
 * types.*/

/*For example, If you want a generic class that works only with numbers (like int, double, float, long …..) then declare type parameter of 
 * that class as a bounded type to java.lang.Number class. Then while creating objects to that class you have to pass only Number types or 
 * it’s subclass types as type parameters.*/

/*Here is the syntax for declaring Bounded type parameters.
<T extends SuperClass>
This specifies that ‘T’ can only be replaced by ‘SuperClass’ or it’s sub classes. Remember that extends clause is an inclusive bound. 
That means bound includes ‘SuperClass’ also.*/

/*Here is an example which demonstrates the bounded type parameters.*/
class GenericClass19<T extends Number>{    //Declaring Number class as upper bound of T
    T t;
    public GenericClass19(T t){
        this.t = t;
    }
 
    public T getT(){
        return t;
    }
}
/*In this example, T has been declared as bounded type to Number class. So while creating objects to this class, you have to pass either Number type or it’s subclass types (Integer, Double, Float, Byte… ) as a type parameter. It wouldn’t allow other than these types to pass as a type parameter. If you try to pass, compiler will throw compile time error.*/

class GenericsInJava20{
    public static void main(String[] args){
        //Creating object by passing Number as a type parameter
    	GenericClass19<Number> gen1 = new GenericClass19<Number>(123);
        //Creating object by passing Integer as a type parameter
    	GenericClass19<Integer> gen2 = new GenericClass19<Integer>(new Integer(456));
        //Creating object by passing Double as a type parameter
    	GenericClass19<Double> gen3 = new GenericClass19<Double>(new Double(23.589));
        //Creating object by passing Long as a type parameter
    	GenericClass19<Long> gen4 = new GenericClass19<Long>(new Long(12));
        //While Creating object by passing String as a type parameter, it gives compile time error
    	GenericClass19<String> gen5 = new GenericClass19<String>("I am string");   //Compile time error
    }
}

/*Bounded Type Parameters In Generic Methods :
You can use bounded types while defining generic methods also. Here is an example.
*/

class GenericClass20{
    //Declaring T as bounded type to Number class
    public static <T extends Number> void printNumbers(T[] t){
        for (int i = 0; i < t.length; i++){
            System.out.println(t[i]);
        }
    }
}
 
class GenericsInJava21{
    public static void main(String[] args){
        //Passing Integer[] array while calling printNumbers()
    	GenericClass20.printNumbers(new Integer[] {new Integer(10), new Integer(20), new Integer(30), new Integer(40)} );
        //Passing Double[] array while calling printNumbers()
    	GenericClass20.printNumbers(new Double[] {new Double(21.45), new Double(20.45), new Double(34.87), new Double(48.36)} );
        //Passing String[] array while calling printNumbers(), it gives compile time error
    	GenericClass20.printNumbers(new String[] {"one", "Two", "Three", "Four"});    //Compile time error
    }
}

/*Using Interface As An Upper Bound :
You can also use interface type along with class type as an upper bound to type parameters. As in java, any class can extend only one 
class and can implement multiple interfaces, this also applies while declaring the bound to type parameters. That means a bounded parameter 
can extend only one class and one or more interfaces. While specifying bounded parameters that has a class and an interface or multiple 
interfaces, use & operator as a delimiter.
*/
class GenericClass22 <T extends AnyClass & FirstInterface & SecondInterface>{    
 
}


/**********************************************************************************************************************************/
/* What Are Wildcard Arguments In Java? */
/*Wildcard arguments means unknown type arguments. They just act as placeholder for real arguments to be passed while calling method. 
 * They are denoted by question mark (?). One important thing is that the types which are used to declare wildcard arguments must be 
 * generic types. Wildcard arguments are declared in three ways.*/

/*1) Wildcard Arguments With An Unknown Type
2) Wildcard Arguments with An Upper Bound
3) Wildcard Arguments with Lower Bound*/

/*1) Wildcard Arguments With An Unknown Type :
The syntax for declaring this type of wildcard arguments is,
GenericType<?>
*/
/*The arguments which are declared like this can hold any type of objects. For example, Collection<?> or ArrayList<?> can hold any type 
 * of objects like String, Integer, Double etc.*/

/*Look at the below code. The same processElements() method is used to process the ArrayList containing strings as well as integers.*/
class GenericsInJava23{
    static void processElements(ArrayList<?> a){
        for (Object element : a){
            System.out.println(element);
        }
    }
 
    public static void main(String[] args){
        //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        processElements(a1);
        //Arraylist containing strings
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("One");
        a2.add("Two");
        a2.add("Three");
        processElements(a2);
    }
}

/*2)Wildcard Arguments With An Upper Bound :
In the above example, if you want the processElements() method to work with only numbers, then you can specify an upper bound for wildcard 
argument. To specify an upper bound for wildcards, use this syntax,
GenericType<? extends SuperClass>
This specifies that a wildcard argument can contain ‘SuperClass’ type or it’s sub classes. Remember that extends clause is an inclusive 
bound. i.e ‘SuperClass’ also lies in the bound.
*/

/*The above processElements() method can be modified to process only numbers like below,*/
class GenericsInJava24{
    static void processElements(ArrayList<? extends Number> a){
        for (Object element : a){
            System.out.println(element);
        }
    }
 
    public static void main(String[] args){
        //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        processElements(a1);
        //Arraylist containing Doubles
        ArrayList<Double> a2 = new ArrayList<Double>();
        a2.add(21.35);
        a2.add(56.47);
        a2.add(78.12);
        processElements(a2);
        //Arraylist containing Strings
        ArrayList<String> a3 = new ArrayList<String>();
 
        a3.add("One");
 
        a3.add("Two");
 
        a3.add("Three");
 
        //This will not work
 
        processElements(a3);     //Compile time error
    }
}

/*3) Wildcard Arguments With Lower Bound :
You can also specify a lower bound for wildcard argument using super clause. Here is the syntax,
GenericType<? super SubClass>
This means that a wildcard argument can contain ‘SubClass’ type or it’s super classes.
*/
class GenericsInJava25{
    static void processElements(ArrayList<? super Integer> a){
        for (Object element : a){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
       processElements(a1);
 
        //Arraylist containing Doubles
 
        ArrayList<Double> a2 = new ArrayList<Double>();
        a2.add(21.35);
        a2.add(56.47);
        a2.add(78.12);
        //This will not work
        processElements(a2);     //Compile time error
    }
}
 
/*Note : ‘super’ clause is used to specify the lower bound for only wildcard arguments. It does not work with bounded types.*/

/**********************************************************************************************************************************/
/* Generics And Their Inheritance */
/*A generic class can extend a non-generic class.*/
class NonGenericClass26{
     //Non Generic Class
}
 
class GenericClass26<T> extends NonGenericClass26{
    //Generic class extending non-generic class
}

/*Generic class can also extend another generic class. When generic class extends another generic class, sub class should have at least 
 * same type and same number of type parameters and at most can have any number and any type of parameters.*/
class GenericSuperClass27<T>{
    //Generic super class with one type parameter
}
 
class GenericSubClass1<T> extends GenericSuperClass27<T>{
    //sub class with same type parameter
}
 
class GenericSubClass2<T, V> extends GenericSuperClass27<T>{
    //sub class with two type parameters
}
 
class GenericSubClass3<T1, T2> extends GenericSuperClass27<T>{
    //Compile time error, sub class having different type of parameters
}

/*When generic class extends another generic class, the type parameters are passed from sub class to super class same as in the case of 
 constructor chaining where super class constructor is called by sub class constructor by passing required arguments. For example, in the 
 below program  ‘T’ in ‘GenericSuperClass’ will be replaced by String.*/

class GenericSuperClass<T>{
    T t;
 
    public GenericSuperClass(T t){
        this.t = t;
    }
}
 
class GenericSubClass<T> extends GenericSuperClass<T>
{
    public GenericSubClass(T t){
        super(t);
    }
}
 
class GenericsInJava28{
    public static void main(String[] args){
        GenericSubClass<String> gen = new GenericSubClass<String>("I am string");
        System.out.println(gen.t);       //Output : I am string
    }
}

/*A generic class can extend only one generic class and one or more generic interfaces. Then it’s type parameters should be union of type 
 * parameters of generic class and generic interface(s).*/

class GenericSuperClass1<T1>{
    //Generic class with one type parameter
}
 
interface GenericInterface11<T1, T2>{
    //Generic interface with two type parameters
}
 
interface GenericInterface12<T2, T3>{
    //Generic interface with two type parameters
}
 
class GenericClass29<T1,T2, T3> extends GenericSuperClass<T1> implements GenericInterface11<T1, T2>, GenericInterface12<T2, T3>
{
    //Class having parameters of both the interfaces and super class
}

/*Non-generic class can’t extend generic class except of those generic classes which have already pre defined types as their type parameters.*/
class GenericSuperClass2<T>{
    //Generic class with one type parameter
}
 
class NonGenericClass5 extends GenericSuperClass2<T>{
    //Compile time error, non-generic class can't extend generic class
}
 
class A1{
    //Pre defined class
}
 
class GenericSuperClass5<A1>{
    //Generic class with pre defined type 'A' as type parameter
}
 
class NonGenericClass6 extends GenericSuperClass5<A>{
    //No compile time error, It is legal
}

/*Non-generic class can extend generic class by removing the type parameters. i.e as a raw type. But, it gives a warning.*/

class GenericClass30<T>{
    T t;
 
    public GenericClass30(T t){
        this.t = t;
    }
}
 
class NonGenericClass7 extends GenericClass30{       //Warning
    public NonGenericClass7(String s){
        super(s);           //Warning
    }
}
 
public class GenericsInJava31{
    public static void main(String[] args){
        NonGenericClass7 nonGen = new NonGenericClass7("I am String");
        System.out.println(nonGen.t);    //Output : I am String
    }
}

/*While extending a generic class having bounded type parameter, type parameter must be replaced by either upper bound or it’s sub classes.*/
class GenericSuperClass18<T extends Number>{
    //Generic super class with bounded type parameter
}
 
class GenericSubClass19 extends GenericSuperClass18<Number>{
    //type parameter replaced by upper bound
}
 
class GenericSubClass20 extends GenericSuperClass18<Integer>{
    //type parameter replaced by sub class of upper bound
}
 
class GenericSubClass21 extends GenericSuperClass18<T extends Number>
{
    //Compile time error
}

/*Generic methods of super class can be overrided in the sub class like normal methods.*/
class GenericClass32{
    <T> void genericMethod(T t){
        System.out.println(1);
    }
}
 
class NonGenericClass8 extends GenericClass32{
    @Override
    <T> void genericMethod(T t){
            System.out.println(2);
    }
}
 
class GenericsInJava33{
    public static void main(String[] args){
        new GenericClass32().genericMethod("I am String");       //Output : 1
 
        new NonGenericClass8().genericMethod("I am String");    //Output : 2
    }
}

/******************************************************************************************************************************/
/* Type Erasure */
/*In the previous posts, we have seen how type safety can be achieved using generics. If you use generics in your code, you need not to 
 * perform explicit casting. Compiler performs strong type checking during compilation and hence removing the chances of occurring 
 * ClassCastException at run time.*/

/*One more interesting thing about generics is type erasure. When you compile your java code, compiler removes all generic information 
 * mentioned in your code. Compiler replaces all type parameters with their bounded type. The type parameters which don’t have bounds will 
 * be replaced with java.lang.Object class. That means all type parameters exist till compilation only. They are erased during compilation. 
 * They don’t exist at run time.*/

/*To understand how type erasure works, consider this example.*/
class GenericClassOne1<T>{
    T t;    //T will be replaced by java.lang.Object when compiled
}
 
class GenericClassTwo2<T extends Number>{
    T t;    //T will be replaced by java.lang.Number when compiled
}
/*When you compile above two classes, compiler replaces type parameter ‘T’ of GenericClassOne with java.lang.Object class as it is not 
 * bounded and type parameter ‘T’ of GenericClassTwo is replaced by java.lang.Number class as it is bounded by Number class. This is how 
 * above two classes look after compilation.*/
class GenericClassOne3 extends java.lang.Object{
    java.lang.Object t;
}
 
class GenericClassTwo4 extends java.lang.Object{
    java.lang.Number t;
}
/*You can notice that type parameters are erased after compilation. They don’t exist at run time. That’s why you can’t instantiate a type 
 * parameter. It gives compile time error.*/

class GenericClass5<T>{
    T t = new T();      //Compile time error
 
    <V> void genericMethod()
    {
        V v = new V();   //Compile time error
    }
}

/****************************************************************************************************************************/
/* Some Interesting Observations About Generics In Java */
/*In this post, I have tried to list down some interesting observations about generics in java. You may get questions about these points 
 * in the interview or any java certification exams.*/

/*Java allows generic classes to use without type parameters i.e as a raw type. This is because to provide the compatibility of generic 
 * code with non-generic code. That means, non-generic code must be able to work with generic code and generic code must be able to work 
 * with non-generic code.*/
class GenericClass6<T>{
    //Generic class
}
 
class GenericsInJava34{
    public static void main(String[] args){
    	GenericClass6 rawType = new GenericClass6();     //Using generic class as a raw type
    }
}
/*You can’t create an instance to the type parameters. This is because, the type parameters does not exist at run time. They are erased 
 * during compilation.*/
class GenericClass7<T>{
    T t = new T();     //Compile Time error
    <V> void genericMethod()
    {
        V v = new V();     //Compile Time error
    }
}

/*In generic class with type parameter ‘T’, you can’t declare static fields of type ‘T’ and you can’t use ‘T’ in a static method. However, 
 * you can declare static generic methods with their own type parameters.*/
class GenericClass8<T>{
    static T t;        //Compile time error
    static void staticMethod(){
        System.out.println(t);    //Compile time error
    }
    static <V> void genericMethod(){
        //Static generic method
    }
}

/*You can’t instantiate an array whose type is a type parameter.*/

class GenericClass9<T>{
    T[] t;        
    public GenericClass9(T[] t){
        t = new T[5];   //Compile time error
        this.t = t;     //But, This is OK
    }
}
/*You can’t create an array of generic type containing specific type of data. But, you can create an array of generic type containing 
 * unknown type of data.*/
class GenericClass10<T>{
        //Generic type
}
 
class GenericsInJava{
    public static void main(String[] args){
    	GenericClass10<Number> gen[] = new GenericClass10<Number>[10];   //Compile time error
 
    	GenericClass10<?> gen1[] = new GenericClass10<?>[10];    //But, this is fine
    }
}
/*You can not create generic exceptions i.e A generic class can not extend Throwable or any of it’s sub classes.*/
class GenericClass11<T> extends Throwable{
    //Compile time error
}
