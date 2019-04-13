package oops.constructors;

public class O001_ConstructorsExample {
	/* A constructor is a primary method which is used to create a object of Class. 
	    It doesn't return any thing and it should have same name as class*/
	
	/*----------------- 1st Example ----------------------*/
		O001_ConstructorsExample(){
	         // Constructor of Class A
	     }
		
	     O001_ConstructorsExampleA1()
	     {
	         // Compile time error, It is neither a constructor nor a method
	     }
		
		void O001_ConstructorsExample()
	     {
	         // constructor having a return type, It will be treated as method but with a warning.
	     }	
	/*----------------- 2nd Example ----------------------*/     
	/* Every class should have at least one constructor. If you don’t write constructor for 
	   your class, compiler will give default constructor. Default constructor is always public
	   and it has no arguments (No-Arg Constructor).*/
		
		   
		   class O001_ConstructorsExample1{
			     // No Constructors written
			}
		
			class O001_ConstructorsExample2{
			    public O001_ConstructorsExample2(){
			        //   Constructor provided by the compiler.
			    }
			}
			
		
		
	/*----------------- 3rd Example ----------------------*/ 
	/* Constructor can be declared as private. If you declare constructor as private, you can’t use it outside that class.*/
		
		   
		  	class O001_ConstructorsExample3{
			    private O001_ConstructorsExample3(){
			        // Private Constructor
			    }
			    
			    void methodOne(){
			          //You can use private constructor inside the class
			          O001_ConstructorsExample a1 = new O001_ConstructorsExample();
			     }
			}
			
			class MainClass{
			     public static void main(String[] args)
			     {
			          //You can't use private constructor ouside the class like this
			          // O001_ConstructorsExample a1 = new O001_ConstructorsExample();
			     }
			}
			
		
	
	/*----------------- 4rd Example ----------------------*/ 	
	/* One class can have more than one constructors. It is called Constructor Overloading. 
	   Through constructor overloading, you can have multiple ways to create objects.*/	
		
		 class O001_ConstructorsExample4{
		     O001_ConstructorsExample4(){
		        // First Constructor
		     }
		 
		     O001_ConstructorsExample4(int i){
		        // Second Constructor
		     }
		 
		    O001_ConstructorsExample4(int i, int j){
		       // Third Constructor
		    }
		} 
	
	/*----------------- 5th Example ----------------------*/ 	
	/*Duplicate Constructors not allowed. If you keep duplicate constructors, you will get compile time error.*/	
		
		 class O001_ConstructorsExample5{
		     O001_ConstructorsExample5(int i){
		         // Duplicate Constructor
		     }
		 
		     O001_ConstructorsExample5(int i){
		        // Duplicate Constructor
		     }
		}  
		
	/*----------------- 6th Example ----------------------*/ 	
	/* Multiple arguments of the constructors can’t have same name. If the two arguments have the same name,
	   you will get compile time error.*/	
		
		 class O001_ConstructorsExample7{
		     O001_ConstructorsExample7(int i, int i){
		         // Duplicate Arguments Passed. It gives compile time error
		     }
		} 
		
	/*----------------- 7th Example ----------------------*/ 
	/* Only public, protected and private keywords are allowed before a constructor name. If you keep any 
	   other keyword before a constructor name, it gives compile time error.*/	
	
		class O001_ConstructorsExample8{
		     final O001_ConstructorsExample8(){
		         //Constructor can not be final
		     }
		     static O001_ConstructorsExample8(){
		         //Constructor can not be static
		     }
		     abstract O001_ConstructorsExample8(){
		        //Constructors can not be abstract
		     }
		} 

	/*----------------- 8th Example ----------------------*/	
	/* First statement in a constructor must be either super() or this(). If you put any other statements you
	   will get compile time error.*/	
		
		 class A{
		     A(){
		          //By Default, Compile will keep super() calling statement here.
		          System.out.println("First Constructor");
		     }
		     A(int i){
		          //Compiler will not keep any statement here
		          super();
		          System.out.println("Second Constructor");
		     }
		     A(int i, int j){
		          //Compiler will not keep any statement here
		          this();
		          System.out.println("Third Constructor");
		     }
		     A(int i, int j, int k){
		          System.out.println("Fourth Constructor");
		          // super(); It will give error if you keep super() here
		     }
		}
		
		
		/*-----Recursive constructor calling is not allowed.*/
			class A1{
			     A1()
			     {
			          this();
			          // It gives compile time error
			     }
			}
			
		/*-----No Cylic calling of constructors.*/
			class A2{
			     A2(){
			          this(10);
			          // It gives compile time error
			     }
			     A2(int i){
			          this();
			          // It gives compile time error
			     }
			}
		
		
	
}
