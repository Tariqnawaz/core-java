package oops.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/*
Let’s discuss some rules need to follow when overriding a method with throws clause.
If super class method is not throwing any exceptions, then it can be overrided with any unchecked type of exceptions, 
but can not be overrided with checked type of exceptions.*/
public class O002_ExceptionHandlingMethodOverriding {
	public static void main(String[] args) {

	}
}

/*------------1st Example----------------*/
class SuperClass11{
    void methodOfSuperClass(){
        System.out.println("Super class method is not throwing any exceptions");
    }
}
 
class SubClass1 extends SuperClass11{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException{
        System.out.println("can be overrided with any unchecked Exception");
    }
}
 
class SubClassOne1 extends SuperClass11{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException{
        System.out.println("Can be overrided with any number of Unchecked Exceptions");
    }
}
 
class SubClassTwo1 extends SuperClass11{
    @Override
    void methodOfSuperClass() throws SQLException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}

/*------------2nd Example----------------*/
/*If a super class method is throwing unchecked exception, then it can be overrided in the sub class with same exception
 *or any other unchecked exceptions but can not be overrided with checked exceptions.*/
class SuperClass12{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException{
        System.out.println("Super class method is throwing Unchecked exception");
    }
}
 
class SubClass2 extends SuperClass12{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException{
        System.out.println("Can be Overrided with same unchecked exception");
    }
}
 
class SubClassOne2 extends SuperClass12{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException{
        System.out.println("Can be overrided with any other Unchecked Exceptions");
    }
}
 
class SubClassTwo2 extends SuperClass12{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}

/*------------3rd Example----------------*/
/*If super class method is throwing checked type of exception, then it can be overrided with same exception or with it’s 
 * sub class exceptions i.e you can decrease the scope of the exception, but can not be overrided with it’s super class 
 * exceptions i.e you can not increase the scope of the exception.*/
class SuperClass13{
    void methodOfSuperClass() throws IOException{
        System.out.println("Super class method is throwing checked exception");
    }
}
 
class SubClass3 extends SuperClass13{
    @Override
    void methodOfSuperClass() throws IOException{
        System.out.println("Can be Overrided with same checked exception");
    }
}
 
class SubClassOne3 extends SuperClass13{
    @Override
    void methodOfSuperClass() throws FileNotFoundException{
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo3 extends SuperClass13{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException{
        System.out.println("Can be overrided with any unchecked exceptions and checked exception with lesser scope");
    }
}
 
class SubClassThree3 extends SuperClass13{
    @Override
    void methodOfSuperClass() throws Exception{
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}

/*------------4th Example----------------*/
/*One more example with overriding a method throwing both checked and unchecked exceptions.*/
class SuperClass14{
    void methodOfSuperClass() throws IOException, ClassNotFoundException, NumberFormatException{
        System.out.println("Super class method is throwing both checked and unchecked exceptions");
    }
}
 
class SubClass4 extends SuperClass14{
    @Override
    void methodOfSuperClass() throws IOException, ClassNotFoundException{
        System.out.println("Can be Overrided with same checked exceptions");
    }
}
 
class SubClassOne4 extends SuperClass14{
    @Override
    void methodOfSuperClass() throws FileNotFoundException{
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo4 extends SuperClass14{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException{
        System.out.println("Can be overrided with any other unchecked exceptions and checked exception with lesser scope");
    }
}
 
class SubClassThree4 extends SuperClass14{
    @Override
    void methodOfSuperClass() throws Exception{
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}

/*----------------Checked And Unchecked Exceptions In Java------------------*/
/* 1) Checked Exceptions : Checked exceptions are the exceptions which are known during compile time. These are the exceptions 
 * that are checked at compile time. They are also called compile time exceptions. */

/*----------------1st Example------------------*/
class CheckedException1{
    public static void main(String[] args)
    {
        Class.forName("AnyClassName");  
 
        //Compile time error because
        //above statement throws ClassNotFoundException which is a checked exception
        //this statement must be enclosed within try-catch block or declare main method with throws clause
    }
}

/*----------------2nd Example------------------*/
/*Below is the correct ways to write the above code.*/
class CheckedException2{
    public static void main(String[] args){
        try{
            Class.forName("AnyClassName");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException will be caught here");
        }
    }
}
/*OR*/
class CheckedException3{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("AnyClassName");
    }
}

/* 1) Unchecked Exceptions : Unchecked exceptions are the exceptions which are known  at run time. They can not be 
 * known at compile time because they occur only at run time. That’s why they are also called Run Time Exceptions. */

/*----------------3rd Example------------------*/
class UncheckedException1{
    public static void main(String[] args){
          int i = Integer.parseInt("Unchecked Exception");   
 
          //Above statement throws NumberFormatException which is an unchecked exception
    }
}
/*Above program throws NumberFormatException at run time, but it is not handled properly. So, program will terminate abruptly. 
 To avoid this, you have to handle this exception using try-catch blocks.*/
class UncheckedException2{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt("Unchecked Exception");   
            //Above statement throws NumberFormatException which is an unchecked exception
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException will be caught here");
        }
    }
}

/*----------------User Defined Exceptions In Java------------------*/
/* In java, we can define our own exception classes as per our requirements. These exceptions are called user defined exceptions 
 * in java OR Customized exceptions. User defined exceptions must extend any one of the classes in the hierarchy of exceptions. */

/*----------------1st Example------------------*/
class ExceptionHandling1{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
          System.out.println("Enter Your Age");
          int age = sc.nextInt();         //Taking input from user
          try{
              if(age < 0){
                  throw new Exception();    //throws an Exception if age is negative
              }
          }
          catch(Exception ex){
              System.out.println(ex);     //Prints exception description
          }
    }
}

/*----------------2nd Example------------------*/
/*When user enters negative value in the above example, it throws an exception and prints exception description which user may 
 * not understand. So, Let’s make this program more user friendly. Modify above example so that user can understand why the 
 * exception has occurred. To do this, create one sub class to Exception class and override toString() method.*/

//Defining Our own exception by extending Exception class
class AgeIsNegativeException extends Exception{
    String errorMessage;
    public AgeIsNegativeException(String errorMessage){
        this.errorMessage = errorMessage;
    }
    //Modifying toString() method to display customized error message
    @Override
    public String toString(){
        return errorMessage;
    }
}
/*Above defined exception is called user defined exception or customized exception. Now throw this customized exception when user 
 * enters negative value.*/

/*----------------3rd Example------------------*/
class ExceptionHandling2{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
          System.out.println("Enter Your Age");
          int age = sc.nextInt();         //Taking input from user
          try{
              if(age < 0){
                  throw new AgeIsNegativeException("Age can not be negative");    //throws AgeIsNegativeException if age is negative
              }
          }
          catch(AgeIsNegativeException ex){
              System.out.println(ex);    //Output : Age can not be negative
          }
    }
}
/*Now, this prints “Age can not be negative” when user enters a negative value. This makes the user understand easily why the 
 * error has occurred.*/

/*----------------4th Example------------------*/
/*One more example to show user defined exceptions in java.*/
//Defining Our own exception class by extending ArithmeticException class
class InvalidWithdrawlMoneyException extends ArithmeticException{
    //Overriding toString() method of ArithmeticException as per our needs
    @Override
    public String toString(){
        return "You don't have that much of money in your account";
    }
}
 
//Using above customized ArithmeticException
class ExceptionHandling3{
    public static void main(String[] args){
        int balance = 5000;            //Initializing the balance
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
        System.out.println("Enter Withdrawl Money");
        int withdrawlMoney = sc.nextInt();      //taking input from the user
        try{
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
            if(withdrawlMoney > balance){
                throw new InvalidWithdrawlMoneyException();
            }else{
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex){
            //InvalidWithdrawlMoneyException will be caught here
            System.out.println(ex);
        }
    }
}

/*----------------5th Example------------------*/ 
/*We can throw modified exception using anonymous inner class also. Whenever exception occurs, create anonymous inner class, 
 * override toString() method and throw the exception. No need to define exception class separately. Above example can be 
 * written using anonymous inner classs as,*/

class ExceptionHandling4{
    public static void main(String[] args){
        int balance = 5000;            //Initializing the balance
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
        System.out.println("Enter Withdrawl Money");
        int withdrawlMoney = sc.nextInt();      //taking input from the user
        try{
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
            if(withdrawlMoney > balance){
                //throwing exception using anonymous inner class
                throw new ArithmeticException(){
                    @Override
                    public String toString(){
                        return "You don't have that much of money in your account";
                    }
                };
            }
            else{
                System.out.println("Transaction Successful");
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
    }
}


/*----------------Difference Between throw, throws and Throwable In Java------------------*/
/* throw In Java : throw is a keyword in java which is used to throw an exception manually. Using throw keyword, you can throw 
 * an exception from any method or block. But, that exception must be of type java.lang.Throwable class or it’s sub classes. 
 * Below example shows how to throw an exception using throw keyword.*/

class ThrowAndThrowsExample{
    void method() throws Exception{
        Exception e = new Exception();
        throw e;            //throwing an exception using 'throw'
    }
}

/* throws In Java : throws is also a keyword in java which is used in the method signature to indicate that this method may 
 * throw mentioned exceptions. The caller to such methods must handle the mentioned exceptions either using try-catch blocks or 
 * using throws keyword. Below is the syntax for using throws keyword.*/
class ThrowsExample{
    void methodOne() throws SQLException{
        //This method may throw SQLException
    }
 
    void methodTwo() throws IOException{
        //This method may throw IOException
    }
 
    void methodThree() throws ClassNotFoundException{
        //This method may throw ClassNotFoundException
    }
}

/* Throwable In Java : Throwable is a super class for all types of errors and exceptions in java. This class is a member of 
 * java.lang package. Only instances of this class or it’s sub classes are thrown by the java virtual machine or by the throw 
 * statement. The only argument of catch block must be of this type or it’s sub classes. If you want to create your own 
 * customized exceptions, then your class must extend this class.*/
class MyException extends Throwable{
           //Customized Exception class
}
 
class ThrowAndThrowsExample1{
    void method() throws MyException{
        MyException e = new MyException();
        throw e;
    }
}











