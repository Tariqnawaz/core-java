package string;

import java.util.HashMap;
import java.util.Set;

public class O001_StringExample {

}

/*String Literals :

In Java, all string literals like “java”, “abc”, “123” are treated as objects of java.lang.String class. That means, all methods of String 
class are also applicable to string literals.
You can also create the objects of String class without using new operator. This can be done by assigning a string literal to reference 
variable of type java.lang.String class.*/

class StringExamples1{
    public static void main(String[] args){
        //Creating String objects without using new operator
        String s1 = "abc";          
        String s2 = "abc"+"def";
        String s3 = "123"+"A"+"B";
        System.out.println(s1);     //Output : abc
        System.out.println(s2);     //Output : abcdef
        System.out.println(s3);     //Output : 123AB
    }
}

/*Finding The Length Of The String :
length() method of String class is used to find the length of the string. The length of the string is the number of characters in it.
*/
class StringExamples{
    public static void main(String[] args){
        String s = new String();                    //Creating an empty string object
        System.out.println(s.length());            //Output : 0
        char[] chars = {'J', 'A', 'V', 'A'};
        String s1 = new String(chars);            //Creating string object of 4 characters
        System.out.println(s1.length());         //Output : 4
        String s2 = new String(s1+"J2EE");       //Creating string object of 8 characters
        System.out.println(s2.length());        //Output : 8
        //Using String.length() method on string literals
        System.out.println("abc".length());        //Output : 3
        System.out.println("123456".length());     //Output : 6
        System.out.println("A".length());          //Output : 1
    }
}

/*Concatenation Of Strings :
The “+” operator is used to concatenate two or more string objects or string literals.
*/
class StringExamples3{
	public static void main(String[] args){
		//Concatenating five string literals using "+" operator
		String s = "Java"+"Concept"+"Of"+"The"+"Day";
		System.out.println(s);       //Output : JavaConceptOfTheDay
		//Creating five string objects
		String s1 = new String("Java");
		String s2 = new String("Concept");
		String s3 = new String("Of");
		String s4 = new String("The");
		String s5 = new String("Day");
		//Concatenating five string objects using "+" operator
		System.out.println(s1+s2+s3+s4+s5);      //Output : JavaConceptOfTheDay
	}
}

/*You can concatenate a string object with other data types like int, double, long, char etc using “+” operator. There is a one rule of “+” 
 * operator which states that  “If any one operand of ‘+’ operator is a string, then it will be string concatenation otherwise it will be a 
 * normal addition”. The same rule applies here also.*/
class StringExamples4{
	public static void main(String[] args){
		//Concatenating a string object with int type
		int i = 1000;
		String s = "Java"+i;
		System.out.println(s);        //Output : Java1000
		//Concatenating a string object with double type
		double d = 523.69;
		String s1 = "Java"+d;
		System.out.println(s1);      //Output : Java523.69
		//Concatenating a string object with char type
		char c = 'A';
		String s2 = "Java"+c;
		System.out.println(s2);       //Output : JavaA
		//Concatenating a string object with boolean type
		boolean b = true;
		String s3 = "Java"+b;
		System.out.println(s3);      //Output : Javatrue
	}
}

/*You can concatenate a string object not only with primitive types but also with the derived types. When you use derived type in the string 
 * concatenation, the string returned by the toString() method of that derived type is used.*/
class A1{
	int i;

	public A1(int i){
		this.i = i;
	}
	//toString() method is not overrided.
	//So, it will return physical address of the object
}

class B1{
	int i;
	public B1(int i){
		this.i = i;
	}
	//Overriding toString() method
	@Override
	public String toString(){
		return "i = "+i;
	}
}

class StringExamples5{
	public static void main(String[] args){
		A1 a = new A1(50);
		String s = "Java";
        //Concatenating a string object with A-type
		System.out.println(s+a);      //Output : Javastrings.A@42719c
		B1 b = new B1(100);
        //Concatenating string object with B-type
		System.out.println(s+b);     //Output : Javai = 100
	}
}

/*When you are adding two or more objects of different types using “+” operator, addition of the objects takes place from left to right. 
 While adding, if any one operand is string then it will be string concatenation otherwise it will be normal addition.*/

class StringExamples6{
	public static void main(String[] args){
		int i = 5000;
		double d = 6000.0006;
		String s = "Java";
		System.out.println(i+d+s);      //Output : 11000.0006Java
		System.out.println(s+i+d);      //Output : Java50006000.0006
		System.out.println(i+s+d);      //Output : 5000Java6000.0006
	}
}

/*Can we concatenate the string objects without using “+” operator?.
Yes, we can concatenate string objects without using “+” operator. This can be done using concat() method of java.lang.String class. But 
using concat() method, we can concatenate only two string objects. It is not possible to concatenate more than two string objects using 
concat() method. And also using concat() method we can’t concatenate a string object with other type of object. Because, concat() method 
takes only String type as an argument.
*/
class StringExamples7{
	public static void main(String[] args){
		String s1 = "JAVA";
		String s2 = "J2EE";
		System.out.println(s1.concat(s2));      //Output : JAVAJ2EE
	}
}

/*Here is one special example of String concatenation. You can add two null objects referred by two String type reference variables 
 * (Like in Line 9 in the below example) , but you can’t add two hard coded null objects (Like in Line 15 in the below example). 
 * It gives compile time error.*/
class StringExamples8{
	public static void main(String[] args){
		String s1 = null;
		String s2 = null;
		System.out.println(s1+s2);       //Output : nullnull
		System.out.println("null"+"null");    //Output : nullnull
		System.out.println(s1+"JAVA"+s2);     //Output : nullJAVAnull
	//	System.out.println(null+null);     //Compile Time Error
	}
}

/*1) charAt() Method :
This method returns character at the specified index. Here is signature of this method.
public char charAt(int index)
*/

/*Where index must be between 0 and length() – 1. This method will throw StringIndexOutOfBoundsException if index passed is negative or not 
 * less than the length of the string.*/
class StringExamples9{
    public static void main(String[] args){
        String s = "Java Concept Of The Day";
        System.out.println(s.charAt(5));      //Output : C
        System.out.println(s.charAt(10));     //Output : p
        System.out.println(s.charAt(25));     //This statement will throw StringIndexOutOfBoundsException
    }
}

/*2) getChars() Method
This method copies the set of characters from the string into specified character array. Here is the signature of this method.
public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

This method copies characters of a string object starting from ‘srcBegin’ to ‘srcEnd’ into character array ‘dst’ at the index ‘dstBegin’. 
This method will also throw StringIndexOutOfBoundsException if ‘srcBegin’ or ‘srcEnd’ are not between 0 and length() – 1 or if characters 
extracted does not fit into destination array.
*/
class StringExamples10{
    public static void main(String[] args){
        String s = "Java Concept Of The Day";
        //Defining destination char array
        char[] dst = new char[10];
        //Copying the set of characters from s into dst.
        s.getChars(5, 11, dst, 2);
        for (char c : dst){
            System.out.print(c);       //Output : --Concep--
        }
    }
}

/*3) toCharArray() Method :
This method converts whole string into a character array. Below is the signature of this method.
public char[] toCharArray()*/
class StringExamples11{
    public static void main(String[] args){
        String s = "Java Concept Of The Day";
        //Converting string 's' into character array.
        char[] dst = s.toCharArray();
        for (char c : dst){
            System.out.print(c);     //Output : Java Concept Of The Day
        }
    }
}

/*4) subString() Method
This method returns a sub string of the specified string. This method has two forms.
public String substring(int beginIndex) –> This form returns sub string starting from ‘beginIndex’ to the end of the specified string.
public String substring(int beginIndex, int endIndex) –> This form returns sub string starting from ‘beginIndex’ to ‘endIndex’ of the 
specified string.
*/
class StringExamples12{
    public static void main(String[] args){
        String s = "Java Concept Of The Day";
        String subString1 = s.substring(11);     
        System.out.println(subString1);           //Output : t Of The Day
        String subString2 = s.substring(5, 15);
        System.out.println(subString2);         //Output : Concept Of
    }
}

/*How The Strings Are Stored In The Memory? :
We all know that JVM divides the allocated memory to a Java program into two parts. one is Stack and another one is heap. Stack is used 
for execution purpose and heap is used for storage purpose. In that heap memory, JVM allocates some memory specially meant for string 
literals. This part of the heap memory is called String Constant Pool.

For example, when you create string objects like below, they will be stored in the String Constant Pool.
String s1 = "abc"; 
String s2 = "xyz";
String s3 = "123";
String s4 = "A";

And when you create string objects using new keyword like below, they will be stored in the heap memory.
String s5 = new String("abc");
char[] c = {'J', 'A', 'V', 'A'};
String s6 = new String(c);
String s7 = new String(new StringBuffer());
This is how String Constant Pool looks like in the memory. For more information see String-constant-pool image.
*/

/*----------------1st Example---------------*/
class StringExamples13{
    public static void main(String[] args){
        //Creating string objects using literals
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);        //Output : true
        //Creating string objects using new operator
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);        //Output : false
    }
}

/* An Example To Prove Strings Are Immutable */
/* Please refer to string text file in folder to understand the concept of immutable string and see image also*/
class StringExamples14{
    public static void main(String[] args){
        String s1 = "JAVA";
        String s2 = "JAVA";
        System.out.println(s1 == s2);         //Output : true
        s1 = s1 + "J2EE";
        System.out.println(s1 == s2);         //Output : false
    }
}

/* is new String() also immutable?

After seeing the above example, one more question may left in your mind. Are string objects created using new operator also immutable? 
The answer is Yes. String objects created using new operator are also immutable although they are stored in the heap memory. This can 
be also proved with help of an example.
*/

class StringExamples15{
    public static void main(String[] args){
        String s1 = new String("JAVA");
        System.out.println(s1);         //Output : JAVA
        s1.concat("J2EE");
        System.out.println(s1);         //Output : JAVA
    }
}
/*In this example, a string object is created with “JAVA” as it’s content using new operator and it’s reference is assigned to s1. 
 * I have tried to change the contents of this object using concat() method. But, these changes are not reflected in the object as seen 
 * in Line 289. Even after the concatenation, content of the object is same as before. This is because the strings are immutable. Once I 
 * tried to concatenate “J2EE” to an existing string “JAVA”, a new string object is created with “JAVAJ2EE” as it’s content. But we don’t 
 * have reference to that object in this program.*/

/*******************************************************************************************/
/* When To Use “==”, equals() And hashCode() On Strings */
/* please refer string file for more detail */

/*Define two string objects like below,
String s1 = "JAVA";
String s2 = "JAVA";
Now apply above methods on these two objects.

s1 == s2 —> will return true as both are pointing to same object in the constant pool.
s1.equals(s2) —> will also return true as both are referring to same object.
s1.hashCode() == s2.hashCode() —> It also returns true.

String s1 = new String("JAVA");
String s2 = new String("JAVA");
s1 == s2 —> will return false because s1 and s2 are referring to two different objects in the memory.
s1.equals(s2) —> will return true as both the objects have same content.
s1.hashCode() == s2.hashCode() —> It will also return true because two equals string objects according to equals() method will have same 
hash code values.

Comparing the string objects defined like below will also give same result as the above.

String s1 = "JAVA";
String s2 = new String("JAVA");
s1 == s2 —> will return false because s1 and s2 are referring to two different objects in the memory.
s1.equals(s2) —> will return true as both the objects have same content.
s1.hashCode() == s2.hashCode() —> It will also return true.

String s1 = "0-42L";
String s2 = "0-43-";
s1 == s2 —> will return false as s1 and s2 are referring to two different objects in the memory. (Expected…)
s1.equals(s2) —> It will also return false as both the objects have different content. (Expected…)
s1.hashCode() == s2.hashCode() —> It will return true. (???….)

This is because, two unequal string objects according to equals() method may have same hash code values. Therefore, it is recommended not 
to use hashCode() method to compare two string objects. You may not get expected result.
*/

/********************************************************************************************************/
/* How StringBuffer And StringBuilder Differ From String Class */
/* String objects created using java.lang.String class are immutable. Once they are created, they can not be modified. If you try to modify 
 * them, a new string object will be created with modified content. This property of String class may cause some memory issues for 
 * applications which need frequent modification of string objects. To overcome this behavior of String class, two more classes are 
 * introduced in Java to represent the strings. They are StringBuffer and StringBuilder. Both these classes are also members of  
 * java.lang package same as String class. */

class StringExamples16{
    public static void main(String[] args){
        String s = "JAVA";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++){
            s = s + "J2EE";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String class : "+(endTime - startTime)+" ms");
         
        StringBuffer sb = new StringBuffer("JAVA");
        startTime = System.currentTimeMillis();
         
        for(int i = 0; i <= 10000; i++){
            sb.append("J2EE");
        }
         
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer class : "+(endTime - startTime)+" ms");
         
        StringBuilder sb1 = new StringBuilder("JAVA");
        startTime = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++){
            sb1.append("J2EE");
        }
         
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder class : "+(endTime - startTime)+" ms");
    }
}

/* What Is String Intern In Java? */
/* String objects in java are stored in two places in memory. One is String Constant Pool and another one is Heap Memory. String objects 
 * created using string literals are stored in String Constant Pool where as string objects created using new operator are stored in heap
 * memory. */

class StringExamples17{
    public static void main(String[] args){
        String s1 = new String("JAVA");
        String s2 = s1.intern();       //Creating String Intern
        System.out.println(s1 == s2);       //Output : false
        System.out.println(s1.equals(s2));    //Output : true
    }
}

/*Look at this example. Object s1 will be created in string constant pool as we are using string literal to create it and object s2 will be 
 * created in heap memory as we are using new operator to create it. When you call intern() method on s2, it returns reference of object to 
 * which s1 is pointing as it’s content is same as s2. It does not create a new object in the pool. So, S1 == s3 will return true as both 
 * are pointing to same object in the pool.*/
class StringExamples19{
    public static void main(String[] args){
        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = s2.intern();       //Creating String Intern
        System.out.println(s1 == s3);       //Output : true
    }
}

/*String Literals Are Automatically Interned :
When you call intern() on the string object created using string literals it returns reference of itself. Because, you can’t have two string 
objects in the pool with same content. That means string literals are automatically interned in java.
*/
class StringExamples18{
    public static void main(String[] args){
        String s1 = "JAVA";
        String s2 = s1.intern();       //Creating String Intern
        System.out.println(s1 == s2);       //Output : true
    }
}

/*What is the use of interning the string?
To Save The memory Space :
*/

/***********************************************************************************************************************/
/* Java Program To Reverse A String */
class ReverseTheString1{
    public static void main(String[] args){
        String str = "MyJava";
        //1. Using StringBuffer Class
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());    //Output : avaJyM
        //2. Using iterative method
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--){
            System.out.print(strArray[i]);    //Output : avaJyM
        }
        System.out.println();
        //3. Using Recursive Method
        System.out.println(recursiveMethod(str));    //Output : avaJyM
    }
    //Recursive method to reverse string
 
    static String recursiveMethod(String str){
         if ((null == str) || (str.length() <= 1)){
                return str;
         }
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}

/* Java Program To Remove All White Spaces from A String */
class RemoveWhiteSpaces1{
    public static void main(String[] args){
        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
        //1. Using replaceAll() Method
        String strWithoutSpace = str.replaceAll("\\s", "");
        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
        //2. Without Using replaceAll() Method
        char[] strArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strArray.length; i++){
            if( (strArray[i] != ' ') && (strArray[i] != '\t') ){
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
}

/* Check Whether One String Is Rotation Of Another? */
class MainClass1{
    public static void main(String[] args){
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        //Step 1
        if(s1.length() != s2.length()){
            System.out.println("s2 is not rotated version of s1");
        }
        else{
            //Step 2
            String s3 = s1 + s1;
            //Step 3
            if(s3.contains(s2)){
                System.out.println("s2 is a rotated version of s1");
            }
            else{
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }
}

/************************************************************************************************************/
/* How To Find Largest Number Less Than Given Number And Without Given Digit? */
class LargestNumber1{
    static int getLLessThanN(int number, int digit){
        //Converting digit to char
        char c = Integer.toString(digit).charAt(0);
        //Decrementing number & checking whether it contains digit
        for (int i = number; i > 0; --i){
            if(Integer.toString(i).indexOf(c) == -1){
                //If 'i' doesn't contain 'c'
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(getLLessThanN(123, 2));
        System.out.println(getLLessThanN(4582, 5));
        System.out.println(getLLessThanN(98512, 5));
        System.out.println(getLLessThanN(548624, 8));
    }
}
/*Output :
119
4499
98499
547999*/

/* Java Program To Count Occurrences Of Each Character In String : */
class EachCharCountInString1{
    static void characterCount(String inputString){
        //Creating a HashMap containing char as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
        for (char c : strArray){
            if(charCountMap.containsKey(c)){
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else{
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Printing the charCountMap
        System.out.println(charCountMap);
}

/* Logic Used To Find Duplicate Characters In A String In Java : */   
class DuplicateCharactersInString{
    static void duplicateCharCount(String inputString){
        //Creating a HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray){
            if(charCountMap.containsKey(c)){
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else{
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In "+inputString);
        //Iterating through Set 'charsInString'
        for (Character ch : charsInString){
            if(charCountMap.get(ch) > 1){
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
    }
}

/* 14 frequently asked interview alogrithms on string ; http://javaconceptoftheday.com/java-interview-programs-on-strings/ */  

/* String To Integer And Integer To String Conversion In Java */
/*Java Program To Convert String To Integer Using Integer.parseInt() method :*/
class StringToInteger1{
    public static void main(String[] args){
        String s = "2015";
    int i = Integer.parseInt(s);
    System.out.println(i);          //Output : 2015
}
}

/*Java Program To Convert String To Integer Using Integer.valueOf() method :*/
class StringToInteger2{
    public static void main(String[] args){
        String s = "2015";
        int i = Integer.valueOf(s);
        System.out.println(i);          //Output : 2015
    }
}

/*How To Convert Integer To String In Java?
You are also often need to do the reverse conversion i.e converting from integer to string. Java provides couple of methods to do that 
also. one is Integer.toString() method and another one is String.valueOf() method. Both these methods return string representation of the 
given integer.
Java Program To Convert Integer To String Using Integer.toString() Method :
*/
class IntegerToString3{
    public static void main(String[] args){
        int i = 2015;
        String s = Integer.toString(i);
        System.out.println(s);     //Output : 2015
    }
}
 
/*Java Program To Convert Integer To String Using String.valueOf() method :*/
class IntegerToString4{
    public static void main(String[] args){
        int i = 2015;
        String s = String.valueOf(i);
        System.out.println(s);     //Output : 2015
    }
}    
public static void main(String[] args){
   duplicateCharCount("JavaJ2EE");
       duplicateCharCount("Fresh Fish");
       duplicateCharCount("Better Butter");
    }
}
/*Output :
Duplicate Characters In JavaJ2EE
E : 2
a : 2
J : 2
Duplicate Characters In Fresh Fish
F : 2
s : 2
h : 2
Duplicate Characters In Better Butter
t : 4
e : 3
r : 2
B : 2
*/    
public static void main(String[] args){
       characterCount("Java J2EE Java JSP J2EE");
       characterCount("All Is Well");
       characterCount("Done And Gone");
    }
}
/*Output :
{E=4, 2=2, v=2, =4, P=1, S=1, a=4, J=5}
{W=1, =2, e=1, s=1, A=1, l=4, I=1}
{D=1, d=1, =2, G=1, e=2, A=1, n=3, o=2}*/