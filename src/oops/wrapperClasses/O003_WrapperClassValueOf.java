package oops.wrapperClasses;

/* Every wrapper class in java has 3 forms of valueOf method. They are,
1. A valueOf() method which takes primitive type as an argument
2. A valueOf() method which takes String type as an argument
3. A valueOf() method which takes two arguments. One is String type and another one is int type.
All these forms are public and static. The valueOf() methods are mainly used to wrap or box the primitive content into wrapper 
class objects.

Let’s discuss these three forms in detail.
-A valueOf() method with primitive type as an argument :
-This form of valueOf method takes primitive type data as an argument and returns corresponding wrapper class object. 
 The template of this form looks like :
 public static return_type valueOf ( primitive_type )
 where return_type is any Wrapper Class.*/
public class O003_WrapperClassValueOf {
	/*------------- 1st Example--------------*/
 	public static void main(String[] args){
        Byte B = Byte.valueOf((byte) 123);
        System.out.println(B);              //Output : 123
 
        Short S = Short.valueOf((short) 25);
        System.out.println(S);             //Output : 25
 
        Integer I = Integer.valueOf(46);
        System.out.println(I);            //Output : 46
 
        Long L = Long.valueOf(235);
        System.out.println(L);            //Output : 235
 
        Float F = Float.valueOf(23.5f);
        System.out.println(F);           //Output : 23.5
 
        Double D = Double.valueOf(15.4d);
        System.out.println(D);           //Output : 15.4
 
        Boolean BLN = Boolean.valueOf(true);
        System.out.println(BLN);        //Output : true
 
        BLN = Boolean.valueOf(false);
        System.out.println(BLN);        //Output : false
 
        Character C = Character.valueOf('C');
        System.out.println(C);          //Output : C
    }
}

/*------------- 2nd Example--------------*/
/* valueOf() Method with string as an argument */
/* This form of valueOf method takes string as an argument and returns corresponding wrapper class object. 
 * It throws NumberFormatException, if string is not a valid numeric value. Character wrapper class doesn’t 
 * have this method as string can not be converted to character*/
class WrapperClasses21{
    public static void main(String[] args){
        Byte B = Byte.valueOf("123");
        System.out.println(B);              //Output : 123
 
        Short S = Short.valueOf("25");
        System.out.println(S);             //Output : 25
 
        Integer I = Integer.valueOf("46");
        System.out.println(I);            //Output : 46
 
        Long L = Long.valueOf("235");
        System.out.println(L);            //Output : 235
 
        Float F = Float.valueOf("23.5");
        System.out.println(F);           //Output : 23.5
 
        Double D = Double.valueOf("15.4");
        System.out.println(D);           //Output : 15.4
 
        Boolean BLN = Boolean.valueOf("true");
        System.out.println(BLN);        //Output : true
 
        BLN = Boolean.valueOf("false");
        System.out.println(BLN);        //Output : false
 
        BLN = Boolean.valueOf("abc");
        System.out.println(BLN);       //Output : false
 
        //Character C = Character.valueOf("C");    //Compile Time Error : Character Class doesn't have this method
    }
}

/*------------- 3rd Example--------------*/
/* valueOf() Method with string and int as an arguments */
/* This form of valueOf method takes two arguments. One is String type which holds valid numeric value to be converted into 
 * wrapper class object and second argument is int type which indicates the radix or base of that numeric value. This form 
 * also throws NumberFormatException if String is not a valid numeric value. This method is available only in Byte, Short, 
 * Integer and Long wrapper classes.*/
class WrapperClasses22{
    public static void main(String[] args){
        Byte B = Byte.valueOf("10110", 2);  //A number with base 2 is converted into decimal value
        System.out.println(B);              //Output : 22
 
        B = Byte.valueOf("43", 5);         //A number with base 5 is converted into decimal value
        System.out.println(B);             //Output : 23
 
        Short S = Short.valueOf("12043", 8);     //A number with base 8 is converted into decimal value
        System.out.println(S);                  //Output : 5155
 
        S = Short.valueOf("4751", 10);      //A number with base 10 is converted into decimal value
        System.out.println(S);              //Output : 4751
 
        Integer I = Integer.valueOf("4673AB", 12);    //A number with base 12 is converted into decimal value
        System.out.println(I);            //Output : 1132403
 
        I = Integer.valueOf("6489CDF", 16);     //A number with base 16 is converted into decimal value
        System.out.println(I);                  //Output : 105422047
 
        Long L = Long.valueOf("GHFTDJ", 36);    //A number with base 36 is converted into decimal value
        System.out.println(L);                 //Output : 996750199
 
        L = Long.valueOf("DFGCHJ", 36);      //A number with base 36 is converted into decimal value
        System.out.println(L);               //Output : 812017207
    }
}

/*------------- 4th Example--------------*/
/* Following example shows some cases where you may get NumberFornatException. */
class WrapperClasses23{
    public static void main(String[] args){
        Byte B = Byte.valueOf("1012", 2);  
 
        //NumberFormatException : Because, Number with base 2 must contain only 0 and 1.
 
        Byte B = Byte.valueOf("12043", 5);
 
        //NumberFormatException : Value is out of range for Byte Type.
 
        Short S = Short.valueOf("12043", 5);  //No Run time error : value is within the range of Short
        System.out.println(S);                //Output : 898
 
        Integer I = Integer.valueOf("1891BGH", 16);
 
        //NumberFormatException : Because, Number with base 16 must contain any digits from 0 to 9
        //and any character in A, B, C, D, E and F.
 
        Long L = Long.valueOf("GHJBDFR", 36);
 
        //No Run Time error : A number with base 36 can contain any digits and any alphabets from A to Z
        System.out.println(L);     //Output : 35888885703
    }
}

