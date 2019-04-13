package oops.inheritance;

public class O001_InheritanceExample {
	public static void main(String[] args) {
		
	}
}

/*Here, Class A has two members – ‘i’ and ‘methodOne()’. Class B also has two members – ‘j’ and ‘methodTwo()’. 
  Class B is extending Class A. Therefore, members of class A are inherited to Class B. Now, Class B will have
  two additional members inherited from class A along with its members. */

/*--------------- 1st Example -------------------*/
	class A{
		int i;
		void methodOne(){
			System.out.println("From methodOne");
		}
	}
	
	class B extends A{
		int j;
		void methodTwo(){
			System.out.println("From methodTwo");
		}
		
		/*it will contain all attribute or method of class A*/
	}
	
/* Points-To-Remember About Inheritance In Java :*/
	
/* Constructors, SIB – Static Initialization Block and IIB – Instance Initialization Block of super class will
   not be inheriting to its sub class. But they are executed while creating an object to sub class.*/
   /*--------------- 2nd Example -------------------*/
	class AA{
		int i;
		static{
			System.out.println("Class A SIB");
		}

		{
			System.out.println("Class A IIB");
		}

		AA(){
			System.out.println("Class A Constructor");
		}
	}

	class BB extends AA{
		int j;
	}

	class MainClass{
		public static void main(String[] args){
			BB b = new BB();
		}
	}
	
	/* In the above example, Class BB is extending Class AA. In the MainClass, We are creating an object to Class B. 
	   While creating this object, SIB, IIB and constructor of Class AA are also executed. The output of the above
	   program will be, 
	   
		Output :
		Class A SIB
		Class A IIB
		Class A Constructor
		
		Static members of super class are inheriting to sub class as static members and non-static members are inheriting
		as non-static members only.
		*/
	
	/*--------------- 3rd Example -------------------*/
	/* Try to compile the following program */
		 
		 class AAA{
		    int i;
		    AAA(int i){
		        System.out.println("Class A Constructor");
		    }
		}
		 
		class BBB extends AAA{
		    int j;
		}
	
		/* You will get a compile time error saying implicit default constructor A() is undefined for Class A. Compiler will 
	  force you to write constructor in Class B. Because, we are not defining constructor for Class B. 
	  
	  The code will look after removing the error is as following.
	  */
		class AAA1{
		    int i;
		    AAA1(int i){
		        System.out.println("Class A Constructor");
		    }
		    AAA1(int i , int j){
		        System.out.println("Class A Constructor");
		    }
		}
		 
		class BBB1 extends AAA1{
		    int j;
		    public BBB1(){
		        super(10);     //Explicitly Calling Class A constructor
		        AAA1 b = new AAA1(20, 30);
		        System.out.println("Class B Constructor");
		    }
		}
		
	/*--------------- 4th Example -------------------*/
	/* By default, every class is a sub class of java.lang.Object class. So, every class in java has properties inherited 
	   from Object class. Look at the below code,*/
		
		class AAAA{
		     //some satements
		}	
		
		// Compiler will treat the above code as
		class AAAAA extends Object{
		     //some satements
		}
		
		/*Any class can not extend itself i.e*/
		class AAAAAAA extends AAAAAAA{
		     //It gives compile time error
		} 
		
	/*--------------- 5th Example -------------------*/	
		
	/* We cannot can not call sub class constructor in parent class */
	 	class A13{
		     A13(){
		          //B();      There is no statement in java to call subclass constructor
		          System.out.println("Class A Constructor");
		     }
		}
		 
		class B13 extends A13{
		     B13(){
		          super();        // calling statement to super class constructor
		          System.out.println("Class B Constructor");
		     }
		}
	
		
	/*--------------- 6th Example -------------------*/	
	/*  Effect of private, default, protected and public keyword on inheritance in java 
	 	Example is solved in package folder.
	 */	
		
	/*--------------- 7th Example -------------------*/	
	/* Multiple inheritance is not supported */
		class AB{
		    void methodOne(){
		        System.out.println("From methodOfClassA");
		    }
		}
		 
		class BA{
		    void methodOne(){
		        System.out.println("From methodOfClassB");
		    }
		}
		 
		class C extends AB, BA  //(If it is supported)
		{
		    //Both the methods with same name are inherited to Class BA
		    //This causes ambiguity and confusion. Therefore,
		    //Multiple Inheritance is not supported in java
		}
		