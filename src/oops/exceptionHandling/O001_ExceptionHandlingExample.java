package oops.exceptionHandling;

/* An exception is an abnormal condition which occurs during run time and disrupts the normal flow of the program.  
 * This exception must be handled to maintain the normal flow of the program. If this exception is not handled properly, 
 * the rest of the program will not be executed. */

public class O001_ExceptionHandlingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*----------------1st Example------------------*/
/*Let’s see some of the exceptions and their handling using try and catch blocks.*/
class ExceptionHandling1{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        Integer I = new Integer("abc");  //This statement throws NumberFormatException
        System.out.println("This statement will not be executed");
    }
}

/*----------------2nd Example------------------*/
/*In the above example, Line 7 throws NumberFormatException. This causes the abrupt termination of the program 
 * i.e remaining statement (Line 8) will not be executed. To make it run normally, enclose the statement which is 
 * throwing an exception in try-catch blocks. This is shown below,*/
class ExceptionHandling2{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        try{
            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e){
            System.out.println("exception caught");
        }
        System.out.println("Now, This statement will also be executed");
    }
}

/*----------------3rd Example------------------*/
/*Below example throws ArithmaticException.*/
class ExceptionHandling3{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        int i = 1000/0;    //This statement throws ArithmaticException : / by zero
        System.out.println("This statement will not be executed");
    }
}

/*----------------4th Example------------------*/
/*Below example shows how ArithmaticException can be handled using try-catch blocks.*/
class ExceptionHandling4{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        try{
            int i = 1000/0;    //This statement throws ArithmaticException : / by zero
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
        System.out.println("Now, This statement will also be executed");
    }
}

/*----------------5th Example------------------*/
/*This example throws ArrayIndexOutOfBoundsException.*/
class ExceptionHandling5{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        String s = args[1];    //This statement throws ArrayIndexOutOfBoundsException
        System.out.println("This statement will not be executed");
    }
}

/*----------------6th Example------------------*/
/*and this can be handled using try-catch blocks.*/
class ExceptionHandling6{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        try{
            String s = args[1];    //This statement throws ArrayIndexOutOfBoundsException
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
        System.out.println("Now, This statement will also be executed");
    }
}

/*----------------7th Example------------------*/
/*Below example throws ClassCastException.*/
class ExceptionHandling7{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        Object o = new Object();
        ExceptionHandling1 e = (ExceptionHandling1) o;   //This statement throws ClassCastException
        System.out.println("This statement will not be executed");
    }
}

/*----------------8th Example------------------*/
/*Below example shows handling of ClassCastException using try-catch blocks.*/
class ExceptionHandling8{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        Object o = new Object();
        try{
            ExceptionHandling1 e = (ExceptionHandling1) o;   //This statement throws ClassCastException
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}

/*----------------9th Example------------------*/
/*Below example throws NullPointerException.*/
class ExceptionHandling9{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        String s = null;
        System.out.println(s.length());  //This statement throws NullPointerException
        System.out.println("This statement will not be executed");
    }
}

/*----------------10th Example------------------*/
/*and this example shows how NullPointerException can be handled using try-catch blocks.*/
class ExceptionHandling10{
    public static void main(String[] args){
        System.out.println("This statement will be executed"); 
        String s = null;
        try{
            System.out.println(s.length());  //This statement throws NullPointerException
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}


/*----------------try, catch and finally blocks In Java------------------*/
/*try block : In try block, keep those statements which may throw exceptions during run time.
catch block : This block handles the exceptions thrown by try block. It takes one argument of type java.lang.Exception.
finally block : Whether exception is thrown or not and thrown exception is caught or not, this block will be always executed.*/

/*----------------1st Example------------------*/
class ExceptionHandling11{
    public static void main(String[] args){
        String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values
 
        for (int i = 0; i < s.length; i++){
            try{
                int intValue = Integer.parseInt(s[i]); //This statement may throw NumberFormatException
            }
            catch(NumberFormatException ex){
                System.out.println("The thrown NumberFormatException will be caught here");
            }
            finally{
                System.out.println("This block is always executed");
            }
        }
    }
}

/*----------------2nd Example------------------*/ 
/*When a statement throws an exception in the try block, the remaining part of the try block will not be executed. 
  Program control comes out of the try block and enters directly into catch block.*/
class ExceptionHandling12{
    public static void main(String[] args){
        try{
            int i = 10/0;           //This statement throws ArithmeticException
 
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex){
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        finally{
            System.out.println("This block is always executed");
        }
    }
}

/*----------------3rd Example------------------*/
/*try, catch and finally blocks form one unit. i.e You can’t keep other statements in between try, catch and finally blocks.*/
class ExceptionHandling13{
    public static void main(String[] args){
        System.out.println("You can keep any number of statements here");
        try{
            int i = 10/0;           //This statement throws ArithmeticException
            System.out.println("This statement will not be executed");
        }
        //You can't keep statements here
        catch(ArithmeticException ex){
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        //You can't keep statements here
        finally{
            System.out.println("This block is always executed");
        }
        System.out.println("You can keep any number of statements here");
    }
}

/*----------------4th Example------------------*/
/*You can display the description of an exception thrown using Exception object in the catch block.*/
class ExceptionHandling14{
    public static void main(String[] args){
        try{
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex){
            System.out.println(ex);    //Output : java.lang.NullPointerException
            ex.printStackTrace();     //This prints stack trace of exception
        }
        finally{
            System.out.println("This block is always executed");
        }
    }
}

/*----------------Multiple Catch Blocks In Java------------------*/
/*In some cases, A single statement may throw more than one type of exception. In such cases, Java allows you to 
 * put more than one catch blocks. One catch block handles one type of exception.  When an exception is thrown by 
 * the try block, all the catch blocks are examined in the order they appear and one catch block which matches with 
 * exception thrown will be executed. After, executing catch block, program control comes out of try-catch unit.*/

/*----------------1st Example------------------*/
class ExceptionHandling15{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        for (int i = 0; i < 6; i++){
            try{
                int a = s[i].length() + Integer.parseInt(s[i]);       
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }
 
            catch(NumberFormatException ex){
                System.out.println("NumberFormatException will be caught here");
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            }
            catch (NullPointerException ex){
                System.out.println("NullPointerException will be caught here");
            }
            System.out.println("After executing respective catch block, this statement will be executed");
        }
    }
}
/*In the above example, a string array is iterated through for loop. First statement of try block (Line 11) may throw 
 * NumberFormatException because string array contain some non-numeric values or It may throw NullPointerException because 
 * string array contains one null object or it may throw ArrayIndexOutOfBoundsException because we are trying to iterate 6
 *  elements, but actually string array contains only 4 elements. Depending upon the type of exception thrown, corresponding
 *   catch block will be executed.*/

/*----------------2nd Example------------------*/
/*From Java 7 onward, there is one more way for handling multiple exceptions. Multiple exceptions thrown by the try block 
 *can be handled by a single catch block using pipe (|) operator. By using pipe operator, the above example can be written as,*/
class ExceptionHandling16{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++){
            try{
                int a = s[i].length() + Integer.parseInt(s[i]);       
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }
            catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex){
                System.out.println("Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
            }
        }
    }
}

/*----------------3rd Example------------------*/
/*java.lang.Exception is super class of all types of exception. (Types of exceptions will be discussed later). It handles all 
 * types of exceptions. In the above example, all catch blocks can be replaced by one catch block which handles all types of 
 * exceptions. This type of exception handling comes very handy when you are not sure about the types of exceptions your code 
 * may throw.*/

class ExceptionHandling17{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        for (int i = 0; i < 6; i++){
            try{
                int a = s[i].length() + Integer.parseInt(s[i]);       
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }
            catch(Exception ex){
                System.out.println("This block handles all types of exceptions");
            }
        }
    }
}

/*----------------4th Example------------------*/
/*The order of catch blocks should be from most specific to most general ones. i.e Sub classes of Exception must come first and
 *super classes later. If you keep the super classes first and sub classes later, you will get compile time error : Unreachable 
 *Catch Block.*/
class ExceptionHandling18{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
 
        catch(Exception ex){
            System.out.println("This block handles all exception types");
        }
        catch(NumberFormatException ex){
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block
        }
    }
}

/*----------------5th Example------------------*/ 
/*Below is the correct way to write above program.*/
class ExceptionHandling19{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
        catch(NumberFormatException ex){
            System.out.println("This block handles NumberFormatException");
        }
        catch(Exception ex){
            System.out.println("This block handles all exception types");
        }
 
        catch (Throwable ex){
            System.out.println("Throwable is super class of Exception");
        }
    }
}

/*----------------Nested try catch Blocks In Java------------------*/
/*Nested try blocks are useful when different statements of try block throw different types of exceptions.*/

/*----------------1st Example------------------*/
class ExceptionHandling20{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        for (int i = 0; i < s.length; i++){
            try{     //Outer try block
                int a = s[i].length();    //This statement may throw NullPointerException
                try{    //Inner try block
                    a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                }
                catch (NumberFormatException ex){   //Inner catch block
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(NullPointerException ex){     //Outer catch block
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}

/*----------------2nd Example------------------*/
/*try blocks can be nested at any level.*/
class ExceptionHandling21{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        for (int i = 0; i < s.length; i++){
            //First Level try-catch block
            try{
                int a = s[i].length();    //This statement may throw NullPointerException
                //second level try-catch block
                try{
                    System.out.println(s[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
                    //third level try-catch block
                    try{
                        a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NumberFormatException e){
                        System.out.println("NumberFormatException will be caught here");
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("ArrayIndexOutOfBoundsException will be caught here");
                }
            }
            catch(NullPointerException ex){
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}

/*----------------3rd Example------------------*/
/*If the exception thrown by the inner try block can not be caught by it’s catch block, then this exception is propagated 
 to outer try blocks. Any one of the outer catch block should handle this exception otherwise program will terminate abruptly.*/
class ExceptionHandling23{
    public static void main(String[] args){
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        for (int i = 0; i < s.length; i++){
            //First Level try-catch block
            try{
                int a = s[i].length();    //This statement may throw NullPointerException
                //second level try-catch block
                try{
                    System.out.println(s[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
                    //third level try-catch block
                    try{
                        a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NullPointerException e){
                        System.out.println("NumberFormatException will not be caught here");
                    }
                }
                catch (NumberFormatException ex){
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(Exception ex){
                System.out.println("This block catches all types of exceptions");
            }
        }
    }
}

/*----------------4th Example------------------*/
/*In the following example also, try-catch blocks are nested. main() method calls nestedTry() method. nestedTry() method 
 has one try-catch block. First statement in try block throws NumberFormatException which is not handled by it’s catch 
 block. So, It propagates to try-catch block of main method which handles this exeption.*/
class ExceptionHandling24{
    public static void main(String[] args){
        try{
            nestedTry();
        }
        catch(Exception ex){
            System.out.println("NumberFormatException will be caught here");
        }
    }
 
    static void nestedTry(){
        try{
            int i = Integer.parseInt("abc");    //This statement throws NumberFormatException
        }
        catch(NullPointerException ex){
            System.out.println("NumberFormatException will not be caught here");
        }
    }
}
/*From the above examples, we come to know that exception thrown must be handled somewhere in the program. If it is not 
 handled, then program will be terminated abruptly.*/

/*----------------Return Value From try-catch-finally Blocks------------------*/
/*Today, we will see some examples in which try-catch-finally blocks return a value.

If method returns a value and also has try, catch and finally blocks in it, then following two rules need to follow.
1) If finally block returns a value then try and catch blocks may or may not return a value.
2) If finally block does not return a value then both try and catch blocks must return a value.*/

/*----------------1st Example------------------*/
class ReturnValueFromTryCatchFinally1{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue(){
        try{
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e){
            //This block may or may not return a value as finally block is returning a value
        }
        finally{
            return 20;
        }
    }
}

/*----------------2nd Example------------------*/
class ReturnValueFromTryCatchFinally2{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue(){
        try{
            return 10;
        }
        catch (Exception e){
            return 20;
        }
        finally{
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
}

/*----------------3rd Example------------------*/
/*If try-catch-finally blocks are returning a value according to above rules, then you should not keep any statements after 
 finally block. Because they become unreachable and in Java, Unreachable code gives compile time error.*/
class ReturnValueFromTryCatchFinally3{
    public static void main(String[] args){
        try{
            return;
        }
        catch (Exception e){
            return;
        }
        finally{
            return;
        }
 
        System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
    }
}

/*----------------4th Example------------------*/
/*finally block overrides any return values from try and catch blocks.*/
class ReturnValueFromTryCatchFinally4{
    public static void main(String[] args){
        System.out.println(methodReturningValue());    //Output : 50
    }
 
    static int methodReturningValue(){
        try{
            return 10;
        }
        catch (Exception e){
            return 20;
        }
        finally{
            return 50;    //This method returns 50 not 10 or 20
        }
    }
}

/*----------------5th Example------------------*/
/*finally block will be always executed even though try and catch blocks are returning the control.*/
class ReturnValueFromTryCatchFinally5{
    public static void main(String[] args){
        System.out.println(methodReturningValue());    //Output : 10
    }
 
    static int methodReturningValue(){
        try{
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e){
            return 20;    //Control will not be passed to main() method here
        }
        finally{
            System.out.println("finally block is always executed");
            //Control will be passed to main() method after executing this block
        }
    }
}

/*----------------6th Example------------------*/
/*Go through the following examples and try to analyse their output.*/
class ReturnValueFromTryCatchFinally6{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
 
    static String methodReturningValue(){
        String s = null;
        try{
            s = "return value from try block";
            return s;
        }
        catch (Exception e){
            s = s + "return value from catch block";
            return s;
        }
        finally{
            s = s + "return value from finally block";
        }
    }
}
/*OUTPUT : return value from try block*/

/*----------------7th Example------------------*/
class ReturnValueFromTryCatchFinally7{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue(){
        int i = 0;
 
        try{
            i = 1;
            return i;
        }
        catch (Exception e){
            i = 2;
            return i;
        }
        finally{
            i = 3;
        }
    }
}
/*OUTPUT : 1*/

/*----------------8th Example------------------*/
class ReturnValueFromTryCatchFinally8{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue(){
        int i = 0;
        try{
            i = 1;
            return i;
        }catch (Exception e){
            i = 2;
        }finally{
            i = 3;
        }
 
        return i;
    }
}
/*OUTPUT : 1*/

/*----------------9th Example------------------*/
class ReturnValueFromTryCatchFinally9{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
    static int methodReturningValue(){
        try{
            int i = Integer.parseInt("123");
            return 20;
        }finally{
            return 50;
        }
    }
}
/*OUTPUT : 50*/

/*----------------10th Example------------------*/
class ReturnValueFromTryCatchFinally10{
    public static void main(String[] args){
        System.out.println(methodReturningValue());
    }
    static int methodReturningValue(){
        try{
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            return 20;
        }
        finally{
            return 50;
        }
    }
}
/*OUTPUT : 50*/


/*----------------Hierarchy Of Exceptions In Java------------------*/
/*Checked Exceptions
Unchecked Exceptions

java.lang.Throwable :
1)java.lang.Error
2)java.lang.Exception

for more in information see the diagram
*/

/*----------------Throwing And Re-Throwing An Exception In Java------------------*/
/* We all know that Throwable class is super class for all types of errors and exceptions. An object to this Throwable 
   class or it’s sub classes can be created in two ways. First one is using an argument of catch block. In this way, 
   Throwable object or object to it’s sub classes is implicitly created and thrown by java run time system. Second one is 
   using new operator. In this way, Throwable object or object to it’s sub classes is explicitly created and thrown by the code.

An object to Throwable or to it’s sub classes can be explicitly created and thrown by using throw keyword. The syntax for 
using throw keyword is,
throw InstanceOfThrowableType;
where, InstanceOfThrowableType must be an object of type Throwable or subclass of Throwable.
Such explicitly thrown exception must be handled some where in the program, otherwise program will be terminated.*/

/*----------------1st Example------------------*/
class ExceptionHandling25{
    public static void main(String[] args){
        methodWithThrow();
    }
    static void methodWithThrow(){
        try{
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex){
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
    }
}

/*----------------2nd Example------------------*/
/*It is not compulsory that explicitly thrown exception must be handled by immediately following try-catch block. It can be 
 handled by any one of it’s enclosing try-catch blocks.*/

class ExceptionHandling26{
    public static void main(String[] args){
        try{
            methodWithThrow();
        }
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException object thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow(){
        try{
            NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(ArithmeticException ex){
            System.out.println("Explicitly thrown NumberFormatException object will not be caught here");
        }
    }
}

/*----------------3rd Example------------------*/
/*Re-throwing An Exception :
We all know that exceptions occurred in the try block are caught in catch block. Thus caught exceptions can be re-thrown 
using throw keyword. Re-thrown exception must be handled some where in the program, otherwise program will terminate abruptly. 
For example,
*/
class ExceptionHandling27{
    public static void main(String[] args){
        try{
            methodWithThrow();
        }
        catch(NullPointerException ex){
            System.out.println("NullPointerException Re-thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow(){
        try{
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex){
            System.out.println("NullPointerException is caught here");
            throw ex;     //Re-throwing NullPointerException
        }
    }
}

/*----------------throws Keyword In Java------------------*/
/* If a method is capable of throwing an exception that it could not handle, then it should specify that exception using 
 * throws keyword. It helps the callers of that method in handling that exception. */

/*----------------1st Example------------------*/
class ExceptionHandling28{
    public static void main(String[] args){
        try{
            methodWithThrows();
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
    }
 
    static void methodWithThrows() throws NullPointerException{
        String s = null;
        System.out.println(s.length());   //This statement throws NullPointerException
    }
}

/*----------------2nd Example------------------*/ 
/*Let’s see some of the points-to-remember about throws keyword.*/
/*Multiple exceptions can be declared using throws keyword separated by commas.*/
class ExceptionHandling30{
    static void methodWithThrows() throws NumberFormatException, NullPointerException{
        int i = Integer.parseInt("a");   //This statement throws NumberFormatException
        String s = null;
        System.out.println(s.length());    //This statement throws NullPointerException
    }
 
    public static void main(String[] args){
        try{
            methodWithThrows();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}

/*----------------3rd Example------------------*/
/*The main use of throws keyword in java is that an exception can be propagated through method calls.*/
class ExceptionHandling31{
    static void methodOne() throws NumberFormatException{
        int i = Integer.parseInt("a");   //This statement throws NumberFormatException
    }
 
    static void methodTwo() throws NumberFormatException{
        methodOne();     //NumberFormatException is propagated here
    }
 
    static void methodThree() throws NumberFormatException{
        methodTwo();    //NumberFormatException is propagated here
    }
 
    public static void main(String[] args){
        try{
            methodThree();
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
        }
    }
}

/*----------------4th Example------------------*/
/*Even constructor can use throws keyword.For this, object creation statement must be enclosed in try-catch blocks.*/
class A{
    int i;
    public A(String s) throws NumberFormatException{
        i = Integer.parseInt(s);    //This statement throws NumberFormatException
    }
}
 
class ExceptionHandling32{
    public static void main(String[] args){
        try{
            A a = new A("abc");    //Object creation statement enclosed in try-catch block
        }
        catch (NumberFormatException ex){
            System.out.println("NumberFormatException will be caught here"+ex);
        }
    }
}

/*----------------5ht Example------------------*/
/*When a method is throwing unchecked type of exceptions, then you need not to mention it using throws keyword. But for a 
 method throwing checked type of exceptions, you must declare it with throws keyword or enclose the statement which is 
 throwing an exception in try-catch block. (We will discuss about this in detail while covering checked and unchecked 
 exceptions).*/
class ExceptionHandling33{
    //method throwing Unchecked Exception declared without throws clause
    static void methodThrowingUncheckedException(){
        int i = Integer.parseInt("a");   
        //Above statement throws NumberFormatException which is unchecked type of exception
    }
    //method throwing checked Exception declared with throws clause
    static void methodThrowingCheckedException() throws ClassNotFoundException{
        Class.forName("Any Class");
        //Above statement throws ClassNotFoundException which is checked type of exception
    }
 
    public static void main(String[] args){
        try{
            methodThrowingUncheckedException();
        }
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException will be caught here"+ex);
        }
 
        try{
            methodThrowingCheckedException();
        }
        catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException will be caught here"+e);
        }
    }
}
