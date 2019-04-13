package oops.wrapperClasses;

/* Constructors Of Wrapper Classes In Java:

Every wrapper class in java has two constructors,
1.First constructor takes corresponding primitive data as an argument
2.Second constructor takes string as an argument.

Notes :
1.The string passed to second constructor should be parse-able to number , otherwise you will get run time 
  NumberFormatException.
2. Wrapper Class Character has only one constructor which takes char type as an argument. It doesn’t have a 
3.constructor which takes String as an argument. Because, String can not be converted into Character.
  Wrapper class Float has three constructors. The third constructor takes double type as an argument.*/

public class O002_WrapperClassesConstructor {

	public static void main(String[] args) {
		Byte B1 = new Byte((byte) 10);     //Constructor which takes byte value as an argument
		Byte B2 = new Byte("10");          //Constructor which takes String as an argument

		//Byte B3 = new Byte("abc");      //Run Time Error : NumberFormatException

		//Because, String abc can not be parse-able to byte

		Short S1 = new Short((short) 20);   //Constructor which takes short value as an argument
		Short S2 = new Short("10");         //Constructor which takes String as an argument

		Integer I1 = new Integer(30);     //Constructor which takes int value as an argument
		Integer I2 = new Integer("30");   //Constructor which takes String as an argument

		Long L1 = new Long(40);      //Constructor which takes long value as an argument
		Long L2 = new Long("40");    //Constructor which takes String as an argument

		Float F1 = new Float(12.2f);      //Constructor which takes float value as an argument
		Float F2 = new Float("15.6");   //Constructor which takes String as an argument
		Float F3 = new Float(15.6d);    //Constructor which takes double value as an argument

		Double D1 = new Double(17.8d);       //Constructor which takes double value as an argument
		Double D2 = new Double("17.8");     //Constructor which takes String as an argument

		Boolean BLN1 = new Boolean(false);       //Constructor which takes boolean value as an argument
		Boolean BLN2 = new Boolean("true");      //Constructor which takes String as an argument

		Character C1 = new Character('D');      //Constructor which takes char value as an argument
		//Character C2 = new Character("abc");    //Compile time error : String abc can not be converted to character
	}

}

/*--------------- 2nd Example -------------*/
/* If you pass a string other than true or false to the second constructor of Boolean wrapper class, 
 * the object is initialized with false. */
class WrapperClasses11{
	public static void main(String[] args){
		Boolean BLN1 = new Boolean("true");    //passed string "true"
		System.out.println(BLN1);       //output : true

		Boolean BLN2 = new Boolean("false");   //passed string "false"
		System.out.println(BLN2);       //output : false

		Boolean BLN3 = new Boolean("abc");     //passed string "abc"
		System.out.println(BLN3);       //output : false
	}
}

/*--------------- 3rd Example -------------*/
/* Parsing Methods Of Wrapper Classes In Java */
/* All wrapper classes in java have methods to parse the given string to corresponding primitive data provided the string 
 * should be parse-able. If the string is not parse-able, you will get NumberFormatException. All parsing methods of wrapper 
 * classes are static i.e you can refer them directly using class name.*/
class WrapperClasses12{
	public static void main(String[] args){
		byte b = Byte.parseByte("10");
		System.out.println(b);               //Output : 10

		short s = Short.parseShort("25");
		System.out.println(s);              //Output : 25

		int i = Integer.parseInt("123");
		System.out.println(i);              //Output : 123

		long l = Long.parseLong("100");
		System.out.println(l);             //Output : 100

		float f = Float.parseFloat("12.35");
		System.out.println(f);            //Output : 12.35

		double d = Double.parseDouble("12.87");
		System.out.println(d);            //Output : 12.87

		boolean bln = Boolean.parseBoolean("true");
		System.out.println(bln);                   //Output : true

		boolean bln1 = Boolean.parseBoolean("abc");
		System.out.println(bln1);                 //Output : false

		char c = Character.parseChar("abc");     //compile time error

		//parseChar() is not defined for Character wrapper class
	}
}
