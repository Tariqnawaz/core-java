package oops.wrapperClasses;

/* Java is an object oriented language and java treats everything as an object. For example, A simple file 
 * (java.io.File), a Calendar (java.util.Calendar), a date (java.util.Date), an image (java.awt.Image), a 
 * color (java.awt.Color) are represented by the classes and their objects. Primitive data types like int, 
 * float, double, boolean, char etc. are also represented by the classes called Wrapper Claases. For every 
 * primitive data type, there is a Wrapper Class in java. All wrapper classes are placed in java.lang package. */
public class O001_WrapperClassExample {
	
	/* Wrapper classes are mainly used to wrap the primitive content into an object. This operation of wrapping
	 * primitive content into an object is called boxing. The reverse process i.e  unwrapping the object into 
	 * corresponding primitive data is called Unboxing. */
	
	/*--------------Boxing------------------*/
	/*------------1st Example---------------*/
	public static void main(String[] args) {
		byte b = 10;             //Primitive byte data
		Byte B = new Byte(b);   //Wrapping primitive byte data into Byte Object

		short s = 15;              //Primitive short data
		Short S = new Short(s);   //Wrapping of primitive short data into Short Object

		int i = 20;                   //Primitive int Data
		Integer I = new Integer(i);   //Wrapping of primitive int data into Integer Object

		long l = 25;            //Primitive long data
		Long L = new Long(l);   //Wrapping primitive long data into Long Object

		float f = 12;            //Primitive float data
		Float F = new Float(f);  //Wrapping primitive float data into Float Object

		double d = 18.58;           //Primitive double data
		Double D = new Double(d);   //Wrapping primitive double data into Double Object

		boolean bln = true;               //Primitive boolean data
		Boolean BLN = new Boolean(bln);   //Wrapping primitive boolean data into Boolean Object

		char c = 'C';                     //Primitive char data
		Character C = new Character(c);   //Wrapping primitive char data into Character Object
	}
}

/*--------------Auto Boxing-------------*/
/* From JDK 1.5 onwards, Auto-Boxing is introduced. According to this feature, you need not to explicitly wrap the 
 * primitive content into an object. Just assign primiive data to corresponding wrapper class reference variable, 
 * java automatically wraps primitive data into corresponding wrapper object.*/
/*------------2nd Example---------------*/
class WrapperClasses1{
	public static void main(String[] args){
		byte b = 10;    //Primitive byte data
		Byte B = b;    //Auto-Boxing of byte data

		short s = 15;     //Primitive short data
		Short S = s;     //Auto-Boxing of short data

		int i = 20;       //Primitive int Data
		Integer I = i;    //Auto-Boxing of int data

		long l = 25;    //Primitive long data
		Long L = l;     //Auto-Boxing of long data

		float f = 12;     //Primitive float data
		Float F = f;     //Auto-Boxing of float data

		double d = 18.58;     //Primitive double data
		Double D = d;        //Auto-Boxing of double data

		boolean bln = true;    //Primitive boolean data
		Boolean BLN = bln;     //Auto-Boxing of boolean data

		char c = 'C';          //Primitive char data
		Character C = c;     //Auto-Boxing of char data
	}
}

/*--------------Un Boxing-------------*/
/* All wrapper classes have methods to unwrap the object to corresponding primitive data. Go through the following 
 * example, it shows unboxing i.e unwrapping wrapper object into corresponding primitive data.*/
/*------------3rd Example---------------*/
class WrapperClasses2{
	public static void main(String[] args){
		Byte B = new Byte((byte) 10);   //Byte Object
		byte b = B.byteValue();         //Unwrapping Byte object to byte data

		Short S = new Short((short) 20);   //Short Object
		short s = S.shortValue();          //Unwrapping Short object to short data

		Integer I = new Integer(15);    //Integer Object
		int i = I.intValue();           //Unwrapping Integer object to int data

		Long L = new Long(50);     //Long Object
		long l = L.longValue();    //Unwrapping Long object to long data

		Float F = new Float(20);      //Float Object
		float f = F.floatValue();    //Unwrapping Float object to float data

		Double D = new Double(20.5);   //Double Object
		double d = D.doubleValue();    //Unwrapping Double object to double data

		Boolean BLN = new Boolean(true);      //Boolean Object
		boolean bln = BLN.booleanValue();    //Unwrapping Boolean object to boolean data

		Character C = new Character('C');    //Character Object
		char c = C.charValue();              //Unwrapping Character object to char data
	}
}

/*--------------Auto Un Boxing-------------*/
/* From JDK 1.5 onwards, Auto-Unboxing is introduced. According to this feature, you need not to call method of 
 * wrapper class to unbox the wrapper object. Java implicitly converts wrapper object to corresponding primitive data 
 * if you assign wrapper object to primitive type variable.*/
/*------------4th Example---------------*/
class WrapperClasses3{
    public static void main(String[] args){
        Byte B = new Byte((byte) 10);   //Byte Object
        byte b = B;                    //Auto-Unboxing of Byte Object
 
        Short S = new Short((short) 20);   //Short Object
        short s = S;                      //Auto-Unboxing of Short Object
 
        Integer I = new Integer(15);    //Integer Object
        int i = I;                     //Auto-Unboxing of Integer Object
 
        Long L = new Long(50);     //Long Object
        long l = L;               //Auto-Unboxing of Long Object
 
        Float F = new Float(20);      //Float Object
        float f = F;                 //Auto-Unboxing of Float Object
 
        Double D = new Double(20.5);   //Double Object
        double d = D;                 //Auto-Unboxing of Double Object
 
        Boolean BLN = new Boolean(true);      //Boolean Object
        boolean bln = BLN;                   //Auto-Unboxing of Boolean Object
 
        Character C = new Character('C');    //Character Object
        char c = C;                         //Auto-Unboxing of Character Object
    }
}
