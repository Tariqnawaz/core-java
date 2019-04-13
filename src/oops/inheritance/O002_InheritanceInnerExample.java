package oops.inheritance;

public class O002_InheritanceInnerExample {
	public static void main(String[] args){
		OuterClass outer = new OuterClass();   //Instantiating OuterClass
	    OuterClass.InnerClassTwo innerTwo = outer.new InnerClassTwo();  //Instantiating InnerClassTwo
        System.out.println(innerTwo.x);    //Accessing inherited field x from InnerClassOne
        innerTwo.methodOfInnerClassOne();  //calling inherited method from InnerClassOne
        
        AnotherClass2 anotherClass2 = new AnotherClass2();  //creating AnotherClass Object
        System.out.println(anotherClass2.x);    //accessing inherited field x from OuterClass
        anotherClass2.methodOfOuterClass();    //calling inherited method from OuterClass
       //Using the properties of InnerClass
        AnotherClass2.AnotherInnerClass2 anotherInnerClass2 = anotherClass2.new AnotherInnerClass2();
        //creating object to AnotherInnerClass
        System.out.println(anotherInnerClass2.y);  //accessing inherited field y from InnerClass
        
        OuterClass3 outer3 = new OuterClass3();
        //You have to create OuterClass object to access non-static inner class
        OuterClass3.InnerClass3 inner3 = outer3.new InnerClass3();  //creating object to InnerClass
        System.out.println(inner3.x);   //accesiing inherited field x
        inner3.methodOfOuterClass();   //accessing inherited method
	}
}

/*---------- 1st Example --------------*/
class OuterClass{
    class InnerClassOne{
        int x = 10;
        void methodOfInnerClassOne(){
            System.out.println("From InnerClassOne");
        }
    }
 
    class InnerClassTwo extends InnerClassOne{
        //One Inner Class can extend another inner class
    }
}

/*---------- 2nd Example --------------*/
/*An inner class can be extended by another class outside of it’s outer class. If you are extending static
inner class (Static nested class), then it is a straight forward implementation. If you are extending non-static inner
class, then sub class constructor must explicitly call super class constructor using an instance of outer class. 
Because, you can’t access non-static inner class without the instance of outer class.*/
class OuterClass1{
    static class InnerClassOne1{
        //Class as a static member
    }
 
    class InnerClassTwo1{
        //Class as a non-static member
    }
}
 
//Extending Static inner class or static nested class
class AnotherClassOne1 extends OuterClass1.InnerClassOne1{
    //static nested class can be referred by outer class name,
}

//Extending non-static inner class or member inner class
class AnotherClassTwo extends OuterClass1.InnerClassTwo1{
  public AnotherClassTwo(){
      new OuterClass1().super();  //accessing super class constructor through OuterClass instance
  }
}

/*---------- 3rd Example --------------*/
/* When an outer class is extended by it’s sub class, Member inner classes will not be inherited to sub class. 
   To use inner class properties inside the sub class of outer class, sub class must also have an inner class and 
   that inner class must extend inner class of the outer class. */
class OuterClass2{
    int x;
    void methodOfOuterClass(){
        System.out.println("From OuterClass");
    }
 
    //Class as a member
    class InnerClass2{
        int y;
    }
}

class AnotherClass2 extends OuterClass2{
    //Only fields and methods are inherited.
    // To use inner class properties,
    //it's inner class must extend inner class of it's super class
    class AnotherInnerClass2 extends InnerClass2{
        //Inner Class of AnotherClass extends Inner Class of OuterClass
    }
}

//the above class is called in main method 

/*---------- 4th Example --------------*/
/*Inner class can extend it’s outer class. But, it does not serve any meaning. Because, even the private members of
  outer class are available inside the inner class. Even though, When an inner class extends its outer class, only fields
  and methods are inherited but not inner class itself.*/

class OuterClass3{
    int x;
    void methodOfOuterClass(){
        System.out.println("From OuterClass");
    }
 
    //Class as a member
    class InnerClass3 extends OuterClass3{
        //only fields and methods are inherited, but not member Inner Classes
    }
 
    class InnerClassOne3{
        //another class as a member
    }
}
// above class is called in main method.
